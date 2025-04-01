// filepath: d:\Learn\Trash\Rac\DesignPartner\Tuan7\Part2\Bai2\node-mongo-app\src\controllers\index.js
const getExampleData = (req, res) => {
    res.json({ message: 'This is example GET data' });
};

const createExampleData = (req, res) => {
    res.json({ message: 'This is example POST data' });
};

module.exports = { getExampleData, createExampleData };