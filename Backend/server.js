import express from 'express';
import {kafka} from 'kafkajs';

const PHONE_NUMBER = "mobile_number";

// Start the server ->
const serverApp = express();
const PORT = 3000;

// Set up Kafka
exports.kafka = new kafka()

serverApp.use(express.json());

// Register a client
serverApp.post('/register', (req, res) => {
    console.log(`Registering Client ${req.body[PHONE_NUMBER]}`);

    res.status(201).json({message: 'User Created', user: "<fill token>" });
});


serverApp.listen(PORT, () => {
    console.log(`Server is running at http://localhost:${PORT}/`);
});