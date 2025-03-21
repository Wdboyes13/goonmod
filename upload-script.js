const axios = require('axios');
const fs = require('fs');
const FormData = require('form-data');

// Access the CurseForge API key and version from the environment variables
const apiKey = process.env.CURSEFORGE_API_KEY;
const version = process.env.VERSION;  // Get the version number

if (!apiKey || !version) {
  console.error('Error: Missing CurseForge API key or version');
  process.exit(1);
}

const form = new FormData();
form.append('file', fs.createReadStream('path/to/your/mod.jar'));  // Path to your mod file
form.append('fileName', 'mod.jar');  // Your file name
form.append('gameId', '432');  // Minecraft's gameId (432 for Minecraft)
form.append('version', version);  // Use the version number from the release tag
form.append('changelog', 'Initial release');  // Changelog text

// Make the request to CurseForge API
axios.post('https://api.curseforge.com/v1/mods/upload', form, {
  headers: {
    ...form.getHeaders(),
    'x-api-key': apiKey,  // Use the API key from environment variables
  },
})
  .then(response => {
    console.log('Mod uploaded successfully', response.data);
  })
  .catch(error => {
    console.error('Error uploading mod:', error);
  });

