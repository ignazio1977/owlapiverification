package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.obo.renderer.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_obo_renderer {
    public void verifyInterfaceOBOExceptionHandler() {
        OBOExceptionHandler testSubject0 = mock(OBOExceptionHandler.class);
        testSubject0.addException(_OBOStorageException);
        java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> result0 = testSubject0.getExceptions();
    }

    @Test
    public void enforceInterfacesOBOFlatFileOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(OBOFlatFileOntologyStorer.class));
    }

    public void verifyOBOFlatFileOntologyStorer() throws OWLOntologyStorageException {
        OBOFlatFileOntologyStorer testSubject0 = new OBOFlatFileOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOBOFlatFileRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(OBOFlatFileRenderer.class));
        assertTrue(org.coode.owlapi.obo.renderer.OBOExceptionHandler.class.isAssignableFrom(OBOFlatFileRenderer.class));
    }

    public void verifyOBOFlatFileRenderer() throws OWLRendererException {
        OBOFlatFileRenderer testSubject0 = new OBOFlatFileRenderer() {
        };
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.addException(_OBOStorageException);
        java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> result0 = testSubject0.getExceptions();
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    public void verifyOBORelationship() {
        OBORelationship testSubject0 = new OBORelationship(_OWLObjectProperty, _OWLNamedIndividual);
        OBORelationship testSubject1 = new OBORelationship(_OWLObjectProperty, _OWLClass);
        OWLObjectProperty result0 = testSubject0.getProperty();
        int result1 = testSubject0.getMaxCardinality();
        int result2 = testSubject0.getMinCardinality();
        testSubject0.setMaxCardinality(_int);
        testSubject0.setMinCardinality(_int);
        testSubject0.setCardinality(_int);
        int result3 = testSubject0.getCardinality();
        OWLEntity result4 = testSubject0.getFiller();
    }

    @Test
    public void enforceInterfacesOBORelationshipGenerator() {
        assertTrue(org.semanticweb.owlapi.util.OWLClassExpressionVisitorAdapter.class.isAssignableFrom(OBORelationshipGenerator.class));
    }

    public void verifyOBORelationshipGenerator() {
        OBORelationshipGenerator testSubject0 = new OBORelationshipGenerator(_OBOExceptionHandler);
        testSubject0.clear();
        testSubject0.setClass(_OWLClass);
        java.util.Set<org.coode.owlapi.obo.renderer.OBORelationship> result0 = testSubject0.getOBORelationships();
    }

    @Test
    public void enforceInterfacesOBOStorageException() {
        assertTrue(OWLOntologyStorageException.class.isAssignableFrom(OBOStorageException.class));
    }

    public void verifyOBOStorageException() {
        OBOStorageException testSubject0 = new OBOStorageException(_OWLObject, _OWLObject, _String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOBOStorageIncompleteException() {
        assertTrue(org.semanticweb.owlapi.io.OWLRendererException.class.isAssignableFrom(OBOStorageIncompleteException.class));
    }

    public void verifyOBOStorageIncompleteException() {
        OBOStorageIncompleteException testSubject0 = new OBOStorageIncompleteException(_List);
        String result0 = testSubject0.getMessage();
        java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> result1 = testSubject0.getCauses();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result2 = testSubject0.fillInStackTrace();
        Throwable result3 = testSubject0.getCause();
        Throwable result4 = testSubject0.initCause(_Throwable);
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    public void verifyOBOTagValuePairList() {
        OBOTagValuePairList testSubject0 = new OBOTagValuePairList(_List37);
        testSubject0.write(_Writer);
        testSubject0.setDefault(_IRI, _String);
        testSubject0.setDefault(_OBOVocabulary, _String);
        java.util.Set<String> result0 = testSubject0.getValues(_OBOVocabulary);
        testSubject0.addPair(_IRI, _String);
        testSubject0.addPair(_OBOVocabulary, _String);
        testSubject0.setPair(_OBOVocabulary, _String);
    }

    private int _int;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.util.List<org.coode.owlapi.obo.parser.OBOVocabulary> _List37;
    private java.util.List<org.coode.owlapi.obo.renderer.OBOStorageException> _List;
    private org.coode.owlapi.obo.parser.OBOVocabulary _OBOVocabulary;
    private org.coode.owlapi.obo.renderer.OBOExceptionHandler _OBOExceptionHandler;
    private org.coode.owlapi.obo.renderer.OBOStorageException _OBOStorageException;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLClass _OWLClass;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLObject _OWLObject;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
}
