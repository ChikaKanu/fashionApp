import React from 'react';

const BookingNewForm = (props) => {
    
    //stop page from refreshing, display form for new item creation and target the values from the form to be passed to database for persistence as handleBookingPost function. 
    const handleSubmit = (event) => {
        event.preventDefault();
        const newBooking = {
            "status": event.target.status.value,
            "totalCost": event.target.totalCost.value,
            "remarks": event.target.remarks.value,
            "date": event.target.date.value,
            "customer": event.target.customer.value,
            "style": event.target.style.value,
            "fabrics":[],
            "tailor": event.target.tailor.value,
            "measurement": event.target.measurement.value,
        }
        props.handleBookingPost(newBooking);
    }

    const customer = props.customer.map()
}

export default BookingNewForm;