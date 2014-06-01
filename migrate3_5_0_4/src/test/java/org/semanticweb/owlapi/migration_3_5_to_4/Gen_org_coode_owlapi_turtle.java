package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.coode.owlapi.turtle.TurtleOntologyFormat;
import org.coode.owlapi.turtle.TurtleOntologyStorer;
import org.coode.owlapi.turtle.TurtleRenderer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.RDFOntologyFormat;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_turtle {

    @Test
    public void enforceInterfacesTurtleOntologyFormat()  {
        assertTrue(org.semanticweb.owlapi.io.RDFOntologyFormat.class
                .isAssignableFrom(TurtleOntologyFormat.class));
    }

    public void verifyTurtleOntologyFormat()  {
        TurtleOntologyFormat testSubject0 = new TurtleOntologyFormat();
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity,
                _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result5 = testSubject0.getPrefixNames();
        String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        String result8 = testSubject0.getDefaultPrefix();
        String result9 = testSubject0.getPrefixIRI(_IRI);
        IRI result10 = testSubject0
                .getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesTurtleOntologyStorer()  {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(TurtleOntologyStorer.class));
    }

    public void verifyTurtleOntologyStorer()  {
        TurtleOntologyStorer testSubject0 = new TurtleOntologyStorer();
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
    public void enforceInterfacesTurtleRenderer()  {
        assertTrue(org.coode.owlapi.rdf.renderer.RDFRendererBase.class
                .isAssignableFrom(TurtleRenderer.class));
    }

    public void verifyTurtleRenderer()  {
        TurtleRenderer testSubject0 = new TurtleRenderer(_OWLOntology,
                _OWLOntologyManager, _Writer, _OWLOntologyFormat);
        TurtleRenderer testSubject1 = new TurtleRenderer(_OWLOntology, _Writer,
                _OWLOntologyFormat);
        testSubject0.render(_RDFResourceNode);
        testSubject0.render();
        OWLOntology result0 = testSubject0
                .getOntology();
        org.coode.owlapi.rdf.model.RDFGraph result1 = testSubject0.getGraph();
        testSubject0.renderAnonRoots();
    }

    private boolean _boolean;
    private java.io.Writer _Writer;
    private Object _Object;
    private String _String;
    private org.coode.owlapi.rdf.model.RDFResourceNode _RDFResourceNode;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.io.RDFResourceParseError _RDFResourceParseError;
    private IRI _IRI;
    private OWLEntity _OWLEntity;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
    private PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat _PrefixOWLOntologyFormat;
}
