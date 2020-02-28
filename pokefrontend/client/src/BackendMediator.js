import 'cross-fetch/polyfill';

const HOST = "http://localhost:5000";
const URI_ALL_POKEMON = HOST + "/allPokemon";

function getAllProkemon() {
  fetch(URI_ALL_POKEMON, {
    method: 'GET'
  }).then(console.log).catch(console.log);
}

export default getAllProkemon