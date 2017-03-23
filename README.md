# Advanced Business Automation External
Contains the Front-End Client and the two permit services

## Permit Services
Both the structural and the electrical permit services execute from the same server.

### How to build & run
Run a `mvn clean install` on the `Permit Services` directory to build.
To start the build, run `java -jar target/gs-rest-service-0.1.0.jar`

### API
The electrical permit service is accessible from the `/electrical` endpoint, and the structural permit service is at the `/structural` endpoint.

| Methods |      Parameters      | Result |
| ------- | -------------------- | ------ |
| GET     | Integer id of Permit | Returns json that contains the id that was requested, and the current status. |
| POST    | -                    | Returns json that contains the id of the new permit, and the current status which should always be IN_PROCESS. |
| DELETE  | Integer id of Permit | -      |

The status of a permit can be any of the following:
- IN_PROGRESS
- APPROVED
- DENIED
