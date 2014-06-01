package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.owlapi.dlsyntax.parser.DLSyntaxParser;
import uk.ac.manchester.cs.owlapi.dlsyntax.parser.DLSyntaxParserConstants;
import uk.ac.manchester.cs.owlapi.dlsyntax.parser.DLSyntaxParserTokenManager;
import uk.ac.manchester.cs.owlapi.dlsyntax.parser.JavaCharStream;
import uk.ac.manchester.cs.owlapi.dlsyntax.parser.ParseException;
import uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token;
import uk.ac.manchester.cs.owlapi.dlsyntax.parser.TokenMgrError;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owlapi_dlsyntax_parser {

    @Test
    public void enforceInterfacesDLSyntaxParser()  {
        assertTrue(uk.ac.manchester.cs.owlapi.dlsyntax.parser.DLSyntaxParserConstants.class
                .isAssignableFrom(DLSyntaxParser.class));
    }

    public void verifyDLSyntaxParser()  {
        DLSyntaxParser testSubject0 = new DLSyntaxParser(_InputStream);
        DLSyntaxParser testSubject1 = new DLSyntaxParser(_Reader);
        DLSyntaxParser testSubject2 = new DLSyntaxParser(
                _DLSyntaxParserTokenManager);
        DLSyntaxParser testSubject3 = new DLSyntaxParser(_InputStream, _String);
        testSubject0.setOWLDataFactory(_OWLDataFactory);
        testSubject0.setPrefixMapping(_String, _String);
        IRI result0 = testSubject0
                .getIRIFromId(_String);
        OWLClassExpression result1 = testSubject0
                .parseDescription();
        OWLClassExpression result2 = testSubject0
                .parseClassDescription();
        java.util.Set<OWLAxiom> result3 = testSubject0
                .parseAxioms();
        OWLAxiom result4 = testSubject0
                .parsePropertyAxiom();
        OWLAxiom result5 = testSubject0
                .parseClassAxiom();
        OWLAxiom result6 = testSubject0
                .parseIndividualAxiom();
        OWLAxiom result7 = testSubject0
                .parseObjectPropertyAssertion();
        OWLAxiom result8 = testSubject0
                .parseDataPropertyAssertion();
        OWLAxiom result9 = testSubject0
                .parseDifferentIndividualsAxiom();
        OWLAxiom result10 = testSubject0
                .parseClassAssertion();
        OWLIndividual result11 = testSubject0
                .parseIndividualId();
        OWLObjectPropertyExpression result12 = testSubject0
                .parseObjectPropertyId();
        OWLDataPropertyExpression result13 = testSubject0
                .parseDataPropertyId();
        OWLAxiom result14 = testSubject0
                .parsePropertyChain();
        OWLClassExpression result15 = testSubject0
                .NonNaryBooleanDescription();
        OWLClassExpression result16 = testSubject0
                .parseRestriction();
        OWLClassExpression result17 = testSubject0
                .parseObjectComplementOf();
        OWLClassExpression result18 = testSubject0
                .NamedClassOrNestedDescription();
        IRI result19 = testSubject0.parseId();
        OWLClassExpression result20 = testSubject0
                .parseSomeRestriction();
        OWLClassExpression result21 = testSubject0
                .parseDataSomeRestriction();
        OWLClassExpression result22 = testSubject0
                .parseAllRestriction();
        OWLClassExpression result23 = testSubject0
                .parseCardinalityRestriction();
        OWLClass result24 = testSubject0
                .parseClassId();
        OWLClassExpression result25 = testSubject0
                .NestedClassDescription();
        testSubject0.ReInit(_InputStream);
        testSubject0.ReInit(_DLSyntaxParserTokenManager);
        testSubject0.ReInit(_Reader);
        testSubject0.ReInit(_InputStream, _String);
        OWLClassExpression result26 = testSubject0
                .And();
        OWLClassExpression result27 = testSubject0
                .Or();
        uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token result28 = testSubject0
                .getNextToken();
        uk.ac.manchester.cs.owlapi.dlsyntax.parser.ParseException result29 = testSubject0
                .generateParseException();
        uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token result30 = testSubject0
                .getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        IRI result31 = testSubject0
                .getIRI(_String);
        OWLClassExpression result32 = testSubject0
                .parseObjectOneOf();
        OWLLiteral result33 = testSubject0
                .parseLiteral();
        OWLDataRange result34 = testSubject0
                .parseDataOneOf();
        OWLAxiom result35 = testSubject0
                .parseSameIndividual();
        OWLAxiom result36 = testSubject0
                .parseAxiom();
        testSubject0.setDefaultNamespace(_String);
    }

    public void verifyInterfaceDLSyntaxParserConstants()  {
        DLSyntaxParserConstants testSubject0 = mock(DLSyntaxParserConstants.class);
    }

    @Test
    public void enforceInterfacesDLSyntaxParserTokenManager()  {
        assertTrue(uk.ac.manchester.cs.owlapi.dlsyntax.parser.DLSyntaxParserConstants.class
                .isAssignableFrom(DLSyntaxParserTokenManager.class));
    }

    public void verifyDLSyntaxParserTokenManager()  {
        DLSyntaxParserTokenManager testSubject0 = new DLSyntaxParserTokenManager(
                _BOMSafeJavaCharStream);
        DLSyntaxParserTokenManager testSubject1 = new DLSyntaxParserTokenManager(
                _BOMSafeJavaCharStream, _int);
        testSubject0.ReInit(_BOMSafeJavaCharStream, _int);
        testSubject0.ReInit(_BOMSafeJavaCharStream);
        uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token result0 = testSubject0
                .getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
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
        uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token result1 = Token
                .newToken(_int, _String);
        uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token result2 = Token
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
    private OWLDataFactory _OWLDataFactory;
    private uk.ac.manchester.cs.BOMSafeJavaCharStream _BOMSafeJavaCharStream;
    private uk.ac.manchester.cs.owlapi.dlsyntax.parser.DLSyntaxParserTokenManager _DLSyntaxParserTokenManager;
    private uk.ac.manchester.cs.owlapi.dlsyntax.parser.Token _Token;
}
