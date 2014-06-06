package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.profiles.violations.*;
import org.semanticweb.owlapi.profiles.*;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.semanticweb.owlapi.profiles to org.semanticweb.owlapi.profiles.violations", "interface removed: OWL2DLProfileViolation",
        "interface removed: OWL2ELProfileViolationVisitor", "interface removed: OWL2ProfileViolationVisitor", "interface removed: OWL2QLProfileViolationVisitor",
        "interface removed: OWL2RLProfileViolationVisitor", "method changed: OWLProfileViolation::getDocumetIRI() to getOntologyID()",
        "method removed: OWLProfileViolation::getImportsClosure()", "generics: OWLProfileViolation is now generic",
        "method changed: DatatypeIRIAlsoUsedAsClassIRI::getIRI() : getExpression()",
        "method changed: UseOfNonSimplePropertyInObjectHasSelf::getOWLObjectHasSelf() : getExpression()",
        "method changed: UseOfNonSubClassExpression::getOWLClassExpression() : getExpression()",
        "method changed: UseOfNonSuperClassExpression::getOWLClassExpression() : getExpression()",
        "method changed: UseOfObjectOneOfWithMultipleIndividuals::getOWLObjectOneOf() : getExpression()",
        "method changed: UseOfObjectOneOfWithMultipleIndividuals::getIRI() : getExpression()",
        "method changed: UseOfObjectPropertyInverse::getOWLPropertyExpression() : getExpression()",
        "method changed: UseOfPropertyInChainCausesCycle::getOWLObjectProperty() : getExpression()",
        "method changed: UseOfReservedVocabularyForAnnotationPropertyIRI::getOWLAnnotationProperty() : getExpression()",
        "method changed: UseOfReservedVocabularyForClassIRI::getOWLClass() : getExpression()",
        "method changed: UseOfReservedVocabularyForDataPropertyIRI::getOWLDataProperty() : getExpression()",
        "method changed: UseOfReservedVocabularyForIndividualIRI::getOWLNamedIndividual() : getExpression()",
        "method changed: UseOfReservedVocabularyForObjectPropertyIRI::getOWLObjectProperty() : getExpression()",
        "method changed: UseOfUndeclaredObjectProperty::getOWLObjectProperty() : getExpression()",
        "method changed: UseOfNonSimplePropertyInDisjointPropertiesAxiom::getOWLObjectProperty() : getExpression()",
        "method changed: UseOfPropertyInChainCausesCycle::getOWLObjectProperty() : getExpression()", "method changed: UseOfUndeclaredDatatype::getDatatype() : getExpression()",
        "method changed: UseOfUnknownDatatype::getDatatype() : getExpression()", "method changed: UseOfUndeclaredAnnotationProperty::getOWLAnnotation() : getExpression()",
        "method changed: UseOfUndeclaredAnnotationProperty::getOWLAnnotationProperty() : getExpression()", "method changed: UseOfUndeclaredClass::getOWLClass() : getExpression()",
        "method changed: UseOfNonAtomicClassExpression::getOWLClassExpression() : getExpression()",
        "method changed: UseOfNonEquivalentClassExpression::getOWLClassExpression() : getExpression()",
        "method changed: UseOfIllegalClassExpression::getOWLClassExpression() : getExpression()",
        "method changed: UseOfDefinedDatatypeInDatatypeRestriction::getOWLDatatypeRestriction() : getExpression()",
        "method changed: UseOfNonSimplePropertyInCardinalityRestriction::getOWLCardinalityRestriction() : getExpression()",
        "method changed: UseOfUndeclaredDataProperty::getOWLDataProperty() : getExpression()", "method changed: UseOfIllegalDataRange::getOWLDataRange() : getExpression()",
        "method changed: UseOfIllegalFacetRestriction::getFacet() : getExpression()", "method deleted: UseOfIllegalFacetRestriction::getFacet()",
        "method changed: LexicalNotInLexicalSpace::getLiteral() : getExpression()", "method changed: UseOfAnonymousIndividual::getOWLAnonymousIndividual() : getExpression()",
        "method changed: UseOfDataOneOfWithMultipleLiterals::getOWLDataRange() : getExpression()", "method deleted: UseOfDataOneOfWithMultipleLiterals::getDataOneOf()",
        "method changed: LastPropertyInChainNotInImposedRange::getOWLSubPropertyChainOfAxiom() : getAxiom()", "class changed: OWLProfileViolation is abstract", })
