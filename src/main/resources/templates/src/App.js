import React, { Component } from 'react';
import './App.css';
import config from './configuration/appconfig';
import ToDo from './containers/ToDo/ToDo';

class App extends Component {

    constructor() {
        super();

        var jsonEnvironment = process.env;
        for(var key in jsonEnvironment) {
            if(jsonEnvironment.hasOwnProperty(key))
            {
                console.log("Environment Variable : "+ key + " and Value is "+ jsonEnvironment[key]);
            }
        }

        for(var key1 in config) {
            if(config.hasOwnProperty(key1))
            {
                console.log("config Variable : "+ key1 + " and Value is "+ config[key1]);
            }
        }

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
