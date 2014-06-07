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
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLLiteral;

@SuppressWarnings({ "javadoc", "unused", "deprecation", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_rdf_model {
    @Test
    public void enforceInterfacesAbstractTranslator() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(AbstractTranslator.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(AbstractTranslator.class));
    }

    public void verifyAbstractTranslator() throws Exception {
        AbstractTranslator testSubject0 = new AbstractTranslator(_OWLOntologyManager,
                _OWLOntology, _boolean) {
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
            protected void addTriple(Object subject, Object pred, Object object) {}
        };
    }

    public void verifyRDFGraph() throws Exception {
        RDFGraph testSubject0 = new RDFGraph();
        boolean result0 = testSubject0.isEmpty();
        testSubject0.addTriple(_RDFTriple);
        java.util.Set<org.coode.owlapi.rdf.model.RDFTriple> result1 = testSubject0
                .getTriplesForSubject(_RDFNode);
        java.util.List<org.coode.owlapi.rdf.model.RDFTriple> result2 = testSubject0
                .getSortedTriplesForSubject(_RDFNode, _boolean);
        java.util.Collection<org.coode.owlapi.rdf.model.RDFTriple> result3 = testSubject0
                .getTriplesForSubject(_RDFNode, _boolean);
        boolean result4 = testSubject0.isAnonymousNodeSharedSubject(_RDFResourceNode);
        java.util.Set<org.coode.owlapi.rdf.model.RDFResourceNode> result5 = testSubject0
                .getRootAnonymousNodes();
        testSubject0.dumpTriples(_Writer);
    }

    @Test
    public void enforceInterfacesRDFLiteralNode() throws Exception {
        assertTrue(org.coode.owlapi.rdf.model.RDFNode.class
                .isAssignableFrom(RDFLiteralNode.class));
        assertTrue(java.lang.Comparable.class.isAssignableFrom(RDFLiteralNode.class));
    }

    public void verifyRDFLiteralNode() throws Exception {
        RDFLiteralNode testSubject0 = new RDFLiteralNode(_String, _String);
        RDFLiteralNode testSubject1 = new RDFLiteralNode(_String, _IRI);
        int result0 = testSubject0.compareTo(_RDFNode);
        java.lang.String result2 = testSubject0.getLiteral();
        boolean result3 = testSubject0.isLiteral();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDatatype();
        java.lang.String result5 = testSubject0.getLang();
        boolean result6 = testSubject0.isTyped();
        boolean result7 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.IRI result8 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesRDFNode() throws Exception {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(RDFNode.class));
    }

    public void verifyRDFNode() throws Exception {
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
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getIRI();
        int result3 = testSubject0.compareTo(_Object92);
    }

    @Test
    public void enforceInterfacesRDFResourceNode() throws Exception {
        assertTrue(org.coode.owlapi.rdf.model.RDFNode.class
                .isAssignableFrom(RDFResourceNode.class));
        assertTrue(java.lang.Comparable.class.isAssignableFrom(RDFResourceNode.class));
    }

    public void verifyRDFResourceNode() throws Exception {
        RDFResourceNode testSubject0 = new RDFResourceNode(_IRI);
        RDFResourceNode testSubject1 = new RDFResourceNode(_int);
        int result0 = testSubject0.compareTo(_RDFNode);
        int result2 = testSubject0.getId();
        boolean result3 = testSubject0.isLiteral();
        boolean result4 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesRDFTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdf.model.AbstractTranslator.class
                .isAssignableFrom(RDFTranslator.class));
    }

    public void verifyRDFTranslator() throws Exception {
        RDFTranslator testSubject0 = new RDFTranslator(_OWLOntologyManager, _OWLOntology,
                _boolean);
        testSubject0.reset();
        org.coode.owlapi.rdf.model.RDFGraph result0 = testSubject0.getGraph();
        org.coode.owlapi.rdf.model.RDFLiteralNode result1 = RDFTranslator
                .translateLiteralNode(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesRDFTriple() throws Exception {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(RDFTriple.class));
    }

    public void verifyRDFTriple() throws Exception {
        RDFTriple testSubject0 = new RDFTriple(_RDFResourceNode, _RDFResourceNode,
                _RDFNode);
        org.coode.owlapi.rdf.model.RDFResourceNode result0 = testSubject0.getProperty();
        int result1 = testSubject0.compareTo(_RDFTriple);
        org.coode.owlapi.rdf.model.RDFNode result3 = testSubject0.getObject();
        org.coode.owlapi.rdf.model.RDFResourceNode result4 = testSubject0.getSubject();
    }

    private static class T {}

    private RDFNode _Object92;
    private boolean _boolean;
    private int _int;
    private java.io.Writer _Writer;
    private java.lang.Object _Object;
    private java.lang.String _String;
    private org.coode.owlapi.rdf.model.RDFNode _RDFNode;
    private org.coode.owlapi.rdf.model.RDFResourceNode _RDFResourceNode;
    private org.coode.owlapi.rdf.model.RDFTriple _RDFTriple;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
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
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
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
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectComplementOf _OWLObjectComplementOf;
    private org.semanticweb.owlapi.model.OWLObjectExactCardinality _OWLObjectExactCardinality;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectHasValue _OWLObjectHasValue;
    private org.semanticweb.owlapi.model.OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private org.semanticweb.owlapi.model.OWLObjectInverseOf _OWLObjectInverseOf;
    private org.semanticweb.owlapi.model.OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private org.semanticweb.owlapi.model.OWLObjectMinCardinality _OWLObjectMinCardinality;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
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
    private org.semanticweb.owlapi.model.SWRLBuiltInAtom _SWRLBuiltInAtom;
    private org.semanticweb.owlapi.model.SWRLClassAtom _SWRLClassAtom;
    private org.semanticweb.owlapi.model.SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLDataRangeAtom _SWRLDataRangeAtom;
    private org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private org.semanticweb.owlapi.model.SWRLIndividualArgument _SWRLIndividualArgument;
    private org.semanticweb.owlapi.model.SWRLLiteralArgument _SWRLLiteralArgument;
    private org.semanticweb.owlapi.model.SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.model.SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private org.semanticweb.owlapi.model.SWRLVariable _SWRLVariable;
}
