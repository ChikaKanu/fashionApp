import React, {Component} from 'react';
import Request from '../../helpers/request';

class SingleBookingContainer extends Component{
    constructor(props){
        super(props);
            this.state={
                article: null
            }
        this.handleDelete = this.handleDelete.bind(this)
        this.handleEdit = this.handleEdit.bind(this)
    }

    
}

export default SingleBookingContainer;