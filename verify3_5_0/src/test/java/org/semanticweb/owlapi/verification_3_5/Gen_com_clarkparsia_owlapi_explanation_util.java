package org.semanticweb.owlapi.verification_3_5;

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

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_util {
    @Test
    public void enforceInterfacesDefinitionTracker() {
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(DefinitionTracker.class));
    }

    public void verifyDefinitionTracker() throws OWLException {
        DefinitionTracker testSubject0 = new DefinitionTracker(_OWLOntology);
        boolean result0 = testSubject0.isDefined(_OWLEntity);
        boolean result1 = testSubject0.isDefined(_OWLClassExpression);
        testSubject0.ontologiesChanged(_List);
    }

    public void verifyInterfaceExplanationProgressMonitor() {
        ExplanationProgressMonitor testSubject0 = mock(ExplanationProgressMonitor.class);
        boolean result0 = testSubject0.isCancelled();
        testSubject0.foundAllExplanations();
        testSubject0.foundExplanation(_Set);
    }

    public void verifyOntologyUtils() {
        OntologyUtils testSubject0 = new OntologyUtils();
        boolean result0 = OntologyUtils.containsUnreferencedEntity(_OWLOntology, _OWLClassExpression);
        OntologyUtils.addAxiom(_OWLAxiom, _Set6, _OWLOntologyManager);
        java.util.Set<OWLOntology> result1 = OntologyUtils.removeAxiom(_OWLAxiom, _Set6, _OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesSilentExplanationProgressMonitor() {
        assertTrue(com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor.class.isAssignableFrom(SilentExplanationProgressMonitor.class));
    }

    public void verifySilentExplanationProgressMonitor() {
        SilentExplanationProgressMonitor testSubject0 = new SilentExplanationProgressMonitor();
        boolean result0 = testSubject0.isCancelled();
        testSubject0.foundAllExplanations();
        testSubject0.foundExplanation(_Set);
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
