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
        compile('org.apache.tika:tika-parsers:1.7')
    }

    plugins {
        compile (":release:3.0.1"){
            export = false
        }
        compile ":rest-client-builder:2.0.4-SNAPSHOT"
        compile ":asset-pipeline:2.1.1"
    }
}
