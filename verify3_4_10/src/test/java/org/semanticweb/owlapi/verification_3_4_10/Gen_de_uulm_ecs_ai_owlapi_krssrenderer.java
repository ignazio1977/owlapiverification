package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2OWLObjectRenderer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2OWLSyntaxOntologyStorer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2OWLSyntaxRenderer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2ObjectRenderer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2SyntaxOntologyStorer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2SyntaxRenderer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSS2Vocabulary;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSSObjectRenderer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSSSyntaxOntologyStorer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSSSyntaxRenderer;
import de.uulm.ecs.ai.owlapi.krssrenderer.KRSSVocabulary;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_de_uulm_ecs_ai_owlapi_krssrenderer {
    @Test
    public void enforceInterfacesKRSS2ObjectRenderer() throws Exception {
        assertTrue(de.uulm.ecs.ai.owlapi.krssrenderer.KRSSObjectRenderer.class
                .isAssignableFrom(KRSS2ObjectRenderer.class));
    }

    public void verifyKRSS2ObjectRenderer() throws Exception {
        KRSS2ObjectRenderer testSubject0 = new KRSS2ObjectRenderer(_OWLOntologyManager,
                _OWLOntology, _Writer);
        KRSS2ObjectRenderer testSubject1 = new KRSS2ObjectRenderer(_OWLOntology, _Writer);
        testSubject0.setIgnoreDeclarations(_boolean);
        testSubject0.write(_OWLClassExpression);
        testSubject0.write(_OWLIndividual);
        testSubject0.write(_OWLPropertyExpression);
        testSubject0.write(_OWLDataRange);
    }

    @Test
    public void enforceInterfacesKRSS2OWLObjectRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(KRSS2OWLObjectRenderer.class));
    }

    public void verifyKRSS2OWLObjectRenderer() throws Exception {
        KRSS2OWLObjectRenderer testSubject0 = new KRSS2OWLObjectRenderer(_OWLOntology,
                _Writer);
        testSubject0.write(_OWLIndividual);
        testSubject0.write(_OWLClassExpression);
        testSubject0.write(_OWLPropertyExpression);
        testSubject0.write(_OWLDataRange);
    }

    @Test
    public void enforceInterfacesKRSS2OWLSyntaxOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(KRSS2OWLSyntaxOntologyStorer.class));
    }

    public void verifyKRSS2OWLSyntaxOntologyStorer() throws Exception {
        KRSS2OWLSyntaxOntologyStorer testSubject0 = new KRSS2OWLSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesKRSS2OWLSyntaxRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class
                .isAssignableFrom(KRSS2OWLSyntaxRenderer.class));
    }

    public void verifyKRSS2OWLSyntaxRenderer() throws Exception {
        KRSS2OWLSyntaxRenderer testSubject0 = new KRSS2OWLSyntaxRenderer(
                _OWLOntologyManager);
        KRSS2OWLSyntaxRenderer testSubject1 = new KRSS2OWLSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSS2SyntaxOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(KRSS2SyntaxOntologyStorer.class));
    }

    public void verifyKRSS2SyntaxOntologyStorer() throws Exception {
        KRSS2SyntaxOntologyStorer testSubject0 = new KRSS2SyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesKRSS2SyntaxRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class
                .isAssignableFrom(KRSS2SyntaxRenderer.class));
    }

    public void verifyKRSS2SyntaxRenderer() throws Exception {
        KRSS2SyntaxRenderer testSubject0 = new KRSS2SyntaxRenderer(_OWLOntologyManager);
        KRSS2SyntaxRenderer testSubject1 = new KRSS2SyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSS2Vocabulary() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(KRSS2Vocabulary.class));
    }

    public void verifyEnumKRSS2Vocabulary() throws Exception {
        KRSS2Vocabulary testSubject0 = KRSS2Vocabulary.ALL;
        KRSS2Vocabulary testSubject1 = KRSS2Vocabulary.AND;
        KRSS2Vocabulary testSubject2 = KRSS2Vocabulary.AT_LEAST;
        KRSS2Vocabulary testSubject3 = KRSS2Vocabulary.AT_MOST;
        KRSS2Vocabulary testSubject4 = KRSS2Vocabulary.COMPOSE;
        KRSS2Vocabulary testSubject5 = KRSS2Vocabulary.DEFINE_CONCEPT;
        KRSS2Vocabulary testSubject6 = KRSS2Vocabulary.DEFINE_INDIVIDUAL;
        KRSS2Vocabulary testSubject7 = KRSS2Vocabulary.DEFINE_PRIMITIVE_CONCEPT;
        KRSS2Vocabulary testSubject8 = KRSS2Vocabulary.DEFINE_PRIMITIVE_ROLE;
        KRSS2Vocabulary testSubject9 = KRSS2Vocabulary.DEFINE_ROLE;
        KRSS2Vocabulary testSubject10 = KRSS2Vocabulary.DISJOINT;
        KRSS2Vocabulary testSubject11 = KRSS2Vocabulary.DISJOINT_ROLES;
        KRSS2Vocabulary testSubject12 = KRSS2Vocabulary.DISTINCT;
        KRSS2Vocabulary testSubject13 = KRSS2Vocabulary.DOMAIN;
        KRSS2Vocabulary testSubject14 = KRSS2Vocabulary.DOMAIN_ATTR;
        KRSS2Vocabulary testSubject15 = KRSS2Vocabulary.EQUIVALENT;
        KRSS2Vocabulary testSubject16 = KRSS2Vocabulary.EXACTLY;
        KRSS2Vocabulary testSubject17 = KRSS2Vocabulary.IMPLIES;
        KRSS2Vocabulary testSubject18 = KRSS2Vocabulary.IMPLIES_ROLE;
        KRSS2Vocabulary testSubject19 = KRSS2Vocabulary.INSTANCE;
        KRSS2Vocabulary testSubject20 = KRSS2Vocabulary.INV;
        KRSS2Vocabulary testSubject21 = KRSS2Vocabulary.INVERSE;
        KRSS2Vocabulary testSubject22 = KRSS2Vocabulary.INVERSE_ATTR;
        KRSS2Vocabulary testSubject23 = KRSS2Vocabulary.LEFTIDENTITY_ATTR;
        KRSS2Vocabulary testSubject24 = KRSS2Vocabulary.NIL;
        KRSS2Vocabulary testSubject25 = KRSS2Vocabulary.NOT;
        KRSS2Vocabulary testSubject26 = KRSS2Vocabulary.OR;
        KRSS2Vocabulary testSubject27 = KRSS2Vocabulary.ONE_OF;
        KRSS2Vocabulary testSubject28 = KRSS2Vocabulary.PARENTS_ATTR;
        KRSS2Vocabulary testSubject29 = KRSS2Vocabulary.PARENT_ATTR;
        KRSS2Vocabulary testSubject30 = KRSS2Vocabulary.RANGE_ATTR;
        KRSS2Vocabulary testSubject31 = KRSS2Vocabulary.REFLEXIVE_ATTR;
        KRSS2Vocabulary testSubject32 = KRSS2Vocabulary.RELATED;
        KRSS2Vocabulary testSubject33 = KRSS2Vocabulary.RIGHTIDENTITY_ATTR;
        KRSS2Vocabulary testSubject34 = KRSS2Vocabulary.ROLES_EQUIVALENT;
        KRSS2Vocabulary testSubject35 = KRSS2Vocabulary.ROLE_INCLUSTION;
        KRSS2Vocabulary testSubject36 = KRSS2Vocabulary.SOME;
        KRSS2Vocabulary testSubject37 = KRSS2Vocabulary.SUBROLE;
        KRSS2Vocabulary testSubject38 = KRSS2Vocabulary.SYMMETRIC_ATTR;
        KRSS2Vocabulary testSubject39 = KRSS2Vocabulary.TRUE;
        KRSS2Vocabulary testSubject40 = KRSS2Vocabulary.TRANSITIVE_ATTR;
        java.lang.String result0 = testSubject0.getShortName();
    }

    @Test
    public void enforceInterfacesKRSSObjectRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(KRSSObjectRenderer.class));
    }

    public void verifyKRSSObjectRenderer() throws Exception {
        KRSSObjectRenderer testSubject0 = new KRSSObjectRenderer(_OWLOntologyManager,
                _OWLOntology, _Writer);
        KRSSObjectRenderer testSubject1 = new KRSSObjectRenderer(_OWLOntology, _Writer);
        testSubject0.write(_OWLClassExpression);
        testSubject0.write(_OWLIndividual);
        testSubject0.write(_OWLPropertyExpression);
        testSubject0.write(_OWLDataRange);
    }

    @Test
    public void enforceInterfacesKRSSSyntaxOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(KRSSSyntaxOntologyStorer.class));
    }

    public void verifyKRSSSyntaxOntologyStorer() throws Exception {
        KRSSSyntaxOntologyStorer testSubject0 = new KRSSSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesKRSSSyntaxRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class
                .isAssignableFrom(KRSSSyntaxRenderer.class));
    }

    public void verifyKRSSSyntaxRenderer() throws Exception {
        KRSSSyntaxRenderer testSubject0 = new KRSSSyntaxRenderer(_OWLOntologyManager);
        KRSSSyntaxRenderer testSubject1 = new KRSSSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSSVocabulary() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(KRSSVocabulary.class));
    }

    public void verifyEnumKRSSVocabulary() throws Exception {
        KRSSVocabulary testSubject0 = KRSSVocabulary.ALL;
        KRSSVocabulary testSubject1 = KRSSVocabulary.AND;
        KRSSVocabulary testSubject2 = KRSSVocabulary.AT_LEAST;
        KRSSVocabulary testSubject3 = KRSSVocabulary.AT_MOST;
        KRSSVocabulary testSubject4 = KRSSVocabulary.DEFINE_CONCEPT;
        KRSSVocabulary testSubject5 = KRSSVocabulary.DEFINE_PRIMITIVE_CONCEPT;
        KRSSVocabulary testSubject6 = KRSSVocabulary.DEFINE_PRIMITIVE_ROLE;
        KRSSVocabulary testSubject7 = KRSSVocabulary.DEFINE_ROLE;
        KRSSVocabulary testSubject8 = KRSSVocabulary.DISTINCT;
        KRSSVocabulary testSubject9 = KRSSVocabulary.DISJOINT;
        KRSSVocabulary testSubject10 = KRSSVocabulary.DOMAIN;
        KRSSVocabulary testSubject11 = KRSSVocabulary.EQUAL;
        KRSSVocabulary testSubject12 = KRSSVocabulary.EXACTLY;
        KRSSVocabulary testSubject13 = KRSSVocabulary.IMPLIES;
        KRSSVocabulary testSubject14 = KRSSVocabulary.INSTANCE;
        KRSSVocabulary testSubject15 = KRSSVocabulary.INVERSE;
        KRSSVocabulary testSubject16 = KRSSVocabulary.NIL;
        KRSSVocabulary testSubject17 = KRSSVocabulary.NOT;
        KRSSVocabulary testSubject18 = KRSSVocabulary.OR;
        KRSSVocabulary testSubject19 = KRSSVocabulary.RANGE;
        KRSSVocabulary testSubject20 = KRSSVocabulary.RELATED;
        KRSSVocabulary testSubject21 = KRSSVocabulary.SOME;
        KRSSVocabulary testSubject22 = KRSSVocabulary.SYMMETRIC;
        KRSSVocabulary testSubject23 = KRSSVocabulary.TRUE;
        KRSSVocabulary testSubject24 = KRSSVocabulary.TOP;
        KRSSVocabulary testSubject25 = KRSSVocabulary.TRANSITIVE;
        java.lang.String result0 = testSubject0.getShortName();
    }

    private boolean _boolean;
    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
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
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
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
    private org.semanticweb.owlapi.model.OWLDataRange _OWLDataRange;
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
    private org.semanticweb.owlapi.model.OWLImportsDeclaration _OWLImportsDeclaration;
    private org.semanticweb.owlapi.model.OWLIndividual _OWLIndividual;
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
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?> _OWLPropertyExpression;
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
