package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasoner;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner_structural {
    @Test
    public void enforceInterfacesStructuralReasoner() {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.OWLReasonerBase.class.isAssignableFrom(StructuralReasoner.class));
    }

    public void verifyStructuralReasoner() {
        StructuralReasoner testSubject0 = new StructuralReasoner(_OWLOntology, _OWLReasonerConfiguration, _BufferingMode);
        testSubject0.interrupt();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result0 = testSubject0.getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result1 = testSubject0.getIndividualNodeSetPolicy();
        org.semanticweb.owlapi.util.Version result2 = testSubject0.getReasonerVersion();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result3 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result4 = testSubject0.getPrecomputableInferenceTypes();
        boolean result5 = testSubject0.isConsistent();
        boolean result6 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result7 = testSubject0.getUnsatisfiableClasses();
        boolean result8 = testSubject0.isEntailed(_OWLAxiom);
        boolean result9 = testSubject0.isEntailed(_Set);
        boolean result10 = testSubject0.isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result11 = testSubject0.getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result12 = testSubject0.getBottomClassNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result13 = testSubject0.getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result14 = testSubject0.getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result15 = testSubject0.getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result16 = testSubject0.getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result17 = testSubject0.getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result18 = testSubject0.getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result19 = testSubject0.getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result20 = testSubject0.getSuperObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result21 = testSubject0.getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result22 = testSubject0.getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result23 = testSubject0.getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result24 = testSubject0.getObjectPropertyDomains(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result25 = testSubject0.getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result26 = testSubject0.getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result27 = testSubject0.getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result28 = testSubject0.getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result29 = testSubject0.getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result30 = testSubject0.getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result31 = testSubject0.getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result32 = testSubject0.getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result33 = testSubject0.getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result34 = testSubject0.getInstances(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result35 = testSubject0.getObjectPropertyValues(_OWLNamedIndividual, _OWLObjectPropertyExpression);
        java.util.Set<OWLLiteral> result36 = testSubject0.getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual> result37 = testSubject0.getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result38 = testSubject0.getDifferentIndividuals(_OWLNamedIndividual);
        java.lang.String result39 = testSubject0.getReasonerName();
        testSubject0.prepareReasoner();
        testSubject0.dumpClassHierarchy(_boolean);
        testSubject0.dumpObjectPropertyHierarchy(_boolean);
        testSubject0.dumpDataPropertyHierarchy(_boolean);
        testSubject0.flush();
        long result40 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.BufferingMode result41 = testSubject0.getBufferingMode();
        java.util.List<OWLOntologyChange<?>> result42 = testSubject0.getPendingChanges();
        java.util.Set<OWLAxiom> result43 = testSubject0.getPendingAxiomAdditions();
        java.util.Set<OWLAxiom> result44 = testSubject0.getPendingAxiomRemovals();
        OWLOntology result45 = testSubject0.getRootOntology();
        OWLDataFactory result46 = testSubject0.getOWLDataFactory();
        testSubject0.dispose();
        org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration result47 = testSubject0.getReasonerConfiguration();
        java.util.Collection<OWLAxiom> result48 = testSubject0.getReasonerAxioms();
    }

    @Test
    public void enforceInterfacesStructuralReasonerFactory() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerFactory.class.isAssignableFrom(StructuralReasonerFactory.class));
    }

    public void verifyStructuralReasonerFactory() {
        StructuralReasonerFactory testSubject0 = new StructuralReasonerFactory();
        java.lang.String result0 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0.createReasoner(_OWLOntology);
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0.createReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result3 = testSubject0.createNonBufferingReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result4 = testSubject0.createNonBufferingReasoner(_OWLOntology);
    }

    private boolean _boolean;
    private java.util.Set<? extends OWLAxiom> _Set;
    private AxiomType<?> _AxiomType;
    private OWLAxiom _OWLAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.reasoner.BufferingMode _BufferingMode;
    private org.semanticweb.owlapi.reasoner.InferenceType _InferenceType;
    private org.semanticweb.owlapi.reasoner.InferenceType[] _InferenceType_array;
    private org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration _OWLReasonerConfiguration;
}
