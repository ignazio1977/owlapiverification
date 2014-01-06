package org.semanticweb.owlapi.verification_3_4_10;

import java.io.IOException;

import org.coode.owlapi.rdf.model.RDFResourceNode;
import org.coode.owlapi.rdf.renderer.RDFRendererBase;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_coode_owlapi_rdf_renderer {
    public void verifyRDFRendererBase() throws Exception {
        RDFRendererBase testSubject0 = new RDFRendererBase(_OWLOntology,
                _OWLOntologyManager) {
            @Override
            protected void beginDocument() throws IOException {}

            @Override
            protected void endDocument() throws IOException {}

            @Override
            protected void writeAnnotationPropertyComment(OWLAnnotationProperty prop)
                    throws IOException {}

            @Override
            protected void writeDataPropertyComment(OWLDataProperty prop)
                    throws IOException {}

            @Override
            protected void writeObjectPropertyComment(OWLObjectProperty prop)
                    throws IOException {}

            @Override
            protected void writeClassComment(OWLClass cls) throws IOException {}

            @Override
            protected void writeDatatypeComment(OWLDatatype datatype) throws IOException {}

            @Override
            protected void writeIndividualComments(OWLNamedIndividual ind)
                    throws IOException {}

            @Override
            protected void writeBanner(String name) throws IOException {}

            @Override
            public void render(RDFResourceNode node) throws IOException {}
        };
        RDFRendererBase testSubject1 = new RDFRendererBase(_OWLOntology) {
            @Override
            protected void beginDocument() throws IOException {}

            @Override
            protected void endDocument() throws IOException {}

            @Override
            protected void writeAnnotationPropertyComment(OWLAnnotationProperty prop)
                    throws IOException {}

            @Override
            protected void writeDataPropertyComment(OWLDataProperty prop)
                    throws IOException {}

            @Override
            protected void writeObjectPropertyComment(OWLObjectProperty prop)
                    throws IOException {}

            @Override
            protected void writeClassComment(OWLClass cls) throws IOException {}

            @Override
            protected void writeDatatypeComment(OWLDatatype datatype) throws IOException {}

            @Override
            protected void writeIndividualComments(OWLNamedIndividual ind)
                    throws IOException {}

            @Override
            protected void writeBanner(String name) throws IOException {}

            @Override
            public void render(RDFResourceNode node) throws IOException {}
        };
        testSubject0.render();
        testSubject0.render(_RDFResourceNode);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOntology();
        org.coode.owlapi.rdf.model.RDFGraph result1 = testSubject0.getGraph();
        testSubject0.renderAnonRoots();
    }

    private org.coode.owlapi.rdf.model.RDFResourceNode _RDFResourceNode;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
