import React from 'react';
import {Link} from 'react-router-dom';

const Measurement = (props) => {

    if(!props.measurement){
        return null;
    }

    return(
        <React.Fragment>
            <Link to={'/measurements/'+ props.measurement.id} className="measurement-detail-link">
            <p>Id: {props.measurement.id}</p>
            <p>SizeOwner: {props.measurement.sizeOwner}</p>
            <p>LegLength: {props.measurement.legLength}</p>
            <p>Waist: {props.measurement.waist}</p>
            <p>Hip: {props.measurement.hip}</p>
            <p>Shoulder: {props.measurement.shoulder}</p>
            </Link>
        </React.Fragment>
    )

}

export default Measurement;