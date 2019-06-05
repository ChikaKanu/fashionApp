import React, {Component} from 'react';
import Request from '../../helpers/request';
import StyleDetail from '../../components/styles/StyleDetail';

class SingleStyleContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            style: null
        }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/styles/'+this.props.id+'?projection=embedded').then((data)=>{
            this.setState({style: data});
        })
    }

    handleStyleDelete(id){
        const request = new Request();
        request.delete('/api/styles/'+id).then(()=>{
            window.location = '/styles'
        })
    }

    handleStyleEdit(id){
        window.location = '/styles/edit/'+id;
    }

    render(){

        if(!this.state.style){
            return null;
        }

        console.log(this.state.style)

        return(
            <StyleDetail id={this.props.id} style={this.state.style} bookings={this.state.style._embedded.bookings}/>
        )
    }

}

export default SingleStyleContainer;