package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unchecked", "unused" })
@RunWith(MockitoJUnitRunner.class)
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
        AddAxiomData result3 = testSubject0.getChangeData();
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        OWLAxiom result5 = testSubject0.getAxiom();
        boolean result6 = testSubject0.isImportChange();
        boolean result7 = testSubject0.isAxiomChange();
        boolean result8 = testSubject0.isRemoveAxiom();
        OWLOntology result9 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord<OWLAxiom> result10 = testSubject0.getChangeRecord();
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
        AddImportData result2 = testSubject0.getChangeData();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        boolean result4 = testSubject0.isAddAxiom();
        OWLAxiom result5 = testSubject0.getAxiom();
        boolean result6 = testSubject0.isImportChange();
        boolean result7 = testSubject0.isAxiomChange();
        OWLImportsDeclaration result8 = testSubject0.getImportDeclaration();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        OWLOntologyChangeRecord<OWLImportsDeclaration> result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotation() {
        assertTrue(AnnotationChange.class.isAssignableFrom(AddOntologyAnnotation.class));
    }

    public void verifyAddOntologyAnnotation() {
        AddOntologyAnnotation testSubject0 = new AddOntologyAnnotation(_OWLOntology, _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        AddOntologyAnnotationData result1 = testSubject0.getChangeData();
        org.semanticweb.owlapi.change.AddOntologyAnnotationData result2 = testSubject0.getChangeData();
        OWLAnnotation result3 = testSubject0.getAnnotation();
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        boolean result5 = testSubject0.isAddAxiom();
        OWLAxiom result6 = testSubject0.getAxiom();
        boolean result7 = testSubject0.isImportChange();
        boolean result8 = testSubject0.isAxiomChange();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord<OWLAnnotation> result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAnnotationChange() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(AnnotationChange.class));
    }

    public void verifyAnnotationChange() {
        AnnotationChange testSubject0 = mock(AnnotationChange.class);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        boolean result2 = testSubject0.isAddAxiom();
        OWLAxiom result3 = testSubject0.getAxiom();
        boolean result4 = testSubject0.isImportChange();
        boolean result5 = testSubject0.isAxiomChange();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result7 = testSubject0.isRemoveAxiom();
        OWLOntology result8 = testSubject0.getOntology();
        OWLOntologyChangeData<OWLAnnotation> result9 = testSubject0.getChangeData();
        OWLOntologyChangeRecord<OWLAnnotation> result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesAxiomType() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(AxiomType.class));
    }

    public void verifyAxiomType() {
        AxiomType<OWLAnnotationAssertionAxiom> testSubject0 = AxiomType.ANNOTATION_ASSERTION;
        java.lang.String result0 = testSubject0.getName();
        int result1 = testSubject0.getIndex();
        boolean result2 = testSubject0.isLogical();
        boolean result3 = testSubject0.isOWL2Axiom();
        boolean result4 = testSubject0.isNonSyntacticOWL2Axiom();
        java.util.Set<OWLAxiom> result5 = AxiomType.getAxiomsWithoutTypes(_Set, _AxiomType_array);
        java.util.Set<OWLAxiom> result6 = AxiomType.getAxiomsOfTypes(_Set, _AxiomType_array);
        boolean result7 = testSubject0.isAxiomType(_String);
        AxiomType<?> result8 = AxiomType.getAxiomType(_String);
    }

    @Test
    public void enforceInterfacesClassExpressionType() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(ClassExpressionType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(ClassExpressionType.class));
        assertTrue(HasShortForm.class.isAssignableFrom(ClassExpressionType.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(ClassExpressionType.class));
        assertTrue(HasIRI.class.isAssignableFrom(ClassExpressionType.class));
    }

    public void verifyEnumClassExpressionType() {
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
        IRI result1 = testSubject0.getIRI();
        java.lang.String result2 = testSubject0.getPrefixedName();
        java.lang.String result3 = testSubject0.getShortForm();
    }

    @Test
    public void enforceInterfacesDataRangeType() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(DataRangeType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(DataRangeType.class));
        assertTrue(HasShortForm.class.isAssignableFrom(DataRangeType.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(DataRangeType.class));
        assertTrue(HasIRI.class.isAssignableFrom(DataRangeType.class));
    }

    public void verifyEnumDataRangeType() {
        DataRangeType testSubject0 = DataRangeType.DATATYPE;
        DataRangeType testSubject1 = DataRangeType.DATA_ONE_OF;
        DataRangeType testSubject2 = DataRangeType.DATATYPE_RESTRICTION;
        DataRangeType testSubject3 = DataRangeType.DATA_COMPLEMENT_OF;
        DataRangeType testSubject4 = DataRangeType.DATA_UNION_OF;
        DataRangeType testSubject5 = DataRangeType.DATA_INTERSECTION_OF;
        java.lang.String result0 = testSubject0.getName();
        IRI result1 = testSubject0.getIRI();
        java.lang.String result2 = testSubject0.getPrefixedName();
        java.lang.String result3 = testSubject0.getShortForm();
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
        assertTrue(HasShortForm.class.isAssignableFrom(EntityType.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(EntityType.class));
        assertTrue(HasIRI.class.isAssignableFrom(EntityType.class));
    }

    public void verifyEntityType() {
        EntityType<OWLAnnotationProperty> testSubject0 = EntityType.ANNOTATION_PROPERTY;
        java.util.List<EntityType<?>> result0 = EntityType.values();
        java.lang.String result1 = testSubject0.getName();
        org.semanticweb.owlapi.vocab.OWLRDFVocabulary result2 = testSubject0.getVocabulary();
        java.lang.String result3 = testSubject0.getPrintName();
        java.lang.String result4 = testSubject0.getPluralPrintName();
        IRI result5 = testSubject0.getIRI();
        java.lang.String result6 = testSubject0.getPrefixedName();
        java.lang.String result7 = testSubject0.getShortForm();
    }

    public void verifyInterfaceHasAddAxioms() {
        HasAddAxioms testSubject0 = mock(HasAddAxioms.class);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.addAxioms(_OWLOntology, _Set12);
    }

    public void verifyInterfaceHasAnnotations() {
        HasAnnotations testSubject0 = mock(HasAnnotations.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
    }

    public void verifyInterfaceHasAnonymousIndividuals() {
        HasAnonymousIndividuals testSubject0 = mock(HasAnonymousIndividuals.class);
        java.util.Set<OWLAnonymousIndividual> result0 = testSubject0.getAnonymousIndividuals();
    }

    public void verifyInterfaceHasApplyChanges() {
        HasApplyChanges testSubject0 = mock(HasApplyChanges.class);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_List);
    }

    public void verifyInterfaceHasAxioms() {
        HasAxioms testSubject0 = mock(HasAxioms.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.getAxioms();
    }

    public void verifyInterfaceHasAxiomsByType() {
        HasAxiomsByType testSubject0 = mock(HasAxiomsByType.class);
        Set<OWLAnnotationAssertionAxiom> result0 = testSubject0.getAxioms(_AxiomType);
    }

    public void verifyInterfaceHasCardinality() {
        HasCardinality testSubject0 = mock(HasCardinality.class);
        int result0 = testSubject0.getCardinality();
    }

    public void verifyInterfaceHasClassesInSignature() {
        HasClassesInSignature testSubject0 = mock(HasClassesInSignature.class);
        java.util.Set<OWLClass> result0 = testSubject0.getClassesInSignature();
    }

    public void verifyInterfaceHasContainsAxiom() {
        HasContainsAxiom testSubject0 = mock(HasContainsAxiom.class);
        boolean result0 = testSubject0.containsAxiom(_OWLAxiom);
    }

    public void verifyInterfaceHasContainsEntityInSignature() {
        HasContainsEntityInSignature testSubject0 = mock(HasContainsEntityInSignature.class);
        boolean result0 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceHasContainsOntology() {
        HasContainsOntology testSubject0 = mock(HasContainsOntology.class);
        boolean result0 = testSubject0.contains(_OWLOntologyID);
    }

    public void verifyInterfaceHasDataFactory() {
        HasDataFactory testSubject0 = mock(HasDataFactory.class);
        OWLDataFactory result0 = testSubject0.getOWLDataFactory();
    }

    public void verifyInterfaceHasDataPropertiesInSignature() {
        HasDataPropertiesInSignature testSubject0 = mock(HasDataPropertiesInSignature.class);
        java.util.Set<OWLDataProperty> result0 = testSubject0.getDataPropertiesInSignature();
    }

    public void verifyInterfaceHasDatatypesInSignature() {
        HasDatatypesInSignature testSubject0 = mock(HasDatatypesInSignature.class);
        java.util.Set<OWLDatatype> result0 = testSubject0.getDatatypesInSignature();
    }

    public void verifyInterfaceHasDirectImports() {
        HasDirectImports testSubject0 = mock(HasDirectImports.class);
        java.util.Set<OWLOntology> result0 = testSubject0.getDirectImports();
    }

    public void verifyInterfaceHasDomain() {
        HasDomain<OWLObject> testSubject0 = mock(HasDomain.class);
        OWLObject result0 = testSubject0.getDomain();
    }

    public void verifyInterfaceHasFiller() {
        HasFiller<OWLObject> testSubject0 = mock(HasFiller.class);
        OWLObject result0 = testSubject0.getFiller();
    }

    public void verifyInterfaceHasGetEntitiesInSignature() {
        HasGetEntitiesInSignature testSubject0 = mock(HasGetEntitiesInSignature.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntitiesInSignature(_IRI);
    }

    public void verifyInterfaceHasGetOntologies() {
        HasGetOntologies testSubject0 = mock(HasGetOntologies.class);
        java.util.Set<OWLOntology> result0 = testSubject0.getOntologies();
    }

    public void verifyInterfaceHasGetOntologyById() {
        HasGetOntologyById testSubject0 = mock(HasGetOntologyById.class);
        OWLOntology result0 = testSubject0.getOntology(_OWLOntologyID);
    }

    public void verifyInterfaceHasImportsClosure() {
        HasImportsClosure testSubject0 = mock(HasImportsClosure.class);
        java.util.Set<OWLOntology> result0 = testSubject0.getImportsClosure();
    }

    public void verifyInterfaceHasIndividualsInSignature() {
        HasIndividualsInSignature testSubject0 = mock(HasIndividualsInSignature.class);
        java.util.Set<OWLNamedIndividual> result0 = testSubject0.getIndividualsInSignature();
    }

    public void verifyInterfaceHasIRI() {
        HasIRI testSubject0 = mock(HasIRI.class);
        IRI result0 = testSubject0.getIRI();
    }

    public void verifyInterfaceHasLang() {
        HasLang testSubject0 = mock(HasLang.class);
        java.lang.String result0 = testSubject0.getLang();
    }

    public void verifyInterfaceHasLogicalAxioms() {
        HasLogicalAxioms testSubject0 = mock(HasLogicalAxioms.class);
        java.util.Set<OWLLogicalAxiom> result0 = testSubject0.getLogicalAxioms();
    }

    public void verifyInterfaceHasObject() {
        HasObject<OWLObject> testSubject0 = mock(HasObject.class);
        OWLObject result0 = testSubject0.getObject();
    }

    public void verifyInterfaceHasObjectPropertiesInSignature() {
        HasObjectPropertiesInSignature testSubject0 = mock(HasObjectPropertiesInSignature.class);
        java.util.Set<OWLObjectProperty> result0 = testSubject0.getObjectPropertiesInSignature();
    }

    public void verifyInterfaceHasOntologyID() {
        HasOntologyID testSubject0 = mock(HasOntologyID.class);
        OWLOntologyID result0 = testSubject0.getOntologyID();
    }

    public void verifyInterfaceHasPrefixedName() {
        HasPrefixedName testSubject0 = mock(HasPrefixedName.class);
        java.lang.String result0 = testSubject0.getPrefixedName();
    }

    public void verifyInterfaceHasProperty() {
        HasProperty<OWLObjectProperty> testSubject0 = mock(HasProperty.class);
        OWLObjectProperty result0 = testSubject0.getProperty();
    }

    public void verifyInterfaceHasRange() {
        HasRange<OWLClass> testSubject0 = mock(HasRange.class);
        OWLClass result0 = testSubject0.getRange();
    }

    public void verifyInterfaceHasRemoveAxioms() {
        HasRemoveAxioms testSubject0 = mock(HasRemoveAxioms.class);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.removeAxioms(_OWLOntology, _Set12);
    }

    public void verifyInterfaceHasShortForm() {
        HasShortForm testSubject0 = mock(HasShortForm.class);
        java.lang.String result0 = testSubject0.getShortForm();
    }

    public void verifyInterfaceHasSignature() {
        HasSignature testSubject0 = mock(HasSignature.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
    }

    public void verifyInterfaceHasSubject() {
        HasSubject<OWLObject> testSubject0 = mock(HasSubject.class);
        OWLObject result0 = testSubject0.getSubject();
    }

    @Test
    public void enforceInterfacesImmutableOWLOntologyChangeException() {
        assertTrue(OWLOntologyChangeException.class.isAssignableFrom(ImmutableOWLOntologyChangeException.class));
    }

    public void verifyImmutableOWLOntologyChangeException() {
        ImmutableOWLOntologyChangeException testSubject0 = new ImmutableOWLOntologyChangeException(_OWLOntologyChange);
        OWLOntologyChange<?> result0 = testSubject0.getChange();
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
        ImportChange testSubject0 = mock(ImportChange.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        boolean result1 = testSubject0.isAddAxiom();
        OWLAxiom result2 = testSubject0.getAxiom();
        boolean result3 = testSubject0.isImportChange();
        boolean result4 = testSubject0.isAxiomChange();
        OWLImportsDeclaration result5 = testSubject0.getImportDeclaration();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result7 = testSubject0.isRemoveAxiom();
        OWLOntology result8 = testSubject0.getOntology();
        OWLOntologyChangeData<OWLImportsDeclaration> result9 = testSubject0.getChangeData();
        OWLOntologyChangeRecord<OWLImportsDeclaration> result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesIRI() {
        assertTrue(OWLAnnotationSubject.class.isAssignableFrom(IRI.class));
        assertTrue(OWLAnnotationValue.class.isAssignableFrom(IRI.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(IRI.class));
        assertTrue(java.lang.CharSequence.class.isAssignableFrom(IRI.class));
        assertTrue(OWLPrimitive.class.isAssignableFrom(IRI.class));
    }

    public void verifyIRI() {
        IRI testSubject0 = mock(IRI.class);
        int result0 = testSubject0.compareTo(_Object);
        int result1 = testSubject0.compareTo(_OWLObject);
        int result2 = testSubject0.length();
        char result3 = testSubject0.charAt(_int);
        java.lang.CharSequence result4 = testSubject0.subSequence(_int, _int);
        boolean result5 = testSubject0.isAbsolute();
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        IRI result7 = testSubject0.resolve(_String);
        java.net.URI result8 = testSubject0.toURI();
        java.lang.String result9 = testSubject0.getScheme();
        java.lang.String result10 = testSubject0.getFragment();
        OWLObject result11 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result12 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        OWLObject result13 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        IRI result14 = IRI.create(_URI);
        IRI result15 = IRI.create(_File);
        IRI result16 = IRI.create(_String, _String);
        IRI result17 = IRI.create(_String);
        IRI result18 = IRI.create(_URL);
        boolean result19 = testSubject0.isReservedVocabulary();
        java.lang.String result20 = testSubject0.toQuotedString();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.String result31 = testSubject0.getNamespace();
        boolean result32 = testSubject0.isThing();
        boolean result33 = testSubject0.isNothing();
        boolean result34 = testSubject0.isPlainLiteral();
        IRI result35 = IRI.generateDocumentIRI();
    }

    public void verifyInterfaceMIMETypeAware() {
        MIMETypeAware testSubject0 = mock(MIMETypeAware.class);
        java.lang.String result0 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result1 = testSubject0.getMIMETypes();
        boolean result2 = testSubject0.handlesMimeType(_String);
    }

    public void verifyMissingImportEvent() {
        MissingImportEvent testSubject0 = new MissingImportEvent(_IRI, _OWLOntologyCreationException);
        OWLOntologyCreationException result0 = testSubject0.getCreationException();
        IRI result1 = testSubject0.getImportedOntologyURI();
    }

    @Test
    public void enforceInterfacesMissingImportHandlingStrategy() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(MissingImportHandlingStrategy.class));
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
        assertTrue(java.lang.Comparable.class.isAssignableFrom(NodeID.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(NodeID.class));
    }

    public void verifyNodeID() {
        NodeID testSubject0 = NodeID.getNodeID("id");
        int result1 = testSubject0.compareTo(_NodeID);
        java.lang.String result2 = testSubject0.getID();
        boolean result3 = NodeID.isAnonymousNodeIRI(_String);
        boolean result4 = NodeID.isAnonymousNodeIRI(_IRI);
        java.lang.String result5 = NodeID.nodeString(_int);
        java.lang.String result6 = NodeID.getIRIFromNodeID(_String);
        java.lang.String result7 = NodeID.nextAnonymousIRI();
        boolean result8 = NodeID.isAnonymousNodeID(_String);
        NodeID result9 = NodeID.getNodeID(_String);
        IRI result10 = NodeID.nodeId(_int);
    }

    @Test
    public void enforceInterfacesOWLAnnotation() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLAnnotation.class));
        assertTrue(HasAnnotations.class.isAssignableFrom(OWLAnnotation.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLAnnotation.class));
    }

    public void verifyInterfaceOWLAnnotation() {
        OWLAnnotation testSubject0 = mock(OWLAnnotation.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLAnnotationValue result1 = testSubject0.getValue();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        OWLObject result3 = testSubject0.accept(_OWLAnnotationObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationObjectVisitor);
        boolean result4 = testSubject0.isDeprecatedIRIAnnotation();
        OWLAnnotation result5 = testSubject0.getAnnotatedAnnotation(_Set39);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object);
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result19 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLAnnotationAssertionAxiom.class));
        assertTrue(HasSubject.class.isAssignableFrom(OWLAnnotationAssertionAxiom.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLAnnotationAssertionAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationAssertionAxiom() {
        OWLAnnotationAssertionAxiom testSubject0 = mock(OWLAnnotationAssertionAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLAnnotationValue result1 = testSubject0.getValue();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        OWLAnnotationAssertionAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAnnotationSubject result4 = testSubject0.getSubject();
        boolean result5 = testSubject0.isDeprecatedIRIAssertion();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set43);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object);
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result32 = testSubject0.getSubject();
        java.lang.Object result33 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLAnnotationAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLAnnotationAxiom.class));
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLAnnotationAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationAxiom() {
        OWLAnnotationAxiom testSubject0 = mock(OWLAnnotationAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLAnnotationAxiomVisitor() {
        OWLAnnotationAxiomVisitor testSubject0 = mock(OWLAnnotationAxiomVisitor.class);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
    }

    public void verifyInterfaceOWLAnnotationAxiomVisitorEx() {
        OWLAnnotationAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationAxiomVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result1 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result2 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result3 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObject() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLAnnotationObject.class));
    }

    public void verifyInterfaceOWLAnnotationObject() {
        OWLAnnotationObject testSubject0 = mock(OWLAnnotationObject.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object);
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnnotationObjectVisitor() {
        assertTrue(OWLAnnotationAxiomVisitor.class.isAssignableFrom(OWLAnnotationObjectVisitor.class));
        assertTrue(OWLAnnotationValueVisitor.class.isAssignableFrom(OWLAnnotationObjectVisitor.class));
    }

    public void verifyInterfaceOWLAnnotationObjectVisitor() {
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
    public void enforceInterfacesOWLAnnotationObjectVisitorEx() {
        assertTrue(OWLAnnotationAxiomVisitorEx.class.isAssignableFrom(OWLAnnotationObjectVisitorEx.class));
        assertTrue(OWLAnnotationValueVisitorEx.class.isAssignableFrom(OWLAnnotationObjectVisitorEx.class));
    }

    public void verifyInterfaceOWLAnnotationObjectVisitorEx() {
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
    public void enforceInterfacesOWLAnnotationProperty() {
        assertTrue(OWLProperty.class.isAssignableFrom(OWLAnnotationProperty.class));
    }

    public void verifyInterfaceOWLAnnotationProperty() {
        OWLAnnotationProperty testSubject0 = mock(OWLAnnotationProperty.class);
        boolean result0 = testSubject0.isComment();
        boolean result1 = testSubject0.isLabel();
        boolean result2 = testSubject0.isDeprecated();
        OWLObject result3 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result4 = testSubject0.isOWLTopDataProperty();
        boolean result5 = testSubject0.isDataPropertyExpression();
        boolean result6 = testSubject0.isObjectPropertyExpression();
        boolean result7 = testSubject0.isOWLTopObjectProperty();
        boolean result8 = testSubject0.isOWLBottomObjectProperty();
        boolean result9 = testSubject0.isOWLBottomDataProperty();
        boolean result10 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        OWLObject result12 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result14 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result15 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result16 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result17 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result18 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result19 = testSubject0.getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        int result22 = testSubject0.compareTo(_Object);
        boolean result23 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result24 = testSubject0.isType(_EntityType);
        OWLObject result25 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result26 = testSubject0.isBuiltIn();
        EntityType<?> result27 = testSubject0.getEntityType();
        boolean result28 = testSubject0.isOWLClass();
        OWLClass result29 = testSubject0.asOWLClass();
        boolean result30 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result31 = testSubject0.asOWLObjectProperty();
        boolean result32 = testSubject0.isOWLDataProperty();
        OWLDataProperty result33 = testSubject0.asOWLDataProperty();
        boolean result34 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result35 = testSubject0.asOWLNamedIndividual();
        boolean result36 = testSubject0.isOWLDatatype();
        OWLDatatype result37 = testSubject0.asOWLDatatype();
        boolean result38 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result39 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result40 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result41 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiom.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiom.class));
        assertTrue(HasDomain.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationPropertyDomainAxiom() {
        OWLAnnotationPropertyDomainAxiom testSubject0 = mock(OWLAnnotationPropertyDomainAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        IRI result1 = testSubject0.getDomain();
        OWLAnnotationPropertyDomainAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
        IRI result30 = testSubject0.getDomain();
    }

    public void verifyInterfaceOWLAnnotationPropertyProvider() {
        OWLAnnotationPropertyProvider testSubject0 = mock(OWLAnnotationPropertyProvider.class);
        OWLAnnotationProperty result0 = testSubject0.getOWLAnnotationProperty(_IRI);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeAxiom() {
        assertTrue(OWLAnnotationAxiom.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiom.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiom.class));
        assertTrue(HasRange.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLAnnotationPropertyRangeAxiom() {
        OWLAnnotationPropertyRangeAxiom testSubject0 = mock(OWLAnnotationPropertyRangeAxiom.class);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        IRI result1 = testSubject0.getRange();
        OWLAnnotationPropertyRangeAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
        java.lang.Object result30 = testSubject0.getRange();
    }

    @Test
    public void enforceInterfacesOWLAnnotationSubject() {
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLAnnotationSubject.class));
        assertTrue(OWLPrimitive.class.isAssignableFrom(OWLAnnotationSubject.class));
    }

    public void verifyInterfaceOWLAnnotationSubject() {
        OWLAnnotationSubject testSubject0 = mock(OWLAnnotationSubject.class);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx56);
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLAnnotationSubjectVisitor() {
        OWLAnnotationSubjectVisitor testSubject0 = mock(OWLAnnotationSubjectVisitor.class);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
    }

    public void verifyInterfaceOWLAnnotationSubjectVisitorEx() {
        OWLAnnotationSubjectVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationSubjectVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_IRI);
        OWLObject result1 = testSubject0.visit(_OWLAnonymousIndividual);
    }

    @Test
    public void enforceInterfacesOWLAnnotationValue() {
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLAnnotationValue.class));
        assertTrue(OWLPrimitive.class.isAssignableFrom(OWLAnnotationValue.class));
    }

    public void verifyInterfaceOWLAnnotationValue() {
        OWLAnnotationValue testSubject0 = mock(OWLAnnotationValue.class);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLAnnotationValueVisitor() {
        OWLAnnotationValueVisitor testSubject0 = mock(OWLAnnotationValueVisitor.class);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLLiteral);
    }

    public void verifyInterfaceOWLAnnotationValueVisitorEx() {
        OWLAnnotationValueVisitorEx<OWLObject> testSubject0 = mock(OWLAnnotationValueVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_IRI);
        OWLObject result1 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result2 = testSubject0.visit(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesOWLAnonymousClassExpression() {
        assertTrue(OWLClassExpression.class.isAssignableFrom(OWLAnonymousClassExpression.class));
    }

    public void verifyInterfaceOWLAnonymousClassExpression() {
        OWLAnonymousClassExpression testSubject0 = mock(OWLAnonymousClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result1 = testSubject0.asOWLClass();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividual() {
        assertTrue(OWLIndividual.class.isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(OWLAnnotationValue.class.isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(OWLAnnotationSubject.class.isAssignableFrom(OWLAnonymousIndividual.class));
        assertTrue(OWLPrimitive.class.isAssignableFrom(OWLAnonymousIndividual.class));
    }

    public void verifyInterfaceOWLAnonymousIndividual() {
        OWLAnonymousIndividual testSubject0 = mock(OWLAnonymousIndividual.class);
        NodeID result0 = testSubject0.getID();
        OWLObject result1 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        OWLNamedIndividual result2 = testSubject0.asOWLNamedIndividual();
        java.lang.String result3 = testSubject0.toStringID();
        boolean result4 = testSubject0.isNamed();
        boolean result5 = testSubject0.isAnonymous();
        OWLAnonymousIndividual result6 = testSubject0.asOWLAnonymousIndividual();
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result20 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLObject result21 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx56);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualByIdProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLAnonymousIndividualByIdProvider.class));
    }

    public void verifyInterfaceOWLAnonymousIndividualByIdProvider() {
        OWLAnonymousIndividualByIdProvider testSubject0 = mock(OWLAnonymousIndividualByIdProvider.class);
        OWLAnonymousIndividual result0 = testSubject0.getOWLAnonymousIndividual(_String);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLAnonymousIndividualProvider.class));
    }

    public void verifyInterfaceOWLAnonymousIndividualProvider() {
        OWLAnonymousIndividualProvider testSubject0 = mock(OWLAnonymousIndividualProvider.class);
        OWLAnonymousIndividual result0 = testSubject0.getOWLAnonymousIndividual();
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLAsymmetricObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLAsymmetricObjectPropertyAxiom() {
        OWLAsymmetricObjectPropertyAxiom testSubject0 = mock(OWLAsymmetricObjectPropertyAxiom.class);
        OWLAsymmetricObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLAxiom() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLAxiom.class));
        assertTrue(HasAnnotations.class.isAssignableFrom(OWLAxiom.class));
    }

    public void verifyInterfaceOWLAxiom() {
        OWLAxiom testSubject0 = mock(OWLAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAxiomChange() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(OWLAxiomChange.class));
    }

    public void verifyOWLAxiomChange() {
        OWLAxiomChange testSubject0 = mock(OWLAxiomChange.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLAxiom result1 = testSubject0.getAxiom();
        boolean result2 = testSubject0.isImportChange();
        boolean result3 = testSubject0.isAxiomChange();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result4 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result5 = testSubject0.isAddAxiom();
        boolean result6 = testSubject0.isRemoveAxiom();
        OWLOntology result7 = testSubject0.getOntology();
        OWLOntologyChangeData<OWLAxiom> result8 = testSubject0.getChangeData();
        OWLOntologyChangeRecord<OWLAxiom> result9 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesOWLAxiomCollection() {
        assertTrue(HasAxioms.class.isAssignableFrom(OWLAxiomCollection.class));
        assertTrue(HasLogicalAxioms.class.isAssignableFrom(OWLAxiomCollection.class));
        assertTrue(HasAxiomsByType.class.isAssignableFrom(OWLAxiomCollection.class));
        assertTrue(HasContainsAxiom.class.isAssignableFrom(OWLAxiomCollection.class));
    }

    public void verifyInterfaceOWLAxiomCollection() {
        OWLAxiomCollection testSubject0 = mock(OWLAxiomCollection.class);
        java.util.Set<OWLClassAxiom> result0 = testSubject0.getAxioms(_OWLClass, _imports);
        java.util.Set<OWLDatatypeDefinitionAxiom> result1 = testSubject0.getAxioms(_OWLDatatype, _imports);
        Set<OWLAnnotationAssertionAxiom> result2 = testSubject0.getAxioms(_AxiomType, _imports);
        Set<OWLAnnotationAssertionAxiom> result3 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<OWLAnnotationAxiom> result4 = testSubject0.getAxioms(_OWLAnnotationProperty, _imports);
        java.util.Set<OWLIndividualAxiom> result5 = testSubject0.getAxioms(_OWLIndividual, _imports);
        java.util.Set<OWLDataPropertyAxiom> result6 = testSubject0.getAxioms(_OWLDataProperty, _imports);
        java.util.Set<OWLObjectPropertyAxiom> result7 = testSubject0.getAxioms(_OWLObjectPropertyExpression, _imports);
        java.util.Set<OWLAxiom> result8 = testSubject0.getAxioms(_imports);
        java.util.Set<OWLAxiom> result9 = testSubject0.getAxioms();
        boolean result10 = testSubject0.containsAxiom(_OWLAxiom, _imports, _ignore);
        boolean result11 = testSubject0.containsAxiom(_OWLAxiom);
        int result12 = testSubject0.getAxiomCount(_imports);
        int result13 = testSubject0.getAxiomCount();
        int result14 = testSubject0.getAxiomCount(_AxiomType);
        int result15 = testSubject0.getAxiomCount(_AxiomType, _imports);
        java.util.Set<OWLLogicalAxiom> result16 = testSubject0.getLogicalAxioms(_imports);
        java.util.Set<OWLLogicalAxiom> result17 = testSubject0.getLogicalAxioms();
        int result18 = testSubject0.getLogicalAxiomCount();
        int result19 = testSubject0.getLogicalAxiomCount(_imports);
        java.util.Set<OWLAxiom> result20 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom, _imports);
        java.util.Set<OWLAxiom> result21 = testSubject0.getReferencingAxioms(_OWLPrimitive, _imports);
    }

    public void verifyInterfaceOWLAxiomIndex() {
        OWLAxiomIndex testSubject0 = mock(OWLAxiomIndex.class);
        boolean result0 = testSubject0.contains(_OWLAxiomSearchFilter, _Object, _imports);
        java.util.Set<OWLAxiom> result1 = testSubject0.getAxioms(OWLAxiom.class, _Class71, _OWLObject, _imports, _ignore);
        java.util.Set<OWLAxiom> result2 = testSubject0.getAxioms(OWLAxiom.class, _OWLObject, _imports, _ignore);
        java.util.Collection<OWLAxiom> result3 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object, _imports);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result4 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result5 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result6 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result7 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result8 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result9 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result10 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result11 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result12 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result13 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result14 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result15 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result16 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result17 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result18 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result19 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result20 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result21 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result22 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result23 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result24 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result25 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result26 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result27 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result28 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result29 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result30 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result31 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result32 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result33 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result34 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result35 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result36 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLClassAssertionAxiom> result37 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLDataPropertyAssertionAxiom> result38 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result39 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result40 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result41 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result42 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result43 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result44 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitor() {
        assertTrue(OWLAnnotationAxiomVisitor.class.isAssignableFrom(OWLAxiomVisitor.class));
        assertTrue(OWLLogicalAxiomVisitor.class.isAssignableFrom(OWLAxiomVisitor.class));
    }

    public void verifyInterfaceOWLAxiomVisitor() {
        OWLAxiomVisitor testSubject0 = mock(OWLAxiomVisitor.class);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
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

    @Test
    public void enforceInterfacesOWLAxiomVisitorEx() {
        assertTrue(OWLAnnotationAxiomVisitorEx.class.isAssignableFrom(OWLAxiomVisitorEx.class));
        assertTrue(OWLLogicalAxiomVisitorEx.class.isAssignableFrom(OWLAxiomVisitorEx.class));
    }

    public void verifyInterfaceOWLAxiomVisitorEx() {
        OWLAxiomVisitorEx<OWLObject> testSubject0 = mock(OWLAxiomVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result1 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result2 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result3 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result4 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result5 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result6 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result7 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result8 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result9 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result10 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result11 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result12 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result13 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result14 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result15 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result16 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result17 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result18 = testSubject0.visit(_SWRLRule);
        OWLObject result19 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result20 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result21 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result22 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result23 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result24 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result25 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result26 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result27 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result28 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result29 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result30 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result31 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result32 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result33 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result34 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result35 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result36 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result37 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result38 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLBooleanClassExpression() {
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLBooleanClassExpression.class));
    }

    public void verifyInterfaceOWLBooleanClassExpression() {
        OWLBooleanClassExpression testSubject0 = mock(OWLBooleanClassExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result1 = testSubject0.asOWLClass();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLCardinalityRestriction() {
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLCardinalityRestriction.class));
        assertTrue(HasCardinality.class.isAssignableFrom(OWLCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLCardinalityRestriction() {
        OWLCardinalityRestriction<OWLPropertyRange> testSubject0 = mock(OWLCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
    }

    @Test
    public void enforceInterfacesOWLClass() {
        assertTrue(OWLClassExpression.class.isAssignableFrom(OWLClass.class));
        assertTrue(OWLLogicalEntity.class.isAssignableFrom(OWLClass.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLClass.class));
    }

    public void verifyInterfaceOWLClass() {
        OWLClass testSubject0 = mock(OWLClass.class);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result1 = testSubject0.asOWLClass();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result26 = testSubject0.isType(_EntityType);
        OWLObject result27 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result28 = testSubject0.isBuiltIn();
        EntityType<?> result29 = testSubject0.getEntityType();
        boolean result30 = testSubject0.isOWLClass();
        OWLClass result31 = testSubject0.asOWLClass();
        boolean result32 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result33 = testSubject0.asOWLObjectProperty();
        boolean result34 = testSubject0.isOWLDataProperty();
        OWLDataProperty result35 = testSubject0.asOWLDataProperty();
        boolean result36 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result37 = testSubject0.asOWLNamedIndividual();
        boolean result38 = testSubject0.isOWLDatatype();
        OWLDatatype result39 = testSubject0.asOWLDatatype();
        boolean result40 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result41 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result42 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result43 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiom() {
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLClassAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLClassAssertionAxiom.class));
    }

    public void verifyInterfaceOWLClassAssertionAxiom() {
        OWLClassAssertionAxiom testSubject0 = mock(OWLClassAssertionAxiom.class);
        OWLClassExpression result0 = testSubject0.getClassExpression();
        OWLIndividual result1 = testSubject0.getIndividual();
        OWLClassAssertionAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLClassAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLClassAxiom.class));
    }

    public void verifyInterfaceOWLClassAxiom() {
        OWLClassAxiom testSubject0 = mock(OWLClassAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        OWLClass result1 = testSubject0.asOWLClass();
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLClassExpressionVisitor() {
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

    public void verifyInterfaceOWLClassExpressionVisitorEx() {
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
    public void enforceInterfacesOWLClassProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLClassProvider.class));
    }

    public void verifyInterfaceOWLClassProvider() {
        OWLClassProvider testSubject0 = mock(OWLClassProvider.class);
        OWLClass result0 = testSubject0.getOWLClass(_IRI);
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFrom() {
        assertTrue(OWLQuantifiedDataRestriction.class.isAssignableFrom(OWLDataAllValuesFrom.class));
    }

    public void verifyInterfaceOWLDataAllValuesFrom() {
        OWLDataAllValuesFrom testSubject0 = mock(OWLDataAllValuesFrom.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
        OWLDataPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataCardinalityRestriction() {
        assertTrue(OWLCardinalityRestriction.class.isAssignableFrom(OWLDataCardinalityRestriction.class));
        assertTrue(OWLDataRestriction.class.isAssignableFrom(OWLDataCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLDataCardinalityRestriction() {
        OWLDataCardinalityRestriction testSubject0 = mock(OWLDataCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
        OWLDataPropertyExpression result32 = testSubject0.getProperty();
        java.lang.Object result33 = testSubject0.getProperty();
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
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        java.lang.Object result3 = testSubject0.getFiller();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result7 = testSubject0.asOWLClass();
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object);
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result32 = testSubject0.getFiller();
        OWLDataPropertyExpression result33 = testSubject0.getProperty();
        java.lang.Object result34 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataFactory() {
        assertTrue(SWRLDataFactory.class.isAssignableFrom(OWLDataFactory.class));
        assertTrue(OWLEntityProvider.class.isAssignableFrom(OWLDataFactory.class));
        assertTrue(OWLEntityByTypeProvider.class.isAssignableFrom(OWLDataFactory.class));
        assertTrue(OWLAnonymousIndividualProvider.class.isAssignableFrom(OWLDataFactory.class));
        assertTrue(OWLAnonymousIndividualByIdProvider.class.isAssignableFrom(OWLDataFactory.class));
    }

    public void verifyInterfaceOWLDataFactory() {
        OWLDataFactory testSubject0 = mock(OWLDataFactory.class);
        OWLObjectUnionOf result0 = testSubject0.getOWLObjectUnionOf(_OWLClassExpression_array);
        OWLObjectUnionOf result1 = testSubject0.getOWLObjectUnionOf(_Set131);
        OWLObjectAllValuesFrom result2 = testSubject0.getOWLObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLSubClassOfAxiom result3 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLSubClassOfAxiom result4 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression, _Set132);
        testSubject0.purge();
        OWLClass result5 = testSubject0.getOWLThing();
        OWLClass result6 = testSubject0.getOWLNothing();
        OWLObjectProperty result7 = testSubject0.getOWLTopObjectProperty();
        OWLDataProperty result8 = testSubject0.getOWLTopDataProperty();
        OWLObjectProperty result9 = testSubject0.getOWLBottomObjectProperty();
        OWLDataProperty result10 = testSubject0.getOWLBottomDataProperty();
        OWLDatatype result11 = testSubject0.getTopDatatype();
        OWLClass result12 = testSubject0.getOWLClass(_String, _PrefixManager);
        OWLObjectProperty result13 = testSubject0.getOWLObjectProperty(_String, _PrefixManager);
        OWLObjectInverseOf result14 = testSubject0.getOWLObjectInverseOf(_OWLObjectPropertyExpression);
        OWLDataProperty result15 = testSubject0.getOWLDataProperty(_String, _PrefixManager);
        OWLNamedIndividual result16 = testSubject0.getOWLNamedIndividual(_String, _PrefixManager);
        OWLAnnotationProperty result17 = testSubject0.getOWLAnnotationProperty(_String, _PrefixManager);
        OWLAnnotationProperty result18 = testSubject0.getRDFSLabel();
        OWLAnnotationProperty result19 = testSubject0.getRDFSComment();
        OWLAnnotationProperty result20 = testSubject0.getRDFSSeeAlso();
        OWLAnnotationProperty result21 = testSubject0.getRDFSIsDefinedBy();
        OWLAnnotationProperty result22 = testSubject0.getOWLVersionInfo();
        OWLAnnotationProperty result23 = testSubject0.getOWLBackwardCompatibleWith();
        OWLAnnotationProperty result24 = testSubject0.getOWLIncompatibleWith();
        OWLAnnotationProperty result25 = testSubject0.getOWLDeprecated();
        OWLDatatype result26 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result27 = testSubject0.getOWLDatatype(_String, _PrefixManager);
        OWLDatatype result28 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result29 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result30 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result31 = testSubject0.getBooleanOWLDatatype();
        OWLLiteral result32 = testSubject0.getOWLLiteral(_String, _String);
        OWLLiteral result33 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result34 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result35 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result36 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result37 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result38 = testSubject0.getOWLLiteral(_String, _OWL2Datatype);
        OWLLiteral result39 = testSubject0.getOWLLiteral(_String);
        OWLDataOneOf result40 = testSubject0.getOWLDataOneOf(_OWLLiteral_array);
        OWLDataOneOf result41 = testSubject0.getOWLDataOneOf(_Set138);
        OWLDataComplementOf result42 = testSubject0.getOWLDataComplementOf(_OWLDataRange);
        OWLDatatypeRestriction result43 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        OWLDatatypeRestriction result44 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _Set141);
        OWLDatatypeRestriction result45 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacet, _OWLLiteral);
        OWLDatatypeRestriction result46 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_int);
        OWLDatatypeRestriction result47 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_double);
        OWLDatatypeRestriction result48 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_int);
        OWLDatatypeRestriction result49 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_double);
        OWLDatatypeRestriction result50 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_int, _int);
        OWLDatatypeRestriction result51 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_double, _double);
        OWLDatatypeRestriction result52 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_int);
        OWLDatatypeRestriction result53 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_double);
        OWLDatatypeRestriction result54 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_int);
        OWLDatatypeRestriction result55 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_double);
        OWLDatatypeRestriction result56 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_double, _double);
        OWLDatatypeRestriction result57 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_int, _int);
        OWLFacetRestriction result58 = testSubject0.getOWLFacetRestriction(_OWLFacet, _OWLLiteral);
        OWLFacetRestriction result59 = testSubject0.getOWLFacetRestriction(_OWLFacet, _double);
        OWLFacetRestriction result60 = testSubject0.getOWLFacetRestriction(_OWLFacet, _float);
        OWLFacetRestriction result61 = testSubject0.getOWLFacetRestriction(_OWLFacet, _int);
        OWLDataUnionOf result62 = testSubject0.getOWLDataUnionOf(_Set143);
        OWLDataUnionOf result63 = testSubject0.getOWLDataUnionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result64 = testSubject0.getOWLDataIntersectionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result65 = testSubject0.getOWLDataIntersectionOf(_Set143);
        OWLObjectIntersectionOf result66 = testSubject0.getOWLObjectIntersectionOf(_OWLClassExpression_array);
        OWLObjectIntersectionOf result67 = testSubject0.getOWLObjectIntersectionOf(_Set131);
        OWLDataSomeValuesFrom result68 = testSubject0.getOWLDataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataAllValuesFrom result69 = testSubject0.getOWLDataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result70 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result71 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMaxCardinality result72 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMaxCardinality result73 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result74 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMinCardinality result75 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataHasValue result76 = testSubject0.getOWLDataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObjectComplementOf result77 = testSubject0.getOWLObjectComplementOf(_OWLClassExpression);
        OWLObjectOneOf result78 = testSubject0.getOWLObjectOneOf(_OWLIndividual_array);
        OWLObjectOneOf result79 = testSubject0.getOWLObjectOneOf(_Set146);
        OWLObjectSomeValuesFrom result80 = testSubject0.getOWLObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result81 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result82 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMinCardinality result83 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMinCardinality result84 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result85 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMaxCardinality result86 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectHasSelf result87 = testSubject0.getOWLObjectHasSelf(_OWLObjectPropertyExpression);
        OWLObjectHasValue result88 = testSubject0.getOWLObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLDeclarationAxiom result89 = testSubject0.getOWLDeclarationAxiom(_OWLEntity);
        OWLDeclarationAxiom result90 = testSubject0.getOWLDeclarationAxiom(_OWLEntity, _Set132);
        OWLEquivalentClassesAxiom result91 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression, _Set132);
        OWLEquivalentClassesAxiom result92 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLEquivalentClassesAxiom result93 = testSubject0.getOWLEquivalentClassesAxiom(_Set131);
        OWLEquivalentClassesAxiom result94 = testSubject0.getOWLEquivalentClassesAxiom(_Set131, _Set132);
        OWLEquivalentClassesAxiom result95 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression_array);
        OWLDisjointClassesAxiom result96 = testSubject0.getOWLDisjointClassesAxiom(_Set131, _Set132);
        OWLDisjointClassesAxiom result97 = testSubject0.getOWLDisjointClassesAxiom(_Set131);
        OWLDisjointClassesAxiom result98 = testSubject0.getOWLDisjointClassesAxiom(_OWLClassExpression_array);
        OWLDisjointUnionAxiom result99 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set131);
        OWLDisjointUnionAxiom result100 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set131, _Set132);
        OWLSubObjectPropertyOfAxiom result101 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLSubObjectPropertyOfAxiom result102 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set132);
        OWLSubPropertyChainOfAxiom result103 = testSubject0.getOWLSubPropertyChainOfAxiom(_List147, _OWLObjectPropertyExpression);
        OWLSubPropertyChainOfAxiom result104 = testSubject0.getOWLSubPropertyChainOfAxiom(_List147, _OWLObjectPropertyExpression, _Set132);
        OWLEquivalentObjectPropertiesAxiom result105 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set132);
        OWLEquivalentObjectPropertiesAxiom result106 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLEquivalentObjectPropertiesAxiom result107 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set148);
        OWLEquivalentObjectPropertiesAxiom result108 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set148, _Set132);
        OWLEquivalentObjectPropertiesAxiom result109 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result110 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set148, _Set132);
        OWLDisjointObjectPropertiesAxiom result111 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result112 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set148);
        OWLInverseObjectPropertiesAxiom result113 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLInverseObjectPropertiesAxiom result114 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set132);
        OWLObjectPropertyDomainAxiom result115 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyDomainAxiom result116 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set132);
        OWLObjectPropertyRangeAxiom result117 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result118 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set132);
        OWLFunctionalObjectPropertyAxiom result119 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLFunctionalObjectPropertyAxiom result120 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result121 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result122 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLReflexiveObjectPropertyAxiom result123 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLReflexiveObjectPropertyAxiom result124 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLIrreflexiveObjectPropertyAxiom result125 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLIrreflexiveObjectPropertyAxiom result126 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLSymmetricObjectPropertyAxiom result127 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLSymmetricObjectPropertyAxiom result128 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result129 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result130 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLTransitiveObjectPropertyAxiom result131 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLTransitiveObjectPropertyAxiom result132 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set132);
        OWLSubDataPropertyOfAxiom result133 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLSubDataPropertyOfAxiom result134 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set132);
        OWLEquivalentDataPropertiesAxiom result135 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result136 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLEquivalentDataPropertiesAxiom result137 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set132);
        OWLEquivalentDataPropertiesAxiom result138 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set151, _Set132);
        OWLEquivalentDataPropertiesAxiom result139 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set151);
        OWLDisjointDataPropertiesAxiom result140 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set151, _Set132);
        OWLDisjointDataPropertiesAxiom result141 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set151);
        OWLDisjointDataPropertiesAxiom result142 = testSubject0.getOWLDisjointDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLDataPropertyDomainAxiom result143 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression, _Set132);
        OWLDataPropertyDomainAxiom result144 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression);
        OWLDataPropertyRangeAxiom result145 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataPropertyRangeAxiom result146 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange, _Set132);
        OWLFunctionalDataPropertyAxiom result147 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression, _Set132);
        OWLFunctionalDataPropertyAxiom result148 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression);
        OWLHasKeyAxiom result149 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set152, _Set132);
        OWLHasKeyAxiom result150 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _OWLPropertyExpression_array);
        OWLHasKeyAxiom result151 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set152);
        OWLDatatypeDefinitionAxiom result152 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange, _Set132);
        OWLDatatypeDefinitionAxiom result153 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange);
        OWLSameIndividualAxiom result154 = testSubject0.getOWLSameIndividualAxiom(_Set146, _Set132);
        OWLSameIndividualAxiom result155 = testSubject0.getOWLSameIndividualAxiom(_OWLIndividual_array);
        OWLSameIndividualAxiom result156 = testSubject0.getOWLSameIndividualAxiom(_Set146);
        OWLDifferentIndividualsAxiom result157 = testSubject0.getOWLDifferentIndividualsAxiom(_Set146, _Set132);
        OWLDifferentIndividualsAxiom result158 = testSubject0.getOWLDifferentIndividualsAxiom(_OWLIndividual_array);
        OWLDifferentIndividualsAxiom result159 = testSubject0.getOWLDifferentIndividualsAxiom(_Set146);
        OWLClassAssertionAxiom result160 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual, _Set132);
        OWLClassAssertionAxiom result161 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual);
        OWLObjectPropertyAssertionAxiom result162 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual, _Set132);
        OWLObjectPropertyAssertionAxiom result163 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeObjectPropertyAssertionAxiom result164 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual,
                _Set132);
        OWLNegativeObjectPropertyAssertionAxiom result165 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLDataPropertyAssertionAxiom result166 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _float);
        OWLDataPropertyAssertionAxiom result167 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _boolean);
        OWLDataPropertyAssertionAxiom result168 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _String);
        OWLDataPropertyAssertionAxiom result169 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLDataPropertyAssertionAxiom result170 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set132);
        OWLDataPropertyAssertionAxiom result171 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _int);
        OWLDataPropertyAssertionAxiom result172 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _double);
        OWLNegativeDataPropertyAssertionAxiom result173 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLNegativeDataPropertyAssertionAxiom result174 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set132);
        OWLAnnotation result175 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue, _Set132);
        OWLAnnotation result176 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        OWLAnnotationAssertionAxiom result177 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation, _Set132);
        OWLAnnotationAssertionAxiom result178 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue, _Set132);
        OWLAnnotationAssertionAxiom result179 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation);
        OWLAnnotationAssertionAxiom result180 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue);
        OWLAnnotationAssertionAxiom result181 = testSubject0.getDeprecatedOWLAnnotationAssertionAxiom(_IRI);
        OWLImportsDeclaration result182 = testSubject0.getOWLImportsDeclaration(_IRI);
        OWLAnnotationPropertyDomainAxiom result183 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyDomainAxiom result184 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI, _Set132);
        OWLAnnotationPropertyRangeAxiom result185 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyRangeAxiom result186 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI, _Set132);
        OWLSubAnnotationPropertyOfAxiom result187 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty, _Set132);
        OWLSubAnnotationPropertyOfAxiom result188 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty);
        SWRLRule result189 = testSubject0.getSWRLRule(_Set155, _Set155);
        SWRLRule result190 = testSubject0.getSWRLRule(_Set155, _Set155, _Set39);
        SWRLClassAtom result191 = testSubject0.getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        SWRLDataRangeAtom result192 = testSubject0.getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        SWRLObjectPropertyAtom result193 = testSubject0.getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        SWRLDataPropertyAtom result194 = testSubject0.getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        SWRLBuiltInAtom result195 = testSubject0.getSWRLBuiltInAtom(_IRI, _List158);
        SWRLVariable result196 = testSubject0.getSWRLVariable(_IRI);
        SWRLIndividualArgument result197 = testSubject0.getSWRLIndividualArgument(_OWLIndividual);
        SWRLLiteralArgument result198 = testSubject0.getSWRLLiteralArgument(_OWLLiteral);
        SWRLSameIndividualAtom result199 = testSubject0.getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        SWRLDifferentIndividualsAtom result200 = testSubject0.getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
        OWLClass result201 = testSubject0.getOWLClass(_IRI);
        OWLObjectProperty result202 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result203 = testSubject0.getOWLDataProperty(_IRI);
        OWLNamedIndividual result204 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result205 = testSubject0.getOWLDatatype(_IRI);
        OWLAnnotationProperty result206 = testSubject0.getOWLAnnotationProperty(_IRI);
        OWLClass result207 = testSubject0.getOWLEntity(_EntityType159, _IRI);
        OWLAnonymousIndividual result208 = testSubject0.getOWLAnonymousIndividual();
        OWLAnonymousIndividual result209 = testSubject0.getOWLAnonymousIndividual(_String);
    }

    @Test
    public void enforceInterfacesOWLDataHasValue() {
        assertTrue(OWLHasValueRestriction.class.isAssignableFrom(OWLDataHasValue.class));
        assertTrue(OWLDataRestriction.class.isAssignableFrom(OWLDataHasValue.class));
    }

    public void verifyInterfaceOWLDataHasValue() {
        OWLDataHasValue testSubject0 = mock(OWLDataHasValue.class);
        java.lang.Object result0 = testSubject0.getFiller();
        OWLClassExpression result1 = testSubject0.asSomeValuesFrom();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result5 = testSubject0.asOWLClass();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLDataPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOf() {
        assertTrue(OWLNaryDataRange.class.isAssignableFrom(OWLDataIntersectionOf.class));
    }

    public void verifyInterfaceOWLDataIntersectionOf() {
        OWLDataIntersectionOf testSubject0 = mock(OWLDataIntersectionOf.class);
        java.util.Set<OWLDataRange> result0 = testSubject0.getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinality() {
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataMaxCardinality.class));
    }

    public void verifyInterfaceOWLDataMaxCardinality() {
        OWLDataMaxCardinality testSubject0 = mock(OWLDataMaxCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
        OWLDataPropertyExpression result32 = testSubject0.getProperty();
        java.lang.Object result33 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinality() {
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataMinCardinality.class));
    }

    public void verifyInterfaceOWLDataMinCardinality() {
        OWLDataMinCardinality testSubject0 = mock(OWLDataMinCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
        OWLDataPropertyExpression result32 = testSubject0.getProperty();
        java.lang.Object result33 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataOneOf() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLDataOneOf.class));
    }

    public void verifyInterfaceOWLDataOneOf() {
        OWLDataOneOf testSubject0 = mock(OWLDataOneOf.class);
        java.util.Set<OWLLiteral> result0 = testSubject0.getValues();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataProperty() {
        assertTrue(OWLDataPropertyExpression.class.isAssignableFrom(OWLDataProperty.class));
        assertTrue(OWLProperty.class.isAssignableFrom(OWLDataProperty.class));
    }

    public void verifyInterfaceOWLDataProperty() {
        OWLDataProperty testSubject0 = mock(OWLDataProperty.class);
        OWLDataProperty result0 = testSubject0.asOWLDataProperty();
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result2 = testSubject0.isOWLTopDataProperty();
        boolean result3 = testSubject0.isDataPropertyExpression();
        boolean result4 = testSubject0.isObjectPropertyExpression();
        boolean result5 = testSubject0.isOWLTopObjectProperty();
        boolean result6 = testSubject0.isOWLBottomObjectProperty();
        boolean result7 = testSubject0.isOWLBottomDataProperty();
        boolean result8 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        OWLObject result10 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        int result20 = testSubject0.compareTo(_Object);
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result22 = testSubject0.isType(_EntityType);
        OWLObject result23 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result24 = testSubject0.isBuiltIn();
        EntityType<?> result25 = testSubject0.getEntityType();
        boolean result26 = testSubject0.isOWLClass();
        OWLClass result27 = testSubject0.asOWLClass();
        boolean result28 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result29 = testSubject0.asOWLObjectProperty();
        boolean result30 = testSubject0.isOWLDataProperty();
        OWLDataProperty result31 = testSubject0.asOWLDataProperty();
        boolean result32 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result33 = testSubject0.asOWLNamedIndividual();
        boolean result34 = testSubject0.isOWLDatatype();
        OWLDatatype result35 = testSubject0.asOWLDatatype();
        boolean result36 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result37 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result38 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result39 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiom() {
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLDataPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLDataPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyAssertionAxiom() {
        OWLDataPropertyAssertionAxiom testSubject0 = mock(OWLDataPropertyAssertionAxiom.class);
        OWLDataPropertyAssertionAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.lang.Object result1 = testSubject0.getProperty();
        OWLObject result2 = testSubject0.getObject();
        OWLIndividual result3 = testSubject0.getSubject();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set43);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result31 = testSubject0.getSubject();
        java.lang.Object result32 = testSubject0.getProperty();
        OWLObject result33 = testSubject0.getObject();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLDataPropertyAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyAxiom() {
        OWLDataPropertyAxiom testSubject0 = mock(OWLDataPropertyAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyCharacteristicAxiom() {
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiom.class));
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyCharacteristicAxiom() {
        OWLDataPropertyCharacteristicAxiom testSubject0 = mock(OWLDataPropertyCharacteristicAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result26 = testSubject0.getProperty();
        java.lang.Object result27 = testSubject0.getProperty();
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
        java.lang.Object result2 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
        OWLClassExpression result31 = testSubject0.getDomain();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyExpression() {
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLDataPropertyExpression.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(OWLDataPropertyExpression.class));
    }

    public void verifyInterfaceOWLDataPropertyExpression() {
        OWLDataPropertyExpression testSubject0 = mock(OWLDataPropertyExpression.class);
        OWLDataProperty result0 = testSubject0.asOWLDataProperty();
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result2 = testSubject0.isOWLTopDataProperty();
        boolean result3 = testSubject0.isDataPropertyExpression();
        boolean result4 = testSubject0.isObjectPropertyExpression();
        boolean result5 = testSubject0.isOWLTopObjectProperty();
        boolean result6 = testSubject0.isOWLBottomObjectProperty();
        boolean result7 = testSubject0.isOWLBottomDataProperty();
        boolean result8 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        OWLObject result10 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        int result20 = testSubject0.compareTo(_Object);
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLDataPropertyProvider.class));
    }

    public void verifyInterfaceOWLDataPropertyProvider() {
        OWLDataPropertyProvider testSubject0 = mock(OWLDataPropertyProvider.class);
        OWLDataProperty result0 = testSubject0.getOWLDataProperty(_IRI);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiom() {
        assertTrue(OWLPropertyRangeAxiom.class.isAssignableFrom(OWLDataPropertyRangeAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDataPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLDataPropertyRangeAxiom() {
        OWLDataPropertyRangeAxiom testSubject0 = mock(OWLDataPropertyRangeAxiom.class);
        OWLDataPropertyRangeAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.lang.Object result1 = testSubject0.getRange();
        java.lang.Object result2 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result31 = testSubject0.getRange();
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
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object);
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLDataRangeVisitor() {
        OWLDataRangeVisitor testSubject0 = mock(OWLDataRangeVisitor.class);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatype);
    }

    public void verifyInterfaceOWLDataRangeVisitorEx() {
        OWLDataRangeVisitorEx<OWLObject> testSubject0 = mock(OWLDataRangeVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result1 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result2 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLObject result3 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result4 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result5 = testSubject0.visit(_OWLDatatype);
    }

    @Test
    public void enforceInterfacesOWLDataRestriction() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLDataRestriction.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLDataRestriction.class));
    }

    public void verifyInterfaceOWLDataRestriction() {
        OWLDataRestriction testSubject0 = mock(OWLDataRestriction.class);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFrom() {
        assertTrue(OWLQuantifiedDataRestriction.class.isAssignableFrom(OWLDataSomeValuesFrom.class));
    }

    public void verifyInterfaceOWLDataSomeValuesFrom() {
        OWLDataSomeValuesFrom testSubject0 = mock(OWLDataSomeValuesFrom.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
        OWLDataPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
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
        boolean result1 = testSubject0.isInteger();
        boolean result2 = testSubject0.isFloat();
        boolean result3 = testSubject0.isDouble();
        boolean result4 = testSubject0.isBoolean();
        boolean result5 = testSubject0.isRDFPlainLiteral();
        org.semanticweb.owlapi.vocab.OWL2Datatype result6 = testSubject0.getBuiltInDatatype();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result7 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result8 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result9 = testSubject0.isDatatype();
        boolean result10 = testSubject0.isTopDatatype();
        DataRangeType result11 = testSubject0.getDataRangeType();
        OWLDatatype result12 = testSubject0.asOWLDatatype();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result26 = testSubject0.isType(_EntityType);
        OWLObject result27 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result28 = testSubject0.isBuiltIn();
        EntityType<?> result29 = testSubject0.getEntityType();
        boolean result30 = testSubject0.isOWLClass();
        OWLClass result31 = testSubject0.asOWLClass();
        boolean result32 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result33 = testSubject0.asOWLObjectProperty();
        boolean result34 = testSubject0.isOWLDataProperty();
        OWLDataProperty result35 = testSubject0.asOWLDataProperty();
        boolean result36 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result37 = testSubject0.asOWLNamedIndividual();
        boolean result38 = testSubject0.isOWLDatatype();
        OWLDatatype result39 = testSubject0.asOWLDatatype();
        boolean result40 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result41 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result42 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result43 = testSubject0.getIRI();
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
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDatatypeProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLDatatypeProvider.class));
    }

    public void verifyInterfaceOWLDatatypeProvider() {
        OWLDatatypeProvider testSubject0 = mock(OWLDatatypeProvider.class);
        OWLDatatype result0 = testSubject0.getOWLDatatype(_IRI);
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestriction() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLDatatypeRestriction.class));
    }

    public void verifyInterfaceOWLDatatypeRestriction() {
        OWLDatatypeRestriction testSubject0 = mock(OWLDatatypeRestriction.class);
        java.util.Set<OWLFacetRestriction> result0 = testSubject0.getFacetRestrictions();
        OWLDatatype result1 = testSubject0.getDatatype();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        DataRangeType result6 = testSubject0.getDataRangeType();
        OWLDatatype result7 = testSubject0.asOWLDatatype();
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        OWLObject result9 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        int result19 = testSubject0.compareTo(_Object);
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataUnionOf() {
        assertTrue(OWLNaryDataRange.class.isAssignableFrom(OWLDataUnionOf.class));
    }

    public void verifyInterfaceOWLDataUnionOf() {
        OWLDataUnionOf testSubject0 = mock(OWLDataUnionOf.class);
        java.util.Set<OWLDataRange> result0 = testSubject0.getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataVisitor() {
        assertTrue(OWLDataRangeVisitor.class.isAssignableFrom(OWLDataVisitor.class));
    }

    public void verifyInterfaceOWLDataVisitor() {
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

    public void verifyInterfaceOWLDataVisitorEx() {
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
    public void enforceInterfacesOWLDeclarationAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLDeclarationAxiom.class));
    }

    public void verifyInterfaceOWLDeclarationAxiom() {
        OWLDeclarationAxiom testSubject0 = mock(OWLDeclarationAxiom.class);
        OWLEntity result0 = testSubject0.getEntity();
        OWLDeclarationAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiom() {
        assertTrue(OWLNaryIndividualAxiom.class.isAssignableFrom(OWLDifferentIndividualsAxiom.class));
    }

    public void verifyInterfaceOWLDifferentIndividualsAxiom() {
        OWLDifferentIndividualsAxiom testSubject0 = mock(OWLDifferentIndividualsAxiom.class);
        boolean result0 = testSubject0.containsAnonymousIndividuals();
        OWLDifferentIndividualsAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLDifferentIndividualsAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.List<OWLIndividual> result3 = testSubject0.getIndividualsAsList();
        java.util.Set<OWLIndividual> result4 = testSubject0.getIndividuals();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result31 = testSubject0.walkPairwise(_OWLIndividualPairwiseVisitor);
        java.util.Set<OWLSubClassOfAxiom> result32 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiom() {
        assertTrue(OWLNaryClassAxiom.class.isAssignableFrom(OWLDisjointClassesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointClassesAxiom() {
        OWLDisjointClassesAxiom testSubject0 = mock(OWLDisjointClassesAxiom.class);
        OWLDisjointClassesAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLDisjointClassesAxiom> result1 = testSubject0.asPairwiseAxioms();
        boolean result2 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result3 = testSubject0.getClassExpressions();
        java.util.List<OWLClassExpression> result4 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result5 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set43);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object);
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result32 = testSubject0.walkPairwise(_OWLExpressionPairwiseVisitor);
        java.util.Set<OWLSubClassOfAxiom> result33 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLDisjointDataPropertiesAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLDisjointDataPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointDataPropertiesAxiom() {
        OWLDisjointDataPropertiesAxiom testSubject0 = mock(OWLDisjointDataPropertiesAxiom.class);
        OWLDisjointDataPropertiesAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLDisjointDataPropertiesAxiom> result1 = testSubject0.asPairwiseAxioms();
        Set<OWLDataPropertyExpression> result2 = testSubject0.getProperties();
        Set<OWLDataPropertyExpression> result3 = testSubject0.getPropertiesMinus(_OWLPropertyExpression);
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set43);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result30 = testSubject0.walkPairwise(_OWLDataPairwiseVisitor);
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLDisjointObjectPropertiesAxiom() {
        OWLDisjointObjectPropertiesAxiom testSubject0 = mock(OWLDisjointObjectPropertiesAxiom.class);
        OWLDisjointObjectPropertiesAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result1 = testSubject0.asPairwiseAxioms();
        Set<OWLObjectPropertyExpression> result2 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result3 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set43);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result30 = testSubject0.walkPairwise(_OWLObjectPairwiseVisitor);
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionAxiom() {
        assertTrue(OWLClassAxiom.class.isAssignableFrom(OWLDisjointUnionAxiom.class));
    }

    public void verifyInterfaceOWLDisjointUnionAxiom() {
        OWLDisjointUnionAxiom testSubject0 = mock(OWLDisjointUnionAxiom.class);
        OWLDisjointUnionAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        OWLClass result1 = testSubject0.getOWLClass();
        OWLEquivalentClassesAxiom result2 = testSubject0.getOWLEquivalentClassesAxiom();
        OWLDisjointClassesAxiom result3 = testSubject0.getOWLDisjointClassesAxiom();
        java.util.Set<OWLClassExpression> result4 = testSubject0.getClassExpressions();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntity() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLEntity.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLEntity.class));
        assertTrue(OWLPrimitive.class.isAssignableFrom(OWLEntity.class));
    }

    public void verifyInterfaceOWLEntity() {
        OWLEntity testSubject0 = mock(OWLEntity.class);
        boolean result0 = testSubject0.isType(_EntityType);
        OWLObject result1 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result2 = testSubject0.isBuiltIn();
        EntityType<?> result3 = testSubject0.getEntityType();
        boolean result4 = testSubject0.isOWLClass();
        OWLClass result5 = testSubject0.asOWLClass();
        boolean result6 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result7 = testSubject0.asOWLObjectProperty();
        boolean result8 = testSubject0.isOWLDataProperty();
        OWLDataProperty result9 = testSubject0.asOWLDataProperty();
        boolean result10 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result11 = testSubject0.asOWLNamedIndividual();
        boolean result12 = testSubject0.isOWLDatatype();
        OWLDatatype result13 = testSubject0.asOWLDatatype();
        boolean result14 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result15 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result16 = testSubject0.toStringID();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result30 = testSubject0.getIRI();
    }

    public void verifyInterfaceOWLEntityByTypeProvider() {
        OWLEntityByTypeProvider testSubject0 = mock(OWLEntityByTypeProvider.class);
        OWLClass result0 = testSubject0.getOWLEntity(_EntityType159, _IRI);
    }

    @Test
    public void enforceInterfacesOWLEntityProvider() {
        assertTrue(OWLClassProvider.class.isAssignableFrom(OWLEntityProvider.class));
        assertTrue(OWLObjectPropertyProvider.class.isAssignableFrom(OWLEntityProvider.class));
        assertTrue(OWLDataPropertyProvider.class.isAssignableFrom(OWLEntityProvider.class));
        assertTrue(OWLNamedIndividualProvider.class.isAssignableFrom(OWLEntityProvider.class));
        assertTrue(OWLDatatypeProvider.class.isAssignableFrom(OWLEntityProvider.class));
        assertTrue(OWLAnnotationPropertyProvider.class.isAssignableFrom(OWLEntityProvider.class));
    }

    public void verifyInterfaceOWLEntityProvider() {
        OWLEntityProvider testSubject0 = mock(OWLEntityProvider.class);
        OWLClass result0 = testSubject0.getOWLClass(_IRI);
        OWLObjectProperty result1 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result2 = testSubject0.getOWLDataProperty(_IRI);
        OWLNamedIndividual result3 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result4 = testSubject0.getOWLDatatype(_IRI);
        OWLAnnotationProperty result5 = testSubject0.getOWLAnnotationProperty(_IRI);
    }

    public void verifyInterfaceOWLEntityVisitor() {
        OWLEntityVisitor testSubject0 = mock(OWLEntityVisitor.class);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
    }

    public void verifyInterfaceOWLEntityVisitorEx() {
        OWLEntityVisitorEx<OWLObject> testSubject0 = mock(OWLEntityVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result1 = testSubject0.visit(_OWLDatatype);
        OWLObject result2 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result3 = testSubject0.visit(_OWLDataProperty);
        OWLObject result4 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result5 = testSubject0.visit(_OWLClass);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiom() {
        assertTrue(OWLNaryClassAxiom.class.isAssignableFrom(OWLEquivalentClassesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentClassesAxiom() {
        OWLEquivalentClassesAxiom testSubject0 = mock(OWLEquivalentClassesAxiom.class);
        OWLEquivalentClassesAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        boolean result1 = testSubject0.containsOWLNothing();
        boolean result2 = testSubject0.containsOWLThing();
        java.util.Set<OWLClass> result3 = testSubject0.getNamedClasses();
        boolean result4 = testSubject0.containsNamedEquivalentClass();
        java.util.Set<OWLEquivalentClassesAxiom> result5 = testSubject0.asPairwiseAxioms();
        boolean result6 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result7 = testSubject0.getClassExpressions();
        java.util.List<OWLClassExpression> result8 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<OWLAnnotation> result10 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result12 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result13 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result14 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result16 = testSubject0.isLogicalAxiom();
        boolean result17 = testSubject0.isAnnotationAxiom();
        boolean result18 = testSubject0.isAnnotated();
        AxiomType<?> result19 = testSubject0.getAxiomType();
        boolean result20 = testSubject0.isOfType(_Set43);
        boolean result21 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result22 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        int result34 = testSubject0.compareTo(_Object);
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result36 = testSubject0.walkPairwise(_OWLExpressionPairwiseVisitor);
        java.util.Set<OWLSubClassOfAxiom> result37 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiom.class));
        assertTrue(OWLDataPropertyAxiom.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentDataPropertiesAxiom() {
        OWLEquivalentDataPropertiesAxiom testSubject0 = mock(OWLEquivalentDataPropertiesAxiom.class);
        java.util.Set<OWLSubDataPropertyOfAxiom> result0 = testSubject0.asSubDataPropertyOfAxioms();
        OWLEquivalentDataPropertiesAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLDataPropertyExpression> result3 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result4 = testSubject0.getPropertiesMinus(_OWLPropertyExpression);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result31 = testSubject0.walkPairwise(_OWLDataPairwiseVisitor);
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLEquivalentObjectPropertiesAxiom() {
        OWLEquivalentObjectPropertiesAxiom testSubject0 = mock(OWLEquivalentObjectPropertiesAxiom.class);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result0 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLEquivalentObjectPropertiesAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLObjectPropertyExpression> result3 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result4 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result31 = testSubject0.walkPairwise(_OWLObjectPairwiseVisitor);
    }

    @Test
    public void enforceInterfacesOWLException() {
        assertTrue(java.lang.Exception.class.isAssignableFrom(OWLException.class));
    }

    public void verifyOWLException() {
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
    public void enforceInterfacesOWLFacetRestriction() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLFacetRestriction.class));
    }

    public void verifyInterfaceOWLFacetRestriction() {
        OWLFacetRestriction testSubject0 = mock(OWLFacetRestriction.class);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        org.semanticweb.owlapi.vocab.OWLFacet result1 = testSubject0.getFacet();
        OWLLiteral result2 = testSubject0.getFacetValue();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result5 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result7 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result8 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result9 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result10 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result11 = testSubject0.getNestedClassExpressions();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        int result14 = testSubject0.compareTo(_Object);
        boolean result15 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiom() {
        assertTrue(OWLDataPropertyCharacteristicAxiom.class.isAssignableFrom(OWLFunctionalDataPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLFunctionalDataPropertyAxiom.class));
    }

    public void verifyInterfaceOWLFunctionalDataPropertyAxiom() {
        OWLFunctionalDataPropertyAxiom testSubject0 = mock(OWLFunctionalDataPropertyAxiom.class);
        OWLFunctionalDataPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLFunctionalObjectPropertyAxiom() {
        OWLFunctionalObjectPropertyAxiom testSubject0 = mock(OWLFunctionalObjectPropertyAxiom.class);
        OWLFunctionalObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLHasKeyAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLHasKeyAxiom.class));
    }

    public void verifyInterfaceOWLHasKeyAxiom() {
        OWLHasKeyAxiom testSubject0 = mock(OWLHasKeyAxiom.class);
        java.util.Set<OWLPropertyExpression> result0 = testSubject0.getPropertyExpressions();
        OWLClassExpression result1 = testSubject0.getClassExpression();
        java.util.Set<OWLObjectPropertyExpression> result2 = testSubject0.getObjectPropertyExpressions();
        java.util.Set<OWLDataPropertyExpression> result3 = testSubject0.getDataPropertyExpressions();
        OWLHasKeyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLHasValueRestriction() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLHasValueRestriction.class));
        assertTrue(HasFiller.class.isAssignableFrom(OWLHasValueRestriction.class));
    }

    public void verifyInterfaceOWLHasValueRestriction() {
        OWLHasValueRestriction<OWLObject> testSubject0 = mock(OWLHasValueRestriction.class);
        java.lang.Object result0 = testSubject0.getFiller();
        OWLClassExpression result1 = testSubject0.asSomeValuesFrom();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result5 = testSubject0.asOWLClass();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLImportsDeclaration() {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(OWLImportsDeclaration.class));
        assertTrue(HasIRI.class.isAssignableFrom(OWLImportsDeclaration.class));
    }

    public void verifyInterfaceOWLImportsDeclaration() {
        OWLImportsDeclaration testSubject0 = mock(OWLImportsDeclaration.class);
        IRI result0 = testSubject0.getIRI();
        int result1 = testSubject0.compareTo(_OWLImportsDeclaration);
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
        OWLNamedIndividual result1 = testSubject0.asOWLNamedIndividual();
        java.lang.String result2 = testSubject0.toStringID();
        boolean result3 = testSubject0.isNamed();
        boolean result4 = testSubject0.isAnonymous();
        OWLAnonymousIndividual result5 = testSubject0.asOWLAnonymousIndividual();
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object);
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLIndividualAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLIndividualAxiom.class));
    }

    public void verifyInterfaceOWLIndividualAxiom() {
        OWLIndividualAxiom testSubject0 = mock(OWLIndividualAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLIndividualVisitor() {
        OWLIndividualVisitor testSubject0 = mock(OWLIndividualVisitor.class);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
    }

    public void verifyInterfaceOWLIndividualVisitorEx() {
        OWLIndividualVisitorEx<OWLObject> testSubject0 = mock(OWLIndividualVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result1 = testSubject0.visit(_OWLAnonymousIndividual);
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLInverseFunctionalObjectPropertyAxiom() {
        OWLInverseFunctionalObjectPropertyAxiom testSubject0 = mock(OWLInverseFunctionalObjectPropertyAxiom.class);
        OWLInverseFunctionalObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiom() {
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLInverseObjectPropertiesAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLInverseObjectPropertiesAxiom.class));
    }

    public void verifyInterfaceOWLInverseObjectPropertiesAxiom() {
        OWLInverseObjectPropertiesAxiom testSubject0 = mock(OWLInverseObjectPropertiesAxiom.class);
        OWLObjectPropertyExpression result0 = testSubject0.getFirstProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getSecondProperty();
        java.util.Set<OWLSubObjectPropertyOfAxiom> result2 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLInverseObjectPropertiesAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLInverseObjectPropertiesAxiom> result4 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLObjectPropertyExpression> result5 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result8 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result9 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result10 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        boolean result15 = testSubject0.isAnnotated();
        AxiomType<?> result16 = testSubject0.getAxiomType();
        boolean result17 = testSubject0.isOfType(_Set43);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object);
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result33 = testSubject0.walkPairwise(_OWLObjectPairwiseVisitor);
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLIrreflexiveObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLIrreflexiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLIrreflexiveObjectPropertyAxiom() {
        OWLIrreflexiveObjectPropertyAxiom testSubject0 = mock(OWLIrreflexiveObjectPropertyAxiom.class);
        OWLIrreflexiveObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLLiteral() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLAnnotationObject.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLAnnotationValue.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLPropertyAssertionObject.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(OWLPrimitive.class.isAssignableFrom(OWLLiteral.class));
        assertTrue(HasLang.class.isAssignableFrom(OWLLiteral.class));
    }

    public void verifyInterfaceOWLLiteral() {
        OWLLiteral testSubject0 = mock(OWLLiteral.class);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result4 = testSubject0.isInteger();
        boolean result5 = testSubject0.isFloat();
        boolean result6 = testSubject0.isDouble();
        boolean result7 = testSubject0.isBoolean();
        boolean result8 = testSubject0.isRDFPlainLiteral();
        int result9 = testSubject0.parseInteger();
        java.lang.String result10 = testSubject0.getLiteral();
        java.lang.String result11 = testSubject0.getLang();
        OWLDatatype result12 = testSubject0.getDatatype();
        boolean result13 = testSubject0.hasLang(_String);
        boolean result14 = testSubject0.hasLang();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result28 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
    }

    @Test
    public void enforceInterfacesOWLLogicalAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLLogicalAxiom.class));
    }

    public void verifyInterfaceOWLLogicalAxiom() {
        OWLLogicalAxiom testSubject0 = mock(OWLLogicalAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLLogicalAxiomVisitor() {
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

    public void verifyInterfaceOWLLogicalAxiomVisitorEx() {
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
    public void enforceInterfacesOWLLogicalEntity() {
        assertTrue(OWLEntity.class.isAssignableFrom(OWLLogicalEntity.class));
    }

    public void verifyInterfaceOWLLogicalEntity() {
        OWLLogicalEntity testSubject0 = mock(OWLLogicalEntity.class);
        boolean result0 = testSubject0.isType(_EntityType);
        OWLObject result1 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result2 = testSubject0.isBuiltIn();
        EntityType<?> result3 = testSubject0.getEntityType();
        boolean result4 = testSubject0.isOWLClass();
        OWLClass result5 = testSubject0.asOWLClass();
        boolean result6 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result7 = testSubject0.asOWLObjectProperty();
        boolean result8 = testSubject0.isOWLDataProperty();
        OWLDataProperty result9 = testSubject0.asOWLDataProperty();
        boolean result10 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result11 = testSubject0.asOWLNamedIndividual();
        boolean result12 = testSubject0.isOWLDatatype();
        OWLDatatype result13 = testSubject0.asOWLDatatype();
        boolean result14 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result15 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result16 = testSubject0.toStringID();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result30 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLMutableOntology() {
        assertTrue(OWLOntology.class.isAssignableFrom(OWLMutableOntology.class));
    }

    public void verifyInterfaceOWLMutableOntology() {
        OWLMutableOntology testSubject0 = mock(OWLMutableOntology.class);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_List);
        OWLOntologyChange<java.lang.Object> result1 = testSubject0.applyChange(_OWLOntologyChange170);
        boolean result2 = testSubject0.isEmpty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature(_imports);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLOntologyID result6 = testSubject0.getOntologyID();
        OWLOntologyManager result7 = testSubject0.getOWLOntologyManager();
        boolean result8 = testSubject0.isAnonymous();
        java.util.Set<IRI> result9 = testSubject0.getDirectImportsDocuments();
        java.util.Set<OWLOntology> result10 = testSubject0.getDirectImports();
        java.util.Set<OWLOntology> result11 = testSubject0.getImports();
        java.util.Set<OWLOntology> result12 = testSubject0.getImportsClosure();
        java.util.Set<OWLImportsDeclaration> result13 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result14 = testSubject0.getTBoxAxioms(_imports);
        java.util.Set<OWLAxiom> result15 = testSubject0.getABoxAxioms(_imports);
        java.util.Set<OWLAxiom> result16 = testSubject0.getRBoxAxioms(_imports);
        java.util.Set<OWLClassAxiom> result17 = testSubject0.getGeneralClassAxioms();
        boolean result18 = testSubject0.isDeclared(_OWLEntity, _imports);
        boolean result19 = testSubject0.isDeclared(_OWLEntity);
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object);
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Set<OWLAxiom> result32 = testSubject0.getAxioms();
        java.util.Set<OWLLogicalAxiom> result33 = testSubject0.getLogicalAxioms();
        Set<OWLAnnotationAssertionAxiom> result34 = testSubject0.getAxioms(_AxiomType);
        boolean result35 = testSubject0.containsAxiom(_OWLAxiom);
        java.util.Set<OWLEntity> result36 = testSubject0.getEntitiesInSignature(_IRI);
        java.util.Set<OWLClassAxiom> result37 = testSubject0.getAxioms(_OWLClass, _imports);
        java.util.Set<OWLDatatypeDefinitionAxiom> result38 = testSubject0.getAxioms(_OWLDatatype, _imports);
        Set<OWLAnnotationAssertionAxiom> result39 = testSubject0.getAxioms(_AxiomType, _imports);
        Set<OWLAnnotationAssertionAxiom> result40 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<OWLAnnotationAxiom> result41 = testSubject0.getAxioms(_OWLAnnotationProperty, _imports);
        java.util.Set<OWLIndividualAxiom> result42 = testSubject0.getAxioms(_OWLIndividual, _imports);
        java.util.Set<OWLDataPropertyAxiom> result43 = testSubject0.getAxioms(_OWLDataProperty, _imports);
        java.util.Set<OWLObjectPropertyAxiom> result44 = testSubject0.getAxioms(_OWLObjectPropertyExpression, _imports);
        java.util.Set<OWLAxiom> result45 = testSubject0.getAxioms(_imports);
        java.util.Set<OWLAxiom> result46 = testSubject0.getAxioms();
        boolean result47 = testSubject0.containsAxiom(_OWLAxiom, _imports, _ignore);
        boolean result48 = testSubject0.containsAxiom(_OWLAxiom);
        int result49 = testSubject0.getAxiomCount(_imports);
        int result50 = testSubject0.getAxiomCount();
        int result51 = testSubject0.getAxiomCount(_AxiomType);
        int result52 = testSubject0.getAxiomCount(_AxiomType, _imports);
        java.util.Set<OWLLogicalAxiom> result53 = testSubject0.getLogicalAxioms(_imports);
        java.util.Set<OWLLogicalAxiom> result54 = testSubject0.getLogicalAxioms();
        int result55 = testSubject0.getLogicalAxiomCount();
        int result56 = testSubject0.getLogicalAxiomCount(_imports);
        java.util.Set<OWLAxiom> result57 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom, _imports);
        java.util.Set<OWLAxiom> result58 = testSubject0.getReferencingAxioms(_OWLPrimitive, _imports);
        java.util.Set<OWLClass> result59 = testSubject0.getClassesInSignature(_imports);
        java.util.Set<OWLDataProperty> result60 = testSubject0.getDataPropertiesInSignature(_imports);
        java.util.Set<OWLObjectProperty> result61 = testSubject0.getObjectPropertiesInSignature(_imports);
        java.util.Set<OWLNamedIndividual> result62 = testSubject0.getIndividualsInSignature(_imports);
        java.util.Set<OWLDatatype> result63 = testSubject0.getDatatypesInSignature(_imports);
        boolean result64 = testSubject0.containsEntityInSignature(_IRI, _imports);
        boolean result65 = testSubject0.containsEntityInSignature(_OWLEntity, _imports);
        java.util.Set<OWLEntity> result66 = testSubject0.getEntitiesInSignature(_IRI, _imports);
        boolean result67 = testSubject0.containsReference(_OWLEntity, _imports);
        java.util.Set<OWLAnonymousIndividual> result68 = testSubject0.getReferencedAnonymousIndividuals(_imports);
        java.util.Set<OWLAnnotationProperty> result69 = testSubject0.getAnnotationPropertiesInSignature(_imports);
        boolean result70 = testSubject0.containsClassInSignature(_IRI, _imports);
        boolean result71 = testSubject0.containsObjectPropertyInSignature(_IRI, _imports);
        boolean result72 = testSubject0.containsDataPropertyInSignature(_IRI, _imports);
        boolean result73 = testSubject0.containsAnnotationPropertyInSignature(_IRI, _imports);
        boolean result74 = testSubject0.containsIndividualInSignature(_IRI, _imports);
        boolean result75 = testSubject0.containsDatatypeInSignature(_IRI, _imports);
        java.util.Set<OWLClass> result76 = testSubject0.getClassesInSignature();
        java.util.Set<OWLObjectProperty> result77 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLDataProperty> result78 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLDatatype> result79 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLNamedIndividual> result80 = testSubject0.getIndividualsInSignature();
        boolean result81 = testSubject0.contains(_OWLAxiomSearchFilter, _Object, _imports);
        java.util.Set<OWLAxiom> result82 = testSubject0.getAxioms(OWLAxiom.class, _Class71, _OWLObject, _imports, _ignore);
        java.util.Set<OWLAxiom> result83 = testSubject0.getAxioms(OWLAxiom.class, _OWLObject, _imports, _ignore);
        java.util.Collection<OWLAxiom> result84 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object, _imports);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result85 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result86 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result87 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result88 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result89 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result90 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result91 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result92 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result93 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result94 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result95 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result96 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result97 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result98 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result99 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result100 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result101 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result102 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result103 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result104 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result105 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result106 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result107 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result108 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result109 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result110 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result111 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result112 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result113 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result114 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result115 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result116 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result117 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLClassAssertionAxiom> result118 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLDataPropertyAssertionAxiom> result119 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result120 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result121 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result122 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result123 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result124 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result125 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
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
        OWLNamedIndividual result1 = testSubject0.asOWLNamedIndividual();
        java.lang.String result2 = testSubject0.toStringID();
        boolean result3 = testSubject0.isNamed();
        boolean result4 = testSubject0.isAnonymous();
        OWLAnonymousIndividual result5 = testSubject0.asOWLAnonymousIndividual();
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object);
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result19 = testSubject0.isType(_EntityType);
        OWLObject result20 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result21 = testSubject0.isBuiltIn();
        EntityType<?> result22 = testSubject0.getEntityType();
        boolean result23 = testSubject0.isOWLClass();
        OWLClass result24 = testSubject0.asOWLClass();
        boolean result25 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result26 = testSubject0.asOWLObjectProperty();
        boolean result27 = testSubject0.isOWLDataProperty();
        OWLDataProperty result28 = testSubject0.asOWLDataProperty();
        boolean result29 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result30 = testSubject0.asOWLNamedIndividual();
        boolean result31 = testSubject0.isOWLDatatype();
        OWLDatatype result32 = testSubject0.asOWLDatatype();
        boolean result33 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result34 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result35 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result36 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLNamedIndividualProvider.class));
    }

    public void verifyInterfaceOWLNamedIndividualProvider() {
        OWLNamedIndividualProvider testSubject0 = mock(OWLNamedIndividualProvider.class);
        OWLNamedIndividual result0 = testSubject0.getOWLNamedIndividual(_IRI);
    }

    @Test
    public void enforceInterfacesOWLNamedObject() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLNamedObject.class));
        assertTrue(HasIRI.class.isAssignableFrom(OWLNamedObject.class));
    }

    public void verifyInterfaceOWLNamedObject() {
        OWLNamedObject testSubject0 = mock(OWLNamedObject.class);
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result0 = testSubject0.getIRI();
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLNamedObjectVisitor() {
        OWLNamedObjectVisitor testSubject0 = mock(OWLNamedObjectVisitor.class);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
    }

    public void verifyInterfaceOWLNamedObjectVisitorEx() {
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
    public void enforceInterfacesOWLNaryAxiom() {
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLNaryAxiom.class));
    }

    public void verifyInterfaceOWLNaryAxiom() {
        OWLNaryAxiom<OWLClass> testSubject0 = mock(OWLNaryAxiom.class);
        java.util.Set<? extends OWLNaryAxiom<OWLClass>> result0 = testSubject0.asPairwiseAxioms();
        java.util.Collection<java.lang.Object> result1 = testSubject0.walkPairwise(_OWLPairwiseVisitor);
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLNaryBooleanClassExpression() {
        assertTrue(OWLBooleanClassExpression.class.isAssignableFrom(OWLNaryBooleanClassExpression.class));
    }

    public void verifyInterfaceOWLNaryBooleanClassExpression() {
        OWLNaryBooleanClassExpression testSubject0 = mock(OWLNaryBooleanClassExpression.class);
        java.util.Set<OWLClassExpression> result0 = testSubject0.getOperands();
        java.util.List<OWLClassExpression> result1 = testSubject0.getOperandsAsList();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result3 = testSubject0.asOWLClass();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        java.util.Set<OWLClassExpression> result1 = testSubject0.getClassExpressions();
        java.util.List<OWLClassExpression> result2 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result3 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set43);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Set<? extends OWLNaryAxiom<OWLClassExpression>> result30 = testSubject0.asPairwiseAxioms();
        java.util.Collection<java.lang.Object> result31 = testSubject0.walkPairwise(_OWLExpressionPairwiseVisitor);
        java.util.Set<OWLSubClassOfAxiom> result32 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryDataRange() {
        assertTrue(OWLDataRange.class.isAssignableFrom(OWLNaryDataRange.class));
    }

    public void verifyInterfaceOWLNaryDataRange() {
        OWLNaryDataRange testSubject0 = mock(OWLNaryDataRange.class);
        java.util.Set<OWLDataRange> result0 = testSubject0.getOperands();
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLNaryIndividualAxiom() {
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLNaryIndividualAxiom.class));
        assertTrue(OWLNaryAxiom.class.isAssignableFrom(OWLNaryIndividualAxiom.class));
        assertTrue(OWLSubClassOfAxiomSetShortCut.class.isAssignableFrom(OWLNaryIndividualAxiom.class));
    }

    public void verifyInterfaceOWLNaryIndividualAxiom() {
        OWLNaryIndividualAxiom testSubject0 = mock(OWLNaryIndividualAxiom.class);
        java.util.List<OWLIndividual> result0 = testSubject0.getIndividualsAsList();
        java.util.Set<OWLIndividual> result1 = testSubject0.getIndividuals();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        Set<? extends OWLNaryAxiom<OWLIndividual>> result28 = testSubject0.asPairwiseAxioms();
        java.util.Collection<java.lang.Object> result29 = testSubject0.walkPairwise(_OWLIndividualPairwiseVisitor);
        java.util.Set<OWLSubClassOfAxiom> result30 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLNaryPropertyAxiom.class));
        assertTrue(OWLNaryAxiom.class.isAssignableFrom(OWLNaryPropertyAxiom.class));
    }

    public void verifyInterfaceOWLNaryPropertyAxiom() {
        OWLNaryPropertyAxiom<OWLObjectPropertyExpression> testSubject0 = mock(OWLNaryPropertyAxiom.class);
        Set<OWLObjectPropertyExpression> result0 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result1 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        Set<? extends OWLNaryAxiom<OWLObjectPropertyExpression>> result28 = testSubject0.asPairwiseAxioms();
        java.util.Collection<java.lang.Object> result29 = testSubject0.walkPairwise(_OWLObjectPairwiseVisitor);
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
        java.lang.Object result2 = testSubject0.getProperty();
        OWLObject result3 = testSubject0.getObject();
        OWLIndividual result4 = testSubject0.getSubject();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLSubClassOfAxiom result31 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result32 = testSubject0.getSubject();
        java.lang.Object result33 = testSubject0.getProperty();
        OWLObject result34 = testSubject0.getObject();
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
        java.lang.Object result2 = testSubject0.getProperty();
        OWLObject result3 = testSubject0.getObject();
        OWLIndividual result4 = testSubject0.getSubject();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLSubClassOfAxiom result31 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result32 = testSubject0.getSubject();
        java.lang.Object result33 = testSubject0.getProperty();
        OWLObject result34 = testSubject0.getObject();
    }

    @Test
    public void enforceInterfacesOWLObject() {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(OWLObject.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasSignature.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasContainsEntityInSignature.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasAnonymousIndividuals.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasClassesInSignature.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasObjectPropertiesInSignature.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasDataPropertiesInSignature.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasIndividualsInSignature.class.isAssignableFrom(OWLObject.class));
        assertTrue(HasDatatypesInSignature.class.isAssignableFrom(OWLObject.class));
    }

    public void verifyInterfaceOWLObject() {
        OWLObject testSubject0 = mock(OWLObject.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object);
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFrom() {
        assertTrue(OWLQuantifiedObjectRestriction.class.isAssignableFrom(OWLObjectAllValuesFrom.class));
    }

    public void verifyInterfaceOWLObjectAllValuesFrom() {
        OWLObjectAllValuesFrom testSubject0 = mock(OWLObjectAllValuesFrom.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
        OWLObjectPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectCardinalityRestriction() {
        assertTrue(OWLCardinalityRestriction.class.isAssignableFrom(OWLObjectCardinalityRestriction.class));
        assertTrue(OWLObjectRestriction.class.isAssignableFrom(OWLObjectCardinalityRestriction.class));
    }

    public void verifyInterfaceOWLObjectCardinalityRestriction() {
        OWLObjectCardinalityRestriction testSubject0 = mock(OWLObjectCardinalityRestriction.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
        OWLObjectPropertyExpression result32 = testSubject0.getProperty();
        java.lang.Object result33 = testSubject0.getProperty();
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
        OWLClass result2 = testSubject0.asOWLClass();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isOWLThing();
        boolean result5 = testSubject0.isClassExpressionLiteral();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        java.lang.Object result3 = testSubject0.getFiller();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result7 = testSubject0.asOWLClass();
        ClassExpressionType result8 = testSubject0.getClassExpressionType();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object);
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result32 = testSubject0.getFiller();
        OWLObjectPropertyExpression result33 = testSubject0.getProperty();
        java.lang.Object result34 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectHasSelf() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLObjectHasSelf.class));
        assertTrue(OWLObjectRestriction.class.isAssignableFrom(OWLObjectHasSelf.class));
    }

    public void verifyInterfaceOWLObjectHasSelf() {
        OWLObjectHasSelf testSubject0 = mock(OWLObjectHasSelf.class);
        boolean result0 = testSubject0.isObjectRestriction();
        boolean result1 = testSubject0.isDataRestriction();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result3 = testSubject0.asOWLClass();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObjectPropertyExpression result28 = testSubject0.getProperty();
        java.lang.Object result29 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectHasValue() {
        assertTrue(OWLHasValueRestriction.class.isAssignableFrom(OWLObjectHasValue.class));
        assertTrue(OWLObjectRestriction.class.isAssignableFrom(OWLObjectHasValue.class));
    }

    public void verifyInterfaceOWLObjectHasValue() {
        OWLObjectHasValue testSubject0 = mock(OWLObjectHasValue.class);
        java.lang.Object result0 = testSubject0.getFiller();
        OWLClassExpression result1 = testSubject0.asSomeValuesFrom();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isDataRestriction();
        OWLObject result4 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result5 = testSubject0.asOWLClass();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObjectPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOf() {
        assertTrue(OWLNaryBooleanClassExpression.class.isAssignableFrom(OWLObjectIntersectionOf.class));
    }

    public void verifyInterfaceOWLObjectIntersectionOf() {
        OWLObjectIntersectionOf testSubject0 = mock(OWLObjectIntersectionOf.class);
        java.util.Set<OWLClassExpression> result0 = testSubject0.getOperands();
        java.util.List<OWLClassExpression> result1 = testSubject0.getOperandsAsList();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result3 = testSubject0.asOWLClass();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectInverseOf() {
        assertTrue(OWLObjectPropertyExpression.class.isAssignableFrom(OWLObjectInverseOf.class));
    }

    public void verifyInterfaceOWLObjectInverseOf() {
        OWLObjectInverseOf testSubject0 = mock(OWLObjectInverseOf.class);
        OWLObjectPropertyExpression result0 = testSubject0.getInverse();
        OWLObjectProperty result1 = testSubject0.asOWLObjectProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result3 = testSubject0.getSimplified();
        OWLObjectProperty result4 = testSubject0.getNamedProperty();
        OWLObject result5 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result6 = testSubject0.isOWLTopDataProperty();
        boolean result7 = testSubject0.isDataPropertyExpression();
        boolean result8 = testSubject0.isObjectPropertyExpression();
        boolean result9 = testSubject0.isOWLTopObjectProperty();
        boolean result10 = testSubject0.isOWLBottomObjectProperty();
        boolean result11 = testSubject0.isOWLBottomDataProperty();
        boolean result12 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinality() {
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectMaxCardinality.class));
    }

    public void verifyInterfaceOWLObjectMaxCardinality() {
        OWLObjectMaxCardinality testSubject0 = mock(OWLObjectMaxCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
        OWLObjectPropertyExpression result32 = testSubject0.getProperty();
        java.lang.Object result33 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinality() {
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectMinCardinality.class));
    }

    public void verifyInterfaceOWLObjectMinCardinality() {
        OWLObjectMinCardinality testSubject0 = mock(OWLObjectMinCardinality.class);
        int result0 = testSubject0.getCardinality();
        boolean result1 = testSubject0.isQualified();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result6 = testSubject0.asOWLClass();
        ClassExpressionType result7 = testSubject0.getClassExpressionType();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result31 = testSubject0.getFiller();
        OWLObjectPropertyExpression result32 = testSubject0.getProperty();
        java.lang.Object result33 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectOneOf() {
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLObjectOneOf.class));
    }

    public void verifyInterfaceOWLObjectOneOf() {
        OWLObjectOneOf testSubject0 = mock(OWLObjectOneOf.class);
        java.util.Set<OWLIndividual> result0 = testSubject0.getIndividuals();
        OWLClassExpression result1 = testSubject0.asObjectUnionOf();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result3 = testSubject0.asOWLClass();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectProperty() {
        assertTrue(OWLObjectPropertyExpression.class.isAssignableFrom(OWLObjectProperty.class));
        assertTrue(OWLProperty.class.isAssignableFrom(OWLObjectProperty.class));
    }

    public void verifyInterfaceOWLObjectProperty() {
        OWLObjectProperty testSubject0 = mock(OWLObjectProperty.class);
        OWLObjectProperty result0 = testSubject0.asOWLObjectProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getSimplified();
        OWLObjectProperty result3 = testSubject0.getNamedProperty();
        OWLObject result4 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result5 = testSubject0.isOWLTopDataProperty();
        boolean result6 = testSubject0.isDataPropertyExpression();
        boolean result7 = testSubject0.isObjectPropertyExpression();
        boolean result8 = testSubject0.isOWLTopObjectProperty();
        boolean result9 = testSubject0.isOWLBottomObjectProperty();
        boolean result10 = testSubject0.isOWLBottomDataProperty();
        boolean result11 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result12 = testSubject0.getSignature();
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        int result23 = testSubject0.compareTo(_Object);
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result25 = testSubject0.isType(_EntityType);
        OWLObject result26 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result27 = testSubject0.isBuiltIn();
        EntityType<?> result28 = testSubject0.getEntityType();
        boolean result29 = testSubject0.isOWLClass();
        OWLClass result30 = testSubject0.asOWLClass();
        boolean result31 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result32 = testSubject0.asOWLObjectProperty();
        boolean result33 = testSubject0.isOWLDataProperty();
        OWLDataProperty result34 = testSubject0.asOWLDataProperty();
        boolean result35 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result36 = testSubject0.asOWLNamedIndividual();
        boolean result37 = testSubject0.isOWLDatatype();
        OWLDatatype result38 = testSubject0.asOWLDatatype();
        boolean result39 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result40 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result41 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result42 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiom() {
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLObjectPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLObjectPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyAssertionAxiom() {
        OWLObjectPropertyAssertionAxiom testSubject0 = mock(OWLObjectPropertyAssertionAxiom.class);
        boolean result0 = testSubject0.isInSimplifiedForm();
        OWLObjectPropertyAssertionAxiom result1 = testSubject0.getSimplified();
        OWLObjectPropertyAssertionAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        java.lang.Object result3 = testSubject0.getProperty();
        OWLObject result4 = testSubject0.getObject();
        OWLIndividual result5 = testSubject0.getSubject();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result8 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        boolean result14 = testSubject0.isAnnotated();
        AxiomType<?> result15 = testSubject0.getAxiomType();
        boolean result16 = testSubject0.isOfType(_Set43);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        int result30 = testSubject0.compareTo(_Object);
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLSubClassOfAxiom result32 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result33 = testSubject0.getSubject();
        java.lang.Object result34 = testSubject0.getProperty();
        OWLObject result35 = testSubject0.getObject();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyAxiom() {
        OWLObjectPropertyAxiom testSubject0 = mock(OWLObjectPropertyAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyCharacteristicAxiom() {
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiom.class));
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyCharacteristicAxiom() {
        OWLObjectPropertyCharacteristicAxiom testSubject0 = mock(OWLObjectPropertyCharacteristicAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result26 = testSubject0.getProperty();
        java.lang.Object result27 = testSubject0.getProperty();
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
        java.lang.Object result2 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
        OWLClassExpression result31 = testSubject0.getDomain();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpression() {
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLObjectPropertyExpression.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(OWLObjectPropertyExpression.class));
    }

    public void verifyInterfaceOWLObjectPropertyExpression() {
        OWLObjectPropertyExpression testSubject0 = mock(OWLObjectPropertyExpression.class);
        OWLObjectProperty result0 = testSubject0.asOWLObjectProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getSimplified();
        OWLObjectProperty result3 = testSubject0.getNamedProperty();
        OWLObject result4 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result5 = testSubject0.isOWLTopDataProperty();
        boolean result6 = testSubject0.isDataPropertyExpression();
        boolean result7 = testSubject0.isObjectPropertyExpression();
        boolean result8 = testSubject0.isOWLTopObjectProperty();
        boolean result9 = testSubject0.isOWLBottomObjectProperty();
        boolean result10 = testSubject0.isOWLBottomDataProperty();
        boolean result11 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result12 = testSubject0.getSignature();
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        int result23 = testSubject0.compareTo(_Object);
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyProvider() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObjectPropertyProvider.class));
    }

    public void verifyInterfaceOWLObjectPropertyProvider() {
        OWLObjectPropertyProvider testSubject0 = mock(OWLObjectPropertyProvider.class);
        OWLObjectProperty result0 = testSubject0.getOWLObjectProperty(_IRI);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiom() {
        assertTrue(OWLPropertyRangeAxiom.class.isAssignableFrom(OWLObjectPropertyRangeAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLObjectPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLObjectPropertyRangeAxiom() {
        OWLObjectPropertyRangeAxiom testSubject0 = mock(OWLObjectPropertyRangeAxiom.class);
        OWLObjectPropertyRangeAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.lang.Object result1 = testSubject0.getRange();
        java.lang.Object result2 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
        OWLSubClassOfAxiom result30 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result31 = testSubject0.getRange();
    }

    @Test
    public void enforceInterfacesOWLObjectRestriction() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLObjectRestriction.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLObjectRestriction.class));
    }

    public void verifyInterfaceOWLObjectRestriction() {
        OWLObjectRestriction testSubject0 = mock(OWLObjectRestriction.class);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFrom() {
        assertTrue(OWLQuantifiedObjectRestriction.class.isAssignableFrom(OWLObjectSomeValuesFrom.class));
    }

    public void verifyInterfaceOWLObjectSomeValuesFrom() {
        OWLObjectSomeValuesFrom testSubject0 = mock(OWLObjectSomeValuesFrom.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
        OWLObjectPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOf() {
        assertTrue(OWLNaryBooleanClassExpression.class.isAssignableFrom(OWLObjectUnionOf.class));
    }

    public void verifyInterfaceOWLObjectUnionOf() {
        OWLObjectUnionOf testSubject0 = mock(OWLObjectUnionOf.class);
        java.util.Set<OWLClassExpression> result0 = testSubject0.getOperands();
        java.util.List<OWLClassExpression> result1 = testSubject0.getOperandsAsList();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result3 = testSubject0.asOWLClass();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        assertTrue(OWLNamedObjectVisitor.class.isAssignableFrom(OWLObjectVisitor.class));
    }

    public void verifyInterfaceOWLObjectVisitor() {
        OWLObjectVisitor testSubject0 = mock(OWLObjectVisitor.class);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
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
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
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
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
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
        OWLObject result0 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result1 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result2 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result3 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result4 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result5 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result6 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result7 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result8 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result9 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result10 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result11 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result12 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result13 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result14 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result15 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result16 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result17 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result18 = testSubject0.visit(_SWRLRule);
        OWLObject result19 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result20 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result21 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result22 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result23 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result24 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result25 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result26 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result27 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result28 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result29 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result30 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result31 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result32 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result33 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result34 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result35 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result36 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result37 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result38 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
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
        OWLObject result65 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result66 = testSubject0.visit(_OWLDataProperty);
        OWLObject result67 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result68 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result69 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result70 = testSubject0.visit(_OWLDatatype);
        OWLObject result71 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result72 = testSubject0.visit(_OWLDataProperty);
        OWLObject result73 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result74 = testSubject0.visit(_OWLClass);
        OWLObject result75 = testSubject0.visit(_OWLAnnotation);
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
    public void enforceInterfacesOWLOntology() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasAxioms.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasLogicalAxioms.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasAxiomsByType.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasContainsAxiom.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasAnnotations.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasDirectImports.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasImportsClosure.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasContainsEntityInSignature.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasOntologyID.class.isAssignableFrom(OWLOntology.class));
        assertTrue(HasGetEntitiesInSignature.class.isAssignableFrom(OWLOntology.class));
        assertTrue(OWLAxiomCollection.class.isAssignableFrom(OWLOntology.class));
        assertTrue(OWLSignature.class.isAssignableFrom(OWLOntology.class));
        assertTrue(OWLAxiomIndex.class.isAssignableFrom(OWLOntology.class));
    }

    public void verifyInterfaceOWLOntology() {
        OWLOntology testSubject0 = mock(OWLOntology.class);
        boolean result0 = testSubject0.isEmpty();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature(_imports);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLOntologyID result4 = testSubject0.getOntologyID();
        OWLOntologyManager result5 = testSubject0.getOWLOntologyManager();
        boolean result6 = testSubject0.isAnonymous();
        java.util.Set<IRI> result7 = testSubject0.getDirectImportsDocuments();
        java.util.Set<OWLOntology> result8 = testSubject0.getDirectImports();
        java.util.Set<OWLOntology> result9 = testSubject0.getImports();
        java.util.Set<OWLOntology> result10 = testSubject0.getImportsClosure();
        java.util.Set<OWLImportsDeclaration> result11 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result12 = testSubject0.getTBoxAxioms(_imports);
        java.util.Set<OWLAxiom> result13 = testSubject0.getABoxAxioms(_imports);
        java.util.Set<OWLAxiom> result14 = testSubject0.getRBoxAxioms(_imports);
        java.util.Set<OWLClassAxiom> result15 = testSubject0.getGeneralClassAxioms();
        boolean result16 = testSubject0.isDeclared(_OWLEntity, _imports);
        boolean result17 = testSubject0.isDeclared(_OWLEntity);
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Set<OWLAxiom> result30 = testSubject0.getAxioms();
        java.util.Set<OWLLogicalAxiom> result31 = testSubject0.getLogicalAxioms();
        Set<OWLAnnotationAssertionAxiom> result32 = testSubject0.getAxioms(_AxiomType);
        boolean result33 = testSubject0.containsAxiom(_OWLAxiom);
        java.util.Set<OWLEntity> result34 = testSubject0.getEntitiesInSignature(_IRI);
        java.util.Set<OWLClassAxiom> result35 = testSubject0.getAxioms(_OWLClass, _imports);
        java.util.Set<OWLDatatypeDefinitionAxiom> result36 = testSubject0.getAxioms(_OWLDatatype, _imports);
        Set<OWLAnnotationAssertionAxiom> result37 = testSubject0.getAxioms(_AxiomType, _imports);
        Set<OWLAnnotationAssertionAxiom> result38 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<OWLAnnotationAxiom> result39 = testSubject0.getAxioms(_OWLAnnotationProperty, _imports);
        java.util.Set<OWLIndividualAxiom> result40 = testSubject0.getAxioms(_OWLIndividual, _imports);
        java.util.Set<OWLDataPropertyAxiom> result41 = testSubject0.getAxioms(_OWLDataProperty, _imports);
        java.util.Set<OWLObjectPropertyAxiom> result42 = testSubject0.getAxioms(_OWLObjectPropertyExpression, _imports);
        java.util.Set<OWLAxiom> result43 = testSubject0.getAxioms(_imports);
        java.util.Set<OWLAxiom> result44 = testSubject0.getAxioms();
        boolean result45 = testSubject0.containsAxiom(_OWLAxiom, _imports, _ignore);
        boolean result46 = testSubject0.containsAxiom(_OWLAxiom);
        int result47 = testSubject0.getAxiomCount(_imports);
        int result48 = testSubject0.getAxiomCount();
        int result49 = testSubject0.getAxiomCount(_AxiomType);
        int result50 = testSubject0.getAxiomCount(_AxiomType, _imports);
        java.util.Set<OWLLogicalAxiom> result51 = testSubject0.getLogicalAxioms(_imports);
        java.util.Set<OWLLogicalAxiom> result52 = testSubject0.getLogicalAxioms();
        int result53 = testSubject0.getLogicalAxiomCount();
        int result54 = testSubject0.getLogicalAxiomCount(_imports);
        java.util.Set<OWLAxiom> result55 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom, _imports);
        java.util.Set<OWLAxiom> result56 = testSubject0.getReferencingAxioms(_OWLPrimitive, _imports);
        java.util.Set<OWLClass> result57 = testSubject0.getClassesInSignature(_imports);
        java.util.Set<OWLDataProperty> result58 = testSubject0.getDataPropertiesInSignature(_imports);
        java.util.Set<OWLObjectProperty> result59 = testSubject0.getObjectPropertiesInSignature(_imports);
        java.util.Set<OWLNamedIndividual> result60 = testSubject0.getIndividualsInSignature(_imports);
        java.util.Set<OWLDatatype> result61 = testSubject0.getDatatypesInSignature(_imports);
        boolean result62 = testSubject0.containsEntityInSignature(_IRI, _imports);
        boolean result63 = testSubject0.containsEntityInSignature(_OWLEntity, _imports);
        java.util.Set<OWLEntity> result64 = testSubject0.getEntitiesInSignature(_IRI, _imports);
        boolean result65 = testSubject0.containsReference(_OWLEntity, _imports);
        java.util.Set<OWLAnonymousIndividual> result66 = testSubject0.getReferencedAnonymousIndividuals(_imports);
        java.util.Set<OWLAnnotationProperty> result67 = testSubject0.getAnnotationPropertiesInSignature(_imports);
        boolean result68 = testSubject0.containsClassInSignature(_IRI, _imports);
        boolean result69 = testSubject0.containsObjectPropertyInSignature(_IRI, _imports);
        boolean result70 = testSubject0.containsDataPropertyInSignature(_IRI, _imports);
        boolean result71 = testSubject0.containsAnnotationPropertyInSignature(_IRI, _imports);
        boolean result72 = testSubject0.containsIndividualInSignature(_IRI, _imports);
        boolean result73 = testSubject0.containsDatatypeInSignature(_IRI, _imports);
        java.util.Set<OWLClass> result74 = testSubject0.getClassesInSignature();
        java.util.Set<OWLObjectProperty> result75 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLDataProperty> result76 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLDatatype> result77 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLNamedIndividual> result78 = testSubject0.getIndividualsInSignature();
        boolean result79 = testSubject0.contains(_OWLAxiomSearchFilter, _Object, _imports);
        java.util.Set<OWLAxiom> result80 = testSubject0.getAxioms(OWLAxiom.class, _Class71, _OWLObject, _imports, _ignore);
        java.util.Set<OWLAxiom> result81 = testSubject0.getAxioms(OWLAxiom.class, _OWLObject, _imports, _ignore);
        java.util.Collection<OWLAxiom> result82 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object, _imports);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result83 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result84 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result85 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result86 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result87 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result88 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result89 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result90 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result91 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result92 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result93 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result94 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result95 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result96 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result97 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result98 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result99 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result100 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result101 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result102 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result103 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result104 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result105 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result106 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result107 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result108 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result109 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result110 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result111 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result112 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result113 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result114 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result115 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLClassAssertionAxiom> result116 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLDataPropertyAssertionAxiom> result117 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result118 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result119 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result120 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result121 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result122 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result123 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
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
        OWLOntologyID result0 = testSubject0.getOntologyID();
        IRI result1 = testSubject0.getDocumentIRI();
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
    public void enforceInterfacesOWLOntologyBuilder() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyBuilder.class));
    }

    public void verifyInterfaceOWLOntologyBuilder() {
        OWLOntologyBuilder testSubject0 = mock(OWLOntologyBuilder.class);
        OWLOntology result0 = testSubject0.createOWLOntology(_OWLOntologyManager, _OWLOntologyID);
    }

    @Test
    public void enforceInterfacesOWLOntologyChange() {
        assertTrue(HasSignature.class.isAssignableFrom(OWLOntologyChange.class));
    }

    public void verifyOWLOntologyChange() {
        OWLOntologyChange<OWLObject> testSubject0 = mock(OWLOntologyChange.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        boolean result2 = testSubject0.isAddAxiom();
        boolean result3 = testSubject0.isRemoveAxiom();
        OWLAxiom result4 = testSubject0.getAxiom();
        boolean result5 = testSubject0.isImportChange();
        boolean result6 = testSubject0.isAxiomChange();
        OWLOntology result7 = testSubject0.getOntology();
        OWLOntologyChangeData<OWLObject> result8 = testSubject0.getChangeData();
        OWLOntologyChangeRecord<OWLObject> result9 = testSubject0.getChangeRecord();
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

    public void verifyOWLOntologyChangeException() {
        OWLOntologyChangeException testSubject0 = mock(OWLOntologyChangeException.class);
        OWLOntologyChange<?> result0 = testSubject0.getChange();
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
        OWLOntologyChangeVetoException testSubject0 = new OWLOntologyChangeVetoException(_OWLOntologyChange, _String);
        OWLOntologyChangeVetoException testSubject1 = new OWLOntologyChangeVetoException(_OWLOntologyChange, _String, _Throwable);
        OWLOntologyChangeVetoException testSubject2 = new OWLOntologyChangeVetoException(_OWLOntologyChange, _Throwable);
        OWLOntologyChange<?> result0 = testSubject0.getChange();
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

    public void verifyInterfaceOWLOntologyChangeVisitor() {
        OWLOntologyChangeVisitor testSubject0 = mock(OWLOntologyChangeVisitor.class);
        testSubject0.visit(_AddImport);
        testSubject0.visit(_RemoveImport);
        testSubject0.visit(_AddOntologyAnnotation);
        testSubject0.visit(_RemoveOntologyAnnotation);
        testSubject0.visit(_SetOntologyID);
        testSubject0.visit(_RemoveAxiom);
        testSubject0.visit(_AddAxiom);
    }

    public void verifyInterfaceOWLOntologyChangeVisitorEx() {
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
    public void enforceInterfacesOWLOntologyDocumentAlreadyExistsException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(OWLOntologyDocumentAlreadyExistsException.class));
    }

    public void verifyOWLOntologyDocumentAlreadyExistsException() {
        OWLOntologyDocumentAlreadyExistsException testSubject0 = new OWLOntologyDocumentAlreadyExistsException(_IRI);
        IRI result0 = testSubject0.getOntologyDocumentIRI();
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
    public void enforceInterfacesOWLOntologyFactory() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFactory.class));
    }

    public void verifyInterfaceOWLOntologyFactory() throws OWLOntologyCreationException {
        OWLOntologyFactory testSubject0 = mock(OWLOntologyFactory.class);
        OWLOntology result0 = testSubject0.loadOWLOntology(_OWLOntologyManager, _OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        boolean result1 = testSubject0.canCreateFromDocumentIRI(_IRI);
        boolean result2 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        OWLOntology result3 = testSubject0.createOWLOntology(_OWLOntologyManager, _OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
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
    public void enforceInterfacesOWLOntologyFormat() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFormat.class));
    }

    public void verifyOWLOntologyFormat() {
        OWLOntologyFormat testSubject0 = mock(OWLOntologyFormat.class);
        java.lang.String result0 = testSubject0.getKey();
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result1 = testSubject0.getParameter(_Object, _Object);
        boolean result2 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.formats.PrefixOWLOntologyFormat result3 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result4 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
        boolean result5 = testSubject0.isTextual();
    }

    @Test
    public void enforceInterfacesOWLOntologyFormatFactory() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyFormatFactory.class));
        assertTrue(javax.inject.Provider.class.isAssignableFrom(OWLOntologyFormatFactory.class));
        assertTrue(MIMETypeAware.class.isAssignableFrom(OWLOntologyFormatFactory.class));
    }

    public void verifyInterfaceOWLOntologyFormatFactory() {
        OWLOntologyFormatFactory testSubject0 = mock(OWLOntologyFormatFactory.class);
        java.lang.String result0 = testSubject0.getKey();
        boolean result1 = testSubject0.isTextual();
        OWLOntologyFormat result2 = testSubject0.createFormat();
        java.lang.Object result3 = testSubject0.get();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
    }

    @Test
    public void enforceInterfacesOWLOntologyID() {
        assertTrue(java.lang.Comparable.class.isAssignableFrom(OWLOntologyID.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyID.class));
    }

    public void verifyOWLOntologyID() {
        OWLOntologyID testSubject0 = new OWLOntologyID(_IRI, _IRI);
        OWLOntologyID testSubject1 = new OWLOntologyID(_IRI);
        OWLOntologyID testSubject2 = new OWLOntologyID();
        int result1 = testSubject0.compareTo(_OWLOntologyID);
        boolean result2 = testSubject0.isOWL2DLOntologyID();
        IRI result3 = testSubject0.getOntologyIRI();
        IRI result4 = testSubject0.getVersionIRI();
        IRI result5 = testSubject0.getDefaultDocumentIRI();
        boolean result6 = testSubject0.isAnonymous();
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

    public void verifyOWLOntologyLoaderConfiguration() {
        OWLOntologyLoaderConfiguration testSubject0 = new OWLOntologyLoaderConfiguration();
        boolean result0 = testSubject0.isStrict();
        OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy result1 = testSubject0.getMissingOntologyHeaderStrategy();
        OWLOntologyLoaderConfiguration result2 = testSubject0.setMissingOntologyHeaderStrategy(_MissingOntologyHeaderStrategy);
        OWLOntologyLoaderConfiguration result3 = testSubject0.setLoadAnnotationAxioms(_boolean);
        boolean result4 = testSubject0.isLoadAnnotationAxioms();
        OWLOntologyLoaderConfiguration result5 = testSubject0.setAcceptingHTTPCompression(_boolean);
        OWLOntologyLoaderConfiguration result6 = testSubject0.setFollowRedirects(_boolean);
        OWLOntologyLoaderConfiguration result7 = testSubject0.setMissingImportHandlingStrategy(_MissingImportHandlingStrategy);
        MissingImportHandlingStrategy result8 = testSubject0.getMissingImportHandlingStrategy();
        OWLOntologyLoaderConfiguration result9 = testSubject0.setStrict(_boolean);
        boolean result10 = testSubject0.isIgnoredImport(_IRI);
        OWLOntologyLoaderConfiguration result11 = testSubject0.addIgnoredImport(_IRI);
        OWLOntologyLoaderConfiguration result12 = testSubject0.removeIgnoredImport(_IRI);
        OWLOntologyLoaderConfiguration result13 = testSubject0.clearIgnoredImports();
        OWLOntologyLoaderConfiguration result14 = testSubject0.setReportStackTraces(_boolean);
        boolean result15 = testSubject0.isReportStackTrace();
        OWLOntologyLoaderConfiguration result16 = testSubject0.setConnectionTimeout(_int);
        boolean result17 = testSubject0.isAcceptingHTTPCompression();
        int result18 = testSubject0.getConnectionTimeout();
        boolean result19 = testSubject0.isFollowRedirects();
        boolean result20 = testSubject0.isTreatDublinCoreAsBuiltIn();
        OWLOntologyLoaderConfiguration result21 = testSubject0.setTreatDublinCoreAsBuiltIn(_boolean);
    }

    public void verifyInterfaceOWLOntologyLoaderListener() {
        OWLOntologyLoaderListener testSubject0 = mock(OWLOntologyLoaderListener.class);
        testSubject0.startedLoadingOntology(_LoadingStartedEvent);
        testSubject0.finishedLoadingOntology(_LoadingFinishedEvent);
    }

    @Test
    public void enforceInterfacesOWLOntologyManager() {
        assertTrue(OWLOntologySetProvider.class.isAssignableFrom(OWLOntologyManager.class));
        assertTrue(HasDataFactory.class.isAssignableFrom(OWLOntologyManager.class));
        assertTrue(HasGetOntologyById.class.isAssignableFrom(OWLOntologyManager.class));
        assertTrue(HasApplyChanges.class.isAssignableFrom(OWLOntologyManager.class));
        assertTrue(HasAddAxioms.class.isAssignableFrom(OWLOntologyManager.class));
        assertTrue(HasContainsOntology.class.isAssignableFrom(OWLOntologyManager.class));
    }

    public void verifyInterfaceOWLOntologyManager() throws OWLOntologyCreationException, OWLOntologyStorageException {
        OWLOntologyManager testSubject0 = mock(OWLOntologyManager.class);
        boolean result0 = testSubject0.contains(_OWLOntology);
        boolean result1 = testSubject0.contains(_IRI);
        boolean result2 = testSubject0.contains(_OWLOntologyID);
        OWLDataFactory result3 = testSubject0.getOWLDataFactory();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies(_OWLAxiom);
        java.util.Set<OWLOntology> result6 = testSubject0.getVersions(_IRI);
        boolean result7 = testSubject0.containsVersion(_IRI);
        java.util.Set<OWLOntologyID> result8 = testSubject0.getOntologyIDsByVersion(_IRI);
        OWLOntology result9 = testSubject0.getImportedOntology(_OWLImportsDeclaration);
        java.util.List<OWLOntology> result10 = testSubject0.getSortedImportsClosure(_OWLOntology);
        java.util.List<OWLOntologyChange<?>> result11 = testSubject0.applyChanges(_List);
        java.util.List<OWLOntologyChange<?>> result12 = testSubject0.addAxioms(_OWLOntology, _Set12);
        java.util.List<OWLOntologyChange<?>> result13 = testSubject0.addAxiom(_OWLOntology, _OWLAxiom);
        java.util.List<OWLOntologyChange<?>> result14 = testSubject0.removeAxiom(_OWLOntology, _OWLAxiom);
        java.util.List<OWLOntologyChange<?>> result15 = testSubject0.removeAxioms(_OWLOntology, _Set12);
        java.util.List<OWLOntologyChange<?>> result16 = testSubject0.applyChange(_OWLOntologyChange);
        OWLOntology result17 = testSubject0.createOntology(_Set, _IRI);
        OWLOntology result18 = testSubject0.createOntology(_IRI, _Set199, _boolean);
        OWLOntology result19 = testSubject0.createOntology(_OWLOntologyID);
        OWLOntology result20 = testSubject0.createOntology(_IRI);
        OWLOntology result21 = testSubject0.createOntology(_Set);
        OWLOntology result22 = testSubject0.createOntology();
        OWLOntology result23 = testSubject0.createOntology(_IRI, _Set199);
        OWLOntology result24 = testSubject0.loadOntology(_IRI);
        OWLOntology result25 = testSubject0.loadOntologyFromOntologyDocument(_IRI);
        OWLOntology result26 = testSubject0.loadOntologyFromOntologyDocument(_File);
        OWLOntology result27 = testSubject0.loadOntologyFromOntologyDocument(_InputStream);
        OWLOntology result28 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource);
        OWLOntology result29 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource, _OWLOntologyLoaderConfiguration);
        testSubject0.removeOntology(_OWLOntologyID);
        testSubject0.removeOntology(_OWLOntology);
        IRI result30 = testSubject0.getOntologyDocumentIRI(_OWLOntology);
        testSubject0.setOntologyDocumentIRI(_OWLOntology, _IRI);
        OWLOntologyFormat result31 = testSubject0.getOntologyFormat(_OWLOntology);
        testSubject0.setOntologyFormat(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology);
        testSubject0.saveOntology(_OWLOntology, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OWLOntologyDocumentTarget);
        testSubject0.setIRIMappers(_Set204);
        org.semanticweb.owlapi.util.PriorityCollection<OWLOntologyIRIMapper> result32 = testSubject0.getIRIMappers();
        testSubject0.setOntologyParsers(_Set205);
        org.semanticweb.owlapi.util.PriorityCollection<org.semanticweb.owlapi.io.OWLParser> result33 = testSubject0.getOntologyParsers();
        testSubject0.setOntologyFactories(_Set206);
        org.semanticweb.owlapi.util.PriorityCollection<OWLOntologyFactory> result34 = testSubject0.getOntologyFactories();
        testSubject0.setOntologyStorers(_Set207);
        org.semanticweb.owlapi.util.PriorityCollection<OWLOntologyStorer> result35 = testSubject0.getOntologyStorers();
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
        OWLOntology result36 = testSubject0.getOntology(_OWLOntologyID);
        OWLOntology result37 = testSubject0.getOntology(_IRI);
        java.util.Set<OWLOntology> result38 = testSubject0.getDirectImports(_OWLOntology);
        java.util.Set<OWLOntology> result39 = testSubject0.getImports(_OWLOntology);
        java.util.Set<OWLOntology> result40 = testSubject0.getImportsClosure(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWLOntologyRenameException() {
        assertTrue(OWLOntologyChangeException.class.isAssignableFrom(OWLOntologyRenameException.class));
    }

    public void verifyOWLOntologyRenameException() {
        OWLOntologyRenameException testSubject0 = new OWLOntologyRenameException(_OWLOntologyChange, _OWLOntologyID);
        OWLOntologyID result0 = testSubject0.getOntologyID();
        OWLOntologyChange<?> result1 = testSubject0.getChange();
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
    public void enforceInterfacesOWLOntologySetProvider() {
        assertTrue(HasGetOntologies.class.isAssignableFrom(OWLOntologySetProvider.class));
    }

    public void verifyInterfaceOWLOntologySetProvider() {
        OWLOntologySetProvider testSubject0 = mock(OWLOntologySetProvider.class);
        java.util.Set<OWLOntology> result0 = testSubject0.getOntologies();
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
    public void enforceInterfacesOWLOntologyStorer() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyStorer.class));
    }

    public void verifyInterfaceOWLOntologyStorer() throws OWLOntologyStorageException, IOException {
        OWLOntologyStorer testSubject0 = mock(OWLOntologyStorer.class);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLOntologyStorerFactory() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyStorerFactory.class));
        assertTrue(javax.inject.Provider.class.isAssignableFrom(OWLOntologyStorerFactory.class));
    }

    public void verifyInterfaceOWLOntologyStorerFactory() {
        OWLOntologyStorerFactory testSubject0 = mock(OWLOntologyStorerFactory.class);
        OWLOntologyStorer result0 = testSubject0.createStorer();
        OWLOntologyFormatFactory result1 = testSubject0.getFormatFactory();
        java.lang.Object result2 = testSubject0.get();
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

    public void verifyInterfaceOWLPairwiseVisitor() {
        OWLPairwiseVisitor<Object, OWLObject> testSubject0 = mock(OWLPairwiseVisitor.class);
        java.lang.Object result0 = testSubject0.visit(_Object213, _Object213);
    }

    @Test
    public void enforceInterfacesOWLPrimitive() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPrimitive.class));
    }

    public void verifyInterfaceOWLPrimitive() {
        OWLPrimitive testSubject0 = mock(OWLPrimitive.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object);
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLProperty() {
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLProperty.class));
        assertTrue(OWLLogicalEntity.class.isAssignableFrom(OWLProperty.class));
        assertTrue(OWLNamedObject.class.isAssignableFrom(OWLProperty.class));
    }

    public void verifyInterfaceOWLProperty() {
        OWLProperty testSubject0 = mock(OWLProperty.class);
        OWLObject result0 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result1 = testSubject0.isOWLTopDataProperty();
        boolean result2 = testSubject0.isDataPropertyExpression();
        boolean result3 = testSubject0.isObjectPropertyExpression();
        boolean result4 = testSubject0.isOWLTopObjectProperty();
        boolean result5 = testSubject0.isOWLBottomObjectProperty();
        boolean result6 = testSubject0.isOWLBottomDataProperty();
        boolean result7 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        OWLObject result9 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        int result19 = testSubject0.compareTo(_Object);
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result21 = testSubject0.isType(_EntityType);
        OWLObject result22 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result23 = testSubject0.isBuiltIn();
        EntityType<?> result24 = testSubject0.getEntityType();
        boolean result25 = testSubject0.isOWLClass();
        OWLClass result26 = testSubject0.asOWLClass();
        boolean result27 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result28 = testSubject0.asOWLObjectProperty();
        boolean result29 = testSubject0.isOWLDataProperty();
        OWLDataProperty result30 = testSubject0.asOWLDataProperty();
        boolean result31 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result32 = testSubject0.asOWLNamedIndividual();
        boolean result33 = testSubject0.isOWLDatatype();
        OWLDatatype result34 = testSubject0.asOWLDatatype();
        boolean result35 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result36 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result37 = testSubject0.toStringID();
        testSubject0.accept(_OWLNamedObjectVisitor);
        IRI result38 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLPropertyAssertionAxiom() {
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
        assertTrue(HasSubject.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
        assertTrue(HasObject.class.isAssignableFrom(OWLPropertyAssertionAxiom.class));
    }

    public void verifyInterfaceOWLPropertyAssertionAxiom() {
        OWLPropertyAssertionAxiom<OWLPropertyExpression, OWLPropertyAssertionObject> testSubject0 = mock(OWLPropertyAssertionAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLPropertyAssertionObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result30 = testSubject0.getSubject();
        java.lang.Object result31 = testSubject0.getProperty();
        OWLObject result32 = testSubject0.getObject();
    }

    @Test
    public void enforceInterfacesOWLPropertyAssertionObject() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyAssertionObject.class));
    }

    public void verifyInterfaceOWLPropertyAssertionObject() {
        OWLPropertyAssertionObject testSubject0 = mock(OWLPropertyAssertionObject.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object);
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLPropertyAxiom() {
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLPropertyAxiom.class));
    }

    public void verifyInterfaceOWLPropertyAxiom() {
        OWLPropertyAxiom testSubject0 = mock(OWLPropertyAxiom.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        boolean result8 = testSubject0.isAnnotated();
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isOfType(_Set43);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        int result24 = testSubject0.compareTo(_Object);
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLPropertyDomain() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyDomain.class));
    }

    public void verifyInterfaceOWLPropertyDomain() {
        OWLPropertyDomain testSubject0 = mock(OWLPropertyDomain.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object);
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLPropertyDomainAxiom() {
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLPropertyDomainAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLPropertyDomainAxiom.class));
        assertTrue(HasDomain.class.isAssignableFrom(OWLPropertyDomainAxiom.class));
    }

    public void verifyInterfaceOWLPropertyDomainAxiom() {
        OWLPropertyDomainAxiom<OWLPropertyExpression> testSubject0 = mock(OWLPropertyDomainAxiom.class);
        OWLClassExpression result0 = testSubject0.getDomain();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
        OWLClassExpression result30 = testSubject0.getDomain();
    }

    @Test
    public void enforceInterfacesOWLPropertyExpression() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyExpression.class));
    }

    public void verifyInterfaceOWLPropertyExpression() {
        OWLPropertyExpression testSubject0 = mock(OWLPropertyExpression.class);
        OWLObject result0 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result1 = testSubject0.isOWLTopDataProperty();
        boolean result2 = testSubject0.isDataPropertyExpression();
        boolean result3 = testSubject0.isObjectPropertyExpression();
        boolean result4 = testSubject0.isOWLTopObjectProperty();
        boolean result5 = testSubject0.isOWLBottomObjectProperty();
        boolean result6 = testSubject0.isOWLBottomDataProperty();
        boolean result7 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        OWLObject result9 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        int result19 = testSubject0.compareTo(_Object);
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLPropertyExpressionVisitor() {
        OWLPropertyExpressionVisitor testSubject0 = mock(OWLPropertyExpressionVisitor.class);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
    }

    public void verifyInterfaceOWLPropertyExpressionVisitorEx() {
        OWLPropertyExpressionVisitorEx<OWLObject> testSubject0 = mock(OWLPropertyExpressionVisitorEx.class);
        OWLObject result0 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result1 = testSubject0.visit(_OWLDataProperty);
        OWLObject result2 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result3 = testSubject0.visit(_OWLObjectProperty);
    }

    @Test
    public void enforceInterfacesOWLPropertyRange() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLPropertyRange.class));
    }

    public void verifyInterfaceOWLPropertyRange() {
        OWLPropertyRange testSubject0 = mock(OWLPropertyRange.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result2 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result4 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result5 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result6 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result7 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result8 = testSubject0.getNestedClassExpressions();
        boolean result9 = testSubject0.isTopEntity();
        boolean result10 = testSubject0.isBottomEntity();
        int result11 = testSubject0.compareTo(_Object);
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLPropertyRangeAxiom() {
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLPropertyRangeAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLPropertyRangeAxiom.class));
        assertTrue(HasRange.class.isAssignableFrom(OWLPropertyRangeAxiom.class));
    }

    public void verifyInterfaceOWLPropertyRangeAxiom() {
        OWLPropertyRangeAxiom<OWLPropertyExpression, OWLPropertyRange> testSubject0 = mock(OWLPropertyRangeAxiom.class);
        OWLPropertyRange result0 = testSubject0.getRange();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result30 = testSubject0.getRange();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedDataRestriction() {
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLQuantifiedDataRestriction.class));
        assertTrue(OWLDataRestriction.class.isAssignableFrom(OWLQuantifiedDataRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedDataRestriction() {
        OWLQuantifiedDataRestriction testSubject0 = mock(OWLQuantifiedDataRestriction.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
        OWLDataPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedObjectRestriction() {
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLQuantifiedObjectRestriction.class));
        assertTrue(OWLObjectRestriction.class.isAssignableFrom(OWLQuantifiedObjectRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedObjectRestriction() {
        OWLQuantifiedObjectRestriction testSubject0 = mock(OWLQuantifiedObjectRestriction.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
        OWLObjectPropertyExpression result30 = testSubject0.getProperty();
        java.lang.Object result31 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedRestriction() {
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLQuantifiedRestriction.class));
        assertTrue(HasFiller.class.isAssignableFrom(OWLQuantifiedRestriction.class));
    }

    public void verifyInterfaceOWLQuantifiedRestriction() {
        OWLQuantifiedRestriction<OWLPropertyRange> testSubject0 = mock(OWLQuantifiedRestriction.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        OWLObject result3 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result4 = testSubject0.asOWLClass();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result29 = testSubject0.getFiller();
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLReflexiveObjectPropertyAxiom.class));
        assertTrue(OWLSubClassOfAxiomShortCut.class.isAssignableFrom(OWLReflexiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLReflexiveObjectPropertyAxiom() {
        OWLReflexiveObjectPropertyAxiom testSubject0 = mock(OWLReflexiveObjectPropertyAxiom.class);
        OWLReflexiveObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLRestriction() {
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLRestriction.class));
    }

    public void verifyInterfaceOWLRestriction() {
        OWLRestriction testSubject0 = mock(OWLRestriction.class);
        boolean result0 = testSubject0.isObjectRestriction();
        boolean result1 = testSubject0.isDataRestriction();
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClass result3 = testSubject0.asOWLClass();
        ClassExpressionType result4 = testSubject0.getClassExpressionType();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLRuntimeException() {
        assertTrue(java.lang.RuntimeException.class.isAssignableFrom(OWLRuntimeException.class));
    }

    public void verifyOWLRuntimeException() {
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
    public void enforceInterfacesOWLSameIndividualAxiom() {
        assertTrue(OWLNaryIndividualAxiom.class.isAssignableFrom(OWLSameIndividualAxiom.class));
    }

    public void verifyInterfaceOWLSameIndividualAxiom() {
        OWLSameIndividualAxiom testSubject0 = mock(OWLSameIndividualAxiom.class);
        boolean result0 = testSubject0.containsAnonymousIndividuals();
        OWLSameIndividualAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLSameIndividualAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.List<OWLIndividual> result3 = testSubject0.getIndividualsAsList();
        java.util.Set<OWLIndividual> result4 = testSubject0.getIndividuals();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result7 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        boolean result13 = testSubject0.isAnnotated();
        AxiomType<?> result14 = testSubject0.getAxiomType();
        boolean result15 = testSubject0.isOfType(_Set43);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        int result29 = testSubject0.compareTo(_Object);
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.util.Collection<java.lang.Object> result31 = testSubject0.walkPairwise(_OWLIndividualPairwiseVisitor);
        java.util.Set<OWLSubClassOfAxiom> result32 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLSignature() {
        assertTrue(HasGetEntitiesInSignature.class.isAssignableFrom(OWLSignature.class));
        assertTrue(HasClassesInSignature.class.isAssignableFrom(OWLSignature.class));
        assertTrue(HasObjectPropertiesInSignature.class.isAssignableFrom(OWLSignature.class));
        assertTrue(HasDataPropertiesInSignature.class.isAssignableFrom(OWLSignature.class));
        assertTrue(HasDatatypesInSignature.class.isAssignableFrom(OWLSignature.class));
        assertTrue(HasIndividualsInSignature.class.isAssignableFrom(OWLSignature.class));
        assertTrue(HasContainsEntityInSignature.class.isAssignableFrom(OWLSignature.class));
    }

    public void verifyInterfaceOWLSignature() {
        OWLSignature testSubject0 = mock(OWLSignature.class);
        java.util.Set<OWLClass> result0 = testSubject0.getClassesInSignature(_imports);
        java.util.Set<OWLDataProperty> result1 = testSubject0.getDataPropertiesInSignature(_imports);
        java.util.Set<OWLObjectProperty> result2 = testSubject0.getObjectPropertiesInSignature(_imports);
        java.util.Set<OWLNamedIndividual> result3 = testSubject0.getIndividualsInSignature(_imports);
        java.util.Set<OWLDatatype> result4 = testSubject0.getDatatypesInSignature(_imports);
        boolean result5 = testSubject0.containsEntityInSignature(_IRI, _imports);
        boolean result6 = testSubject0.containsEntityInSignature(_OWLEntity, _imports);
        java.util.Set<OWLEntity> result7 = testSubject0.getEntitiesInSignature(_IRI, _imports);
        boolean result8 = testSubject0.containsReference(_OWLEntity, _imports);
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getReferencedAnonymousIndividuals(_imports);
        java.util.Set<OWLAnnotationProperty> result10 = testSubject0.getAnnotationPropertiesInSignature(_imports);
        boolean result11 = testSubject0.containsClassInSignature(_IRI, _imports);
        boolean result12 = testSubject0.containsObjectPropertyInSignature(_IRI, _imports);
        boolean result13 = testSubject0.containsDataPropertyInSignature(_IRI, _imports);
        boolean result14 = testSubject0.containsAnnotationPropertyInSignature(_IRI, _imports);
        boolean result15 = testSubject0.containsIndividualInSignature(_IRI, _imports);
        boolean result16 = testSubject0.containsDatatypeInSignature(_IRI, _imports);
        java.util.Set<OWLEntity> result17 = testSubject0.getEntitiesInSignature(_IRI);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        boolean result23 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubClassOfAxiom() {
        assertTrue(OWLClassAxiom.class.isAssignableFrom(OWLSubClassOfAxiom.class));
    }

    public void verifyInterfaceOWLSubClassOfAxiom() {
        OWLSubClassOfAxiom testSubject0 = mock(OWLSubClassOfAxiom.class);
        OWLClassExpression result0 = testSubject0.getSuperClass();
        OWLSubClassOfAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassExpression result2 = testSubject0.getSubClass();
        boolean result3 = testSubject0.isGCI();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set43);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceOWLSubClassOfAxiomSetShortCut() {
        OWLSubClassOfAxiomSetShortCut testSubject0 = mock(OWLSubClassOfAxiomSetShortCut.class);
        java.util.Set<OWLSubClassOfAxiom> result0 = testSubject0.asOWLSubClassOfAxioms();
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
        java.lang.Object result1 = testSubject0.getSubProperty();
        java.lang.Object result2 = testSubject0.getSuperProperty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiom() {
        assertTrue(OWLSubPropertyAxiom.class.isAssignableFrom(OWLSubObjectPropertyOfAxiom.class));
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLSubObjectPropertyOfAxiom.class));
    }

    public void verifyInterfaceOWLSubObjectPropertyOfAxiom() {
        OWLSubObjectPropertyOfAxiom testSubject0 = mock(OWLSubObjectPropertyOfAxiom.class);
        OWLSubObjectPropertyOfAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.lang.Object result1 = testSubject0.getSubProperty();
        java.lang.Object result2 = testSubject0.getSuperProperty();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        boolean result11 = testSubject0.isAnnotated();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.isOfType(_Set43);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        int result27 = testSubject0.compareTo(_Object);
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLSubPropertyAxiom.class));
    }

    public void verifyInterfaceOWLSubPropertyAxiom() {
        OWLSubPropertyAxiom<OWLPropertyExpression> testSubject0 = mock(OWLSubPropertyAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getSubProperty();
        OWLPropertyExpression result1 = testSubject0.getSuperProperty();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyChainOfAxiom() {
        assertTrue(OWLObjectPropertyAxiom.class.isAssignableFrom(OWLSubPropertyChainOfAxiom.class));
    }

    public void verifyInterfaceOWLSubPropertyChainOfAxiom() {
        OWLSubPropertyChainOfAxiom testSubject0 = mock(OWLSubPropertyChainOfAxiom.class);
        boolean result0 = testSubject0.isEncodingOfTransitiveProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getSuperProperty();
        java.util.List<OWLObjectPropertyExpression> result2 = testSubject0.getPropertyChain();
        OWLSubPropertyChainOfAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result6 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result9 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        boolean result12 = testSubject0.isAnnotated();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        boolean result14 = testSubject0.isOfType(_Set43);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        int result28 = testSubject0.compareTo(_Object);
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLSymmetricObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLSymmetricObjectPropertyAxiom() {
        OWLSymmetricObjectPropertyAxiom testSubject0 = mock(OWLSymmetricObjectPropertyAxiom.class);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result0 = testSubject0.asSubPropertyAxioms();
        OWLSymmetricObjectPropertyAxiom result1 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        boolean result10 = testSubject0.isAnnotated();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isOfType(_Set43);
        boolean result13 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result14 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        int result26 = testSubject0.compareTo(_Object);
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result28 = testSubject0.getProperty();
        java.lang.Object result29 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiom() {
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLTransitiveObjectPropertyAxiom.class));
    }

    public void verifyInterfaceOWLTransitiveObjectPropertyAxiom() {
        OWLTransitiveObjectPropertyAxiom testSubject0 = mock(OWLTransitiveObjectPropertyAxiom.class);
        OWLTransitiveObjectPropertyAxiom result0 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
        java.lang.Object result28 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesOWLUnaryPropertyAxiom() {
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLUnaryPropertyAxiom.class));
        assertTrue(HasProperty.class.isAssignableFrom(OWLUnaryPropertyAxiom.class));
    }

    public void verifyInterfaceOWLUnaryPropertyAxiom() {
        OWLUnaryPropertyAxiom<OWLPropertyExpression> testSubject0 = mock(OWLUnaryPropertyAxiom.class);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result7 = testSubject0.isLogicalAxiom();
        boolean result8 = testSubject0.isAnnotationAxiom();
        boolean result9 = testSubject0.isAnnotated();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isOfType(_Set43);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        int result25 = testSubject0.compareTo(_Object);
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        java.lang.Object result27 = testSubject0.getProperty();
    }

    @Test
    public void enforceInterfacesPrefixManager() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(PrefixManager.class));
    }

    public void verifyInterfacePrefixManager() {
        PrefixManager testSubject0 = mock(PrefixManager.class);
        testSubject0.clear();
        IRI result0 = testSubject0.getIRI(_String);
        testSubject0.setPrefix(_String, _String);
        java.util.Set<java.lang.String> result1 = testSubject0.getPrefixNames();
        testSubject0.setDefaultPrefix(_String);
        boolean result2 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result3 = testSubject0.getDefaultPrefix();
        java.util.Map<java.lang.String, java.lang.String> result4 = testSubject0.getPrefixName2PrefixMap();
        java.lang.String result5 = testSubject0.getPrefix(_String);
        java.lang.String result6 = testSubject0.getPrefixIRI(_IRI);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        testSubject0.unregisterNamespace(_String);
    }

    @Test
    public void enforceInterfacesPrimitiveType() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(PrimitiveType.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(PrimitiveType.class));
        assertTrue(HasShortForm.class.isAssignableFrom(PrimitiveType.class));
    }

    public void verifyEnumPrimitiveType() {
        PrimitiveType testSubject0 = PrimitiveType.CLASS;
        PrimitiveType testSubject1 = PrimitiveType.OBJECT_PROPERTY;
        PrimitiveType testSubject2 = PrimitiveType.DATA_PROPERTY;
        PrimitiveType testSubject3 = PrimitiveType.ANNOTATION_PROPERTY;
        PrimitiveType testSubject4 = PrimitiveType.DATATYPE;
        PrimitiveType testSubject5 = PrimitiveType.NAMED_INDIVIDUAL;
        PrimitiveType testSubject6 = PrimitiveType.LITERAL;
        PrimitiveType testSubject7 = PrimitiveType.IRI;
        java.lang.String result0 = testSubject0.getPrintName();
        java.lang.String result1 = testSubject0.getPluralPrintName();
        java.lang.String result2 = testSubject0.getShortForm();
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
        org.semanticweb.owlapi.change.RemoveAxiomData result3 = testSubject0.getChangeData();
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        OWLAxiom result5 = testSubject0.getAxiom();
        boolean result6 = testSubject0.isImportChange();
        boolean result7 = testSubject0.isAxiomChange();
        boolean result8 = testSubject0.isRemoveAxiom();
        OWLOntology result9 = testSubject0.getOntology();
        OWLOntologyChangeRecord<OWLAxiom> result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesRemoveImport() {
        assertTrue(ImportChange.class.isAssignableFrom(RemoveImport.class));
    }

    public void verifyRemoveImport() {
        RemoveImport testSubject0 = new RemoveImport(_OWLOntology, _OWLImportsDeclaration);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.RemoveImportData result3 = testSubject0.getChangeData();
        boolean result4 = testSubject0.isAddAxiom();
        OWLAxiom result5 = testSubject0.getAxiom();
        boolean result6 = testSubject0.isImportChange();
        boolean result7 = testSubject0.isAxiomChange();
        OWLImportsDeclaration result8 = testSubject0.getImportDeclaration();
        boolean result9 = testSubject0.isRemoveAxiom();
        OWLOntology result10 = testSubject0.getOntology();
        OWLOntologyChangeRecord<OWLImportsDeclaration> result11 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotation() {
        assertTrue(AnnotationChange.class.isAssignableFrom(RemoveOntologyAnnotation.class));
    }

    public void verifyRemoveOntologyAnnotation() {
        RemoveOntologyAnnotation testSubject0 = new RemoveOntologyAnnotation(_OWLOntology, _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        testSubject0.accept(_OWLOntologyChangeVisitor);
        org.semanticweb.owlapi.change.OWLOntologyChangeData<OWLAnnotation> result1 = testSubject0.getChangeData();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        boolean result4 = testSubject0.isAddAxiom();
        OWLAxiom result5 = testSubject0.getAxiom();
        boolean result6 = testSubject0.isImportChange();
        boolean result7 = testSubject0.isAxiomChange();
        boolean result8 = testSubject0.isRemoveAxiom();
        OWLOntology result9 = testSubject0.getOntology();
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord<OWLAnnotation> result10 = testSubject0.getChangeRecord();
    }

    @Test
    public void enforceInterfacesSetOntologyID() {
        assertTrue(OWLOntologyChange.class.isAssignableFrom(SetOntologyID.class));
    }

    public void verifySetOntologyID() {
        SetOntologyID testSubject0 = new SetOntologyID(_OWLOntology, _OWLOntologyID);
        SetOntologyID testSubject1 = new SetOntologyID(_OWLOntology, _IRI);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        testSubject0.accept(_OWLOntologyChangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeVisitorEx);
        OWLOntologyID result2 = testSubject0.getOriginalOntologyID();
        OWLOntologyID result3 = testSubject0.getNewOntologyID();
        boolean result4 = testSubject0.isAddAxiom();
        OWLAxiom result5 = testSubject0.getAxiom();
        boolean result6 = testSubject0.isImportChange();
        boolean result7 = testSubject0.isAxiomChange();
        org.semanticweb.owlapi.change.SetOntologyIDData result8 = testSubject0.getChangeData();
        boolean result10 = testSubject0.isRemoveAxiom();
        OWLOntology result11 = testSubject0.getOntology();
        OWLOntologyChangeRecord<OWLOntologyID> result12 = testSubject0.getChangeRecord();
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
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLAtom() {
        assertTrue(SWRLObject.class.isAssignableFrom(SWRLAtom.class));
    }

    public void verifyInterfaceSWRLAtom() {
        SWRLAtom testSubject0 = mock(SWRLAtom.class);
        SWRLPredicate result0 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result1 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result5 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result7 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result8 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result9 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result10 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result11 = testSubject0.getNestedClassExpressions();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        int result14 = testSubject0.compareTo(_Object);
        boolean result15 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLBinaryAtom() {
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLBinaryAtom.class));
    }

    public void verifyInterfaceSWRLBinaryAtom() {
        SWRLBinaryAtom<SWRLArgument, SWRLArgument> testSubject0 = mock(SWRLBinaryAtom.class);
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object);
        boolean result17 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtom() {
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLBuiltInAtom.class));
    }

    public void verifyInterfaceSWRLBuiltInAtom() {
        SWRLBuiltInAtom testSubject0 = mock(SWRLBuiltInAtom.class);
        java.util.List<SWRLDArgument> result0 = testSubject0.getArguments();
        IRI result1 = testSubject0.getPredicate();
        boolean result2 = testSubject0.isCoreBuiltIn();
        SWRLPredicate result3 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object);
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLClassAtom() {
        assertTrue(SWRLUnaryAtom.class.isAssignableFrom(SWRLClassAtom.class));
    }

    public void verifyInterfaceSWRLClassAtom() {
        SWRLClassAtom testSubject0 = mock(SWRLClassAtom.class);
        OWLClassExpression result0 = testSubject0.getPredicate();
        java.lang.Object result1 = testSubject0.getArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object);
        boolean result17 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLDArgument() {
        assertTrue(SWRLArgument.class.isAssignableFrom(SWRLDArgument.class));
    }

    public void verifyInterfaceSWRLDArgument() {
        SWRLDArgument testSubject0 = mock(SWRLDArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceSWRLDataFactory() {
        SWRLDataFactory testSubject0 = mock(SWRLDataFactory.class);
        SWRLRule result0 = testSubject0.getSWRLRule(_Set155, _Set155);
        SWRLRule result1 = testSubject0.getSWRLRule(_Set155, _Set155, _Set39);
        SWRLClassAtom result2 = testSubject0.getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        SWRLDataRangeAtom result3 = testSubject0.getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        SWRLObjectPropertyAtom result4 = testSubject0.getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        SWRLDataPropertyAtom result5 = testSubject0.getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        SWRLBuiltInAtom result6 = testSubject0.getSWRLBuiltInAtom(_IRI, _List158);
        SWRLVariable result7 = testSubject0.getSWRLVariable(_IRI);
        SWRLIndividualArgument result8 = testSubject0.getSWRLIndividualArgument(_OWLIndividual);
        SWRLLiteralArgument result9 = testSubject0.getSWRLLiteralArgument(_OWLLiteral);
        SWRLSameIndividualAtom result10 = testSubject0.getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        SWRLDifferentIndividualsAtom result11 = testSubject0.getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLDataPropertyAtom.class));
    }

    public void verifyInterfaceSWRLDataPropertyAtom() {
        SWRLDataPropertyAtom testSubject0 = mock(SWRLDataPropertyAtom.class);
        OWLDataPropertyExpression result0 = testSubject0.getPredicate();
        java.lang.Object result1 = testSubject0.getFirstArgument();
        SWRLArgument result2 = testSubject0.getSecondArgument();
        SWRLPredicate result3 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        int result17 = testSubject0.compareTo(_Object);
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtom() {
        assertTrue(SWRLUnaryAtom.class.isAssignableFrom(SWRLDataRangeAtom.class));
    }

    public void verifyInterfaceSWRLDataRangeAtom() {
        SWRLDataRangeAtom testSubject0 = mock(SWRLDataRangeAtom.class);
        OWLDataRange result0 = testSubject0.getPredicate();
        java.lang.Object result1 = testSubject0.getArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object);
        boolean result17 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLDifferentIndividualsAtom.class));
    }

    public void verifyInterfaceSWRLDifferentIndividualsAtom() {
        SWRLDifferentIndividualsAtom testSubject0 = mock(SWRLDifferentIndividualsAtom.class);
        java.lang.Object result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object);
        boolean result17 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLIArgument() {
        assertTrue(SWRLArgument.class.isAssignableFrom(SWRLIArgument.class));
    }

    public void verifyInterfaceSWRLIArgument() {
        SWRLIArgument testSubject0 = mock(SWRLIArgument.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        int result13 = testSubject0.compareTo(_Object);
        boolean result14 = testSubject0.containsEntityInSignature(_OWLEntity);
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
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        int result13 = testSubject0.compareTo(_Object);
        boolean result14 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLObject() {
        assertTrue(OWLObject.class.isAssignableFrom(SWRLObject.class));
    }

    public void verifyInterfaceSWRLObject() {
        SWRLObject testSubject0 = mock(SWRLObject.class);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        int result12 = testSubject0.compareTo(_Object);
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLObjectPropertyAtom.class));
    }

    public void verifyInterfaceSWRLObjectPropertyAtom() {
        SWRLObjectPropertyAtom testSubject0 = mock(SWRLObjectPropertyAtom.class);
        SWRLObjectPropertyAtom result0 = testSubject0.getSimplified();
        OWLObjectPropertyExpression result1 = testSubject0.getPredicate();
        java.lang.Object result2 = testSubject0.getFirstArgument();
        SWRLArgument result3 = testSubject0.getSecondArgument();
        SWRLPredicate result4 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result5 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result6 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        int result18 = testSubject0.compareTo(_Object);
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    public void verifyInterfaceSWRLObjectVisitor() {
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

    public void verifyInterfaceSWRLObjectVisitorEx() {
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
        java.util.Set<SWRLVariable> result0 = testSubject0.getVariables();
        java.util.Set<OWLClassExpression> result1 = testSubject0.getClassAtomPredicates();
        boolean result2 = testSubject0.containsAnonymousClassExpressions();
        SWRLRule result3 = testSubject0.getSimplified();
        java.util.Set<SWRLAtom> result4 = testSubject0.getBody();
        java.util.Set<SWRLAtom> result5 = testSubject0.getHead();
        SWRLRule result6 = testSubject0.getAxiomWithoutAnnotations();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result8 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result9 = testSubject0.accept(_OWLAxiomVisitorEx);
        OWLAxiom result10 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set39);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom);
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        boolean result15 = testSubject0.isAnnotated();
        AxiomType<?> result16 = testSubject0.getAxiomType();
        boolean result17 = testSubject0.isOfType(_Set43);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        int result31 = testSubject0.compareTo(_Object);
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result33 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtom() {
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLSameIndividualAtom.class));
    }

    public void verifyInterfaceSWRLSameIndividualAtom() {
        SWRLSameIndividualAtom testSubject0 = mock(SWRLSameIndividualAtom.class);
        java.lang.Object result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        SWRLPredicate result2 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result3 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        OWLObject result6 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        int result16 = testSubject0.compareTo(_Object);
        boolean result17 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLUnaryAtom() {
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLUnaryAtom.class));
    }

    public void verifyInterfaceSWRLUnaryAtom() {
        SWRLUnaryAtom<SWRLArgument> testSubject0 = mock(SWRLUnaryAtom.class);
        SWRLArgument result0 = testSubject0.getArgument();
        SWRLPredicate result1 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result2 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        int result15 = testSubject0.compareTo(_Object);
        boolean result16 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLVariable() {
        assertTrue(SWRLIArgument.class.isAssignableFrom(SWRLVariable.class));
        assertTrue(SWRLDArgument.class.isAssignableFrom(SWRLVariable.class));
        assertTrue(HasIRI.class.isAssignableFrom(SWRLVariable.class));
    }

    public void verifyInterfaceSWRLVariable() {
        SWRLVariable testSubject0 = mock(SWRLVariable.class);
        IRI result0 = testSubject0.getIRI();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        int result13 = testSubject0.compareTo(_Object);
        boolean result14 = testSubject0.containsEntityInSignature(_OWLEntity);
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
    public void enforceInterfacesUnloadableImportException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(UnloadableImportException.class));
    }

    public void verifyUnloadableImportException() {
        UnloadableImportException testSubject0 = new UnloadableImportException(_OWLOntologyCreationException, _OWLImportsDeclaration);
        OWLImportsDeclaration result0 = testSubject0.getImportsDeclaration();
        OWLOntologyCreationException result1 = testSubject0.getOntologyCreationException();
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

    private OWLObject _Object213;
    private boolean _boolean;
    private Imports _imports;
    private Search _ignore;
    private double _double;
    private float _float;
    private int _int;
    private java.io.File _File;
    private java.io.InputStream _InputStream;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.Class<? extends OWLObject> _Class71;
    private java.lang.Class<java.lang.Object> _Class;
    private OWLDataProperty _OWLPropertyExpression;
    private OWLObject _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.net.URI _URI;
    private java.net.URL _URL;
    private java.util.List<? extends OWLObjectPropertyExpression> _List147;
    private java.util.List<? extends OWLOntologyChange<?>> _List;
    private java.util.List<SWRLDArgument> _List158;
    private java.util.Set<? extends OWLAnnotation> _Set132;
    private java.util.Set<? extends OWLAxiom> _Set12;
    private java.util.Set<? extends OWLClassExpression> _Set131;
    private java.util.Set<? extends OWLDataPropertyExpression> _Set151;
    private java.util.Set<? extends OWLDataRange> _Set143;
    private java.util.Set<? extends OWLIndividual> _Set146;
    private java.util.Set<? extends OWLLiteral> _Set138;
    private java.util.Set<? extends OWLObjectPropertyExpression> _Set148;
    private java.util.Set<? extends OWLPropertyExpression> _Set152;
    private java.util.Set<? extends SWRLAtom> _Set155;
    private java.util.Set<org.semanticweb.owlapi.io.OWLParser> _Set205;
    private java.util.Set<AxiomType<?>> _Set43;
    private java.util.Set<OWLAnnotation> _Set39;
    private java.util.Set<OWLAxiom> _Set;
    private java.util.Set<OWLFacetRestriction> _Set141;
    private java.util.Set<OWLOntology> _Set199;
    private java.util.Set<OWLOntologyFactory> _Set206;
    private java.util.Set<OWLOntologyIRIMapper> _Set204;
    private java.util.Set<OWLOntologyStorer> _Set207;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private AddAxiom _AddAxiom;
    private AddImport _AddImport;
    private AddOntologyAnnotation _AddOntologyAnnotation;
    private AxiomType<?>[] _AxiomType_array;
    private AxiomType<OWLAnnotationAssertionAxiom> _AxiomType;
    private EntityType<OWLClass> _EntityType;
    private EntityType<OWLClass> _EntityType159;
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
    private OWLAnnotationSubjectVisitorEx<OWLObject> _OWLAnnotationSubjectVisitorEx56;
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
    private OWLOntologyChange<?> _OWLOntologyChange;
    private OWLOntologyChange<java.lang.Object> _OWLOntologyChange170;
    private OWLOntologyChangeBroadcastStrategy _OWLOntologyChangeBroadcastStrategy;
    private OWLOntologyChangeListener _OWLOntologyChangeListener;
    private OWLOntologyChangeProgressListener _OWLOntologyChangeProgressListener;
    private OWLOntologyChangeVetoException _OWLOntologyChangeVetoException;
    private OWLOntologyChangeVisitor _OWLOntologyChangeVisitor;
    private OWLOntologyChangeVisitorEx<OWLObject> _OWLOntologyChangeVisitorEx;
    private OWLOntologyChangesVetoedListener _OWLOntologyChangesVetoedListener;
    private OWLOntologyCreationException _OWLOntologyCreationException;
    private OWLOntologyFactory.OWLOntologyCreationHandler _OWLOntologyCreationHandler;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy _MissingOntologyHeaderStrategy;
    private OWLOntologyLoaderListener _OWLOntologyLoaderListener;
    private OWLOntologyLoaderListener.LoadingFinishedEvent _LoadingFinishedEvent;
    private OWLOntologyLoaderListener.LoadingStartedEvent _LoadingStartedEvent;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLPairwiseVisitor<Object, OWLClass> _OWLPairwiseVisitor;
    private OWLPairwiseVisitor<Object, OWLClassExpression> _OWLExpressionPairwiseVisitor;
    private OWLPairwiseVisitor<Object, OWLDataPropertyExpression> _OWLDataPairwiseVisitor;
    private OWLPairwiseVisitor<Object, OWLObjectPropertyExpression> _OWLObjectPairwiseVisitor;
    private OWLPairwiseVisitor<Object, OWLIndividual> _OWLIndividualPairwiseVisitor;
    private OWLPrimitive _OWLPrimitive;
    private OWLPropertyExpressionVisitor _OWLPropertyExpressionVisitor;
    private OWLPropertyExpressionVisitorEx<OWLObject> _OWLPropertyExpressionVisitorEx;
    private OWLPropertyExpression[] _OWLPropertyExpression_array;
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
    private org.semanticweb.owlapi.util.OWLAxiomSearchFilter _OWLAxiomSearchFilter;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
}
