package test

import grails.converters.JSON
import grails.test.GrailsUnitTestCase

/**
 * Created by myles on 1/17/15.
 */
class ParsingTest extends GrailsUnitTestCase {
    void testParsing() {
        String jsonString = """
{
  url: "adsfadf",
  name: "Some name",
  child: {
      name: "Child name"
      }

  }
"""
        def jsonObj = JSON.parse(jsonString)
        RemoteObject obj = new RemoteObject(jsonObj)
        println obj.url
        println obj.name
        println obj.child.name
        println obj.child.customProperty
        assert obj.url == jsonObj.url
        assert obj.name == jsonObj.name
        assert obj.child instanceof SubObject
        assert obj.child.name == "Child name"
        assert obj.child.customProperty == "Something custom"
    }
}
