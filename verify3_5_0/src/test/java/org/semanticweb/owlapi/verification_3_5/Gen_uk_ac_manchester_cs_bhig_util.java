package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.bhig.util.MutableTree;
import uk.ac.manchester.cs.bhig.util.NodeRenderer;
import uk.ac.manchester.cs.bhig.util.Tree;

@SuppressWarnings({ "javadoc", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_bhig_util {

    @Test
    public void enforceInterfacesMutableTree()  {
        assertTrue(uk.ac.manchester.cs.bhig.util.Tree.class
                .isAssignableFrom(MutableTree.class));
    }

    public void verifyMutableTree()  {
        MutableTree<N> testSubject0 = new MutableTree(_Object);
        testSubject0.replace(_MutableTree);
        uk.ac.manchester.cs.bhig.util.Tree<N> result0 = testSubject0
                .getParent();
        int result1 = testSubject0.getSize();
        testSubject0.setParent(_MutableTree);
        uk.ac.manchester.cs.bhig.util.Tree<N> result2 = testSubject0.getRoot();
        testSubject0.dump(_PrintWriter);
        testSubject0.dump(_PrintWriter, _int);
        N result3 = testSubject0.getUserObject();
        testSubject0.addChild(_MutableTree);
        testSubject0.addChild(_MutableTree, _Object4);
        testSubject0.removeChild(_MutableTree);
        Object result4 = testSubject0.getEdge(_Tree);
        testSubject0.sortChildren(_Comparator);
        testSubject0.clearChildren();
        int result5 = testSubject0.getChildCount();
        boolean result6 = testSubject0.isLeaf();
        java.util.List<uk.ac.manchester.cs.bhig.util.Tree<N>> result7 = testSubject0
                .getPathToRoot();
        java.util.List<N> result8 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<N> result9 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<N> result10 = testSubject0.fillDepthFirst();
        int result11 = testSubject0.getMaxDepth();
        java.util.List<uk.ac.manchester.cs.bhig.util.Tree<N>> result12 = testSubject0
                .getChildren();
        boolean result13 = testSubject0.isRoot();
    }

    public void verifyInterfaceNodeRenderer()  {
        NodeRenderer testSubject0 = mock(NodeRenderer.class);
        String result0 = testSubject0.render(_Tree);
    }

    public void verifyInterfaceTree()  {
        Tree<N> testSubject0 = mock(Tree.class);
        uk.ac.manchester.cs.bhig.util.Tree<N> result0 = testSubject0
                .getParent();
        uk.ac.manchester.cs.bhig.util.Tree<N> result1 = testSubject0.getRoot();
        testSubject0.dump(_PrintWriter);
        testSubject0.dump(_PrintWriter, _int);
        N result2 = testSubject0.getUserObject();
        Object result3 = testSubject0.getEdge(_Tree);
        testSubject0.sortChildren(_Comparator);
        int result4 = testSubject0.getChildCount();
        boolean result5 = testSubject0.isLeaf();
        java.util.List<uk.ac.manchester.cs.bhig.util.Tree<N>> result6 = testSubject0
                .getPathToRoot();
        java.util.List<N> result7 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<N> result8 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<N> result9 = testSubject0.fillDepthFirst();
        java.util.List<uk.ac.manchester.cs.bhig.util.Tree<N>> result10 = testSubject0
                .getChildren();
        boolean result11 = testSubject0.isRoot();
    }

    private static class N {}

    private N _Object;
    private int _int;
    private java.io.PrintWriter _PrintWriter;
    private Object _Object4;
    private java.util.Comparator<uk.ac.manchester.cs.bhig.util.Tree<N>> _Comparator;
    private uk.ac.manchester.cs.bhig.util.MutableTree<N> _MutableTree;
    private uk.ac.manchester.cs.bhig.util.NodeRenderer<N> _NodeRenderer;
    private uk.ac.manchester.cs.bhig.util.Tree<N> _Tree;
}
