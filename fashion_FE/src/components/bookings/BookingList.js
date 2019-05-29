import React from 'react';
import Booking from './Booking.js';

const BookingList = (props) => {
    const bookings = props.bookings.map((booking) => {
        return(
            <li key={bookings.id} className="booking-component-item">
                <div className="booking-component">
                    <Booking booking={booking.id} customer={booking.customer}/>
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