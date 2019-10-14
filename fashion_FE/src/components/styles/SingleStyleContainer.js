import React, {Component} from 'react';
import Request from '../../helpers/request';
import SingleStyleDetail from './SingleStyleDetail';

class SingleStyleContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            style: null
        }
        this.handleStyleDelete = this.handleStyleDelete.bind(this);
        this.handleStyleEdit = this.handleStyleEdit.bind(this);
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/styles/'+this.props.id+'?projection=embedded').then((data)=>{
            this.setState({style: data});
        })
    }

    // this function will be passed down to SingleStyleDetail component for rendering there
// make a request to back end api to delete style based on id, then return to /styles route (StyleListContainer)
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
            <SingleStyleDetail id={this.props.id} style={this.state.style} handleStyleEdit = {this.handleStyleEdit} handleStyleDelete = {this.handleStyleDelete}/>
        )
    }

}

export default SingleStyleContainer;