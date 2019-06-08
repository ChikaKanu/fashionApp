import React from 'react';
import BookingList from '../bookings/BookingList';

const FabricDetail = (props) => {

    if(!props.fabric) {
        return null;
    }

    const onDelete = () => {
        props.handleFabricDelete(props.id)
    }

    const onEdit = () => {
        props.handleFabricEdit(props.id)
    }

    const bookings = [];
    const addBooking = bookings.push(props.fabric._embedded.booking);

    return(
        <div className="fabric-item-details">
            <div className="fabric-item-component-details">
            <h4>Fabric Details:</h4>
                <p>Id: {props.id}</p>
                <p>Name: {props.fabric.name}</p>
                <p>Colour: {props.fabric.colour}</p>
                <p>Picture: {props.fabric.picture}</p>
                <p>Cost per yard:  ₦ {props.fabric.fabricCost}</p>
                <p>Quantity: {props.fabric.quantity}</p>      
            </div>
            <div className="fabric-item-component-details">
            <h4>Booking:</h4>
                <BookingList bookings={bookings}/>
            </div>
            <button className="delete-button" onClick={onDelete}>Delete Fabric</button>
            <button className="edit-button" onClick={onEdit}>Edit Fabric</button>
        </div>
    )
}

export default FabricDetail;