package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unchecked", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_change {
    @Test
    public void enforceInterfacesAbstractCompositeOntologyChange() {
        assertTrue(org.semanticweb.owlapi.change.OWLCompositeOntologyChange.class.isAssignableFrom(AbstractCompositeOntologyChange.class));
    }

    public void verifyAbstractCompositeOntologyChange() {
        AbstractCompositeOntologyChange testSubject0 = mock(AbstractCompositeOntologyChange.class);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesAddAxiomData() {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class.isAssignableFrom(AddAxiomData.class));
    }

    public void verifyAddAxiomData() throws Exception {
        AddAxiomData testSubject0 = new AddAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddAxiom result1 = testSubject0.createOntologyChange(_OWLOntology);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.lang.Object result5 = testSubject0.getItem();
        OWLAxiom result6 = testSubject0.getItem();
    }

    @Test
    public void enforceInterfacesAddClassExpressionClosureAxiom() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(AddClassExpressionClosureAxiom.class));
    }

    public void verifyAddClassExpressionClosureAxiom() {
        AddClassExpressionClosureAxiom testSubject0 = new AddClassExpressionClosureAxiom(_OWLDataFactory, _OWLClass, _OWLObjectPropertyExpression, _Set, _OWLOntology);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesAddImportData() {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class.isAssignableFrom(AddImportData.class));
    }

    public void verifyAddImportData() throws Exception {
        AddImportData testSubject0 = new AddImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddImport result1 = testSubject0.createOntologyChange(_OWLOntology);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        java.lang.Object result4 = testSubject0.getItem();
        OWLImportsDeclaration result5 = testSubject0.getItem();
        OWLImportsDeclaration result6 = testSubject0.getDeclaration();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotationData() {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class.isAssignableFrom(AddOntologyAnnotationData.class));
    }

    public void verifyAddOntologyAnnotationData() throws Exception {
        AddOntologyAnnotationData testSubject0 = new AddOntologyAnnotationData(_OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddOntologyAnnotation result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLAnnotation result3 = testSubject0.getAnnotation();
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        java.lang.Object result5 = testSubject0.getItem();
        OWLAnnotation result6 = testSubject0.getItem();
    }

    @Test
    public void enforceInterfacesAmalgamateSubClassAxioms() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(AmalgamateSubClassAxioms.class));
    }

    public void verifyAmalgamateSubClassAxioms() {
        AmalgamateSubClassAxioms testSubject0 = new AmalgamateSubClassAxioms(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesAxiomChangeData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(AxiomChangeData.class));
    }

    public void verifyAxiomChangeData() throws Exception {
        AxiomChangeData testSubject0 = mock(AxiomChangeData.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLAxiom result1 = testSubject0.getAxiom();
        java.lang.Object result2 = testSubject0.getItem();
        OWLAxiom result3 = testSubject0.getItem();
        java.lang.Object result4 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        OWLOntologyChange<OWLAxiom> result5 = testSubject0.createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesCoerceConstantsIntoDataPropertyRange() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(CoerceConstantsIntoDataPropertyRange.class));
    }

    public void verifyCoerceConstantsIntoDataPropertyRange() {
        CoerceConstantsIntoDataPropertyRange testSubject0 = new CoerceConstantsIntoDataPropertyRange(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesConvertEquivalentClassesToSuperClasses() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(ConvertEquivalentClassesToSuperClasses.class));
    }

    public void verifyConvertEquivalentClassesToSuperClasses() {
        ConvertEquivalentClassesToSuperClasses testSubject0 = new ConvertEquivalentClassesToSuperClasses(_OWLDataFactory, _OWLClass, _Set, _OWLOntology, _boolean);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesConvertPropertyAssertionsToAnnotations() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(ConvertPropertyAssertionsToAnnotations.class));
    }

    public void verifyConvertPropertyAssertionsToAnnotations() {
        ConvertPropertyAssertionsToAnnotations testSubject0 = new ConvertPropertyAssertionsToAnnotations(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesConvertSuperClassesToEquivalentClass() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(ConvertSuperClassesToEquivalentClass.class));
    }

    public void verifyConvertSuperClassesToEquivalentClass() {
        ConvertSuperClassesToEquivalentClass testSubject0 = new ConvertSuperClassesToEquivalentClass(_OWLDataFactory, _OWLClass, _Set, _OWLOntology);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesCreateValuePartition() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(CreateValuePartition.class));
    }

    public void verifyCreateValuePartition() {
        CreateValuePartition testSubject0 = new CreateValuePartition(_OWLDataFactory, _OWLClass, _Set11, _OWLObjectProperty, _OWLOntology);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesImportChangeData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(ImportChangeData.class));
    }

    public void verifyImportChangeData() throws Exception {
        ImportChangeData testSubject0 = mock(ImportChangeData.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        java.lang.Object result1 = testSubject0.getItem();
        OWLImportsDeclaration result2 = testSubject0.getItem();
        OWLImportsDeclaration result3 = testSubject0.getDeclaration();
        java.lang.Object result4 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        OWLOntologyChange<OWLImportsDeclaration> result5 = testSubject0.createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesMakeClassesMutuallyDisjoint() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(MakeClassesMutuallyDisjoint.class));
    }

    public void verifyMakeClassesMutuallyDisjoint() {
        MakeClassesMutuallyDisjoint testSubject0 = new MakeClassesMutuallyDisjoint(_OWLDataFactory, _Set13, _boolean, _OWLOntology);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesMakePrimitiveSubClassesMutuallyDisjoint() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(MakePrimitiveSubClassesMutuallyDisjoint.class));
    }

    public void verifyMakePrimitiveSubClassesMutuallyDisjoint() {
        MakePrimitiveSubClassesMutuallyDisjoint testSubject0 = new MakePrimitiveSubClassesMutuallyDisjoint(_OWLDataFactory, _OWLClass, _OWLOntology);
        MakePrimitiveSubClassesMutuallyDisjoint testSubject1 = new MakePrimitiveSubClassesMutuallyDisjoint(_OWLDataFactory, _OWLClass, _OWLOntology, _boolean);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesOntologyAnnotationChangeData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(OntologyAnnotationChangeData.class));
    }

    public void verifyOntologyAnnotationChangeData() throws Exception {
        OntologyAnnotationChangeData testSubject0 = mock(OntologyAnnotationChangeData.class);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        java.util.Set<OWLEntity> result1 = testSubject0.getSignature();
        java.lang.Object result2 = testSubject0.getItem();
        OWLAnnotation result3 = testSubject0.getItem();
        java.lang.Object result4 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        OWLOntologyChange<OWLAnnotation> result5 = testSubject0.createOntologyChange(_OWLOntology);
    }

    public void verifyInterfaceOWLCompositeOntologyChange() {
        OWLCompositeOntologyChange testSubject0 = mock(OWLCompositeOntologyChange.class);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeData() {
        assertTrue(HasSignature.class.isAssignableFrom(OWLOntologyChangeData.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyChangeData.class));
    }

    public void verifyOWLOntologyChangeData() throws Exception {
        OWLOntologyChangeData<OWLObject> testSubject0 = mock(OWLOntologyChangeData.class);
        java.lang.Object result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        OWLOntologyChange<OWLObject> result1 = testSubject0.createOntologyChange(_OWLOntology);
        java.lang.Object result2 = testSubject0.getItem();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
    }

    public void verifyInterfaceOWLOntologyChangeDataVisitor() throws Exception {
        OWLOntologyChangeDataVisitor<Object, Exception> testSubject0 = mock(OWLOntologyChangeDataVisitor.class);
        java.lang.Object result0 = testSubject0.visit(_RemoveOntologyAnnotationData);
        java.lang.Object result1 = testSubject0.visit(_SetOntologyIDData);
        java.lang.Object result2 = testSubject0.visit(_AddImportData);
        java.lang.Object result3 = testSubject0.visit(_RemoveImportData);
        java.lang.Object result4 = testSubject0.visit(_AddOntologyAnnotationData);
        java.lang.Object result5 = testSubject0.visit(_RemoveAxiomData);
        java.lang.Object result6 = testSubject0.visit(_AddAxiomData);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeRecord() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyChangeRecord.class));
    }

    public void verifyOWLOntologyChangeRecord() {
        OWLOntologyChangeRecord<OWLObject> testSubject0 = new OWLOntologyChangeRecord<OWLObject>(_OWLOntologyID, _OWLOntologyChangeData);
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyID result1 = testSubject0.getOntologyID();
        OWLOntologyChange<OWLObject> result2 = testSubject0.createOntologyChange(_OWLOntologyManager);
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord<java.lang.Object> result3 = OWLOntologyChangeRecord.createFromOWLOntologyChange(_OWLOntologyChange);
        OWLOntologyChangeData<OWLObject> result4 = testSubject0.getData();
    }

    @Test
    public void enforceInterfacesRemoveAllDisjointAxioms() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(RemoveAllDisjointAxioms.class));
    }

    public void verifyRemoveAllDisjointAxioms() {
        RemoveAllDisjointAxioms testSubject0 = new RemoveAllDisjointAxioms(_OWLDataFactory, _Set);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesRemoveAxiomData() {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class.isAssignableFrom(RemoveAxiomData.class));
    }

    public void verifyRemoveAxiomData() throws Exception {
        RemoveAxiomData testSubject0 = new RemoveAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveAxiom result1 = testSubject0.createOntologyChange(_OWLOntology);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        OWLAxiom result4 = testSubject0.getAxiom();
        java.lang.Object result5 = testSubject0.getItem();
        OWLAxiom result6 = testSubject0.getItem();
    }

    @Test
    public void enforceInterfacesRemoveImportData() {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class.isAssignableFrom(RemoveImportData.class));
    }

    public void verifyRemoveImportData() throws Exception {
        RemoveImportData testSubject0 = new RemoveImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveImport result1 = testSubject0.createOntologyChange(_OWLOntology);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        java.lang.Object result4 = testSubject0.getItem();
        OWLImportsDeclaration result5 = testSubject0.getItem();
        OWLImportsDeclaration result6 = testSubject0.getDeclaration();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotationData() {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class.isAssignableFrom(RemoveOntologyAnnotationData.class));
    }

    public void verifyRemoveOntologyAnnotationData() throws Exception {
        RemoveOntologyAnnotationData testSubject0 = new RemoveOntologyAnnotationData(_OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveOntologyAnnotation result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLAnnotation result3 = testSubject0.getAnnotation();
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        java.lang.Object result5 = testSubject0.getItem();
        OWLAnnotation result6 = testSubject0.getItem();
    }

    @Test
    public void enforceInterfacesSetOntologyIDData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(SetOntologyIDData.class));
    }

    public void verifySetOntologyIDData() throws Exception {
        SetOntologyIDData testSubject0 = new SetOntologyIDData(_OWLOntologyID);
        java.util.Set<OWLEntity> result0 = testSubject0.getSignature();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        SetOntologyID result3 = testSubject0.createOntologyChange(_OWLOntology);
        java.lang.Object result4 = testSubject0.getItem();
        OWLOntologyID result5 = testSubject0.getItem();
        OWLOntologyID result6 = testSubject0.getNewId();
    }

    @Test
    public void enforceInterfacesShortForm2AnnotationGenerator() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(ShortForm2AnnotationGenerator.class));
    }

    public void verifyShortForm2AnnotationGenerator() {
        ShortForm2AnnotationGenerator testSubject0 = new ShortForm2AnnotationGenerator(_OWLDataFactory, _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI, _String);
        ShortForm2AnnotationGenerator testSubject1 = new ShortForm2AnnotationGenerator(_OWLDataFactory, _OWLOntologyManager, _OWLOntology, _ShortFormProvider, _IRI);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    @Test
    public void enforceInterfacesSplitSubClassAxioms() {
        assertTrue(org.semanticweb.owlapi.change.AbstractCompositeOntologyChange.class.isAssignableFrom(SplitSubClassAxioms.class));
    }

    public void verifySplitSubClassAxioms() {
        SplitSubClassAxioms testSubject0 = new SplitSubClassAxioms(_Set, _OWLDataFactory);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    private boolean _boolean;
    private java.lang.String _String;
    private java.util.Set<? extends OWLClassExpression> _Set13;
    private java.util.Set<OWLClass> _Set11;
    private java.util.Set<OWLOntology> _Set;
    private org.semanticweb.owlapi.change.AddAxiomData _AddAxiomData;
    private org.semanticweb.owlapi.change.AddImportData _AddImportData;
    private org.semanticweb.owlapi.change.AddOntologyAnnotationData _AddOntologyAnnotationData;
    private org.semanticweb.owlapi.change.OWLOntologyChangeData<OWLObject> _OWLOntologyChangeData;
    private org.semanticweb.owlapi.change.OWLOntologyChangeDataVisitor<OWLObject, Exception> _OWLOntologyChangeDataVisitor;
    private org.semanticweb.owlapi.change.RemoveAxiomData _RemoveAxiomData;
    private org.semanticweb.owlapi.change.RemoveImportData _RemoveImportData;
    private org.semanticweb.owlapi.change.RemoveOntologyAnnotationData _RemoveOntologyAnnotationData;
    private org.semanticweb.owlapi.change.SetOntologyIDData _SetOntologyIDData;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLDataFactory _OWLDataFactory;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLOntology _OWLOntology;
    private OWLOntologyChange<java.lang.Object> _OWLOntologyChange;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
