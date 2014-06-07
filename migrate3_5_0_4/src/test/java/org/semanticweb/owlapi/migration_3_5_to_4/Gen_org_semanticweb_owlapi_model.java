package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.OWLOntologyChangeData;
import org.semanticweb.owlapi.formats.PrefixOWLOntologyFormat;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.*;

import com.google.common.base.Optional;

@SuppressWarnings({ "javadoc", "serial", "deprecation", "unchecked", "rawtypes", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "method change: OWLOntologyRenameException<init> : from OWLOntologyChange to OWLOntologyChangeData", "class deleted: OWLOntologyManagerProperties",
        "method change: OWLOntologyLoaderConfiguration::getIgnoredImports() : isIgnoredImport()",
        "method change: OWLOntologyLoaderConfiguration::setSilentMissingImportsHandling() : setMissingImportsHandlingStrategy()",
        "method change: OWLOntologyLoaderConfiguration::isSilentMissingImportsHandling() : gettMissingImportsHandlingStrategy()",
        "method refactored: OWLOntologyManager::add/remove/getOntologyFactories() : managed through a PriorityCollection and get/setOntologyFactories()",
        "method refactored: OWLOntologyManager::add/remove/getOntologyStorers() : managed through a PriorityCollection and get/setOntologyStorers()",
        "method refactored: OWLOntologyManager::add/remove/getIRIMappers() : managed through a PriorityCollection and get/setIRIMappers()",
        "method arguments: OWLDataFactory::getSWRLRule() : dropped deprecated id", "method deleted: IRI::getStart() : use getNamespace()",
        "method refactored: OWLCardinalityRestriction::getProperty() : pushed down to data and object restrictions",
        "method refactored: OWLCardinalityRestriction::getValue() : use getFiller()",
        "method refactored: OWLOntology::applyChange() : return type is no longer a list but an AppliedChange value." })
public class Gen_org_semanticweb_owlapi_model {
    @Test
    public void enforceInterfacesAddAxiom() {
        assertTrue(OWLAxiomChange.class.isAssignableFrom(AddAxiom.class));
    }

