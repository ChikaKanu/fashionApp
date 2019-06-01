import React, {Component} from 'react';
import Request from '../../helpers/request';
import CustomerDetail from '../../components/customers/CustomerDetail.js';

class SingleCustomerContainer extends Component{
    constructor(props){
        super(props);
            this.state={
                customer: null
            }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/customers/'+this.props.id+'?projection=embedded').then((data)=>{
            this.setState({customer: data})
        })
    }

    render(){
        if(!this.state.customer){
            return null
        }
        return(
                <CustomerDetail customer={this.state.customer}/>
        )
    }


}


export default SingleCustomerContainer;