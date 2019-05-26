import React, {Component} from 'react';
import {Link} from "react-router-dom";

class NavBar extends Component{
    render(){
        if(this.error){
            return <h2>Error loading page</h2>
        }
        return(
            <React.Fragment>
                <nav>
                    <Link className='navButton' to="/">Home</Link>
                    <Link className='navButton' to="/bookings">Booking</Link>
                    <Link className='navButton' to="/customers">Customer</Link>
                    <Link className='navButton' to="/styles">Styles</Link>
                    <Link className='navButton' to="/measurements">Measurements</Link>
                    <Link className='navButton' to="/fabrics">Fabrics</Link>
                    <Link className='navButton' to="/tailors">Tailors</Link>
                </nav>
            </React.Fragment>
        )

    }
}
    

export default NavBar;
