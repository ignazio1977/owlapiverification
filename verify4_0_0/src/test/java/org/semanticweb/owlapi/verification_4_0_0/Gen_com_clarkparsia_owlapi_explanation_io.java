package org.semanticweb.owlapi.verification_4_0_0;

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

@SuppressWarnings({ "javadoc", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_io {
    @Test
    public void enforceInterfacesConciseExplanationRenderer() {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class.isAssignableFrom(ConciseExplanationRenderer.class));
    }

    public void verifyConciseExplanationRenderer() {
        ConciseExplanationRenderer testSubject0 = new ConciseExplanationRenderer();
        testSubject0.render(_OWLAxiom, _Set);
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
    }

    public void verifyInterfaceExplanationRenderer() throws OWLException, IOException {
        ExplanationRenderer testSubject0 = mock(ExplanationRenderer.class);
        testSubject0.render(_OWLAxiom, _Set);
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
    }

    @Test
    public void enforceInterfacesSilentExplanationRenderer() {
        assertTrue(com.clarkparsia.owlapi.explanation.io.ExplanationRenderer.class.isAssignableFrom(SilentExplanationRenderer.class));
    }

    public void verifySilentExplanationRenderer() {
        SilentExplanationRenderer testSubject0 = new SilentExplanationRenderer();
        testSubject0.render(_OWLAxiom, _Set);
        testSubject0.startRendering(_Writer);
        testSubject0.endRendering();
    }

    private java.io.Writer _Writer;
    private java.util.Set<java.util.Set<OWLAxiom>> _Set;
    private OWLAxiom _OWLAxiom;
}
