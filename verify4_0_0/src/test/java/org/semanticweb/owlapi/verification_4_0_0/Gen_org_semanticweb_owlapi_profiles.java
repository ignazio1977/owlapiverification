package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.*;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_profiles {
    @Test
    public void enforceInterfacesOWL2DLProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2DLProfile.class));
    }

    public void verifyOWL2DLProfile() {
        OWL2DLProfile testSubject0 = new OWL2DLProfile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.profiles.OWLProfileReport result1 = testSubject0.checkOntology(_OWLOntology);
        IRI result2 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWL2ELProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2ELProfile.class));
    }

    public void verifyOWL2ELProfile() {
        OWL2ELProfile testSubject0 = new OWL2ELProfile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.profiles.OWLProfileReport result1 = testSubject0.checkOntology(_OWLOntology);
        IRI result2 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWL2Profile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2Profile.class));
    }

    public void verifyOWL2Profile() {
        OWL2Profile testSubject0 = new OWL2Profile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.profiles.OWLProfileReport result1 = testSubject0.checkOntology(_OWLOntology);
        IRI result2 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWL2ProfileReport() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileReport.class.isAssignableFrom(OWL2ProfileReport.class));
    }

    public void verifyOWL2ProfileReport() {
        OWL2ProfileReport testSubject0 = new OWL2ProfileReport(_OWLProfile, _Set, _Set3, _Set3);
        java.util.Set<OWLObjectPropertyExpression> result0 = testSubject0.getNonSimpleRoles();
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0.getSimpleRoles();
        boolean result2 = testSubject0.isInProfile();
        java.util.List<org.semanticweb.owlapi.profiles.OWLProfileViolation> result3 = testSubject0.getViolations();
        org.semanticweb.owlapi.profiles.OWLProfile result4 = testSubject0.getProfile();
    }

    @Test
    public void enforceInterfacesOWL2QLProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2QLProfile.class));
    }

    public void verifyOWL2QLProfile() {
        OWL2QLProfile testSubject0 = new OWL2QLProfile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.profiles.OWLProfileReport result1 = testSubject0.checkOntology(_OWLOntology);
        boolean result2 = testSubject0.isOWL2QLSuperClassExpression(_OWLClassExpression);
        IRI result3 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWL2RLProfile() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(OWL2RLProfile.class));
    }

    public void verifyOWL2RLProfile() {
        OWL2RLProfile testSubject0 = new OWL2RLProfile();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.profiles.OWLProfileReport result1 = testSubject0.checkOntology(_OWLOntology);
        boolean result2 = testSubject0.isOWL2RLSuperClassExpression(_OWLClassExpression);
        boolean result3 = testSubject0.isOWL2RLEquivalentClassExpression(_OWLClassExpression);
        IRI result4 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLOntologyProfileWalker() {
        assertTrue(org.semanticweb.owlapi.util.OWLOntologyWalker.class.isAssignableFrom(OWLOntologyProfileWalker.class));
    }

    public void verifyOWLOntologyProfileWalker() {
        OWLOntologyProfileWalker testSubject0 = new OWLOntologyProfileWalker(_Set5);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        testSubject0.walkStructure(_OWLObjectVisitorEx);
        testSubject0.walkStructure(_OWLObjectVisitor);
        testSubject0.setStructureWalker(_StructureWalker);
        java.util.List<OWLClassExpression> result1 = testSubject0.getClassExpressionPath();
        boolean result2 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result3 = testSubject0.getDataRangePath();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.setAnnotation(_OWLAnnotation);
        OWLAxiom result4 = testSubject0.getAxiom();
        OWLOntology result5 = testSubject0.getOntology();
    }

    @Test
    public void enforceInterfacesOWLProfile() {
        assertTrue(HasIRI.class.isAssignableFrom(OWLProfile.class));
    }

    public void verifyInterfaceOWLProfile() {
        OWLProfile testSubject0 = mock(OWLProfile.class);
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.profiles.OWLProfileReport result1 = testSubject0.checkOntology(_OWLOntology);
        IRI result2 = testSubject0.getIRI();
    }

    public void verifyOWLProfileReport() {
        OWLProfileReport testSubject0 = new OWLProfileReport(_OWLProfile, _Set);
        boolean result0 = testSubject0.isInProfile();
        java.util.List<org.semanticweb.owlapi.profiles.OWLProfileViolation> result1 = testSubject0.getViolations();
        org.semanticweb.owlapi.profiles.OWLProfile result2 = testSubject0.getProfile();
    }

    public void verifyOWLProfileViolation() {
        OWLProfileViolation testSubject0 = mock(OWLProfileViolation.class);
        OWLObject result0 = testSubject0.accept(_OWLProfileViolationVisitorEx);
        testSubject0.accept(_OWLProfileViolationVisitor);
        java.lang.Object result1 = testSubject0.getExpression();
        java.util.List<OWLOntologyChange> result2 = testSubject0.repair();
        OWLAxiom result3 = testSubject0.getAxiom();
        OWLOntology result4 = testSubject0.getOntology();
        OWLOntologyID result5 = testSubject0.getOntologyID();
    }

    public void verifyInterfaceOWLProfileViolationVisitor() {
        OWLProfileViolationVisitor testSubject0 = mock(OWLProfileViolationVisitor.class);
        testSubject0.visit(_LastPropertyInChainNotInImposedRange);
        testSubject0.visit(_OntologyIRINotAbsolute);
        testSubject0.visit(_UseOfDefinedDatatypeInDatatypeRestriction);
        testSubject0.visit(_UseOfIllegalClassExpression);
        testSubject0.visit(_UseOfIllegalDataRange);
        testSubject0.visit(_UseOfUnknownDatatype);
        testSubject0.visit(_UseOfUndeclaredDatatype);
        testSubject0.visit(_UseOfUndeclaredObjectProperty);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_LexicalNotInLexicalSpace);
        testSubject0.visit(_OntologyVersionIRINotAbsolute);
        testSubject0.visit(_UseOfAnonymousIndividual);
        testSubject0.visit(_UseOfIllegalAxiom);
        testSubject0.visit(_UseOfIllegalFacetRestriction);
        testSubject0.visit(_UseOfNonAbsoluteIRI);
        testSubject0.visit(_UseOfObjectPropertyInverse);
        testSubject0.visit(_UseOfNonSuperClassExpression);
        testSubject0.visit(_UseOfNonSubClassExpression);
        testSubject0.visit(_UseOfNonEquivalentClassExpression);
        testSubject0.visit(_UseOfNonAtomicClassExpression);
        testSubject0.visit(_UseOfNonSimplePropertyInDisjointPropertiesAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInFunctionalPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInIrreflexivePropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInObjectHasSelf);
        testSubject0.visit(_UseOfPropertyInChainCausesCycle);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_CycleInDatatypeDefinition);
        testSubject0.visit(_UseOfBuiltInDatatypeInDatatypeDefinition);
        testSubject0.visit(_DatatypeIRIAlsoUsedAsClassIRI);
        testSubject0.visit(_UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInCardinalityRestriction);
        testSubject0.visit(_UseOfReservedVocabularyForOntologyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForVersionIRI);
        testSubject0.visit(_UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom);
        testSubject0.visit(_UseOfUndeclaredAnnotationProperty);
        testSubject0.visit(_UseOfUndeclaredClass);
        testSubject0.visit(_UseOfUndeclaredDataProperty);
        testSubject0.visit(_UseOfReservedVocabularyForAnnotationPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForClassIRI);
        testSubject0.visit(_UseOfReservedVocabularyForDataPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForIndividualIRI);
        testSubject0.visit(_UseOfReservedVocabularyForObjectPropertyIRI);
    }

    @Test
    public void enforceInterfacesOWLProfileViolationVisitorAdapter() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolationVisitor.class.isAssignableFrom(OWLProfileViolationVisitorAdapter.class));
    }

    public void verifyOWLProfileViolationVisitorAdapter() {
        OWLProfileViolationVisitorAdapter testSubject0 = new OWLProfileViolationVisitorAdapter();
        testSubject0.visit(_OntologyIRINotAbsolute);
        testSubject0.visit(_LastPropertyInChainNotInImposedRange);
        testSubject0.visit(_EmptyOneOfAxiom);
        testSubject0.visit(_UseOfDefinedDatatypeInDatatypeRestriction);
        testSubject0.visit(_UseOfIllegalClassExpression);
        testSubject0.visit(_UseOfIllegalDataRange);
        testSubject0.visit(_UseOfUndeclaredDataProperty);
        testSubject0.visit(_UseOfUndeclaredDatatype);
        testSubject0.visit(_UseOfUndeclaredObjectProperty);
        testSubject0.visit(_InsufficientPropertyExpressions);
        testSubject0.visit(_InsufficientIndividuals);
        testSubject0.visit(_InsufficientOperands);
        testSubject0.visit(_LexicalNotInLexicalSpace);
        testSubject0.visit(_OntologyVersionIRINotAbsolute);
        testSubject0.visit(_UseOfAnonymousIndividual);
        testSubject0.visit(_UseOfIllegalAxiom);
        testSubject0.visit(_UseOfIllegalFacetRestriction);
        testSubject0.visit(_UseOfNonAbsoluteIRI);
        testSubject0.visit(_UseOfUnknownDatatype);
        testSubject0.visit(_UseOfObjectPropertyInverse);
        testSubject0.visit(_UseOfNonSuperClassExpression);
        testSubject0.visit(_UseOfNonSubClassExpression);
        testSubject0.visit(_UseOfNonEquivalentClassExpression);
        testSubject0.visit(_UseOfNonAtomicClassExpression);
        testSubject0.visit(_UseOfNonSimplePropertyInCardinalityRestriction);
        testSubject0.visit(_UseOfNonSimplePropertyInDisjointPropertiesAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInFunctionalPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInIrreflexivePropertyAxiom);
        testSubject0.visit(_UseOfNonSimplePropertyInObjectHasSelf);
        testSubject0.visit(_IllegalPunning);
        testSubject0.visit(_CycleInDatatypeDefinition);
        testSubject0.visit(_UseOfBuiltInDatatypeInDatatypeDefinition);
        testSubject0.visit(_DatatypeIRIAlsoUsedAsClassIRI);
        testSubject0.visit(_UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_UseOfReservedVocabularyForObjectPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForOntologyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForVersionIRI);
        testSubject0.visit(_UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom);
        testSubject0.visit(_UseOfUndeclaredAnnotationProperty);
        testSubject0.visit(_UseOfUndeclaredClass);
        testSubject0.visit(_UseOfPropertyInChainCausesCycle);
        testSubject0.visit(_UseOfReservedVocabularyForAnnotationPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForClassIRI);
        testSubject0.visit(_UseOfReservedVocabularyForDataPropertyIRI);
        testSubject0.visit(_UseOfReservedVocabularyForIndividualIRI);
    }

    public void verifyInterfaceOWLProfileViolationVisitorEx() {
        OWLProfileViolationVisitorEx<OWLObject> testSubject0 = mock(OWLProfileViolationVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_LastPropertyInChainNotInImposedRange);
        OWLObject result1 = testSubject0.visit(_OntologyIRINotAbsolute);
        OWLObject result2 = testSubject0.visit(_UseOfDefinedDatatypeInDatatypeRestriction);
        OWLObject result3 = testSubject0.visit(_UseOfIllegalClassExpression);
        OWLObject result4 = testSubject0.visit(_UseOfIllegalDataRange);
        OWLObject result5 = testSubject0.visit(_UseOfUnknownDatatype);
        OWLObject result6 = testSubject0.visit(_UseOfUndeclaredDatatype);
        OWLObject result7 = testSubject0.visit(_UseOfUndeclaredObjectProperty);
        OWLObject result8 = testSubject0.visit(_InsufficientPropertyExpressions);
        OWLObject result9 = testSubject0.visit(_InsufficientIndividuals);
        OWLObject result10 = testSubject0.visit(_InsufficientOperands);
        OWLObject result11 = testSubject0.visit(_EmptyOneOfAxiom);
        OWLObject result12 = testSubject0.visit(_LexicalNotInLexicalSpace);
        OWLObject result13 = testSubject0.visit(_OntologyVersionIRINotAbsolute);
        OWLObject result14 = testSubject0.visit(_UseOfAnonymousIndividual);
        OWLObject result15 = testSubject0.visit(_UseOfIllegalAxiom);
        OWLObject result16 = testSubject0.visit(_UseOfIllegalFacetRestriction);
        OWLObject result17 = testSubject0.visit(_UseOfNonAbsoluteIRI);
        OWLObject result18 = testSubject0.visit(_UseOfObjectPropertyInverse);
        OWLObject result19 = testSubject0.visit(_UseOfNonSuperClassExpression);
        OWLObject result20 = testSubject0.visit(_UseOfNonSubClassExpression);
        OWLObject result21 = testSubject0.visit(_UseOfNonEquivalentClassExpression);
        OWLObject result22 = testSubject0.visit(_UseOfNonAtomicClassExpression);
        OWLObject result23 = testSubject0.visit(_UseOfNonSimplePropertyInDisjointPropertiesAxiom);
        OWLObject result24 = testSubject0.visit(_UseOfNonSimplePropertyInFunctionalPropertyAxiom);
        OWLObject result25 = testSubject0.visit(_UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom);
        OWLObject result26 = testSubject0.visit(_UseOfNonSimplePropertyInIrreflexivePropertyAxiom);
        OWLObject result27 = testSubject0.visit(_UseOfNonSimplePropertyInObjectHasSelf);
        OWLObject result28 = testSubject0.visit(_UseOfPropertyInChainCausesCycle);
        OWLObject result29 = testSubject0.visit(_IllegalPunning);
        OWLObject result30 = testSubject0.visit(_CycleInDatatypeDefinition);
        OWLObject result31 = testSubject0.visit(_UseOfBuiltInDatatypeInDatatypeDefinition);
        OWLObject result32 = testSubject0.visit(_DatatypeIRIAlsoUsedAsClassIRI);
        OWLObject result33 = testSubject0.visit(_UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom);
        OWLObject result34 = testSubject0.visit(_UseOfNonSimplePropertyInCardinalityRestriction);
        OWLObject result35 = testSubject0.visit(_UseOfReservedVocabularyForOntologyIRI);
        OWLObject result36 = testSubject0.visit(_UseOfReservedVocabularyForVersionIRI);
        OWLObject result37 = testSubject0.visit(_UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom);
        OWLObject result38 = testSubject0.visit(_UseOfUndeclaredAnnotationProperty);
        OWLObject result39 = testSubject0.visit(_UseOfUndeclaredClass);
        OWLObject result40 = testSubject0.visit(_UseOfUndeclaredDataProperty);
        OWLObject result41 = testSubject0.visit(_UseOfReservedVocabularyForAnnotationPropertyIRI);
        OWLObject result42 = testSubject0.visit(_UseOfReservedVocabularyForClassIRI);
        OWLObject result43 = testSubject0.visit(_UseOfReservedVocabularyForDataPropertyIRI);
        OWLObject result44 = testSubject0.visit(_UseOfReservedVocabularyForIndividualIRI);
        OWLObject result45 = testSubject0.visit(_UseOfReservedVocabularyForObjectPropertyIRI);
    }

    @Test
    public void enforceInterfacesOWLProfileViolationVisitorExAdapter() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolationVisitorEx.class.isAssignableFrom(OWLProfileViolationVisitorExAdapter.class));
    }

    public void verifyOWLProfileViolationVisitorExAdapter() {
        OWLProfileViolationVisitorExAdapter<OWLObject> testSubject0 = new OWLProfileViolationVisitorExAdapter<OWLObject>(_Object60);
        OWLProfileViolationVisitorExAdapter<OWLObject> testSubject1 = new OWLProfileViolationVisitorExAdapter<OWLObject>();
        OWLObject result0 = testSubject0.visit(_LastPropertyInChainNotInImposedRange);
        OWLObject result1 = testSubject0.visit(_OntologyIRINotAbsolute);
        OWLObject result2 = testSubject0.visit(_EmptyOneOfAxiom);
        OWLObject result3 = testSubject0.visit(_UseOfDefinedDatatypeInDatatypeRestriction);
        OWLObject result4 = testSubject0.visit(_UseOfIllegalClassExpression);
        OWLObject result5 = testSubject0.visit(_UseOfIllegalDataRange);
        OWLObject result6 = testSubject0.visit(_UseOfUndeclaredDataProperty);
        OWLObject result7 = testSubject0.visit(_UseOfUndeclaredDatatype);
        OWLObject result8 = testSubject0.visit(_UseOfUndeclaredObjectProperty);
        OWLObject result9 = testSubject0.visit(_InsufficientPropertyExpressions);
        OWLObject result10 = testSubject0.visit(_InsufficientIndividuals);
        OWLObject result11 = testSubject0.visit(_InsufficientOperands);
        OWLObject result12 = testSubject0.visit(_UseOfNonAtomicClassExpression);
        OWLObject result13 = testSubject0.visit(_LexicalNotInLexicalSpace);
        OWLObject result14 = testSubject0.visit(_OntologyVersionIRINotAbsolute);
        OWLObject result15 = testSubject0.visit(_UseOfAnonymousIndividual);
        OWLObject result16 = testSubject0.visit(_UseOfIllegalAxiom);
        OWLObject result17 = testSubject0.visit(_UseOfIllegalFacetRestriction);
        OWLObject result18 = testSubject0.visit(_UseOfUnknownDatatype);
        OWLObject result19 = testSubject0.visit(_UseOfObjectPropertyInverse);
        OWLObject result20 = testSubject0.visit(_UseOfNonSuperClassExpression);
        OWLObject result21 = testSubject0.visit(_UseOfNonSubClassExpression);
        OWLObject result22 = testSubject0.visit(_UseOfNonEquivalentClassExpression);
        OWLObject result23 = testSubject0.visit(_UseOfNonSimplePropertyInCardinalityRestriction);
        OWLObject result24 = testSubject0.visit(_UseOfNonSimplePropertyInDisjointPropertiesAxiom);
        OWLObject result25 = testSubject0.visit(_UseOfNonSimplePropertyInFunctionalPropertyAxiom);
        OWLObject result26 = testSubject0.visit(_UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom);
        OWLObject result27 = testSubject0.visit(_UseOfNonSimplePropertyInIrreflexivePropertyAxiom);
        OWLObject result28 = testSubject0.visit(_UseOfNonSimplePropertyInObjectHasSelf);
        OWLObject result29 = testSubject0.visit(_UseOfUndeclaredClass);
        OWLObject result30 = testSubject0.visit(_IllegalPunning);
        OWLObject result31 = testSubject0.visit(_CycleInDatatypeDefinition);
        OWLObject result32 = testSubject0.visit(_UseOfBuiltInDatatypeInDatatypeDefinition);
        OWLObject result33 = testSubject0.visit(_DatatypeIRIAlsoUsedAsClassIRI);
        OWLObject result34 = testSubject0.visit(_UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom);
        OWLObject result35 = testSubject0.visit(_UseOfReservedVocabularyForObjectPropertyIRI);
        OWLObject result36 = testSubject0.visit(_UseOfReservedVocabularyForOntologyIRI);
        OWLObject result37 = testSubject0.visit(_UseOfReservedVocabularyForVersionIRI);
        OWLObject result38 = testSubject0.visit(_UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom);
        OWLObject result39 = testSubject0.visit(_UseOfUndeclaredAnnotationProperty);
        OWLObject result40 = testSubject0.visit(_UseOfNonAbsoluteIRI);
        OWLObject result41 = testSubject0.visit(_UseOfPropertyInChainCausesCycle);
        OWLObject result42 = testSubject0.visit(_UseOfReservedVocabularyForAnnotationPropertyIRI);
        OWLObject result43 = testSubject0.visit(_UseOfReservedVocabularyForClassIRI);
        OWLObject result44 = testSubject0.visit(_UseOfReservedVocabularyForDataPropertyIRI);
        OWLObject result45 = testSubject0.visit(_UseOfReservedVocabularyForIndividualIRI);
    }

    @Test
    public void enforceInterfacesProfiles() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(Profiles.class));
        assertTrue(org.semanticweb.owlapi.model.HasIRI.class.isAssignableFrom(Profiles.class));
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfile.class.isAssignableFrom(Profiles.class));
    }

    public void verifyEnumProfiles() {
        Profiles testSubject0 = Profiles.OWL2_DL;
        Profiles testSubject1 = Profiles.OWL2_QL;
        Profiles testSubject2 = Profiles.OWL2_EL;
        Profiles testSubject3 = Profiles.OWL2_RL;
        Profiles testSubject4 = Profiles.OWL2_FULL;
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getIRI();
        org.semanticweb.owlapi.profiles.OWLProfile result2 = testSubject0.getOWLProfile();
        java.util.Collection<java.lang.String> result3 = testSubject0.supportingReasoners();
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result4 = Profiles.instantiateFactory(_String);
        org.semanticweb.owlapi.profiles.Profiles result5 = Profiles.valueForIRI(_IRI);
        org.semanticweb.owlapi.profiles.OWLProfileReport result6 = testSubject0.checkOntology(_OWLOntology);
    }

    private java.lang.String _String;
    private java.util.Set<OWLObjectPropertyExpression> _Set3;
    private java.util.Set<OWLOntology> _Set5;
    private java.util.Set<org.semanticweb.owlapi.profiles.OWLProfileViolation> _Set;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAxiom _OWLAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLObject _Object60;
    private OWLObjectVisitor _OWLObjectVisitor;
    private OWLObjectVisitorEx<?> _OWLObjectVisitorEx;
    private OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.profiles.OWLProfile _OWLProfile;
    private org.semanticweb.owlapi.profiles.OWLProfileViolationVisitor _OWLProfileViolationVisitor;
    private org.semanticweb.owlapi.profiles.OWLProfileViolationVisitorEx<OWLObject> _OWLProfileViolationVisitorEx;
    private org.semanticweb.owlapi.profiles.violations.CycleInDatatypeDefinition _CycleInDatatypeDefinition;
    private org.semanticweb.owlapi.profiles.violations.DatatypeIRIAlsoUsedAsClassIRI _DatatypeIRIAlsoUsedAsClassIRI;
    private org.semanticweb.owlapi.profiles.violations.EmptyOneOfAxiom _EmptyOneOfAxiom;
    private org.semanticweb.owlapi.profiles.violations.IllegalPunning _IllegalPunning;
    private org.semanticweb.owlapi.profiles.violations.InsufficientIndividuals _InsufficientIndividuals;
    private org.semanticweb.owlapi.profiles.violations.InsufficientOperands _InsufficientOperands;
    private org.semanticweb.owlapi.profiles.violations.InsufficientPropertyExpressions _InsufficientPropertyExpressions;
    private org.semanticweb.owlapi.profiles.violations.LastPropertyInChainNotInImposedRange _LastPropertyInChainNotInImposedRange;
    private org.semanticweb.owlapi.profiles.violations.LexicalNotInLexicalSpace _LexicalNotInLexicalSpace;
    private org.semanticweb.owlapi.profiles.violations.OntologyIRINotAbsolute _OntologyIRINotAbsolute;
    private org.semanticweb.owlapi.profiles.violations.OntologyVersionIRINotAbsolute _OntologyVersionIRINotAbsolute;
    private org.semanticweb.owlapi.profiles.violations.UseOfAnonymousIndividual _UseOfAnonymousIndividual;
    private org.semanticweb.owlapi.profiles.violations.UseOfBuiltInDatatypeInDatatypeDefinition _UseOfBuiltInDatatypeInDatatypeDefinition;
    private org.semanticweb.owlapi.profiles.violations.UseOfDefinedDatatypeInDatatypeRestriction _UseOfDefinedDatatypeInDatatypeRestriction;
    private org.semanticweb.owlapi.profiles.violations.UseOfIllegalAxiom _UseOfIllegalAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfIllegalClassExpression _UseOfIllegalClassExpression;
    private org.semanticweb.owlapi.profiles.violations.UseOfIllegalDataRange _UseOfIllegalDataRange;
    private org.semanticweb.owlapi.profiles.violations.UseOfIllegalFacetRestriction _UseOfIllegalFacetRestriction;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonAbsoluteIRI _UseOfNonAbsoluteIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonAtomicClassExpression _UseOfNonAtomicClassExpression;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonEquivalentClassExpression _UseOfNonEquivalentClassExpression;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom _UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInCardinalityRestriction _UseOfNonSimplePropertyInCardinalityRestriction;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInDisjointPropertiesAxiom _UseOfNonSimplePropertyInDisjointPropertiesAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInFunctionalPropertyAxiom _UseOfNonSimplePropertyInFunctionalPropertyAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom _UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInIrreflexivePropertyAxiom _UseOfNonSimplePropertyInIrreflexivePropertyAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInObjectHasSelf _UseOfNonSimplePropertyInObjectHasSelf;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSubClassExpression _UseOfNonSubClassExpression;
    private org.semanticweb.owlapi.profiles.violations.UseOfNonSuperClassExpression _UseOfNonSuperClassExpression;
    private org.semanticweb.owlapi.profiles.violations.UseOfObjectPropertyInverse _UseOfObjectPropertyInverse;
    private org.semanticweb.owlapi.profiles.violations.UseOfPropertyInChainCausesCycle _UseOfPropertyInChainCausesCycle;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForAnnotationPropertyIRI _UseOfReservedVocabularyForAnnotationPropertyIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForClassIRI _UseOfReservedVocabularyForClassIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForDataPropertyIRI _UseOfReservedVocabularyForDataPropertyIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForIndividualIRI _UseOfReservedVocabularyForIndividualIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForObjectPropertyIRI _UseOfReservedVocabularyForObjectPropertyIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForOntologyIRI _UseOfReservedVocabularyForOntologyIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForVersionIRI _UseOfReservedVocabularyForVersionIRI;
    private org.semanticweb.owlapi.profiles.violations.UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom _UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom;
    private org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredAnnotationProperty _UseOfUndeclaredAnnotationProperty;
    private org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredClass _UseOfUndeclaredClass;
    private org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredDataProperty _UseOfUndeclaredDataProperty;
    private org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredDatatype _UseOfUndeclaredDatatype;
    private org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredObjectProperty _UseOfUndeclaredObjectProperty;
    private org.semanticweb.owlapi.profiles.violations.UseOfUnknownDatatype _UseOfUnknownDatatype;
    private org.semanticweb.owlapi.util.StructureWalker<OWLOntology> _StructureWalker;
}
