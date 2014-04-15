package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.dlsyntax.renderer.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unused" })
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
        assertTrue(org.semanticweb.owlapi.dlsyntax.renderer.DLSyntaxOntologyStorerBase.class.isAssignableFrom(DLSyntaxHTMLOntologyStorer.class));
    }

    public void verifyDLSyntaxHTMLOntologyStorer() throws OWLOntologyStorageException {
        DLSyntaxHTMLOntologyStorer testSubject0 = new DLSyntaxHTMLOntologyStorer();
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
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.String result0 = testSubject0.render(_OWLObject);
        testSubject0.setFocusedObject(_OWLObject);
        boolean result1 = testSubject0.isFocusedObject(_OWLObject);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
    }

    @Test
    public void enforceInterfacesDLSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.dlsyntax.renderer.DLSyntaxOntologyStorerBase.class.isAssignableFrom(DLSyntaxOntologyStorer.class));
    }

    public void verifyDLSyntaxOntologyStorer() throws OWLOntologyStorageException {
        DLSyntaxOntologyStorer testSubject0 = new DLSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesDLSyntaxOntologyStorerBase() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(DLSyntaxOntologyStorerBase.class));
    }

    public void verifyDLSyntaxOntologyStorerBase() throws OWLOntologyStorageException {
        DLSyntaxOntologyStorerBase testSubject0 = mock(DLSyntaxOntologyStorerBase.class);
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
    private OWLOntologyFormat _OWLOntologyFormat;
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