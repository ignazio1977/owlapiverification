package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;

import uk.ac.manchester.cs.owl.explanation.ordering.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "class removed: DefaultExplanationOrderer : use ExplanationOrdererImpl" })
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
        Tree<OWLAxiom> result1 = testSubject0.getParent();
        Tree<OWLAxiom> result3 = testSubject0.getRoot();
        testSubject0.dump(_PrintWriter);
        testSubject0.dump(_PrintWriter, _int);
        OWLAxiom result4 = testSubject0.getUserObject();
        testSubject0.addChild(_MutableTree);
        testSubject0.removeChild(_MutableTree);
        testSubject0.sortChildren(_Comparator);
        int result6 = testSubject0.getChildCount();
        boolean result7 = testSubject0.isLeaf();
        java.util.List<Tree<OWLAxiom>> result8 = testSubject0.getPathToRoot();
        java.util.List<OWLAxiom> result9 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<OWLAxiom> result10 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<OWLAxiom> result11 = testSubject0.fillDepthFirst();
        java.util.List<Tree<OWLAxiom>> result13 = testSubject0.getChildren();
        boolean result14 = testSubject0.isRoot();
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
        assertTrue(MutableTree.class.isAssignableFrom(ExplanationTree.class));
    }

    public void verifyExplanationTree() {
        ExplanationTree testSubject0 = new ExplanationTree(_OWLAxiom);
        boolean result0 = testSubject0.isEntailed();
        Tree<OWLAxiom> result1 = testSubject0.getParent();
        Tree<OWLAxiom> result3 = testSubject0.getRoot();
        testSubject0.dump(_PrintWriter);
        testSubject0.dump(_PrintWriter, _int);
        OWLAxiom result4 = testSubject0.getUserObject();
        testSubject0.addChild(_MutableTree);
        testSubject0.removeChild(_MutableTree);
        testSubject0.sortChildren(_Comparator);
        int result6 = testSubject0.getChildCount();
        boolean result7 = testSubject0.isLeaf();
        java.util.List<Tree<OWLAxiom>> result8 = testSubject0.getPathToRoot();
        java.util.List<OWLAxiom> result9 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<OWLAxiom> result10 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<OWLAxiom> result11 = testSubject0.fillDepthFirst();
        java.util.List<Tree<OWLAxiom>> result13 = testSubject0.getChildren();
        boolean result14 = testSubject0.isRoot();
    }

    @Test
    public void enforceInterfacesNullExplanationOrderer() {
        assertTrue(uk.ac.manchester.cs.owl.explanation.ordering.ExplanationOrderer.class.isAssignableFrom(NullExplanationOrderer.class));
    }

    public void verifyNullExplanationOrderer() {
        NullExplanationOrderer testSubject0 = new NullExplanationOrderer();
        uk.ac.manchester.cs.owl.explanation.ordering.ExplanationTree result0 = testSubject0.getOrderedExplanation(_OWLAxiom, _Set);
    }

    private int _int;
    private java.io.PrintWriter _PrintWriter;
    private java.util.Comparator<Tree<OWLAxiom>> _Comparator;
    private java.util.Set<OWLAxiom> _Set;
    private org.semanticweb.owlapi.io.OWLObjectRenderer _OWLObjectRenderer;
    private OWLAxiom _OWLAxiom;
    private OWLOntologyManager _OWLOntologyManager;
    private MutableTree<OWLAxiom> _MutableTree;
    private NodeRenderer<OWLAxiom> _NodeRenderer;
}
