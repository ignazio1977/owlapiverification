package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.macro.AbstractMacroExpansionVisitor;
import org.obolibrary.macro.MacroExpansionGCIVisitor;
import org.obolibrary.macro.MacroExpansionVisitor;
import org.obolibrary.macro.ManchesterSyntaxTool;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_macro {
    @Test
    public void enforceInterfacesAbstractMacroExpansionVisitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx.class
                .isAssignableFrom(AbstractMacroExpansionVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataVisitorEx.class
                .isAssignableFrom(AbstractMacroExpansionVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitorEx.class
                .isAssignableFrom(AbstractMacroExpansionVisitor.class));
    }

    public void verifyAbstractMacroExpansionVisitor() throws Exception {
        AbstractMacroExpansionVisitor testSubject0 = new AbstractMacroExpansionVisitor(
                _OWLOntology, mock(Logger.class)) {
            @Override
            protected OWLClassExpression expandOWLObjSomeVal(OWLClassExpression filler,
                    OWLObjectPropertyExpression p) {
                return null;
            }

            @Override
            protected OWLClassExpression expandOWLObjHasVal(OWLObjectHasValue desc,
                    OWLIndividual filler, OWLObjectPropertyExpression p) {
                return null;
            }
        };
        java.lang.Object result0 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result1 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result2 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result4 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result5 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result9 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result10 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Object result11 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Object result12 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result13 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result14 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result15 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result17 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result18 = testSubject0.visit(_SWRLRule);
        java.lang.Object result19 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result20 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Object result21 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result22 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result23 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result24 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result25 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result26 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result27 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result28 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result29 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result30 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result31 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result32 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result33 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Object result34 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Object result35 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Object result36 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Object result37 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Object result38 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Object result39 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Object result40 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Object result41 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Object result42 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Object result43 = testSubject0.visit(_OWLObjectUnionOf);
        java.lang.Object result44 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Object result45 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Object result46 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Object result47 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Object result48 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Object result49 = testSubject0.visit(_OWLClass);
        java.lang.Object result50 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result51 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result52 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result53 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Object result54 = testSubject0.visit(_OWLDatatype);
        java.lang.Object result55 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Object result56 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Object result57 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result58 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result59 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Object result60 = testSubject0.visit(_OWLDataIntersectionOf);
        java.lang.Object result61 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result62 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result63 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Object result64 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result65 = testSubject0
                .visit(_OWLDataPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result66 = testSubject0
                .visit(_OWLObjectPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result67 = testSubject0
                .visit(_OWLObjectPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result68 = testSubject0
                .visit(_OWLDisjointUnionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result69 = testSubject0
                .visit(_OWLDataPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLDataRange result70 = testSubject0
                .visit(_OWLDataIntersectionOf);
        org.semanticweb.owlapi.model.OWLDataRange result71 = testSubject0
                .visit(_OWLDataUnionOf);
        org.semanticweb.owlapi.model.OWLAxiom result72 = testSubject0
                .visit(_OWLSubClassOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result73 = testSubject0
                .visit(_OWLDisjointClassesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result74 = testSubject0
                .visit(_OWLObjectOneOf);
        org.semanticweb.owlapi.model.OWLDataRange result75 = testSubject0
                .visit(_OWLDatatype);
        org.semanticweb.owlapi.model.OWLDataRange result76 = testSubject0
                .visit(_OWLDataComplementOf);
        org.semanticweb.owlapi.model.OWLAxiom result77 = testSubject0
                .visit(_OWLHasKeyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result78 = testSubject0
                .visit(_OWLClassAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result79 = testSubject0
                .visit(_OWLEquivalentClassesAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result80 = testSubject0
                .visit(_OWLClass);
        org.semanticweb.owlapi.model.OWLClassExpression result81 = testSubject0
                .visit(_OWLObjectHasSelf);
        org.semanticweb.owlapi.model.OWLClassExpression result82 = testSubject0
                .visit(_OWLObjectHasValue);
        org.semanticweb.owlapi.model.OWLClassExpression result83 = testSubject0
                .visit(_OWLObjectAllValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result84 = testSubject0
                .visit(_OWLObjectMinCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result85 = testSubject0
                .visit(_OWLObjectExactCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result86 = testSubject0
                .visit(_OWLObjectIntersectionOf);
        org.semanticweb.owlapi.model.OWLClassExpression result87 = testSubject0
                .visit(_OWLObjectUnionOf);
        org.semanticweb.owlapi.model.OWLClassExpression result88 = testSubject0
                .visit(_OWLObjectComplementOf);
        org.semanticweb.owlapi.model.OWLClassExpression result89 = testSubject0
                .visit(_OWLObjectSomeValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result90 = testSubject0
                .visit(_OWLDataExactCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result91 = testSubject0
                .visit(_OWLDataMaxCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result92 = testSubject0
                .visit(_OWLDataMinCardinality);
        org.semanticweb.owlapi.model.OWLDataRange result93 = testSubject0
                .visit(_OWLDataOneOf);
        org.semanticweb.owlapi.model.OWLClassExpression result94 = testSubject0
                .visit(_OWLObjectMaxCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result95 = testSubject0
                .visit(_OWLDataSomeValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result96 = testSubject0
                .visit(_OWLDataAllValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result97 = testSubject0
                .visit(_OWLDataHasValue);
        org.semanticweb.owlapi.model.OWLAxiom result98 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result99 = testSubject0
                .visit(_OWLSubDataPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result100 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result101 = testSubject0
                .visit(_OWLSameIndividualAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result102 = testSubject0
                .visit(_OWLFunctionalDataPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result103 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result104 = testSubject0
                .visit(_OWLDataPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result105 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result106 = testSubject0
                .visit(_OWLAnnotationPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result107 = testSubject0
                .visit(_OWLSubAnnotationPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result108 = testSubject0
                .visit(_OWLDatatypeDefinitionAxiom);
        org.semanticweb.owlapi.model.OWLDataRange result109 = testSubject0
                .visit(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLAxiom result110 = testSubject0
                .visit(_OWLSubPropertyChainOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result111 = testSubject0
                .visit(_OWLInverseObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result112 = testSubject0.visit(_SWRLRule);
        org.semanticweb.owlapi.model.OWLAxiom result113 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result114 = testSubject0
                .visit(_OWLReflexiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result115 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result116 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result117 = testSubject0
                .visit(_OWLDifferentIndividualsAxiom);
        org.semanticweb.owlapi.model.OWLDataRange result118 = testSubject0
                .visit(_OWLDatatypeRestriction);
        org.semanticweb.owlapi.model.OWLDataRange result119 = testSubject0
                .visit(_OWLFacetRestriction);
        org.semanticweb.owlapi.model.OWLAxiom result120 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result121 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result122 = testSubject0
                .visit(_OWLSubObjectPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result123 = testSubject0
                .visit(_OWLDeclarationAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result124 = testSubject0
                .visit(_OWLAnnotationAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result125 = testSubject0
                .visit(_OWLSymmetricObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result126 = testSubject0
                .visit(_OWLDisjointDataPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result127 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result128 = testSubject0
                .visit(_OWLObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result129 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
    }

    public void verifyMacroExpansionGCIVisitor() throws Exception {
        MacroExpansionGCIVisitor testSubject0 = new MacroExpansionGCIVisitor(
                _OWLOntology, _OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0
                .createGCIOntology();
        testSubject0.dispose();
    }

    public void verifyMacroExpansionVisitor() throws Exception {
        MacroExpansionVisitor testSubject0 = new MacroExpansionVisitor(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.expandAll();
        testSubject0.dispose();
    }

    public void verifyManchesterSyntaxTool() throws Exception {
        ManchesterSyntaxTool testSubject0 = new ManchesterSyntaxTool(_OWLOntology,
                _Collection);
        ManchesterSyntaxTool testSubject1 = new ManchesterSyntaxTool(_OWLOntology);
        ManchesterSyntaxTool testSubject2 = new ManchesterSyntaxTool(_OWLOntology,
                _Collection, _boolean);
        java.lang.String result0 = testSubject0.getId(_OWLEntity);
        java.lang.String result1 = testSubject0.getId(_IRI);
        java.util.Set<org.coode.owlapi.manchesterowlsyntax.OntologyAxiomPair> result2 = testSubject0
                .parseManchesterExpressionFrames(_String);
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .parseManchesterExpression(_String);
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.lang.String _String;
    private java.util.Collection<org.semanticweb.owlapi.model.OWLOntology> _Collection;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataComplementOf _OWLDataComplementOf;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataHasValue _OWLDataHasValue;
    private org.semanticweb.owlapi.model.OWLDataIntersectionOf _OWLDataIntersectionOf;
    private org.semanticweb.owlapi.model.OWLDataMaxCardinality _OWLDataMaxCardinality;
    private org.semanticweb.owlapi.model.OWLDataMinCardinality _OWLDataMinCardinality;
    private org.semanticweb.owlapi.model.OWLDataOneOf _OWLDataOneOf;
    private org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataUnionOf _OWLDataUnionOf;
    private org.semanticweb.owlapi.model.OWLDatatype _OWLDatatype;
    private org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private org.semanticweb.owlapi.model.OWLDatatypeRestriction _OWLDatatypeRestriction;
    private org.semanticweb.owlapi.model.OWLDeclarationAxiom _OWLDeclarationAxiom;
    private org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private org.semanticweb.owlapi.model.OWLEntity _OWLEntity;
    private org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLFacetRestriction _OWLFacetRestriction;
    private org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLHasKeyAxiom _OWLHasKeyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectComplementOf _OWLObjectComplementOf;
    private org.semanticweb.owlapi.model.OWLObjectExactCardinality _OWLObjectExactCardinality;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectHasValue _OWLObjectHasValue;
    private org.semanticweb.owlapi.model.OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private org.semanticweb.owlapi.model.OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private org.semanticweb.owlapi.model.OWLObjectMinCardinality _OWLObjectMinCardinality;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectUnionOf _OWLObjectUnionOf;
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
}
