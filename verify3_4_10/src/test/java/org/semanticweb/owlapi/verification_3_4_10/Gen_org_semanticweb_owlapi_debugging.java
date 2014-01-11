package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.debugging.AbstractOWLDebugger;
import org.semanticweb.owlapi.debugging.BlackBoxOWLDebugger;
import org.semanticweb.owlapi.debugging.DebuggerClassExpressionGenerator;
import org.semanticweb.owlapi.debugging.JustificationMap;
import org.semanticweb.owlapi.debugging.OWLDebugger;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLException;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_debugging {
    @Test
    public void enforceInterfacesAbstractOWLDebugger() throws Exception {
        assertTrue(org.semanticweb.owlapi.debugging.OWLDebugger.class
                .isAssignableFrom(AbstractOWLDebugger.class));
    }

    public void verifyAbstractOWLDebugger() throws Exception {
        AbstractOWLDebugger testSubject0 = new AbstractOWLDebugger(_OWLOntologyManager,
                _OWLOntology) {
            @Override
            public Set<OWLAxiom> getSOSForIncosistentClass(OWLClassExpression cls)
                    throws OWLException {
                return null;
            }

            @Override
            public void dispose() {}

            @Override
            protected OWLClassExpression getCurrentClass() throws OWLException {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOWLOntology();
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result1 = testSubject0
                .getAllSOSForIncosistentClass(_OWLClassExpression);
        testSubject0.constructHittingSetTree(_Set, _Set2, _Set2, _Set);
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .getOWLOntologyManager();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result3 = testSubject0
                .getSOSForIncosistentClass(_OWLClassExpression);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesBlackBoxOWLDebugger() throws Exception {
        assertTrue(org.semanticweb.owlapi.debugging.AbstractOWLDebugger.class
                .isAssignableFrom(BlackBoxOWLDebugger.class));
    }

    public void verifyBlackBoxOWLDebugger() throws Exception {
        BlackBoxOWLDebugger testSubject0 = new BlackBoxOWLDebugger(_OWLOntologyManager,
                _OWLOntology, _OWLReasonerFactory);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getSOSForIncosistentClass(_OWLClassExpression);
        testSubject0.dispose();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.getOWLOntology();
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result2 = testSubject0
                .getAllSOSForIncosistentClass(_OWLClassExpression);
        testSubject0.constructHittingSetTree(_Set, _Set2, _Set2, _Set);
        org.semanticweb.owlapi.model.OWLOntologyManager result3 = testSubject0
                .getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesDebuggerClassExpressionGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(DebuggerClassExpressionGenerator.class));
    }

    public void verifyDebuggerClassExpressionGenerator() throws Exception {
        DebuggerClassExpressionGenerator testSubject0 = new DebuggerClassExpressionGenerator(
                _OWLDataFactory);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getDebuggerClassExpression();
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
    }

    public void verifyJustificationMap() throws Exception {
        JustificationMap testSubject0 = new JustificationMap(_OWLClassExpression, _Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getRootAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result1 = testSubject0
                .getChildAxioms(_OWLAxiom);
    }

    public void verifyInterfaceOWLDebugger() throws Exception {
        OWLDebugger testSubject0 = mock(OWLDebugger.class);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.getOWLOntology();
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> result1 = testSubject0
                .getAllSOSForIncosistentClass(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result2 = testSubject0
                .getSOSForIncosistentClass(_OWLClassExpression);
        testSubject0.dispose();
    }

    private java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAxiom>> _Set2;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> _Set;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
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
    private org.semanticweb.owlapi.model.OWLImportsDeclaration _OWLImportsDeclaration;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
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
    private org.semanticweb.owlapi.reasoner.OWLReasonerFactory _OWLReasonerFactory;
}
