package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.OWLOntologyChangeData;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_model {
    @Test
    public void enforceInterfacesAddAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomChange.class
                .isAssignableFrom(AddAxiom.class));
    }

    public void verifyAddAxiom() throws Exception {
        AddAxiom testSubject0 = new AddAxiom(_OWLOntology, _OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        boolean result1 = testSubject0.isAddAxiom();
        org.semanticweb.owlapi.change.AddAxiomData result2 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result3 = testSubject0
                .getChangeData();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result4 = testSubject0
                .getSignature();
        boolean result5 = testSubject0.isAxiomChange();
        boolean result6 = testSubject0.isImportChange();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getEntities();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getAxiom();
        boolean result9 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesAddImport() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.ImportChange.class
                .isAssignableFrom(AddImport.class));
    }

    public void verifyAddImport() throws Exception {
        AddImport testSubject0 = new AddImport(_OWLOntology, _OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.AddImportData result1 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result2 = testSubject0
                .getChangeData();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0.getAxiom();
        org.semanticweb.owlapi.model.OWLImportsDeclaration result8 = testSubject0
                .getImportDeclaration();
        boolean result9 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotation() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.AnnotationChange.class
                .isAssignableFrom(AddOntologyAnnotation.class));
    }

    public void verifyAddOntologyAnnotation() throws Exception {
        AddOntologyAnnotation testSubject0 = new AddOntologyAnnotation(_OWLOntology,
                _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result1 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.AddOntologyAnnotationData result2 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.model.OWLAnnotation result3 = testSubject0.getAnnotation();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result4 = testSubject0
                .getSignature();
        boolean result5 = testSubject0.isAxiomChange();
        boolean result6 = testSubject0.isAddAxiom();
        boolean result7 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getAxiom();
        boolean result9 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesAnnotationChange() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChange.class
                .isAssignableFrom(AnnotationChange.class));
    }

    public void verifyAnnotationChange() throws Exception {
        AnnotationChange testSubject0 = new AnnotationChange(_OWLOntology, _OWLAnnotation) {
            @Override
            public OWLOntologyChangeData getChangeData() {
                return null;
            }

            @Override
            public void accept(OWLOntologyChangeVisitor visitor) {}

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLAnnotation result0 = testSubject0.getAnnotation();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        boolean result2 = testSubject0.isAxiomChange();
        boolean result3 = testSubject0.isAddAxiom();
        boolean result4 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getAxiom();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result7 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result8 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result9 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesAxiomType() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(AxiomType.class));
    }

    public void verifyAxiomType() throws Exception {
        AxiomType testSubject0 = AxiomType.ANNOTATION_ASSERTION;
        AxiomType testSubject1 = AxiomType.ANNOTATION_PROPERTY_DOMAIN;
        AxiomType testSubject2 = AxiomType.ANNOTATION_PROPERTY_RANGE;
        AxiomType testSubject3 = AxiomType.ASYMMETRIC_OBJECT_PROPERTY;
        AxiomType testSubject4 = AxiomType.CLASS_ASSERTION;
        AxiomType testSubject5 = AxiomType.DATA_PROPERTY_ASSERTION;
        AxiomType testSubject6 = AxiomType.DATA_PROPERTY_DOMAIN;
        AxiomType testSubject7 = AxiomType.DATA_PROPERTY_RANGE;
        AxiomType testSubject8 = AxiomType.DATATYPE_DEFINITION;
        AxiomType testSubject9 = AxiomType.DECLARATION;
        AxiomType testSubject10 = AxiomType.DIFFERENT_INDIVIDUALS;
        AxiomType testSubject11 = AxiomType.DISJOINT_CLASSES;
        AxiomType testSubject12 = AxiomType.DISJOINT_DATA_PROPERTIES;
        AxiomType testSubject13 = AxiomType.DISJOINT_OBJECT_PROPERTIES;
        AxiomType testSubject14 = AxiomType.DISJOINT_UNION;
        AxiomType testSubject15 = AxiomType.EQUIVALENT_CLASSES;
        AxiomType testSubject16 = AxiomType.EQUIVALENT_DATA_PROPERTIES;
        AxiomType testSubject17 = AxiomType.EQUIVALENT_OBJECT_PROPERTIES;
        AxiomType testSubject18 = AxiomType.FUNCTIONAL_DATA_PROPERTY;
        AxiomType testSubject19 = AxiomType.FUNCTIONAL_OBJECT_PROPERTY;
        AxiomType testSubject20 = AxiomType.HAS_KEY;
        AxiomType testSubject21 = AxiomType.INVERSE_FUNCTIONAL_OBJECT_PROPERTY;
        AxiomType testSubject22 = AxiomType.INVERSE_OBJECT_PROPERTIES;
        AxiomType testSubject23 = AxiomType.IRREFLEXIVE_OBJECT_PROPERTY;
        AxiomType testSubject24 = AxiomType.NEGATIVE_DATA_PROPERTY_ASSERTION;
        AxiomType testSubject25 = AxiomType.NEGATIVE_OBJECT_PROPERTY_ASSERTION;
        AxiomType testSubject26 = AxiomType.OBJECT_PROPERTY_ASSERTION;
        AxiomType testSubject27 = AxiomType.OBJECT_PROPERTY_DOMAIN;
        AxiomType testSubject28 = AxiomType.OBJECT_PROPERTY_RANGE;
        AxiomType testSubject29 = AxiomType.REFLEXIVE_OBJECT_PROPERTY;
        AxiomType testSubject30 = AxiomType.SAME_INDIVIDUAL;
        AxiomType testSubject31 = AxiomType.SUB_ANNOTATION_PROPERTY_OF;
        AxiomType testSubject32 = AxiomType.SUB_DATA_PROPERTY;
        AxiomType testSubject33 = AxiomType.SUB_OBJECT_PROPERTY;
        AxiomType testSubject34 = AxiomType.SUB_PROPERTY_CHAIN_OF;
        AxiomType testSubject35 = AxiomType.SUBCLASS_OF;
        AxiomType testSubject36 = AxiomType.SWRL_RULE;
        AxiomType testSubject37 = AxiomType.SYMMETRIC_OBJECT_PROPERTY;
        AxiomType testSubject38 = AxiomType.TRANSITIVE_OBJECT_PROPERTY;
        java.lang.String result0 = testSubject0.getName();
        int result1 = testSubject0.getIndex();
        org.semanticweb.owlapi.model.AxiomType<?> result2 = AxiomType
                .getAxiomType(_String);
        boolean result3 = testSubject0.isLogical();
        boolean result4 = testSubject0.isOWL2Axiom();
        boolean result5 = testSubject0.isNonSyntacticOWL2Axiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result6 = AxiomType
                .getAxiomsWithoutTypes(_Set, _AxiomType_array);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result7 = AxiomType
                .getAxiomsOfTypes(_Set, _AxiomType_array);
        boolean result8 = testSubject0.isAxiomType(_String);
    }

    @Test
    public void enforceInterfacesClassExpressionType() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(ClassExpressionType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(ClassExpressionType.class));
    }

    public void verifyEnumClassExpressionType() throws Exception {
        ClassExpressionType testSubject0 = ClassExpressionType.OWL_CLASS;
        ClassExpressionType testSubject1 = ClassExpressionType.OBJECT_SOME_VALUES_FROM;
        ClassExpressionType testSubject2 = ClassExpressionType.OBJECT_ALL_VALUES_FROM;
        ClassExpressionType testSubject3 = ClassExpressionType.OBJECT_MIN_CARDINALITY;
        ClassExpressionType testSubject4 = ClassExpressionType.OBJECT_MAX_CARDINALITY;
        ClassExpressionType testSubject5 = ClassExpressionType.OBJECT_EXACT_CARDINALITY;
        ClassExpressionType testSubject6 = ClassExpressionType.OBJECT_HAS_VALUE;
        ClassExpressionType testSubject7 = ClassExpressionType.OBJECT_HAS_SELF;
        ClassExpressionType testSubject8 = ClassExpressionType.DATA_SOME_VALUES_FROM;
        ClassExpressionType testSubject9 = ClassExpressionType.DATA_ALL_VALUES_FROM;
        ClassExpressionType testSubject10 = ClassExpressionType.DATA_MIN_CARDINALITY;
        ClassExpressionType testSubject11 = ClassExpressionType.DATA_MAX_CARDINALITY;
        ClassExpressionType testSubject12 = ClassExpressionType.DATA_EXACT_CARDINALITY;
        ClassExpressionType testSubject13 = ClassExpressionType.DATA_HAS_VALUE;
        ClassExpressionType testSubject14 = ClassExpressionType.OBJECT_INTERSECTION_OF;
        ClassExpressionType testSubject15 = ClassExpressionType.OBJECT_UNION_OF;
        ClassExpressionType testSubject16 = ClassExpressionType.OBJECT_COMPLEMENT_OF;
        ClassExpressionType testSubject17 = ClassExpressionType.OBJECT_ONE_OF;
        java.lang.String result0 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesDataRangeType() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(DataRangeType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(DataRangeType.class));
    }

    public void verifyEnumDataRangeType() throws Exception {
        DataRangeType testSubject0 = DataRangeType.DATATYPE;
        DataRangeType testSubject1 = DataRangeType.DATA_ONE_OF;
        DataRangeType testSubject2 = DataRangeType.DATATYPE_RESTRICTION;
        DataRangeType testSubject3 = DataRangeType.DATA_COMPLEMENT_OF;
        DataRangeType testSubject4 = DataRangeType.DATA_UNION_OF;
        DataRangeType testSubject5 = DataRangeType.DATA_INTERSECTION_OF;
        java.lang.String result0 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesDefaultChangeBroadcastStrategy() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy.class
                .isAssignableFrom(DefaultChangeBroadcastStrategy.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(DefaultChangeBroadcastStrategy.class));
    }

    public void verifyDefaultChangeBroadcastStrategy() throws Exception {
        DefaultChangeBroadcastStrategy testSubject0 = new DefaultChangeBroadcastStrategy();
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesDefaultImpendingChangeBroadcastStrategy()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.ImpendingOWLOntologyChangeBroadcastStrategy.class
                .isAssignableFrom(DefaultImpendingChangeBroadcastStrategy.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(DefaultImpendingChangeBroadcastStrategy.class));
    }

    public void verifyDefaultImpendingChangeBroadcastStrategy() throws Exception {
        DefaultImpendingChangeBroadcastStrategy testSubject0 = new DefaultImpendingChangeBroadcastStrategy();
        testSubject0.broadcastChanges(_ImpendingOWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesEDTChangeBroadcastStrategy() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy.class
                .isAssignableFrom(EDTChangeBroadcastStrategy.class));
    }

    public void verifyEDTChangeBroadcastStrategy() throws Exception {
        EDTChangeBroadcastStrategy testSubject0 = new EDTChangeBroadcastStrategy();
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesEntityType() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(EntityType.class));
    }

    public void verifyEntityType() throws Exception {
        EntityType testSubject0 = EntityType.ANNOTATION_PROPERTY;
        EntityType testSubject1 = EntityType.CLASS;
        EntityType testSubject2 = EntityType.DATA_PROPERTY;
        EntityType testSubject3 = EntityType.DATATYPE;
        EntityType testSubject4 = EntityType.NAMED_INDIVIDUAL;
        EntityType testSubject5 = EntityType.OBJECT_PROPERTY;
        java.util.List<org.semanticweb.owlapi.model.EntityType<?>> result0 = EntityType
                .values();
        java.lang.String result1 = testSubject0.getName();
        org.semanticweb.owlapi.vocab.OWLRDFVocabulary result2 = testSubject0
                .getVocabulary();
        java.lang.String result3 = testSubject0.getPrintName();
        java.lang.String result4 = testSubject0.getPluralPrintName();
    }

    @Test
    public void enforceInterfacesImmutableOWLOntologyChangeException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeException.class
                .isAssignableFrom(ImmutableOWLOntologyChangeException.class));
    }

    public void verifyImmutableOWLOntologyChangeException() throws Exception {
        ImmutableOWLOntologyChangeException testSubject0 = new ImmutableOWLOntologyChangeException(
                _OWLOntologyChange);
        org.semanticweb.owlapi.model.OWLOntologyChange result0 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesImpendingOWLOntologyChangeBroadcastStrategy()
            throws Exception {}

    public void verifyInterfaceImpendingOWLOntologyChangeBroadcastStrategy()
            throws Exception {
        ImpendingOWLOntologyChangeBroadcastStrategy testSubject0 = mock(ImpendingOWLOntologyChangeBroadcastStrategy.class);
        testSubject0.broadcastChanges(_ImpendingOWLOntologyChangeListener, _List);
    }

    

    public void verifyInterfaceImpendingOWLOntologyChangeListener() throws Exception {
        ImpendingOWLOntologyChangeListener testSubject0 = mock(ImpendingOWLOntologyChangeListener.class);
        testSubject0.handleImpendingOntologyChanges(_List);
    }

    @Test
    public void enforceInterfacesImportChange() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChange.class
                .isAssignableFrom(ImportChange.class));
    }

    public void verifyImportChange() throws Exception {
        ImportChange testSubject0 = new ImportChange(_OWLOntology, _OWLImportsDeclaration) {
            @Override
            public OWLOntologyChangeData getChangeData() {
                return null;
            }

            @Override
            public void accept(OWLOntologyChangeVisitor visitor) {}

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        boolean result1 = testSubject0.isAxiomChange();
        boolean result2 = testSubject0.isAddAxiom();
        boolean result3 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        org.semanticweb.owlapi.model.OWLImportsDeclaration result5 = testSubject0
                .getImportDeclaration();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result7 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result8 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result9 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesIRI() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationSubject.class
                .isAssignableFrom(IRI.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationValue.class
                .isAssignableFrom(IRI.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLPredicate.class
                .isAssignableFrom(IRI.class));
        assertTrue(java.lang.CharSequence.class.isAssignableFrom(IRI.class));
    }

    public void verifyIRI() throws Exception {
        IRI testSubject0 = mock(IRI.class);
        int result0 = testSubject0.compareTo(_OWLObject);
        int result2 = testSubject0.length();
        char result3 = testSubject0.charAt(_int);
        java.lang.CharSequence result4 = testSubject0.subSequence(_int, _int);
        boolean result5 = testSubject0.isAbsolute();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.resolve(_String);
        java.net.URI result8 = testSubject0.toURI();
        java.lang.String result9 = testSubject0.getScheme();
        java.lang.String result10 = testSubject0.getFragment();
        OWLObject result11 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result12 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        org.semanticweb.owlapi.model.IRI result14 = IRI.create(_File);
        org.semanticweb.owlapi.model.IRI result15 = IRI.create(_URI);
        org.semanticweb.owlapi.model.IRI result16 = IRI.create(_String, _String);
        org.semanticweb.owlapi.model.IRI result17 = IRI.create(_URL);
        org.semanticweb.owlapi.model.IRI result18 = IRI.create(_String);
        java.lang.String result19 = testSubject0.getStart();
        java.lang.String result20 = testSubject0.getNamespace();
        boolean result21 = testSubject0.isThing();
        boolean result22 = testSubject0.isNothing();
        boolean result23 = testSubject0.isPlainLiteral();
        org.semanticweb.owlapi.model.IRI result24 = IRI.generateDocumentIRI();
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
        boolean result34 = testSubject0.isReservedVocabulary();
        java.lang.String result35 = testSubject0.toQuotedString();
    }

    

    public void verifyMissingImportEvent() throws Exception {
        MissingImportEvent testSubject0 = new MissingImportEvent(_IRI,
                _OWLOntologyCreationException);
        org.semanticweb.owlapi.model.OWLOntologyCreationException result0 = testSubject0
                .getCreationException();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getImportedOntologyURI();
    }

    @Test
    public void enforceInterfacesMissingImportHandlingStrategy() throws Exception {
        assertTrue(java.lang.Enum.class
                .isAssignableFrom(MissingImportHandlingStrategy.class));
    }

    public void verifyEnumMissingImportHandlingStrategy() throws Exception {
        MissingImportHandlingStrategy testSubject0 = MissingImportHandlingStrategy.SILENT;
        MissingImportHandlingStrategy testSubject1 = MissingImportHandlingStrategy.THROW_EXCEPTION;
    }

    

    public void verifyInterfaceMissingImportListener() throws Exception {
        MissingImportListener testSubject0 = mock(MissingImportListener.class);
        testSubject0.importMissing(_MissingImportEvent);
    }

    @Test
    public void enforceInterfacesNodeID() throws Exception {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(NodeID.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(NodeID.class));
    }

    public void verifyNodeID() throws Exception {
        NodeID testSubject0 = NodeID.getNodeID("");
        int result0 = testSubject0.compareTo(_NodeID);
        java.lang.String result2 = testSubject0.getID();
        java.lang.String result3 = NodeID.nodeString(_int);
        java.lang.String result4 = NodeID.getIRIFromNodeID(_String);
        java.lang.String result5 = NodeID.nextAnonymousIRI();
        boolean result6 = NodeID.isAnonymousNodeIRI(_IRI);
        boolean result7 = NodeID.isAnonymousNodeIRI(_String);
        boolean result8 = NodeID.isAnonymousNodeID(_String);
        org.semanticweb.owlapi.model.NodeID result9 = NodeID.getNodeID(_String);
    }

    @Test
    public void enforceInterfacesOWLAnnotation() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLAnnotation.class));
    }

    public void verifyInterfaceOWLAnnotation() throws Exception {
        OWLAnnotation testSubject0 = mock(OWLAnnotation.class);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLAnnotationValue result1 = testSubject0.getValue();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        OWLObject result3 = testSubject0.accept(_OWLAnnotationObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationObjectVisitor);
        boolean result4 = testSubject0.isDeprecatedIRIAnnotation();
        org.semanticweb.owlapi.model.OWLAnnotation result5 = testSubject0
                .getAnnotatedAnnotation(_Set35);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result8 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result9 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result10 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result11 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result12 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result13 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiom.class
                .isAssignableFrom(OWLAnnotationAssertionAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationAssertionAxiom() throws Exception {
        OWLAnnotationAssertionAxiom testSubject0 = mock(OWLAnnotationAssertionAxiom.class);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.OWLAnnotationValue result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLAnnotation result2 = testSubject0.getAnnotation();
        org.semanticweb.owlapi.model.OWLAnnotationSubject result3 = testSubject0
                .getSubject();
        boolean result4 = testSubject0.isDeprecatedIRIAssertion();
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result7 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiom.class
                .isAssignableFrom(OWLAnnotationAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationObject.class
                .isAssignableFrom(OWLAnnotationAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationAxiom() throws Exception {
        OWLAnnotationAxiom testSubject0 = mock(OWLAnnotationAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLAnnotationAxiomVisitor() throws Exception {
        OWLAnnotationAxiomVisitor testSubject0 = mock(OWLAnnotationAxiomVisitor.class);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
    }

    

    public void verifyInterfaceOWLAnnotationAxiomVisitorEx() throws Exception {
        OWLAnnotationAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationAxiomVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result1 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result2 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result3 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObject() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLAnnotationObject.class));
    }

    public void verifyInterfaceOWLAnnotationObject() throws Exception {
        OWLAnnotationObject testSubject0 = mock(OWLAnnotationObject.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result3 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result4 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result5 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result6 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result7 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObjectVisitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiomVisitor.class
                .isAssignableFrom(OWLAnnotationObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationValueVisitor.class
                .isAssignableFrom(OWLAnnotationObjectVisitor.class));
    }

    public void verifyInterfaceOWLAnnotationObjectVisitor() throws Exception {
        OWLAnnotationObjectVisitor testSubject0 = mock(OWLAnnotationObjectVisitor.class);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObjectVisitorEx() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiomVisitorEx.class
                .isAssignableFrom(OWLAnnotationObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationValueVisitorEx.class
                .isAssignableFrom(OWLAnnotationObjectVisitorEx.class));
    }

    public void verifyInterfaceOWLAnnotationObjectVisitorEx() throws Exception {
        OWLAnnotationObjectVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationObjectVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLAnnotation);
        OWLObject result1 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result2 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result3 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result4 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result5 = testSubject0.visit(_IRI);
        OWLObject result6 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result7 = testSubject0.visit(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesOWLAnnotationProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLEntity.class
                .isAssignableFrom(OWLAnnotationProperty.class));
    }

    public void verifyInterfaceOWLAnnotationProperty() throws Exception {
        OWLAnnotationProperty testSubject0 = mock(OWLAnnotationProperty.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result0 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result1 = testSubject0
                .getSuperProperties(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result2 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result3 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result4 = testSubject0
                .getSubProperties(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result5 = testSubject0
                .getSubProperties(_OWLOntology);
        boolean result6 = testSubject0.isComment();
        boolean result7 = testSubject0.isLabel();
        boolean result8 = testSubject0.isDeprecated();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result9 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result10 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result11 = testSubject0.isType(_EntityType);
        OWLObject result12 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result13 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result14 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result15 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result16 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result17 = testSubject0
                .getEntityType();
        OWLObject result18 = testSubject0.getOWLEntity(_EntityType52);
        boolean result19 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result20 = testSubject0.asOWLClass();
        boolean result21 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result22 = testSubject0
                .asOWLObjectProperty();
        boolean result23 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result24 = testSubject0
                .asOWLDataProperty();
        boolean result25 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result26 = testSubject0
                .asOWLNamedIndividual();
        boolean result27 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result28 = testSubject0.asOWLDatatype();
        boolean result29 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result30 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result31 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result32 = testSubject0
                .getSignature();
        OWLObject result33 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result34 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result35 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result36 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result37 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result38 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result39 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result40 = testSubject0
                .getNestedClassExpressions();
        boolean result41 = testSubject0.isTopEntity();
        boolean result42 = testSubject0.isBottomEntity();
        int result43 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result44 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiom.class
                .isAssignableFrom(OWLAnnotationPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationPropertyDomainAxiom() throws Exception {
        OWLAnnotationPropertyDomainAxiom testSubject0 = mock(OWLAnnotationPropertyDomainAxiom.class);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getDomain();
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiom.class
                .isAssignableFrom(OWLAnnotationPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationPropertyRangeAxiom() throws Exception {
        OWLAnnotationPropertyRangeAxiom testSubject0 = mock(OWLAnnotationPropertyRangeAxiom.class);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getProperty();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getRange();
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationSubject() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationObject.class
                .isAssignableFrom(OWLAnnotationSubject.class));
    }

    public void verifyInterfaceOWLAnnotationSubject() throws Exception {
        OWLAnnotationSubject testSubject0 = mock(OWLAnnotationSubject.class);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLAnnotationSubjectVisitor() throws Exception {
        OWLAnnotationSubjectVisitor testSubject0 = mock(OWLAnnotationSubjectVisitor.class);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
    }

    

    public void verifyInterfaceOWLAnnotationSubjectVisitorEx() throws Exception {
        OWLAnnotationSubjectVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationSubjectVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_IRI);
        OWLObject result1 = testSubject0.visit(_OWLAnonymousIndividual);
    }

    @Test
    public void enforceInterfacesOWLAnnotationValue() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationObject.class
                .isAssignableFrom(OWLAnnotationValue.class));
    }

    public void verifyInterfaceOWLAnnotationValue() throws Exception {
        OWLAnnotationValue testSubject0 = mock(OWLAnnotationValue.class);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLAnnotationValueVisitor() throws Exception {
        OWLAnnotationValueVisitor testSubject0 = mock(OWLAnnotationValueVisitor.class);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLLiteral);
    }

    

    public void verifyInterfaceOWLAnnotationValueVisitorEx() throws Exception {
        OWLAnnotationValueVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationValueVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_IRI);
        OWLObject result1 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result2 = testSubject0.visit(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesOWLAnonymousClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpression.class
                .isAssignableFrom(OWLAnonymousClassExpression.class));
    }

    public void verifyInterfaceOWLAnonymousClassExpression() throws Exception {
        OWLAnonymousClassExpression testSubject0 = mock(OWLAnonymousClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result1 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividual() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLIndividual.class
                .isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationValue.class
                .isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationSubject.class
                .isAssignableFrom(OWLAnonymousIndividual.class));
    }

    public void verifyInterfaceOWLAnonymousIndividual() throws Exception {
        OWLAnonymousIndividual testSubject0 = mock(OWLAnonymousIndividual.class);
        org.semanticweb.owlapi.model.NodeID result0 = testSubject0.getID();
        OWLObject result1 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result2 = testSubject0.isNamed();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result3 = testSubject0
                .asOWLAnonymousIndividual();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getTypes(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result5 = testSubject0
                .getTypes(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result6 = testSubject0
                .getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result7 = testSubject0
                .getObjectPropertyValues(_OWLOntology);
        boolean result8 = testSubject0.hasObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result9 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression,
                _OWLLiteral, _OWLOntology);
        boolean result10 = testSubject0.hasNegativeObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result11 = testSubject0
                .getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result12 = testSubject0
                .getDataPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result13 = testSubject0
                .getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result14 = testSubject0
                .getNegativeDataPropertyValues(_OWLOntology);
        boolean result15 = testSubject0.hasNegativeDataPropertyValue(
                _OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result16 = testSubject0
                .getSameIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result17 = testSubject0
                .getDifferentIndividuals(_OWLOntology);
        boolean result18 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLNamedIndividual result19 = testSubject0
                .asOWLNamedIndividual();
        java.lang.String result20 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result21 = testSubject0
                .getSignature();
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result32 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result33 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result34 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLAsymmetricObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLAsymmetricObjectPropertyAxiom() throws Exception {
        OWLAsymmetricObjectPropertyAxiom testSubject0 = mock(OWLAsymmetricObjectPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLAxiom.class));
    }

    public void verifyInterfaceOWLAxiom() throws Exception {
        OWLAxiom testSubject0 = mock(OWLAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAxiomChange() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChange.class
                .isAssignableFrom(OWLAxiomChange.class));
    }

    public void verifyOWLAxiomChange() throws Exception {
        OWLAxiomChange testSubject0 = new OWLAxiomChange(_OWLOntology, _OWLAxiom) {
            @Override
            public boolean isAddAxiom() {
                return false;
            }

            @Override
            public OWLOntologyChangeData getChangeData() {
                return null;
            }

            @Override
            public void accept(OWLOntologyChangeVisitor visitor) {}

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        boolean result1 = testSubject0.isAxiomChange();
        boolean result2 = testSubject0.isImportChange();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getEntities();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0.getAxiom();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result5 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result6 = testSubject0.isAddAxiom();
        boolean result7 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result8 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result9 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiomVisitor.class
                .isAssignableFrom(OWLAxiomVisitor.class));
    }

    public void verifyInterfaceOWLAxiomVisitor() throws Exception {
        OWLAxiomVisitor testSubject0 = mock(OWLAxiomVisitor.class);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitorEx() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiomVisitorEx.class
                .isAssignableFrom(OWLAxiomVisitorEx.class));
    }

    public void verifyInterfaceOWLAxiomVisitorEx() throws Exception {
        OWLAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLAxiomVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result1 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result2 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result3 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result4 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result5 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result6 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result7 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result8 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result9 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result10 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result11 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result12 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result13 = testSubject0.visit(_SWRLRule);
        OWLObject result14 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result15 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result16 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result17 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result18 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result19 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result20 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result21 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result22 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result23 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result24 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result25 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result26 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result27 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result28 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result29 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result30 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result31 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result32 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result33 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result34 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLObject result35 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result36 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result37 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result38 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
    }

    @Test
    public void enforceInterfacesOWLBooleanClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnonymousClassExpression.class
                .isAssignableFrom(OWLBooleanClassExpression.class));
    }

    public void verifyInterfaceOWLBooleanClassExpression() throws Exception {
        OWLBooleanClassExpression testSubject0 = mock(OWLBooleanClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result1 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLCardinalityRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedRestriction.class
                .isAssignableFrom(OWLCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLCardinalityRestriction() throws Exception {
        OWLCardinalityRestriction testSubject0 = mock(OWLCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLClass() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpression.class
                .isAssignableFrom(OWLClass.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalEntity.class
                .isAssignableFrom(OWLClass.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNamedObject.class
                .isAssignableFrom(OWLClass.class));
    }

    public void verifyInterfaceOWLClass() throws Exception {
        OWLClass testSubject0 = mock(OWLClass.class);
        boolean result0 = testSubject0.isDefined(_Set48);
        boolean result1 = testSubject0.isDefined(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getSuperClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getSuperClasses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getSubClasses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result5 = testSubject0
                .getSubClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result6 = testSubject0
                .getEquivalentClasses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .getEquivalentClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getDisjointClasses(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .getDisjointClasses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result10 = testSubject0
                .getIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result11 = testSubject0
                .getIndividuals(_Set48);
        OWLObject result12 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result13 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result14 = testSubject0
                .getClassExpressionType();
        boolean result15 = testSubject0.isClassExpressionLiteral();
        boolean result16 = testSubject0.isOWLNothing();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0
                .getComplementNNF();
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0
                .getObjectComplementOf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result19 = testSubject0
                .asConjunctSet();
        boolean result20 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .asDisjunctSet();
        org.semanticweb.owlapi.model.OWLClassExpression result22 = testSubject0.getNNF();
        boolean result23 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLClass result24 = testSubject0.asOWLClass();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result25 = testSubject0
                .getSignature();
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result27 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result28 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result29 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result30 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result31 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result32 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result33 = testSubject0
                .getNestedClassExpressions();
        boolean result34 = testSubject0.isTopEntity();
        boolean result35 = testSubject0.isBottomEntity();
        int result36 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result37 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result38 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result39 = testSubject0.isType(_EntityType);
        OWLObject result40 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result41 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result42 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result43 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result44 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result45 = testSubject0
                .getEntityType();
        OWLObject result46 = testSubject0.getOWLEntity(_EntityType52);
        boolean result47 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result48 = testSubject0.asOWLClass();
        boolean result49 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result50 = testSubject0
                .asOWLObjectProperty();
        boolean result51 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result52 = testSubject0
                .asOWLDataProperty();
        boolean result53 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result54 = testSubject0
                .asOWLNamedIndividual();
        boolean result55 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result56 = testSubject0.asOWLDatatype();
        boolean result57 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result58 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result59 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result60 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLIndividualAxiom.class
                .isAssignableFrom(OWLClassAssertionAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLClassAssertionAxiom.class));
    }

    public void verifyInterfaceOWLClassAssertionAxiom() throws Exception {
        OWLClassAssertionAxiom testSubject0 = mock(OWLClassAssertionAxiom.class);
        org.semanticweb.owlapi.model.OWLIndividual result0 = testSubject0.getIndividual();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .getClassExpression();
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLClassAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLClassAxiom.class));
    }

    public void verifyInterfaceOWLClassAxiom() throws Exception {
        OWLClassAxiom testSubject0 = mock(OWLClassAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLClassExpression.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyRange.class
                .isAssignableFrom(OWLClassExpression.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLPredicate.class
                .isAssignableFrom(OWLClassExpression.class));
    }

    public void verifyInterfaceOWLClassExpression() throws Exception {
        OWLClassExpression testSubject0 = mock(OWLClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result1 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result2 = testSubject0
                .getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLClassExpressionVisitor() throws Exception {
        OWLClassExpressionVisitor testSubject0 = mock(OWLClassExpressionVisitor.class);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
    }

    

    public void verifyInterfaceOWLClassExpressionVisitorEx() throws Exception {
        OWLClassExpressionVisitorEx<OWLObject> testSubject0 = mock(OWLClassExpressionVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLObject result1 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLObject result2 = testSubject0.visit(_OWLObjectOneOf);
        OWLObject result3 = testSubject0.visit(_OWLObjectHasSelf);
        OWLObject result4 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLObject result5 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLObject result6 = testSubject0.visit(_OWLDataExactCardinality);
        OWLObject result7 = testSubject0.visit(_OWLDataMinCardinality);
        OWLObject result8 = testSubject0.visit(_OWLDataHasValue);
        OWLObject result9 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLObject result10 = testSubject0.visit(_OWLObjectComplementOf);
        OWLObject result11 = testSubject0.visit(_OWLObjectUnionOf);
        OWLObject result12 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLObject result13 = testSubject0.visit(_OWLClass);
        OWLObject result14 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLObject result15 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLObject result16 = testSubject0.visit(_OWLObjectHasValue);
        OWLObject result17 = testSubject0.visit(_OWLObjectAllValuesFrom);
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFrom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedDataRestriction.class
                .isAssignableFrom(OWLDataAllValuesFrom.class));
    }

    public void verifyInterfaceOWLDataAllValuesFrom() throws Exception {
        OWLDataAllValuesFrom testSubject0 = mock(OWLDataAllValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataCardinalityRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLCardinalityRestriction.class
                .isAssignableFrom(OWLDataCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLDataCardinalityRestriction() throws Exception {
        OWLDataCardinalityRestriction testSubject0 = mock(OWLDataCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataComplementOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataRange.class
                .isAssignableFrom(OWLDataComplementOf.class));
    }

    public void verifyInterfaceOWLDataComplementOf() throws Exception {
        OWLDataComplementOf testSubject0 = mock(OWLDataComplementOf.class);
        org.semanticweb.owlapi.model.OWLDataRange result0 = testSubject0.getDataRange();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinality() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataCardinalityRestriction.class
                .isAssignableFrom(OWLDataExactCardinality.class));
    }

    public void verifyInterfaceOWLDataExactCardinality() throws Exception {
        OWLDataExactCardinality testSubject0 = mock(OWLDataExactCardinality.class);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .asIntersectionOfMinMax();
        int result1 = testSubject0.getCardinality();
        boolean result2 = testSubject0.isQualified();
        OWLPropertyRange result3 = testSubject0.getFiller();
        OWLPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        OWLObject result7 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result8 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result9 = testSubject0
                .getClassExpressionType();
        boolean result10 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result31 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLDataFactory.class
                .isAssignableFrom(OWLDataFactory.class));
    }

    public void verifyInterfaceOWLDataFactory() throws Exception {
        OWLDataFactory testSubject0 = mock(OWLDataFactory.class);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result0 = testSubject0
                .getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result1 = testSubject0
                .getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result2 = testSubject0
                .getOWLEquivalentClassesAxiom(_Set120);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result3 = testSubject0
                .getOWLEquivalentClassesAxiom(_Set120, _Set119);
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result4 = testSubject0
                .getOWLEquivalentClassesAxiom(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result5 = testSubject0
                .getOWLDisjointClassesAxiom(_Set120);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result6 = testSubject0
                .getOWLDisjointClassesAxiom(_Set120, _Set119);
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result7 = testSubject0
                .getOWLDisjointClassesAxiom(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLClass result8 = testSubject0.getOWLClass(_IRI);
        org.semanticweb.owlapi.model.OWLClass result9 = testSubject0.getOWLClass(_String,
                _PrefixManager);
        org.semanticweb.owlapi.model.OWLClass result10 = testSubject0.getOWLThing();
        testSubject0.purge();
        org.semanticweb.owlapi.model.OWLNamedIndividual result11 = testSubject0
                .getOWLNamedIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLNamedIndividual result12 = testSubject0
                .getOWLNamedIndividual(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLObjectInverseOf result13 = testSubject0
                .getOWLObjectInverseOf(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLDatatype result14 = testSubject0.getTopDatatype();
        org.semanticweb.owlapi.model.OWLObjectProperty result15 = testSubject0
                .getOWLObjectProperty(_IRI);
        org.semanticweb.owlapi.model.OWLObjectProperty result16 = testSubject0
                .getOWLObjectProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLDataProperty result17 = testSubject0
                .getOWLDataProperty(_IRI);
        org.semanticweb.owlapi.model.OWLDataProperty result18 = testSubject0
                .getOWLDataProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLClass result19 = testSubject0.getOWLNothing();
        org.semanticweb.owlapi.model.OWLObjectProperty result20 = testSubject0
                .getOWLTopObjectProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result21 = testSubject0
                .getOWLTopDataProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result22 = testSubject0
                .getOWLBottomObjectProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result23 = testSubject0
                .getOWLBottomDataProperty();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result24 = testSubject0
                .getOWLAnonymousIndividual();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result25 = testSubject0
                .getOWLAnonymousIndividual(_String);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result26 = testSubject0
                .getOWLAnnotationProperty(_String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result27 = testSubject0
                .getOWLAnnotationProperty(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result28 = testSubject0
                .getRDFSLabel();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result29 = testSubject0
                .getRDFSComment();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result30 = testSubject0
                .getRDFSSeeAlso();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result31 = testSubject0
                .getRDFSIsDefinedBy();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result32 = testSubject0
                .getOWLVersionInfo();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result33 = testSubject0
                .getOWLBackwardCompatibleWith();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result34 = testSubject0
                .getOWLIncompatibleWith();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result35 = testSubject0
                .getOWLDeprecated();
        org.semanticweb.owlapi.model.OWLDatatype result36 = testSubject0
                .getRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result37 = testSubject0.getOWLDatatype(
                _String, _PrefixManager);
        org.semanticweb.owlapi.model.OWLDatatype result38 = testSubject0
                .getOWLDatatype(_IRI);
        org.semanticweb.owlapi.model.OWLDatatype result39 = testSubject0
                .getIntegerOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result40 = testSubject0
                .getFloatOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result41 = testSubject0
                .getDoubleOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result42 = testSubject0
                .getBooleanOWLDatatype();
        org.semanticweb.owlapi.model.OWLLiteral result43 = testSubject0.getOWLLiteral(
                _String, _String);
        org.semanticweb.owlapi.model.OWLLiteral result44 = testSubject0
                .getOWLLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result45 = testSubject0
                .getOWLLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result46 = testSubject0
                .getOWLLiteral(_float);
        org.semanticweb.owlapi.model.OWLLiteral result47 = testSubject0
                .getOWLLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result48 = testSubject0.getOWLLiteral(
                _String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result49 = testSubject0.getOWLLiteral(
                _String, _OWL2Datatype);
        org.semanticweb.owlapi.model.OWLLiteral result50 = testSubject0
                .getOWLLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result51 = testSubject0
                .getOWLTypedLiteral(_int);
        org.semanticweb.owlapi.model.OWLLiteral result52 = testSubject0
                .getOWLTypedLiteral(_float);
        org.semanticweb.owlapi.model.OWLLiteral result53 = testSubject0
                .getOWLTypedLiteral(_boolean);
        org.semanticweb.owlapi.model.OWLLiteral result54 = testSubject0
                .getOWLTypedLiteral(_double);
        org.semanticweb.owlapi.model.OWLLiteral result55 = testSubject0
                .getOWLTypedLiteral(_String);
        org.semanticweb.owlapi.model.OWLLiteral result56 = testSubject0
                .getOWLTypedLiteral(_String, _OWL2Datatype);
        org.semanticweb.owlapi.model.OWLLiteral result57 = testSubject0
                .getOWLTypedLiteral(_String, _OWLDatatype);
        org.semanticweb.owlapi.model.OWLLiteral result58 = testSubject0
                .getOWLStringLiteral(_String, _String);
        org.semanticweb.owlapi.model.OWLLiteral result59 = testSubject0
                .getOWLStringLiteral(_String);
        org.semanticweb.owlapi.model.OWLDataOneOf result60 = testSubject0
                .getOWLDataOneOf(_Set127);
        org.semanticweb.owlapi.model.OWLDataOneOf result61 = testSubject0
                .getOWLDataOneOf(_OWLLiteral_array);
        org.semanticweb.owlapi.model.OWLDataComplementOf result62 = testSubject0
                .getOWLDataComplementOf(_OWLDataRange);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result63 = testSubject0
                .getOWLDatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result64 = testSubject0
                .getOWLDatatypeRestriction(_OWLDatatype, _Set131);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result65 = testSubject0
                .getOWLDatatypeRestriction(_OWLDatatype, _OWLFacet, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result66 = testSubject0
                .getOWLDatatypeMinInclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result67 = testSubject0
                .getOWLDatatypeMinInclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result68 = testSubject0
                .getOWLDatatypeMaxInclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result69 = testSubject0
                .getOWLDatatypeMaxInclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result70 = testSubject0
                .getOWLDatatypeMinMaxInclusiveRestriction(_int, _int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result71 = testSubject0
                .getOWLDatatypeMinMaxInclusiveRestriction(_double, _double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result72 = testSubject0
                .getOWLDatatypeMinExclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result73 = testSubject0
                .getOWLDatatypeMinExclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result74 = testSubject0
                .getOWLDatatypeMaxExclusiveRestriction(_double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result75 = testSubject0
                .getOWLDatatypeMaxExclusiveRestriction(_int);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result76 = testSubject0
                .getOWLDatatypeMinMaxExclusiveRestriction(_double, _double);
        org.semanticweb.owlapi.model.OWLDatatypeRestriction result77 = testSubject0
                .getOWLDatatypeMinMaxExclusiveRestriction(_int, _int);
        org.semanticweb.owlapi.model.OWLFacetRestriction result78 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLFacetRestriction result79 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _double);
        org.semanticweb.owlapi.model.OWLFacetRestriction result80 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _int);
        org.semanticweb.owlapi.model.OWLFacetRestriction result81 = testSubject0
                .getOWLFacetRestriction(_OWLFacet, _float);
        org.semanticweb.owlapi.model.OWLDataUnionOf result82 = testSubject0
                .getOWLDataUnionOf(_Set133);
        org.semanticweb.owlapi.model.OWLDataUnionOf result83 = testSubject0
                .getOWLDataUnionOf(_OWLDataRange_array);
        org.semanticweb.owlapi.model.OWLDataIntersectionOf result84 = testSubject0
                .getOWLDataIntersectionOf(_OWLDataRange_array);
        org.semanticweb.owlapi.model.OWLDataIntersectionOf result85 = testSubject0
                .getOWLDataIntersectionOf(_Set133);
        org.semanticweb.owlapi.model.OWLObjectIntersectionOf result86 = testSubject0
                .getOWLObjectIntersectionOf(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLObjectIntersectionOf result87 = testSubject0
                .getOWLObjectIntersectionOf(_Set120);
        org.semanticweb.owlapi.model.OWLDataSomeValuesFrom result88 = testSubject0
                .getOWLDataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataAllValuesFrom result89 = testSubject0
                .getOWLDataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result90 = testSubject0
                .getOWLDataExactCardinality(_int, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result91 = testSubject0
                .getOWLDataExactCardinality(_int, _OWLDataPropertyExpression,
                        _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result92 = testSubject0
                .getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result93 = testSubject0
                .getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result94 = testSubject0
                .getOWLDataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result95 = testSubject0
                .getOWLDataMinCardinality(_int, _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLDataHasValue result96 = testSubject0
                .getOWLDataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLObjectComplementOf result97 = testSubject0
                .getOWLObjectComplementOf(_OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectOneOf result98 = testSubject0
                .getOWLObjectOneOf(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLObjectOneOf result99 = testSubject0
                .getOWLObjectOneOf(_Set136);
        org.semanticweb.owlapi.model.OWLObjectAllValuesFrom result100 = testSubject0
                .getOWLObjectAllValuesFrom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom result101 = testSubject0
                .getOWLObjectSomeValuesFrom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result102 = testSubject0
                .getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result103 = testSubject0
                .getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result104 = testSubject0
                .getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result105 = testSubject0
                .getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result106 = testSubject0
                .getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result107 = testSubject0
                .getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectHasSelf result108 = testSubject0
                .getOWLObjectHasSelf(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectHasValue result109 = testSubject0
                .getOWLObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLObjectUnionOf result110 = testSubject0
                .getOWLObjectUnionOf(_OWLClassExpression_array);
        org.semanticweb.owlapi.model.OWLObjectUnionOf result111 = testSubject0
                .getOWLObjectUnionOf(_Set120);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result112 = testSubject0
                .getOWLDeclarationAxiom(_OWLEntity, _Set119);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result113 = testSubject0
                .getOWLDeclarationAxiom(_OWLEntity);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result114 = testSubject0
                .getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result115 = testSubject0
                .getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression, _Set119);
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result116 = testSubject0
                .getOWLDisjointUnionAxiom(_OWLClass, _Set120, _Set119);
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result117 = testSubject0
                .getOWLDisjointUnionAxiom(_OWLClass, _Set120);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result118 = testSubject0
                .getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result119 = testSubject0
                .getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result120 = testSubject0
                .getOWLSubPropertyChainOfAxiom(_List138, _OWLObjectPropertyExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result121 = testSubject0
                .getOWLSubPropertyChainOfAxiom(_List138, _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result122 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result123 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result124 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result125 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_Set140, _Set119);
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result126 = testSubject0
                .getOWLEquivalentObjectPropertiesAxiom(_Set140);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result127 = testSubject0
                .getOWLDisjointObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result128 = testSubject0
                .getOWLDisjointObjectPropertiesAxiom(_Set140, _Set119);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result129 = testSubject0
                .getOWLDisjointObjectPropertiesAxiom(_Set140);
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result130 = testSubject0
                .getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result131 = testSubject0
                .getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression,
                        _OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result132 = testSubject0
                .getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression, _Set119);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result133 = testSubject0
                .getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result134 = testSubject0
                .getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression, _Set119);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result135 = testSubject0
                .getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result136 = testSubject0
                .getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result137 = testSubject0
                .getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result138 = testSubject0
                .getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result139 = testSubject0
                .getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result140 = testSubject0
                .getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result141 = testSubject0
                .getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result142 = testSubject0
                .getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result143 = testSubject0
                .getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result144 = testSubject0
                .getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result145 = testSubject0
                .getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result146 = testSubject0
                .getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom result147 = testSubject0
                .getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result148 = testSubject0
                .getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression,
                        _Set119);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result149 = testSubject0
                .getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result150 = testSubject0
                .getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result151 = testSubject0
                .getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result152 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result153 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result154 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression,
                        _OWLDataPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result155 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_Set142, _Set119);
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result156 = testSubject0
                .getOWLEquivalentDataPropertiesAxiom(_Set142);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result157 = testSubject0
                .getOWLDisjointDataPropertiesAxiom(_Set142);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result158 = testSubject0
                .getOWLDisjointDataPropertiesAxiom(_Set142, _Set119);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result159 = testSubject0
                .getOWLDisjointDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result160 = testSubject0
                .getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression,
                        _OWLClassExpression, _Set119);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result161 = testSubject0
                .getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression,
                        _OWLClassExpression);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result162 = testSubject0
                .getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange,
                        _Set119);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result163 = testSubject0
                .getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result164 = testSubject0
                .getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression, _Set119);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result165 = testSubject0
                .getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result166 = testSubject0
                .getOWLHasKeyAxiom(_OWLClassExpression, _Set143, _Set119);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result167 = testSubject0
                .getOWLHasKeyAxiom(_OWLClassExpression, _OWLPropertyExpression_array);
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result168 = testSubject0
                .getOWLHasKeyAxiom(_OWLClassExpression, _Set143);
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result169 = testSubject0
                .getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange, _Set119);
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result170 = testSubject0
                .getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result171 = testSubject0
                .getOWLSameIndividualAxiom(_Set136, _Set119);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result172 = testSubject0
                .getOWLSameIndividualAxiom(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result173 = testSubject0
                .getOWLSameIndividualAxiom(_Set136);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result174 = testSubject0
                .getOWLDifferentIndividualsAxiom(_Set136, _Set119);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result175 = testSubject0
                .getOWLDifferentIndividualsAxiom(_OWLIndividual_array);
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result176 = testSubject0
                .getOWLDifferentIndividualsAxiom(_Set136);
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result177 = testSubject0
                .getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual, _Set119);
        org.semanticweb.owlapi.model.OWLClassAssertionAxiom result178 = testSubject0
                .getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result179 = testSubject0
                .getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual, _Set119);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result180 = testSubject0
                .getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result181 = testSubject0
                .getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual, _Set119);
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result182 = testSubject0
                .getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression,
                        _OWLIndividual, _OWLIndividual);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result183 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _double);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result184 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _float);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result185 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _boolean);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result186 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _String);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result187 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result188 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral, _Set119);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result189 = testSubject0
                .getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _int);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result190 = testSubject0
                .getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral, _Set119);
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result191 = testSubject0
                .getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression,
                        _OWLIndividual, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLAnnotation result192 = testSubject0
                .getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue, _Set119);
        org.semanticweb.owlapi.model.OWLAnnotation result193 = testSubject0
                .getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result194 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation,
                        _Set119);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result195 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationSubject, _OWLAnnotationValue, _Set119);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result196 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result197 = testSubject0
                .getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationSubject, _OWLAnnotationValue);
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result198 = testSubject0
                .getDeprecatedOWLAnnotationAssertionAxiom(_IRI);
        org.semanticweb.owlapi.model.OWLImportsDeclaration result199 = testSubject0
                .getOWLImportsDeclaration(_IRI);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result200 = testSubject0
                .getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI,
                        _Set119);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result201 = testSubject0
                .getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result202 = testSubject0
                .getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI, _Set119);
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result203 = testSubject0
                .getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI);
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result204 = testSubject0
                .getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationProperty, _Set119);
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result205 = testSubject0
                .getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty,
                        _OWLAnnotationProperty);
        OWLObject result206 = testSubject0.getOWLEntity(_EntityType52, _IRI);
        org.semanticweb.owlapi.model.SWRLRule result207 = testSubject0.getSWRLRule(
                _Set147, _Set147, _Set35);
        org.semanticweb.owlapi.model.SWRLRule result208 = testSubject0.getSWRLRule(
                _Set147, _Set147);
        org.semanticweb.owlapi.model.SWRLRule result209 = testSubject0.getSWRLRule(
                _NodeID, _Set147, _Set147);
        org.semanticweb.owlapi.model.SWRLRule result210 = testSubject0.getSWRLRule(_IRI,
                _Set147, _Set147);
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
                .getSWRLBuiltInAtom(_IRI, _List150);
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
    }

    @Test
    public void enforceInterfacesOWLDataHasValue() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLHasValueRestriction.class
                .isAssignableFrom(OWLDataHasValue.class));
    }

    public void verifyInterfaceOWLDataHasValue() throws Exception {
        OWLDataHasValue testSubject0 = mock(OWLDataHasValue.class);
        OWLLiteral result0 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .asSomeValuesFrom();
        OWLDataPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result6 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result7 = testSubject0
                .getClassExpressionType();
        boolean result8 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryDataRange.class
                .isAssignableFrom(OWLDataIntersectionOf.class));
    }

    public void verifyInterfaceOWLDataIntersectionOf() throws Exception {
        OWLDataIntersectionOf testSubject0 = mock(OWLDataIntersectionOf.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result0 = testSubject0
                .getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinality() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataCardinalityRestriction.class
                .isAssignableFrom(OWLDataMaxCardinality.class));
    }

    public void verifyInterfaceOWLDataMaxCardinality() throws Exception {
        OWLDataMaxCardinality testSubject0 = mock(OWLDataMaxCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinality() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataCardinalityRestriction.class
                .isAssignableFrom(OWLDataMinCardinality.class));
    }

    public void verifyInterfaceOWLDataMinCardinality() throws Exception {
        OWLDataMinCardinality testSubject0 = mock(OWLDataMinCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataOneOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataRange.class
                .isAssignableFrom(OWLDataOneOf.class));
    }

    public void verifyInterfaceOWLDataOneOf() throws Exception {
        OWLDataOneOf testSubject0 = mock(OWLDataOneOf.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result0 = testSubject0
                .getValues();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyExpression.class
                .isAssignableFrom(OWLDataProperty.class));
        assertTrue(org.semanticweb.owlapi.model.OWLProperty.class
                .isAssignableFrom(OWLDataProperty.class));
    }

    public void verifyInterfaceOWLDataProperty() throws Exception {
        OWLDataProperty testSubject0 = mock(OWLDataProperty.class);
        org.semanticweb.owlapi.model.OWLDataProperty result0 = testSubject0
                .asOWLDataProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLDataRange> result4 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLDataRange> result5 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result6 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLDataPropertyExpression> result7 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result8 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result9 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLDataPropertyExpression> result10 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result11 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLDataPropertyExpression> result12 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result13 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result14 = testSubject0.isFunctional(_OWLOntology);
        boolean result15 = testSubject0.isFunctional(_Set48);
        boolean result16 = testSubject0.isDataPropertyExpression();
        boolean result17 = testSubject0.isObjectPropertyExpression();
        boolean result18 = testSubject0.isOWLTopObjectProperty();
        boolean result19 = testSubject0.isOWLBottomObjectProperty();
        boolean result20 = testSubject0.isOWLTopDataProperty();
        boolean result21 = testSubject0.isOWLBottomDataProperty();
        boolean result22 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result34 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result35 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result36 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result37 = testSubject0.isType(_EntityType);
        OWLObject result38 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result39 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result40 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result41 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result42 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result43 = testSubject0
                .getEntityType();
        OWLObject result44 = testSubject0.getOWLEntity(_EntityType52);
        boolean result45 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result46 = testSubject0.asOWLClass();
        boolean result47 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result48 = testSubject0
                .asOWLObjectProperty();
        boolean result49 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result50 = testSubject0
                .asOWLDataProperty();
        boolean result51 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result52 = testSubject0
                .asOWLNamedIndividual();
        boolean result53 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result54 = testSubject0.asOWLDatatype();
        boolean result55 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result56 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result57 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result58 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionAxiom.class
                .isAssignableFrom(OWLDataPropertyAssertionAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLDataPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyAssertionAxiom() throws Exception {
        OWLDataPropertyAssertionAxiom testSubject0 = mock(OWLDataPropertyAssertionAxiom.class);
        org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        OWLObject result2 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result3 = testSubject0.getSubject();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result29 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLDataPropertyAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyAxiom() throws Exception {
        OWLDataPropertyAxiom testSubject0 = mock(OWLDataPropertyAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyCharacteristicAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAxiom.class
                .isAssignableFrom(OWLDataPropertyCharacteristicAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLUnaryPropertyAxiom.class
                .isAssignableFrom(OWLDataPropertyCharacteristicAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyCharacteristicAxiom() throws Exception {
        OWLDataPropertyCharacteristicAxiom testSubject0 = mock(OWLDataPropertyCharacteristicAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
        OWLPropertyExpression result25 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyDomainAxiom.class
                .isAssignableFrom(OWLDataPropertyDomainAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAxiom.class
                .isAssignableFrom(OWLDataPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyDomainAxiom() throws Exception {
        OWLDataPropertyDomainAxiom testSubject0 = mock(OWLDataPropertyDomainAxiom.class);
        org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .getDomain();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyExpression.class
                .isAssignableFrom(OWLDataPropertyExpression.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLPredicate.class
                .isAssignableFrom(OWLDataPropertyExpression.class));
    }

    public void verifyInterfaceOWLDataPropertyExpression() throws Exception {
        OWLDataPropertyExpression testSubject0 = mock(OWLDataPropertyExpression.class);
        org.semanticweb.owlapi.model.OWLDataProperty result0 = testSubject0
                .asOWLDataProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLDataRange> result4 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLDataRange> result5 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result6 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLDataPropertyExpression> result7 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result8 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result9 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLDataPropertyExpression> result10 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result11 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLDataPropertyExpression> result12 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result13 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result14 = testSubject0.isFunctional(_OWLOntology);
        boolean result15 = testSubject0.isFunctional(_Set48);
        boolean result16 = testSubject0.isDataPropertyExpression();
        boolean result17 = testSubject0.isObjectPropertyExpression();
        boolean result18 = testSubject0.isOWLTopObjectProperty();
        boolean result19 = testSubject0.isOWLBottomObjectProperty();
        boolean result20 = testSubject0.isOWLTopDataProperty();
        boolean result21 = testSubject0.isOWLBottomDataProperty();
        boolean result22 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result34 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyRangeAxiom.class
                .isAssignableFrom(OWLDataPropertyRangeAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAxiom.class
                .isAssignableFrom(OWLDataPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyRangeAxiom() throws Exception {
        OWLDataPropertyRangeAxiom testSubject0 = mock(OWLDataPropertyRangeAxiom.class);
        org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLDataRange result1 = testSubject0.getRange();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLDataRange() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLDataRange.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyRange.class
                .isAssignableFrom(OWLDataRange.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLPredicate.class
                .isAssignableFrom(OWLDataRange.class));
    }

    public void verifyInterfaceOWLDataRange() throws Exception {
        OWLDataRange testSubject0 = mock(OWLDataRange.class);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result2 = testSubject0.isDatatype();
        boolean result3 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result4 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result5 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result8 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result9 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result10 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result11 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result12 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result13 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLDataRangeVisitor() throws Exception {
        OWLDataRangeVisitor testSubject0 = mock(OWLDataRangeVisitor.class);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatype);
    }

    

    public void verifyInterfaceOWLDataRangeVisitorEx() throws Exception {
        OWLDataRangeVisitorEx<OWLObject> testSubject0 = mock(OWLDataRangeVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result1 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result2 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLObject result3 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result4 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result5 = testSubject0.visit(_OWLDatatype);
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFrom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedDataRestriction.class
                .isAssignableFrom(OWLDataSomeValuesFrom.class));
    }

    public void verifyInterfaceOWLDataSomeValuesFrom() throws Exception {
        OWLDataSomeValuesFrom testSubject0 = mock(OWLDataSomeValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDatatype() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataRange.class
                .isAssignableFrom(OWLDatatype.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalEntity.class
                .isAssignableFrom(OWLDatatype.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNamedObject.class
                .isAssignableFrom(OWLDatatype.class));
    }

    public void verifyInterfaceOWLDatatype() throws Exception {
        OWLDatatype testSubject0 = mock(OWLDatatype.class);
        boolean result0 = testSubject0.isString();
        org.semanticweb.owlapi.vocab.OWL2Datatype result1 = testSubject0
                .getBuiltInDatatype();
        boolean result2 = testSubject0.isRDFPlainLiteral();
        boolean result3 = testSubject0.isInteger();
        boolean result4 = testSubject0.isBoolean();
        boolean result5 = testSubject0.isDouble();
        boolean result6 = testSubject0.isFloat();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result7 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result8 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result9 = testSubject0.isDatatype();
        boolean result10 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result11 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result12 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result25 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result26 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result27 = testSubject0.isType(_EntityType);
        OWLObject result28 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result29 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result30 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result31 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result32 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result33 = testSubject0
                .getEntityType();
        OWLObject result34 = testSubject0.getOWLEntity(_EntityType52);
        boolean result35 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result36 = testSubject0.asOWLClass();
        boolean result37 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result38 = testSubject0
                .asOWLObjectProperty();
        boolean result39 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result40 = testSubject0
                .asOWLDataProperty();
        boolean result41 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result42 = testSubject0
                .asOWLNamedIndividual();
        boolean result43 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result44 = testSubject0.asOWLDatatype();
        boolean result45 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result46 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result47 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result48 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLDatatypeDefinitionAxiom.class));
    }

    public void verifyInterfaceOWLDatatypeDefinitionAxiom() throws Exception {
        OWLDatatypeDefinitionAxiom testSubject0 = mock(OWLDatatypeDefinitionAxiom.class);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getDataRange();
        org.semanticweb.owlapi.model.OWLDatatype result2 = testSubject0.getDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataRange.class
                .isAssignableFrom(OWLDatatypeRestriction.class));
    }

    public void verifyInterfaceOWLDatatypeRestriction() throws Exception {
        OWLDatatypeRestriction testSubject0 = mock(OWLDatatypeRestriction.class);
        org.semanticweb.owlapi.model.OWLDatatype result0 = testSubject0.getDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> result1 = testSubject0
                .getFacetRestrictions();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result6 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result7 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result8 = testSubject0
                .getSignature();
        OWLObject result9 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result19 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataUnionOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryDataRange.class
                .isAssignableFrom(OWLDataUnionOf.class));
    }

    public void verifyInterfaceOWLDataUnionOf() throws Exception {
        OWLDataUnionOf testSubject0 = mock(OWLDataUnionOf.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result0 = testSubject0
                .getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataVisitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataRangeVisitor.class
                .isAssignableFrom(OWLDataVisitor.class));
    }

    public void verifyInterfaceOWLDataVisitor() throws Exception {
        OWLDataVisitor testSubject0 = mock(OWLDataVisitor.class);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatype);
    }

    

    public void verifyInterfaceOWLDataVisitorEx() throws Exception {
        OWLDataVisitorEx<OWLObject> testSubject0 = mock(OWLDataVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result1 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result2 = testSubject0.visit(_OWLLiteral);
        OWLObject result3 = testSubject0.visit(_OWLFacetRestriction);
        OWLObject result4 = testSubject0.visit(_OWLDatatype);
        OWLObject result5 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result6 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result7 = testSubject0.visit(_OWLDataIntersectionOf);
    }

    @Test
    public void enforceInterfacesOWLDeclarationAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiom.class
                .isAssignableFrom(OWLDeclarationAxiom.class));
    }

    public void verifyInterfaceOWLDeclarationAxiom() throws Exception {
        OWLDeclarationAxiom testSubject0 = mock(OWLDeclarationAxiom.class);
        org.semanticweb.owlapi.model.OWLDeclarationAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLEntity result1 = testSubject0.getEntity();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryIndividualAxiom.class
                .isAssignableFrom(OWLDifferentIndividualsAxiom.class));
    }

    public void verifyInterfaceOWLDifferentIndividualsAxiom() throws Exception {
        OWLDifferentIndividualsAxiom testSubject0 = mock(OWLDifferentIndividualsAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result0 = testSubject0
                .asPairwiseAxioms();
        boolean result1 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result3 = testSubject0
                .getIndividuals();
        java.util.List<org.semanticweb.owlapi.model.OWLIndividual> result4 = testSubject0
                .getIndividualsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result30 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryClassAxiom.class
                .isAssignableFrom(OWLDisjointClassesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointClassesAxiom() throws Exception {
        OWLDisjointClassesAxiom testSubject0 = mock(OWLDisjointClassesAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result0 = testSubject0
                .asPairwiseAxioms();
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result1 = testSubject0
                .getAxiomWithoutAnnotations();
        boolean result2 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getClassExpressions();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getClassExpressionsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result5 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result7 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result31 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryPropertyAxiom.class
                .isAssignableFrom(OWLDisjointDataPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAxiom.class
                .isAssignableFrom(OWLDisjointDataPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointDataPropertiesAxiom() throws Exception {
        OWLDisjointDataPropertiesAxiom testSubject0 = mock(OWLDisjointDataPropertiesAxiom.class);
        org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<OWLDataPropertyExpression> result1 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result2 = testSubject0
                .getPropertiesMinus(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryPropertyAxiom.class
                .isAssignableFrom(OWLDisjointObjectPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLDisjointObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointObjectPropertiesAxiom() throws Exception {
        OWLDisjointObjectPropertiesAxiom testSubject0 = mock(OWLDisjointObjectPropertiesAxiom.class);
        org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        Set<OWLObjectPropertyExpression> result1 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result2 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassAxiom.class
                .isAssignableFrom(OWLDisjointUnionAxiom.class));
    }

    public void verifyInterfaceOWLDisjointUnionAxiom() throws Exception {
        OWLDisjointUnionAxiom testSubject0 = mock(OWLDisjointUnionAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getClassExpressions();
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result1 = testSubject0
                .getOWLEquivalentClassesAxiom();
        org.semanticweb.owlapi.model.OWLDisjointClassesAxiom result2 = testSubject0
                .getOWLDisjointClassesAxiom();
        org.semanticweb.owlapi.model.OWLClass result3 = testSubject0.getOWLClass();
        org.semanticweb.owlapi.model.OWLDisjointUnionAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLEntity() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLEntity.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNamedObject.class
                .isAssignableFrom(OWLEntity.class));
    }

    public void verifyInterfaceOWLEntity() throws Exception {
        OWLEntity testSubject0 = mock(OWLEntity.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result2 = testSubject0.isType(_EntityType);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result4 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result5 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result6 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result7 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result8 = testSubject0.getEntityType();
        OWLObject result9 = testSubject0.getOWLEntity(_EntityType52);
        boolean result10 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result13 = testSubject0
                .asOWLObjectProperty();
        boolean result14 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result15 = testSubject0
                .asOWLDataProperty();
        boolean result16 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result17 = testSubject0
                .asOWLNamedIndividual();
        boolean result18 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result19 = testSubject0.asOWLDatatype();
        boolean result20 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result21 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result22 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result34 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result35 = testSubject0.getIRI();
    }

    

    public void verifyInterfaceOWLEntityVisitor() throws Exception {
        OWLEntityVisitor testSubject0 = mock(OWLEntityVisitor.class);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
    }

    

    public void verifyInterfaceOWLEntityVisitorEx() throws Exception {
        OWLEntityVisitorEx<OWLObject> testSubject0 = mock(OWLEntityVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result1 = testSubject0.visit(_OWLDatatype);
        OWLObject result2 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result3 = testSubject0.visit(_OWLDataProperty);
        OWLObject result4 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result5 = testSubject0.visit(_OWLClass);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryClassAxiom.class
                .isAssignableFrom(OWLEquivalentClassesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentClassesAxiom() throws Exception {
        OWLEquivalentClassesAxiom testSubject0 = mock(OWLEquivalentClassesAxiom.class);
        boolean result0 = testSubject0.containsOWLThing();
        boolean result1 = testSubject0.containsOWLNothing();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getNamedClasses();
        boolean result3 = testSubject0.containsNamedEquivalentClass();
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result4 = testSubject0
                .asPairwiseAxioms();
        org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        boolean result6 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result7 = testSubject0
                .getClassExpressions();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getClassExpressionsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result9 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result10 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result11 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result12 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result16 = testSubject0.isLogicalAxiom();
        boolean result17 = testSubject0.isAnnotationAxiom();
        boolean result18 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result19 = testSubject0.getAxiomType();
        boolean result20 = testSubject0.isOfType(_Set40);
        boolean result21 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result22 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result34 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result35 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryPropertyAxiom.class
                .isAssignableFrom(OWLEquivalentDataPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAxiom.class
                .isAssignableFrom(OWLEquivalentDataPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentDataPropertiesAxiom() throws Exception {
        OWLEquivalentDataPropertiesAxiom testSubject0 = mock(OWLEquivalentDataPropertiesAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result0 = testSubject0
                .asSubDataPropertyOfAxioms();
        org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom result1 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<OWLDataPropertyExpression> result2 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result3 = testSubject0
                .getPropertiesMinus(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryPropertyAxiom.class
                .isAssignableFrom(OWLEquivalentObjectPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLEquivalentObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentObjectPropertiesAxiom() throws Exception {
        OWLEquivalentObjectPropertiesAxiom testSubject0 = mock(OWLEquivalentObjectPropertiesAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result0 = testSubject0
                .asSubObjectPropertyOfAxioms();
        org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom result1 = testSubject0
                .getAxiomWithoutAnnotations();
        Set<OWLObjectPropertyExpression> result2 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result3 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLException() throws Exception {
        assertTrue(java.lang.Exception.class.isAssignableFrom(OWLException.class));
    }

    public void verifyOWLException() throws Exception {
        OWLException testSubject0 = new OWLException(_Throwable);
        OWLException testSubject1 = new OWLException(_String, _Throwable);
        OWLException testSubject2 = new OWLException(_String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLFacetRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLFacetRestriction.class));
    }

    public void verifyInterfaceOWLFacetRestriction() throws Exception {
        OWLFacetRestriction testSubject0 = mock(OWLFacetRestriction.class);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        org.semanticweb.owlapi.model.OWLLiteral result1 = testSubject0.getFacetValue();
        org.semanticweb.owlapi.vocab.OWLFacet result2 = testSubject0.getFacet();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature();
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result5 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result6 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result7 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result8 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result9 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result10 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .getNestedClassExpressions();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        int result14 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLFunctionalDataPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLFunctionalDataPropertyAxiom.class));
    }

    public void verifyInterfaceOWLFunctionalDataPropertyAxiom() throws Exception {
        OWLFunctionalDataPropertyAxiom testSubject0 = mock(OWLFunctionalDataPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLPropertyExpression result26 = testSubject0.getProperty();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLFunctionalObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLFunctionalObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLFunctionalObjectPropertyAxiom() throws Exception {
        OWLFunctionalObjectPropertyAxiom testSubject0 = mock(OWLFunctionalObjectPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLHasKeyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLHasKeyAxiom.class));
    }

    public void verifyInterfaceOWLHasKeyAxiom() throws Exception {
        OWLHasKeyAxiom testSubject0 = mock(OWLHasKeyAxiom.class);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getClassExpression();
        java.util.Set<org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>> result1 = testSubject0
                .getPropertyExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result2 = testSubject0
                .getObjectPropertyExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyExpression> result3 = testSubject0
                .getDataPropertyExpressions();
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLHasValueRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRestriction.class
                .isAssignableFrom(OWLHasValueRestriction.class));
    }

    public void verifyInterfaceOWLHasValueRestriction() throws Exception {
        OWLHasValueRestriction testSubject0 = mock(OWLHasValueRestriction.class);
        OWLObject result0 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .asSomeValuesFrom();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result6 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result7 = testSubject0
                .getClassExpressionType();
        boolean result8 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLImportsDeclaration() throws Exception {
        assertTrue(java.lang.Comparable.class
                .isAssignableFrom(OWLImportsDeclaration.class));
    }

    public void verifyInterfaceOWLImportsDeclaration() throws Exception {
        OWLImportsDeclaration testSubject0 = mock(OWLImportsDeclaration.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getIRI();
        java.net.URI result1 = testSubject0.getURI();
        int result2 = testSubject0.compareTo(mock(OWLImportsDeclaration.class));
    }

    @Test
    public void enforceInterfacesOWLIndividual() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLIndividual.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionObject.class
                .isAssignableFrom(OWLIndividual.class));
    }

    public void verifyInterfaceOWLIndividual() throws Exception {
        OWLIndividual testSubject0 = mock(OWLIndividual.class);
        OWLObject result0 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result1 = testSubject0.isNamed();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result2 = testSubject0
                .asOWLAnonymousIndividual();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getTypes(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getTypes(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result5 = testSubject0
                .getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result6 = testSubject0
                .getObjectPropertyValues(_OWLOntology);
        boolean result7 = testSubject0.hasObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result8 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression,
                _OWLLiteral, _OWLOntology);
        boolean result9 = testSubject0.hasNegativeObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result10 = testSubject0
                .getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result11 = testSubject0
                .getDataPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result12 = testSubject0
                .getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result13 = testSubject0
                .getNegativeDataPropertyValues(_OWLOntology);
        boolean result14 = testSubject0.hasNegativeDataPropertyValue(
                _OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result15 = testSubject0
                .getSameIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result16 = testSubject0
                .getDifferentIndividuals(_OWLOntology);
        boolean result17 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLNamedIndividual result18 = testSubject0
                .asOWLNamedIndividual();
        java.lang.String result19 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result31 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLIndividualAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLIndividualAxiom.class));
    }

    public void verifyInterfaceOWLIndividualAxiom() throws Exception {
        OWLIndividualAxiom testSubject0 = mock(OWLIndividualAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLIndividualVisitor() throws Exception {
        OWLIndividualVisitor testSubject0 = mock(OWLIndividualVisitor.class);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
    }

    

    public void verifyInterfaceOWLIndividualVisitorEx() throws Exception {
        OWLIndividualVisitorEx<OWLObject> testSubject0 = mock(OWLIndividualVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result1 = testSubject0.visit(_OWLAnonymousIndividual);
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLInverseFunctionalObjectPropertyAxiom() throws Exception {
        OWLInverseFunctionalObjectPropertyAxiom testSubject0 = mock(OWLInverseFunctionalObjectPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryPropertyAxiom.class
                .isAssignableFrom(OWLInverseObjectPropertiesAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLInverseObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLInverseObjectPropertiesAxiom() throws Exception {
        OWLInverseObjectPropertiesAxiom testSubject0 = mock(OWLInverseObjectPropertiesAxiom.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getSecondProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result1 = testSubject0
                .asSubObjectPropertyOfAxioms();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result2 = testSubject0
                .getFirstProperty();
        org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<OWLObjectPropertyExpression> result4 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result5 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result7 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLIrreflexiveObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLIrreflexiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLIrreflexiveObjectPropertyAxiom() throws Exception {
        OWLIrreflexiveObjectPropertyAxiom testSubject0 = mock(OWLIrreflexiveObjectPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLLiteral() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLLiteral.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationObject.class
                .isAssignableFrom(OWLLiteral.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationValue.class
                .isAssignableFrom(OWLLiteral.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionObject.class
                .isAssignableFrom(OWLLiteral.class));
    }

    public void verifyInterfaceOWLLiteral() throws Exception {
        OWLLiteral testSubject0 = mock(OWLLiteral.class);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        java.lang.String result4 = testSubject0.getLiteral();
        boolean result5 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.getDatatype();
        boolean result7 = testSubject0.hasLang();
        boolean result8 = testSubject0.hasLang(_String);
        java.lang.String result9 = testSubject0.getLang();
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result27 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
    }

    @Test
    public void enforceInterfacesOWLLogicalAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiom.class
                .isAssignableFrom(OWLLogicalAxiom.class));
    }

    public void verifyInterfaceOWLLogicalAxiom() throws Exception {
        OWLLogicalAxiom testSubject0 = mock(OWLLogicalAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLLogicalAxiomVisitor() throws Exception {
        OWLLogicalAxiomVisitor testSubject0 = mock(OWLLogicalAxiomVisitor.class);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
    }

    

    public void verifyInterfaceOWLLogicalAxiomVisitorEx() throws Exception {
        OWLLogicalAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLLogicalAxiomVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result1 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result2 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result3 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result4 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result5 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result6 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result7 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result8 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result9 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result10 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result11 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result12 = testSubject0.visit(_SWRLRule);
        OWLObject result13 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result14 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result15 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result16 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result17 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result18 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result19 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result20 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result21 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result22 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result23 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result24 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result25 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result26 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result27 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result28 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result29 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result30 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result31 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result32 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLLogicalEntity() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLEntity.class
                .isAssignableFrom(OWLLogicalEntity.class));
    }

    public void verifyInterfaceOWLLogicalEntity() throws Exception {
        OWLLogicalEntity testSubject0 = mock(OWLLogicalEntity.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result2 = testSubject0.isType(_EntityType);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result4 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result5 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result6 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result7 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result8 = testSubject0.getEntityType();
        OWLObject result9 = testSubject0.getOWLEntity(_EntityType52);
        boolean result10 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result13 = testSubject0
                .asOWLObjectProperty();
        boolean result14 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result15 = testSubject0
                .asOWLDataProperty();
        boolean result16 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result17 = testSubject0
                .asOWLNamedIndividual();
        boolean result18 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result19 = testSubject0.asOWLDatatype();
        boolean result20 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result21 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result22 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result23 = testSubject0
                .getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result34 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result35 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLMutableOntology() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntology.class
                .isAssignableFrom(OWLMutableOntology.class));
    }

    public void verifyInterfaceOWLMutableOntology() throws Exception {
        OWLMutableOntology testSubject0 = mock(OWLMutableOntology.class);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .applyChanges(_List163);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result1 = testSubject0
                .applyChange(_OWLOntologyChange);
        boolean result2 = testSubject0.isEmpty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result4 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature(_boolean);
        org.semanticweb.owlapi.model.OWLOntologyID result6 = testSubject0.getOntologyID();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result7 = testSubject0
                .getClassesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result8 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result9 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result10 = testSubject0
                .getDataPropertiesInSignature(_boolean);
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
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result24 = testSubject0
                .getAxioms(_OWLClass);
        java.util.Set<T> result25 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result26 = testSubject0
                .getAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyAxiom> result27 = testSubject0
                .getAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividualAxiom> result28 = testSubject0
                .getAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAxiom> result29 = testSubject0
                .getAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom> result30 = testSubject0
                .getAxioms(_OWLDatatype);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyAxiom> result31 = testSubject0
                .getAxioms(_OWLObjectPropertyExpression);
        java.util.Set<T> result32 = testSubject0.getAxioms(_AxiomType, _boolean);
        int result33 = testSubject0.getAxiomCount();
        int result34 = testSubject0.getAxiomCount(_AxiomType, _boolean);
        int result35 = testSubject0.getAxiomCount(_AxiomType);
        java.util.Set<org.semanticweb.owlapi.model.OWLLogicalAxiom> result36 = testSubject0
                .getLogicalAxioms();
        int result37 = testSubject0.getLogicalAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result38 = testSubject0
                .getTBoxAxioms(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result39 = testSubject0
                .getABoxAxioms(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result40 = testSubject0
                .getRBoxAxioms(_boolean);
        boolean result41 = testSubject0.containsAxiom(_OWLAxiom);
        boolean result42 = testSubject0.containsAxiom(_OWLAxiom, _boolean);
        boolean result43 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom,
                _boolean);
        boolean result44 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result45 = testSubject0
                .getAxiomsIgnoreAnnotations(_OWLAxiom, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result46 = testSubject0
                .getAxiomsIgnoreAnnotations(_OWLAxiom);
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
        boolean result53 = testSubject0.containsEntityInSignature(_IRI, _boolean);
        boolean result54 = testSubject0.containsEntityInSignature(_IRI);
        boolean result55 = testSubject0.containsEntityInSignature(_OWLEntity, _boolean);
        boolean result56 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result57 = testSubject0.isDeclared(_OWLEntity);
        boolean result58 = testSubject0.isDeclared(_OWLEntity, _boolean);
        boolean result59 = testSubject0.containsClassInSignature(_IRI, _boolean);
        boolean result60 = testSubject0.containsClassInSignature(_IRI);
        boolean result61 = testSubject0.containsObjectPropertyInSignature(_IRI, _boolean);
        boolean result62 = testSubject0.containsObjectPropertyInSignature(_IRI);
        boolean result63 = testSubject0.containsDataPropertyInSignature(_IRI);
        boolean result64 = testSubject0.containsDataPropertyInSignature(_IRI, _boolean);
        boolean result65 = testSubject0.containsAnnotationPropertyInSignature(_IRI,
                _boolean);
        boolean result66 = testSubject0.containsAnnotationPropertyInSignature(_IRI);
        boolean result67 = testSubject0.containsIndividualInSignature(_IRI);
        boolean result68 = testSubject0.containsIndividualInSignature(_IRI, _boolean);
        boolean result69 = testSubject0.containsDatatypeInSignature(_IRI);
        boolean result70 = testSubject0.containsDatatypeInSignature(_IRI, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result71 = testSubject0
                .getEntitiesInSignature(_IRI, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result72 = testSubject0
                .getEntitiesInSignature(_IRI);
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
                .getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result106 = testSubject0
                .getClassAssertionAxioms(_OWLIndividual);
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
        OWLObject result114 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result115 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result116 = testSubject0
                .getNestedClassExpressions();
        boolean result117 = testSubject0.isTopEntity();
        boolean result118 = testSubject0.isBottomEntity();
        int result119 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNamedIndividual() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLIndividual.class
                .isAssignableFrom(OWLNamedIndividual.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalEntity.class
                .isAssignableFrom(OWLNamedIndividual.class));
    }

    public void verifyInterfaceOWLNamedIndividual() throws Exception {
        OWLNamedIndividual testSubject0 = mock(OWLNamedIndividual.class);
        OWLObject result0 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result1 = testSubject0.isNamed();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result2 = testSubject0
                .asOWLAnonymousIndividual();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getTypes(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getTypes(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result5 = testSubject0
                .getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result6 = testSubject0
                .getObjectPropertyValues(_OWLOntology);
        boolean result7 = testSubject0.hasObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result8 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression,
                _OWLLiteral, _OWLOntology);
        boolean result9 = testSubject0.hasNegativeObjectPropertyValue(
                _OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLIndividual>> result10 = testSubject0
                .getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result11 = testSubject0
                .getDataPropertyValues(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result12 = testSubject0
                .getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLLiteral>> result13 = testSubject0
                .getNegativeDataPropertyValues(_OWLOntology);
        boolean result14 = testSubject0.hasNegativeDataPropertyValue(
                _OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result15 = testSubject0
                .getSameIndividuals(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result16 = testSubject0
                .getDifferentIndividuals(_OWLOntology);
        boolean result17 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLNamedIndividual result18 = testSubject0
                .asOWLNamedIndividual();
        java.lang.String result19 = testSubject0.toStringID();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result31 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result32 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result33 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result34 = testSubject0.isType(_EntityType);
        OWLObject result35 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result36 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result37 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result38 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result39 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result40 = testSubject0
                .getEntityType();
        OWLObject result41 = testSubject0.getOWLEntity(_EntityType52);
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
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result55 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLNamedObject() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLNamedObject.class));
    }

    public void verifyInterfaceOWLNamedObject() throws Exception {
        OWLNamedObject testSubject0 = mock(OWLNamedObject.class);
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getIRI();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLNamedObjectVisitor() throws Exception {
        OWLNamedObjectVisitor testSubject0 = mock(OWLNamedObjectVisitor.class);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
    }

    

    public void verifyInterfaceOWLNamedObjectVisitorEx() throws Exception {
        OWLNamedObjectVisitorEx<OWLObject> testSubject0 = mock(OWLNamedObjectVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result1 = testSubject0.visit(_OWLOntology);
        OWLObject result2 = testSubject0.visit(_OWLDatatype);
        OWLObject result3 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result4 = testSubject0.visit(_OWLDataProperty);
        OWLObject result5 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result6 = testSubject0.visit(_OWLClass);
    }

    @Test
    public void enforceInterfacesOWLNaryAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiom.class
                .isAssignableFrom(OWLNaryAxiom.class));
    }

    public void verifyInterfaceOWLNaryAxiom() throws Exception {
        OWLNaryAxiom testSubject0 = mock(OWLNaryAxiom.class);
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLNaryAxiom> result0 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNaryBooleanClassExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLBooleanClassExpression.class
                .isAssignableFrom(OWLNaryBooleanClassExpression.class));
    }

    public void verifyInterfaceOWLNaryBooleanClassExpression() throws Exception {
        OWLNaryBooleanClassExpression testSubject0 = mock(OWLNaryBooleanClassExpression.class);
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getOperandsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getOperands();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result4 = testSubject0
                .getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNaryClassAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassAxiom.class
                .isAssignableFrom(OWLNaryClassAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryAxiom.class
                .isAssignableFrom(OWLNaryClassAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomSetShortCut.class
                .isAssignableFrom(OWLNaryClassAxiom.class));
    }

    public void verifyInterfaceOWLNaryClassAxiom() throws Exception {
        OWLNaryClassAxiom testSubject0 = mock(OWLNaryClassAxiom.class);
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getClassExpressions();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getClassExpressionsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result3 = testSubject0
                .getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLNaryAxiom> result29 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result30 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryDataRange() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLDataRange.class
                .isAssignableFrom(OWLNaryDataRange.class));
    }

    public void verifyInterfaceOWLNaryDataRange() throws Exception {
        OWLNaryDataRange testSubject0 = mock(OWLNaryDataRange.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result0 = testSubject0
                .getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        org.semanticweb.owlapi.model.DataRangeType result5 = testSubject0
                .getDataRangeType();
        org.semanticweb.owlapi.model.OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNaryIndividualAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLIndividualAxiom.class
                .isAssignableFrom(OWLNaryIndividualAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNaryAxiom.class
                .isAssignableFrom(OWLNaryIndividualAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomSetShortCut.class
                .isAssignableFrom(OWLNaryIndividualAxiom.class));
    }

    public void verifyInterfaceOWLNaryIndividualAxiom() throws Exception {
        OWLNaryIndividualAxiom testSubject0 = mock(OWLNaryIndividualAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result0 = testSubject0
                .getIndividuals();
        java.util.List<org.semanticweb.owlapi.model.OWLIndividual> result1 = testSubject0
                .getIndividualsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLNaryAxiom> result27 = testSubject0
                .asPairwiseAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result28 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAxiom.class
                .isAssignableFrom(OWLNaryPropertyAxiom.class));
    }

    public void verifyInterfaceOWLNaryPropertyAxiom() throws Exception {
        OWLNaryPropertyAxiom testSubject0 = mock(OWLNaryPropertyAxiom.class);
        java.util.Set<OWLObjectPropertyExpression> result0 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0
                .getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionAxiom.class
                .isAssignableFrom(OWLNegativeDataPropertyAssertionAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLNegativeDataPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLNegativeDataPropertyAssertionAxiom() throws Exception {
        OWLNegativeDataPropertyAssertionAxiom testSubject0 = mock(OWLNegativeDataPropertyAssertionAxiom.class);
        boolean result0 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom result1 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        OWLObject result3 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result4 = testSubject0.getSubject();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result30 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiom()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionAxiom.class
                .isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLNegativeObjectPropertyAssertionAxiom() throws Exception {
        OWLNegativeObjectPropertyAssertionAxiom testSubject0 = mock(OWLNegativeObjectPropertyAssertionAxiom.class);
        boolean result0 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom result1 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        OWLObject result3 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result4 = testSubject0.getSubject();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result30 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObject() throws Exception {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(OWLObject.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObject.class));
    }

    public void verifyInterfaceOWLObject() throws Exception {
        OWLObject testSubject0 = mock(OWLObject.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result3 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result4 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result5 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result6 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result7 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFrom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedObjectRestriction.class
                .isAssignableFrom(OWLObjectAllValuesFrom.class));
    }

    public void verifyInterfaceOWLObjectAllValuesFrom() throws Exception {
        OWLObjectAllValuesFrom testSubject0 = mock(OWLObjectAllValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectCardinalityRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLCardinalityRestriction.class
                .isAssignableFrom(OWLObjectCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLObjectCardinalityRestriction() throws Exception {
        OWLObjectCardinalityRestriction testSubject0 = mock(OWLObjectCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLObjectPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLBooleanClassExpression.class
                .isAssignableFrom(OWLObjectComplementOf.class));
    }

    public void verifyInterfaceOWLObjectComplementOf() throws Exception {
        OWLObjectComplementOf testSubject0 = mock(OWLObjectComplementOf.class);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOperand();
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result2 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result3 = testSubject0
                .getClassExpressionType();
        boolean result4 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinality() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction.class
                .isAssignableFrom(OWLObjectExactCardinality.class));
    }

    public void verifyInterfaceOWLObjectExactCardinality() throws Exception {
        OWLObjectExactCardinality testSubject0 = mock(OWLObjectExactCardinality.class);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .asIntersectionOfMinMax();
        int result1 = testSubject0.getCardinality();
        boolean result2 = testSubject0.isQualified();
        OWLPropertyRange result3 = testSubject0.getFiller();
        OWLObjectPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        OWLObject result7 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result8 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result9 = testSubject0
                .getClassExpressionType();
        boolean result10 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result31 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectHasSelf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRestriction.class
                .isAssignableFrom(OWLObjectHasSelf.class));
    }

    public void verifyInterfaceOWLObjectHasSelf() throws Exception {
        OWLObjectHasSelf testSubject0 = mock(OWLObjectHasSelf.class);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result5 = testSubject0
                .getClassExpressionType();
        boolean result6 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectHasValue() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLHasValueRestriction.class
                .isAssignableFrom(OWLObjectHasValue.class));
    }

    public void verifyInterfaceOWLObjectHasValue() throws Exception {
        OWLObjectHasValue testSubject0 = mock(OWLObjectHasValue.class);
        OWLIndividual result0 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .asSomeValuesFrom();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result6 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result7 = testSubject0
                .getClassExpressionType();
        boolean result8 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryBooleanClassExpression.class
                .isAssignableFrom(OWLObjectIntersectionOf.class));
    }

    public void verifyInterfaceOWLObjectIntersectionOf() throws Exception {
        OWLObjectIntersectionOf testSubject0 = mock(OWLObjectIntersectionOf.class);
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getOperandsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getOperands();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result4 = testSubject0
                .getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectInverseOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyExpression.class
                .isAssignableFrom(OWLObjectInverseOf.class));
    }

    public void verifyInterfaceOWLObjectInverseOf() throws Exception {
        OWLObjectInverseOf testSubject0 = mock(OWLObjectInverseOf.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getInverse();
        org.semanticweb.owlapi.model.OWLObjectProperty result1 = testSubject0
                .asOWLObjectProperty();
        boolean result2 = testSubject0.isTransitive(_OWLOntology);
        boolean result3 = testSubject0.isTransitive(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result4 = testSubject0
                .getInverses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result5 = testSubject0
                .getInverses(_OWLOntology);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result6 = testSubject0
                .getInverseProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result7 = testSubject0
                .getSimplified();
        boolean result8 = testSubject0.isSymmetric(_OWLOntology);
        boolean result9 = testSubject0.isSymmetric(_Set48);
        boolean result10 = testSubject0.isInverseFunctional(_Set48);
        boolean result11 = testSubject0.isInverseFunctional(_OWLOntology);
        org.semanticweb.owlapi.model.OWLObjectProperty result12 = testSubject0
                .getNamedProperty();
        boolean result13 = testSubject0.isAsymmetric(_Set48);
        boolean result14 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result15 = testSubject0.isReflexive(_OWLOntology);
        boolean result16 = testSubject0.isReflexive(_Set48);
        boolean result17 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result18 = testSubject0.isIrreflexive(_Set48);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result19 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result21 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLClassExpression> result22 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLClassExpression> result23 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result24 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result25 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result26 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result27 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result28 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result29 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result30 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result31 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result32 = testSubject0.isFunctional(_OWLOntology);
        boolean result33 = testSubject0.isFunctional(_Set48);
        boolean result34 = testSubject0.isDataPropertyExpression();
        boolean result35 = testSubject0.isObjectPropertyExpression();
        boolean result36 = testSubject0.isOWLTopObjectProperty();
        boolean result37 = testSubject0.isOWLBottomObjectProperty();
        boolean result38 = testSubject0.isOWLTopDataProperty();
        boolean result39 = testSubject0.isOWLBottomDataProperty();
        boolean result40 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result41 = testSubject0
                .getSignature();
        OWLObject result42 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result43 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result44 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result45 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result46 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result47 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result48 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result49 = testSubject0
                .getNestedClassExpressions();
        boolean result50 = testSubject0.isTopEntity();
        boolean result51 = testSubject0.isBottomEntity();
        int result52 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinality() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction.class
                .isAssignableFrom(OWLObjectMaxCardinality.class));
    }

    public void verifyInterfaceOWLObjectMaxCardinality() throws Exception {
        OWLObjectMaxCardinality testSubject0 = mock(OWLObjectMaxCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLObjectPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinality() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction.class
                .isAssignableFrom(OWLObjectMinCardinality.class));
    }

    public void verifyInterfaceOWLObjectMinCardinality() throws Exception {
        OWLObjectMinCardinality testSubject0 = mock(OWLObjectMinCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        OWLObjectPropertyExpression result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result8 = testSubject0
                .getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectOneOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnonymousClassExpression.class
                .isAssignableFrom(OWLObjectOneOf.class));
    }

    public void verifyInterfaceOWLObjectOneOf() throws Exception {
        OWLObjectOneOf testSubject0 = mock(OWLObjectOneOf.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result0 = testSubject0
                .getIndividuals();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .asObjectUnionOf();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result4 = testSubject0
                .getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyExpression.class
                .isAssignableFrom(OWLObjectProperty.class));
        assertTrue(org.semanticweb.owlapi.model.OWLProperty.class
                .isAssignableFrom(OWLObjectProperty.class));
    }

    public void verifyInterfaceOWLObjectProperty() throws Exception {
        OWLObjectProperty testSubject0 = mock(OWLObjectProperty.class);
        org.semanticweb.owlapi.model.OWLObjectProperty result0 = testSubject0
                .asOWLObjectProperty();
        boolean result1 = testSubject0.isTransitive(_OWLOntology);
        boolean result2 = testSubject0.isTransitive(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result3 = testSubject0
                .getInverses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result4 = testSubject0
                .getInverses(_OWLOntology);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result5 = testSubject0
                .getInverseProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result6 = testSubject0
                .getSimplified();
        boolean result7 = testSubject0.isSymmetric(_OWLOntology);
        boolean result8 = testSubject0.isSymmetric(_Set48);
        boolean result9 = testSubject0.isInverseFunctional(_Set48);
        boolean result10 = testSubject0.isInverseFunctional(_OWLOntology);
        org.semanticweb.owlapi.model.OWLObjectProperty result11 = testSubject0
                .getNamedProperty();
        boolean result12 = testSubject0.isAsymmetric(_Set48);
        boolean result13 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result14 = testSubject0.isReflexive(_OWLOntology);
        boolean result15 = testSubject0.isReflexive(_Set48);
        boolean result16 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result17 = testSubject0.isIrreflexive(_Set48);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result18 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result19 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLClassExpression> result21 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLClassExpression> result22 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result23 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result24 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result25 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result26 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result27 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result28 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result29 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result30 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result31 = testSubject0.isFunctional(_OWLOntology);
        boolean result32 = testSubject0.isFunctional(_Set48);
        boolean result33 = testSubject0.isDataPropertyExpression();
        boolean result34 = testSubject0.isObjectPropertyExpression();
        boolean result35 = testSubject0.isOWLTopObjectProperty();
        boolean result36 = testSubject0.isOWLBottomObjectProperty();
        boolean result37 = testSubject0.isOWLTopDataProperty();
        boolean result38 = testSubject0.isOWLBottomDataProperty();
        boolean result39 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result40 = testSubject0
                .getSignature();
        OWLObject result41 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        boolean result49 = testSubject0.isTopEntity();
        boolean result50 = testSubject0.isBottomEntity();
        int result51 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result52 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result53 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result54 = testSubject0.isType(_EntityType);
        OWLObject result55 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result56 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result57 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result58 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result59 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result60 = testSubject0
                .getEntityType();
        OWLObject result61 = testSubject0.getOWLEntity(_EntityType52);
        boolean result62 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result63 = testSubject0.asOWLClass();
        boolean result64 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result65 = testSubject0
                .asOWLObjectProperty();
        boolean result66 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result67 = testSubject0
                .asOWLDataProperty();
        boolean result68 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result69 = testSubject0
                .asOWLNamedIndividual();
        boolean result70 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result71 = testSubject0.asOWLDatatype();
        boolean result72 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result73 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result74 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result75 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAssertionAxiom.class
                .isAssignableFrom(OWLObjectPropertyAssertionAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLObjectPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyAssertionAxiom() throws Exception {
        OWLObjectPropertyAssertionAxiom testSubject0 = mock(OWLObjectPropertyAssertionAxiom.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        boolean result1 = testSubject0.isInSimplifiedForm();
        org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom result2 = testSubject0
                .getSimplified();
        OWLObjectPropertyExpression result3 = testSubject0.getProperty();
        OWLObject result4 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result5 = testSubject0.getSubject();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result7 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result19 = testSubject0
                .getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result30 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result31 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAxiom.class
                .isAssignableFrom(OWLObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyAxiom() throws Exception {
        OWLObjectPropertyAxiom testSubject0 = mock(OWLObjectPropertyAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyCharacteristicAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLObjectPropertyCharacteristicAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLUnaryPropertyAxiom.class
                .isAssignableFrom(OWLObjectPropertyCharacteristicAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyCharacteristicAxiom() throws Exception {
        OWLObjectPropertyCharacteristicAxiom testSubject0 = mock(OWLObjectPropertyCharacteristicAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result25 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyDomainAxiom.class
                .isAssignableFrom(OWLObjectPropertyDomainAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLObjectPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyDomainAxiom() throws Exception {
        OWLObjectPropertyDomainAxiom testSubject0 = mock(OWLObjectPropertyDomainAxiom.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .getDomain();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyExpression.class
                .isAssignableFrom(OWLObjectPropertyExpression.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLPredicate.class
                .isAssignableFrom(OWLObjectPropertyExpression.class));
    }

    public void verifyInterfaceOWLObjectPropertyExpression() throws Exception {
        OWLObjectPropertyExpression testSubject0 = mock(OWLObjectPropertyExpression.class);
        org.semanticweb.owlapi.model.OWLObjectProperty result0 = testSubject0
                .asOWLObjectProperty();
        boolean result1 = testSubject0.isTransitive(_OWLOntology);
        boolean result2 = testSubject0.isTransitive(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result3 = testSubject0
                .getInverses(_Set48);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result4 = testSubject0
                .getInverses(_OWLOntology);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result5 = testSubject0
                .getInverseProperty();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result6 = testSubject0
                .getSimplified();
        boolean result7 = testSubject0.isSymmetric(_OWLOntology);
        boolean result8 = testSubject0.isSymmetric(_Set48);
        boolean result9 = testSubject0.isInverseFunctional(_Set48);
        boolean result10 = testSubject0.isInverseFunctional(_OWLOntology);
        org.semanticweb.owlapi.model.OWLObjectProperty result11 = testSubject0
                .getNamedProperty();
        boolean result12 = testSubject0.isAsymmetric(_Set48);
        boolean result13 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result14 = testSubject0.isReflexive(_OWLOntology);
        boolean result15 = testSubject0.isReflexive(_Set48);
        boolean result16 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result17 = testSubject0.isIrreflexive(_Set48);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result18 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result19 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result20 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLClassExpression> result21 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLClassExpression> result22 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result23 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result24 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result25 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result26 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result27 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result28 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result29 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result30 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result31 = testSubject0.isFunctional(_OWLOntology);
        boolean result32 = testSubject0.isFunctional(_Set48);
        boolean result33 = testSubject0.isDataPropertyExpression();
        boolean result34 = testSubject0.isObjectPropertyExpression();
        boolean result35 = testSubject0.isOWLTopObjectProperty();
        boolean result36 = testSubject0.isOWLBottomObjectProperty();
        boolean result37 = testSubject0.isOWLTopDataProperty();
        boolean result38 = testSubject0.isOWLBottomDataProperty();
        boolean result39 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result40 = testSubject0
                .getSignature();
        OWLObject result41 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        boolean result49 = testSubject0.isTopEntity();
        boolean result50 = testSubject0.isBottomEntity();
        int result51 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyRangeAxiom.class
                .isAssignableFrom(OWLObjectPropertyRangeAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLObjectPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyRangeAxiom() throws Exception {
        OWLObjectPropertyRangeAxiom testSubject0 = mock(OWLObjectPropertyRangeAxiom.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLClassExpression result1 = testSubject0.getRange();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFrom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedObjectRestriction.class
                .isAssignableFrom(OWLObjectSomeValuesFrom.class));
    }

    public void verifyInterfaceOWLObjectSomeValuesFrom() throws Exception {
        OWLObjectSomeValuesFrom testSubject0 = mock(OWLObjectSomeValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOf() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryBooleanClassExpression.class
                .isAssignableFrom(OWLObjectUnionOf.class));
    }

    public void verifyInterfaceOWLObjectUnionOf() throws Exception {
        OWLObjectUnionOf testSubject0 = mock(OWLObjectUnionOf.class);
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result0 = testSubject0
                .getOperandsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getOperands();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result4 = testSubject0
                .getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyExpressionVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiomVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLIndividualVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationValueVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationObjectVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(OWLObjectVisitor.class));
    }

    public void verifyInterfaceOWLObjectVisitor() throws Exception {
        OWLObjectVisitor testSubject0 = mock(OWLObjectVisitor.class);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorEx() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyExpressionVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationObjectVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNamedObjectVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(org.semanticweb.owlapi.model.OWLIndividualVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorEx.class));
    }

    public void verifyInterfaceOWLObjectVisitorEx() throws Exception {
        OWLObjectVisitorEx<OWLObject> testSubject0 = mock(OWLObjectVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result1 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result2 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result3 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result4 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result5 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result6 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result7 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result8 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result9 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result10 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result11 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result12 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result13 = testSubject0.visit(_SWRLRule);
        OWLObject result14 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result15 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result16 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result17 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result18 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result19 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result20 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result21 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result22 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result23 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result24 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result25 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result26 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result27 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result28 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result29 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result30 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result31 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result32 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result33 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result34 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLObject result35 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result36 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result37 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result38 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result39 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLObject result40 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLObject result41 = testSubject0.visit(_OWLObjectOneOf);
        OWLObject result42 = testSubject0.visit(_OWLObjectHasSelf);
        OWLObject result43 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLObject result44 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLObject result45 = testSubject0.visit(_OWLDataExactCardinality);
        OWLObject result46 = testSubject0.visit(_OWLDataMinCardinality);
        OWLObject result47 = testSubject0.visit(_OWLDataHasValue);
        OWLObject result48 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLObject result49 = testSubject0.visit(_OWLObjectComplementOf);
        OWLObject result50 = testSubject0.visit(_OWLObjectUnionOf);
        OWLObject result51 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLObject result52 = testSubject0.visit(_OWLClass);
        OWLObject result53 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLObject result54 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLObject result55 = testSubject0.visit(_OWLObjectHasValue);
        OWLObject result56 = testSubject0.visit(_OWLObjectAllValuesFrom);
        OWLObject result57 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result58 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result59 = testSubject0.visit(_OWLLiteral);
        OWLObject result60 = testSubject0.visit(_OWLFacetRestriction);
        OWLObject result61 = testSubject0.visit(_OWLDatatype);
        OWLObject result62 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result63 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result64 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLObject result65 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result66 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result67 = testSubject0.visit(_OWLDataProperty);
        OWLObject result68 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result69 = testSubject0.visit(_OWLDatatype);
        OWLObject result70 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result71 = testSubject0.visit(_OWLDataProperty);
        OWLObject result72 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result73 = testSubject0.visit(_OWLClass);
        OWLObject result74 = testSubject0.visit(_OWLAnnotation);
        OWLObject result75 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result76 = testSubject0.visit(_IRI);
        OWLObject result77 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result78 = testSubject0.visit(_OWLLiteral);
        OWLObject result79 = testSubject0.visit(_SWRLBuiltInAtom);
        OWLObject result80 = testSubject0.visit(_SWRLVariable);
        OWLObject result81 = testSubject0.visit(_SWRLIndividualArgument);
        OWLObject result82 = testSubject0.visit(_SWRLLiteralArgument);
        OWLObject result83 = testSubject0.visit(_SWRLSameIndividualAtom);
        OWLObject result84 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        OWLObject result85 = testSubject0.visit(_SWRLRule);
        OWLObject result86 = testSubject0.visit(_SWRLClassAtom);
        OWLObject result87 = testSubject0.visit(_SWRLDataRangeAtom);
        OWLObject result88 = testSubject0.visit(_SWRLObjectPropertyAtom);
        OWLObject result89 = testSubject0.visit(_SWRLDataPropertyAtom);
        OWLObject result90 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result91 = testSubject0.visit(_OWLOntology);
        OWLObject result92 = testSubject0.visit(_OWLDatatype);
        OWLObject result93 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result94 = testSubject0.visit(_OWLDataProperty);
        OWLObject result95 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result96 = testSubject0.visit(_OWLClass);
        OWLObject result97 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result98 = testSubject0.visit(_OWLAnonymousIndividual);
    }

    @Test
    public void enforceInterfacesOWLOntology() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLOntology.class));
    }

    public void verifyInterfaceOWLOntology() throws Exception {
        OWLOntology testSubject0 = mock(OWLOntology.class);
        boolean result0 = testSubject0.isEmpty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature(_boolean);
        org.semanticweb.owlapi.model.OWLOntologyID result4 = testSubject0.getOntologyID();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result5 = testSubject0
                .getClassesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result6 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result7 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result8 = testSubject0
                .getDataPropertiesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result9 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result10 = testSubject0
                .getObjectPropertiesInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result11 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result12 = testSubject0
                .getIndividualsInSignature(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result13 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result14 = testSubject0
                .getDatatypesInSignature(_boolean);
        boolean result15 = testSubject0.isAnonymous();
        org.semanticweb.owlapi.model.OWLOntologyManager result16 = testSubject0
                .getOWLOntologyManager();
        java.util.Set<org.semanticweb.owlapi.model.IRI> result17 = testSubject0
                .getDirectImportsDocuments();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result18 = testSubject0
                .getDirectImports();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result19 = testSubject0
                .getImports();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result20 = testSubject0
                .getImportsClosure();
        java.util.Set<org.semanticweb.owlapi.model.OWLImportsDeclaration> result21 = testSubject0
                .getImportsDeclarations();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result22 = testSubject0
                .getAxioms(_OWLClass);
        java.util.Set<T> result23 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result24 = testSubject0
                .getAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyAxiom> result25 = testSubject0
                .getAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividualAxiom> result26 = testSubject0
                .getAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAxiom> result27 = testSubject0
                .getAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom> result28 = testSubject0
                .getAxioms(_OWLDatatype);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyAxiom> result29 = testSubject0
                .getAxioms(_OWLObjectPropertyExpression);
        java.util.Set<T> result30 = testSubject0.getAxioms(_AxiomType, _boolean);
        int result31 = testSubject0.getAxiomCount();
        int result32 = testSubject0.getAxiomCount(_AxiomType, _boolean);
        int result33 = testSubject0.getAxiomCount(_AxiomType);
        java.util.Set<org.semanticweb.owlapi.model.OWLLogicalAxiom> result34 = testSubject0
                .getLogicalAxioms();
        int result35 = testSubject0.getLogicalAxiomCount();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result36 = testSubject0
                .getTBoxAxioms(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result37 = testSubject0
                .getABoxAxioms(_boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result38 = testSubject0
                .getRBoxAxioms(_boolean);
        boolean result39 = testSubject0.containsAxiom(_OWLAxiom);
        boolean result40 = testSubject0.containsAxiom(_OWLAxiom, _boolean);
        boolean result41 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom,
                _boolean);
        boolean result42 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result43 = testSubject0
                .getAxiomsIgnoreAnnotations(_OWLAxiom, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result44 = testSubject0
                .getAxiomsIgnoreAnnotations(_OWLAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAxiom> result45 = testSubject0
                .getGeneralClassAxioms();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result46 = testSubject0
                .getReferencedAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationProperty> result47 = testSubject0
                .getAnnotationPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result48 = testSubject0
                .getReferencingAxioms(_OWLAnonymousIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result49 = testSubject0
                .getReferencingAxioms(_OWLEntity);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result50 = testSubject0
                .getReferencingAxioms(_OWLEntity, _boolean);
        boolean result51 = testSubject0.containsEntityInSignature(_IRI, _boolean);
        boolean result52 = testSubject0.containsEntityInSignature(_IRI);
        boolean result53 = testSubject0.containsEntityInSignature(_OWLEntity, _boolean);
        boolean result54 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result55 = testSubject0.isDeclared(_OWLEntity);
        boolean result56 = testSubject0.isDeclared(_OWLEntity, _boolean);
        boolean result57 = testSubject0.containsClassInSignature(_IRI, _boolean);
        boolean result58 = testSubject0.containsClassInSignature(_IRI);
        boolean result59 = testSubject0.containsObjectPropertyInSignature(_IRI, _boolean);
        boolean result60 = testSubject0.containsObjectPropertyInSignature(_IRI);
        boolean result61 = testSubject0.containsDataPropertyInSignature(_IRI);
        boolean result62 = testSubject0.containsDataPropertyInSignature(_IRI, _boolean);
        boolean result63 = testSubject0.containsAnnotationPropertyInSignature(_IRI,
                _boolean);
        boolean result64 = testSubject0.containsAnnotationPropertyInSignature(_IRI);
        boolean result65 = testSubject0.containsIndividualInSignature(_IRI);
        boolean result66 = testSubject0.containsIndividualInSignature(_IRI, _boolean);
        boolean result67 = testSubject0.containsDatatypeInSignature(_IRI);
        boolean result68 = testSubject0.containsDatatypeInSignature(_IRI, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result69 = testSubject0
                .getEntitiesInSignature(_IRI, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result70 = testSubject0
                .getEntitiesInSignature(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom> result71 = testSubject0
                .getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom> result72 = testSubject0
                .getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom> result73 = testSubject0
                .getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDeclarationAxiom> result74 = testSubject0
                .getDeclarationAxioms(_OWLEntity);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result75 = testSubject0
                .getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result76 = testSubject0
                .getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result77 = testSubject0
                .getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom> result78 = testSubject0
                .getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointClassesAxiom> result79 = testSubject0
                .getDisjointClassesAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointUnionAxiom> result80 = testSubject0
                .getDisjointUnionAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLHasKeyAxiom> result81 = testSubject0
                .getHasKeyAxioms(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result82 = testSubject0
                .getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result83 = testSubject0
                .getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom> result84 = testSubject0
                .getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom> result85 = testSubject0
                .getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom> result86 = testSubject0
                .getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom> result87 = testSubject0
                .getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom> result88 = testSubject0
                .getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom> result89 = testSubject0
                .getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom> result90 = testSubject0
                .getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom> result91 = testSubject0
                .getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom> result92 = testSubject0
                .getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom> result93 = testSubject0
                .getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom> result94 = testSubject0
                .getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom> result95 = testSubject0
                .getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result96 = testSubject0
                .getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom> result97 = testSubject0
                .getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom> result98 = testSubject0
                .getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom> result99 = testSubject0
                .getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom> result100 = testSubject0
                .getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom> result101 = testSubject0
                .getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom> result102 = testSubject0
                .getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result103 = testSubject0
                .getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassAssertionAxiom> result104 = testSubject0
                .getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom> result105 = testSubject0
                .getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom> result106 = testSubject0
                .getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom> result107 = testSubject0
                .getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom> result108 = testSubject0
                .getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result109 = testSubject0
                .getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom> result110 = testSubject0
                .getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom> result111 = testSubject0
                .getDatatypeDefinitions(_OWLDatatype);
        OWLObject result112 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result113 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result114 = testSubject0
                .getNestedClassExpressions();
        boolean result115 = testSubject0.isTopEntity();
        boolean result116 = testSubject0.isBottomEntity();
        int result117 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLOntologyAlreadyExistsException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyCreationException.class
                .isAssignableFrom(OWLOntologyAlreadyExistsException.class));
    }

    public void verifyOWLOntologyAlreadyExistsException() throws Exception {
        OWLOntologyAlreadyExistsException testSubject0 = new OWLOntologyAlreadyExistsException(
                _OWLOntologyID, _IRI, _Throwable);
        OWLOntologyAlreadyExistsException testSubject1 = new OWLOntologyAlreadyExistsException(
                _OWLOntologyID, _Throwable);
        OWLOntologyAlreadyExistsException testSubject2 = new OWLOntologyAlreadyExistsException(
                _OWLOntologyID, _IRI);
        OWLOntologyAlreadyExistsException testSubject3 = new OWLOntologyAlreadyExistsException(
                _OWLOntologyID);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        org.semanticweb.owlapi.model.OWLOntologyID result1 = testSubject0.getOntologyID();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getMessage();
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    

    public void verifyOWLOntologyChange() throws Exception {
        OWLOntologyChange testSubject0 = new OWLOntologyChange(_OWLOntology) {
            @Override
            public boolean isAxiomChange() {
                return false;
            }

            @Override
            public boolean isAddAxiom() {
                return false;
            }

            @Override
            public OWLAxiom getAxiom() {
                return null;
            }

            @Override
            public boolean isImportChange() {
                return false;
            }

            @Override
            public OWLOntologyChangeData getChangeData() {
                return null;
            }

            @Override
            public Set<OWLEntity> getSignature() {
                return null;
            }

            @Override
            public void accept(OWLOntologyChangeVisitor visitor) {}

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result2 = testSubject0.isAxiomChange();
        boolean result3 = testSubject0.isAddAxiom();
        boolean result4 = testSubject0.isRemoveAxiom();
        boolean result5 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result7 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result8 = testSubject0
                .getChangeRecord();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeBroadcastStrategy() throws Exception {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyChangeBroadcastStrategy.class));
    }

    public void verifyInterfaceOWLOntologyChangeBroadcastStrategy() throws Exception {
        OWLOntologyChangeBroadcastStrategy testSubject0 = mock(OWLOntologyChangeBroadcastStrategy.class);
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLOntologyChangeException.class));
    }

    public void verifyOWLOntologyChangeException() throws Exception {
        OWLOntologyChangeException testSubject0 = new OWLOntologyChangeException(
                _OWLOntologyChange, _Throwable);
        OWLOntologyChangeException testSubject1 = new OWLOntologyChangeException(
                _OWLOntologyChange, _String, _Throwable);
        OWLOntologyChangeException testSubject2 = new OWLOntologyChangeException(
                _OWLOntologyChange, _String);
        org.semanticweb.owlapi.model.OWLOntologyChange result0 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLOntologyChangeListener() throws Exception {
        OWLOntologyChangeListener testSubject0 = mock(OWLOntologyChangeListener.class);
        testSubject0.ontologiesChanged(_List);
    }

    

    public void verifyInterfaceOWLOntologyChangeProgressListener() throws Exception {
        OWLOntologyChangeProgressListener testSubject0 = mock(OWLOntologyChangeProgressListener.class);
        testSubject0.end();
        testSubject0.begin(_int);
        testSubject0.appliedChange(_OWLOntologyChange);
    }

    

    public void verifyInterfaceOWLOntologyChangesVetoedListener() throws Exception {
        OWLOntologyChangesVetoedListener testSubject0 = mock(OWLOntologyChangesVetoedListener.class);
        testSubject0.ontologyChangesVetoed(_List, _OWLOntologyChangeVetoException);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVetoException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeException.class
                .isAssignableFrom(OWLOntologyChangeVetoException.class));
    }

    public void verifyOWLOntologyChangeVetoException() throws Exception {
        OWLOntologyChangeVetoException testSubject0 = new OWLOntologyChangeVetoException(
                _OWLOntologyChange, _String);
        OWLOntologyChangeVetoException testSubject1 = new OWLOntologyChangeVetoException(
                _OWLOntologyChange, _String, _Throwable);
        OWLOntologyChangeVetoException testSubject2 = new OWLOntologyChangeVetoException(
                _OWLOntologyChange, _Throwable);
        org.semanticweb.owlapi.model.OWLOntologyChange result0 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLOntologyChangeVisitor() throws Exception {
        OWLOntologyChangeVisitor testSubject0 = mock(OWLOntologyChangeVisitor.class);
        testSubject0.visit(_AddImport);
        testSubject0.visit(_RemoveImport);
        testSubject0.visit(_AddOntologyAnnotation);
        testSubject0.visit(_RemoveOntologyAnnotation);
        testSubject0.visit(_SetOntologyID);
        testSubject0.visit(_RemoveAxiom);
        testSubject0.visit(_AddAxiom);
    }

    

    public void verifyInterfaceOWLOntologyChangeVisitorEx() throws Exception {
        OWLOntologyChangeVisitorEx<OWLObject> testSubject0 = mock(OWLOntologyChangeVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_AddImport);
        OWLObject result1 = testSubject0.visit(_RemoveImport);
        OWLObject result2 = testSubject0.visit(_AddOntologyAnnotation);
        OWLObject result3 = testSubject0.visit(_RemoveOntologyAnnotation);
        OWLObject result4 = testSubject0.visit(_SetOntologyID);
        OWLObject result5 = testSubject0.visit(_RemoveAxiom);
        OWLObject result6 = testSubject0.visit(_AddAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologyCreationException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLException.class
                .isAssignableFrom(OWLOntologyCreationException.class));
    }

    public void verifyOWLOntologyCreationException() throws Exception {
        OWLOntologyCreationException testSubject0 = new OWLOntologyCreationException(
                _Throwable);
        OWLOntologyCreationException testSubject1 = new OWLOntologyCreationException(
                _String, _Throwable);
        OWLOntologyCreationException testSubject2 = new OWLOntologyCreationException(
                _String);
        OWLOntologyCreationException testSubject3 = new OWLOntologyCreationException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyDocumentAlreadyExistsException()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyCreationException.class
                .isAssignableFrom(OWLOntologyDocumentAlreadyExistsException.class));
    }

    public void verifyOWLOntologyDocumentAlreadyExistsException() throws Exception {
        OWLOntologyDocumentAlreadyExistsException testSubject0 = new OWLOntologyDocumentAlreadyExistsException(
                _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getOntologyDocumentIRI();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyFactory() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFactory.class));
    }

    public void verifyInterfaceOWLOntologyFactory() throws Exception {
        OWLOntologyFactory testSubject0 = mock(OWLOntologyFactory.class);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result0 = testSubject0
                .getOWLOntologyManager();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0.loadOWLOntology(
                _OWLOntologyDocumentSource, _OWLOntologyCreationHandler,
                _OWLOntologyLoaderConfiguration);
        boolean result3 = testSubject0.canCreateFromDocumentIRI(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0
                .createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        boolean result5 = testSubject0.canLoad(_OWLOntologyDocumentSource);
    }

    @Test
    public void enforceInterfacesOWLOntologyFactoryNotFoundException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLOntologyFactoryNotFoundException.class));
    }

    public void verifyOWLOntologyFactoryNotFoundException() throws Exception {
        OWLOntologyFactoryNotFoundException testSubject0 = new OWLOntologyFactoryNotFoundException(
                _IRI);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyFormat() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFormat.class));
    }

    public void verifyOWLOntologyFormat() throws Exception {
        OWLOntologyFormat testSubject0 = new OWLOntologyFormat() {};
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result0 = testSubject0.getParameter(_Object, _Object);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result2 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesOWLOntologyID() throws Exception {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(OWLOntologyID.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyID.class));
    }

    public void verifyOWLOntologyID() throws Exception {
        OWLOntologyID testSubject0 = new OWLOntologyID(_IRI, _IRI);
        OWLOntologyID testSubject1 = new OWLOntologyID(_IRI);
        OWLOntologyID testSubject2 = new OWLOntologyID();
        int result0 = testSubject0.compareTo(_OWLOntologyID);
        boolean result2 = testSubject0.isAnonymous();
        boolean result3 = testSubject0.isOWL2DLOntologyID();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getOntologyIRI();
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getVersionIRI();
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getDefaultDocumentIRI();
    }

    

    public void verifyInterfaceOWLOntologyIRIMapper() throws Exception {
        OWLOntologyIRIMapper testSubject0 = mock(OWLOntologyIRIMapper.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyIRIMappingNotFoundException()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLOntologyIRIMappingNotFoundException.class));
    }

    public void verifyOWLOntologyIRIMappingNotFoundException() throws Exception {
        OWLOntologyIRIMappingNotFoundException testSubject0 = new OWLOntologyIRIMappingNotFoundException(
                _IRI);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    

    public void verifyOWLOntologyLoaderConfiguration() throws Exception {
        OWLOntologyLoaderConfiguration testSubject0 = new OWLOntologyLoaderConfiguration();
        boolean result0 = testSubject0.isStrict();
        boolean result1 = testSubject0.isFollowRedirects();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy result2 = testSubject0
                .getMissingOntologyHeaderStrategy();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .setMissingOntologyHeaderStrategy(_MissingOntologyHeaderStrategy);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result4 = testSubject0
                .setLoadAnnotationAxioms(_boolean);
        boolean result5 = testSubject0.isLoadAnnotationAxioms();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .setFollowRedirects(_boolean);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result7 = testSubject0
                .setMissingImportHandlingStrategy(_MissingImportHandlingStrategy);
        org.semanticweb.owlapi.model.MissingImportHandlingStrategy result8 = testSubject0
                .getMissingImportHandlingStrategy();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result9 = testSubject0
                .setStrict(_boolean);
        boolean result10 = testSubject0.isIgnoredImport(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result11 = testSubject0
                .getIgnoredImports();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result12 = testSubject0
                .addIgnoredImport(_IRI);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result13 = testSubject0
                .removeIgnoredImport(_IRI);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result14 = testSubject0
                .clearIgnoredImports();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result15 = testSubject0
                .setReportStackTraces(_boolean);
        boolean result16 = testSubject0.isReportStackTrace();
        testSubject0.setSilentMissingImportsHandling(_boolean);
        boolean result17 = testSubject0.isSilentMissingImportsHandling();
    }

    

    public void verifyInterfaceOWLOntologyLoaderListener() throws Exception {
        OWLOntologyLoaderListener testSubject0 = mock(OWLOntologyLoaderListener.class);
        testSubject0.startedLoadingOntology(_LoadingStartedEvent);
        testSubject0.finishedLoadingOntology(_LoadingFinishedEvent);
    }

    @Test
    public void enforceInterfacesOWLOntologyManager() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologySetProvider.class
                .isAssignableFrom(OWLOntologyManager.class));
    }

    public void verifyInterfaceOWLOntologyManager() throws Exception {
        OWLOntologyManager testSubject0 = mock(OWLOntologyManager.class);
        boolean result0 = testSubject0.contains(_OWLOntologyID);
        boolean result1 = testSubject0.contains(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0.getOntology(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0
                .getOntology(_OWLOntologyID);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result4 = testSubject0
                .getDirectImports(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result5 = testSubject0
                .getImports(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result6 = testSubject0
                .getImportsClosure(_OWLOntology);
        org.semanticweb.owlapi.model.OWLDataFactory result7 = testSubject0
                .getOWLDataFactory();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result8 = testSubject0
                .getOntologies();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result9 = testSubject0
                .getOntologies(_OWLAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result10 = testSubject0
                .getVersions(_IRI);
        boolean result11 = testSubject0.containsVersion(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyID> result12 = testSubject0
                .getOntologyIDsByVersion(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result13 = testSubject0
                .getImportedOntology(_OWLImportsDeclaration);
        java.util.List<org.semanticweb.owlapi.model.OWLOntology> result14 = testSubject0
                .getSortedImportsClosure(_OWLOntology);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result15 = testSubject0
                .applyChanges(_List);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result16 = testSubject0
                .addAxioms(_OWLOntology, _Set194);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result17 = testSubject0
                .addAxiom(_OWLOntology, _OWLAxiom);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result18 = testSubject0
                .removeAxiom(_OWLOntology, _OWLAxiom);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result19 = testSubject0
                .removeAxioms(_OWLOntology, _Set194);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result20 = testSubject0
                .applyChange(_OWLOntologyChange);
        org.semanticweb.owlapi.model.OWLOntology result21 = testSubject0
                .createOntology(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result22 = testSubject0
                .createOntology(_OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntology result23 = testSubject0.createOntology(
                _IRI, _Set48, _boolean);
        org.semanticweb.owlapi.model.OWLOntology result24 = testSubject0.createOntology(
                _IRI, _Set48);
        org.semanticweb.owlapi.model.OWLOntology result25 = testSubject0.createOntology();
        org.semanticweb.owlapi.model.OWLOntology result26 = testSubject0
                .createOntology(_Set);
        org.semanticweb.owlapi.model.OWLOntology result27 = testSubject0.createOntology(
                _Set, _IRI);
        org.semanticweb.owlapi.model.OWLOntology result28 = testSubject0
                .loadOntology(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result29 = testSubject0
                .loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntology result30 = testSubject0
                .loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource);
        org.semanticweb.owlapi.model.OWLOntology result31 = testSubject0
                .loadOntologyFromOntologyDocument(_InputStream);
        org.semanticweb.owlapi.model.OWLOntology result32 = testSubject0
                .loadOntologyFromOntologyDocument(_File);
        org.semanticweb.owlapi.model.OWLOntology result33 = testSubject0
                .loadOntologyFromOntologyDocument(_IRI);
        testSubject0.removeOntology(_OWLOntologyID);
        testSubject0.removeOntology(_OWLOntology);
        org.semanticweb.owlapi.model.IRI result34 = testSubject0
                .getOntologyDocumentIRI(_OWLOntology);
        testSubject0.setOntologyDocumentIRI(_OWLOntology, _IRI);
        org.semanticweb.owlapi.model.OWLOntologyFormat result35 = testSubject0
                .getOntologyFormat(_OWLOntology);
        testSubject0.setOntologyFormat(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat,
                _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology);
        testSubject0.saveOntology(_OWLOntology, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat);
        testSubject0.addIRIMapper(_OWLOntologyIRIMapper);
        testSubject0.removeIRIMapper(_OWLOntologyIRIMapper);
        testSubject0.clearIRIMappers();
        testSubject0.addOntologyFactory(_OWLOntologyFactory);
        testSubject0.removeOntologyFactory(_OWLOntologyFactory);
        java.util.Collection<org.semanticweb.owlapi.model.OWLOntologyFactory> result36 = testSubject0
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
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration,
                _OWLOntologyLoaderConfiguration);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration);
        testSubject0.setSilentMissingImportsHandling(_boolean);
        boolean result37 = testSubject0.isSilentMissingImportsHandling();
        testSubject0.addMissingImportListener(_MissingImportListener);
        testSubject0.removeMissingImportListener(_MissingImportListener);
        testSubject0.addOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.removeOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.addOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0
                .removeOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
    }

    

    public void verifyInterfaceOWLOntologyManagerFactory() throws Exception {
        OWLOntologyManagerFactory testSubject0 = mock(OWLOntologyManagerFactory.class);
        org.semanticweb.owlapi.model.OWLDataFactory result0 = testSubject0.getFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result1 = testSubject0
                .buildOWLOntologyManager(_OWLDataFactory);
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .buildOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesOWLOntologyManagerProperties() throws Exception {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyManagerProperties.class));
    }

    public void verifyOWLOntologyManagerProperties() throws Exception {
        OWLOntologyManagerProperties testSubject0 = new OWLOntologyManagerProperties();
        testSubject0.restoreDefaults();
        boolean result0 = testSubject0.isTreatDublinCoreVocabularyAsBuiltInVocabulary();
        testSubject0.setTreatDublinCoreVocabularyAsBuiltInVocabulary(_boolean);
        testSubject0.setLoadAnnotationAxioms(_boolean);
        boolean result1 = testSubject0.isLoadAnnotationAxioms();
    }

    @Test
    public void enforceInterfacesOWLOntologyRenameException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeException.class
                .isAssignableFrom(OWLOntologyRenameException.class));
    }

    public void verifyOWLOntologyRenameException() throws Exception {
        OWLOntologyRenameException testSubject0 = new OWLOntologyRenameException(
                _OWLOntologyChange, _OWLOntologyID);
        org.semanticweb.owlapi.model.OWLOntologyID result0 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLOntologyChange result1 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getMessage();
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyResourceAccessException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLOntologyResourceAccessException.class));
    }

    public void verifyOWLOntologyResourceAccessException() throws Exception {
        OWLOntologyResourceAccessException testSubject0 = new OWLOntologyResourceAccessException(
                _String);
        OWLOntologyResourceAccessException testSubject1 = new OWLOntologyResourceAccessException(
                _String, _Throwable);
        OWLOntologyResourceAccessException testSubject2 = new OWLOntologyResourceAccessException(
                _Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLOntologySetProvider() throws Exception {
        OWLOntologySetProvider testSubject0 = mock(OWLOntologySetProvider.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result0 = testSubject0
                .getOntologies();
    }

    @Test
    public void enforceInterfacesOWLOntologyStorageException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLException.class
                .isAssignableFrom(OWLOntologyStorageException.class));
    }

    public void verifyOWLOntologyStorageException() throws Exception {
        OWLOntologyStorageException testSubject0 = new OWLOntologyStorageException(
                _String);
        OWLOntologyStorageException testSubject1 = new OWLOntologyStorageException(
                _String, _Throwable);
        OWLOntologyStorageException testSubject2 = new OWLOntologyStorageException(
                _Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyStorer() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyStorer.class));
    }

    public void verifyInterfaceOWLOntologyStorer() throws Exception {
        OWLOntologyStorer testSubject0 = mock(OWLOntologyStorer.class);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLOntologyStorerNotFoundException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorageException.class
                .isAssignableFrom(OWLOntologyStorerNotFoundException.class));
    }

    public void verifyOWLOntologyStorerNotFoundException() throws Exception {
        OWLOntologyStorerNotFoundException testSubject0 = new OWLOntologyStorerNotFoundException(
                _OWLOntologyFormat);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLProperty() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyExpression.class
                .isAssignableFrom(OWLProperty.class));
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalEntity.class
                .isAssignableFrom(OWLProperty.class));
        assertTrue(org.semanticweb.owlapi.model.OWLNamedObject.class
                .isAssignableFrom(OWLProperty.class));
    }

    public void verifyInterfaceOWLProperty() throws Exception {
        OWLProperty<OWLClassExpression, OWLObjectPropertyExpression> testSubject0 = mock(OWLProperty.class);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result0 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLClassExpression> result3 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLClassExpression> result4 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result5 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result10 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result11 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result12 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result13 = testSubject0.isFunctional(_OWLOntology);
        boolean result14 = testSubject0.isFunctional(_Set48);
        boolean result15 = testSubject0.isDataPropertyExpression();
        boolean result16 = testSubject0.isObjectPropertyExpression();
        boolean result17 = testSubject0.isOWLTopObjectProperty();
        boolean result18 = testSubject0.isOWLBottomObjectProperty();
        boolean result19 = testSubject0.isOWLTopDataProperty();
        boolean result20 = testSubject0.isOWLBottomDataProperty();
        boolean result21 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result33 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result34 = testSubject0
                .getAnnotations(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result35 = testSubject0
                .getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result36 = testSubject0.isType(_EntityType);
        OWLObject result37 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result38 = testSubject0.isBuiltIn();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result39 = testSubject0
                .getReferencingAxioms(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result40 = testSubject0
                .getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result41 = testSubject0
                .getAnnotationAssertionAxioms(_OWLOntology);
        org.semanticweb.owlapi.model.EntityType<?> result42 = testSubject0
                .getEntityType();
        OWLObject result43 = testSubject0.getOWLEntity(_EntityType52);
        boolean result44 = testSubject0.isOWLClass();
        org.semanticweb.owlapi.model.OWLClass result45 = testSubject0.asOWLClass();
        boolean result46 = testSubject0.isOWLObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result47 = testSubject0
                .asOWLObjectProperty();
        boolean result48 = testSubject0.isOWLDataProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result49 = testSubject0
                .asOWLDataProperty();
        boolean result50 = testSubject0.isOWLNamedIndividual();
        org.semanticweb.owlapi.model.OWLNamedIndividual result51 = testSubject0
                .asOWLNamedIndividual();
        boolean result52 = testSubject0.isOWLDatatype();
        org.semanticweb.owlapi.model.OWLDatatype result53 = testSubject0.asOWLDatatype();
        boolean result54 = testSubject0.isOWLAnnotationProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result55 = testSubject0
                .asOWLAnnotationProperty();
        java.lang.String result56 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        org.semanticweb.owlapi.model.IRI result57 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLPropertyAssertionAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLIndividualAxiom.class
                .isAssignableFrom(OWLPropertyAssertionAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLPropertyAssertionAxiom() throws Exception {
        OWLPropertyAssertionAxiom testSubject0 = mock(OWLPropertyAssertionAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result28 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyAssertionObject() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLPropertyAssertionObject.class));
    }

    public void verifyInterfaceOWLPropertyAssertionObject() throws Exception {
        OWLPropertyAssertionObject testSubject0 = mock(OWLPropertyAssertionObject.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result3 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result4 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result5 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result6 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result7 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(OWLPropertyAxiom.class));
    }

    public void verifyInterfaceOWLPropertyAxiom() throws Exception {
        OWLPropertyAxiom testSubject0 = mock(OWLPropertyAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result13 = testSubject0
                .getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLPropertyDomainAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLUnaryPropertyAxiom.class
                .isAssignableFrom(OWLPropertyDomainAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLPropertyDomainAxiom() throws Exception {
        OWLPropertyDomainAxiom testSubject0 = mock(OWLPropertyDomainAxiom.class);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getDomain();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyExpression() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLPropertyExpression.class));
    }

    public void verifyInterfaceOWLPropertyExpression() throws Exception {
        OWLPropertyExpression<OWLClassExpression, OWLObjectPropertyExpression> testSubject0 = mock(OWLPropertyExpression.class);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result0 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getDomains(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getDomains(_Set48);
        java.util.Set<OWLClassExpression> result3 = testSubject0.getRanges(_Set48);
        java.util.Set<OWLClassExpression> result4 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result5 = testSubject0
                .getSuperProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0
                .getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0
                .getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0
                .getSubProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0
                .getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result10 = testSubject0
                .getEquivalentProperties(_Set48);
        java.util.Set<OWLObjectPropertyExpression> result11 = testSubject0
                .getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result12 = testSubject0
                .getDisjointProperties(_Set48);
        boolean result13 = testSubject0.isFunctional(_OWLOntology);
        boolean result14 = testSubject0.isFunctional(_Set48);
        boolean result15 = testSubject0.isDataPropertyExpression();
        boolean result16 = testSubject0.isObjectPropertyExpression();
        boolean result17 = testSubject0.isOWLTopObjectProperty();
        boolean result18 = testSubject0.isOWLBottomObjectProperty();
        boolean result19 = testSubject0.isOWLTopDataProperty();
        boolean result20 = testSubject0.isOWLBottomDataProperty();
        boolean result21 = testSubject0.isAnonymous();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result22 = testSubject0
                .getSignature();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result33 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLPropertyExpressionVisitor() throws Exception {
        OWLPropertyExpressionVisitor testSubject0 = mock(OWLPropertyExpressionVisitor.class);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLDataProperty);
    }

    

    public void verifyInterfaceOWLPropertyExpressionVisitorEx() throws Exception {
        OWLPropertyExpressionVisitorEx<OWLObject> testSubject0 = mock(OWLPropertyExpressionVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result1 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result2 = testSubject0.visit(_OWLDataProperty);
    }

    @Test
    public void enforceInterfacesOWLPropertyRange() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(OWLPropertyRange.class));
    }

    public void verifyInterfaceOWLPropertyRange() throws Exception {
        OWLPropertyRange testSubject0 = mock(OWLPropertyRange.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result3 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result4 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result5 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result6 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result7 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result8 = testSubject0
                .getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLPropertyRangeAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLUnaryPropertyAxiom.class
                .isAssignableFrom(OWLPropertyRangeAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLPropertyRangeAxiom() throws Exception {
        OWLPropertyRangeAxiom testSubject0 = mock(OWLPropertyRangeAxiom.class);
        OWLPropertyRange result0 = testSubject0.getRange();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedDataRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedRestriction.class
                .isAssignableFrom(OWLQuantifiedDataRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedDataRestriction() throws Exception {
        OWLQuantifiedDataRestriction testSubject0 = mock(OWLQuantifiedDataRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLQuantifiedObjectRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLQuantifiedRestriction.class
                .isAssignableFrom(OWLQuantifiedObjectRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedObjectRestriction() throws Exception {
        OWLQuantifiedObjectRestriction testSubject0 = mock(OWLQuantifiedObjectRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLQuantifiedRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRestriction.class
                .isAssignableFrom(OWLQuantifiedRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedRestriction() throws Exception {
        OWLQuantifiedRestriction testSubject0 = mock(OWLQuantifiedRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result6 = testSubject0
                .getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLReflexiveObjectPropertyAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLSubClassOfAxiomShortCut.class
                .isAssignableFrom(OWLReflexiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLReflexiveObjectPropertyAxiom() throws Exception {
        OWLReflexiveObjectPropertyAxiom testSubject0 = mock(OWLReflexiveObjectPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result27 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLRestriction() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnonymousClassExpression.class
                .isAssignableFrom(OWLRestriction.class));
    }

    public void verifyInterfaceOWLRestriction() throws Exception {
        OWLRestriction testSubject0 = mock(OWLRestriction.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isOWLThing();
        org.semanticweb.owlapi.model.ClassExpressionType result5 = testSubject0
                .getClassExpressionType();
        boolean result6 = testSubject0.isClassExpressionLiteral();
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
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLRuntimeException() throws Exception {
        assertTrue(java.lang.RuntimeException.class
                .isAssignableFrom(OWLRuntimeException.class));
    }

    public void verifyOWLRuntimeException() throws Exception {
        OWLRuntimeException testSubject0 = new OWLRuntimeException(_Throwable);
        OWLRuntimeException testSubject1 = new OWLRuntimeException(_String, _Throwable);
        OWLRuntimeException testSubject2 = new OWLRuntimeException(_String);
        OWLRuntimeException testSubject3 = new OWLRuntimeException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLSameIndividualAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLNaryIndividualAxiom.class
                .isAssignableFrom(OWLSameIndividualAxiom.class));
    }

    public void verifyInterfaceOWLSameIndividualAxiom() throws Exception {
        OWLSameIndividualAxiom testSubject0 = mock(OWLSameIndividualAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLSameIndividualAxiom> result0 = testSubject0
                .asPairwiseAxioms();
        boolean result1 = testSubject0.containsAnonymousIndividuals();
        org.semanticweb.owlapi.model.OWLSameIndividualAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result3 = testSubject0
                .getIndividuals();
        java.util.List<org.semanticweb.owlapi.model.OWLIndividual> result4 = testSubject0
                .getIndividualsAsList();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result6 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result18 = testSubject0
                .getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result29 = testSubject0.compareTo(_Object36);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result30 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAnnotationAxiom.class
                .isAssignableFrom(OWLSubAnnotationPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubAnnotationPropertyOfAxiom() throws Exception {
        OWLSubAnnotationPropertyOfAxiom testSubject0 = mock(OWLSubAnnotationPropertyOfAxiom.class);
        org.semanticweb.owlapi.model.OWLAnnotationProperty result0 = testSubject0
                .getSubProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result1 = testSubject0
                .getSuperProperty();
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result2 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubClassOfAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassAxiom.class
                .isAssignableFrom(OWLSubClassOfAxiom.class));
    }

    public void verifyInterfaceOWLSubClassOfAxiom() throws Exception {
        OWLSubClassOfAxiom testSubject0 = mock(OWLSubClassOfAxiom.class);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .getSubClass();
        org.semanticweb.owlapi.model.OWLClassExpression result2 = testSubject0
                .getSuperClass();
        boolean result3 = testSubject0.isGCI();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceOWLSubClassOfAxiomSetShortCut() throws Exception {
        OWLSubClassOfAxiomSetShortCut testSubject0 = mock(OWLSubClassOfAxiomSetShortCut.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubClassOfAxiom> result0 = testSubject0
                .asOWLSubClassOfAxioms();
    }

    

    public void verifyInterfaceOWLSubClassOfAxiomShortCut() throws Exception {
        OWLSubClassOfAxiomShortCut testSubject0 = mock(OWLSubClassOfAxiomShortCut.class);
        org.semanticweb.owlapi.model.OWLSubClassOfAxiom result0 = testSubject0
                .asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLSubPropertyAxiom.class
                .isAssignableFrom(OWLSubDataPropertyOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataPropertyAxiom.class
                .isAssignableFrom(OWLSubDataPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubDataPropertyOfAxiom() throws Exception {
        OWLSubDataPropertyOfAxiom testSubject0 = mock(OWLSubDataPropertyOfAxiom.class);
        org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLDataPropertyExpression result1 = testSubject0.getSubProperty();
        OWLDataPropertyExpression result2 = testSubject0.getSuperProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLSubPropertyAxiom.class
                .isAssignableFrom(OWLSubObjectPropertyOfAxiom.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLSubObjectPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubObjectPropertyOfAxiom() throws Exception {
        OWLSubObjectPropertyOfAxiom testSubject0 = mock(OWLSubObjectPropertyOfAxiom.class);
        org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        OWLObjectPropertyExpression result1 = testSubject0.getSubProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getSuperProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result16 = testSubject0
                .getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAxiom.class
                .isAssignableFrom(OWLSubPropertyAxiom.class));
    }

    public void verifyInterfaceOWLSubPropertyAxiom() throws Exception {
        OWLSubPropertyAxiom testSubject0 = mock(OWLSubPropertyAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getSubProperty();
        OWLPropertyExpression result1 = testSubject0.getSuperProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyChainOfAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyAxiom.class
                .isAssignableFrom(OWLSubPropertyChainOfAxiom.class));
    }

    public void verifyInterfaceOWLSubPropertyChainOfAxiom() throws Exception {
        OWLSubPropertyChainOfAxiom testSubject0 = mock(OWLSubPropertyChainOfAxiom.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getSuperProperty();
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result1 = testSubject0
                .getPropertyChain();
        boolean result2 = testSubject0.isEncodingOfTransitiveProperty();
        org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom result3 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result4 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result5 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result17 = testSubject0
                .getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLSymmetricObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLSymmetricObjectPropertyAxiom() throws Exception {
        OWLSymmetricObjectPropertyAxiom testSubject0 = mock(OWLSymmetricObjectPropertyAxiom.class);
        java.util.Set<org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom> result0 = testSubject0
                .asSubPropertyAxioms();
        org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom result1 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result6 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result15 = testSubject0
                .getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result26 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result27 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom.class
                .isAssignableFrom(OWLTransitiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLTransitiveObjectPropertyAxiom() throws Exception {
        OWLTransitiveObjectPropertyAxiom testSubject0 = mock(OWLTransitiveObjectPropertyAxiom.class);
        org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom result0 = testSubject0
                .getAxiomWithoutAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLUnaryPropertyAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLPropertyAxiom.class
                .isAssignableFrom(OWLUnaryPropertyAxiom.class));
    }

    public void verifyInterfaceOWLUnaryPropertyAxiom() throws Exception {
        OWLUnaryPropertyAxiom testSubject0 = mock(OWLUnaryPropertyAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result2 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result4 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result14 = testSubject0
                .getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result25 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesPrefixManager() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(PrefixManager.class));
    }

    public void verifyInterfacePrefixManager() throws Exception {
        PrefixManager testSubject0 = mock(PrefixManager.class);
        java.util.Map<java.lang.String, java.lang.String> result0 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result1 = testSubject0.getPrefixNames();
        java.lang.String result2 = testSubject0.getPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result4 = testSubject0.getDefaultPrefix();
        java.lang.String result5 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRI(_String);
    }

    @Test
    public void enforceInterfacesRemoveAxiom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomChange.class
                .isAssignableFrom(RemoveAxiom.class));
    }

    public void verifyRemoveAxiom() throws Exception {
        RemoveAxiom testSubject0 = new RemoveAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result1 = testSubject0.isAddAxiom();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result2 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.RemoveAxiomData result3 = testSubject0
                .getChangeData();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result4 = testSubject0
                .getSignature();
        boolean result5 = testSubject0.isAxiomChange();
        boolean result6 = testSubject0.isImportChange();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getEntities();
        org.semanticweb.owlapi.model.OWLAxiom result8 = testSubject0.getAxiom();
        boolean result9 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesRemoveImport() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.ImportChange.class
                .isAssignableFrom(RemoveImport.class));
    }

    public void verifyRemoveImport() throws Exception {
        RemoveImport testSubject0 = new RemoveImport(_OWLOntology, _OWLImportsDeclaration);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result2 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.RemoveImportData result3 = testSubject0
                .getChangeData();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0.getAxiom();
        org.semanticweb.owlapi.model.OWLImportsDeclaration result8 = testSubject0
                .getImportDeclaration();
        boolean result9 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotation() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.AnnotationChange.class
                .isAssignableFrom(RemoveOntologyAnnotation.class));
    }

    public void verifyRemoveOntologyAnnotation() throws Exception {
        RemoveOntologyAnnotation testSubject0 = new RemoveOntologyAnnotation(
                _OWLOntology, _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result1 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.model.OWLAnnotation result2 = testSubject0.getAnnotation();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0.getAxiom();
        boolean result8 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result9 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesSetOntologyID() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChange.class
                .isAssignableFrom(SetOntologyID.class));
    }

    public void verifySetOntologyID() throws Exception {
        SetOntologyID testSubject0 = new SetOntologyID(_OWLOntology, _OWLOntologyID);
        SetOntologyID testSubject1 = new SetOntologyID(_OWLOntology, _IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getSignature();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        org.semanticweb.owlapi.model.OWLOntologyID result2 = testSubject0
                .getOriginalOntologyID();
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0
                .getNewOntologyID();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        org.semanticweb.owlapi.change.SetOntologyIDData result7 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result8 = testSubject0
                .getChangeData();
        org.semanticweb.owlapi.model.OWLAxiom result9 = testSubject0.getAxiom();
        boolean result10 = testSubject0.isRemoveAxiom();
        org.semanticweb.owlapi.model.OWLOntology result11 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result12 = testSubject0
                .getChangeRecord();
    }

    @Test
    public void enforceInterfacesSpecificOntologyChangeBroadcastStrategy()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeBroadcastStrategy.class
                .isAssignableFrom(SpecificOntologyChangeBroadcastStrategy.class));
    }

    public void verifySpecificOntologyChangeBroadcastStrategy() throws Exception {
        SpecificOntologyChangeBroadcastStrategy testSubject0 = new SpecificOntologyChangeBroadcastStrategy(
                _OWLOntology);
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesSWRLArgument() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLObject.class
                .isAssignableFrom(SWRLArgument.class));
    }

    public void verifyInterfaceSWRLArgument() throws Exception {
        SWRLArgument testSubject0 = mock(SWRLArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLObject.class
                .isAssignableFrom(SWRLAtom.class));
    }

    public void verifyInterfaceSWRLAtom() throws Exception {
        SWRLAtom testSubject0 = mock(SWRLAtom.class);
        org.semanticweb.owlapi.model.SWRLPredicate result0 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result1 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result3 = testSubject0
                .getSignature();
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result5 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result6 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result7 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result8 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result9 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result10 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result11 = testSubject0
                .getNestedClassExpressions();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        int result14 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLBinaryAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLAtom.class
                .isAssignableFrom(SWRLBinaryAtom.class));
    }

    public void verifyInterfaceSWRLBinaryAtom() throws Exception {
        SWRLBinaryAtom testSubject0 = mock(SWRLBinaryAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result3 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLAtom.class
                .isAssignableFrom(SWRLBuiltInAtom.class));
    }

    public void verifyInterfaceSWRLBuiltInAtom() throws Exception {
        SWRLBuiltInAtom testSubject0 = mock(SWRLBuiltInAtom.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getPredicate();
        boolean result1 = testSubject0.isCoreBuiltIn();
        java.util.List<org.semanticweb.owlapi.model.SWRLDArgument> result2 = testSubject0
                .getArguments();
        org.semanticweb.owlapi.model.SWRLPredicate result3 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result4 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result8 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result9 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result10 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result11 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result12 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result13 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLClassAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLUnaryAtom.class
                .isAssignableFrom(SWRLClassAtom.class));
    }

    public void verifyInterfaceSWRLClassAtom() throws Exception {
        SWRLClassAtom testSubject0 = mock(SWRLClassAtom.class);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getPredicate();
        SWRLArgument result1 = testSubject0.getArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result3 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLDArgument() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLArgument.class
                .isAssignableFrom(SWRLDArgument.class));
    }

    public void verifyInterfaceSWRLDArgument() throws Exception {
        SWRLDArgument testSubject0 = mock(SWRLDArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceSWRLDataFactory() throws Exception {
        SWRLDataFactory testSubject0 = mock(SWRLDataFactory.class);
        org.semanticweb.owlapi.model.SWRLRule result0 = testSubject0.getSWRLRule(_Set147,
                _Set147, _Set35);
        org.semanticweb.owlapi.model.SWRLRule result1 = testSubject0.getSWRLRule(_Set147,
                _Set147);
        org.semanticweb.owlapi.model.SWRLRule result2 = testSubject0.getSWRLRule(_NodeID,
                _Set147, _Set147);
        org.semanticweb.owlapi.model.SWRLRule result3 = testSubject0.getSWRLRule(_IRI,
                _Set147, _Set147);
        org.semanticweb.owlapi.model.SWRLClassAtom result4 = testSubject0
                .getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        org.semanticweb.owlapi.model.SWRLDataRangeAtom result5 = testSubject0
                .getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        org.semanticweb.owlapi.model.SWRLObjectPropertyAtom result6 = testSubject0
                .getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument,
                        _SWRLIArgument);
        org.semanticweb.owlapi.model.SWRLDataPropertyAtom result7 = testSubject0
                .getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument,
                        _SWRLDArgument);
        org.semanticweb.owlapi.model.SWRLBuiltInAtom result8 = testSubject0
                .getSWRLBuiltInAtom(_IRI, _List150);
        org.semanticweb.owlapi.model.SWRLVariable result9 = testSubject0
                .getSWRLVariable(_IRI);
        org.semanticweb.owlapi.model.SWRLIndividualArgument result10 = testSubject0
                .getSWRLIndividualArgument(_OWLIndividual);
        org.semanticweb.owlapi.model.SWRLLiteralArgument result11 = testSubject0
                .getSWRLLiteralArgument(_OWLLiteral);
        org.semanticweb.owlapi.model.SWRLSameIndividualAtom result12 = testSubject0
                .getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom result13 = testSubject0
                .getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLBinaryAtom.class
                .isAssignableFrom(SWRLDataPropertyAtom.class));
    }

    public void verifyInterfaceSWRLDataPropertyAtom() throws Exception {
        SWRLDataPropertyAtom testSubject0 = mock(SWRLDataPropertyAtom.class);
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result0 = testSubject0
                .getPredicate();
        SWRLArgument result1 = testSubject0.getFirstArgument();
        SWRLDArgument result2 = testSubject0.getSecondArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result3 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result4 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result6 = testSubject0
                .getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result8 = testSubject0
                .getClassesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result9 = testSubject0
                .getAnonymousIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataProperty> result10 = testSubject0
                .getDataPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectProperty> result11 = testSubject0
                .getObjectPropertiesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLNamedIndividual> result12 = testSubject0
                .getIndividualsInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLDatatype> result13 = testSubject0
                .getDatatypesInSignature();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result14 = testSubject0
                .getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLUnaryAtom.class
                .isAssignableFrom(SWRLDataRangeAtom.class));
    }

    public void verifyInterfaceSWRLDataRangeAtom() throws Exception {
        SWRLDataRangeAtom testSubject0 = mock(SWRLDataRangeAtom.class);
        org.semanticweb.owlapi.model.OWLDataRange result0 = testSubject0.getPredicate();
        SWRLArgument result1 = testSubject0.getArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result3 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLBinaryAtom.class
                .isAssignableFrom(SWRLDifferentIndividualsAtom.class));
    }

    public void verifyInterfaceSWRLDifferentIndividualsAtom() throws Exception {
        SWRLDifferentIndividualsAtom testSubject0 = mock(SWRLDifferentIndividualsAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLIArgument result1 = testSubject0.getSecondArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result3 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLIArgument() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLArgument.class
                .isAssignableFrom(SWRLIArgument.class));
    }

    public void verifyInterfaceSWRLIArgument() throws Exception {
        SWRLIArgument testSubject0 = mock(SWRLIArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLIndividualArgument() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLIArgument.class
                .isAssignableFrom(SWRLIndividualArgument.class));
    }

    public void verifyInterfaceSWRLIndividualArgument() throws Exception {
        SWRLIndividualArgument testSubject0 = mock(SWRLIndividualArgument.class);
        org.semanticweb.owlapi.model.OWLIndividual result0 = testSubject0.getIndividual();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result13 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLLiteralArgument() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLDArgument.class
                .isAssignableFrom(SWRLLiteralArgument.class));
    }

    public void verifyInterfaceSWRLLiteralArgument() throws Exception {
        SWRLLiteralArgument testSubject0 = mock(SWRLLiteralArgument.class);
        org.semanticweb.owlapi.model.OWLLiteral result0 = testSubject0.getLiteral();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result13 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLObject() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObject.class
                .isAssignableFrom(SWRLObject.class));
    }

    public void verifyInterfaceSWRLObject() throws Exception {
        SWRLObject testSubject0 = mock(SWRLObject.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result12 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLBinaryAtom.class
                .isAssignableFrom(SWRLObjectPropertyAtom.class));
    }

    public void verifyInterfaceSWRLObjectPropertyAtom() throws Exception {
        SWRLObjectPropertyAtom testSubject0 = mock(SWRLObjectPropertyAtom.class);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getPredicate();
        org.semanticweb.owlapi.model.SWRLObjectPropertyAtom result1 = testSubject0
                .getSimplified();
        SWRLArgument result2 = testSubject0.getFirstArgument();
        SWRLIArgument result3 = testSubject0.getSecondArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result4 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result5 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result6 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result7 = testSubject0
                .getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result18 = testSubject0.compareTo(_Object36);
    }

    

    public void verifyInterfaceSWRLObjectVisitor() throws Exception {
        SWRLObjectVisitor testSubject0 = mock(SWRLObjectVisitor.class);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
    }

    

    public void verifyInterfaceSWRLObjectVisitorEx() throws Exception {
        SWRLObjectVisitorEx<OWLObject> testSubject0 = mock(SWRLObjectVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_SWRLBuiltInAtom);
        OWLObject result1 = testSubject0.visit(_SWRLVariable);
        OWLObject result2 = testSubject0.visit(_SWRLIndividualArgument);
        OWLObject result3 = testSubject0.visit(_SWRLLiteralArgument);
        OWLObject result4 = testSubject0.visit(_SWRLSameIndividualAtom);
        OWLObject result5 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        OWLObject result6 = testSubject0.visit(_SWRLRule);
        OWLObject result7 = testSubject0.visit(_SWRLClassAtom);
        OWLObject result8 = testSubject0.visit(_SWRLDataRangeAtom);
        OWLObject result9 = testSubject0.visit(_SWRLObjectPropertyAtom);
        OWLObject result10 = testSubject0.visit(_SWRLDataPropertyAtom);
    }

    

    public void verifyInterfaceSWRLPredicate() throws Exception {
        SWRLPredicate testSubject0 = mock(SWRLPredicate.class);
    }

    @Test
    public void enforceInterfacesSWRLRule() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLLogicalAxiom.class
                .isAssignableFrom(SWRLRule.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObject.class
                .isAssignableFrom(SWRLRule.class));
    }

    public void verifyInterfaceSWRLRule() throws Exception {
        SWRLRule testSubject0 = mock(SWRLRule.class);
        boolean result0 = testSubject0.containsAnonymousClassExpressions();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result1 = testSubject0
                .getClassAtomPredicates();
        java.util.Set<org.semanticweb.owlapi.model.SWRLAtom> result2 = testSubject0
                .getBody();
        java.util.Set<org.semanticweb.owlapi.model.SWRLAtom> result3 = testSubject0
                .getHead();
        java.util.Set<org.semanticweb.owlapi.model.SWRLVariable> result4 = testSubject0
                .getVariables();
        org.semanticweb.owlapi.model.SWRLRule result5 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.SWRLRule result6 = testSubject0.getSimplified();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result7 = testSubject0
                .getAnnotations();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result8 = testSubject0
                .getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result9 = testSubject0.accept(_OWLAxiomVisitorEx);
        org.semanticweb.owlapi.model.OWLAxiom result10 = testSubject0
                .getAxiomWithoutAnnotations();
        org.semanticweb.owlapi.model.OWLAxiom result11 = testSubject0
                .getAnnotatedAxiom(_Set35);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        boolean result15 = testSubject0.isAnnotated();
        org.semanticweb.owlapi.model.AxiomType<?> result16 = testSubject0.getAxiomType();
        boolean result17 = testSubject0.isOfType(_Set40);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        org.semanticweb.owlapi.model.OWLAxiom result19 = testSubject0.getNNF();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result20 = testSubject0
                .getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result31 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result32 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLBinaryAtom.class
                .isAssignableFrom(SWRLSameIndividualAtom.class));
    }

    public void verifyInterfaceSWRLSameIndividualAtom() throws Exception {
        SWRLSameIndividualAtom testSubject0 = mock(SWRLSameIndividualAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLIArgument result1 = testSubject0.getSecondArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result3 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result5 = testSubject0
                .getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLUnaryAtom() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLAtom.class
                .isAssignableFrom(SWRLUnaryAtom.class));
    }

    public void verifyInterfaceSWRLUnaryAtom() throws Exception {
        SWRLUnaryAtom testSubject0 = mock(SWRLUnaryAtom.class);
        SWRLArgument result0 = testSubject0.getArgument();
        org.semanticweb.owlapi.model.SWRLPredicate result1 = testSubject0.getPredicate();
        java.util.Collection<org.semanticweb.owlapi.model.SWRLArgument> result2 = testSubject0
                .getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result4 = testSubject0
                .getSignature();
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result15 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLVariable() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLIArgument.class
                .isAssignableFrom(SWRLVariable.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLDArgument.class
                .isAssignableFrom(SWRLVariable.class));
    }

    public void verifyInterfaceSWRLVariable() throws Exception {
        SWRLVariable testSubject0 = mock(SWRLVariable.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getIRI();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
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
        int result13 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesUnknownOWLOntologyException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(UnknownOWLOntologyException.class));
    }

    public void verifyUnknownOWLOntologyException() throws Exception {
        UnknownOWLOntologyException testSubject0 = new UnknownOWLOntologyException(
                _OWLOntologyID);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesUnloadableImportException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyCreationException.class
                .isAssignableFrom(UnloadableImportException.class));
    }

    public void verifyUnloadableImportException() throws Exception {
        UnloadableImportException testSubject0 = new UnloadableImportException(
                _OWLOntologyCreationException, _OWLImportsDeclaration);
        org.semanticweb.owlapi.model.OWLImportsDeclaration result0 = testSubject0
                .getImportsDeclaration();
        org.semanticweb.owlapi.model.OWLOntologyCreationException result1 = testSubject0
                .getOntologyCreationException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getMessage();
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    private static class P {}

    private static class T {}

    private P _OWLPropertyExpression;
    private OWLObject _Object36;
    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private java.io.File _File;
    private java.io.InputStream _InputStream;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.net.URI _URI;
    private java.net.URL _URL;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _List138;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLOntologyChange> _List;
    private java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> _List163;
    private java.util.List<org.semanticweb.owlapi.model.SWRLDArgument> _List150;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAnnotation> _Set119;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> _Set194;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLClassExpression> _Set120;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLDataPropertyExpression> _Set142;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLDataRange> _Set133;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLIndividual> _Set136;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLLiteral> _Set127;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Set140;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>> _Set143;
    private java.util.Set<? extends org.semanticweb.owlapi.model.SWRLAtom> _Set147;
    private java.util.Set<org.semanticweb.owlapi.model.AxiomType<?>> _Set40;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> _Set35;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> _Set;
    private java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> _Set131;
    private java.util.Set<org.semanticweb.owlapi.model.OWLOntology> _Set48;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.model.AddAxiom _AddAxiom;
    private org.semanticweb.owlapi.model.AddImport _AddImport;
    private org.semanticweb.owlapi.model.AddOntologyAnnotation _AddOntologyAnnotation;
    private org.semanticweb.owlapi.model.AxiomType<?>[] _AxiomType_array;
    private org.semanticweb.owlapi.model.AxiomType _AxiomType;
    private org.semanticweb.owlapi.model.EntityType<?> _EntityType;
    private org.semanticweb.owlapi.model.EntityType _EntityType52;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.ImpendingOWLOntologyChangeListener _ImpendingOWLOntologyChangeListener;
    private org.semanticweb.owlapi.model.MissingImportEvent _MissingImportEvent;
    private org.semanticweb.owlapi.model.MissingImportHandlingStrategy _MissingImportHandlingStrategy;
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
    private org.semanticweb.owlapi.model.OWLAnnotationSubjectVisitorEx<OWLObject> _OWLAnnotationSubjectVisitorEx;
    private org.semanticweb.owlapi.model.OWLAnnotationValue _OWLAnnotationValue;
    private org.semanticweb.owlapi.model.OWLAnnotationValueVisitor _OWLAnnotationValueVisitor;
    private org.semanticweb.owlapi.model.OWLAnnotationValueVisitorEx<OWLObject> _OWLAnnotationValueVisitorEx;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLAxiomVisitor _OWLAxiomVisitor;
    private org.semanticweb.owlapi.model.OWLAxiomVisitorEx<OWLObject> _OWLAxiomVisitorEx;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
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
    private org.semanticweb.owlapi.model.OWLOntologyChangeVetoException _OWLOntologyChangeVetoException;
    private org.semanticweb.owlapi.model.OWLOntologyChangeVisitor _OWLOntologyChangeVisitor;
    private org.semanticweb.owlapi.model.OWLOntologyChangeVisitorEx<OWLObject> _OWLOntologyChangeVisitorEx;
    private org.semanticweb.owlapi.model.OWLOntologyChangesVetoedListener _OWLOntologyChangesVetoedListener;
    private org.semanticweb.owlapi.model.OWLOntologyCreationException _OWLOntologyCreationException;
    private org.semanticweb.owlapi.model.OWLOntologyFactory _OWLOntologyFactory;
    private org.semanticweb.owlapi.model.OWLOntologyFactory.OWLOntologyCreationHandler _OWLOntologyCreationHandler;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyID _OWLOntologyID;
    private org.semanticweb.owlapi.model.OWLOntologyIRIMapper _OWLOntologyIRIMapper;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy _MissingOntologyHeaderStrategy;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderListener _OWLOntologyLoaderListener;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderListener.LoadingFinishedEvent _LoadingFinishedEvent;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderListener.LoadingStartedEvent _LoadingStartedEvent;
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
    private org.semanticweb.owlapi.model.RemoveAxiom _RemoveAxiom;
    private org.semanticweb.owlapi.model.RemoveImport _RemoveImport;
    private org.semanticweb.owlapi.model.RemoveOntologyAnnotation _RemoveOntologyAnnotation;
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
    private org.semanticweb.owlapi.model.SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.model.SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private org.semanticweb.owlapi.model.SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.model.SetOntologyID _SetOntologyID;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
