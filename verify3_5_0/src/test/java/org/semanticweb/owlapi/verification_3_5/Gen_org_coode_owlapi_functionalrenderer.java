package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;

import org.coode.owlapi.functionalrenderer.OWLFunctionalSyntaxOntologyStorer;
import org.coode.owlapi.functionalrenderer.OWLFunctionalSyntaxRenderer;
import org.coode.owlapi.functionalrenderer.OWLObjectRenderer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_functionalrenderer {
    @Test
    public void enforceInterfacesOWLFunctionalSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(OWLFunctionalSyntaxOntologyStorer.class));
    }

    public void verifyOWLFunctionalSyntaxOntologyStorer() throws OWLOntologyStorageException {
        OWLFunctionalSyntaxOntologyStorer testSubject0 = new OWLFunctionalSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(OWLFunctionalSyntaxRenderer.class));
    }

    public void verifyOWLFunctionalSyntaxRenderer() throws OWLRendererException {
        OWLFunctionalSyntaxRenderer testSubject0 = new OWLFunctionalSyntaxRenderer(_OWLOntologyManager);
        OWLFunctionalSyntaxRenderer testSubject1 = new OWLFunctionalSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOWLObjectRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectRenderer.class));
    }

    public void verifyOWLObjectRenderer() {
        OWLObjectRenderer testSubject0 = new OWLObjectRenderer(_OWLOntologyManager, _OWLOntology, _Writer);
        OWLObjectRenderer testSubject1 = new OWLObjectRenderer(_OWLOntology, _Writer);
        testSubject0.write(_OWLXMLVocabulary, _OWLObject);
        testSubject0.write(_OWLAnnotation);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.writeOpenBracket();
        testSubject0.writeSpace();
        testSubject0.writeCloseBracket();
        java.util.Set<OWLAxiom> result0 = testSubject0.writeAnnotations(_OWLEntity);
        testSubject0.writeAnnotations(_OWLAxiom);
        testSubject0.setFocusedObject(_OWLObject);
        testSubject0.writePrefix(_String, _String);
        testSubject0.writePrefixes();
        java.util.Set<OWLAxiom> result1 = testSubject0.writeDeclarations(_OWLEntity);
        java.util.Set<OWLAxiom> result2 = testSubject0.writeAxioms(_OWLEntity);
        testSubject0.writeAxiomStart(_OWLXMLVocabulary, _OWLAxiom);
        testSubject0.writeAxiomEnd();
        testSubject0.writePropertyCharacteristic(_OWLXMLVocabulary, _OWLAxiom, _OWLPropertyExpression);
    }

    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private String _String;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
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
    private OWLEntity _OWLEntity;
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
    private OWLOntologyManager _OWLOntologyManager;
    private OWLPropertyExpression<?, ?> _OWLPropertyExpression;
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
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.vocab.OWLXMLVocabulary _OWLXMLVocabulary;
}
