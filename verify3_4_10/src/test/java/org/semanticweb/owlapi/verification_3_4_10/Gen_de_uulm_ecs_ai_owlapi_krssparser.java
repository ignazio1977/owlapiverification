package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import de.uulm.ecs.ai.owlapi.krssparser.JavaCharStream;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2OWLParser;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2OWLParserException;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2OWLParserFactory;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2OntologyFormat;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2Parser;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2ParserConstants;
import de.uulm.ecs.ai.owlapi.krssparser.KRSS2ParserTokenManager;
import de.uulm.ecs.ai.owlapi.krssparser.ParseException;
import de.uulm.ecs.ai.owlapi.krssparser.Token;
import de.uulm.ecs.ai.owlapi.krssparser.TokenMgrError;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_de_uulm_ecs_ai_owlapi_krssparser {
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
    public void enforceInterfacesKRSS2OntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyFormat.class
                .isAssignableFrom(KRSS2OntologyFormat.class));
    }

    public void verifyKRSS2OntologyFormat() throws Exception {
        KRSS2OntologyFormat testSubject0 = new KRSS2OntologyFormat();
        boolean result0 = testSubject0.isIgnoreOntologyURI();
        testSubject0.setIgnoreOntologyURI(_boolean);
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result1 = testSubject0.getParameter(_Object, _Object);
        boolean result2 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result3 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result4 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesKRSS2OWLParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(KRSS2OWLParser.class));
    }

    public void verifyKRSS2OWLParser() throws Exception {
        KRSS2OWLParser testSubject0 = new KRSS2OWLParser();
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
    public void enforceInterfacesKRSS2OWLParserException() throws Exception {
        assertTrue(org.coode.owl.krssparser.KRSSOWLParserException.class
                .isAssignableFrom(KRSS2OWLParserException.class));
    }

    public void verifyKRSS2OWLParserException() throws Exception {
        KRSS2OWLParserException testSubject0 = new KRSS2OWLParserException(
                _ParseException);
        KRSS2OWLParserException testSubject1 = new KRSS2OWLParserException(_Throwable);
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
    public void enforceInterfacesKRSS2OWLParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(KRSS2OWLParserFactory.class));
    }

    public void verifyKRSS2OWLParserFactory() throws Exception {
        KRSS2OWLParserFactory testSubject0 = new KRSS2OWLParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesKRSS2Parser() throws Exception {
        assertTrue(de.uulm.ecs.ai.owlapi.krssparser.KRSS2ParserConstants.class
                .isAssignableFrom(KRSS2Parser.class));
    }

    public void verifyKRSS2Parser() throws Exception {
        KRSS2Parser testSubject0 = new KRSS2Parser(_Reader);
        KRSS2Parser testSubject1 = new KRSS2Parser(_InputStream);
        KRSS2Parser testSubject2 = new KRSS2Parser(_InputStream, _String);
        KRSS2Parser testSubject3 = new KRSS2Parser(_KRSS2ParserTokenManager);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.Name();
        boolean result1 = testSubject0.parseBoolean();
        testSubject0.parse();
        int result2 = testSubject0.Integer();
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result3 = testSubject0
                .propertyChain();
        testSubject0.setOntology(_OWLOntology, _OWLDataFactory);
        testSubject0.ReInit(_KRSS2ParserTokenManager);
        testSubject0.ReInit(_InputStream, _String);
        testSubject0.ReInit(_InputStream);
        testSubject0.ReInit(_Reader);
        testSubject0.setNameResolution(_NameResolverStrategy);
        testSubject0.TBoxStatement();
        testSubject0.Range();
        testSubject0.ABoxStatement();
        testSubject0.DefinePrimitiveConcept();
        testSubject0.DefineConcept();
        testSubject0.Implies();
        testSubject0.Equivalent();
        testSubject0.Disjoint();
        testSubject0.ComplexRoleInclusion();
        testSubject0.DefinePrimitiveRole();
        testSubject0.DefineRole();
        testSubject0.DisjointRoles();
        testSubject0.RolesEquivalent();
        testSubject0.ImpliesRole();
        testSubject0.Inverses();
        testSubject0.Transitive();
        org.semanticweb.owlapi.model.OWLClassExpression result4 = testSubject0
                .ConceptName();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .ConceptExpression();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result6 = testSubject0
                .RoleExpression();
        org.semanticweb.owlapi.model.OWLObjectProperty result7 = testSubject0.RoleName();
        testSubject0.Parent(_OWLObjectProperty);
        testSubject0.RightIdentity(_OWLObjectProperty);
        testSubject0.Parents(_OWLObjectProperty);
        testSubject0.DomainAttribute(_OWLObjectProperty);
        testSubject0.RangeAttribute(_OWLObjectProperty);
        testSubject0.TransitiveAttribute(_OWLObjectProperty);
        testSubject0.SymmetricAttribute(_OWLObjectProperty);
        testSubject0.ReflexiveAttribute(_OWLObjectProperty);
        testSubject0.InverseProperty(_OWLObjectProperty);
        testSubject0.LeftIdentity(_OWLObjectProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result8 = testSubject0
                .RoleNameSet();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0.And();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0.Or();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0.Not();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0.Some();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0.AtLeast();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0.AtMost();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0.Exactly();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .ConceptSet();
        testSubject0.Instance();
        testSubject0.Related();
        testSubject0.Equal();
        testSubject0.Distinct();
        org.semanticweb.owlapi.model.OWLIndividual result17 = testSubject0
                .IndividualName();
        de.uulm.ecs.ai.owlapi.krssparser.Token result18 = testSubject0.getNextToken();
        de.uulm.ecs.ai.owlapi.krssparser.ParseException result19 = testSubject0
                .generateParseException();
        de.uulm.ecs.ai.owlapi.krssparser.Token result20 = testSubject0.getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        org.semanticweb.owlapi.model.IRI result21 = testSubject0.getIRI(_String);
        org.semanticweb.owlapi.model.OWLClassExpression result22 = testSubject0.All();
    }

    public void verifyInterfaceKRSS2ParserConstants() throws Exception {
        KRSS2ParserConstants testSubject0 = mock(KRSS2ParserConstants.class);
    }

    @Test
    public void enforceInterfacesKRSS2ParserTokenManager() throws Exception {
        assertTrue(de.uulm.ecs.ai.owlapi.krssparser.KRSS2ParserConstants.class
                .isAssignableFrom(KRSS2ParserTokenManager.class));
    }

    public void verifyKRSS2ParserTokenManager() throws Exception {
        KRSS2ParserTokenManager testSubject0 = new KRSS2ParserTokenManager(
                _BOMSafeJavaCharStream, _int);
        KRSS2ParserTokenManager testSubject1 = new KRSS2ParserTokenManager(
                _BOMSafeJavaCharStream);
        testSubject0.ReInit(_BOMSafeJavaCharStream, _int);
        testSubject0.ReInit(_BOMSafeJavaCharStream);
        de.uulm.ecs.ai.owlapi.krssparser.Token result0 = testSubject0.getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
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
        de.uulm.ecs.ai.owlapi.krssparser.Token result1 = Token.newToken(_int, _String);
        de.uulm.ecs.ai.owlapi.krssparser.Token result2 = Token.newToken(_int);
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

    private boolean _boolean;
    private char _char;
    private de.uulm.ecs.ai.owlapi.krssparser.KRSS2ParserTokenManager _KRSS2ParserTokenManager;
    private de.uulm.ecs.ai.owlapi.krssparser.Token _Token;
    private int _int;
    private int[][] _int_array_array;
    private java.io.InputStream _InputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Reader _Reader;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.String[] _String_array;
    private java.lang.Throwable _Throwable;
    private org.coode.owl.krssparser.NameResolverStrategy _NameResolverStrategy;
    private org.coode.owl.krssparser.ParseException _ParseException;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private uk.ac.manchester.cs.BOMSafeJavaCharStream _BOMSafeJavaCharStream;
}
