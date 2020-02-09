import React from 'react';

function PrintList(props) {
    const elements = props.list;
    const listItems = elements.map((elem) => <li>{elem}</li>);

    return (
        <ul>
            {listItems}
        </ul>);
};

class TilesList extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            tilesElements: props.tiles
        };
    }

    render() {

        return <PrintList list={this.state.tilesElements} />;
    }

}
export default TilesList;