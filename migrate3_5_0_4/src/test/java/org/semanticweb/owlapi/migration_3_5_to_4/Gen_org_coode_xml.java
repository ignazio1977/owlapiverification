package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.semanticweb.owlapi.rdf.rdfxml.renderer.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.xml to org.semanticweb.owlapi.rdf.rdfxml.renderer",
        "method change: OWLOntologyXMLNamespaceManager<init> : dropped manager, added format", "method deleted: XMLWriterFactory::getInstance() : all methods are static",
        "method refactored: XMLWriterImpl::getXMLBaseAsURI() : getXMLBase()" })
public class Gen_org_coode_xml {
    @Test
    public void enforceInterfacesIllegalElementNameException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(IllegalElementNameException.class));
    }

    public void verifyIllegalElementNameException() {
        IllegalElementNameException testSubject0 = new IllegalElementNameException(_String);
        String result0 = testSubject0.getElementName();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getMessage();
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyXMLNamespaceManager() {
        assertTrue(XMLWriterNamespaceManager.class.isAssignableFrom(OWLOntologyXMLNamespaceManager.class));
    }

    public void verifyOWLOntologyXMLNamespaceManager() {
        OWLOntologyXMLNamespaceManager testSubject0 = new OWLOntologyXMLNamespaceManager(_OWLOntology, _OWLOntologyFormat);
        String result0 = testSubject0.getQName(_String);
        testSubject0.setPrefix(_String, _String);
        String result1 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        String result2 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        String result3 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        String result4 = testSubject0.getDefaultNamespace();
        Iterable<String> result5 = testSubject0.getPrefixes();
        Iterable<String> result6 = testSubject0.getNamespaces();
    }

    public void verifyInterfaceXMLWriter() throws IOException {
        XMLWriter testSubject0 = mock(XMLWriter.class);
        testSubject0.setWrapAttributes(_boolean);
        testSubject0.writeAttribute(_String, _String);
        testSubject0.writeAttribute(_iri, _String);
        testSubject0.writeStartElement(_iri);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        XMLWriterNamespaceManager result0 = testSubject0.getNamespacePrefixes();
        testSubject0.writeComment(_String);
        String result1 = testSubject0.getXMLBase();
        testSubject0.setEncoding(_String);
        testSubject0.startDocument(_iri);
        testSubject0.endDocument();
    }

    public void verifyXMLWriterFactory() {
        XMLWriter result1 = XMLWriterFactory.createXMLWriter(_Writer, _XMLWriterNamespaceManager, _String);
    }

    @Test
    public void enforceInterfacesXMLWriterImpl() {
        assertTrue(XMLWriter.class.isAssignableFrom(XMLWriterImpl.class));
    }

    public void verifyXMLWriterImpl() throws IOException {
        XMLWriterImpl testSubject0 = new XMLWriterImpl(_Writer, _XMLWriterNamespaceManager, _String);
        testSubject0.setWrapAttributes(_boolean);
        String result0 = testSubject0.getXMLBase();
        testSubject0.writeAttribute(_String, _String);
        testSubject0.writeAttribute(_iri, _String);
        testSubject0.writeStartElement(_iri);
        testSubject0.writeStartElement(_iri);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        XMLWriterNamespaceManager result1 = testSubject0.getNamespacePrefixes();
        testSubject0.writeComment(_String);
        String result2 = testSubject0.getXMLBase();
        String result3 = testSubject0.getDefaultNamespace();
        testSubject0.setEncoding(_String);
        testSubject0.startDocument(_iri);
        testSubject0.startDocument(_iri);
        testSubject0.endDocument();
    }

    public void verifyXMLWriterNamespaceManager() {
        XMLWriterNamespaceManager testSubject0 = new XMLWriterNamespaceManager(_String);
        testSubject0.setPrefix(_String, _String);
        String result0 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        String result1 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        String result2 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        String result3 = testSubject0.getDefaultNamespace();
        Iterable<String> result4 = testSubject0.getPrefixes();
        Iterable<String> result5 = testSubject0.getNamespaces();
        String result7 = testSubject0.getQName(_String);
        String result8 = testSubject0.getQName(_iri);
    }

    public void verifyXMLWriterPreferences() {
        XMLWriterPreferences testSubject0 = XMLWriterPreferences.getInstance();
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
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private IRI _iri;
    private Throwable _Throwable;
    private XMLWriterNamespaceManager _XMLWriterNamespaceManager;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
}
