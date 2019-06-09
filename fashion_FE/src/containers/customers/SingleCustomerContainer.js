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

    handleDelete(id){
        const request = new Request();
        const url = '/api/customers/'+ id;
        request.delete(url).then(()=>{
            window.location = '/customers';
        })
    }
    //this code redirects browser to the edit window.
    handleEdit(id){
        window.location = '/customers/edit/' + id;
    }

    render(){
        console.log(this.state.customer)
        
        if(!this.state.customer){
            return null
        }
        return(
                <CustomerDetail customer={this.state.customer} handleDelete={this.handleDelete} handleEdit={this.handleEdit}/>
        )
    }


}


export default SingleCustomerContainer;