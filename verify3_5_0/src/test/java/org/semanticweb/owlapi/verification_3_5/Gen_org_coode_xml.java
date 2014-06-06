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
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_xml {

    @Test
    public void enforceInterfacesIllegalElementNameException()  {
        assertTrue(OWLRuntimeException.class
                .isAssignableFrom(IllegalElementNameException.class));
    }

    public void verifyIllegalElementNameException()  {
        IllegalElementNameException testSubject0 = new IllegalElementNameException(
                _String);
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
    public void enforceInterfacesOWLOntologyXMLNamespaceManager()
             {
        assertTrue(org.coode.xml.XMLWriterNamespaceManager.class
                .isAssignableFrom(OWLOntologyXMLNamespaceManager.class));
    }

    public void verifyOWLOntologyXMLNamespaceManager()  {
        OWLOntologyXMLNamespaceManager testSubject0 = new OWLOntologyXMLNamespaceManager(
                _OWLOntologyManager, _OWLOntology);
        OWLOntologyXMLNamespaceManager testSubject1 = new OWLOntologyXMLNamespaceManager(
                _OWLOntology, _OWLOntologyFormat);
        String result0 = testSubject0.getQName(_String);
        testSubject0.setPrefix(_String, _String);
        String result1 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        String result2 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        String result3 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        String result4 = testSubject0.getDefaultNamespace();
        java.util.Set<String> result5 = testSubject0.getPrefixes();
        java.util.Set<String> result6 = testSubject0.getNamespaces();
        java.util.Map<String, String> result7 = testSubject0
                .getPrefixNamespaceMap();
    }

    public void verifyInterfaceXMLWriter()  {
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
        String result1 = testSubject0.getXMLBase();
        testSubject0.setEncoding(_String);
        testSubject0.startDocument(_String);
        testSubject0.startDocument(_iri);
        testSubject0.endDocument();
    }

    public void verifyXMLWriterFactory()  {
        XMLWriterFactory testSubject0 = XMLWriterFactory.getInstance();
        org.coode.xml.XMLWriter result1 = testSubject0.createXMLWriter(_Writer,
                _XMLWriterNamespaceManager, _String);
    }

    @Test
    public void enforceInterfacesXMLWriterImpl()  {
        assertTrue(org.coode.xml.XMLWriter.class
                .isAssignableFrom(XMLWriterImpl.class));
    }

    public void verifyXMLWriterImpl()  {
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
        String result2 = testSubject0.getXMLBase();
        String result3 = testSubject0.getDefaultNamespace();
        testSubject0.setEncoding(_String);
        testSubject0.startDocument(_String);
        testSubject0.startDocument(_iri);
        testSubject0.endDocument();
    }

    public void verifyXMLWriterNamespaceManager()  {
        XMLWriterNamespaceManager testSubject0 = new XMLWriterNamespaceManager(
                _String);
        testSubject0.setPrefix(_String, _String);
        String result0 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        String result1 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        String result2 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        String result3 = testSubject0.getDefaultNamespace();
        java.util.Set<String> result4 = testSubject0.getPrefixes();
        java.util.Set<String> result5 = testSubject0.getNamespaces();
        java.util.Map<String, String> result6 = testSubject0
                .getPrefixNamespaceMap();
        String result7 = testSubject0.getQName(_String);
        String result8 = testSubject0.getQName(_iri);
    }

    public void verifyXMLWriterPreferences()  {
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
    private org.coode.xml.XMLWriterNamespaceManager _XMLWriterNamespaceManager;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
}
