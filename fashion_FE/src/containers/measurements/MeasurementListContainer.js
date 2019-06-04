import React, {Component} from 'react';
import Request from '../../helpers/request';
import MeasurementList from '../../components/measurements/MeasurementList'

class MeasurementListContainer extends Component{
    constructor(){
        super();
        this.state={
            measurements: []
        }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/measurements').then((data) => {
            this.setState({measurements: data._embedded.measurements})
        })
    }

    render(){
        console.log(this.state.measurements)

        if (!this.state.measurements){
            return null
        }
        return(
            <MeasurementList measurements={this.state.measurements}/>
        )
    }
}

export default MeasurementListContainer;