
var defaultURL = "localhost:8080"; // eslint-disable-line no-unused-vars


var defaultconfig = {
    message: "Message from Application"
}

var exportconfig= {};

if(process.env.REACT_APP_CONFIG_PROFILE === 'dev')
    exportconfig = Object.assign({}, defaultconfig, require('./app.config.dev'));
else if(process.env.REACT_APP_CONFIG_PROFILE === 'prod')
    exportconfig = Object.assign({}, defaultconfig, require('./app.config.prod'));
else if(process.env.REACT_APP_CONFIG_PROFILE === 'qa')
    exportconfig = Object.assign({}, defaultconfig, require('./app.config.qa'));

console.log(exportconfig);

module.exports = exportconfig;
