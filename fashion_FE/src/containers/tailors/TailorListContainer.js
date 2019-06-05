import React, {Component} from 'react';
import Request from '../../helpers/request';
import TailorList from '../../components/tailors/TailorList';

class TailorListContainer extends Component{
    constructor(){
        super();
        this.state={
            tailors: []
        }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/tailors').then((data) => {
            this.setState({tailors: data._embedded.tailors});
        })
    }

    render(){

        if(!this.state.tailors){
            return null;
        }

        console.log(this.state.tailors)

        return(
            <TailorList tailors={this.state.tailors}/>
        )
    }

}

export default TailorListContainer;