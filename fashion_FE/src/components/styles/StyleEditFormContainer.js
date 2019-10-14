import React, {Component} from 'react';
import Request from '../../helpers/request';

class StyleEditFormContainer extends Component{
    constructor(props){
        super(props);
        this.state={
            style: null,
            selectedStyle: null
        }

    }

    componentDidMount(){
        const request = new Request();
        const url = '/styles/'
        request.get()
    }

}

export default StyleEditFormContainer ;