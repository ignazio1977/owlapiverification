package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.semanticweb.owlapi.rdf.RDFRendererBase;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.RDFResource;

@SuppressWarnings({ "javadoc", "null" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.rdf.renderer to org.semanticweb.owlapi.rdf", "method deleted : RDFRendererBase::getOntology()",
        "method deleted : RDFRendererBase::getGraph()", })
public class Gen_org_coode_owlapi_rdf_renderer {
    public void verifyRDFRendererBase() throws IOException {
        RDFRendererBase testSubject0 = mock(RDFRendererBase.class);
        testSubject0.render();
        testSubject0.render(_RDFResourceNode);
        testSubject0.renderAnonRoots();
    }

    private RDFResource _RDFResourceNode;
}
