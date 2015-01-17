package test

import grails.rest.Resource
import org.bson.types.ObjectId

@Resource(uri="/queries")
class Query {
    ObjectId id
    String name
    String remoteUrl
    List<Workflow> workflows

    static mapping = {
        collection "queries"
    }
    static embedded = ['workflows']
    static namedQueries = {
    }
    static constraints = {
    }
}
