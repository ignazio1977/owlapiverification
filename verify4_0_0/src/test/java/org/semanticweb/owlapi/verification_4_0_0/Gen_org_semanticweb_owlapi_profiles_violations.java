package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.violations.*;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_profiles_violations {
    @Test
    public void enforceInterfacesCycleInDatatypeDefinition() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(CycleInDatatypeDefinition.class));
    }

    public void verifyCycleInDatatypeDefinition() {
        CycleInDatatypeDefinition testSubject0 = new CycleInDatatypeDefinition(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesDatatypeIRIAlsoUsedAsClassIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(DatatypeIRIAlsoUsedAsClassIRI.class));
    }

    public void verifyDatatypeIRIAlsoUsedAsClassIRI() {
        DatatypeIRIAlsoUsedAsClassIRI testSubject0 = new DatatypeIRIAlsoUsedAsClassIRI(_OWLOntology, _OWLAxiom, _IRI);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        java.util.List<OWLOntologyChange> result1 = testSubject0.repair();
        OWLAxiom result2 = testSubject0.getAxiom();
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyID result4 = testSubject0.getOntologyID();
        Object result5 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesEmptyOneOfAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
    }

    public void verifyEmptyOneOfAxiom() {
        EmptyOneOfAxiom testSubject0 = new EmptyOneOfAxiom(_OWLOntology, _OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesIllegalPunning() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(IllegalPunning.class));
    }

    public void verifyIllegalPunning() {
        IllegalPunning testSubject0 = new IllegalPunning(_OWLOntology, _OWLAxiom, _IRI);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesInsufficientIndividuals() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
    }

    public void verifyInsufficientIndividuals() {
        InsufficientIndividuals testSubject0 = new InsufficientIndividuals(_OWLOntology, _OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesInsufficientOperands() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
    }

    public void verifyInsufficientOperands() {
        InsufficientOperands testSubject0 = new InsufficientOperands(_OWLOntology, _OWLAxiom, _OWLObject);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesInsufficientPropertyExpressions() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
    }

    public void verifyInsufficientPropertyExpressions() {
        InsufficientPropertyExpressions testSubject0 = new InsufficientPropertyExpressions(_OWLOntology, _OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesLastPropertyInChainNotInImposedRange() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(LastPropertyInChainNotInImposedRange.class));
    }

    public void verifyLastPropertyInChainNotInImposedRange() {
        LastPropertyInChainNotInImposedRange testSubject0 = new LastPropertyInChainNotInImposedRange(_OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyRangeAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesLexicalNotInLexicalSpace() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(LexicalNotInLexicalSpace.class));
    }

    public void verifyLexicalNotInLexicalSpace() {
        LexicalNotInLexicalSpace testSubject0 = new LexicalNotInLexicalSpace(_OWLOntology, _OWLAxiom, _OWLLiteral);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesOntologyIRINotAbsolute() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(OntologyIRINotAbsolute.class));
    }

    public void verifyOntologyIRINotAbsolute() {
        OntologyIRINotAbsolute testSubject0 = new OntologyIRINotAbsolute(_OWLOntology);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        java.util.List<OWLOntologyChange> result1 = testSubject0.repair();
        OWLAxiom result2 = testSubject0.getAxiom();
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyID result4 = testSubject0.getOntologyID();
        Object result5 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesOntologyVersionIRINotAbsolute() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(OntologyVersionIRINotAbsolute.class));
    }

    public void verifyOntologyVersionIRINotAbsolute() {
        OntologyVersionIRINotAbsolute testSubject0 = new OntologyVersionIRINotAbsolute(_OWLOntology);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        java.util.List<OWLOntologyChange> result1 = testSubject0.repair();
        OWLAxiom result2 = testSubject0.getAxiom();
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyID result4 = testSubject0.getOntologyID();
        Object result5 = testSubject0.getExpression();
    }

    public void verifyInterfaceUndeclaredEntityViolation() {
        UndeclaredEntityViolation testSubject0 = mock(UndeclaredEntityViolation.class);
        OWLOntology result0 = testSubject0.getOntology();
        OWLEntity result1 = testSubject0.getEntity();
    }

    @Test
    public void enforceInterfacesUseOfAnonymousIndividual() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfAnonymousIndividual.class));
    }

    public void verifyUseOfAnonymousIndividual() {
        UseOfAnonymousIndividual testSubject0 = new UseOfAnonymousIndividual(_OWLOntology, _OWLAxiom, _OWLAnonymousIndividual);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfBuiltInDatatypeInDatatypeDefinition() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfBuiltInDatatypeInDatatypeDefinition.class));
    }

    public void verifyUseOfBuiltInDatatypeInDatatypeDefinition() {
        UseOfBuiltInDatatypeInDatatypeDefinition testSubject0 = new UseOfBuiltInDatatypeInDatatypeDefinition(_OWLOntology, _OWLDatatypeDefinitionAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfDataOneOfWithMultipleLiterals() {
        assertTrue(org.semanticweb.owlapi.profiles.violations.UseOfIllegalDataRange.class.isAssignableFrom(UseOfDataOneOfWithMultipleLiterals.class));
    }

    public void verifyUseOfDataOneOfWithMultipleLiterals() {
        UseOfDataOneOfWithMultipleLiterals testSubject0 = new UseOfDataOneOfWithMultipleLiterals(_OWLOntology, _OWLAxiom, _OWLDataOneOf);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfDefinedDatatypeInDatatypeRestriction() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfDefinedDatatypeInDatatypeRestriction.class));
    }

    public void verifyUseOfDefinedDatatypeInDatatypeRestriction() {
        UseOfDefinedDatatypeInDatatypeRestriction testSubject0 = new UseOfDefinedDatatypeInDatatypeRestriction(_OWLOntology, _OWLAxiom, _OWLDatatypeRestriction);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfIllegalAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalAxiom.class));
    }

    public void verifyUseOfIllegalAxiom() {
        UseOfIllegalAxiom testSubject0 = new UseOfIllegalAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfIllegalClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalClassExpression.class));
    }

    public void verifyUseOfIllegalClassExpression() {
        UseOfIllegalClassExpression testSubject0 = new UseOfIllegalClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfIllegalDataRange() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalDataRange.class));
    }

    public void verifyUseOfIllegalDataRange() {
        UseOfIllegalDataRange testSubject0 = new UseOfIllegalDataRange(_OWLOntology, _OWLAxiom, _OWLDataRange);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfIllegalFacetRestriction() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalFacetRestriction.class));
    }

    public void verifyUseOfIllegalFacetRestriction() {
        UseOfIllegalFacetRestriction testSubject0 = new UseOfIllegalFacetRestriction(_OWLOntology, _OWLAxiom, _OWLDatatypeRestriction, _OWLFacet);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonAbsoluteIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonAbsoluteIRI.class));
    }

    public void verifyUseOfNonAbsoluteIRI() {
        UseOfNonAbsoluteIRI testSubject0 = new UseOfNonAbsoluteIRI(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonAtomicClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonAtomicClassExpression.class));
    }

    public void verifyUseOfNonAtomicClassExpression() {
        UseOfNonAtomicClassExpression testSubject0 = new UseOfNonAtomicClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonEquivalentClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonEquivalentClassExpression.class));
    }

    public void verifyUseOfNonEquivalentClassExpression() {
        UseOfNonEquivalentClassExpression testSubject0 = new UseOfNonEquivalentClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom() {
        UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom(_OWLOntology,
                _OWLAsymmetricObjectPropertyAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInCardinalityRestriction() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInCardinalityRestriction.class));
    }

    public void verifyUseOfNonSimplePropertyInCardinalityRestriction() {
        UseOfNonSimplePropertyInCardinalityRestriction testSubject0 = new UseOfNonSimplePropertyInCardinalityRestriction(_OWLOntology, _OWLAxiom, _OWLObjectCardinalityRestriction);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInDisjointPropertiesAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInDisjointPropertiesAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInDisjointPropertiesAxiom() {
        UseOfNonSimplePropertyInDisjointPropertiesAxiom testSubject0 = new UseOfNonSimplePropertyInDisjointPropertiesAxiom(_OWLOntology, _OWLDisjointObjectPropertiesAxiom,
                _OWLObjectPropertyExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInFunctionalPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInFunctionalPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInFunctionalPropertyAxiom() {
        UseOfNonSimplePropertyInFunctionalPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInFunctionalPropertyAxiom(_OWLOntology, _OWLFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom() {
        UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom(_OWLOntology,
                _OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInIrreflexivePropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInIrreflexivePropertyAxiom() {
        UseOfNonSimplePropertyInIrreflexivePropertyAxiom testSubject0 = new UseOfNonSimplePropertyInIrreflexivePropertyAxiom(_OWLOntology, _OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInObjectHasSelf() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInObjectHasSelf.class));
    }

    public void verifyUseOfNonSimplePropertyInObjectHasSelf() {
        UseOfNonSimplePropertyInObjectHasSelf testSubject0 = new UseOfNonSimplePropertyInObjectHasSelf(_OWLOntology, _OWLAxiom, _OWLObjectHasSelf);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSubClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSubClassExpression.class));
    }

    public void verifyUseOfNonSubClassExpression() {
        UseOfNonSubClassExpression testSubject0 = new UseOfNonSubClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfNonSuperClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSuperClassExpression.class));
    }

    public void verifyUseOfNonSuperClassExpression() {
        UseOfNonSuperClassExpression testSubject0 = new UseOfNonSuperClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfObjectOneOfWithMultipleIndividuals() {
        assertTrue(org.semanticweb.owlapi.profiles.violations.UseOfIllegalClassExpression.class.isAssignableFrom(UseOfObjectOneOfWithMultipleIndividuals.class));
    }

    public void verifyUseOfObjectOneOfWithMultipleIndividuals() {
        UseOfObjectOneOfWithMultipleIndividuals testSubject0 = new UseOfObjectOneOfWithMultipleIndividuals(_OWLOntology, _OWLAxiom, _OWLObjectOneOf);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfObjectPropertyInverse() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfObjectPropertyInverse.class));
    }

    public void verifyUseOfObjectPropertyInverse() {
        UseOfObjectPropertyInverse testSubject0 = new UseOfObjectPropertyInverse(_OWLOntology, _OWLAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfPropertyInChainCausesCycle() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfPropertyInChainCausesCycle.class));
    }

    public void verifyUseOfPropertyInChainCausesCycle() {
        UseOfPropertyInChainCausesCycle testSubject0 = new UseOfPropertyInChainCausesCycle(_OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForAnnotationPropertyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForAnnotationPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForAnnotationPropertyIRI() {
        UseOfReservedVocabularyForAnnotationPropertyIRI testSubject0 = new UseOfReservedVocabularyForAnnotationPropertyIRI(_OWLOntology, _OWLAxiom, _OWLAnnotationProperty);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForClassIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForClassIRI.class));
    }

    public void verifyUseOfReservedVocabularyForClassIRI() {
        UseOfReservedVocabularyForClassIRI testSubject0 = new UseOfReservedVocabularyForClassIRI(_OWLOntology, _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForDataPropertyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForDataPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForDataPropertyIRI() {
        UseOfReservedVocabularyForDataPropertyIRI testSubject0 = new UseOfReservedVocabularyForDataPropertyIRI(_OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForIndividualIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForIndividualIRI.class));
    }

    public void verifyUseOfReservedVocabularyForIndividualIRI() {
        UseOfReservedVocabularyForIndividualIRI testSubject0 = new UseOfReservedVocabularyForIndividualIRI(_OWLOntology, _OWLAxiom, _OWLNamedIndividual);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForObjectPropertyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForObjectPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForObjectPropertyIRI() {
        UseOfReservedVocabularyForObjectPropertyIRI testSubject0 = new UseOfReservedVocabularyForObjectPropertyIRI(_OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForOntologyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForOntologyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForOntologyIRI() {
        UseOfReservedVocabularyForOntologyIRI testSubject0 = new UseOfReservedVocabularyForOntologyIRI(_OWLOntology);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        java.util.List<OWLOntologyChange> result1 = testSubject0.repair();
        OWLAxiom result2 = testSubject0.getAxiom();
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyID result4 = testSubject0.getOntologyID();
        Object result5 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForVersionIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForVersionIRI.class));
    }

    public void verifyUseOfReservedVocabularyForVersionIRI() {
        UseOfReservedVocabularyForVersionIRI testSubject0 = new UseOfReservedVocabularyForVersionIRI(_OWLOntology);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        java.util.List<OWLOntologyChange> result1 = testSubject0.repair();
        OWLAxiom result2 = testSubject0.getAxiom();
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyID result4 = testSubject0.getOntologyID();
        Object result5 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class));
    }

    public void verifyUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom() {
        UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom testSubject0 = new UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom(_OWLOntology, _OWLSubDataPropertyOfAxiom);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredAnnotationProperty() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.violations.UndeclaredEntityViolation.class.isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
    }

    public void verifyUseOfUndeclaredAnnotationProperty() {
        UseOfUndeclaredAnnotationProperty testSubject0 = new UseOfUndeclaredAnnotationProperty(_OWLOntology, _OWLAxiom, _OWLAnnotation, _OWLAnnotationProperty);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLEntity result1 = testSubject0.getEntity();
        java.util.List<OWLOntologyChange> result2 = testSubject0.repair();
        OWLAxiom result3 = testSubject0.getAxiom();
        OWLOntology result4 = testSubject0.getOntology();
        OWLOntologyID result5 = testSubject0.getOntologyID();
        Object result6 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredClass() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredClass.class));
        assertTrue(org.semanticweb.owlapi.profiles.violations.UndeclaredEntityViolation.class.isAssignableFrom(UseOfUndeclaredClass.class));
    }

    public void verifyUseOfUndeclaredClass() {
        UseOfUndeclaredClass testSubject0 = new UseOfUndeclaredClass(_OWLOntology, _OWLAxiom, _OWLClass);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLEntity result1 = testSubject0.getEntity();
        java.util.List<OWLOntologyChange> result2 = testSubject0.repair();
        OWLAxiom result3 = testSubject0.getAxiom();
        OWLOntology result4 = testSubject0.getOntology();
        OWLOntologyID result5 = testSubject0.getOntologyID();
        Object result6 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDataProperty() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDataProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.violations.UndeclaredEntityViolation.class.isAssignableFrom(UseOfUndeclaredDataProperty.class));
    }

    public void verifyUseOfUndeclaredDataProperty() {
        UseOfUndeclaredDataProperty testSubject0 = new UseOfUndeclaredDataProperty(_OWLOntology, _OWLAxiom, _OWLDataProperty);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLEntity result1 = testSubject0.getEntity();
        java.util.List<OWLOntologyChange> result2 = testSubject0.repair();
        OWLAxiom result3 = testSubject0.getAxiom();
        OWLOntology result4 = testSubject0.getOntology();
        OWLOntologyID result5 = testSubject0.getOntologyID();
        Object result6 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDatatype() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDatatype.class));
        assertTrue(org.semanticweb.owlapi.profiles.violations.UndeclaredEntityViolation.class.isAssignableFrom(UseOfUndeclaredDatatype.class));
    }

    public void verifyUseOfUndeclaredDatatype() {
        UseOfUndeclaredDatatype testSubject0 = new UseOfUndeclaredDatatype(_OWLOntology, _OWLAxiom, _OWLDatatype);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLEntity result1 = testSubject0.getEntity();
        java.util.List<OWLOntologyChange> result2 = testSubject0.repair();
        OWLAxiom result3 = testSubject0.getAxiom();
        OWLOntology result4 = testSubject0.getOntology();
        OWLOntologyID result5 = testSubject0.getOntologyID();
        Object result6 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredObjectProperty() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredObjectProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.violations.UndeclaredEntityViolation.class.isAssignableFrom(UseOfUndeclaredObjectProperty.class));
    }

    public void verifyUseOfUndeclaredObjectProperty() {
        UseOfUndeclaredObjectProperty testSubject0 = new UseOfUndeclaredObjectProperty(_OWLOntology, _OWLAxiom, _OWLObjectProperty);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLEntity result1 = testSubject0.getEntity();
        java.util.List<OWLOntologyChange> result2 = testSubject0.repair();
        OWLAxiom result3 = testSubject0.getAxiom();
        OWLOntology result4 = testSubject0.getOntology();
        OWLOntologyID result5 = testSubject0.getOntologyID();
        Object result6 = testSubject0.getExpression();
    }

    @Test
    public void enforceInterfacesUseOfUnknownDatatype() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUnknownDatatype.class));
    }

    public void verifyUseOfUnknownDatatype() {
        UseOfUnknownDatatype testSubject0 = new UseOfUnknownDatatype(_OWLOntology, _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWLProfileViolationVisitor);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntology result2 = testSubject0.getOntology();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        Object result4 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result5 = testSubject0.repair();
    }

    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataOneOf _OWLDataOneOf;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataRange _OWLDataRange;
    private OWLDatatype _OWLDatatype;
    private OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private OWLDatatypeRestriction _OWLDatatypeRestriction;
    private OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLObject _OWLObject;
    private OWLObjectCardinalityRestriction _OWLObjectCardinalityRestriction;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLOntology _OWLOntology;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.profiles.OWLProfileViolationVisitor _OWLProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWLProfileViolationVisitorEx<OWLObject> _OWLProfileViolationVisitorEx;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
