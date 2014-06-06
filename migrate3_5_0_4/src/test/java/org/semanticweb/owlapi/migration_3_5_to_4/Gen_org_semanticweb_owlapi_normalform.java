package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.normalform.NegationalNormalFormConverter;
import org.semanticweb.owlapi.normalform.NormalFormRewriter;
import org.semanticweb.owlapi.normalform.OWLObjectComplementOfExtractor;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
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
        assertTrue(OWLClassExpressionVisitor.class.isAssignableFrom(OWLObjectComplementOfExtractor.class));
    }

    public void verifyOWLObjectComplementOfExtractor() {
        OWLObjectComplementOfExtractor testSubject0 = new OWLObjectComplementOfExtractor();
        testSubject0.reset();
        java.util.Set<OWLClassExpression> result0 = testSubject0.getComplementedClassExpressions(_OWLClassExpression);
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
