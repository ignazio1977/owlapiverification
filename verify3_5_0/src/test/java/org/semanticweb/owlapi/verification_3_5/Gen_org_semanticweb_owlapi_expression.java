package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.expression.OWLClassExpressionParser;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.OWLExpressionParser;
import org.semanticweb.owlapi.expression.OWLOntologyChecker;
import org.semanticweb.owlapi.expression.ParserException;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import OWLObject;

@SuppressWarnings({ "javadoc", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_expression {

    @Test
    public void enforceInterfacesOWLClassExpressionParser()  {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class
                .isAssignableFrom(OWLClassExpressionParser.class));
    }

    public void verifyInterfaceOWLClassExpressionParser()  {
        OWLClassExpressionParser testSubject0 = mock(OWLClassExpressionParser.class);
        OWLObject result0 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyInterfaceOWLEntityChecker()  {
        OWLEntityChecker testSubject0 = mock(OWLEntityChecker.class);
        OWLClass result0 = testSubject0
                .getOWLClass(_String);
        OWLObjectProperty result1 = testSubject0
                .getOWLObjectProperty(_String);
        OWLDataProperty result2 = testSubject0
                .getOWLDataProperty(_String);
        OWLAnnotationProperty result3 = testSubject0
                .getOWLAnnotationProperty(_String);
        OWLDatatype result4 = testSubject0
                .getOWLDatatype(_String);
        OWLNamedIndividual result5 = testSubject0
                .getOWLIndividual(_String);
    }

    public void verifyInterfaceOWLExpressionParser()  {
        OWLExpressionParser<OWLObject> testSubject0 = mock(OWLExpressionParser.class);
        OWLObject result0 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyInterfaceOWLOntologyChecker()  {
        OWLOntologyChecker testSubject0 = mock(OWLOntologyChecker.class);
        OWLOntology result0 = testSubject0
                .getOntology(_String);
    }

    @Test
    public void enforceInterfacesParserException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(ParserException.class));
    }

    public void verifyParserException()  {
        ParserException testSubject0 = new ParserException(_List, _int, _int,
                _int, _boolean, _boolean, _boolean, _boolean, _boolean,
                _boolean, _boolean, _boolean, _Set);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        java.util.List<String> result3 = testSubject0.getTokenSequence();
        int result4 = testSubject0.getStartPos();
        boolean result5 = testSubject0.isClassNameExpected();
        boolean result6 = testSubject0.isObjectPropertyNameExpected();
        boolean result7 = testSubject0.isDataPropertyNameExpected();
        boolean result8 = testSubject0.isIndividualNameExpected();
        boolean result9 = testSubject0.isDatatypeNameExpected();
        boolean result10 = testSubject0.isAnnotationPropertyNameExpected();
        boolean result11 = testSubject0.isOntologyNameExpected();
        java.util.Set<String> result12 = testSubject0.getExpectedKeywords();
        String result13 = testSubject0.getCurrentToken();
        boolean result14 = testSubject0.isIntegerExpected();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result15 = testSubject0.fillInStackTrace();
        Throwable result16 = testSubject0.getCause();
        Throwable result17 = testSubject0.initCause(_Throwable);
        String result18 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result19 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result20 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesShortFormEntityChecker()  {
        assertTrue(org.semanticweb.owlapi.expression.OWLEntityChecker.class
                .isAssignableFrom(ShortFormEntityChecker.class));
    }

    public void verifyShortFormEntityChecker()  {
        ShortFormEntityChecker testSubject0 = new ShortFormEntityChecker(
                _BidirectionalShortFormProvider);
        OWLClass result0 = testSubject0
                .getOWLClass(_String);
        OWLObjectProperty result1 = testSubject0
                .getOWLObjectProperty(_String);
        OWLDataProperty result2 = testSubject0
                .getOWLDataProperty(_String);
        OWLAnnotationProperty result3 = testSubject0
                .getOWLAnnotationProperty(_String);
        OWLDatatype result4 = testSubject0
                .getOWLDatatype(_String);
        OWLNamedIndividual result5 = testSubject0
                .getOWLIndividual(_String);
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.util.List<String> _List;
    private java.util.Set<String> _Set;
    private org.semanticweb.owlapi.expression.OWLEntityChecker _OWLEntityChecker;
    private org.semanticweb.owlapi.util.BidirectionalShortFormProvider _BidirectionalShortFormProvider;
}
