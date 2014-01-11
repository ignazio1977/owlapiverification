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
import org.semanticweb.owlapi.model.OWLObject;

@SuppressWarnings({ "javadoc", "unused", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_expression {
    @Test
    public void enforceInterfacesOWLClassExpressionParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class
                .isAssignableFrom(OWLClassExpressionParser.class));
    }

    public void verifyInterfaceOWLClassExpressionParser() throws Exception {
        OWLClassExpressionParser testSubject0 = mock(OWLClassExpressionParser.class);
        OWLObject result0 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyInterfaceOWLEntityChecker() throws Exception {
        OWLEntityChecker testSubject0 = mock(OWLEntityChecker.class);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass(_String);
        org.semanticweb.owlapi.model.OWLObjectProperty result1 = testSubject0
                .getOWLObjectProperty(_String);
        org.semanticweb.owlapi.model.OWLDataProperty result2 = testSubject0
                .getOWLDataProperty(_String);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result3 = testSubject0
                .getOWLAnnotationProperty(_String);
        org.semanticweb.owlapi.model.OWLDatatype result4 = testSubject0
                .getOWLDatatype(_String);
        org.semanticweb.owlapi.model.OWLNamedIndividual result5 = testSubject0
                .getOWLIndividual(_String);
    }

    public void verifyInterfaceOWLExpressionParser() throws Exception {
        OWLExpressionParser<OWLObject> testSubject0 = mock(OWLExpressionParser.class);
        OWLObject result0 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyInterfaceOWLOntologyChecker() throws Exception {
        OWLOntologyChecker testSubject0 = mock(OWLOntologyChecker.class);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0
                .getOntology(_String);
    }

    @Test
    public void enforceInterfacesParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(ParserException.class));
    }

    public void verifyParserException() throws Exception {
        ParserException testSubject0 = new ParserException(_List, _int, _int, _int,
                _boolean, _boolean, _boolean, _boolean, _boolean, _boolean, _boolean,
                _boolean, _Set);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        java.util.List<java.lang.String> result3 = testSubject0.getTokenSequence();
        int result4 = testSubject0.getStartPos();
        boolean result5 = testSubject0.isClassNameExpected();
        boolean result6 = testSubject0.isObjectPropertyNameExpected();
        boolean result7 = testSubject0.isDataPropertyNameExpected();
        boolean result8 = testSubject0.isIndividualNameExpected();
        boolean result9 = testSubject0.isDatatypeNameExpected();
        boolean result10 = testSubject0.isAnnotationPropertyNameExpected();
        boolean result11 = testSubject0.isOntologyNameExpected();
        java.util.Set<java.lang.String> result12 = testSubject0.getExpectedKeywords();
        java.lang.String result13 = testSubject0.getCurrentToken();
        boolean result14 = testSubject0.isIntegerExpected();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result15 = testSubject0.fillInStackTrace();
        java.lang.Throwable result16 = testSubject0.getCause();
        java.lang.Throwable result17 = testSubject0.initCause(_Throwable);
        java.lang.String result18 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result19 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result20 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesShortFormEntityChecker() throws Exception {
        assertTrue(org.semanticweb.owlapi.expression.OWLEntityChecker.class
                .isAssignableFrom(ShortFormEntityChecker.class));
    }

    public void verifyShortFormEntityChecker() throws Exception {
        ShortFormEntityChecker testSubject0 = new ShortFormEntityChecker(
                _BidirectionalShortFormProvider);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass(_String);
        org.semanticweb.owlapi.model.OWLObjectProperty result1 = testSubject0
                .getOWLObjectProperty(_String);
        org.semanticweb.owlapi.model.OWLDataProperty result2 = testSubject0
                .getOWLDataProperty(_String);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result3 = testSubject0
                .getOWLAnnotationProperty(_String);
        org.semanticweb.owlapi.model.OWLDatatype result4 = testSubject0
                .getOWLDatatype(_String);
        org.semanticweb.owlapi.model.OWLNamedIndividual result5 = testSubject0
                .getOWLIndividual(_String);
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.List<java.lang.String> _List;
    private java.util.Set<java.lang.String> _Set;
    private org.semanticweb.owlapi.expression.OWLEntityChecker _OWLEntityChecker;
    private org.semanticweb.owlapi.util.BidirectionalShortFormProvider _BidirectionalShortFormProvider;
}
