import React from 'react';
import {Link} from 'react-router-dom';

const Fabric = (props) => {

    if(!props.fabric){
        return null;
    }
    
    return(
       <React.Fragment>
           <Link to={'/fabrics/'+props.fabric.id} className="fabric-detail-link">
           <p>Fabric_Id: {props.fabric.id}</p>             
           <p>Name: {props.fabric.name}</p>
           <p>Image: {props.fabric.picture}</p>
           <p>Colour: {props.fabric.colour}</p>
           </Link>
       </React.Fragment>
   )


}

export default Fabric;