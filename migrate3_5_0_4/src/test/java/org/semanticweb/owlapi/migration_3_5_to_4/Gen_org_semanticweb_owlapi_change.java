package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unchecked", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "generics: OWLOntologyChangeData is now generic" })
public class Gen_org_semanticweb_owlapi_change {
    @Test
    public void enforceInterfacesAddAxiomData() {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class.isAssignableFrom(AddAxiomData.class));
    }

    public void verifyAddAxiomData() throws Exception {
        AddAxiomData testSubject0 = new AddAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddAxiom result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyChange<?> result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesAddImportData() {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class.isAssignableFrom(AddImportData.class));
    }

    public void verifyAddImportData() throws Exception {
        AddImportData testSubject0 = new AddImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddImport result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyChange<?> result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLImportsDeclaration result3 = testSubject0.getDeclaration();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotationData() {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class.isAssignableFrom(AddOntologyAnnotationData.class));
    }

    public void verifyAddOntologyAnnotationData() throws Exception {
        AddOntologyAnnotationData testSubject0 = new AddOntologyAnnotationData(_OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddOntologyAnnotation result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyChange<?> result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLAnnotation result3 = testSubject0.getAnnotation();
    }

    @Test
    public void enforceInterfacesAxiomChangeData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(AxiomChangeData.class));
    }

    @Test
    public void enforceInterfacesImportChangeData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(ImportChangeData.class));
    }

    @Test
    public void enforceInterfacesOntologyAnnotationChangeData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(OntologyAnnotationChangeData.class));
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeData() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyChangeData.class));
    }

    public void verifyInterfaceOWLOntologyChangeDataVisitor() throws Exception {
        OWLOntologyChangeDataVisitor<OWLObject, Exception> testSubject0 = mock(OWLOntologyChangeDataVisitor.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeRecord() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyChangeRecord.class));
    }

    public void verifyOWLOntologyChangeRecord() {
        OWLOntologyChangeRecord<Object> testSubject0 = new OWLOntologyChangeRecord<Object>(_OWLOntologyID, _OWLOntologyChangeData);
        OWLOntologyID result0 = testSubject0.getOntologyID();
        OWLOntologyChange<?> result1 = testSubject0.createOntologyChange(_OWLOntologyManager);
        OWLOntologyChangeRecord<?> result2 = OWLOntologyChangeRecord.createFromOWLOntologyChange(_OWLOntologyChange);
        OWLOntologyChangeData<?> result3 = testSubject0.getData();
    }

    @Test
    public void enforceInterfacesRemoveAxiomData() {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class.isAssignableFrom(RemoveAxiomData.class));
    }

    public void verifyRemoveAxiomData() throws Exception {
        RemoveAxiomData testSubject0 = new RemoveAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveAxiom result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyChange<?> result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesRemoveImportData() {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class.isAssignableFrom(RemoveImportData.class));
    }

    public void verifyRemoveImportData() throws Exception {
        RemoveImportData testSubject0 = new RemoveImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveImport result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyChange<?> result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLImportsDeclaration result3 = testSubject0.getDeclaration();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotationData() {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class.isAssignableFrom(RemoveOntologyAnnotationData.class));
    }

    public void verifyRemoveOntologyAnnotationData() throws Exception {
        RemoveOntologyAnnotationData testSubject0 = new RemoveOntologyAnnotationData(_OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveOntologyAnnotation result1 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyChange<?> result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLAnnotation result3 = testSubject0.getAnnotation();
    }

    @Test
    public void enforceInterfacesSetOntologyIDData() {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class.isAssignableFrom(SetOntologyIDData.class));
    }

    public void verifySetOntologyIDData() throws Exception {
        SetOntologyIDData testSubject0 = new SetOntologyIDData(_OWLOntologyID);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        OWLOntologyChange<?> result1 = testSubject0.createOntologyChange(_OWLOntology);
        SetOntologyID result2 = testSubject0.createOntologyChange(_OWLOntology);
        OWLOntologyID result3 = testSubject0.getNewId();
    }

    private org.semanticweb.owlapi.change.AddAxiomData _AddAxiomData;
    private org.semanticweb.owlapi.change.AddImportData _AddImportData;
    private org.semanticweb.owlapi.change.AddOntologyAnnotationData _AddOntologyAnnotationData;
    private org.semanticweb.owlapi.change.OWLOntologyChangeData<Object> _OWLOntologyChangeData;
    private org.semanticweb.owlapi.change.OWLOntologyChangeDataVisitor<OWLObject, Exception> _OWLOntologyChangeDataVisitor;
    private org.semanticweb.owlapi.change.RemoveAxiomData _RemoveAxiomData;
    private org.semanticweb.owlapi.change.RemoveImportData _RemoveImportData;
    private org.semanticweb.owlapi.change.RemoveOntologyAnnotationData _RemoveOntologyAnnotationData;
    private org.semanticweb.owlapi.change.SetOntologyIDData _SetOntologyIDData;
    private OWLAnnotation _OWLAnnotation;
    private OWLAxiom _OWLAxiom;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLOntology _OWLOntology;
    private OWLOntologyChange<?> _OWLOntologyChange;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyManager _OWLOntologyManager;
}
