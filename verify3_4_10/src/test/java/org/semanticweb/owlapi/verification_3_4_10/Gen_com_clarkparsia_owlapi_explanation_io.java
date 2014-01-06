package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.clarkparsia.owlapi.explanation.io.ConciseExplanationRenderer;
import com.clarkparsia.owlapi.explanation.io.ExplanationRenderer;
import com.clarkparsia.owlapi.explanation.io.SilentExplanationRenderer;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_io {
    @Test
    public void enforceInterfacesConciseExplanationRenderer() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class
                .isAssignableFrom(ConciseExplanationRenderer.class));
    }

    public void verifyConciseExplanationRenderer() throws Exception {
        ConciseExplanationRenderer testSubject0 = new ConciseExplanationRenderer();
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    public void verifyInterfaceExplanationRenderer() throws Exception {
        ExplanationRenderer testSubject0 = mock(ExplanationRenderer.class);
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSilentExplanationRenderer() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class
                .isAssignableFrom(SilentExplanationRenderer.class));
    }

    public void verifySilentExplanationRenderer() throws Exception {
        SilentExplanationRenderer testSubject0 = new SilentExplanationRenderer();
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
        testSubject0.render(_OWLAxiom, _Set);
    }

    private java.io.Writer _Writer;
    private java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> _Set;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
}
