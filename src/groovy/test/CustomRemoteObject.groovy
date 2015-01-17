package test

import org.codehaus.groovy.grails.web.json.JSONObject

/**
 * Created by myles on 1/17/15.
 */
class CustomRemoteObject extends RemoteObject{

    def otherProperty
    public CustomRemoteObject(JSONObject jsonObject) {
        super.(jsonObject)
        otherProperty = "Something custom"
    }
}
