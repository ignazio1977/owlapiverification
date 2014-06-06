package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.semanticweb.owlapi.rdf.rdfxml.parser.*;
import org.semanticweb.owlapi.util.AnonymousNodeChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.rdfxml.parser to org.semanticweb.owlapi.rdf.rdfxml.parser", "class visibility: RDFXMLParser main public class",
        "Package change: from org.semanticweb.owlapi.io.RDFOntologyFormat to org.semanticweb.owlapi.formats.RDFOntologyFormat" })
public class Gen_org_coode_owlapi_rdfxml_parser {
    @Test
    public void enforceInterfacesAbstractResourceTripleHandler() {
        assertTrue(OWLParser.class.isAssignableFrom(RDFXMLParser.class));
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OWLRDFXMLParserException.class));
    }

    public void verifyOWLRDFXMLParserException() {
        OWLRDFXMLParserException testSubject0 = new OWLRDFXMLParserException(_String);
        OWLRDFXMLParserException testSubject1 = new OWLRDFXMLParserException(_String, _Throwable);
        OWLRDFXMLParserException testSubject2 = new OWLRDFXMLParserException(_Throwable);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    public void verifyOWLRDFXMLParserMalformedNodeException() {
        OWLRDFXMLParserMalformedNodeException testSubject0 = new OWLRDFXMLParserMalformedNodeException(_Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject1 = new OWLRDFXMLParserMalformedNodeException(_String, _Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject2 = new OWLRDFXMLParserMalformedNodeException(_String);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesRDFXMLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(RDFXMLParser.class));
    }

    @Test
    public void enforceInterfacesTranslatedOntologyChangeException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(TranslatedOntologyChangeException.class));
    }

    public void verifyInterfaceTriplePatternMatcher() {
        TriplePatternMatcher testSubject0 = mock(TriplePatternMatcher.class);
        boolean result0 = testSubject0.matches(_OWLRDFConsumer, _IRI);
        OWLObject result1 = testSubject0.createObject(_OWLRDFConsumer);
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private OWLRDFConsumer _OWLRDFConsumer;
    private IRI _IRI;
}
