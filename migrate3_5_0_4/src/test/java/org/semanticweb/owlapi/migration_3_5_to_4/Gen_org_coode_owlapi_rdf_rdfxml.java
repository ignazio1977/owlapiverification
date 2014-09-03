package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.semanticweb.owlapi.rdf.RDFRendererBase;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.rdf.rdfxml to org.semanticweb.owlapi.rdf.rdfxml.renderer", "method change: RDFXMLNamespaceManager<init> : dropped manager",
        "method change: RDFXMLNamespaceManager::getPrefixes() : return type is Iterable", "method change: RDFXMLNamespaceManager::getNamespaces() : return type is Iterable",
        "method deleted: RDFXMLNamespaceManager::getPrefixNamespaceMap()", "method change: RDFXMLRenderer<init> : dropped manager",
        "method deleted: RDFXMLRenderer::getOntology()", "method deleted: RDFXMLRenderer::getGraph()", })
public class Gen_org_coode_owlapi_rdf_rdfxml {
    @Test
    public void enforceInterfacesRDFXMLNamespaceManager() {
        assertTrue(OWLOntologyXMLNamespaceManager.class.isAssignableFrom(RDFXMLNamespaceManager.class));
    }

    public void verifyRDFXMLNamespaceManager() {
        RDFXMLNamespaceManager testSubject0 = new RDFXMLNamespaceManager(_OWLOntology, _OWLOntologyFormat);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntitiesWithInvalidQNames();
        String result1 = testSubject0.getQName(_String);
        testSubject0.setPrefix(_String, _String);
        String result2 = testSubject0.getDefaultPrefix();
        testSubject0.addWellKnownNamespace(_String, _String);
        String result3 = testSubject0.getPrefixForNamespace(_String);
        testSubject0.setDefaultNamespace(_String);
        String result4 = testSubject0.getNamespaceForPrefix(_String);
        testSubject0.createPrefixForNamespace(_String);
        String result5 = testSubject0.getDefaultNamespace();
        Iterable<String> result6 = testSubject0.getPrefixes();
        Iterable<String> result7 = testSubject0.getNamespaces();
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
        assertTrue(RDFRendererBase.class.isAssignableFrom(RDFXMLRenderer.class));
    }

    public void verifyRDFXMLRenderer() throws IOException {
        RDFXMLRenderer testSubject0 = new RDFXMLRenderer(_OWLOntology, _Writer, _OWLOntologyFormat);
        RDFXMLRenderer testSubject2 = new RDFXMLRenderer(_OWLOntology, _Writer);
        testSubject0.render(_RDFResourceNode);
        java.util.Set<OWLEntity> result0 = testSubject0.getUnserialisableEntities();
        testSubject0.render();
        testSubject0.renderAnonRoots();
    }

    public void verifyRDFXMLWriter() throws IOException {
        RDFXMLWriter testSubject0 = new RDFXMLWriter(mock(XMLWriter.class)) {
        };
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
    private RDFResource _RDFResourceNode;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
}
