package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.coode.owlapi.rdf.model.AbstractTranslator;
import org.coode.owlapi.rdf.model.RDFGraph;
import org.coode.owlapi.rdf.model.RDFLiteralNode;
import org.coode.owlapi.rdf.model.RDFNode;
import org.coode.owlapi.rdf.model.RDFResourceNode;
import org.coode.owlapi.rdf.model.RDFTranslator;
import org.coode.owlapi.rdf.model.RDFTriple;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_rdf_model {

    @Test
    public void enforceInterfacesAbstractTranslator()  {
        assertTrue(OWLObjectVisitor.class
                .isAssignableFrom(AbstractTranslator.class));
        assertTrue(SWRLObjectVisitor.class
                .isAssignableFrom(AbstractTranslator.class));
    }

    public void verifyAbstractTranslator()  {
        AbstractTranslator testSubject0 = new AbstractTranslator(
                _OWLOntologyManager, _OWLOntology, _boolean) {

            @Override
            protected Object getResourceNode(IRI IRI) {
                return null;
            }

            @Override
            protected Object getPredicateNode(IRI IRI) {
                return null;
            }

            @Override
            protected Object getAnonymousNode(Object key) {
                return null;
            }

            @Override
            protected Object getLiteralNode(OWLLiteral literal) {
                return null;
            }

            @Override
            protected void
                    addTriple(Object subject, Object pred, Object object) {}
        };
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
    }

    public void verifyRDFGraph()  {
        RDFGraph testSubject0 = new RDFGraph();
        boolean result0 = testSubject0.isEmpty();
        testSubject0.addTriple(_RDFTriple);
        java.util.Set<org.coode.owlapi.rdf.model.RDFTriple> result1 = testSubject0
                .getTriplesForSubject(_RDFNode);
        java.util.List<org.coode.owlapi.rdf.model.RDFTriple> result2 = testSubject0
                .getSortedTriplesForSubject(_RDFNode, _boolean);
        java.util.Collection<org.coode.owlapi.rdf.model.RDFTriple> result3 = testSubject0
                .getTriplesForSubject(_RDFNode, _boolean);
        boolean result4 = testSubject0
                .isAnonymousNodeSharedSubject(_RDFResourceNode);
        java.util.Set<org.coode.owlapi.rdf.model.RDFResourceNode> result5 = testSubject0
                .getRootAnonymousNodes();
        testSubject0.dumpTriples(_Writer);
    }

    @Test
    public void enforceInterfacesRDFLiteralNode()  {
        assertTrue(org.coode.owlapi.rdf.model.RDFNode.class
                .isAssignableFrom(RDFLiteralNode.class));
        assertTrue(Comparable.class.isAssignableFrom(RDFLiteralNode.class));
    }

    public void verifyRDFLiteralNode()  {
        RDFLiteralNode testSubject0 = new RDFLiteralNode(_String, _String);
        RDFLiteralNode testSubject1 = new RDFLiteralNode(_String, _IRI);
        int result0 = testSubject0.compareTo(_RDFNode);
        String result2 = testSubject0.getLiteral();
        boolean result3 = testSubject0.isLiteral();
        IRI result4 = testSubject0.getDatatype();
        String result5 = testSubject0.getLang();
        boolean result6 = testSubject0.isTyped();
        boolean result7 = testSubject0.isAnonymous();
        IRI result8 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesRDFNode()  {
        assertTrue(Comparable.class.isAssignableFrom(RDFNode.class));
    }

    public void verifyRDFNode()  {
        RDFNode testSubject0 = new RDFNode() {

            @Override
            public int compareTo(RDFNode o) {
                return 0;
            }

            @Override
            public boolean isLiteral() {
                return false;
            }

            @Override
            public IRI getIRI() {
                return null;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }
        };
        boolean result0 = testSubject0.isLiteral();
        boolean result1 = testSubject0.isAnonymous();
        IRI result2 = testSubject0.getIRI();
        int result3 = testSubject0.compareTo(_Object92);
    }

    @Test
    public void enforceInterfacesRDFResourceNode()  {
        assertTrue(org.coode.owlapi.rdf.model.RDFNode.class
                .isAssignableFrom(RDFResourceNode.class));
        assertTrue(Comparable.class.isAssignableFrom(RDFResourceNode.class));
    }

    public void verifyRDFResourceNode()  {
        RDFResourceNode testSubject0 = new RDFResourceNode(_IRI);
        RDFResourceNode testSubject1 = new RDFResourceNode(_int);
        int result0 = testSubject0.compareTo(_RDFNode);
        int result2 = testSubject0.getId();
        boolean result3 = testSubject0.isLiteral();
        boolean result4 = testSubject0.isAnonymous();
        IRI result5 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesRDFTranslator()  {
        assertTrue(org.coode.owlapi.rdf.model.AbstractTranslator.class
                .isAssignableFrom(RDFTranslator.class));
    }

    public void verifyRDFTranslator()  {
        RDFTranslator testSubject0 = new RDFTranslator(_OWLOntologyManager,
                _OWLOntology, _boolean);
        testSubject0.reset();
        org.coode.owlapi.rdf.model.RDFGraph result0 = testSubject0.getGraph();
        org.coode.owlapi.rdf.model.RDFLiteralNode result1 = RDFTranslator
                .translateLiteralNode(_OWLLiteral);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
    }

    @Test
    public void enforceInterfacesRDFTriple()  {
        assertTrue(Comparable.class.isAssignableFrom(RDFTriple.class));
    }

    public void verifyRDFTriple()  {
        RDFTriple testSubject0 = new RDFTriple(_RDFResourceNode,
                _RDFResourceNode, _RDFNode);
        org.coode.owlapi.rdf.model.RDFResourceNode result0 = testSubject0
                .getProperty();
        int result1 = testSubject0.compareTo(_RDFTriple);
        org.coode.owlapi.rdf.model.RDFNode result3 = testSubject0.getObject();
        org.coode.owlapi.rdf.model.RDFResourceNode result4 = testSubject0
                .getSubject();
    }

    private static class T {}

    private RDFNode _Object92;
    private boolean _boolean;
    private int _int;
    private java.io.Writer _Writer;
    private Object _Object;
    private String _String;
    private org.coode.owlapi.rdf.model.RDFNode _RDFNode;
    private org.coode.owlapi.rdf.model.RDFResourceNode _RDFResourceNode;
    private org.coode.owlapi.rdf.model.RDFTriple _RDFTriple;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
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
    private OWLDataProperty _OWLDataProperty;
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
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectInverseOf _OWLObjectInverseOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectProperty _OWLObjectProperty;
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
    private SWRLBuiltInAtom _SWRLBuiltInAtom;
    private SWRLClassAtom _SWRLClassAtom;
    private SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private SWRLDataRangeAtom _SWRLDataRangeAtom;
    private SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private SWRLIndividualArgument _SWRLIndividualArgument;
    private SWRLLiteralArgument _SWRLLiteralArgument;
    private SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private SWRLRule _SWRLRule;
    private SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private SWRLVariable _SWRLVariable;
}
