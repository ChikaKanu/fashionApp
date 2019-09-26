import React from 'react';
import BookingList from "../bookings/BookingList";

const SingleCustomerDetail = (props) => {


    const onDelete=()=>{
        props.handleDelete(props.customer.id)
    }

    const onEdit=()=> {
        props.handleEdit(props.customer.id)
    }

    return(
        <div className="customer-item-details">
            <div className="customer-item-component-details">
                <h4>Customer Details:</h4>
                <p>Name: {props.customer.firstName} {props.customer.surname}</p>
                <p>Address: {props.customer.address} </p>
                <p>Contact: {props.customer.contact} </p> 
                <p>Gender: {props.customer.gender} </p>      
                <p>Bill: ₦ {props.customer.bill} </p>
            </div>
            <div className="customer-item-component-details">
                <h4>Associated Bookings:</h4>
                {props.customer._embedded? <BookingList bookings={props.customer._embedded.bookings}/> : "Customer has no booking"}
             </div>
                <button className="delete-button" onClick={onDelete}>Delete Customer</button>
                <button className="edit-button" onClick={onEdit}>Edit Customer</button>
        </div>
    )    
}

export default SingleCustomerDetail;