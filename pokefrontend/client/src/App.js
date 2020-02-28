import React from 'react';
import Pokemon from './domain/Pokemon';
import List from './domain/List';
import getAllProkemon from './BackendMediator'
import './ressources/App.css';


class App extends React.Component {
    constructor(props) {
        super(props)
    }

    componentDidMount() {
        getAllProkemon();
    }

    render() {
        const pokemons = [<Pokemon />, <Pokemon />, <Pokemon />, <Pokemon />, <Pokemon />]
        const poketop = [<Pokemon />, <Pokemon />, <Pokemon />]
        return (
            <>
                <List listOfElements={poketop} id="pokemonList" />
                <hr />
                <List listOfElements={pokemons} id="pokemonList" />
            </>
        );
    }
}

export default App;