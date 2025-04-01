const express = require('express');
const router = express.Router();
const { getExampleData, createExampleData } = require('../controllers/index');

// Define routes
router.get('/example', getExampleData);
router.post('/example', createExampleData);

module.exports = router;