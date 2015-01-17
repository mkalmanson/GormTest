package test

import org.codehaus.groovy.grails.web.json.JSONObject

/**
 * Created by myles on 1/17/15.
 */
class SubObject {
    def name
    def customProperty

    public SubObject(JSONObject obj) {
        obj.each {key, value ->
            this[key] = value
        }
        this.customProperty = "Something custom"
    }
}
