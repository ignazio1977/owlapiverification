package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import PrefixManager;

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

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi_turtle_parser {

    @Test
    public void enforceInterfacesConsoleTripleHandler()  {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler.class
                .isAssignableFrom(ConsoleTripleHandler.class));
    }

    public void verifyConsoleTripleHandler()  {
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
    public void enforceInterfacesJavaCharStream()  {
        assertTrue(uk.ac.manchester.cs.BOMSafeJavaCharStream.class
                .isAssignableFrom(JavaCharStream.class));
    }

    public void verifyJavaCharStream()  {
        JavaCharStream testSubject0 = new JavaCharStream(_Reader, _int, _int);
        JavaCharStream testSubject1 = new JavaCharStream(_InputStream, _String,
                _int, _int);
        char result0 = testSubject0.readChar();
        testSubject0.backup(_int);
        char result1 = testSubject0.BeginToken();
        int result2 = testSubject0.getEndColumn();
        int result3 = testSubject0.getEndLine();
        int result4 = testSubject0.getBeginColumn();
        int result5 = testSubject0.getBeginLine();
        testSubject0.ReInit(_InputStream, _String, _int, _int);
        testSubject0.ReInit(_Reader, _int, _int);
        String result6 = testSubject0.GetImage();
    }

    @Test
    public void enforceInterfacesNullTripleHandler()  {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler.class
                .isAssignableFrom(NullTripleHandler.class));
    }

    public void verifyNullTripleHandler()  {
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
    public void enforceInterfacesOWLRDFConsumerAdapter()  {
        assertTrue(org.coode.owlapi.rdfxml.parser.OWLRDFConsumer.class
                .isAssignableFrom(OWLRDFConsumerAdapter.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler.class
                .isAssignableFrom(OWLRDFConsumerAdapter.class));
    }

    public void verifyOWLRDFConsumerAdapter()  {
        OWLRDFConsumerAdapter testSubject0 = new OWLRDFConsumerAdapter(
                _OWLOntologyManager, _OWLOntology, _AnonymousNodeChecker,
                _OWLOntologyLoaderConfiguration);
        OWLRDFConsumerAdapter testSubject1 = new OWLRDFConsumerAdapter(
                _OWLOntology, _AnonymousNodeChecker,
                _OWLOntologyLoaderConfiguration);
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
        OWLOntologyLoaderConfiguration result0 = testSubject0
                .getConfiguration();
        testSubject0.addTriple(_IRI, _IRI, _IRI);
        testSubject0.addTriple(_IRI, _IRI, _OWLLiteral);
        java.util.Set<OWLAnnotation> result1 = testSubject0
                .translateAnnotations(_IRI);
        OWLOntology result2 = testSubject0
                .getOntology();
        OWLDataFactory result3 = testSubject0
                .getDataFactory();
        testSubject0.addOntology(_IRI);
        IRI result4 = testSubject0
                .getResourceObject(_IRI, _OWLRDFVocabulary, _boolean);
        IRI result5 = testSubject0
                .getResourceObject(_IRI, _IRI, _boolean);
        OWLLiteral result6 = testSubject0
                .getLiteralObject(_IRI, _OWLRDFVocabulary, _boolean);
        OWLLiteral result7 = testSubject0
                .getLiteralObject(_IRI, _IRI, _boolean);
        boolean result8 = testSubject0.isRestriction(_IRI);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        boolean result10 = testSubject0.isDataRange(_IRI);
        boolean result11 = testSubject0.isParsedAllTriples();
        testSubject0.importsClosureChanged();
        testSubject0.setIRIProvider(_IRIProvider);
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<OWLAnnotation> result12 = testSubject0
                .getPendingAnnotations();
        testSubject0.setPendingAnnotations(_Set);
        OWLAxiom result13 = testSubject0
                .getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<IRI> result14 = testSubject0
                .getAnnotatedSourceAnnotationMainNodes(_IRI);
        boolean result15 = testSubject0.isTriplePresent(_IRI, _IRI,
                _OWLLiteral, _boolean);
        boolean result16 = testSubject0.isTriplePresent(_IRI, _IRI, _IRI,
                _boolean);
        OWLIndividual result17 = testSubject0
                .translateIndividual(_IRI);
        OWLClassExpression result18 = testSubject0
                .translateClassExpression(_IRI);
        testSubject0.startModel(_String);
        testSubject0.endModel();
        testSubject0.addModelAttribte(_String, _String);
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_String);
        IRI result19 = testSubject0
                .getSynonym(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String,
                _String, _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        OWLDataRange result20 = testSubject0
                .translateDataRange(_IRI);
        java.util.Set<OWLDataRange> result21 = testSubject0
                .translateToDataRangeSet(_IRI);
        java.util.Set<OWLLiteral> result22 = testSubject0
                .translateToConstantSet(_IRI);
        java.util.Set<OWLFacetRestriction> result23 = testSubject0
                .translateToFacetRestrictionSet(_IRI);
        OWLDataPropertyExpression result24 = testSubject0
                .translateDataPropertyExpression(_IRI);
        OWLObjectPropertyExpression result25 = testSubject0
                .translateObjectPropertyExpression(_IRI);
        java.util.Set<IRI> result26 = testSubject0
                .getPredicatesBySubject(_IRI);
        java.util.Set<IRI> result27 = testSubject0
                .getResourceObjects(_IRI, _IRI);
        java.util.Set<OWLLiteral> result28 = testSubject0
                .getLiteralObjects(_IRI, _IRI);
        OWLClassExpression result29 = testSubject0
                .getClassExpressionIfTranslated(_IRI);
        java.util.List<OWLObjectPropertyExpression> result30 = testSubject0
                .translateToObjectPropertyList(_IRI);
        java.util.List<OWLDataPropertyExpression> result31 = testSubject0
                .translateToDataPropertyList(_IRI);
        java.util.Set<OWLClassExpression> result32 = testSubject0
                .translateToClassExpressionSet(_IRI);
        java.util.Set<OWLIndividual> result33 = testSubject0
                .translateToIndividualSet(_IRI);
        boolean result34 = testSubject0.hasPredicate(_IRI, _IRI);
        testSubject0.addRest(_IRI, _IRI);
        IRI result35 = testSubject0
                .getFirstResource(_IRI, _boolean);
        OWLLiteral result36 = testSubject0
                .getFirstLiteral(_IRI);
        IRI result37 = testSubject0.getRest(_IRI,
                _boolean);
        boolean result38 = testSubject0.isAxiom(_IRI);
        OWLOntologyManager result39 = testSubject0
                .getOWLOntologyManager();
        java.util.Set<IRI> result40 = testSubject0
                .getOntologies();
        testSubject0.addAxiom(_IRI);
        org.semanticweb.owlapi.io.RDFOntologyFormat result41 = testSubject0
                .getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
    }

    @Test
    public void enforceInterfacesParseException()  {
        assertTrue(Exception.class.isAssignableFrom(ParseException.class));
    }

    public void verifyParseException()  {
        ParseException testSubject0 = new ParseException(_String);
        ParseException testSubject1 = new ParseException();
        ParseException testSubject2 = new ParseException(_Token,
                _int_array_array, _String_array);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesToken()  {
        assertTrue(java.io.Serializable.class.isAssignableFrom(Token.class));
    }

    public void verifyToken()  {
        Token testSubject0 = new Token(_int);
        Token testSubject1 = new Token();
        Token testSubject2 = new Token(_int, _String);
        Object result0 = testSubject0.getValue();
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result1 = Token
                .newToken(_int, _String);
        uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token result2 = Token
                .newToken(_int);
    }

    @Test
    public void enforceInterfacesTokenMgrError()  {
        assertTrue(OWLRuntimeException.class
                .isAssignableFrom(TokenMgrError.class));
    }

    public void verifyTokenMgrError()  {
        TokenMgrError testSubject0 = new TokenMgrError(_String, _int);
        TokenMgrError testSubject1 = new TokenMgrError(_boolean, _int, _int,
                _int, _String, _char, _int);
        TokenMgrError testSubject2 = new TokenMgrError();
        String result0 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceTripleHandler()  {
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
    public void enforceInterfacesTurtleOntologyParser()  {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(TurtleOntologyParser.class));
    }

    public void verifyTurtleOntologyParser()  {
        TurtleOntologyParser testSubject0 = new TurtleOntologyParser();
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
    public void enforceInterfacesTurtleOntologyParserFactory()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(TurtleOntologyParserFactory.class));
    }

    public void verifyTurtleOntologyParserFactory()  {
        TurtleOntologyParserFactory testSubject0 = new TurtleOntologyParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesTurtleParser()  {
        assertTrue(org.coode.owlapi.rdfxml.parser.AnonymousNodeChecker.class
                .isAssignableFrom(TurtleParser.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserConstants.class
                .isAssignableFrom(TurtleParser.class));
    }

    public void verifyTurtleParser()  {
        TurtleParser testSubject0 = new TurtleParser(_InputStream, _String);
        TurtleParser testSubject1 = new TurtleParser(_Reader);
        TurtleParser testSubject2 = new TurtleParser(_TurtleParserTokenManager);
        TurtleParser testSubject3 = new TurtleParser(_InputStream);
        String result0 = testSubject0.parseBoolean();
        String result1 = testSubject0.parseDouble();
        PrefixManager result2 = testSubject0.getPrefixManager();
        testSubject0.setTripleHandler(_TripleHandler);
        testSubject0.parseDocument();
        testSubject0.parseDirective();
        testSubject0.parseStatement();
        testSubject0.parsePrefixDirective();
        testSubject0.parseBaseDirective();
        testSubject0.parseTriples();
        IRI result3 = testSubject0.parseSubject();
        IRI result4 = testSubject0.parseResource();
        testSubject0.parsePredicateObjectList(_IRI);
        IRI result5 = testSubject0
                .parseBlankNode();
        IRI result6 = testSubject0.parseLoneNS();
        IRI result7 = testSubject0
                .parseAbbreviatedIRI();
        IRI result8 = testSubject0.parseNodeID();
        IRI result9 = testSubject0
                .parseCollection();
        IRI result10 = testSubject0.parseVerb();
        testSubject0.parseObjectList(_IRI, _IRI);
        IRI result11 = testSubject0
                .parsePredicate();
        IRI result12 = testSubject0
                .parseItemList();
        String result13 = testSubject0.parseQuotedString();
        String result14 = testSubject0.parseDecimal();
        String result15 = testSubject0.parseString();
        String result16 = testSubject0.parseInteger();
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
        IRI result23 = testSubject0
                .getIRI(_String);
        testSubject0.parseLiteral(_IRI, _IRI);
        IRI result24 = testSubject0.parseIRI();
        testSubject0.parseObject(_IRI, _IRI);
    }

    public void verifyInterfaceTurtleParserConstants()  {
        TurtleParserConstants testSubject0 = mock(TurtleParserConstants.class);
    }

    @Test
    public void enforceInterfacesTurtleParserException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(TurtleParserException.class));
    }

    public void verifyTurtleParserException()  {
        TurtleParserException testSubject0 = new TurtleParserException(_String);
        TurtleParserException testSubject1 = new TurtleParserException(_String,
                _Throwable);
        TurtleParserException testSubject2 = new TurtleParserException(
                _Throwable);
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
    public void enforceInterfacesTurtleParserTokenManager()  {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserConstants.class
                .isAssignableFrom(TurtleParserTokenManager.class));
    }

    public void verifyTurtleParserTokenManager()  {
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
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private String[] _String_array;
    private Throwable _Throwable;
    private java.util.Set<OWLAnnotation> _Set;
    private org.coode.owlapi.rdfxml.parser.AnonymousNodeChecker _AnonymousNodeChecker;
    private org.coode.owlapi.rdfxml.parser.IRIProvider _IRIProvider;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.RDFOntologyFormat _RDFOntologyFormat;
    private IRI _IRI;
    private OWLLiteral _OWLLiteral;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.vocab.OWLRDFVocabulary _OWLRDFVocabulary;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.JavaCharStream _JavaCharStream;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.Token _Token;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.TripleHandler _TripleHandler;
    private uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParserTokenManager _TurtleParserTokenManager;
}
