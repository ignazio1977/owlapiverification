package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.*;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rdf_rdfxml_renderer {
    @Test
    public void enforceInterfacesIllegalElementNameException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(IllegalElementNameException.class));
    }

    public void verifyIllegalElementNameException() {
        IllegalElementNameException testSubject0 = new IllegalElementNameException(_String);
        java.lang.String result0 = testSubject0.getElementName();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyXMLNamespaceManager() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterNamespaceManager.class.isAssignableFrom(OWLOntologyXMLNamespaceManager.class));
    }

    public void verifyOWLOntologyXMLNamespaceManager() {
        OWLOntologyXMLNamespaceManager testSubject0 = new OWLOntologyXMLNamespaceManager(_OWLOntology, _OWLOntologyFormat);
        java.lang.String result0 = testSubject0.getQName(_String);
        java.lang.String result1 = testSubject0.getDefaultNamespace();
        testSubject0.addWellKnownNamespace(_String, _String);
        java.lang.String result2 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        java.lang.String result3 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        java.lang.Iterable<java.lang.String> result4 = testSubject0.getNamespaces();
        testSubject0.setPrefix(_String, _String);
        java.lang.String result5 = testSubject0.getDefaultPrefix();
        java.lang.Iterable<java.lang.String> result6 = testSubject0.getPrefixes();
        java.lang.String result7 = testSubject0.getQName(_IRI);
    }

    @Test
    public void enforceInterfacesRDFXMLNamespaceManager() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.renderer.OWLOntologyXMLNamespaceManager.class.isAssignableFrom(RDFXMLNamespaceManager.class));
    }

    public void verifyRDFXMLNamespaceManager() {
        RDFXMLNamespaceManager testSubject0 = new RDFXMLNamespaceManager(_OWLOntology, _OWLOntologyFormat);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntitiesWithInvalidQNames();
        java.lang.String result1 = testSubject0.getQName(_String);
        java.lang.String result2 = testSubject0.getDefaultNamespace();
        testSubject0.addWellKnownNamespace(_String, _String);
        java.lang.String result3 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        java.lang.String result4 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        java.lang.Iterable<java.lang.String> result5 = testSubject0.getNamespaces();
        testSubject0.setPrefix(_String, _String);
        java.lang.String result6 = testSubject0.getDefaultPrefix();
        java.lang.Iterable<java.lang.String> result7 = testSubject0.getPrefixes();
        java.lang.String result8 = testSubject0.getQName(_IRI);
    }

    @Test
    public void enforceInterfacesRDFXMLOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(RDFXMLStorer.class));
    }

    public void verifyRDFXMLOntologyStorer() throws OWLOntologyStorageException {
        RDFXMLStorer testSubject0 = new RDFXMLStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesRDFXMLRenderer() {
        assertTrue(org.semanticweb.owlapi.rdf.RDFRendererBase.class.isAssignableFrom(RDFXMLRenderer.class));
    }

    public void verifyRDFXMLRenderer() throws IOException {
        RDFXMLRenderer testSubject0 = new RDFXMLRenderer(_OWLOntology, _Writer);
        RDFXMLRenderer testSubject1 = new RDFXMLRenderer(_OWLOntology, _Writer, _OWLOntologyFormat);
        java.util.Set<OWLEntity> result0 = testSubject0.getUnserialisableEntities();
        testSubject0.render(_RDFResource);
        testSubject0.renderAnonRoots();
        testSubject0.render();
    }

    public void verifyRDFXMLWriter() throws IOException {
        RDFXMLWriter testSubject0 = mock(RDFXMLWriter.class);
        testSubject0.writeComment(_String);
        testSubject0.writeStartElement(_IRI);
        testSubject0.writeAboutAttribute(_IRI);
        testSubject0.writeParseTypeAttribute();
        testSubject0.writeDatatypeAttribute(_IRI);
        testSubject0.writeLangAttribute(_String);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        testSubject0.writeResourceAttribute(_IRI);
        testSubject0.writeAttribute(_IRI, _IRI);
        testSubject0.writeNodeIDAttribute(_RDFResource);
        testSubject0.writeOWLObject(_OWLObject);
        testSubject0.startDocument();
        testSubject0.endDocument();
    }

    public void verifyInterfaceXMLWriter() throws IllegalElementNameException, IOException {
        XMLWriter testSubject0 = mock(XMLWriter.class);
        testSubject0.writeComment(_String);
        testSubject0.writeStartElement(_IRI);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        java.lang.String result0 = testSubject0.getXMLBase();
        testSubject0.setWrapAttributes(_boolean);
        testSubject0.writeAttribute(_IRI, _String);
        testSubject0.writeAttribute(_String, _String);
        org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterNamespaceManager result1 = testSubject0.getNamespacePrefixes();
        testSubject0.startDocument(_IRI);
        testSubject0.endDocument();
        testSubject0.setEncoding(_String);
    }

    public void verifyXMLWriterFactory() {
        org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriter result1 = XMLWriterFactory.createXMLWriter(_Writer, _XMLWriterNamespaceManager, _String);
    }

    @Test
    public void enforceInterfacesXMLWriterImpl() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriter.class.isAssignableFrom(XMLWriterImpl.class));
    }

    public void verifyXMLWriterImpl() throws IOException {
        XMLWriterImpl testSubject0 = new XMLWriterImpl(_Writer, _XMLWriterNamespaceManager, _String);
        testSubject0.writeComment(_String);
        java.lang.String result0 = testSubject0.getDefaultNamespace();
        testSubject0.writeStartElement(_IRI);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        java.lang.String result1 = testSubject0.getXMLBase();
        testSubject0.setWrapAttributes(_boolean);
        testSubject0.writeAttribute(_String, _String);
        testSubject0.writeAttribute(_IRI, _String);
        org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterNamespaceManager result2 = testSubject0.getNamespacePrefixes();
        testSubject0.startDocument(_IRI);
        testSubject0.endDocument();
        testSubject0.setEncoding(_String);
    }

    public void verifyXMLWriterNamespaceManager() {
        XMLWriterNamespaceManager testSubject0 = new XMLWriterNamespaceManager(_String);
        java.lang.String result0 = testSubject0.getDefaultNamespace();
        testSubject0.addWellKnownNamespace(_String, _String);
        java.lang.String result1 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        java.lang.String result2 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        java.lang.Iterable<java.lang.String> result3 = testSubject0.getNamespaces();
        testSubject0.setPrefix(_String, _String);
        java.lang.String result4 = testSubject0.getDefaultPrefix();
        java.lang.Iterable<java.lang.String> result5 = testSubject0.getPrefixes();
        java.lang.String result6 = testSubject0.getQName(_String);
        java.lang.String result7 = testSubject0.getQName(_IRI);
    }

    public void verifyXMLWriterPreferences() {
        XMLWriterPreferences testSubject0 = mock(XMLWriterPreferences.class);
        org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterPreferences result0 = XMLWriterPreferences.getInstance();
        boolean result1 = testSubject0.isUseNamespaceEntities();
        testSubject0.setUseNamespaceEntities(_boolean);
        boolean result2 = testSubject0.isIndenting();
        testSubject0.setIndenting(_boolean);
        int result3 = testSubject0.getIndentSize();
        testSubject0.setIndentSize(_int);
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
    private IRI _IRI;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterNamespaceManager _XMLWriterNamespaceManager;
}
