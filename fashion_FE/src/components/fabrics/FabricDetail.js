import React, {Component} from 'react';
import BookingList from '../bookings/BookingList';

class FabricDetail extends Component{
    constructor(props){
        super(props);
        this.state={
            fabric: null,
            bookings: []
        }
    }

    onDelete(){
        this.props.handleFabricDelete(this.props.fabric.id)
    }

    onEdit(){
        this.props.handleFabricEdit(this.props.fabric.id)
    }

    //below fuction converts the booking object recxieved from the this.props to an array of the object to enable render to BookingList which accepts Arrays instead of objects
    componentWillMount(){
        const bookings= [];
        const fabric = this.props.fabric
        if (this.props.fabric._embedded){
            bookings.push(this.props.fabric._embedded.booking)
        }
        this.setState({bookings: bookings})
        this.setState({fabric: fabric})
    }

    render(){
        // console.log(this.state.bookings)
        console.log(this.state.bookings)
        return(
            <div className="fabric-item-details">
                <div className="fabric-item-component-details">
                <h4>Fabric Details:</h4>
                    <p>Id: {this.props.id}</p>
                    <p>Name: {this.state.fabric.name}</p>
                    <p>Colour: {this.state.fabric.colour}</p>
                    <p>Picture: {this.state.fabric.picture}</p>
                    <p>Cost per yard:  ₦ {this.state.fabric.fabricCost}</p>
                    <p>Quantity: {this.state.fabric.quantity}</p>      
                </div>
                <div className="fabric-item-component-details">
                <h4>Associated Bookings:</h4>
                    {this.state?<BookingList bookings={this.state.bookings}/>: "Fabric has no associated booking"}
                </div>
                <button className="delete-button" onClick={this.onDelete}>Delete Fabric</button>
                <button className="edit-button" onClick={this.onEdit}>Edit Fabric</button>
            </div>
        )
    }
}

export default FabricDetail;