package com.example.dgstut.datafetchers

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import org.springframework.data.jpa.repository.Query

@DgsComponent
class HelloDataFetcher {

    @DgsQuery
    fun hello(): String {
        return "hello"
    }
}