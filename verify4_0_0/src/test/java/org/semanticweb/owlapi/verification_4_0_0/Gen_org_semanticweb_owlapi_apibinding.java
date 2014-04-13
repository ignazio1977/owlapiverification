package org.semanticweb.owlapi.verification_4_0_0;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_apibinding {
    @Test
    public void enforceInterfacesOWLFunctionalSyntaxFactory() {
    }

    public void verifyOWLFunctionalSyntaxFactory() throws OWLOntologyCreationException {
        OWLFunctionalSyntaxFactory testSubject0 = new OWLFunctionalSyntaxFactory();
        OWLLiteral result0 = OWLFunctionalSyntaxFactory.PlainLiteral(_String);
        OWLDatatype result1 = OWLFunctionalSyntaxFactory.PlainLiteral();
        OWLDeclarationAxiom result2 = OWLFunctionalSyntaxFactory.Declaration(_OWLEntity, _Set);
        OWLDeclarationAxiom result3 = OWLFunctionalSyntaxFactory.Declaration(_OWLEntity);
        OWLEquivalentClassesAxiom result4 = OWLFunctionalSyntaxFactory.EquivalentClasses(_Set, _OWLClassExpression_array);
        OWLEquivalentClassesAxiom result5 = OWLFunctionalSyntaxFactory.EquivalentClasses(_OWLClassExpression_array);
        OWLSubClassOfAxiom result6 = OWLFunctionalSyntaxFactory.SubClassOf(_OWLClassExpression, _OWLClassExpression, _Set);
        OWLSubClassOfAxiom result7 = OWLFunctionalSyntaxFactory.SubClassOf(_OWLClassExpression, _OWLClassExpression);
        OWLDisjointClassesAxiom result8 = OWLFunctionalSyntaxFactory.DisjointClasses(_Set5);
        OWLDisjointClassesAxiom result9 = OWLFunctionalSyntaxFactory.DisjointClasses(_OWLClassExpression_array);
        OWLDisjointClassesAxiom result10 = OWLFunctionalSyntaxFactory.DisjointClasses(_Set, _OWLClassExpression_array);
        OWLDisjointClassesAxiom result11 = OWLFunctionalSyntaxFactory.DisjointClasses(_Set6, _Set);
        OWLDisjointUnionAxiom result12 = OWLFunctionalSyntaxFactory.DisjointUnion(_OWLClass, _OWLClassExpression_array);
        OWLClassAssertionAxiom result13 = OWLFunctionalSyntaxFactory.ClassAssertion(_OWLClassExpression, _OWLIndividual);
        OWLClassAssertionAxiom result14 = OWLFunctionalSyntaxFactory.ClassAssertion(_OWLClassExpression, _OWLIndividual, _Set);
        OWLSameIndividualAxiom result15 = OWLFunctionalSyntaxFactory.SameIndividual(_OWLIndividual_array);
        OWLDifferentIndividualsAxiom result16 = OWLFunctionalSyntaxFactory.DifferentIndividuals(_OWLIndividual_array);
        OWLObjectPropertyAssertionAxiom result17 = OWLFunctionalSyntaxFactory.ObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual, _Set);
        OWLObjectPropertyAssertionAxiom result18 = OWLFunctionalSyntaxFactory.ObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLDataPropertyAssertionAxiom result19 = OWLFunctionalSyntaxFactory.DataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLDataPropertyAssertionAxiom result20 = OWLFunctionalSyntaxFactory.DataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set);
        OWLEquivalentObjectPropertiesAxiom result21 = OWLFunctionalSyntaxFactory.EquivalentObjectProperties(_Set, _OWLObjectPropertyExpression_array);
        OWLEquivalentObjectPropertiesAxiom result22 = OWLFunctionalSyntaxFactory.EquivalentObjectProperties(_OWLObjectPropertyExpression_array);
        OWLSubObjectPropertyOfAxiom result23 = OWLFunctionalSyntaxFactory.SubObjectPropertyOf(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set);
        OWLSubObjectPropertyOfAxiom result24 = OWLFunctionalSyntaxFactory.SubObjectPropertyOf(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLInverseObjectPropertiesAxiom result25 = OWLFunctionalSyntaxFactory.InverseObjectProperties(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result26 = OWLFunctionalSyntaxFactory.InverseFunctionalObjectProperty(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result27 = OWLFunctionalSyntaxFactory.InverseFunctionalObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLSymmetricObjectPropertyAxiom result28 = OWLFunctionalSyntaxFactory.SymmetricObjectProperty(_OWLObjectPropertyExpression);
        OWLSymmetricObjectPropertyAxiom result29 = OWLFunctionalSyntaxFactory.SymmetricObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLAsymmetricObjectPropertyAxiom result30 = OWLFunctionalSyntaxFactory.AsymmetricObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLAsymmetricObjectPropertyAxiom result31 = OWLFunctionalSyntaxFactory.AsymmetricObjectProperty(_OWLObjectPropertyExpression);
        OWLTransitiveObjectPropertyAxiom result32 = OWLFunctionalSyntaxFactory.TransitiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLTransitiveObjectPropertyAxiom result33 = OWLFunctionalSyntaxFactory.TransitiveObjectProperty(_OWLObjectPropertyExpression);
        OWLReflexiveObjectPropertyAxiom result34 = OWLFunctionalSyntaxFactory.ReflexiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLReflexiveObjectPropertyAxiom result35 = OWLFunctionalSyntaxFactory.ReflexiveObjectProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyDomainAxiom result36 = OWLFunctionalSyntaxFactory.ObjectPropertyDomain(_OWLObjectPropertyExpression, _OWLClassExpression, _Set);
        OWLObjectPropertyDomainAxiom result37 = OWLFunctionalSyntaxFactory.ObjectPropertyDomain(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result38 = OWLFunctionalSyntaxFactory.ObjectPropertyRange(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result39 = OWLFunctionalSyntaxFactory.ObjectPropertyRange(_OWLObjectPropertyExpression, _OWLClassExpression, _Set);
        OWLDisjointObjectPropertiesAxiom result40 = OWLFunctionalSyntaxFactory.DisjointObjectProperties(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result41 = OWLFunctionalSyntaxFactory.DisjointObjectProperties(_Set, _OWLObjectPropertyExpression_array);
        OWLSubPropertyChainOfAxiom result42 = OWLFunctionalSyntaxFactory.SubPropertyChainOf(_List, _OWLObjectPropertyExpression, _Set);
        OWLSubPropertyChainOfAxiom result43 = OWLFunctionalSyntaxFactory.SubPropertyChainOf(_List, _OWLObjectPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result44 = OWLFunctionalSyntaxFactory.EquivalentDataProperties(_Set, _OWLDataPropertyExpression_array);
        OWLEquivalentDataPropertiesAxiom result45 = OWLFunctionalSyntaxFactory.EquivalentDataProperties(_OWLDataPropertyExpression_array);
        OWLSubDataPropertyOfAxiom result46 = OWLFunctionalSyntaxFactory.SubDataPropertyOf(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set);
        OWLSubDataPropertyOfAxiom result47 = OWLFunctionalSyntaxFactory.SubDataPropertyOf(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLDataPropertyDomainAxiom result48 = OWLFunctionalSyntaxFactory.DataPropertyDomain(_OWLDataPropertyExpression, _OWLClassExpression, _Set);
        OWLDataPropertyDomainAxiom result49 = OWLFunctionalSyntaxFactory.DataPropertyDomain(_OWLDataPropertyExpression, _OWLClassExpression);
        OWLDataPropertyRangeAxiom result50 = OWLFunctionalSyntaxFactory.DataPropertyRange(_OWLDataPropertyExpression, _OWLDataRange, _Set);
        OWLDataPropertyRangeAxiom result51 = OWLFunctionalSyntaxFactory.DataPropertyRange(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDisjointDataPropertiesAxiom result52 = OWLFunctionalSyntaxFactory.DisjointDataProperties(_Set, _OWLDataPropertyExpression_array);
        OWLDisjointDataPropertiesAxiom result53 = OWLFunctionalSyntaxFactory.DisjointDataProperties(_OWLDataPropertyExpression_array);
        OWLDatatypeDefinitionAxiom result54 = OWLFunctionalSyntaxFactory.DatatypeDefinition(_OWLDatatype, _OWLDataRange);
        OWLHasKeyAxiom result55 = OWLFunctionalSyntaxFactory.HasKey(_OWLClassExpression, _OWLPropertyExpression_array);
        OWLHasKeyAxiom result56 = OWLFunctionalSyntaxFactory.HasKey(_Set, _OWLClassExpression, _OWLPropertyExpression_array);
        OWLAnnotationAssertionAxiom result57 = OWLFunctionalSyntaxFactory.AnnotationAssertion(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue);
        OWLSubAnnotationPropertyOfAxiom result58 = OWLFunctionalSyntaxFactory.SubAnnotationPropertyOf(_OWLAnnotationProperty, _OWLAnnotationProperty);
        OWLAnnotationPropertyDomainAxiom result59 = OWLFunctionalSyntaxFactory.AnnotationPropertyDomain(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyDomainAxiom result60 = OWLFunctionalSyntaxFactory.AnnotationPropertyDomain(_OWLAnnotationProperty, _String);
        OWLDataProperty result61 = OWLFunctionalSyntaxFactory.DataProperty(_IRI);
        OWLDataProperty result62 = OWLFunctionalSyntaxFactory.DataProperty(_String, _PrefixManager);
        OWLClass result63 = OWLFunctionalSyntaxFactory.Class(_IRI);
        OWLClass result64 = OWLFunctionalSyntaxFactory.Class(_String, _PrefixManager);
        OWLOntology result65 = OWLFunctionalSyntaxFactory.Ontology(_OWLOntologyManager, _OWLAxiom_array);
        OWLObjectProperty result66 = OWLFunctionalSyntaxFactory.ObjectProperty(_String, _PrefixManager);
        OWLObjectProperty result67 = OWLFunctionalSyntaxFactory.ObjectProperty(_IRI);
        OWLAnnotationProperty result68 = OWLFunctionalSyntaxFactory.AnnotationProperty(_String, _PrefixManager);
        OWLAnnotationProperty result69 = OWLFunctionalSyntaxFactory.AnnotationProperty(_IRI);
        OWLAnnotation result70 = OWLFunctionalSyntaxFactory.Annotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        OWLNamedIndividual result71 = OWLFunctionalSyntaxFactory.NamedIndividual(_String, _PrefixManager);
        OWLNamedIndividual result72 = OWLFunctionalSyntaxFactory.NamedIndividual(_IRI);
        OWLDatatype result73 = OWLFunctionalSyntaxFactory.Datatype(_IRI);
        OWLLiteral result74 = OWLFunctionalSyntaxFactory.Literal(_String, _OWL2Datatype);
        OWLLiteral result75 = OWLFunctionalSyntaxFactory.Literal(_String);
        OWLLiteral result76 = OWLFunctionalSyntaxFactory.Literal(_String, _OWLDatatype);
        OWLLiteral result77 = OWLFunctionalSyntaxFactory.Literal(_double);
        OWLLiteral result78 = OWLFunctionalSyntaxFactory.Literal(_String, _String);
        OWLLiteral result79 = OWLFunctionalSyntaxFactory.Literal(_float);
        OWLLiteral result80 = OWLFunctionalSyntaxFactory.Literal(_int);
        OWLLiteral result81 = OWLFunctionalSyntaxFactory.Literal(_boolean);
        OWLNegativeObjectPropertyAssertionAxiom result82 = OWLFunctionalSyntaxFactory.NegativeObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual,
                _Set);
        OWLNegativeObjectPropertyAssertionAxiom result83 = OWLFunctionalSyntaxFactory.NegativeObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeDataPropertyAssertionAxiom result84 = OWLFunctionalSyntaxFactory.NegativeDataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set);
        OWLNegativeDataPropertyAssertionAxiom result85 = OWLFunctionalSyntaxFactory.NegativeDataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLFunctionalDataPropertyAxiom result86 = OWLFunctionalSyntaxFactory.FunctionalDataProperty(_OWLDataPropertyExpression);
        OWLFunctionalDataPropertyAxiom result87 = OWLFunctionalSyntaxFactory.FunctionalDataProperty(_OWLDataPropertyExpression, _Set);
        OWLFunctionalObjectPropertyAxiom result88 = OWLFunctionalSyntaxFactory.FunctionalObjectProperty(_OWLObjectPropertyExpression);
        OWLFunctionalObjectPropertyAxiom result89 = OWLFunctionalSyntaxFactory.FunctionalObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLAnnotationProperty result90 = OWLFunctionalSyntaxFactory.RDFSComment();
        OWLDatatype result91 = OWLFunctionalSyntaxFactory.Float();
        OWLImportsDeclaration result92 = OWLFunctionalSyntaxFactory.ImportsDeclaration(_IRI);
        OWLAnnotationProperty result93 = OWLFunctionalSyntaxFactory.RDFSLabel();
        OWLDatatype result94 = OWLFunctionalSyntaxFactory.TopDatatype();
        OWLClass result95 = OWLFunctionalSyntaxFactory.OWLThing();
        OWLDatatype result96 = OWLFunctionalSyntaxFactory.Integer();
        OWLDatatype result97 = OWLFunctionalSyntaxFactory.Double();
        OWLDatatype result98 = OWLFunctionalSyntaxFactory.Boolean();
        OWLClass result99 = OWLFunctionalSyntaxFactory.OWLNothing();
        OWLObjectSomeValuesFrom result100 = OWLFunctionalSyntaxFactory.ObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectAllValuesFrom result101 = OWLFunctionalSyntaxFactory.ObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMinCardinality result102 = OWLFunctionalSyntaxFactory.ObjectMinCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result103 = OWLFunctionalSyntaxFactory.ObjectMaxCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result104 = OWLFunctionalSyntaxFactory.ObjectExactCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectHasValue result105 = OWLFunctionalSyntaxFactory.ObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObjectHasSelf result106 = OWLFunctionalSyntaxFactory.ObjectHasSelf(_OWLObjectPropertyExpression);
        OWLDataSomeValuesFrom result107 = OWLFunctionalSyntaxFactory.DataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataAllValuesFrom result108 = OWLFunctionalSyntaxFactory.DataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result109 = OWLFunctionalSyntaxFactory.DataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMaxCardinality result110 = OWLFunctionalSyntaxFactory.DataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result111 = OWLFunctionalSyntaxFactory.DataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataHasValue result112 = OWLFunctionalSyntaxFactory.DataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObjectIntersectionOf result113 = OWLFunctionalSyntaxFactory.ObjectIntersectionOf(_OWLClassExpression_array);
        OWLObjectUnionOf result114 = OWLFunctionalSyntaxFactory.ObjectUnionOf(_OWLClassExpression_array);
        OWLObjectComplementOf result115 = OWLFunctionalSyntaxFactory.ObjectComplementOf(_OWLClassExpression);
        OWLObjectOneOf result116 = OWLFunctionalSyntaxFactory.ObjectOneOf(_OWLIndividual_array);
        OWLAnonymousIndividual result117 = OWLFunctionalSyntaxFactory.AnonymousIndividual(_String);
        OWLAnonymousIndividual result118 = OWLFunctionalSyntaxFactory.AnonymousIndividual();
        OWLObjectInverseOf result119 = OWLFunctionalSyntaxFactory.ObjectInverseOf(_OWLObjectPropertyExpression);
        OWLFacetRestriction result120 = OWLFunctionalSyntaxFactory.FacetRestriction(_OWLFacet, _OWLLiteral);
        OWLIrreflexiveObjectPropertyAxiom result121 = OWLFunctionalSyntaxFactory.IrreflexiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLIrreflexiveObjectPropertyAxiom result122 = OWLFunctionalSyntaxFactory.IrreflexiveObjectProperty(_OWLObjectPropertyExpression);
        OWLAnnotationPropertyRangeAxiom result123 = OWLFunctionalSyntaxFactory.AnnotationPropertyRange(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyRangeAxiom result124 = OWLFunctionalSyntaxFactory.AnnotationPropertyRange(_OWLAnnotationProperty, _String);
        OWLDataOneOf result125 = OWLFunctionalSyntaxFactory.DataOneOf(_OWLLiteral_array);
        OWLDatatypeRestriction result126 = OWLFunctionalSyntaxFactory.DatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        OWLDataComplementOf result127 = OWLFunctionalSyntaxFactory.DataComplementOf(_OWLDataRange);
        OWLDataUnionOf result128 = OWLFunctionalSyntaxFactory.DataUnionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result129 = OWLFunctionalSyntaxFactory.DataIntersectionOf(_OWLDataRange_array);
        IRI result130 = OWLFunctionalSyntaxFactory.IRI(_String);
        IRI result131 = OWLFunctionalSyntaxFactory.IRI(_String, _String);
    }

    @Test
    public void enforceInterfacesOWLManager() {
    }

    public void verifyOWLManager() {
        OWLManager testSubject0 = new OWLManager();
        OWLDataFactory result0 = OWLManager.getOWLDataFactory();
        OWLOntologyManager result1 = OWLManager.createOWLOntologyManager();
    }

    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private java.lang.String _String;
    private java.util.List<? extends OWLObjectPropertyExpression> _List;
    private java.util.Set<? extends OWLClassExpression> _Set5;
    private java.util.Set<OWLAnnotation> _Set;
    private java.util.Set<OWLClassExpression> _Set6;
    private IRI _IRI;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationSubject _OWLAnnotationSubject;
    private OWLAnnotationValue _OWLAnnotationValue;
    private OWLAxiom[] _OWLAxiom_array;
    private OWLClass _OWLClass;
    private OWLClassExpression _OWLClassExpression;
    private OWLClassExpression[] _OWLClassExpression_array;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLDataPropertyExpression[] _OWLDataPropertyExpression_array;
    private OWLDataRange _OWLDataRange;
    private OWLDataRange[] _OWLDataRange_array;
    private OWLDatatype _OWLDatatype;
    private OWLEntity _OWLEntity;
    private OWLFacetRestriction[] _OWLFacetRestriction_array;
    private OWLIndividual _OWLIndividual;
    private OWLIndividual[] _OWLIndividual_array;
    private OWLLiteral _OWLLiteral;
    private OWLLiteral[] _OWLLiteral_array;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectPropertyExpression[] _OWLObjectPropertyExpression_array;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLPropertyExpression[] _OWLPropertyExpression_array;
    private PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
