package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapitools.builders.*;

@SuppressWarnings({ "javadoc", "unchecked", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapitools_builders {
    @Test
    public void enforceInterfacesBaseAnnotationtPropertyBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseAnnotationtPropertyBuilder.class));
    }

    public void verifyBaseAnnotationtPropertyBuilder() {
        BaseAnnotationtPropertyBuilder<OWLObject, BuilderAnnotation> testSubject0 = mock(BaseAnnotationtPropertyBuilder.class);
        BuilderAnnotation result0 = testSubject0.withProperty(_OWLAnnotationProperty);
        List<OWLOntologyChange<?>> result1 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotation result2 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotation result3 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result4 = testSubject0.buildObject();
        java.lang.Object result5 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseBuilder() {
        assertTrue(Builder.class.isAssignableFrom(BaseBuilder.class));
    }

    public void verifyBaseBuilder() {
        BaseBuilder<OWLObject, BuilderAnnotation> testSubject0 = mock(BaseBuilder.class);
        List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotation result1 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotation result2 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result3 = testSubject0.buildObject();
        java.lang.Object result4 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseDataBuilder() {
        assertTrue(BaseDataPropertyBuilder.class.isAssignableFrom(BaseDataBuilder.class));
    }

    public void verifyBaseDataBuilder() {
        BaseDataBuilder<OWLObject, BuilderDataAllValuesFrom> testSubject0 = mock(BaseDataBuilder.class);
        BuilderDataAllValuesFrom result0 = testSubject0.withRange(_OWLDataRange);
        BuilderDataAllValuesFrom result1 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result2 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataAllValuesFrom result3 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataAllValuesFrom result4 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result5 = testSubject0.buildObject();
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseDataPropertyBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseDataPropertyBuilder.class));
    }

    public void verifyBaseDataPropertyBuilder() {
        BaseDataPropertyBuilder<OWLObject, BuilderDataAllValuesFrom> testSubject0 = mock(BaseDataPropertyBuilder.class);
        BuilderDataAllValuesFrom result0 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result1 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataAllValuesFrom result2 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataAllValuesFrom result3 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result4 = testSubject0.buildObject();
        java.lang.Object result5 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseDomainBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseDomainBuilder.class));
    }

    public void verifyBaseDomainBuilder() {
        BaseDomainBuilder<OWLObject, BuilderDataPropertyDomain, OWLObject> testSubject0 = mock(BaseDomainBuilder.class);
        BuilderDataPropertyDomain result0 = testSubject0.withProperty(_Object);
        BuilderDataPropertyDomain result1 = testSubject0.withDomain(_OWLClassExpression);
        List<OWLOntologyChange<?>> result2 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataPropertyDomain result3 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataPropertyDomain result4 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result5 = testSubject0.buildObject();
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseEntityBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseEntityBuilder.class));
    }

    public void verifyBaseEntityBuilder() {
        BaseEntityBuilder<OWLClass, BuilderClass> testSubject0 = mock(BaseEntityBuilder.class);
        BuilderClass result0 = testSubject0.withIRI(_IRI);
        BuilderClass result1 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderClass result2 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderClass result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderClass result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseObjectBuilder() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BaseObjectBuilder.class));
    }

    public void verifyBaseObjectBuilder() {
        BaseObjectBuilder<OWLObject, BuilderObjectPropertyRange> testSubject0 = mock(BaseObjectBuilder.class);
        BuilderObjectPropertyRange result0 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectPropertyRange result1 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result2 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectPropertyRange result3 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectPropertyRange result4 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result5 = testSubject0.buildObject();
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseObjectPropertyBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseObjectPropertyBuilder.class));
    }

    public void verifyBaseObjectPropertyBuilder() {
        BaseObjectPropertyBuilder<OWLObject, BuilderFunctionalObjectProperty> testSubject0 = mock(BaseObjectPropertyBuilder.class);
        BuilderFunctionalObjectProperty result0 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result1 = testSubject0.applyChanges(_OWLOntology);
        BuilderFunctionalObjectProperty result2 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderFunctionalObjectProperty result3 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result4 = testSubject0.buildObject();
        java.lang.Object result5 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseSetBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseSetBuilder.class));
    }

    public void verifyBaseSetBuilder() {
        BaseSetBuilder<OWLObject, BuilderOneOf, OWLClass> testSubject0 = mock(BaseSetBuilder.class);
        BuilderOneOf result0 = testSubject0.withItem(_Object13);
        BuilderOneOf result1 = testSubject0.withItems(_Object_array);
        BuilderOneOf result2 = testSubject0.withItems(_Collection15);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderOneOf result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderOneOf result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBaseSubBuilder() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BaseSubBuilder.class));
    }

    public void verifyBaseSubBuilder() {
        BaseSubBuilder<OWLObject, BuilderSubClass, OWLClassExpression> testSubject0 = mock(BaseSubBuilder.class);
        BuilderSubClass result0 = testSubject0.withSub(_Object13);
        BuilderSubClass result1 = testSubject0.withSup(_Object13);
        List<OWLOntologyChange<?>> result2 = testSubject0.applyChanges(_OWLOntology);
        BuilderSubClass result3 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSubClass result4 = testSubject0.withAnnotations(_Collection);
        OWLObject result5 = testSubject0.buildObject();
        OWLObject result6 = testSubject0.buildObject();
    }

    public void verifyInterfaceBuilder() {
        Builder<OWLObject> testSubject0 = mock(Builder.class);
        List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_OWLOntology);
        java.lang.Object result1 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAnnotation() {
        assertTrue(BaseAnnotationtPropertyBuilder.class.isAssignableFrom(BuilderAnnotation.class));
    }

    public void verifyBuilderAnnotation() {
        BuilderAnnotation testSubject0 = new BuilderAnnotation(_OWLDataFactory);
        BuilderAnnotation testSubject1 = new BuilderAnnotation(_OWLAnnotation, _OWLDataFactory);
        OWLAnnotation result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderAnnotation result2 = testSubject0.withValue(_OWLAnnotationValue);
        BuilderAnnotation result3 = testSubject0.withProperty(_OWLAnnotationProperty);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotation result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotation result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAnnotationAssertion() {
        assertTrue(BaseAnnotationtPropertyBuilder.class.isAssignableFrom(BuilderAnnotationAssertion.class));
    }

    public void verifyBuilderAnnotationAssertion() {
        BuilderAnnotationAssertion testSubject0 = new BuilderAnnotationAssertion(_OWLDataFactory);
        BuilderAnnotationAssertion testSubject1 = new BuilderAnnotationAssertion(_OWLAnnotationAssertionAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLAnnotationAssertionAxiom result1 = testSubject0.buildObject();
        BuilderAnnotationAssertion result2 = testSubject0.withValue(_OWLAnnotationValue);
        BuilderAnnotationAssertion result3 = testSubject0.withSubject(_OWLAnnotationSubject);
        BuilderAnnotationAssertion result4 = testSubject0.withProperty(_OWLAnnotationProperty);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotationAssertion result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotationAssertion result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAnnotationProperty() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderAnnotationProperty.class));
    }

    public void verifyBuilderAnnotationProperty() {
        BuilderAnnotationProperty testSubject0 = new BuilderAnnotationProperty(_OWLDataFactory);
        BuilderAnnotationProperty testSubject1 = new BuilderAnnotationProperty(_OWLAnnotationProperty, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLAnnotationProperty result1 = testSubject0.buildObject();
        BuilderAnnotationProperty result2 = testSubject0.withIRI(_IRI);
        BuilderAnnotationProperty result3 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderAnnotationProperty result4 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotationProperty result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotationProperty result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAnnotationPropertyDomain() {
        assertTrue(BaseAnnotationtPropertyBuilder.class.isAssignableFrom(BuilderAnnotationPropertyDomain.class));
    }

    public void verifyBuilderAnnotationPropertyDomain() {
        BuilderAnnotationPropertyDomain testSubject0 = new BuilderAnnotationPropertyDomain(_OWLDataFactory);
        BuilderAnnotationPropertyDomain testSubject1 = new BuilderAnnotationPropertyDomain(_OWLAnnotationPropertyDomainAxiom, _OWLDataFactory);
        OWLAnnotationPropertyDomainAxiom result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderAnnotationPropertyDomain result2 = testSubject0.withDomain(_IRI);
        BuilderAnnotationPropertyDomain result3 = testSubject0.withProperty(_OWLAnnotationProperty);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotationPropertyDomain result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotationPropertyDomain result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAnnotationPropertyRange() {
        assertTrue(BaseAnnotationtPropertyBuilder.class.isAssignableFrom(BuilderAnnotationPropertyRange.class));
    }

    public void verifyBuilderAnnotationPropertyRange() {
        BuilderAnnotationPropertyRange testSubject0 = new BuilderAnnotationPropertyRange(_OWLDataFactory);
        BuilderAnnotationPropertyRange testSubject1 = new BuilderAnnotationPropertyRange(_OWLAnnotationPropertyRangeAxiom, _OWLDataFactory);
        OWLAnnotationPropertyRangeAxiom result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderAnnotationPropertyRange result2 = testSubject0.withRange(_IRI);
        BuilderAnnotationPropertyRange result3 = testSubject0.withProperty(_OWLAnnotationProperty);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnnotationPropertyRange result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnnotationPropertyRange result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAnonymousIndividual() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderAnonymousIndividual.class));
    }

    public void verifyBuilderAnonymousIndividual() {
        BuilderAnonymousIndividual testSubject0 = new BuilderAnonymousIndividual(_OWLDataFactory);
        BuilderAnonymousIndividual testSubject1 = new BuilderAnonymousIndividual(_OWLAnonymousIndividual, _OWLDataFactory);
        OWLAnonymousIndividual result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderAnonymousIndividual result2 = testSubject0.withId(_String);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderAnonymousIndividual result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAnonymousIndividual result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderAsymmetricObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderAsymmetricObjectProperty.class));
    }

    public void verifyBuilderAsymmetricObjectProperty() {
        BuilderAsymmetricObjectProperty testSubject0 = new BuilderAsymmetricObjectProperty(_OWLDataFactory);
        BuilderAsymmetricObjectProperty testSubject1 = new BuilderAsymmetricObjectProperty(_OWLAsymmetricObjectPropertyAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLAsymmetricObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderAsymmetricObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderAsymmetricObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderAsymmetricObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderClass() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderClass.class));
    }

    public void verifyBuilderClass() {
        BuilderClass testSubject0 = new BuilderClass(_OWLDataFactory);
        BuilderClass testSubject1 = new BuilderClass(_OWLClass, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLClass result1 = testSubject0.buildObject();
        BuilderClass result2 = testSubject0.withIRI(_IRI);
        BuilderClass result3 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderClass result4 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderClass result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderClass result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderClassAssertion() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderClassAssertion.class));
    }

    public void verifyBuilderClassAssertion() {
        BuilderClassAssertion testSubject0 = new BuilderClassAssertion(_OWLDataFactory);
        BuilderClassAssertion testSubject1 = new BuilderClassAssertion(_OWLClassAssertionAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLClassAssertionAxiom result1 = testSubject0.buildObject();
        BuilderClassAssertion result2 = testSubject0.withClass(_OWLClassExpression);
        BuilderClassAssertion result3 = testSubject0.withIndividual(_OWLIndividual);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderClassAssertion result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderClassAssertion result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderComplementOf() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderComplementOf.class));
    }

    public void verifyBuilderComplementOf() {
        BuilderComplementOf testSubject0 = new BuilderComplementOf(_OWLDataFactory);
        BuilderComplementOf testSubject1 = new BuilderComplementOf(_OWLObjectComplementOf, _OWLDataFactory);
        OWLObjectComplementOf result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderComplementOf result2 = testSubject0.withClass(_OWLClassExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderComplementOf result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderComplementOf result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataAllValuesFrom() {
        assertTrue(BaseDataBuilder.class.isAssignableFrom(BuilderDataAllValuesFrom.class));
    }

    public void verifyBuilderDataAllValuesFrom() {
        BuilderDataAllValuesFrom testSubject0 = new BuilderDataAllValuesFrom(_OWLDataFactory);
        BuilderDataAllValuesFrom testSubject1 = new BuilderDataAllValuesFrom(_OWLDataAllValuesFrom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataAllValuesFrom result1 = testSubject0.buildObject();
        BuilderDataAllValuesFrom result2 = testSubject0.withRange(_OWLDataRange);
        BuilderDataAllValuesFrom result3 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataAllValuesFrom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataAllValuesFrom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataComplementOf() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderDataComplementOf.class));
    }

    public void verifyBuilderDataComplementOf() {
        BuilderDataComplementOf testSubject0 = new BuilderDataComplementOf(_OWLDataFactory);
        BuilderDataComplementOf testSubject1 = new BuilderDataComplementOf(_OWLDataComplementOf, _OWLDataFactory);
        OWLDataComplementOf result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDataComplementOf result2 = testSubject0.withRange(_OWLDataRange);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataComplementOf result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataComplementOf result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataExactCardinality() {
        assertTrue(BaseDataBuilder.class.isAssignableFrom(BuilderDataExactCardinality.class));
    }

    public void verifyBuilderDataExactCardinality() {
        BuilderDataExactCardinality testSubject0 = new BuilderDataExactCardinality(_OWLDataFactory);
        BuilderDataExactCardinality testSubject1 = new BuilderDataExactCardinality(_OWLDataExactCardinality, _OWLDataFactory);
        OWLDataExactCardinality result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDataExactCardinality result2 = testSubject0.withCardinality(_int);
        BuilderDataExactCardinality result3 = testSubject0.withRange(_OWLDataRange);
        BuilderDataExactCardinality result4 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataExactCardinality result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataExactCardinality result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataHasValue() {
        assertTrue(BaseDataPropertyBuilder.class.isAssignableFrom(BuilderDataHasValue.class));
    }

    public void verifyBuilderDataHasValue() {
        BuilderDataHasValue testSubject0 = new BuilderDataHasValue(_OWLDataFactory);
        BuilderDataHasValue testSubject1 = new BuilderDataHasValue(_OWLDataHasValue, _OWLDataFactory);
        OWLDataHasValue result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDataHasValue result2 = testSubject0.withLiteral(_OWLLiteral);
        BuilderDataHasValue result3 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataHasValue result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataHasValue result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataIntersectionOf() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDataIntersectionOf.class));
    }

    public void verifyBuilderDataIntersectionOf() {
        BuilderDataIntersectionOf testSubject0 = new BuilderDataIntersectionOf(_OWLDataFactory);
        BuilderDataIntersectionOf testSubject1 = new BuilderDataIntersectionOf(_OWLDataIntersectionOf, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataIntersectionOf result1 = testSubject0.buildObject();
        BuilderDataIntersectionOf result2 = testSubject0.withItem(_OWLDataRange);
        BuilderDataIntersectionOf result3 = testSubject0.withItems(Arrays.asList(_OWLDataRange));
        BuilderDataIntersectionOf result4 = testSubject0.withItems(_OWLDataRange, _OWLDataRange);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataIntersectionOf result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataIntersectionOf result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataMaxCardinality() {
        assertTrue(BaseDataBuilder.class.isAssignableFrom(BuilderDataMaxCardinality.class));
    }

    public void verifyBuilderDataMaxCardinality() {
        BuilderDataMaxCardinality testSubject0 = new BuilderDataMaxCardinality(_OWLDataFactory);
        BuilderDataMaxCardinality testSubject1 = new BuilderDataMaxCardinality(_OWLDataMaxCardinality, _OWLDataFactory);
        OWLDataMaxCardinality result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDataMaxCardinality result2 = testSubject0.withCardinality(_int);
        BuilderDataMaxCardinality result3 = testSubject0.withRange(_OWLDataRange);
        BuilderDataMaxCardinality result4 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataMaxCardinality result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataMaxCardinality result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataMinCardinality() {
        assertTrue(BaseDataBuilder.class.isAssignableFrom(BuilderDataMinCardinality.class));
    }

    public void verifyBuilderDataMinCardinality() {
        BuilderDataMinCardinality testSubject0 = new BuilderDataMinCardinality(_OWLDataFactory);
        BuilderDataMinCardinality testSubject1 = new BuilderDataMinCardinality(_OWLDataMinCardinality, _OWLDataFactory);
        OWLDataMinCardinality result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDataMinCardinality result2 = testSubject0.withCardinality(_int);
        BuilderDataMinCardinality result3 = testSubject0.withRange(_OWLDataRange);
        BuilderDataMinCardinality result4 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataMinCardinality result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataMinCardinality result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataOneOf() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDataOneOf.class));
    }

    public void verifyBuilderDataOneOf() {
        BuilderDataOneOf testSubject0 = new BuilderDataOneOf(_OWLDataFactory);
        BuilderDataOneOf testSubject1 = new BuilderDataOneOf(_OWLDataOneOf, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataOneOf result1 = testSubject0.buildObject();
        BuilderDataOneOf result2 = testSubject0.withItem(_OWLLiteral);
        BuilderDataOneOf result3 = testSubject0.withItems(_OWLLiteral, _OWLLiteral);
        BuilderDataOneOf result4 = testSubject0.withItems(Arrays.asList(_OWLLiteral));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataOneOf result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataOneOf result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataProperty() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderDataProperty.class));
    }

    public void verifyBuilderDataProperty() {
        BuilderDataProperty testSubject0 = new BuilderDataProperty(_OWLDataFactory);
        BuilderDataProperty testSubject1 = new BuilderDataProperty(_OWLDataProperty, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataProperty result1 = testSubject0.buildObject();
        BuilderDataProperty result2 = testSubject0.withIRI(_IRI);
        BuilderDataProperty result3 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderDataProperty result4 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataProperty result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataProperty result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataPropertyAssertion() {
        assertTrue(BaseDataPropertyBuilder.class.isAssignableFrom(BuilderDataPropertyAssertion.class));
    }

    public void verifyBuilderDataPropertyAssertion() {
        BuilderDataPropertyAssertion testSubject0 = new BuilderDataPropertyAssertion(_OWLDataFactory);
        BuilderDataPropertyAssertion testSubject1 = new BuilderDataPropertyAssertion(_OWLDataPropertyAssertionAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataPropertyAssertionAxiom result1 = testSubject0.buildObject();
        BuilderDataPropertyAssertion result2 = testSubject0.withValue(_OWLLiteral);
        BuilderDataPropertyAssertion result3 = testSubject0.withSubject(_OWLIndividual);
        BuilderDataPropertyAssertion result4 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataPropertyAssertion result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataPropertyAssertion result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataPropertyDomain() {
        assertTrue(BaseDomainBuilder.class.isAssignableFrom(BuilderDataPropertyDomain.class));
    }

    public void verifyBuilderDataPropertyDomain() {
        BuilderDataPropertyDomain testSubject0 = new BuilderDataPropertyDomain(_OWLDataFactory);
        BuilderDataPropertyDomain testSubject1 = new BuilderDataPropertyDomain(_OWLDataPropertyDomainAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataPropertyDomainAxiom result1 = testSubject0.buildObject();
        BuilderDataPropertyDomain result2 = testSubject0.withProperty(_OWLDataProperty);
        BuilderDataPropertyDomain result3 = testSubject0.withDomain(_OWLClassExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataPropertyDomain result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataPropertyDomain result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataPropertyRange() {
        assertTrue(BaseDataBuilder.class.isAssignableFrom(BuilderDataPropertyRange.class));
    }

    public void verifyBuilderDataPropertyRange() {
        BuilderDataPropertyRange testSubject0 = new BuilderDataPropertyRange(_OWLDataFactory);
        BuilderDataPropertyRange testSubject1 = new BuilderDataPropertyRange(_OWLDataPropertyRangeAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataPropertyRangeAxiom result1 = testSubject0.buildObject();
        BuilderDataPropertyRange result2 = testSubject0.withRange(_OWLDataRange);
        BuilderDataPropertyRange result3 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataPropertyRange result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataPropertyRange result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataSomeValuesFrom() {
        assertTrue(BaseDataBuilder.class.isAssignableFrom(BuilderDataSomeValuesFrom.class));
    }

    public void verifyBuilderDataSomeValuesFrom() {
        BuilderDataSomeValuesFrom testSubject0 = new BuilderDataSomeValuesFrom(_OWLDataFactory);
        BuilderDataSomeValuesFrom testSubject1 = new BuilderDataSomeValuesFrom(_OWLDataSomeValuesFrom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataSomeValuesFrom result1 = testSubject0.buildObject();
        BuilderDataSomeValuesFrom result2 = testSubject0.withRange(_OWLDataRange);
        BuilderDataSomeValuesFrom result3 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataSomeValuesFrom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataSomeValuesFrom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDatatype() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderDatatype.class));
    }

    public void verifyBuilderDatatype() {
        BuilderDatatype testSubject0 = new BuilderDatatype(_OWLDatatype, _OWLDataFactory);
        BuilderDatatype testSubject1 = new BuilderDatatype(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDatatype result1 = testSubject0.buildObject();
        BuilderDatatype result2 = testSubject0.withIRI(_IRI);
        BuilderDatatype result3 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderDatatype result4 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDatatype result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDatatype result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDatatypeDefinition() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderDatatypeDefinition.class));
    }

    public void verifyBuilderDatatypeDefinition() {
        BuilderDatatypeDefinition testSubject0 = new BuilderDatatypeDefinition(_OWLDatatypeDefinitionAxiom, _OWLDataFactory);
        BuilderDatatypeDefinition testSubject1 = new BuilderDatatypeDefinition(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDatatypeDefinitionAxiom result1 = testSubject0.buildObject();
        BuilderDatatypeDefinition result2 = testSubject0.withType(_OWLDataRange);
        BuilderDatatypeDefinition result3 = testSubject0.with(_OWLDatatype);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderDatatypeDefinition result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDatatypeDefinition result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDatatypeRestriction() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDatatypeRestriction.class));
    }

    public void verifyBuilderDatatypeRestriction() {
        BuilderDatatypeRestriction testSubject0 = new BuilderDatatypeRestriction(_OWLDatatypeRestriction, _OWLDataFactory);
        BuilderDatatypeRestriction testSubject1 = new BuilderDatatypeRestriction(_OWLDataFactory);
        OWLDatatypeRestriction result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDatatypeRestriction result2 = testSubject0.withDatatype(_OWLDatatype);
        BuilderDatatypeRestriction result3 = testSubject0.withItem(_OWLFacetRestriction);
        BuilderDatatypeRestriction result4 = testSubject0.withItems(_OWLFacetRestriction, _OWLFacetRestriction);
        BuilderDatatypeRestriction result5 = testSubject0.withItems(Arrays.asList(_OWLFacetRestriction));
        List<OWLOntologyChange<?>> result6 = testSubject0.applyChanges(_OWLOntology);
        BuilderDatatypeRestriction result7 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDatatypeRestriction result8 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result9 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDataUnionOf() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDataUnionOf.class));
    }

    public void verifyBuilderDataUnionOf() {
        BuilderDataUnionOf testSubject0 = new BuilderDataUnionOf(_OWLDataUnionOf, _OWLDataFactory);
        BuilderDataUnionOf testSubject1 = new BuilderDataUnionOf(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDataUnionOf result1 = testSubject0.buildObject();
        BuilderDataUnionOf result2 = testSubject0.withItem(_OWLDataRange);
        BuilderDataUnionOf result3 = testSubject0.withItems(_OWLDataRange, _OWLDataRange);
        BuilderDataUnionOf result4 = testSubject0.withItems(Arrays.asList(_OWLDataRange));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDataUnionOf result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDataUnionOf result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDeclaration() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderDeclaration.class));
    }

    public void verifyBuilderDeclaration() {
        BuilderDeclaration testSubject0 = new BuilderDeclaration(_OWLDeclarationAxiom, _OWLDataFactory);
        BuilderDeclaration testSubject1 = new BuilderDeclaration(_OWLDataFactory);
        OWLDeclarationAxiom result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDeclaration result2 = testSubject0.withEntity(_OWLEntity);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderDeclaration result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDeclaration result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDifferentIndividuals() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDifferentIndividuals.class));
    }

    public void verifyBuilderDifferentIndividuals() {
        BuilderDifferentIndividuals testSubject0 = new BuilderDifferentIndividuals(_OWLDifferentIndividualsAxiom, _OWLDataFactory);
        BuilderDifferentIndividuals testSubject1 = new BuilderDifferentIndividuals(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDifferentIndividualsAxiom result1 = testSubject0.buildObject();
        BuilderDifferentIndividuals result2 = testSubject0.withItem(_OWLIndividual);
        BuilderDifferentIndividuals result3 = testSubject0.withItems(_OWLIndividual, _OWLIndividual);
        BuilderDifferentIndividuals result4 = testSubject0.withItems(Arrays.asList(_OWLIndividual));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDifferentIndividuals result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDifferentIndividuals result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDisjointClasses() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDisjointClasses.class));
    }

    public void verifyBuilderDisjointClasses() {
        BuilderDisjointClasses testSubject0 = new BuilderDisjointClasses(_OWLDisjointClassesAxiom, _OWLDataFactory);
        BuilderDisjointClasses testSubject1 = new BuilderDisjointClasses(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDisjointClassesAxiom result1 = testSubject0.buildObject();
        BuilderDisjointClasses result2 = testSubject0.withItem(_Object13);
        BuilderDisjointClasses result3 = testSubject0.withItems(_Object_array);
        BuilderDisjointClasses result4 = testSubject0.withItems(_Collection15);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDisjointClasses result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDisjointClasses result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDisjointDataProperties() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDisjointDataProperties.class));
    }

    public void verifyBuilderDisjointDataProperties() {
        BuilderDisjointDataProperties testSubject0 = new BuilderDisjointDataProperties(_OWLDisjointDataPropertiesAxiom, _OWLDataFactory);
        BuilderDisjointDataProperties testSubject1 = new BuilderDisjointDataProperties(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDisjointDataPropertiesAxiom result1 = testSubject0.buildObject();
        BuilderDisjointDataProperties result2 = testSubject0.withItem(_OWLDataProperty);
        BuilderDisjointDataProperties result3 = testSubject0.withItems(_OWLDataProperty, _OWLDataProperty);
        BuilderDisjointDataProperties result4 = testSubject0.withItems(Arrays.asList(_OWLDataProperty));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDisjointDataProperties result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDisjointDataProperties result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDisjointObjectProperties() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDisjointObjectProperties.class));
    }

    public void verifyBuilderDisjointObjectProperties() {
        BuilderDisjointObjectProperties testSubject0 = new BuilderDisjointObjectProperties(_OWLDisjointObjectPropertiesAxiom, _OWLDataFactory);
        BuilderDisjointObjectProperties testSubject1 = new BuilderDisjointObjectProperties(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLDisjointObjectPropertiesAxiom result1 = testSubject0.buildObject();
        BuilderDisjointObjectProperties result2 = testSubject0.withItem(_Object);
        BuilderDisjointObjectProperties result3 = testSubject0.withItems(_Object, _Object);
        BuilderDisjointObjectProperties result4 = testSubject0.withItems(Arrays.asList(_Object));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderDisjointObjectProperties result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDisjointObjectProperties result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderDisjointUnion() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderDisjointUnion.class));
    }

    public void verifyBuilderDisjointUnion() {
        BuilderDisjointUnion testSubject0 = new BuilderDisjointUnion(_OWLDisjointUnionAxiom, _OWLDataFactory);
        BuilderDisjointUnion testSubject1 = new BuilderDisjointUnion(_OWLDataFactory);
        OWLDisjointUnionAxiom result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderDisjointUnion result2 = testSubject0.withClass(_OWLClass);
        BuilderDisjointUnion result3 = testSubject0.withItem(_Object13);
        BuilderDisjointUnion result4 = testSubject0.withItems(_Object_array);
        BuilderDisjointUnion result5 = testSubject0.withItems(_Collection15);
        List<OWLOntologyChange<?>> result6 = testSubject0.applyChanges(_OWLOntology);
        BuilderDisjointUnion result7 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderDisjointUnion result8 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result9 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderEntity() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderEntity.class));
    }

    public void verifyBuilderEntity() {
        BuilderEntity testSubject0 = new BuilderEntity(_OWLDataFactory);
        BuilderEntity testSubject1 = new BuilderEntity(_OWLClass, _OWLDataFactory);
        OWLEntity result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderEntity result2 = testSubject0.withType(_EntityType);
        BuilderEntity result3 = testSubject0.withIRI(_IRI);
        BuilderEntity result4 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderEntity result5 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result6 = testSubject0.applyChanges(_OWLOntology);
        BuilderEntity result7 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderEntity result8 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result9 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderEquivalentClasses() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderEquivalentClasses.class));
    }

    public void verifyBuilderEquivalentClasses() {
        BuilderEquivalentClasses testSubject0 = new BuilderEquivalentClasses(_OWLDataFactory);
        BuilderEquivalentClasses testSubject1 = new BuilderEquivalentClasses(_OWLEquivalentClassesAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLEquivalentClassesAxiom result1 = testSubject0.buildObject();
        BuilderEquivalentClasses result2 = testSubject0.withItem(_Object13);
        BuilderEquivalentClasses result3 = testSubject0.withItems(_Object_array);
        BuilderEquivalentClasses result4 = testSubject0.withItems(_Collection15);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderEquivalentClasses result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderEquivalentClasses result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderEquivalentDataProperties() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderEquivalentDataProperties.class));
    }

    public void verifyBuilderEquivalentDataProperties() {
        BuilderEquivalentDataProperties testSubject0 = new BuilderEquivalentDataProperties(_OWLEquivalentDataPropertiesAxiom, _OWLDataFactory);
        BuilderEquivalentDataProperties testSubject1 = new BuilderEquivalentDataProperties(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLEquivalentDataPropertiesAxiom result1 = testSubject0.buildObject();
        BuilderEquivalentDataProperties result2 = testSubject0.withItem(_OWLDataProperty);
        BuilderEquivalentDataProperties result3 = testSubject0.withItems(_OWLDataProperty, _OWLDataProperty);
        BuilderEquivalentDataProperties result4 = testSubject0.withItems(Arrays.asList(_OWLDataProperty));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderEquivalentDataProperties result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderEquivalentDataProperties result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderEquivalentObjectProperties() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderEquivalentObjectProperties.class));
    }

    public void verifyBuilderEquivalentObjectProperties() {
        BuilderEquivalentObjectProperties testSubject0 = new BuilderEquivalentObjectProperties(_OWLEquivalentObjectPropertiesAxiom, _OWLDataFactory);
        BuilderEquivalentObjectProperties testSubject1 = new BuilderEquivalentObjectProperties(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLEquivalentObjectPropertiesAxiom result1 = testSubject0.buildObject();
        BuilderEquivalentObjectProperties result2 = testSubject0.withItem(_Object);
        BuilderEquivalentObjectProperties result3 = testSubject0.withItems(_Object, _Object);
        BuilderEquivalentObjectProperties result4 = testSubject0.withItems(Arrays.asList(_Object));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderEquivalentObjectProperties result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderEquivalentObjectProperties result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderFacetRestriction() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderFacetRestriction.class));
    }

    public void verifyBuilderFacetRestriction() {
        BuilderFacetRestriction testSubject0 = new BuilderFacetRestriction(_OWLFacetRestriction, _OWLDataFactory);
        BuilderFacetRestriction testSubject1 = new BuilderFacetRestriction(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLFacetRestriction result1 = testSubject0.buildObject();
        BuilderFacetRestriction result2 = testSubject0.withLiteral(_int);
        BuilderFacetRestriction result3 = testSubject0.withLiteral(_double);
        BuilderFacetRestriction result4 = testSubject0.withLiteral(_float);
        BuilderFacetRestriction result5 = testSubject0.withLiteral(_OWLLiteral);
        BuilderFacetRestriction result6 = testSubject0.withFacet(_OWLFacet);
        List<OWLOntologyChange<?>> result7 = testSubject0.applyChanges(_OWLOntology);
        BuilderFacetRestriction result8 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderFacetRestriction result9 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result10 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderFunctionalDataProperty() {
        assertTrue(BaseDataPropertyBuilder.class.isAssignableFrom(BuilderFunctionalDataProperty.class));
    }

    public void verifyBuilderFunctionalDataProperty() {
        BuilderFunctionalDataProperty testSubject0 = new BuilderFunctionalDataProperty(_OWLFunctionalDataPropertyAxiom, _OWLDataFactory);
        BuilderFunctionalDataProperty testSubject1 = new BuilderFunctionalDataProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLFunctionalDataPropertyAxiom result1 = testSubject0.buildObject();
        BuilderFunctionalDataProperty result2 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderFunctionalDataProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderFunctionalDataProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderFunctionalObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderFunctionalObjectProperty.class));
    }

    public void verifyBuilderFunctionalObjectProperty() {
        BuilderFunctionalObjectProperty testSubject0 = new BuilderFunctionalObjectProperty(_OWLFunctionalObjectPropertyAxiom, _OWLDataFactory);
        BuilderFunctionalObjectProperty testSubject1 = new BuilderFunctionalObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLFunctionalObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderFunctionalObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderFunctionalObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderFunctionalObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderHasKey() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderHasKey.class));
    }

    public void verifyBuilderHasKey() {
        BuilderHasKey testSubject0 = new BuilderHasKey(_OWLHasKeyAxiom, _OWLDataFactory);
        BuilderHasKey testSubject1 = new BuilderHasKey(_OWLDataFactory);
        OWLHasKeyAxiom result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderHasKey result2 = testSubject0.withClass(_OWLClassExpression);
        BuilderHasKey result3 = testSubject0.withItem(_Object);
        BuilderHasKey result4 = testSubject0.withItems(_Object, _OWLDataProperty);
        BuilderHasKey result5 = testSubject0.withItems(Arrays.asList(_Object, _OWLDataProperty));
        List<OWLOntologyChange<?>> result6 = testSubject0.applyChanges(_OWLOntology);
        BuilderHasKey result7 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderHasKey result8 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result9 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderImportsDeclaration() {
        assertTrue(Builder.class.isAssignableFrom(BuilderImportsDeclaration.class));
    }

    public void verifyBuilderImportsDeclaration() {
        BuilderImportsDeclaration testSubject0 = new BuilderImportsDeclaration(_OWLImportsDeclaration, _OWLDataFactory);
        BuilderImportsDeclaration testSubject1 = new BuilderImportsDeclaration(_OWLDataFactory);
        List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_OWLOntology);
        java.lang.Object result1 = testSubject0.buildObject();
        OWLImportsDeclaration result2 = testSubject0.buildObject();
        BuilderImportsDeclaration result3 = testSubject0.withImportedOntology(_IRI);
    }

    @Test
    public void enforceInterfacesBuilderInverseFunctionalObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderInverseFunctionalObjectProperty.class));
    }

    public void verifyBuilderInverseFunctionalObjectProperty() {
        BuilderInverseFunctionalObjectProperty testSubject0 = new BuilderInverseFunctionalObjectProperty(_OWLInverseFunctionalObjectPropertyAxiom, _OWLDataFactory);
        BuilderInverseFunctionalObjectProperty testSubject1 = new BuilderInverseFunctionalObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLInverseFunctionalObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderInverseFunctionalObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderInverseFunctionalObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderInverseFunctionalObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderInverseObjectProperties() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderInverseObjectProperties.class));
    }

    public void verifyBuilderInverseObjectProperties() {
        BuilderInverseObjectProperties testSubject0 = new BuilderInverseObjectProperties(_OWLInverseObjectPropertiesAxiom, _OWLDataFactory);
        BuilderInverseObjectProperties testSubject1 = new BuilderInverseObjectProperties(_OWLDataFactory);
        OWLInverseObjectPropertiesAxiom result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderInverseObjectProperties result2 = testSubject0.withInverseProperty(_OWLObjectPropertyExpression);
        BuilderInverseObjectProperties result3 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderInverseObjectProperties result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderInverseObjectProperties result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderIrreflexiveObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderIrreflexiveObjectProperty.class));
    }

    public void verifyBuilderIrreflexiveObjectProperty() {
        BuilderIrreflexiveObjectProperty testSubject0 = new BuilderIrreflexiveObjectProperty(_OWLIrreflexiveObjectPropertyAxiom, _OWLDataFactory);
        BuilderIrreflexiveObjectProperty testSubject1 = new BuilderIrreflexiveObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLIrreflexiveObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderIrreflexiveObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderIrreflexiveObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderIrreflexiveObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderLiteral() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderLiteral.class));
    }

    public void verifyBuilderLiteral() {
        BuilderLiteral testSubject0 = new BuilderLiteral(_OWLLiteral, _OWLDataFactory);
        BuilderLiteral testSubject1 = new BuilderLiteral(_OWLDataFactory);
        OWLLiteral result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderLiteral result2 = testSubject0.withLanguage(_String);
        BuilderLiteral result3 = testSubject0.withLiteralForm(_String);
        BuilderLiteral result4 = testSubject0.withValue(_int);
        BuilderLiteral result5 = testSubject0.withValue(_boolean);
        BuilderLiteral result6 = testSubject0.withValue(_float);
        BuilderLiteral result7 = testSubject0.withValue(_double);
        BuilderLiteral result8 = testSubject0.withDatatype(_OWLDatatype);
        BuilderLiteral result9 = testSubject0.withDatatype(_OWL2Datatype);
        List<OWLOntologyChange<?>> result10 = testSubject0.applyChanges(_OWLOntology);
        BuilderLiteral result11 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderLiteral result12 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result13 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderNamedIndividual() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderNamedIndividual.class));
    }

    public void verifyBuilderNamedIndividual() {
        BuilderNamedIndividual testSubject0 = new BuilderNamedIndividual(_OWLNamedIndividual, _OWLDataFactory);
        BuilderNamedIndividual testSubject1 = new BuilderNamedIndividual(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLNamedIndividual result1 = testSubject0.buildObject();
        BuilderNamedIndividual result2 = testSubject0.withIRI(_IRI);
        BuilderNamedIndividual result3 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderNamedIndividual result4 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderNamedIndividual result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderNamedIndividual result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderNegativeDataPropertyAssertion() {
        assertTrue(BaseDataPropertyBuilder.class.isAssignableFrom(BuilderNegativeDataPropertyAssertion.class));
    }

    public void verifyBuilderNegativeDataPropertyAssertion() {
        BuilderNegativeDataPropertyAssertion testSubject0 = new BuilderNegativeDataPropertyAssertion(_OWLNegativeDataPropertyAssertionAxiom, _OWLDataFactory);
        BuilderNegativeDataPropertyAssertion testSubject1 = new BuilderNegativeDataPropertyAssertion(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLNegativeDataPropertyAssertionAxiom result1 = testSubject0.buildObject();
        BuilderNegativeDataPropertyAssertion result2 = testSubject0.withValue(_OWLLiteral);
        BuilderNegativeDataPropertyAssertion result3 = testSubject0.withSubject(_OWLIndividual);
        BuilderNegativeDataPropertyAssertion result4 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderNegativeDataPropertyAssertion result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderNegativeDataPropertyAssertion result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderNegativeObjectPropertyAssertion() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderNegativeObjectPropertyAssertion.class));
    }

    public void verifyBuilderNegativeObjectPropertyAssertion() {
        BuilderNegativeObjectPropertyAssertion testSubject0 = new BuilderNegativeObjectPropertyAssertion(_OWLNegativeObjectPropertyAssertionAxiom, _OWLDataFactory);
        BuilderNegativeObjectPropertyAssertion testSubject1 = new BuilderNegativeObjectPropertyAssertion(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLNegativeObjectPropertyAssertionAxiom result1 = testSubject0.buildObject();
        BuilderNegativeObjectPropertyAssertion result2 = testSubject0.withValue(_OWLIndividual);
        BuilderNegativeObjectPropertyAssertion result3 = testSubject0.withSubject(_OWLIndividual);
        BuilderNegativeObjectPropertyAssertion result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderNegativeObjectPropertyAssertion result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderNegativeObjectPropertyAssertion result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectAllValuesFrom() {
        assertTrue(BaseObjectBuilder.class.isAssignableFrom(BuilderObjectAllValuesFrom.class));
    }

    public void verifyBuilderObjectAllValuesFrom() {
        BuilderObjectAllValuesFrom testSubject0 = new BuilderObjectAllValuesFrom(_OWLObjectAllValuesFrom, _OWLDataFactory);
        BuilderObjectAllValuesFrom testSubject1 = new BuilderObjectAllValuesFrom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectAllValuesFrom result1 = testSubject0.buildObject();
        BuilderObjectAllValuesFrom result2 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectAllValuesFrom result3 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectAllValuesFrom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectAllValuesFrom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectExactCardinality() {
        assertTrue(BaseObjectBuilder.class.isAssignableFrom(BuilderObjectExactCardinality.class));
    }

    public void verifyBuilderObjectExactCardinality() {
        BuilderObjectExactCardinality testSubject0 = new BuilderObjectExactCardinality(_OWLObjectExactCardinality, _OWLDataFactory);
        BuilderObjectExactCardinality testSubject1 = new BuilderObjectExactCardinality(_OWLDataFactory);
        OWLObjectExactCardinality result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderObjectExactCardinality result2 = testSubject0.withCardinality(_int);
        BuilderObjectExactCardinality result3 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectExactCardinality result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectExactCardinality result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectExactCardinality result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectHasSelf() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderObjectHasSelf.class));
    }

    public void verifyBuilderObjectHasSelf() {
        BuilderObjectHasSelf testSubject0 = new BuilderObjectHasSelf(_OWLObjectHasSelf, _OWLDataFactory);
        BuilderObjectHasSelf testSubject1 = new BuilderObjectHasSelf(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectHasSelf result1 = testSubject0.buildObject();
        BuilderObjectHasSelf result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectHasSelf result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectHasSelf result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectHasValue() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderObjectHasValue.class));
    }

    public void verifyBuilderObjectHasValue() {
        BuilderObjectHasValue testSubject0 = new BuilderObjectHasValue(_OWLObjectHasValue, _OWLDataFactory);
        BuilderObjectHasValue testSubject1 = new BuilderObjectHasValue(_OWLDataFactory);
        OWLObjectHasValue result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderObjectHasValue result2 = testSubject0.withValue(_OWLIndividual);
        BuilderObjectHasValue result3 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectHasValue result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectHasValue result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectIntersectionOf() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderObjectIntersectionOf.class));
    }

    public void verifyBuilderObjectIntersectionOf() {
        BuilderObjectIntersectionOf testSubject0 = new BuilderObjectIntersectionOf(_OWLObjectIntersectionOf, _OWLDataFactory);
        BuilderObjectIntersectionOf testSubject1 = new BuilderObjectIntersectionOf(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectIntersectionOf result1 = testSubject0.buildObject();
        BuilderObjectIntersectionOf result2 = testSubject0.withItem(_Object13);
        BuilderObjectIntersectionOf result3 = testSubject0.withItems(_Object_array);
        BuilderObjectIntersectionOf result4 = testSubject0.withItems(_Collection15);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectIntersectionOf result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectIntersectionOf result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectInverseOf() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderObjectInverseOf.class));
    }

    public void verifyBuilderObjectInverseOf() {
        BuilderObjectInverseOf testSubject0 = new BuilderObjectInverseOf(_OWLObjectInverseOf, _OWLDataFactory);
        BuilderObjectInverseOf testSubject1 = new BuilderObjectInverseOf(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectInverseOf result1 = testSubject0.buildObject();
        BuilderObjectInverseOf result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectInverseOf result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectInverseOf result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectMaxCardinality() {
        assertTrue(BaseObjectBuilder.class.isAssignableFrom(BuilderObjectMaxCardinality.class));
    }

    public void verifyBuilderObjectMaxCardinality() {
        BuilderObjectMaxCardinality testSubject0 = new BuilderObjectMaxCardinality(_OWLObjectMaxCardinality, _OWLDataFactory);
        BuilderObjectMaxCardinality testSubject1 = new BuilderObjectMaxCardinality(_OWLDataFactory);
        OWLObjectMaxCardinality result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderObjectMaxCardinality result2 = testSubject0.withCardinality(_int);
        BuilderObjectMaxCardinality result3 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectMaxCardinality result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectMaxCardinality result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectMaxCardinality result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectMinCardinality() {
        assertTrue(BaseObjectBuilder.class.isAssignableFrom(BuilderObjectMinCardinality.class));
    }

    public void verifyBuilderObjectMinCardinality() {
        BuilderObjectMinCardinality testSubject0 = new BuilderObjectMinCardinality(_OWLObjectMinCardinality, _OWLDataFactory);
        BuilderObjectMinCardinality testSubject1 = new BuilderObjectMinCardinality(_OWLDataFactory);
        OWLObjectMinCardinality result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderObjectMinCardinality result2 = testSubject0.withCardinality(_int);
        BuilderObjectMinCardinality result3 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectMinCardinality result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectMinCardinality result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectMinCardinality result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectProperty() {
        assertTrue(BaseEntityBuilder.class.isAssignableFrom(BuilderObjectProperty.class));
    }

    public void verifyBuilderObjectProperty() {
        BuilderObjectProperty testSubject0 = new BuilderObjectProperty(_OWLObjectProperty, _OWLDataFactory);
        BuilderObjectProperty testSubject1 = new BuilderObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectProperty result1 = testSubject0.buildObject();
        BuilderObjectProperty result2 = testSubject0.withIRI(_IRI);
        BuilderObjectProperty result3 = testSubject0.withPrefixManager(_PrefixManager);
        BuilderObjectProperty result4 = testSubject0.withPrefixedIRI(_String);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectProperty result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectProperty result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectPropertyAssertion() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderObjectPropertyAssertion.class));
    }

    public void verifyBuilderObjectPropertyAssertion() {
        BuilderObjectPropertyAssertion testSubject0 = new BuilderObjectPropertyAssertion(_OWLObjectPropertyAssertionAxiom, _OWLDataFactory);
        BuilderObjectPropertyAssertion testSubject1 = new BuilderObjectPropertyAssertion(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectPropertyAssertionAxiom result1 = testSubject0.buildObject();
        BuilderObjectPropertyAssertion result2 = testSubject0.withValue(_OWLIndividual);
        BuilderObjectPropertyAssertion result3 = testSubject0.withSubject(_OWLIndividual);
        BuilderObjectPropertyAssertion result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectPropertyAssertion result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectPropertyAssertion result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectPropertyDomain() {
        assertTrue(BaseDomainBuilder.class.isAssignableFrom(BuilderObjectPropertyDomain.class));
    }

    public void verifyBuilderObjectPropertyDomain() {
        BuilderObjectPropertyDomain testSubject0 = new BuilderObjectPropertyDomain(_OWLObjectPropertyDomainAxiom, _OWLDataFactory);
        BuilderObjectPropertyDomain testSubject1 = new BuilderObjectPropertyDomain(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectPropertyDomainAxiom result1 = testSubject0.buildObject();
        BuilderObjectPropertyDomain result2 = testSubject0.withProperty(_Object);
        BuilderObjectPropertyDomain result3 = testSubject0.withDomain(_OWLClassExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectPropertyDomain result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectPropertyDomain result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectPropertyRange() {
        assertTrue(BaseObjectBuilder.class.isAssignableFrom(BuilderObjectPropertyRange.class));
    }

    public void verifyBuilderObjectPropertyRange() {
        BuilderObjectPropertyRange testSubject0 = new BuilderObjectPropertyRange(_OWLObjectPropertyRangeAxiom, _OWLDataFactory);
        BuilderObjectPropertyRange testSubject1 = new BuilderObjectPropertyRange(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectPropertyRangeAxiom result1 = testSubject0.buildObject();
        BuilderObjectPropertyRange result2 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectPropertyRange result3 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectPropertyRange result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectPropertyRange result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderObjectSomeValuesFrom() {
        assertTrue(BaseObjectBuilder.class.isAssignableFrom(BuilderObjectSomeValuesFrom.class));
    }

    public void verifyBuilderObjectSomeValuesFrom() {
        BuilderObjectSomeValuesFrom testSubject0 = new BuilderObjectSomeValuesFrom(_OWLObjectSomeValuesFrom, _OWLDataFactory);
        BuilderObjectSomeValuesFrom testSubject1 = new BuilderObjectSomeValuesFrom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectSomeValuesFrom result1 = testSubject0.buildObject();
        BuilderObjectSomeValuesFrom result2 = testSubject0.withRange(_OWLClassExpression);
        BuilderObjectSomeValuesFrom result3 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderObjectSomeValuesFrom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderObjectSomeValuesFrom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderOneOf() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderOneOf.class));
    }

    public void verifyBuilderOneOf() {
        BuilderOneOf testSubject0 = new BuilderOneOf(_OWLObjectOneOf, _OWLDataFactory);
        BuilderOneOf testSubject1 = new BuilderOneOf(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectOneOf result1 = testSubject0.buildObject();
        BuilderOneOf result2 = testSubject0.withItem(_OWLIndividual);
        BuilderOneOf result3 = testSubject0.withItems(_OWLIndividual, _OWLIndividual);
        BuilderOneOf result4 = testSubject0.withItems(Arrays.asList(_OWLIndividual));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderOneOf result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderOneOf result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderPropertyChain() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderPropertyChain.class));
    }

    public void verifyBuilderPropertyChain() {
        BuilderPropertyChain testSubject0 = new BuilderPropertyChain(_OWLSubPropertyChainOfAxiom, _OWLDataFactory);
        BuilderPropertyChain testSubject1 = new BuilderPropertyChain(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSubPropertyChainOfAxiom result1 = testSubject0.buildObject();
        BuilderPropertyChain result2 = testSubject0.withPropertiesInChain(_Collection88);
        BuilderPropertyChain result3 = testSubject0.withPropertyInChain(_OWLObjectPropertyExpression);
        BuilderPropertyChain result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderPropertyChain result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderPropertyChain result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderReflexiveObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderReflexiveObjectProperty.class));
    }

    public void verifyBuilderReflexiveObjectProperty() {
        BuilderReflexiveObjectProperty testSubject0 = new BuilderReflexiveObjectProperty(_OWLReflexiveObjectPropertyAxiom, _OWLDataFactory);
        BuilderReflexiveObjectProperty testSubject1 = new BuilderReflexiveObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLReflexiveObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderReflexiveObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderReflexiveObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderReflexiveObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSameIndividual() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderSameIndividual.class));
    }

    public void verifyBuilderSameIndividual() {
        BuilderSameIndividual testSubject0 = new BuilderSameIndividual(_OWLSameIndividualAxiom, _OWLDataFactory);
        BuilderSameIndividual testSubject1 = new BuilderSameIndividual(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSameIndividualAxiom result1 = testSubject0.buildObject();
        BuilderSameIndividual result2 = testSubject0.withItem(_OWLIndividual);
        BuilderSameIndividual result3 = testSubject0.withItems(_OWLIndividual, _OWLIndividual);
        BuilderSameIndividual result4 = testSubject0.withItems(Arrays.asList(_OWLIndividual));
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderSameIndividual result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSameIndividual result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSubAnnotationPropertyOf() {
        assertTrue(BaseSubBuilder.class.isAssignableFrom(BuilderSubAnnotationPropertyOf.class));
    }

    public void verifyBuilderSubAnnotationPropertyOf() {
        BuilderSubAnnotationPropertyOf testSubject0 = new BuilderSubAnnotationPropertyOf(_OWLSubAnnotationPropertyOfAxiom, _OWLDataFactory);
        BuilderSubAnnotationPropertyOf testSubject1 = new BuilderSubAnnotationPropertyOf(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSubAnnotationPropertyOfAxiom result1 = testSubject0.buildObject();
        BuilderSubAnnotationPropertyOf result2 = testSubject0.withSub(_OWLAnnotationProperty);
        BuilderSubAnnotationPropertyOf result3 = testSubject0.withSup(_OWLAnnotationProperty);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSubAnnotationPropertyOf result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSubAnnotationPropertyOf result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSubClass() {
        assertTrue(BaseSubBuilder.class.isAssignableFrom(BuilderSubClass.class));
    }

    public void verifyBuilderSubClass() {
        BuilderSubClass testSubject0 = new BuilderSubClass(_OWLSubClassOfAxiom, _OWLDataFactory);
        BuilderSubClass testSubject1 = new BuilderSubClass(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSubClassOfAxiom result1 = testSubject0.buildObject();
        BuilderSubClass result2 = testSubject0.withSub(_Object13);
        BuilderSubClass result3 = testSubject0.withSup(_Object13);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSubClass result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSubClass result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSubDataProperty() {
        assertTrue(BaseSubBuilder.class.isAssignableFrom(BuilderSubDataProperty.class));
    }

    public void verifyBuilderSubDataProperty() {
        BuilderSubDataProperty testSubject0 = new BuilderSubDataProperty(_OWLSubDataPropertyOfAxiom, _OWLDataFactory);
        BuilderSubDataProperty testSubject1 = new BuilderSubDataProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSubDataPropertyOfAxiom result1 = testSubject0.buildObject();
        BuilderSubDataProperty result2 = testSubject0.withSub(_OWLDataProperty);
        BuilderSubDataProperty result3 = testSubject0.withSup(_OWLDataProperty);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSubDataProperty result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSubDataProperty result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSubObjectProperty() {
        assertTrue(BaseSubBuilder.class.isAssignableFrom(BuilderSubObjectProperty.class));
    }

    public void verifyBuilderSubObjectProperty() {
        BuilderSubObjectProperty testSubject0 = new BuilderSubObjectProperty(_OWLSubObjectPropertyOfAxiom, _OWLDataFactory);
        BuilderSubObjectProperty testSubject1 = new BuilderSubObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSubObjectPropertyOfAxiom result1 = testSubject0.buildObject();
        BuilderSubObjectProperty result2 = testSubject0.withSub(_Object);
        BuilderSubObjectProperty result3 = testSubject0.withSup(_Object);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSubObjectProperty result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSubObjectProperty result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLBuiltInAtom() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLBuiltInAtom.class));
    }

    public void verifyBuilderSWRLBuiltInAtom() {
        BuilderSWRLBuiltInAtom testSubject0 = new BuilderSWRLBuiltInAtom(_SWRLBuiltInAtom, _OWLDataFactory);
        BuilderSWRLBuiltInAtom testSubject1 = new BuilderSWRLBuiltInAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLBuiltInAtom result1 = testSubject0.buildObject();
        BuilderSWRLBuiltInAtom result2 = testSubject0.with(_Collection96);
        BuilderSWRLBuiltInAtom result3 = testSubject0.with(_IRI);
        BuilderSWRLBuiltInAtom result4 = testSubject0.with(_SWRLDArgument);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLBuiltInAtom result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLBuiltInAtom result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLClassAtom() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLClassAtom.class));
    }

    public void verifyBuilderSWRLClassAtom() {
        BuilderSWRLClassAtom testSubject0 = new BuilderSWRLClassAtom(_SWRLClassAtom, _OWLDataFactory);
        BuilderSWRLClassAtom testSubject1 = new BuilderSWRLClassAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLClassAtom result1 = testSubject0.buildObject();
        BuilderSWRLClassAtom result2 = testSubject0.with(_SWRLIArgument);
        BuilderSWRLClassAtom result3 = testSubject0.with(_OWLClassExpression);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLClassAtom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLClassAtom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLDataPropertyAtom() {
        assertTrue(BaseDataPropertyBuilder.class.isAssignableFrom(BuilderSWRLDataPropertyAtom.class));
    }

    public void verifyBuilderSWRLDataPropertyAtom() {
        BuilderSWRLDataPropertyAtom testSubject0 = new BuilderSWRLDataPropertyAtom(_SWRLDataPropertyAtom, _OWLDataFactory);
        BuilderSWRLDataPropertyAtom testSubject1 = new BuilderSWRLDataPropertyAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLDataPropertyAtom result1 = testSubject0.buildObject();
        BuilderSWRLDataPropertyAtom result2 = testSubject0.with(_SWRLDArgument);
        BuilderSWRLDataPropertyAtom result3 = testSubject0.with(_SWRLIArgument);
        BuilderSWRLDataPropertyAtom result4 = testSubject0.withProperty(_OWLDataPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLDataPropertyAtom result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLDataPropertyAtom result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLDataRangeAtom() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLDataRangeAtom.class));
    }

    public void verifyBuilderSWRLDataRangeAtom() {
        BuilderSWRLDataRangeAtom testSubject0 = new BuilderSWRLDataRangeAtom(_SWRLDataRangeAtom, _OWLDataFactory);
        BuilderSWRLDataRangeAtom testSubject1 = new BuilderSWRLDataRangeAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLDataRangeAtom result1 = testSubject0.buildObject();
        BuilderSWRLDataRangeAtom result2 = testSubject0.with(_SWRLDArgument);
        BuilderSWRLDataRangeAtom result3 = testSubject0.with(_OWLDataRange);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLDataRangeAtom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLDataRangeAtom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLDifferentIndividualsAtom() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLDifferentIndividualsAtom.class));
    }

    public void verifyBuilderSWRLDifferentIndividualsAtom() {
        BuilderSWRLDifferentIndividualsAtom testSubject0 = new BuilderSWRLDifferentIndividualsAtom(_SWRLDifferentIndividualsAtom, _OWLDataFactory);
        BuilderSWRLDifferentIndividualsAtom testSubject1 = new BuilderSWRLDifferentIndividualsAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLDifferentIndividualsAtom result1 = testSubject0.buildObject();
        BuilderSWRLDifferentIndividualsAtom result2 = testSubject0.withArg0(_SWRLIArgument);
        BuilderSWRLDifferentIndividualsAtom result3 = testSubject0.withArg1(_SWRLIArgument);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLDifferentIndividualsAtom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLDifferentIndividualsAtom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLIndividualArgument() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLIndividualArgument.class));
    }

    public void verifyBuilderSWRLIndividualArgument() {
        BuilderSWRLIndividualArgument testSubject0 = new BuilderSWRLIndividualArgument(_SWRLIndividualArgument, _OWLDataFactory);
        BuilderSWRLIndividualArgument testSubject1 = new BuilderSWRLIndividualArgument(_OWLDataFactory);
        SWRLIndividualArgument result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderSWRLIndividualArgument result2 = testSubject0.with(_OWLIndividual);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLIndividualArgument result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLIndividualArgument result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLLiteralArgument() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLLiteralArgument.class));
    }

    public void verifyBuilderSWRLLiteralArgument() {
        BuilderSWRLLiteralArgument testSubject0 = new BuilderSWRLLiteralArgument(_SWRLLiteralArgument, _OWLDataFactory);
        BuilderSWRLLiteralArgument testSubject1 = new BuilderSWRLLiteralArgument(_OWLDataFactory);
        SWRLLiteralArgument result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderSWRLLiteralArgument result2 = testSubject0.with(_OWLLiteral);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLLiteralArgument result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLLiteralArgument result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLObjectPropertyAtom() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderSWRLObjectPropertyAtom.class));
    }

    public void verifyBuilderSWRLObjectPropertyAtom() {
        BuilderSWRLObjectPropertyAtom testSubject0 = new BuilderSWRLObjectPropertyAtom(_SWRLObjectPropertyAtom, _OWLDataFactory);
        BuilderSWRLObjectPropertyAtom testSubject1 = new BuilderSWRLObjectPropertyAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLObjectPropertyAtom result1 = testSubject0.buildObject();
        BuilderSWRLObjectPropertyAtom result2 = testSubject0.withArg0(_SWRLIArgument);
        BuilderSWRLObjectPropertyAtom result3 = testSubject0.withArg1(_SWRLIArgument);
        BuilderSWRLObjectPropertyAtom result4 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLObjectPropertyAtom result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLObjectPropertyAtom result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLRule() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLRule.class));
    }

    public void verifyBuilderSWRLRule() {
        BuilderSWRLRule testSubject0 = new BuilderSWRLRule(_SWRLRule, _OWLDataFactory);
        BuilderSWRLRule testSubject1 = new BuilderSWRLRule(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLRule result1 = testSubject0.buildObject();
        BuilderSWRLRule result2 = testSubject0.withBody(_Collection107);
        BuilderSWRLRule result3 = testSubject0.withBody(_SWRLAtom);
        BuilderSWRLRule result4 = testSubject0.withHead(_Collection107);
        BuilderSWRLRule result5 = testSubject0.withHead(_SWRLAtom);
        List<OWLOntologyChange<?>> result6 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLRule result7 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLRule result8 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result9 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLSameIndividualAtom() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLSameIndividualAtom.class));
    }

    public void verifyBuilderSWRLSameIndividualAtom() {
        BuilderSWRLSameIndividualAtom testSubject0 = new BuilderSWRLSameIndividualAtom(_SWRLSameIndividualAtom, _OWLDataFactory);
        BuilderSWRLSameIndividualAtom testSubject1 = new BuilderSWRLSameIndividualAtom(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        SWRLSameIndividualAtom result1 = testSubject0.buildObject();
        BuilderSWRLSameIndividualAtom result2 = testSubject0.withArg0(_SWRLIArgument);
        BuilderSWRLSameIndividualAtom result3 = testSubject0.withArg1(_SWRLIArgument);
        List<OWLOntologyChange<?>> result4 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLSameIndividualAtom result5 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLSameIndividualAtom result6 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result7 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSWRLVariable() {
        assertTrue(BaseBuilder.class.isAssignableFrom(BuilderSWRLVariable.class));
    }

    public void verifyBuilderSWRLVariable() {
        BuilderSWRLVariable testSubject0 = new BuilderSWRLVariable(_SWRLVariable, _OWLDataFactory);
        BuilderSWRLVariable testSubject1 = new BuilderSWRLVariable(_OWLDataFactory);
        SWRLVariable result0 = testSubject0.buildObject();
        OWLObject result1 = testSubject0.buildObject();
        BuilderSWRLVariable result2 = testSubject0.with(_IRI);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderSWRLVariable result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSWRLVariable result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderSymmetricObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderSymmetricObjectProperty.class));
    }

    public void verifyBuilderSymmetricObjectProperty() {
        BuilderSymmetricObjectProperty testSubject0 = new BuilderSymmetricObjectProperty(_OWLSymmetricObjectPropertyAxiom, _OWLDataFactory);
        BuilderSymmetricObjectProperty testSubject1 = new BuilderSymmetricObjectProperty(_OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLSymmetricObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderSymmetricObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderSymmetricObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderSymmetricObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderTransitiveObjectProperty() {
        assertTrue(BaseObjectPropertyBuilder.class.isAssignableFrom(BuilderTransitiveObjectProperty.class));
    }

    public void verifyBuilderTransitiveObjectProperty() {
        BuilderTransitiveObjectProperty testSubject0 = new BuilderTransitiveObjectProperty(_OWLDataFactory);
        BuilderTransitiveObjectProperty testSubject1 = new BuilderTransitiveObjectProperty(_OWLTransitiveObjectPropertyAxiom, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLTransitiveObjectPropertyAxiom result1 = testSubject0.buildObject();
        BuilderTransitiveObjectProperty result2 = testSubject0.withProperty(_OWLObjectPropertyExpression);
        List<OWLOntologyChange<?>> result3 = testSubject0.applyChanges(_OWLOntology);
        BuilderTransitiveObjectProperty result4 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderTransitiveObjectProperty result5 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result6 = testSubject0.buildObject();
    }

    @Test
    public void enforceInterfacesBuilderUnionOf() {
        assertTrue(BaseSetBuilder.class.isAssignableFrom(BuilderUnionOf.class));
    }

    public void verifyBuilderUnionOf() {
        BuilderUnionOf testSubject0 = new BuilderUnionOf(_OWLDataFactory);
        BuilderUnionOf testSubject1 = new BuilderUnionOf(_OWLObjectUnionOf, _OWLDataFactory);
        OWLObject result0 = testSubject0.buildObject();
        OWLObjectUnionOf result1 = testSubject0.buildObject();
        BuilderUnionOf result2 = testSubject0.withItem(_Object13);
        BuilderUnionOf result3 = testSubject0.withItems(_Object_array);
        BuilderUnionOf result4 = testSubject0.withItems(_Collection15);
        List<OWLOntologyChange<?>> result5 = testSubject0.applyChanges(_OWLOntology);
        BuilderUnionOf result6 = testSubject0.withAnnotation(_OWLAnnotation);
        BuilderUnionOf result7 = testSubject0.withAnnotations(_Collection);
        java.lang.Object result8 = testSubject0.buildObject();
    }

    private OWLClass _Object13;
    private OWLClass[] _Object_array;
    private OWLObjectProperty _Object;
    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private java.lang.String _String;
    private java.util.Collection<? extends OWLClass> _Collection15;
    private java.util.Collection<OWLAnnotation> _Collection;
    private java.util.Collection<OWLObjectPropertyExpression> _Collection88;
    private java.util.Collection<SWRLAtom> _Collection107;
    private java.util.Collection<SWRLDArgument> _Collection96;
    private EntityType<?> _EntityType;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnnotationSubject _OWLAnnotationSubject;
    private OWLAnnotationValue _OWLAnnotationValue;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataComplementOf _OWLDataComplementOf;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataIntersectionOf _OWLDataIntersectionOf;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataOneOf _OWLDataOneOf;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private OWLDataRange _OWLDataRange;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLDataUnionOf _OWLDataUnionOf;
    private OWLDatatype _OWLDatatype;
    private OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private OWLDatatypeRestriction _OWLDatatypeRestriction;
    private OWLDeclarationAxiom _OWLDeclarationAxiom;
    private OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private OWLEntity _OWLEntity;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLIndividual _OWLIndividual;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectInverseOf _OWLObjectInverseOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLOntology _OWLOntology;
    private OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private PrefixManager _PrefixManager;
    private SWRLAtom _SWRLAtom;
    private SWRLBuiltInAtom _SWRLBuiltInAtom;
    private SWRLClassAtom _SWRLClassAtom;
    private SWRLDArgument _SWRLDArgument;
    private SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private SWRLDataRangeAtom _SWRLDataRangeAtom;
    private SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private SWRLIArgument _SWRLIArgument;
    private SWRLIndividualArgument _SWRLIndividualArgument;
    private SWRLLiteralArgument _SWRLLiteralArgument;
    private SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private SWRLRule _SWRLRule;
    private SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
