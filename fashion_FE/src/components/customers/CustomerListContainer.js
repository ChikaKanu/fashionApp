import React, {Component} from 'react';
import Request from '../../helpers/request';
import CustomerList from './CustomerList';

class CustomerListContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
        customers: []
        } 
    }

    componentDidMount(){
        let request = new Request();
        request.get("/api/userDetails").then((data) => {
            this.setState({customers: data._embedded.userDetails});
        });

    }

    render(){
        console.log(this.state.customers)
        return(
            <CustomerList customers = {this.state.customers}/>
        )
    }

}

export default CustomerListContainer;