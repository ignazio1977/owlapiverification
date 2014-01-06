package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owl.krssparser.JavaCharStream;
import org.coode.owl.krssparser.KRSSOWLParser;
import org.coode.owl.krssparser.KRSSOWLParserException;
import org.coode.owl.krssparser.KRSSOWLParserFactory;
import org.coode.owl.krssparser.KRSSOntologyFormat;
import org.coode.owl.krssparser.KRSSParser;
import org.coode.owl.krssparser.KRSSParserConstants;
import org.coode.owl.krssparser.KRSSParserTokenManager;
import org.coode.owl.krssparser.NameResolverStrategy;
import org.coode.owl.krssparser.ParseException;
import org.coode.owl.krssparser.Token;
import org.coode.owl.krssparser.TokenMgrError;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owl_krssparser {
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
    public void enforceInterfacesKRSSOntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyFormat.class
                .isAssignableFrom(KRSSOntologyFormat.class));
    }

    public void verifyKRSSOntologyFormat() throws Exception {
        KRSSOntologyFormat testSubject0 = new KRSSOntologyFormat();
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result0 = testSubject0.getParameter(_Object, _Object);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result2 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesKRSSOWLParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(KRSSOWLParser.class));
    }

    public void verifyKRSSOWLParser() throws Exception {
        KRSSOWLParser testSubject0 = new KRSSOWLParser();
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
    public void enforceInterfacesKRSSOWLParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(KRSSOWLParserException.class));
    }

    public void verifyKRSSOWLParserException() throws Exception {
        KRSSOWLParserException testSubject0 = new KRSSOWLParserException(_ParseException);
        KRSSOWLParserException testSubject1 = new KRSSOWLParserException(_Throwable);
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
    public void enforceInterfacesKRSSOWLParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(KRSSOWLParserFactory.class));
    }

    public void verifyKRSSOWLParserFactory() throws Exception {
        KRSSOWLParserFactory testSubject0 = new KRSSOWLParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesKRSSParser() throws Exception {
        assertTrue(org.coode.owl.krssparser.KRSSParserConstants.class
                .isAssignableFrom(KRSSParser.class));
    }

    public void verifyKRSSParser() throws Exception {
        KRSSParser testSubject0 = new KRSSParser(_Reader);
        KRSSParser testSubject1 = new KRSSParser(_KRSSParserTokenManager);
        KRSSParser testSubject2 = new KRSSParser(_InputStream);
        KRSSParser testSubject3 = new KRSSParser(_InputStream, _String);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.Name();
        testSubject0.parse();
        int result1 = testSubject0.Integer();
        testSubject0.setOntology(_OWLOntology, _OWLDataFactory);
        testSubject0.ReInit(_InputStream, _String);
        testSubject0.ReInit(_Reader);
        testSubject0.ReInit(_KRSSParserTokenManager);
        testSubject0.ReInit(_InputStream);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.TBoxStatement();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.Range();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.ABoxStatement();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .DefinePrimitiveConcept();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0.DefineConcept();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .DefinePrimitiveRole();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.Transitive();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .ConceptName();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .ConceptExpression();
        org.semanticweb.owlapi.model.OWLObjectProperty result11 = testSubject0.RoleName();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0.And();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0.Or();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0.Not();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0.Some();
        org.semanticweb.owlapi.model.OWLClassExpression result16 = testSubject0.AtLeast();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0.AtMost();
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0.Exactly();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result19 = testSubject0
                .ConceptSet();
        org.semanticweb.owlapi.model.OWLAxiom result20 = testSubject0.Instance();
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0.Related();
        org.semanticweb.owlapi.model.OWLAxiom result22 = testSubject0.Equal();
        org.semanticweb.owlapi.model.OWLAxiom result23 = testSubject0.Distinct();
        org.semanticweb.owlapi.model.OWLIndividual result24 = testSubject0
                .IndividualName();
        org.coode.owl.krssparser.Token result25 = testSubject0.getNextToken();
        org.coode.owl.krssparser.ParseException result26 = testSubject0
                .generateParseException();
        org.coode.owl.krssparser.Token result27 = testSubject0.getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        testSubject0.setIgnoreAnnotationsAndDeclarations(_boolean);
        org.semanticweb.owlapi.model.IRI result28 = testSubject0.getIRI(_String);
        org.semanticweb.owlapi.model.OWLClassExpression result29 = testSubject0.All();
    }

    public void verifyInterfaceKRSSParserConstants() throws Exception {
        KRSSParserConstants testSubject0 = mock(KRSSParserConstants.class);
    }

    @Test
    public void enforceInterfacesKRSSParserTokenManager() throws Exception {
        assertTrue(org.coode.owl.krssparser.KRSSParserConstants.class
                .isAssignableFrom(KRSSParserTokenManager.class));
    }

    public void verifyKRSSParserTokenManager() throws Exception {
        KRSSParserTokenManager testSubject0 = new KRSSParserTokenManager(
                _BOMSafeJavaCharStream);
        KRSSParserTokenManager testSubject1 = new KRSSParserTokenManager(
                _BOMSafeJavaCharStream, _int);
        testSubject0.ReInit(_BOMSafeJavaCharStream, _int);
        testSubject0.ReInit(_BOMSafeJavaCharStream);
        org.coode.owl.krssparser.Token result0 = testSubject0.getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
    }

    @Test
    public void enforceInterfacesNameResolverStrategy() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(NameResolverStrategy.class));
    }

    public void verifyEnumNameResolverStrategy() throws Exception {
        NameResolverStrategy testSubject0 = NameResolverStrategy.ADAPTIVE;
        NameResolverStrategy testSubject1 = NameResolverStrategy.IRI;
        NameResolverStrategy testSubject2 = NameResolverStrategy.NAME;
        NameResolverStrategy testSubject3 = NameResolverStrategy.CHECK;
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
        org.coode.owl.krssparser.Token result1 = Token.newToken(_int, _String);
        org.coode.owl.krssparser.Token result2 = Token.newToken(_int);
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
    private org.coode.owl.krssparser.KRSSParserTokenManager _KRSSParserTokenManager;
    private org.coode.owl.krssparser.ParseException _ParseException;
    private org.coode.owl.krssparser.Token _Token;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private uk.ac.manchester.cs.BOMSafeJavaCharStream _BOMSafeJavaCharStream;
}
