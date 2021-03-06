import React from 'react';
import BookingList from '../bookings/BookingList';

const SingleStyleDetail = (props) => {

    const onDelete=()=>{
        props.handleStyleDelete(props.id)
    }

    const onEdit=()=>{
        props.handleStyleEdit(props.id)
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
            {/* <div className="style-item-component-details">
                <h4>Associated Bookings:</h4>
                {props.style._embedded? <BookingList bookings={props.style._embedded.bookings}/>: "Selected style has no associated booking(s)."}
            </div> */}
            <button className="delete-button" onClick={onDelete}>Delete Style</button>
            <button className="edit-button" onClick={onEdit}>Edit Style</button>
        </div>

    )

}

export default SingleStyleDetail;