import React from 'react';

function PrintList(props) {
    const elements = props.list;
    const listItems = elements.map((elem) => <li>{elem}</li>);

    return (
        <ul>
            {listItems}
        </ul>);
};

class Tile extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            name: 'bulbasaur',
            id: 1,
            types: ['grass', 'poison']
        }
    }

    render() {
        return (
            <div >
                <h1> {this.state.name} with ID: {this.state.id}</h1>
                Types are:
                <PrintList list={this.state.types} />
            </div>
        );
    }
}

export default Tile;



