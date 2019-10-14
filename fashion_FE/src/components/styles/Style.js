import React from 'react';
import {Link} from 'react-router-dom';

const Style = (props) => {

    if(!props.style){
        return null;
    }

    return(
        <React.Fragment>
            <Link to={'/styles/'+props.style.id} className="style">
                <p>Picture: {props.style.image}</p>
                <p>Name: {props.style.name}</p>
                <p>Designer: {props.style.source}</p>
                <p>Design Cost: {props.style.labourCost}</p>
            </Link>
        </React.Fragment>
    )


}

export default Style;