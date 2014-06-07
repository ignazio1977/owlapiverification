package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_profiles {
    @Test
    public void enforceInterfacesCycleInDatatypeDefinition() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(CycleInDatatypeDefinition.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(CycleInDatatypeDefinition.class));
    }

    public void verifyCycleInDatatypeDefinition() {
        CycleInDatatypeDefinition testSubject0 = new CycleInDatatypeDefinition(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesDatatypeIRIAlsoUsedAsClassIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(DatatypeIRIAlsoUsedAsClassIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(DatatypeIRIAlsoUsedAsClassIRI.class));
    }

    public void verifyDatatypeIRIAlsoUsedAsClassIRI() {
        DatatypeIRIAlsoUsedAsClassIRI testSubject0 = new DatatypeIRIAlsoUsedAsClassIRI(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getIRI();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesEmptyOneOfAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
    }

    public void verifyEmptyOneOfAxiom() {
        EmptyOneOfAxiom testSubject0 = new EmptyOneOfAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesIllegalPunning() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(IllegalPunning.class));
    }

    public void verifyIllegalPunning() {
        IllegalPunning testSubject0 = new IllegalPunning(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesInsufficientIndividuals() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
    }

    public void verifyInsufficientIndividuals() {
        InsufficientIndividuals testSubject0 = new InsufficientIndividuals(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesInsufficientOperands() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
    }

    public void verifyInsufficientOperands() {
        InsufficientOperands testSubject0 = new InsufficientOperands(_OWLOntology, _OWLAxiom, _OWLObject);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesInsufficientPropertyExpressions() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
    }

    public void verifyInsufficientPropertyExpressions() {
        InsufficientPropertyExpressions testSubject0 = new InsufficientPropertyExpressions(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesLastPropertyInChainNotInImposedRange() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(LastPropertyInChainNotInImposedRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(LastPropertyInChainNotInImposedRange.class));
    }

    public void verifyLastPropertyInChainNotInImposedRange() {
        LastPropertyInChainNotInImposedRange testSubject0 = new LastPropertyInChainNotInImposedRange(_OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyRangeAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLSubPropertyChainOfAxiom result0 = testSubject0.getOWLSubPropertyChainOfAxiom();
        OWLObjectPropertyRangeAxiom result1 = testSubject0.getOWLObjectPropertyRangeAxiom();
        IRI result2 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result5 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesLexicalNotInLexicalSpace() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(LexicalNotInLexicalSpace.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(LexicalNotInLexicalSpace.class));
    }

    public void verifyLexicalNotInLexicalSpace() {
        LexicalNotInLexicalSpace testSubject0 = new LexicalNotInLexicalSpace(_OWLOntology, _OWLAxiom, _OWLLiteral);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLLiteral result0 = testSubject0.getLiteral();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesOntologyIRINotAbsolute() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(OntologyIRINotAbsolute.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(OntologyIRINotAbsolute.class));
    }

    public void verifyOntologyIRINotAbsolute() {
        OntologyIRINotAbsolute testSubject0 = new OntologyIRINotAbsolute(_OWLOntology);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesOntologyVersionIRINotAbsolute() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(OntologyVersionIRINotAbsolute.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(OntologyVersionIRINotAbsolute.class));
    }

    public void verifyOntologyVersionIRINotAbsolute() {
        OntologyVersionIRINotAbsolute testSubject0 = new OntologyVersionIRINotAbsolute(_OWLOntology);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesOWL2DLProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2DLProfile.class));
    }

    public void verifyOWL2DLProfile() {
        OWL2DLProfile testSubject0 = new OWL2DLProfile();
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2DLProfileViolation() {
        OWL2DLProfileViolation testSubject0 = mock(OWL2DLProfileViolation.class);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2DLProfileViolationVisitor() {
        OWL2DLProfileViolationVisitor testSubject0 = mock(OWL2DLProfileViolationVisitor.class);
        testSubject0.visit(_UseOfReservedVocabularyForVersionIRI);
        testSubject0.visit(_UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom);
        testSubject0.visit(_UseOfUndeclaredAnnotationProperty);
        testSubject0.visit(_UseOfUndeclaredClass);
        testSubject0.visit(_UseOfReservedVocabularyForDataPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForIndividualIRI);
        testSubject0.visit(_UseOfReservedVocabularyForObjectPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForOntologyIRI);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_UseOfUndeclaredObjectProperty);
        testSubject0.visit(_UseOfUndeclaredDatatype);
        testSubject0.visit(_UseOfUndeclaredDataProperty);
        testSubject0.visit(_DatatypeIRIAlsoUsedAsClassIRI);
        testSubject0.visit(_UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInCardinalityRestriction);
        testSubject0.visit(_UseOfNonSimplePropertyInDisjointPropertiesAxiom);
        testSubject0.visit(_UseOfBuiltInDatatypeInDatatypeDefinition);
        testSubject0.visit(_CycleInDatatypeDefinition);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_UseOfNonSimplePropertyInObjectHasSelf);
        testSubject0.visit(_UseOfPropertyInChainCausesCycle);
        testSubject0.visit(_UseOfReservedVocabularyForAnnotationPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForClassIRI);
        testSubject0.visit(_UseOfNonSimplePropertyInIrreflexivePropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInFunctionalPropertyAxiom);
    }

    @Test
    public void enforceInterfacesOWL2ELProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2ELProfile.class));
    }

    public void verifyOWL2ELProfile() {
        OWL2ELProfile testSubject0 = new OWL2ELProfile();
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2ELProfileViolation() {
        OWL2ELProfileViolation testSubject0 = mock(OWL2ELProfileViolation.class);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2ELProfileViolationVisitor() {
        OWL2ELProfileViolationVisitor testSubject0 = mock(OWL2ELProfileViolationVisitor.class);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_UseOfObjectOneOfWithMultipleIndividuals);
        testSubject0.visit(_UseOfObjectPropertyInverse);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_LastPropertyInChainNotInImposedRange);
        testSubject0.visit(_UseOfAnonymousIndividual);
        testSubject0.visit(_UseOfDataOneOfWithMultipleLiterals);
        testSubject0.visit(_UseOfIllegalAxiom);
        testSubject0.visit(_UseOfIllegalClassExpression);
        testSubject0.visit(_UseOfIllegalDataRange);
    }

    @Test
    public void enforceInterfacesOWL2Profile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2Profile.class));
    }

    public void verifyOWL2Profile() {
        OWL2Profile testSubject0 = new OWL2Profile();
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWL2ProfileReport() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileReport.class.isAssignableFrom(OWL2ProfileReport.class));
    }

    public void verifyOWL2ProfileReport() {
        OWL2ProfileReport testSubject0 = new OWL2ProfileReport(_OWLProfile, _Set, _Set52, _Set52);
        java.util.Set<OWLObjectPropertyExpression> result0 = testSubject0.getNonSimpleRoles();
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0.getSimpleRoles();
        boolean result2 = testSubject0.isInProfile();
        java.util.List<org.semanticweb.owlapi.profiles.OWLProfileViolation> result3 = testSubject0.getViolations();
        org.semanticweb.owlapi.profiles.OWLProfile result4 = testSubject0.getProfile();
    }

    public void verifyInterfaceOWL2ProfileViolation() {
        OWL2ProfileViolation testSubject0 = mock(OWL2ProfileViolation.class);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2ProfileViolationVisitor() {
        OWL2ProfileViolationVisitor testSubject0 = mock(OWL2ProfileViolationVisitor.class);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_UseOfUnknownDatatype);
        testSubject0.visit(_UseOfUndeclaredDatatype);
        testSubject0.visit(_UseOfDefinedDatatypeInDatatypeRestriction);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_UseOfNonAbsoluteIRI);
        testSubject0.visit(_UseOfIllegalFacetRestriction);
        testSubject0.visit(_LexicalNotInLexicalSpace);
        testSubject0.visit(_OntologyIRINotAbsolute);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_OntologyVersionIRINotAbsolute);
    }

    @Test
    public void enforceInterfacesOWL2QLProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2QLProfile.class));
    }

    public void verifyOWL2QLProfile() {
        OWL2QLProfile testSubject0 = new OWL2QLProfile();
        String result0 = testSubject0.getName();
        boolean result1 = testSubject0.isOWL2QLSuperClassExpression(_OWLClassExpression);
        IRI result2 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result3 = testSubject0.checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2QLProfileViolation() {
        OWL2QLProfileViolation testSubject0 = mock(OWL2QLProfileViolation.class);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2QLProfileViolationVisitor() {
        OWL2QLProfileViolationVisitor testSubject0 = mock(OWL2QLProfileViolationVisitor.class);
        testSubject0.visit(_UseOfNonSubClassExpression);
        testSubject0.visit(_UseOfNonSuperClassExpression);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_UseOfAnonymousIndividual);
        testSubject0.visit(_UseOfDataOneOfWithMultipleLiterals);
        testSubject0.visit(_UseOfIllegalAxiom);
        testSubject0.visit(_UseOfIllegalDataRange);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_UseOfNonAtomicClassExpression);
    }

    @Test
    public void enforceInterfacesOWL2RLProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2RLProfile.class));
    }

    public void verifyOWL2RLProfile() {
        OWL2RLProfile testSubject0 = new OWL2RLProfile();
        String result0 = testSubject0.getName();
        boolean result1 = testSubject0.isOWL2RLSuperClassExpression(_OWLClassExpression);
        boolean result2 = testSubject0.isOWL2RLEquivalentClassExpression(_OWLClassExpression);
        IRI result3 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result4 = testSubject0.checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2RLProfileViolation() {
        OWL2RLProfileViolation testSubject0 = mock(OWL2RLProfileViolation.class);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2RLProfileViolationVisitor() {
        OWL2RLProfileViolationVisitor testSubject0 = mock(OWL2RLProfileViolationVisitor.class);
        testSubject0.visit(_UseOfNonSuperClassExpression);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_UseOfIllegalAxiom);
        testSubject0.visit(_UseOfIllegalDataRange);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_UseOfNonEquivalentClassExpression);
        testSubject0.visit(_UseOfNonSubClassExpression);
    }

    public void verifyInterfaceOWLProfile() {
        OWLProfile testSubject0 = mock(OWLProfile.class);
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    public void verifyOWLProfileReport() {
        OWLProfileReport testSubject0 = new OWLProfileReport(_OWLProfile, _Set);
        boolean result0 = testSubject0.isInProfile();
        java.util.List<org.semanticweb.owlapi.profiles.OWLProfileViolation> result1 = testSubject0.getViolations();
        org.semanticweb.owlapi.profiles.OWLProfile result2 = testSubject0.getProfile();
    }

    public void verifyOWLProfileViolation() {
        OWLProfileViolation testSubject0 = new OWLProfileViolation(_OWLOntology, _OWLAxiom);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfAnonymousIndividual() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfAnonymousIndividual.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(UseOfAnonymousIndividual.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(UseOfAnonymousIndividual.class));
    }

    public void verifyUseOfAnonymousIndividual() {
        UseOfAnonymousIndividual testSubject0 = new UseOfAnonymousIndividual(_OWLOntology, _OWLAxiom, _OWLAnonymousIndividual);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLAnonymousIndividual result0 = testSubject0.getOWLAnonymousIndividual();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfBuiltInDatatypeInDatatypeDefinition() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfBuiltInDatatypeInDatatypeDefinition.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfBuiltInDatatypeInDatatypeDefinition.class));
    }

    public void verifyUseOfBuiltInDatatypeInDatatypeDefinition() {
        UseOfBuiltInDatatypeInDatatypeDefinition testSubject0 = new UseOfBuiltInDatatypeInDatatypeDefinition(_OWLOntology, _OWLDatatypeDefinitionAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfDataOneOfWithMultipleLiterals() {
        assertTrue(org.semanticweb.owlapi.profiles.UseOfIllegalDataRange.class.isAssignableFrom(UseOfDataOneOfWithMultipleLiterals.class));
    }

    public void verifyUseOfDataOneOfWithMultipleLiterals() {
        UseOfDataOneOfWithMultipleLiterals testSubject0 = new UseOfDataOneOfWithMultipleLiterals(_OWLOntology, _OWLAxiom, _OWLDataOneOf);
        OWLDataOneOf result0 = testSubject0.getDataOneOf();
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLDataRange result1 = testSubject0.getOWLDataRange();
        IRI result2 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result5 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfDefinedDatatypeInDatatypeRestriction() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfDefinedDatatypeInDatatypeRestriction.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(UseOfDefinedDatatypeInDatatypeRestriction.class));
    }

    public void verifyUseOfDefinedDatatypeInDatatypeRestriction() {
        UseOfDefinedDatatypeInDatatypeRestriction testSubject0 = new UseOfDefinedDatatypeInDatatypeRestriction(_OWLOntology, _OWLAxiom, _OWLDatatypeRestriction);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatypeRestriction result0 = testSubject0.getOWLDatatypeRestriction();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(UseOfIllegalAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(UseOfIllegalAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(UseOfIllegalAxiom.class));
    }

    public void verifyUseOfIllegalAxiom() {
        UseOfIllegalAxiom testSubject0 = new UseOfIllegalAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(UseOfIllegalClassExpression.class));
    }

    public void verifyUseOfIllegalClassExpression() {
        UseOfIllegalClassExpression testSubject0 = new UseOfIllegalClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getOWLClassExpression();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalDataRange() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalDataRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(UseOfIllegalDataRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(UseOfIllegalDataRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(UseOfIllegalDataRange.class));
    }

    public void verifyUseOfIllegalDataRange() {
        UseOfIllegalDataRange testSubject0 = new UseOfIllegalDataRange(_OWLOntology, _OWLAxiom, _OWLDataRange);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLDataRange result0 = testSubject0.getOWLDataRange();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalFacetRestriction() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfIllegalFacetRestriction.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(UseOfIllegalFacetRestriction.class));
    }

    public void verifyUseOfIllegalFacetRestriction() {
        UseOfIllegalFacetRestriction testSubject0 = new UseOfIllegalFacetRestriction(_OWLOntology, _OWLAxiom, _OWLDatatypeRestriction, _OWLFacet);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatypeRestriction result0 = testSubject0.getDatatypeRestriction();
        org.semanticweb.owlapi.vocab.OWLFacet result1 = testSubject0.getFacet();
        IRI result2 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result5 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonAbsoluteIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonAbsoluteIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(UseOfNonAbsoluteIRI.class));
    }

    public void verifyUseOfNonAbsoluteIRI() {
        UseOfNonAbsoluteIRI testSubject0 = new UseOfNonAbsoluteIRI(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonAtomicClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonAtomicClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(UseOfNonAtomicClassExpression.class));
    }

    public void verifyUseOfNonAtomicClassExpression() {
        UseOfNonAtomicClassExpression testSubject0 = new UseOfNonAtomicClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getOWLClassExpression();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonEquivalentClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonEquivalentClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(UseOfNonEquivalentClassExpression.class));
    }

    public void verifyUseOfNonEquivalentClassExpression() {
        UseOfNonEquivalentClassExpression testSubject0 = new UseOfNonEquivalentClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getOWLClassExpression();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom() {
        UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom(_OWLOntology,
                _OWLAsymmetricObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLAsymmetricObjectPropertyAxiom result0 = testSubject0.getAxiom();
        OWLAxiom result1 = testSubject0.getAxiom();
        IRI result2 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result3 = testSubject0.getOntologyID();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInCardinalityRestriction() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInCardinalityRestriction.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInCardinalityRestriction.class));
    }

    public void verifyUseOfNonSimplePropertyInCardinalityRestriction() {
        UseOfNonSimplePropertyInCardinalityRestriction testSubject0 = new UseOfNonSimplePropertyInCardinalityRestriction(_OWLOntology, _OWLAxiom, _OWLObjectCardinalityRestriction);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectCardinalityRestriction result0 = testSubject0.getOWLCardinalityRestriction();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInDisjointPropertiesAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInDisjointPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInDisjointPropertiesAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInDisjointPropertiesAxiom() {
        UseOfNonSimplePropertyInDisjointPropertiesAxiom testSubject0 = new UseOfNonSimplePropertyInDisjointPropertiesAxiom(_OWLOntology, _OWLDisjointObjectPropertiesAxiom,
                _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectPropertyExpression result0 = testSubject0.getOWLObjectProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInFunctionalPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInFunctionalPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInFunctionalPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInFunctionalPropertyAxiom() {
        UseOfNonSimplePropertyInFunctionalPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInFunctionalPropertyAxiom(_OWLOntology, _OWLFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom() {
        UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom(_OWLOntology,
                _OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInIrreflexivePropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInIrreflexivePropertyAxiom() {
        UseOfNonSimplePropertyInIrreflexivePropertyAxiom testSubject0 = new UseOfNonSimplePropertyInIrreflexivePropertyAxiom(_OWLOntology, _OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInObjectHasSelf() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInObjectHasSelf.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInObjectHasSelf.class));
    }

    public void verifyUseOfNonSimplePropertyInObjectHasSelf() {
        UseOfNonSimplePropertyInObjectHasSelf testSubject0 = new UseOfNonSimplePropertyInObjectHasSelf(_OWLOntology, _OWLAxiom, _OWLObjectHasSelf);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectHasSelf result0 = testSubject0.getOWLObjectHasSelf();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSubClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSubClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(UseOfNonSubClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(UseOfNonSubClassExpression.class));
    }

    public void verifyUseOfNonSubClassExpression() {
        UseOfNonSubClassExpression testSubject0 = new UseOfNonSubClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getOWLClassExpression();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSuperClassExpression() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfNonSuperClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class.isAssignableFrom(UseOfNonSuperClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class.isAssignableFrom(UseOfNonSuperClassExpression.class));
    }

    public void verifyUseOfNonSuperClassExpression() {
        UseOfNonSuperClassExpression testSubject0 = new UseOfNonSuperClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getOWLClassExpression();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfObjectOneOfWithMultipleIndividuals() {
        assertTrue(org.semanticweb.owlapi.profiles.UseOfIllegalClassExpression.class.isAssignableFrom(UseOfObjectOneOfWithMultipleIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(UseOfObjectOneOfWithMultipleIndividuals.class));
    }

    public void verifyUseOfObjectOneOfWithMultipleIndividuals() {
        UseOfObjectOneOfWithMultipleIndividuals testSubject0 = new UseOfObjectOneOfWithMultipleIndividuals(_OWLOntology, _OWLAxiom, _OWLObjectOneOf);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLObjectOneOf result0 = testSubject0.getOWLObjectOneOf();
        OWLClassExpression result1 = testSubject0.getOWLClassExpression();
        IRI result2 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result5 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfObjectPropertyInverse() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfObjectPropertyInverse.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class.isAssignableFrom(UseOfObjectPropertyInverse.class));
    }

    public void verifyUseOfObjectPropertyInverse() {
        UseOfObjectPropertyInverse testSubject0 = new UseOfObjectPropertyInverse(_OWLOntology, _OWLAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLObjectPropertyExpression result0 = testSubject0.getOWLPropertyExpression();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfPropertyInChainCausesCycle() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfPropertyInChainCausesCycle.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfPropertyInChainCausesCycle.class));
    }

    public void verifyUseOfPropertyInChainCausesCycle() {
        UseOfPropertyInChainCausesCycle testSubject0 = new UseOfPropertyInChainCausesCycle(_OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectPropertyExpression result0 = testSubject0.getOWLObjectProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForAnnotationPropertyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForAnnotationPropertyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForAnnotationPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForAnnotationPropertyIRI() {
        UseOfReservedVocabularyForAnnotationPropertyIRI testSubject0 = new UseOfReservedVocabularyForAnnotationPropertyIRI(_OWLOntology, _OWLAxiom, _OWLAnnotationProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLAnnotationProperty result0 = testSubject0.getOWLAnnotationProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForClassIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForClassIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForClassIRI.class));
    }

    public void verifyUseOfReservedVocabularyForClassIRI() {
        UseOfReservedVocabularyForClassIRI testSubject0 = new UseOfReservedVocabularyForClassIRI(_OWLOntology, _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLClass result0 = testSubject0.getOWLClass();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForDataPropertyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForDataPropertyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForDataPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForDataPropertyIRI() {
        UseOfReservedVocabularyForDataPropertyIRI testSubject0 = new UseOfReservedVocabularyForDataPropertyIRI(_OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLDataProperty result0 = testSubject0.getOWLDataProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForIndividualIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForIndividualIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForIndividualIRI.class));
    }

    public void verifyUseOfReservedVocabularyForIndividualIRI() {
        UseOfReservedVocabularyForIndividualIRI testSubject0 = new UseOfReservedVocabularyForIndividualIRI(_OWLOntology, _OWLAxiom, _OWLNamedIndividual);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLNamedIndividual result0 = testSubject0.getOWLNamedIndividual();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForObjectPropertyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForObjectPropertyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForObjectPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForObjectPropertyIRI() {
        UseOfReservedVocabularyForObjectPropertyIRI testSubject0 = new UseOfReservedVocabularyForObjectPropertyIRI(_OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectProperty result0 = testSubject0.getOWLObjectProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForOntologyIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForOntologyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForOntologyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForOntologyIRI() {
        UseOfReservedVocabularyForOntologyIRI testSubject0 = new UseOfReservedVocabularyForOntologyIRI(_OWLOntology);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForVersionIRI() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForVersionIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForVersionIRI.class));
    }

    public void verifyUseOfReservedVocabularyForVersionIRI() {
        UseOfReservedVocabularyForVersionIRI testSubject0 = new UseOfReservedVocabularyForVersionIRI(_OWLOntology);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class));
    }

    public void verifyUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom() {
        UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom testSubject0 = new UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom(_OWLOntology, _OWLSubDataPropertyOfAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result3 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredAnnotationProperty() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
    }

    public void verifyUseOfUndeclaredAnnotationProperty() {
        UseOfUndeclaredAnnotationProperty testSubject0 = new UseOfUndeclaredAnnotationProperty(_OWLOntology, _OWLAxiom, _OWLAnnotation, _OWLAnnotationProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLAnnotationProperty result0 = testSubject0.getOWLAnnotationProperty();
        OWLAnnotation result1 = testSubject0.getOWLAnnotation();
        IRI result2 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result5 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredClass() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredClass.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfUndeclaredClass.class));
    }

    public void verifyUseOfUndeclaredClass() {
        UseOfUndeclaredClass testSubject0 = new UseOfUndeclaredClass(_OWLOntology, _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLClass result0 = testSubject0.getOWLClass();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDataProperty() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDataProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDataProperty.class));
    }

    public void verifyUseOfUndeclaredDataProperty() {
        UseOfUndeclaredDataProperty testSubject0 = new UseOfUndeclaredDataProperty(_OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLDataProperty result0 = testSubject0.getOWLDataProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDatatype() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDatatype.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(UseOfUndeclaredDatatype.class));
    }

    public void verifyUseOfUndeclaredDatatype() {
        UseOfUndeclaredDatatype testSubject0 = new UseOfUndeclaredDatatype(_OWLOntology, _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatype result0 = testSubject0.getDatatype();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredObjectProperty() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredObjectProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class.isAssignableFrom(UseOfUndeclaredObjectProperty.class));
    }

    public void verifyUseOfUndeclaredObjectProperty() {
        UseOfUndeclaredObjectProperty testSubject0 = new UseOfUndeclaredObjectProperty(_OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectProperty result0 = testSubject0.getOWLObjectProperty();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUnknownDatatype() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(UseOfUnknownDatatype.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class.isAssignableFrom(UseOfUnknownDatatype.class));
    }

    public void verifyUseOfUnknownDatatype() {
        UseOfUnknownDatatype testSubject0 = new UseOfUnknownDatatype(_OWLOntology, _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatype result0 = testSubject0.getDatatype();
        IRI result1 = testSubject0.getDocumentIRI(_OWLOntologyID);
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<OWLOntologyID> result4 = testSubject0.getImportsClosure();
    }

    private java.util.Set<OWLObjectPropertyExpression> _Set52;
    private java.util.Set<org.semanticweb.owlapi.profiles.OWLProfileViolation> _Set;
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
    private OWLOntologyID _OWLOntologyID;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.profiles.CycleInDatatypeDefinition _CycleInDatatypeDefinition;
    private org.semanticweb.owlapi.profiles.DatatypeIRIAlsoUsedAsClassIRI _DatatypeIRIAlsoUsedAsClassIRI;
    private org.semanticweb.owlapi.profiles.EmptyOneOfAxiom _EmptyOneOfAxiom;
    private org.semanticweb.owlapi.profiles.IllegalPunning _IllegalPunning;
    private org.semanticweb.owlapi.profiles.InsufficientIndividuals _InsufficientIndividuals;
    private org.semanticweb.owlapi.profiles.InsufficientOperands _InsufficientOperands;
    private org.semanticweb.owlapi.profiles.InsufficientPropertyExpressions _InsufficientPropertyExpressions;
    private org.semanticweb.owlapi.profiles.LastPropertyInChainNotInImposedRange _LastPropertyInChainNotInImposedRange;
    private org.semanticweb.owlapi.profiles.LexicalNotInLexicalSpace _LexicalNotInLexicalSpace;
    private org.semanticweb.owlapi.profiles.OWL2DLProfileViolationVisitor _OWL2DLProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWL2ELProfileViolationVisitor _OWL2ELProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWL2ProfileViolationVisitor _OWL2ProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWL2QLProfileViolationVisitor _OWL2QLProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWL2RLProfileViolationVisitor _OWL2RLProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWLProfile _OWLProfile;
    private org.semanticweb.owlapi.profiles.OntologyIRINotAbsolute _OntologyIRINotAbsolute;
    private org.semanticweb.owlapi.profiles.OntologyVersionIRINotAbsolute _OntologyVersionIRINotAbsolute;
    private org.semanticweb.owlapi.profiles.UseOfAnonymousIndividual _UseOfAnonymousIndividual;
    private org.semanticweb.owlapi.profiles.UseOfBuiltInDatatypeInDatatypeDefinition _UseOfBuiltInDatatypeInDatatypeDefinition;
    private org.semanticweb.owlapi.profiles.UseOfDataOneOfWithMultipleLiterals _UseOfDataOneOfWithMultipleLiterals;
    private org.semanticweb.owlapi.profiles.UseOfDefinedDatatypeInDatatypeRestriction _UseOfDefinedDatatypeInDatatypeRestriction;
    private org.semanticweb.owlapi.profiles.UseOfIllegalAxiom _UseOfIllegalAxiom;
    private org.semanticweb.owlapi.profiles.UseOfIllegalClassExpression _UseOfIllegalClassExpression;
    private org.semanticweb.owlapi.profiles.UseOfIllegalDataRange _UseOfIllegalDataRange;
    private org.semanticweb.owlapi.profiles.UseOfIllegalFacetRestriction _UseOfIllegalFacetRestriction;
    private org.semanticweb.owlapi.profiles.UseOfNonAbsoluteIRI _UseOfNonAbsoluteIRI;
    private org.semanticweb.owlapi.profiles.UseOfNonAtomicClassExpression _UseOfNonAtomicClassExpression;
    private org.semanticweb.owlapi.profiles.UseOfNonEquivalentClassExpression _UseOfNonEquivalentClassExpression;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom _UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInCardinalityRestriction _UseOfNonSimplePropertyInCardinalityRestriction;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInDisjointPropertiesAxiom _UseOfNonSimplePropertyInDisjointPropertiesAxiom;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInFunctionalPropertyAxiom _UseOfNonSimplePropertyInFunctionalPropertyAxiom;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom _UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInIrreflexivePropertyAxiom _UseOfNonSimplePropertyInIrreflexivePropertyAxiom;
    private org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInObjectHasSelf _UseOfNonSimplePropertyInObjectHasSelf;
    private org.semanticweb.owlapi.profiles.UseOfNonSubClassExpression _UseOfNonSubClassExpression;
    private org.semanticweb.owlapi.profiles.UseOfNonSuperClassExpression _UseOfNonSuperClassExpression;
    private org.semanticweb.owlapi.profiles.UseOfObjectOneOfWithMultipleIndividuals _UseOfObjectOneOfWithMultipleIndividuals;
    private org.semanticweb.owlapi.profiles.UseOfObjectPropertyInverse _UseOfObjectPropertyInverse;
    private org.semanticweb.owlapi.profiles.UseOfPropertyInChainCausesCycle _UseOfPropertyInChainCausesCycle;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForAnnotationPropertyIRI _UseOfReservedVocabularyForAnnotationPropertyIRI;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForClassIRI _UseOfReservedVocabularyForClassIRI;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForDataPropertyIRI _UseOfReservedVocabularyForDataPropertyIRI;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForIndividualIRI _UseOfReservedVocabularyForIndividualIRI;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForObjectPropertyIRI _UseOfReservedVocabularyForObjectPropertyIRI;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForOntologyIRI _UseOfReservedVocabularyForOntologyIRI;
    private org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForVersionIRI _UseOfReservedVocabularyForVersionIRI;
    private org.semanticweb.owlapi.profiles.UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom _UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom;
    private org.semanticweb.owlapi.profiles.UseOfUndeclaredAnnotationProperty _UseOfUndeclaredAnnotationProperty;
    private org.semanticweb.owlapi.profiles.UseOfUndeclaredClass _UseOfUndeclaredClass;
    private org.semanticweb.owlapi.profiles.UseOfUndeclaredDataProperty _UseOfUndeclaredDataProperty;
    private org.semanticweb.owlapi.profiles.UseOfUndeclaredDatatype _UseOfUndeclaredDatatype;
    private org.semanticweb.owlapi.profiles.UseOfUndeclaredObjectProperty _UseOfUndeclaredObjectProperty;
    private org.semanticweb.owlapi.profiles.UseOfUnknownDatatype _UseOfUnknownDatatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
