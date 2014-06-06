package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.rdfxml.parser.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.semanticweb.owlapi.rdf.syntax to org.semanticweb.owlapi.rdf.rdfxml.parser" })
public class Gen_org_semanticweb_owlapi_rdf_syntax {
    public void verifyInterfaceRDFConsumer() {
        RDFConsumer testSubject0 = mock(RDFConsumer.class);
        testSubject0.endModel();
        testSubject0.includeModel(_String, _String);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
    }

    @Test
    public void enforceInterfacesRDFParser() {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class.isAssignableFrom(RDFParser.class));
    }

    public void verifyRDFParser() throws SAXException, IOException {
        RDFParser testSubject0 = new RDFParser();
        testSubject0.parse(_InputSource, mock(RDFConsumer.class));
        testSubject0.error(_SAXParseException);
        testSubject0.setErrorHandler(_ErrorHandler);
        IRI result0 = testSubject0.getIRI(_String);
        testSubject0.startElement(_String, _String, _String, _Attributes);
        testSubject0.warning(_SAXParseException);
        testSubject0.setDocumentLocator(_Locator);
        testSubject0.startDocument();
        testSubject0.endDocument();
        testSubject0.endElement(_String, _String, _String);
        testSubject0.characters(_char_array, _int, _int);
        testSubject0.processingInstruction(_String, _String);
        testSubject0.fatalError(_SAXParseException);
        org.xml.sax.InputSource result1 = testSubject0.resolveEntity(_String, _String);
        testSubject0.notationDecl(_String, _String, _String);
        testSubject0.unparsedEntityDecl(_String, _String, _String, _String);
        testSubject0.startPrefixMapping(_String, _String);
        testSubject0.endPrefixMapping(_String);
        testSubject0.ignorableWhitespace(_char_array, _int, _int);
        testSubject0.skippedEntity(_String);
    }

    @Test
    public void enforceInterfacesRDFParserException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(RDFParserException.class));
    }

    private char[] _char_array;
    private int _int;
    private String _String;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.ErrorHandler _ErrorHandler;
    private org.xml.sax.InputSource _InputSource;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
