import React from 'react';
import {Link} from 'react-router-dom'

const Customer = (props) => {
    if(!props.customer){
        return null;
    }

    return(
        <React.Fragment>
            <Link to={"/customers/"+props.customer.id} className="customer-detail-link">
                <p>Name: {props.customer.firstName} {props.customer.surname}</p>
                <p>Contact: {props.customer.contact}</p>
                <p>Bill: ₦ {props.customer.bill}</p>
            </Link>
        </React.Fragment>
    )
}

export default Customer;