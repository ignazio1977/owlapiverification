package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Collections;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;

import com.clarkparsia.owlapi.explanation.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation {
    @Test
    public void enforceInterfacesBlackBoxExplanation() {
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGeneratorImpl.class.isAssignableFrom(BlackBoxExplanation.class));
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGenerator.class.isAssignableFrom(BlackBoxExplanation.class));
    }

    public void verifyBlackBoxExplanation() {
        BlackBoxExplanation testSubject0 = new BlackBoxExplanation(_OWLOntology, _OWLReasonerFactory, _OWLReasoner);
        java.util.Set<OWLAxiom> result0 = testSubject0.getExplanation(_OWLClassExpression);
        testSubject0.dispose();
        OWLOntology result1 = testSubject0.getOntology();
        OWLOntologyManager result2 = testSubject0.getOntologyManager();
        org.semanticweb.owlapi.reasoner.OWLReasoner result3 = testSubject0.getReasoner();
        com.clarkparsia.owlapi.explanation.util.DefinitionTracker result4 = testSubject0.getDefinitionTracker();
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result5 = testSubject0.getReasonerFactory();
        testSubject0.beginTransaction();
        testSubject0.endTransaction();
    }

    @Test
    public void enforceInterfacesDefaultExplanationGenerator() {
        assertTrue(com.clarkparsia.owlapi.explanation.ExplanationGenerator.class.isAssignableFrom(DefaultExplanationGenerator.class));
    }

    public void verifyDefaultExplanationGenerator() {
        DefaultExplanationGenerator testSubject0 = new DefaultExplanationGenerator(_OWLOntologyManager, _OWLReasonerFactory, _OWLOntology, _ExplanationProgressMonitor);
        DefaultExplanationGenerator testSubject1 = new DefaultExplanationGenerator(_OWLOntologyManager, _OWLReasonerFactory, _OWLOntology, _OWLReasoner,
                _ExplanationProgressMonitor);
        java.util.Set<OWLAxiom> result0 = testSubject0.getExplanation(_OWLAxiom);
        java.util.Set<OWLAxiom> result1 = testSubject0.getExplanation(_OWLClassExpression);
        java.util.Set<java.util.Set<OWLAxiom>> result2 = testSubject0.getExplanations(_OWLAxiom, _int);
        java.util.Set<java.util.Set<OWLAxiom>> result3 = testSubject0.getExplanations(_OWLClassExpression, _int);
        java.util.Set<java.util.Set<OWLAxiom>> result4 = testSubject0.getExplanations(_OWLAxiom);
        java.util.Set<java.util.Set<OWLAxiom>> result5 = testSubject0.getExplanations(_OWLClassExpression);
    }

    @Test
    public void enforceInterfacesExplanationGenerator() {
    }

    public void verifyInterfaceExplanationGenerator() {
        ExplanationGenerator testSubject0 = mock(ExplanationGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.getExplanation(_OWLClassExpression);
        java.util.Set<java.util.Set<OWLAxiom>> result1 = testSubject0.getExplanations(_OWLClassExpression);
        java.util.Set<java.util.Set<OWLAxiom>> result2 = testSubject0.getExplanations(_OWLClassExpression, _int);
    }

    @Test
    public void enforceInterfacesHSTExplanationGenerator() {
        assertTrue(com.clarkparsia.owlapi.explanation.MultipleExplanationGenerator.class.isAssignableFrom(HSTExplanationGenerator.class));
    }

    public void verifyHSTExplanationGenerator() {
        HSTExplanationGenerator testSubject0 = new HSTExplanationGenerator(_TransactionAwareSingleExpGen);
        OWLOntology result0 = testSubject0.getOntology();
        testSubject0.setProgressMonitor(_ExplanationProgressMonitor);
        OWLOntologyManager result1 = testSubject0.getOntologyManager();
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0.getReasoner();
        java.util.Set<OWLAxiom> result3 = testSubject0.getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result4 = testSubject0.getReasonerFactory();
        java.util.Set<java.util.Set<OWLAxiom>> result5 = testSubject0.getExplanations(_OWLClassExpression, _int);
        java.util.Set<java.util.Set<OWLAxiom>> result6 = testSubject0.getExplanations(_OWLClassExpression);
        com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen result7 = testSubject0.getSingleExplanationGenerator();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesMultipleExplanationGenerator() {
        assertTrue(com.clarkparsia.owlapi.explanation.ExplanationGenerator.class.isAssignableFrom(MultipleExplanationGenerator.class));
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGenerator.class.isAssignableFrom(MultipleExplanationGenerator.class));
    }

    public void verifyInterfaceMultipleExplanationGenerator() {
        MultipleExplanationGenerator testSubject0 = mock(MultipleExplanationGenerator.class);
        testSubject0.setProgressMonitor(_ExplanationProgressMonitor);
        java.util.Set<OWLAxiom> result0 = testSubject0.getExplanation(_OWLClassExpression);
        java.util.Set<java.util.Set<OWLAxiom>> result1 = testSubject0.getExplanations(_OWLClassExpression);
        java.util.Set<java.util.Set<OWLAxiom>> result2 = testSubject0.getExplanations(_OWLClassExpression, _int);
        OWLOntology result3 = testSubject0.getOntology();
        OWLOntologyManager result4 = testSubject0.getOntologyManager();
        org.semanticweb.owlapi.reasoner.OWLReasoner result5 = testSubject0.getReasoner();
        java.util.Set<OWLAxiom> result6 = testSubject0.getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result7 = testSubject0.getReasonerFactory();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesSatisfiabilityConverter() {
    }

    public void verifySatisfiabilityConverter() {
        SatisfiabilityConverter testSubject0 = new SatisfiabilityConverter(_OWLDataFactory);
        OWLClassExpression result0 = testSubject0.convert(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesSingleExplanationGenerator() {
    }

    public void verifyInterfaceSingleExplanationGenerator() {
        SingleExplanationGenerator testSubject0 = mock(SingleExplanationGenerator.class);
        OWLOntology result0 = testSubject0.getOntology();
        OWLOntologyManager result1 = testSubject0.getOntologyManager();
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0.getReasoner();
        java.util.Set<OWLAxiom> result3 = testSubject0.getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result4 = testSubject0.getReasonerFactory();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesSingleExplanationGeneratorImpl() {
        assertTrue(com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen.class.isAssignableFrom(SingleExplanationGeneratorImpl.class));
    }

    public void verifySingleExplanationGeneratorImpl() {
        SingleExplanationGeneratorImpl testSubject0 = new SingleExplanationGeneratorImpl(_OWLOntology, _OWLReasonerFactory, _OWLReasoner) {
            @Override
            public void dispose() {
            }

            @Override
            public Set<OWLAxiom> getExplanation(OWLClassExpression unsatClass) {
                return Collections.emptySet();
            }
        };
        OWLOntology result0 = testSubject0.getOntology();
        OWLOntologyManager result1 = testSubject0.getOntologyManager();
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0.getReasoner();
        com.clarkparsia.owlapi.explanation.util.DefinitionTracker result3 = testSubject0.getDefinitionTracker();
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result4 = testSubject0.getReasonerFactory();
        testSubject0.beginTransaction();
        testSubject0.endTransaction();
        java.util.Set<OWLAxiom> result5 = testSubject0.getExplanation(_OWLClassExpression);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesTransactionAwareSingleExpGen() {
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGenerator.class.isAssignableFrom(TransactionAwareSingleExpGen.class));
    }

    public void verifyInterfaceTransactionAwareSingleExpGen() {
        TransactionAwareSingleExpGen testSubject0 = mock(TransactionAwareSingleExpGen.class);
        testSubject0.beginTransaction();
        testSubject0.endTransaction();
        OWLOntology result0 = testSubject0.getOntology();
        OWLOntologyManager result1 = testSubject0.getOntologyManager();
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0.getReasoner();
        java.util.Set<OWLAxiom> result3 = testSubject0.getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result4 = testSubject0.getReasonerFactory();
        testSubject0.dispose();
    }

    private com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen _TransactionAwareSingleExpGen;
    private com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor _ExplanationProgressMonitor;
    private int _int;
    private OWLAxiom _OWLAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataFactory _OWLDataFactory;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
    private org.semanticweb.owlapi.reasoner.OWLReasonerFactory _OWLReasonerFactory;
}
