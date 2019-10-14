import React, {Component} from 'react';
import Request from '../../helpers/request';
import { thisExpression } from '@babel/types';
import StyleFormNew from './StyleFormNew';

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
        const request = new Request();
        request.post('/api/styles', style).then(()=> {
            window.location = '/styles'
        });
    }



    render(){
        console.log(this.state.styles);
        
        
        return(
            <StyleFormNew styles = {this.state.styles}  handleStylePost= {this.handleStylePost}/>
        )
    }

}

export default StyleFormContainer;