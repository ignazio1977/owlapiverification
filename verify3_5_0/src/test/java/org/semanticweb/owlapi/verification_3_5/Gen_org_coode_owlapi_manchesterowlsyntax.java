package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Set;

import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntax;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxClassExpressionParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxClassFrameParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxEditorParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxFramesParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxInlineAxiomParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxOntologyFormat;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxOntologyHeader;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxOntologyParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxParser;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxParserException;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxParserFactory;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxTokenizer;
import org.coode.owlapi.manchesterowlsyntax.OntologyAxiomPair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.OWLOntologyChecker;
import org.semanticweb.owlapi.expression.ParserException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_manchesterowlsyntax {

    @Test
    public void enforceInterfacesManchesterOWLSyntaxEditorParser() {
        assertTrue(ManchesterOWLSyntaxParser.class
                .isAssignableFrom(ManchesterOWLSyntaxEditorParser.class));
    }

    public void verifyInterfaceManchesterOWLSyntaxParser()
            throws ParserException, UnloadableImportException {
        ManchesterOWLSyntaxParser testSubject0 = mock(ManchesterOWLSyntaxParser.class);
        OWLAxiom testSubject1 = testSubject0.parseAxiom();
        OWLClassExpression testSubject2 = testSubject0.parseClassExpression();
        Set<OntologyAxiomPair> testSubject3 = testSubject0.parseClassFrameEOF();
        OWLLiteral testSubject4 = testSubject0
                .parseLiteral(mock(OWLDatatype.class));
        OWLLiteral testSubject15 = testSubject0.parseConstant();
        testSubject0.setOWLEntityChecker(mock(OWLEntityChecker.class));
        testSubject0.setOWLOntologyChecker(mock(OWLOntologyChecker.class));
        List<OWLObjectPropertyExpression> testSubject5 = testSubject0
                .parseObjectPropertyChain();
        ManchesterOWLSyntaxOntologyFormat testSubject6 = testSubject0
                .parseOntology(mock(OWLOntology.class));
        Set<OWLClassExpression> testSubject7 = testSubject0
                .parseClassExpressionList();
        Set<OWLObjectPropertyExpression> testSubject8 = testSubject0
                .parseObjectPropertyList();
        Set<OWLClassExpression> testSubject9 = testSubject0
                .parseClassExpressionList(false);
        OWLClassAxiom testSubject10 = testSubject0.parseClassAxiom();
        OWLDataRange testSubject11 = testSubject0.parseDataRange();
        Set<OWLPropertyExpression<?, ?>> testSubject12 = testSubject0
                .parsePropertyList();
        List<OntologyAxiomPair> testSubject13 = testSubject0.parseRuleFrame();
        IRI testSubject14 = testSubject0.parseVariable();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntax()  {
        assertTrue(Enum.class.isAssignableFrom(ManchesterOWLSyntax.class));
    }

    public void verifyEnumManchesterOWLSyntax()  {
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
        org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntax result2 = ManchesterOWLSyntax
                .parse(_String);
        String result3 = testSubject0.keyword();
        boolean result4 = testSubject0.isFrameKeyword();
        boolean result5 = testSubject0.isSectionKeyword();
        boolean result6 = testSubject0.isAxiomKeyword();
        boolean result7 = testSubject0.isClassExpressionConnectiveKeyword();
        boolean result8 = testSubject0.isClassExpressionQuantiferKeyword();
        boolean result9 = testSubject0.matchesEitherForm(_String);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxClassExpressionParser()
             {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class
                .isAssignableFrom(ManchesterOWLSyntaxClassExpressionParser.class));
    }

    public void verifyManchesterOWLSyntaxClassExpressionParser()
             {
        ManchesterOWLSyntaxClassExpressionParser testSubject0 = new ManchesterOWLSyntaxClassExpressionParser(
                _OWLDataFactory, _OWLEntityChecker);
        Object result0 = testSubject0.parse(_String);
        OWLClassExpression result1 = testSubject0
                .parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxClassFrameParser()
             {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class
                .isAssignableFrom(ManchesterOWLSyntaxClassFrameParser.class));
    }

    public void verifyManchesterOWLSyntaxClassFrameParser()  {
        ManchesterOWLSyntaxClassFrameParser testSubject0 = new ManchesterOWLSyntaxClassFrameParser(
                _OWLDataFactory, _OWLEntityChecker);
        Object result0 = testSubject0.parse(_String);
        java.util.Set<org.coode.owlapi.manchesterowlsyntax.OntologyAxiomPair> result1 = testSubject0
                .parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyManchesterOWLSyntaxEditorParser()  {
        ManchesterOWLSyntaxEditorParser testSubject0 = new ManchesterOWLSyntaxEditorParser(
                _OWLDataFactory, _String);
        ManchesterOWLSyntaxEditorParser testSubject1 = new ManchesterOWLSyntaxEditorParser(
                _OWLOntologyLoaderConfiguration, _OWLDataFactory, _String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
        OWLClassExpression result0 = testSubject0
                .parseClassExpression();
        java.util.Set<org.coode.owlapi.manchesterowlsyntax.OntologyAxiomPair> result1 = testSubject0
                .parseClassFrameEOF();
        testSubject0.setOWLOntologyChecker(_OWLOntologyChecker);
        OWLLiteral result2 = testSubject0
                .parseConstant();
        java.util.Set<org.coode.owlapi.manchesterowlsyntax.OntologyAxiomPair> result3 = testSubject0
                .parseFrames();
        testSubject0.setDefaultOntology(_OWLOntology);
        org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxOntologyFormat result4 = testSubject0
                .parseOntology(_OWLOntology);
        OWLAxiom result5 = testSubject0
                .parseAxiom();
        OWLAxiom testSubject16 = testSubject0.parseAxiom();
        OWLClassExpression testSubject2 = testSubject0.parseClassExpression();
        Set<OntologyAxiomPair> testSubject3 = testSubject0.parseClassFrameEOF();
        OWLLiteral testSubject4 = testSubject0
                .parseLiteral(mock(OWLDatatype.class));
        OWLLiteral testSubject15 = testSubject0.parseConstant();
        testSubject0.setOWLEntityChecker(mock(OWLEntityChecker.class));
        testSubject0.setOWLOntologyChecker(mock(OWLOntologyChecker.class));
        List<OWLObjectPropertyExpression> testSubject5 = testSubject0
                .parseObjectPropertyChain();
        ManchesterOWLSyntaxOntologyFormat testSubject6 = testSubject0
                .parseOntology(mock(OWLOntology.class));
        Set<OWLClassExpression> testSubject7 = testSubject0
                .parseClassExpressionList();
        Set<OWLObjectPropertyExpression> testSubject8 = testSubject0
                .parseObjectPropertyList();
        Set<OWLClassExpression> testSubject9 = testSubject0
                .parseClassExpressionList(false);
        OWLClassAxiom testSubject10 = testSubject0.parseClassAxiom();
        OWLDataRange testSubject11 = testSubject0.parseDataRange();
        Set<OWLPropertyExpression<?, ?>> testSubject12 = testSubject0
                .parsePropertyList();
        List<OntologyAxiomPair> testSubject13 = testSubject0.parseRuleFrame();
        IRI testSubject14 = testSubject0.parseVariable();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxFramesParser()
             {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class
                .isAssignableFrom(ManchesterOWLSyntaxFramesParser.class));
    }

    public void verifyManchesterOWLSyntaxFramesParser()  {
        ManchesterOWLSyntaxFramesParser testSubject0 = new ManchesterOWLSyntaxFramesParser(
                _OWLDataFactory, _OWLEntityChecker);
        java.util.Set<org.coode.owlapi.manchesterowlsyntax.OntologyAxiomPair> result0 = testSubject0
                .parse(_String);
        Object result1 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
        testSubject0.setOWLOntologyChecker(_OWLOntologyChecker);
        testSubject0.setDefaultOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxInlineAxiomParser()
             {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class
                .isAssignableFrom(ManchesterOWLSyntaxInlineAxiomParser.class));
    }

    public void verifyManchesterOWLSyntaxInlineAxiomParser()  {
        ManchesterOWLSyntaxInlineAxiomParser testSubject0 = new ManchesterOWLSyntaxInlineAxiomParser(
                _OWLDataFactory, _OWLEntityChecker);
        Object result0 = testSubject0.parse(_String);
        OWLAxiom result1 = testSubject0
                .parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyFormat()
             {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(ManchesterOWLSyntaxOntologyFormat.class));
    }

    public void verifyManchesterOWLSyntaxOntologyFormat()  {
        ManchesterOWLSyntaxOntologyFormat testSubject0 = new ManchesterOWLSyntaxOntologyFormat();
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result0 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result1 = testSubject0.getPrefixNames();
        String result2 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        String result4 = testSubject0.getDefaultPrefix();
        String result5 = testSubject0.getPrefixIRI(_IRI);
        IRI result6 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result7 = testSubject0.getParameter(_Object, _Object);
        boolean result8 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result9 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result10 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    public void verifyManchesterOWLSyntaxOntologyHeader()  {
        ManchesterOWLSyntaxOntologyHeader testSubject0 = new ManchesterOWLSyntaxOntologyHeader(
                _IRI, _IRI, _Set, _Set13);
        java.util.Collection<OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        OWLOntologyID result1 = testSubject0
                .getOntologyID();
        java.util.Collection<OWLImportsDeclaration> result2 = testSubject0
                .getImportsDeclarations();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyParser()
             {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(ManchesterOWLSyntaxOntologyParser.class));
    }

    public void verifyManchesterOWLSyntaxOntologyParser()  {
        ManchesterOWLSyntaxOntologyParser testSubject0 = new ManchesterOWLSyntaxOntologyParser();
        OWLOntologyFormat result0 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result1 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result2 = testSubject0
                .parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result3 = testSubject0
                .getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxParserException()
             {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(ManchesterOWLSyntaxParserException.class));
    }

    public void verifyManchesterOWLSyntaxParserException()  {
        ManchesterOWLSyntaxParserException testSubject0 = new ManchesterOWLSyntaxParserException(
                _String, _int, _int);
        ManchesterOWLSyntaxParserException testSubject1 = new ManchesterOWLSyntaxParserException(
                _String, _Throwable, _int, _int);
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
    public void enforceInterfacesManchesterOWLSyntaxParserFactory()
             {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(ManchesterOWLSyntaxParserFactory.class));
    }

    public void verifyManchesterOWLSyntaxParserFactory()  {
        ManchesterOWLSyntaxParserFactory testSubject0 = new ManchesterOWLSyntaxParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    public void verifyManchesterOWLSyntaxTokenizer()  {
        ManchesterOWLSyntaxTokenizer testSubject0 = new ManchesterOWLSyntaxTokenizer(
                _String);
        java.util.List<org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxTokenizer.Token> result0 = testSubject0
                .tokenize();
        boolean result1 = ManchesterOWLSyntaxTokenizer.EOF(_String);
    }

    public void verifyOntologyAxiomPair()  {
        OntologyAxiomPair testSubject0 = new OntologyAxiomPair(_OWLOntology,
                _OWLAxiom);
        OWLOntology result0 = testSubject0
                .getOntology();
        OWLAxiom result1 = testSubject0.getAxiom();
    }

    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.util.Set<OWLAnnotation> _Set;
    private java.util.Set<OWLImportsDeclaration> _Set13;
    private org.semanticweb.owlapi.expression.OWLEntityChecker _OWLEntityChecker;
    private org.semanticweb.owlapi.expression.OWLOntologyChecker _OWLOntologyChecker;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLAxiom _OWLAxiom;
    private OWLDataFactory _OWLDataFactory;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat _PrefixOWLOntologyFormat;
}
