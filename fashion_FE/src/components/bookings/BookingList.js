import React from 'react';
import Booking from './Booking.js';

const BookingList = (props) => {
    const bookings = props.bookings.map((booking,index) => {
        return(
            <li key={index} className="booking-component-list-item">
                <div className="booking-component">
                    <Booking booking={booking} measurement={booking.measurement} customer={booking.customer}/>
                </div>
            </li>
            )
        }
        
    )
    

    return(
        <ul className="booking-component-list">
            {bookings}
        </ul>
    )
}

export default BookingList;