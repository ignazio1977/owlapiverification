package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.functional.renderer.FunctionalSyntaxObjectRenderer;
import org.semanticweb.owlapi.functional.renderer.FunctionalSyntaxStorer;
import org.semanticweb.owlapi.functional.renderer.OWLFunctionalSyntaxRenderer;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.functionalrenderer to org.semanticweb.owlapi.functional.renderer",
        "method change: OWLFunctionalSyntaxRenderer<init>: dropped manager", "method deleted: OWLFunctionalSyntaxRenderer::setOWLOntologyManager()",
        "class refactored: OWLObjectRenderer to FunctionalSyntaxObjectRenderer", "method visibility: varios write methods in FunctionalSyntaxObjectRenderer are now protected." })
public class Gen_org_coode_owlapi_functionalrenderer {
    @Test
    public void enforceInterfacesOWLFunctionalSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(FunctionalSyntaxStorer.class));
    }

    public void verifyOWLFunctionalSyntaxOntologyStorer() throws OWLOntologyStorageException {
        FunctionalSyntaxStorer testSubject0 = new FunctionalSyntaxStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(OWLFunctionalSyntaxRenderer.class));
    }

    public void verifyOWLFunctionalSyntaxRenderer() throws OWLRendererException {
        OWLFunctionalSyntaxRenderer testSubject0 = new OWLFunctionalSyntaxRenderer();
        OWLFunctionalSyntaxRenderer testSubject1 = new OWLFunctionalSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOWLObjectRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(FunctionalSyntaxObjectRenderer.class));
    }

    public void verifyOWLObjectRenderer() {
        FunctionalSyntaxObjectRenderer testSubject0 = new FunctionalSyntaxObjectRenderer(_OWLOntology, _Writer);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
    }

    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private String _String;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAxiom _OWLAxiom;
    private OWLEntity _OWLEntity;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
    private OWLPropertyExpression _OWLPropertyExpression;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.vocab.OWLXMLVocabulary _OWLXMLVocabulary;
}
