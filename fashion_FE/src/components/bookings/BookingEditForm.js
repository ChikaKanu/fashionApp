import React, {Component} from 'react';
import Request from '../../helpers/request';
import Select from 'react-select';

class BookingEditForm extends Component{
    constructor(props){
        super(props);
        this.state={
            date: props.booking.date,
            status: props.booking.status,
            totalCost: props.booking.totalCost,
            remarks: props.booking.remarks,
            customer: props.booking.customer,
            style: props.booking.style,
            fabricOptions: [],
            fabrics: props.fabrics,
            tailor: props.booking.tailor,
            measurement: props.booking.measurement,
        }
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    
    //stop page from refreshing, 
    handleSubmit(event){
        event.preventDefault();
        const newBooking = {
            "date": this.state.date,
            "status": this.state.status,
            "totalCost": this.state.totalCost,
            "remarks": this.state.remarks,
            "customer": event.target.customer.value,
            "style": event.target.style.value,
            "fabrics": this.state.fabricOptions,
            "tailor": event.target.tailor.value,
            "measurement": event.target.measurement.value,
        }
        this.props.handleBookingEdit(newBooking);
    }


    render(){
        const customerOption = this.props.customers.map((customer, index) => {
            return <option key={index} value={customer._links.self.href}>{customer.firstName} {customer.surname}</option>
        })

        const styleOption = this.props.styles.map((style, index) => {
            return <option key={index} value={style._links.self.href}>{style.name}</option>
        })

        const fabricOptions = this.props.fabrics.map((fabric) => {
            return <option key={fabric.id} value={fabric.name}>{fabric.name}</option>
        })

        const tailorOption = this.props.tailors.map((tailor, index) => {
            return <option key={index} value={tailor._links.self.href}>{tailor.firstName}</option>
        })

        const measurementOption = this.props.measurements.map((measurement, index) => {
            return <option key={index} value={measurement._links.self.href}>{measurement.sizeOwner}</option>
        })

        console.log(fabricOptions)


        return(
            <React.Fragment>
                <div className="booking-new-item-form" >
                <form onSubmit={this.handleSubmit}>
                    <label htmlFor="status">Status:</label>
                    <input type="text" id='status' name="status" value={this.state.status} onChange={evt=>this.setState({status: evt.target.value})} />
                    <br/>
                    <label htmlFor="totalCost">TotalCost (autofilled):</label>
                    <input readOnly type="text" id='totalCost' name="totalCost" value={this.state.totalCost} onChange={evt=>this.setState({totalCost: evt.target.value})} />
                    <br/>
                    <label htmlFor="remarks">Remarks:</label>
                    <input type="text" id='remarks' name="remarks" maxLength="70" value={this.state.remarks || ""} onChange={evt=>this.setState({remarks: evt.target.value})} />
                    <br/>  
                    <label htmlFor="date">Date:</label>
                    <input type="date" id='date' name="date" value={this.state.date} onChange={evt=>this.setState({date: evt.target.value})} />
                    <br/>
                    <label htmlFor="customer">Customer:</label>          
                    <select id='customer' name="customer" onChange={evt=>this.setState({customer: evt.target.value})} >
                        {customerOption}
                    </select>
                    <br/>
                    <label htmlFor="style">Style:</label>          
                    <select id='style' name="style" onChange={evt=>this.setState({style: evt.target.value})} >
                        {styleOption}
                    </select>
                    <br/>
                    <label htmlFor="fabrics">Fabrics:</label>          
                    <Select options={fabricOptions} value={fabricOptions} onChange={evt=>this.setState({fabricOptions: evt})}/>
                    <br/>
                    <label htmlFor="tailor">Tailor:</label>          
                    <select id='tailor' name="tailor" onChange={evt=>this.setState({tailor: evt.target.value})} >
                        {tailorOption}
                    </select>
                    <br/>
                    <label htmlFor="measurement">Measurement:</label>          
                    <select id='measurement' name="measurement" value={this.state.measurement} onChange={evt=>this.setState({measurement: evt.target.value})} >
                        {measurementOption}
                    </select>
                    <button id="save-button" type="submit">Save Booking</button>
                </form>
            </div>
        </React.Fragment>
        )

    }

}

export default BookingEditForm;