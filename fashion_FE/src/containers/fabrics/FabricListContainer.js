import React, {Component} from 'react';
import Request from '../../helpers/request';
import FabricList from '../../components/fabrics/FabricList';

class FabricListContainer extends Component{
        constructor(props){
            super(props);
            this.state = {
            fabrics: [],
            } 
        }
    
        componentDidMount(){
            let request = new Request();
            request.get("/api/fabrics").then((data) => {
                this.setState({fabrics: data._embedded.fabrics});
            });
    
        }

        render(){
            console.log(this.state.fabrics)
            return(
                <FabricList fabrics = {this.state.fabrics}/>
            )
        }
    
    
}

export default FabricListContainer;