import React from 'react';
import Booking from './Booking.js';

const BookingList = (props) => {
    const bookings = props.bookings.map((booking,index) => {
        return(
            <li key={index} className="booking-component-item">
                <div className="booking-component">
                    <Booking booking={booking}/>
                </div>
            </li>
            )
        }
        
    )
    

    return(
        <ul className="component-list">
        {bookings}
        </ul>
    )
}

export default BookingList;