package org.semanticweb.owlapi.migration_3_5_to_4;

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
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi {

    @Test
    public void enforceInterfacesAbstractCompositeOntologyChange()
             {
        assertTrue(org.semanticweb.owlapi.OWLCompositeOntologyChange.class
                .isAssignableFrom(AbstractCompositeOntologyChange.class));
    }

    public void verifyAbstractCompositeOntologyChange()  {
        AbstractCompositeOntologyChange testSubject0 = new AbstractCompositeOntologyChange(
                _OWLDataFactory) {

            @Override
            public List<OWLOntologyChange> getChanges() {
                return null;
            }
        };
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesAddClassExpressionClosureAxiom()
             {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(AddClassExpressionClosureAxiom.class));
    }

    public void verifyAddClassExpressionClosureAxiom()  {
        AddClassExpressionClosureAxiom testSubject0 = new AddClassExpressionClosureAxiom(
                _OWLDataFactory, _OWLClass, _OWLObjectPropertyExpression, _Set,
                _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesAmalgamateSubClassAxioms()  {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(AmalgamateSubClassAxioms.class));
    }

    public void verifyAmalgamateSubClassAxioms()  {
        AmalgamateSubClassAxioms testSubject0 = new AmalgamateSubClassAxioms(
                _Set, _OWLDataFactory);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesCoerceConstantsIntoDataPropertyRange()
             {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(CoerceConstantsIntoDataPropertyRange.class));
    }

    public void verifyCoerceConstantsIntoDataPropertyRange()  {
        CoerceConstantsIntoDataPropertyRange testSubject0 = new CoerceConstantsIntoDataPropertyRange(
                _OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesConvertEquivalentClassesToSuperClasses()
             {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(ConvertEquivalentClassesToSuperClasses.class));
    }

    public void verifyConvertEquivalentClassesToSuperClasses()  {
        ConvertEquivalentClassesToSuperClasses testSubject0 = new ConvertEquivalentClassesToSuperClasses(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology, _boolean);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesConvertPropertyAssertionsToAnnotations()
             {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(ConvertPropertyAssertionsToAnnotations.class));
    }

    public void verifyConvertPropertyAssertionsToAnnotations()  {
        ConvertPropertyAssertionsToAnnotations testSubject0 = new ConvertPropertyAssertionsToAnnotations(
                _OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesConvertSuperClassesToEquivalentClass()
             {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(ConvertSuperClassesToEquivalentClass.class));
    }

    public void verifyConvertSuperClassesToEquivalentClass()  {
        ConvertSuperClassesToEquivalentClass testSubject0 = new ConvertSuperClassesToEquivalentClass(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesCreateValuePartition()  {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(CreateValuePartition.class));
    }

    public void verifyCreateValuePartition()  {
        CreateValuePartition testSubject0 = new CreateValuePartition(
                _OWLDataFactory, _OWLClass, _Set6, _OWLObjectProperty,
                _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesMakeClassesMutuallyDisjoint()  {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(MakeClassesMutuallyDisjoint.class));
    }

    public void verifyMakeClassesMutuallyDisjoint()  {
        MakeClassesMutuallyDisjoint testSubject0 = new MakeClassesMutuallyDisjoint(
                _OWLDataFactory, _Set8, _boolean, _OWLOntology);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesMakePrimitiveSubClassesMutuallyDisjoint()
             {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(MakePrimitiveSubClassesMutuallyDisjoint.class));
    }

    public void verifyMakePrimitiveSubClassesMutuallyDisjoint()
             {
        MakePrimitiveSubClassesMutuallyDisjoint testSubject0 = new MakePrimitiveSubClassesMutuallyDisjoint(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology);
        MakePrimitiveSubClassesMutuallyDisjoint testSubject1 = new MakePrimitiveSubClassesMutuallyDisjoint(
                _OWLDataFactory, _OWLClass, _Set, _OWLOntology, _boolean);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    public void verifyInterfaceOWLCompositeOntologyChange()  {
        OWLCompositeOntologyChange testSubject0 = mock(OWLCompositeOntologyChange.class);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesRemoveAllDisjointAxioms()  {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(RemoveAllDisjointAxioms.class));
    }

    public void verifyRemoveAllDisjointAxioms()  {
        RemoveAllDisjointAxioms testSubject0 = new RemoveAllDisjointAxioms(
                _OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesShortForm2AnnotationGenerator()
             {
        assertTrue(org.semanticweb.owlapi.OWLCompositeOntologyChange.class
                .isAssignableFrom(ShortForm2AnnotationGenerator.class));
    }

    public void verifyShortForm2AnnotationGenerator()  {
        ShortForm2AnnotationGenerator testSubject0 = new ShortForm2AnnotationGenerator(
                _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI,
                _String);
        ShortForm2AnnotationGenerator testSubject1 = new ShortForm2AnnotationGenerator(
                _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    @Test
    public void enforceInterfacesSplitSubClassAxioms()  {
        assertTrue(org.semanticweb.owlapi.AbstractCompositeOntologyChange.class
                .isAssignableFrom(SplitSubClassAxioms.class));
    }

    public void verifySplitSubClassAxioms()  {
        SplitSubClassAxioms testSubject0 = new SplitSubClassAxioms(_Set,
                _OWLDataFactory);
        java.util.List<OWLOntologyChange> result0 = testSubject0
                .getChanges();
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
