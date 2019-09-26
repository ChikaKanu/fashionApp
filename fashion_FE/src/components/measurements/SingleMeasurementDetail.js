import React from 'react';
import BookingList from '../bookings/BookingList';

const SingleMeasurementDetail = (props) => {

    if(!props.measurement){
        return null;
    }

    const onDelete = () => {
        props.handleMeasurementDelete(props.id)
    }

    const onEdit = () => {
        props.handleMeasurementEdit(props.onEdit)
    }

    return(
        <div className="measurement-item-details">
            <div className="measurement-item-component-details">
                <h4>Measurement Details:</h4>
                <p>SizeOwner: {props.measurement.sizeOwner}</p>               
                <p>Bust: {props.measurement.bust}"</p>
                <p>UnderBust: {props.measurement.underBust}"</p>
                <p>Waist: {props.measurement.waist}"</p>
                <p>Hip: {props.measurement.hip}"</p>
                <p>Shoulder: {props.measurement.shoulder}"</p>
                <p>ArmLength: {props.measurement.armLength}"</p>
                <p>Neck: {props.measurement.neck}"</p>
                <p>Bicep: {props.measurement.bicep}"</p>
                <p>Wrist: {props.measurement.wrist}"</p>
                <p>BustHeight: {props.measurement.bustHeight}"</p>
                <p>ShoulderToWaistFront: {props.measurement.shoulderToWaistFront}"</p>
                <p>BustSeparation: {props.measurement.bustSeparation}"</p>
                <p>ShoulderToWaistBack: {props.measurement.shoulderToWaistBack}"</p>
                <p>BackWidth: {props.measurement.backWidth}"</p>
                <p>HipHeight: {props.measurement.hipHeight}"</p>
                <p>Thigh: {props.measurement.thigh}"</p>
                <p>Calf: {props.measurement.calf}"</p>
                <p>LegLength: {props.measurement.legLength}"</p>
                <p>WaistToFloor: {props.measurement.waistToFloor}"</p>
                <p>NeckToFloor: {props.measurement.neckToFloor}"</p>
                <p>TotalHeight: {props.measurement.totalHeight}"</p>
            </div>
            <div className="measurement-item-component-details">
                <h4>Bookings:</h4> 
                {props.measurement._embedded? <BookingList bookings = {props.measurement._embedded.bookings}/>: "Measurement has no associated booking"}
            </div>
            <button className="delete-button" onClick={onDelete}>Delete Measurement</button>
            <button className="edit-button" onClick={onEdit}>Edit Measurement</button>
        </div>
    )

}

export default SingleMeasurementDetail;