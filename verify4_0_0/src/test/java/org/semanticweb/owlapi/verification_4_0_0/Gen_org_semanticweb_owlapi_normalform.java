package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.normalform.NegationalNormalFormConverter;
import org.semanticweb.owlapi.normalform.NormalFormRewriter;
import org.semanticweb.owlapi.normalform.OWLObjectComplementOfExtractor;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_normalform {
    @Test
    public void enforceInterfacesNegationalNormalFormConverter() {
        assertTrue(org.semanticweb.owlapi.normalform.NormalFormRewriter.class.isAssignableFrom(NegationalNormalFormConverter.class));
    }

    public void verifyNegationalNormalFormConverter() {
        NegationalNormalFormConverter testSubject0 = new NegationalNormalFormConverter(_OWLDataFactory);
        boolean result0 = testSubject0.isInNormalForm(_OWLClassExpression);
        OWLClassExpression result1 = testSubject0.convertToNormalForm(_OWLClassExpression);
    }

    public void verifyInterfaceNormalFormRewriter() {
        NormalFormRewriter testSubject0 = mock(NormalFormRewriter.class);
        boolean result0 = testSubject0.isInNormalForm(_OWLClassExpression);
        OWLClassExpression result1 = testSubject0.convertToNormalForm(_OWLClassExpression);
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfExtractor() {
        assertTrue(org.semanticweb.owlapi.util.OWLClassExpressionVisitorAdapter.class.isAssignableFrom(OWLObjectComplementOfExtractor.class));
    }

    public void verifyOWLObjectComplementOfExtractor() {
        OWLObjectComplementOfExtractor testSubject0 = new OWLObjectComplementOfExtractor();
        testSubject0.reset();
        java.util.Set<OWLClassExpression> result0 = testSubject0.getComplementedClassExpressions(_OWLClassExpression);
    }

    private OWLClass _OWLClass;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
}
