const express = require('express');
const { Pool } = require('pg');

const app = express();
const port = 5001;

const pool = new Pool({
  host: 'postgres',
  user: 'postgres',
  password: 'postgrespassword',
  database: 'votes',
});

app.get('/', async (req, res) => {
  const result = await pool.query('SELECT option, COUNT(*) AS votes FROM votes GROUP BY option');
  res.json(result.rows);
});

app.listen(port, () => {
  console.log(`Result app running on http://localhost:${port}`);
});