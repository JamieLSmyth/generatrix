package net.mobiustesseract.generatrix.generators

import static spock.genesis.Gen.*
import spock.genesis.transform.Iterations
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll


class UUIDGeneratorSpec extends Specification
{
	@Subject UUIDGenerator generator

	@Iterations(10)
	@Unroll("#featureName when limit is #limit")
	def "Should generate random version 4 UUIDS"(int limit)
	{
		given: "a generator"
		generator = new UUIDGenerator()

		when: "generator is realized"
		def result = generator.take(limit).realized

		then: "contains same number of results as limit"
		result.size() == limit

		and: "all results are UUIDs version 4"
		result.each { uuid ->
			assert uuid in UUID
			assert uuid.version() == 4
		}

		and: "results are unique"
		//TODO this might not always be true which could cause this test to fail
		result == result.unique()

		where:
		limit << integer(1,1000)

	}
}