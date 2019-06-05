import React from 'react';
import BookingList from '../bookings/BookingList';

const StyleDetail = (props) => {

    const onDelete=()=>{
        this.handleStyleDelete(props.id)
    }

    const onEdit=()=>{
        this.handleStyleEdit(props.id)
    }

    return(
        <div className="style-item-details">
            <div className="style-item-component-details">
                <h4>Styles Details:</h4>
                <p>Id: {props.style.id}</p>
                <p>Name: {props.style.name}</p>
                <p>Source (Designer): {props.style.source}</p>
                <p>LabourCost: {props.style.labourCost}</p>
                <p>Picture: {props.style.image}</p>
            </div>
            <div className="style-item-component-details">
                <BookingList bookings={props.bookings}/>
            </div>
            <button className="delete-button" onClick={onDelete}>Delete Style</button>
            <button className="edit-button" onClick={onEdit}>Edit Style</button>
        </div>

    )

}

export default StyleDetail;