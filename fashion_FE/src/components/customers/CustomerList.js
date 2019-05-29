import React from 'react';
import Booking from '../bookings/Booking';

const CustomerList = (props) => {
    const customers = props.customers.map((customer) => {
        return(
            <li key={customer.id} className="customer-component-item">
                <div className="customer-component">
                    <Booking booking = {customer.bookings}/>
                </div>
            </li>
            )
        }
    )
    

    return(
        <ul className="component-list">
            {customers}
        </ul>
    )
}

export default CustomerList;