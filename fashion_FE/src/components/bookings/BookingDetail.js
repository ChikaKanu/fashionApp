import React from 'react';

const BookingDetail = (props) => {

    const onDelete=()=> {
        props.handleDelete(props.booking.id)
    }

    const onEdit=() => {
        props.handleEdit(props.booking.id)
    }

    if(!props.Booking){
        return null
    }

    const fabrics = props.booking.fabrics.map((fabric,index) => {
        return <div key={index} value={fabric} className="fabric-render">{fabric}</div>
    })

    return(
        <React.Fragment>
        Booking Basic Info:
        <div>
            {fabrics}
            <div className="booking-item-basic-details">
                <h6>Id: {props.booking.id}</h6>
                <h6>Date: {props.booking.date}</h6>
                <h6>Cost: {props.booking.totalCost}</h6>
                <h6>Status: {props.booking.status}</h6>   
                <h6>Remarks: {props.booking.date}</h6>            
            </div>
            <div className="booking-item-basic-details">
                <h4>Customer Info:</h4>
                <h6>Firstname: {props.booking.customer.firstName}</h6>
                <h6>Surname: {props.booking.customer.surname}</h6>
                <h6>Contact: {props.booking.customer.contact}</h6>
                <h6>Customer total bill: {props.booking.customer.contact}</h6>
           </div>
           <button onClick={onDelete}>Delete Booking</button>
           <button onClick={onEdit}>Edit Booking</button>
        </div>
        </React.Fragment>

    )
}

export default BookingDetail;