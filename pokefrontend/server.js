var express = require('express');
var app = express();

app.get('/', function (req, res) {
  res.header("Access-Control-Allow-Origin", "*");
  res.send('Hello World!');
});

app.get('/allPokemon', function (req, res) {
  res.header("Access-Control-Allow-Origin", "*");
  res.send('Query resolved')
})

app.listen(5000, function () {
  console.log('App listening on port 5000');
});
