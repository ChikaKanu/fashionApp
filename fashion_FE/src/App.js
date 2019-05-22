import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import NavBar from "./NavBar.js";
import Home from './Home.js';

class App extends Component{
  render() {
    return(
      <Router>
        <React.Fragment>
          <NavBar />
          <Switch>
            <Route exact path='/' component={Home}/>
            <Route exact path='/bookings' component={BookingListContainer}/>
            <Route exact path='/bookings/new' component={BookingFormContainer}/>
            <Route exact path="bookings/edit/:id" render = {(props) =>{
              const id = props.match.params.id;
              return <BookingEditFormContainer id = {id} />
            }}/>
            <Route exact path="bookings/:id" render = {(props) =>{
              const id = props.match.params.id;
              return <SingleBookingContainer id = {id} />
            }}/>
            <Route exact path='/fabrics' component={FabricListContainer}/>
            <Route exact path='/fabrics/new' component={FabricFormContainer}/>
            <Route exact path="/fabrics/:id" render={(props)=>{
              const id  = props.match.params.id;
              return <SingleFabricContainer id = {id}/>
            }}/>
            <Route exact path='/styles' component={StyleListContainer}/>
            <Route exact path='/styles/new' component={StyleFormContainer}/>
            <Route exact path="/styles/:id" render = {(props) =>{
              const id = props.match.params.id;
              <SingleStyleContainer id = {id}/>
            }}/>
            <Route exact path='/customers' component={CustomerListContainer}/>
            <Route exact path='/customers/new' component={CustomerFormContainer}/>
            <Route exact path='/customers/:id' render={(props) => {
              const id = props.match.params.id;
              return <SingleCustomerContainer id = {id}/>
            }}/>
            <Route exact path='/measurements' component={MeasurementListContainer}/>
            <Route exact path='/measurements/new' component={MeasurementFormContainer}/>
            <Route exact path='/measurements/:id' render={(props) => {
              const id = props.match.params.id;
              <SingleMeasurementContainer id = {id}/>
            }}/>
            <Route exact path='/tailors' component={TailorListContainer}/>
            <Route exact path='/tailors/new' component={TailorFormContainer}/>
            <Route exact path="/tailors/:id" render = {(props) =>{
              const id = props.match.params.id;
              return <SingleTailorContainer id = {id} />
            }}/>
          </Switch>
        </React.Fragment>
      </Router>
    )
  }
}


export default App;
