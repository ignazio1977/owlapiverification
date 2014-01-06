package org.semanticweb.owlapi.verification_3_4_10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.obo2owl.OWLAPIObo2Owl;
import org.obolibrary.obo2owl.OWLAPIOwl2Obo;
import org.obolibrary.obo2owl.Obo2OWLConstants;
import org.obolibrary.obo2owl.OboInOwlCardinalityTools;
import org.obolibrary.obo2owl.OwlStringTools;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_obo2owl {
    @Test
    public void verifyObo2OWLConstants() throws Exception {
        Obo2OWLConstants testSubject0 = new Obo2OWLConstants();
        org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary result0 = Obo2OWLConstants
                .getVocabularyObj(_String);
    }

    public void verifyOboInOwlCardinalityTools() throws Exception {
        OboInOwlCardinalityTools testSubject0 = new OboInOwlCardinalityTools();
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology);
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology,
                _AnnotationCardinalityReporter, _AnnotationCardinalityConfictHandler);
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology,
                _AnnotationCardinalityReporter);
    }

    public void verifyOWLAPIObo2Owl() throws Exception {
        OWLAPIObo2Owl testSubject0 = new OWLAPIObo2Owl(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result0 = testSubject0
                .getManager();
        org.semanticweb.owlapi.model.IRI result1 = OWLAPIObo2Owl.trTagToIRI(_String);
        OWLAPIObo2Owl.convertURL(_String, _String, _String, _OWLOntologyManager);
        OWLAPIObo2Owl.convertURL(_String, _String, _OWLOntologyManager);
        testSubject0.setManager(_OWLOntologyManager);
        org.obolibrary.oboformat.model.OBODoc result2 = testSubject0.getObodoc();
        testSubject0.setObodoc(_OBODoc);
        testSubject0.trHeaderFrame(_Frame);
        org.semanticweb.owlapi.model.OWLNamedObject result3 = testSubject0
                .trTypedefFrame(_Frame);
        org.semanticweb.owlapi.model.OWLClassExpression result4 = testSubject0
                .trTermFrame(_Frame);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.oboIdToIRI(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result6 = testSubject0
                .trTermFrameClauses(_OWLClass, _Collection, _String);
        org.semanticweb.owlapi.model.OWLClassExpression result7 = testSubject0.trRel(
                _String, _String, _Collection9);
        org.semanticweb.owlapi.model.OWLOntology result8 = testSubject0.convert(_String);
        org.semanticweb.owlapi.model.OWLOntology result9 = testSubject0.convert(_OBODoc);
        org.semanticweb.owlapi.model.OWLOntology result10 = testSubject0.convert(_OBODoc,
                _OWLOntology);
    }

    public void verifyOWLAPIOwl2Obo() throws Exception {
        OWLAPIOwl2Obo testSubject0 = new OWLAPIOwl2Obo(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result0 = testSubject0
                .getManager();
        java.lang.String result1 = OWLAPIOwl2Obo.owlObjectToTag(_OWLObject);
        testSubject0.setManager(_OWLOntologyManager);
        org.obolibrary.oboformat.model.OBODoc result2 = testSubject0.getObodoc();
        testSubject0.setObodoc(_OBODoc);
        org.obolibrary.oboformat.model.OBODoc result3 = testSubject0
                .convert(_OWLOntology);
        testSubject0.setStrictConversion(_boolean);
        boolean result4 = testSubject0.getStrictConversion();
        boolean result5 = testSubject0.isDiscardUntranslatable();
        testSubject0.setDiscardUntranslatable(_boolean);
        java.lang.String result6 = OWLAPIOwl2Obo.getOntologyId(_OWLOntology);
        java.lang.String result7 = OWLAPIOwl2Obo.getOntologyId(_IRI);
        java.util.Collection<org.semanticweb.owlapi.model.OWLAxiom> result8 = testSubject0
                .getUntranslatableAxioms();
        java.lang.String result9 = OWLAPIOwl2Obo.getDataVersion(_OWLOntology);
        java.lang.String result10 = OWLAPIOwl2Obo.getIdentifierFromObject(_OWLObject,
                _OWLOntology, _String);
        java.lang.String result11 = OWLAPIOwl2Obo.getIdentifierFromObject(_OWLObject,
                _OWLOntology);
        java.util.List<org.obolibrary.oboformat.model.Clause> result12 = OWLAPIOwl2Obo
                .normalizeRelationshipClauses(_List);
        java.lang.String result13 = testSubject0.getIdentifier(_OWLObject);
        java.lang.String result14 = OWLAPIOwl2Obo.getIdentifier(_IRI);
        java.lang.String result15 = OWLAPIOwl2Obo.getIdentifier(_IRI, _OWLOntology);
    }

    public void verifyOwlStringTools() throws Exception {
        OwlStringTools testSubject0 = new OwlStringTools();
        java.lang.String result0 = OwlStringTools.translate(_Set, _OWLOntologyManager);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result1 = OwlStringTools
                .translate(_String, _OWLOntologyManager);
    }

    private boolean _boolean;
    private java.lang.String _String = "";
    private java.util.Collection<org.obolibrary.oboformat.model.Clause> _Collection;
    private java.util.Collection<org.obolibrary.oboformat.model.QualifierValue> _Collection9;
    private java.util.List<org.obolibrary.oboformat.model.Clause> _List;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> _Set;
    private org.obolibrary.obo2owl.OboInOwlCardinalityTools.AnnotationCardinalityConfictHandler _AnnotationCardinalityConfictHandler;
    private org.obolibrary.obo2owl.OboInOwlCardinalityTools.AnnotationCardinalityReporter _AnnotationCardinalityReporter;
    private org.obolibrary.oboformat.model.Frame _Frame;
    private org.obolibrary.oboformat.model.OBODoc _OBODoc;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
