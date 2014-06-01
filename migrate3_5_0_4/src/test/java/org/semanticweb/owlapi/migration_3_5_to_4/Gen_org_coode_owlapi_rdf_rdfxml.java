package org.semanticweb.owlapi.migration_3_5_to_4;

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
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_rdf_rdfxml {

    @Test
    public void enforceInterfacesRDFXMLNamespaceManager()  {
        assertTrue(org.coode.xml.OWLOntologyXMLNamespaceManager.class
                .isAssignableFrom(RDFXMLNamespaceManager.class));
    }

    public void verifyRDFXMLNamespaceManager()  {
        RDFXMLNamespaceManager testSubject0 = new RDFXMLNamespaceManager(
                _OWLOntologyManager, _OWLOntology);
        RDFXMLNamespaceManager testSubject1 = new RDFXMLNamespaceManager(
                _OWLOntology, _OWLOntologyFormat);
        java.util.Set<OWLEntity> result0 = testSubject0
                .getEntitiesWithInvalidQNames();
        String result1 = testSubject0.getQName(_String);
        testSubject0.setPrefix(_String, _String);
        String result2 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        String result3 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        String result4 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        String result5 = testSubject0.getDefaultNamespace();
        java.util.Set<String> result6 = testSubject0.getPrefixes();
        java.util.Set<String> result7 = testSubject0.getNamespaces();
        java.util.Map<String, String> result8 = testSubject0
                .getPrefixNamespaceMap();
    }

    @Test
    public void enforceInterfacesRDFXMLOntologyStorer()  {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(RDFXMLOntologyStorer.class));
    }

    public void verifyRDFXMLOntologyStorer()  {
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
    public void enforceInterfacesRDFXMLRenderer()  {
        assertTrue(org.coode.owlapi.rdf.renderer.RDFRendererBase.class
                .isAssignableFrom(RDFXMLRenderer.class));
    }

    public void verifyRDFXMLRenderer()  {
        RDFXMLRenderer testSubject0 = new RDFXMLRenderer(_OWLOntology, _Writer,
                _OWLOntologyFormat);
        RDFXMLRenderer testSubject1 = new RDFXMLRenderer(_OWLOntologyManager,
                _OWLOntology, _Writer, _OWLOntologyFormat);
        RDFXMLRenderer testSubject2 = new RDFXMLRenderer(_OWLOntology, _Writer);
        RDFXMLRenderer testSubject3 = new RDFXMLRenderer(_OWLOntologyManager,
                _OWLOntology, _Writer);
        testSubject0.render(_RDFResourceNode);
        java.util.Set<OWLEntity> result0 = testSubject0
                .getUnserialisableEntities();
        testSubject0.render();
        OWLOntology result1 = testSubject0
                .getOntology();
        org.coode.owlapi.rdf.model.RDFGraph result2 = testSubject0.getGraph();
        testSubject0.renderAnonRoots();
    }

    public void verifyRDFXMLWriter()  {
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
    private String _String;
    private org.coode.owlapi.rdf.model.RDFResourceNode _RDFResourceNode;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
}
