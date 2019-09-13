import React, {Component} from 'react';
import { Collapse, Nav, Navbar, DropdownToggle, NavbarBrand, Dropdown, NavbarToggler, NavItem, NavLink, DropdownItem, Button, DropdownMenu, ButtonGroup } from 'reactstrap';
import {Link} from "react-router-dom";

class NavBar extends Component{
    constructor(props) {
        super(props);
        this.state = {isOpen: false};
        this.toggle = this.toggle.bind(this);
    }

    toggle(){
        this.setState({
            isOpen: !this.state.isOpen
        })
    }
    render(){
        if(this.error){
            return <h2>Error loading page</h2>
        }
        return(
            <Navbar color="dark" dark expand="md">
            <React.Fragment>
                    <NavbarBrand tag={Link} to="/">
                        <Dropdown as={ButtonGroup}>
                            <Button variant="success">Home</Button> 
                            <DropdownToggle split variant="success" id="dropdown-split-basic"/>
                            <DropdownMenu>
                                <DropdownItem href="#/action-1">Booking</DropdownItem>
                                <DropdownItem href="#/action-2">School</DropdownItem>
                                <DropdownItem href="#/action-3">Luggage</DropdownItem>
                            </DropdownMenu>
                        </Dropdown>
                    </NavbarBrand>
                    <NavbarBrand tag={Link} to="/bookings">Booking</NavbarBrand>
                    <NavbarBrand tag={Link} to="/customers">Customer</NavbarBrand>
                    <NavbarBrand tag={Link} to="/styles">Styles</NavbarBrand>
                    <NavbarBrand tag={Link} to="/measurements">Measurements</NavbarBrand>
                    <NavbarBrand tag={Link} to="/fabrics">Fabrics</NavbarBrand>
                    <NavbarBrand tag={Link} to="/tailors">Tailors</NavbarBrand>
                    <NavbarToggler onClick={this.toggle}/>
                    <Collapse isOpen={this.state.isOpen} navbar>
                        <Nav className="m1-auto" navbar>
                            <NavItem>
                                <NavLink href="https://github.com/">@github</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="https://twitter.com/">@twitter</NavLink>
                            </NavItem>
                        </Nav>
                    </Collapse>
            
            </React.Fragment>
            </Navbar>
        )

    }
}


export default NavBar;
