import React, {Component} from 'react';
import Request from '../../helpers/request';
import BookingEditForm from '../../components/bookings/BookingEditForm.js';

class BookingEditFormContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            booking: null,
            customers: null,
            measurements: null,
            tailors: null,
            fabrics: null,
            styles: null,
        };
        this.handleBookingEdit = this.handleBookingEdit.bind(this);

    };

    //Function to get data from the backend and confirm it is mounted at the state level of this container.
    componentDidMount(){
        const request = new Request();
        request.get("/api/bookings" + this.props.id + "?projection=embedded").then((booking) => {
            console.log({booking})
            this.setState({booking: booking})
        });
        request.get("/api/customers").then((customers) => {
            this.setState({customers: customers._embedded.customers})
        })
        request.get("/api/measurements").then((measurements) => {
            this.setState({measurements: measurements._embedded.measurements})
        })
        request.get("/api/tailors").then((tailors) => {
            this.setState({tailors: tailors._embedded.tailors})
        })
        request.get("/api/fabrics").then((fabrics) => {
            this.setState({fabrics: fabrics._embedded.fabrics})
        })
        request.get("/api/styles").then((styles) => {
            this.setState({styles: styles._embedded.styles})
        })
    }
    //this function handlesthe edit and passes it to the compoent to effect change in database. Used patch for this function.
    handleBookingEdit(booking){
        const request = new Request();
        request.patch("/api/bookings/"+ this.props.id, booking).then(() => {
            window.location = "/bookings" + this.props.id
        })
    }

    render(){
        if (!this.props.bookings || !this.props.customers || !this.props.measurements || !this.props.tailors || !this.props.fabrics || !this.props.styles){
            return <h2>page loading</h2>;
        }
        //passes data down to the component for rendering purpose. Also, a fuction passed from the component to handle data edit (update)
        return <BookingEditForm bookings = {this.state.bookings} customers = {this.state.customers} measurements = {this.state.measurements} tailors = {this.state.tailors} fabrics = {this.state.fabrics} styles = {this.state.styles} handleBookingEdit = {this.handleBookingEidt} />

    }

}

export default BookingEditFormContainer;