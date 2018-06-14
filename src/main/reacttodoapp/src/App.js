import React, { Component } from 'react';
import './App.css';
import config from './configuration/appconfig';
import ToDo from './containers/ToDo/ToDo';

class App extends Component {

    constructor() {
        super();
        console.log("REACT_APP_RANDOM "+ process.env.REACT_APP_RANDOM);
        console.log("REACT_APP_CONFIG_ENV is "+ process.env.REACT_APP_CONFIG_ENV);
        console.log(config.message);
        console.log(config.baseurl);
    }

  render() {
        return (
            <div className="App" >
                <h1>React To Do App</h1>
                <ToDo/>
            </div>
    );
  }
}

export default App;
