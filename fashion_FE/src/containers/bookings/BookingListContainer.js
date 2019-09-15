import React, {Component} from 'react';
import Request from '../../helpers/request';
import BookingList from '../../components/bookings/BookingList';
import {withRouter} from 'react-router-dom';
import {instanceOf} from 'prop-types';
import { withCookies, Cookies} from 'react-cookie';



class BookingListContainer extends Component{
  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };
    constructor(props){
        super(props);
        const {cookies} = props;
        this.state = {
          bookings: [], 
          csrfToken: cookies.get('XSRF-TOKEN'), 
          isLoading: true 
        };
    }

      componentDidMount(){
        this.setState({isLoading: true});
        let request = new Request();
        request.get('/api/bookings').then((data) => {
          this.setState({bookings: data._embedded.bookings, isLoading: false})
        })
        .catch(() => this.props.history.push('/'));
      }
    
    
      render(){
        return (
         <BookingList bookings = {this.state.bookings} />
        )
      }

}

export default withCookies(withRouter(BookingListContainer));