package org.apache.tinkerpop.gremlin.ogm.exceptions

internal class EmptyListTokenIsReserved(
        emptyListToken: String
) : ClientException(
        description = "Encountered a property value that is equal to a value that is reserved by the " +
                "library: $emptyListToken. This should never happen since the empty list token is a UUID."
)
