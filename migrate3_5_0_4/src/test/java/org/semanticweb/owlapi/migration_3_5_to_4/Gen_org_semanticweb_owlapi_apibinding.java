package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_apibinding {
    public void verifyOWLFunctionalSyntaxFactory() {
        OWLImportsDeclaration result0 = OWLFunctionalSyntaxFactory.ImportsDeclaration(_IRI);
        OWLAnnotationProperty result1 = OWLFunctionalSyntaxFactory.RDFSComment();
        OWLAnnotationProperty result2 = OWLFunctionalSyntaxFactory.RDFSLabel();
        OWLDatatype result3 = OWLFunctionalSyntaxFactory.TopDatatype();
        OWLClass result4 = OWLFunctionalSyntaxFactory.OWLThing();
        OWLDatatype result5 = OWLFunctionalSyntaxFactory.Integer();
        OWLDatatype result6 = OWLFunctionalSyntaxFactory.Double();
        OWLDatatype result7 = OWLFunctionalSyntaxFactory.Float();
        OWLDatatype result8 = OWLFunctionalSyntaxFactory.Boolean();
        OWLClass result9 = OWLFunctionalSyntaxFactory.OWLNothing();
        OWLDatatype result10 = OWLFunctionalSyntaxFactory.PlainLiteral();
        OWLLiteral result11 = OWLFunctionalSyntaxFactory.PlainLiteral(_String);
        OWLClass result12 = OWLFunctionalSyntaxFactory.Class(_String, _PrefixManager);
        OWLClass result13 = OWLFunctionalSyntaxFactory.Class(_IRI);
        OWLObjectSomeValuesFrom result14 = OWLFunctionalSyntaxFactory.ObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectAllValuesFrom result15 = OWLFunctionalSyntaxFactory.ObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMinCardinality result16 = OWLFunctionalSyntaxFactory.ObjectMinCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result17 = OWLFunctionalSyntaxFactory.ObjectMaxCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result18 = OWLFunctionalSyntaxFactory.ObjectExactCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectHasValue result19 = OWLFunctionalSyntaxFactory.ObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObjectHasSelf result20 = OWLFunctionalSyntaxFactory.ObjectHasSelf(_OWLObjectPropertyExpression);
        OWLDataSomeValuesFrom result21 = OWLFunctionalSyntaxFactory.DataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataAllValuesFrom result22 = OWLFunctionalSyntaxFactory.DataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result23 = OWLFunctionalSyntaxFactory.DataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMaxCardinality result24 = OWLFunctionalSyntaxFactory.DataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result25 = OWLFunctionalSyntaxFactory.DataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataHasValue result26 = OWLFunctionalSyntaxFactory.DataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObjectIntersectionOf result27 = OWLFunctionalSyntaxFactory.ObjectIntersectionOf(_OWLClassExpression_array);
        OWLObjectUnionOf result28 = OWLFunctionalSyntaxFactory.ObjectUnionOf(_OWLClassExpression_array);
        OWLObjectComplementOf result29 = OWLFunctionalSyntaxFactory.ObjectComplementOf(_OWLClassExpression);
        OWLObjectOneOf result30 = OWLFunctionalSyntaxFactory.ObjectOneOf(_OWLIndividual_array);
        OWLDatatype result31 = OWLFunctionalSyntaxFactory.Datatype(_IRI);
        OWLDataOneOf result32 = OWLFunctionalSyntaxFactory.DataOneOf(_OWLLiteral_array);
        OWLDatatypeRestriction result33 = OWLFunctionalSyntaxFactory.DatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        OWLDataComplementOf result34 = OWLFunctionalSyntaxFactory.DataComplementOf(_OWLDataRange);
        OWLDataUnionOf result35 = OWLFunctionalSyntaxFactory.DataUnionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result36 = OWLFunctionalSyntaxFactory.DataIntersectionOf(_OWLDataRange_array);
        OWLObjectProperty result37 = OWLFunctionalSyntaxFactory.ObjectProperty(_String, _PrefixManager);
        OWLObjectProperty result38 = OWLFunctionalSyntaxFactory.ObjectProperty(_IRI);
        OWLDataProperty result39 = OWLFunctionalSyntaxFactory.DataProperty(_IRI);
        OWLDataProperty result40 = OWLFunctionalSyntaxFactory.DataProperty(_String, _PrefixManager);
        OWLAnnotationProperty result41 = OWLFunctionalSyntaxFactory.AnnotationProperty(_String, _PrefixManager);
        OWLAnnotationProperty result42 = OWLFunctionalSyntaxFactory.AnnotationProperty(_IRI);
        OWLNamedIndividual result43 = OWLFunctionalSyntaxFactory.NamedIndividual(_String, _PrefixManager);
        OWLNamedIndividual result44 = OWLFunctionalSyntaxFactory.NamedIndividual(_IRI);
        OWLOntology result45 = OWLFunctionalSyntaxFactory.Ontology(_OWLOntologyManager, _OWLAxiom_array);
        OWLAnnotation result46 = OWLFunctionalSyntaxFactory.Annotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        OWLLiteral result47 = OWLFunctionalSyntaxFactory.Literal(_String);
        OWLLiteral result48 = OWLFunctionalSyntaxFactory.Literal(_String, _OWLDatatype);
        OWLLiteral result49 = OWLFunctionalSyntaxFactory.Literal(_int);
        OWLLiteral result50 = OWLFunctionalSyntaxFactory.Literal(_boolean);
        OWLLiteral result51 = OWLFunctionalSyntaxFactory.Literal(_String, _String);
        OWLLiteral result52 = OWLFunctionalSyntaxFactory.Literal(_double);
        OWLLiteral result53 = OWLFunctionalSyntaxFactory.Literal(_float);
        OWLLiteral result54 = OWLFunctionalSyntaxFactory.Literal(_String, _OWL2Datatype);
        OWLDeclarationAxiom result55 = OWLFunctionalSyntaxFactory.Declaration(_OWLEntity, _Set);
        OWLDeclarationAxiom result56 = OWLFunctionalSyntaxFactory.Declaration(_OWLEntity);
        OWLEquivalentClassesAxiom result57 = OWLFunctionalSyntaxFactory.EquivalentClasses(_Set, _OWLClassExpression_array);
        OWLEquivalentClassesAxiom result58 = OWLFunctionalSyntaxFactory.EquivalentClasses(_OWLClassExpression_array);
        OWLSubClassOfAxiom result59 = OWLFunctionalSyntaxFactory.SubClassOf(_OWLClassExpression, _OWLClassExpression, _Set);
        OWLSubClassOfAxiom result60 = OWLFunctionalSyntaxFactory.SubClassOf(_OWLClassExpression, _OWLClassExpression);
        OWLDisjointClassesAxiom result61 = OWLFunctionalSyntaxFactory.DisjointClasses(_Set26);
        OWLDisjointClassesAxiom result62 = OWLFunctionalSyntaxFactory.DisjointClasses(_Set, _OWLClassExpression_array);
        OWLDisjointClassesAxiom result63 = OWLFunctionalSyntaxFactory.DisjointClasses(_OWLClassExpression_array);
        OWLDisjointClassesAxiom result64 = OWLFunctionalSyntaxFactory.DisjointClasses(_Set27, _Set);
        OWLDisjointUnionAxiom result65 = OWLFunctionalSyntaxFactory.DisjointUnion(_OWLClass, _OWLClassExpression_array);
        OWLClassAssertionAxiom result66 = OWLFunctionalSyntaxFactory.ClassAssertion(_OWLClassExpression, _OWLIndividual);
        OWLClassAssertionAxiom result67 = OWLFunctionalSyntaxFactory.ClassAssertion(_OWLClassExpression, _OWLIndividual, _Set);
        OWLSameIndividualAxiom result68 = OWLFunctionalSyntaxFactory.SameIndividual(_OWLIndividual_array);
        OWLDifferentIndividualsAxiom result69 = OWLFunctionalSyntaxFactory.DifferentIndividuals(_OWLIndividual_array);
        OWLObjectPropertyAssertionAxiom result70 = OWLFunctionalSyntaxFactory.ObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual, _Set);
        OWLObjectPropertyAssertionAxiom result71 = OWLFunctionalSyntaxFactory.ObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeObjectPropertyAssertionAxiom result72 = OWLFunctionalSyntaxFactory.NegativeObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeObjectPropertyAssertionAxiom result73 = OWLFunctionalSyntaxFactory.NegativeObjectPropertyAssertion(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual,
                _Set);
        OWLDataPropertyAssertionAxiom result74 = OWLFunctionalSyntaxFactory.DataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLDataPropertyAssertionAxiom result75 = OWLFunctionalSyntaxFactory.DataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set);
        OWLNegativeDataPropertyAssertionAxiom result76 = OWLFunctionalSyntaxFactory.NegativeDataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set);
        OWLNegativeDataPropertyAssertionAxiom result77 = OWLFunctionalSyntaxFactory.NegativeDataPropertyAssertion(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLEquivalentObjectPropertiesAxiom result78 = OWLFunctionalSyntaxFactory.EquivalentObjectProperties(_OWLObjectPropertyExpression_array);
        OWLEquivalentObjectPropertiesAxiom result79 = OWLFunctionalSyntaxFactory.EquivalentObjectProperties(_Set, _OWLObjectPropertyExpression_array);
        OWLSubObjectPropertyOfAxiom result80 = OWLFunctionalSyntaxFactory.SubObjectPropertyOf(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set);
        OWLSubObjectPropertyOfAxiom result81 = OWLFunctionalSyntaxFactory.SubObjectPropertyOf(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLInverseObjectPropertiesAxiom result82 = OWLFunctionalSyntaxFactory.InverseObjectProperties(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLFunctionalObjectPropertyAxiom result83 = OWLFunctionalSyntaxFactory.FunctionalObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLFunctionalObjectPropertyAxiom result84 = OWLFunctionalSyntaxFactory.FunctionalObjectProperty(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result85 = OWLFunctionalSyntaxFactory.InverseFunctionalObjectProperty(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result86 = OWLFunctionalSyntaxFactory.InverseFunctionalObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLSymmetricObjectPropertyAxiom result87 = OWLFunctionalSyntaxFactory.SymmetricObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLSymmetricObjectPropertyAxiom result88 = OWLFunctionalSyntaxFactory.SymmetricObjectProperty(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result89 = OWLFunctionalSyntaxFactory.AsymmetricObjectProperty(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result90 = OWLFunctionalSyntaxFactory.AsymmetricObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLTransitiveObjectPropertyAxiom result91 = OWLFunctionalSyntaxFactory.TransitiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLTransitiveObjectPropertyAxiom result92 = OWLFunctionalSyntaxFactory.TransitiveObjectProperty(_OWLObjectPropertyExpression);
        OWLReflexiveObjectPropertyAxiom result93 = OWLFunctionalSyntaxFactory.ReflexiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLReflexiveObjectPropertyAxiom result94 = OWLFunctionalSyntaxFactory.ReflexiveObjectProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyDomainAxiom result95 = OWLFunctionalSyntaxFactory.ObjectPropertyDomain(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyDomainAxiom result96 = OWLFunctionalSyntaxFactory.ObjectPropertyDomain(_OWLObjectPropertyExpression, _OWLClassExpression, _Set);
        OWLObjectPropertyRangeAxiom result97 = OWLFunctionalSyntaxFactory.ObjectPropertyRange(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result98 = OWLFunctionalSyntaxFactory.ObjectPropertyRange(_OWLObjectPropertyExpression, _OWLClassExpression, _Set);
        OWLDisjointObjectPropertiesAxiom result99 = OWLFunctionalSyntaxFactory.DisjointObjectProperties(_Set, _OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result100 = OWLFunctionalSyntaxFactory.DisjointObjectProperties(_OWLObjectPropertyExpression_array);
        OWLSubPropertyChainOfAxiom result101 = OWLFunctionalSyntaxFactory.SubPropertyChainOf(_List, _OWLObjectPropertyExpression, _Set);
        OWLSubPropertyChainOfAxiom result102 = OWLFunctionalSyntaxFactory.SubPropertyChainOf(_List, _OWLObjectPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result103 = OWLFunctionalSyntaxFactory.EquivalentDataProperties(_Set, _OWLDataPropertyExpression_array);
        OWLEquivalentDataPropertiesAxiom result104 = OWLFunctionalSyntaxFactory.EquivalentDataProperties(_OWLDataPropertyExpression_array);
        OWLSubDataPropertyOfAxiom result105 = OWLFunctionalSyntaxFactory.SubDataPropertyOf(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLSubDataPropertyOfAxiom result106 = OWLFunctionalSyntaxFactory.SubDataPropertyOf(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set);
        OWLFunctionalDataPropertyAxiom result107 = OWLFunctionalSyntaxFactory.FunctionalDataProperty(_OWLDataPropertyExpression);
        OWLFunctionalDataPropertyAxiom result108 = OWLFunctionalSyntaxFactory.FunctionalDataProperty(_OWLDataPropertyExpression, _Set);
        OWLDataPropertyDomainAxiom result109 = OWLFunctionalSyntaxFactory.DataPropertyDomain(_OWLDataPropertyExpression, _OWLClassExpression);
        OWLDataPropertyDomainAxiom result110 = OWLFunctionalSyntaxFactory.DataPropertyDomain(_OWLDataPropertyExpression, _OWLClassExpression, _Set);
        OWLDataPropertyRangeAxiom result111 = OWLFunctionalSyntaxFactory.DataPropertyRange(_OWLDataPropertyExpression, _OWLDataRange, _Set);
        OWLDataPropertyRangeAxiom result112 = OWLFunctionalSyntaxFactory.DataPropertyRange(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDisjointDataPropertiesAxiom result113 = OWLFunctionalSyntaxFactory.DisjointDataProperties(_OWLDataPropertyExpression_array);
        OWLDisjointDataPropertiesAxiom result114 = OWLFunctionalSyntaxFactory.DisjointDataProperties(_Set, _OWLDataPropertyExpression_array);
        OWLHasKeyAxiom result115 = OWLFunctionalSyntaxFactory.HasKey(_Set, _OWLClassExpression, _OWLPropertyExpression_array);
        OWLHasKeyAxiom result116 = OWLFunctionalSyntaxFactory.HasKey(_OWLClassExpression, _OWLPropertyExpression_array);
        OWLAnnotationAssertionAxiom result117 = OWLFunctionalSyntaxFactory.AnnotationAssertion(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue);
        OWLSubAnnotationPropertyOfAxiom result118 = OWLFunctionalSyntaxFactory.SubAnnotationPropertyOf(_OWLAnnotationProperty, _OWLAnnotationProperty);
        OWLAnnotationPropertyDomainAxiom result119 = OWLFunctionalSyntaxFactory.AnnotationPropertyDomain(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyDomainAxiom result120 = OWLFunctionalSyntaxFactory.AnnotationPropertyDomain(_OWLAnnotationProperty, _String);
        OWLDatatypeDefinitionAxiom result121 = OWLFunctionalSyntaxFactory.DatatypeDefinition(_OWLDatatype, _OWLDataRange);
        IRI result122 = OWLFunctionalSyntaxFactory.IRI(_String);
        OWLAnonymousIndividual result123 = OWLFunctionalSyntaxFactory.AnonymousIndividual(_String);
        OWLAnonymousIndividual result124 = OWLFunctionalSyntaxFactory.AnonymousIndividual();
        OWLObjectInverseOf result125 = OWLFunctionalSyntaxFactory.ObjectInverseOf(_OWLObjectPropertyExpression);
        OWLFacetRestriction result126 = OWLFunctionalSyntaxFactory.FacetRestriction(_OWLFacet, _OWLLiteral);
        OWLIrreflexiveObjectPropertyAxiom result127 = OWLFunctionalSyntaxFactory.IrreflexiveObjectProperty(_OWLObjectPropertyExpression);
        OWLIrreflexiveObjectPropertyAxiom result128 = OWLFunctionalSyntaxFactory.IrreflexiveObjectProperty(_OWLObjectPropertyExpression, _Set);
        OWLAnnotationPropertyRangeAxiom result129 = OWLFunctionalSyntaxFactory.AnnotationPropertyRange(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyRangeAxiom result130 = OWLFunctionalSyntaxFactory.AnnotationPropertyRange(_OWLAnnotationProperty, _String);
    }

    @Test
    public void enforceInterfacesOWLManager() {
        assertTrue(OWLOntologyManagerFactory.class.isAssignableFrom(OWLManager.class));
    }

    public void verifyOWLManager() {
        OWLManager testSubject0 = new OWLManager();
        OWLOntologyManager result4 = OWLManager.createOWLOntologyManager();
        OWLDataFactory result5 = OWLManager.getOWLDataFactory();
    }

    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private String _String;
    private java.util.List<? extends OWLObjectPropertyExpression> _List;
    private java.util.Set<? extends OWLClassExpression> _Set26;
    private java.util.Set<OWLAnnotation> _Set;
    private java.util.Set<OWLClassExpression> _Set27;
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
