package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.profiles.CycleInDatatypeDefinition;
import org.semanticweb.owlapi.profiles.DatatypeIRIAlsoUsedAsClassIRI;
import org.semanticweb.owlapi.profiles.EmptyOneOfAxiom;
import org.semanticweb.owlapi.profiles.IllegalPunning;
import org.semanticweb.owlapi.profiles.InsufficientIndividuals;
import org.semanticweb.owlapi.profiles.InsufficientOperands;
import org.semanticweb.owlapi.profiles.InsufficientPropertyExpressions;
import org.semanticweb.owlapi.profiles.LastPropertyInChainNotInImposedRange;
import org.semanticweb.owlapi.profiles.LexicalNotInLexicalSpace;
import org.semanticweb.owlapi.profiles.OWL2DLProfile;
import org.semanticweb.owlapi.profiles.OWL2DLProfileViolation;
import org.semanticweb.owlapi.profiles.OWL2DLProfileViolationVisitor;
import org.semanticweb.owlapi.profiles.OWL2ELProfile;
import org.semanticweb.owlapi.profiles.OWL2ELProfileViolation;
import org.semanticweb.owlapi.profiles.OWL2ELProfileViolationVisitor;
import org.semanticweb.owlapi.profiles.OWL2Profile;
import org.semanticweb.owlapi.profiles.OWL2ProfileReport;
import org.semanticweb.owlapi.profiles.OWL2ProfileViolation;
import org.semanticweb.owlapi.profiles.OWL2ProfileViolationVisitor;
import org.semanticweb.owlapi.profiles.OWL2QLProfile;
import org.semanticweb.owlapi.profiles.OWL2QLProfileViolation;
import org.semanticweb.owlapi.profiles.OWL2QLProfileViolationVisitor;
import org.semanticweb.owlapi.profiles.OWL2RLProfile;
import org.semanticweb.owlapi.profiles.OWL2RLProfileViolation;
import org.semanticweb.owlapi.profiles.OWL2RLProfileViolationVisitor;
import org.semanticweb.owlapi.profiles.OWLProfile;
import org.semanticweb.owlapi.profiles.OWLProfileReport;
import org.semanticweb.owlapi.profiles.OWLProfileViolation;
import org.semanticweb.owlapi.profiles.OntologyIRINotAbsolute;
import org.semanticweb.owlapi.profiles.OntologyVersionIRINotAbsolute;
import org.semanticweb.owlapi.profiles.UseOfAnonymousIndividual;
import org.semanticweb.owlapi.profiles.UseOfBuiltInDatatypeInDatatypeDefinition;
import org.semanticweb.owlapi.profiles.UseOfDataOneOfWithMultipleLiterals;
import org.semanticweb.owlapi.profiles.UseOfDefinedDatatypeInDatatypeRestriction;
import org.semanticweb.owlapi.profiles.UseOfIllegalAxiom;
import org.semanticweb.owlapi.profiles.UseOfIllegalClassExpression;
import org.semanticweb.owlapi.profiles.UseOfIllegalDataRange;
import org.semanticweb.owlapi.profiles.UseOfIllegalFacetRestriction;
import org.semanticweb.owlapi.profiles.UseOfNonAbsoluteIRI;
import org.semanticweb.owlapi.profiles.UseOfNonAtomicClassExpression;
import org.semanticweb.owlapi.profiles.UseOfNonEquivalentClassExpression;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInCardinalityRestriction;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInDisjointPropertiesAxiom;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInFunctionalPropertyAxiom;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInIrreflexivePropertyAxiom;
import org.semanticweb.owlapi.profiles.UseOfNonSimplePropertyInObjectHasSelf;
import org.semanticweb.owlapi.profiles.UseOfNonSubClassExpression;
import org.semanticweb.owlapi.profiles.UseOfNonSuperClassExpression;
import org.semanticweb.owlapi.profiles.UseOfObjectOneOfWithMultipleIndividuals;
import org.semanticweb.owlapi.profiles.UseOfObjectPropertyInverse;
import org.semanticweb.owlapi.profiles.UseOfPropertyInChainCausesCycle;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForAnnotationPropertyIRI;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForClassIRI;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForDataPropertyIRI;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForIndividualIRI;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForObjectPropertyIRI;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForOntologyIRI;
import org.semanticweb.owlapi.profiles.UseOfReservedVocabularyForVersionIRI;
import org.semanticweb.owlapi.profiles.UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom;
import org.semanticweb.owlapi.profiles.UseOfUndeclaredAnnotationProperty;
import org.semanticweb.owlapi.profiles.UseOfUndeclaredClass;
import org.semanticweb.owlapi.profiles.UseOfUndeclaredDataProperty;
import org.semanticweb.owlapi.profiles.UseOfUndeclaredDatatype;
import org.semanticweb.owlapi.profiles.UseOfUndeclaredObjectProperty;
import org.semanticweb.owlapi.profiles.UseOfUnknownDatatype;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_profiles {
    @Test
    public void enforceInterfacesCycleInDatatypeDefinition() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(CycleInDatatypeDefinition.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(CycleInDatatypeDefinition.class));
    }

    public void verifyCycleInDatatypeDefinition() throws Exception {
        CycleInDatatypeDefinition testSubject0 = new CycleInDatatypeDefinition(
                _OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesDatatypeIRIAlsoUsedAsClassIRI() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(DatatypeIRIAlsoUsedAsClassIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(DatatypeIRIAlsoUsedAsClassIRI.class));
    }

    public void verifyDatatypeIRIAlsoUsedAsClassIRI() throws Exception {
        DatatypeIRIAlsoUsedAsClassIRI testSubject0 = new DatatypeIRIAlsoUsedAsClassIRI(
                _OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesEmptyOneOfAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(EmptyOneOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(EmptyOneOfAxiom.class));
    }

    public void verifyEmptyOneOfAxiom() throws Exception {
        EmptyOneOfAxiom testSubject0 = new EmptyOneOfAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesIllegalPunning() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(IllegalPunning.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(IllegalPunning.class));
    }

    public void verifyIllegalPunning() throws Exception {
        IllegalPunning testSubject0 = new IllegalPunning(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesInsufficientIndividuals() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(InsufficientIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(InsufficientIndividuals.class));
    }

    public void verifyInsufficientIndividuals() throws Exception {
        InsufficientIndividuals testSubject0 = new InsufficientIndividuals(_OWLOntology,
                _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesInsufficientOperands() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(InsufficientOperands.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(InsufficientOperands.class));
    }

    public void verifyInsufficientOperands() throws Exception {
        InsufficientOperands testSubject0 = new InsufficientOperands(_OWLOntology,
                _OWLAxiom, _OWLObject);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesInsufficientPropertyExpressions() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(InsufficientPropertyExpressions.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(InsufficientPropertyExpressions.class));
    }

    public void verifyInsufficientPropertyExpressions() throws Exception {
        InsufficientPropertyExpressions testSubject0 = new InsufficientPropertyExpressions(
                _OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesLastPropertyInChainNotInImposedRange() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(LastPropertyInChainNotInImposedRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(LastPropertyInChainNotInImposedRange.class));
    }

    public void verifyLastPropertyInChainNotInImposedRange() throws Exception {
        LastPropertyInChainNotInImposedRange testSubject0 = new LastPropertyInChainNotInImposedRange(
                _OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyRangeAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result0 = testSubject0
                .getOWLSubPropertyChainOfAxiom();
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result1 = testSubject0
                .getOWLObjectPropertyRangeAxiom();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result5 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesLexicalNotInLexicalSpace() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(LexicalNotInLexicalSpace.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(LexicalNotInLexicalSpace.class));
    }

    public void verifyLexicalNotInLexicalSpace() throws Exception {
        LexicalNotInLexicalSpace testSubject0 = new LexicalNotInLexicalSpace(
                _OWLOntology, _OWLAxiom, _OWLLiteral);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLLiteral result0 = testSubject0.getLiteral();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesOntologyIRINotAbsolute() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(OntologyIRINotAbsolute.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(OntologyIRINotAbsolute.class));
    }

    public void verifyOntologyIRINotAbsolute() throws Exception {
        OntologyIRINotAbsolute testSubject0 = new OntologyIRINotAbsolute(_OWLOntology);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesOntologyVersionIRINotAbsolute() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(OntologyVersionIRINotAbsolute.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(OntologyVersionIRINotAbsolute.class));
    }

    public void verifyOntologyVersionIRINotAbsolute() throws Exception {
        OntologyVersionIRINotAbsolute testSubject0 = new OntologyVersionIRINotAbsolute(
                _OWLOntology);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesOWL2DLProfile() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class
                .isAssignableFrom(OWL2DLProfile.class));
    }

    public void verifyOWL2DLProfile() throws Exception {
        OWL2DLProfile testSubject0 = new OWL2DLProfile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0
                .checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2DLProfileViolation() throws Exception {
        OWL2DLProfileViolation testSubject0 = mock(OWL2DLProfileViolation.class);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2DLProfileViolationVisitor() throws Exception {
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
    public void enforceInterfacesOWL2ELProfile() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class
                .isAssignableFrom(OWL2ELProfile.class));
    }

    public void verifyOWL2ELProfile() throws Exception {
        OWL2ELProfile testSubject0 = new OWL2ELProfile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0
                .checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2ELProfileViolation() throws Exception {
        OWL2ELProfileViolation testSubject0 = mock(OWL2ELProfileViolation.class);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2ELProfileViolationVisitor() throws Exception {
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
    public void enforceInterfacesOWL2Profile() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class
                .isAssignableFrom(OWL2Profile.class));
    }

    public void verifyOWL2Profile() throws Exception {
        OWL2Profile testSubject0 = new OWL2Profile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0
                .checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWL2ProfileReport() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileReport.class
                .isAssignableFrom(OWL2ProfileReport.class));
    }

    public void verifyOWL2ProfileReport() throws Exception {
        OWL2ProfileReport testSubject0 = new OWL2ProfileReport(_OWLProfile, _Set, _Set52,
                _Set52);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result0 = testSubject0
                .getNonSimpleRoles();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result1 = testSubject0
                .getSimpleRoles();
        boolean result2 = testSubject0.isInProfile();
        java.util.List<org.semanticweb.owlapi.profiles.OWLProfileViolation> result3 = testSubject0
                .getViolations();
        org.semanticweb.owlapi.profiles.OWLProfile result4 = testSubject0.getProfile();
    }

    public void verifyInterfaceOWL2ProfileViolation() throws Exception {
        OWL2ProfileViolation testSubject0 = mock(OWL2ProfileViolation.class);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2ProfileViolationVisitor() throws Exception {
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
    public void enforceInterfacesOWL2QLProfile() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class
                .isAssignableFrom(OWL2QLProfile.class));
    }

    public void verifyOWL2QLProfile() throws Exception {
        OWL2QLProfile testSubject0 = new OWL2QLProfile();
        java.lang.String result0 = testSubject0.getName();
        boolean result1 = testSubject0.isOWL2QLSuperClassExpression(_OWLClassExpression);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result3 = testSubject0
                .checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2QLProfileViolation() throws Exception {
        OWL2QLProfileViolation testSubject0 = mock(OWL2QLProfileViolation.class);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2QLProfileViolationVisitor() throws Exception {
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
    public void enforceInterfacesOWL2RLProfile() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class
                .isAssignableFrom(OWL2RLProfile.class));
    }

    public void verifyOWL2RLProfile() throws Exception {
        OWL2RLProfile testSubject0 = new OWL2RLProfile();
        java.lang.String result0 = testSubject0.getName();
        boolean result1 = testSubject0.isOWL2RLSuperClassExpression(_OWLClassExpression);
        boolean result2 = testSubject0
                .isOWL2RLEquivalentClassExpression(_OWLClassExpression);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result4 = testSubject0
                .checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWL2RLProfileViolation() throws Exception {
        OWL2RLProfileViolation testSubject0 = mock(OWL2RLProfileViolation.class);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
    }

    public void verifyInterfaceOWL2RLProfileViolationVisitor() throws Exception {
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

    public void verifyInterfaceOWLProfile() throws Exception {
        OWLProfile testSubject0 = mock(OWLProfile.class);
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfileReport result2 = testSubject0
                .checkOntology(_OWLOntology);
    }

    public void verifyOWLProfileReport() throws Exception {
        OWLProfileReport testSubject0 = new OWLProfileReport(_OWLProfile, _Set);
        boolean result0 = testSubject0.isInProfile();
        java.util.List<org.semanticweb.owlapi.profiles.OWLProfileViolation> result1 = testSubject0
                .getViolations();
        org.semanticweb.owlapi.profiles.OWLProfile result2 = testSubject0.getProfile();
    }

    public void verifyOWLProfileViolation() throws Exception {
        OWLProfileViolation testSubject0 = new OWLProfileViolation(_OWLOntology,
                _OWLAxiom);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfAnonymousIndividual() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfAnonymousIndividual.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(UseOfAnonymousIndividual.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(UseOfAnonymousIndividual.class));
    }

    public void verifyUseOfAnonymousIndividual() throws Exception {
        UseOfAnonymousIndividual testSubject0 = new UseOfAnonymousIndividual(
                _OWLOntology, _OWLAxiom, _OWLAnonymousIndividual);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result0 = testSubject0
                .getOWLAnonymousIndividual();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfBuiltInDatatypeInDatatypeDefinition()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfBuiltInDatatypeInDatatypeDefinition.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfBuiltInDatatypeInDatatypeDefinition.class));
    }

    public void verifyUseOfBuiltInDatatypeInDatatypeDefinition() throws Exception {
        UseOfBuiltInDatatypeInDatatypeDefinition testSubject0 = new UseOfBuiltInDatatypeInDatatypeDefinition(
                _OWLOntology, _OWLDatatypeDefinitionAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfDataOneOfWithMultipleLiterals() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.UseOfIllegalDataRange.class
                .isAssignableFrom(UseOfDataOneOfWithMultipleLiterals.class));
    }

    public void verifyUseOfDataOneOfWithMultipleLiterals() throws Exception {
        UseOfDataOneOfWithMultipleLiterals testSubject0 = new UseOfDataOneOfWithMultipleLiterals(
                _OWLOntology, _OWLAxiom, _OWLDataOneOf);
        org.semanticweb.owlapi.model.OWLDataOneOf result0 = testSubject0.getDataOneOf();
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0
                .getOWLDataRange();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result5 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfDefinedDatatypeInDatatypeRestriction()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfDefinedDatatypeInDatatypeRestriction.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(UseOfDefinedDatatypeInDatatypeRestriction.class));
    }

    public void verifyUseOfDefinedDatatypeInDatatypeRestriction() throws Exception {
        UseOfDefinedDatatypeInDatatypeRestriction testSubject0 = new UseOfDefinedDatatypeInDatatypeRestriction(
                _OWLOntology, _OWLAxiom, _OWLDatatypeRestriction);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result0 = testSubject0
                .getOWLDatatypeRestriction();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfIllegalAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(UseOfIllegalAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(UseOfIllegalAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(UseOfIllegalAxiom.class));
    }

    public void verifyUseOfIllegalAxiom() throws Exception {
        UseOfIllegalAxiom testSubject0 = new UseOfIllegalAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfIllegalClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(UseOfIllegalClassExpression.class));
    }

    public void verifyUseOfIllegalClassExpression() throws Exception {
        UseOfIllegalClassExpression testSubject0 = new UseOfIllegalClassExpression(
                _OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLClassExpression();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalDataRange() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfIllegalDataRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(UseOfIllegalDataRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(UseOfIllegalDataRange.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(UseOfIllegalDataRange.class));
    }

    public void verifyUseOfIllegalDataRange() throws Exception {
        UseOfIllegalDataRange testSubject0 = new UseOfIllegalDataRange(_OWLOntology,
                _OWLAxiom, _OWLDataRange);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDataRange result0 = testSubject0
                .getOWLDataRange();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfIllegalFacetRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfIllegalFacetRestriction.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(UseOfIllegalFacetRestriction.class));
    }

    public void verifyUseOfIllegalFacetRestriction() throws Exception {
        UseOfIllegalFacetRestriction testSubject0 = new UseOfIllegalFacetRestriction(
                _OWLOntology, _OWLAxiom, _OWLDatatypeRestriction, _OWLFacet);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result0 = testSubject0
                .getDatatypeRestriction();
        org.semanticweb.owlapi.vocab.OWLFacet result1 = testSubject0.getFacet();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result5 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonAbsoluteIRI() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonAbsoluteIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(UseOfNonAbsoluteIRI.class));
    }

    public void verifyUseOfNonAbsoluteIRI() throws Exception {
        UseOfNonAbsoluteIRI testSubject0 = new UseOfNonAbsoluteIRI(_OWLOntology,
                _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonAtomicClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonAtomicClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(UseOfNonAtomicClassExpression.class));
    }

    public void verifyUseOfNonAtomicClassExpression() throws Exception {
        UseOfNonAtomicClassExpression testSubject0 = new UseOfNonAtomicClassExpression(
                _OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLClassExpression();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonEquivalentClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonEquivalentClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(UseOfNonEquivalentClassExpression.class));
    }

    public void verifyUseOfNonEquivalentClassExpression() throws Exception {
        UseOfNonEquivalentClassExpression testSubject0 = new UseOfNonEquivalentClassExpression(
                _OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLClassExpression();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom()
            throws Exception {
        UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom(
                _OWLOntology, _OWLAsymmetricObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result0 = testSubject0
                .getAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result1 = testSubject0.getAxiom();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getOntologyID();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInCardinalityRestriction()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInCardinalityRestriction.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInCardinalityRestriction.class));
    }

    public void verifyUseOfNonSimplePropertyInCardinalityRestriction() throws Exception {
        UseOfNonSimplePropertyInCardinalityRestriction testSubject0 = new UseOfNonSimplePropertyInCardinalityRestriction(
                _OWLOntology, _OWLAxiom, _OWLObjectCardinalityRestriction);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction result0 = testSubject0
                .getOWLCardinalityRestriction();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInDisjointPropertiesAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInDisjointPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInDisjointPropertiesAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInDisjointPropertiesAxiom() throws Exception {
        UseOfNonSimplePropertyInDisjointPropertiesAxiom testSubject0 = new UseOfNonSimplePropertyInDisjointPropertiesAxiom(
                _OWLOntology, _OWLDisjointObjectPropertiesAxiom,
                _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getOWLObjectProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInFunctionalPropertyAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInFunctionalPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInFunctionalPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInFunctionalPropertyAxiom() throws Exception {
        UseOfNonSimplePropertyInFunctionalPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInFunctionalPropertyAxiom(
                _OWLOntology, _OWLFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public
            void
            enforceInterfacesUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom()
                    throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom()
            throws Exception {
        UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom(
                _OWLOntology, _OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInIrreflexivePropertyAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInIrreflexivePropertyAxiom() throws Exception {
        UseOfNonSimplePropertyInIrreflexivePropertyAxiom testSubject0 = new UseOfNonSimplePropertyInIrreflexivePropertyAxiom(
                _OWLOntology, _OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInObjectHasSelf() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInObjectHasSelf.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfNonSimplePropertyInObjectHasSelf.class));
    }

    public void verifyUseOfNonSimplePropertyInObjectHasSelf() throws Exception {
        UseOfNonSimplePropertyInObjectHasSelf testSubject0 = new UseOfNonSimplePropertyInObjectHasSelf(
                _OWLOntology, _OWLAxiom, _OWLObjectHasSelf);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectHasSelf result0 = testSubject0
                .getOWLObjectHasSelf();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSubClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSubClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(UseOfNonSubClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(UseOfNonSubClassExpression.class));
    }

    public void verifyUseOfNonSubClassExpression() throws Exception {
        UseOfNonSubClassExpression testSubject0 = new UseOfNonSubClassExpression(
                _OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLClassExpression();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfNonSuperClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfNonSuperClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2QLProfileViolation.class
                .isAssignableFrom(UseOfNonSuperClassExpression.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2RLProfileViolation.class
                .isAssignableFrom(UseOfNonSuperClassExpression.class));
    }

    public void verifyUseOfNonSuperClassExpression() throws Exception {
        UseOfNonSuperClassExpression testSubject0 = new UseOfNonSuperClassExpression(
                _OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLClassExpression();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfObjectOneOfWithMultipleIndividuals()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.UseOfIllegalClassExpression.class
                .isAssignableFrom(UseOfObjectOneOfWithMultipleIndividuals.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(UseOfObjectOneOfWithMultipleIndividuals.class));
    }

    public void verifyUseOfObjectOneOfWithMultipleIndividuals() throws Exception {
        UseOfObjectOneOfWithMultipleIndividuals testSubject0 = new UseOfObjectOneOfWithMultipleIndividuals(
                _OWLOntology, _OWLAxiom, _OWLObjectOneOf);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectOneOf result0 = testSubject0
                .getOWLObjectOneOf();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .getOWLClassExpression();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result5 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfObjectPropertyInverse() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfObjectPropertyInverse.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ELProfileViolation.class
                .isAssignableFrom(UseOfObjectPropertyInverse.class));
    }

    public void verifyUseOfObjectPropertyInverse() throws Exception {
        UseOfObjectPropertyInverse testSubject0 = new UseOfObjectPropertyInverse(
                _OWLOntology, _OWLAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getOWLPropertyExpression();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfPropertyInChainCausesCycle() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfPropertyInChainCausesCycle.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfPropertyInChainCausesCycle.class));
    }

    public void verifyUseOfPropertyInChainCausesCycle() throws Exception {
        UseOfPropertyInChainCausesCycle testSubject0 = new UseOfPropertyInChainCausesCycle(
                _OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getOWLObjectProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForAnnotationPropertyIRI()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForAnnotationPropertyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForAnnotationPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForAnnotationPropertyIRI() throws Exception {
        UseOfReservedVocabularyForAnnotationPropertyIRI testSubject0 = new UseOfReservedVocabularyForAnnotationPropertyIRI(
                _OWLOntology, _OWLAxiom, _OWLAnnotationProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getOWLAnnotationProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForClassIRI() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForClassIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForClassIRI.class));
    }

    public void verifyUseOfReservedVocabularyForClassIRI() throws Exception {
        UseOfReservedVocabularyForClassIRI testSubject0 = new UseOfReservedVocabularyForClassIRI(
                _OWLOntology, _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForDataPropertyIRI()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForDataPropertyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForDataPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForDataPropertyIRI() throws Exception {
        UseOfReservedVocabularyForDataPropertyIRI testSubject0 = new UseOfReservedVocabularyForDataPropertyIRI(
                _OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDataProperty result0 = testSubject0
                .getOWLDataProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForIndividualIRI()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForIndividualIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForIndividualIRI.class));
    }

    public void verifyUseOfReservedVocabularyForIndividualIRI() throws Exception {
        UseOfReservedVocabularyForIndividualIRI testSubject0 = new UseOfReservedVocabularyForIndividualIRI(
                _OWLOntology, _OWLAxiom, _OWLNamedIndividual);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLNamedIndividual result0 = testSubject0
                .getOWLNamedIndividual();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForObjectPropertyIRI()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForObjectPropertyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForObjectPropertyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForObjectPropertyIRI() throws Exception {
        UseOfReservedVocabularyForObjectPropertyIRI testSubject0 = new UseOfReservedVocabularyForObjectPropertyIRI(
                _OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectProperty result0 = testSubject0
                .getOWLObjectProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForOntologyIRI() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForOntologyIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForOntologyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForOntologyIRI() throws Exception {
        UseOfReservedVocabularyForOntologyIRI testSubject0 = new UseOfReservedVocabularyForOntologyIRI(
                _OWLOntology);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForVersionIRI() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForVersionIRI.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfReservedVocabularyForVersionIRI.class));
    }

    public void verifyUseOfReservedVocabularyForVersionIRI() throws Exception {
        UseOfReservedVocabularyForVersionIRI testSubject0 = new UseOfReservedVocabularyForVersionIRI(
                _OWLOntology);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class));
    }

    public void verifyUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom()
            throws Exception {
        UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom testSubject0 = new UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom(
                _OWLOntology, _OWLSubDataPropertyOfAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result3 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredAnnotationProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
    }

    public void verifyUseOfUndeclaredAnnotationProperty() throws Exception {
        UseOfUndeclaredAnnotationProperty testSubject0 = new UseOfUndeclaredAnnotationProperty(
                _OWLOntology, _OWLAxiom, _OWLAnnotation, _OWLAnnotationProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotation result1 = testSubject0
                .getOWLAnnotation();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result5 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredClass() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredClass.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredClass.class));
    }

    public void verifyUseOfUndeclaredClass() throws Exception {
        UseOfUndeclaredClass testSubject0 = new UseOfUndeclaredClass(_OWLOntology,
                _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDataProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredDataProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredDataProperty.class));
    }

    public void verifyUseOfUndeclaredDataProperty() throws Exception {
        UseOfUndeclaredDataProperty testSubject0 = new UseOfUndeclaredDataProperty(
                _OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDataProperty result0 = testSubject0
                .getOWLDataProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDatatype() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredDatatype.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredDatatype.class));
    }

    public void verifyUseOfUndeclaredDatatype() throws Exception {
        UseOfUndeclaredDatatype testSubject0 = new UseOfUndeclaredDatatype(_OWLOntology,
                _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDatatype result0 = testSubject0.getDatatype();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredObjectProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredObjectProperty.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2DLProfileViolation.class
                .isAssignableFrom(UseOfUndeclaredObjectProperty.class));
    }

    public void verifyUseOfUndeclaredObjectProperty() throws Exception {
        UseOfUndeclaredObjectProperty testSubject0 = new UseOfUndeclaredObjectProperty(
                _OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLObjectProperty result0 = testSubject0
                .getOWLObjectProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    @Test
    public void enforceInterfacesUseOfUnknownDatatype() throws Exception {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class
                .isAssignableFrom(UseOfUnknownDatatype.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWL2ProfileViolation.class
                .isAssignableFrom(UseOfUnknownDatatype.class));
    }

    public void verifyUseOfUnknownDatatype() throws Exception {
        UseOfUnknownDatatype testSubject0 = new UseOfUnknownDatatype(_OWLOntology,
                _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        org.semanticweb.owlapi.model.OWLDatatype result0 = testSubject0.getDatatype();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0
                .getDocumentIRI(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result4 = testSubject0
                .getImportsClosure();
    }

    private java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Set52;
    private java.util.Set<org.semanticweb.owlapi.profiles.OWLProfileViolation> _Set;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataOneOf _OWLDataOneOf;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataRange _OWLDataRange;
    private org.semanticweb.owlapi.model.OWLDatatype _OWLDatatype;
    private org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private org.semanticweb.owlapi.model.OWLDatatypeRestriction _OWLDatatypeRestriction;
    private org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
    private org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction _OWLObjectCardinalityRestriction;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyID _OWLOntologyID;
    private org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
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
