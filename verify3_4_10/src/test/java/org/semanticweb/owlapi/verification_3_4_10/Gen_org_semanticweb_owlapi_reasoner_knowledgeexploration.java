package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner_knowledgeexploration {
    @Test
    public void enforceInterfacesOWLKnowledgeExplorerReasoner() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasoner.class
                .isAssignableFrom(OWLKnowledgeExplorerReasoner.class));
    }

    public void verifyInterfaceOWLKnowledgeExplorerReasoner() throws Exception {
        OWLKnowledgeExplorerReasoner testSubject0 = mock(OWLKnowledgeExplorerReasoner.class);
        org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner.RootNode result0 = testSubject0
                .getRoot(_OWLClassExpression);
        java.util.Collection<org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner.RootNode> result1 = testSubject0
                .getObjectNeighbours(_RootNode, _OWLObjectProperty);
        org.semanticweb.owlapi.reasoner.Node<? extends org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result2 = testSubject0
                .getObjectNeighbours(_RootNode, _boolean);
        java.util.Collection<org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner.RootNode> result3 = testSubject0
                .getDataNeighbours(_RootNode, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result4 = testSubject0
                .getDataNeighbours(_RootNode, _boolean);
        org.semanticweb.owlapi.reasoner.Node<? extends org.semanticweb.owlapi.model.OWLClassExpression> result5 = testSubject0
                .getObjectLabel(_RootNode, _boolean);
        org.semanticweb.owlapi.reasoner.Node<? extends org.semanticweb.owlapi.model.OWLDataRange> result6 = testSubject0
                .getDataLabel(_RootNode, _boolean);
        org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner.RootNode result7 = testSubject0
                .getBlocker(_RootNode);
        testSubject0.interrupt();
        testSubject0.flush();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result8 = testSubject0
                .getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result9 = testSubject0
                .getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result10 = testSubject0
                .getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result13 = testSubject0
                .getObjectPropertyValues(_OWLNamedIndividual,
                        _OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result14 = testSubject0
                .getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = testSubject0
                .getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getDifferentIndividuals(_OWLNamedIndividual);
        long result17 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result18 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result19 = testSubject0
                .getIndividualNodeSetPolicy();
        org.semanticweb.owlapi.util.Version result20 = testSubject0.getReasonerVersion();
        java.lang.String result21 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.reasoner.BufferingMode result22 = testSubject0
                .getBufferingMode();
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result23 = testSubject0
                .getPendingChanges();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result24 = testSubject0
                .getPendingAxiomAdditions();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result25 = testSubject0
                .getPendingAxiomRemovals();
        org.semanticweb.owlapi.model.OWLOntology result26 = testSubject0
                .getRootOntology();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result27 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result28 = testSubject0
                .getPrecomputableInferenceTypes();
        boolean result29 = testSubject0.isConsistent();
        boolean result30 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result31 = testSubject0
                .getUnsatisfiableClasses();
        boolean result32 = testSubject0.isEntailed(_Set);
        boolean result33 = testSubject0.isEntailed(_OWLAxiom);
        boolean result34 = testSubject0.isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result35 = testSubject0
                .getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result36 = testSubject0
                .getBottomClassNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result37 = testSubject0
                .getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result38 = testSubject0
                .getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result39 = testSubject0
                .getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result40 = testSubject0
                .getSuperObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result41 = testSubject0
                .getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result42 = testSubject0
                .getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result43 = testSubject0
                .getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result44 = testSubject0
                .getObjectPropertyDomains(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result45 = testSubject0
                .getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result46 = testSubject0
                .getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result47 = testSubject0
                .getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result48 = testSubject0
                .getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result49 = testSubject0
                .getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result50 = testSubject0
                .getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result51 = testSubject0
                .getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result52 = testSubject0
                .getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result53 = testSubject0
                .getInstances(_OWLClassExpression, _boolean);
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> _Set;
    private org.semanticweb.owlapi.model.AxiomType<?> _AxiomType;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression _OWLDataPropertyExpression;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.reasoner.InferenceType _InferenceType;
    private org.semanticweb.owlapi.reasoner.InferenceType[] _InferenceType_array;
    private org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner.RootNode _RootNode;
}
