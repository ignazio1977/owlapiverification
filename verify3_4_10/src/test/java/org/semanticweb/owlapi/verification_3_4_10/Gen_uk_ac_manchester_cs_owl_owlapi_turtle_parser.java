package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.owl.owlapi.turtle.parser.ConsoleTripleHandler;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.JavaCharStream;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.NullTripleHandler;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.OWLRDFConsumerAdapter;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.ParseException;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TokenMgrError;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleOntologyParser;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleOntologyParserFactory;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParser;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserConstants;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserException;
import uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserTokenManager;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi_turtle_parser {
    @Test
    public void enforceInterfacesConsoleTripleHandler() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler.class
                .isAssignableFrom(ConsoleTripleHandler.class));
    }

    public void verifyConsoleTripleHandler() throws Exception {
        ConsoleTripleHandler testSubject0 = new ConsoleTripleHandler();
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_String);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
    }

    @Test
    public void enforceInterfacesJavaCharStream() throws Exception {
        assertTrue(uk.ac.manchester.cs.BOMSafeJavaCharStream.class
                .isAssignableFrom(JavaCharStream.class));
    }

    public void verifyJavaCharStream() throws Exception {
        JavaCharStream testSubject0 = new JavaCharStream(_Reader, _int, _int);
        JavaCharStream testSubject1 = new JavaCharStream(_InputStream, _String, _int,
                _int);
        char result0 = testSubject0.readChar();
        testSubject0.backup(_int);
        char result1 = testSubject0.BeginToken();
        int result2 = testSubject0.getEndColumn();
        int result3 = testSubject0.getEndLine();
        int result4 = testSubject0.getBeginColumn();
        int result5 = testSubject0.getBeginLine();
        testSubject0.ReInit(_InputStream, _String, _int, _int);
        testSubject0.ReInit(_Reader, _int, _int);
        java.lang.String result6 = testSubject0.GetImage();
    }

    @Test
    public void enforceInterfacesNullTripleHandler() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler.class
                .isAssignableFrom(NullTripleHandler.class));
    }

    public void verifyNullTripleHandler() throws Exception {
        NullTripleHandler testSubject0 = new NullTripleHandler();
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_String);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String);
    }

    @Test
    public void enforceInterfacesOWLRDFConsumerAdapter() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.OWLRDFConsumer.class
                .isAssignableFrom(OWLRDFConsumerAdapter.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler.class
                .isAssignableFrom(OWLRDFConsumerAdapter.class));
    }

    public void verifyOWLRDFConsumerAdapter() throws Exception {
        OWLRDFConsumerAdapter testSubject0 = new OWLRDFConsumerAdapter(
                _OWLOntologyManager, _OWLOntology, _AnonymousNodeChecker,
                _OWLOntologyLoaderConfiguration);
        OWLRDFConsumerAdapter testSubject1 = new OWLRDFConsumerAdapter(_OWLOntology,
                _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_String);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handle(_IRI, _IRI, _OWLLiteral);
        testSubject0.handle(_IRI, _IRI, _IRI);
        testSubject0.addFirst(_IRI, _IRI);
        testSubject0.addFirst(_IRI, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result0 = testSubject0
                .getConfiguration();
        testSubject0.addTriple(_IRI, _IRI, _IRI);
        testSubject0.addTriple(_IRI, _IRI, _OWLLiteral);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .translateAnnotations(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0.getOntology();
        org.semanticweb.owlapi.model.OWLDataFactory result3 = testSubject0
                .getDataFactory();
        testSubject0.addOntology(_IRI);
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getResourceObject(_IRI,
                _OWLRDFVocabulary, _boolean);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getResourceObject(_IRI,
                _IRI, _boolean);
        org.semanticweb.owlapi.model.OWLLiteral result6 = testSubject0.getLiteralObject(
                _IRI, _OWLRDFVocabulary, _boolean);
        org.semanticweb.owlapi.model.OWLLiteral result7 = testSubject0.getLiteralObject(
                _IRI, _IRI, _boolean);
        boolean result8 = testSubject0.isRestriction(_IRI);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        boolean result10 = testSubject0.isDataRange(_IRI);
        boolean result11 = testSubject0.isParsedAllTriples();
        testSubject0.importsClosureChanged();
        testSubject0.setIRIProvider(_IRIProvider);
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getPendingAnnotations();
        testSubject0.setPendingAnnotations(_Set);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result14 = testSubject0
                .getAnnotatedSourceAnnotationMainNodes(_IRI);
        boolean result15 = testSubject0
                .isTriplePresent(_IRI, _IRI, _OWLLiteral, _boolean);
        boolean result16 = testSubject0.isTriplePresent(_IRI, _IRI, _IRI, _boolean);
        org.semanticweb.owlapi.model.OWLIndividual result17 = testSubject0
                .translateIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0
                .translateClassExpression(_IRI);
        testSubject0.startModel(_String);
        testSubject0.endModel();
        testSubject0.addModelAttribte(_String, _String);
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_String);
        org.semanticweb.owlapi.model.IRI result19 = testSubject0.getSynonym(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String,
                _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        org.semanticweb.owlapi.model.OWLDataRange result20 = testSubject0
                .translateDataRange(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result21 = testSubject0
                .translateToDataRangeSet(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result22 = testSubject0
                .translateToConstantSet(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> result23 = testSubject0
                .translateToFacetRestrictionSet(_IRI);
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result24 = testSubject0
                .translateDataPropertyExpression(_IRI);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result25 = testSubject0
                .translateObjectPropertyExpression(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result26 = testSubject0
                .getPredicatesBySubject(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result27 = testSubject0
                .getResourceObjects(_IRI, _IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result28 = testSubject0
                .getLiteralObjects(_IRI, _IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result29 = testSubject0
                .getClassExpressionIfTranslated(_IRI);
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result30 = testSubject0
                .translateToObjectPropertyList(_IRI);
        java.util.List<org.semanticweb.owlapi.model.OWLDataPropertyExpression> result31 = testSubject0
                .translateToDataPropertyList(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result32 = testSubject0
                .translateToClassExpressionSet(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result33 = testSubject0
                .translateToIndividualSet(_IRI);
        boolean result34 = testSubject0.hasPredicate(_IRI, _IRI);
        testSubject0.addRest(_IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result35 = testSubject0.getFirstResource(_IRI,
                _boolean);
        org.semanticweb.owlapi.model.OWLLiteral result36 = testSubject0
                .getFirstLiteral(_IRI);
        org.semanticweb.owlapi.model.IRI result37 = testSubject0.getRest(_IRI, _boolean);
        boolean result38 = testSubject0.isAxiom(_IRI);
        org.semanticweb.owlapi.model.OWLOntologyManager result39 = testSubject0
                .getOWLOntologyManager();
        java.util.Set<org.semanticweb.owlapi.model.IRI> result40 = testSubject0
                .getOntologies();
        testSubject0.addAxiom(_IRI);
        org.semanticweb.owlapi.io.RDFOntologyFormat result41 = testSubject0
                .getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
    }

    @Test
    public void enforceInterfacesParseException() throws Exception {
        assertTrue(java.lang.Exception.class.isAssignableFrom(ParseException.class));
    }

    public void verifyParseException() throws Exception {
        ParseException testSubject0 = new ParseException(_String);
        ParseException testSubject1 = new ParseException();
        ParseException testSubject2 = new ParseException(_Token, _int_array_array,
                _String_array);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesToken() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(Token.class));
    }

    public void verifyToken() throws Exception {
        Token testSubject0 = new Token(_int);
        Token testSubject1 = new Token();
        Token testSubject2 = new Token(_int, _String);
        java.lang.Object result0 = testSubject0.getValue();
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result1 = Token.newToken(_int,
                _String);
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result2 = Token.newToken(_int);
    }

    @Test
    public void enforceInterfacesTokenMgrError() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(TokenMgrError.class));
    }

    public void verifyTokenMgrError() throws Exception {
        TokenMgrError testSubject0 = new TokenMgrError(_String, _int);
        TokenMgrError testSubject1 = new TokenMgrError(_boolean, _int, _int, _int,
                _String, _char, _int);
        TokenMgrError testSubject2 = new TokenMgrError();
        java.lang.String result0 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceTripleHandler() throws Exception {
        TripleHandler testSubject0 = mock(TripleHandler.class);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_String);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
    }

    @Test
    public void enforceInterfacesTurtleOntologyParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(TurtleOntologyParser.class));
    }

    public void verifyTurtleOntologyParser() throws Exception {
        TurtleOntologyParser testSubject0 = new TurtleOntologyParser();
        org.semanticweb.owlapi.model.OWLOntologyFormat result0 = testSubject0.parse(
                _OWLOntologyDocumentSource, _OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyFormat result1 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntologyFormat result2 = testSubject0.parse(_IRI,
                _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result3 = testSubject0
                .getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesTurtleOntologyParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(TurtleOntologyParserFactory.class));
    }

    public void verifyTurtleOntologyParserFactory() throws Exception {
        TurtleOntologyParserFactory testSubject0 = new TurtleOntologyParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesTurtleParser() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AnonymousNodeChecker.class
                .isAssignableFrom(TurtleParser.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserConstants.class
                .isAssignableFrom(TurtleParser.class));
    }

    public void verifyTurtleParser() throws Exception {
        TurtleParser testSubject0 = new TurtleParser(_InputStream, _String);
        TurtleParser testSubject1 = new TurtleParser(_Reader);
        TurtleParser testSubject2 = new TurtleParser(_TurtleParserTokenManager);
        TurtleParser testSubject3 = new TurtleParser(_InputStream);
        TurtleParser testSubject4 = new TurtleParser(_Reader, _TripleHandler, _String);
        TurtleParser testSubject5 = new TurtleParser(_InputStream, _TripleHandler,
                _String);
        java.lang.String result0 = testSubject0.parseBoolean();
        java.lang.String result1 = testSubject0.parseDouble();
        org.semanticweb.owlapi.util.DefaultPrefixManager result2 = testSubject0
                .getPrefixManager();
        testSubject0.setTripleHandler(_TripleHandler);
        testSubject0.parseDocument();
        testSubject0.parseDirective();
        testSubject0.parseStatement();
        testSubject0.parsePrefixDirective();
        testSubject0.parseBaseDirective();
        testSubject0.parseTriples();
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.parseSubject();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.parseResource();
        testSubject0.parsePredicateObjectList(_IRI);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.parseBlankNode();
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.parseLoneNS();
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.parseAbbreviatedIRI();
        org.semanticweb.owlapi.model.IRI result8 = testSubject0.parseNodeID();
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.parseCollection();
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.parseVerb();
        testSubject0.parseObjectList(_IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result11 = testSubject0.parsePredicate();
        org.semanticweb.owlapi.model.IRI result12 = testSubject0.parseItemList();
        java.lang.String result13 = testSubject0.parseQuotedString();
        java.lang.String result14 = testSubject0.parseDecimal();
        java.lang.String result15 = testSubject0.parseString();
        java.lang.String result16 = testSubject0.parseInteger();
        testSubject0.ReInit(_InputStream);
        testSubject0.ReInit(_Reader);
        testSubject0.ReInit(_InputStream, _String);
        testSubject0.ReInit(_TurtleParserTokenManager);
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result17 = testSubject0
                .getNextToken();
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.ParseException result18 = testSubject0
                .generateParseException();
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result19 = testSubject0
                .getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        boolean result20 = testSubject0.isAnonymousNode(_IRI);
        boolean result21 = testSubject0.isAnonymousNode(_String);
        boolean result22 = testSubject0.isAnonymousSharedNode(_String);
        org.semanticweb.owlapi.model.IRI result23 = testSubject0.getIRI(_String);
        testSubject0.parseLiteral(_IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result24 = testSubject0.parseIRI();
        testSubject0.parseObject(_IRI, _IRI);
    }

    public void verifyInterfaceTurtleParserConstants() throws Exception {
        TurtleParserConstants testSubject0 = mock(TurtleParserConstants.class);
    }

    @Test
    public void enforceInterfacesTurtleParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(TurtleParserException.class));
    }

    public void verifyTurtleParserException() throws Exception {
        TurtleParserException testSubject0 = new TurtleParserException(_String);
        TurtleParserException testSubject1 = new TurtleParserException(_String,
                _Throwable);
        TurtleParserException testSubject2 = new TurtleParserException(_Throwable);
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
    public void enforceInterfacesTurtleParserTokenManager() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserConstants.class
                .isAssignableFrom(TurtleParserTokenManager.class));
    }

    public void verifyTurtleParserTokenManager() throws Exception {
        TurtleParserTokenManager testSubject0 = new TurtleParserTokenManager(
                _JavaCharStream);
        TurtleParserTokenManager testSubject1 = new TurtleParserTokenManager(
                _JavaCharStream, _int);
        testSubject0.ReInit(_JavaCharStream);
        testSubject0.ReInit(_JavaCharStream, _int);
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result0 = testSubject0
                .getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
    }

    private boolean _boolean;
    private char _char;
    private int _int;
    private int[][] _int_array_array;
    private java.io.InputStream _InputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Reader _Reader;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.String[] _String_array;
    private java.lang.Throwable _Throwable;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> _Set;
    private org.coode.owlapi.rdfxml.parser.AnonymousNodeChecker _AnonymousNodeChecker;
    private org.coode.owlapi.rdfxml.parser.IRIProvider _IRIProvider;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.RDFOntologyFormat _RDFOntologyFormat;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.vocab.OWLRDFVocabulary _OWLRDFVocabulary;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.JavaCharStream _JavaCharStream;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token _Token;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler _TripleHandler;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserTokenManager _TurtleParserTokenManager;
}
