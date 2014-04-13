package org.semanticweb.owlapi.verification_4_0_0;

import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.rdf.RDFRendererBase;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rdf {
    @Test
    public void enforceInterfacesRDFRendererBase() {
    }

    public void verifyRDFRendererBase() throws IOException {
        RDFRendererBase testSubject0 = mock(RDFRendererBase.class);
        testSubject0.renderAnonRoots();
        testSubject0.render(_RDFResource);
        testSubject0.render();
    }

    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
}
