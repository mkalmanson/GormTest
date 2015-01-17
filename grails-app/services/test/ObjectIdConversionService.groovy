package test

import grails.converters.JSON
import grails.transaction.Transactional
import org.bson.types.ObjectId
import org.springframework.beans.factory.InitializingBean

import javax.annotation.PostConstruct

@Transactional
class ObjectIdConversionService {

    def convert(ObjectId id) {
        id.toString()
    }

}
