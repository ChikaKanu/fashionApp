import React, {Component} from 'react';
import { Link } from 'react-router-dom';
import { Button, Container  } from 'reactstrap';
import {withCookies} from 'react-cookie'
import Style from './components/styles/Style'
import './index.css';

class Home extends Component{
    state={
        isLoading: true,
        isAuthenticated: false,
        user: undefined
     }

     constructor(props){
         super(props);
         const {cookies} = props;
         this.state.csrfToken = cookies.get('XSRF-TOKEN');
         this.login = this.login.bind(this);
         this.logout = this.logout.bind(this);
     }


     async componentDidMount() {
        const response = await fetch('/user', {credentials: 'include'});
        const body = await response.text();
        console.log(body)
        if (body === '') {
          this.setState(({isAuthenticated: false}))
        } else {
          this.setState({isAuthenticated: true, user: JSON.parse(body)})
        }
      }



     login(){
         let port = (window.location.port? ':' + window.location.port : '');
         if (port === ':3000') {
             port = ':8080';
         }
         window.location.href = '//' + window.location.hostname + port + '/private';
     }

     logout() {
         fetch('/logout', {method: 'POST', credentials: 'include',
        headers: {'X-XSRF-TOKEN': this.state.csrfToken}}).then(res=>res.json())
        .then(response => {
            window.location.href = response.logoutUrl + "?id_token_hint=" +
                response.idToken + "&post_logout_redirect_uri=" + window.location.origin;
        });
     }

    render(){
        console.log(this.state.user)
        const message = this.state.user ? 
        <h2>Welcome, {this.state.user.name}!</h2> :
        <p> Please log in to do business with us. </p>;
        const button = this.state.isAuthenticated?
        <div>
            <Button color="link">
                <Link to="/bookings">View your bookings</Link>
            </Button>
            <br/>
            <Button color="primary" onClick={this.logout}>
                Logout
            </Button>
            </div> :
            <Button color="primary" onClick={this.login}>
                Login
            </Button>;

        return(
            <div>
                <Container fluid>
                    {message}
                    {button}
                    <Style/>
                </Container>
            </div>
        );
    }
}

export default withCookies(Home);