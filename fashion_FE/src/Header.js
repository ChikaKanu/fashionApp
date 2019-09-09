import React, {Component} from "react";
import NavBar from './NavBar';

class Header extends Component{
    render(){
        return(
            <React.Fragment> 
                <header>
                <h3>Welcome to FashionApp!</h3>
                <NavBar/>
                </header>
            </React.Fragment>
        )
    }
}
export default Header;