package test

import grails.transaction.Transactional
import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass

@Transactional
class QueryConversionService {
    def remoteObjectService

    def convert(Query query) {
        def result = createMap(query)

        // Could pass id or url into this
        result.remoteObject = remoteObjectService.getRemoteObject()
        result
    }

    def createMap(def domain) {
        def result = [:]
        domain.domainClass.properties.each { prop ->
            result[prop.name] = domain[prop.name]
        }
        result
    }
    def getRemote(remoteUrl) {
        return new RemoteObject(url: remoteUrl, name: "Test")
    }
}
