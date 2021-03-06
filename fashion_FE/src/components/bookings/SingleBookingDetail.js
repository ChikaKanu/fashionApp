import React from 'react';
import Customer from '../customers/Customer';
import FabricList from '../fabrics/FabricList';
import Measurement from '../measurements/Measurement';
import Style from '../styles/Style';
import Tailor from '../tailors/Tailor';

const SingleBookingDetail = (props) => {

    const onDelete=()=> {
        props.handleDelete(props.id)
    }

    const onEdit=() => {
        props.handleEdit(props.id)
    }

    if(!props.booking){
        return null;
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
                {props.booking._embedded.customer? <Customer customer={props.booking._embedded.customer}/>: "Booking has no customer"}
            </div>
            <div className="booking-item-component-details">        
                <h4>Fabrics Detail:</h4>
                {props.booking._embedded.fabrics?<FabricList fabrics={props.booking._embedded.fabrics}/>: "Booking has no selected fabrics"}
            </div>
            <div className="booking-item-component-details">        
                <h4>Measurement Detail:</h4>
                {props.booking._embedded.measurement? <Measurement measurement={props.booking._embedded.measurement}/>: "Booking has no measurement"}
            </div>
            <div className="booking-item-component-details">        
                <h4>Style Detail:</h4>
                {props.booking._embedded.style? <Style style={props.booking._embedded.style}/>: "Booking has no style assigned"}
            </div>
            <div className="booking-item-component-details">        
                <h4>Tailor Detail:</h4>
                {props.booking._embedded.tailor? <Tailor tailor={props.booking._embedded.tailor}/>: "Booking has no tailor assigned"}
            </div>
           <button className="delete-button" onClick={onDelete}>Delete Booking</button>
           <button className="edit-button" onClick={onEdit}>Edit Booking</button>
        </div>
    )
}

export default SingleBookingDetail;