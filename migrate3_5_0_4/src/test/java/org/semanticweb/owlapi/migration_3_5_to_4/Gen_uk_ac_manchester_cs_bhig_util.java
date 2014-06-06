package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.owl.explanation.ordering.*;

@SuppressWarnings({ "javadoc", "unchecked", "rawtypes", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from uk.ac.manchester.cs.bhig.util to uk.ac.manchester.cs.owl.explanation.ordering", "method removed: MutableTree::replace(MutableTree) : unused",
        "method removed: MutableTree::getSize() : unused", "method removed: MutableTree::setParent(MutableTree) : unused",
        "method removed: MutableTree::addChild(MutableTree, Object) : unused", "method removed: MutableTree::getEdge(Tree) : unused",
        "method removed: Tree::getEdge(Tree) : unused", "method removed: MutableTree::clearChildren() : unused", "method removed: MutableTree::getMaxDepth() : unused" })
public class Gen_uk_ac_manchester_cs_bhig_util {
    @Test
    public void enforceInterfacesMutableTree() {
        assertTrue(Tree.class.isAssignableFrom(MutableTree.class));
    }

    public void verifyMutableTree() {
        MutableTree<N> testSubject0 = new MutableTree(_Object);
        Tree<N> result0 = testSubject0.getParent();
        Tree<N> result2 = testSubject0.getRoot();
        testSubject0.dump(_PrintWriter);
        testSubject0.dump(_PrintWriter, _int);
        N result3 = testSubject0.getUserObject();
        testSubject0.addChild(_MutableTree);
        testSubject0.removeChild(_MutableTree);
        testSubject0.sortChildren(_Comparator);
        int result5 = testSubject0.getChildCount();
        boolean result6 = testSubject0.isLeaf();
        java.util.List<Tree<N>> result7 = testSubject0.getPathToRoot();
        java.util.List<N> result8 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<N> result9 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<N> result10 = testSubject0.fillDepthFirst();
        java.util.List<Tree<N>> result12 = testSubject0.getChildren();
        boolean result13 = testSubject0.isRoot();
    }

    public void verifyInterfaceNodeRenderer() {
        NodeRenderer testSubject0 = mock(NodeRenderer.class);
        String result0 = testSubject0.render(_Tree);
    }

    public void verifyInterfaceTree() {
        Tree<N> testSubject0 = mock(Tree.class);
        Tree<N> result0 = testSubject0.getParent();
        Tree<N> result1 = testSubject0.getRoot();
        testSubject0.dump(_PrintWriter);
        testSubject0.dump(_PrintWriter, _int);
        N result2 = testSubject0.getUserObject();
        testSubject0.sortChildren(_Comparator);
        int result4 = testSubject0.getChildCount();
        boolean result5 = testSubject0.isLeaf();
        java.util.List<Tree<N>> result6 = testSubject0.getPathToRoot();
        java.util.List<N> result7 = testSubject0.getUserObjectPathToRoot();
        java.util.Set<N> result8 = testSubject0.getUserObjectClosure();
        testSubject0.setNodeRenderer(_NodeRenderer);
        java.util.List<N> result9 = testSubject0.fillDepthFirst();
        java.util.List<Tree<N>> result10 = testSubject0.getChildren();
        boolean result11 = testSubject0.isRoot();
    }

    private static class N {
    }

    private N _Object;
    private int _int;
    private java.io.PrintWriter _PrintWriter;
    private java.util.Comparator<Tree<N>> _Comparator;
    private MutableTree<N> _MutableTree;
    private NodeRenderer<N> _NodeRenderer;
    private Tree<N> _Tree;
}