public class Gen_org_semanticweb_owlapi_profiles {
    public void verifyUseOfDataOneOfWithMultipleLiterals() {
        UseOfDataOneOfWithMultipleLiterals testSubject0 = new UseOfDataOneOfWithMultipleLiterals(_OWLOntology, _OWLAxiom, _OWLDataOneOf);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLDataRange result1 = testSubject0.getExpression();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
    }

    public void verifyLastPropertyInChainNotInImposedRange() {
        LastPropertyInChainNotInImposedRange testSubject0 = new LastPropertyInChainNotInImposedRange(_OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyRangeAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLAxiom result0 = testSubject0.getAxiom();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
    }

    public void verifyUseOfUndeclaredDataProperty() {
        UseOfUndeclaredDataProperty testSubject0 = new UseOfUndeclaredDataProperty(_OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLDataProperty result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfAnonymousIndividual() {
        UseOfAnonymousIndividual testSubject0 = new UseOfAnonymousIndividual(_OWLOntology, _OWLAxiom, _OWLAnonymousIndividual);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLAnonymousIndividual result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfIllegalDataRange() {
        UseOfIllegalDataRange testSubject0 = new UseOfIllegalDataRange(_OWLOntology, _OWLAxiom, _OWLDataRange);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLDataRange result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfIllegalFacetRestriction() {
        UseOfIllegalFacetRestriction testSubject0 = new UseOfIllegalFacetRestriction(_OWLOntology, _OWLAxiom, _OWLDatatypeRestriction, _OWLFacet);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLFacet result0 = testSubject0.getExpression();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
    }

    public void verifyLexicalNotInLexicalSpace() {
        LexicalNotInLexicalSpace testSubject0 = new LexicalNotInLexicalSpace(_OWLOntology, _OWLAxiom, _OWLLiteral);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLLiteral result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyOWL2ProfileReport() {
        OWL2ProfileReport testSubject0 = new OWL2ProfileReport(_OWLProfile, _Set, _Set52, _Set52);
        java.util.Set<OWLObjectPropertyExpression> result0 = testSubject0.getNonSimpleRoles();
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0.getSimpleRoles();
        boolean result2 = testSubject0.isInProfile();
        java.util.List<OWLProfileViolation<?>> result3 = testSubject0.getViolations();
        OWLProfile result4 = testSubject0.getProfile();
    }

    public void verifyOWLProfileReport() {
        OWLProfileReport testSubject0 = new OWLProfileReport(_OWLProfile, _Set);
        boolean result0 = testSubject0.isInProfile();
        java.util.List<OWLProfileViolation<?>> result1 = testSubject0.getViolations();
        OWLProfile result2 = testSubject0.getProfile();
    }

    public void verifyUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom() {
        UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom(_OWLOntology,
                _OWLAsymmetricObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLAxiom result1 = testSubject0.getAxiom();
        OWLOntologyID result3 = testSubject0.getOntologyID();
    }

    public void verifyUseOfNonSimplePropertyInCardinalityRestriction() {
        UseOfNonSimplePropertyInCardinalityRestriction testSubject0 = new UseOfNonSimplePropertyInCardinalityRestriction(_OWLOntology, _OWLAxiom, _OWLObjectCardinalityRestriction);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectCardinalityRestriction result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfDefinedDatatypeInDatatypeRestriction() {
        UseOfDefinedDatatypeInDatatypeRestriction testSubject0 = new UseOfDefinedDatatypeInDatatypeRestriction(_OWLOntology, _OWLAxiom, _OWLDatatypeRestriction);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatypeRestriction result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfIllegalClassExpression() {
        UseOfIllegalClassExpression testSubject0 = new UseOfIllegalClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfUndeclaredAnnotationProperty() {
        UseOfUndeclaredAnnotationProperty testSubject0 = new UseOfUndeclaredAnnotationProperty(_OWLOntology, _OWLAxiom, _OWLAnnotation, _OWLAnnotationProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLAnnotationProperty result0 = testSubject0.getExpression();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
    }

    public void verifyUseOfUndeclaredClass() {
        UseOfUndeclaredClass testSubject0 = new UseOfUndeclaredClass(_OWLOntology, _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLClass result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfNonAtomicClassExpression() {
        UseOfNonAtomicClassExpression testSubject0 = new UseOfNonAtomicClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfNonEquivalentClassExpression() {
        UseOfNonEquivalentClassExpression testSubject0 = new UseOfNonEquivalentClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfUndeclaredDatatype() {
        UseOfUndeclaredDatatype testSubject0 = new UseOfUndeclaredDatatype(_OWLOntology, _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatype result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfUnknownDatatype() {
        UseOfUnknownDatatype testSubject0 = new UseOfUnknownDatatype(_OWLOntology, _OWLAxiom, _OWLDatatype);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLDatatype result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfNonSimplePropertyInDisjointPropertiesAxiom() {
        UseOfNonSimplePropertyInDisjointPropertiesAxiom testSubject0 = new UseOfNonSimplePropertyInDisjointPropertiesAxiom(_OWLOntology, _OWLDisjointObjectPropertiesAxiom,
                _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectPropertyExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfUndeclaredObjectProperty() {
        UseOfUndeclaredObjectProperty testSubject0 = new UseOfUndeclaredObjectProperty(_OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectProperty result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfReservedVocabularyForObjectPropertyIRI() {
        UseOfReservedVocabularyForObjectPropertyIRI testSubject0 = new UseOfReservedVocabularyForObjectPropertyIRI(_OWLOntology, _OWLAxiom, _OWLObjectProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectProperty result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfReservedVocabularyForAnnotationPropertyIRI() {
        UseOfReservedVocabularyForAnnotationPropertyIRI testSubject0 = new UseOfReservedVocabularyForAnnotationPropertyIRI(_OWLOntology, _OWLAxiom, _OWLAnnotationProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLAnnotationProperty result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfReservedVocabularyForClassIRI() {
        UseOfReservedVocabularyForClassIRI testSubject0 = new UseOfReservedVocabularyForClassIRI(_OWLOntology, _OWLAxiom, _OWLClass);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLClass result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfReservedVocabularyForDataPropertyIRI() {
        UseOfReservedVocabularyForDataPropertyIRI testSubject0 = new UseOfReservedVocabularyForDataPropertyIRI(_OWLOntology, _OWLAxiom, _OWLDataProperty);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLDataProperty result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfReservedVocabularyForIndividualIRI() {
        UseOfReservedVocabularyForIndividualIRI testSubject0 = new UseOfReservedVocabularyForIndividualIRI(_OWLOntology, _OWLAxiom, _OWLNamedIndividual);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLNamedIndividual result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfNonSimplePropertyInObjectHasSelf() {
        UseOfNonSimplePropertyInObjectHasSelf testSubject0 = new UseOfNonSimplePropertyInObjectHasSelf(_OWLOntology, _OWLAxiom, _OWLObjectHasSelf);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectHasSelf result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfNonSubClassExpression() {
        UseOfNonSubClassExpression testSubject0 = new UseOfNonSubClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfNonSuperClassExpression() {
        UseOfNonSuperClassExpression testSubject0 = new UseOfNonSuperClassExpression(_OWLOntology, _OWLAxiom, _OWLClassExpression);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLClassExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfObjectOneOfWithMultipleIndividuals() {
        UseOfObjectOneOfWithMultipleIndividuals testSubject0 = new UseOfObjectOneOfWithMultipleIndividuals(_OWLOntology, _OWLAxiom, _OWLObjectOneOf);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLClassExpression result1 = testSubject0.getExpression();
        OWLOntologyID result3 = testSubject0.getOntologyID();
        OWLAxiom result4 = testSubject0.getAxiom();
    }

    public void verifyUseOfObjectPropertyInverse() {
        UseOfObjectPropertyInverse testSubject0 = new UseOfObjectPropertyInverse(_OWLOntology, _OWLAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        OWLObjectPropertyExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    public void verifyUseOfPropertyInChainCausesCycle() {
        UseOfPropertyInChainCausesCycle testSubject0 = new UseOfPropertyInChainCausesCycle(_OWLOntology, _OWLSubPropertyChainOfAxiom, _OWLObjectPropertyExpression);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLObjectPropertyExpression result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesCycleInDatatypeDefinition() {
        assertTrue(org.semanticweb.owlapi.profiles.OWLProfileViolation.class.isAssignableFrom(CycleInDatatypeDefinition.class));
        assertTrue(OWLProfileViolation.class.isAssignableFrom(CycleInDatatypeDefinition.class));
    }

    public void verifyCycleInDatatypeDefinition() {
        CycleInDatatypeDefinition testSubject0 = new CycleInDatatypeDefinition(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result0 = testSubject0.getOntologyID();
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesDatatypeIRIAlsoUsedAsClassIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(DatatypeIRIAlsoUsedAsClassIRI.class));
    }

    public void verifyDatatypeIRIAlsoUsedAsClassIRI() {
        DatatypeIRIAlsoUsedAsClassIRI testSubject0 = new DatatypeIRIAlsoUsedAsClassIRI(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        IRI result0 = testSubject0.getExpression();
        OWLOntologyID result2 = testSubject0.getOntologyID();
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesEmptyOneOfAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(EmptyOneOfAxiom.class));
    }

    public void verifyEmptyOneOfAxiom() {
        EmptyOneOfAxiom testSubject0 = new EmptyOneOfAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesIllegalPunning() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(IllegalPunning.class));
    }

    public void verifyIllegalPunning() {
        IllegalPunning testSubject0 = new IllegalPunning(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesInsufficientIndividuals() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(InsufficientIndividuals.class));
    }

    public void verifyInsufficientIndividuals() {
        InsufficientIndividuals testSubject0 = new InsufficientIndividuals(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesInsufficientOperands() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(InsufficientOperands.class));
    }

    public void verifyInsufficientOperands() {
        InsufficientOperands testSubject0 = new InsufficientOperands(_OWLOntology, _OWLAxiom, _OWLObject);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesInsufficientPropertyExpressions() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(InsufficientPropertyExpressions.class));
    }

    public void verifyInsufficientPropertyExpressions() {
        InsufficientPropertyExpressions testSubject0 = new InsufficientPropertyExpressions(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesLastPropertyInChainNotInImposedRange() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(LastPropertyInChainNotInImposedRange.class));
    }

    @Test
    public void enforceInterfacesLexicalNotInLexicalSpace() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(LexicalNotInLexicalSpace.class));
    }

    @Test
    public void enforceInterfacesOntologyIRINotAbsolute() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(OntologyIRINotAbsolute.class));
    }

    public void verifyOntologyIRINotAbsolute() {
        OntologyIRINotAbsolute testSubject0 = new OntologyIRINotAbsolute(_OWLOntology);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesOntologyVersionIRINotAbsolute() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(OntologyVersionIRINotAbsolute.class));
    }

    public void verifyOntologyVersionIRINotAbsolute() {
        OntologyVersionIRINotAbsolute testSubject0 = new OntologyVersionIRINotAbsolute(_OWLOntology);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesOWL2DLProfile() {
        assertTrue(OWLProfile.class.isAssignableFrom(OWL2DLProfile.class));
    }

    public void verifyOWL2DLProfile() {
        OWL2DLProfile testSubject0 = new OWL2DLProfile();
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWL2ELProfile() {
        assertTrue(OWLProfile.class.isAssignableFrom(OWL2ELProfile.class));
    }

    public void verifyOWL2ELProfile() {
        OWL2ELProfile testSubject0 = new OWL2ELProfile();
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWL2Profile() {
        assertTrue(OWLProfile.class.isAssignableFrom(OWL2Profile.class));
    }

    public void verifyOWL2Profile() {
        OWL2Profile testSubject0 = new OWL2Profile();
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWL2ProfileReport() {
        assertTrue(OWLProfileReport.class.isAssignableFrom(OWL2ProfileReport.class));
    }

    @Test
    public void enforceInterfacesOWL2QLProfile() {
        assertTrue(OWLProfile.class.isAssignableFrom(OWL2QLProfile.class));
    }

    public void verifyOWL2QLProfile() {
        OWL2QLProfile testSubject0 = new OWL2QLProfile();
        String result0 = testSubject0.getName();
        boolean result1 = testSubject0.isOWL2QLSuperClassExpression(_OWLClassExpression);
        IRI result2 = testSubject0.getIRI();
        OWLProfileReport result3 = testSubject0.checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWL2RLProfile() {
        assertTrue(OWLProfile.class.isAssignableFrom(OWL2RLProfile.class));
    }

    public void verifyOWL2RLProfile() {
        OWL2RLProfile testSubject0 = new OWL2RLProfile();
        String result0 = testSubject0.getName();
        boolean result1 = testSubject0.isOWL2RLSuperClassExpression(_OWLClassExpression);
        boolean result2 = testSubject0.isOWL2RLEquivalentClassExpression(_OWLClassExpression);
        IRI result3 = testSubject0.getIRI();
        OWLProfileReport result4 = testSubject0.checkOntology(_OWLOntology);
    }

    public void verifyInterfaceOWLProfile() {
        OWLProfile testSubject0 = mock(OWLProfile.class);
        String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        OWLProfileReport result2 = testSubject0.checkOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesUseOfAnonymousIndividual() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfAnonymousIndividual.class));
    }

    @Test
    public void enforceInterfacesUseOfBuiltInDatatypeInDatatypeDefinition() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfBuiltInDatatypeInDatatypeDefinition.class));
    }

    public void verifyUseOfBuiltInDatatypeInDatatypeDefinition() {
        UseOfBuiltInDatatypeInDatatypeDefinition testSubject0 = new UseOfBuiltInDatatypeInDatatypeDefinition(_OWLOntology, _OWLDatatypeDefinitionAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfDataOneOfWithMultipleLiterals() {
        assertTrue(UseOfIllegalDataRange.class.isAssignableFrom(UseOfDataOneOfWithMultipleLiterals.class));
    }

    @Test
    public void enforceInterfacesUseOfDefinedDatatypeInDatatypeRestriction() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfDefinedDatatypeInDatatypeRestriction.class));
    }

    @Test
    public void enforceInterfacesUseOfIllegalAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfIllegalAxiom.class));
    }

    public void verifyUseOfIllegalAxiom() {
        UseOfIllegalAxiom testSubject0 = new UseOfIllegalAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWL2ELProfileViolationVisitor);
        testSubject0.accept(_OWL2RLProfileViolationVisitor);
        testSubject0.accept(_OWL2QLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfIllegalClassExpression() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfIllegalClassExpression.class));
    }

    @Test
    public void enforceInterfacesUseOfIllegalDataRange() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfIllegalDataRange.class));
    }

    @Test
    public void enforceInterfacesUseOfIllegalFacetRestriction() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfIllegalFacetRestriction.class));
    }

    @Test
    public void enforceInterfacesUseOfNonAbsoluteIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonAbsoluteIRI.class));
    }

    public void verifyUseOfNonAbsoluteIRI() {
        UseOfNonAbsoluteIRI testSubject0 = new UseOfNonAbsoluteIRI(_OWLOntology, _OWLAxiom, _IRI);
        testSubject0.accept(_OWL2ProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfNonAtomicClassExpression() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonAtomicClassExpression.class));
    }

    @Test
    public void enforceInterfacesUseOfNonEquivalentClassExpression() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonEquivalentClassExpression.class));
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom.class));
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInCardinalityRestriction() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInCardinalityRestriction.class));
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInDisjointPropertiesAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInDisjointPropertiesAxiom.class));
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInFunctionalPropertyAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInFunctionalPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInFunctionalPropertyAxiom() {
        UseOfNonSimplePropertyInFunctionalPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInFunctionalPropertyAxiom(_OWLOntology, _OWLFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom() {
        UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom testSubject0 = new UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom(_OWLOntology,
                _OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInIrreflexivePropertyAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInIrreflexivePropertyAxiom.class));
    }

    public void verifyUseOfNonSimplePropertyInIrreflexivePropertyAxiom() {
        UseOfNonSimplePropertyInIrreflexivePropertyAxiom testSubject0 = new UseOfNonSimplePropertyInIrreflexivePropertyAxiom(_OWLOntology, _OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfNonSimplePropertyInObjectHasSelf() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSimplePropertyInObjectHasSelf.class));
    }

    @Test
    public void enforceInterfacesUseOfNonSuperClassExpression() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSuperClassExpression.class));
    }

    @Test
    public void enforceInterfacesUseOfNonSubClassExpression() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfNonSubClassExpression.class));
    }

    @Test
    public void enforceInterfacesUseOfObjectOneOfWithMultipleIndividuals() {
        assertTrue(UseOfIllegalClassExpression.class.isAssignableFrom(UseOfObjectOneOfWithMultipleIndividuals.class));
    }

    @Test
    public void enforceInterfacesUseOfObjectPropertyInverse() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfObjectPropertyInverse.class));
    }

    @Test
    public void enforceInterfacesUseOfPropertyInChainCausesCycle() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfPropertyInChainCausesCycle.class));
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForAnnotationPropertyIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForAnnotationPropertyIRI.class));
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForDataPropertyIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForDataPropertyIRI.class));
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForClassIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForClassIRI.class));
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForIndividualIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForIndividualIRI.class));
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForObjectPropertyIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForObjectPropertyIRI.class));
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForOntologyIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForOntologyIRI.class));
    }

    public void verifyUseOfReservedVocabularyForOntologyIRI() {
        UseOfReservedVocabularyForOntologyIRI testSubject0 = new UseOfReservedVocabularyForOntologyIRI(_OWLOntology);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfReservedVocabularyForVersionIRI() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfReservedVocabularyForVersionIRI.class));
    }

    public void verifyUseOfReservedVocabularyForVersionIRI() {
        UseOfReservedVocabularyForVersionIRI testSubject0 = new UseOfReservedVocabularyForVersionIRI(_OWLOntology);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom.class));
    }

    public void verifyUseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom() {
        UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom testSubject0 = new UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom(_OWLOntology, _OWLSubDataPropertyOfAxiom);
        testSubject0.accept(_OWL2DLProfileViolationVisitor);
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLAxiom result2 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredAnnotationProperty() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredAnnotationProperty.class));
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredClass() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredClass.class));
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDatatype() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDatatype.class));
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredObjectProperty() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredObjectProperty.class));
    }

    @Test
    public void enforceInterfacesUseOfUnknownDatatype() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfUnknownDatatype.class));
    }

    @Test
    public void enforceInterfacesUseOfUndeclaredDataProperty() {
        assertTrue(OWLProfileViolation.class.isAssignableFrom(UseOfUndeclaredDataProperty.class));
    }

    private java.util.Set<OWLObjectPropertyExpression> _Set52;
    private java.util.Set<OWLProfileViolation<?>> _Set;
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
    private OWLProfileViolationVisitor _OWL2DLProfileViolationVisitor;
    private OWLProfileViolationVisitor _OWL2ELProfileViolationVisitor;
    private OWLProfileViolationVisitor _OWL2ProfileViolationVisitor;
    private OWLProfileViolationVisitor _OWL2QLProfileViolationVisitor;
    private OWLProfileViolationVisitor _OWL2RLProfileViolationVisitor;
    private OWLProfile _OWLProfile;
    private OWLFacet _OWLFacet;
}
