package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.coode.owlapi.owlxml.renderer.OWLXMLObjectRenderer;
import org.coode.owlapi.owlxml.renderer.OWLXMLOntologyStorageException;
import org.coode.owlapi.owlxml.renderer.OWLXMLOntologyStorer;
import org.coode.owlapi.owlxml.renderer.OWLXMLRenderer;
import org.coode.owlapi.owlxml.renderer.OWLXMLWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_owlxml_renderer {
    @Test
    public void enforceInterfacesOWLXMLObjectRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLXMLObjectRenderer.class));
    }

    public void verifyOWLXMLObjectRenderer() throws Exception {
        OWLXMLObjectRenderer testSubject0 = new OWLXMLObjectRenderer(_OWLXMLWriter);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
    }

    @Test
    public void enforceInterfacesOWLXMLOntologyStorageException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorageException.class
                .isAssignableFrom(OWLXMLOntologyStorageException.class));
    }

    public void verifyOWLXMLOntologyStorageException() throws Exception {
        OWLXMLOntologyStorageException testSubject0 = new OWLXMLOntologyStorageException(
                _String);
        OWLXMLOntologyStorageException testSubject1 = new OWLXMLOntologyStorageException(
                _String, _Throwable);
        OWLXMLOntologyStorageException testSubject2 = new OWLXMLOntologyStorageException(
                _Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLXMLOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(OWLXMLOntologyStorer.class));
    }

    public void verifyOWLXMLOntologyStorer() throws Exception {
        OWLXMLOntologyStorer testSubject0 = new OWLXMLOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLXMLRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class
                .isAssignableFrom(OWLXMLRenderer.class));
    }

    public void verifyOWLXMLRenderer() throws Exception {
        OWLXMLRenderer testSubject0 = new OWLXMLRenderer(_OWLOntologyManager);
        OWLXMLRenderer testSubject1 = new OWLXMLRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _Writer, _OWLOntologyFormat);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    

    public void verifyOWLXMLWriter() throws Exception {
        OWLXMLWriter testSubject0 = new OWLXMLWriter(_Writer, _OWLOntology);
        testSubject0.writeStartElement(_OWLXMLVocabulary);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        testSubject0.writeIRIElement(_IRI);
        testSubject0.writeNodeIDAttribute(_NodeID);
        testSubject0.writeIRIAttribute(_IRI);
        testSubject0.writeCardinalityAttribute(_int);
        testSubject0.writeFacetAttribute(_OWLFacet);
        testSubject0.writeLangAttribute(_String);
        testSubject0.writeDatatypeAttribute(_OWLDatatype);
        java.util.Map<java.lang.String, java.lang.String> result0 = testSubject0
                .getIRIPrefixMap();
        org.coode.xml.XMLWriterNamespaceManager result1 = testSubject0
                .getNamespaceManager();
        java.lang.String result2 = testSubject0.getIRIString(_IRI);
        testSubject0.writeAnnotationURIAttribute(_URI);
        testSubject0.writePrefix(_String, _String);
        testSubject0.startDocument(_OWLOntology);
        testSubject0.endDocument();
    }

    private int _int;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.net.URI _URI;
    private org.coode.owlapi.owlxml.renderer.OWLXMLWriter _OWLXMLWriter;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.NodeID _NodeID;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataComplementOf _OWLDataComplementOf;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataHasValue _OWLDataHasValue;
    private org.semanticweb.owlapi.model.OWLDataIntersectionOf _OWLDataIntersectionOf;
    private org.semanticweb.owlapi.model.OWLDataMaxCardinality _OWLDataMaxCardinality;
    private org.semanticweb.owlapi.model.OWLDataMinCardinality _OWLDataMinCardinality;
    private org.semanticweb.owlapi.model.OWLDataOneOf _OWLDataOneOf;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataUnionOf _OWLDataUnionOf;
    private org.semanticweb.owlapi.model.OWLDatatype _OWLDatatype;
    private org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private org.semanticweb.owlapi.model.OWLDatatypeRestriction _OWLDatatypeRestriction;
    private org.semanticweb.owlapi.model.OWLDeclarationAxiom _OWLDeclarationAxiom;
    private org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLFacetRestriction _OWLFacetRestriction;
    private org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLHasKeyAxiom _OWLHasKeyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectComplementOf _OWLObjectComplementOf;
    private org.semanticweb.owlapi.model.OWLObjectExactCardinality _OWLObjectExactCardinality;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectHasValue _OWLObjectHasValue;
    private org.semanticweb.owlapi.model.OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private org.semanticweb.owlapi.model.OWLObjectInverseOf _OWLObjectInverseOf;
    private org.semanticweb.owlapi.model.OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private org.semanticweb.owlapi.model.OWLObjectMinCardinality _OWLObjectMinCardinality;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectUnionOf _OWLObjectUnionOf;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.SWRLBuiltInAtom _SWRLBuiltInAtom;
    private org.semanticweb.owlapi.model.SWRLClassAtom _SWRLClassAtom;
    private org.semanticweb.owlapi.model.SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLDataRangeAtom _SWRLDataRangeAtom;
    private org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private org.semanticweb.owlapi.model.SWRLIndividualArgument _SWRLIndividualArgument;
    private org.semanticweb.owlapi.model.SWRLLiteralArgument _SWRLLiteralArgument;
    private org.semanticweb.owlapi.model.SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.model.SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private org.semanticweb.owlapi.model.SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
    private org.semanticweb.owlapi.vocab.OWLXMLVocabulary _OWLXMLVocabulary;
}
