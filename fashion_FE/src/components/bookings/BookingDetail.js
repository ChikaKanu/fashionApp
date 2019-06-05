import React from 'react';
import Customer from '../customers/Customer.js';
import FabricList from '../fabrics/FabricList.js';
import Measurement from '../measurements/Measurement.js';
import Style from '../styles/Style';

const BookingDetail = (props) => {
    console.log(props.booking)

    const onDelete=()=> {
        props.handleDelete(props.id)
    }

    const onEdit=() => {
        props.handleEdit(props.id)
    }

    if(!props.booking){
        return null
    }

    return(
        <div className="booking-item-details">
            <div className="booking-item-component-details">
                <h4>Booking Basic Info:</h4>
                <p>Id: {props.id}</p>
                <p>Date: {props.booking.date}</p>
                <p>Cost: ₦ {props.booking.totalCost}</p>
                <p>Status: {props.booking.status}</p>   
                <p>Remarks: {props.booking.remarks}</p>
            </div>
            <div className="booking-item-component-details">        
                <h4>Customer Info:</h4>
                <Customer customer={props.booking._embedded.customer}/>
            </div>
            <div className="booking-item-component-details">        
                <h4>Fabrics Detail:</h4>
                <FabricList fabrics={props.booking._embedded.fabrics}/>
            </div>
            <div className="booking-item-component-details">        
                <h4>Measurement Detail:</h4>
                <Measurement measurement={props.booking._embedded.measurement}/>
            </div>
            <div className="booking-item-component-details">        
                <h4>Style Detail:</h4>
                <Style style={props.booking._embedded.style}/>
            </div>
           <button className="delete-button" onClick={onDelete}>Delete Booking</button>
           <button className="edit-button" onClick={onEdit}>Edit Booking</button>
        </div>
    )
}

export default BookingDetail;