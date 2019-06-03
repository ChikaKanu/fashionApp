import React, {Component} from 'react';
import Request from '../../helpers/request';
import BookingDetail from '../../components/bookings/BookingDetail.js';

class SingleBookingContainer extends Component{
    constructor(props){
        super(props);
            this.state={booking: null}
            this.handleDelete = this.handleDelete.bind(this)
            this.handleEdit = this.handleEdit.bind(this)
    }

    componentDidMount(){
        let request = new Request();
        console.log(this.props.id);
        const url = '/api/bookings/' + this.props.id +'?projection=embedded';
        request.get(url).then((data) =>{
            this.setState({booking: data})
        })
    }

    //this function is passed down to the bookingdetails file to use in deleting an item or booking.
    handleDelete(id){
        let request = new Request();
        const url = '/api/bookings/' + id;
        request.delete(url).then(() => {
            window.location = '/bookings'
        })
    }
    //this function is passed down to the bookingdetails file to use in updating information of a particular booking
    handleEdit(id){
        console.log(id)
        window.location = '/bookings/edit/' + id;
    }

    render(){
        if(!this.state.booking){
            return null
        }
        return(
            <BookingDetail id={this.props.id} booking={this.state.booking} handleDelete={this.handleDelete} handleEdit={this.handleEdit}/>
        )
    }




}

export default SingleBookingContainer;
