import React from 'react';
import Booking from '../bookings/Booking';
import Customer from '../customers/Customer.js';

const CustomerList = (props) => {
    const customer = props.customers.map((customer) => {
        return(
            <li key={customer.id} className="customer-component-item">
                <div className="customer-component">
                    <Booking customer = {customer}/>
                    <Customer customer={customer}/>
                </div>
            </li>
            )
        }
    )
    

    return(
        <ul className="customer-list-item">
            {customer}
        </ul>
    )
}

export default CustomerList;