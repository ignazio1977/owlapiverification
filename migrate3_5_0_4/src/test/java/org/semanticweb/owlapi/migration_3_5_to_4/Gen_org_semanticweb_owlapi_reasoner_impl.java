package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.coode.owlapi.functionalparser.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import OWLClass;
import OWLDataProperty;
import OWLDatatype;
import OWLNamedIndividual;
import OWLObjectPropertyExpression;
import org.semanticweb.owlapi.reasoner.impl.DefaultNode;
import org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet;
import org.semanticweb.owlapi.reasoner.impl.NodeFactory;
import org.semanticweb.owlapi.reasoner.impl.OWLClassNode;
import org.semanticweb.owlapi.reasoner.impl.OWLClassNodeSet;
import org.semanticweb.owlapi.reasoner.impl.OWLDataPropertyNode;
import org.semanticweb.owlapi.reasoner.impl.OWLDataPropertyNodeSet;
import org.semanticweb.owlapi.reasoner.impl.OWLDatatypeNode;
import org.semanticweb.owlapi.reasoner.impl.OWLDatatypeNodeSet;
import org.semanticweb.owlapi.reasoner.impl.OWLNamedIndividualNode;
import org.semanticweb.owlapi.reasoner.impl.OWLNamedIndividualNodeSet;
import org.semanticweb.owlapi.reasoner.impl.OWLObjectPropertyNode;
import org.semanticweb.owlapi.reasoner.impl.OWLObjectPropertyNodeSet;
import org.semanticweb.owlapi.reasoner.impl.OWLReasonerBase;
import org.semanticweb.owlapi.reasoner.impl.SatisfiabilityReducer;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner_impl {

    @Test
    public void enforceInterfacesDefaultNode()  {
        assertTrue(org.semanticweb.owlapi.reasoner.Node.class
                .isAssignableFrom(DefaultNode.class));
    }

    public void verifyDefaultNode()  {
        DefaultNode<OWLClass> testSubject0 = new DefaultNode<OWLClass>(_Set) {

            @Override
            protected OWLClass getTopEntity() {
                return null;
            }

            @Override
            protected OWLClass getBottomEntity() {
                return null;
            }
        };
        DefaultNode<OWLClass> testSubject1 = new DefaultNode<OWLClass>(
                _OWLObject) {

            @Override
            protected OWLClass getTopEntity() {
                return null;
            }

            @Override
            protected OWLClass getBottomEntity() {
                return null;
            }
        };
        testSubject0.add(_OWLObject);
        boolean result0 = testSubject0.contains(_OWLObject);
        java.util.Iterator<OWLClass> result1 = testSubject0.iterator();
        int result2 = testSubject0.getSize();
        boolean result3 = testSubject0.isTopNode();
        boolean result4 = testSubject0.isBottomNode();
        java.util.Set<OWLClass> result5 = testSubject0
                .getEntitiesMinus(_OWLObject);
        java.util.Set<OWLClass> result6 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLClass> result7 = testSubject0.getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLClass result9 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLClass> result10 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesDefaultNodeSet()  {
        assertTrue(org.semanticweb.owlapi.reasoner.NodeSet.class
                .isAssignableFrom(DefaultNodeSet.class));
    }

    public void verifyDefaultNodeSet()  {
        DefaultNodeSet<OWLClass> testSubject0 = new DefaultNodeSet<OWLClass>(
                _Set2) {

            @Override
            protected DefaultNode<OWLClass> getNode(OWLClass entity) {
                return null;
            }

            @Override
            protected DefaultNode<OWLClass> getNode(Set<OWLClass> entities) {
                return null;
            }
        };
        DefaultNodeSet<OWLClass> testSubject1 = new DefaultNodeSet<OWLClass>(
                _Node) {

            @Override
            protected DefaultNode<OWLClass> getNode(OWLClass entity) {
                return null;
            }

            @Override
            protected DefaultNode<OWLClass> getNode(Set<OWLClass> entities) {
                return null;
            }
        };
        DefaultNodeSet<OWLClass> testSubject2 = new DefaultNodeSet<OWLClass>(
                _OWLObject) {

            @Override
            protected DefaultNode<OWLClass> getNode(OWLClass entity) {
                return null;
            }

            @Override
            protected DefaultNode<OWLClass> getNode(Set<OWLClass> entities) {
                return null;
            }
        };
        DefaultNodeSet<OWLClass> testSubject3 = new DefaultNodeSet<OWLClass>() {

            @Override
            protected DefaultNode<OWLClass> getNode(OWLClass entity) {
                return null;
            }

            @Override
            protected DefaultNode<OWLClass> getNode(Set<OWLClass> entities) {
                return null;
            }
        };
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLClass>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLClass> result3 = testSubject0.getFlattened();
        boolean result4 = testSubject0.containsEntity(_OWLObject);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLObject);
        testSubject0.addNode(_Node);
        testSubject0.addAllNodes(_Collection);
        testSubject0.addSameEntities(_Set);
        testSubject0.addDifferentEntities(_Set);
    }

    public void verifyNodeFactory()  {
        NodeFactory testSubject0 = new NodeFactory();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLClass> result0 = NodeFactory
                .getOWLClassNode(_Set5);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLClass> result1 = NodeFactory
                .getOWLClassNode(_OWLClass);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLClass> result2 = NodeFactory
                .getOWLClassNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLClass> result3 = NodeFactory
                .getOWLClassTopNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLClass> result4 = NodeFactory
                .getOWLClassBottomNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLObjectPropertyExpression> result5 = NodeFactory
                .getOWLObjectPropertyNode(_Set7);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLObjectPropertyExpression> result6 = NodeFactory
                .getOWLObjectPropertyNode(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLObjectPropertyExpression> result7 = NodeFactory
                .getOWLObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLObjectPropertyExpression> result8 = NodeFactory
                .getOWLObjectPropertyTopNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLObjectPropertyExpression> result9 = NodeFactory
                .getOWLObjectPropertyBottomNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLDataProperty> result10 = NodeFactory
                .getOWLDataPropertyNode(_Set9);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLDataProperty> result11 = NodeFactory
                .getOWLDataPropertyNode(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLDataProperty> result12 = NodeFactory
                .getOWLDataPropertyNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLDataProperty> result13 = NodeFactory
                .getOWLDataPropertyTopNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLDataProperty> result14 = NodeFactory
                .getOWLDataPropertyBottomNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLNamedIndividual> result15 = NodeFactory
                .getOWLNamedIndividualNode(_Set11);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLNamedIndividual> result16 = NodeFactory
                .getOWLNamedIndividualNode(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<OWLNamedIndividual> result17 = NodeFactory
                .getOWLNamedIndividualNode();
    }

    @Test
    public void enforceInterfacesOWLClassNode()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLClassNode.class));
    }

    public void verifyOWLClassNode()  {
        OWLClassNode testSubject0 = new OWLClassNode();
        OWLClassNode testSubject1 = new OWLClassNode(_Set5);
        OWLClassNode testSubject2 = new OWLClassNode(_OWLClass);
        org.semanticweb.owlapi.reasoner.impl.OWLClassNode result0 = OWLClassNode
                .getTopNode();
        org.semanticweb.owlapi.reasoner.impl.OWLClassNode result1 = OWLClassNode
                .getBottomNode();
        testSubject0.add(_OWLObject);
        boolean result2 = testSubject0.contains(_OWLObject);
        java.util.Iterator<OWLClass> result3 = testSubject0.iterator();
        int result4 = testSubject0.getSize();
        boolean result5 = testSubject0.isTopNode();
        boolean result6 = testSubject0.isBottomNode();
        java.util.Set<OWLClass> result7 = testSubject0
                .getEntitiesMinus(_OWLObject);
        java.util.Set<OWLClass> result8 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLClass> result9 = testSubject0.getEntitiesMinusBottom();
        boolean result10 = testSubject0.isSingleton();
        OWLClass result11 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLClass> result12 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLClassNodeSet()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLClassNodeSet.class));
    }

    public void verifyOWLClassNodeSet()  {
        OWLClassNodeSet testSubject0 = new OWLClassNodeSet(_Set13);
        OWLClassNodeSet testSubject1 = new OWLClassNodeSet(_Node14);
        OWLClassNodeSet testSubject2 = new OWLClassNodeSet(_OWLClass);
        OWLClassNodeSet testSubject3 = new OWLClassNodeSet();
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLClass>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLClass> result3 = testSubject0.getFlattened();
        boolean result4 = testSubject0.containsEntity(_OWLObject);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLObject);
        testSubject0.addNode(_Node);
        testSubject0.addAllNodes(_Collection);
        testSubject0.addSameEntities(_Set);
        testSubject0.addDifferentEntities(_Set);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyNode()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLDataPropertyNode.class));
    }

    public void verifyOWLDataPropertyNode()  {
        OWLDataPropertyNode testSubject0 = new OWLDataPropertyNode(_Set9);
        OWLDataPropertyNode testSubject1 = new OWLDataPropertyNode(
                _OWLDataProperty);
        OWLDataPropertyNode testSubject2 = new OWLDataPropertyNode();
        org.semanticweb.owlapi.reasoner.impl.OWLDataPropertyNode result0 = OWLDataPropertyNode
                .getTopNode();
        org.semanticweb.owlapi.reasoner.impl.OWLDataPropertyNode result1 = OWLDataPropertyNode
                .getBottomNode();
        testSubject0.add(_OWLDataProperty);
        boolean result2 = testSubject0.contains(_OWLDataProperty);
        java.util.Iterator<OWLDataProperty> result3 = testSubject0.iterator();
        int result4 = testSubject0.getSize();
        boolean result5 = testSubject0.isTopNode();
        boolean result6 = testSubject0.isBottomNode();
        java.util.Set<OWLDataProperty> result7 = testSubject0
                .getEntitiesMinus(_OWLDataProperty);
        java.util.Set<OWLDataProperty> result8 = testSubject0
                .getEntitiesMinusTop();
        java.util.Set<OWLDataProperty> result9 = testSubject0
                .getEntitiesMinusBottom();
        boolean result10 = testSubject0.isSingleton();
        OWLDataProperty result11 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyNodeSet()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLDataPropertyNodeSet.class));
    }

    @SuppressWarnings("unchecked")
    public void verifyOWLDataPropertyNodeSet()  {
        OWLDataPropertyNodeSet testSubject0 = new OWLDataPropertyNodeSet(_Set15);
        OWLDataPropertyNodeSet testSubject1 = new OWLDataPropertyNodeSet(
                _Node16);
        OWLDataPropertyNodeSet testSubject2 = new OWLDataPropertyNodeSet(
                _OWLDataProperty);
        OWLDataPropertyNodeSet testSubject3 = new OWLDataPropertyNodeSet();
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLDataProperty>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLDataProperty> result3 = testSubject0.getFlattened();
        boolean result4 = testSubject0.containsEntity(_OWLDataProperty);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLDataProperty>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> np = (org.semanticweb.owlapi.reasoner.Node<OWLDataProperty>) mock(Node.class);
        testSubject0.addNode(np);
        testSubject0.addAllNodes(Arrays.asList(np));
        testSubject0.addSameEntities(new HashSet<OWLDataProperty>());
        testSubject0.addDifferentEntities(new HashSet<OWLDataProperty>());
    }

    @Test
    public void enforceInterfacesOWLDatatypeNode()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLDatatypeNode.class));
    }

    public void verifyOWLDatatypeNode()  {
        OWLDatatypeNode testSubject0 = new OWLDatatypeNode(_Set17);
        OWLDatatypeNode testSubject1 = new OWLDatatypeNode(_OWLDatatype);
        OWLDatatypeNode testSubject2 = new OWLDatatypeNode();
        testSubject0.add(_OWLDatatype);
        boolean result0 = testSubject0.contains(_OWLDatatype);
        java.util.Iterator<OWLDatatype> result1 = testSubject0.iterator();
        int result2 = testSubject0.getSize();
        boolean result3 = testSubject0.isTopNode();
        boolean result4 = testSubject0.isBottomNode();
        java.util.Set<OWLDatatype> result5 = testSubject0
                .getEntitiesMinus(_OWLDatatype);
        java.util.Set<OWLDatatype> result6 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLDatatype> result7 = testSubject0
                .getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLDatatype result9 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLDatatype> result10 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLDatatypeNodeSet()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLDatatypeNodeSet.class));
    }

    @SuppressWarnings("unchecked")
    public void verifyOWLDatatypeNodeSet()  {
        OWLDatatypeNodeSet testSubject0 = new OWLDatatypeNodeSet(_Set19);
        OWLDatatypeNodeSet testSubject1 = new OWLDatatypeNodeSet(_Node20);
        OWLDatatypeNodeSet testSubject2 = new OWLDatatypeNodeSet(_OWLDatatype);
        OWLDatatypeNodeSet testSubject3 = new OWLDatatypeNodeSet();
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLDatatype>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLDatatype> result3 = testSubject0.getFlattened();
        boolean result4 = testSubject0.containsEntity(_OWLDatatype);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLDatatype>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLDatatype);
        org.semanticweb.owlapi.reasoner.Node<OWLDatatype> np = (org.semanticweb.owlapi.reasoner.Node<OWLDatatype>) mock(Node.class);
        testSubject0.addNode(np);
        testSubject0.addAllNodes(Arrays.asList(np));
        testSubject0.addSameEntities(new HashSet<OWLDatatype>());
        testSubject0.addDifferentEntities(new HashSet<OWLDatatype>());
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualNode()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLNamedIndividualNode.class));
    }

    public void verifyOWLNamedIndividualNode()  {
        OWLNamedIndividualNode testSubject0 = new OWLNamedIndividualNode(_Set11);
        OWLNamedIndividualNode testSubject1 = new OWLNamedIndividualNode(
                _OWLNamedIndividual);
        OWLNamedIndividualNode testSubject2 = new OWLNamedIndividualNode();
        testSubject0.add(_OWLNamedIndividual);
        boolean result0 = testSubject0.contains(_OWLNamedIndividual);
        java.util.Iterator<OWLNamedIndividual> result1 = testSubject0
                .iterator();
        int result2 = testSubject0.getSize();
        boolean result3 = testSubject0.isTopNode();
        boolean result4 = testSubject0.isBottomNode();
        java.util.Set<OWLNamedIndividual> result5 = testSubject0
                .getEntitiesMinus(_OWLNamedIndividual);
        java.util.Set<OWLNamedIndividual> result6 = testSubject0
                .getEntitiesMinusTop();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0
                .getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLNamedIndividual result9 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualNodeSet()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLNamedIndividualNodeSet.class));
    }

    @SuppressWarnings("unchecked")
    public void verifyOWLNamedIndividualNodeSet()  {
        OWLNamedIndividualNodeSet testSubject0 = new OWLNamedIndividualNodeSet(
                _Set21);
        OWLNamedIndividualNodeSet testSubject1 = new OWLNamedIndividualNodeSet(
                _Node22);
        OWLNamedIndividualNodeSet testSubject2 = new OWLNamedIndividualNodeSet(
                _OWLNamedIndividual);
        OWLNamedIndividualNodeSet testSubject3 = new OWLNamedIndividualNodeSet();
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLNamedIndividual> result3 = testSubject0.getFlattened();
        boolean result4 = testSubject0.containsEntity(_OWLNamedIndividual);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual> np = (org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual>) mock(Node.class);
        testSubject0.addNode(np);
        testSubject0.addAllNodes(Arrays.asList(np));
        testSubject0.addSameEntities(new HashSet<OWLNamedIndividual>());
        testSubject0.addDifferentEntities(new HashSet<OWLNamedIndividual>());
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyNode()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLObjectPropertyNode.class));
    }

    public void verifyOWLObjectPropertyNode()  {
        OWLObjectPropertyNode testSubject0 = new OWLObjectPropertyNode(_Set7);
        OWLObjectPropertyNode testSubject1 = new OWLObjectPropertyNode(
                _OWLObjectPropertyExpression);
        OWLObjectPropertyNode testSubject2 = new OWLObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.impl.OWLObjectPropertyNode result0 = OWLObjectPropertyNode
                .getTopNode();
        org.semanticweb.owlapi.reasoner.impl.OWLObjectPropertyNode result1 = OWLObjectPropertyNode
                .getBottomNode();
        testSubject0.add(_OWLObjectPropertyExpression);
        boolean result2 = testSubject0.contains(_OWLObjectPropertyExpression);
        java.util.Iterator<OWLObjectPropertyExpression> result3 = testSubject0
                .iterator();
        int result4 = testSubject0.getSize();
        boolean result5 = testSubject0.isTopNode();
        boolean result6 = testSubject0.isBottomNode();
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0
                .getEntitiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0
                .getEntitiesMinusTop();
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0
                .getEntitiesMinusBottom();
        boolean result10 = testSubject0.isSingleton();
        OWLObjectPropertyExpression result11 = testSubject0
                .getRepresentativeElement();
        java.util.Set<OWLObjectPropertyExpression> result12 = testSubject0
                .getEntities();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyNodeSet()  {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLObjectPropertyNodeSet.class));
    }

    @SuppressWarnings("unchecked")
    public void verifyOWLObjectPropertyNodeSet()  {
        OWLObjectPropertyNodeSet testSubject0 = new OWLObjectPropertyNodeSet(
                _Set23);
        OWLObjectPropertyNodeSet testSubject1 = new OWLObjectPropertyNodeSet(
                _Node24);
        OWLObjectPropertyNodeSet testSubject2 = new OWLObjectPropertyNodeSet(
                _OWLObjectPropertyExpression);
        OWLObjectPropertyNodeSet testSubject3 = new OWLObjectPropertyNodeSet();
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLObjectPropertyExpression> result3 = testSubject0
                .getFlattened();
        boolean result4 = testSubject0
                .containsEntity(_OWLObjectPropertyExpression);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> np = (org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>) mock(Node.class);
        testSubject0.addNode(np);
        testSubject0.addAllNodes(Arrays.asList(np));
        testSubject0
                .addSameEntities(new HashSet<OWLObjectPropertyExpression>());
        testSubject0
                .addDifferentEntities(new HashSet<OWLObjectPropertyExpression>());
    }

    @Test
    public void enforceInterfacesOWLReasonerBase()  {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasoner.class
                .isAssignableFrom(OWLReasonerBase.class));
    }

    public void verifyOWLReasonerBase()  {
        OWLReasonerBase testSubject0 = mock(OWLReasonerBase.class);
        testSubject0.flush();
        long result0 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result1 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result2 = testSubject0
                .getIndividualNodeSetPolicy();
        org.semanticweb.owlapi.reasoner.BufferingMode result3 = testSubject0
                .getBufferingMode();
        java.util.List<OWLOntologyChange> result4 = testSubject0
                .getPendingChanges();
        java.util.Set<OWLAxiom> result5 = testSubject0
                .getPendingAxiomAdditions();
        java.util.Set<OWLAxiom> result6 = testSubject0
                .getPendingAxiomRemovals();
        OWLOntology result7 = testSubject0
                .getRootOntology();
        org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration result8 = testSubject0
                .getReasonerConfiguration();
        java.util.Collection<OWLAxiom> result9 = testSubject0
                .getReasonerAxioms();
        OWLDataFactory result10 = testSubject0
                .getOWLDataFactory();
        testSubject0.dispose();
        testSubject0.interrupt();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result11 = testSubject0
                .getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result12 = testSubject0
                .getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result13 = testSubject0
                .getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result14 = testSubject0
                .getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result15 = testSubject0
                .getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result16 = testSubject0
                .getObjectPropertyValues(_OWLNamedIndividual,
                        _OWLObjectPropertyExpression);
        java.util.Set<OWLLiteral> result17 = testSubject0
                .getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual> result18 = testSubject0
                .getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result19 = testSubject0
                .getDifferentIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.util.Version result20 = testSubject0
                .getReasonerVersion();
        String result21 = testSubject0.getReasonerName();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result22 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result23 = testSubject0
                .getPrecomputableInferenceTypes();
        boolean result24 = testSubject0.isConsistent();
        boolean result25 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result26 = testSubject0
                .getUnsatisfiableClasses();
        boolean result27 = testSubject0.isEntailed(_Set29);
        boolean result28 = testSubject0.isEntailed(_OWLAxiom);
        boolean result29 = testSubject0
                .isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result30 = testSubject0
                .getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result31 = testSubject0
                .getBottomClassNode();
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result32 = testSubject0
                .getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result33 = testSubject0
                .getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result34 = testSubject0
                .getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result35 = testSubject0
                .getSuperObjectProperties(_OWLObjectPropertyExpression,
                        _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result36 = testSubject0
                .getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result37 = testSubject0
                .getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result38 = testSubject0
                .getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result39 = testSubject0
                .getObjectPropertyDomains(_OWLObjectPropertyExpression,
                        _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result40 = testSubject0
                .getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result41 = testSubject0
                .getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result42 = testSubject0
                .getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result43 = testSubject0
                .getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result44 = testSubject0
                .getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result45 = testSubject0
                .getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result46 = testSubject0
                .getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result47 = testSubject0
                .getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result48 = testSubject0
                .getInstances(_OWLClassExpression, _boolean);
    }

    @Test
    public void enforceInterfacesSatisfiabilityReducer()  {
        assertTrue(OWLAxiomVisitorEx.class
                .isAssignableFrom(SatisfiabilityReducer.class));
    }

    public void verifySatisfiabilityReducer()  {
        SatisfiabilityReducer testSubject0 = new SatisfiabilityReducer(
                _OWLDataFactory);
        Object result0 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        Object result1 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        Object result2 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        Object result3 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        Object result4 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        Object result5 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        Object result6 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        Object result7 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        Object result8 = testSubject0.visit(_OWLClassAssertionAxiom);
        Object result9 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        Object result10 = testSubject0.visit(_SWRLRule);
        Object result11 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        Object result12 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        Object result13 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        Object result14 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        Object result15 = testSubject0.visit(_OWLSameIndividualAxiom);
        Object result16 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        Object result17 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        Object result18 = testSubject0.visit(_OWLHasKeyAxiom);
        Object result19 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        Object result20 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        Object result21 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        Object result22 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        Object result23 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        Object result24 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        Object result25 = testSubject0.visit(_OWLSubClassOfAxiom);
        Object result26 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        Object result27 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        Object result28 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        Object result29 = testSubject0.visit(_OWLDisjointClassesAxiom);
        Object result30 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        Object result31 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        Object result32 = testSubject0.visit(_OWLDisjointUnionAxiom);
        Object result33 = testSubject0.visit(_OWLDeclarationAxiom);
        Object result34 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        Object result35 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        Object result36 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        Object result37 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        Object result38 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLClassExpression result39 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
        OWLClassExpression result40 = testSubject0
                .visit(_OWLObjectPropertyAssertionAxiom);
        OWLClassExpression result41 = testSubject0
                .visit(_OWLObjectPropertyRangeAxiom);
        OWLClassExpression result42 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        OWLClassExpression result43 = testSubject0
                .visit(_OWLDisjointDataPropertiesAxiom);
        OWLClassExpression result44 = testSubject0
                .visit(_OWLDataPropertyRangeAxiom);
        OWLClassExpression result45 = testSubject0
                .visit(_OWLSymmetricObjectPropertyAxiom);
        OWLClassExpression result46 = testSubject0
                .visit(_OWLDeclarationAxiom);
        OWLClassExpression result47 = testSubject0
                .visit(_OWLDisjointUnionAxiom);
        OWLClassExpression result48 = testSubject0
                .visit(_OWLSubObjectPropertyOfAxiom);
        OWLClassExpression result49 = testSubject0
                .visit(_OWLDisjointClassesAxiom);
        OWLClassExpression result50 = testSubject0
                .visit(_OWLReflexiveObjectPropertyAxiom);
        OWLClassExpression result51 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLClassExpression result52 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLClassExpression result53 = testSubject0
                .visit(_OWLSubClassOfAxiom);
        OWLClassExpression result54 = testSubject0
                .visit(_OWLDifferentIndividualsAxiom);
        OWLClassExpression result55 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLClassExpression result56 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLClassExpression result57 = testSubject0
                .visit(_OWLObjectPropertyDomainAxiom);
        OWLClassExpression result58 = testSubject0
                .visit(_OWLDataPropertyDomainAxiom);
        OWLClassExpression result59 = testSubject0
                .visit(_OWLDatatypeDefinitionAxiom);
        OWLClassExpression result60 = testSubject0
                .visit(_OWLHasKeyAxiom);
        OWLClassExpression result61 = testSubject0
                .visit(_OWLInverseObjectPropertiesAxiom);
        OWLClassExpression result62 = testSubject0
                .visit(_OWLSubPropertyChainOfAxiom);
        OWLClassExpression result63 = testSubject0
                .visit(_OWLSameIndividualAxiom);
        OWLClassExpression result64 = testSubject0
                .visit(_OWLAnnotationPropertyRangeAxiom);
        OWLClassExpression result65 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        OWLClassExpression result66 = testSubject0
                .visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLClassExpression result67 = testSubject0
                .visit(_OWLAnnotationAssertionAxiom);
        OWLClassExpression result68 = testSubject0
                .visit(_SWRLRule);
        OWLClassExpression result69 = testSubject0
                .visit(_OWLDataPropertyAssertionAxiom);
        OWLClassExpression result70 = testSubject0
                .visit(_OWLEquivalentClassesAxiom);
        OWLClassExpression result71 = testSubject0
                .visit(_OWLClassAssertionAxiom);
        OWLClassExpression result72 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
        OWLClassExpression result73 = testSubject0
                .visit(_OWLFunctionalDataPropertyAxiom);
        OWLClassExpression result74 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLClassExpression result75 = testSubject0
                .visit(_OWLSubDataPropertyOfAxiom);
        OWLClassExpression result76 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLClassExpression result77 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
    }

    private static class E {}

    private OWLClass _OWLObject;
    private boolean _boolean;
    private java.util.Collection<org.semanticweb.owlapi.reasoner.Node<OWLClass>> _Collection;
    private java.util.Set<? extends OWLAxiom> _Set29;
    private java.util.Set<OWLClass> _Set;
    private java.util.Set<OWLClass> _Set5;
    private java.util.Set<OWLDataProperty> _Set9;
    private java.util.Set<OWLDatatype> _Set17;
    private java.util.Set<OWLNamedIndividual> _Set11;
    private java.util.Set<OWLObjectPropertyExpression> _Set7;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> _Set2;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> _Set13;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLDataProperty>> _Set15;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLDatatype>> _Set19;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual>> _Set21;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>> _Set23;
    private AxiomType<?> _AxiomType;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private OWLDatatype _OWLDatatype;
    private OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private OWLDeclarationAxiom _OWLDeclarationAxiom;
    private OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.reasoner.InferenceType _InferenceType;
    private org.semanticweb.owlapi.reasoner.InferenceType[] _InferenceType_array;
    private org.semanticweb.owlapi.reasoner.Node<OWLClass> _Node;
    private org.semanticweb.owlapi.reasoner.Node<OWLClass> _Node14;
    private org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> _Node16;
    private org.semanticweb.owlapi.reasoner.Node<OWLDatatype> _Node20;
    private org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual> _Node22;
    private org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> _Node24;
}
