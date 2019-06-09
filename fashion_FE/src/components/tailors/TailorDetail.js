import React from 'react';
import BookingList from '../bookings/BookingList';

const TailorDetail = (props) => {

    const onDelete=()=>{
        this.handleTailorDelete(props.id);
    }

    const onEdit=()=>{
        this.handleTailorEdit(props.id)
    }

    return(
        <div className="tailor-item-details">
            <div className="tailor-item-component-details">
                <h4>Tailor Basic Info:</h4>
                <p>Id: {props.id}</p>
                <p>Firstname: {props.tailor.firstName}</p>
                <p>Surname: {props.tailor.surname}</p>
                <p>Phone Number: {props.tailor.phone}</p>
                <p>Address: {props.tailor.address}</p>
            </div>
            <div className="tailor-item-component-details">
                <h4>Associated Bookings:</h4>
                {props.tailor._embedded? <BookingList bookings={props.tailor._embedded.bookings}/>: "Tailor has no assigned booking"};
            </div>
            <button className="delete-button" onClick={onDelete}>Delete Tailor</button>
            <button className="edit-button" onClick={onEdit}>Edit Tailor</button>
        </div>
    )
}

export default TailorDetail;