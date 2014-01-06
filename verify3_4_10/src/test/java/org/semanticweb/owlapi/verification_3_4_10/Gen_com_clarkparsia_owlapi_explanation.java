package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;

import com.clarkparsia.owlapi.explanation.BlackBoxExplanation;
import com.clarkparsia.owlapi.explanation.DefaultExplanationGenerator;
import com.clarkparsia.owlapi.explanation.ExplanationGenerator;
import com.clarkparsia.owlapi.explanation.HSTExplanationGenerator;
import com.clarkparsia.owlapi.explanation.MultipleExplanationGenerator;
import com.clarkparsia.owlapi.explanation.SatisfiabilityConverter;
import com.clarkparsia.owlapi.explanation.SingleExplanationGenerator;
import com.clarkparsia.owlapi.explanation.SingleExplanationGeneratorImpl;
import com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_explanation {
    @Test
    public void enforceInterfacesBlackBoxExplanation() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGeneratorImpl.class
                .isAssignableFrom(BlackBoxExplanation.class));
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGenerator.class
                .isAssignableFrom(BlackBoxExplanation.class));
    }

    public void verifyBlackBoxExplanation() throws Exception {
        BlackBoxExplanation testSubject0 = new BlackBoxExplanation(_OWLOntology,
                _OWLReasonerFactory, _OWLReasoner);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getExplanation(_OWLClassExpression);
        testSubject0.dispose();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.getOntology();
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0.getReasoner();
        com.clarkparsia.owlapi.explanation.util.DefinitionTracker result3 = testSubject0
                .getDefinitionTracker();
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result4 = testSubject0
                .getReasonerFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result5 = testSubject0
                .getOntologyManager();
        testSubject0.beginTransaction();
        testSubject0.endTransaction();
    }

    @Test
    public void enforceInterfacesDefaultExplanationGenerator() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.ExplanationGenerator.class
                .isAssignableFrom(DefaultExplanationGenerator.class));
    }

    public void verifyDefaultExplanationGenerator() throws Exception {
        DefaultExplanationGenerator testSubject0 = new DefaultExplanationGenerator(
                _OWLOntologyManager, _OWLReasonerFactory, _OWLOntology,
                _ExplanationProgressMonitor);
        DefaultExplanationGenerator testSubject1 = new DefaultExplanationGenerator(
                _OWLOntologyManager, _OWLReasonerFactory, _OWLOntology, _OWLReasoner,
                _ExplanationProgressMonitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getExplanation(_OWLAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result1 = testSubject0
                .getExplanation(_OWLClassExpression);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result2 = testSubject0
                .getExplanations(_OWLAxiom, _int);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result3 = testSubject0
                .getExplanations(_OWLClassExpression, _int);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result4 = testSubject0
                .getExplanations(_OWLAxiom);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result5 = testSubject0
                .getExplanations(_OWLClassExpression);
    }

    public void verifyInterfaceExplanationGenerator() throws Exception {
        ExplanationGenerator testSubject0 = mock(ExplanationGenerator.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getExplanation(_OWLClassExpression);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result1 = testSubject0
                .getExplanations(_OWLClassExpression);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result2 = testSubject0
                .getExplanations(_OWLClassExpression, _int);
    }

    @Test
    public void enforceInterfacesHSTExplanationGenerator() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.MultipleExplanationGenerator.class
                .isAssignableFrom(HSTExplanationGenerator.class));
    }

    public void verifyHSTExplanationGenerator() throws Exception {
        HSTExplanationGenerator testSubject0 = new HSTExplanationGenerator(
                _TransactionAwareSingleExpGen);
        testSubject0.setProgressMonitor(_ExplanationProgressMonitor);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOntology();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0.getReasoner();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result2 = testSubject0
                .getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result3 = testSubject0
                .getReasonerFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getOntologyManager();
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result5 = testSubject0
                .getExplanations(_OWLClassExpression);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result6 = testSubject0
                .getExplanations(_OWLClassExpression, _int);
        com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen result7 = testSubject0
                .getSingleExplanationGenerator();
    }

    @Test
    public void enforceInterfacesMultipleExplanationGenerator() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.ExplanationGenerator.class
                .isAssignableFrom(MultipleExplanationGenerator.class));
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGenerator.class
                .isAssignableFrom(MultipleExplanationGenerator.class));
    }

    public void verifyInterfaceMultipleExplanationGenerator() throws Exception {
        MultipleExplanationGenerator testSubject0 = mock(MultipleExplanationGenerator.class);
        testSubject0.setProgressMonitor(_ExplanationProgressMonitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getExplanation(_OWLClassExpression);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result1 = testSubject0
                .getExplanations(_OWLClassExpression);
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result2 = testSubject0
                .getExplanations(_OWLClassExpression, _int);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0.getOntology();
        org.semanticweb.owlapi.reasoner.OWLReasoner result4 = testSubject0.getReasoner();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result5 = testSubject0
                .getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result6 = testSubject0
                .getReasonerFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result7 = testSubject0
                .getOntologyManager();
    }

    public void verifySatisfiabilityConverter() throws Exception {
        SatisfiabilityConverter testSubject0 = new SatisfiabilityConverter(
                _OWLDataFactory);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .convert(_OWLAxiom);
    }

    public void verifyInterfaceSingleExplanationGenerator() throws Exception {
        SingleExplanationGenerator testSubject0 = mock(SingleExplanationGenerator.class);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOntology();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0.getReasoner();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result2 = testSubject0
                .getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result3 = testSubject0
                .getReasonerFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getOntologyManager();
    }

    @Test
    public void enforceInterfacesSingleExplanationGeneratorImpl() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen.class
                .isAssignableFrom(SingleExplanationGeneratorImpl.class));
    }

    public void verifySingleExplanationGeneratorImpl() throws Exception {
        SingleExplanationGeneratorImpl testSubject0 = new SingleExplanationGeneratorImpl(
                _OWLOntology, _OWLReasonerFactory, _OWLReasoner) {
            @Override
            public Set<OWLAxiom> getExplanation(OWLClassExpression unsatClass) {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOntology();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0.getReasoner();
        com.clarkparsia.owlapi.explanation.util.DefinitionTracker result2 = testSubject0
                .getDefinitionTracker();
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result3 = testSubject0
                .getReasonerFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getOntologyManager();
        testSubject0.beginTransaction();
        testSubject0.endTransaction();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result5 = testSubject0
                .getExplanation(_OWLClassExpression);
    }

    @Test
    public void enforceInterfacesTransactionAwareSingleExpGen() throws Exception {
        assertTrue(com.clarkparsia.owlapi.explanation.SingleExplanationGenerator.class
                .isAssignableFrom(TransactionAwareSingleExpGen.class));
    }

    public void verifyInterfaceTransactionAwareSingleExpGen() throws Exception {
        TransactionAwareSingleExpGen testSubject0 = mock(TransactionAwareSingleExpGen.class);
        testSubject0.beginTransaction();
        testSubject0.endTransaction();
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOntology();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0.getReasoner();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result2 = testSubject0
                .getExplanation(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.OWLReasonerFactory result3 = testSubject0
                .getReasonerFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getOntologyManager();
    }

    private com.clarkparsia.owlapi.explanation.TransactionAwareSingleExpGen _TransactionAwareSingleExpGen;
    private com.clarkparsia.owlapi.explanation.util.ExplanationProgressMonitor _ExplanationProgressMonitor;
    private int _int;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
    private org.semanticweb.owlapi.reasoner.OWLReasonerFactory _OWLReasonerFactory;
}
