package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.dlsyntax.renderer.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_dlsyntax_renderer {
    @Test
    public void enforceInterfacesDLSyntax() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(DLSyntax.class));
    }

    public void verifyEnumDLSyntax() {
        DLSyntax testSubject0 = DLSyntax.SUBCLASS;
        DLSyntax testSubject1 = DLSyntax.EQUIVALENT_TO;
        DLSyntax testSubject2 = DLSyntax.NOT;
        DLSyntax testSubject3 = DLSyntax.DISJOINT_WITH;
        DLSyntax testSubject4 = DLSyntax.EXISTS;
        DLSyntax testSubject5 = DLSyntax.FORALL;
        DLSyntax testSubject6 = DLSyntax.IN;
        DLSyntax testSubject7 = DLSyntax.MIN;
        DLSyntax testSubject8 = DLSyntax.EQUAL;
        DLSyntax testSubject9 = DLSyntax.NOT_EQUAL;
        DLSyntax testSubject10 = DLSyntax.MAX;
        DLSyntax testSubject11 = DLSyntax.INVERSE;
        DLSyntax testSubject12 = DLSyntax.AND;
        DLSyntax testSubject13 = DLSyntax.TOP;
        DLSyntax testSubject14 = DLSyntax.BOTTOM;
        DLSyntax testSubject15 = DLSyntax.OR;
        DLSyntax testSubject16 = DLSyntax.COMP;
        DLSyntax testSubject17 = DLSyntax.WEDGE;
        DLSyntax testSubject18 = DLSyntax.IMPLIES;
        DLSyntax testSubject19 = DLSyntax.COMMA;
        DLSyntax testSubject20 = DLSyntax.SELF;
    }

    @Test
    public void enforceInterfacesDLSyntaxHTMLOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.dlsyntax.renderer.DLSyntaxStorerBase.class.isAssignableFrom(DLSyntaxHTMLStorer.class));
    }

    public void verifyDLSyntaxHTMLOntologyStorer() throws OWLOntologyStorageException {
        DLSyntaxHTMLStorer testSubject0 = new DLSyntaxHTMLStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesDLSyntaxObjectRenderer() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorAdapter.class.isAssignableFrom(DLSyntaxObjectRenderer.class));
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class.isAssignableFrom(DLSyntaxObjectRenderer.class));
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(DLSyntaxObjectRenderer.class));
    }

    public void verifyDLSyntaxObjectRenderer() {
        DLSyntaxObjectRenderer testSubject0 = new DLSyntaxObjectRenderer();
        testSubject0.setShortFormProvider(_ShortFormProvider);
        java.lang.String result0 = testSubject0.render(_OWLObject);
        testSubject0.setFocusedObject(_OWLObject);
        boolean result1 = testSubject0.isFocusedObject(_OWLObject);
    }

    @Test
    public void enforceInterfacesDLSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.dlsyntax.renderer.DLSyntaxStorerBase.class.isAssignableFrom(DLSyntaxStorer.class));
    }

    public void verifyDLSyntaxOntologyStorer() throws OWLOntologyStorageException {
        DLSyntaxStorer testSubject0 = new DLSyntaxStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesDLSyntaxOntologyStorerBase() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(DLSyntaxStorerBase.class));
    }

    public void verifyDLSyntaxOntologyStorerBase() throws OWLOntologyStorageException {
        DLSyntaxStorerBase testSubject0 = mock(DLSyntaxStorerBase.class);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataComplementOf _OWLDataComplementOf;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataIntersectionOf _OWLDataIntersectionOf;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataOneOf _OWLDataOneOf;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
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
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObject _OWLObject;
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
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
    private OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private SWRLBuiltInAtom _SWRLBuiltInAtom;
    private SWRLClassAtom _SWRLClassAtom;
    private SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private SWRLDataRangeAtom _SWRLDataRangeAtom;
    private SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private SWRLIndividualArgument _SWRLIndividualArgument;
    private SWRLLiteralArgument _SWRLLiteralArgument;
    private SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private SWRLRule _SWRLRule;
    private SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
