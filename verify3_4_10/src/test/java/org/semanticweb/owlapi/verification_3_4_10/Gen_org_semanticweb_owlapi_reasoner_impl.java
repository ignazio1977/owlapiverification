package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.coode.owlapi.functionalparser.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
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

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner_impl {
    @Test
    public void enforceInterfacesDefaultNode() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.Node.class
                .isAssignableFrom(DefaultNode.class));
    }

    public void verifyDefaultNode() throws Exception {
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
        DefaultNode<OWLClass> testSubject1 = new DefaultNode<OWLClass>(_OWLObject) {
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
        java.util.Set<OWLClass> result5 = testSubject0.getEntitiesMinus(_OWLObject);
        java.util.Set<OWLClass> result6 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLClass> result7 = testSubject0.getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLClass result9 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLClass> result10 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesDefaultNodeSet() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.NodeSet.class
                .isAssignableFrom(DefaultNodeSet.class));
    }

    public void verifyDefaultNodeSet() throws Exception {
        DefaultNodeSet<OWLClass> testSubject0 = new DefaultNodeSet<OWLClass>(_Set2) {
            @Override
            protected DefaultNode<OWLClass> getNode(OWLClass entity) {
                return null;
            }

            @Override
            protected DefaultNode<OWLClass> getNode(Set<OWLClass> entities) {
                return null;
            }
        };
        DefaultNodeSet<OWLClass> testSubject1 = new DefaultNodeSet<OWLClass>(_Node) {
            @Override
            protected DefaultNode<OWLClass> getNode(OWLClass entity) {
                return null;
            }

            @Override
            protected DefaultNode<OWLClass> getNode(Set<OWLClass> entities) {
                return null;
            }
        };
        DefaultNodeSet<OWLClass> testSubject2 = new DefaultNodeSet<OWLClass>(_OWLObject) {
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

    

    public void verifyNodeFactory() throws Exception {
        NodeFactory testSubject0 = new NodeFactory();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLClass> result0 = NodeFactory
                .getOWLClassNode(_Set5);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLClass> result1 = NodeFactory
                .getOWLClassNode(_OWLClass);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLClass> result2 = NodeFactory
                .getOWLClassNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLClass> result3 = NodeFactory
                .getOWLClassTopNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLClass> result4 = NodeFactory
                .getOWLClassBottomNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result5 = NodeFactory
                .getOWLObjectPropertyNode(_Set7);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result6 = NodeFactory
                .getOWLObjectPropertyNode(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result7 = NodeFactory
                .getOWLObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result8 = NodeFactory
                .getOWLObjectPropertyTopNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result9 = NodeFactory
                .getOWLObjectPropertyBottomNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLDataProperty> result10 = NodeFactory
                .getOWLDataPropertyNode(_Set9);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLDataProperty> result11 = NodeFactory
                .getOWLDataPropertyNode(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLDataProperty> result12 = NodeFactory
                .getOWLDataPropertyNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLDataProperty> result13 = NodeFactory
                .getOWLDataPropertyTopNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLDataProperty> result14 = NodeFactory
                .getOWLDataPropertyBottomNode();
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = NodeFactory
                .getOWLNamedIndividualNode(_Set11);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = NodeFactory
                .getOWLNamedIndividualNode(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.impl.DefaultNode<org.semanticweb.owlapi.model.OWLNamedIndividual> result17 = NodeFactory
                .getOWLNamedIndividualNode();
    }

    @Test
    public void enforceInterfacesOWLClassNode() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLClassNode.class));
    }

    public void verifyOWLClassNode() throws Exception {
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
        java.util.Set<OWLClass> result7 = testSubject0.getEntitiesMinus(_OWLObject);
        java.util.Set<OWLClass> result8 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLClass> result9 = testSubject0.getEntitiesMinusBottom();
        boolean result10 = testSubject0.isSingleton();
        OWLClass result11 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLClass> result12 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLClassNodeSet() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLClassNodeSet.class));
    }

    public void verifyOWLClassNodeSet() throws Exception {
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
    public void enforceInterfacesOWLDataPropertyNode() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLDataPropertyNode.class));
    }

    public void verifyOWLDataPropertyNode() throws Exception {
        OWLDataPropertyNode testSubject0 = new OWLDataPropertyNode(_Set9);
        OWLDataPropertyNode testSubject1 = new OWLDataPropertyNode(_OWLDataProperty);
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
        java.util.Set<OWLDataProperty> result8 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getEntitiesMinusBottom();
        boolean result10 = testSubject0.isSingleton();
        OWLDataProperty result11 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyNodeSet() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLDataPropertyNodeSet.class));
    }

    public void verifyOWLDataPropertyNodeSet() throws Exception {
        OWLDataPropertyNodeSet testSubject0 = new OWLDataPropertyNodeSet(_Set15);
        OWLDataPropertyNodeSet testSubject1 = new OWLDataPropertyNodeSet(_Node16);
        OWLDataPropertyNodeSet testSubject2 = new OWLDataPropertyNodeSet(_OWLDataProperty);
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
    public void enforceInterfacesOWLDatatypeNode() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLDatatypeNode.class));
    }

    public void verifyOWLDatatypeNode() throws Exception {
        OWLDatatypeNode testSubject0 = new OWLDatatypeNode(_Set17);
        OWLDatatypeNode testSubject1 = new OWLDatatypeNode(_OWLDatatype);
        OWLDatatypeNode testSubject2 = new OWLDatatypeNode();
        testSubject0.add(_OWLDatatype);
        boolean result0 = testSubject0.contains(_OWLDatatype);
        java.util.Iterator<OWLDatatype> result1 = testSubject0.iterator();
        int result2 = testSubject0.getSize();
        boolean result3 = testSubject0.isTopNode();
        boolean result4 = testSubject0.isBottomNode();
        java.util.Set<OWLDatatype> result5 = testSubject0.getEntitiesMinus(_OWLDatatype);
        java.util.Set<OWLDatatype> result6 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLDatatype> result7 = testSubject0.getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLDatatype result9 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLDatatype> result10 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLDatatypeNodeSet() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLDatatypeNodeSet.class));
    }

    public void verifyOWLDatatypeNodeSet() throws Exception {
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
    public void enforceInterfacesOWLNamedIndividualNode() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLNamedIndividualNode.class));
    }

    public void verifyOWLNamedIndividualNode() throws Exception {
        OWLNamedIndividualNode testSubject0 = new OWLNamedIndividualNode(_Set11);
        OWLNamedIndividualNode testSubject1 = new OWLNamedIndividualNode(
                _OWLNamedIndividual);
        OWLNamedIndividualNode testSubject2 = new OWLNamedIndividualNode();
        testSubject0.add(_OWLNamedIndividual);
        boolean result0 = testSubject0.contains(_OWLNamedIndividual);
        java.util.Iterator<OWLNamedIndividual> result1 = testSubject0.iterator();
        int result2 = testSubject0.getSize();
        boolean result3 = testSubject0.isTopNode();
        boolean result4 = testSubject0.isBottomNode();
        java.util.Set<OWLNamedIndividual> result5 = testSubject0
                .getEntitiesMinus(_OWLNamedIndividual);
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLNamedIndividual result9 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualNodeSet() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLNamedIndividualNodeSet.class));
    }

    public void verifyOWLNamedIndividualNodeSet() throws Exception {
        OWLNamedIndividualNodeSet testSubject0 = new OWLNamedIndividualNodeSet(_Set21);
        OWLNamedIndividualNodeSet testSubject1 = new OWLNamedIndividualNodeSet(_Node22);
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
    public void enforceInterfacesOWLObjectPropertyNode() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNode.class
                .isAssignableFrom(OWLObjectPropertyNode.class));
    }

    public void verifyOWLObjectPropertyNode() throws Exception {
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
        java.util.Iterator<OWLObjectPropertyExpression> result3 = testSubject0.iterator();
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
        OWLObjectPropertyExpression result11 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLObjectPropertyExpression> result12 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyNodeSet() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.impl.DefaultNodeSet.class
                .isAssignableFrom(OWLObjectPropertyNodeSet.class));
    }

    public void verifyOWLObjectPropertyNodeSet() throws Exception {
        OWLObjectPropertyNodeSet testSubject0 = new OWLObjectPropertyNodeSet(_Set23);
        OWLObjectPropertyNodeSet testSubject1 = new OWLObjectPropertyNodeSet(_Node24);
        OWLObjectPropertyNodeSet testSubject2 = new OWLObjectPropertyNodeSet(
                _OWLObjectPropertyExpression);
        OWLObjectPropertyNodeSet testSubject3 = new OWLObjectPropertyNodeSet();
        boolean result0 = testSubject0.isEmpty();
        java.util.Iterator<org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>> result1 = testSubject0
                .iterator();
        boolean result2 = testSubject0.isSingleton();
        java.util.Set<OWLObjectPropertyExpression> result3 = testSubject0.getFlattened();
        boolean result4 = testSubject0.containsEntity(_OWLObjectPropertyExpression);
        boolean result5 = testSubject0.isTopSingleton();
        boolean result6 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>> result7 = testSubject0
                .getNodes();
        testSubject0.addEntity(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> np = (org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression>) mock(Node.class);
        testSubject0.addNode(np);
        testSubject0.addAllNodes(Arrays.asList(np));
        testSubject0.addSameEntities(new HashSet<OWLObjectPropertyExpression>());
        testSubject0.addDifferentEntities(new HashSet<OWLObjectPropertyExpression>());
    }

    @Test
    public void enforceInterfacesOWLReasonerBase() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasoner.class
                .isAssignableFrom(OWLReasonerBase.class));
    }

    public void verifyOWLReasonerBase() throws Exception {
        OWLReasonerBase testSubject0 = mock(OWLReasonerBase.class);
        testSubject0.flush();
        long result0 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result1 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result2 = testSubject0
                .getIndividualNodeSetPolicy();
        org.semanticweb.owlapi.reasoner.BufferingMode result3 = testSubject0
                .getBufferingMode();
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result4 = testSubject0
                .getPendingChanges();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result5 = testSubject0
                .getPendingAxiomAdditions();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result6 = testSubject0
                .getPendingAxiomRemovals();
        org.semanticweb.owlapi.model.OWLOntology result7 = testSubject0.getRootOntology();
        org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration result8 = testSubject0
                .getReasonerConfiguration();
        java.util.Collection<org.semanticweb.owlapi.model.OWLAxiom> result9 = testSubject0
                .getReasonerAxioms();
        org.semanticweb.owlapi.model.OWLDataFactory result10 = testSubject0
                .getOWLDataFactory();
        testSubject0.dispose();
        testSubject0.interrupt();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result13 = testSubject0
                .getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result15 = testSubject0
                .getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getObjectPropertyValues(_OWLNamedIndividual,
                        _OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result17 = testSubject0
                .getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result19 = testSubject0
                .getDifferentIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.util.Version result20 = testSubject0.getReasonerVersion();
        java.lang.String result21 = testSubject0.getReasonerName();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result22 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result23 = testSubject0
                .getPrecomputableInferenceTypes();
        boolean result24 = testSubject0.isConsistent();
        boolean result25 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result26 = testSubject0
                .getUnsatisfiableClasses();
        boolean result27 = testSubject0.isEntailed(_Set29);
        boolean result28 = testSubject0.isEntailed(_OWLAxiom);
        boolean result29 = testSubject0.isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result30 = testSubject0
                .getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result31 = testSubject0
                .getBottomClassNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result32 = testSubject0
                .getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result33 = testSubject0
                .getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result34 = testSubject0
                .getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result35 = testSubject0
                .getSuperObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result36 = testSubject0
                .getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result37 = testSubject0
                .getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result38 = testSubject0
                .getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result39 = testSubject0
                .getObjectPropertyDomains(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result40 = testSubject0
                .getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result41 = testSubject0
                .getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result42 = testSubject0
                .getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result43 = testSubject0
                .getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result44 = testSubject0
                .getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result45 = testSubject0
                .getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result46 = testSubject0
                .getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result47 = testSubject0
                .getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result48 = testSubject0
                .getInstances(_OWLClassExpression, _boolean);
    }

    @Test
    public void enforceInterfacesSatisfiabilityReducer() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitorEx.class
                .isAssignableFrom(SatisfiabilityReducer.class));
    }

    public void verifySatisfiabilityReducer() throws Exception {
        SatisfiabilityReducer testSubject0 = new SatisfiabilityReducer(_OWLDataFactory);
        java.lang.Object result0 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result1 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result2 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result4 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result5 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result9 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result10 = testSubject0.visit(_SWRLRule);
        java.lang.Object result11 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result12 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result13 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result14 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result15 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Object result17 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result18 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result19 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result20 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Object result21 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Object result22 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result23 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result24 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result25 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result26 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result27 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result28 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result29 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result30 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result31 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result32 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result33 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result34 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result35 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result36 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result37 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result38 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result39 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result40 = testSubject0
                .visit(_OWLObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result41 = testSubject0
                .visit(_OWLObjectPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result42 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result43 = testSubject0
                .visit(_OWLDisjointDataPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result44 = testSubject0
                .visit(_OWLDataPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result45 = testSubject0
                .visit(_OWLSymmetricObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result46 = testSubject0
                .visit(_OWLDeclarationAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result47 = testSubject0
                .visit(_OWLDisjointUnionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result48 = testSubject0
                .visit(_OWLSubObjectPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result49 = testSubject0
                .visit(_OWLDisjointClassesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result50 = testSubject0
                .visit(_OWLReflexiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result51 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result52 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result53 = testSubject0
                .visit(_OWLSubClassOfAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result54 = testSubject0
                .visit(_OWLDifferentIndividualsAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result55 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result56 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result57 = testSubject0
                .visit(_OWLObjectPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result58 = testSubject0
                .visit(_OWLDataPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result59 = testSubject0
                .visit(_OWLDatatypeDefinitionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result60 = testSubject0
                .visit(_OWLHasKeyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result61 = testSubject0
                .visit(_OWLInverseObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result62 = testSubject0
                .visit(_OWLSubPropertyChainOfAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result63 = testSubject0
                .visit(_OWLSameIndividualAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result64 = testSubject0
                .visit(_OWLAnnotationPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result65 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result66 = testSubject0
                .visit(_OWLSubAnnotationPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result67 = testSubject0
                .visit(_OWLAnnotationAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result68 = testSubject0
                .visit(_SWRLRule);
        org.semanticweb.owlapi.model.OWLClassExpression result69 = testSubject0
                .visit(_OWLDataPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result70 = testSubject0
                .visit(_OWLEquivalentClassesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result71 = testSubject0
                .visit(_OWLClassAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result72 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result73 = testSubject0
                .visit(_OWLFunctionalDataPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result74 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result75 = testSubject0
                .visit(_OWLSubDataPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result76 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result77 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
    }

    private static class E {}

    private OWLClass _OWLObject;
    private boolean _boolean;
    private java.util.Collection<org.semanticweb.owlapi.reasoner.Node<OWLClass>> _Collection;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> _Set29;
    private java.util.Set<OWLClass> _Set;
    private java.util.Set<org.semanticweb.owlapi.model.OWLClass> _Set5;
    private java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> _Set9;
    private java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> _Set17;
    private java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> _Set11;
    private java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Set7;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> _Set2;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass>> _Set13;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty>> _Set15;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDatatype>> _Set19;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLNamedIndividual>> _Set21;
    private java.util.Set<org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> _Set23;
    private org.semanticweb.owlapi.model.AxiomType<?> _AxiomType;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression _OWLDataPropertyExpression;
    private org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLDatatype _OWLDatatype;
    private org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private org.semanticweb.owlapi.model.OWLDeclarationAxiom _OWLDeclarationAxiom;
    private org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLHasKeyAxiom _OWLHasKeyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.reasoner.InferenceType _InferenceType;
    private org.semanticweb.owlapi.reasoner.InferenceType[] _InferenceType_array;
    private org.semanticweb.owlapi.reasoner.Node<OWLClass> _Node;
    private org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> _Node14;
    private org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> _Node16;
    private org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDatatype> _Node20;
    private org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLNamedIndividual> _Node22;
    private org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Node24;
}
