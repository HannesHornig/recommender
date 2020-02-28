import React from 'react';

class Pokemon extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            name: 'bulbasaur',
            id: 1,
            types: ['grass', 'poison']
        }

        this.wrapTypes = this.wrapTypes.bind(this);
    }

    wrapTypes() {
        let elements = this.state.types.map(elem => <li>{elem}</li>);
        return (
            <ul>
                {elements}
            </ul>
        );
    }

    render() {
        return (
            <div className="pokemon" >
                <h1> {this.state.name} with ID: {this.state.id}</h1>
                Types are:
                {this.wrapTypes()}
            </div>
        );
    }
}

export default Pokemon;



