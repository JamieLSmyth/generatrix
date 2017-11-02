package net.mobiustesseract.generatrix.generators

import spock.genesis.generators.FactoryGenerator

/**
 * Generator of version 4 UUIDs
 */
class UUIDGenerator extends FactoryGenerator<UUID>
{
	/**
	 * Creates a generator of random version 4 UUIDs
	 */
	UUIDGenerator()
	{
		super({UUID.randomUUID()})
	}

}
