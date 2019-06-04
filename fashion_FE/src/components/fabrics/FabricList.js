import React from 'react';
import Fabric from './Fabric';
import Booking from '../bookings/Booking';

const FabricList = (props) => {
    const eachFabric = props.fabrics.map((fabric) => {
        return(
            <li key={fabric.id} className="fabric-component-list-item">
                <div className="fabric-component">
                    <Booking fabric = {fabric}/>
                    <Fabric  fabric = {fabric}/>
                </div>
            </li>
        )
    })

    return(
            <ul className="fabric-component-list">
                {eachFabric}
            </ul>
    )

}

export default FabricList;