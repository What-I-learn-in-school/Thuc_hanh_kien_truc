# Node.js + MongoDB Application

This project is a simple Node.js application that connects to a MongoDB database. It demonstrates how to set up a REST API using Express and Mongoose, and it is containerized using Docker.

## Project Structure

```
node-mongo-app
├── src
│   ├── app.js               # Entry point of the application
│   ├── routes
│   │   └── index.js         # Defines application routes
│   ├── controllers
│   │   └── index.js         # Contains business logic for routes
│   └── models
│       └── exampleModel.js   # Mongoose model for MongoDB
├── Dockerfile                # Dockerfile for building the Node.js application
├── docker-compose.yml        # Docker Compose file for defining services
├── package.json              # npm configuration file
├── package-lock.json         # Locks versions of dependencies
└── README.md                 # Documentation for the project
```

## Getting Started

### Prerequisites

- Docker
- Docker Compose

### Installation

1. Clone the repository:

   ```
   git clone <repository-url>
   cd node-mongo-app
   ```

2. Build and run the application using Docker Compose:

   ```
   docker-compose up --build
   ```

### Usage

Once the application is running, you can access the API at `http://localhost:3000`. You can use tools like Postman or curl to interact with the API.

### API Endpoints

- `GET /api/example` - Retrieve all examples
- `POST /api/example` - Create a new example

### Stopping the Application

To stop the application, press `Ctrl + C` in the terminal where Docker Compose is running. You can also run:

```
docker-compose down
```

### License

This project is licensed under the MIT License.