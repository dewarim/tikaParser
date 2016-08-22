grails.servlet.version = "3.0"
grails.project.work.dir = 'target'
grails.project.dependency.resolver = "maven"
grails.project.target.level = 1.8
grails.project.source.level = 1.8
grails.project.dependency.resolution = {

    inherits("global") {
        excludes "xercesImpl", "xmlParserAPIs", "xml-apis", 'groovy'
    }
    log 'warn'

    repositories {
        mavenLocal()
        mavenCentral()
        grailsCentral()
    }

    dependencies {
        compile('org.apache.tika:tika-parsers:1.13')
    }

    plugins {
        compile (":release:3.1.1"){
            export = false
        }
        compile ":rest-client-builder:2.1.1"
        compile ":asset-pipeline:2.6.10"
    }
}
