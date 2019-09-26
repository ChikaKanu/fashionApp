import React, {Component} from 'react';
import Request from '../../helpers/request';
import StyleList from './StyleList';

class StyleListContainer extends Component{
    constructor(){
        super();
        this.state={
            styles: []
        }
    }

    componentDidMount(){
        const request = new Request();
        request.get('/api/styles').then((data) => {
            this.setState({styles: data._embedded.styles})
        })
    }

    render(){
        if (!this.state.styles){
            return null;
        }
        console.log(this.state.styles)

        return(
            <StyleList styles={this.state.styles} />
        )
    }

}

export default StyleListContainer;