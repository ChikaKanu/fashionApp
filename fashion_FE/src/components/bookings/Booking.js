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
                <p className="booking-list-display">Customer: {props.customer.firstName} {props.customer.surname}</p>
                <p className="booking-list-display">Style: {props.booking.style.name}</p>
                <p className="booking-list-display">Style: {props.booking.style.image}</p>
                <p className="booking-list-display">TotalCost: {"₦ " + props.booking.totalCost}</p>   
                <p className="booking-list-display">Status: {props.booking.status}</p>    
                <p className="booking-list-display">Remarks: {props.booking.remarks}</p>                 
                </Link>
            </React.Fragment>

        )
    }

export default Booking;