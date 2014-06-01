package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

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
import OWLEntity;
import OWLImportsDeclaration;
import OWLObject;
import OWLOntology;
import OWLOntologyChange;

@SuppressWarnings({ "javadoc", "serial", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_change {

    @Test
    public void enforceInterfacesAddAxiomData()  {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class
                .isAssignableFrom(AddAxiomData.class));
    }

    public void verifyAddAxiomData()  {
        AddAxiomData testSubject0 = new AddAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddAxiom result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesAddImportData()  {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class
                .isAssignableFrom(AddImportData.class));
    }

    public void verifyAddImportData()  {
        AddImportData testSubject0 = new AddImportData(_OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddImport result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLImportsDeclaration result3 = testSubject0
                .getDeclaration();
    }

    @Test
    public void enforceInterfacesAddOntologyAnnotationData()  {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class
                .isAssignableFrom(AddOntologyAnnotationData.class));
    }

    public void verifyAddOntologyAnnotationData()  {
        AddOntologyAnnotationData testSubject0 = new AddOntologyAnnotationData(
                _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        AddOntologyAnnotation result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLAnnotation result3 = testSubject0
                .getAnnotation();
    }

    @Test
    public void enforceInterfacesAxiomChangeData()  {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(AxiomChangeData.class));
    }

    public void verifyAxiomChangeData()  {
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
        OWLAxiom result0 = testSubject0.getAxiom();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesImportChangeData()  {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(ImportChangeData.class));
    }

    public void verifyImportChangeData()  {
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
        OWLImportsDeclaration result0 = testSubject0
                .getDeclaration();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOntologyAnnotationChangeData()
             {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(OntologyAnnotationChangeData.class));
    }

    public void verifyOntologyAnnotationChangeData()  {
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
        OWLAnnotation result0 = testSubject0
                .getAnnotation();
        OWLObject result1 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeData()  {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyChangeData.class));
    }

    public void verifyOWLOntologyChangeData()  {
        OWLOntologyChangeData testSubject0 = new OWLOntologyChangeData() {

            @Override
            public <R, E extends Exception> R accept(
                    OWLOntologyChangeDataVisitor<R, E> visitor) throws E {
                return null;
            }

            @Override
            public OWLOntologyChange createOntologyChange(OWLOntology ontology) {
                return null;
            }

            @Override
            public Set<OWLEntity> getSignature() {
                return null;
            }
        };
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor5);
        OWLOntologyChange result1 = testSubject0
                .createOntologyChange(_OWLOntology);
    }

    public void verifyInterfaceOWLOntologyChangeDataVisitor()  {
        OWLOntologyChangeDataVisitor<OWLObject, Exception> testSubject0 = mock(OWLOntologyChangeDataVisitor.class);
        OWLObject result0 = testSubject0.visit(_RemoveOntologyAnnotationData);
        OWLObject result1 = testSubject0.visit(_SetOntologyIDData);
        OWLObject result2 = testSubject0.visit(_AddImportData);
        OWLObject result3 = testSubject0.visit(_RemoveImportData);
        OWLObject result4 = testSubject0.visit(_AddOntologyAnnotationData);
        OWLObject result5 = testSubject0.visit(_RemoveAxiomData);
        OWLObject result6 = testSubject0.visit(_AddAxiomData);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeRecord()  {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLOntologyChangeRecord.class));
    }

    public void verifyOWLOntologyChangeRecord()  {
        OWLOntologyChangeRecord testSubject0 = new OWLOntologyChangeRecord(
                _OWLOntologyID, _OWLOntologyChangeData);
        OWLOntologyID result0 = testSubject0
                .getOntologyID();
        OWLOntologyChange result1 = testSubject0
                .createOntologyChange(_OWLOntologyManager);
        org.semanticweb.owlapi.change.OWLOntologyChangeRecord result2 = OWLOntologyChangeRecord
                .createFromOWLOntologyChange(_OWLOntologyChange);
        org.semanticweb.owlapi.change.OWLOntologyChangeData result3 = testSubject0
                .getData();
    }

    @Test
    public void enforceInterfacesRemoveAxiomData()  {
        assertTrue(org.semanticweb.owlapi.change.AxiomChangeData.class
                .isAssignableFrom(RemoveAxiomData.class));
    }

    public void verifyRemoveAxiomData()  {
        RemoveAxiomData testSubject0 = new RemoveAxiomData(_OWLAxiom);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveAxiom result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLAxiom result3 = testSubject0.getAxiom();
    }

    @Test
    public void enforceInterfacesRemoveImportData()  {
        assertTrue(org.semanticweb.owlapi.change.ImportChangeData.class
                .isAssignableFrom(RemoveImportData.class));
    }

    public void verifyRemoveImportData()  {
        RemoveImportData testSubject0 = new RemoveImportData(
                _OWLImportsDeclaration);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveImport result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLImportsDeclaration result3 = testSubject0
                .getDeclaration();
    }

    @Test
    public void enforceInterfacesRemoveOntologyAnnotationData()
             {
        assertTrue(org.semanticweb.owlapi.change.OntologyAnnotationChangeData.class
                .isAssignableFrom(RemoveOntologyAnnotationData.class));
    }

    public void verifyRemoveOntologyAnnotationData()  {
        RemoveOntologyAnnotationData testSubject0 = new RemoveOntologyAnnotationData(
                _OWLAnnotation);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        RemoveOntologyAnnotation result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyChange result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLAnnotation result3 = testSubject0
                .getAnnotation();
    }

    @Test
    public void enforceInterfacesSetOntologyIDData()  {
        assertTrue(org.semanticweb.owlapi.change.OWLOntologyChangeData.class
                .isAssignableFrom(SetOntologyIDData.class));
    }

    public void verifySetOntologyIDData()  {
        SetOntologyIDData testSubject0 = new SetOntologyIDData(_OWLOntologyID);
        OWLObject result0 = testSubject0.accept(_OWLOntologyChangeDataVisitor);
        OWLOntologyChange result1 = testSubject0
                .createOntologyChange(_OWLOntology);
        SetOntologyID result2 = testSubject0
                .createOntologyChange(_OWLOntology);
        OWLOntologyID result3 = testSubject0
                .getNewId();
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
    private OWLAnnotation _OWLAnnotation;
    private OWLAxiom _OWLAxiom;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLOntology _OWLOntology;
    private OWLOntologyChange _OWLOntologyChange;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyManager _OWLOntologyManager;
}
