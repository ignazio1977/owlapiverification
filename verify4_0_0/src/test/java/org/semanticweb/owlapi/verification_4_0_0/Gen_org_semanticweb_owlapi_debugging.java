package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.debugging.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_debugging {
    @Test
    public void enforceInterfacesAbstractOWLDebugger() {
        assertTrue(org.semanticweb.owlapi.debugging.OWLDebugger.class.isAssignableFrom(AbstractOWLDebugger.class));
    }

    public void verifyAbstractOWLDebugger() throws OWLException {
        AbstractOWLDebugger testSubject0 = mock(AbstractOWLDebugger.class);
        OWLOntology result0 = testSubject0.getOWLOntology();
        java.util.Set<java.util.Set<OWLAxiom>> result1 = testSubject0.getAllSOSForInconsistentClass(_OWLClassExpression);
        testSubject0.constructHittingSetTree(_Set, _Set2, _Set2, _Set);
        testSubject0.dispose();
        java.util.Set<OWLAxiom> result2 = testSubject0.getSOSForInconsistentClass(_OWLClassExpression);
    }

    @Test
    public void enforceInterfacesBlackBoxOWLDebugger() {
        assertTrue(org.semanticweb.owlapi.debugging.AbstractOWLDebugger.class.isAssignableFrom(BlackBoxOWLDebugger.class));
    }

    public void verifyBlackBoxOWLDebugger() throws OWLException {
        BlackBoxOWLDebugger testSubject0 = new BlackBoxOWLDebugger(_OWLOntologyManager, _OWLOntology, _OWLReasonerFactory);
        testSubject0.dispose();
        java.util.Set<OWLAxiom> result0 = testSubject0.getSOSForInconsistentClass(_OWLClassExpression);
        OWLOntology result1 = testSubject0.getOWLOntology();
        java.util.Set<java.util.Set<OWLAxiom>> result2 = testSubject0.getAllSOSForInconsistentClass(_OWLClassExpression);
        testSubject0.constructHittingSetTree(_Set, _Set2, _Set2, _Set);
    }

    @Test
    public void enforceInterfacesDebuggerClassExpressionGenerator() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter.class.isAssignableFrom(DebuggerClassExpressionGenerator.class));
    }

    public void verifyDebuggerClassExpressionGenerator() {
        DebuggerClassExpressionGenerator testSubject0 = new DebuggerClassExpressionGenerator(_OWLDataFactory);
        OWLClassExpression result0 = testSubject0.getDebuggerClassExpression();
    }

    public void verifyJustificationMap() {
        JustificationMap testSubject0 = new JustificationMap(_OWLClassExpression, _Set);
        java.util.Set<OWLAxiom> result0 = testSubject0.getRootAxioms();
        java.util.Collection<OWLAxiom> result1 = testSubject0.getChildAxioms(_OWLAxiom);
    }

    public void verifyInterfaceOWLDebugger() throws OWLException {
        OWLDebugger testSubject0 = mock(OWLDebugger.class);
        testSubject0.dispose();
        OWLOntology result0 = testSubject0.getOWLOntology();
        java.util.Set<java.util.Set<OWLAxiom>> result1 = testSubject0.getAllSOSForInconsistentClass(_OWLClassExpression);
        java.util.Set<OWLAxiom> result2 = testSubject0.getSOSForInconsistentClass(_OWLClassExpression);
    }

    private java.util.Set<java.util.Set<OWLAxiom>> _Set2;
    private java.util.Set<OWLAxiom> _Set;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
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
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
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
    private org.semanticweb.owlapi.reasoner.OWLReasonerFactory _OWLReasonerFactory;
}
