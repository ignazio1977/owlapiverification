package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.obo.renderer.OBOExceptionHandler;
import org.coode.owlapi.obo.renderer.OBOFlatFileOntologyStorer;
import org.coode.owlapi.obo.renderer.OBOFlatFileRenderer;
import org.coode.owlapi.obo.renderer.OBORelationship;
import org.coode.owlapi.obo.renderer.OBORelationshipGenerator;
import org.coode.owlapi.obo.renderer.OBOStorageException;
import org.coode.owlapi.obo.renderer.OBOStorageIncompleteException;
import org.coode.owlapi.obo.renderer.OBOTagValuePairList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_obo_renderer {
    

    public void verifyInterfaceOBOExceptionHandler() throws Exception {
        OBOExceptionHandler testSubject0 = mock(OBOExceptionHandler.class);
        testSubject0.addException(_OBOStorageException);
        java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> result0 = testSubject0
                .getExceptions();
    }

    @Test
    public void enforceInterfacesOBOFlatFileOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(OBOFlatFileOntologyStorer.class));
    }

    public void verifyOBOFlatFileOntologyStorer() throws Exception {
        OBOFlatFileOntologyStorer testSubject0 = new OBOFlatFileOntologyStorer();
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
    public void enforceInterfacesOBOFlatFileRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class
                .isAssignableFrom(OBOFlatFileRenderer.class));
        assertTrue(org.coode.owlapi.obo.renderer.OBOExceptionHandler.class
                .isAssignableFrom(OBOFlatFileRenderer.class));
    }

    public void verifyOBOFlatFileRenderer() throws Exception {
        OBOFlatFileRenderer testSubject0 = new OBOFlatFileRenderer() {};
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.addException(_OBOStorageException);
        java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> result0 = testSubject0
                .getExceptions();
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    

    public void verifyOBORelationship() throws Exception {
        OBORelationship testSubject0 = new OBORelationship(_OWLObjectProperty,
                _OWLNamedIndividual);
        OBORelationship testSubject1 = new OBORelationship(_OWLObjectProperty, _OWLClass);
        org.semanticweb.owlapi.model.OWLObjectProperty result0 = testSubject0
                .getProperty();
        int result1 = testSubject0.getMaxCardinality();
        int result2 = testSubject0.getMinCardinality();
        testSubject0.setMaxCardinality(_int);
        testSubject0.setMinCardinality(_int);
        testSubject0.setCardinality(_int);
        int result3 = testSubject0.getCardinality();
        org.semanticweb.owlapi.model.OWLEntity result4 = testSubject0.getFiller();
    }

    @Test
    public void enforceInterfacesOBORelationshipGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLClassExpressionVisitorAdapter.class
                .isAssignableFrom(OBORelationshipGenerator.class));
    }

    public void verifyOBORelationshipGenerator() throws Exception {
        OBORelationshipGenerator testSubject0 = new OBORelationshipGenerator(
                _OBOExceptionHandler);
        testSubject0.clear();
        testSubject0.setClass(_OWLClass);
        java.util.Set<org.coode.owlapi.obo.renderer.OBORelationship> result0 = testSubject0
                .getOBORelationships();
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
    }

    @Test
    public void enforceInterfacesOBOStorageException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorageException.class
                .isAssignableFrom(OBOStorageException.class));
    }

    public void verifyOBOStorageException() throws Exception {
        OBOStorageException testSubject0 = new OBOStorageException(_OWLObject,
                _OWLObject, _String);
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
    public void enforceInterfacesOBOStorageIncompleteException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLRendererException.class
                .isAssignableFrom(OBOStorageIncompleteException.class));
    }

    public void verifyOBOStorageIncompleteException() throws Exception {
        OBOStorageIncompleteException testSubject0 = new OBOStorageIncompleteException(
                _List);
        java.lang.String result0 = testSubject0.getMessage();
        java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> result1 = testSubject0
                .getCauses();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    

    public void verifyOBOTagValuePairList() throws Exception {
        OBOTagValuePairList testSubject0 = new OBOTagValuePairList(_List37);
        testSubject0.write(_Writer);
        testSubject0.setDefault(_IRI, _String);
        testSubject0.setDefault(_OBOVocabulary, _String);
        java.util.Set<java.lang.String> result0 = testSubject0.getValues(_OBOVocabulary);
        testSubject0.addPair(_IRI, _String);
        testSubject0.addPair(_OBOVocabulary, _String);
        testSubject0.setPair(_OBOVocabulary, _String);
        testSubject0.visit(_OWLAnnotation);
    }

    private int _int;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.List<org.coode.owlapi.obo.parser.OBOVocabulary> _List37;
    private java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> _List;
    private org.coode.owlapi.obo.parser.OBOVocabulary _OBOVocabulary;
    private org.coode.owlapi.obo.renderer.OBOExceptionHandler _OBOExceptionHandler;
    private org.coode.owlapi.obo.renderer.OBOStorageException _OBOStorageException;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataHasValue _OWLDataHasValue;
    private org.semanticweb.owlapi.model.OWLDataMaxCardinality _OWLDataMaxCardinality;
    private org.semanticweb.owlapi.model.OWLDataMinCardinality _OWLDataMinCardinality;
    private org.semanticweb.owlapi.model.OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
    private org.semanticweb.owlapi.model.OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectComplementOf _OWLObjectComplementOf;
    private org.semanticweb.owlapi.model.OWLObjectExactCardinality _OWLObjectExactCardinality;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectHasValue _OWLObjectHasValue;
    private org.semanticweb.owlapi.model.OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private org.semanticweb.owlapi.model.OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private org.semanticweb.owlapi.model.OWLObjectMinCardinality _OWLObjectMinCardinality;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectUnionOf _OWLObjectUnionOf;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
