
var defaultconfig = {}

var exportconfig = Object.assign({}, defaultconfig, process.env);

/*

var defaultURL = "localhost:8080"; // eslint-disable-line no-unused-vars


var defaultconfig = {
    message: "Message from Application"
}

var exportconfig= {};


if(process.env.REACT_APP_CONFIG_PROFILE === 'dev')
    exportconfig = Object.assign({}, defaultconfig, require('./app.config.dev'), process.env);
else if(process.env.REACT_APP_CONFIG_PROFILE === 'prod')
    exportconfig = Object.assign({}, defaultconfig, require('./app.config.prod'), process.env);
else if(process.env.REACT_APP_CONFIG_PROFILE === 'qa')
    exportconfig = Object.assign({}, defaultconfig, require('./app.config.qa'), process.env);


Sample app.config.dev.js file to put in the same folder.
Not taking this approach because we want to run react app along with Spring Boot app.
so reading the propertiess
module.exports = {

    message: "dev environment.",
    baseurl: "http://localhost:8080/dev"

}
 */

module.exports = exportconfig;
