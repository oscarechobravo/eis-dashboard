# EIS Quality Assurance Dashboard

<img align="right" height="180"  src="http://cdn-edu.wpmhost.net/53544f/707f375833/72C5-6F0E-57A0-5A9A-0718.jpg"/>

The Energy Information System (EIS) Quality Assurance Dashboard is designed to facilitate experts at Lancaster University. These experts include building managers and energy managers, as well as others who wish to gain knowledge of data quality performance. To achieve this, the frontend Node-RED application displays error information to the end users, who can make informed decisions for system maintenance and product quality reports. This system is supported by the backend Java application; found [here](https://github.com/rossnewby/eis-dashboard-backend).

## Getting Started

A detailed explination of how to import and run the Node-RED flows can be found in the [Wiki](https://github.com/oscarechobravo/eis-dashboard/wiki/Setting-up-the-Flows)

### Installation

Full Node-RED 'Getting Started' Documentation can be found [here](https://nodered.org/#get-started). For most users, simply [installing Node.js](https://nodejs.org/en/) before running `npm install -g --unsafe-perm node-red` in the command line, will install Node-RED. Node-RED can be run by entering `node-red` into the command line, then navigating to [localhost:1880](http://127.0.0.1:1880) in your browser.

### Dependencies

EIS Dashboard is dependant on the following node red packages, which can be installed from the browser GUI through `Menu > Manage Palette > Install > <Insert-Package-Name> > Click Install` or through the command line via` npm insall <package-name>`.

- Node-RED Dashboard: [node-red-dashboard](https://www.npmjs.com/package/node-red-dashboard)
- MySQL for Node-RED: [node-red-node-mysql](https://www.npmjs.com/package/node-red-node-mysql)

### Importing Flows

To import the Node-RED flows from this git repository copy the JSON text and import it into the GUI using `Menu > Import > Clipboard > Paste Text (Ctrl+V) > Click Import`.

## Authors

- **Ross Newby** - *Initial Work* - [rossnewby](https://github.com/rossnewby)
- **Oliver Bates** - *Project Support* - [oscarechobravo](https://github.com/oscarechobravo)

See also the list of [contributors](https://github.com/oscarechobravo/eis-dashboard/contributors) who participated in this project.
