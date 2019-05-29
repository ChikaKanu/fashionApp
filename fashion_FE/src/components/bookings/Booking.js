import React from 'react';
import {Link} from "react-router-dom";

const Booking = (props) => {
    if(!props.booking){
        return null;
    }
        return(
            <React.Fragment>
                <Link to={"/bookings/"+props.booking.id} className="name">
                    Booking_ID: {props.booking.id} 
                    <p className="booking-list-display">Customer: {props.booking.customer.firstName} {props.booking.customer.surname}</p>
                <p className="booking-list-display">Style: {props.booking.style.name}</p>
                </Link>

                <p className="booking-list-display">Measurement: [{props.booking.Measurement}]</p>
            </React.Fragment>

        )
    }

export default Booking;