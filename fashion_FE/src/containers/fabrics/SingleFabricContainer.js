import React, {Component} from 'react';
import Request from '../../helpers/request';
import FabricDetail from '../../components/fabrics/FabricDetail';

class SingleFabricContainer extends Component{
    constructor(props){
        super(props);
            this.state={
                fabric: null
            }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/fabrics/'+this.props.id+'?projection=embedded').then((data)=>{
            this.setState({fabric: data});
        })
    }
    //below code persists deletion of item from the datanase, while returning the fabrics list.
    handleFabricDelete(id){
        const request = new Request();
        request.delete('/api/fabrics/'+id).then(() => {
            window.location = '/fabrics';
        })
    }

    handleFabricEdit(id){
        window.location = '/fabrics/edit/'+id;
    }

    render(){
        console.log(this.state.fabric)
        return(
            <FabricDetail id = {this.props.id} fabric={this.state.fabric} handleFabricDelete={this.handleFabricDelete} handleFabricEdit={this.handleFabricEdit}/>
        )
    }

}

export default SingleFabricContainer;