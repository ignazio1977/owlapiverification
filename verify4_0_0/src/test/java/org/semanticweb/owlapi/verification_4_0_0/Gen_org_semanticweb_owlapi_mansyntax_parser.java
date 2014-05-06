package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.mansyntax.parser.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_mansyntax_parser {
    @Test
    public void enforceInterfacesManchesterOWLSyntax() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(ManchesterOWLSyntax.class));
    }

    public void verifyEnumManchesterOWLSyntax() {
        ManchesterOWLSyntax testSubject0 = ManchesterOWLSyntax.VALUE_PARTITION;
        ManchesterOWLSyntax testSubject1 = ManchesterOWLSyntax.DASH;
        ManchesterOWLSyntax testSubject2 = ManchesterOWLSyntax.OPEN;
        ManchesterOWLSyntax testSubject3 = ManchesterOWLSyntax.CLOSE;
        ManchesterOWLSyntax testSubject4 = ManchesterOWLSyntax.OPENBRACE;
        ManchesterOWLSyntax testSubject5 = ManchesterOWLSyntax.CLOSEBRACE;
        ManchesterOWLSyntax testSubject6 = ManchesterOWLSyntax.OPENBRACKET;
        ManchesterOWLSyntax testSubject7 = ManchesterOWLSyntax.CLOSEBRACKET;
        ManchesterOWLSyntax testSubject8 = ManchesterOWLSyntax.ONTOLOGY;
        ManchesterOWLSyntax testSubject9 = ManchesterOWLSyntax.IMPORT;
        ManchesterOWLSyntax testSubject10 = ManchesterOWLSyntax.PREFIX;
        ManchesterOWLSyntax testSubject11 = ManchesterOWLSyntax.CLASS;
        ManchesterOWLSyntax testSubject12 = ManchesterOWLSyntax.OBJECT_PROPERTY;
        ManchesterOWLSyntax testSubject13 = ManchesterOWLSyntax.CHAIN_IMPLY;
        ManchesterOWLSyntax testSubject14 = ManchesterOWLSyntax.CHAIN_CONNECT;
        ManchesterOWLSyntax testSubject15 = ManchesterOWLSyntax.DATA_PROPERTY;
        ManchesterOWLSyntax testSubject16 = ManchesterOWLSyntax.INDIVIDUAL;
        ManchesterOWLSyntax testSubject17 = ManchesterOWLSyntax.DATATYPE;
        ManchesterOWLSyntax testSubject18 = ManchesterOWLSyntax.ANNOTATION_PROPERTY;
        ManchesterOWLSyntax testSubject19 = ManchesterOWLSyntax.SOME;
        ManchesterOWLSyntax testSubject20 = ManchesterOWLSyntax.ONLY;
        ManchesterOWLSyntax testSubject21 = ManchesterOWLSyntax.ONLYSOME;
        ManchesterOWLSyntax testSubject22 = ManchesterOWLSyntax.MIN;
        ManchesterOWLSyntax testSubject23 = ManchesterOWLSyntax.MAX;
        ManchesterOWLSyntax testSubject24 = ManchesterOWLSyntax.EXACTLY;
        ManchesterOWLSyntax testSubject25 = ManchesterOWLSyntax.VALUE;
        ManchesterOWLSyntax testSubject26 = ManchesterOWLSyntax.AND;
        ManchesterOWLSyntax testSubject27 = ManchesterOWLSyntax.OR;
        ManchesterOWLSyntax testSubject28 = ManchesterOWLSyntax.NOT;
        ManchesterOWLSyntax testSubject29 = ManchesterOWLSyntax.INVERSE;
        ManchesterOWLSyntax testSubject30 = ManchesterOWLSyntax.INV;
        ManchesterOWLSyntax testSubject31 = ManchesterOWLSyntax.SELF;
        ManchesterOWLSyntax testSubject32 = ManchesterOWLSyntax.THAT;
        ManchesterOWLSyntax testSubject33 = ManchesterOWLSyntax.FACET_RESTRICTION_SEPARATOR;
        ManchesterOWLSyntax testSubject34 = ManchesterOWLSyntax.SUBCLASS_OF;
        ManchesterOWLSyntax testSubject35 = ManchesterOWLSyntax.SUPERCLASS_OF;
        ManchesterOWLSyntax testSubject36 = ManchesterOWLSyntax.EQUIVALENT_TO;
        ManchesterOWLSyntax testSubject37 = ManchesterOWLSyntax.EQUIVALENT_CLASSES;
        ManchesterOWLSyntax testSubject38 = ManchesterOWLSyntax.EQUIVALENT_PROPERTIES;
        ManchesterOWLSyntax testSubject39 = ManchesterOWLSyntax.DISJOINT_WITH;
        ManchesterOWLSyntax testSubject40 = ManchesterOWLSyntax.INDIVIDUALS;
        ManchesterOWLSyntax testSubject41 = ManchesterOWLSyntax.DISJOINT_CLASSES;
        ManchesterOWLSyntax testSubject42 = ManchesterOWLSyntax.DISJOINT_PROPERTIES;
        ManchesterOWLSyntax testSubject43 = ManchesterOWLSyntax.DISJOINT_UNION_OF;
        ManchesterOWLSyntax testSubject44 = ManchesterOWLSyntax.FACTS;
        ManchesterOWLSyntax testSubject45 = ManchesterOWLSyntax.SAME_AS;
        ManchesterOWLSyntax testSubject46 = ManchesterOWLSyntax.SAME_INDIVIDUAL;
        ManchesterOWLSyntax testSubject47 = ManchesterOWLSyntax.DIFFERENT_FROM;
        ManchesterOWLSyntax testSubject48 = ManchesterOWLSyntax.DIFFERENT_INDIVIDUALS;
        ManchesterOWLSyntax testSubject49 = ManchesterOWLSyntax.MIN_INCLUSIVE_FACET;
        ManchesterOWLSyntax testSubject50 = ManchesterOWLSyntax.MAX_INCLUSIVE_FACET;
        ManchesterOWLSyntax testSubject51 = ManchesterOWLSyntax.MIN_EXCLUSIVE_FACET;
        ManchesterOWLSyntax testSubject52 = ManchesterOWLSyntax.MAX_EXCLUSIVE_FACET;
        ManchesterOWLSyntax testSubject53 = ManchesterOWLSyntax.ONE_OF_DELIMETER;
        ManchesterOWLSyntax testSubject54 = ManchesterOWLSyntax.TYPES;
        ManchesterOWLSyntax testSubject55 = ManchesterOWLSyntax.TYPE;
        ManchesterOWLSyntax testSubject56 = ManchesterOWLSyntax.ANNOTATIONS;
        ManchesterOWLSyntax testSubject57 = ManchesterOWLSyntax.COMMA;
        ManchesterOWLSyntax testSubject58 = ManchesterOWLSyntax.DOMAIN;
        ManchesterOWLSyntax testSubject59 = ManchesterOWLSyntax.RANGE;
        ManchesterOWLSyntax testSubject60 = ManchesterOWLSyntax.CHARACTERISTICS;
        ManchesterOWLSyntax testSubject61 = ManchesterOWLSyntax.FUNCTIONAL;
        ManchesterOWLSyntax testSubject62 = ManchesterOWLSyntax.INVERSE_FUNCTIONAL;
        ManchesterOWLSyntax testSubject63 = ManchesterOWLSyntax.SYMMETRIC;
        ManchesterOWLSyntax testSubject64 = ManchesterOWLSyntax.TRANSITIVE;
        ManchesterOWLSyntax testSubject65 = ManchesterOWLSyntax.REFLEXIVE;
        ManchesterOWLSyntax testSubject66 = ManchesterOWLSyntax.IRREFLEXIVE;
        ManchesterOWLSyntax testSubject67 = ManchesterOWLSyntax.LITERAL_TRUE;
        ManchesterOWLSyntax testSubject68 = ManchesterOWLSyntax.LITERAL_FALSE;
        ManchesterOWLSyntax testSubject69 = ManchesterOWLSyntax.LITERAL_INTEGER;
        ManchesterOWLSyntax testSubject70 = ManchesterOWLSyntax.LITERAL_FLOAT;
        ManchesterOWLSyntax testSubject71 = ManchesterOWLSyntax.LITERAL_DOUBLE;
        ManchesterOWLSyntax testSubject72 = ManchesterOWLSyntax.LITERAL_LITERAL;
        ManchesterOWLSyntax testSubject73 = ManchesterOWLSyntax.LITERAL_LIT_DATATYPE;
        ManchesterOWLSyntax testSubject74 = ManchesterOWLSyntax.LITERAL_LIT_LANG;
        ManchesterOWLSyntax testSubject75 = ManchesterOWLSyntax.ANTI_SYMMETRIC;
        ManchesterOWLSyntax testSubject76 = ManchesterOWLSyntax.ASYMMETRIC;
        ManchesterOWLSyntax testSubject77 = ManchesterOWLSyntax.INVERSE_OF;
        ManchesterOWLSyntax testSubject78 = ManchesterOWLSyntax.INVERSES;
        ManchesterOWLSyntax testSubject79 = ManchesterOWLSyntax.SUB_PROPERTY_OF;
        ManchesterOWLSyntax testSubject80 = ManchesterOWLSyntax.SUPER_PROPERTY_OF;
        ManchesterOWLSyntax testSubject81 = ManchesterOWLSyntax.SUB_PROPERTY_CHAIN;
        ManchesterOWLSyntax testSubject82 = ManchesterOWLSyntax.HAS_KEY;
        ManchesterOWLSyntax testSubject83 = ManchesterOWLSyntax.RULE;
        boolean result0 = testSubject0.matches(_String);
        boolean result1 = testSubject0.matches(_String, _String);
        org.semanticweb.owlapi.mansyntax.parser.ManchesterOWLSyntax result2 = ManchesterOWLSyntax.parse(_String);
        java.lang.String result3 = testSubject0.keyword();
        boolean result4 = testSubject0.isFrameKeyword();
        boolean result5 = testSubject0.isSectionKeyword();
        boolean result6 = testSubject0.isAxiomKeyword();
        boolean result7 = testSubject0.isClassExpressionConnectiveKeyword();
        boolean result8 = testSubject0.isClassExpressionQuantiferKeyword();
        boolean result9 = testSubject0.matchesEitherForm(_String);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxClassExpressionParser() {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class.isAssignableFrom(ManchesterOWLSyntaxClassExpressionParser.class));
    }

    public void verifyManchesterOWLSyntaxClassExpressionParser() {
        ManchesterOWLSyntaxClassExpressionParser testSubject0 = new ManchesterOWLSyntaxClassExpressionParser(_OWLDataFactory, _OWLEntityChecker);
        java.lang.Object result0 = testSubject0.parse(_String);
        OWLClassExpression result1 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxClassFrameParser() {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class.isAssignableFrom(ManchesterOWLSyntaxClassFrameParser.class));
    }

    public void verifyManchesterOWLSyntaxClassFrameParser() {
        ManchesterOWLSyntaxClassFrameParser testSubject0 = new ManchesterOWLSyntaxClassFrameParser(_OWLDataFactory, _OWLEntityChecker);
        java.lang.Object result0 = testSubject0.parse(_String);
        java.util.Set<org.semanticweb.owlapi.util.OntologyAxiomPair> result1 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxEditorParser() {
        assertTrue(org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser.class.isAssignableFrom(ManchesterOWLSyntaxEditorParser.class));
    }

    public void verifyManchesterOWLSyntaxEditorParser() {
        ManchesterOWLSyntaxEditorParser testSubject0 = new ManchesterOWLSyntaxEditorParser(_OWLDataFactory, _String);
        ManchesterOWLSyntaxEditorParser testSubject1 = new ManchesterOWLSyntaxEditorParser(_OWLOntologyLoaderConfiguration, _OWLDataFactory, _String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
        java.util.Set<org.semanticweb.owlapi.util.OntologyAxiomPair> result0 = testSubject0.parseFrames();
        testSubject0.setDefaultOntology(_OWLOntology);
        java.util.List<OWLObjectPropertyExpression> result1 = testSubject0.parseObjectPropertyChain();
        OWLAxiom result2 = testSubject0.parseAxiom();
        OWLClassExpression result3 = testSubject0.parseClassExpression();
        java.util.Set<org.semanticweb.owlapi.util.OntologyAxiomPair> result4 = testSubject0.parseClassFrameEOF();
        OWLLiteral result5 = testSubject0.parseLiteral(_OWLDatatype);
        testSubject0.setOWLOntologyChecker(_OWLOntologyChecker);
        org.semanticweb.owlapi.formats.ManchesterOWLSyntaxOntologyFormat result6 = testSubject0.parseOntology(_OWLOntology);
        java.util.Set<OWLClassExpression> result7 = testSubject0.parseClassExpressionList();
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0.parseObjectPropertyList();
        OWLDataRange result9 = testSubject0.parseDataRange();
        java.util.Set<OWLPropertyExpression> result10 = testSubject0.parsePropertyList();
        java.util.List<org.semanticweb.owlapi.util.OntologyAxiomPair> result11 = testSubject0.parseRuleFrame();
        IRI result12 = testSubject0.parseVariable();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxFramesParser() {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class.isAssignableFrom(ManchesterOWLSyntaxFramesParser.class));
    }

    public void verifyManchesterOWLSyntaxFramesParser() {
        ManchesterOWLSyntaxFramesParser testSubject0 = new ManchesterOWLSyntaxFramesParser(_OWLDataFactory, _OWLEntityChecker);
        java.util.Set<org.semanticweb.owlapi.util.OntologyAxiomPair> result0 = testSubject0.parse(_String);
        java.lang.Object result1 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
        testSubject0.setDefaultOntology(_OWLOntology);
        testSubject0.setOWLOntologyChecker(_OWLOntologyChecker);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxInlineAxiomParser() {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class.isAssignableFrom(ManchesterOWLSyntaxInlineAxiomParser.class));
    }

    public void verifyManchesterOWLSyntaxInlineAxiomParser() {
        ManchesterOWLSyntaxInlineAxiomParser testSubject0 = new ManchesterOWLSyntaxInlineAxiomParser(_OWLDataFactory, _OWLEntityChecker);
        java.lang.Object result0 = testSubject0.parse(_String);
        OWLAxiom result1 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyManchesterOWLSyntaxOntologyHeader() {
        ManchesterOWLSyntaxOntologyHeader testSubject0 = new ManchesterOWLSyntaxOntologyHeader(_IRI, _IRI, _Set, _Set9);
        java.util.Collection<OWLAnnotation> result0 = testSubject0.getAnnotations();
        OWLOntologyID result1 = testSubject0.getOntologyID();
        java.util.Collection<OWLImportsDeclaration> result2 = testSubject0.getImportsDeclarations();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(ManchesterOWLSyntaxOntologyParser.class));
    }

    public void verifyManchesterOWLSyntaxOntologyParser() throws OWLOntologyChangeException, UnloadableImportException, IOException {
        ManchesterOWLSyntaxOntologyParser testSubject0 = new ManchesterOWLSyntaxOntologyParser();
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result4 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result5 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(ManchesterOWLSyntaxParserException.class));
    }

    public void verifyManchesterOWLSyntaxParserException() {
        ManchesterOWLSyntaxParserException testSubject0 = new ManchesterOWLSyntaxParserException(_String, _int, _int);
        ManchesterOWLSyntaxParserException testSubject1 = new ManchesterOWLSyntaxParserException(_String, _Throwable, _int, _int);
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

    public void verifyManchesterOWLSyntaxTokenizer() {
        ManchesterOWLSyntaxTokenizer testSubject0 = new ManchesterOWLSyntaxTokenizer(_String);
        boolean result0 = ManchesterOWLSyntaxTokenizer.eof(_String);
        java.util.List<org.semanticweb.owlapi.mansyntax.parser.ManchesterOWLSyntaxTokenizer.Token> result1 = testSubject0.tokenize();
    }

    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Set<OWLAnnotation> _Set;
    private java.util.Set<OWLImportsDeclaration> _Set9;
    private org.semanticweb.owlapi.expression.OWLEntityChecker _OWLEntityChecker;
    private org.semanticweb.owlapi.expression.OWLOntologyChecker _OWLOntologyChecker;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private IRI _IRI;
    private OWLDataFactory _OWLDataFactory;
    private OWLDatatype _OWLDatatype;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
