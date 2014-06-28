package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;

import com.clarkparsia.owlapi.explanation.util.DefinitionTracker;
import com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor;
import com.clarkparsia.owlapi.explanation.util.OntologyUtils;
import com.clarkparsia.owlapi.explanation.util.SilentExplanationProgressMonitor;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_util {
    @Test
    public void enforceInterfacesDefinitionTracker() {
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(DefinitionTracker.class));
    }

    public void verifyDefinitionTracker() {
        DefinitionTracker testSubject0 = new DefinitionTracker(_OWLOntology);
        boolean result0 = testSubject0.isDefined(_OWLClassExpression);
        boolean result1 = testSubject0.isDefined(_OWLEntity);
        testSubject0.ontologiesChanged(_List);
    }

    public void verifyInterfaceExplanationProgressMonitor() {
        ExplanationProgressMonitor testSubject0 = mock(ExplanationProgressMonitor.class);
        testSubject0.foundAllExplanations();
        testSubject0.foundExplanation(_Set);
        boolean result0 = testSubject0.isCancelled();
    }

    public void verifyOntologyUtils() {
        OntologyUtils.addAxiom(_OWLAxiom, _Set6, _OWLOntologyManager);
        java.util.Set<OWLOntology> result0 = OntologyUtils.removeAxiom(_OWLAxiom, _Set6, _OWLOntologyManager);
        boolean result1 = OntologyUtils.containsUnreferencedEntity(_OWLOntology, _OWLClassExpression);
    }

    @Test
    public void enforceInterfacesSilentExplanationProgressMonitor() {
        assertTrue(com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor.class.isAssignableFrom(SilentExplanationProgressMonitor.class));
    }

    public void verifySilentExplanationProgressMonitor() {
        SilentExplanationProgressMonitor testSubject0 = new SilentExplanationProgressMonitor();
        testSubject0.foundAllExplanations();
        testSubject0.foundExplanation(_Set);
        boolean result0 = testSubject0.isCancelled();
    }

    private java.util.List<? extends OWLOntologyChange> _List;
    private java.util.Set<OWLAxiom> _Set;
    private java.util.Set<OWLOntology> _Set6;
    private OWLAxiom _OWLAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLEntity _OWLEntity;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
}
