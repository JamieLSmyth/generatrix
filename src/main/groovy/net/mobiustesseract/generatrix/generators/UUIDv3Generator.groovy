package net.mobiustesseract.generatrix.generators

import spock.genesis.generators.FactoryGenerator
import spock.genesis.generators.InfiniteGenerator

import static spock.genesis.Gen.getBytes

/**
 * A generator of random Version 3 UUIDs
 */
class UUIDv3Generator extends FactoryGenerator<UUID>
{
	/**
	 * Creates a generator of random version 3 UUIDs
	 */
	UUIDv3Generator()
	{
		this(bytes)
	}

	/**
	 * Creates a generator of version 3 UUIDs from a generator of byte[] names
	 * @param bytesGenerator generator of byte[]s used for the UUID name
	 */
	UUIDv3Generator(InfiniteGenerator<byte[]> bytesGenerator)
	{
		super({UUID.nameUUIDFromBytes(bytesGenerator.iterator().next())})
	}

}
