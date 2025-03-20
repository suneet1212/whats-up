import express, { json, response } from 'express'
import axios from 'axios'

const CLIENT_PORT = 5000;
const SERVER_PORT = 3000;

const clientApp = express();
clientApp.use(express.json());

// Register



clientApp.listen(CLIENT_PORT, () => {
    console.log(`Client is running at http://localhost:${CLIENT_PORT}/`);
})