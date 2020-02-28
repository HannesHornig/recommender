import React from 'react';


class List extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            elements: props.listOfElements,
            idInternal: props.id
        };
    }

    render() {

        return <div className="List" id={this.state.idInternal}>{this.state.elements}</div>;
    }

}
export default List;