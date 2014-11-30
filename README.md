# tcp-listener

A simple listener for testing TCP connections. It's multithreaded, and can handle multiple connections at once.

## Latest Release

v1.0.0 [Download here](https://github.com/steveswinsburg/tcp-listener/releases/download/1.0.0/tcplistener.jar)

Once downloaded, see below on how to run and connect a client.

### Building

1. Clone this repo.
2. Run `mvn package`

### Running

`java -jar tcplistener PORT`

e.g. `java -jar tcplistener 8008`

The server will start and wait for a connection.

### Connecting clients

You can now telnet to the server by running `telnet localhost 8008`. Send some data and it will be displayed on screen.
You can hangup the telnet session by typing `Control+]` to get to the `telnet>` prompt, then type the `q` command.
You can hangup the server session by typing `Control+C`.




