package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.krss2.renderer.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from de.uulm.ecs.ai.owlapi.krssrenderer to org.semanticweb.owlapi.krss2.renderer", "method change: KRSS2ObjectRenderer<init>: dropped manager",
        "method visibility: KRSS2ObjectRenderer::write(): protected", "method visibility: KRSS2OWLObjectRenderer::write(): protected",
        "method change: KRSS2OWLSyntaxRenderer<init>: dropped manager", "method deleted: KRSS2OWLSyntaxRenderer::setOWLOntologyManager()",
        "method change: KRSS2SyntaxRenderer<init>: dropped manager", "method deleted: KRSS2SyntaxRenderer::setOWLOntologyManager()",
        "method change: KRSSObjectRenderer<init>: dropped manager", "method change: KRSSSyntaxRenderer<init>: dropped manager", })
public class Gen_de_uulm_ecs_ai_owlapi_krssrenderer {
    @Test
    public void enforceInterfacesKRSS2ObjectRenderer() {
        assertTrue(KRSSObjectRenderer.class.isAssignableFrom(KRSS2ObjectRenderer.class));
    }

    public void verifyKRSS2ObjectRenderer() {
        KRSS2ObjectRenderer testSubject0 = new KRSS2ObjectRenderer(_OWLOntology, _Writer);
        testSubject0.setIgnoreDeclarations(_boolean);
    }

    @Test
    public void enforceInterfacesKRSS2OWLObjectRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(KRSS2OWLObjectRenderer.class));
    }

    public void verifyKRSS2OWLObjectRenderer() {
        KRSS2OWLObjectRenderer testSubject0 = new KRSS2OWLObjectRenderer(_OWLOntology, _Writer);
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
        KRSS2OWLSyntaxRenderer testSubject1 = new KRSS2OWLSyntaxRenderer();
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
        KRSS2SyntaxRenderer testSubject1 = new KRSS2SyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSS2Vocabulary() {
        assertTrue(Enum.class.isAssignableFrom(KRSS2Vocabulary.class));
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
        String result0 = testSubject0.getShortName();
    }

    @Test
    public void enforceInterfacesKRSSObjectRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(KRSSObjectRenderer.class));
    }

    public void verifyKRSSObjectRenderer() {
        KRSSObjectRenderer testSubject0 = new KRSSObjectRenderer(_OWLOntology, _Writer);
        KRSSObjectRenderer testSubject1 = new KRSSObjectRenderer(_OWLOntology, _Writer);
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
        KRSSSyntaxRenderer testSubject1 = new KRSSSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesKRSSVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(KRSSVocabulary.class));
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
        String result0 = testSubject0.getShortName();
    }

    private boolean _boolean;
    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
}
