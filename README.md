# generatrix
Enhanced Property generators for Spock Genesis

## Supported Generators
### UUID
Generates Random Universal Unique Identifiers, supporting Verison 3 and version 4. This is mostly a thin wrapper around the random generation function built into `java.util.UUID`

## Planned Generators
* Missing gaps in Gen such as byte, boolean and float
* HTTP specific generators - allows generation or urls, headers, and other HTTP specific properties
* Bean generators - automatically generate beans using introspection and use of bean/validator annotations
* Builder generators - generates random objects using builders
* Type Determining - will find the right generator for the supplied type
* Java Time - generators for new Java time objects