import React from 'react';
import BookingList from "../bookings/BookingList.js";

const CustomerDetail = (props) => {
    if(!props.customer){
        return null
    }
    return(
        <div className="customer-item-details">
            <div classname="customer-item-component-details">
                <h4>Customer Details:</h4>
                <p>Name: {props.customer.firstName} {props.customer.surname}</p>
                <p>Address: {props.customer.address} </p>
                <p>Contact: {props.customer.contact} </p> 
                <p>Gender: {props.customer.gender} </p>      
                <p>Bill: ₦ {props.customer.bill} </p>
            </div>
            <div className="customer-item-component-details">
                <h4>Customer Details:</h4>
                <BookingList bookings={props.bookings}/>
            </div>
        </div>
    )
}

export default CustomerDetail;