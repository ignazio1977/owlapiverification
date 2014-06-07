package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.change.AddAxiomData;
import org.semanticweb.owlapi.change.AddImportData;
import org.semanticweb.owlapi.change.AddOntologyAnnotationData;
import org.semanticweb.owlapi.change.AxiomChangeData;
import org.semanticweb.owlapi.change.ImportChangeData;
import org.semanticweb.owlapi.change.OWLOntologyChangeData;
import org.semanticweb.owlapi.change.OWLOntologyChangeDataVisitor;
import org.semanticweb.owlapi.change.OWLOntologyChangeRecord;
import org.semanticweb.owlapi.change.OntologyAnnotationChangeData;
import org.semanticweb.owlapi.change.RemoveAxiomData;
import org.semanticweb.owlapi.change.RemoveImportData;
import org.semanticweb.owlapi.change.RemoveOntologyAnnotationData;
import org.semanticweb.owlapi.change.SetOntologyIDData;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;

@SuppressWarnings({ "javadoc", "unused", "serial", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_change {
    @Test
    public void enforceInterfacesAddAxiomData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class
                .isAssignableFrom(AddAxiomData.class));
    }

    public void verifyAddAxiomData() throws Exception {
        AddAxiomData testSubject0 = new AddAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.AddAxiom result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesAddImportData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class
                .isAssignableFrom(AddImportData.class));
    }

    public void verifyAddImportData() throws Exception {
        AddImportData testSubject0 = new AddImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.AddImport result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLImportsDeclaration result3 = testSubject0
                .getDeclaration();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotationData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class
                .isAssignableFrom(AddOntologyAnnotationData.class));
    }

    public void verifyAddOntologyAnnotationData() throws Exception {
        AddOntologyAnnotationData testSubject0 = new AddOntologyAnnotationData(
                _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.AddOntologyAnnotation result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLAnnotation result3 = testSubject0.getAnnotation();
    }

    @Test
    public void enforceInterfacesAxiomChangeData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(AxiomChangeData.class));
    }

    public void verifyAxiomChangeData() throws Exception {
        AxiomChangeData testSubject0 = new AxiomChangeData(_OWLAxiom) {
            @Override
            public <R, E extends Exception> R accept(
                    OWLOntologyChangeDataVisitor<R, E> visitor) throws E {
                return null;
            }

            @Override
            public OWLOntologyChange createOntologyChange(OWLOntology ontology) {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLAxiom result0 = testSubject0.getAxiom();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesImportChangeData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(ImportChangeData.class));
    }

    public void verifyImportChangeData() throws Exception {
        ImportChangeData testSubject0 = new ImportChangeData(
                mock(OWLImportsDeclaration.class)) {
            @Override
            public <R, E extends Exception> R accept(
                    OWLOntologyChangeDataVisitor<R, E> visitor) throws E {
                return null;
            }

            @Override
            public OWLOntologyChange createOntologyChange(OWLOntology ontology) {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLImportsDeclaration result0 = testSubject0
                .getDeclaration();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOntologyAnnotationChangeData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(OntologyAnnotationChangeData.class));
    }

    public void verifyOntologyAnnotationChangeData() throws Exception {
        OntologyAnnotationChangeData testSubject0 = new OntologyAnnotationChangeData(
                _OWLAnnotation) {
            @Override
            public <R, E extends Exception> R accept(
                    OWLOntologyChangeDataVisitor<R, E> visitor) throws E {
                return null;
            }

            @Override
            public OWLOntologyChange createOntologyChange(OWLOntology ontology) {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLAnnotation result0 = testSubject0.getAnnotation();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeData() throws Exception {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyChangeData.class));
    }

    public void verifyOWLOntologyChangeData() throws Exception {
        OWLOntologyChangeData testSubject0 = mock( OWLOntologyChangeData.class);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        org.semanticweb.owlapi.model.OWLOntologyChange result1 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    public void verifyInterfaceOWLOntologyChangeDataVisitor() throws Exception {
        OWLOntologyChangeDataVisitor<OWLObject, Exception> testSubject0 = mock(OWLOntologyChangeDataVisitor.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeRecord() throws Exception {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyChangeRecord.class));
    }

    public void verifyOWLOntologyChangeRecord() throws Exception {
        OWLOntologyChangeRecord testSubject0 = new OWLOntologyChangeRecord(
                _OWLOntologyID, _OWLOntologyChangeData);
        org.semanticweb.owlapi.model.OWLOntologyID result0 = testSubject0.getOntologyID();
        org.semanticweb.owlapi.model.OWLOntologyChange result1 = testSubject0
                .createOntologyChange(_OWLOntologyManager);
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result2 = OWLOntologyChangeRecord
                .createFromOWLOntologyChange(_OWLOntologyChange);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result3 = testSubject0
                .getData();
    }

    @Test
    public void enforceInterfacesRemoveAxiomData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class
                .isAssignableFrom(RemoveAxiomData.class));
    }

    public void verifyRemoveAxiomData() throws Exception {
        RemoveAxiomData testSubject0 = new RemoveAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.RemoveAxiom result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesRemoveImportData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class
                .isAssignableFrom(RemoveImportData.class));
    }

    public void verifyRemoveImportData() throws Exception {
        RemoveImportData testSubject0 = new RemoveImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.RemoveImport result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLImportsDeclaration result3 = testSubject0
                .getDeclaration();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotationData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class
                .isAssignableFrom(RemoveOntologyAnnotationData.class));
    }

    public void verifyRemoveOntologyAnnotationData() throws Exception {
        RemoveOntologyAnnotationData testSubject0 = new RemoveOntologyAnnotationData(
                _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.RemoveOntologyAnnotation result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLAnnotation result3 = testSubject0.getAnnotation();
    }

    @Test
    public void enforceInterfacesSetOntologyIDData() throws Exception {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(SetOntologyIDData.class));
    }

    public void verifySetOntologyIDData() throws Exception {
        SetOntologyIDData testSubject0 = new SetOntologyIDData(_OWLOntologyID);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        org.semanticweb.owlapi.model.OWLOntologyChange result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.SetOntologyID result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyID result3 = testSubject0.getNewId();
    }

    private org.semanticweb.owlapi.change.AddAxiomData _AddAxiomData;
    private org.semanticweb.owlapi.change.AddImportData _AddImportData;
    private org.semanticweb.owlapi.change.AddOntologyAnnotationData _AddOntologyAnnotationData;
    private org.semanticweb.owlapi.change.OWLOntologyChangeData _OWLOntologyChangeData;
    private org.semanticweb.owlapi.change.OWLOntologyChangeDataVisitor<OWLObject, Exception> _OWLOntologyChangeDataVisitor;
    private org.semanticweb.owlapi.change.OWLOntologyChangeDataVisitor<OWLObject, Exception> _OWLOntologyChangeDataVisitor5;
    private org.semanticweb.owlapi.change.RemoveAxiomData _RemoveAxiomData;
    private org.semanticweb.owlapi.change.RemoveImportData _RemoveImportData;
    private org.semanticweb.owlapi.change.RemoveOntologyAnnotationData _RemoveOntologyAnnotationData;
    private org.semanticweb.owlapi.change.SetOntologyIDData _SetOntologyIDData;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLImportsDeclaration _OWLImportsDeclaration;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyChange _OWLOntologyChange;
    private org.semanticweb.owlapi.model.OWLOntologyID _OWLOntologyID;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
