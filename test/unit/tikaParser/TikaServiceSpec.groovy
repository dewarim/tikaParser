package tikaParser

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * Test for tikaService: try to parse test data.
 */
@TestFor(TikaService)
class TikaServiceSpec extends Specification {

    def 'Parse a word file to XML'() {
        given:
        def file = new File('testdata/parserTest.doc')

        when:
        def xml = service.parseFile(file)

        then:
        def doc = new XmlSlurper().parseText(xml)
        doc.body.p.find{
            it.text() == 'This is a simple test document'
        }
    }
}
