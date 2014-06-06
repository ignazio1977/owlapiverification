package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.semanticweb.owlapi.rdf.RDFRendererBase;

import org.semanticweb.owlapi.rdf.turtle.renderer.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.formats.*;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: org.coode.owlapi.turtle to org.semanticweb.owlapi.rdf.turtle.renderer", "Package change: All OWLOntologyFormats to org.semanticweb.owlapi.formats",
        "method arguments: TurtleRenderer<init> : dropped manager", "method removed: TurtleRenderer::getOntology()", "method removed: TurtleRenderer::getGraph()",
        "class refactored: RDFResourceNode to RDFResource" })
public class Gen_org_coode_owlapi_turtle {
    @Test
    public void enforceInterfacesTurtleOntologyFormat() {
        assertTrue(RDFOntologyFormat.class.isAssignableFrom(TurtleOntologyFormat.class));
    }

    public void verifyTurtleOntologyFormat() {
        TurtleOntologyFormat testSubject0 = new TurtleOntologyFormat();
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0.getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0.getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity, _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result4 = testSubject0.getPrefixName2PrefixMap();
        java.util.Set<String> result5 = testSubject0.getPrefixNames();
        String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        String result8 = testSubject0.getDefaultPrefix();
        String result9 = testSubject0.getPrefixIRI(_IRI);
        IRI result10 = testSubject0.getIRI(_String);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixOWLOntologyFormat result13 = testSubject0.asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesTurtleOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(TurtleOntologyStorer.class));
    }

    public void verifyTurtleOntologyStorer() throws OWLOntologyStorageException {
        TurtleOntologyStorer testSubject0 = new TurtleOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesTurtleRenderer() {
        assertTrue(RDFRendererBase.class.isAssignableFrom(TurtleRenderer.class));
    }

    public void verifyTurtleRenderer() throws IOException {
        TurtleRenderer testSubject0 = new TurtleRenderer(_OWLOntology, _Writer, _OWLOntologyFormat);
        testSubject0.render(_RDFResourceNode);
        testSubject0.render();
        testSubject0.renderAnonRoots();
    }

    private boolean _boolean;
    private java.io.Writer _Writer;
    private String _String;
    private RDFResource _RDFResourceNode;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.io.RDFResourceParseError _RDFResourceParseError;
    private IRI _IRI;
    private OWLEntity _OWLEntity;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private PrefixOWLOntologyFormat _PrefixOWLOntologyFormat;
}
