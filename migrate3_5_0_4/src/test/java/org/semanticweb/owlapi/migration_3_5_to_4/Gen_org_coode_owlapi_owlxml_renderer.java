package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.semanticweb.owlapi.owlxml.renderer.*;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterNamespaceManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.owlxml.renderer to org.semanticweb.owlapi.owlxml.renderer", "method modified: OWLXMLRenderer<init> : manager dropped",
        "method deleted: OWLXMLRenderer::setOntologyManager()", })
public class Gen_org_coode_owlapi_owlxml_renderer {
    @Test
    public void enforceInterfacesOWLXMLObjectRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLXMLObjectRenderer.class));
    }

    public void verifyOWLXMLObjectRenderer() {
        OWLXMLObjectRenderer testSubject0 = new OWLXMLObjectRenderer(_OWLXMLWriter);
    }

    @Test
    public void enforceInterfacesOWLXMLOntologyStorageException() {
        assertTrue(OWLOntologyStorageException.class.isAssignableFrom(OWLXMLOntologyStorageException.class));
    }

    public void verifyOWLXMLOntologyStorageException() {
        OWLXMLOntologyStorageException testSubject0 = new OWLXMLOntologyStorageException(_String);
        OWLXMLOntologyStorageException testSubject1 = new OWLXMLOntologyStorageException(_String, _Throwable);
        OWLXMLOntologyStorageException testSubject2 = new OWLXMLOntologyStorageException(_Throwable);
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
    public void enforceInterfacesOWLXMLOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(OWLXMLOntologyStorer.class));
    }

    public void verifyOWLXMLOntologyStorer() throws OWLOntologyStorageException {
        OWLXMLOntologyStorer testSubject0 = new OWLXMLOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLXMLRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(OWLXMLRenderer.class));
    }

    public void verifyOWLXMLRenderer() throws OWLRendererException {
        OWLXMLRenderer testSubject0 = new OWLXMLRenderer();
        OWLXMLRenderer testSubject1 = new OWLXMLRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        OWLXMLRenderer.render(_OWLOntology, _Writer, _OWLOntologyFormat);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    public void verifyOWLXMLWriter() throws IOException, OWLRendererException {
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
        java.util.Map<String, String> result0 = testSubject0.getIRIPrefixMap();
        XMLWriterNamespaceManager result1 = testSubject0.getNamespaceManager();
        String result2 = testSubject0.getIRIString(_IRI);
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
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.net.URI _URI;
    private OWLXMLWriter _OWLXMLWriter;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private NodeID _NodeID;
    private OWLDatatype _OWLDatatype;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
    private org.semanticweb.owlapi.vocab.OWLXMLVocabulary _OWLXMLVocabulary;
}
