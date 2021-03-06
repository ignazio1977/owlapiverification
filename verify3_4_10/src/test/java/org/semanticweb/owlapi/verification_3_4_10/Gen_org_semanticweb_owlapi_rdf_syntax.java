package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.rdf.syntax.RDFConsumer;
import org.semanticweb.owlapi.rdf.syntax.RDFParser;
import org.semanticweb.owlapi.rdf.syntax.RDFParserException;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rdf_syntax {
    public void verifyInterfaceRDFConsumer() throws Exception {
        RDFConsumer testSubject0 = mock(RDFConsumer.class);
        testSubject0.startModel(_String);
        testSubject0.endModel();
        testSubject0.addModelAttribte(_String, _String);
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_String);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String,
                _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
    }

    @Test
    public void enforceInterfacesRDFParser() throws Exception {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class
                .isAssignableFrom(RDFParser.class));
        assertTrue(org.semanticweb.owlapi.rdf.util.RDFConstants.class
                .isAssignableFrom(RDFParser.class));
    }

    public void verifyRDFParser() throws Exception {
        RDFParser testSubject0 = new RDFParser();
        testSubject0.parse(_InputSource, _RDFConsumer);
        testSubject0.error(_SAXParseException);
        testSubject0.setErrorHandler(_ErrorHandler);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getIRI(_String);
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
    public void enforceInterfacesRDFParserException() throws Exception {
        assertTrue(org.xml.sax.SAXException.class
                .isAssignableFrom(RDFParserException.class));
    }

    public void verifyRDFParserException() throws Exception {
        RDFParserException testSubject0 = new RDFParserException(_String, _String,
                _String, _int, _int);
        RDFParserException testSubject1 = new RDFParserException(_String, _Locator);
        RDFParserException testSubject2 = new RDFParserException(_String);
        int result0 = testSubject0.getLineNumber();
        int result1 = testSubject0.getColumnNumber();
        java.lang.String result2 = testSubject0.getPublicId();
        java.lang.String result3 = testSubject0.getSystemId();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.String result5 = testSubject0.getMessage();
        java.lang.Exception result6 = testSubject0.getException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result7 = testSubject0.fillInStackTrace();
        java.lang.Throwable result8 = testSubject0.initCause(_Throwable);
        java.lang.String result9 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result10 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result11 = testSubject0.getSuppressed();
    }

    private char[] _char_array;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private org.semanticweb.owlapi.rdf.syntax.RDFConsumer _RDFConsumer;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.ErrorHandler _ErrorHandler;
    private org.xml.sax.InputSource _InputSource;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
