import React, {Component} from 'react';
import Request from '../../helpers/request';
import BookingList from '../../components/bookings/BookingList';

class BookingListContainer extends Component{
    constructor(props){
        super(props);
        this.state = {bookings: []}
      }
    
      componentDidMount(){
        let request = new Request();
        request.get('/api/bookings').then((data) => {
          this.setState({bookings: data._embedded.bookings})
        })
      }
    
    
      render(){
        return (
         <BookingList bookings = {this.state.bookings} />
        )
      }

}

export default BookingListContainer;