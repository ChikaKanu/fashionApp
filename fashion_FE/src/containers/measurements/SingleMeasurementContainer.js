import React, {Component} from 'react';
import Request from '../../helpers/request';
import MeasurementDetail from '../../components/measurements/MeasurementDetail';

class SingleMeasurementContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            measurement: null
        }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/measurements/'+this.props.id+'?projection=embedded').then((data) =>{
            this.setState({measurement: data});
        })
    }

    handleMeasurementDelete(id){
        const request = new Request();
        request.delete('/api/measurements/'+id).then(() => {
            window.location = '/measurements';
        })
    }

    handleMeasurementEdit(id){
        window.location = '/measurements/edit/'+id;
    }

    render(){
        console.log(this.state.measurement)
        return(
            <MeasurementDetail id={this.props.id} measurement={this.state.measurement} />
        )
    }

}

export default SingleMeasurementContainer;