package test

import webclient.Get

class RemoteObjectService {

    // Method is replaced by annotation
    @Get(type=RemoteObject, url="http://some.url")
    def getRemoteObject() {
    }

}
