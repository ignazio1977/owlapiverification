package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.clarkparsia.owlapi.modularity.locality.LocalityClass;
import com.clarkparsia.owlapi.modularity.locality.LocalityEvaluator;
import com.clarkparsia.owlapi.modularity.locality.SemanticLocalityEvaluator;
import com.clarkparsia.owlapi.modularity.locality.SyntacticLocalityEvaluator;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_modularity_locality {
    @Test
    public void enforceInterfacesLocalityClass() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(LocalityClass.class));
    }

    public void verifyEnumLocalityClass() throws Exception {
        LocalityClass testSubject0 = LocalityClass.BOTTOM_BOTTOM;
        LocalityClass testSubject1 = LocalityClass.TOP_BOTTOM;
        LocalityClass testSubject2 = LocalityClass.TOP_TOP;
    }

    public void verifyInterfaceLocalityEvaluator() throws Exception {
        LocalityEvaluator testSubject0 = mock(LocalityEvaluator.class);
        boolean result0 = testSubject0.isLocal(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSemanticLocalityEvaluator() throws Exception {
        assertTrue(com.clarkparsia.owlapi.modularity.locality.LocalityEvaluator.class
                .isAssignableFrom(SemanticLocalityEvaluator.class));
    }

    public void verifySemanticLocalityEvaluator() throws Exception {
        SemanticLocalityEvaluator testSubject0 = new SemanticLocalityEvaluator(
                _OWLOntologyManager, _OWLReasonerFactory);
        boolean result0 = testSubject0.isLocal(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSyntacticLocalityEvaluator() throws Exception {
        assertTrue(com.clarkparsia.owlapi.modularity.locality.LocalityEvaluator.class
                .isAssignableFrom(SyntacticLocalityEvaluator.class));
    }

    public void verifySyntacticLocalityEvaluator() throws Exception {
        SyntacticLocalityEvaluator testSubject0 = new SyntacticLocalityEvaluator(
                _LocalityClass);
        boolean result0 = testSubject0.isLocal(_OWLAxiom, _Set);
        java.util.Set<com.clarkparsia.owlapi.modularity.locality.LocalityClass> result1 = testSubject0
                .supportedLocalityClasses();
    }

    private com.clarkparsia.owlapi.modularity.locality.LocalityClass _LocalityClass;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLEntity> _Set;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasonerFactory _OWLReasonerFactory;
}
