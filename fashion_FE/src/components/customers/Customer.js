import React from 'react';
import {Link} from 'react-router-dom'

const Customer = (props) => {
    if(!props.customer){
        return null;
    }

    return(
        <React.Fragment>
                <p>Name: {props.customer.firstName} {props.customer.surname}</p>
        </React.Fragment>
    )
}

export default Customer;