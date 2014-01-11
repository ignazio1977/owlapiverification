package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.AbstractCompositeOntologyChange;
import org.semanticweb.owlapi.AddClassExpressionClosureAxiom;
import org.semanticweb.owlapi.AmalgamateSubClassAxioms;
import org.semanticweb.owlapi.CoerceConstantsIntoDataPropertyRange;
import org.semanticweb.owlapi.ConvertEquivalentClassesToSuperClasses;
import org.semanticweb.owlapi.ConvertPropertyAssertionsToAnnotations;
import org.semanticweb.owlapi.ConvertSuperClassesToEquivalentClass;
import org.semanticweb.owlapi.CreateValuePartition;
import org.semanticweb.owlapi.MakeClassesMutuallyDisjoint;
import org.semanticweb.owlapi.MakePrimitiveSubClassesMutuallyDisjoint;
import org.semanticweb.owlapi.OWLCompositeOntologyChange;
import org.semanticweb.owlapi.RemoveAllDisjointAxioms;
import org.semanticweb.owlapi.ShortForm2AnnotationGenerator;
import org.semanticweb.owlapi.SplitSubClassAxioms;
import org.semanticweb.owlapi.model.OWLOntologyChange;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi {
    @Test
    public void enforceInterfacesAbstractCompositeOntologyChange() throws Exception {
        assertTrue(org.semanticweb.owlapi.OWLCompositeOntologyChange.class
                .isAssignableFrom(AbstractCompositeOntologyChange.class));
    }

    public void verifyAbstractCompositeOntologyChange() throws Exception {
        AbstractCompositeOntologyChange testSubject0 = new AbstractCompositeOntologyChange(
                _OWLDataFactory) {
            @Override
            public List<OWLOntologyChange> getChanges() {
                return null;
            }
        };
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesAddClassExpressionClosureAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(AddClassExpressionClosureAxiom.class));
    }

    public void verifyAddClassExpressionClosureAxiom() throws Exception {
        AddClassExpressionClosureAxiom testSubject0 = new AddClassExpressionClosureAxiom(
                _OWLDataFactory, _OWLClass, _OWLObjectPropertyExpression, _Set,
                _OWLOntology);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesAmalgamateSubClassAxioms() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(AmalgamateSubClassAxioms.class));
    }

    public void verifyAmalgamateSubClassAxioms() throws Exception {
        AmalgamateSubClassAxioms testSubject0 = new AmalgamateSubClassAxioms(_Set,
                _OWLDataFactory);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesCoerceConstantsIntoDataPropertyRange() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(CoerceConstantsIntoDataPropertyRange.class));
    }

    public void verifyCoerceConstantsIntoDataPropertyRange() throws Exception {
        CoerceConstantsIntoDataPropertyRange testSubject0 = new CoerceConstantsIntoDataPropertyRange(
                _OWLDataFactory, _Set);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesConvertEquivalentClassesToSuperClasses()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(ConvertEquivalentClassesToSuperClasses.class));
    }

    public void verifyConvertEquivalentClassesToSuperClasses() throws Exception {
        ConvertEquivalentClassesToSuperClasses testSubject0 = new ConvertEquivalentClassesToSuperClasses(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology, _boolean);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesConvertPropertyAssertionsToAnnotations()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(ConvertPropertyAssertionsToAnnotations.class));
    }

    public void verifyConvertPropertyAssertionsToAnnotations() throws Exception {
        ConvertPropertyAssertionsToAnnotations testSubject0 = new ConvertPropertyAssertionsToAnnotations(
                _OWLDataFactory, _Set);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesConvertSuperClassesToEquivalentClass() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(ConvertSuperClassesToEquivalentClass.class));
    }

    public void verifyConvertSuperClassesToEquivalentClass() throws Exception {
        ConvertSuperClassesToEquivalentClass testSubject0 = new ConvertSuperClassesToEquivalentClass(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesCreateValuePartition() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(CreateValuePartition.class));
    }

    public void verifyCreateValuePartition() throws Exception {
        CreateValuePartition testSubject0 = new CreateValuePartition(_OWLDataFactory,
                _OWLClass, _Set6, _OWLObjectProperty, _OWLOntology);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesMakeClassesMutuallyDisjoint() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(MakeClassesMutuallyDisjoint.class));
    }

    public void verifyMakeClassesMutuallyDisjoint() throws Exception {
        MakeClassesMutuallyDisjoint testSubject0 = new MakeClassesMutuallyDisjoint(
                _OWLDataFactory, _Set8, _boolean, _OWLOntology);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesMakePrimitiveSubClassesMutuallyDisjoint()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(MakePrimitiveSubClassesMutuallyDisjoint.class));
    }

    public void verifyMakePrimitiveSubClassesMutuallyDisjoint() throws Exception {
        MakePrimitiveSubClassesMutuallyDisjoint testSubject0 = new MakePrimitiveSubClassesMutuallyDisjoint(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology);
        MakePrimitiveSubClassesMutuallyDisjoint testSubject1 = new MakePrimitiveSubClassesMutuallyDisjoint(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology, _boolean);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    public void verifyInterfaceOWLCompositeOntologyChange() throws Exception {
        OWLCompositeOntologyChange testSubject0 = mock(OWLCompositeOntologyChange.class);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesRemoveAllDisjointAxioms() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(RemoveAllDisjointAxioms.class));
    }

    public void verifyRemoveAllDisjointAxioms() throws Exception {
        RemoveAllDisjointAxioms testSubject0 = new RemoveAllDisjointAxioms(
                _OWLDataFactory, _Set);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesShortForm2AnnotationGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.OWLCompositeOntologyChange.class
                .isAssignableFrom(ShortForm2AnnotationGenerator.class));
    }

    public void verifyShortForm2AnnotationGenerator() throws Exception {
        ShortForm2AnnotationGenerator testSubject0 = new ShortForm2AnnotationGenerator(
                _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI, _String);
        ShortForm2AnnotationGenerator testSubject1 = new ShortForm2AnnotationGenerator(
                _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesSplitSubClassAxioms() throws Exception {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(SplitSubClassAxioms.class));
    }

    public void verifySplitSubClassAxioms() throws Exception {
        SplitSubClassAxioms testSubject0 = new SplitSubClassAxioms(_Set, _OWLDataFactory);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    private boolean _boolean;
    private java.lang.String _String;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLClassExpression> _Set8;
    private java.util.Set<org.semanticweb.owlapi.model.OWLClass> _Set6;
    private java.util.Set<org.semanticweb.owlapi.model.OWLOntology> _Set;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
