package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.macro.AbstractMacroExpansionVisitor;
import org.obolibrary.macro.MacroExpansionGCIVisitor;
import org.obolibrary.macro.MacroExpansionVisitor;
import org.obolibrary.macro.ManchesterSyntaxTool;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_macro {
    @Test
    public void enforceInterfacesAbstractMacroExpansionVisitor() {
        assertTrue(OWLClassExpressionVisitorEx.class.isAssignableFrom(AbstractMacroExpansionVisitor.class));
        assertTrue(OWLDataVisitorEx.class.isAssignableFrom(AbstractMacroExpansionVisitor.class));
        assertTrue(OWLAxiomVisitorEx.class.isAssignableFrom(AbstractMacroExpansionVisitor.class));
    }

    public void verifyAbstractMacroExpansionVisitor() {
        AbstractMacroExpansionVisitor testSubject0 = new AbstractMacroExpansionVisitor(mock(OWLOntology.class)) {
            @Override
            protected OWLClassExpression expandOWLObjSomeVal(OWLClassExpression filler, OWLObjectPropertyExpression p) {
                return null;
            }

            @Override
            protected OWLClassExpression expandOWLObjHasVal(OWLObjectHasValue desc, OWLIndividual filler, OWLObjectPropertyExpression p) {
                return null;
            }
        };
    }

    public void verifyMacroExpansionGCIVisitor() {
        MacroExpansionGCIVisitor testSubject0 = new MacroExpansionGCIVisitor(_OWLOntology, _OWLOntologyManager);
        OWLOntology result0 = testSubject0.createGCIOntology();
        testSubject0.dispose();
    }

    public void verifyMacroExpansionVisitor() {
        MacroExpansionVisitor testSubject0 = new MacroExpansionVisitor(_OWLOntology);
        OWLOntology result0 = testSubject0.expandAll();
        testSubject0.dispose();
    }

    public void verifyManchesterSyntaxTool() {
        ManchesterSyntaxTool testSubject0 = new ManchesterSyntaxTool(_OWLOntology, _Collection);
        ManchesterSyntaxTool testSubject1 = new ManchesterSyntaxTool(_OWLOntology);
        java.lang.String result0 = testSubject0.getId(_OWLEntity);
        java.lang.String result1 = testSubject0.getId(_IRI);
        java.util.Set<org.semanticweb.owlapi.util.OntologyAxiomPair> result2 = testSubject0.parseManchesterExpressionFrames(_String);
        OWLClassExpression result3 = testSubject0.parseManchesterExpression(_String);
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.lang.String _String;
    private java.util.Collection<OWLOntology> _Collection;
    private IRI _IRI;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataComplementOf _OWLDataComplementOf;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataIntersectionOf _OWLDataIntersectionOf;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataOneOf _OWLDataOneOf;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLDataUnionOf _OWLDataUnionOf;
    private OWLDatatype _OWLDatatype;
    private OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private OWLDatatypeRestriction _OWLDatatypeRestriction;
    private OWLDeclarationAxiom _OWLDeclarationAxiom;
    private OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private OWLEntity _OWLEntity;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
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
}
