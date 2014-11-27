package au.com.flyingkite.tcplistener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A simple listener for testing TCP connections
 * 
 * Usage: java -jar TcpListener
 */
public class TcpListener {

	public static void main(final String args[]) throws Exception {

		if (args.length == 0) {
			printUsage();
			return;
		}

		final int port = Integer.parseInt(args[0]);
		final ServerSocket server = new ServerSocket(port);
		System.out.println("Listening on port " + port);

		while (true) {

			System.out.println("Waiting on connection");

			final Socket client = server.accept(); // will block until receives connection
			System.out.println("Client connected");

			final BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println(reader.readLine());
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			System.out.println("Client disconnected");
			reader.close();
		}

	}

	private static void printUsage() {
		System.out.println("Usage: java -jar TcpListener PORT");
	}

}
