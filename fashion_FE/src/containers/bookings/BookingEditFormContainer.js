import React, {Component} from 'react';
import Request from '../../helpers/request';

class BookingEditFormContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            bookings: null,
            customers: null,
            measurements: null,
            tailors: null,
            fabrics: null,
            styles: null,
        };

    };

    componentDidMount(){
        const request = new Request();
        request.get("/api/bookings" + this.props.id).then((bookings) => {
            this.setState({bookings: bookings._embedded.bookings})
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
}

export default BookingEditFormContainer;