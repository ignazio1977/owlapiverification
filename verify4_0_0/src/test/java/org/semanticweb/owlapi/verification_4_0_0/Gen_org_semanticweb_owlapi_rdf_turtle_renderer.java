package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.rdf.turtle.renderer.TurtleStorer;
import org.semanticweb.owlapi.rdf.turtle.renderer.TurtleRenderer;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rdf_turtle_renderer {
    @Test
    public void enforceInterfacesTurtleOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(TurtleStorer.class));
    }

    public void verifyTurtleOntologyStorer() throws OWLOntologyStorageException {
        TurtleStorer testSubject0 = new TurtleStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesTurtleRenderer() {
        assertTrue(org.semanticweb.owlapi.rdf.RDFRendererBase.class.isAssignableFrom(TurtleRenderer.class));
    }

    public void verifyTurtleRenderer() throws IOException {
        TurtleRenderer testSubject0 = new TurtleRenderer(_OWLOntology, _Writer, _OWLOntologyFormat);
        testSubject0.render(_RDFResource);
        testSubject0.renderAnonRoots();
        testSubject0.render();
    }

    private java.io.Writer _Writer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
}
