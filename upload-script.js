const axios = require('axios');
const fs = require('fs');
const FormData = require('form-data');

// Access the CurseForge API key and version from the environment variables
const apiKey = process.env.CURSEFORGE_API_KEY;
const version = process.env.VERSION;  // Get the version number

const projectId = '1225110';  // Your CurseForge project ID

if (!apiKey || !version || !projectId) {
  console.error('Error: Missing CurseForge API key, version, or project ID');
  process.exit(1);
}

const filePath = 'releases/curr/gsm.jar';  // Path to your mod file

// Check if the file exists
if (!fs.existsSync(filePath)) {
  console.error('Error: File does not exist at the specified path');
  process.exit(1);
}

const form = new FormData();
form.append('file', fs.createReadStream(filePath));  // Path to your mod file
form.append('fileName', 'gsm.jar');  // Your file name
form.append('gameId', '432');  // Minecraft's gameId (432 for Minecraft)
form.append('version', version);  // Use the version number from the release tag
form.append('changelog', 'Initial release');  // Changelog text

// Debugging: Log the request URL and headers
console.log(`Uploading to CurseForge Project ID: ${projectId}`);
console.log('API Request Headers:', {
  ...form.getHeaders(),
  'x-api-key': apiKey,
});

// Make the request to CurseForge API
axios.post(`https://api.curseforge.com/v1/mods/${projectId}/upload`, form, {
  headers: {
    ...form.getHeaders(),
    'x-api-key': apiKey,  // Use the API key from environment variables
  },
})
  .then(response => {
    console.log('Mod uploaded successfully', response.data);
  })
  .catch(error => {
    if (error.response) {
      console.error('Error uploading mod:');
      console.error('Status:', error.response.status);
      console.error('Data:', error.response.data);
    } else {
      console.error('Error uploading mod:', error.message);
    }
  });
