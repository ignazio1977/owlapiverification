package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.semanticweb.owlapi to org.semanticweb.owlapi.change", "method changed: AmalgamateSubClassAxioms<init> : arguments swapped",
        "method changed: MakePrimitiveSubClassesMutuallyDisjoint<init> : set of OWLOntology removed", "method changed: ShortForm2AnnotationGenerator<init> : add OWLDataFactory", })
public class Gen_org_semanticweb_owlapi {
    @Test
    public void enforceInterfacesAbstractCompositeOntologyChange() {
        assertTrue(org.semanticweb.owlapi.change.OWLCompositeOntologyChange.class.isAssignableFrom(AbstractCompositeOntologyChange.class));
    }

    @Test
    public void enforceInterfacesAddClassExpressionClosureAxiom() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(AddClassExpressionClosureAxiom.class));
    }

    public void verifyAddClassExpressionClosureAxiom() {
        AddClassExpressionClosureAxiom testSubject0 = new AddClassExpressionClosureAxiom(_OWLDataFactory, _OWLClass, _OWLObjectPropertyExpression, _Set, _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesAmalgamateSubClassAxioms() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(AmalgamateSubClassAxioms.class));
    }

    public void verifyAmalgamateSubClassAxioms() {
        AmalgamateSubClassAxioms testSubject0 = new AmalgamateSubClassAxioms(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesCoerceConstantsIntoDataPropertyRange() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(CoerceConstantsIntoDataPropertyRange.class));
    }

    public void verifyCoerceConstantsIntoDataPropertyRange() {
        CoerceConstantsIntoDataPropertyRange testSubject0 = new CoerceConstantsIntoDataPropertyRange(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesConvertEquivalentClassesToSuperClasses() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(ConvertEquivalentClassesToSuperClasses.class));
    }

    public void verifyConvertEquivalentClassesToSuperClasses() {
        ConvertEquivalentClassesToSuperClasses testSubject0 = new ConvertEquivalentClassesToSuperClasses(_OWLDataFactory, _OWLClass, _Set, _OWLOntology, _boolean);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesConvertPropertyAssertionsToAnnotations() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(ConvertPropertyAssertionsToAnnotations.class));
    }

    public void verifyConvertPropertyAssertionsToAnnotations() {
        ConvertPropertyAssertionsToAnnotations testSubject0 = new ConvertPropertyAssertionsToAnnotations(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesConvertSuperClassesToEquivalentClass() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(ConvertSuperClassesToEquivalentClass.class));
    }

    public void verifyConvertSuperClassesToEquivalentClass() {
        ConvertSuperClassesToEquivalentClass testSubject0 = new ConvertSuperClassesToEquivalentClass(_OWLDataFactory, _OWLClass, _Set, _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesCreateValuePartition() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(CreateValuePartition.class));
    }

    public void verifyCreateValuePartition() {
        CreateValuePartition testSubject0 = new CreateValuePartition(_OWLDataFactory, _OWLClass, _Set6, _OWLObjectProperty, _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesMakeClassesMutuallyDisjoint() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(MakeClassesMutuallyDisjoint.class));
    }

    public void verifyMakeClassesMutuallyDisjoint() {
        MakeClassesMutuallyDisjoint testSubject0 = new MakeClassesMutuallyDisjoint(_OWLDataFactory, _Set8, _boolean, _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesMakePrimitiveSubClassesMutuallyDisjoint() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(MakePrimitiveSubClassesMutuallyDisjoint.class));
    }

    public void verifyMakePrimitiveSubClassesMutuallyDisjoint() {
        MakePrimitiveSubClassesMutuallyDisjoint testSubject0 = new MakePrimitiveSubClassesMutuallyDisjoint(_OWLDataFactory, _OWLClass, _OWLOntology);
        MakePrimitiveSubClassesMutuallyDisjoint testSubject1 = new MakePrimitiveSubClassesMutuallyDisjoint(_OWLDataFactory, _OWLClass, _OWLOntology, _boolean);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    public void verifyInterfaceOWLCompositeOntologyChange() {
        OWLCompositeOntologyChange testSubject0 = mock(OWLCompositeOntologyChange.class);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesRemoveAllDisjointAxioms() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(RemoveAllDisjointAxioms.class));
    }

    public void verifyRemoveAllDisjointAxioms() {
        RemoveAllDisjointAxioms testSubject0 = new RemoveAllDisjointAxioms(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesShortForm2AnnotationGenerator() {
        assertTrue(OWLCompositeOntologyChange.class.isAssignableFrom(ShortForm2AnnotationGenerator.class));
    }

    public void verifyShortForm2AnnotationGenerator() {
        ShortForm2AnnotationGenerator testSubject0 = new ShortForm2AnnotationGenerator(_OWLDataFactory, _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI, _String);
        ShortForm2AnnotationGenerator testSubject1 = new ShortForm2AnnotationGenerator(_OWLDataFactory, _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesSplitSubClassAxioms() {
        assertTrue(AbstractCompositeOntologyChange.class.isAssignableFrom(SplitSubClassAxioms.class));
    }

    public void verifySplitSubClassAxioms() {
        SplitSubClassAxioms testSubject0 = new SplitSubClassAxioms(_Set, _OWLDataFactory);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
    }

    private boolean _boolean;
    private String _String;
    private java.util.Set<? extends OWLClassExpression> _Set8;
    private java.util.Set<OWLClass> _Set6;
    private java.util.Set<OWLOntology> _Set;
    private IRI _IRI;
    private OWLClass _OWLClass;
    private OWLDataFactory _OWLDataFactory;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
