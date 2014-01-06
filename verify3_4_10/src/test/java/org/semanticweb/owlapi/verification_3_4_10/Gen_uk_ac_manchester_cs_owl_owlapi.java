package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.ClassExpressionType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitor;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLIndividualVisitor;
import org.semanticweb.owlapi.model.OWLIndividualVisitorEx;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNaryAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLPropertyExpressionVisitor;
import org.semanticweb.owlapi.model.OWLPropertyExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLPropertyRange;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLArgument;
import org.semanticweb.owlapi.model.SWRLDArgument;
import org.semanticweb.owlapi.model.SWRLIArgument;
import org.semanticweb.owlapi.model.SWRLObjectVisitor;
import org.semanticweb.owlapi.model.SWRLObjectVisitorEx;

import uk.ac.manchester.cs.owl.owlapi.*;
import uk.ac.manchester.cs.owl.owlapi.Internals.Pointer;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi {
    @Test
    public void enforceInterfacesAbstractEntityRegistrationManager() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(AbstractEntityRegistrationManager.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(AbstractEntityRegistrationManager.class));
    }

    public void verifyAbstractEntityRegistrationManager() throws Exception {
        AbstractEntityRegistrationManager testSubject0 = new AbstractEntityRegistrationManager() {
            @Override
            public void visit(OWLClass ce) {}

            @Override
            public void visit(OWLDatatype node) {}

            @Override
            public void visit(OWLObjectProperty property) {}

            @Override
            public void visit(OWLDataProperty property) {}

            @Override
            public void visit(OWLNamedIndividual individual) {}

            @Override
            public void visit(OWLAnnotationProperty property) {}

            @Override
            public void visit(OWLAnonymousIndividual individual) {}
        };
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
    }

    @Test
    public void enforceInterfacesAbstractInMemOWLOntologyFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyFactory.class
                .isAssignableFrom(AbstractInMemOWLOntologyFactory.class));
    }

    public void verifyAbstractInMemOWLOntologyFactory() throws Exception {
        AbstractInMemOWLOntologyFactory testSubject0 = new AbstractInMemOWLOntologyFactory() {
            @Override
            public OWLOntology loadOWLOntology(OWLOntologyDocumentSource documentSource,
                    OWLOntologyCreationHandler handler)
                    throws OWLOntologyCreationException {
                return null;
            }

            @Override
            public OWLOntology loadOWLOntology(OWLOntologyDocumentSource documentSource,
                    OWLOntologyCreationHandler handler,
                    OWLOntologyLoaderConfiguration configuration)
                    throws OWLOntologyCreationException {
                return null;
            }

            @Override
            public boolean canLoad(OWLOntologyDocumentSource documentSource) {
                return false;
            }
        };
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result0 = testSubject0
                .getOWLOntologyManager();
        boolean result1 = testSubject0.canCreateFromDocumentIRI(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0
                .createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler,
                _OWLOntologyLoaderConfiguration);
        boolean result5 = testSubject0.canLoad(_OWLOntologyDocumentSource);
    }

    @Test
    public void enforceInterfacesAbstractInternalsImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.Internals.class
                .isAssignableFrom(AbstractInternalsImpl.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(AbstractInternalsImpl.class));
    }

    public void verifyAbstractInternalsImpl() throws Exception {
        AbstractInternalsImpl testSubject0 = mock(AbstractInternalsImpl.class);
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result0 = testSubject0
                .getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLClassAxiom> result1 = testSubject0
                .getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result2 = testSubject0
                .getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result3 = testSubject0
                .getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result4 = testSubject0
                .getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result5 = testSubject0
                .getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result6 = testSubject0
                .getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result7 = testSubject0
                .getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result8 = testSubject0
                .getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result9 = testSubject0
                .getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result10 = testSubject0
                .getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLDisjointUnionAxiom> result11 = testSubject0
                .getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLHasKeyAxiom> result12 = testSubject0
                .getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result13 = testSubject0
                .getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result14 = testSubject0
                .getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result15 = testSubject0
                .getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result16 = testSubject0
                .getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result17 = testSubject0
                .getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result18 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom> result19 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom> result20 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result21 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom> result22 = testSubject0
                .getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result23 = testSubject0
                .getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom> result24 = testSubject0
                .getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result25 = testSubject0
                .getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result26 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom> result27 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom> result28 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result29 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom> result30 = testSubject0
                .getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result31 = testSubject0
                .getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom> result32 = testSubject0
                .getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result33 = testSubject0
                .getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom> result34 = testSubject0
                .getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result35 = testSubject0
                .getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom> result36 = testSubject0
                .getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result37 = testSubject0
                .getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result38 = testSubject0
                .getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom> result39 = testSubject0
                .getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result40 = testSubject0
                .getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom> result41 = testSubject0
                .getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result42 = testSubject0
                .getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result43 = testSubject0
                .getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result44 = testSubject0
                .getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result45 = testSubject0
                .getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result46 = testSubject0
                .getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom> result47 = testSubject0
                .getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result48 = testSubject0
                .getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom> result49 = testSubject0
                .getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom> result50 = testSubject0
                .getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result51 = testSubject0
                .getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom> result52 = testSubject0
                .getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result53 = testSubject0
                .getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result54 = testSubject0
                .getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom> result55 = testSubject0
                .getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result56 = testSubject0
                .getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result57 = testSubject0
                .getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result58 = testSubject0
                .getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClassExpression, org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result59 = testSubject0
                .getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom> result60 = testSubject0
                .getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result61 = testSubject0
                .getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result62 = testSubject0
                .getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom> result63 = testSubject0
                .getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom> result64 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result65 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom> result66 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result67 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result68 = testSubject0
                .getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result69 = testSubject0
                .getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result70 = testSubject0
                .getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result71 = testSubject0
                .getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLAnnotationSubject, org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result72 = testSubject0
                .getAnnotationAssertionAxiomsBySubject();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result73 = testSubject0
                .getAnnotationAssertionAxiomsBySubject();
        boolean result74 = testSubject0.add(_Pointer, _Object, _OWLAxiom);
        boolean result75 = testSubject0.remove(_Pointer, _Object, _OWLAxiom);
        boolean result76 = testSubject0.isEmpty();
        boolean result77 = testSubject0.contains(_Pointer, _Object);
        boolean result78 = testSubject0.contains(_Pointer, _Object, _OWLAxiom);
        java.util.Set<OWLAxiom> result79 = testSubject0.getValues(_Pointer, _Object);
        Pointer<org.semanticweb.owlapi.model.AxiomType<?>, org.semanticweb.owlapi.model.OWLAxiom> result80 = testSubject0
                .getAxiomsByType();
        testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result81 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result82 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        Pointer<org.semanticweb.owlapi.model.OWLEntity, org.semanticweb.owlapi.model.OWLDeclarationAxiom> result83 = testSubject0
                .getDeclarationsByEntity();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result84 = testSubject0
                .getOntologyAnnotations();
        Pointer<org.semanticweb.owlapi.model.OWLAnnotationProperty, org.semanticweb.owlapi.model.OWLAxiom> result85 = testSubject0
                .getOwlAnnotationPropertyReferences();
        Pointer<org.semanticweb.owlapi.model.OWLAnonymousIndividual, org.semanticweb.owlapi.model.OWLAxiom> result86 = testSubject0
                .getOwlAnonymousIndividualReferences();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLAxiom> result87 = testSubject0
                .getOwlClassReferences();
        Pointer<org.semanticweb.owlapi.model.OWLDataProperty, org.semanticweb.owlapi.model.OWLAxiom> result88 = testSubject0
                .getOwlDataPropertyReferences();
        Pointer<org.semanticweb.owlapi.model.OWLDatatype, org.semanticweb.owlapi.model.OWLAxiom> result89 = testSubject0
                .getOwlDatatypeReferences();
        Pointer<org.semanticweb.owlapi.model.OWLNamedIndividual, org.semanticweb.owlapi.model.OWLAxiom> result90 = testSubject0
                .getOwlIndividualReferences();
        Pointer<org.semanticweb.owlapi.model.OWLObjectProperty, org.semanticweb.owlapi.model.OWLAxiom> result91 = testSubject0
                .getOwlObjectPropertyReferences();
        boolean result92 = testSubject0.hasValues(_Pointer, _Object);
        java.util.Set<OWLClass> result93 = testSubject0.getKeyset(_Pointer);
        java.util.Set<OWLAxiom> result94 = testSubject0.filterAxioms(
                _OWLAxiomSearchFilter, _Object);
        testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result95 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result96 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLImportsDeclaration> result97 = testSubject0
                .getImportsDeclarations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result98 = testSubject0
                .getAxioms();
        int result99 = testSubject0.getAxiomCount(_AxiomType);
        int result100 = testSubject0.getAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLLogicalAxiom> result101 = testSubject0
                .getLogicalAxioms();
        int result102 = testSubject0.getLogicalAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result103 = testSubject0
                .getGeneralClassAxioms();
        boolean result104 = testSubject0.isDeclared(_OWLDeclarationAxiom);
        boolean result105 = testSubject0.addAxiom(_OWLAxiom96);
        boolean result106 = testSubject0.removeAxiom(_OWLAxiom96);
    }

    @Test
    public void enforceInterfacesClassAxiomByClassPointer() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.MapPointer.class
                .isAssignableFrom(ClassAxiomByClassPointer.class));
    }

    public void verifyClassAxiomByClassPointer() throws Exception {
        ClassAxiomByClassPointer testSubject0 = new ClassAxiomByClassPointer(
                _AxiomType97, _OWLAxiomVisitorEx, _boolean, _Internals);
        testSubject0.init();
        boolean result0 = testSubject0.remove(_Object, _OWLAxiom);
        boolean result1 = testSubject0.put(_Object, _OWLAxiom);
        boolean result2 = testSubject0.contains(_Object, _OWLAxiom);
        int result3 = testSubject0.size();
        java.util.Set<OWLClass> result4 = testSubject0.keySet();
        boolean result5 = testSubject0.containsKey(_Object);
        java.util.Set<OWLClassAxiom> result6 = testSubject0.getAllValues();
        java.util.Set<OWLClassAxiom> result7 = testSubject0.getValues(_Object);
        boolean result8 = testSubject0.hasValues(_Object);
        boolean result9 = testSubject0.isInitialized();
    }

    

    public void verifyInterfaceCollectionContainer() throws Exception {
        CollectionContainer<Object> testSubject0 = mock(CollectionContainer.class);
        testSubject0.accept(_CollectionContainerVisitor);
    }

    

    public void verifyInterfaceCollectionContainerVisitor() throws Exception {
        CollectionContainerVisitor<Object> testSubject0 = mock(CollectionContainerVisitor.class);
        testSubject0.visit(_CollectionContainer);
        testSubject0.visitItem(_Object103);
    }

    @Test
    public void enforceInterfacesEmptyInMemOWLOntologyFactory() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInMemOWLOntologyFactory.class
                .isAssignableFrom(EmptyInMemOWLOntologyFactory.class));
    }

    public void verifyEmptyInMemOWLOntologyFactory() throws Exception {
        EmptyInMemOWLOntologyFactory testSubject0 = new EmptyInMemOWLOntologyFactory();
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler,
                _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0
                .createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        boolean result3 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getOWLOntologyManager();
        boolean result5 = testSubject0.canCreateFromDocumentIRI(_IRI);
    }

    

    public void verifyImplUtils() throws Exception {
        ImplUtils testSubject0 = new ImplUtils();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = ImplUtils
                .getAnnotations(_OWLEntity, _OWLAnnotationProperty, _Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = ImplUtils
                .getAnnotations(_OWLEntity, _Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result2 = ImplUtils
                .getAnnotationAxioms(_OWLEntity, _Set);
    }

    

    public void verifyInitVisitorFactory() throws Exception {
        InitVisitorFactory testSubject0 = new InitVisitorFactory();
    }

    

    public void verifyInterfaceInternals() throws Exception {
        Internals testSubject0 = mock(Internals.class);
        boolean result0 = testSubject0.add(_Pointer, _Object, _OWLAxiom);
        boolean result1 = testSubject0.remove(_Pointer, _Object, _OWLAxiom);
        boolean result2 = testSubject0.isEmpty();
        boolean result3 = testSubject0.contains(_Pointer, _Object);
        boolean result4 = testSubject0.contains(_Pointer, _Object, _OWLAxiom);
        java.util.Set<OWLAxiom> result5 = testSubject0.getValues(_Pointer, _Object);
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLClassAxiom> result6 = testSubject0
                .getClassAxiomsByClass();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result7 = testSubject0
                .getSubClassAxiomsByLHS();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result8 = testSubject0
                .getSubClassAxiomsByRHS();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result9 = testSubject0
                .getEquivalentClassesAxiomsByClass();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result10 = testSubject0
                .getDisjointClassesAxiomsByClass();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLDisjointUnionAxiom> result11 = testSubject0
                .getDisjointUnionAxiomsByClass();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLHasKeyAxiom> result12 = testSubject0
                .getHasKeyAxiomsByClass();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result13 = testSubject0
                .getObjectSubPropertyAxiomsByLHS();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result14 = testSubject0
                .getObjectSubPropertyAxiomsByRHS();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom> result15 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom> result16 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom> result17 = testSubject0
                .getObjectPropertyDomainAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom> result18 = testSubject0
                .getObjectPropertyRangeAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom> result19 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom> result20 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom> result21 = testSubject0
                .getSymmetricPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom> result22 = testSubject0
                .getAsymmetricPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom> result23 = testSubject0
                .getReflexivePropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom> result24 = testSubject0
                .getIrreflexivePropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom> result25 = testSubject0
                .getTransitivePropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom> result26 = testSubject0
                .getInversePropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result27 = testSubject0
                .getDataSubPropertyAxiomsByLHS();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result28 = testSubject0
                .getDataSubPropertyAxiomsByRHS();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom> result29 = testSubject0
                .getEquivalentDataPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom> result30 = testSubject0
                .getDisjointDataPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom> result31 = testSubject0
                .getDataPropertyDomainAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom> result32 = testSubject0
                .getDataPropertyRangeAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom> result33 = testSubject0
                .getFunctionalDataPropertyAxiomsByProperty();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result34 = testSubject0
                .getClassAssertionAxiomsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLClassExpression, org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result35 = testSubject0
                .getClassAssertionAxiomsByClass();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom> result36 = testSubject0
                .getObjectPropertyAssertionsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom> result37 = testSubject0
                .getDataPropertyAssertionsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom> result38 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom> result39 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result40 = testSubject0
                .getDifferentIndividualsAxiomsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result41 = testSubject0
                .getSameIndividualsAxiomsByIndividual();
        Pointer<org.semanticweb.owlapi.model.OWLAnnotationSubject, org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result42 = testSubject0
                .getAnnotationAssertionAxiomsBySubject();
        Pointer<org.semanticweb.owlapi.model.AxiomType<?>, org.semanticweb.owlapi.model.OWLAxiom> result43 = testSubject0
                .getAxiomsByType();
        testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result44 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result45 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        Pointer<org.semanticweb.owlapi.model.OWLEntity, org.semanticweb.owlapi.model.OWLDeclarationAxiom> result46 = testSubject0
                .getDeclarationsByEntity();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result47 = testSubject0
                .getOntologyAnnotations();
        Pointer<org.semanticweb.owlapi.model.OWLAnnotationProperty, org.semanticweb.owlapi.model.OWLAxiom> result48 = testSubject0
                .getOwlAnnotationPropertyReferences();
        Pointer<org.semanticweb.owlapi.model.OWLAnonymousIndividual, org.semanticweb.owlapi.model.OWLAxiom> result49 = testSubject0
                .getOwlAnonymousIndividualReferences();
        Pointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLAxiom> result50 = testSubject0
                .getOwlClassReferences();
        Pointer<org.semanticweb.owlapi.model.OWLDataProperty, org.semanticweb.owlapi.model.OWLAxiom> result51 = testSubject0
                .getOwlDataPropertyReferences();
        Pointer<org.semanticweb.owlapi.model.OWLDatatype, org.semanticweb.owlapi.model.OWLAxiom> result52 = testSubject0
                .getOwlDatatypeReferences();
        Pointer<org.semanticweb.owlapi.model.OWLNamedIndividual, org.semanticweb.owlapi.model.OWLAxiom> result53 = testSubject0
                .getOwlIndividualReferences();
        Pointer<org.semanticweb.owlapi.model.OWLObjectProperty, org.semanticweb.owlapi.model.OWLAxiom> result54 = testSubject0
                .getOwlObjectPropertyReferences();
        boolean result55 = testSubject0.hasValues(_Pointer, _Object);
        java.util.Set<OWLClass> result56 = testSubject0.getKeyset(_Pointer);
        java.util.Set<OWLAxiom> result57 = testSubject0.filterAxioms(
                _OWLAxiomSearchFilter, _Object);
        testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result58 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result59 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLImportsDeclaration> result60 = testSubject0
                .getImportsDeclarations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result61 = testSubject0
                .getAxioms();
        int result62 = testSubject0.getAxiomCount(_AxiomType);
        int result63 = testSubject0.getAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLLogicalAxiom> result64 = testSubject0
                .getLogicalAxioms();
        int result65 = testSubject0.getLogicalAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result66 = testSubject0
                .getGeneralClassAxioms();
        boolean result67 = testSubject0.isDeclared(_OWLDeclarationAxiom);
        boolean result68 = testSubject0.addAxiom(_OWLAxiom96);
        boolean result69 = testSubject0.removeAxiom(_OWLAxiom96);
    }

    @Test
    public void enforceInterfacesInternalsImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInternalsImpl.class
                .isAssignableFrom(InternalsImpl.class));
    }

    public void verifyInternalsImpl() throws Exception {
        InternalsImpl testSubject0 = new InternalsImpl();
        boolean result0 = testSubject0.add(_Pointer, _Object, _OWLAxiom);
        boolean result1 = testSubject0.remove(_Pointer, _Object, _OWLAxiom);
        boolean result2 = testSubject0.isEmpty();
        boolean result3 = testSubject0.contains(_Pointer, _Object, _OWLAxiom);
        boolean result4 = testSubject0.contains(_Pointer, _Object);
        java.util.Set<OWLAxiom> result5 = testSubject0.getValues(_Pointer, _Object);
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.AxiomType<?>, org.semanticweb.owlapi.model.OWLAxiom> result6 = testSubject0
                .getAxiomsByType();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result7 = testSubject0
                .getAxiomsByType();
        testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result8 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result9 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result10 = testSubject0
                .getDeclarationsByEntity();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLEntity, org.semanticweb.owlapi.model.OWLDeclarationAxiom> result11 = testSubject0
                .getDeclarationsByEntity();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getOntologyAnnotations();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLAnnotationProperty, org.semanticweb.owlapi.model.OWLAxiom> result13 = testSubject0
                .getOwlAnnotationPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result14 = testSubject0
                .getOwlAnnotationPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLAnonymousIndividual, org.semanticweb.owlapi.model.OWLAxiom> result15 = testSubject0
                .getOwlAnonymousIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result16 = testSubject0
                .getOwlAnonymousIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result17 = testSubject0
                .getOwlClassReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLAxiom> result18 = testSubject0
                .getOwlClassReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataProperty, org.semanticweb.owlapi.model.OWLAxiom> result19 = testSubject0
                .getOwlDataPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result20 = testSubject0
                .getOwlDataPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result21 = testSubject0
                .getOwlDatatypeReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDatatype, org.semanticweb.owlapi.model.OWLAxiom> result22 = testSubject0
                .getOwlDatatypeReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result23 = testSubject0
                .getOwlIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLNamedIndividual, org.semanticweb.owlapi.model.OWLAxiom> result24 = testSubject0
                .getOwlIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result25 = testSubject0
                .getOwlObjectPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectProperty, org.semanticweb.owlapi.model.OWLAxiom> result26 = testSubject0
                .getOwlObjectPropertyReferences();
        boolean result27 = testSubject0.hasValues(_Pointer, _Object);
        java.util.Set<OWLClass> result28 = testSubject0.getKeyset(_Pointer);
        java.util.Set<OWLAxiom> result29 = testSubject0.filterAxioms(
                _OWLAxiomSearchFilter, _Object);
        testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result30 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result31 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLImportsDeclaration> result32 = testSubject0
                .getImportsDeclarations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result33 = testSubject0
                .getAxioms();
        int result34 = testSubject0.getAxiomCount();
        int result35 = testSubject0.getAxiomCount(_AxiomType);
        java.util.Set<org.semanticweb.owlapi.model.OWLLogicalAxiom> result36 = testSubject0
                .getLogicalAxioms();
        int result37 = testSubject0.getLogicalAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result38 = testSubject0
                .getGeneralClassAxioms();
        boolean result39 = testSubject0.isDeclared(_OWLDeclarationAxiom);
        boolean result40 = testSubject0.addAxiom(_OWLAxiom96);
        boolean result41 = testSubject0.removeAxiom(_OWLAxiom96);
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result42 = testSubject0
                .getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLClassAxiom> result43 = testSubject0
                .getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result44 = testSubject0
                .getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result45 = testSubject0
                .getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result46 = testSubject0
                .getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result47 = testSubject0
                .getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result48 = testSubject0
                .getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result49 = testSubject0
                .getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result50 = testSubject0
                .getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result51 = testSubject0
                .getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result52 = testSubject0
                .getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLDisjointUnionAxiom> result53 = testSubject0
                .getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClass, org.semanticweb.owlapi.model.OWLHasKeyAxiom> result54 = testSubject0
                .getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result55 = testSubject0
                .getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result56 = testSubject0
                .getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result57 = testSubject0
                .getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result58 = testSubject0
                .getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result59 = testSubject0
                .getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result60 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom> result61 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom> result62 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result63 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom> result64 = testSubject0
                .getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result65 = testSubject0
                .getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom> result66 = testSubject0
                .getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result67 = testSubject0
                .getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result68 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom> result69 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom> result70 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result71 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom> result72 = testSubject0
                .getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result73 = testSubject0
                .getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom> result74 = testSubject0
                .getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result75 = testSubject0
                .getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom> result76 = testSubject0
                .getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result77 = testSubject0
                .getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom> result78 = testSubject0
                .getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result79 = testSubject0
                .getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result80 = testSubject0
                .getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom> result81 = testSubject0
                .getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result82 = testSubject0
                .getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom> result83 = testSubject0
                .getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result84 = testSubject0
                .getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result85 = testSubject0
                .getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result86 = testSubject0
                .getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result87 = testSubject0
                .getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result88 = testSubject0
                .getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom> result89 = testSubject0
                .getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result90 = testSubject0
                .getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom> result91 = testSubject0
                .getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom> result92 = testSubject0
                .getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result93 = testSubject0
                .getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom> result94 = testSubject0
                .getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result95 = testSubject0
                .getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result96 = testSubject0
                .getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLDataPropertyExpression, org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom> result97 = testSubject0
                .getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result98 = testSubject0
                .getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result99 = testSubject0
                .getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result100 = testSubject0
                .getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLClassExpression, org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result101 = testSubject0
                .getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom> result102 = testSubject0
                .getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result103 = testSubject0
                .getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result104 = testSubject0
                .getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom> result105 = testSubject0
                .getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom> result106 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result107 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom> result108 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result109 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result110 = testSubject0
                .getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result111 = testSubject0
                .getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLIndividual, org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result112 = testSubject0
                .getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result113 = testSubject0
                .getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<org.semanticweb.owlapi.model.OWLAnnotationSubject, org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result114 = testSubject0
                .getAnnotationAssertionAxiomsBySubject();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result115 = testSubject0
                .getAnnotationAssertionAxiomsBySubject();
    }

    @Test
    public void enforceInterfacesInternalsNoCache() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryInternals.class
                .isAssignableFrom(InternalsNoCache.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(InternalsNoCache.class));
    }

    public void verifyInternalsNoCache() throws Exception {
        InternalsNoCache testSubject0 = new InternalsNoCache(_boolean);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass(_IRI);
        testSubject0.purge();
        org.semanticweb.owlapi.model.OWLNamedIndividual result1 = testSubject0
                .getOWLNamedIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result2 = testSubject0.getTopDatatype();
        org.semanticweb.owlapi.model.OWLObjectProperty result3 = testSubject0
                .getOWLObjectProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result4 = testSubject0
                .getOWLDataProperty(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result5 = testSubject0
                .getOWLAnnotationProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0
                .getRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result7 = testSubject0
                .getOWLDatatype(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0
                .getIntegerOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result9 = testSubject0
                .getFloatOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result10 = testSubject0
                .getDoubleOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result11 = testSubject0
                .getBooleanOWLDatatype();
        org.semanticweb.owlapi.model.OWLLiteral result12 = testSubject0
                .getOWLLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result13 = testSubject0
                .getOWLLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result14 = testSubject0
                .getOWLLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result15 = testSubject0.getOWLLiteral(
                _String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result16 = testSubject0.getOWLLiteral(
                _String, _String);
        org.semanticweb.owlapi.model.OWLLiteral result17 = testSubject0
                .getOWLLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result18 = testSubject0
                .getOWLLiteral(_float);
    }

    @Test
    public void enforceInterfacesMapPointer() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.Internals.Pointer.class
                .isAssignableFrom(MapPointer.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(MapPointer.class));
    }

    public void verifyMapPointer() throws Exception {
        MapPointer testSubject0 = new MapPointer(_AxiomType97, _OWLAxiomVisitorEx,
                _boolean, _Internals);
        boolean result0 = testSubject0.remove(_Object, _OWLAxiom);
        boolean result1 = testSubject0.put(_Object, _OWLAxiom);
        boolean result2 = testSubject0.contains(_Object, _OWLAxiom);
        int result3 = testSubject0.size();
        testSubject0.init();
        java.util.Set<K> result4 = testSubject0.keySet();
        boolean result5 = testSubject0.containsKey(_Object);
        java.util.Set<V> result6 = testSubject0.getAllValues();
        java.util.Set<V> result7 = testSubject0.getValues(_Object);
        boolean result8 = testSubject0.hasValues(_Object);
        boolean result9 = testSubject0.isInitialized();
    }

    @Test
    public void enforceInterfacesOWL2DatatypeImpl() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDatatype.class
                .isAssignableFrom(OWL2DatatypeImpl.class));
    }

    public void verifyOWL2DatatypeImpl() throws Exception {
        OWL2DatatypeImpl testSubject0 = (OWL2DatatypeImpl) OWL2DatatypeImpl
                .getDatatype(_OWL2Datatype);
        int result0 = testSubject0.compareTo(_Object110);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result4 = testSubject0
                .getSignature();
        boolean result5 = testSubject0.isType(_EntityType);
        OWLObject result6 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result7 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result9 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLDataVisitor);
        boolean result10 = testSubject0.isBuiltIn();
        boolean result11 = testSubject0.isString();
        org.semanticweb.owlapi.vocab.OWL2Datatype result12 = testSubject0
                .getBuiltInDatatype();
        boolean result13 = testSubject0.isDatatype();
        boolean result14 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result15 = testSubject0
                .getDataRangeType();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        boolean result25 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result26 = OWL2DatatypeImpl
                .getDatatype(_OWL2Datatype);
        boolean result27 = testSubject0.isInteger();
        boolean result28 = testSubject0.isBoolean();
        boolean result29 = testSubject0.isDouble();
        boolean result30 = testSubject0.isFloat();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result31 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result32 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result33 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result34 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result35 = testSubject0
                .getEntityType();
        OWLEntity result36 = testSubject0.getOWLEntity(_EntityType123);
        boolean result37 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result38 = testSubject0.asOWLClass();
        boolean result39 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result40 = testSubject0
                .asOWLObjectProperty();
        boolean result41 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result42 = testSubject0
                .asOWLDataProperty();
        boolean result43 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result44 = testSubject0
                .asOWLNamedIndividual();
        boolean result45 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result46 = testSubject0.asOWLDatatype();
        boolean result47 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result48 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result49 = testSubject0.toStringID();
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLAnnotationAssertionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom.class
                .isAssignableFrom(OWLAnnotationAssertionAxiomImpl.class));
    }

    public void verifyOWLAnnotationAssertionAxiomImpl() throws Exception {
        OWLAnnotationAssertionAxiomImpl testSubject0 = new OWLAnnotationAssertionAxiomImpl(
                _OWLAnnotationSubject, _OWLAnnotationProperty, _OWLAnnotationValue,
                _Collection);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLAnnotationValue result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLAnnotation result2 = testSubject0.getAnnotation();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLAnnotationSubject result5 = testSubject0
                .getSubject();
        boolean result6 = testSubject0.isDeprecatedIRIAssertion();
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set130);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLAnnotationImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotation.class
                .isAssignableFrom(OWLAnnotationImpl.class));
    }

    public void verifyOWLAnnotationImpl() throws Exception {
        OWLAnnotationImpl testSubject0 = new OWLAnnotationImpl(_OWLAnnotationProperty,
                _OWLAnnotationValue, _Set134);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLAnnotationValue result1 = testSubject0.getValue();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAnnotationObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationObjectVisitorEx);
        boolean result5 = testSubject0.isComment();
        boolean result6 = testSubject0.isLabel();
        boolean result7 = testSubject0.isDeprecatedIRIAnnotation();
        org.semanticweb.owlapi.model.OWLAnnotation result8 = testSubject0
                .getAnnotatedAnnotation(_Set129);
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result11 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result13 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result14 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result15 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result17 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result18 = testSubject0
                .getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLAnnotationPropertyDomainAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom.class
                .isAssignableFrom(OWLAnnotationPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLAnnotationPropertyDomainAxiomImpl() throws Exception {
        OWLAnnotationPropertyDomainAxiomImpl testSubject0 = new OWLAnnotationPropertyDomainAxiomImpl(
                _OWLAnnotationProperty, _IRI, _Collection);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getDomain();
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLAnnotationPropertyImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationProperty.class
                .isAssignableFrom(OWLAnnotationPropertyImpl.class));
    }

    public void verifyOWLAnnotationPropertyImpl() throws Exception {
        OWLAnnotationPropertyImpl testSubject0 = new OWLAnnotationPropertyImpl(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result5 = testSubject0
                .getSuperProperties(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result6 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result7 = testSubject0
                .getSuperProperties(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result8 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result9 = testSubject0
                .getSubProperties(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result10 = testSubject0
                .getSubProperties(_OWLOntology, _boolean);
        boolean result11 = testSubject0.isBuiltIn();
        boolean result12 = testSubject0.isComment();
        boolean result13 = testSubject0.isLabel();
        boolean result14 = testSubject0.isDeprecated();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result15 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result16 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result17 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result18 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result19 = testSubject0
                .getEntityType();
        OWLEntity result20 = testSubject0.getOWLEntity(_EntityType123);
        boolean result21 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result22 = testSubject0.asOWLClass();
        boolean result23 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result24 = testSubject0
                .asOWLObjectProperty();
        boolean result25 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result26 = testSubject0
                .asOWLDataProperty();
        boolean result27 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result28 = testSubject0
                .asOWLNamedIndividual();
        boolean result29 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result30 = testSubject0.asOWLDatatype();
        boolean result31 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result32 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result33 = testSubject0.toStringID();
        int result34 = testSubject0.compareTo(_Object110);
        int result35 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result36 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result37 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result38 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result39 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result40 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result41 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result42 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result43 = testSubject0
                .getNestedClassExpressions();
        boolean result44 = testSubject0.isTopEntity();
        boolean result45 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLAnnotationPropertyRangeAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom.class
                .isAssignableFrom(OWLAnnotationPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLAnnotationPropertyRangeAxiomImpl() throws Exception {
        OWLAnnotationPropertyRangeAxiomImpl testSubject0 = new OWLAnnotationPropertyRangeAxiomImpl(
                _OWLAnnotationProperty, _IRI, _Collection);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getRange();
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnonymousClassExpressionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassExpressionImpl.class
                .isAssignableFrom(OWLAnonymousClassExpressionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnonymousClassExpression.class
                .isAssignableFrom(OWLAnonymousClassExpressionImpl.class));
    }

    public void verifyOWLAnonymousClassExpressionImpl() throws Exception {
        OWLAnonymousClassExpressionImpl testSubject0 = new OWLAnonymousClassExpressionImpl() {
            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public boolean isClassExpressionLiteral() {
                return false;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isOWLThing();
        boolean result1 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result2 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .asConjunctSet();
        boolean result5 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result6 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result7 = testSubject0.getNNF();
        boolean result8 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result9 = testSubject0.asOWLClass();
        int result10 = testSubject0.compareTo(_Object110);
        int result11 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result12 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result13 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result14 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result15 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result16 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result17 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result18 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result19 = testSubject0
                .getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result23 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result24 = testSubject0
                .getClassExpressionType();
        boolean result25 = testSubject0.isClassExpressionLiteral();
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualImpl.class
                .isAssignableFrom(OWLAnonymousIndividualImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnonymousIndividual.class
                .isAssignableFrom(OWLAnonymousIndividualImpl.class));
    }

    public void verifyOWLAnonymousIndividualImpl() throws Exception {
        OWLAnonymousIndividualImpl testSubject0 = new OWLAnonymousIndividualImpl(_NodeID);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLEntity result3 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLIndividualVisitor);
        org.semanticweb.owlapi.model.NodeID result4 = testSubject0.getID();
        boolean result5 = testSubject0.isNamed();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result6 = testSubject0
                .asOWLAnonymousIndividual();
        boolean result7 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLNamedIndividual result8 = testSubject0
                .asOWLNamedIndividual();
        java.lang.String result9 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result10 = testSubject0
                .getTypes(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .getTypes(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result12 = testSubject0
                .getObjectPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result13 = testSubject0
                .getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        boolean result14 = testSubject0.hasObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result15 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression,
                _OWLLiteral, _OWLOntology);
        boolean result16 = testSubject0.hasNegativeObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result17 = testSubject0
                .getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result18 = testSubject0
                .getDataPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result19 = testSubject0
                .getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result20 = testSubject0
                .getNegativeDataPropertyValues(_OWLOntology);
        boolean result21 = testSubject0.hasNegativeDataPropertyValue(
                _OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result22 = testSubject0
                .getSameIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result23 = testSubject0
                .getDifferentIndividuals(_OWLOntology);
        boolean result24 = testSubject0.isBuiltIn();
        boolean result25 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result26 = testSubject0.asOWLClass();
        boolean result27 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result28 = testSubject0
                .asOWLObjectProperty();
        boolean result29 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result30 = testSubject0
                .asOWLDataProperty();
        boolean result31 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result32 = testSubject0.asOWLDatatype();
        int result33 = testSubject0.compareTo(_Object110);
        int result34 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result35 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result36 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result37 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result38 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result39 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result40 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result41 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result42 = testSubject0
                .getNestedClassExpressions();
        boolean result43 = testSubject0.isTopEntity();
        boolean result44 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLAsymmetricObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom.class
                .isAssignableFrom(OWLAsymmetricObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLAsymmetricObjectPropertyAxiomImpl() throws Exception {
        OWLAsymmetricObjectPropertyAxiomImpl testSubject0 = new OWLAsymmetricObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result7 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result8 = testSubject0
                .getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAxiom.class
                .isAssignableFrom(OWLAxiomImpl.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.CollectionContainer.class
                .isAssignableFrom(OWLAxiomImpl.class));
    }

    public void verifyOWLAxiomImpl() throws Exception {
        OWLAxiomImpl testSubject0 = new OWLAxiomImpl(_Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public boolean isLogicalAxiom() {
                return false;
            }

            @Override
            public boolean isAnnotationAxiom() {
                return false;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result2 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result3 = testSubject0.isAnnotated();
        boolean result4 = testSubject0.isOfType(_Set132);
        boolean result5 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0.getNNF();
        int result7 = testSubject0.compareTo(_Object110);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result9 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result10 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result11 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result12 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result13 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result14 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result15 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result20 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result22 = testSubject0
                .getAnnotatedAxiom(_Set129);
        boolean result23 = testSubject0.isLogicalAxiom();
        boolean result24 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLCardinalityRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class
                .isAssignableFrom(OWLCardinalityRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLCardinalityRestriction.class
                .isAssignableFrom(OWLCardinalityRestrictionImpl.class));
    }

    public void verifyOWLCardinalityRestrictionImpl() throws Exception {
        OWLCardinalityRestrictionImpl testSubject0 = mock(OWLCardinalityRestrictionImpl.class);
        int result0 = testSubject0.getCardinality();
        OWLPropertyRange result1 = testSubject0.getFiller();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        boolean result4 = testSubject0.isOWLThing();
        boolean result5 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result7 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result10 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result13 = testSubject0.asOWLClass();
        int result14 = testSubject0.compareTo(_Object110);
        int result15 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result17 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result18 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result19 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result20 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result21 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result22 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result23 = testSubject0
                .getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result27 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result28 = testSubject0
                .getClassExpressionType();
        boolean result29 = testSubject0.isObjectRestriction();
        boolean result30 = testSubject0.isDataRestriction();
        boolean result31 = testSubject0.isQualified();
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualAxiomImpl.class
                .isAssignableFrom(OWLClassAssertionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLClassAssertionAxiom.class
                .isAssignableFrom(OWLClassAssertionAxiomImpl.class));
    }

    public void verifyOWLClassAssertionAxiomImpl() throws Exception {
        OWLClassAssertionAxiomImpl testSubject0 = new OWLClassAssertionAxiomImpl(
                _OWLIndividual, _OWLClassExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getIndividual();
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .getClassExpression();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result4 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLClassAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class
                .isAssignableFrom(OWLClassAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLClassAxiom.class
                .isAssignableFrom(OWLClassAxiomImpl.class));
    }

    public void verifyOWLClassAxiomImpl() throws Exception {
        OWLClassAxiomImpl testSubject0 = mock(OWLClassAxiomImpl.class);
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result11 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result13 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result14 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result15 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result17 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result18 = testSubject0
                .getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result23 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result24 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLClassExpressionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpression.class
                .isAssignableFrom(OWLClassExpressionImpl.class));
    }

    public void verifyOWLClassExpressionImpl() throws Exception {
        OWLClassExpressionImpl testSubject0 = new OWLClassExpressionImpl() {
            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public boolean isClassExpressionLiteral() {
                return false;
            }

            @Override
            public OWLClass asOWLClass() {
                return null;
            }

            @Override
            public boolean isOWLThing() {
                return false;
            }

            @Override
            public boolean isOWLNothing() {
                return false;
            }

            @Override
            public OWLClassExpression getNNF() {
                return null;
            }

            @Override
            public OWLClassExpression getComplementNNF() {
                return null;
            }

            @Override
            public OWLClassExpression getObjectComplementOf() {
                return null;
            }

            @Override
            public Set<OWLClassExpression> asConjunctSet() {
                return null;
            }

            @Override
            public boolean containsConjunct(OWLClassExpression ce) {
                return false;
            }

            @Override
            public Set<OWLClassExpression> asDisjunctSet() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        int result0 = testSubject0.compareTo(_Object110);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result3 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result4 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result5 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result6 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result7 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result8 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        OWLObject result12 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result13 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result14 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result15 = testSubject0
                .getClassExpressionType();
        boolean result16 = testSubject0.isClassExpressionLiteral();
        boolean result17 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result19 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .asConjunctSet();
        boolean result21 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result23 = testSubject0.getNNF();
        boolean result24 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result25 = testSubject0.asOWLClass();
    }

    @Test
    public void enforceInterfacesOWLClassImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassExpressionImpl.class
                .isAssignableFrom(OWLClassImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLClass.class
                .isAssignableFrom(OWLClassImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLClassImpl.class));
    }

    public void verifyOWLClassImpl() throws Exception {
        OWLClassImpl testSubject0 = new OWLClassImpl(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result2 = testSubject0.isType(_EntityType);
        boolean result3 = testSubject0.isDefined(_Set);
        boolean result4 = testSubject0.isDefined(_OWLOntology);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getSuperClasses(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .getSuperClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result10 = testSubject0
                .getSubClasses(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .getSubClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .getEquivalentClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .getEquivalentClasses(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .getDisjointClasses(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .getDisjointClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result16 = testSubject0
                .getIndividuals(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result17 = testSubject0
                .getIndividuals(_OWLOntology);
        boolean result18 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result19 = testSubject0
                .getClassExpressionType();
        boolean result20 = testSubject0.isClassExpressionLiteral();
        boolean result21 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result22 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result23 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result24 = testSubject0
                .asConjunctSet();
        boolean result25 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .asDisjunctSet();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result27 = testSubject0
                .getSubClassAxioms(_OWLOntology);
        boolean result28 = testSubject0.isBuiltIn();
        org.semanticweb.owlapi.model.OWLClassExpression result29 = testSubject0.getNNF();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result33 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result34 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result35 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result36 = testSubject0
                .getEquivalentClassesAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result37 = testSubject0
                .getDisjointClassesAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointUnionAxiom> result38 = testSubject0
                .getDisjointUnionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result39 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result40 = testSubject0
                .getEntityType();
        OWLEntity result41 = testSubject0.getOWLEntity(_EntityType123);
        boolean result42 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result43 = testSubject0.asOWLClass();
        boolean result44 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result45 = testSubject0
                .asOWLObjectProperty();
        boolean result46 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result47 = testSubject0
                .asOWLDataProperty();
        boolean result48 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result49 = testSubject0
                .asOWLNamedIndividual();
        boolean result50 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result51 = testSubject0.asOWLDatatype();
        boolean result52 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result53 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result54 = testSubject0.toStringID();
        int result55 = testSubject0.compareTo(_Object110);
        int result56 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result57 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result58 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result59 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result60 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result61 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result62 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result63 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result64 = testSubject0
                .getNestedClassExpressions();
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFromImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedDataRestrictionImpl.class
                .isAssignableFrom(OWLDataAllValuesFromImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataAllValuesFrom.class
                .isAssignableFrom(OWLDataAllValuesFromImpl.class));
    }

    public void verifyOWLDataAllValuesFromImpl() throws Exception {
        OWLDataAllValuesFromImpl testSubject0 = new OWLDataAllValuesFromImpl(
                _OWLDataPropertyExpression, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLDataRange result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataCardinalityRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLDataCardinalityRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataCardinalityRestriction.class
                .isAssignableFrom(OWLDataCardinalityRestrictionImpl.class));
    }

    public void verifyOWLDataCardinalityRestrictionImpl() throws Exception {
        OWLDataCardinalityRestrictionImpl testSubject0 = mock(OWLDataCardinalityRestrictionImpl.class);
        boolean result0 = testSubject0.isQualified();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        int result3 = testSubject0.getCardinality();
        OWLDataRange result4 = testSubject0.getFiller();
        OWLPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result16 = testSubject0.asOWLClass();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        OWLObject result29 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result30 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result31 = testSubject0
                .getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLDataComplementOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLDataComplementOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataComplementOf.class
                .isAssignableFrom(OWLDataComplementOfImpl.class));
    }

    public void verifyOWLDataComplementOfImpl() throws Exception {
        OWLDataComplementOfImpl testSubject0 = new OWLDataComplementOfImpl(_OWLDataRange);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDataRange result6 = testSubject0.getDataRange();
        org.semanticweb.owlapi.model.OWLDatatype result7 = testSubject0.asOWLDatatype();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result10 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result12 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result13 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result14 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result16 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinalityImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLDataExactCardinalityImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataExactCardinality.class
                .isAssignableFrom(OWLDataExactCardinalityImpl.class));
    }

    public void verifyOWLDataExactCardinalityImpl() throws Exception {
        OWLDataExactCardinalityImpl testSubject0 = new OWLDataExactCardinalityImpl(
                _OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLDataExactCardinalityImpl testSubject1 = new OWLDataExactCardinalityImpl(
                _OWLDataPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .asIntersectionOfMinMax();
        boolean result4 = testSubject0.isQualified();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        int result7 = testSubject0.getCardinality();
        OWLDataRange result8 = testSubject0.getFiller();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLThing();
        boolean result12 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .asConjunctSet();
        boolean result16 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result20 = testSubject0.asOWLClass();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataFactoryImpl() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataFactory.class
                .isAssignableFrom(OWLDataFactoryImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLDataFactoryImpl.class));
    }

    public void verifyOWLDataFactoryImpl() throws Exception {
        OWLDataFactoryImpl testSubject0 = new OWLDataFactoryImpl(_boolean, _boolean);
        OWLDataFactoryImpl testSubject1 = new OWLDataFactoryImpl();
        org.semanticweb.owlapi.model.OWLDataFactory result0 = OWLDataFactoryImpl
                .getInstance();
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result1 = testSubject0
                .getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result2 = testSubject0
                .getOWLEquivalentClassesAxiom(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result3 = testSubject0
                .getOWLEquivalentClassesAxiom(_Set152, _Set134);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result4 = testSubject0
                .getOWLEquivalentClassesAxiom(_Set152);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result5 = testSubject0
                .getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result6 = testSubject0
                .getOWLDisjointClassesAxiom(_Set152, _Set134);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result7 = testSubject0
                .getOWLDisjointClassesAxiom(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result8 = testSubject0
                .getOWLDisjointClassesAxiom(_Set152);
        org.semanticweb.owlapi.model.OWLClass result9 = testSubject0.getOWLClass(_String,
                _PrefixManager);
        org.semanticweb.owlapi.model.OWLClass result10 = testSubject0.getOWLClass(_IRI);
        org.semanticweb.owlapi.model.OWLClass result11 = testSubject0.getOWLThing();
        testSubject0.purge();
        org.semanticweb.owlapi.model.OWLNamedIndividual result12 = testSubject0
                .getOWLNamedIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLNamedIndividual result13 = testSubject0
                .getOWLNamedIndividual(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLObjectInverseOf result14 = testSubject0
                .getOWLObjectInverseOf(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLDatatype result15 = testSubject0.getTopDatatype();
        org.semanticweb.owlapi.model.OWLObjectProperty result16 = testSubject0
                .getOWLObjectProperty(_IRI);
        org.semanticweb.owlapi.model.OWLObjectProperty result17 = testSubject0
                .getOWLObjectProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLDataProperty result18 = testSubject0
                .getOWLDataProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result19 = testSubject0
                .getOWLDataProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLClass result20 = testSubject0.getOWLNothing();
        org.semanticweb.owlapi.model.OWLObjectProperty result21 = testSubject0
                .getOWLTopObjectProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result22 = testSubject0
                .getOWLTopDataProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result23 = testSubject0
                .getOWLBottomObjectProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result24 = testSubject0
                .getOWLBottomDataProperty();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result25 = testSubject0
                .getOWLAnonymousIndividual();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result26 = testSubject0
                .getOWLAnonymousIndividual(_String);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result27 = testSubject0
                .getOWLAnnotationProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result28 = testSubject0
                .getOWLAnnotationProperty(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result29 = testSubject0
                .getRDFSLabel();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result30 = testSubject0
                .getRDFSComment();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result31 = testSubject0
                .getRDFSSeeAlso();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result32 = testSubject0
                .getRDFSIsDefinedBy();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result33 = testSubject0
                .getOWLVersionInfo();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result34 = testSubject0
                .getOWLBackwardCompatibleWith();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result35 = testSubject0
                .getOWLIncompatibleWith();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result36 = testSubject0
                .getOWLDeprecated();
        org.semanticweb.owlapi.model.OWLDatatype result37 = testSubject0
                .getRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result38 = testSubject0.getOWLDatatype(
                _String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLDatatype result39 = testSubject0
                .getOWLDatatype(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result40 = testSubject0
                .getIntegerOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result41 = testSubject0
                .getFloatOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result42 = testSubject0
                .getDoubleOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result43 = testSubject0
                .getBooleanOWLDatatype();
        org.semanticweb.owlapi.model.OWLLiteral result44 = testSubject0.getOWLLiteral(
                _String, _String);
        org.semanticweb.owlapi.model.OWLLiteral result45 = testSubject0
                .getOWLLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result46 = testSubject0
                .getOWLLiteral(_float);
        org.semanticweb.owlapi.model.OWLLiteral result47 = testSubject0.getOWLLiteral(
                _String, _OWL2Datatype);
        org.semanticweb.owlapi.model.OWLLiteral result48 = testSubject0
                .getOWLLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result49 = testSubject0.getOWLLiteral(
                _String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result50 = testSubject0
                .getOWLLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result51 = testSubject0
                .getOWLLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result52 = testSubject0
                .getOWLTypedLiteral(_String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result53 = testSubject0
                .getOWLTypedLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result54 = testSubject0
                .getOWLTypedLiteral(_float);
        org.semanticweb.owlapi.model.OWLLiteral result55 = testSubject0
                .getOWLTypedLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result56 = testSubject0
                .getOWLTypedLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result57 = testSubject0
                .getOWLTypedLiteral(_String, _OWL2Datatype);
        org.semanticweb.owlapi.model.OWLLiteral result58 = testSubject0
                .getOWLTypedLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result59 = testSubject0
                .getOWLStringLiteral(_String, _String);
        org.semanticweb.owlapi.model.OWLLiteral result60 = testSubject0
                .getOWLStringLiteral(_String);
        org.semanticweb.owlapi.model.OWLDataOneOf result61 = testSubject0
                .getOWLDataOneOf(_Set154);
        org.semanticweb.owlapi.model.OWLDataOneOf result62 = testSubject0
                .getOWLDataOneOf(_OWLLiteral_array);
        org.semanticweb.owlapi.model.OWLDataComplementOf result63 = testSubject0
                .getOWLDataComplementOf(_OWLDataRange);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result64 = testSubject0
                .getOWLDatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result65 = testSubject0
                .getOWLDatatypeRestriction(_OWLDatatype, _OWLFacet, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result66 = testSubject0
                .getOWLDatatypeRestriction(_OWLDatatype, _Set158);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result67 = testSubject0
                .getOWLDatatypeMinInclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result68 = testSubject0
                .getOWLDatatypeMinInclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result69 = testSubject0
                .getOWLDatatypeMaxInclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result70 = testSubject0
                .getOWLDatatypeMaxInclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result71 = testSubject0
                .getOWLDatatypeMinMaxInclusiveRestriction(_int, _int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result72 = testSubject0
                .getOWLDatatypeMinMaxInclusiveRestriction(_double, _double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result73 = testSubject0
                .getOWLDatatypeMinExclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result74 = testSubject0
                .getOWLDatatypeMinExclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result75 = testSubject0
                .getOWLDatatypeMaxExclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result76 = testSubject0
                .getOWLDatatypeMaxExclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result77 = testSubject0
                .getOWLDatatypeMinMaxExclusiveRestriction(_int, _int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result78 = testSubject0
                .getOWLDatatypeMinMaxExclusiveRestriction(_double, _double);
        org.semanticweb.owlapi.model.OWLFacetRestriction result79 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _float);
        org.semanticweb.owlapi.model.OWLFacetRestriction result80 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _int);
        org.semanticweb.owlapi.model.OWLFacetRestriction result81 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _double);
        org.semanticweb.owlapi.model.OWLFacetRestriction result82 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataUnionOf result83 = testSubject0
                .getOWLDataUnionOf(_Set159);
        org.semanticweb.owlapi.model.OWLDataUnionOf result84 = testSubject0
                .getOWLDataUnionOf(_OWLDataRange_array);
        org.semanticweb.owlapi.model.OWLDataIntersectionOf result85 = testSubject0
                .getOWLDataIntersectionOf(_Set159);
        org.semanticweb.owlapi.model.OWLDataIntersectionOf result86 = testSubject0
                .getOWLDataIntersectionOf(_OWLDataRange_array);
        org.semanticweb.owlapi.model.OWLObjectIntersectionOf result87 = testSubject0
                .getOWLObjectIntersectionOf(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLObjectIntersectionOf result88 = testSubject0
                .getOWLObjectIntersectionOf(_Set152);
        org.semanticweb.owlapi.model.OWLDataSomeValuesFrom result89 = testSubject0
                .getOWLDataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataAllValuesFrom result90 = testSubject0
                .getOWLDataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result91 = testSubject0
                .getOWLDataExactCardinality(_int, _OWLDataPropertyExpression,
                        _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result92 = testSubject0
                .getOWLDataExactCardinality(_int, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result93 = testSubject0
                .getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result94 = testSubject0
                .getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result95 = testSubject0
                .getOWLDataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result96 = testSubject0
                .getOWLDataMinCardinality(_int, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataHasValue result97 = testSubject0
                .getOWLDataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLObjectComplementOf result98 = testSubject0
                .getOWLObjectComplementOf(_OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectOneOf result99 = testSubject0
                .getOWLObjectOneOf(_Set161);
        org.semanticweb.owlapi.model.OWLObjectOneOf result100 = testSubject0
                .getOWLObjectOneOf(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLObjectAllValuesFrom result101 = testSubject0
                .getOWLObjectAllValuesFrom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom result102 = testSubject0
                .getOWLObjectSomeValuesFrom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result103 = testSubject0
                .getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result104 = testSubject0
                .getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result105 = testSubject0
                .getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result106 = testSubject0
                .getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result107 = testSubject0
                .getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result108 = testSubject0
                .getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectHasSelf result109 = testSubject0
                .getOWLObjectHasSelf(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectHasValue result110 = testSubject0
                .getOWLObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLObjectUnionOf result111 = testSubject0
                .getOWLObjectUnionOf(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLObjectUnionOf result112 = testSubject0
                .getOWLObjectUnionOf(_Set152);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result113 = testSubject0
                .getOWLDeclarationAxiom(_OWLEntity, _Set134);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result114 = testSubject0
                .getOWLDeclarationAxiom(_OWLEntity);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result115 = testSubject0
                .getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression, _Set134);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result116 = testSubject0
                .getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result117 = testSubject0
                .getOWLDisjointUnionAxiom(_OWLClass, _Set152);
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result118 = testSubject0
                .getOWLDisjointUnionAxiom(_OWLClass, _Set152, _Set134);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result119 = testSubject0
                .getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result120 = testSubject0
                .getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result121 = testSubject0
                .getOWLSubPropertyChainOfAxiom(_List, _OWLObjectPropertyExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result122 = testSubject0
                .getOWLSubPropertyChainOfAxiom(_List, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result123 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result124 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result125 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_Set164, _Set134);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result126 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_Set164);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result127 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result128 = testSubject0
                .getOWLDisjointObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result129 = testSubject0
                .getOWLDisjointObjectPropertiesAxiom(_Set164, _Set134);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result130 = testSubject0
                .getOWLDisjointObjectPropertiesAxiom(_Set164);
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result131 = testSubject0
                .getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result132 = testSubject0
                .getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result133 = testSubject0
                .getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression, _Set134);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result134 = testSubject0
                .getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result135 = testSubject0
                .getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result136 = testSubject0
                .getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression, _Set134);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result137 = testSubject0
                .getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result138 = testSubject0
                .getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result139 = testSubject0
                .getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result140 = testSubject0
                .getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result141 = testSubject0
                .getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result142 = testSubject0
                .getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result143 = testSubject0
                .getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result144 = testSubject0
                .getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result145 = testSubject0
                .getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result146 = testSubject0
                .getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result147 = testSubject0
                .getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result148 = testSubject0
                .getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result149 = testSubject0
                .getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result150 = testSubject0
                .getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set134);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result151 = testSubject0
                .getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result152 = testSubject0
                .getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result153 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result154 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_Set167);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result155 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result156 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result157 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_Set167, _Set134);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result158 = testSubject0
                .getOWLDisjointDataPropertiesAxiom(_Set167);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result159 = testSubject0
                .getOWLDisjointDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result160 = testSubject0
                .getOWLDisjointDataPropertiesAxiom(_Set167, _Set134);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result161 = testSubject0
                .getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result162 = testSubject0
                .getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression,
                        _OWLClassExpression, _Set134);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result163 = testSubject0
                .getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange,
                        _Set134);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result164 = testSubject0
                .getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result165 = testSubject0
                .getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result166 = testSubject0
                .getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression, _Set134);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result167 = testSubject0
                .getOWLHasKeyAxiom(_OWLClassExpression, _Set168, _Set134);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result168 = testSubject0
                .getOWLHasKeyAxiom(_OWLClassExpression, _OWLPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result169 = testSubject0
                .getOWLHasKeyAxiom(_OWLClassExpression, _Set168);
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result170 = testSubject0
                .getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result171 = testSubject0
                .getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange, _Set134);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result172 = testSubject0
                .getOWLSameIndividualAxiom(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result173 = testSubject0
                .getOWLSameIndividualAxiom(_Set161);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result174 = testSubject0
                .getOWLSameIndividualAxiom(_Set161, _Set134);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result175 = testSubject0
                .getOWLDifferentIndividualsAxiom(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result176 = testSubject0
                .getOWLDifferentIndividualsAxiom(_Set161);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result177 = testSubject0
                .getOWLDifferentIndividualsAxiom(_Set161, _Set134);
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result178 = testSubject0
                .getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual, _Set134);
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result179 = testSubject0
                .getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result180 = testSubject0
                .getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual, _Set134);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result181 = testSubject0
                .getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result182 = testSubject0
                .getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result183 = testSubject0
                .getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual, _Set134);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result184 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral, _Set134);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result185 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result186 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _int);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result187 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _double);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result188 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _String);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result189 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _float);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result190 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _boolean);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result191 = testSubject0
                .getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral, _Set134);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result192 = testSubject0
                .getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLAnnotation result193 = testSubject0
                .getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        org.semanticweb.owlapi.model.OWLAnnotation result194 = testSubject0
                .getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue, _Set134);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result195 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationSubject, _OWLAnnotationValue, _Set134);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result196 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation,
                        _Set134);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result197 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result198 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationSubject, _OWLAnnotationValue);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result199 = testSubject0
                .getDeprecatedOWLAnnotationAssertionAxiom(_IRI);
        org.semanticweb.owlapi.model.OWLImportsDeclaration result200 = testSubject0
                .getOWLImportsDeclaration(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result201 = testSubject0
                .getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI,
                        _Set134);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result202 = testSubject0
                .getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result203 = testSubject0
                .getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI, _Set134);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result204 = testSubject0
                .getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI);
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result205 = testSubject0
                .getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationProperty);
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result206 = testSubject0
                .getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationProperty, _Set134);
        org.semanticweb.owlapi.model.SWRLRule result207 = testSubject0.getSWRLRule(
                _NodeID, _Set170, _Set170);
        org.semanticweb.owlapi.model.SWRLRule result208 = testSubject0.getSWRLRule(
                _Set170, _Set170);
        org.semanticweb.owlapi.model.SWRLRule result209 = testSubject0.getSWRLRule(_IRI,
                _Set170, _Set170);
        org.semanticweb.owlapi.model.SWRLRule result210 = testSubject0.getSWRLRule(
                _Set170, _Set170, _Set129);
        org.semanticweb.owlapi.model.SWRLClassAtom result211 = testSubject0
                .getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        org.semanticweb.owlapi.model.SWRLDataRangeAtom result212 = testSubject0
                .getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        org.semanticweb.owlapi.model.SWRLObjectPropertyAtom result213 = testSubject0
                .getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument,
                        _SWRLIArgument);
        org.semanticweb.owlapi.model.SWRLDataPropertyAtom result214 = testSubject0
                .getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument,
                        _SWRLDArgument);
        org.semanticweb.owlapi.model.SWRLBuiltInAtom result215 = testSubject0
                .getSWRLBuiltInAtom(_IRI, _List173);
        org.semanticweb.owlapi.model.SWRLVariable result216 = testSubject0
                .getSWRLVariable(_IRI);
        org.semanticweb.owlapi.model.SWRLIndividualArgument result217 = testSubject0
                .getSWRLIndividualArgument(_OWLIndividual);
        org.semanticweb.owlapi.model.SWRLLiteralArgument result218 = testSubject0
                .getSWRLLiteralArgument(_OWLLiteral);
        org.semanticweb.owlapi.model.SWRLSameIndividualAtom result219 = testSubject0
                .getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom result220 = testSubject0
                .getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
        OWLEntity result221 = testSubject0.getOWLEntity(_EntityType123, _IRI);
    }

    

    public void verifyInterfaceOWLDataFactoryInternals() throws Exception {
        OWLDataFactoryInternals testSubject0 = mock(OWLDataFactoryInternals.class);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass(_IRI);
        testSubject0.purge();
        org.semanticweb.owlapi.model.OWLNamedIndividual result1 = testSubject0
                .getOWLNamedIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result2 = testSubject0.getTopDatatype();
        org.semanticweb.owlapi.model.OWLObjectProperty result3 = testSubject0
                .getOWLObjectProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result4 = testSubject0
                .getOWLDataProperty(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result5 = testSubject0
                .getOWLAnnotationProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0
                .getRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result7 = testSubject0
                .getOWLDatatype(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0
                .getIntegerOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result9 = testSubject0
                .getFloatOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result10 = testSubject0
                .getDoubleOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result11 = testSubject0
                .getBooleanOWLDatatype();
        org.semanticweb.owlapi.model.OWLLiteral result12 = testSubject0
                .getOWLLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result13 = testSubject0
                .getOWLLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result14 = testSubject0
                .getOWLLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result15 = testSubject0.getOWLLiteral(
                _String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result16 = testSubject0
                .getOWLLiteral(_float);
        org.semanticweb.owlapi.model.OWLLiteral result17 = testSubject0
                .getOWLLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result18 = testSubject0.getOWLLiteral(
                _String, _String);
    }

    @Test
    public void enforceInterfacesOWLDataFactoryInternalsImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.InternalsNoCache.class
                .isAssignableFrom(OWLDataFactoryInternalsImpl.class));
    }

    public void verifyOWLDataFactoryInternalsImpl() throws Exception {
        OWLDataFactoryInternalsImpl testSubject0 = new OWLDataFactoryInternalsImpl(
                _boolean);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.getOWLClass(_IRI);
        testSubject0.purge();
        org.semanticweb.owlapi.model.OWLNamedIndividual result1 = testSubject0
                .getOWLNamedIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLObjectProperty result2 = testSubject0
                .getOWLObjectProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result3 = testSubject0
                .getOWLDataProperty(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result4 = testSubject0
                .getOWLAnnotationProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result5 = testSubject0
                .getOWLDatatype(_IRI);
        org.semanticweb.owlapi.model.OWLLiteral result6 = testSubject0
                .getOWLLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result7 = testSubject0
                .getOWLLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result8 = testSubject0
                .getOWLLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result9 = testSubject0.getOWLLiteral(
                _String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result10 = testSubject0
                .getOWLLiteral(_float);
        org.semanticweb.owlapi.model.OWLDatatype result11 = testSubject0.getTopDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result12 = testSubject0
                .getRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result13 = testSubject0
                .getIntegerOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result14 = testSubject0
                .getFloatOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result15 = testSubject0
                .getDoubleOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result16 = testSubject0
                .getBooleanOWLDatatype();
        org.semanticweb.owlapi.model.OWLLiteral result17 = testSubject0
                .getOWLLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result18 = testSubject0.getOWLLiteral(
                _String, _String);
    }

    @Test
    public void enforceInterfacesOWLDataHasValueImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLValueRestrictionImpl.class
                .isAssignableFrom(OWLDataHasValueImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataHasValue.class
                .isAssignableFrom(OWLDataHasValueImpl.class));
    }

    public void verifyOWLDataHasValueImpl() throws Exception {
        OWLDataHasValueImpl testSubject0 = new OWLDataHasValueImpl(
                _OWLDataPropertyExpression, _OWLLiteral);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .asSomeValuesFrom();
        OWLLiteral result6 = testSubject0.getValue();
        OWLPropertyExpression result7 = testSubject0.getProperty();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result18 = testSubject0.asOWLClass();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryDataRangeImpl.class
                .isAssignableFrom(OWLDataIntersectionOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataIntersectionOf.class
                .isAssignableFrom(OWLDataIntersectionOfImpl.class));
    }

    public void verifyOWLDataIntersectionOfImpl() throws Exception {
        OWLDataIntersectionOfImpl testSubject0 = new OWLDataIntersectionOfImpl(_Set159);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.DataRangeType result3 = testSubject0
                .getDataRangeType();
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result7 = testSubject0
                .getOperands();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result10 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result12 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result13 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result14 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result16 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinalityImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLDataMaxCardinalityImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataMaxCardinality.class
                .isAssignableFrom(OWLDataMaxCardinalityImpl.class));
    }

    public void verifyOWLDataMaxCardinalityImpl() throws Exception {
        OWLDataMaxCardinalityImpl testSubject0 = new OWLDataMaxCardinalityImpl(
                _OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLDataMaxCardinalityImpl testSubject1 = new OWLDataMaxCardinalityImpl(
                _OWLDataPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLDataRange result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinalityImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLDataMinCardinalityImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataMinCardinality.class
                .isAssignableFrom(OWLDataMinCardinalityImpl.class));
    }

    public void verifyOWLDataMinCardinalityImpl() throws Exception {
        OWLDataMinCardinalityImpl testSubject0 = new OWLDataMinCardinalityImpl(
                _OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLDataMinCardinalityImpl testSubject1 = new OWLDataMinCardinalityImpl(
                _OWLDataPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLDataRange result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataOneOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLDataOneOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataOneOf.class
                .isAssignableFrom(OWLDataOneOfImpl.class));
    }

    public void verifyOWLDataOneOfImpl() throws Exception {
        OWLDataOneOfImpl testSubject0 = new OWLDataOneOfImpl(_Set154);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result6 = testSubject0
                .getValues();
        org.semanticweb.owlapi.model.OWLDatatype result7 = testSubject0.asOWLDatatype();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result10 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result12 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result13 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result14 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result16 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class
                .isAssignableFrom(OWLDataPropertyAssertionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom.class
                .isAssignableFrom(OWLDataPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLDataPropertyAssertionAxiomImpl() throws Exception {
        OWLDataPropertyAssertionAxiomImpl testSubject0 = new OWLDataPropertyAssertionAxiomImpl(
                _OWLIndividual, _OWLDataPropertyExpression, _OWLLiteral, _Set134);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObject result9 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result10 = testSubject0.getSubject();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set132);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result19 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyCharacteristicAxiomImpl()
            throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class
                .isAssignableFrom(OWLDataPropertyCharacteristicAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLDataPropertyCharacteristicAxiomImpl.class));
    }

    public void verifyOWLDataPropertyCharacteristicAxiomImpl() throws Exception {
        OWLDataPropertyCharacteristicAxiomImpl testSubject0 = new OWLDataPropertyCharacteristicAxiomImpl(
                _OWLDataPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        org.semanticweb.owlapi.model.OWLPropertyExpression result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result1 = testSubject0
                .getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyDomainAxiomImpl.class
                .isAssignableFrom(OWLDataPropertyDomainAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom.class
                .isAssignableFrom(OWLDataPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLDataPropertyDomainAxiomImpl() throws Exception {
        OWLDataPropertyDomainAxiomImpl testSubject0 = new OWLDataPropertyDomainAxiomImpl(
                _OWLDataPropertyExpression, _OWLClassExpression, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLClassExpression result7 = testSubject0
                .getDomain();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyExpressionImpl.class
                .isAssignableFrom(OWLDataPropertyImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataProperty.class
                .isAssignableFrom(OWLDataPropertyImpl.class));
    }

    public void verifyOWLDataPropertyImpl() throws Exception {
        OWLDataPropertyImpl testSubject0 = new OWLDataPropertyImpl(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result6 = testSubject0.isFunctional(_Set);
        boolean result7 = testSubject0.isFunctional(_OWLOntology);
        boolean result8 = testSubject0.isDataPropertyExpression();
        boolean result9 = testSubject0.isObjectPropertyExpression();
        boolean result10 = testSubject0.isOWLTopObjectProperty();
        boolean result11 = testSubject0.isOWLBottomObjectProperty();
        boolean result12 = testSubject0.isOWLTopDataProperty();
        boolean result13 = testSubject0.isOWLBottomDataProperty();
        boolean result14 = testSubject0.isBuiltIn();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result18 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result19 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result20 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result21 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result22 = testSubject0
                .getEntityType();
        OWLEntity result23 = testSubject0.getOWLEntity(_EntityType123);
        boolean result24 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result25 = testSubject0.asOWLClass();
        boolean result26 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result27 = testSubject0
                .asOWLObjectProperty();
        boolean result28 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result29 = testSubject0
                .asOWLDataProperty();
        boolean result30 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result31 = testSubject0
                .asOWLNamedIndividual();
        boolean result32 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result33 = testSubject0.asOWLDatatype();
        boolean result34 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result35 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result36 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result37 = testSubject0
                .getDomains(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result38 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<OWLDataRange> result39 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLDataRange> result40 = testSubject0.getRanges(_Set);
        java.util.Set<OWLDataPropertyExpression> result41 = testSubject0
                .getSuperProperties(_Set);
        java.util.Set<OWLDataPropertyExpression> result42 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result43 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result44 = testSubject0
                .getSubProperties(_Set);
        java.util.Set<OWLDataPropertyExpression> result45 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result46 = testSubject0
                .getEquivalentProperties(_Set);
        java.util.Set<OWLDataPropertyExpression> result47 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result48 = testSubject0
                .getDisjointProperties(_Set);
        int result49 = testSubject0.compareTo(_Object110);
        int result50 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result51 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result52 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result53 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result54 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result55 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result56 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result57 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result58 = testSubject0
                .getNestedClassExpressions();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyRangeAxiomImpl.class
                .isAssignableFrom(OWLDataPropertyRangeAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom.class
                .isAssignableFrom(OWLDataPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLDataPropertyRangeAxiomImpl() throws Exception {
        OWLDataPropertyRangeAxiomImpl testSubject0 = new OWLDataPropertyRangeAxiomImpl(
                _OWLDataPropertyExpression, _OWLDataRange, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLDataRange result7 = testSubject0.getRange();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFromImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedDataRestrictionImpl.class
                .isAssignableFrom(OWLDataSomeValuesFromImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataSomeValuesFrom.class
                .isAssignableFrom(OWLDataSomeValuesFromImpl.class));
    }

    public void verifyOWLDataSomeValuesFromImpl() throws Exception {
        OWLDataSomeValuesFromImpl testSubject0 = new OWLDataSomeValuesFromImpl(
                _OWLDataPropertyExpression, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLDataRange result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLDatatypeDefinitionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom.class
                .isAssignableFrom(OWLDatatypeDefinitionAxiomImpl.class));
    }

    public void verifyOWLDatatypeDefinitionAxiomImpl() throws Exception {
        OWLDatatypeDefinitionAxiomImpl testSubject0 = new OWLDatatypeDefinitionAxiomImpl(
                _OWLDatatype, _OWLDataRange, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.OWLDataRange result2 = testSubject0.getDataRange();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result8 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLDatatype result9 = testSubject0.getDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result10 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set132);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDatatypeImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLDatatypeImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDatatype.class
                .isAssignableFrom(OWLDatatypeImpl.class));
    }

    public void verifyOWLDatatypeImpl() throws Exception {
        OWLDatatypeImpl testSubject0 = new OWLDatatypeImpl(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result7 = testSubject0.isBuiltIn();
        boolean result8 = testSubject0.isString();
        org.semanticweb.owlapi.vocab.OWL2Datatype result9 = testSubject0
                .getBuiltInDatatype();
        boolean result10 = testSubject0.isDatatype();
        boolean result11 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result12 = testSubject0
                .getDataRangeType();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.isRDFPlainLiteral();
        boolean result16 = testSubject0.isInteger();
        boolean result17 = testSubject0.isBoolean();
        boolean result18 = testSubject0.isDouble();
        boolean result19 = testSubject0.isFloat();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result20 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result21 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result22 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result23 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result24 = testSubject0
                .getEntityType();
        OWLEntity result25 = testSubject0.getOWLEntity(_EntityType123);
        boolean result26 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result27 = testSubject0.asOWLClass();
        boolean result28 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result29 = testSubject0
                .asOWLObjectProperty();
        boolean result30 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result31 = testSubject0
                .asOWLDataProperty();
        boolean result32 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result33 = testSubject0
                .asOWLNamedIndividual();
        boolean result34 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result35 = testSubject0.asOWLDatatype();
        boolean result36 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result37 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result38 = testSubject0.toStringID();
        int result39 = testSubject0.compareTo(_Object110);
        int result40 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result41 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result42 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result43 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result44 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result45 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result46 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result47 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result48 = testSubject0
                .getNestedClassExpressions();
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLDatatypeRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDatatypeRestriction.class
                .isAssignableFrom(OWLDatatypeRestrictionImpl.class));
    }

    public void verifyOWLDatatypeRestrictionImpl() throws Exception {
        OWLDatatypeRestrictionImpl testSubject0 = new OWLDatatypeRestrictionImpl(
                _OWLDatatype, _Set158);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.getDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> result7 = testSubject0
                .getFacetRestrictions();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.asOWLDatatype();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result11 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result13 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result14 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result15 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result17 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result18 = testSubject0
                .getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataUnionOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryDataRangeImpl.class
                .isAssignableFrom(OWLDataUnionOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataUnionOf.class
                .isAssignableFrom(OWLDataUnionOfImpl.class));
    }

    public void verifyOWLDataUnionOfImpl() throws Exception {
        OWLDataUnionOfImpl testSubject0 = new OWLDataUnionOfImpl(_Set159);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.DataRangeType result3 = testSubject0
                .getDataRangeType();
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result7 = testSubject0
                .getOperands();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result10 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result12 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result13 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result14 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result16 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDeclarationAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLDeclarationAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDeclarationAxiom.class
                .isAssignableFrom(OWLDeclarationAxiomImpl.class));
    }

    public void verifyOWLDeclarationAxiomImpl() throws Exception {
        OWLDeclarationAxiomImpl testSubject0 = new OWLDeclarationAxiomImpl(_OWLEntity,
                _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result8 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLEntity result9 = testSubject0.getEntity();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result10 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set132);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryIndividualAxiomImpl.class
                .isAssignableFrom(OWLDifferentIndividualsAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom.class
                .isAssignableFrom(OWLDifferentIndividualsAxiomImpl.class));
    }

    public void verifyOWLDifferentIndividualsAxiomImpl() throws Exception {
        OWLDifferentIndividualsAxiomImpl testSubject0 = new OWLDifferentIndividualsAxiomImpl(
                _Set161, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        java.util.Set<org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result2 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result3 = testSubject0
                .asOWLSubClassOfAxioms();
        boolean result4 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result10 = testSubject0
                .getIndividuals();
        java.util.List<org.semanticweb.owlapi.model.OWLIndividual> result11 = testSubject0
                .getIndividualsAsList();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryClassAxiomImpl.class
                .isAssignableFrom(OWLDisjointClassesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDisjointClassesAxiom.class
                .isAssignableFrom(OWLDisjointClassesAxiomImpl.class));
    }

    public void verifyOWLDisjointClassesAxiomImpl() throws Exception {
        OWLDisjointClassesAxiomImpl testSubject0 = new OWLDisjointClassesAxiomImpl(
                _Set152, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result2 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result3 = testSubject0
                .asOWLSubClassOfAxioms();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result8 = testSubject0.getAxiomType();
        boolean result9 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result10 = testSubject0
                .getClassExpressions();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .getClassExpressionsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result16 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result24 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result25 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result26 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result27 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result28 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result29 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result30 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result31 = testSubject0
                .getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLDisjointDataPropertiesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom.class
                .isAssignableFrom(OWLDisjointDataPropertiesAxiomImpl.class));
    }

    public void verifyOWLDisjointDataPropertiesAxiomImpl() throws Exception {
        OWLDisjointDataPropertiesAxiomImpl testSubject0 = new OWLDisjointDataPropertiesAxiomImpl(
                _Set167, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        java.util.Set<OWLDataPropertyExpression> result7 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result8 = testSubject0
                .getPropertiesMinus(_OWLDataPropertyExpression);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLDisjointObjectPropertiesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom.class
                .isAssignableFrom(OWLDisjointObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLDisjointObjectPropertiesAxiomImpl() throws Exception {
        OWLDisjointObjectPropertiesAxiomImpl testSubject0 = new OWLDisjointObjectPropertiesAxiomImpl(
                _Set164, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class
                .isAssignableFrom(OWLDisjointUnionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDisjointUnionAxiom.class
                .isAssignableFrom(OWLDisjointUnionAxiomImpl.class));
    }

    public void verifyOWLDisjointUnionAxiomImpl() throws Exception {
        OWLDisjointUnionAxiomImpl testSubject0 = new OWLDisjointUnionAxiomImpl(_OWLClass,
                _Set152, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getClassExpressions();
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result3 = testSubject0
                .getOWLEquivalentClassesAxiom();
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result4 = testSubject0
                .getOWLDisjointClassesAxiom();
        org.semanticweb.owlapi.model.OWLClass result5 = testSubject0.getOWLClass();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set132);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result19 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLEntityCollectionContainerCollector() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLEntityCollectionContainerCollector.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(OWLEntityCollectionContainerCollector.class));
    }

    public void verifyOWLEntityCollectionContainerCollector() throws Exception {
        OWLEntityCollectionContainerCollector testSubject0 = new OWLEntityCollectionContainerCollector(
                _Set177);
        OWLEntityCollectionContainerCollector testSubject1 = new OWLEntityCollectionContainerCollector(
                _Set177, _Collection178);
        OWLEntityCollectionContainerCollector testSubject2 = new OWLEntityCollectionContainerCollector();
        testSubject0.reset(_Set177);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getObjects();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result1 = testSubject0
                .getAnonymousIndividuals();
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.setCollectClasses(_boolean);
        testSubject0.setCollectObjectProperties(_boolean);
        testSubject0.setCollectDataProperties(_boolean);
        testSubject0.setCollectIndividuals(_boolean);
        testSubject0.setCollectDatatypes(_boolean);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryClassAxiomImpl.class
                .isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom.class
                .isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
    }

    public void verifyOWLEquivalentClassesAxiomImpl() throws Exception {
        OWLEquivalentClassesAxiomImpl testSubject0 = new OWLEquivalentClassesAxiomImpl(
                _Set152, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.containsOWLThing();
        boolean result3 = testSubject0.containsOWLNothing();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result4 = testSubject0
                .getNamedClasses();
        boolean result5 = testSubject0.containsNamedEquivalentClass();
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result6 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result7 = testSubject0
                .asOWLSubClassOfAxioms();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result9 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result11 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .getClassExpressions();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .getClassExpressionsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        boolean result17 = testSubject0.isLogicalAxiom();
        boolean result18 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result19 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result20 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result21 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result22 = testSubject0.isAnnotated();
        boolean result23 = testSubject0.isOfType(_Set132);
        boolean result24 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0.getNNF();
        int result26 = testSubject0.compareTo(_Object110);
        int result27 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result28 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result29 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result30 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result31 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result32 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result33 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result34 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result35 = testSubject0
                .getNestedClassExpressions();
        boolean result36 = testSubject0.isTopEntity();
        boolean result37 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLEquivalentDataPropertiesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom.class
                .isAssignableFrom(OWLEquivalentDataPropertiesAxiomImpl.class));
    }

    public void verifyOWLEquivalentDataPropertiesAxiomImpl() throws Exception {
        OWLEquivalentDataPropertiesAxiomImpl testSubject0 = new OWLEquivalentDataPropertiesAxiomImpl(
                _Set167, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result2 = testSubject0
                .asSubDataPropertyOfAxioms();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        java.util.Set<OWLDataPropertyExpression> result8 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result9 = testSubject0
                .getPropertiesMinus(_OWLDataPropertyExpression);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiomImpl()
            throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLEquivalentObjectPropertiesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom.class
                .isAssignableFrom(OWLEquivalentObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLEquivalentObjectPropertiesAxiomImpl() throws Exception {
        OWLEquivalentObjectPropertiesAxiomImpl testSubject0 = new OWLEquivalentObjectPropertiesAxiomImpl(
                _Set164, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result2 = testSubject0
                .asSubObjectPropertyOfAxioms();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLFacetRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLFacetRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLFacetRestriction.class
                .isAssignableFrom(OWLFacetRestrictionImpl.class));
    }

    public void verifyOWLFacetRestrictionImpl() throws Exception {
        OWLFacetRestrictionImpl testSubject0 = new OWLFacetRestrictionImpl(_OWLFacet,
                _OWLLiteral);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.OWLLiteral result2 = testSubject0.getFacetValue();
        org.semanticweb.owlapi.vocab.OWLFacet result3 = testSubject0.getFacet();
        int result4 = testSubject0.compareTo(_Object110);
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result7 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result8 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result9 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result10 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result11 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result12 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLFunctionalDataPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom.class
                .isAssignableFrom(OWLFunctionalDataPropertyAxiomImpl.class));
    }

    public void verifyOWLFunctionalDataPropertyAxiomImpl() throws Exception {
        OWLFunctionalDataPropertyAxiomImpl testSubject0 = new OWLFunctionalDataPropertyAxiomImpl(
                _OWLDataPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result8 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result9 = testSubject0
                .getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLFunctionalObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom.class
                .isAssignableFrom(OWLFunctionalObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLFunctionalObjectPropertyAxiomImpl() throws Exception {
        OWLFunctionalObjectPropertyAxiomImpl testSubject0 = new OWLFunctionalObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result8 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result9 = testSubject0
                .getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLHasKeyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class
                .isAssignableFrom(OWLHasKeyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLHasKeyAxiom.class
                .isAssignableFrom(OWLHasKeyAxiomImpl.class));
    }

    public void verifyOWLHasKeyAxiomImpl() throws Exception {
        OWLHasKeyAxiomImpl testSubject0 = new OWLHasKeyAxiomImpl(_OWLClassExpression,
                _Set168, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLClassExpression result2 = testSubject0
                .getClassExpression();
        java.util.Set<org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>> result3 = testSubject0
                .getPropertyExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result4 = testSubject0
                .getObjectPropertyExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyExpression> result5 = testSubject0
                .getDataPropertyExpressions();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set130);
        boolean result10 = testSubject0.isLogicalAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set132);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result19 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLImportsDeclarationImpl() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLImportsDeclaration.class
                .isAssignableFrom(OWLImportsDeclarationImpl.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLImportsDeclarationImpl.class));
    }

    public void verifyOWLImportsDeclarationImpl() throws Exception {
        OWLImportsDeclarationImpl testSubject0 = new OWLImportsDeclarationImpl(_IRI);
        int result0 = testSubject0.compareTo(_OWLImportsDeclaration);
        boolean result2 = testSubject0.isLogicalAxiom();
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getIRI();
        java.net.URI result4 = testSubject0.getURI();
    }

    @Test
    public void enforceInterfacesOWLIndividualAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class
                .isAssignableFrom(OWLIndividualAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLIndividualAxiom.class
                .isAssignableFrom(OWLIndividualAxiomImpl.class));
    }

    public void verifyOWLIndividualAxiomImpl() throws Exception {
        OWLIndividualAxiomImpl testSubject0 = new OWLIndividualAxiomImpl(_Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result11 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result13 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result14 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result15 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result17 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result18 = testSubject0
                .getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result23 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result24 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLIndividualImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLIndividualImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLIndividual.class
                .isAssignableFrom(OWLIndividualImpl.class));
    }

    public void verifyOWLIndividualImpl() throws Exception {
        OWLIndividualImpl testSubject0 = new OWLIndividualImpl() {
            @Override
            public boolean isNamed() {
                return false;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public OWLNamedIndividual asOWLNamedIndividual() {
                return null;
            }

            @Override
            public OWLAnonymousIndividual asOWLAnonymousIndividual() {
                return null;
            }

            @Override
            public String toStringID() {
                return null;
            }

            @Override
            public void accept(OWLIndividualVisitor visitor) {}

            @Override
            public <O> O accept(OWLIndividualVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getTypes(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getTypes(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result2 = testSubject0
                .getObjectPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result3 = testSubject0
                .getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        boolean result4 = testSubject0.hasObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result5 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression,
                _OWLLiteral, _OWLOntology);
        boolean result6 = testSubject0.hasNegativeObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result7 = testSubject0
                .getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result8 = testSubject0
                .getDataPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result9 = testSubject0
                .getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result10 = testSubject0
                .getNegativeDataPropertyValues(_OWLOntology);
        boolean result11 = testSubject0.hasNegativeDataPropertyValue(
                _OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result12 = testSubject0
                .getSameIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result13 = testSubject0
                .getDifferentIndividuals(_OWLOntology);
        boolean result14 = testSubject0.isBuiltIn();
        boolean result15 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result16 = testSubject0.asOWLClass();
        boolean result17 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result18 = testSubject0
                .asOWLObjectProperty();
        boolean result19 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result20 = testSubject0
                .asOWLDataProperty();
        boolean result21 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result22 = testSubject0.asOWLDatatype();
        int result23 = testSubject0.compareTo(_Object110);
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result25 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result26 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result27 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result28 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result29 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result30 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result31 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result32 = testSubject0
                .getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        OWLObject result35 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result36 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result37 = testSubject0.isNamed();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result38 = testSubject0
                .asOWLAnonymousIndividual();
        boolean result39 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLNamedIndividual result40 = testSubject0
                .asOWLNamedIndividual();
        java.lang.String result41 = testSubject0.toStringID();
    }

    @Test
    public void enforceInterfacesOWLIndividualRelationshipAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class
                .isAssignableFrom(OWLIndividualRelationshipAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionAxiom.class
                .isAssignableFrom(OWLIndividualRelationshipAxiomImpl.class));
    }

    public void verifyOWLIndividualRelationshipAxiomImpl() throws Exception {
        OWLIndividualRelationshipAxiomImpl<OWLObjectPropertyExpression, OWLIndividual> testSubject0 = new OWLIndividualRelationshipAxiomImpl(
                _OWLIndividual, _OWLPropertyExpression, _OWLIndividual, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {
                return null;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result8 = testSubject0.isAnnotated();
        boolean result9 = testSubject0.isOfType(_Set132);
        boolean result10 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result11 = testSubject0.getNNF();
        int result12 = testSubject0.compareTo(_Object110);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result15 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result16 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result17 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result18 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result19 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result20 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result25 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result27 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result28 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result29 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiomImpl()
            throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom.class
                .isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLInverseFunctionalObjectPropertyAxiomImpl() throws Exception {
        OWLInverseFunctionalObjectPropertyAxiomImpl testSubject0 = new OWLInverseFunctionalObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result8 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result9 = testSubject0
                .getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLInverseObjectPropertiesAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom.class
                .isAssignableFrom(OWLInverseObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLInverseObjectPropertiesAxiomImpl() throws Exception {
        OWLInverseObjectPropertiesAxiomImpl testSubject0 = new OWLInverseObjectPropertiesAxiomImpl(
                _OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result2 = testSubject0
                .getSecondProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result3 = testSubject0
                .asSubObjectPropertyOfAxioms();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result4 = testSubject0
                .getFirstProperty();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        java.util.Set<OWLObjectPropertyExpression> result10 = testSubject0
                .getProperties();
        java.util.Set<OWLObjectPropertyExpression> result11 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLIrreflexiveObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom.class
                .isAssignableFrom(OWLIrreflexiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLIrreflexiveObjectPropertyAxiomImpl() throws Exception {
        OWLIrreflexiveObjectPropertyAxiomImpl testSubject0 = new OWLIrreflexiveObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result8 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result9 = testSubject0
                .getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLLiteralImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLiteral.class
                .isAssignableFrom(OWLLiteralImpl.class));
    }

    public void verifyOWLLiteralImpl() throws Exception {
        OWLLiteralImpl testSubject0 = new OWLLiteralImpl(_String, _String, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataVisitor);
        java.lang.String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        java.lang.String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplBoolean() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLLiteralImplBoolean.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLiteral.class
                .isAssignableFrom(OWLLiteralImplBoolean.class));
    }

    public void verifyOWLLiteralImplBoolean() throws Exception {
        OWLLiteralImplBoolean testSubject0 = new OWLLiteralImplBoolean(_boolean);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        java.lang.String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        java.lang.String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplDouble() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLLiteralImplDouble.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLiteral.class
                .isAssignableFrom(OWLLiteralImplDouble.class));
    }

    public void verifyOWLLiteralImplDouble() throws Exception {
        OWLLiteralImplDouble testSubject0 = new OWLLiteralImplDouble(_double,
                _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        java.lang.String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        java.lang.String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplFloat() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLLiteralImplFloat.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLiteral.class
                .isAssignableFrom(OWLLiteralImplFloat.class));
    }

    public void verifyOWLLiteralImplFloat() throws Exception {
        OWLLiteralImplFloat testSubject0 = new OWLLiteralImplFloat(_float, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        java.lang.String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        java.lang.String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplInteger() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLLiteralImplInteger.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLiteral.class
                .isAssignableFrom(OWLLiteralImplInteger.class));
    }

    public void verifyOWLLiteralImplInteger() throws Exception {
        OWLLiteralImplInteger testSubject0 = new OWLLiteralImplInteger(_int, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        java.lang.String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        java.lang.String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplNoCompression() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLLiteralImplNoCompression.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLiteral.class
                .isAssignableFrom(OWLLiteralImplNoCompression.class));
    }

    public void verifyOWLLiteralImplNoCompression() throws Exception {
        OWLLiteralImplNoCompression testSubject0 = new OWLLiteralImplNoCompression(
                _byte_array, _String, _OWLDatatype);
        OWLLiteralImplNoCompression testSubject1 = new OWLLiteralImplNoCompression(
                _String, _String, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        java.lang.String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang();
        boolean result10 = testSubject0.hasLang(_String);
        java.lang.String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLogicalAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLLogicalAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLLogicalAxiomImpl.class));
    }

    public void verifyOWLLogicalAxiomImpl() throws Exception {
        OWLLogicalAxiomImpl testSubject0 = new OWLLogicalAxiomImpl(_Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result11 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result13 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result14 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result15 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result17 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result18 = testSubject0
                .getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result23 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result24 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualImpl.class
                .isAssignableFrom(OWLNamedIndividualImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNamedIndividual.class
                .isAssignableFrom(OWLNamedIndividualImpl.class));
    }

    public void verifyOWLNamedIndividualImpl() throws Exception {
        OWLNamedIndividualImpl testSubject0 = new OWLNamedIndividualImpl(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result6 = testSubject0.isNamed();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result7 = testSubject0
                .asOWLAnonymousIndividual();
        boolean result8 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result9 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result10 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result11 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result12 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result13 = testSubject0
                .getEntityType();
        OWLEntity result14 = testSubject0.getOWLEntity(_EntityType123);
        boolean result15 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result16 = testSubject0
                .asOWLNamedIndividual();
        boolean result17 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result18 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result19 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getTypes(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .getTypes(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result22 = testSubject0
                .getObjectPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result23 = testSubject0
                .getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        boolean result24 = testSubject0.hasObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result25 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression,
                _OWLLiteral, _OWLOntology);
        boolean result26 = testSubject0.hasNegativeObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result27 = testSubject0
                .getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result28 = testSubject0
                .getDataPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result29 = testSubject0
                .getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result30 = testSubject0
                .getNegativeDataPropertyValues(_OWLOntology);
        boolean result31 = testSubject0.hasNegativeDataPropertyValue(
                _OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result32 = testSubject0
                .getSameIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result33 = testSubject0
                .getDifferentIndividuals(_OWLOntology);
        boolean result34 = testSubject0.isBuiltIn();
        boolean result35 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result36 = testSubject0.asOWLClass();
        boolean result37 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result38 = testSubject0
                .asOWLObjectProperty();
        boolean result39 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result40 = testSubject0
                .asOWLDataProperty();
        boolean result41 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result42 = testSubject0.asOWLDatatype();
        int result43 = testSubject0.compareTo(_Object110);
        int result44 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result45 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result46 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result47 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result48 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result49 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result50 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result51 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result52 = testSubject0
                .getNestedClassExpressions();
        boolean result53 = testSubject0.isTopEntity();
        boolean result54 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLNaryBooleanClassExpressionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class
                .isAssignableFrom(OWLNaryBooleanClassExpressionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryBooleanClassExpression.class
                .isAssignableFrom(OWLNaryBooleanClassExpressionImpl.class));
    }

    public void verifyOWLNaryBooleanClassExpressionImpl() throws Exception {
        OWLNaryBooleanClassExpressionImpl testSubject0 = new OWLNaryBooleanClassExpressionImpl(
                _Set152) {
            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        boolean result0 = testSubject0.isClassExpressionLiteral();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getOperandsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getOperands();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result27 = testSubject0
                .getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLNaryClassAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class
                .isAssignableFrom(OWLNaryClassAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryClassAxiom.class
                .isAssignableFrom(OWLNaryClassAxiomImpl.class));
    }

    public void verifyOWLNaryClassAxiomImpl() throws Exception {
        OWLNaryClassAxiomImpl testSubject0 = new OWLNaryClassAxiomImpl(_Set152,
                _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public Set<? extends OWLNaryAxiom> asPairwiseAxioms() {
                return null;
            }

            @Override
            public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {
                return null;
            }
        };
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getClassExpressions();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getClassExpressionsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        boolean result4 = testSubject0.isLogicalAxiom();
        boolean result5 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result7 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result9 = testSubject0.isAnnotated();
        boolean result10 = testSubject0.isOfType(_Set132);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result26 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result27 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result28 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result29 = testSubject0.getAxiomType();
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLNaryAxiom> result30 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result31 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryDataRangeImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLNaryDataRangeImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryDataRange.class
                .isAssignableFrom(OWLNaryDataRangeImpl.class));
    }

    public void verifyOWLNaryDataRangeImpl() throws Exception {
        OWLNaryDataRangeImpl testSubject0 = mock(OWLNaryDataRangeImpl.class);
        boolean result0 = testSubject0.isDatatype();
        boolean result1 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result2 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result3 = testSubject0
                .getOperands();
        int result4 = testSubject0.compareTo(_Object110);
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result7 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result8 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result9 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result10 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result11 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result12 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result17 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result18 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        org.semanticweb.owlapi.model.DataRangeType result19 = testSubject0
                .getDataRangeType();
    }

    @Test
    public void enforceInterfacesOWLNaryIndividualAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualAxiomImpl.class
                .isAssignableFrom(OWLNaryIndividualAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryIndividualAxiom.class
                .isAssignableFrom(OWLNaryIndividualAxiomImpl.class));
    }

    public void verifyOWLNaryIndividualAxiomImpl() throws Exception {
        OWLNaryIndividualAxiomImpl testSubject0 = new OWLNaryIndividualAxiomImpl(_Set161,
                _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public Set<? extends OWLNaryAxiom> asPairwiseAxioms() {
                return null;
            }

            @Override
            public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {
                return null;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result0 = testSubject0
                .getIndividuals();
        java.util.List<org.semanticweb.owlapi.model.OWLIndividual> result1 = testSubject0
                .getIndividualsAsList();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLNaryAxiom> result28 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result29 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class
                .isAssignableFrom(OWLNaryPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryPropertyAxiom.class
                .isAssignableFrom(OWLNaryPropertyAxiomImpl.class));
    }

    public void verifyOWLNaryPropertyAxiomImpl() throws Exception {
        OWLNaryPropertyAxiomImpl<OWLObjectPropertyExpression> testSubject0 = new OWLNaryPropertyAxiomImpl(
                _Set181, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        java.util.Set<OWLObjectPropertyExpression> result0 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiomImpl()
            throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class
                .isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom.class
                .isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLNegativeDataPropertyAssertionAxiomImpl() throws Exception {
        OWLNegativeDataPropertyAssertionAxiomImpl testSubject0 = new OWLNegativeDataPropertyAssertionAxiomImpl(
                _OWLIndividual, _OWLDataPropertyExpression, _OWLLiteral, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        boolean result3 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObject result10 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result11 = testSubject0.getSubject();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiomImpl()
            throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class
                .isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom.class
                .isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLNegativeObjectPropertyAssertionAxiomImpl() throws Exception {
        OWLNegativeObjectPropertyAssertionAxiomImpl testSubject0 = new OWLNegativeObjectPropertyAssertionAxiomImpl(
                _OWLIndividual, _OWLObjectPropertyExpression, _OWLIndividual, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        boolean result3 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObject result10 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result11 = testSubject0.getSubject();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result14 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFromImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedObjectRestrictionImpl.class
                .isAssignableFrom(OWLObjectAllValuesFromImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectAllValuesFrom.class
                .isAssignableFrom(OWLObjectAllValuesFromImpl.class));
    }

    public void verifyOWLObjectAllValuesFromImpl() throws Exception {
        OWLObjectAllValuesFromImpl testSubject0 = new OWLObjectAllValuesFromImpl(
                _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLClassExpression result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectCardinalityRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLObjectCardinalityRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction.class
                .isAssignableFrom(OWLObjectCardinalityRestrictionImpl.class));
    }

    public void verifyOWLObjectCardinalityRestrictionImpl() throws Exception {
        OWLObjectCardinalityRestrictionImpl testSubject0 = mock(OWLObjectCardinalityRestrictionImpl.class);
        boolean result0 = testSubject0.isQualified();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        int result3 = testSubject0.getCardinality();
        OWLClassExpression result4 = testSubject0.getFiller();
        OWLPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result16 = testSubject0.asOWLClass();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        OWLObject result29 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result30 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result31 = testSubject0
                .getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class
                .isAssignableFrom(OWLObjectComplementOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectComplementOf.class
                .isAssignableFrom(OWLObjectComplementOfImpl.class));
    }

    public void verifyOWLObjectComplementOfImpl() throws Exception {
        OWLObjectComplementOfImpl testSubject0 = new OWLObjectComplementOfImpl(
                _OWLClassExpression);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        org.semanticweb.owlapi.model.OWLClassExpression result4 = testSubject0
                .getOperand();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result7 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result8 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result14 = testSubject0.asOWLClass();
        int result15 = testSubject0.compareTo(_Object110);
        int result16 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result18 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result19 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result20 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result21 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result22 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result23 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result24 = testSubject0
                .getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinalityImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLObjectExactCardinalityImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectExactCardinality.class
                .isAssignableFrom(OWLObjectExactCardinalityImpl.class));
    }

    public void verifyOWLObjectExactCardinalityImpl() throws Exception {
        OWLObjectExactCardinalityImpl testSubject0 = new OWLObjectExactCardinalityImpl(
                _OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .asIntersectionOfMinMax();
        boolean result4 = testSubject0.isQualified();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        int result7 = testSubject0.getCardinality();
        OWLClassExpression result8 = testSubject0.getFiller();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLThing();
        boolean result12 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .asConjunctSet();
        boolean result16 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result20 = testSubject0.asOWLClass();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result24 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result25 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result26 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result27 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result28 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result29 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectHasSelfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class
                .isAssignableFrom(OWLObjectHasSelfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectHasSelf.class
                .isAssignableFrom(OWLObjectHasSelfImpl.class));
    }

    public void verifyOWLObjectHasSelfImpl() throws Exception {
        OWLObjectHasSelfImpl testSubject0 = new OWLObjectHasSelfImpl(
                _OWLObjectPropertyExpression);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result16 = testSubject0.asOWLClass();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectHasValueImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLValueRestrictionImpl.class
                .isAssignableFrom(OWLObjectHasValueImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectHasValue.class
                .isAssignableFrom(OWLObjectHasValueImpl.class));
    }

    public void verifyOWLObjectHasValueImpl() throws Exception {
        OWLObjectHasValueImpl testSubject0 = new OWLObjectHasValueImpl(
                _OWLObjectPropertyExpression, _OWLIndividual);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .asSomeValuesFrom();
        OWLIndividual result6 = testSubject0.getValue();
        OWLPropertyExpression result7 = testSubject0.getProperty();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result18 = testSubject0.asOWLClass();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectImpl() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLObjectImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObjectImpl.class));
    }

    public void verifyOWLObjectImpl() throws Exception {
        OWLObjectImpl testSubject0 = new OWLObjectImpl() {
            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        int result0 = testSubject0.compareTo(_Object110);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result3 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result4 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result5 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result6 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result7 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result8 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        OWLObject result12 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryBooleanClassExpressionImpl.class
                .isAssignableFrom(OWLObjectIntersectionOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectIntersectionOf.class
                .isAssignableFrom(OWLObjectIntersectionOfImpl.class));
    }

    public void verifyOWLObjectIntersectionOfImpl() throws Exception {
        OWLObjectIntersectionOfImpl testSubject0 = new OWLObjectIntersectionOfImpl(
                _Set152);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .asConjunctSet();
        boolean result4 = testSubject0.containsConjunct(_OWLClassExpression);
        boolean result5 = testSubject0.isClassExpressionLiteral();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result6 = testSubject0
                .getOperandsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .getOperands();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result15 = testSubject0.asOWLClass();
        int result16 = testSubject0.compareTo(_Object110);
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result19 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result20 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result21 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result22 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result23 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result24 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result25 = testSubject0
                .getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectInverseOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyExpressionImpl.class
                .isAssignableFrom(OWLObjectInverseOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectInverseOf.class
                .isAssignableFrom(OWLObjectInverseOfImpl.class));
    }

    public void verifyOWLObjectInverseOfImpl() throws Exception {
        OWLObjectInverseOfImpl testSubject0 = new OWLObjectInverseOfImpl(
                _OWLObjectPropertyExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result2 = testSubject0.isOWLTopObjectProperty();
        boolean result3 = testSubject0.isOWLBottomObjectProperty();
        boolean result4 = testSubject0.isOWLTopDataProperty();
        boolean result5 = testSubject0.isOWLBottomDataProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result6 = testSubject0
                .getInverse();
        boolean result7 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLObjectProperty result8 = testSubject0
                .asOWLObjectProperty();
        boolean result9 = testSubject0.isFunctional(_OWLOntology);
        boolean result10 = testSubject0.isFunctional(_Set);
        boolean result11 = testSubject0.isDataPropertyExpression();
        boolean result12 = testSubject0.isObjectPropertyExpression();
        boolean result13 = testSubject0.isTransitive(_OWLOntology);
        boolean result14 = testSubject0.isTransitive(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result15 = testSubject0
                .getInverses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result16 = testSubject0
                .getInverses(_Set);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result17 = testSubject0
                .getInverseProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result18 = testSubject0
                .getSimplified();
        boolean result19 = testSubject0.isSymmetric(_Set);
        boolean result20 = testSubject0.isSymmetric(_OWLOntology);
        boolean result21 = testSubject0.isInverseFunctional(_OWLOntology);
        boolean result22 = testSubject0.isInverseFunctional(_Set);
        org.semanticweb.owlapi.model.OWLObjectProperty result23 = testSubject0
                .getNamedProperty();
        boolean result24 = testSubject0.isAsymmetric(_Set);
        boolean result25 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result26 = testSubject0.isReflexive(_OWLOntology);
        boolean result27 = testSubject0.isReflexive(_Set);
        boolean result28 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result29 = testSubject0.isIrreflexive(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result30 = testSubject0
                .getDomains(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result31 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result32 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result33 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result34 = testSubject0
                .getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result35 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result36 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result37 = testSubject0
                .getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result38 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result39 = testSubject0
                .getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result40 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result41 = testSubject0
                .getDisjointProperties(_Set);
        int result42 = testSubject0.compareTo(_Object110);
        int result43 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result44 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result45 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result46 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result47 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result48 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result49 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result50 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result51 = testSubject0
                .getNestedClassExpressions();
        boolean result52 = testSubject0.isTopEntity();
        boolean result53 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinalityImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLObjectMaxCardinalityImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectMaxCardinality.class
                .isAssignableFrom(OWLObjectMaxCardinalityImpl.class));
    }

    public void verifyOWLObjectMaxCardinalityImpl() throws Exception {
        OWLObjectMaxCardinalityImpl testSubject0 = new OWLObjectMaxCardinalityImpl(
                _OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObjectMaxCardinalityImpl testSubject1 = new OWLObjectMaxCardinalityImpl(
                _OWLObjectPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLClassExpression result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinalityImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class
                .isAssignableFrom(OWLObjectMinCardinalityImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectMinCardinality.class
                .isAssignableFrom(OWLObjectMinCardinalityImpl.class));
    }

    public void verifyOWLObjectMinCardinalityImpl() throws Exception {
        OWLObjectMinCardinalityImpl testSubject0 = new OWLObjectMinCardinalityImpl(
                _OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLClassExpression result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result24 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result25 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result26 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result27 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result28 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result29 = testSubject0
                .getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectOneOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class
                .isAssignableFrom(OWLObjectOneOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectOneOf.class
                .isAssignableFrom(OWLObjectOneOfImpl.class));
    }

    public void verifyOWLObjectOneOfImpl() throws Exception {
        OWLObjectOneOfImpl testSubject0 = new OWLObjectOneOfImpl(_Set161);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result2 = testSubject0
                .getIndividuals();
        org.semanticweb.owlapi.model.ClassExpressionType result3 = testSubject0
                .getClassExpressionType();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .asObjectUnionOf();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result8 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result10 = testSubject0
                .asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result15 = testSubject0.asOWLClass();
        int result16 = testSubject0.compareTo(_Object110);
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result19 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result20 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result21 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result22 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result23 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result24 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result25 = testSubject0
                .getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class
                .isAssignableFrom(OWLObjectPropertyAssertionAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom.class
                .isAssignableFrom(OWLObjectPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyAssertionAxiomImpl() throws Exception {
        OWLObjectPropertyAssertionAxiomImpl testSubject0 = new OWLObjectPropertyAssertionAxiomImpl(
                _OWLIndividual, _OWLObjectPropertyExpression, _OWLIndividual, _Set134);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        boolean result8 = testSubject0.isInSimplifiedForm();
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result9 = testSubject0
                .getSimplified();
        OWLPropertyExpression result10 = testSubject0.getProperty();
        OWLObject result11 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result12 = testSubject0.getSubject();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result16 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result24 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result25 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result26 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result27 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result28 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result29 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result30 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result31 = testSubject0
                .getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyCharacteristicAxiomImpl()
            throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class
                .isAssignableFrom(OWLObjectPropertyCharacteristicAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLObjectPropertyCharacteristicAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyCharacteristicAxiomImpl() throws Exception {
        OWLObjectPropertyCharacteristicAxiomImpl testSubject0 = new OWLObjectPropertyCharacteristicAxiomImpl(
                _OWLObjectPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLPropertyExpression result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result1 = testSubject0
                .getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyDomainAxiomImpl.class
                .isAssignableFrom(OWLObjectPropertyDomainAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom.class
                .isAssignableFrom(OWLObjectPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyDomainAxiomImpl() throws Exception {
        OWLObjectPropertyDomainAxiomImpl testSubject0 = new OWLObjectPropertyDomainAxiomImpl(
                _OWLObjectPropertyExpression, _OWLClassExpression, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLClassExpression result8 = testSubject0
                .getDomain();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpressionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyExpressionImpl.class
                .isAssignableFrom(OWLObjectPropertyExpressionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyExpression.class
                .isAssignableFrom(OWLObjectPropertyExpressionImpl.class));
    }

    public void verifyOWLObjectPropertyExpressionImpl() throws Exception {
        OWLObjectPropertyExpressionImpl testSubject0 = new OWLObjectPropertyExpressionImpl() {
            @Override
            public OWLObjectProperty asOWLObjectProperty() {
                return null;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public void accept(OWLPropertyExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLPropertyExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public boolean isOWLTopObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLTopDataProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomDataProperty() {
                return false;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected Set<? extends OWLSubPropertyAxiom<OWLObjectPropertyExpression>>
                    getSubPropertyAxiomsForRHS(OWLOntology ont) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isFunctional(_OWLOntology);
        boolean result1 = testSubject0.isFunctional(_Set);
        boolean result2 = testSubject0.isDataPropertyExpression();
        boolean result3 = testSubject0.isObjectPropertyExpression();
        boolean result4 = testSubject0.isTransitive(_OWLOntology);
        boolean result5 = testSubject0.isTransitive(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result6 = testSubject0
                .getInverses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result7 = testSubject0
                .getInverses(_Set);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result8 = testSubject0
                .getInverseProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result9 = testSubject0
                .getSimplified();
        boolean result10 = testSubject0.isSymmetric(_Set);
        boolean result11 = testSubject0.isSymmetric(_OWLOntology);
        boolean result12 = testSubject0.isInverseFunctional(_OWLOntology);
        boolean result13 = testSubject0.isInverseFunctional(_Set);
        org.semanticweb.owlapi.model.OWLObjectProperty result14 = testSubject0
                .getNamedProperty();
        boolean result15 = testSubject0.isAsymmetric(_Set);
        boolean result16 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result17 = testSubject0.isReflexive(_OWLOntology);
        boolean result18 = testSubject0.isReflexive(_Set);
        boolean result19 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result20 = testSubject0.isIrreflexive(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .getDomains(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result23 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result24 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result25 = testSubject0
                .getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result26 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result27 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result28 = testSubject0
                .getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result29 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result30 = testSubject0
                .getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result31 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result32 = testSubject0
                .getDisjointProperties(_Set);
        int result33 = testSubject0.compareTo(_Object110);
        int result34 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result35 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result36 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result37 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result38 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result39 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result40 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result41 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result42 = testSubject0
                .getNestedClassExpressions();
        boolean result43 = testSubject0.isTopEntity();
        boolean result44 = testSubject0.isBottomEntity();
        OWLObject result45 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result46 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result47 = testSubject0.isOWLTopObjectProperty();
        boolean result48 = testSubject0.isOWLBottomObjectProperty();
        boolean result49 = testSubject0.isOWLTopDataProperty();
        boolean result50 = testSubject0.isOWLBottomDataProperty();
        boolean result51 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLObjectProperty result52 = testSubject0
                .asOWLObjectProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyExpressionImpl.class
                .isAssignableFrom(OWLObjectPropertyImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectProperty.class
                .isAssignableFrom(OWLObjectPropertyImpl.class));
    }

    public void verifyOWLObjectPropertyImpl() throws Exception {
        OWLObjectPropertyImpl testSubject0 = new OWLObjectPropertyImpl(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        boolean result6 = testSubject0.isOWLTopObjectProperty();
        boolean result7 = testSubject0.isOWLBottomObjectProperty();
        boolean result8 = testSubject0.isOWLTopDataProperty();
        boolean result9 = testSubject0.isOWLBottomDataProperty();
        boolean result10 = testSubject0.isBuiltIn();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        boolean result13 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result14 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result15 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result16 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result17 = testSubject0.getIRI();
        org.semanticweb.owlapi.model.EntityType<?> result18 = testSubject0
                .getEntityType();
        OWLEntity result19 = testSubject0.getOWLEntity(_EntityType123);
        boolean result20 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result21 = testSubject0.asOWLClass();
        boolean result22 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result23 = testSubject0
                .asOWLObjectProperty();
        boolean result24 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result25 = testSubject0
                .asOWLDataProperty();
        boolean result26 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result27 = testSubject0
                .asOWLNamedIndividual();
        boolean result28 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result29 = testSubject0.asOWLDatatype();
        boolean result30 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result31 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result32 = testSubject0.toStringID();
        boolean result33 = testSubject0.isFunctional(_OWLOntology);
        boolean result34 = testSubject0.isFunctional(_Set);
        boolean result35 = testSubject0.isDataPropertyExpression();
        boolean result36 = testSubject0.isObjectPropertyExpression();
        boolean result37 = testSubject0.isTransitive(_OWLOntology);
        boolean result38 = testSubject0.isTransitive(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result39 = testSubject0
                .getInverses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result40 = testSubject0
                .getInverses(_Set);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result41 = testSubject0
                .getInverseProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result42 = testSubject0
                .getSimplified();
        boolean result43 = testSubject0.isSymmetric(_Set);
        boolean result44 = testSubject0.isSymmetric(_OWLOntology);
        boolean result45 = testSubject0.isInverseFunctional(_OWLOntology);
        boolean result46 = testSubject0.isInverseFunctional(_Set);
        org.semanticweb.owlapi.model.OWLObjectProperty result47 = testSubject0
                .getNamedProperty();
        boolean result48 = testSubject0.isAsymmetric(_Set);
        boolean result49 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result50 = testSubject0.isReflexive(_OWLOntology);
        boolean result51 = testSubject0.isReflexive(_Set);
        boolean result52 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result53 = testSubject0.isIrreflexive(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result54 = testSubject0
                .getDomains(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result55 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result56 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result57 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result58 = testSubject0
                .getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result59 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result60 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result61 = testSubject0
                .getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result62 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result63 = testSubject0
                .getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result64 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result65 = testSubject0
                .getDisjointProperties(_Set);
        int result66 = testSubject0.compareTo(_Object110);
        int result67 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result68 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result69 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result70 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result71 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result72 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result73 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result74 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result75 = testSubject0
                .getNestedClassExpressions();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyRangeAxiomImpl.class
                .isAssignableFrom(OWLObjectPropertyRangeAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom.class
                .isAssignableFrom(OWLObjectPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyRangeAxiomImpl() throws Exception {
        OWLObjectPropertyRangeAxiomImpl testSubject0 = new OWLObjectPropertyRangeAxiomImpl(
                _OWLObjectPropertyExpression, _OWLClassExpression, _Set134);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLClassExpression result8 = testSubject0.getRange();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFromImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedObjectRestrictionImpl.class
                .isAssignableFrom(OWLObjectSomeValuesFromImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom.class
                .isAssignableFrom(OWLObjectSomeValuesFromImpl.class));
    }

    public void verifyOWLObjectSomeValuesFromImpl() throws Exception {
        OWLObjectSomeValuesFromImpl testSubject0 = new OWLObjectSomeValuesFromImpl(
                _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLClassExpression result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOfImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryBooleanClassExpressionImpl.class
                .isAssignableFrom(OWLObjectUnionOfImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectUnionOf.class
                .isAssignableFrom(OWLObjectUnionOfImpl.class));
    }

    public void verifyOWLObjectUnionOfImpl() throws Exception {
        OWLObjectUnionOfImpl testSubject0 = new OWLObjectUnionOfImpl(_Set152);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .asDisjunctSet();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result5 = testSubject0
                .getOperandsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result6 = testSubject0
                .getOperands();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result15 = testSubject0.asOWLClass();
        int result16 = testSubject0.compareTo(_Object110);
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result19 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result20 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result21 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result22 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result23 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result24 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result25 = testSubject0
                .getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLOntologyImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLOntologyImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLMutableOntology.class
                .isAssignableFrom(OWLOntologyImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyImpl.class));
    }

    public void verifyOWLOntologyImpl() throws Exception {
        OWLOntologyImpl testSubject0 = new OWLOntologyImpl(_OWLOntologyManager,
                _OWLOntologyID);
        boolean result0 = testSubject0.isEmpty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature(_boolean);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLOntologyID result5 = testSubject0.getOntologyID();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result6 = testSubject0
                .getClassesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result7 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result8 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result9 = testSubject0
                .getDataPropertiesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result10 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result11 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result12 = testSubject0
                .getObjectPropertiesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result13 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result14 = testSubject0
                .getIndividualsInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result15 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result16 = testSubject0
                .getDatatypesInSignature(_boolean);
        boolean result17 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLOntologyManager result18 = testSubject0
                .getOWLOntologyManager();
        java.util.Set<org.semanticweb.owlapi.model.IRI> result19 = testSubject0
                .getDirectImportsDocuments();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result20 = testSubject0
                .getDirectImports();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result21 = testSubject0
                .getImports();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result22 = testSubject0
                .getImportsClosure();
        java.util.Set<org.semanticweb.owlapi.model.OWLImportsDeclaration> result23 = testSubject0
                .getImportsDeclarations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAxiom> result24 = testSubject0
                .getAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result25 = testSubject0
                .getAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyAxiom> result26 = testSubject0
                .getAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyAxiom> result27 = testSubject0
                .getAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom> result28 = testSubject0
                .getAxioms(_OWLDatatype);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividualAxiom> result29 = testSubject0
                .getAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result30 = testSubject0
                .getAxioms();
        java.util.Set<OWLAxiom> result31 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<OWLAxiom> result32 = testSubject0.getAxioms(_AxiomType, _boolean);
        int result33 = testSubject0.getAxiomCount(_AxiomType);
        int result34 = testSubject0.getAxiomCount(_AxiomType, _boolean);
        int result35 = testSubject0.getAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLLogicalAxiom> result36 = testSubject0
                .getLogicalAxioms();
        int result37 = testSubject0.getLogicalAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result38 = testSubject0
                .getTBoxAxioms(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result39 = testSubject0
                .getABoxAxioms(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result40 = testSubject0
                .getRBoxAxioms(_boolean);
        boolean result41 = testSubject0.containsAxiom(_OWLAxiom96, _boolean);
        boolean result42 = testSubject0.containsAxiom(_OWLAxiom96);
        boolean result43 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom96);
        boolean result44 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom96,
                _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result45 = testSubject0
                .getAxiomsIgnoreAnnotations(_OWLAxiom96);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result46 = testSubject0
                .getAxiomsIgnoreAnnotations(_OWLAxiom96, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result47 = testSubject0
                .getGeneralClassAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result48 = testSubject0
                .getReferencedAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result49 = testSubject0
                .getAnnotationPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result50 = testSubject0
                .getReferencingAxioms(_OWLAnonymousIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result51 = testSubject0
                .getReferencingAxioms(_OWLEntity);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result52 = testSubject0
                .getReferencingAxioms(_OWLEntity, _boolean);
        boolean result53 = testSubject0.containsEntityInSignature(_IRI);
        boolean result54 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result55 = testSubject0.containsEntityInSignature(_IRI, _boolean);
        boolean result56 = testSubject0.containsEntityInSignature(_OWLEntity, _boolean);
        boolean result57 = testSubject0.isDeclared(_OWLEntity);
        boolean result58 = testSubject0.isDeclared(_OWLEntity, _boolean);
        boolean result59 = testSubject0.containsClassInSignature(_IRI);
        boolean result60 = testSubject0.containsClassInSignature(_IRI, _boolean);
        boolean result61 = testSubject0.containsObjectPropertyInSignature(_IRI, _boolean);
        boolean result62 = testSubject0.containsObjectPropertyInSignature(_IRI);
        boolean result63 = testSubject0.containsDataPropertyInSignature(_IRI);
        boolean result64 = testSubject0.containsDataPropertyInSignature(_IRI, _boolean);
        boolean result65 = testSubject0.containsAnnotationPropertyInSignature(_IRI,
                _boolean);
        boolean result66 = testSubject0.containsAnnotationPropertyInSignature(_IRI);
        boolean result67 = testSubject0.containsIndividualInSignature(_IRI, _boolean);
        boolean result68 = testSubject0.containsIndividualInSignature(_IRI);
        boolean result69 = testSubject0.containsDatatypeInSignature(_IRI, _boolean);
        boolean result70 = testSubject0.containsDatatypeInSignature(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result71 = testSubject0
                .getEntitiesInSignature(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result72 = testSubject0
                .getEntitiesInSignature(_IRI, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom> result73 = testSubject0
                .getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom> result74 = testSubject0
                .getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom> result75 = testSubject0
                .getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDeclarationAxiom> result76 = testSubject0
                .getDeclarationAxioms(_OWLEntity);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result77 = testSubject0
                .getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result78 = testSubject0
                .getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result79 = testSubject0
                .getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result80 = testSubject0
                .getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result81 = testSubject0
                .getDisjointClassesAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointUnionAxiom> result82 = testSubject0
                .getDisjointUnionAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLHasKeyAxiom> result83 = testSubject0
                .getHasKeyAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result84 = testSubject0
                .getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result85 = testSubject0
                .getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom> result86 = testSubject0
                .getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom> result87 = testSubject0
                .getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom> result88 = testSubject0
                .getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom> result89 = testSubject0
                .getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom> result90 = testSubject0
                .getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom> result91 = testSubject0
                .getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom> result92 = testSubject0
                .getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom> result93 = testSubject0
                .getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom> result94 = testSubject0
                .getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom> result95 = testSubject0
                .getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom> result96 = testSubject0
                .getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom> result97 = testSubject0
                .getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result98 = testSubject0
                .getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result99 = testSubject0
                .getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom> result100 = testSubject0
                .getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom> result101 = testSubject0
                .getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom> result102 = testSubject0
                .getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom> result103 = testSubject0
                .getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom> result104 = testSubject0
                .getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result105 = testSubject0
                .getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result106 = testSubject0
                .getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom> result107 = testSubject0
                .getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom> result108 = testSubject0
                .getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom> result109 = testSubject0
                .getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom> result110 = testSubject0
                .getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result111 = testSubject0
                .getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result112 = testSubject0
                .getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom> result113 = testSubject0
                .getDatatypeDefinitions(_OWLDatatype);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result114 = testSubject0
                .applyChanges(_List182);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result115 = testSubject0
                .applyChange(_OWLOntologyChange);
        boolean result116 = testSubject0.containsReference(_OWLDatatype);
        boolean result117 = testSubject0.containsReference(_OWLAnnotationProperty);
        boolean result118 = testSubject0.containsReference(_OWLObjectProperty);
        boolean result119 = testSubject0.containsReference(_OWLDataProperty);
        boolean result120 = testSubject0.containsReference(_OWLClass);
        boolean result121 = testSubject0.containsReference(_OWLNamedIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedObject> result122 = testSubject0
                .getReferencedObjects();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result123 = testSubject0
                .getReferencedAnnotationProperties(_boolean);
        int result124 = testSubject0.compareTo(_Object110);
        int result125 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result126 = testSubject0
                .getNestedClassExpressions();
        boolean result127 = testSubject0.isTopEntity();
        boolean result128 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLOntologyIRIMapperImpl() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyIRIMapper.class
                .isAssignableFrom(OWLOntologyIRIMapperImpl.class));
    }

    public void verifyOWLOntologyIRIMapperImpl() throws Exception {
        OWLOntologyIRIMapperImpl testSubject0 = new OWLOntologyIRIMapperImpl();
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI(_IRI);
        testSubject0.addMapping(_IRI, _IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyManagerImpl() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyManager.class
                .isAssignableFrom(OWLOntologyManagerImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyFactory.OWLOntologyCreationHandler.class
                .isAssignableFrom(OWLOntologyManagerImpl.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyManagerImpl.class));
    }

    public void verifyOWLOntologyManagerImpl() throws Exception {
        OWLOntologyManagerImpl testSubject0 = new OWLOntologyManagerImpl(_OWLDataFactory);
        boolean result0 = testSubject0.contains(_OWLOntologyID);
        boolean result1 = testSubject0.contains(_IRI);
        boolean result2 = testSubject0.contains(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyManagerProperties result3 = testSubject0
                .getProperties();
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result5 = testSubject0
                .getOntology(_OWLOntologyID);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result6 = testSubject0
                .getDirectImports(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getImports(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result8 = testSubject0
                .getImportsClosure(_OWLOntology);
        org.semanticweb.owlapi.model.OWLDataFactory result9 = testSubject0
                .getOWLDataFactory();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result10 = testSubject0
                .getOntologies();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result11 = testSubject0
                .getOntologies(_OWLAxiom96);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result12 = testSubject0
                .getVersions(_IRI);
        boolean result13 = testSubject0.containsVersion(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result14 = testSubject0
                .getOntologyIDsByVersion(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result15 = testSubject0
                .getImportedOntology(_OWLImportsDeclaration);
        java.util.List<org.semanticweb.owlapi.model.OWLOntology> result16 = testSubject0
                .getSortedImportsClosure(_OWLOntology);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result17 = testSubject0
                .applyChanges(_List185);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result18 = testSubject0
                .addAxioms(_OWLOntology, _Set186);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result19 = testSubject0
                .addAxiom(_OWLOntology, _OWLAxiom96);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result20 = testSubject0
                .removeAxiom(_OWLOntology, _OWLAxiom96);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result21 = testSubject0
                .removeAxioms(_OWLOntology, _Set186);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result22 = testSubject0
                .applyChange(_OWLOntologyChange);
        org.semanticweb.owlapi.model.OWLOntology result23 = testSubject0.createOntology(
                _IRI, _IRI);
        org.semanticweb.owlapi.model.OWLOntology result24 = testSubject0
                .createOntology(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result25 = testSubject0
                .createOntology(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntology result26 = testSubject0.createOntology();
        org.semanticweb.owlapi.model.OWLOntology result27 = testSubject0
                .createOntology(_Set187);
        org.semanticweb.owlapi.model.OWLOntology result28 = testSubject0.createOntology(
                _IRI, _Set, _boolean);
        org.semanticweb.owlapi.model.OWLOntology result29 = testSubject0.createOntology(
                _Set187, _IRI);
        org.semanticweb.owlapi.model.OWLOntology result30 = testSubject0.createOntology(
                _IRI, _Set);
        org.semanticweb.owlapi.model.OWLOntology result31 = testSubject0
                .loadOntology(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result32 = testSubject0
                .loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource);
        org.semanticweb.owlapi.model.OWLOntology result33 = testSubject0
                .loadOntologyFromOntologyDocument(_InputStream);
        org.semanticweb.owlapi.model.OWLOntology result34 = testSubject0
                .loadOntologyFromOntologyDocument(_File);
        org.semanticweb.owlapi.model.OWLOntology result35 = testSubject0
                .loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntology result36 = testSubject0
                .loadOntologyFromOntologyDocument(_IRI);
        testSubject0.removeOntology(_OWLOntology);
        testSubject0.removeOntology(_OWLOntologyID);
        org.semanticweb.owlapi.model.IRI result37 = testSubject0
                .getOntologyDocumentIRI(_OWLOntology);
        testSubject0.setOntologyDocumentIRI(_OWLOntology, _IRI);
        org.semanticweb.owlapi.model.OWLOntologyFormat result38 = testSubject0
                .getOntologyFormat(_OWLOntology);
        testSubject0.setOntologyFormat(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _IRI);
        testSubject0.saveOntology(_OWLOntology);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat,
                _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OutputStream);
        testSubject0.addIRIMapper(_OWLOntologyIRIMapper);
        testSubject0.removeIRIMapper(_OWLOntologyIRIMapper);
        testSubject0.clearIRIMappers();
        testSubject0.addOntologyFactory(_OWLOntologyFactory);
        testSubject0.removeOntologyFactory(_OWLOntologyFactory);
        java.util.Collection<org.semanticweb.owlapi.model.OWLOntologyFactory> result39 = testSubject0
                .getOntologyFactories();
        testSubject0.addOntologyStorer(_OWLOntologyStorer);
        testSubject0.removeOntologyStorer(_OWLOntologyStorer);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener,
                _OWLOntologyChangeBroadcastStrategy);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0
                .addImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0
                .removeImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.addOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0
                .removeOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0
                .setDefaultChangeBroadcastStrategy(_OWLOntologyChangeBroadcastStrategy);
        testSubject0.removeOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration,
                _OWLOntologyLoaderConfiguration);
        testSubject0.setSilentMissingImportsHandling(_boolean);
        boolean result40 = testSubject0.isSilentMissingImportsHandling();
        testSubject0.addMissingImportListener(_MissingImportListener);
        testSubject0.removeMissingImportListener(_MissingImportListener);
        testSubject0.addOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.removeOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.addOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0
                .removeOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0.ontologyCreated(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWLPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class
                .isAssignableFrom(OWLPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAxiom.class
                .isAssignableFrom(OWLPropertyAxiomImpl.class));
    }

    public void verifyOWLPropertyAxiomImpl() throws Exception {
        OWLPropertyAxiomImpl testSubject0 = mock(OWLPropertyAxiomImpl.class);
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result11 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result12 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result13 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result14 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result15 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result16 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result17 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result18 = testSubject0
                .getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result23 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result24 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLPropertyDomainAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLUnaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLPropertyDomainAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyDomainAxiom.class
                .isAssignableFrom(OWLPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLPropertyDomainAxiomImpl() throws Exception {
        OWLPropertyDomainAxiomImpl testSubject0 = new OWLPropertyDomainAxiomImpl(
                _OWLPropertyExpression, _OWLClassExpression, _Set134) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getDomain();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyExpressionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(OWLPropertyExpressionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyExpression.class
                .isAssignableFrom(OWLPropertyExpressionImpl.class));
    }

    public void verifyOWLPropertyExpressionImpl() throws Exception {
        OWLPropertyExpressionImpl<OWLClassExpression, OWLObjectPropertyExpression> testSubject0 = new OWLPropertyExpressionImpl() {
            @Override
            public boolean isFunctional(OWLOntology ontology) {
                return false;
            }

            @Override
            public boolean isFunctional(Set ontologies) {
                return false;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public void accept(OWLPropertyExpressionVisitor visitor) {}

            @Override
            public Object accept(OWLPropertyExpressionVisitorEx visitor) {
                return null;
            }

            @Override
            public boolean isDataPropertyExpression() {
                return false;
            }

            @Override
            public boolean isObjectPropertyExpression() {
                return false;
            }

            @Override
            public boolean isOWLTopObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLTopDataProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomDataProperty() {
                return false;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected Set getSubPropertyAxiomsForRHS(OWLOntology ont) {
                return null;
            }

            @Override
            protected Set getDomainAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getRangeAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getSubPropertyAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getEquivalentPropertiesAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getDisjointPropertiesAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getDomains(_Set);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result2 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result3 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result4 = testSubject0
                .getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result5 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0
                .getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0
                .getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result10 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result11 = testSubject0
                .getDisjointProperties(_Set);
        int result12 = testSubject0.compareTo(_Object110);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result15 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result16 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result17 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result18 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result19 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result20 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result25 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result26 = testSubject0.isFunctional(_OWLOntology);
        boolean result27 = testSubject0.isFunctional(_Set);
        boolean result28 = testSubject0.isDataPropertyExpression();
        boolean result29 = testSubject0.isObjectPropertyExpression();
        boolean result30 = testSubject0.isOWLTopObjectProperty();
        boolean result31 = testSubject0.isOWLBottomObjectProperty();
        boolean result32 = testSubject0.isOWLTopDataProperty();
        boolean result33 = testSubject0.isOWLBottomDataProperty();
        boolean result34 = testSubject0.isAnonymous();
    }

    @Test
    public void enforceInterfacesOWLPropertyRangeAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLUnaryPropertyAxiomImpl.class
                .isAssignableFrom(OWLPropertyRangeAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyRangeAxiom.class
                .isAssignableFrom(OWLPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLPropertyRangeAxiomImpl() throws Exception {
        OWLPropertyRangeAxiomImpl testSubject0 = new OWLPropertyRangeAxiomImpl(
                _OWLPropertyExpression, _OWLPropertyRange, _Set134) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {
                return null;
            }
        };
        OWLPropertyRange result0 = testSubject0.getRange();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedDataRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedRestrictionImpl.class
                .isAssignableFrom(OWLQuantifiedDataRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedDataRestrictionImpl() throws Exception {
        OWLQuantifiedDataRestrictionImpl testSubject0 = new OWLQuantifiedDataRestrictionImpl(
                _OWLDataPropertyExpression, _OWLDataRange) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLDataRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result27 = testSubject0
                .getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedObjectRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedRestrictionImpl.class
                .isAssignableFrom(OWLQuantifiedObjectRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedObjectRestrictionImpl() throws Exception {
        OWLQuantifiedObjectRestrictionImpl testSubject0 = new OWLQuantifiedObjectRestrictionImpl(
                _OWLObjectPropertyExpression, _OWLClassExpression) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLClassExpression result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result27 = testSubject0
                .getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class
                .isAssignableFrom(OWLQuantifiedRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedRestriction.class
                .isAssignableFrom(OWLQuantifiedRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedRestrictionImpl() throws Exception {
        OWLQuantifiedRestrictionImpl testSubject0 = new OWLQuantifiedRestrictionImpl(
                _OWLPropertyExpression, _OWLPropertyRange) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result27 = testSubject0
                .getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLReflexiveObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom.class
                .isAssignableFrom(OWLReflexiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLReflexiveObjectPropertyAxiomImpl() throws Exception {
        OWLReflexiveObjectPropertyAxiomImpl testSubject0 = new OWLReflexiveObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result2 = testSubject0
                .asOWLSubClassOfAxiom();
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result8 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result9 = testSubject0
                .getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class
                .isAssignableFrom(OWLRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLRestriction.class
                .isAssignableFrom(OWLRestrictionImpl.class));
    }

    public void verifyOWLRestrictionImpl() throws Exception {
        OWLRestrictionImpl testSubject0 = new OWLRestrictionImpl(_OWLPropertyExpression) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {}

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isClassExpressionLiteral();
        boolean result2 = testSubject0.isOWLThing();
        boolean result3 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result4 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result6 = testSubject0
                .asConjunctSet();
        boolean result7 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0.getNNF();
        boolean result10 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result11 = testSubject0.asOWLClass();
        int result12 = testSubject0.compareTo(_Object110);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result15 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result16 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result17 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result18 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result19 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result20 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result25 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result26 = testSubject0
                .getClassExpressionType();
        boolean result27 = testSubject0.isObjectRestriction();
        boolean result28 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLSameIndividualAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryIndividualAxiomImpl.class
                .isAssignableFrom(OWLSameIndividualAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSameIndividualAxiom.class
                .isAssignableFrom(OWLSameIndividualAxiomImpl.class));
    }

    public void verifyOWLSameIndividualAxiomImpl() throws Exception {
        OWLSameIndividualAxiomImpl testSubject0 = new OWLSameIndividualAxiomImpl(_Set161,
                _Set134);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result2 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result3 = testSubject0
                .asOWLSubClassOfAxioms();
        boolean result4 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        java.util.Set<org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result10 = testSubject0
                .asPairwiseSameIndividualAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result11 = testSubject0
                .getIndividuals();
        java.util.List<org.semanticweb.owlapi.model.OWLIndividual> result12 = testSubject0
                .getIndividualsAsList();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result16 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result24 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result25 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result26 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result27 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result28 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result29 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result30 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result31 = testSubject0
                .getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class
                .isAssignableFrom(OWLSubAnnotationPropertyOfAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom.class
                .isAssignableFrom(OWLSubAnnotationPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubAnnotationPropertyOfAxiomImpl() throws Exception {
        OWLSubAnnotationPropertyOfAxiomImpl testSubject0 = new OWLSubAnnotationPropertyOfAxiomImpl(
                _OWLAnnotationProperty, _OWLAnnotationProperty, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result2 = testSubject0
                .getSubProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result3 = testSubject0
                .getSuperProperty();
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubClassOfAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class
                .isAssignableFrom(OWLSubClassOfAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiom.class
                .isAssignableFrom(OWLSubClassOfAxiomImpl.class));
    }

    public void verifyOWLSubClassOfAxiomImpl() throws Exception {
        OWLSubClassOfAxiomImpl testSubject0 = new OWLSubClassOfAxiomImpl(
                _OWLClassExpression, _OWLClassExpression, _Collection);
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getClassExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .getSubClass();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .getSuperClass();
        boolean result12 = testSubject0.isGCI();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result16 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result24 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result25 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result26 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result27 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result28 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result29 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result30 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result31 = testSubject0
                .getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLSubPropertyAxiomImpl.class
                .isAssignableFrom(OWLSubDataPropertyOfAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom.class
                .isAssignableFrom(OWLSubDataPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubDataPropertyOfAxiomImpl() throws Exception {
        OWLSubDataPropertyOfAxiomImpl testSubject0 = new OWLSubDataPropertyOfAxiomImpl(
                _OWLDataPropertyExpression, _OWLDataPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLPropertyExpression result7 = testSubject0.getSubProperty();
        OWLPropertyExpression result8 = testSubject0.getSuperProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLSubPropertyAxiomImpl.class
                .isAssignableFrom(OWLSubObjectPropertyOfAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom.class
                .isAssignableFrom(OWLSubObjectPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubObjectPropertyOfAxiomImpl() throws Exception {
        OWLSubObjectPropertyOfAxiomImpl testSubject0 = new OWLSubObjectPropertyOfAxiomImpl(
                _OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLPropertyExpression result7 = testSubject0.getSubProperty();
        OWLPropertyExpression result8 = testSubject0.getSuperProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result21 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result22 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result23 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result24 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result25 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result26 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result27 = testSubject0
                .getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class
                .isAssignableFrom(OWLSubPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubPropertyAxiom.class
                .isAssignableFrom(OWLSubPropertyAxiomImpl.class));
    }

    public void verifyOWLSubPropertyAxiomImpl() throws Exception {
        OWLSubPropertyAxiomImpl testSubject0 = new OWLSubPropertyAxiomImpl(
                _OWLPropertyExpression, _OWLPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getSubProperty();
        OWLPropertyExpression result1 = testSubject0.getSuperProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result14 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result15 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result16 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result17 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result18 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result19 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result26 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLSubPropertyChainAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class
                .isAssignableFrom(OWLSubPropertyChainAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom.class
                .isAssignableFrom(OWLSubPropertyChainAxiomImpl.class));
    }

    public void verifyOWLSubPropertyChainAxiomImpl() throws Exception {
        OWLSubPropertyChainAxiomImpl testSubject0 = new OWLSubPropertyChainAxiomImpl(
                _List, _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result2 = testSubject0
                .getSuperProperty();
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result3 = testSubject0
                .getPropertyChain();
        boolean result4 = testSubject0.isEncodingOfTransitiveProperty();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLSymmetricObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom.class
                .isAssignableFrom(OWLSymmetricObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLSymmetricObjectPropertyAxiomImpl() throws Exception {
        OWLSymmetricObjectPropertyAxiomImpl testSubject0 = new OWLSymmetricObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result2 = testSubject0
                .asSubPropertyAxioms();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set130);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result7 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result8 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result9 = testSubject0
                .getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result13 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result22 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result23 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result24 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result25 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result26 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result27 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result28 = testSubject0
                .getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class
                .isAssignableFrom(OWLTransitiveObjectPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom.class
                .isAssignableFrom(OWLTransitiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLTransitiveObjectPropertyAxiomImpl() throws Exception {
        OWLTransitiveObjectPropertyAxiomImpl testSubject0 = new OWLTransitiveObjectPropertyAxiomImpl(
                _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result5 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.OWLPropertyExpression result6 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result7 = testSubject0
                .getProperty();
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result10 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set132);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result20 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result21 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result22 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result23 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result24 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result25 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result26 = testSubject0
                .getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLUnaryPropertyAxiomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class
                .isAssignableFrom(OWLUnaryPropertyAxiomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLUnaryPropertyAxiom.class
                .isAssignableFrom(OWLUnaryPropertyAxiomImpl.class));
    }

    public void verifyOWLUnaryPropertyAxiomImpl() throws Exception {
        OWLUnaryPropertyAxiomImpl testSubject0 = new OWLUnaryPropertyAxiomImpl(
                _OWLPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {}

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isLogicalAxiom();
        boolean result2 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result6 = testSubject0.isAnnotated();
        boolean result7 = testSubject0.isOfType(_Set132);
        boolean result8 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0.getNNF();
        int result10 = testSubject0.compareTo(_Object110);
        int result11 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result12 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result13 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result14 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result15 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result16 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result17 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result18 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result19 = testSubject0
                .getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result23 = testSubject0.accept(_OWLAxiomVisitorEx127);
        org.semanticweb.owlapi.model.OWLAxiom result24 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result25 = testSubject0
                .getAnnotatedAxiom(_Set129);
        org.semanticweb.owlapi.model.AxiomType<?> result26 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLValueRestrictionImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class
                .isAssignableFrom(OWLValueRestrictionImpl.class));
        assertTrue(org.semanticweb.owlapi.model.OWLHasValueRestriction.class
                .isAssignableFrom(OWLValueRestrictionImpl.class));
    }

    public void verifyOWLValueRestrictionImpl() throws Exception {
        OWLValueRestrictionImpl testSubject0 = mock(OWLValueRestrictionImpl.class);
        OWLObject result0 = testSubject0.getValue();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result16 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result17 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result18 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result19 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result20 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result21 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result22 = testSubject0
                .getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        org.semanticweb.owlapi.model.ClassExpressionType result27 = testSubject0
                .getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
        org.semanticweb.owlapi.model.OWLClassExpression result30 = testSubject0
                .asSomeValuesFrom();
    }

    @Test
    public void enforceInterfacesParsableOWLOntologyFactory() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInMemOWLOntologyFactory.class
                .isAssignableFrom(ParsableOWLOntologyFactory.class));
    }

    public void verifyParsableOWLOntologyFactory() throws Exception {
        ParsableOWLOntologyFactory testSubject0 = new ParsableOWLOntologyFactory();
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler,
                _OWLOntologyLoaderConfiguration);
        boolean result2 = testSubject0.canCreateFromDocumentIRI(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0
                .createOWLOntology(_URI, _URI);
        boolean result4 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        java.util.List<org.semanticweb.owlapi.io.OWLParser> result5 = testSubject0
                .getParsers();
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result6 = testSubject0
                .getOWLOntologyManager();
        org.semanticweb.owlapi.model.OWLOntology result7 = testSubject0
                .createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
    }

    @Test
    public void enforceInterfacesSWRLAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(SWRLAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLAtom.class
                .isAssignableFrom(SWRLAtomImpl.class));
    }

    public void verifySWRLAtomImpl() throws Exception {
        SWRLAtomImpl testSubject0 = mock(SWRLAtomImpl.class);
        org.semanticweb.owlapi.model.SWRLPredicate result0 = testSubject0.getPredicate();
        int result1 = testSubject0.compareTo(_Object110);
        int result2 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result4 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result5 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result6 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result7 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result8 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result9 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result10 = testSubject0
                .getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result14 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result15 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLBinaryAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class
                .isAssignableFrom(SWRLBinaryAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLBinaryAtom.class
                .isAssignableFrom(SWRLBinaryAtomImpl.class));
    }

    public void verifySWRLBinaryAtomImpl() throws Exception {
        SWRLBinaryAtomImpl testSubject0 = new SWRLBinaryAtomImpl(_SWRLPredicate,
                _SWRLArgument, _SWRLArgument) {
            @Override
            public void accept(SWRLObjectVisitor visitor) {}

            @Override
            public <O> O accept(SWRLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result2 = testSubject0
                .getAllArguments();
        org.semanticweb.owlapi.model.SWRLPredicate result3 = testSubject0.getPredicate();
        int result4 = testSubject0.compareTo(_Object110);
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result7 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result8 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result9 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result10 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result11 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result12 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result13 = testSubject0
                .getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result17 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class
                .isAssignableFrom(SWRLBuiltInAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLBuiltInAtom.class
                .isAssignableFrom(SWRLBuiltInAtomImpl.class));
    }

    public void verifySWRLBuiltInAtomImpl() throws Exception {
        SWRLBuiltInAtomImpl testSubject0 = new SWRLBuiltInAtomImpl(_IRI, _List173);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result4 = testSubject0
                .getAllArguments();
        boolean result5 = testSubject0.isCoreBuiltIn();
        java.util.List<org.semanticweb.owlapi.model.SWRLDArgument> result6 = testSubject0
                .getArguments();
        int result7 = testSubject0.compareTo(_Object110);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result9 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result10 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result11 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result12 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result13 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result14 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result15 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLClassAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLUnaryAtomImpl.class
                .isAssignableFrom(SWRLClassAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLClassAtom.class
                .isAssignableFrom(SWRLClassAtomImpl.class));
    }

    public void verifySWRLClassAtomImpl() throws Exception {
        SWRLClassAtomImpl testSubject0 = new SWRLClassAtomImpl(_OWLClassExpression,
                _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .getPredicate();
        SWRLIArgument result4 = testSubject0.getArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result5 = testSubject0
                .getAllArguments();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result8 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result9 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result10 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result11 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result12 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result13 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result14 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class
                .isAssignableFrom(SWRLDataPropertyAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLDataPropertyAtom.class
                .isAssignableFrom(SWRLDataPropertyAtomImpl.class));
    }

    public void verifySWRLDataPropertyAtomImpl() throws Exception {
        SWRLDataPropertyAtomImpl testSubject0 = new SWRLDataPropertyAtomImpl(
                _OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result3 = testSubject0
                .getPredicate();
        SWRLIArgument result4 = testSubject0.getFirstArgument();
        SWRLDArgument result5 = testSubject0.getSecondArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result6 = testSubject0
                .getAllArguments();
        int result7 = testSubject0.compareTo(_Object110);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result9 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result10 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result11 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result12 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result13 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result14 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result15 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result16 = testSubject0
                .getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLUnaryAtomImpl.class
                .isAssignableFrom(SWRLDataRangeAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLDataRangeAtom.class
                .isAssignableFrom(SWRLDataRangeAtomImpl.class));
    }

    public void verifySWRLDataRangeAtomImpl() throws Exception {
        SWRLDataRangeAtomImpl testSubject0 = new SWRLDataRangeAtomImpl(_OWLDataRange,
                _SWRLDArgument);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        org.semanticweb.owlapi.model.OWLDataRange result3 = testSubject0.getPredicate();
        SWRLDArgument result4 = testSubject0.getArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result5 = testSubject0
                .getAllArguments();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result8 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result9 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result10 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result11 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result12 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result13 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result14 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class
                .isAssignableFrom(SWRLDifferentIndividualsAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom.class
                .isAssignableFrom(SWRLDifferentIndividualsAtomImpl.class));
    }

    public void verifySWRLDifferentIndividualsAtomImpl() throws Exception {
        SWRLDifferentIndividualsAtomImpl testSubject0 = new SWRLDifferentIndividualsAtomImpl(
                _OWLDataFactory, _SWRLIArgument, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        SWRLIArgument result2 = testSubject0.getFirstArgument();
        SWRLIArgument result3 = testSubject0.getSecondArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result4 = testSubject0
                .getAllArguments();
        org.semanticweb.owlapi.model.SWRLPredicate result5 = testSubject0.getPredicate();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result8 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result9 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result10 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result11 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result12 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result13 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result14 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLIndividualArgumentImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(SWRLIndividualArgumentImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLIndividualArgument.class
                .isAssignableFrom(SWRLIndividualArgumentImpl.class));
    }

    public void verifySWRLIndividualArgumentImpl() throws Exception {
        SWRLIndividualArgumentImpl testSubject0 = new SWRLIndividualArgumentImpl(
                _OWLIndividual);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getIndividual();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result6 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result7 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result8 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result9 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result10 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result11 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLLiteralArgumentImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(SWRLLiteralArgumentImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLLiteralArgument.class
                .isAssignableFrom(SWRLLiteralArgumentImpl.class));
    }

    public void verifySWRLLiteralArgumentImpl() throws Exception {
        SWRLLiteralArgumentImpl testSubject0 = new SWRLLiteralArgumentImpl(_OWLLiteral);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.OWLLiteral result2 = testSubject0.getLiteral();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result6 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result7 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result8 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result9 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result10 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result11 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class
                .isAssignableFrom(SWRLObjectPropertyAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectPropertyAtom.class
                .isAssignableFrom(SWRLObjectPropertyAtomImpl.class));
    }

    public void verifySWRLObjectPropertyAtomImpl() throws Exception {
        SWRLObjectPropertyAtomImpl testSubject0 = new SWRLObjectPropertyAtomImpl(
                _OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result3 = testSubject0
                .getPredicate();
        org.semanticweb.owlapi.model.SWRLObjectPropertyAtom result4 = testSubject0
                .getSimplified();
        SWRLIArgument result5 = testSubject0.getFirstArgument();
        SWRLIArgument result6 = testSubject0.getSecondArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result7 = testSubject0
                .getAllArguments();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result10 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result11 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result12 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result13 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result14 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result15 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result16 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result17 = testSubject0
                .getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLRuleImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class
                .isAssignableFrom(SWRLRuleImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLRule.class
                .isAssignableFrom(SWRLRuleImpl.class));
    }

    public void verifySWRLRuleImpl() throws Exception {
        SWRLRuleImpl testSubject0 = new SWRLRuleImpl(_Set170, _Set170, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        boolean result3 = testSubject0.containsAnonymousClassExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getClassAtomPredicates();
        java.util.Set<org.semanticweb.owlapi.model.SWRLAtom> result5 = testSubject0
                .getBody();
        java.util.Set<org.semanticweb.owlapi.model.SWRLAtom> result6 = testSubject0
                .getHead();
        java.util.Set<org.semanticweb.owlapi.model.SWRLVariable> result7 = testSubject0
                .getVariables();
        org.semanticweb.owlapi.model.SWRLRule result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set129);
        boolean result11 = testSubject0.isLogicalAxiom();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        org.semanticweb.owlapi.model.SWRLRule result13 = testSubject0.getSimplified();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result15 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result16 = testSubject0
                .getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result24 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result25 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result26 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result27 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result28 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result29 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result30 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result31 = testSubject0
                .getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class
                .isAssignableFrom(SWRLSameIndividualAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLSameIndividualAtom.class
                .isAssignableFrom(SWRLSameIndividualAtomImpl.class));
    }

    public void verifySWRLSameIndividualAtomImpl() throws Exception {
        SWRLSameIndividualAtomImpl testSubject0 = new SWRLSameIndividualAtomImpl(
                _OWLDataFactory, _SWRLIArgument, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        SWRLIArgument result2 = testSubject0.getFirstArgument();
        SWRLIArgument result3 = testSubject0.getSecondArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result4 = testSubject0
                .getAllArguments();
        org.semanticweb.owlapi.model.SWRLPredicate result5 = testSubject0.getPredicate();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result8 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result9 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result10 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result11 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result12 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result13 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result14 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result15 = testSubject0
                .getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLUnaryAtomImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class
                .isAssignableFrom(SWRLUnaryAtomImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLUnaryAtom.class
                .isAssignableFrom(SWRLUnaryAtomImpl.class));
    }

    public void verifySWRLUnaryAtomImpl() throws Exception {
        SWRLUnaryAtomImpl testSubject0 = new SWRLUnaryAtomImpl(_SWRLPredicate,
                _SWRLArgument) {
            @Override
            public void accept(SWRLObjectVisitor visitor) {}

            @Override
            public <O> O accept(SWRLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {}

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        SWRLArgument result0 = testSubject0.getArgument();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result1 = testSubject0
                .getAllArguments();
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result6 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result7 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result8 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result9 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result10 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result11 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result16 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLVariableImpl() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class
                .isAssignableFrom(SWRLVariableImpl.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLVariable.class
                .isAssignableFrom(SWRLVariableImpl.class));
    }

    public void verifySWRLVariableImpl() throws Exception {
        SWRLVariableImpl testSubject0 = mock(SWRLVariableImpl.class);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getIRI();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result6 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result7 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result8 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result9 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result10 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result11 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result12 = testSubject0
                .getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
    }

    private static class R {}

    private static class V {}

    private static class F {}

    private static class K {}

    private static class T {}

    private SWRLArgument _SWRLArgument;
    private OWLClass _Object;
    private OWLObject _OWLPropertyAssertionObject;
    private OWLPropertyExpression _OWLPropertyExpression;
    private Pointer<OWLClass, OWLAxiom> _Pointer;
    private OWLPropertyRange _OWLPropertyRange;
    private T _Object103;
    private OWLClassAxiom _OWLAxiom;
    private byte[] _byte_array;
    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private java.io.File _File;
    private java.io.InputStream _InputStream;
    private java.io.OutputStream _OutputStream;
    private OWLObject _Object110;
    private java.lang.String _String;
    private java.net.URI _URI;
    private java.util.Collection<? extends org.semanticweb.owlapi.model.OWLAnnotation> _Collection;
    private java.util.Collection<org.semanticweb.owlapi.model.OWLAnonymousIndividual> _Collection178;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _List;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLOntologyChange> _List185;
    private java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> _List182;
    private java.util.List<org.semanticweb.owlapi.model.SWRLDArgument> _List173;
    private java.util.Set<OWLAnnotation> _Set130;
    private java.util.Set<OWLObjectPropertyExpression> _Set181;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAnnotation> _Set134;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> _Set186;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLClassExpression> _Set152;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLDataPropertyExpression> _Set167;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLDataRange> _Set159;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLIndividual> _Set161;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLLiteral> _Set154;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Set164;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>> _Set168;
    private java.util.Set<? extends org.semanticweb.owlapi.model.SWRLAtom> _Set170;
    private java.util.Set<org.semanticweb.owlapi.model.AxiomType<?>> _Set132;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> _Set129;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> _Set187;
    private java.util.Set<org.semanticweb.owlapi.model.OWLEntity> _Set177;
    private java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> _Set158;
    private java.util.Set<org.semanticweb.owlapi.model.OWLOntology> _Set;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.AxiomType<?> _AxiomType97;
    private org.semanticweb.owlapi.model.AxiomType<?>[] _AxiomType_array;
    private org.semanticweb.owlapi.model.AxiomType<OWLAxiom> _AxiomType;
    private org.semanticweb.owlapi.model.EntityType<?> _EntityType;
    private org.semanticweb.owlapi.model.EntityType<OWLEntity> _EntityType123;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.ImpendingOWLOntologyChangeListener _ImpendingOWLOntologyChangeListener;
    private org.semanticweb.owlapi.model.MissingImportListener _MissingImportListener;
    private org.semanticweb.owlapi.model.NodeID _NodeID;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationObjectVisitor _OWLAnnotationObjectVisitor;
    private org.semanticweb.owlapi.model.OWLAnnotationObjectVisitorEx<OWLObject> _OWLAnnotationObjectVisitorEx;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationSubject _OWLAnnotationSubject;
    private org.semanticweb.owlapi.model.OWLAnnotationSubjectVisitor _OWLAnnotationSubjectVisitor;
    private org.semanticweb.owlapi.model.OWLAnnotationSubjectVisitorEx<OWLEntity> _OWLAnnotationSubjectVisitorEx;
    private org.semanticweb.owlapi.model.OWLAnnotationValue _OWLAnnotationValue;
    private org.semanticweb.owlapi.model.OWLAnnotationValueVisitor _OWLAnnotationValueVisitor;
    private org.semanticweb.owlapi.model.OWLAnnotationValueVisitorEx<OWLObject> _OWLAnnotationValueVisitorEx;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom96;
    private org.semanticweb.owlapi.model.OWLAxiomVisitor _OWLAxiomVisitor;
    private org.semanticweb.owlapi.model.OWLAxiomVisitorEx<?> _OWLAxiomVisitorEx;
    private org.semanticweb.owlapi.model.OWLAxiomVisitorEx<OWLObject> _OWLAxiomVisitorEx127;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLClassAxiom _OWLClassAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLClassExpressionVisitor _OWLClassExpressionVisitor;
    private org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx<OWLObject> _OWLClassExpressionVisitorEx;
    private org.semanticweb.owlapi.model.OWLClassExpression[] _OWLClassExpression_array;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataComplementOf _OWLDataComplementOf;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
    private org.semanticweb.owlapi.model.OWLDataHasValue _OWLDataHasValue;
    private org.semanticweb.owlapi.model.OWLDataIntersectionOf _OWLDataIntersectionOf;
    private org.semanticweb.owlapi.model.OWLDataMaxCardinality _OWLDataMaxCardinality;
    private org.semanticweb.owlapi.model.OWLDataMinCardinality _OWLDataMinCardinality;
    private org.semanticweb.owlapi.model.OWLDataOneOf _OWLDataOneOf;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression _OWLDataPropertyExpression;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression[] _OWLDataPropertyExpression_array;
    private org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLDataRange _OWLDataRange;
    private org.semanticweb.owlapi.model.OWLDataRangeVisitor _OWLDataRangeVisitor;
    private org.semanticweb.owlapi.model.OWLDataRangeVisitorEx<OWLObject> _OWLDataRangeVisitorEx;
    private org.semanticweb.owlapi.model.OWLDataRange[] _OWLDataRange_array;
    private org.semanticweb.owlapi.model.OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataUnionOf _OWLDataUnionOf;
    private org.semanticweb.owlapi.model.OWLDataVisitor _OWLDataVisitor;
    private org.semanticweb.owlapi.model.OWLDataVisitorEx<OWLObject> _OWLDataVisitorEx;
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
    private org.semanticweb.owlapi.model.OWLEntityVisitor _OWLEntityVisitor;
    private org.semanticweb.owlapi.model.OWLEntityVisitorEx<OWLObject> _OWLEntityVisitorEx;
    private org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLFacetRestriction _OWLFacetRestriction;
    private org.semanticweb.owlapi.model.OWLFacetRestriction[] _OWLFacetRestriction_array;
    private org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLHasKeyAxiom _OWLHasKeyAxiom;
    private org.semanticweb.owlapi.model.OWLImportsDeclaration _OWLImportsDeclaration;
    private org.semanticweb.owlapi.model.OWLIndividual _OWLIndividual;
    private org.semanticweb.owlapi.model.OWLIndividualVisitor _OWLIndividualVisitor;
    private org.semanticweb.owlapi.model.OWLIndividualVisitorEx<OWLObject> _OWLIndividualVisitorEx;
    private org.semanticweb.owlapi.model.OWLIndividual[] _OWLIndividual_array;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLLiteral[] _OWLLiteral_array;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLNamedObjectVisitor _OWLNamedObjectVisitor;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
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
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression[] _OWLObjectPropertyExpression_array;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectUnionOf _OWLObjectUnionOf;
    private org.semanticweb.owlapi.model.OWLObjectVisitor _OWLObjectVisitor;
    private org.semanticweb.owlapi.model.OWLObjectVisitorEx<OWLObject> _OWLObjectVisitorEx;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyChange _OWLOntologyChange;
    private org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy _OWLOntologyChangeBroadcastStrategy;
    private org.semanticweb.owlapi.model.OWLOntologyChangeListener _OWLOntologyChangeListener;
    private org.semanticweb.owlapi.model.OWLOntologyChangeProgressListener _OWLOntologyChangeProgressListener;
    private org.semanticweb.owlapi.model.OWLOntologyChangesVetoedListener _OWLOntologyChangesVetoedListener;
    private org.semanticweb.owlapi.model.OWLOntologyFactory _OWLOntologyFactory;
    private org.semanticweb.owlapi.model.OWLOntologyFactory.OWLOntologyCreationHandler _OWLOntologyCreationHandler;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyID _OWLOntologyID;
    private org.semanticweb.owlapi.model.OWLOntologyIRIMapper _OWLOntologyIRIMapper;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderListener _OWLOntologyLoaderListener;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.OWLOntologyStorer _OWLOntologyStorer;
    private org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>[] _OWLPropertyExpression_array;
    private org.semanticweb.owlapi.model.OWLPropertyExpressionVisitor _OWLPropertyExpressionVisitor;
    private org.semanticweb.owlapi.model.OWLPropertyExpressionVisitorEx<OWLObject> _OWLPropertyExpressionVisitorEx;
    private org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.model.SWRLBuiltInAtom _SWRLBuiltInAtom;
    private org.semanticweb.owlapi.model.SWRLClassAtom _SWRLClassAtom;
    private org.semanticweb.owlapi.model.SWRLDArgument _SWRLDArgument;
    private org.semanticweb.owlapi.model.SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLDataRangeAtom _SWRLDataRangeAtom;
    private org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private org.semanticweb.owlapi.model.SWRLIArgument _SWRLIArgument;
    private org.semanticweb.owlapi.model.SWRLIndividualArgument _SWRLIndividualArgument;
    private org.semanticweb.owlapi.model.SWRLLiteralArgument _SWRLLiteralArgument;
    private org.semanticweb.owlapi.model.SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLObjectVisitor _SWRLObjectVisitor;
    private org.semanticweb.owlapi.model.SWRLObjectVisitorEx<OWLObject> _SWRLObjectVisitorEx;
    private org.semanticweb.owlapi.model.SWRLPredicate _SWRLPredicate;
    private org.semanticweb.owlapi.model.SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.model.SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private org.semanticweb.owlapi.model.SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.util.OWLAxiomSearchFilter<OWLAxiom, OWLClass> _OWLAxiomSearchFilter;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainer<Object> _CollectionContainer;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainerVisitor<Object> _CollectionContainerVisitor;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainerVisitor<org.semanticweb.owlapi.model.OWLAnnotation> _CollectionContainerVisitor131;
    private uk.ac.manchester.cs.owl.owlapi.Internals _Internals;
}
