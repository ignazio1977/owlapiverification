package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import com.clarkparsia.owlapi.modularity.locality.LocalityClass;
import com.clarkparsia.owlapi.modularity.locality.LocalityEvaluator;
import com.clarkparsia.owlapi.modularity.locality.SemanticLocalityEvaluator;
import com.clarkparsia.owlapi.modularity.locality.SyntacticLocalityEvaluator;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_com_clarkparsia_owlapi_modularity_locality {
    @Test
    public void enforceInterfacesLocalityClass() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(LocalityClass.class));
    }

    public void verifyEnumLocalityClass() {
        LocalityClass testSubject0 = LocalityClass.BOTTOM_BOTTOM;
        LocalityClass testSubject1 = LocalityClass.TOP_BOTTOM;
        LocalityClass testSubject2 = LocalityClass.TOP_TOP;
    }

    @Test
    public void enforceInterfacesLocalityEvaluator() {
    }

    public void verifyInterfaceLocalityEvaluator() {
        LocalityEvaluator testSubject0 = mock(LocalityEvaluator.class);
        boolean result0 = testSubject0.isLocal(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSemanticLocalityEvaluator() {
        assertTrue(com.clarkparsia.owlapi.modularity.locality.LocalityEvaluator.class.isAssignableFrom(SemanticLocalityEvaluator.class));
    }

    public void verifySemanticLocalityEvaluator() {
        SemanticLocalityEvaluator testSubject0 = new SemanticLocalityEvaluator(_OWLOntologyManager, _OWLReasonerFactory);
        boolean result0 = testSubject0.isLocal(_OWLAxiom, _Set);
    }

    @Test
    public void enforceInterfacesSyntacticLocalityEvaluator() {
        assertTrue(com.clarkparsia.owlapi.modularity.locality.LocalityEvaluator.class.isAssignableFrom(SyntacticLocalityEvaluator.class));
    }

    public void verifySyntacticLocalityEvaluator() {
        SyntacticLocalityEvaluator testSubject0 = new SyntacticLocalityEvaluator(_LocalityClass);
        boolean result0 = testSubject0.isLocal(_OWLAxiom, _Set);
        java.util.Set<com.clarkparsia.owlapi.modularity.locality.LocalityClass> result1 = testSubject0.supportedLocalityClasses();
    }

    private com.clarkparsia.owlapi.modularity.locality.LocalityClass _LocalityClass;
    private java.util.Set<? extends OWLEntity> _Set;
    private OWLAxiom _OWLAxiom;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasonerFactory _OWLReasonerFactory;
}
