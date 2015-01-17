import grails.converters.JSON
import grails.util.Holders
import org.bson.types.ObjectId
import test.Query

/**
 * Created by myles on 1/16/15.
 */
class CustomMarshallerRegistrar {
    def conversionMap = [
            (ObjectId): "objectIdConversionService",
            (Query): 'queryConversionService'
    ]
    @javax.annotation.PostConstruct
    void registerMarshallers() {
        conversionMap.each { type, serviceName ->
            println(type)
            JSON.registerObjectMarshaller(type) {
                println serviceName
                def service = Holders.grailsApplication.mainContext[serviceName]
                service.convert(it)
            }

        }

    }

    def objectIdMarshaller = { src ->

    }
}
