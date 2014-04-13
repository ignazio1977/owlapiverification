package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasoner;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner_structural {

    @Test
    public void enforceInterfacesStructuralReasoner()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.OWLReasonerBase.class
                .isAssignableFrom(StructuralReasoner.class));
    }

    public void verifyStructuralReasoner()  {
        StructuralReasoner testSubject0 = new StructuralReasoner(_OWLOntology,
                _OWLReasonerConfiguration, _BufferingMode);
        testSubject0.interrupt();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result0 = testSubject0
                .getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result1 = testSubject0
                .getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result2 = testSubject0
                .getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result3 = testSubject0
                .getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result4 = testSubject0
                .getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result5 = testSubject0
                .getObjectPropertyValues(_OWLNamedIndividual,
                        _OWLObjectPropertyExpression);
        java.util.Set<OWLLiteral> result6 = testSubject0
                .getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual> result7 = testSubject0
                .getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result8 = testSubject0
                .getDifferentIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result9 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result10 = testSubject0
                .getIndividualNodeSetPolicy();
        org.semanticweb.owlapi.util.Version result11 = testSubject0
                .getReasonerVersion();
        String result12 = testSubject0.getReasonerName();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result13 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result14 = testSubject0
                .getPrecomputableInferenceTypes();
        boolean result15 = testSubject0.isConsistent();
        boolean result16 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result17 = testSubject0
                .getUnsatisfiableClasses();
        boolean result18 = testSubject0.isEntailed(_Set);
        boolean result19 = testSubject0.isEntailed(_OWLAxiom);
        boolean result20 = testSubject0
                .isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result21 = testSubject0
                .getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result22 = testSubject0
                .getBottomClassNode();
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result23 = testSubject0
                .getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result24 = testSubject0
                .getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result25 = testSubject0
                .getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result26 = testSubject0
                .getSuperObjectProperties(_OWLObjectPropertyExpression,
                        _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result27 = testSubject0
                .getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result28 = testSubject0
                .getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result29 = testSubject0
                .getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result30 = testSubject0
                .getObjectPropertyDomains(_OWLObjectPropertyExpression,
                        _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result31 = testSubject0
                .getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result32 = testSubject0
                .getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result33 = testSubject0
                .getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result34 = testSubject0
                .getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result35 = testSubject0
                .getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result36 = testSubject0
                .getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result37 = testSubject0
                .getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result38 = testSubject0
                .getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result39 = testSubject0
                .getInstances(_OWLClassExpression, _boolean);
        testSubject0.prepareReasoner();
        testSubject0.dumpClassHierarchy(_boolean);
        testSubject0.dumpObjectPropertyHierarchy(_boolean);
        testSubject0.dumpDataPropertyHierarchy(_boolean);
        testSubject0.flush();
        long result40 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.BufferingMode result41 = testSubject0
                .getBufferingMode();
        java.util.List<OWLOntologyChange> result42 = testSubject0
                .getPendingChanges();
        java.util.Set<OWLAxiom> result43 = testSubject0
                .getPendingAxiomAdditions();
        java.util.Set<OWLAxiom> result44 = testSubject0
                .getPendingAxiomRemovals();
        OWLOntology result45 = testSubject0
                .getRootOntology();
        org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration result46 = testSubject0
                .getReasonerConfiguration();
        java.util.Collection<OWLAxiom> result47 = testSubject0
                .getReasonerAxioms();
        OWLDataFactory result48 = testSubject0
                .getOWLDataFactory();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesStructuralReasonerFactory()  {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerFactory.class
                .isAssignableFrom(StructuralReasonerFactory.class));
    }

    public void verifyStructuralReasonerFactory()  {
        StructuralReasonerFactory testSubject0 = new StructuralReasonerFactory();
        String result0 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0
                .createNonBufferingReasoner(_OWLOntology,
                        _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0
                .createNonBufferingReasoner(_OWLOntology);
        org.semanticweb.owlapi.reasoner.OWLReasoner result3 = testSubject0
                .createReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result4 = testSubject0
                .createReasoner(_OWLOntology);
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
