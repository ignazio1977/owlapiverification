package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.clarkparsia.owlapi.explanation.util.DefinitionTracker;
import com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor;
import com.clarkparsia.owlapi.explanation.util.OntologyUtils;
import com.clarkparsia.owlapi.explanation.util.SilentExplanationProgressMonitor;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation_util {
    @Test
    public void enforceInterfacesDefinitionTracker() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeListener.class
                .isAssignableFrom(DefinitionTracker.class));
    }

    public void verifyDefinitionTracker() throws Exception {
        DefinitionTracker testSubject0 = new DefinitionTracker(_OWLOntology);
        boolean result0 = testSubject0.isDefined(_OWLEntity);
        boolean result1 = testSubject0.isDefined(_OWLClassExpression);
        testSubject0.ontologiesChanged(_List);
    }

    public void verifyInterfaceExplanationProgressMonitor() throws Exception {
        ExplanationProgressMonitor testSubject0 = mock(ExplanationProgressMonitor.class);
        boolean result0 = testSubject0.isCancelled();
        testSubject0.foundAllExplanations();
        testSubject0.foundExplanation(_Set);
    }

    public void verifyOntologyUtils() throws Exception {
        OntologyUtils testSubject0 = new OntologyUtils();
        boolean result0 = OntologyUtils.containsUnreferencedEntity(_OWLOntology,
                _OWLClassExpression);
        OntologyUtils.addAxiom(_OWLAxiom, _Set6, _OWLOntologyManager);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result1 = OntologyUtils
                .removeAxiom(_OWLAxiom, _Set6, _OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesSilentExplanationProgressMonitor() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor.class
                .isAssignableFrom(SilentExplanationProgressMonitor.class));
    }

    public void verifySilentExplanationProgressMonitor() throws Exception {
        SilentExplanationProgressMonitor testSubject0 = new SilentExplanationProgressMonitor();
        boolean result0 = testSubject0.isCancelled();
        testSubject0.foundAllExplanations();
        testSubject0.foundExplanation(_Set);
    }

    private java.util.List<? extends org.semanticweb.owlapi.model.OWLOntologyChange> _List;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> _Set;
    private java.util.Set<org.semanticweb.owlapi.model.OWLOntology> _Set6;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLEntity _OWLEntity;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
