package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.xml.IllegalElementNameException;
import org.coode.xml.OWLOntologyXMLNamespaceManager;
import org.coode.xml.XMLWriter;
import org.coode.xml.XMLWriterFactory;
import org.coode.xml.XMLWriterImpl;
import org.coode.xml.XMLWriterNamespaceManager;
import org.coode.xml.XMLWriterPreferences;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.IRI;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_xml {
    @Test
    public void enforceInterfacesIllegalElementNameException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(IllegalElementNameException.class));
    }

    public void verifyIllegalElementNameException() throws Exception {
        IllegalElementNameException testSubject0 = new IllegalElementNameException(
                _String);
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
    public void enforceInterfacesOWLOntologyXMLNamespaceManager() throws Exception {
        assertTrue(org.coode.xml.XMLWriterNamespaceManager.class
                .isAssignableFrom(OWLOntologyXMLNamespaceManager.class));
    }

    public void verifyOWLOntologyXMLNamespaceManager() throws Exception {
        OWLOntologyXMLNamespaceManager testSubject0 = new OWLOntologyXMLNamespaceManager(
                _OWLOntologyManager, _OWLOntology);
        OWLOntologyXMLNamespaceManager testSubject1 = new OWLOntologyXMLNamespaceManager(
                _OWLOntology, _OWLOntologyFormat);
        java.lang.String result0 = testSubject0.getQName(_String);
        testSubject0.setPrefix(_String, _String);
        java.lang.String result1 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        java.lang.String result2 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        java.lang.String result3 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        java.lang.String result4 = testSubject0.getDefaultNamespace();
        java.util.Set<java.lang.String> result5 = testSubject0.getPrefixes();
        java.util.Set<java.lang.String> result6 = testSubject0.getNamespaces();
        java.util.Map<java.lang.String, java.lang.String> result7 = testSubject0
                .getPrefixNamespaceMap();
    }

    public void verifyInterfaceXMLWriter() throws Exception {
        XMLWriter testSubject0 = mock(XMLWriter.class);
        testSubject0.setWrapAttributes(_boolean);
        testSubject0.writeAttribute(_String, _String);
        testSubject0.writeAttribute(_iri, _String);
        testSubject0.writeStartElement(_String);
        testSubject0.writeStartElement(_iri);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        org.coode.xml.XMLWriterNamespaceManager result0 = testSubject0
                .getNamespacePrefixes();
        testSubject0.writeComment(_String);
        java.lang.String result1 = testSubject0.getXMLBase();
        testSubject0.setEncoding(_String);
        testSubject0.startDocument(_String);
        testSubject0.startDocument(_iri);
        testSubject0.endDocument();
    }

    public void verifyXMLWriterFactory() throws Exception {
        XMLWriterFactory testSubject0 = XMLWriterFactory.getInstance();
        org.coode.xml.XMLWriter result1 = testSubject0.createXMLWriter(_Writer,
                _XMLWriterNamespaceManager, _String);
    }

    @Test
    public void enforceInterfacesXMLWriterImpl() throws Exception {
        assertTrue(org.coode.xml.XMLWriter.class.isAssignableFrom(XMLWriterImpl.class));
    }

    public void verifyXMLWriterImpl() throws Exception {
        XMLWriterImpl testSubject0 = new XMLWriterImpl(_Writer,
                _XMLWriterNamespaceManager, _String);
        testSubject0.setWrapAttributes(_boolean);
        java.net.URI result0 = testSubject0.getXMLBaseAsURI();
        testSubject0.writeAttribute(_String, _String);
        testSubject0.writeAttribute(_iri, _String);
        testSubject0.writeStartElement(_String);
        testSubject0.writeStartElement(_iri);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        org.coode.xml.XMLWriterNamespaceManager result1 = testSubject0
                .getNamespacePrefixes();
        testSubject0.writeComment(_String);
        java.lang.String result2 = testSubject0.getXMLBase();
        java.lang.String result3 = testSubject0.getDefaultNamespace();
        testSubject0.setEncoding(_String);
        testSubject0.startDocument(_String);
        testSubject0.startDocument(_iri);
        testSubject0.endDocument();
    }

    public void verifyXMLWriterNamespaceManager() throws Exception {
        XMLWriterNamespaceManager testSubject0 = new XMLWriterNamespaceManager(_String);
        testSubject0.setPrefix(_String, _String);
        java.lang.String result0 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        java.lang.String result1 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        java.lang.String result2 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        java.lang.String result3 = testSubject0.getDefaultNamespace();
        java.util.Set<java.lang.String> result4 = testSubject0.getPrefixes();
        java.util.Set<java.lang.String> result5 = testSubject0.getNamespaces();
        java.util.Map<java.lang.String, java.lang.String> result6 = testSubject0
                .getPrefixNamespaceMap();
        java.lang.String result7 = testSubject0.getQName(_String);
        java.lang.String result8 = testSubject0.getQName(_iri);
    }

    public void verifyXMLWriterPreferences() throws Exception {
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
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private IRI _iri;
    private java.lang.Throwable _Throwable;
    private org.coode.xml.XMLWriterNamespaceManager _XMLWriterNamespaceManager;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
