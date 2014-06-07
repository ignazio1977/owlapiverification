package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLException;

import com.clarkparsia.owlapi.explanation.io.ConciseExplanationRenderer;
import com.clarkparsia.owlapi.explanation.io.ExplanationRenderer;
import com.clarkparsia.owlapi.explanation.io.SilentExplanationRenderer;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_io {
    @Test
    public void enforceInterfacesConciseExplanationRenderer() {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class.isAssignableFrom(ConciseExplanationRenderer.class));
    }

    public void verifyConciseExplanationRenderer() throws OWLException, IOException {
        ConciseExplanationRenderer testSubject0 = new ConciseExplanationRenderer();
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    public void verifyInterfaceExplanationRenderer() throws OWLException, IOException {
        ExplanationRenderer testSubject0 = mock(ExplanationRenderer.class);
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSilentExplanationRenderer() {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class.isAssignableFrom(SilentExplanationRenderer.class));
    }

    public void verifySilentExplanationRenderer() throws OWLException, IOException {
        SilentExplanationRenderer testSubject0 = new SilentExplanationRenderer();
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    private java.io.Writer _Writer;
    private java.util.Set<java.util.Set<OWLAxiom>> _Set;
    private OWLAxiom _OWLAxiom;
}
