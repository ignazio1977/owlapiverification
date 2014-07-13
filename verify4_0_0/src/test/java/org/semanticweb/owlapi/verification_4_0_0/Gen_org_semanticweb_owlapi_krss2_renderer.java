package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.krss2.renderer.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_krss2_renderer {
    @Test
    public void enforceInterfacesKRSS2ObjectRenderer() {
        assertTrue(org.semanticweb.owlapi.krss2.renderer.KRSSObjectRenderer.class.isAssignableFrom(KRSS2ObjectRenderer.class));
    }

    public void verifyKRSS2ObjectRenderer() {
        KRSS2ObjectRenderer testSubject0 = new KRSS2ObjectRenderer(_OWLOntology, _Writer);
        testSubject0.setIgnoreDeclarations(_boolean);
    }

    @Test
    public void enforceInterfacesKRSS2OWLObjectRenderer() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorAdapter.class.isAssignableFrom(KRSS2OWLObjectRenderer.class));
    }

    public void verifyKRSS2OWLObjectRenderer() {
        KRSS2OWLObjectRenderer testSubject0 = new KRSS2OWLObjectRenderer(_Writer);
    }

    @Test
    public void enforceInterfacesKRSS2OWLSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(KRSS2OWLSyntaxStorer.class));
    }

    public void verifyKRSS2OWLSyntaxOntologyStorer() throws OWLOntologyStorageException {
        KRSS2OWLSyntaxStorer testSubject0 = new KRSS2OWLSyntaxStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesKRSS2OWLSyntaxRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(KRSS2OWLSyntaxRenderer.class));
    }

    public void verifyKRSS2OWLSyntaxRenderer() throws OWLRendererException {
        KRSS2OWLSyntaxRenderer testSubject0 = new KRSS2OWLSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSS2SyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(KRSS2SyntaxStorer.class));
    }

    public void verifyKRSS2SyntaxOntologyStorer() throws OWLOntologyStorageException {
        KRSS2SyntaxStorer testSubject0 = new KRSS2SyntaxStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesKRSS2SyntaxRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(KRSS2SyntaxRenderer.class));
    }

    public void verifyKRSS2SyntaxRenderer() throws OWLRendererException {
        KRSS2SyntaxRenderer testSubject0 = new KRSS2SyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSS2Vocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(KRSS2Vocabulary.class));
    }

    public void verifyEnumKRSS2Vocabulary() {
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
    public void enforceInterfacesKRSSObjectRenderer() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorAdapter.class.isAssignableFrom(KRSSObjectRenderer.class));
    }

    public void verifyKRSSObjectRenderer() {
        KRSSObjectRenderer testSubject0 = new KRSSObjectRenderer(_OWLOntology, _Writer);
    }

    @Test
    public void enforceInterfacesKRSSSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(KRSSSyntaxStorer.class));
    }

    public void verifyKRSSSyntaxOntologyStorer() throws OWLOntologyStorageException {
        KRSSSyntaxStorer testSubject0 = new KRSSSyntaxStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesKRSSSyntaxRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(KRSSSyntaxRenderer.class));
    }

    public void verifyKRSSSyntaxRenderer() throws OWLRendererException {
        KRSSSyntaxRenderer testSubject0 = new KRSSSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSSVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(KRSSVocabulary.class));
    }

    public void verifyEnumKRSSVocabulary() {
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
    private OWLDocumentFormat _OWLOntologyFormat;
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
