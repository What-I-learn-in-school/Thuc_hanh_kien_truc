const express = require('express');
const mysql = require('mysql2');

const app = express();
const port = 3000;

// Tạo kết nối MySQL
const db = mysql.createConnection({
  host: 'mysql', // Tên service MySQL trong docker-compose.yml
  user: 'exampleuser',
  password: 'examplepassword',
  database: 'exampledb',
});

// Kiểm tra kết nối
db.connect((err) => {
  if (err) {
    console.error('Error connecting to MySQL:', err);
    return;
  }
  console.log('Connected to MySQL!');
});

// Endpoint đơn giản
app.get('/', (req, res) => {
  db.query('SELECT NOW() AS current_time', (err, results) => {
    if (err) {
      res.status(500).send('Error querying database');
      return;
    }
    res.send(`Current time from MySQL: ${results[0].current_time}`);
  });
});

app.listen(port, () => {
  console.log(`App is running at http://localhost:${port}`);
});