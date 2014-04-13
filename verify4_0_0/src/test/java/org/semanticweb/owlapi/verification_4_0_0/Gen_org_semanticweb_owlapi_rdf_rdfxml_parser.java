package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.rdfxml.parser.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rdf_rdfxml_parser {
    @Test
    public void enforceInterfacesDeprecatedVocabulary() {
    }

    @Test
    public void enforceInterfacesIRIProvider() {
    }

    public void verifyInterfaceIRIProvider() {
        IRIProvider testSubject0 = mock(IRIProvider.class);
        IRI result0 = testSubject0.getIRI(_String);
    }

    @Test
    public void enforceInterfacesLiteralTripleHandler() {
    }

    @Test
    public void enforceInterfacesLiteralTripleIterator() {
    }

    @Test
    public void enforceInterfacesMode() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(Mode.class));
    }

    public void verifyEnumMode() {
        Mode testSubject0 = Mode.STRICT;
        Mode testSubject1 = Mode.LAX;
    }

    @Test
    public void enforceInterfacesOptimisedListTranslator() {
    }

    @Test
    public void enforceInterfacesOWLRDFConsumer() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.parser.RDFConsumer.class.isAssignableFrom(OWLRDFConsumer.class));
        assertTrue(org.semanticweb.owlapi.util.AnonymousNodeChecker.class.isAssignableFrom(OWLRDFConsumer.class));
    }

    public void verifyOWLRDFConsumer() {
        OWLRDFConsumer testSubject0 = new OWLRDFConsumer(_OWLOntology, _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        OWLRDFConsumer testSubject1 = new OWLRDFConsumer(_OWLOntology, _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.formats.RDFOntologyFormat result0 = testSubject0.getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
        OWLOntology result1 = testSubject0.getOntology();
        boolean result2 = testSubject0.isAnonymousNode(_String);
        boolean result3 = testSubject0.isAnonymousNode(_IRI);
        boolean result4 = testSubject0.isAnonymousSharedNode(_String);
        OWLDataFactory result5 = testSubject0.getDataFactory();
        OWLOntologyManager result6 = testSubject0.getOWLOntologyManager();
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<OWLAnnotation> result7 = testSubject0.getPendingAnnotations();
        OWLAxiom result8 = testSubject0.getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        boolean result10 = testSubject0.isRestriction(_IRI);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<IRI> result11 = testSubject0.getAnnotatedSourceAnnotationMainNodes(_IRI);
        testSubject0.startModel(_IRI);
        boolean result12 = testSubject0.isParsedAllTriples();
        testSubject0.endModel();
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithLiteralValue(_IRI, _IRI, _String, _String, _IRI);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        testSubject0.statementWithResourceValue(_IRI, _IRI, _IRI);
        OWLEntity result13 = testSubject0.generateAndLogParseError(_EntityType, _IRI);
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OWLRDFXMLParserException.class));
    }

    public void verifyOWLRDFXMLParserException() {
        OWLRDFXMLParserException testSubject0 = new OWLRDFXMLParserException(_String);
        OWLRDFXMLParserException testSubject1 = new OWLRDFXMLParserException(_String, _Throwable);
        OWLRDFXMLParserException testSubject2 = new OWLRDFXMLParserException(_Throwable);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserMalformedNodeException() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.parser.OWLRDFXMLParserException.class.isAssignableFrom(OWLRDFXMLParserMalformedNodeException.class));
    }

    public void verifyOWLRDFXMLParserMalformedNodeException() {
        OWLRDFXMLParserMalformedNodeException testSubject0 = new OWLRDFXMLParserMalformedNodeException(_Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject1 = new OWLRDFXMLParserMalformedNodeException(_String, _Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject2 = new OWLRDFXMLParserMalformedNodeException(_String);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesRDFConstants() {
    }

    public void verifyInterfaceRDFConstants() {
        RDFConstants testSubject0 = mock(RDFConstants.class);
    }

    @Test
    public void enforceInterfacesRDFConsumer() {
    }

    public void verifyInterfaceRDFConsumer() {
        RDFConsumer testSubject0 = mock(RDFConsumer.class);
        testSubject0.startModel(_IRI);
        testSubject0.endModel();
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithLiteralValue(_IRI, _IRI, _String, _String, _IRI);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        testSubject0.statementWithResourceValue(_IRI, _IRI, _IRI);
    }

    @Test
    public void enforceInterfacesRDFParser() {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class.isAssignableFrom(RDFParser.class));
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.parser.IRIProvider.class.isAssignableFrom(RDFParser.class));
    }

    public void verifyRDFParser() throws SAXException, IOException {
        RDFParser testSubject0 = new RDFParser();
        testSubject0.verify(_boolean, _String);
        testSubject0.parse(_InputSource, _RDFConsumer);
        testSubject0.error(_SAXParseException);
        testSubject0.setErrorHandler(_ErrorHandler);
        testSubject0.pushState(_State);
        java.lang.String result0 = testSubject0.resolveIRI(_String);
        testSubject0.popState();
        IRI result1 = testSubject0.getIRI(_String);
        testSubject0.startElement(_String, _String, _String, _Attributes);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithResourceValue(_String, _String, _String, _String);
        testSubject0.setDocumentLocator(_Locator);
        testSubject0.startDocument();
        testSubject0.endDocument();
        testSubject0.endElement(_String, _String, _String);
        testSubject0.characters(_char_array, _int, _int);
        testSubject0.processingInstruction(_String, _String);
        testSubject0.fatalError(_SAXParseException);
        testSubject0.warning(_SAXParseException);
        org.xml.sax.InputSource result2 = testSubject0.resolveEntity(_String, _String);
        testSubject0.notationDecl(_String, _String, _String);
        testSubject0.unparsedEntityDecl(_String, _String, _String, _String);
        testSubject0.startPrefixMapping(_String, _String);
        testSubject0.endPrefixMapping(_String);
        testSubject0.ignorableWhitespace(_char_array, _int, _int);
        testSubject0.skippedEntity(_String);
    }

    @Test
    public void enforceInterfacesRDFParserException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(RDFParserException.class));
    }

    public void verifyRDFParserException() {
        RDFParserException testSubject0 = new RDFParserException(_String, _Locator);
        RDFParserException testSubject1 = new RDFParserException(_Exception, _String, _Locator);
        int result0 = testSubject0.getLineNumber();
        int result1 = testSubject0.getColumnNumber();
        java.lang.String result2 = testSubject0.getPublicId();
        java.lang.String result3 = testSubject0.getSystemId();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result4 = testSubject0.fillInStackTrace();
        java.lang.Throwable result5 = testSubject0.getCause();
        java.lang.Throwable result6 = testSubject0.initCause(_Throwable);
        java.lang.String result7 = testSubject0.getMessage();
        java.lang.String result8 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result9 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result10 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesRDFXMLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(RDFXMLParser.class));
    }

    public void verifyRDFXMLParser() throws OWLOntologyChangeException, UnloadableImportException, IOException {
        RDFXMLParser testSubject0 = new RDFXMLParser();
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result4 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result5 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesResourceTripleHandler() {
    }

    @Test
    public void enforceInterfacesResourceTripleIterator() {
    }

    @Test
    public void enforceInterfacesState() {
    }

    public void verifyInterfaceState() throws SAXException {
        State testSubject0 = mock(State.class);
        testSubject0.startElement(_String, _String, _String, _Attributes);
        testSubject0.endElement(_String, _String, _String);
        testSubject0.characters(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesTranslatedOntologyChangeException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(TranslatedOntologyChangeException.class));
    }

    public void verifyTranslatedOntologyChangeException() {
        TranslatedOntologyChangeException testSubject0 = new TranslatedOntologyChangeException(_OWLOntologyChangeException);
        OWLOntologyChangeException result0 = testSubject0.getCause();
        java.lang.Throwable result1 = testSubject0.getCause();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesTranslatedUnloadableImportException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(TranslatedUnloadableImportException.class));
    }

    public void verifyTranslatedUnloadableImportException() {
        TranslatedUnloadableImportException testSubject0 = new TranslatedUnloadableImportException(_UnloadableImportException);
        UnloadableImportException result0 = testSubject0.getCause();
        java.lang.Throwable result1 = testSubject0.getCause();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    public void verifyTranslators() {
        Translators testSubject0 = new Translators();
    }

    public void verifyTripleHandlers() {
        TripleHandlers testSubject0 = new TripleHandlers();
    }

    public void verifyTripleLogger() {
        TripleLogger testSubject0 = new TripleLogger(_PrefixManager);
        int result0 = testSubject0.count();
        testSubject0.justLog(_Object, _Object, _Object);
        testSubject0.justLog(_Object, _Object, _Object, _Object, _Object);
        testSubject0.logNumberOfTriples();
        testSubject0.logOntologyID(_OWLOntologyID);
        testSubject0.logTriple(_Object, _Object, _Object, _Object, _Object);
        testSubject0.logTriple(_Object, _Object, _Object);
    }

    public void verifyInterfaceTriplePatternMatcher() {
        TriplePatternMatcher testSubject0 = mock(TriplePatternMatcher.class);
        boolean result0 = testSubject0.matches(_OWLRDFConsumer, _IRI);
        OWLObject result1 = testSubject0.createObject(_OWLRDFConsumer);
    }

    private boolean _boolean;
    private char[] _char_array;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.Exception _Exception;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private org.semanticweb.owlapi.formats.RDFOntologyFormat _RDFOntologyFormat;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private EntityType<OWLEntity> _EntityType;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyChangeException _OWLOntologyChangeException;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private PrefixManager _PrefixManager;
    private UnloadableImportException _UnloadableImportException;
    private org.semanticweb.owlapi.rdf.rdfxml.parser.OWLRDFConsumer _OWLRDFConsumer;
    private org.semanticweb.owlapi.rdf.rdfxml.parser.RDFConsumer _RDFConsumer;
    private org.semanticweb.owlapi.rdf.rdfxml.parser.State _State;
    private org.semanticweb.owlapi.util.AnonymousNodeChecker _AnonymousNodeChecker;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.ErrorHandler _ErrorHandler;
    private org.xml.sax.InputSource _InputSource;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
