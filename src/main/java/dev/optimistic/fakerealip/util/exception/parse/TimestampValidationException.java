package dev.optimistic.fakerealip.util.exception.parse;

import dev.optimistic.fakerealip.util.exception.phase.HandshakeException;
import dev.optimistic.fakerealip.util.validation.timestamp.TimestampValidator;

/**
 * An exception thrown when a handshake packet failed timestamp validation
 */
public class TimestampValidationException extends HandshakeException {

	private final TimestampValidator timestampValidator;
	private final long timestamp;

	public TimestampValidationException(TimestampValidator timestampValidator, long timestamp) {
		super();

		this.timestampValidator = timestampValidator;
		this.timestamp = timestamp;
	}


	public TimestampValidator getTimestampValidator() {
		return timestampValidator;
	}

	public long getTimestamp() {
		return timestamp;
	}

}
