# tcp-listener

A simple listener for testing TCP connections

### Building

1. Clone this repo.
2. Run `mvn package`

### Running

`java -jar tcplistener PORT`

e.g. `java -jar tcplistener 8008`

The server will start and wait for a connection.

### Connecting a client

You can now telnet to the server by running `telnet localhost 8008`. Send some data and it will be displayed on screen.
You can hangup the telnet session by typing `Control+]` to get to the `telnet>` prompt, then type the `q` command.
You can hangup the server session by typing `Control+C`.



