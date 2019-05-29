import React from 'react';
import {Link} from "react-router-dom";

const Booking = (props) => {
        return(
            <React.Fragment>
                <Link to={"/bookings/"+props.booking.id} className="name">
                    {props.booking}
                </Link>


            </React.Fragment>

        )
    }

export default Booking;