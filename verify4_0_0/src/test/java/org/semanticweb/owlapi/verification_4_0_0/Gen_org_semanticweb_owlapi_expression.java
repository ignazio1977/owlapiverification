package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.expression.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unchecked", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_expression {
    @Test
    public void enforceInterfacesOWLClassExpressionParser() {
        assertTrue(org.semanticweb.owlapi.expression.OWLExpressionParser.class.isAssignableFrom(OWLClassExpressionParser.class));
    }

    public void verifyInterfaceOWLClassExpressionParser() {
        OWLClassExpressionParser testSubject0 = mock(OWLClassExpressionParser.class);
        OWLObject result0 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyInterfaceOWLEntityChecker() {
        OWLEntityChecker testSubject0 = mock(OWLEntityChecker.class);
        OWLClass result0 = testSubject0.getOWLClass(_String);
        OWLObjectProperty result1 = testSubject0.getOWLObjectProperty(_String);
        OWLDataProperty result2 = testSubject0.getOWLDataProperty(_String);
        OWLAnnotationProperty result3 = testSubject0.getOWLAnnotationProperty(_String);
        OWLDatatype result4 = testSubject0.getOWLDatatype(_String);
        OWLNamedIndividual result5 = testSubject0.getOWLIndividual(_String);
    }

    public void verifyInterfaceOWLExpressionParser() {
        OWLExpressionParser<OWLObject> testSubject0 = mock(OWLExpressionParser.class);
        OWLObject result0 = testSubject0.parse(_String);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
    }

    public void verifyInterfaceOWLOntologyChecker() {
        OWLOntologyChecker testSubject0 = mock(OWLOntologyChecker.class);
        OWLOntology result0 = testSubject0.getOntology(_String);
    }

    @Test
    public void enforceInterfacesShortFormEntityChecker() {
        assertTrue(org.semanticweb.owlapi.expression.OWLEntityChecker.class.isAssignableFrom(ShortFormEntityChecker.class));
    }

    public void verifyShortFormEntityChecker() {
        ShortFormEntityChecker testSubject0 = new ShortFormEntityChecker(_BidirectionalShortFormProvider);
        OWLClass result0 = testSubject0.getOWLClass(_String);
        OWLObjectProperty result1 = testSubject0.getOWLObjectProperty(_String);
        OWLDataProperty result2 = testSubject0.getOWLDataProperty(_String);
        OWLAnnotationProperty result3 = testSubject0.getOWLAnnotationProperty(_String);
        OWLDatatype result4 = testSubject0.getOWLDatatype(_String);
        OWLNamedIndividual result5 = testSubject0.getOWLIndividual(_String);
    }

    private java.lang.String _String;
    private org.semanticweb.owlapi.expression.OWLEntityChecker _OWLEntityChecker;
    private org.semanticweb.owlapi.util.BidirectionalShortFormProvider _BidirectionalShortFormProvider;
}