    public void verifyAddAxiom() {
        AddAxiom testSubject0 = new AddAxiom(_OWLOntology, _OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        boolean result1 = testSubject0.isAddAxiom();
        org.semanticweb.owlapi.change.AddAxiomData result2 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result3 = testSubject0.getChangeData();
        Set<OWLEntity> result4 = testSubject0.getSignature();
        boolean result5 = testSubject0.isAxiomChange();
        boolean result6 = testSubject0.isImportChange();
        OWLAxiom result8 = testSubject0.getAxiom();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAddImport() {
        assertTrue(ImportChange.class.isAssignableFrom(AddImport.class));
    }

    public void verifyAddImport() {
        AddImport testSubject0 = new AddImport(_OWLOntology, _OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.AddImportData result1 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result2 = testSubject0.getChangeData();
        Set<OWLEntity> result3 = testSubject0.getSignature();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        OWLAxiom result7 = testSubject0.getAxiom();
        OWLImportsDeclaration result8 = testSubject0.getImportDeclaration();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotation() {
        assertTrue(AnnotationChange.class.isAssignableFrom(AddOntologyAnnotation.class));
    }

    public void verifyAddOntologyAnnotation() {
        AddOntologyAnnotation testSubject0 = new AddOntologyAnnotation(_OWLOntology, _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result1 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.AddOntologyAnnotationData result2 = testSubject0.getChangeData();
        OWLAnnotation result3 = testSubject0.getAnnotation();
        Set<OWLEntity> result4 = testSubject0.getSignature();
        boolean result5 = testSubject0.isAxiomChange();
        boolean result6 = testSubject0.isAddAxiom();
        boolean result7 = testSubject0.isImportChange();
        OWLAxiom result8 = testSubject0.getAxiom();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAnnotationChange() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(AnnotationChange.class));
    }

    public void verifyAnnotationChange() {
        AnnotationChange testSubject0 = new AnnotationChange(_OWLOntology, _OWLAnnotation) {
            @Override
            public OWLOntologyChangeData getChangeData() {
                return null;
            }

            @Override
            public void accept(OWLOntologyChangeVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLAnnotation result0 = testSubject0.getAnnotation();
        Set<OWLEntity> result1 = testSubject0.getSignature();
        boolean result2 = testSubject0.isAxiomChange();
        boolean result3 = testSubject0.isAddAxiom();
        boolean result4 = testSubject0.isImportChange();
        OWLAxiom result5 = testSubject0.getAxiom();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result7 = testSubject0.isRemoveAxiom();
        OWLOntology result8 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result9 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAxiomType() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(AxiomType.class));
    }

    public void verifyAxiomType() {
        AxiomType testSubject0 = AxiomType.ANNOTATION_ASSERTION;
        String result0 = testSubject0.getName();
        int result1 = testSubject0.getIndex();
        AxiomType<?> result2 = AxiomType.getAxiomType(_String);
        boolean result3 = testSubject0.isLogical();
        boolean result4 = testSubject0.isOWL2Axiom();
        boolean result5 = testSubject0.isNonSyntacticOWL2Axiom();
        Set<OWLAxiom> result6 = AxiomType.getAxiomsWithoutTypes(_Set, _AxiomType_array);
        Set<OWLAxiom> result7 = AxiomType.getAxiomsOfTypes(_Set, _AxiomType_array);
        boolean result8 = AxiomType.isAxiomType(_String);
    }

    @Test
    public void enforceInterfacesClassExpressionType() {
        assertTrue(Enum.class.isAssignableFrom(ClassExpressionType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(ClassExpressionType.class));
    }

    public void verifyEnumClassExpressionType() {
        ClassExpressionType testSubject0 = ClassExpressionType.OWL_CLASS;
        String result0 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesDataRangeType() {
        assertTrue(Enum.class.isAssignableFrom(DataRangeType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(DataRangeType.class));
    }

    public void verifyEnumDataRangeType() {
        DataRangeType testSubject0 = DataRangeType.DATATYPE;
        String result0 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesDefaultChangeBroadcastStrategy() {
        assertTrue(OWLOntologyChangeBroadcastStrategy.class.isAssignableFrom(DefaultChangeBroadcastStrategy.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(DefaultChangeBroadcastStrategy.class));
    }

    public void verifyDefaultChangeBroadcastStrategy() throws OWLException {
        DefaultChangeBroadcastStrategy testSubject0 = new DefaultChangeBroadcastStrategy();
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesDefaultImpendingChangeBroadcastStrategy() {
        assertTrue(ImpendingOWLOntologyChangeBroadcastStrategy.class.isAssignableFrom(DefaultImpendingChangeBroadcastStrategy.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(DefaultImpendingChangeBroadcastStrategy.class));
    }

    public void verifyDefaultImpendingChangeBroadcastStrategy() {
        DefaultImpendingChangeBroadcastStrategy testSubject0 = new DefaultImpendingChangeBroadcastStrategy();
        testSubject0.broadcastChanges(_ImpendingOWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesEDTChangeBroadcastStrategy() {
        assertTrue(OWLOntologyChangeBroadcastStrategy.class.isAssignableFrom(EDTChangeBroadcastStrategy.class));
    }

    public void verifyEDTChangeBroadcastStrategy() throws OWLException {
        EDTChangeBroadcastStrategy testSubject0 = new EDTChangeBroadcastStrategy();
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesEntityType() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(EntityType.class));
    }

    public void verifyEntityType() {
        EntityType testSubject0 = EntityType.ANNOTATION_PROPERTY;
        EntityType testSubject1 = EntityType.CLASS;
        EntityType testSubject2 = EntityType.DATA_PROPERTY;
        EntityType testSubject3 = EntityType.DATATYPE;
        EntityType testSubject4 = EntityType.NAMED_INDIVIDUAL;
        EntityType testSubject5 = EntityType.OBJECT_PROPERTY;
        List<EntityType<?>> result0 = EntityType.values();
        String result1 = testSubject0.getName();
        org.semanticweb.owlapi.vocab.OWLRDFVocabulary result2 = testSubject0.getVocabulary();
        String result3 = testSubject0.getPrintName();
        String result4 = testSubject0.getPluralPrintName();
    }

    @Test
    public void enforceInterfacesImmutableOWLOntologyChangeException() {
        assertTrue(OWLOntologyChangeException.class.isAssignableFrom(ImmutableOWLOntologyChangeException.class));
    }

    public void verifyImmutableOWLOntologyChangeException() {
        ImmutableOWLOntologyChangeException testSubject0 = new ImmutableOWLOntologyChangeException(_OWLOntologyChangeData, "");
        OWLOntologyChangeData<?> result0 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getMessage();
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesImpendingOWLOntologyChangeBroadcastStrategy() {
    }

    public void verifyInterfaceImpendingOWLOntologyChangeBroadcastStrategy() {
        ImpendingOWLOntologyChangeBroadcastStrategy testSubject0 = mock(ImpendingOWLOntologyChangeBroadcastStrategy.class);
        testSubject0.broadcastChanges(_ImpendingOWLOntologyChangeListener, _List);
    }

    public void verifyInterfaceImpendingOWLOntologyChangeListener() {
        ImpendingOWLOntologyChangeListener testSubject0 = mock(ImpendingOWLOntologyChangeListener.class);
        testSubject0.handleImpendingOntologyChanges(_List);
    }

    @Test
    public void enforceInterfacesImportChange() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(ImportChange.class));
    }

    public void verifyImportChange() {
        ImportChange testSubject0 = new ImportChange(_OWLOntology, _OWLImportsDeclaration) {
            @Override
            public OWLOntologyChangeData getChangeData() {
                return null;
            }

            @Override
            public void accept(OWLOntologyChangeVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        Set<OWLEntity> result0 = testSubject0.getSignature();
        boolean result1 = testSubject0.isAxiomChange();
        boolean result2 = testSubject0.isAddAxiom();
        boolean result3 = testSubject0.isImportChange();
        OWLAxiom result4 = testSubject0.getAxiom();
        OWLImportsDeclaration result5 = testSubject0.getImportDeclaration();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result7 = testSubject0.isRemoveAxiom();
        OWLOntology result8 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result9 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesIRI() {
        assertTrue(OWLAnnotationSubject.class.isAssignableFrom(IRI.class));
        assertTrue(OWLAnnotationValue.class.isAssignableFrom(IRI.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(IRI.class));
        assertTrue(CharSequence.class.isAssignableFrom(IRI.class));
    }

    public void verifyIRI() {
        IRI testSubject0 = mock(IRI.class);
        int result0 = testSubject0.compareTo(_OWLObject);
        int result2 = testSubject0.length();
        char result3 = testSubject0.charAt(_int);
        CharSequence result4 = testSubject0.subSequence(_int, _int);
        boolean result5 = testSubject0.isAbsolute();
        Set<OWLEntity> result6 = testSubject0.getSignature();
        IRI result7 = testSubject0.resolve(_String);
        java.net.URI result8 = testSubject0.toURI();
        String result9 = testSubject0.getScheme();
        String result10 = testSubject0.getFragment();
        OWLObject result11 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result12 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        IRI result14 = IRI.create(_File);
        IRI result15 = IRI.create(_URI);
        IRI result16 = IRI.create(_String, _String);
        IRI result17 = IRI.create(_URL);
        IRI result18 = IRI.create(_String);
        String result20 = testSubject0.getNamespace();
        boolean result21 = testSubject0.isThing();
        boolean result22 = testSubject0.isNothing();
        boolean result23 = testSubject0.isPlainLiteral();
        IRI result24 = IRI.generateDocumentIRI();
        Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.isReservedVocabulary();
        String result35 = testSubject0.toQuotedString();
    }

    public void verifyMissingImportEvent() {
        MissingImportEvent testSubject0 = new MissingImportEvent(_IRI, _OWLOntologyCreationException);
        OWLOntologyCreationException result0 = testSubject0.getCreationException();
        IRI result1 = testSubject0.getImportedOntologyURI();
    }

    @Test
    public void enforceInterfacesMissingImportHandlingStrategy() {
        assertTrue(Enum.class.isAssignableFrom(MissingImportHandlingStrategy.class));
    }

    public void verifyEnumMissingImportHandlingStrategy() {
        MissingImportHandlingStrategy testSubject0 = MissingImportHandlingStrategy.SILENT;
        MissingImportHandlingStrategy testSubject1 = MissingImportHandlingStrategy.THROW_EXCEPTION;
    }

    public void verifyInterfaceMissingImportListener() {
        MissingImportListener testSubject0 = mock(MissingImportListener.class);
        testSubject0.importMissing(_MissingImportEvent);
    }

    @Test
    public void enforceInterfacesNodeID() {
        assertTrue(Comparable.class.isAssignableFrom(NodeID.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(NodeID.class));
    }

    public void verifyNodeID() {
        NodeID testSubject0 = NodeID.getNodeID("");
        int result0 = testSubject0.compareTo(_NodeID);
        String result2 = testSubject0.getID();
        String result3 = NodeID.nodeString(_int);
        String result4 = NodeID.getIRIFromNodeID(_String);
        String result5 = NodeID.nextAnonymousIRI();
        boolean result6 = NodeID.isAnonymousNodeIRI(_IRI);
        boolean result7 = NodeID.isAnonymousNodeIRI(_String);
        boolean result8 = NodeID.isAnonymousNodeID(_String);
        NodeID result9 = NodeID.getNodeID(_String);
    }

    @Test
    public void enforceInterfacesOWLAnnotation() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLAnnotation.class));
    }

    public void verifyInterfaceOWLAnnotation() {
        OWLAnnotation testSubject0 = mock(OWLAnnotation.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLAnnotationValue result1 = testSubject0.getValue();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        OWLObject result3 = testSubject0.accept(_OWLAnnotationObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationObjectVisitor);
        boolean result4 = testSubject0.isDeprecatedIRIAnnotation();
        OWLAnnotation result5 = testSubject0.getAnnotatedAnnotation(_Set35);
        Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLAnnotationAssertionAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationAssertionAxiom() {
        OWLAnnotationAssertionAxiom testSubject0 = mock(OWLAnnotationAssertionAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLAnnotationValue result1 = testSubject0.getValue();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        OWLAnnotationSubject result3 = testSubject0.getSubject();
        boolean result4 = testSubject0.isDeprecatedIRIAssertion();
        OWLAnnotationAssertionAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLAnnotationAxiom.class));
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLAnnotationAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationAxiom() {
        OWLAnnotationAxiom testSubject0 = mock(OWLAnnotationAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLAnnotationAxiomVisitor() {
        OWLAnnotationAxiomVisitor testSubject0 = mock(OWLAnnotationAxiomVisitor.class);
    }

    public void verifyInterfaceOWLAnnotationAxiomVisitorEx() {
        OWLAnnotationAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationAxiomVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObject() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLAnnotationObject.class));
    }

    public void verifyInterfaceOWLAnnotationObject() {
        OWLAnnotationObject testSubject0 = mock(OWLAnnotationObject.class);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObjectVisitor() {
        assertTrue(OWLAnnotationAxiomVisitor.class.isAssignableFrom(OWLAnnotationObjectVisitor.class));
        assertTrue(OWLAnnotationValueVisitor.class.isAssignableFrom(OWLAnnotationObjectVisitor.class));
    }

    public void verifyInterfaceOWLAnnotationObjectVisitor() {
        OWLAnnotationObjectVisitor testSubject0 = mock(OWLAnnotationObjectVisitor.class);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObjectVisitorEx() {
        assertTrue(OWLAnnotationAxiomVisitorEx.class.isAssignableFrom(OWLAnnotationObjectVisitorEx.class));
        assertTrue(OWLAnnotationValueVisitorEx.class.isAssignableFrom(OWLAnnotationObjectVisitorEx.class));
    }

    public void verifyInterfaceOWLAnnotationObjectVisitorEx() {
        OWLAnnotationObjectVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationObjectVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLAnnotationProperty() {
        assertTrue(OWLEntity.class.isAssignableFrom(OWLAnnotationProperty.class));
    }

    public void verifyInterfaceOWLAnnotationProperty() {
        OWLAnnotationProperty testSubject0 = mock(OWLAnnotationProperty.class);
        boolean result6 = testSubject0.isComment();
        boolean result7 = testSubject0.isLabel();
        boolean result8 = testSubject0.isDeprecated();
        boolean result11 = testSubject0.isType(_EntityType);
        OWLObject result12 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result13 = testSubject0.isBuiltIn();
        EntityType<?> result17 = testSubject0.getEntityType();
        boolean result19 = testSubject0.isOWLClass();
        OWLClass result20 = testSubject0.asOWLClass();
        boolean result21 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result22 = testSubject0.asOWLObjectProperty();
        boolean result23 = testSubject0.isOWLDataProperty();
        OWLDataProperty result24 = testSubject0.asOWLDataProperty();
        boolean result25 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result26 = testSubject0.asOWLNamedIndividual();
        boolean result27 = testSubject0.isOWLDatatype();
        OWLDatatype result28 = testSubject0.asOWLDatatype();
        boolean result29 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result30 = testSubject0.asOWLAnnotationProperty();
        String result31 = testSubject0.toStringID();
        Set<OWLEntity> result32 = testSubject0.getSignature();
        OWLObject result33 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result34 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result35 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result36 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result37 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result38 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result39 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result40 = testSubject0.getNestedClassExpressions();
        boolean result41 = testSubject0.isTopEntity();
        boolean result42 = testSubject0.isBottomEntity();
        int result43 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result44 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationPropertyDomainAxiom() {
        OWLAnnotationPropertyDomainAxiom testSubject0 = mock(OWLAnnotationPropertyDomainAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        IRI result1 = testSubject0.getDomain();
        OWLAnnotationPropertyDomainAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationPropertyRangeAxiom() {
        OWLAnnotationPropertyRangeAxiom testSubject0 = mock(OWLAnnotationPropertyRangeAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        IRI result1 = testSubject0.getRange();
        OWLAnnotationPropertyRangeAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnnotationSubject() {
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLAnnotationSubject.class));
    }

    public void verifyInterfaceOWLAnnotationSubject() {
        OWLAnnotationSubject testSubject0 = mock(OWLAnnotationSubject.class);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLAnnotationSubjectVisitor() {
        OWLAnnotationSubjectVisitor testSubject0 = mock(OWLAnnotationSubjectVisitor.class);
    }

    public void verifyInterfaceOWLAnnotationSubjectVisitorEx() {
        OWLAnnotationSubjectVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationSubjectVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLAnnotationValue() {
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLAnnotationValue.class));
    }

    public void verifyInterfaceOWLAnnotationValue() {
        OWLAnnotationValue testSubject0 = mock(OWLAnnotationValue.class);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLAnnotationValueVisitor() {
        OWLAnnotationValueVisitor testSubject0 = mock(OWLAnnotationValueVisitor.class);
    }

    public void verifyInterfaceOWLAnnotationValueVisitorEx() {
        OWLAnnotationValueVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationValueVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLAnonymousClassExpression() {
        assertTrue(OWLClassExpression.class.isAssignableFrom(OWLAnonymousClassExpression.class));
    }

    public void verifyInterfaceOWLAnonymousClassExpression() {
        OWLAnonymousClassExpression testSubject0 = mock(OWLAnonymousClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result1 = testSubject0.isOWLThing();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividual() {
        assertTrue(OWLIndividual.class.isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(OWLAnnotationValue.class.isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(OWLAnnotationSubject.class.isAssignableFrom(OWLAnonymousIndividual.class));
    }

    public void verifyInterfaceOWLAnonymousIndividual() {
        OWLAnonymousIndividual testSubject0 = mock(OWLAnonymousIndividual.class);
        NodeID result0 = testSubject0.getID();
        OWLObject result1 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result2 = testSubject0.isNamed();
        OWLAnonymousIndividual result3 = testSubject0.asOWLAnonymousIndividual();
        boolean result18 = testSubject0.isAnonymous();
        OWLNamedIndividual result19 = testSubject0.asOWLNamedIndividual();
        String result20 = testSubject0.toStringID();
        Set<OWLEntity> result21 = testSubject0.getSignature();
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        int result32 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result33 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result34 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLAsymmetricObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLAsymmetricObjectPropertyAxiom() {
        OWLAsymmetricObjectPropertyAxiom testSubject0 = mock(OWLAsymmetricObjectPropertyAxiom.class);
        OWLAsymmetricObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLAxiom() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLAxiom.class));
    }

    public void verifyInterfaceOWLAxiom() {
        OWLAxiom testSubject0 = mock(OWLAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLAxiomChange() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(OWLAxiomChange.class));
    }

    public void verifyOWLAxiomChange() {
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
            public void accept(OWLOntologyChangeVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {
                return null;
            }
        };
        Set<OWLEntity> result0 = testSubject0.getSignature();
        boolean result1 = testSubject0.isAxiomChange();
        boolean result2 = testSubject0.isImportChange();
        OWLAxiom result4 = testSubject0.getAxiom();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result5 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result6 = testSubject0.isAddAxiom();
        boolean result7 = testSubject0.isRemoveAxiom();
        OWLOntology result8 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result9 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitor() {
        assertTrue(OWLAnnotationAxiomVisitor.class.isAssignableFrom(OWLAxiomVisitor.class));
    }

    public void verifyInterfaceOWLAxiomVisitor() {
        OWLAxiomVisitor testSubject0 = mock(OWLAxiomVisitor.class);
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitorEx() {
        assertTrue(OWLAnnotationAxiomVisitorEx.class.isAssignableFrom(OWLAxiomVisitorEx.class));
    }

    public void verifyInterfaceOWLAxiomVisitorEx() {
        OWLAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLAxiomVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLBooleanClassExpression() {
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLBooleanClassExpression.class));
    }

    public void verifyInterfaceOWLBooleanClassExpression() {
        OWLBooleanClassExpression testSubject0 = mock(OWLBooleanClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result1 = testSubject0.isOWLThing();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLCardinalityRestriction() {
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLCardinalityRestriction() {
        OWLCardinalityRestriction testSubject0 = mock(OWLCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        OWLPropertyRange result2 = testSubject0.getFiller();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result7 = testSubject0.isOWLThing();
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLClass() {
        assertTrue(OWLClassExpression.class.isAssignableFrom(OWLClass.class));
        assertTrue(OWLLogicalEntity.class.isAssignableFrom(OWLClass.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLClass.class));
    }

    public void verifyInterfaceOWLClass() {
        OWLClass testSubject0 = mock(OWLClass.class);
        OWLObject result12 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result13 = testSubject0.isOWLThing();
        ClassExpressionType result14 = testSubject0.getClassExpressionType();
        boolean result15 = testSubject0.isClassExpressionLiteral();
        boolean result16 = testSubject0.isOWLNothing();
        OWLClassExpression result17 = testSubject0.getComplementNNF();
        OWLClassExpression result18 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result19 = testSubject0.asConjunctSet();
        boolean result20 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result21 = testSubject0.asDisjunctSet();
        OWLClassExpression result22 = testSubject0.getNNF();
        boolean result23 = testSubject0.isAnonymous();
        OWLClass result24 = testSubject0.asOWLClass();
        Set<OWLEntity> result25 = testSubject0.getSignature();
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result28 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result29 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result30 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result31 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result32 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result33 = testSubject0.getNestedClassExpressions();
        boolean result34 = testSubject0.isTopEntity();
        boolean result35 = testSubject0.isBottomEntity();
        int result36 = testSubject0.compareTo(_Object36);
        boolean result39 = testSubject0.isType(_EntityType);
        OWLObject result40 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result41 = testSubject0.isBuiltIn();
        EntityType<?> result45 = testSubject0.getEntityType();
        boolean result47 = testSubject0.isOWLClass();
        OWLClass result48 = testSubject0.asOWLClass();
        boolean result49 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result50 = testSubject0.asOWLObjectProperty();
        boolean result51 = testSubject0.isOWLDataProperty();
        OWLDataProperty result52 = testSubject0.asOWLDataProperty();
        boolean result53 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result54 = testSubject0.asOWLNamedIndividual();
        boolean result55 = testSubject0.isOWLDatatype();
        OWLDatatype result56 = testSubject0.asOWLDatatype();
        boolean result57 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result58 = testSubject0.asOWLAnnotationProperty();
        String result59 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result60 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiom() {
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLClassAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLClassAssertionAxiom.class));
    }

    public void verifyInterfaceOWLClassAssertionAxiom() {
        OWLClassAssertionAxiom testSubject0 = mock(OWLClassAssertionAxiom.class);
        OWLIndividual result0 = testSubject0.getIndividual();
        OWLClassExpression result1 = testSubject0.getClassExpression();
        OWLClassAssertionAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLClassAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLClassAxiom.class));
    }

    public void verifyInterfaceOWLClassAxiom() {
        OWLClassAxiom testSubject0 = mock(OWLClassAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLClassExpression() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLClassExpression.class));
        assertTrue(OWLPropertyRange.class.isAssignableFrom(OWLClassExpression.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(OWLClassExpression.class));
    }

    public void verifyInterfaceOWLClassExpression() {
        OWLClassExpression testSubject0 = mock(OWLClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result1 = testSubject0.isOWLThing();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLClassExpressionVisitor() {
        OWLClassExpressionVisitor testSubject0 = mock(OWLClassExpressionVisitor.class);
    }

    public void verifyInterfaceOWLClassExpressionVisitorEx() {
        OWLClassExpressionVisitorEx<OWLObject> testSubject0 = mock(OWLClassExpressionVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFrom() {
        assertTrue(OWLQuantifiedDataRestriction.class.isAssignableFrom(OWLDataAllValuesFrom.class));
    }

    public void verifyInterfaceOWLDataAllValuesFrom() {
        OWLDataAllValuesFrom testSubject0 = mock(OWLDataAllValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataCardinalityRestriction() {
        assertTrue(OWLCardinalityRestriction.class.isAssignableFrom(OWLDataCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLDataCardinalityRestriction() {
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
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataComplementOf() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLDataComplementOf.class));
    }

    public void verifyInterfaceOWLDataComplementOf() {
        OWLDataComplementOf testSubject0 = mock(OWLDataComplementOf.class);
        OWLDataRange result0 = testSubject0.getDataRange();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinality() {
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataExactCardinality.class));
    }

    public void verifyInterfaceOWLDataExactCardinality() {
        OWLDataExactCardinality testSubject0 = mock(OWLDataExactCardinality.class);
        OWLClassExpression result0 = testSubject0.asIntersectionOfMinMax();
        int result1 = testSubject0.getCardinality();
        boolean result2 = testSubject0.isQualified();
        OWLPropertyRange result3 = testSubject0.getFiller();
        OWLPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        OWLObject result7 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result8 = testSubject0.isOWLThing();
        ClassExpressionType result9 = testSubject0.getClassExpressionType();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        OWLClass result19 = testSubject0.asOWLClass();
        Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataFactory() {
        assertTrue(SWRLDataFactory.class.isAssignableFrom(OWLDataFactory.class));
    }

    public void verifyInterfaceOWLDataFactory() {
        OWLDataFactory testSubject0 = mock(OWLDataFactory.class);
        OWLEquivalentClassesAxiom result0 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression, _Set119);
        OWLEquivalentClassesAxiom result1 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLEquivalentClassesAxiom result2 = testSubject0.getOWLEquivalentClassesAxiom(_Set120);
        OWLEquivalentClassesAxiom result3 = testSubject0.getOWLEquivalentClassesAxiom(_Set120, _Set119);
        OWLEquivalentClassesAxiom result4 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression_array);
        OWLDisjointClassesAxiom result5 = testSubject0.getOWLDisjointClassesAxiom(_Set120);
        OWLDisjointClassesAxiom result6 = testSubject0.getOWLDisjointClassesAxiom(_Set120, _Set119);
        OWLDisjointClassesAxiom result7 = testSubject0.getOWLDisjointClassesAxiom(_OWLClassExpression_array);
        OWLClass result8 = testSubject0.getOWLClass(_IRI);
        OWLClass result9 = testSubject0.getOWLClass(_String, _PrefixManager);
        OWLClass result10 = testSubject0.getOWLThing();
        testSubject0.purge();
        OWLNamedIndividual result11 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLNamedIndividual result12 = testSubject0.getOWLNamedIndividual(_String, _PrefixManager);
        OWLObjectInverseOf result13 = testSubject0.getOWLObjectInverseOf(_OWLObjectPropertyExpression);
        OWLDatatype result14 = testSubject0.getTopDatatype();
        OWLObjectProperty result15 = testSubject0.getOWLObjectProperty(_IRI);
        OWLObjectProperty result16 = testSubject0.getOWLObjectProperty(_String, _PrefixManager);
        OWLDataProperty result17 = testSubject0.getOWLDataProperty(_IRI);
        OWLDataProperty result18 = testSubject0.getOWLDataProperty(_String, _PrefixManager);
        OWLClass result19 = testSubject0.getOWLNothing();
        OWLObjectProperty result20 = testSubject0.getOWLTopObjectProperty();
        OWLDataProperty result21 = testSubject0.getOWLTopDataProperty();
        OWLObjectProperty result22 = testSubject0.getOWLBottomObjectProperty();
        OWLDataProperty result23 = testSubject0.getOWLBottomDataProperty();
        OWLAnonymousIndividual result24 = testSubject0.getOWLAnonymousIndividual();
        OWLAnonymousIndividual result25 = testSubject0.getOWLAnonymousIndividual(_String);
        OWLAnnotationProperty result26 = testSubject0.getOWLAnnotationProperty(_String, _PrefixManager);
        OWLAnnotationProperty result27 = testSubject0.getOWLAnnotationProperty(_IRI);
        OWLAnnotationProperty result28 = testSubject0.getRDFSLabel();
        OWLAnnotationProperty result29 = testSubject0.getRDFSComment();
        OWLAnnotationProperty result30 = testSubject0.getRDFSSeeAlso();
        OWLAnnotationProperty result31 = testSubject0.getRDFSIsDefinedBy();
        OWLAnnotationProperty result32 = testSubject0.getOWLVersionInfo();
        OWLAnnotationProperty result33 = testSubject0.getOWLBackwardCompatibleWith();
        OWLAnnotationProperty result34 = testSubject0.getOWLIncompatibleWith();
        OWLAnnotationProperty result35 = testSubject0.getOWLDeprecated();
        OWLDatatype result36 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result37 = testSubject0.getOWLDatatype(_String, _PrefixManager);
        OWLDatatype result38 = testSubject0.getOWLDatatype(_IRI);
        OWLDatatype result39 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result40 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result41 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result42 = testSubject0.getBooleanOWLDatatype();
        OWLLiteral result43 = testSubject0.getOWLLiteral(_String, _String);
        OWLLiteral result44 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result45 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result46 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result47 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result48 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result49 = testSubject0.getOWLLiteral(_String, _OWL2Datatype);
        OWLLiteral result50 = testSubject0.getOWLLiteral(_int);
        OWLDataOneOf result60 = testSubject0.getOWLDataOneOf(_Set127);
        OWLDataOneOf result61 = testSubject0.getOWLDataOneOf(_OWLLiteral_array);
        OWLDataComplementOf result62 = testSubject0.getOWLDataComplementOf(_OWLDataRange);
        OWLDatatypeRestriction result63 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        OWLDatatypeRestriction result64 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _Set131);
        OWLDatatypeRestriction result65 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacet, _OWLLiteral);
        OWLDatatypeRestriction result66 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_int);
        OWLDatatypeRestriction result67 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_double);
        OWLDatatypeRestriction result68 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_int);
        OWLDatatypeRestriction result69 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_double);
        OWLDatatypeRestriction result70 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_int, _int);
        OWLDatatypeRestriction result71 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_double, _double);
        OWLDatatypeRestriction result72 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_double);
        OWLDatatypeRestriction result73 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_int);
        OWLDatatypeRestriction result74 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_double);
        OWLDatatypeRestriction result75 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_int);
        OWLDatatypeRestriction result76 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_double, _double);
        OWLDatatypeRestriction result77 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_int, _int);
        OWLFacetRestriction result78 = testSubject0.getOWLFacetRestriction(_OWLFacet, _OWLLiteral);
        OWLFacetRestriction result79 = testSubject0.getOWLFacetRestriction(_OWLFacet, _double);
        OWLFacetRestriction result80 = testSubject0.getOWLFacetRestriction(_OWLFacet, _int);
        OWLFacetRestriction result81 = testSubject0.getOWLFacetRestriction(_OWLFacet, _float);
        OWLDataUnionOf result82 = testSubject0.getOWLDataUnionOf(_Set133);
        OWLDataUnionOf result83 = testSubject0.getOWLDataUnionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result84 = testSubject0.getOWLDataIntersectionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result85 = testSubject0.getOWLDataIntersectionOf(_Set133);
        OWLObjectIntersectionOf result86 = testSubject0.getOWLObjectIntersectionOf(_OWLClassExpression_array);
        OWLObjectIntersectionOf result87 = testSubject0.getOWLObjectIntersectionOf(_Set120);
        OWLDataSomeValuesFrom result88 = testSubject0.getOWLDataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataAllValuesFrom result89 = testSubject0.getOWLDataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result90 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression);
        OWLDataExactCardinality result91 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMaxCardinality result92 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMaxCardinality result93 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result94 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result95 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression);
        OWLDataHasValue result96 = testSubject0.getOWLDataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObjectComplementOf result97 = testSubject0.getOWLObjectComplementOf(_OWLClassExpression);
        OWLObjectOneOf result98 = testSubject0.getOWLObjectOneOf(_OWLIndividual_array);
        OWLObjectOneOf result99 = testSubject0.getOWLObjectOneOf(_Set136);
        OWLObjectAllValuesFrom result100 = testSubject0.getOWLObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectSomeValuesFrom result101 = testSubject0.getOWLObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result102 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectExactCardinality result103 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMinCardinality result104 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMinCardinality result105 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result106 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result107 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectHasSelf result108 = testSubject0.getOWLObjectHasSelf(_OWLObjectPropertyExpression);
        OWLObjectHasValue result109 = testSubject0.getOWLObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObjectUnionOf result110 = testSubject0.getOWLObjectUnionOf(_OWLClassExpression_array);
        OWLObjectUnionOf result111 = testSubject0.getOWLObjectUnionOf(_Set120);
        OWLDeclarationAxiom result112 = testSubject0.getOWLDeclarationAxiom(_OWLEntity, _Set119);
        OWLDeclarationAxiom result113 = testSubject0.getOWLDeclarationAxiom(_OWLEntity);
        OWLSubClassOfAxiom result114 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLSubClassOfAxiom result115 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression, _Set119);
        OWLDisjointUnionAxiom result116 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set120, _Set119);
        OWLDisjointUnionAxiom result117 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set120);
        OWLSubObjectPropertyOfAxiom result118 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set119);
        OWLSubObjectPropertyOfAxiom result119 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLSubPropertyChainOfAxiom result120 = testSubject0.getOWLSubPropertyChainOfAxiom(_List138, _OWLObjectPropertyExpression, _Set119);
        OWLSubPropertyChainOfAxiom result121 = testSubject0.getOWLSubPropertyChainOfAxiom(_List138, _OWLObjectPropertyExpression);
        OWLEquivalentObjectPropertiesAxiom result122 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLEquivalentObjectPropertiesAxiom result123 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLEquivalentObjectPropertiesAxiom result124 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set119);
        OWLEquivalentObjectPropertiesAxiom result125 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set140, _Set119);
        OWLEquivalentObjectPropertiesAxiom result126 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set140);
        OWLDisjointObjectPropertiesAxiom result127 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result128 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set140, _Set119);
        OWLDisjointObjectPropertiesAxiom result129 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set140);
        OWLInverseObjectPropertiesAxiom result130 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set119);
        OWLInverseObjectPropertiesAxiom result131 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLObjectPropertyDomainAxiom result132 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set119);
        OWLObjectPropertyDomainAxiom result133 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result134 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set119);
        OWLObjectPropertyRangeAxiom result135 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLFunctionalObjectPropertyAxiom result136 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLFunctionalObjectPropertyAxiom result137 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result138 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLInverseFunctionalObjectPropertyAxiom result139 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLReflexiveObjectPropertyAxiom result140 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLReflexiveObjectPropertyAxiom result141 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLIrreflexiveObjectPropertyAxiom result142 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLIrreflexiveObjectPropertyAxiom result143 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLSymmetricObjectPropertyAxiom result144 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLSymmetricObjectPropertyAxiom result145 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result146 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLAsymmetricObjectPropertyAxiom result147 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLTransitiveObjectPropertyAxiom result148 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set119);
        OWLTransitiveObjectPropertyAxiom result149 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLSubDataPropertyOfAxiom result150 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set119);
        OWLSubDataPropertyOfAxiom result151 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result152 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLEquivalentDataPropertiesAxiom result153 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result154 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set119);
        OWLEquivalentDataPropertiesAxiom result155 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set142, _Set119);
        OWLEquivalentDataPropertiesAxiom result156 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set142);
        OWLDisjointDataPropertiesAxiom result157 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set142);
        OWLDisjointDataPropertiesAxiom result158 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set142, _Set119);
        OWLDisjointDataPropertiesAxiom result159 = testSubject0.getOWLDisjointDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLDataPropertyDomainAxiom result160 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression, _Set119);
        OWLDataPropertyDomainAxiom result161 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression);
        OWLDataPropertyRangeAxiom result162 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange, _Set119);
        OWLDataPropertyRangeAxiom result163 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLFunctionalDataPropertyAxiom result164 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression, _Set119);
        OWLFunctionalDataPropertyAxiom result165 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression);
        OWLHasKeyAxiom result166 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set143, _Set119);
        OWLHasKeyAxiom result167 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _OWLPropertyExpression_array);
        OWLHasKeyAxiom result168 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set143);
        OWLDatatypeDefinitionAxiom result169 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange, _Set119);
        OWLDatatypeDefinitionAxiom result170 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange);
        OWLSameIndividualAxiom result171 = testSubject0.getOWLSameIndividualAxiom(_Set136, _Set119);
        OWLSameIndividualAxiom result172 = testSubject0.getOWLSameIndividualAxiom(_OWLIndividual_array);
        OWLSameIndividualAxiom result173 = testSubject0.getOWLSameIndividualAxiom(_Set136);
        OWLDifferentIndividualsAxiom result174 = testSubject0.getOWLDifferentIndividualsAxiom(_Set136, _Set119);
        OWLDifferentIndividualsAxiom result175 = testSubject0.getOWLDifferentIndividualsAxiom(_OWLIndividual_array);
        OWLDifferentIndividualsAxiom result176 = testSubject0.getOWLDifferentIndividualsAxiom(_Set136);
        OWLClassAssertionAxiom result177 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual, _Set119);
        OWLClassAssertionAxiom result178 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual);
        OWLObjectPropertyAssertionAxiom result179 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual, _Set119);
        OWLObjectPropertyAssertionAxiom result180 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeObjectPropertyAssertionAxiom result181 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual,
                _Set119);
        OWLNegativeObjectPropertyAssertionAxiom result182 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLDataPropertyAssertionAxiom result183 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _double);
        OWLDataPropertyAssertionAxiom result184 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _float);
        OWLDataPropertyAssertionAxiom result185 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _boolean);
        OWLDataPropertyAssertionAxiom result186 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _String);
        OWLDataPropertyAssertionAxiom result187 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLDataPropertyAssertionAxiom result188 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set119);
        OWLDataPropertyAssertionAxiom result189 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _int);
        OWLNegativeDataPropertyAssertionAxiom result190 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set119);
        OWLNegativeDataPropertyAssertionAxiom result191 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLAnnotation result192 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue, _Set119);
        OWLAnnotation result193 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        OWLAnnotationAssertionAxiom result194 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation, _Set119);
        OWLAnnotationAssertionAxiom result195 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue, _Set119);
        OWLAnnotationAssertionAxiom result196 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation);
        OWLAnnotationAssertionAxiom result197 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue);
        OWLAnnotationAssertionAxiom result198 = testSubject0.getDeprecatedOWLAnnotationAssertionAxiom(_IRI);
        OWLImportsDeclaration result199 = testSubject0.getOWLImportsDeclaration(_IRI);
        OWLAnnotationPropertyDomainAxiom result200 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI, _Set119);
        OWLAnnotationPropertyDomainAxiom result201 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyRangeAxiom result202 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI, _Set119);
        OWLAnnotationPropertyRangeAxiom result203 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI);
        OWLSubAnnotationPropertyOfAxiom result204 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty, _Set119);
        OWLSubAnnotationPropertyOfAxiom result205 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty);
        OWLObject result206 = testSubject0.getOWLEntity(_EntityType52, _IRI);
        SWRLRule result207 = testSubject0.getSWRLRule(_Set147, _Set147, _Set35);
        SWRLRule result208 = testSubject0.getSWRLRule(_Set147, _Set147);
        SWRLRule result209 = testSubject0.getSWRLRule(_Set147, _Set147);
        SWRLRule result210 = testSubject0.getSWRLRule(_Set147, _Set147);
        SWRLClassAtom result211 = testSubject0.getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        SWRLDataRangeAtom result212 = testSubject0.getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        SWRLObjectPropertyAtom result213 = testSubject0.getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        SWRLDataPropertyAtom result214 = testSubject0.getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        SWRLBuiltInAtom result215 = testSubject0.getSWRLBuiltInAtom(_IRI, _List150);
        SWRLVariable result216 = testSubject0.getSWRLVariable(_IRI);
        SWRLIndividualArgument result217 = testSubject0.getSWRLIndividualArgument(_OWLIndividual);
        SWRLLiteralArgument result218 = testSubject0.getSWRLLiteralArgument(_OWLLiteral);
        SWRLSameIndividualAtom result219 = testSubject0.getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        SWRLDifferentIndividualsAtom result220 = testSubject0.getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
    }

    @Test
    public void enforceInterfacesOWLDataHasValue() {
        assertTrue(OWLHasValueRestriction.class.isAssignableFrom(OWLDataHasValue.class));
    }

    public void verifyInterfaceOWLDataHasValue() {
        OWLDataHasValue testSubject0 = mock(OWLDataHasValue.class);
        OWLClassExpression result1 = testSubject0.asSomeValuesFrom();
        OWLDataPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result6 = testSubject0.isOWLThing();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOf() {
        assertTrue(OWLNaryDataRange.class.isAssignableFrom(OWLDataIntersectionOf.class));
    }

    public void verifyInterfaceOWLDataIntersectionOf() {
        OWLDataIntersectionOf testSubject0 = mock(OWLDataIntersectionOf.class);
        Set<OWLDataRange> result0 = testSubject0.getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinality() {
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataMaxCardinality.class));
    }

    public void verifyInterfaceOWLDataMaxCardinality() {
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
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinality() {
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataMinCardinality.class));
    }

    public void verifyInterfaceOWLDataMinCardinality() {
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
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataOneOf() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLDataOneOf.class));
    }

    public void verifyInterfaceOWLDataOneOf() {
        OWLDataOneOf testSubject0 = mock(OWLDataOneOf.class);
        Set<OWLLiteral> result0 = testSubject0.getValues();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataProperty() {
        assertTrue(OWLDataPropertyExpression.class.isAssignableFrom(OWLDataProperty.class));
        assertTrue(OWLProperty.class.isAssignableFrom(OWLDataProperty.class));
    }

    public void verifyInterfaceOWLDataProperty() {
        OWLDataProperty testSubject0 = mock(OWLDataProperty.class);
        OWLDataProperty result0 = testSubject0.asOWLDataProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result16 = testSubject0.isDataPropertyExpression();
        boolean result17 = testSubject0.isObjectPropertyExpression();
        boolean result18 = testSubject0.isOWLTopObjectProperty();
        boolean result19 = testSubject0.isOWLBottomObjectProperty();
        boolean result20 = testSubject0.isOWLTopDataProperty();
        boolean result21 = testSubject0.isOWLBottomDataProperty();
        boolean result22 = testSubject0.isAnonymous();
        Set<OWLEntity> result23 = testSubject0.getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        int result34 = testSubject0.compareTo(_Object36);
        boolean result37 = testSubject0.isType(_EntityType);
        OWLObject result38 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result39 = testSubject0.isBuiltIn();
        EntityType<?> result43 = testSubject0.getEntityType();
        boolean result45 = testSubject0.isOWLClass();
        OWLClass result46 = testSubject0.asOWLClass();
        boolean result47 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result48 = testSubject0.asOWLObjectProperty();
        boolean result49 = testSubject0.isOWLDataProperty();
        OWLDataProperty result50 = testSubject0.asOWLDataProperty();
        boolean result51 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result52 = testSubject0.asOWLNamedIndividual();
        boolean result53 = testSubject0.isOWLDatatype();
        OWLDatatype result54 = testSubject0.asOWLDatatype();
        boolean result55 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result56 = testSubject0.asOWLAnnotationProperty();
        String result57 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result58 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiom() {
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLDataPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLDataPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyAssertionAxiom() {
        OWLDataPropertyAssertionAxiom testSubject0 = mock(OWLDataPropertyAssertionAxiom.class);
        OWLDataPropertyAssertionAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        OWLObject result2 = testSubject0.getObject();
        OWLIndividual result3 = testSubject0.getSubject();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLDataPropertyAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyAxiom() {
        OWLDataPropertyAxiom testSubject0 = mock(OWLDataPropertyAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyCharacteristicAxiom() {
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiom.class));
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyCharacteristicAxiom() {
        OWLDataPropertyCharacteristicAxiom testSubject0 = mock(OWLDataPropertyCharacteristicAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
        OWLPropertyExpression result25 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiom() {
        assertTrue(OWLPropertyDomainAxiom.class.isAssignableFrom(OWLDataPropertyDomainAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDataPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyDomainAxiom() {
        OWLDataPropertyDomainAxiom testSubject0 = mock(OWLDataPropertyDomainAxiom.class);
        OWLDataPropertyDomainAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassExpression result1 = testSubject0.getDomain();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyExpression() {
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLDataPropertyExpression.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(OWLDataPropertyExpression.class));
    }

    public void verifyInterfaceOWLDataPropertyExpression() {
        OWLDataPropertyExpression testSubject0 = mock(OWLDataPropertyExpression.class);
        OWLDataProperty result0 = testSubject0.asOWLDataProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result16 = testSubject0.isDataPropertyExpression();
        boolean result17 = testSubject0.isObjectPropertyExpression();
        boolean result18 = testSubject0.isOWLTopObjectProperty();
        boolean result19 = testSubject0.isOWLBottomObjectProperty();
        boolean result20 = testSubject0.isOWLTopDataProperty();
        boolean result21 = testSubject0.isOWLBottomDataProperty();
        boolean result22 = testSubject0.isAnonymous();
        Set<OWLEntity> result23 = testSubject0.getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        int result34 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiom() {
        assertTrue(OWLPropertyRangeAxiom.class.isAssignableFrom(OWLDataPropertyRangeAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDataPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyRangeAxiom() {
        OWLDataPropertyRangeAxiom testSubject0 = mock(OWLDataPropertyRangeAxiom.class);
        OWLDataPropertyRangeAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataRange result1 = testSubject0.getRange();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLDataRange() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLDataRange.class));
        assertTrue(OWLPropertyRange.class.isAssignableFrom(OWLDataRange.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(OWLDataRange.class));
    }

    public void verifyInterfaceOWLDataRange() {
        OWLDataRange testSubject0 = mock(OWLDataRange.class);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result2 = testSubject0.isDatatype();
        boolean result3 = testSubject0.isTopDatatype();
        DataRangeType result4 = testSubject0.getDataRangeType();
        OWLDatatype result5 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLDataRangeVisitor() {
        OWLDataRangeVisitor testSubject0 = mock(OWLDataRangeVisitor.class);
    }

    public void verifyInterfaceOWLDataRangeVisitorEx() {
        OWLDataRangeVisitorEx<OWLObject> testSubject0 = mock(OWLDataRangeVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFrom() {
        assertTrue(OWLQuantifiedDataRestriction.class.isAssignableFrom(OWLDataSomeValuesFrom.class));
    }

    public void verifyInterfaceOWLDataSomeValuesFrom() {
        OWLDataSomeValuesFrom testSubject0 = mock(OWLDataSomeValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDatatype() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLDatatype.class));
        assertTrue(OWLLogicalEntity.class.isAssignableFrom(OWLDatatype.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLDatatype.class));
    }

    public void verifyInterfaceOWLDatatype() {
        OWLDatatype testSubject0 = mock(OWLDatatype.class);
        boolean result0 = testSubject0.isString();
        org.semanticweb.owlapi.vocab.OWL2Datatype result1 = testSubject0.getBuiltInDatatype();
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
        DataRangeType result11 = testSubject0.getDataRangeType();
        OWLDatatype result12 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
        boolean result27 = testSubject0.isType(_EntityType);
        OWLObject result28 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result29 = testSubject0.isBuiltIn();
        EntityType<?> result33 = testSubject0.getEntityType();
        boolean result35 = testSubject0.isOWLClass();
        OWLClass result36 = testSubject0.asOWLClass();
        boolean result37 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result38 = testSubject0.asOWLObjectProperty();
        boolean result39 = testSubject0.isOWLDataProperty();
        OWLDataProperty result40 = testSubject0.asOWLDataProperty();
        boolean result41 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result42 = testSubject0.asOWLNamedIndividual();
        boolean result43 = testSubject0.isOWLDatatype();
        OWLDatatype result44 = testSubject0.asOWLDatatype();
        boolean result45 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result46 = testSubject0.asOWLAnnotationProperty();
        String result47 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result48 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLDatatypeDefinitionAxiom.class));
    }

    public void verifyInterfaceOWLDatatypeDefinitionAxiom() {
        OWLDatatypeDefinitionAxiom testSubject0 = mock(OWLDatatypeDefinitionAxiom.class);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLDataRange result1 = testSubject0.getDataRange();
        OWLDatatype result2 = testSubject0.getDatatype();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestriction() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLDatatypeRestriction.class));
    }

    public void verifyInterfaceOWLDatatypeRestriction() {
        OWLDatatypeRestriction testSubject0 = mock(OWLDatatypeRestriction.class);
        OWLDatatype result0 = testSubject0.getDatatype();
        Set<OWLFacetRestriction> result1 = testSubject0.getFacetRestrictions();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        DataRangeType result6 = testSubject0.getDataRangeType();
        OWLDatatype result7 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result8 = testSubject0.getSignature();
        OWLObject result9 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        int result19 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataUnionOf() {
        assertTrue(OWLNaryDataRange.class.isAssignableFrom(OWLDataUnionOf.class));
    }

    public void verifyInterfaceOWLDataUnionOf() {
        OWLDataUnionOf testSubject0 = mock(OWLDataUnionOf.class);
        Set<OWLDataRange> result0 = testSubject0.getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDataVisitor() {
        assertTrue(OWLDataRangeVisitor.class.isAssignableFrom(OWLDataVisitor.class));
    }

    public void verifyInterfaceOWLDataVisitor() {
        OWLDataVisitor testSubject0 = mock(OWLDataVisitor.class);
    }

    public void verifyInterfaceOWLDataVisitorEx() {
        OWLDataVisitorEx<OWLObject> testSubject0 = mock(OWLDataVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLDeclarationAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLDeclarationAxiom.class));
    }

    public void verifyInterfaceOWLDeclarationAxiom() {
        OWLDeclarationAxiom testSubject0 = mock(OWLDeclarationAxiom.class);
        OWLDeclarationAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLEntity result1 = testSubject0.getEntity();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiom() {
        assertTrue(OWLNaryIndividualAxiom.class.isAssignableFrom(OWLDifferentIndividualsAxiom.class));
    }

    public void verifyInterfaceOWLDifferentIndividualsAxiom() {
        OWLDifferentIndividualsAxiom testSubject0 = mock(OWLDifferentIndividualsAxiom.class);
        Set<OWLDifferentIndividualsAxiom> result0 = testSubject0.asPairwiseAxioms();
        boolean result1 = testSubject0.containsAnonymousIndividuals();
        OWLDifferentIndividualsAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLIndividual> result3 = testSubject0.getIndividuals();
        List<OWLIndividual> result4 = testSubject0.getIndividualsAsList();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
        Set<OWLSubClassOfAxiom> result30 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiom() {
        assertTrue(OWLNaryClassAxiom.class.isAssignableFrom(OWLDisjointClassesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointClassesAxiom() {
        OWLDisjointClassesAxiom testSubject0 = mock(OWLDisjointClassesAxiom.class);
        Set<OWLDisjointClassesAxiom> result0 = testSubject0.asPairwiseAxioms();
        OWLDisjointClassesAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        boolean result2 = testSubject0.contains(_OWLClassExpression);
        Set<OWLClassExpression> result3 = testSubject0.getClassExpressions();
        List<OWLClassExpression> result4 = testSubject0.getClassExpressionsAsList();
        Set<OWLClassExpression> result5 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
        Set<OWLSubClassOfAxiom> result31 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLDisjointDataPropertiesAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDisjointDataPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointDataPropertiesAxiom() {
        OWLDisjointDataPropertiesAxiom testSubject0 = mock(OWLDisjointDataPropertiesAxiom.class);
        OWLDisjointDataPropertiesAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLDataPropertyExpression> result1 = testSubject0.getProperties();
        Set<OWLDataPropertyExpression> result2 = testSubject0.getPropertiesMinus(_OWLDataPropertyExpression);
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointObjectPropertiesAxiom() {
        OWLDisjointObjectPropertiesAxiom testSubject0 = mock(OWLDisjointObjectPropertiesAxiom.class);
        OWLDisjointObjectPropertiesAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLObjectPropertyExpression> result1 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result2 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionAxiom() {
        assertTrue(OWLClassAxiom.class.isAssignableFrom(OWLDisjointUnionAxiom.class));
    }

    public void verifyInterfaceOWLDisjointUnionAxiom() {
        OWLDisjointUnionAxiom testSubject0 = mock(OWLDisjointUnionAxiom.class);
        Set<OWLClassExpression> result0 = testSubject0.getClassExpressions();
        OWLEquivalentClassesAxiom result1 = testSubject0.getOWLEquivalentClassesAxiom();
        OWLDisjointClassesAxiom result2 = testSubject0.getOWLDisjointClassesAxiom();
        OWLClass result3 = testSubject0.getOWLClass();
        OWLDisjointUnionAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLEntity() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLEntity.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLEntity.class));
    }

    public void verifyInterfaceOWLEntity() {
        OWLEntity testSubject0 = mock(OWLEntity.class);
        boolean result2 = testSubject0.isType(_EntityType);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result4 = testSubject0.isBuiltIn();
        EntityType<?> result8 = testSubject0.getEntityType();
        boolean result10 = testSubject0.isOWLClass();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result13 = testSubject0.asOWLObjectProperty();
        boolean result14 = testSubject0.isOWLDataProperty();
        OWLDataProperty result15 = testSubject0.asOWLDataProperty();
        boolean result16 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result17 = testSubject0.asOWLNamedIndividual();
        boolean result18 = testSubject0.isOWLDatatype();
        OWLDatatype result19 = testSubject0.asOWLDatatype();
        boolean result20 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result21 = testSubject0.asOWLAnnotationProperty();
        String result22 = testSubject0.toStringID();
        Set<OWLEntity> result23 = testSubject0.getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        int result34 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result35 = testSubject0.getIRI();
    }

    public void verifyInterfaceOWLEntityVisitor() {
        OWLEntityVisitor testSubject0 = mock(OWLEntityVisitor.class);
    }

    public void verifyInterfaceOWLEntityVisitorEx() {
        OWLEntityVisitorEx<OWLObject> testSubject0 = mock(OWLEntityVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiom() {
        assertTrue(OWLNaryClassAxiom.class.isAssignableFrom(OWLEquivalentClassesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentClassesAxiom() {
        OWLEquivalentClassesAxiom testSubject0 = mock(OWLEquivalentClassesAxiom.class);
        boolean result0 = testSubject0.containsOWLThing();
        boolean result1 = testSubject0.containsOWLNothing();
        Set<OWLClass> result2 = testSubject0.getNamedClasses();
        boolean result3 = testSubject0.containsNamedEquivalentClass();
        Set<OWLEquivalentClassesAxiom> result4 = testSubject0.asPairwiseAxioms();
        OWLEquivalentClassesAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        boolean result6 = testSubject0.contains(_OWLClassExpression);
        Set<OWLClassExpression> result7 = testSubject0.getClassExpressions();
        List<OWLClassExpression> result8 = testSubject0.getClassExpressionsAsList();
        Set<OWLClassExpression> result9 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        Set<OWLAnnotation> result10 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result12 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result13 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result14 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result16 = testSubject0.isLogicalAxiom();
        boolean result17 = testSubject0.isAnnotationAxiom();
        boolean result18 = testSubject0.isAnnotated();
        AxiomType<?> result19 = testSubject0.getAxiomType();
        boolean result20 = testSubject0.isOfType(_Set40);
        boolean result21 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result22 = testSubject0.getNNF();
        Set<OWLEntity> result23 = testSubject0.getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        int result34 = testSubject0.compareTo(_Object36);
        Set<OWLSubClassOfAxiom> result35 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentDataPropertiesAxiom() {
        OWLEquivalentDataPropertiesAxiom testSubject0 = mock(OWLEquivalentDataPropertiesAxiom.class);
        Set<OWLSubDataPropertyOfAxiom> result0 = testSubject0.asSubDataPropertyOfAxioms();
        OWLEquivalentDataPropertiesAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLDataPropertyExpression> result2 = testSubject0.getProperties();
        Set<OWLDataPropertyExpression> result3 = testSubject0.getPropertiesMinus(_OWLDataPropertyExpression);
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentObjectPropertiesAxiom() {
        OWLEquivalentObjectPropertiesAxiom testSubject0 = mock(OWLEquivalentObjectPropertiesAxiom.class);
        Set<OWLSubObjectPropertyOfAxiom> result0 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLEquivalentObjectPropertiesAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLObjectPropertyExpression> result2 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result3 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLException() {
        assertTrue(Exception.class.isAssignableFrom(OWLException.class));
    }

    public void verifyOWLException() {
        OWLException testSubject0 = new OWLException(_Throwable);
        OWLException testSubject1 = new OWLException(_String, _Throwable);
        OWLException testSubject2 = new OWLException(_String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLFacetRestriction() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLFacetRestriction.class));
    }

    public void verifyInterfaceOWLFacetRestriction() {
        OWLFacetRestriction testSubject0 = mock(OWLFacetRestriction.class);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        OWLLiteral result1 = testSubject0.getFacetValue();
        org.semanticweb.owlapi.vocab.OWLFacet result2 = testSubject0.getFacet();
        Set<OWLEntity> result3 = testSubject0.getSignature();
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result5 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result7 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result8 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result9 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result10 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result11 = testSubject0.getNestedClassExpressions();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        int result14 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiom() {
        assertTrue(OWLDataPropertyCharacteristicAxiom.class.isAssignableFrom(OWLFunctionalDataPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLFunctionalDataPropertyAxiom.class));
    }

    public void verifyInterfaceOWLFunctionalDataPropertyAxiom() {
        OWLFunctionalDataPropertyAxiom testSubject0 = mock(OWLFunctionalDataPropertyAxiom.class);
        OWLFunctionalDataPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLPropertyExpression result26 = testSubject0.getProperty();
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLFunctionalObjectPropertyAxiom() {
        OWLFunctionalObjectPropertyAxiom testSubject0 = mock(OWLFunctionalObjectPropertyAxiom.class);
        OWLFunctionalObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLHasKeyAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLHasKeyAxiom.class));
    }

    public void verifyInterfaceOWLHasKeyAxiom() {
        OWLHasKeyAxiom testSubject0 = mock(OWLHasKeyAxiom.class);
        OWLClassExpression result0 = testSubject0.getClassExpression();
        Set<OWLPropertyExpression> result1 = testSubject0.getPropertyExpressions();
        Set<OWLObjectPropertyExpression> result2 = testSubject0.getObjectPropertyExpressions();
        Set<OWLDataPropertyExpression> result3 = testSubject0.getDataPropertyExpressions();
        OWLHasKeyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLHasValueRestriction() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLHasValueRestriction.class));
    }

    public void verifyInterfaceOWLHasValueRestriction() {
        OWLHasValueRestriction testSubject0 = mock(OWLHasValueRestriction.class);
        OWLClassExpression result1 = testSubject0.asSomeValuesFrom();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result6 = testSubject0.isOWLThing();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLImportsDeclaration() {
        assertTrue(Comparable.class.isAssignableFrom(OWLImportsDeclaration.class));
    }

    public void verifyInterfaceOWLImportsDeclaration() {
        OWLImportsDeclaration testSubject0 = mock(OWLImportsDeclaration.class);
        IRI result0 = testSubject0.getIRI();
        int result2 = testSubject0.compareTo(mock(OWLImportsDeclaration.class));
    }

    @Test
    public void enforceInterfacesOWLIndividual() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLIndividual.class));
        assertTrue(OWLPropertyAssertionObject.class.isAssignableFrom(OWLIndividual.class));
    }

    public void verifyInterfaceOWLIndividual() {
        OWLIndividual testSubject0 = mock(OWLIndividual.class);
        OWLObject result0 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result1 = testSubject0.isNamed();
        OWLAnonymousIndividual result2 = testSubject0.asOWLAnonymousIndividual();
        boolean result17 = testSubject0.isAnonymous();
        OWLNamedIndividual result18 = testSubject0.asOWLNamedIndividual();
        String result19 = testSubject0.toStringID();
        Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLIndividualAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLIndividualAxiom.class));
    }

    public void verifyInterfaceOWLIndividualAxiom() {
        OWLIndividualAxiom testSubject0 = mock(OWLIndividualAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLIndividualVisitor() {
        OWLIndividualVisitor testSubject0 = mock(OWLIndividualVisitor.class);
    }

    public void verifyInterfaceOWLIndividualVisitorEx() {
        OWLIndividualVisitorEx<OWLObject> testSubject0 = mock(OWLIndividualVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLInverseFunctionalObjectPropertyAxiom() {
        OWLInverseFunctionalObjectPropertyAxiom testSubject0 = mock(OWLInverseFunctionalObjectPropertyAxiom.class);
        OWLInverseFunctionalObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLInverseObjectPropertiesAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLInverseObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLInverseObjectPropertiesAxiom() {
        OWLInverseObjectPropertiesAxiom testSubject0 = mock(OWLInverseObjectPropertiesAxiom.class);
        OWLObjectPropertyExpression result0 = testSubject0.getSecondProperty();
        Set<OWLSubObjectPropertyOfAxiom> result1 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLObjectPropertyExpression result2 = testSubject0.getFirstProperty();
        OWLInverseObjectPropertiesAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLObjectPropertyExpression> result4 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result5 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLIrreflexiveObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLIrreflexiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLIrreflexiveObjectPropertyAxiom() {
        OWLIrreflexiveObjectPropertyAxiom testSubject0 = mock(OWLIrreflexiveObjectPropertyAxiom.class);
        OWLIrreflexiveObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLLiteral() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLAnnotationValue.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLPropertyAssertionObject.class.isAssignableFrom(OWLLiteral.class));
    }

    public void verifyInterfaceOWLLiteral() {
        OWLLiteral testSubject0 = mock(OWLLiteral.class);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        String result4 = testSubject0.getLiteral();
        boolean result5 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result6 = testSubject0.getDatatype();
        boolean result7 = testSubject0.hasLang();
        boolean result8 = testSubject0.hasLang(_String);
        String result9 = testSubject0.getLang();
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result27 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
    }

    @Test
    public void enforceInterfacesOWLLogicalAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLLogicalAxiom.class));
    }

    public void verifyInterfaceOWLLogicalAxiom() {
        OWLLogicalAxiom testSubject0 = mock(OWLLogicalAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLLogicalAxiomVisitor() {
        OWLLogicalAxiomVisitor testSubject0 = mock(OWLLogicalAxiomVisitor.class);
    }

    public void verifyInterfaceOWLLogicalAxiomVisitorEx() {
        OWLLogicalAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLLogicalAxiomVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLLogicalEntity() {
        assertTrue(OWLEntity.class.isAssignableFrom(OWLLogicalEntity.class));
    }

    public void verifyInterfaceOWLLogicalEntity() {
        OWLLogicalEntity testSubject0 = mock(OWLLogicalEntity.class);
        boolean result2 = testSubject0.isType(_EntityType);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result4 = testSubject0.isBuiltIn();
        EntityType<?> result8 = testSubject0.getEntityType();
        boolean result10 = testSubject0.isOWLClass();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result13 = testSubject0.asOWLObjectProperty();
        boolean result14 = testSubject0.isOWLDataProperty();
        OWLDataProperty result15 = testSubject0.asOWLDataProperty();
        boolean result16 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result17 = testSubject0.asOWLNamedIndividual();
        boolean result18 = testSubject0.isOWLDatatype();
        OWLDatatype result19 = testSubject0.asOWLDatatype();
        boolean result20 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result21 = testSubject0.asOWLAnnotationProperty();
        String result22 = testSubject0.toStringID();
        Set<OWLEntity> result23 = testSubject0.getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        int result34 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result35 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLMutableOntology() {
        assertTrue(OWLOntology.class.isAssignableFrom(OWLMutableOntology.class));
    }

    public void verifyInterfaceOWLMutableOntology() {
        OWLMutableOntology testSubject0 = mock(OWLMutableOntology.class);
        List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_List163);
        ChangeApplied result1 = testSubject0.applyChange(_OWLOntologyChange);
        boolean result2 = testSubject0.isEmpty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLEntity> result4 = testSubject0.getSignature();
        Set<OWLEntity> result5 = testSubject0.getSignature(Imports.INCLUDED);
        OWLOntologyID result6 = testSubject0.getOntologyID();
        Set<OWLClass> result7 = testSubject0.getClassesInSignature(Imports.INCLUDED);
        Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature(Imports.INCLUDED);
        Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature(Imports.INCLUDED);
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature(Imports.INCLUDED);
        Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature(Imports.INCLUDED);
        boolean result17 = testSubject0.isAnonymous();
        OWLOntologyManager result18 = testSubject0.getOWLOntologyManager();
        Set<IRI> result19 = testSubject0.getDirectImportsDocuments();
        Set<OWLOntology> result20 = testSubject0.getDirectImports();
        Set<OWLOntology> result21 = testSubject0.getImports();
        Set<OWLOntology> result22 = testSubject0.getImportsClosure();
        Set<OWLImportsDeclaration> result23 = testSubject0.getImportsDeclarations();
        Set<OWLClassAxiom> result24 = testSubject0.getAxioms(_OWLClass, Imports.EXCLUDED);
        Set<T> result25 = testSubject0.getAxioms(_AxiomType);
        Set<OWLAxiom> result26 = testSubject0.getAxioms();
        Set<OWLDataPropertyAxiom> result27 = testSubject0.getAxioms(_OWLDataProperty, Imports.EXCLUDED);
        Set<OWLIndividualAxiom> result28 = testSubject0.getAxioms(_OWLIndividual, Imports.EXCLUDED);
        Set<OWLAnnotationAxiom> result29 = testSubject0.getAxioms(_OWLAnnotationProperty, Imports.EXCLUDED);
        Set<OWLDatatypeDefinitionAxiom> result30 = testSubject0.getAxioms(_OWLDatatype, Imports.EXCLUDED);
        Set<OWLObjectPropertyAxiom> result31 = testSubject0.getAxioms(_OWLObjectPropertyExpression, Imports.EXCLUDED);
        Set<T> result32 = testSubject0.getAxioms(_AxiomType, Imports.EXCLUDED);
        int result33 = testSubject0.getAxiomCount();
        int result34 = testSubject0.getAxiomCount(_AxiomType, Imports.EXCLUDED);
        int result35 = testSubject0.getAxiomCount(_AxiomType);
        Set<OWLLogicalAxiom> result36 = testSubject0.getLogicalAxioms();
        int result37 = testSubject0.getLogicalAxiomCount();
        boolean result41 = testSubject0.containsAxiom(_OWLAxiom);
        boolean result42 = testSubject0.containsAxiom(_OWLAxiom, Imports.EXCLUDED, Search.IGNORE_ANNOTATIONS);
        Set<OWLClassAxiom> result47 = testSubject0.getGeneralClassAxioms();
        Set<OWLAnonymousIndividual> result48 = testSubject0.getReferencedAnonymousIndividuals(Imports.EXCLUDED);
        boolean result53 = testSubject0.containsEntityInSignature(_IRI, Imports.INCLUDED);
        boolean result54 = testSubject0.containsEntityInSignature(_IRI, Imports.INCLUDED);
        boolean result55 = testSubject0.containsEntityInSignature(_OWLEntity, Imports.INCLUDED);
        boolean result56 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result57 = testSubject0.isDeclared(_OWLEntity);
        boolean result58 = testSubject0.isDeclared(_OWLEntity, Imports.INCLUDED);
        boolean result60 = testSubject0.containsClassInSignature(_IRI, Imports.INCLUDED);
        boolean result61 = testSubject0.containsObjectPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result62 = testSubject0.containsObjectPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result63 = testSubject0.containsDataPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result65 = testSubject0.containsAnnotationPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result67 = testSubject0.containsIndividualInSignature(_IRI, Imports.INCLUDED);
        boolean result69 = testSubject0.containsDatatypeInSignature(_IRI, Imports.INCLUDED);
        Set<OWLEntity> result71 = testSubject0.getEntitiesInSignature(_IRI, Imports.INCLUDED);
        Set<OWLEntity> result72 = testSubject0.getEntitiesInSignature(_IRI);
        Set<OWLSubAnnotationPropertyOfAxiom> result73 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        Set<OWLAnnotationPropertyDomainAxiom> result74 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        Set<OWLAnnotationPropertyRangeAxiom> result75 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        Set<OWLDeclarationAxiom> result76 = testSubject0.getDeclarationAxioms(_OWLEntity);
        Set<OWLAnnotationAssertionAxiom> result77 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        Set<OWLSubClassOfAxiom> result78 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        Set<OWLSubClassOfAxiom> result79 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        Set<OWLEquivalentClassesAxiom> result80 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        Set<OWLDisjointClassesAxiom> result81 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        Set<OWLDisjointUnionAxiom> result82 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        Set<OWLHasKeyAxiom> result83 = testSubject0.getHasKeyAxioms(_OWLClass);
        Set<OWLSubObjectPropertyOfAxiom> result84 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        Set<OWLSubObjectPropertyOfAxiom> result85 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        Set<OWLObjectPropertyDomainAxiom> result86 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        Set<OWLObjectPropertyRangeAxiom> result87 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        Set<OWLInverseObjectPropertiesAxiom> result88 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLEquivalentObjectPropertiesAxiom> result89 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        Set<OWLDisjointObjectPropertiesAxiom> result90 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        Set<OWLFunctionalObjectPropertyAxiom> result91 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLInverseFunctionalObjectPropertyAxiom> result92 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLSymmetricObjectPropertyAxiom> result93 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLAsymmetricObjectPropertyAxiom> result94 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLReflexiveObjectPropertyAxiom> result95 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLIrreflexiveObjectPropertyAxiom> result96 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLTransitiveObjectPropertyAxiom> result97 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLSubDataPropertyOfAxiom> result98 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        Set<OWLSubDataPropertyOfAxiom> result99 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        Set<OWLDataPropertyDomainAxiom> result100 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        Set<OWLDataPropertyRangeAxiom> result101 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        Set<OWLEquivalentDataPropertiesAxiom> result102 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        Set<OWLDisjointDataPropertiesAxiom> result103 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        Set<OWLFunctionalDataPropertyAxiom> result104 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        Set<OWLClassAssertionAxiom> result105 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        Set<OWLClassAssertionAxiom> result106 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        Set<OWLDataPropertyAssertionAxiom> result107 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLObjectPropertyAssertionAxiom> result108 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLNegativeObjectPropertyAssertionAxiom> result109 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLNegativeDataPropertyAssertionAxiom> result110 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLSameIndividualAxiom> result111 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        Set<OWLDifferentIndividualsAxiom> result112 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        Set<OWLDatatypeDefinitionAxiom> result113 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
        OWLObject result114 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLAnonymousIndividual> result115 = testSubject0.getAnonymousIndividuals();
        Set<OWLClassExpression> result116 = testSubject0.getNestedClassExpressions();
        boolean result117 = testSubject0.isTopEntity();
        boolean result118 = testSubject0.isBottomEntity();
        int result119 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNamedIndividual() {
        assertTrue(OWLIndividual.class.isAssignableFrom(OWLNamedIndividual.class));
        assertTrue(OWLLogicalEntity.class.isAssignableFrom(OWLNamedIndividual.class));
    }

    public void verifyInterfaceOWLNamedIndividual() {
        OWLNamedIndividual testSubject0 = mock(OWLNamedIndividual.class);
        OWLObject result0 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result1 = testSubject0.isNamed();
        OWLAnonymousIndividual result2 = testSubject0.asOWLAnonymousIndividual();
        boolean result17 = testSubject0.isAnonymous();
        OWLNamedIndividual result18 = testSubject0.asOWLNamedIndividual();
        String result19 = testSubject0.toStringID();
        Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object36);
        boolean result34 = testSubject0.isType(_EntityType);
        OWLObject result35 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result36 = testSubject0.isBuiltIn();
        EntityType<?> result40 = testSubject0.getEntityType();
        boolean result42 = testSubject0.isOWLClass();
        OWLClass result43 = testSubject0.asOWLClass();
        boolean result44 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result45 = testSubject0.asOWLObjectProperty();
        boolean result46 = testSubject0.isOWLDataProperty();
        OWLDataProperty result47 = testSubject0.asOWLDataProperty();
        boolean result48 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result49 = testSubject0.asOWLNamedIndividual();
        boolean result50 = testSubject0.isOWLDatatype();
        OWLDatatype result51 = testSubject0.asOWLDatatype();
        boolean result52 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result53 = testSubject0.asOWLAnnotationProperty();
        String result54 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result55 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLNamedObject() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLNamedObject.class));
    }

    public void verifyInterfaceOWLNamedObject() {
        OWLNamedObject testSubject0 = mock(OWLNamedObject.class);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result0 = testSubject0.getIRI();
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLNamedObjectVisitor() {
        OWLNamedObjectVisitor testSubject0 = mock(OWLNamedObjectVisitor.class);
    }

    public void verifyInterfaceOWLNamedObjectVisitorEx() {
        OWLNamedObjectVisitorEx<OWLObject> testSubject0 = mock(OWLNamedObjectVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLNaryAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLNaryAxiom.class));
    }

    public void verifyInterfaceOWLNaryAxiom() {
        OWLNaryAxiom testSubject0 = mock(OWLNaryAxiom.class);
        Set<? extends OWLNaryAxiom> result0 = testSubject0.asPairwiseAxioms();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNaryBooleanClassExpression() {
        assertTrue(OWLBooleanClassExpression.class.isAssignableFrom(OWLNaryBooleanClassExpression.class));
    }

    public void verifyInterfaceOWLNaryBooleanClassExpression() {
        OWLNaryBooleanClassExpression testSubject0 = mock(OWLNaryBooleanClassExpression.class);
        List<OWLClassExpression> result0 = testSubject0.getOperandsAsList();
        Set<OWLClassExpression> result1 = testSubject0.getOperands();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNaryClassAxiom() {
        assertTrue(OWLClassAxiom.class.isAssignableFrom(OWLNaryClassAxiom.class));
        assertTrue(OWLNaryAxiom.class.isAssignableFrom(OWLNaryClassAxiom.class));
        assertTrue(OWLSubClassOfAxiomSetShortCut.class.isAssignableFrom(OWLNaryClassAxiom.class));
    }

    public void verifyInterfaceOWLNaryClassAxiom() {
        OWLNaryClassAxiom testSubject0 = mock(OWLNaryClassAxiom.class);
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        Set<OWLClassExpression> result1 = testSubject0.getClassExpressions();
        List<OWLClassExpression> result2 = testSubject0.getClassExpressionsAsList();
        Set<OWLClassExpression> result3 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
        Set<? extends OWLNaryAxiom> result29 = testSubject0.asPairwiseAxioms();
        Set<OWLSubClassOfAxiom> result30 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryDataRange() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLNaryDataRange.class));
    }

    public void verifyInterfaceOWLNaryDataRange() {
        OWLNaryDataRange testSubject0 = mock(OWLNaryDataRange.class);
        Set<OWLDataRange> result0 = testSubject0.getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNaryIndividualAxiom() {
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLNaryIndividualAxiom.class));
        assertTrue(OWLNaryAxiom.class.isAssignableFrom(OWLNaryIndividualAxiom.class));
        assertTrue(OWLSubClassOfAxiomSetShortCut.class.isAssignableFrom(OWLNaryIndividualAxiom.class));
    }

    public void verifyInterfaceOWLNaryIndividualAxiom() {
        OWLNaryIndividualAxiom testSubject0 = mock(OWLNaryIndividualAxiom.class);
        Set<OWLIndividual> result0 = testSubject0.getIndividuals();
        List<OWLIndividual> result1 = testSubject0.getIndividualsAsList();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
        Set<? extends OWLNaryAxiom> result27 = testSubject0.asPairwiseAxioms();
        Set<OWLSubClassOfAxiom> result28 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLNaryPropertyAxiom.class));
    }

    public void verifyInterfaceOWLNaryPropertyAxiom() {
        OWLNaryPropertyAxiom testSubject0 = mock(OWLNaryPropertyAxiom.class);
        Set<OWLObjectPropertyExpression> result0 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result1 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiom() {
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLNegativeDataPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLNegativeDataPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLNegativeDataPropertyAssertionAxiom() {
        OWLNegativeDataPropertyAssertionAxiom testSubject0 = mock(OWLNegativeDataPropertyAssertionAxiom.class);
        boolean result0 = testSubject0.containsAnonymousIndividuals();
        OWLNegativeDataPropertyAssertionAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        OWLObject result3 = testSubject0.getObject();
        OWLIndividual result4 = testSubject0.getSubject();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiom() {
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLNegativeObjectPropertyAssertionAxiom() {
        OWLNegativeObjectPropertyAssertionAxiom testSubject0 = mock(OWLNegativeObjectPropertyAssertionAxiom.class);
        boolean result0 = testSubject0.containsAnonymousIndividuals();
        OWLNegativeObjectPropertyAssertionAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        OWLObject result3 = testSubject0.getObject();
        OWLIndividual result4 = testSubject0.getSubject();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObject() {
        assertTrue(Comparable.class.isAssignableFrom(OWLObject.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObject.class));
    }

    public void verifyInterfaceOWLObject() {
        OWLObject testSubject0 = mock(OWLObject.class);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFrom() {
        assertTrue(OWLQuantifiedObjectRestriction.class.isAssignableFrom(OWLObjectAllValuesFrom.class));
    }

    public void verifyInterfaceOWLObjectAllValuesFrom() {
        OWLObjectAllValuesFrom testSubject0 = mock(OWLObjectAllValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectCardinalityRestriction() {
        assertTrue(OWLCardinalityRestriction.class.isAssignableFrom(OWLObjectCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLObjectCardinalityRestriction() {
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
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOf() {
        assertTrue(OWLBooleanClassExpression.class.isAssignableFrom(OWLObjectComplementOf.class));
    }

    public void verifyInterfaceOWLObjectComplementOf() {
        OWLObjectComplementOf testSubject0 = mock(OWLObjectComplementOf.class);
        OWLClassExpression result0 = testSubject0.getOperand();
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result2 = testSubject0.isOWLThing();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        OWLClass result13 = testSubject0.asOWLClass();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinality() {
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectExactCardinality.class));
    }

    public void verifyInterfaceOWLObjectExactCardinality() {
        OWLObjectExactCardinality testSubject0 = mock(OWLObjectExactCardinality.class);
        OWLClassExpression result0 = testSubject0.asIntersectionOfMinMax();
        int result1 = testSubject0.getCardinality();
        boolean result2 = testSubject0.isQualified();
        OWLPropertyRange result3 = testSubject0.getFiller();
        OWLObjectPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        OWLObject result7 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result8 = testSubject0.isOWLThing();
        ClassExpressionType result9 = testSubject0.getClassExpressionType();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        OWLClass result19 = testSubject0.asOWLClass();
        Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectHasSelf() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLObjectHasSelf.class));
    }

    public void verifyInterfaceOWLObjectHasSelf() {
        OWLObjectHasSelf testSubject0 = mock(OWLObjectHasSelf.class);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isOWLThing();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        OWLClass result15 = testSubject0.asOWLClass();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectHasValue() {
        assertTrue(OWLHasValueRestriction.class.isAssignableFrom(OWLObjectHasValue.class));
    }

    public void verifyInterfaceOWLObjectHasValue() {
        OWLObjectHasValue testSubject0 = mock(OWLObjectHasValue.class);
        OWLClassExpression result1 = testSubject0.asSomeValuesFrom();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result6 = testSubject0.isOWLThing();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOf() {
        assertTrue(OWLNaryBooleanClassExpression.class.isAssignableFrom(OWLObjectIntersectionOf.class));
    }

    public void verifyInterfaceOWLObjectIntersectionOf() {
        OWLObjectIntersectionOf testSubject0 = mock(OWLObjectIntersectionOf.class);
        List<OWLClassExpression> result0 = testSubject0.getOperandsAsList();
        Set<OWLClassExpression> result1 = testSubject0.getOperands();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectInverseOf() {
        assertTrue(OWLObjectPropertyExpression.class.isAssignableFrom(OWLObjectInverseOf.class));
    }

    public void verifyInterfaceOWLObjectInverseOf() {
        OWLObjectInverseOf testSubject0 = mock(OWLObjectInverseOf.class);
        OWLObjectPropertyExpression result0 = testSubject0.getInverse();
        OWLObjectProperty result1 = testSubject0.asOWLObjectProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result7 = testSubject0.getSimplified();
        OWLObjectProperty result12 = testSubject0.getNamedProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result19 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result34 = testSubject0.isDataPropertyExpression();
        boolean result35 = testSubject0.isObjectPropertyExpression();
        boolean result36 = testSubject0.isOWLTopObjectProperty();
        boolean result37 = testSubject0.isOWLBottomObjectProperty();
        boolean result38 = testSubject0.isOWLTopDataProperty();
        boolean result39 = testSubject0.isOWLBottomDataProperty();
        boolean result40 = testSubject0.isAnonymous();
        Set<OWLEntity> result41 = testSubject0.getSignature();
        OWLObject result42 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result43 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result44 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result45 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result46 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result47 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result48 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result49 = testSubject0.getNestedClassExpressions();
        boolean result50 = testSubject0.isTopEntity();
        boolean result51 = testSubject0.isBottomEntity();
        int result52 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinality() {
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectMaxCardinality.class));
    }

    public void verifyInterfaceOWLObjectMaxCardinality() {
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
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinality() {
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectMinCardinality.class));
    }

    public void verifyInterfaceOWLObjectMinCardinality() {
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
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectOneOf() {
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLObjectOneOf.class));
    }

    public void verifyInterfaceOWLObjectOneOf() {
        OWLObjectOneOf testSubject0 = mock(OWLObjectOneOf.class);
        Set<OWLIndividual> result0 = testSubject0.getIndividuals();
        OWLClassExpression result1 = testSubject0.asObjectUnionOf();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectProperty() {
        assertTrue(OWLObjectPropertyExpression.class.isAssignableFrom(OWLObjectProperty.class));
        assertTrue(OWLProperty.class.isAssignableFrom(OWLObjectProperty.class));
    }

    public void verifyInterfaceOWLObjectProperty() {
        OWLObjectProperty testSubject0 = mock(OWLObjectProperty.class);
        OWLObjectProperty result0 = testSubject0.asOWLObjectProperty();
        OWLObjectPropertyExpression result5 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getSimplified();
        OWLObjectProperty result11 = testSubject0.getNamedProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result18 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result33 = testSubject0.isDataPropertyExpression();
        boolean result34 = testSubject0.isObjectPropertyExpression();
        boolean result35 = testSubject0.isOWLTopObjectProperty();
        boolean result36 = testSubject0.isOWLBottomObjectProperty();
        boolean result37 = testSubject0.isOWLTopDataProperty();
        boolean result38 = testSubject0.isOWLBottomDataProperty();
        boolean result39 = testSubject0.isAnonymous();
        Set<OWLEntity> result40 = testSubject0.getSignature();
        OWLObject result41 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result42 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result43 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result44 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result45 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result46 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result47 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result48 = testSubject0.getNestedClassExpressions();
        boolean result49 = testSubject0.isTopEntity();
        boolean result50 = testSubject0.isBottomEntity();
        int result51 = testSubject0.compareTo(_Object36);
        boolean result54 = testSubject0.isType(_EntityType);
        OWLObject result55 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result56 = testSubject0.isBuiltIn();
        EntityType<?> result60 = testSubject0.getEntityType();
        boolean result62 = testSubject0.isOWLClass();
        OWLClass result63 = testSubject0.asOWLClass();
        boolean result64 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result65 = testSubject0.asOWLObjectProperty();
        boolean result66 = testSubject0.isOWLDataProperty();
        OWLDataProperty result67 = testSubject0.asOWLDataProperty();
        boolean result68 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result69 = testSubject0.asOWLNamedIndividual();
        boolean result70 = testSubject0.isOWLDatatype();
        OWLDatatype result71 = testSubject0.asOWLDatatype();
        boolean result72 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result73 = testSubject0.asOWLAnnotationProperty();
        String result74 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result75 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiom() {
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLObjectPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLObjectPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyAssertionAxiom() {
        OWLObjectPropertyAssertionAxiom testSubject0 = mock(OWLObjectPropertyAssertionAxiom.class);
        OWLObjectPropertyAssertionAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        boolean result1 = testSubject0.isInSimplifiedForm();
        OWLObjectPropertyAssertionAxiom result2 = testSubject0.getSimplified();
        OWLObjectPropertyExpression result3 = testSubject0.getProperty();
        OWLObject result4 = testSubject0.getObject();
        OWLIndividual result5 = testSubject0.getSubject();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set40);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result31 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyAxiom() {
        OWLObjectPropertyAxiom testSubject0 = mock(OWLObjectPropertyAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyCharacteristicAxiom() {
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiom.class));
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyCharacteristicAxiom() {
        OWLObjectPropertyCharacteristicAxiom testSubject0 = mock(OWLObjectPropertyCharacteristicAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result25 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainAxiom() {
        assertTrue(OWLPropertyDomainAxiom.class.isAssignableFrom(OWLObjectPropertyDomainAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyDomainAxiom() {
        OWLObjectPropertyDomainAxiom testSubject0 = mock(OWLObjectPropertyDomainAxiom.class);
        OWLObjectPropertyDomainAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassExpression result1 = testSubject0.getDomain();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpression() {
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLObjectPropertyExpression.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(OWLObjectPropertyExpression.class));
    }

    public void verifyInterfaceOWLObjectPropertyExpression() {
        OWLObjectPropertyExpression testSubject0 = mock(OWLObjectPropertyExpression.class);
        OWLObjectProperty result0 = testSubject0.asOWLObjectProperty();
        OWLObjectPropertyExpression result5 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getSimplified();
        OWLObjectProperty result11 = testSubject0.getNamedProperty();
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result18 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result33 = testSubject0.isDataPropertyExpression();
        boolean result34 = testSubject0.isObjectPropertyExpression();
        boolean result35 = testSubject0.isOWLTopObjectProperty();
        boolean result36 = testSubject0.isOWLBottomObjectProperty();
        boolean result37 = testSubject0.isOWLTopDataProperty();
        boolean result38 = testSubject0.isOWLBottomDataProperty();
        boolean result39 = testSubject0.isAnonymous();
        Set<OWLEntity> result40 = testSubject0.getSignature();
        OWLObject result41 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result42 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result43 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result44 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result45 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result46 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result47 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result48 = testSubject0.getNestedClassExpressions();
        boolean result49 = testSubject0.isTopEntity();
        boolean result50 = testSubject0.isBottomEntity();
        int result51 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiom() {
        assertTrue(OWLPropertyRangeAxiom.class.isAssignableFrom(OWLObjectPropertyRangeAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyRangeAxiom() {
        OWLObjectPropertyRangeAxiom testSubject0 = mock(OWLObjectPropertyRangeAxiom.class);
        OWLObjectPropertyRangeAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassExpression result1 = testSubject0.getRange();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFrom() {
        assertTrue(OWLQuantifiedObjectRestriction.class.isAssignableFrom(OWLObjectSomeValuesFrom.class));
    }

    public void verifyInterfaceOWLObjectSomeValuesFrom() {
        OWLObjectSomeValuesFrom testSubject0 = mock(OWLObjectSomeValuesFrom.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOf() {
        assertTrue(OWLNaryBooleanClassExpression.class.isAssignableFrom(OWLObjectUnionOf.class));
    }

    public void verifyInterfaceOWLObjectUnionOf() {
        OWLObjectUnionOf testSubject0 = mock(OWLObjectUnionOf.class);
        List<OWLClassExpression> result0 = testSubject0.getOperandsAsList();
        Set<OWLClassExpression> result1 = testSubject0.getOperands();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result3 = testSubject0.isOWLThing();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isClassExpressionLiteral();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitor() {
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLClassExpressionVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLDataVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLPropertyExpressionVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLEntityVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLAnnotationAxiomVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLIndividualVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLAnnotationValueVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(OWLAnnotationObjectVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
    }

    public void verifyInterfaceOWLObjectVisitor() {
        OWLObjectVisitor testSubject0 = mock(OWLObjectVisitor.class);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorEx() {
        assertTrue(OWLAxiomVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLClassExpressionVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLDataVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLPropertyExpressionVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLEntityVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLAnnotationObjectVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(SWRLObjectVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLNamedObjectVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
        assertTrue(OWLIndividualVisitorEx.class.isAssignableFrom(OWLObjectVisitorEx.class));
    }

    public void verifyInterfaceOWLObjectVisitorEx() {
        OWLObjectVisitorEx<OWLObject> testSubject0 = mock(OWLObjectVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLOntology() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLOntology.class));
    }

    public void verifyInterfaceOWLOntology() {
        OWLOntology testSubject0 = mock(OWLOntology.class);
        boolean result0 = testSubject0.isEmpty();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLEntity> result2 = testSubject0.getSignature();
        Set<OWLEntity> result3 = testSubject0.getSignature(Imports.INCLUDED);
        OWLOntologyID result4 = testSubject0.getOntologyID();
        Set<OWLClass> result5 = testSubject0.getClassesInSignature(Imports.INCLUDED);
        Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        Set<OWLDataProperty> result7 = testSubject0.getDataPropertiesInSignature();
        Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature(Imports.INCLUDED);
        Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature(Imports.INCLUDED);
        Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature(Imports.INCLUDED);
        Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature(Imports.INCLUDED);
        boolean result15 = testSubject0.isAnonymous();
        OWLOntologyManager result16 = testSubject0.getOWLOntologyManager();
        Set<IRI> result17 = testSubject0.getDirectImportsDocuments();
        Set<OWLOntology> result18 = testSubject0.getDirectImports();
        Set<OWLOntology> result19 = testSubject0.getImports();
        Set<OWLOntology> result20 = testSubject0.getImportsClosure();
        Set<OWLImportsDeclaration> result21 = testSubject0.getImportsDeclarations();
        Set<OWLClassAxiom> result22 = testSubject0.getAxioms(_OWLClass, Imports.EXCLUDED);
        Set<T> result23 = testSubject0.getAxioms(_AxiomType);
        Set<OWLAxiom> result24 = testSubject0.getAxioms();
        Set<OWLDataPropertyAxiom> result25 = testSubject0.getAxioms(_OWLDataProperty, Imports.EXCLUDED);
        Set<OWLIndividualAxiom> result26 = testSubject0.getAxioms(_OWLIndividual, Imports.EXCLUDED);
        Set<OWLAnnotationAxiom> result27 = testSubject0.getAxioms(_OWLAnnotationProperty, Imports.EXCLUDED);
        Set<OWLDatatypeDefinitionAxiom> result28 = testSubject0.getAxioms(_OWLDatatype, Imports.EXCLUDED);
        Set<OWLObjectPropertyAxiom> result29 = testSubject0.getAxioms(_OWLObjectPropertyExpression, Imports.EXCLUDED);
        Set<T> result30 = testSubject0.getAxioms(_AxiomType, Imports.EXCLUDED);
        int result31 = testSubject0.getAxiomCount();
        int result32 = testSubject0.getAxiomCount(_AxiomType, Imports.EXCLUDED);
        int result33 = testSubject0.getAxiomCount(_AxiomType);
        Set<OWLLogicalAxiom> result34 = testSubject0.getLogicalAxioms();
        int result35 = testSubject0.getLogicalAxiomCount();
        boolean result39 = testSubject0.containsAxiom(_OWLAxiom);
        boolean result40 = testSubject0.containsAxiom(_OWLAxiom, Imports.EXCLUDED, Search.CONSIDER_ANNOTATIONS);
        Set<OWLClassAxiom> result45 = testSubject0.getGeneralClassAxioms();
        Set<OWLAnonymousIndividual> result46 = testSubject0.getReferencedAnonymousIndividuals(Imports.EXCLUDED);
        boolean result51 = testSubject0.containsEntityInSignature(_IRI, Imports.INCLUDED);
        boolean result53 = testSubject0.containsEntityInSignature(_OWLEntity, Imports.INCLUDED);
        boolean result54 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result55 = testSubject0.isDeclared(_OWLEntity);
        boolean result56 = testSubject0.isDeclared(_OWLEntity, Imports.INCLUDED);
        boolean result57 = testSubject0.containsClassInSignature(_IRI, Imports.INCLUDED);
        boolean result60 = testSubject0.containsObjectPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result61 = testSubject0.containsDataPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result63 = testSubject0.containsAnnotationPropertyInSignature(_IRI, Imports.INCLUDED);
        boolean result65 = testSubject0.containsIndividualInSignature(_IRI, Imports.INCLUDED);
        boolean result67 = testSubject0.containsDatatypeInSignature(_IRI, Imports.INCLUDED);
        Set<OWLEntity> result69 = testSubject0.getEntitiesInSignature(_IRI, Imports.INCLUDED);
        Set<OWLEntity> result70 = testSubject0.getEntitiesInSignature(_IRI);
        Set<OWLSubAnnotationPropertyOfAxiom> result71 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        Set<OWLAnnotationPropertyDomainAxiom> result72 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        Set<OWLAnnotationPropertyRangeAxiom> result73 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        Set<OWLDeclarationAxiom> result74 = testSubject0.getDeclarationAxioms(_OWLEntity);
        Set<OWLAnnotationAssertionAxiom> result75 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        Set<OWLSubClassOfAxiom> result76 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        Set<OWLSubClassOfAxiom> result77 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        Set<OWLEquivalentClassesAxiom> result78 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        Set<OWLDisjointClassesAxiom> result79 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        Set<OWLDisjointUnionAxiom> result80 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        Set<OWLHasKeyAxiom> result81 = testSubject0.getHasKeyAxioms(_OWLClass);
        Set<OWLSubObjectPropertyOfAxiom> result82 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        Set<OWLSubObjectPropertyOfAxiom> result83 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        Set<OWLObjectPropertyDomainAxiom> result84 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        Set<OWLObjectPropertyRangeAxiom> result85 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        Set<OWLInverseObjectPropertiesAxiom> result86 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLEquivalentObjectPropertiesAxiom> result87 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        Set<OWLDisjointObjectPropertiesAxiom> result88 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        Set<OWLFunctionalObjectPropertyAxiom> result89 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLInverseFunctionalObjectPropertyAxiom> result90 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLSymmetricObjectPropertyAxiom> result91 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLAsymmetricObjectPropertyAxiom> result92 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLReflexiveObjectPropertyAxiom> result93 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLIrreflexiveObjectPropertyAxiom> result94 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLTransitiveObjectPropertyAxiom> result95 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        Set<OWLSubDataPropertyOfAxiom> result96 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        Set<OWLSubDataPropertyOfAxiom> result97 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        Set<OWLDataPropertyDomainAxiom> result98 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        Set<OWLDataPropertyRangeAxiom> result99 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        Set<OWLEquivalentDataPropertiesAxiom> result100 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        Set<OWLDisjointDataPropertiesAxiom> result101 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        Set<OWLFunctionalDataPropertyAxiom> result102 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        Set<OWLClassAssertionAxiom> result103 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        Set<OWLClassAssertionAxiom> result104 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        Set<OWLDataPropertyAssertionAxiom> result105 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLObjectPropertyAssertionAxiom> result106 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLNegativeObjectPropertyAssertionAxiom> result107 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLNegativeDataPropertyAssertionAxiom> result108 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        Set<OWLSameIndividualAxiom> result109 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        Set<OWLDifferentIndividualsAxiom> result110 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        Set<OWLDatatypeDefinitionAxiom> result111 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
        OWLObject result112 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLAnonymousIndividual> result113 = testSubject0.getAnonymousIndividuals();
        Set<OWLClassExpression> result114 = testSubject0.getNestedClassExpressions();
        boolean result115 = testSubject0.isTopEntity();
        boolean result116 = testSubject0.isBottomEntity();
        int result117 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLOntologyAlreadyExistsException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(OWLOntologyAlreadyExistsException.class));
    }

    public void verifyOWLOntologyAlreadyExistsException() {
        OWLOntologyAlreadyExistsException testSubject0 = new OWLOntologyAlreadyExistsException(_OWLOntologyID, _IRI, _Throwable);
        OWLOntologyAlreadyExistsException testSubject1 = new OWLOntologyAlreadyExistsException(_OWLOntologyID, _Throwable);
        OWLOntologyAlreadyExistsException testSubject2 = new OWLOntologyAlreadyExistsException(_OWLOntologyID, _IRI);
        OWLOntologyAlreadyExistsException testSubject3 = new OWLOntologyAlreadyExistsException(_OWLOntologyID);
        IRI result0 = testSubject0.getDocumentIRI();
        OWLOntologyID result1 = testSubject0.getOntologyID();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result2 = testSubject0.fillInStackTrace();
        Throwable result3 = testSubject0.getCause();
        Throwable result4 = testSubject0.initCause(_Throwable);
        String result5 = testSubject0.getMessage();
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    public void verifyOWLOntologyChange() {
        OWLOntologyChange<OWLObject> testSubject0 = mock(OWLOntologyChange.class);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result2 = testSubject0.isAxiomChange();
        boolean result3 = testSubject0.isAddAxiom();
        boolean result4 = testSubject0.isRemoveAxiom();
        boolean result5 = testSubject0.isImportChange();
        OWLOntology result6 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result7 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result8 = testSubject0.getChangeRecord();
        OWLAxiom result9 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeBroadcastStrategy() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyChangeBroadcastStrategy.class));
    }

    public void verifyInterfaceOWLOntologyChangeBroadcastStrategy() throws OWLException {
        OWLOntologyChangeBroadcastStrategy testSubject0 = mock(OWLOntologyChangeBroadcastStrategy.class);
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLOntologyChangeException.class));
    }

    public void verifyInterfaceOWLOntologyChangeListener() throws OWLException {
        OWLOntologyChangeListener testSubject0 = mock(OWLOntologyChangeListener.class);
        testSubject0.ontologiesChanged(_List);
    }

    public void verifyInterfaceOWLOntologyChangeProgressListener() {
        OWLOntologyChangeProgressListener testSubject0 = mock(OWLOntologyChangeProgressListener.class);
        testSubject0.end();
        testSubject0.begin(_int);
        testSubject0.appliedChange(_OWLOntologyChange);
    }

    public void verifyInterfaceOWLOntologyChangesVetoedListener() {
        OWLOntologyChangesVetoedListener testSubject0 = mock(OWLOntologyChangesVetoedListener.class);
        testSubject0.ontologyChangesVetoed(_List, _OWLOntologyChangeVetoException);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVetoException() {
        assertTrue(OWLOntologyChangeException.class.isAssignableFrom(OWLOntologyChangeVetoException.class));
    }

    public void verifyOWLOntologyChangeVetoException() {
        OWLOntologyChangeVetoException testSubject0 = new OWLOntologyChangeVetoException(_OWLOntologyChangeData, _String);
        OWLOntologyChangeVetoException testSubject1 = new OWLOntologyChangeVetoException(_OWLOntologyChangeData, _String, _Throwable);
        OWLOntologyChangeVetoException testSubject2 = new OWLOntologyChangeVetoException(_OWLOntologyChangeData, _Throwable);
        OWLOntologyChangeData<?> result0 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getMessage();
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLOntologyChangeVisitor() {
        OWLOntologyChangeVisitor testSubject0 = mock(OWLOntologyChangeVisitor.class);
    }

    public void verifyInterfaceOWLOntologyChangeVisitorEx() {
        OWLOntologyChangeVisitorEx<OWLObject> testSubject0 = mock(OWLOntologyChangeVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyCreationException() {
        assertTrue(OWLException.class.isAssignableFrom(OWLOntologyCreationException.class));
    }

    public void verifyOWLOntologyCreationException() {
        OWLOntologyCreationException testSubject0 = new OWLOntologyCreationException(_Throwable);
        OWLOntologyCreationException testSubject1 = new OWLOntologyCreationException(_String, _Throwable);
        OWLOntologyCreationException testSubject2 = new OWLOntologyCreationException(_String);
        OWLOntologyCreationException testSubject3 = new OWLOntologyCreationException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyDocumentAlreadyExistsException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(OWLOntologyDocumentAlreadyExistsException.class));
    }

    public void verifyOWLOntologyDocumentAlreadyExistsException() {
        OWLOntologyDocumentAlreadyExistsException testSubject0 = new OWLOntologyDocumentAlreadyExistsException(_IRI);
        IRI result0 = testSubject0.getOntologyDocumentIRI();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getMessage();
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyFactory() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFactory.class));
    }

    public void verifyInterfaceOWLOntologyFactory() {
        OWLOntologyFactory testSubject0 = mock(OWLOntologyFactory.class);
        boolean result5 = testSubject0.canLoad(_OWLOntologyDocumentSource);
    }

    @Test
    public void enforceInterfacesOWLOntologyFactoryNotFoundException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLOntologyFactoryNotFoundException.class));
    }

    public void verifyOWLOntologyFactoryNotFoundException() {
        OWLOntologyFactoryNotFoundException testSubject0 = new OWLOntologyFactoryNotFoundException(_IRI);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyFormat() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFormat.class));
    }

    public void verifyOWLOntologyFormat() {
        OWLOntologyFormat testSubject0 = mock(OWLOntologyFormat.class);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixOWLOntologyFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesOWLOntologyID() {
        assertTrue(Comparable.class.isAssignableFrom(OWLOntologyID.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyID.class));
    }

    public void verifyOWLOntologyID() {
        OWLOntologyID testSubject0 = new OWLOntologyID(_IRI, _IRI);
        OWLOntologyID testSubject1 = new OWLOntologyID(_IRI);
        OWLOntologyID testSubject2 = new OWLOntologyID();
        int result0 = testSubject0.compareTo(_OWLOntologyID);
        boolean result2 = testSubject0.isAnonymous();
        boolean result3 = testSubject0.isOWL2DLOntologyID();
        Optional<IRI> result4 = testSubject0.getOntologyIRI();
        Optional<IRI> result5 = testSubject0.getVersionIRI();
        Optional<IRI> result6 = testSubject0.getDefaultDocumentIRI();
    }

    public void verifyInterfaceOWLOntologyIRIMapper() {
        OWLOntologyIRIMapper testSubject0 = mock(OWLOntologyIRIMapper.class);
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyIRIMappingNotFoundException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLOntologyIRIMappingNotFoundException.class));
    }

    public void verifyOWLOntologyIRIMappingNotFoundException() {
        OWLOntologyIRIMappingNotFoundException testSubject0 = new OWLOntologyIRIMappingNotFoundException(_IRI);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyOWLOntologyLoaderConfiguration() {
        OWLOntologyLoaderConfiguration testSubject0 = new OWLOntologyLoaderConfiguration();
        boolean result0 = testSubject0.isStrict();
        boolean result1 = testSubject0.isFollowRedirects();
        MissingOntologyHeaderStrategy result2 = testSubject0.getMissingOntologyHeaderStrategy();
        OWLOntologyLoaderConfiguration result3 = testSubject0.setMissingOntologyHeaderStrategy(_MissingOntologyHeaderStrategy);
        OWLOntologyLoaderConfiguration result4 = testSubject0.setLoadAnnotationAxioms(_boolean);
        boolean result5 = testSubject0.isLoadAnnotationAxioms();
        OWLOntologyLoaderConfiguration result6 = testSubject0.setFollowRedirects(_boolean);
        OWLOntologyLoaderConfiguration result7 = testSubject0.setMissingImportHandlingStrategy(_MissingImportHandlingStrategy);
        MissingImportHandlingStrategy result8 = testSubject0.getMissingImportHandlingStrategy();
        OWLOntologyLoaderConfiguration result9 = testSubject0.setStrict(_boolean);
        boolean result10 = testSubject0.isIgnoredImport(_IRI);
        boolean result11 = testSubject0.isIgnoredImport(_IRI);
        OWLOntologyLoaderConfiguration result12 = testSubject0.addIgnoredImport(_IRI);
        OWLOntologyLoaderConfiguration result13 = testSubject0.removeIgnoredImport(_IRI);
        OWLOntologyLoaderConfiguration result14 = testSubject0.clearIgnoredImports();
        OWLOntologyLoaderConfiguration result15 = testSubject0.setReportStackTraces(_boolean);
        boolean result16 = testSubject0.isReportStackTrace();
    }

    public void verifyInterfaceOWLOntologyLoaderListener() {
        OWLOntologyLoaderListener testSubject0 = mock(OWLOntologyLoaderListener.class);
        testSubject0.startedLoadingOntology(_LoadingStartedEvent);
        testSubject0.finishedLoadingOntology(_LoadingFinishedEvent);
    }

    @Test
    public void enforceInterfacesOWLOntologyManager() {
        assertTrue(OWLOntologySetProvider.class.isAssignableFrom(OWLOntologyManager.class));
    }

    public void verifyInterfaceOWLOntologyManager() throws OWLOntologyStorageException, OWLOntologyCreationException {
        OWLOntologyManager testSubject0 = mock(OWLOntologyManager.class);
        boolean result0 = testSubject0.contains(_OWLOntologyID);
        boolean result1 = testSubject0.contains(_IRI);
        OWLOntology result2 = testSubject0.getOntology(_IRI);
        OWLOntology result3 = testSubject0.getOntology(_OWLOntologyID);
        Set<OWLOntology> result4 = testSubject0.getDirectImports(_OWLOntology);
        Set<OWLOntology> result5 = testSubject0.getImports(_OWLOntology);
        Set<OWLOntology> result6 = testSubject0.getImportsClosure(_OWLOntology);
        OWLDataFactory result7 = testSubject0.getOWLDataFactory();
        Set<OWLOntology> result8 = testSubject0.getOntologies();
        Set<OWLOntology> result9 = testSubject0.getOntologies(_OWLAxiom);
        Set<OWLOntology> result10 = testSubject0.getVersions(_IRI);
        boolean result11 = testSubject0.containsVersion(_IRI);
        Set<OWLOntologyID> result12 = testSubject0.getOntologyIDsByVersion(_IRI);
        OWLOntology result13 = testSubject0.getImportedOntology(_OWLImportsDeclaration);
        List<OWLOntology> result14 = testSubject0.getSortedImportsClosure(_OWLOntology);
        List<OWLOntologyChange<?>> result15 = testSubject0.applyChanges(_List);
        List<OWLOntologyChange<?>> result16 = testSubject0.addAxioms(_OWLOntology, _Set194);
        List<OWLOntologyChange<?>> result17 = testSubject0.addAxiom(_OWLOntology, _OWLAxiom);
        List<OWLOntologyChange<?>> result18 = testSubject0.removeAxiom(_OWLOntology, _OWLAxiom);
        List<OWLOntologyChange<?>> result19 = testSubject0.removeAxioms(_OWLOntology, _Set194);
        List<OWLOntologyChange<?>> result20 = testSubject0.applyChange(_OWLOntologyChange);
        OWLOntology result21 = testSubject0.createOntology(_IRI);
        OWLOntology result22 = testSubject0.createOntology(_OWLOntologyID);
        OWLOntology result23 = testSubject0.createOntology(_IRI, _Set48, _boolean);
        OWLOntology result24 = testSubject0.createOntology(_IRI, _Set48);
        OWLOntology result25 = testSubject0.createOntology();
        OWLOntology result26 = testSubject0.createOntology(_Set);
        OWLOntology result27 = testSubject0.createOntology(_Set, _IRI);
        OWLOntology result28 = testSubject0.loadOntology(_IRI);
        OWLOntology result29 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource, _OWLOntologyLoaderConfiguration);
        OWLOntology result30 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource);
        OWLOntology result31 = testSubject0.loadOntologyFromOntologyDocument(_InputStream);
        OWLOntology result32 = testSubject0.loadOntologyFromOntologyDocument(_File);
        OWLOntology result33 = testSubject0.loadOntologyFromOntologyDocument(_IRI);
        testSubject0.removeOntology(_OWLOntologyID);
        testSubject0.removeOntology(_OWLOntology);
        IRI result34 = testSubject0.getOntologyDocumentIRI(_OWLOntology);
        testSubject0.setOntologyDocumentIRI(_OWLOntology, _IRI);
        OWLOntologyFormat result35 = testSubject0.getOntologyFormat(_OWLOntology);
        testSubject0.setOntologyFormat(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology);
        testSubject0.saveOntology(_OWLOntology, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener, _OWLOntologyChangeBroadcastStrategy);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.addImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.removeImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.addOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0.removeOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0.setDefaultChangeBroadcastStrategy(_OWLOntologyChangeBroadcastStrategy);
        testSubject0.removeOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration, _OWLOntologyLoaderConfiguration);
        testSubject0.addMissingImportListener(_MissingImportListener);
        testSubject0.removeMissingImportListener(_MissingImportListener);
        testSubject0.addOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.removeOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.addOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0.removeOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
    }

    public void verifyInterfaceOWLOntologyManagerFactory() {
        OWLOntologyManagerFactory testSubject0 = mock(OWLOntologyManagerFactory.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyRenameException() {
        assertTrue(OWLOntologyChangeException.class.isAssignableFrom(OWLOntologyRenameException.class));
    }

    public void verifyOWLOntologyRenameException() {
        OWLOntologyRenameException testSubject0 = new OWLOntologyRenameException(_OWLOntologyChangeData, _OWLOntologyID);
        OWLOntologyID result0 = testSubject0.getOntologyID();
        OWLOntologyChangeData<?> result1 = testSubject0.getChange();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result2 = testSubject0.fillInStackTrace();
        Throwable result3 = testSubject0.getCause();
        Throwable result4 = testSubject0.initCause(_Throwable);
        String result5 = testSubject0.getMessage();
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyResourceAccessException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLOntologyResourceAccessException.class));
    }

    public void verifyOWLOntologyResourceAccessException() {
        OWLOntologyResourceAccessException testSubject0 = new OWLOntologyResourceAccessException(_String);
        OWLOntologyResourceAccessException testSubject1 = new OWLOntologyResourceAccessException(_String, _Throwable);
        OWLOntologyResourceAccessException testSubject2 = new OWLOntologyResourceAccessException(_Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLOntologySetProvider() {
        OWLOntologySetProvider testSubject0 = mock(OWLOntologySetProvider.class);
        Set<OWLOntology> result0 = testSubject0.getOntologies();
    }

    @Test
    public void enforceInterfacesOWLOntologyStorageException() {
        assertTrue(OWLException.class.isAssignableFrom(OWLOntologyStorageException.class));
    }

    public void verifyOWLOntologyStorageException() {
        OWLOntologyStorageException testSubject0 = new OWLOntologyStorageException(_String);
        OWLOntologyStorageException testSubject1 = new OWLOntologyStorageException(_String, _Throwable);
        OWLOntologyStorageException testSubject2 = new OWLOntologyStorageException(_Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLOntologyStorer() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyStorer.class));
    }

    public void verifyInterfaceOWLOntologyStorer() throws OWLOntologyStorageException, IOException {
        OWLOntologyStorer testSubject0 = mock(OWLOntologyStorer.class);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLOntologyStorerNotFoundException() {
        assertTrue(OWLOntologyStorageException.class.isAssignableFrom(OWLOntologyStorerNotFoundException.class));
    }

    public void verifyOWLOntologyStorerNotFoundException() {
        OWLOntologyStorerNotFoundException testSubject0 = new OWLOntologyStorerNotFoundException(_OWLOntologyFormat);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLProperty() {
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLProperty.class));
        assertTrue(OWLLogicalEntity.class.isAssignableFrom(OWLProperty.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLProperty.class));
    }

    public void verifyInterfaceOWLProperty() {
        OWLProperty testSubject0 = mock(OWLProperty.class);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result0 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result15 = testSubject0.isDataPropertyExpression();
        boolean result16 = testSubject0.isObjectPropertyExpression();
        boolean result17 = testSubject0.isOWLTopObjectProperty();
        boolean result18 = testSubject0.isOWLBottomObjectProperty();
        boolean result19 = testSubject0.isOWLTopDataProperty();
        boolean result20 = testSubject0.isOWLBottomDataProperty();
        boolean result21 = testSubject0.isAnonymous();
        Set<OWLEntity> result22 = testSubject0.getSignature();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
        int result33 = testSubject0.compareTo(_Object36);
        boolean result36 = testSubject0.isType(_EntityType);
        OWLObject result37 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result38 = testSubject0.isBuiltIn();
        EntityType<?> result42 = testSubject0.getEntityType();
        boolean result44 = testSubject0.isOWLClass();
        OWLClass result45 = testSubject0.asOWLClass();
        boolean result46 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result47 = testSubject0.asOWLObjectProperty();
        boolean result48 = testSubject0.isOWLDataProperty();
        OWLDataProperty result49 = testSubject0.asOWLDataProperty();
        boolean result50 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result51 = testSubject0.asOWLNamedIndividual();
        boolean result52 = testSubject0.isOWLDatatype();
        OWLDatatype result53 = testSubject0.asOWLDatatype();
        boolean result54 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result55 = testSubject0.asOWLAnnotationProperty();
        String result56 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result57 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLPropertyAssertionAxiom() {
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLPropertyAssertionAxiom() {
        OWLPropertyAssertionAxiom testSubject0 = mock(OWLPropertyAssertionAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyAssertionObject() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyAssertionObject.class));
    }

    public void verifyInterfaceOWLPropertyAssertionObject() {
        OWLPropertyAssertionObject testSubject0 = mock(OWLPropertyAssertionObject.class);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLPropertyAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLPropertyAxiom.class));
    }

    public void verifyInterfaceOWLPropertyAxiom() {
        OWLPropertyAxiom testSubject0 = mock(OWLPropertyAxiom.class);
        Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set40);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLPropertyDomainAxiom() {
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLPropertyDomainAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLPropertyDomainAxiom() {
        OWLPropertyDomainAxiom testSubject0 = mock(OWLPropertyDomainAxiom.class);
        OWLClassExpression result0 = testSubject0.getDomain();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyExpression() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyExpression.class));
    }

    public void verifyInterfaceOWLPropertyExpression() {
        OWLPropertyExpression testSubject0 = mock(OWLPropertyExpression.class);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result0 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result15 = testSubject0.isDataPropertyExpression();
        boolean result16 = testSubject0.isObjectPropertyExpression();
        boolean result17 = testSubject0.isOWLTopObjectProperty();
        boolean result18 = testSubject0.isOWLBottomObjectProperty();
        boolean result19 = testSubject0.isOWLTopDataProperty();
        boolean result20 = testSubject0.isOWLBottomDataProperty();
        boolean result21 = testSubject0.isAnonymous();
        Set<OWLEntity> result22 = testSubject0.getSignature();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
        int result33 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLPropertyExpressionVisitor() {
        OWLPropertyExpressionVisitor testSubject0 = mock(OWLPropertyExpressionVisitor.class);
    }

    public void verifyInterfaceOWLPropertyExpressionVisitorEx() {
        OWLPropertyExpressionVisitorEx<OWLObject> testSubject0 = mock(OWLPropertyExpressionVisitorEx.class);
    }

    @Test
    public void enforceInterfacesOWLPropertyRange() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyRange.class));
    }

    public void verifyInterfaceOWLPropertyRange() {
        OWLPropertyRange testSubject0 = mock(OWLPropertyRange.class);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLPropertyRangeAxiom() {
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLPropertyRangeAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLPropertyRangeAxiom() {
        OWLPropertyRangeAxiom testSubject0 = mock(OWLPropertyRangeAxiom.class);
        OWLPropertyRange result0 = testSubject0.getRange();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedDataRestriction() {
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLQuantifiedDataRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedDataRestriction() {
        OWLQuantifiedDataRestriction testSubject0 = mock(OWLQuantifiedDataRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLQuantifiedObjectRestriction() {
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLQuantifiedObjectRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedObjectRestriction() {
        OWLQuantifiedObjectRestriction testSubject0 = mock(OWLQuantifiedObjectRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLQuantifiedRestriction() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLQuantifiedRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedRestriction() {
        OWLQuantifiedRestriction testSubject0 = mock(OWLQuantifiedRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result5 = testSubject0.isOWLThing();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLReflexiveObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLReflexiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLReflexiveObjectPropertyAxiom() {
        OWLReflexiveObjectPropertyAxiom testSubject0 = mock(OWLReflexiveObjectPropertyAxiom.class);
        OWLReflexiveObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
        OWLSubClassOfAxiom result27 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLRestriction() {
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLRestriction.class));
    }

    public void verifyInterfaceOWLRestriction() {
        OWLRestriction testSubject0 = mock(OWLRestriction.class);
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isOWLThing();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        OWLClass result15 = testSubject0.asOWLClass();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLRuntimeException() {
        assertTrue(RuntimeException.class.isAssignableFrom(OWLRuntimeException.class));
    }

    public void verifyOWLRuntimeException() {
        OWLRuntimeException testSubject0 = new OWLRuntimeException(_Throwable);
        OWLRuntimeException testSubject1 = new OWLRuntimeException(_String, _Throwable);
        OWLRuntimeException testSubject2 = new OWLRuntimeException(_String);
        OWLRuntimeException testSubject3 = new OWLRuntimeException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLSameIndividualAxiom() {
        assertTrue(OWLNaryIndividualAxiom.class.isAssignableFrom(OWLSameIndividualAxiom.class));
    }

    public void verifyInterfaceOWLSameIndividualAxiom() {
        OWLSameIndividualAxiom testSubject0 = mock(OWLSameIndividualAxiom.class);
        Set<OWLSameIndividualAxiom> result0 = testSubject0.asPairwiseAxioms();
        boolean result1 = testSubject0.containsAnonymousIndividuals();
        OWLSameIndividualAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLIndividual> result3 = testSubject0.getIndividuals();
        List<OWLIndividual> result4 = testSubject0.getIndividualsAsList();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set40);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object36);
        Set<OWLSubClassOfAxiom> result30 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLSubAnnotationPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubAnnotationPropertyOfAxiom() {
        OWLSubAnnotationPropertyOfAxiom testSubject0 = mock(OWLSubAnnotationPropertyOfAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getSubProperty();
        OWLAnnotationProperty result1 = testSubject0.getSuperProperty();
        OWLSubAnnotationPropertyOfAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubClassOfAxiom() {
        assertTrue(OWLClassAxiom.class.isAssignableFrom(OWLSubClassOfAxiom.class));
    }

    public void verifyInterfaceOWLSubClassOfAxiom() {
        OWLSubClassOfAxiom testSubject0 = mock(OWLSubClassOfAxiom.class);
        OWLSubClassOfAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassExpression result1 = testSubject0.getSubClass();
        OWLClassExpression result2 = testSubject0.getSuperClass();
        boolean result3 = testSubject0.isGCI();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceOWLSubClassOfAxiomSetShortCut() {
        OWLSubClassOfAxiomSetShortCut testSubject0 = mock(OWLSubClassOfAxiomSetShortCut.class);
        Set<OWLSubClassOfAxiom> result0 = testSubject0.asOWLSubClassOfAxioms();
    }

    public void verifyInterfaceOWLSubClassOfAxiomShortCut() {
        OWLSubClassOfAxiomShortCut testSubject0 = mock(OWLSubClassOfAxiomShortCut.class);
        OWLSubClassOfAxiom result0 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiom() {
        assertTrue(OWLSubPropertyAxiom.class.isAssignableFrom(OWLSubDataPropertyOfAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLSubDataPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubDataPropertyOfAxiom() {
        OWLSubDataPropertyOfAxiom testSubject0 = mock(OWLSubDataPropertyOfAxiom.class);
        OWLSubDataPropertyOfAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyExpression result1 = testSubject0.getSubProperty();
        OWLDataPropertyExpression result2 = testSubject0.getSuperProperty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiom() {
        assertTrue(OWLSubPropertyAxiom.class.isAssignableFrom(OWLSubObjectPropertyOfAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLSubObjectPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubObjectPropertyOfAxiom() {
        OWLSubObjectPropertyOfAxiom testSubject0 = mock(OWLSubObjectPropertyOfAxiom.class);
        OWLSubObjectPropertyOfAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyExpression result1 = testSubject0.getSubProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getSuperProperty();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set40);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLSubPropertyAxiom.class));
    }

    public void verifyInterfaceOWLSubPropertyAxiom() {
        OWLSubPropertyAxiom testSubject0 = mock(OWLSubPropertyAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getSubProperty();
        OWLPropertyExpression result1 = testSubject0.getSuperProperty();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyChainOfAxiom() {
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLSubPropertyChainOfAxiom.class));
    }

    public void verifyInterfaceOWLSubPropertyChainOfAxiom() {
        OWLSubPropertyChainOfAxiom testSubject0 = mock(OWLSubPropertyChainOfAxiom.class);
        OWLObjectPropertyExpression result0 = testSubject0.getSuperProperty();
        List<OWLObjectPropertyExpression> result1 = testSubject0.getPropertyChain();
        boolean result2 = testSubject0.isEncodingOfTransitiveProperty();
        OWLSubPropertyChainOfAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set40);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLSymmetricObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLSymmetricObjectPropertyAxiom() {
        OWLSymmetricObjectPropertyAxiom testSubject0 = mock(OWLSymmetricObjectPropertyAxiom.class);
        Set<OWLSubObjectPropertyOfAxiom> result0 = testSubject0.asSubPropertyAxioms();
        OWLSymmetricObjectPropertyAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set40);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result27 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLTransitiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLTransitiveObjectPropertyAxiom() {
        OWLTransitiveObjectPropertyAxiom testSubject0 = mock(OWLTransitiveObjectPropertyAxiom.class);
        OWLTransitiveObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
        OWLObjectPropertyExpression result26 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLUnaryPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLUnaryPropertyAxiom.class));
    }

    public void verifyInterfaceOWLUnaryPropertyAxiom() {
        OWLUnaryPropertyAxiom testSubject0 = mock(OWLUnaryPropertyAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set40);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesPrefixManager() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(PrefixManager.class));
    }

    public void verifyInterfacePrefixManager() {
        PrefixManager testSubject0 = mock(PrefixManager.class);
        Map<String, String> result0 = testSubject0.getPrefixName2PrefixMap();
        Set<String> result1 = testSubject0.getPrefixNames();
        String result2 = testSubject0.getPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        String result4 = testSubject0.getDefaultPrefix();
        String result5 = testSubject0.getPrefixIRI(_IRI);
        IRI result6 = testSubject0.getIRI(_String);
    }

    @Test
    public void enforceInterfacesRemoveAxiom() {
        assertTrue(OWLAxiomChange.class.isAssignableFrom(RemoveAxiom.class));
    }

    public void verifyRemoveAxiom() {
        RemoveAxiom testSubject0 = new RemoveAxiom(_OWLOntology, _OWLAxiom);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result1 = testSubject0.isAddAxiom();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result2 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.RemoveAxiomData result3 = testSubject0.getChangeData();
        Set<OWLEntity> result4 = testSubject0.getSignature();
        boolean result5 = testSubject0.isAxiomChange();
        boolean result6 = testSubject0.isImportChange();
        OWLAxiom result8 = testSubject0.getAxiom();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesRemoveImport() {
        assertTrue(ImportChange.class.isAssignableFrom(RemoveImport.class));
    }

    public void verifyRemoveImport() {
        RemoveImport testSubject0 = new RemoveImport(_OWLOntology, _OWLImportsDeclaration);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result2 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.RemoveImportData result3 = testSubject0.getChangeData();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        OWLAxiom result7 = testSubject0.getAxiom();
        OWLImportsDeclaration result8 = testSubject0.getImportDeclaration();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotation() {
        assertTrue(AnnotationChange.class.isAssignableFrom(RemoveOntologyAnnotation.class));
    }

    public void verifyRemoveOntologyAnnotation() {
        RemoveOntologyAnnotation testSubject0 = new RemoveOntologyAnnotation(_OWLOntology, _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result1 = testSubject0.getChangeData();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        Set<OWLEntity> result3 = testSubject0.getSignature();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        OWLAxiom result7 = testSubject0.getAxiom();
        boolean result8 = testSubject0.isRemoveAxiom();
        OWLOntology result9 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesSetOntologyID() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(SetOntologyID.class));
    }

    public void verifySetOntologyID() {
        SetOntologyID testSubject0 = new SetOntologyID(_OWLOntology, _OWLOntologyID);
        SetOntologyID testSubject1 = new SetOntologyID(_OWLOntology, _IRI);
        Set<OWLEntity> result0 = testSubject0.getSignature();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        OWLOntologyID result2 = testSubject0.getOriginalOntologyID();
        OWLOntologyID result3 = testSubject0.getNewOntologyID();
        boolean result4 = testSubject0.isAxiomChange();
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isImportChange();
        org.semanticweb.owlapi.change.SetOntologyIDData result7 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.OWLOntologyChangeData result8 = testSubject0.getChangeData();
        OWLAxiom result9 = testSubject0.getAxiom();
        boolean result10 = testSubject0.isRemoveAxiom();
        OWLOntology result11 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result12 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesSpecificOntologyChangeBroadcastStrategy() {
        assertTrue(OWLOntologyChangeBroadcastStrategy.class.isAssignableFrom(SpecificOntologyChangeBroadcastStrategy.class));
    }

    public void verifySpecificOntologyChangeBroadcastStrategy() throws OWLException {
        SpecificOntologyChangeBroadcastStrategy testSubject0 = new SpecificOntologyChangeBroadcastStrategy(_OWLOntology);
        testSubject0.broadcastChanges(_OWLOntologyChangeListener, _List);
    }

    @Test
    public void enforceInterfacesSWRLArgument() {
        assertTrue(SWRLObject.class.isAssignableFrom(SWRLArgument.class));
    }

    public void verifyInterfaceSWRLArgument() {
        SWRLArgument testSubject0 = mock(SWRLArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLAtom() {
        assertTrue(SWRLObject.class.isAssignableFrom(SWRLAtom.class));
    }

    public void verifyInterfaceSWRLAtom() {
        SWRLAtom testSubject0 = mock(SWRLAtom.class);
        SWRLPredicate result0 = testSubject0.getPredicate();
        Collection<SWRLArgument> result1 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result3 = testSubject0.getSignature();
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result5 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result7 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result8 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result9 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result10 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result11 = testSubject0.getNestedClassExpressions();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        int result14 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLBinaryAtom() {
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLBinaryAtom.class));
    }

    public void verifyInterfaceSWRLBinaryAtom() {
        SWRLBinaryAtom testSubject0 = mock(SWRLBinaryAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtom() {
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLBuiltInAtom.class));
    }

    public void verifyInterfaceSWRLBuiltInAtom() {
        SWRLBuiltInAtom testSubject0 = mock(SWRLBuiltInAtom.class);
        IRI result0 = testSubject0.getPredicate();
        boolean result1 = testSubject0.isCoreBuiltIn();
        List<SWRLDArgument> result2 = testSubject0.getArguments();
        SWRLPredicate result3 = testSubject0.getPredicate();
        Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLClassAtom() {
        assertTrue(SWRLUnaryAtom.class.isAssignableFrom(SWRLClassAtom.class));
    }

    public void verifyInterfaceSWRLClassAtom() {
        SWRLClassAtom testSubject0 = mock(SWRLClassAtom.class);
        OWLClassExpression result0 = testSubject0.getPredicate();
        SWRLArgument result1 = testSubject0.getArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLDArgument() {
        assertTrue(SWRLArgument.class.isAssignableFrom(SWRLDArgument.class));
    }

    public void verifyInterfaceSWRLDArgument() {
        SWRLDArgument testSubject0 = mock(SWRLDArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceSWRLDataFactory() {
        SWRLDataFactory testSubject0 = mock(SWRLDataFactory.class);
        SWRLRule result0 = testSubject0.getSWRLRule(_Set147, _Set147, _Set35);
        SWRLRule result1 = testSubject0.getSWRLRule(_Set147, _Set147);
        SWRLRule result2 = testSubject0.getSWRLRule(_Set147, _Set147);
        SWRLRule result3 = testSubject0.getSWRLRule(_Set147, _Set147);
        SWRLClassAtom result4 = testSubject0.getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        SWRLDataRangeAtom result5 = testSubject0.getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        SWRLObjectPropertyAtom result6 = testSubject0.getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        SWRLDataPropertyAtom result7 = testSubject0.getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        SWRLBuiltInAtom result8 = testSubject0.getSWRLBuiltInAtom(_IRI, _List150);
        SWRLVariable result9 = testSubject0.getSWRLVariable(_IRI);
        SWRLIndividualArgument result10 = testSubject0.getSWRLIndividualArgument(_OWLIndividual);
        SWRLLiteralArgument result11 = testSubject0.getSWRLLiteralArgument(_OWLLiteral);
        SWRLSameIndividualAtom result12 = testSubject0.getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        SWRLDifferentIndividualsAtom result13 = testSubject0.getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLDataPropertyAtom.class));
    }

    public void verifyInterfaceSWRLDataPropertyAtom() {
        SWRLDataPropertyAtom testSubject0 = mock(SWRLDataPropertyAtom.class);
        OWLDataPropertyExpression result0 = testSubject0.getPredicate();
        SWRLArgument result1 = testSubject0.getFirstArgument();
        SWRLDArgument result2 = testSubject0.getSecondArgument();
        SWRLPredicate result3 = testSubject0.getPredicate();
        Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtom() {
        assertTrue(SWRLUnaryAtom.class.isAssignableFrom(SWRLDataRangeAtom.class));
    }

    public void verifyInterfaceSWRLDataRangeAtom() {
        SWRLDataRangeAtom testSubject0 = mock(SWRLDataRangeAtom.class);
        OWLDataRange result0 = testSubject0.getPredicate();
        SWRLArgument result1 = testSubject0.getArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLDifferentIndividualsAtom.class));
    }

    public void verifyInterfaceSWRLDifferentIndividualsAtom() {
        SWRLDifferentIndividualsAtom testSubject0 = mock(SWRLDifferentIndividualsAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLIArgument result1 = testSubject0.getSecondArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLIArgument() {
        assertTrue(SWRLArgument.class.isAssignableFrom(SWRLIArgument.class));
    }

    public void verifyInterfaceSWRLIArgument() {
        SWRLIArgument testSubject0 = mock(SWRLIArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLIndividualArgument() {
        assertTrue(SWRLIArgument.class.isAssignableFrom(SWRLIndividualArgument.class));
    }

    public void verifyInterfaceSWRLIndividualArgument() {
        SWRLIndividualArgument testSubject0 = mock(SWRLIndividualArgument.class);
        OWLIndividual result0 = testSubject0.getIndividual();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result2 = testSubject0.getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        int result13 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLLiteralArgument() {
        assertTrue(SWRLDArgument.class.isAssignableFrom(SWRLLiteralArgument.class));
    }

    public void verifyInterfaceSWRLLiteralArgument() {
        SWRLLiteralArgument testSubject0 = mock(SWRLLiteralArgument.class);
        OWLLiteral result0 = testSubject0.getLiteral();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result2 = testSubject0.getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        int result13 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLObject() {
        assertTrue(OWLObject.class.isAssignableFrom(SWRLObject.class));
    }

    public void verifyInterfaceSWRLObject() {
        SWRLObject testSubject0 = mock(SWRLObject.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLObjectPropertyAtom.class));
    }

    public void verifyInterfaceSWRLObjectPropertyAtom() {
        SWRLObjectPropertyAtom testSubject0 = mock(SWRLObjectPropertyAtom.class);
        OWLObjectPropertyExpression result0 = testSubject0.getPredicate();
        SWRLObjectPropertyAtom result1 = testSubject0.getSimplified();
        SWRLArgument result2 = testSubject0.getFirstArgument();
        SWRLIArgument result3 = testSubject0.getSecondArgument();
        SWRLPredicate result4 = testSubject0.getPredicate();
        Collection<SWRLArgument> result5 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result6 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object36);
    }

    public void verifyInterfaceSWRLObjectVisitor() {
        SWRLObjectVisitor testSubject0 = mock(SWRLObjectVisitor.class);
    }

    public void verifyInterfaceSWRLObjectVisitorEx() {
        SWRLObjectVisitorEx<OWLObject> testSubject0 = mock(SWRLObjectVisitorEx.class);
    }

    public void verifyInterfaceSWRLPredicate() {
        SWRLPredicate testSubject0 = mock(SWRLPredicate.class);
    }

    @Test
    public void enforceInterfacesSWRLRule() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(SWRLRule.class));
        assertTrue(SWRLObject.class.isAssignableFrom(SWRLRule.class));
    }

    public void verifyInterfaceSWRLRule() {
        SWRLRule testSubject0 = mock(SWRLRule.class);
        boolean result0 = testSubject0.containsAnonymousClassExpressions();
        Set<OWLClassExpression> result1 = testSubject0.getClassAtomPredicates();
        Set<SWRLAtom> result2 = testSubject0.getBody();
        Set<SWRLAtom> result3 = testSubject0.getHead();
        Set<SWRLVariable> result4 = testSubject0.getVariables();
        SWRLRule result5 = testSubject0.getAxiomWithoutAnnotations();
        SWRLRule result6 = testSubject0.getSimplified();
        Set<OWLAnnotation> result7 = testSubject0.getAnnotations();
        Set<OWLAnnotation> result8 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result9 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result10 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set35);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        boolean result15 = testSubject0.isAnnotated();
        AxiomType<?> result16 = testSubject0.getAxiomType();
        boolean result17 = testSubject0.isOfType(_Set40);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object36);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result32 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLSameIndividualAtom.class));
    }

    public void verifyInterfaceSWRLSameIndividualAtom() {
        SWRLSameIndividualAtom testSubject0 = mock(SWRLSameIndividualAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLIArgument result1 = testSubject0.getSecondArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLUnaryAtom() {
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLUnaryAtom.class));
    }

    public void verifyInterfaceSWRLUnaryAtom() {
        SWRLUnaryAtom testSubject0 = mock(SWRLUnaryAtom.class);
        SWRLArgument result0 = testSubject0.getArgument();
        SWRLPredicate result1 = testSubject0.getPredicate();
        Collection<SWRLArgument> result2 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result4 = testSubject0.getSignature();
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        int result15 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesSWRLVariable() {
        assertTrue(SWRLIArgument.class.isAssignableFrom(SWRLVariable.class));
        assertTrue(SWRLDArgument.class.isAssignableFrom(SWRLVariable.class));
    }

    public void verifyInterfaceSWRLVariable() {
        SWRLVariable testSubject0 = mock(SWRLVariable.class);
        IRI result0 = testSubject0.getIRI();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        Set<OWLEntity> result2 = testSubject0.getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        int result13 = testSubject0.compareTo(_Object36);
    }

    @Test
    public void enforceInterfacesUnknownOWLOntologyException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(UnknownOWLOntologyException.class));
    }

    public void verifyUnknownOWLOntologyException() {
        UnknownOWLOntologyException testSubject0 = new UnknownOWLOntologyException(_OWLOntologyID);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesUnloadableImportException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(UnloadableImportException.class));
    }

    public void verifyUnloadableImportException() {
        UnloadableImportException testSubject0 = new UnloadableImportException(_OWLOntologyCreationException, _OWLImportsDeclaration);
        OWLImportsDeclaration result0 = testSubject0.getImportsDeclaration();
        OWLOntologyCreationException result1 = testSubject0.getOntologyCreationException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result2 = testSubject0.fillInStackTrace();
        Throwable result3 = testSubject0.getCause();
        Throwable result4 = testSubject0.initCause(_Throwable);
        String result5 = testSubject0.getMessage();
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    private static class P {
    }

    private static class T {
    }

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
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.net.URI _URI;
    private java.net.URL _URL;
    private List<? extends OWLObjectPropertyExpression> _List138;
    private List<? extends OWLOntologyChange<?>> _List;
    private List<OWLOntologyChange<?>> _List163;
    private List<SWRLDArgument> _List150;
    private Set<? extends OWLAnnotation> _Set119;
    private Set<? extends OWLAxiom> _Set194;
    private Set<? extends OWLClassExpression> _Set120;
    private Set<? extends OWLDataPropertyExpression> _Set142;
    private Set<? extends OWLDataRange> _Set133;
    private Set<? extends OWLIndividual> _Set136;
    private Set<? extends OWLLiteral> _Set127;
    private Set<? extends OWLObjectPropertyExpression> _Set140;
    private Set<? extends OWLPropertyExpression> _Set143;
    private Set<? extends SWRLAtom> _Set147;
    private Set<AxiomType<?>> _Set40;
    private Set<OWLAnnotation> _Set35;
    private Set<OWLAxiom> _Set;
    private Set<OWLFacetRestriction> _Set131;
    private Set<OWLOntology> _Set48;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private AddAxiom _AddAxiom;
    private AddImport _AddImport;
    private AddOntologyAnnotation _AddOntologyAnnotation;
    private AxiomType<?>[] _AxiomType_array;
    private AxiomType _AxiomType;
    private EntityType<?> _EntityType;
    private EntityType _EntityType52;
    private IRI _IRI;
    private ImpendingOWLOntologyChangeListener _ImpendingOWLOntologyChangeListener;
    private MissingImportEvent _MissingImportEvent;
    private MissingImportHandlingStrategy _MissingImportHandlingStrategy;
    private MissingImportListener _MissingImportListener;
    private NodeID _NodeID;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationObjectVisitor _OWLAnnotationObjectVisitor;
    private OWLAnnotationObjectVisitorEx<OWLObject> _OWLAnnotationObjectVisitorEx;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnnotationSubject _OWLAnnotationSubject;
    private OWLAnnotationSubjectVisitor _OWLAnnotationSubjectVisitor;
    private OWLAnnotationSubjectVisitorEx<OWLObject> _OWLAnnotationSubjectVisitorEx;
    private OWLAnnotationValue _OWLAnnotationValue;
    private OWLAnnotationValueVisitor _OWLAnnotationValueVisitor;
    private OWLAnnotationValueVisitorEx<OWLObject> _OWLAnnotationValueVisitorEx;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
    private OWLAxiomVisitor _OWLAxiomVisitor;
    private OWLAxiomVisitorEx<OWLObject> _OWLAxiomVisitorEx;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLClassExpressionVisitor _OWLClassExpressionVisitor;
    private OWLClassExpressionVisitorEx<OWLObject> _OWLClassExpressionVisitorEx;
    private OWLClassExpression[] _OWLClassExpression_array;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataComplementOf _OWLDataComplementOf;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataIntersectionOf _OWLDataIntersectionOf;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataOneOf _OWLDataOneOf;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLDataPropertyExpression[] _OWLDataPropertyExpression_array;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private OWLDataRange _OWLDataRange;
    private OWLDataRangeVisitor _OWLDataRangeVisitor;
    private OWLDataRangeVisitorEx<OWLObject> _OWLDataRangeVisitorEx;
    private OWLDataRange[] _OWLDataRange_array;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLDataUnionOf _OWLDataUnionOf;
    private OWLDataVisitor _OWLDataVisitor;
    private OWLDataVisitorEx<OWLObject> _OWLDataVisitorEx;
    private OWLDatatype _OWLDatatype;
    private OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private OWLDatatypeRestriction _OWLDatatypeRestriction;
    private OWLDeclarationAxiom _OWLDeclarationAxiom;
    private OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private OWLEntity _OWLEntity;
    private OWLEntityVisitor _OWLEntityVisitor;
    private OWLEntityVisitorEx<OWLObject> _OWLEntityVisitorEx;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFacetRestriction[] _OWLFacetRestriction_array;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLIndividual _OWLIndividual;
    private OWLIndividualVisitor _OWLIndividualVisitor;
    private OWLIndividualVisitorEx<OWLObject> _OWLIndividualVisitorEx;
    private OWLIndividual[] _OWLIndividual_array;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLLiteral[] _OWLLiteral_array;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNamedObjectVisitor _OWLNamedObjectVisitor;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObject _OWLObject;
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
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectPropertyExpression[] _OWLObjectPropertyExpression_array;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLObjectVisitor _OWLObjectVisitor;
    private OWLObjectVisitorEx<OWLObject> _OWLObjectVisitorEx;
    private OWLOntology _OWLOntology;
    private OWLOntologyChangeData<Object> _OWLOntologyChangeData;
    private OWLOntologyChange<Object> _OWLOntologyChange;
    private OWLOntologyChangeBroadcastStrategy _OWLOntologyChangeBroadcastStrategy;
    private OWLOntologyChangeListener _OWLOntologyChangeListener;
    private OWLOntologyChangeProgressListener _OWLOntologyChangeProgressListener;
    private OWLOntologyChangeVetoException _OWLOntologyChangeVetoException;
    private OWLOntologyChangeVisitor _OWLOntologyChangeVisitor;
    private OWLOntologyChangeVisitorEx<OWLObject> _OWLOntologyChangeVisitorEx;
    private OWLOntologyChangesVetoedListener _OWLOntologyChangesVetoedListener;
    private OWLOntologyCreationException _OWLOntologyCreationException;
    private OWLOntologyFactory _OWLOntologyFactory;
    private OWLOntologyFactory.OWLOntologyCreationHandler _OWLOntologyCreationHandler;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyIRIMapper _OWLOntologyIRIMapper;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private MissingOntologyHeaderStrategy _MissingOntologyHeaderStrategy;
    private OWLOntologyLoaderListener _OWLOntologyLoaderListener;
    private OWLOntologyLoaderListener.LoadingFinishedEvent _LoadingFinishedEvent;
    private OWLOntologyLoaderListener.LoadingStartedEvent _LoadingStartedEvent;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLOntologyStorer _OWLOntologyStorer;
    private OWLPropertyExpression[] _OWLPropertyExpression_array;
    private OWLPropertyExpressionVisitor _OWLPropertyExpressionVisitor;
    private OWLPropertyExpressionVisitorEx<OWLObject> _OWLPropertyExpressionVisitorEx;
    private OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private PrefixManager _PrefixManager;
    private RemoveAxiom _RemoveAxiom;
    private RemoveImport _RemoveImport;
    private RemoveOntologyAnnotation _RemoveOntologyAnnotation;
    private SWRLBuiltInAtom _SWRLBuiltInAtom;
    private SWRLClassAtom _SWRLClassAtom;
    private SWRLDArgument _SWRLDArgument;
    private SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private SWRLDataRangeAtom _SWRLDataRangeAtom;
    private SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private SWRLIArgument _SWRLIArgument;
    private SWRLIndividualArgument _SWRLIndividualArgument;
    private SWRLLiteralArgument _SWRLLiteralArgument;
    private SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private SWRLObjectVisitor _SWRLObjectVisitor;
    private SWRLObjectVisitorEx<OWLObject> _SWRLObjectVisitorEx;
    private SWRLRule _SWRLRule;
    private SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private SWRLVariable _SWRLVariable;
    private SetOntologyID _SetOntologyID;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
