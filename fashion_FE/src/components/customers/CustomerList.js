import React from 'react';
import Booking from '../bookings/Booking';
import Customer from './Customer';

const CustomerList = (props) => {
    const customer = props.customers.map((customer) => {
        return(
            <li key={customer.id} className="customer-component-list-item">
                <div className="customer-component">
                    <Booking customer = {customer}/>
                    <Customer customer={customer}/>
                </div>
            </li>
            )
        }
    )
    

    return(
        <ul className="customer-component-list">
            {customer}
        </ul>
    )
}

export default CustomerList;