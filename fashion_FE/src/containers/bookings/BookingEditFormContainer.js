import React, {Component} from 'react';
import Request from '../../helpers/request';
import BookingEditForm from '../../components/bookings/BookingEditForm.js';

class BookingEditFormContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            booking: null,
            customers: [],
            measurements: [],
            tailors: [],
            fabrics: [],
            styles: [],
        };
        this.handleBookingEdit = this.handleBookingEdit.bind(this);

    };

    //Function to get data from the backend and confirm it is mounted at the state level of this container.
    componentDidMount(){
        const request = new Request();
        request.get("/api/bookings/" + this.props.id + "?projection=embedded").then((booking) => {
            this.setState({booking: booking})
        });
        request.get("/api/customers").then((data) => {
            console.log(data._embedded.customers)
            this.setState({customers: data._embedded.customers})
        })
        request.get("/api/measurements").then((data) => {
            this.setState({measurements: data._embedded.measurements})
        })
        request.get("/api/tailors").then((data) => {
            this.setState({tailors: data._embedded.tailors})
        })
        request.get("/api/fabrics").then((data) => {
            this.setState({fabrics: data._embedded.fabrics})
        })
        request.get("/api/styles").then((data) => {
            this.setState({styles: data._embedded.styles})
        })
    }
    //this function handlesthe edit and passes it to the component to effect change in database. Used patch for this function.

    handleBookingEdit(booking){
        const request = new Request();
        request.patch('/api/bookings/'+ this.props.id, booking).then(() => {
            window.location = '/bookings/' + this.props.id
        })
    }

    render(){
        console.log(this.state.customers)
        if (!this.state.booking || !this.state.customers || !this.state.measurements || !this.state.tailors || !this.state.fabrics || !this.state.styles){
            return <h2>page loading</h2>;
        }
        //passes data down to the component for rendering purpose. Also, a fuction passed from the component to handle data edit (update)
        return <BookingEditForm booking = {this.state.booking} customers = {this.state.customers} measurements = {this.state.measurements} tailors = {this.state.tailors} fabrics = {this.state.fabrics} styles = {this.state.styles} handleBookingEdit = {this.handleBookingEdit} />

    }
    
}

export default BookingEditFormContainer;
