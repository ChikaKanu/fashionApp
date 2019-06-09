import React, {Component} from 'react';
import Request from '../../helpers/request';
import TailorDetail from '../../components/tailors/TailorDetail';

class SingleTailorContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            tailor: null
        }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/tailors/'+this.props.id+'?projection=embedded').then((data)=>{
            this.setState({tailor: data});
        })
    }

    handleTailorDelete(id){
        const request = new Request();
        request.delete('/api/tailors/'+id).then(()=>{
            window.location = '/tailors'
        })
    }

    handleTailorEdit(id){
        window.location = '/tailors/edit/'+id;
    }

    render(){
        if(!this.state.tailor){
            return null;
        }
        console.log(this.state.tailor)
        return(
            <TailorDetail id={this.props.id} tailor={this.state.tailor}/>
        )
    }
}

export default SingleTailorContainer;