class TikaParserGrailsPlugin {

    def version = "1.3.0"
    def grailsVersion = "2.2 > *"
    def dependsOn = [:]
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]
    
    def title = "Apache Tika Plugin"
    def author = "Ingo Wiarda"
    def authorEmail = "ingo.wiarda@horner-project.eu"
    def description = 'This plugin bundles the Apache Tika along with a parser service.'

    def documentation = "http://grails.org/plugin/tikaParser"

    def license = 'APACHE'
    
    def organization = [ name: "Horner GmbH", url: "http://www.horner-project.de/" ]

    def issueManagement = [ system: "github", url: "https://github.com/dewarim/tikaParser/issues" ]

    def scm = [ url: "https://github.com/dewarim/tikaParser" ]

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }

    def onShutdown = { event ->
    }
}
