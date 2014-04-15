package org.semanticweb.owlapi.verification_4_0_0;

import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.semanticweb.owlapi.rdf.RDFRendererBase;

@SuppressWarnings({ "javadoc" })
public class Gen_org_semanticweb_owlapi_rdf {
    public void verifyRDFRendererBase() throws IOException {
        RDFRendererBase testSubject0 = mock(RDFRendererBase.class);
        testSubject0.renderAnonRoots();
        testSubject0.render(_RDFResource);
        testSubject0.render();
    }

    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
}
