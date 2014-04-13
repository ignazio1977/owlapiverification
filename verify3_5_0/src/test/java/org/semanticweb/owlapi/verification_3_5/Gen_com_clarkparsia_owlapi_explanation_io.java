package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.clarkparsia.owlapi.explanation.io.ConciseExplanationRenderer;
import com.clarkparsia.owlapi.explanation.io.ExplanationRenderer;
import com.clarkparsia.owlapi.explanation.io.SilentExplanationRenderer;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_io {
    @Test
    public void enforceInterfacesConciseExplanationRenderer() {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class
                .isAssignableFrom(ConciseExplanationRenderer.class));
    }

    public void verifyConciseExplanationRenderer() {
        ConciseExplanationRenderer testSubject0 = new ConciseExplanationRenderer();
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    public void verifyInterfaceExplanationRenderer() {
        ExplanationRenderer testSubject0 = mock(ExplanationRenderer.class);
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSilentExplanationRenderer() {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class
                .isAssignableFrom(SilentExplanationRenderer.class));
    }

    public void verifySilentExplanationRenderer() {
        SilentExplanationRenderer testSubject0 = new SilentExplanationRenderer();
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    private java.io.Writer _Writer;
    private java.util.Set<java.util.Set<OWLAxiom>> _Set;
    private OWLAxiom _OWLAxiom;
}
