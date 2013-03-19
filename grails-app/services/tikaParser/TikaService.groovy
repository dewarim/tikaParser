package tikaParser

import org.apache.tika.config.TikaConfig
import org.apache.tika.metadata.Metadata
import org.apache.tika.parser.AutoDetectParser
import org.apache.tika.parser.ParseContext
import org.apache.tika.parser.Parser

import javax.xml.transform.OutputKeys
import javax.xml.transform.sax.SAXTransformerFactory
import javax.xml.transform.sax.TransformerHandler
import javax.xml.transform.stream.StreamResult

class TikaService {

    String parseFile(File file, TikaConfig tikaConfig, Metadata metadata){
        SAXTransformerFactory factory = (SAXTransformerFactory) SAXTransformerFactory.newInstance()
        TransformerHandler handler = factory.newTransformerHandler()
        handler.transformer.setOutputProperty(OutputKeys.METHOD, "xml")
        handler.transformer.setOutputProperty(OutputKeys.INDENT, "yes")

        StringWriter sw = new StringWriter()
        handler.result = new StreamResult(sw)

        Parser parser = new AutoDetectParser(tikaConfig)
        ParseContext pc = new ParseContext()
        try {
            parser.parse(new FileInputStream(file), handler, metadata, pc)
            return sw.toString()
        } catch (Exception e) {
            log.debug("Failed to parse file ${file.absolutePath}", e)
            throw new RuntimeException(e)
        }
    }
    
    String parseFile(File file){
        TikaConfig tikaConfig = new TikaConfig()
        Metadata tikaMeta = new Metadata()
        return parseFile(file, tikaConfig, tikaMeta)
    }
    
}
