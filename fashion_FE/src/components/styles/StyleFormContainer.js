import React, {Component} from 'react';
import Request from '../../helpers/request';
import { thisExpression } from '@babel/types';
import StyleFormNew from './StyleFormNew';
import Axios from "axios";

class StyleFormContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            styles: [],
        }
        this.handleStylePost = this.handleStylePost.bind(this);
    }

    componentDidMount(){
        const request = new Request();
        request.get("/api/styles").then((data)=>{
            this.setState({styles: data._embedded.styles})
        })
    }

    handleStylePost(style){
        console.log(style);
        const request = new Request();
        request.post('/api/styles', style).then(()=> {
            window.location = '/styles'
        });
    }

ç

    render(){
        console.log(this.state.styles);
        return(
            <StyleFormNew styles = {this.state.styles}  handleStylePost= {this.handleStylePost}/>
        )
    }

}

export default StyleFormContainer;