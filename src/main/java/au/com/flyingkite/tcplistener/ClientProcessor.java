/* 
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2014).
 * 
 * This document is copyright. Except for the purpose of fair reviewing, no part
 * of this publication may be reproduced or transmitted in any form or by any
 * means, electronic or mechanical, including photocopying, recording, or any
 * information storage and retrieval system, without permission in writing from
 * the publisher. Infringers of copyright render themselves liable for
 * prosecution.
 */
package au.com.flyingkite.tcplistener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Each client connection is handled in an instance of this
 */
public class ClientProcessor implements Runnable {

	Socket client;
	int id;

	public ClientProcessor(final int id, final Socket client) {
		this.client = client;
		this.id = id;
	}

	@Override
	public void run() {

		try {
			// read lines from the client
			final BufferedReader reader = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("[" + this.id + "] " + line);
			}

			disconnect();

		} catch (final IOException e) {
			System.err.println("Error in client processor: " + e);
		}

	}

	/**
	 * Called when disconnecting
	 * 
	 * @throws IOException
	 */
	private void disconnect() throws IOException {
		System.out.println("Client " + this.id + " disconnected");
		this.client.close();
	}

}
