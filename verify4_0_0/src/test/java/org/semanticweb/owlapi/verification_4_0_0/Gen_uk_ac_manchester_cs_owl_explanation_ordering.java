package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import uk.ac.manchester.cs.owl.explanation.ordering.*;

@SuppressWarnings({ "javadoc", "unchecked", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_explanation_ordering {
    @Test
    public void enforceInterfacesAlphaExplanationOrderer() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.ExplanationOrderer.class.isAssignableFrom(AlphaExplanationOrderer.class));
    }

    public void verifyAlphaExplanationOrderer() {
        AlphaExplanationOrderer testSubject0 = new AlphaExplanationOrderer(_OWLObjectRenderer);
        uk.ac.manchester.cs.owl.explanation.ordering.ExplanationTree result0 = testSubject0.getOrderedExplanation(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesEntailedAxiomTree() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.ExplanationTree.class.isAssignableFrom(EntailedAxiomTree.class));
    }

    public void verifyEntailedAxiomTree() {
        EntailedAxiomTree testSubject0 = new EntailedAxiomTree(_OWLAxiom);
        boolean result0 = testSubject0.isEntailed();
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result1 = testSubject0.getParent();
        boolean result2 = testSubject0.isRoot();
        testSubject0.dump(_PrintWriter, _int);
        testSubject0.dump(_PrintWriter);
        testSubject0.addChild(_MutableTree);
        OWLAxiom result3 = testSubject0.getUserObject();
        testSubject0.removeChild(_MutableTree);
        testSubject0.sortChildren(_Comparator);
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result5 = testSubject0.getChildren();
        int result6 = testSubject0.getChildCount();
        boolean result7 = testSubject0.isLeaf();
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result8 = testSubject0.getPathToRoot();
        java.util.List<OWLAxiom> result9 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<OWLAxiom> result10 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<OWLAxiom> result11 = testSubject0.fillDepthFirst();
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result12 = testSubject0.getRoot();
    }

    public void verifyInterfaceExplanationOrderer() {
        ExplanationOrderer testSubject0 = mock(ExplanationOrderer.class);
        uk.ac.manchester.cs.owl.explanation.ordering.ExplanationTree result0 = testSubject0.getOrderedExplanation(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesExplanationOrdererImpl() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.ExplanationOrderer.class.isAssignableFrom(ExplanationOrdererImpl.class));
    }

    public void verifyExplanationOrdererImpl() {
        ExplanationOrdererImpl testSubject0 = new ExplanationOrdererImpl(_OWLOntologyManager);
        uk.ac.manchester.cs.owl.explanation.ordering.ExplanationTree result0 = testSubject0.getOrderedExplanation(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesExplanationTree() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.MutableTree.class.isAssignableFrom(ExplanationTree.class));
    }

    public void verifyExplanationTree() {
        ExplanationTree testSubject0 = new ExplanationTree(_OWLAxiom);
        boolean result0 = testSubject0.isEntailed();
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result1 = testSubject0.getParent();
        boolean result2 = testSubject0.isRoot();
        testSubject0.dump(_PrintWriter, _int);
        testSubject0.dump(_PrintWriter);
        testSubject0.addChild(_MutableTree);
        OWLAxiom result3 = testSubject0.getUserObject();
        testSubject0.removeChild(_MutableTree);
        testSubject0.sortChildren(_Comparator);
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result5 = testSubject0.getChildren();
        int result6 = testSubject0.getChildCount();
        boolean result7 = testSubject0.isLeaf();
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result8 = testSubject0.getPathToRoot();
        java.util.List<OWLAxiom> result9 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<OWLAxiom> result10 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<OWLAxiom> result11 = testSubject0.fillDepthFirst();
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result12 = testSubject0.getRoot();
    }

    @Test
    public void enforceInterfacesMutableTree() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.Tree.class.isAssignableFrom(MutableTree.class));
    }

    public void verifyMutableTree() {
        MutableTree<OWLAxiom> testSubject0 = new MutableTree<OWLAxiom>(_Object);
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result0 = testSubject0.getParent();
        boolean result1 = testSubject0.isRoot();
        testSubject0.dump(_PrintWriter, _int);
        testSubject0.dump(_PrintWriter);
        testSubject0.addChild(_MutableTree);
        OWLAxiom result2 = testSubject0.getUserObject();
        testSubject0.removeChild(_MutableTree);
        testSubject0.sortChildren(_Comparator);
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result4 = testSubject0.getChildren();
        int result5 = testSubject0.getChildCount();
        boolean result6 = testSubject0.isLeaf();
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result7 = testSubject0.getPathToRoot();
        java.util.List<OWLAxiom> result8 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<OWLAxiom> result9 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<OWLAxiom> result10 = testSubject0.fillDepthFirst();
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result11 = testSubject0.getRoot();
    }

    public void verifyInterfaceNodeRenderer() {
        NodeRenderer<OWLAxiom> testSubject0 = mock(NodeRenderer.class);
        java.lang.String result0 = testSubject0.render(_Tree);
    }

    @Test
    public void enforceInterfacesNullExplanationOrderer() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.ExplanationOrderer.class.isAssignableFrom(NullExplanationOrderer.class));
    }

    public void verifyNullExplanationOrderer() {
        NullExplanationOrderer testSubject0 = new NullExplanationOrderer();
        uk.ac.manchester.cs.owl.explanation.ordering.ExplanationTree result0 = testSubject0.getOrderedExplanation(_OWLAxiom, _Set);
    }

    public void verifyInterfaceTree() {
        Tree<OWLAxiom> testSubject0 = mock(Tree.class);
        uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> result0 = testSubject0.getParent();
        boolean result1 = testSubject0.isRoot();
        testSubject0.dump(_PrintWriter, _int);
        testSubject0.dump(_PrintWriter);
        OWLAxiom result2 = testSubject0.getUserObject();
        testSubject0.sortChildren(_Comparator);
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result4 = testSubject0.getChildren();
        int result5 = testSubject0.getChildCount();
        boolean result6 = testSubject0.isLeaf();
        java.util.List<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> result7 = testSubject0.getPathToRoot();
        java.util.List<OWLAxiom> result8 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<OWLAxiom> result9 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<OWLAxiom> result10 = testSubject0.fillDepthFirst();
        Tree<OWLAxiom> result11 = testSubject0.getRoot();
    }

    private OWLAxiom _Object;
    private int _int;
    private java.io.PrintWriter _PrintWriter;
    private java.util.Comparator<uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom>> _Comparator;
    private java.util.Set<OWLAxiom> _Set;
    private org.semanticweb.owlapi.io.OWLObjectRenderer _OWLObjectRenderer;
    private OWLAxiom _OWLAxiom;
    private OWLOntologyManager _OWLOntologyManager;
    private uk.ac.manchester.cs.owl.explanation.ordering.MutableTree<OWLAxiom> _MutableTree;
    private uk.ac.manchester.cs.owl.explanation.ordering.NodeRenderer<OWLAxiom> _NodeRenderer;
    private uk.ac.manchester.cs.owl.explanation.ordering.Tree<OWLAxiom> _Tree;
}
