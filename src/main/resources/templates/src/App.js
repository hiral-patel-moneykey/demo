import React, { Component } from 'react';
import './App.css';
import config from './configuration/appconfig';
import ToDo from './containers/ToDo/ToDo';

class App extends Component {

    constructor() {
        super();

        console.log("REACT_APP_CONFIG_PROFILE "+ process.env.REACT_APP_CONFIG_PROFILE);
        // console.log("REACT_APP_RANDOM "+ process.env.REACT_APP_RANDOM);
        // console.log("REACT_APP_CONFIG_ENV is "+ process.env.REACT_APP_CONFIG_ENV);
        console.log("Message is "+ config.message);
        console.log("Base URL is "+ config.baseurl);
    }

  render() {
        return (
            <div className="App" >
                <ToDo/>
            </div>
    );
  }
}

export default App;
