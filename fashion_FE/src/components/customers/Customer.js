import React from 'react';
import {Link} from 'react-router-dom'

const Customer = (props) => {

    console.log(props.customer.user);
    
    if(!props.customer.user || !props.customer.user){
        return null;
    }

    return(
  
        <React.Fragment>
            <Link to={"/customers/"+props.customer.id} className="customer-detail-link">
                <p>Name: {props.customer.user.firstName} {props.customer.user.surname}</p>
                <p>Address: {props.customer.contact}</p>
                <p>Bill: ₦ {props.customer.bill}</p>
            </Link>
        </React.Fragment>
    )
}

export default Customer;