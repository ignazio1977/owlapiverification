package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.owlxml.parser.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_owlxml_parser {
    @Test
    public void enforceInterfacesOWLXMLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(OWLXMLParser.class));
    }

    public void verifyOWLXMLParser() throws OWLOntologyChangeException, UnloadableImportException, IOException {
        OWLXMLParser testSubject0 = new OWLXMLParser();
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result4 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result5 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesOWLXMLParserAttributeNotFoundException() {
        assertTrue(org.semanticweb.owlapi.owlxml.parser.OWLXMLParserException.class.isAssignableFrom(OWLXMLParserAttributeNotFoundException.class));
    }

    public void verifyOWLXMLParserAttributeNotFoundException() {
        OWLXMLParserAttributeNotFoundException testSubject0 = new OWLXMLParserAttributeNotFoundException(_OWLXMLParserHandler, _String);
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
    public void enforceInterfacesOWLXMLParserElementNotFoundException() {
        assertTrue(org.semanticweb.owlapi.owlxml.parser.OWLXMLParserException.class.isAssignableFrom(OWLXMLParserElementNotFoundException.class));
    }

    public void verifyOWLXMLParserElementNotFoundException() {
        OWLXMLParserElementNotFoundException testSubject0 = new OWLXMLParserElementNotFoundException(_OWLXMLParserHandler, _String);
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
    public void enforceInterfacesOWLXMLParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OWLXMLParserException.class));
    }

    public void verifyOWLXMLParserException() {
        OWLXMLParserException testSubject0 = new OWLXMLParserException(_OWLXMLParserHandler, _String);
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
    public void enforceInterfacesOWLXMLParserHandler() {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class.isAssignableFrom(OWLXMLParserHandler.class));
    }

    public void verifyOWLXMLParserHandler() throws SAXException, IOException {
        OWLXMLParserHandler testSubject0 = new OWLXMLParserHandler(_OWLOntology);
        OWLXMLParserHandler testSubject3 = new OWLXMLParserHandler(_OWLOntology, _OWLOntologyLoaderConfiguration);
        int result0 = testSubject0.getLineNumber();
        java.net.URI result1 = testSubject0.getBase();
        IRI result2 = testSubject0.getAbbreviatedIRI(_String);
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyLoaderConfiguration result4 = testSubject0.getConfiguration();
        IRI result5 = testSubject0.getIRI(_String);
        testSubject0.startElement(_String, _String, _String, _Attributes);
        OWLDataFactory result6 = testSubject0.getDataFactory();
        OWLOntologyManager result7 = testSubject0.getOWLOntologyManager();
        int result8 = testSubject0.getColumnNumber();
        java.util.Map<java.lang.String, java.lang.String> result9 = testSubject0.getPrefixName2PrefixMap();
        org.xml.sax.InputSource result10 = testSubject0.resolveEntity(_String, _String);
        testSubject0.setDocumentLocator(_Locator);
        testSubject0.startDocument();
        testSubject0.endDocument();
        testSubject0.startPrefixMapping(_String, _String);
        testSubject0.endElement(_String, _String, _String);
        testSubject0.characters(_char_array, _int, _int);
        testSubject0.error(_SAXParseException);
        testSubject0.notationDecl(_String, _String, _String);
        testSubject0.unparsedEntityDecl(_String, _String, _String, _String);
        testSubject0.endPrefixMapping(_String);
        testSubject0.ignorableWhitespace(_char_array, _int, _int);
        testSubject0.processingInstruction(_String, _String);
        testSubject0.skippedEntity(_String);
        testSubject0.fatalError(_SAXParseException);
        testSubject0.warning(_SAXParseException);
    }

    @Test
    public void enforceInterfacesPARSER_OWLXMLVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(PARSER_OWLXMLVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(PARSER_OWLXMLVocabulary.class));
    }

    public void verifyEnumPARSER_OWLXMLVocabulary() {
        PARSER_OWLXMLVocabulary testSubject0 = PARSER_OWLXMLVocabulary.PARSER_CLASS;
        PARSER_OWLXMLVocabulary testSubject1 = PARSER_OWLXMLVocabulary.PARSER_DATA_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject2 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject3 = PARSER_OWLXMLVocabulary.PARSER_NAMED_INDIVIDUAL;
        PARSER_OWLXMLVocabulary testSubject4 = PARSER_OWLXMLVocabulary.PARSER_ENTITY_ANNOTATION;
        PARSER_OWLXMLVocabulary testSubject5 = PARSER_OWLXMLVocabulary.PARSER_ANNOTATION_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject6 = PARSER_OWLXMLVocabulary.PARSER_DATATYPE;
        PARSER_OWLXMLVocabulary testSubject7 = PARSER_OWLXMLVocabulary.PARSER_ANNOTATION;
        PARSER_OWLXMLVocabulary testSubject8 = PARSER_OWLXMLVocabulary.PARSER_ANONYMOUS_INDIVIDUAL;
        PARSER_OWLXMLVocabulary testSubject9 = PARSER_OWLXMLVocabulary.PARSER_IMPORT;
        PARSER_OWLXMLVocabulary testSubject10 = PARSER_OWLXMLVocabulary.PARSER_ONTOLOGY;
        PARSER_OWLXMLVocabulary testSubject11 = PARSER_OWLXMLVocabulary.PARSER_LITERAL;
        PARSER_OWLXMLVocabulary testSubject12 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_INVERSE_OF;
        PARSER_OWLXMLVocabulary testSubject13 = PARSER_OWLXMLVocabulary.PARSER_DATA_COMPLEMENT_OF;
        PARSER_OWLXMLVocabulary testSubject14 = PARSER_OWLXMLVocabulary.PARSER_DATA_ONE_OF;
        PARSER_OWLXMLVocabulary testSubject15 = PARSER_OWLXMLVocabulary.PARSER_DATATYPE_RESTRICTION;
        PARSER_OWLXMLVocabulary testSubject16 = PARSER_OWLXMLVocabulary.PARSER_FACET_RESTRICTION;
        PARSER_OWLXMLVocabulary testSubject17 = PARSER_OWLXMLVocabulary.PARSER_DATA_UNION_OF;
        PARSER_OWLXMLVocabulary testSubject18 = PARSER_OWLXMLVocabulary.PARSER_DATA_INTERSECTION_OF;
        PARSER_OWLXMLVocabulary testSubject19 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_INTERSECTION_OF;
        PARSER_OWLXMLVocabulary testSubject20 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_UNION_OF;
        PARSER_OWLXMLVocabulary testSubject21 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_COMPLEMENT_OF;
        PARSER_OWLXMLVocabulary testSubject22 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_ONE_OF;
        PARSER_OWLXMLVocabulary testSubject23 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_SOME_VALUES_FROM;
        PARSER_OWLXMLVocabulary testSubject24 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_ALL_VALUES_FROM;
        PARSER_OWLXMLVocabulary testSubject25 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_HAS_SELF;
        PARSER_OWLXMLVocabulary testSubject26 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_HAS_VALUE;
        PARSER_OWLXMLVocabulary testSubject27 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_MIN_CARDINALITY;
        PARSER_OWLXMLVocabulary testSubject28 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_EXACT_CARDINALITY;
        PARSER_OWLXMLVocabulary testSubject29 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_MAX_CARDINALITY;
        PARSER_OWLXMLVocabulary testSubject30 = PARSER_OWLXMLVocabulary.PARSER_DATA_SOME_VALUES_FROM;
        PARSER_OWLXMLVocabulary testSubject31 = PARSER_OWLXMLVocabulary.PARSER_DATA_ALL_VALUES_FROM;
        PARSER_OWLXMLVocabulary testSubject32 = PARSER_OWLXMLVocabulary.PARSER_DATA_HAS_VALUE;
        PARSER_OWLXMLVocabulary testSubject33 = PARSER_OWLXMLVocabulary.PARSER_DATA_MIN_CARDINALITY;
        PARSER_OWLXMLVocabulary testSubject34 = PARSER_OWLXMLVocabulary.PARSER_DATA_EXACT_CARDINALITY;
        PARSER_OWLXMLVocabulary testSubject35 = PARSER_OWLXMLVocabulary.PARSER_DATA_MAX_CARDINALITY;
        PARSER_OWLXMLVocabulary testSubject36 = PARSER_OWLXMLVocabulary.PARSER_SUB_CLASS_OF;
        PARSER_OWLXMLVocabulary testSubject37 = PARSER_OWLXMLVocabulary.PARSER_EQUIVALENT_CLASSES;
        PARSER_OWLXMLVocabulary testSubject38 = PARSER_OWLXMLVocabulary.PARSER_DISJOINT_CLASSES;
        PARSER_OWLXMLVocabulary testSubject39 = PARSER_OWLXMLVocabulary.PARSER_DISJOINT_UNION;
        PARSER_OWLXMLVocabulary testSubject40 = PARSER_OWLXMLVocabulary.PARSER_UNION_OF;
        PARSER_OWLXMLVocabulary testSubject41 = PARSER_OWLXMLVocabulary.PARSER_SUB_OBJECT_PROPERTY_OF;
        PARSER_OWLXMLVocabulary testSubject42 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_PROPERTY_CHAIN;
        PARSER_OWLXMLVocabulary testSubject43 = PARSER_OWLXMLVocabulary.PARSER_EQUIVALENT_OBJECT_PROPERTIES;
        PARSER_OWLXMLVocabulary testSubject44 = PARSER_OWLXMLVocabulary.PARSER_DISJOINT_OBJECT_PROPERTIES;
        PARSER_OWLXMLVocabulary testSubject45 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_PROPERTY_DOMAIN;
        PARSER_OWLXMLVocabulary testSubject46 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_PROPERTY_RANGE;
        PARSER_OWLXMLVocabulary testSubject47 = PARSER_OWLXMLVocabulary.PARSER_INVERSE_OBJECT_PROPERTIES;
        PARSER_OWLXMLVocabulary testSubject48 = PARSER_OWLXMLVocabulary.PARSER_FUNCTIONAL_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject49 = PARSER_OWLXMLVocabulary.PARSER_INVERSE_FUNCTIONAL_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject50 = PARSER_OWLXMLVocabulary.PARSER_SYMMETRIC_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject51 = PARSER_OWLXMLVocabulary.PARSER_ASYMMETRIC_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject52 = PARSER_OWLXMLVocabulary.PARSER_REFLEXIVE_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject53 = PARSER_OWLXMLVocabulary.PARSER_IRREFLEXIVE_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject54 = PARSER_OWLXMLVocabulary.PARSER_TRANSITIVE_OBJECT_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject55 = PARSER_OWLXMLVocabulary.PARSER_SUB_DATA_PROPERTY_OF;
        PARSER_OWLXMLVocabulary testSubject56 = PARSER_OWLXMLVocabulary.PARSER_EQUIVALENT_DATA_PROPERTIES;
        PARSER_OWLXMLVocabulary testSubject57 = PARSER_OWLXMLVocabulary.PARSER_DISJOINT_DATA_PROPERTIES;
        PARSER_OWLXMLVocabulary testSubject58 = PARSER_OWLXMLVocabulary.PARSER_DATA_PROPERTY_DOMAIN;
        PARSER_OWLXMLVocabulary testSubject59 = PARSER_OWLXMLVocabulary.PARSER_DATA_PROPERTY_RANGE;
        PARSER_OWLXMLVocabulary testSubject60 = PARSER_OWLXMLVocabulary.PARSER_FUNCTIONAL_DATA_PROPERTY;
        PARSER_OWLXMLVocabulary testSubject61 = PARSER_OWLXMLVocabulary.PARSER_SAME_INDIVIDUAL;
        PARSER_OWLXMLVocabulary testSubject62 = PARSER_OWLXMLVocabulary.PARSER_DIFFERENT_INDIVIDUALS;
        PARSER_OWLXMLVocabulary testSubject63 = PARSER_OWLXMLVocabulary.PARSER_CLASS_ASSERTION;
        PARSER_OWLXMLVocabulary testSubject64 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_PROPERTY_ASSERTION;
        PARSER_OWLXMLVocabulary testSubject65 = PARSER_OWLXMLVocabulary.PARSER_DATA_PROPERTY_ASSERTION;
        PARSER_OWLXMLVocabulary testSubject66 = PARSER_OWLXMLVocabulary.PARSER_NEGATIVE_OBJECT_PROPERTY_ASSERTION;
        PARSER_OWLXMLVocabulary testSubject67 = PARSER_OWLXMLVocabulary.PARSER_NEGATIVE_DATA_PROPERTY_ASSERTION;
        PARSER_OWLXMLVocabulary testSubject68 = PARSER_OWLXMLVocabulary.PARSER_HAS_KEY;
        PARSER_OWLXMLVocabulary testSubject69 = PARSER_OWLXMLVocabulary.PARSER_DECLARATION;
        PARSER_OWLXMLVocabulary testSubject70 = PARSER_OWLXMLVocabulary.PARSER_ANNOTATION_ASSERTION;
        PARSER_OWLXMLVocabulary testSubject71 = PARSER_OWLXMLVocabulary.PARSER_ANNOTATION_PROPERTY_DOMAIN;
        PARSER_OWLXMLVocabulary testSubject72 = PARSER_OWLXMLVocabulary.PARSER_ANNOTATION_PROPERTY_RANGE;
        PARSER_OWLXMLVocabulary testSubject73 = PARSER_OWLXMLVocabulary.PARSER_SUB_ANNOTATION_PROPERTY_OF;
        PARSER_OWLXMLVocabulary testSubject74 = PARSER_OWLXMLVocabulary.PARSER_DATATYPE_DEFINITION;
        PARSER_OWLXMLVocabulary testSubject75 = PARSER_OWLXMLVocabulary.PARSER_IRI_ELEMENT;
        PARSER_OWLXMLVocabulary testSubject76 = PARSER_OWLXMLVocabulary.PARSER_ABBREVIATED_IRI_ELEMENT;
        PARSER_OWLXMLVocabulary testSubject77 = PARSER_OWLXMLVocabulary.PARSER_NODE_ID;
        PARSER_OWLXMLVocabulary testSubject78 = PARSER_OWLXMLVocabulary.PARSER_ANNOTATION_URI;
        PARSER_OWLXMLVocabulary testSubject79 = PARSER_OWLXMLVocabulary.PARSER_LABEL;
        PARSER_OWLXMLVocabulary testSubject80 = PARSER_OWLXMLVocabulary.PARSER_COMMENT;
        PARSER_OWLXMLVocabulary testSubject81 = PARSER_OWLXMLVocabulary.PARSER_DOCUMENTATION;
        PARSER_OWLXMLVocabulary testSubject82 = PARSER_OWLXMLVocabulary.PARSER_DATATYPE_FACET;
        PARSER_OWLXMLVocabulary testSubject83 = PARSER_OWLXMLVocabulary.PARSER_DATATYPE_IRI;
        PARSER_OWLXMLVocabulary testSubject84 = PARSER_OWLXMLVocabulary.PARSER_DATA_RANGE;
        PARSER_OWLXMLVocabulary testSubject85 = PARSER_OWLXMLVocabulary.PARSER_PREFIX;
        PARSER_OWLXMLVocabulary testSubject86 = PARSER_OWLXMLVocabulary.PARSER_NAME_ATTRIBUTE;
        PARSER_OWLXMLVocabulary testSubject87 = PARSER_OWLXMLVocabulary.PARSER_IRI_ATTRIBUTE;
        PARSER_OWLXMLVocabulary testSubject88 = PARSER_OWLXMLVocabulary.PARSER_ABBREVIATED_IRI_ATTRIBUTE;
        PARSER_OWLXMLVocabulary testSubject89 = PARSER_OWLXMLVocabulary.PARSER_CARDINALITY_ATTRIBUTE;
        PARSER_OWLXMLVocabulary testSubject90 = PARSER_OWLXMLVocabulary.PARSER_DL_SAFE_RULE;
        PARSER_OWLXMLVocabulary testSubject91 = PARSER_OWLXMLVocabulary.PARSER_BODY;
        PARSER_OWLXMLVocabulary testSubject92 = PARSER_OWLXMLVocabulary.PARSER_HEAD;
        PARSER_OWLXMLVocabulary testSubject93 = PARSER_OWLXMLVocabulary.PARSER_CLASS_ATOM;
        PARSER_OWLXMLVocabulary testSubject94 = PARSER_OWLXMLVocabulary.PARSER_DATA_RANGE_ATOM;
        PARSER_OWLXMLVocabulary testSubject95 = PARSER_OWLXMLVocabulary.PARSER_OBJECT_PROPERTY_ATOM;
        PARSER_OWLXMLVocabulary testSubject96 = PARSER_OWLXMLVocabulary.PARSER_DATA_PROPERTY_ATOM;
        PARSER_OWLXMLVocabulary testSubject97 = PARSER_OWLXMLVocabulary.PARSER_BUILT_IN_ATOM;
        PARSER_OWLXMLVocabulary testSubject98 = PARSER_OWLXMLVocabulary.PARSER_SAME_INDIVIDUAL_ATOM;
        PARSER_OWLXMLVocabulary testSubject99 = PARSER_OWLXMLVocabulary.PARSER_DIFFERENT_INDIVIDUALS_ATOM;
        PARSER_OWLXMLVocabulary testSubject100 = PARSER_OWLXMLVocabulary.PARSER_VARIABLE;
        PARSER_OWLXMLVocabulary testSubject101 = PARSER_OWLXMLVocabulary.PARSER_DESCRIPTION_GRAPH_RULE;
        java.lang.String result0 = testSubject0.getShortName();
        IRI result2 = testSubject0.getIRI();
    }

    private char[] _char_array;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.owlxml.parser.OWLXMLParserHandler _OWLXMLParserHandler;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
