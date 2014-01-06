package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.rdf.rdfxml.RDFXMLNamespaceManager;
import org.coode.owlapi.rdf.rdfxml.RDFXMLOntologyStorer;
import org.coode.owlapi.rdf.rdfxml.RDFXMLRenderer;
import org.coode.owlapi.rdf.rdfxml.RDFXMLWriter;
import org.coode.xml.XMLWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_rdf_rdfxml {
    @Test
    public void enforceInterfacesRDFXMLNamespaceManager() throws Exception {
        assertTrue(org.coode.xml.OWLOntologyXMLNamespaceManager.class
                .isAssignableFrom(RDFXMLNamespaceManager.class));
    }

    public void verifyRDFXMLNamespaceManager() throws Exception {
        RDFXMLNamespaceManager testSubject0 = new RDFXMLNamespaceManager(
                _OWLOntologyManager, _OWLOntology);
        RDFXMLNamespaceManager testSubject1 = new RDFXMLNamespaceManager(_OWLOntology,
                _OWLOntologyFormat);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getEntitiesWithInvalidQNames();
        java.lang.String result1 = testSubject0.getQName(_String);
        testSubject0.setPrefix(_String, _String);
        java.lang.String result2 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        java.lang.String result3 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        java.lang.String result4 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        java.lang.String result5 = testSubject0.getDefaultNamespace();
        java.util.Set<java.lang.String> result6 = testSubject0.getPrefixes();
        java.util.Set<java.lang.String> result7 = testSubject0.getNamespaces();
        java.util.Map<java.lang.String, java.lang.String> result8 = testSubject0
                .getPrefixNamespaceMap();
    }

    @Test
    public void enforceInterfacesRDFXMLOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(RDFXMLOntologyStorer.class));
    }

    public void verifyRDFXMLOntologyStorer() throws Exception {
        RDFXMLOntologyStorer testSubject0 = new RDFXMLOntologyStorer();
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
    public void enforceInterfacesRDFXMLRenderer() throws Exception {
        assertTrue(org.coode.owlapi.rdf.renderer.RDFRendererBase.class
                .isAssignableFrom(RDFXMLRenderer.class));
    }

    public void verifyRDFXMLRenderer() throws Exception {
        RDFXMLRenderer testSubject0 = new RDFXMLRenderer(_OWLOntology, _Writer,
                _OWLOntologyFormat);
        RDFXMLRenderer testSubject1 = new RDFXMLRenderer(_OWLOntologyManager,
                _OWLOntology, _Writer, _OWLOntologyFormat);
        RDFXMLRenderer testSubject2 = new RDFXMLRenderer(_OWLOntology, _Writer);
        RDFXMLRenderer testSubject3 = new RDFXMLRenderer(_OWLOntologyManager,
                _OWLOntology, _Writer);
        testSubject0.render(_RDFResourceNode);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getUnserialisableEntities();
        testSubject0.render();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.getOntology();
        org.coode.owlapi.rdf.model.RDFGraph result2 = testSubject0.getGraph();
        testSubject0.renderAnonRoots();
    }

    public void verifyRDFXMLWriter() throws Exception {
        RDFXMLWriter testSubject0 = new RDFXMLWriter(mock(XMLWriter.class)) {};
        testSubject0.writeStartElement(_IRI);
        testSubject0.writeTextContent(_String);
        testSubject0.writeEndElement();
        testSubject0.writeNodeIDAttribute(_RDFResourceNode);
        testSubject0.writeLangAttribute(_String);
        testSubject0.writeDatatypeAttribute(_IRI);
        testSubject0.writeComment(_String);
        testSubject0.writeAboutAttribute(_IRI);
        testSubject0.writeParseTypeAttribute();
        testSubject0.writeResourceAttribute(_IRI);
        testSubject0.writeOWLObject(_OWLObject);
        testSubject0.startDocument();
        testSubject0.endDocument();
    }

    private java.io.Writer _Writer;
    private java.lang.String _String;
    private org.coode.owlapi.rdf.model.RDFResourceNode _RDFResourceNode;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
