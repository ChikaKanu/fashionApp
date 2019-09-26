import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import Home from './Home.js';
import { CookiesProvider } from 'react-cookie';
import BookingListContainer from './components/bookings/BookingListContainer';
import BookingFormContainer from './components/bookings/BookingFormContainer';
import BookingEditFormContainer from './components/bookings/BookingEditFormContainer';
import SingleBookingContainer from './components/bookings/SingleBookingContainer';
import FabricEditFormContainer from './components/fabrics/FabricEditFormContainer';
import FabricFormContainer from './components/fabrics/FabricFormContainer';
import FabricListContainer from './components/fabrics/FabricListContainer';
import SingleFabricContainer from './components/fabrics/SingleFabricContainer';
import CustomerFormContainer from './components/customers/CustomerFormContainer';
import CustomerListContainer from './components/customers/CustomerListContainer';
import CustomerEditFormContainer from './components/customers/CustomerEditFormContainer';
import SingleCustomerContainer from './components/customers/SingleCustomerContainer';
import MeasurementFormContainer from './components/measurements/MeasurementFormContainer';
import MeasurementListContainer from './components/measurements/MeasurementListContainer';
import MeasurementEditFormContainer from './components/measurements/MeasurementEditFormContainer';
import SingleMeasurementContainer from './components/measurements/SingleMeasurementContainer';
import TailorFormContainer from './components/tailors/TailorFormContainer';
import TailorListContainer from './components/tailors/TailorListContainer';
import TailorsEditFormContainer from './components/tailors/TailorEditFormContainer';
import SingleTailorContainer from './components/tailors/SingleTailorContainer';
import StyleFormContainer from './components/styles/StyleFormContainer';
import StyleListContainer from './components/styles/StyleListContainer';
import StyleEditFormContainer from './components/styles/StyleEditFormContainer';
import SingleStyleContainer from './components/styles/SingleStyleContainer';
import Header from './Header';


class App extends Component{
  render() {
    return(
      <CookiesProvider>
        <Router>
          <React.Fragment>
          <Header/>
            <Switch>
              <Route exact path='/' component={Home}/>
              <Route exact path='/bookings' component={BookingListContainer}/>
              <Route exact path='/bookings/new' component={BookingFormContainer}/>
              <Route exact path='/bookings/edit/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <BookingEditFormContainer id = {id} />
              }}/>
              <Route path='/bookings/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <SingleBookingContainer id = {id} />
              }}/>
              <Route exact path='/fabrics' component={FabricListContainer}/>
              <Route exact path='/fabrics/new' component={FabricFormContainer}/>
              <Route exact path='/fabrics/edit/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <FabricEditFormContainer id = {id} />
              }}/>
              <Route exact path='/fabrics/:id' render={(props)=>{
                const id  = props.match.params.id;
                return <SingleFabricContainer id = {id}/>
              }}/>
              <Route exact path='/styles' component={StyleListContainer}/>
              <Route exact path='/styles/new' component={StyleFormContainer}/>
              <Route exact path='/styles/edit/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <StyleEditFormContainer id = {id} />
              }}/>
              <Route exact path="/styles/:id" render = {(props) =>{
                const id = props.match.params.id;
                return <SingleStyleContainer id = {id}/>
              }}/>
              <Route exact path='/customers' component={CustomerListContainer}/>
              <Route exact path='/customers/new' component={CustomerFormContainer}/>
              <Route exact path='/customers/edit/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <CustomerEditFormContainer id = {id} />
              }}/>
              <Route exact path='/customers/:id' render={(props) => {
                const id = props.match.params.id;
                return <SingleCustomerContainer id = {id}/>
              }}/>
              <Route exact path='/measurements' component={MeasurementListContainer}/>
              <Route exact path='/measurements/new' component={MeasurementFormContainer}/>
              <Route exact path='/measurements/edit/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <MeasurementEditFormContainer id = {id} />
              }}/>
              <Route exact path='/measurements/:id' render={(props) => {
                const id = props.match.params.id;
                return <SingleMeasurementContainer id = {id}/>
              }}/>
              <Route exact path='/tailors' component={TailorListContainer}/>
              <Route exact path='/tailors/new' component={TailorFormContainer}/>
              <Route exact path='/tailors/edit/:id' render = {(props) =>{
                const id = props.match.params.id;
                return <TailorsEditFormContainer id = {id} />
              }}/>
              <Route exact path="/tailors/:id" render = {(props) =>{
                const id = props.match.params.id;
                return <SingleTailorContainer id = {id} />
              }}/>
            </Switch>
          </React.Fragment>
        </Router>
      </CookiesProvider>
    )
  }
}

export default App;
