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

@SuppressWarnings({ "javadoc", "unused" })
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
        java.lang.Object result0 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result1 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.lang.Object result2 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result4 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result5 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result9 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result10 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result11 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Object result12 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Object result13 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result14 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result15 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result17 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result18 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result19 = testSubject0.visit(_SWRLRule);
        java.lang.Object result20 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLDataRange result21 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result22 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result23 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result24 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result25 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result26 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result27 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result28 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result29 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Object result30 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result31 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result32 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result33 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Object result34 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Object result35 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Object result36 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Object result37 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Object result38 = testSubject0.visit(_OWLDataIntersectionOf);
        java.lang.Object result39 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Object result40 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Object result41 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Object result42 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Object result43 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Object result44 = testSubject0.visit(_OWLObjectUnionOf);
        java.lang.Object result45 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Object result46 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Object result47 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Object result48 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Object result49 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Object result50 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Object result51 = testSubject0.visit(_OWLClass);
        java.lang.Object result52 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result53 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result54 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result55 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Object result56 = testSubject0.visit(_OWLDatatype);
        java.lang.Object result57 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Object result58 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Object result59 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result60 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result61 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Object result62 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result63 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result64 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result65 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLAxiom result66 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLAxiom result67 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLAxiom result68 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLAxiom result69 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLDataRange result70 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLDataRange result71 = testSubject0.visit(_OWLDataUnionOf);
        OWLAxiom result72 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLAxiom result73 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLClassExpression result74 = testSubject0.visit(_OWLObjectHasSelf);
        OWLClassExpression result75 = testSubject0.visit(_OWLObjectOneOf);
        OWLDataRange result76 = testSubject0.visit(_OWLDatatype);
        OWLDataRange result77 = testSubject0.visit(_OWLDataComplementOf);
        OWLAxiom result78 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLAxiom result79 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLAxiom result80 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLClassExpression result81 = testSubject0.visit(_OWLClass);
        OWLClassExpression result82 = testSubject0.visit(_OWLObjectHasValue);
        OWLClassExpression result83 = testSubject0.visit(_OWLObjectAllValuesFrom);
        OWLClassExpression result84 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLClassExpression result85 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLClassExpression result86 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLClassExpression result87 = testSubject0.visit(_OWLObjectUnionOf);
        OWLClassExpression result88 = testSubject0.visit(_OWLObjectComplementOf);
        OWLClassExpression result89 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLClassExpression result90 = testSubject0.visit(_OWLDataExactCardinality);
        OWLClassExpression result91 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLClassExpression result92 = testSubject0.visit(_OWLDataMinCardinality);
        OWLDataRange result93 = testSubject0.visit(_OWLDataOneOf);
        OWLClassExpression result94 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLClassExpression result95 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLClassExpression result96 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLClassExpression result97 = testSubject0.visit(_OWLDataHasValue);
        OWLAxiom result98 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLAxiom result99 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLAxiom result100 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLAxiom result101 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLAxiom result102 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLAxiom result103 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLAxiom result104 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLAxiom result105 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLAxiom result106 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLAxiom result107 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLAxiom result108 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLAxiom result109 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLAxiom result110 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLAxiom result111 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLAxiom result112 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLAxiom result113 = testSubject0.visit(_SWRLRule);
        OWLAxiom result114 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLAxiom result115 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLAxiom result116 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLAxiom result117 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLAxiom result118 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLDataRange result119 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLDataRange result120 = testSubject0.visit(_OWLFacetRestriction);
        OWLAxiom result121 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLAxiom result122 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLAxiom result123 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLAxiom result124 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLAxiom result125 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLAxiom result126 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLAxiom result127 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLAxiom result128 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLAxiom result129 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
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
        ManchesterSyntaxTool testSubject2 = new ManchesterSyntaxTool(_OWLOntology, _Collection, _boolean);
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
