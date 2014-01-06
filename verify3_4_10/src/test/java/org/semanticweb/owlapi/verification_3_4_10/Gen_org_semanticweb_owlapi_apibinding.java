package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_apibinding {
    

    public void verifyOWLFunctionalSyntaxFactory() throws Exception {
        OWLFunctionalSyntaxFactory testSubject0 = new OWLFunctionalSyntaxFactory();
        org.semanticweb.owlapi.model.OWLImportsDeclaration result0 = OWLFunctionalSyntaxFactory
                .ImportsDeclaration(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result1 = OWLFunctionalSyntaxFactory
                .RDFSComment();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result2 = OWLFunctionalSyntaxFactory
                .RDFSLabel();
        org.semanticweb.owlapi.model.OWLDatatype result3 = OWLFunctionalSyntaxFactory
                .TopDatatype();
        org.semanticweb.owlapi.model.OWLClass result4 = OWLFunctionalSyntaxFactory
                .OWLThing();
        org.semanticweb.owlapi.model.OWLDatatype result5 = OWLFunctionalSyntaxFactory
                .Integer();
        org.semanticweb.owlapi.model.OWLDatatype result6 = OWLFunctionalSyntaxFactory
                .Double();
        org.semanticweb.owlapi.model.OWLDatatype result7 = OWLFunctionalSyntaxFactory
                .Float();
        org.semanticweb.owlapi.model.OWLDatatype result8 = OWLFunctionalSyntaxFactory
                .Boolean();
        org.semanticweb.owlapi.model.OWLClass result9 = OWLFunctionalSyntaxFactory
                .OWLNothing();
        org.semanticweb.owlapi.model.OWLDatatype result10 = OWLFunctionalSyntaxFactory
                .PlainLiteral();
        org.semanticweb.owlapi.model.OWLLiteral result11 = OWLFunctionalSyntaxFactory
                .PlainLiteral(_String);
        org.semanticweb.owlapi.model.OWLClass result12 = OWLFunctionalSyntaxFactory
                .Class(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLClass result13 = OWLFunctionalSyntaxFactory
                .Class(_IRI);
        org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom result14 = OWLFunctionalSyntaxFactory
                .ObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectAllValuesFrom result15 = OWLFunctionalSyntaxFactory
                .ObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result16 = OWLFunctionalSyntaxFactory
                .ObjectMinCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result17 = OWLFunctionalSyntaxFactory
                .ObjectMaxCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result18 = OWLFunctionalSyntaxFactory
                .ObjectExactCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectHasValue result19 = OWLFunctionalSyntaxFactory
                .ObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLObjectHasSelf result20 = OWLFunctionalSyntaxFactory
                .ObjectHasSelf(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataSomeValuesFrom result21 = OWLFunctionalSyntaxFactory
                .DataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataAllValuesFrom result22 = OWLFunctionalSyntaxFactory
                .DataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result23 = OWLFunctionalSyntaxFactory
                .DataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result24 = OWLFunctionalSyntaxFactory
                .DataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result25 = OWLFunctionalSyntaxFactory
                .DataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataHasValue result26 = OWLFunctionalSyntaxFactory
                .DataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLObjectIntersectionOf result27 = OWLFunctionalSyntaxFactory
                .ObjectIntersectionOf(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLObjectUnionOf result28 = OWLFunctionalSyntaxFactory
                .ObjectUnionOf(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLObjectComplementOf result29 = OWLFunctionalSyntaxFactory
                .ObjectComplementOf(_OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectOneOf result30 = OWLFunctionalSyntaxFactory
                .ObjectOneOf(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLDatatype result31 = OWLFunctionalSyntaxFactory
                .Datatype(_IRI);
        org.semanticweb.owlapi.model.OWLDataOneOf result32 = OWLFunctionalSyntaxFactory
                .DataOneOf(_OWLLiteral_array);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result33 = OWLFunctionalSyntaxFactory
                .DatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        org.semanticweb.owlapi.model.OWLDataComplementOf result34 = OWLFunctionalSyntaxFactory
                .DataComplementOf(_OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataUnionOf result35 = OWLFunctionalSyntaxFactory
                .DataUnionOf(_OWLDataRange_array);
        org.semanticweb.owlapi.model.OWLDataIntersectionOf result36 = OWLFunctionalSyntaxFactory
                .DataIntersectionOf(_OWLDataRange_array);
        org.semanticweb.owlapi.model.OWLObjectProperty result37 = OWLFunctionalSyntaxFactory
                .ObjectProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLObjectProperty result38 = OWLFunctionalSyntaxFactory
                .ObjectProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result39 = OWLFunctionalSyntaxFactory
                .DataProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result40 = OWLFunctionalSyntaxFactory
                .DataProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result41 = OWLFunctionalSyntaxFactory
                .AnnotationProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result42 = OWLFunctionalSyntaxFactory
                .AnnotationProperty(_IRI);
        org.semanticweb.owlapi.model.OWLNamedIndividual result43 = OWLFunctionalSyntaxFactory
                .NamedIndividual(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLNamedIndividual result44 = OWLFunctionalSyntaxFactory
                .NamedIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result45 = OWLFunctionalSyntaxFactory
                .Ontology(_OWLOntologyManager, _OWLAxiom_array);
        org.semanticweb.owlapi.model.OWLAnnotation result46 = OWLFunctionalSyntaxFactory
                .Annotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        org.semanticweb.owlapi.model.OWLLiteral result47 = OWLFunctionalSyntaxFactory
                .Literal(_String);
        org.semanticweb.owlapi.model.OWLLiteral result48 = OWLFunctionalSyntaxFactory
                .Literal(_String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result49 = OWLFunctionalSyntaxFactory
                .Literal(_int);
        org.semanticweb.owlapi.model.OWLLiteral result50 = OWLFunctionalSyntaxFactory
                .Literal(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result51 = OWLFunctionalSyntaxFactory
                .Literal(_String, _String);
        org.semanticweb.owlapi.model.OWLLiteral result52 = OWLFunctionalSyntaxFactory
                .Literal(_double);
        org.semanticweb.owlapi.model.OWLLiteral result53 = OWLFunctionalSyntaxFactory
                .Literal(_float);
        org.semanticweb.owlapi.model.OWLLiteral result54 = OWLFunctionalSyntaxFactory
                .Literal(_String, _OWL2Datatype);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result55 = OWLFunctionalSyntaxFactory
                .Declaration(_OWLEntity, _Set);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result56 = OWLFunctionalSyntaxFactory
                .Declaration(_OWLEntity);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result57 = OWLFunctionalSyntaxFactory
                .EquivalentClasses(_Set, _OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result58 = OWLFunctionalSyntaxFactory
                .EquivalentClasses(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result59 = OWLFunctionalSyntaxFactory
                .SubClassOf(_OWLClassExpression, _OWLClassExpression, _Set);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result60 = OWLFunctionalSyntaxFactory
                .SubClassOf(_OWLClassExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result61 = OWLFunctionalSyntaxFactory
                .DisjointClasses(_Set26);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result62 = OWLFunctionalSyntaxFactory
                .DisjointClasses(_Set, _OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result63 = OWLFunctionalSyntaxFactory
                .DisjointClasses(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result64 = OWLFunctionalSyntaxFactory
                .DisjointClasses(_Set27, _Set);
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result65 = OWLFunctionalSyntaxFactory
                .DisjointUnion(_OWLClass, _OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result66 = OWLFunctionalSyntaxFactory
                .ClassAssertion(_OWLClassExpression, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result67 = OWLFunctionalSyntaxFactory
                .ClassAssertion(_OWLClassExpression, _OWLIndividual, _Set);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result68 = OWLFunctionalSyntaxFactory
                .SameIndividual(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result69 = OWLFunctionalSyntaxFactory
                .DifferentIndividuals(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result70 = OWLFunctionalSyntaxFactory
                .ObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual,
                        _OWLIndividual, _Set);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result71 = OWLFunctionalSyntaxFactory
                .ObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual,
                        _OWLIndividual);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result72 = OWLFunctionalSyntaxFactory
                .NegativeObjectPropertyAssertion(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result73 = OWLFunctionalSyntaxFactory
                .NegativeObjectPropertyAssertion(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual, _Set);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result74 = OWLFunctionalSyntaxFactory
                .DataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual,
                        _OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result75 = OWLFunctionalSyntaxFactory
                .DataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual,
                        _OWLLiteral, _Set);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result76 = OWLFunctionalSyntaxFactory
                .NegativeDataPropertyAssertion(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral, _Set);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result77 = OWLFunctionalSyntaxFactory
                .NegativeDataPropertyAssertion(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result78 = OWLFunctionalSyntaxFactory
                .EquivalentObjectProperties(_OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result79 = OWLFunctionalSyntaxFactory
                .EquivalentObjectProperties(_Set, _OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result80 = OWLFunctionalSyntaxFactory
                .SubObjectPropertyOf(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result81 = OWLFunctionalSyntaxFactory
                .SubObjectPropertyOf(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result82 = OWLFunctionalSyntaxFactory
                .InverseObjectProperties(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result83 = OWLFunctionalSyntaxFactory
                .FunctionalObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result84 = OWLFunctionalSyntaxFactory
                .FunctionalObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result85 = OWLFunctionalSyntaxFactory
                .InverseFunctionalObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result86 = OWLFunctionalSyntaxFactory
                .InverseFunctionalObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result87 = OWLFunctionalSyntaxFactory
                .SymmetricObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result88 = OWLFunctionalSyntaxFactory
                .SymmetricObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result89 = OWLFunctionalSyntaxFactory
                .AsymmetricObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result90 = OWLFunctionalSyntaxFactory
                .AsymmetricObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result91 = OWLFunctionalSyntaxFactory
                .TransitiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result92 = OWLFunctionalSyntaxFactory
                .TransitiveObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result93 = OWLFunctionalSyntaxFactory
                .ReflexiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result94 = OWLFunctionalSyntaxFactory
                .ReflexiveObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result95 = OWLFunctionalSyntaxFactory
                .ObjectPropertyDomain(_OWLObjectPropertyExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result96 = OWLFunctionalSyntaxFactory
                .ObjectPropertyDomain(_OWLObjectPropertyExpression, _OWLClassExpression,
                        _Set);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result97 = OWLFunctionalSyntaxFactory
                .ObjectPropertyRange(_OWLObjectPropertyExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result98 = OWLFunctionalSyntaxFactory
                .ObjectPropertyRange(_OWLObjectPropertyExpression, _OWLClassExpression,
                        _Set);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result99 = OWLFunctionalSyntaxFactory
                .DisjointObjectProperties(_Set, _OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result100 = OWLFunctionalSyntaxFactory
                .DisjointObjectProperties(_OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result101 = OWLFunctionalSyntaxFactory
                .SubPropertyChainOf(_List, _OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result102 = OWLFunctionalSyntaxFactory
                .SubPropertyChainOf(_List, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result103 = OWLFunctionalSyntaxFactory
                .EquivalentDataProperties(_Set, _OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result104 = OWLFunctionalSyntaxFactory
                .EquivalentDataProperties(_OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result105 = OWLFunctionalSyntaxFactory
                .SubDataPropertyOf(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result106 = OWLFunctionalSyntaxFactory
                .SubDataPropertyOf(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result107 = OWLFunctionalSyntaxFactory
                .FunctionalDataProperty(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result108 = OWLFunctionalSyntaxFactory
                .FunctionalDataProperty(_OWLDataPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result109 = OWLFunctionalSyntaxFactory
                .DataPropertyDomain(_OWLDataPropertyExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result110 = OWLFunctionalSyntaxFactory
                .DataPropertyDomain(_OWLDataPropertyExpression, _OWLClassExpression, _Set);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result111 = OWLFunctionalSyntaxFactory
                .DataPropertyRange(_OWLDataPropertyExpression, _OWLDataRange, _Set);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result112 = OWLFunctionalSyntaxFactory
                .DataPropertyRange(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result113 = OWLFunctionalSyntaxFactory
                .DisjointDataProperties(_OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result114 = OWLFunctionalSyntaxFactory
                .DisjointDataProperties(_Set, _OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result115 = OWLFunctionalSyntaxFactory
                .HasKey(_Set, _OWLClassExpression, _OWLPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result116 = OWLFunctionalSyntaxFactory
                .HasKey(_OWLClassExpression, _OWLPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result117 = OWLFunctionalSyntaxFactory
                .AnnotationAssertion(_OWLAnnotationProperty, _OWLAnnotationSubject,
                        _OWLAnnotationValue);
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result118 = OWLFunctionalSyntaxFactory
                .SubAnnotationPropertyOf(_OWLAnnotationProperty, _OWLAnnotationProperty);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result119 = OWLFunctionalSyntaxFactory
                .AnnotationPropertyDomain(_OWLAnnotationProperty, _IRI);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result120 = OWLFunctionalSyntaxFactory
                .AnnotationPropertyDomain(_OWLAnnotationProperty, _String);
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result121 = OWLFunctionalSyntaxFactory
                .DatatypeDefinition(_OWLDatatype, _OWLDataRange);
        org.semanticweb.owlapi.model.IRI result122 = OWLFunctionalSyntaxFactory
                .IRI(_String);
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result123 = OWLFunctionalSyntaxFactory
                .AnonymousIndividual(_String);
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result124 = OWLFunctionalSyntaxFactory
                .AnonymousIndividual();
        org.semanticweb.owlapi.model.OWLObjectInverseOf result125 = OWLFunctionalSyntaxFactory
                .ObjectInverseOf(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLFacetRestriction result126 = OWLFunctionalSyntaxFactory
                .FacetRestriction(_OWLFacet, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result127 = OWLFunctionalSyntaxFactory
                .IrreflexiveObjectProperty(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result128 = OWLFunctionalSyntaxFactory
                .IrreflexiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result129 = OWLFunctionalSyntaxFactory
                .AnnotationPropertyRange(_OWLAnnotationProperty, _IRI);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result130 = OWLFunctionalSyntaxFactory
                .AnnotationPropertyRange(_OWLAnnotationProperty, _String);
    }

    @Test
    public void enforceInterfacesOWLManager() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyManagerFactory.class
                .isAssignableFrom(OWLManager.class));
    }

    public void verifyOWLManager() throws Exception {
        OWLManager testSubject0 = new OWLManager();
        org.semanticweb.owlapi.model.OWLDataFactory result0 = testSubject0.getFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result1 = testSubject0
                .buildOWLOntologyManager(_OWLDataFactory);
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .buildOWLOntologyManager();
        org.semanticweb.owlapi.model.OWLOntologyManager result3 = OWLManager
                .createOWLOntologyManager(_OWLDataFactory);
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = OWLManager
                .createOWLOntologyManager();
        org.semanticweb.owlapi.model.OWLDataFactory result5 = OWLManager
                .getOWLDataFactory();
    }

    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private java.lang.String _String;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _List;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLClassExpression> _Set26;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> _Set;
    private java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> _Set27;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnnotationSubject _OWLAnnotationSubject;
    private org.semanticweb.owlapi.model.OWLAnnotationValue _OWLAnnotationValue;
    private org.semanticweb.owlapi.model.OWLAxiom[] _OWLAxiom_array;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLClassExpression[] _OWLClassExpression_array;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression _OWLDataPropertyExpression;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression[] _OWLDataPropertyExpression_array;
    private org.semanticweb.owlapi.model.OWLDataRange _OWLDataRange;
    private org.semanticweb.owlapi.model.OWLDataRange[] _OWLDataRange_array;
    private org.semanticweb.owlapi.model.OWLDatatype _OWLDatatype;
    private org.semanticweb.owlapi.model.OWLEntity _OWLEntity;
    private org.semanticweb.owlapi.model.OWLFacetRestriction[] _OWLFacetRestriction_array;
    private org.semanticweb.owlapi.model.OWLIndividual _OWLIndividual;
    private org.semanticweb.owlapi.model.OWLIndividual[] _OWLIndividual_array;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLLiteral[] _OWLLiteral_array;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression[] _OWLObjectPropertyExpression_array;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>[] _OWLPropertyExpression_array;
    private org.semanticweb.owlapi.model.PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
