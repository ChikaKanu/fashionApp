import React from 'react';
import {Link} from 'react-router-dom'

const Tailor = (props) => {
    if(!props.tailor){
        return null;
    }

    return(
        <React.Fragment>
            <Link to={'/tailors/'+props.tailor.id}>
                <p>Name: {props.tailor.firstName} {props.tailor.surname}</p>
                <p>Phone Contact: {props.tailor.phone}</p>
            </Link>
        </React.Fragment>
    )

}

export default Tailor;