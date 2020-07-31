# tcp-listener

A simple listener for testing TCP connections. It's multithreaded, and can handle multiple connections at once.

## Latest Release

v1.1.0 [Download here](https://github.com/steveswinsburg/tcp-listener/releases/download/1.1.0/tcplistener.jar)

Once downloaded, see below on how to run and connect a client.

### Running

`java -jar tcplistener PORT1 PORT2 PORTn`

e.g. `java -jar tcplistener 49064 49065 49067 49068`

The server will start and wait for a connection on all ports specified.

Any data that is received on any connected port will be logged to the console.

To quit, type `Control+C`.

### Testing connections

You can test a connection via telnet by running `telnet localhost PORT`. Send some data and it will be displayed on screen.
You can hangup the telnet session by typing `Control+]` to get to the `telnet>` prompt, then type the `q` command.
You can hangup the entire server session by typing `Control+C`.

### Building from source

1. Clone this repo.
2. Run `mvn package`



