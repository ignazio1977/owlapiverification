package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.normalform.NegationalNormalFormConverter;
import org.semanticweb.owlapi.normalform.NormalFormRewriter;
import org.semanticweb.owlapi.normalform.OWLObjectComplementOfExtractor;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_normalform {
    @Test
    public void enforceInterfacesNegationalNormalFormConverter() throws Exception {
        assertTrue(org.semanticweb.owlapi.normalform.NormalFormRewriter.class
                .isAssignableFrom(NegationalNormalFormConverter.class));
    }

    public void verifyNegationalNormalFormConverter() throws Exception {
        NegationalNormalFormConverter testSubject0 = new NegationalNormalFormConverter(
                _OWLDataFactory);
        boolean result0 = testSubject0.isInNormalForm(_OWLClassExpression);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .convertToNormalForm(_OWLClassExpression);
    }

    public void verifyInterfaceNormalFormRewriter() throws Exception {
        NormalFormRewriter testSubject0 = mock(NormalFormRewriter.class);
        boolean result0 = testSubject0.isInNormalForm(_OWLClassExpression);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .convertToNormalForm(_OWLClassExpression);
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfExtractor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitor.class
                .isAssignableFrom(OWLObjectComplementOfExtractor.class));
    }

    public void verifyOWLObjectComplementOfExtractor() throws Exception {
        OWLObjectComplementOfExtractor testSubject0 = new OWLObjectComplementOfExtractor();
        testSubject0.reset();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getComplementedClassExpressions(_OWLClassExpression);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
    }

    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLDataHasValue _OWLDataHasValue;
    private org.semanticweb.owlapi.model.OWLDataMaxCardinality _OWLDataMaxCardinality;
    private org.semanticweb.owlapi.model.OWLDataMinCardinality _OWLDataMinCardinality;
    private org.semanticweb.owlapi.model.OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectComplementOf _OWLObjectComplementOf;
    private org.semanticweb.owlapi.model.OWLObjectExactCardinality _OWLObjectExactCardinality;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectHasValue _OWLObjectHasValue;
    private org.semanticweb.owlapi.model.OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private org.semanticweb.owlapi.model.OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private org.semanticweb.owlapi.model.OWLObjectMinCardinality _OWLObjectMinCardinality;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectUnionOf _OWLObjectUnionOf;
}
