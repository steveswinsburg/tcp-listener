/*
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2020).
 *
 * This document is copyright. Except for the purpose of fair reviewing, no part
 * of this publication may be reproduced or transmitted in any form or by any
 * means, electronic or mechanical, including photocopying, recording, or any
 * information storage and retrieval system, without permission in writing from
 * the publisher. Infringers of copyright render themselves liable for
 * prosecution.
 */
package io.github.steveswinsburg.tcplistener;

import java.util.EnumSet;
import java.util.Random;

/**
 * Colours for logging
 */
public enum Colour {

	ANSI_RESET("\\u001B[0m"),

	// reg background, white text
	ERROR("\u001B[41m\\u001B[37m"),

	// ANSI_BLACK("\u001B[30m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m");

    private final String code;

	Colour(final String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code;
    }

	// those which cannot be picked
	private static EnumSet<Colour> reserved = EnumSet.of(ANSI_RESET, ERROR);


	/**
	 * Get a random colour
	 *
	 * @return
	 */
	public static Colour getRandom() {


		final int rnd = new Random().nextInt(Colour.values().length);
		final Colour result = Colour.values()[rnd];

		if (reserved.contains(result)) {
			// try again
			return getRandom();
		}
		return result;
	}

}
