import React from 'react';
import Measurement from './Measurement';

const MeasurementList = (props) => {

    const measurement = props.measurements.map((measurement) => {
        return(
            <li key={measurement.id} className="measurement-component-list">
                <div className="measurement-component-list-item">
                    <Measurement measurement={measurement}/>
                </div>
            </li>
        )
    })

    return(
        <ul className="measurement-component">
            {measurement}
        </ul>
    )

}

export default MeasurementList;