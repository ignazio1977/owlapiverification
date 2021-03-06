package org.semanticweb.owlapi.verification_3_5;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.obo2owl.*;
import org.obolibrary.obo2owl.OWLAPIOwl2Obo.UntranslatableAxiomException;
import org.obolibrary.obo2owl.OboInOwlCardinalityTools.AnnotationCardinalityException;
import org.obolibrary.obo2owl.OwlStringTools.OwlStringException;
import org.obolibrary.oboformat.parser.OBOFormatParserException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_obo2owl {
    @Test
    public void verifyObo2OWLConstants() {
        Obo2OWLConstants testSubject0 = new Obo2OWLConstants();
        org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary result0 = Obo2OWLConstants.getVocabularyObj(_String);
    }

    public void verifyOboInOwlCardinalityTools() throws AnnotationCardinalityException {
        OboInOwlCardinalityTools testSubject0 = new OboInOwlCardinalityTools();
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology);
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology, _AnnotationCardinalityReporter, _AnnotationCardinalityConfictHandler);
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology, _AnnotationCardinalityReporter);
    }

    public void verifyOWLAPIObo2Owl() throws OBOFormatParserException, OWLOntologyCreationException, OWLOntologyStorageException, IOException {
        OWLAPIObo2Owl testSubject0 = new OWLAPIObo2Owl(_OWLOntologyManager);
        OWLOntologyManager result0 = testSubject0.getManager();
        IRI result1 = OWLAPIObo2Owl.trTagToIRI(_String);
        OWLAPIObo2Owl.convertURL(_String, _String, _String, _OWLOntologyManager);
        OWLAPIObo2Owl.convertURL(_String, _String, _OWLOntologyManager);
        testSubject0.setManager(_OWLOntologyManager);
        org.obolibrary.oboformat.model.OBODoc result2 = testSubject0.getObodoc();
        testSubject0.setObodoc(_OBODoc);
        testSubject0.trHeaderFrame(_Frame);
        OWLNamedObject result3 = testSubject0.trTypedefFrame(_Frame);
        OWLClassExpression result4 = testSubject0.trTermFrame(_Frame);
        IRI result5 = testSubject0.oboIdToIRI(_String);
        java.util.Set<OWLAxiom> result6 = testSubject0.trTermFrameClauses(_OWLClass, _Collection, _String);
        OWLClassExpression result7 = testSubject0.trRel(_String, _String, _Collection9);
        OWLOntology result8 = testSubject0.convert(_String);
        OWLOntology result9 = testSubject0.convert(_OBODoc);
        OWLOntology result10 = testSubject0.convert(_OBODoc, _OWLOntology);
    }

    public void verifyOWLAPIOwl2Obo() throws UntranslatableAxiomException {
        OWLAPIOwl2Obo testSubject0 = new OWLAPIOwl2Obo(_OWLOntologyManager);
        OWLOntologyManager result0 = testSubject0.getManager();
        String result1 = OWLAPIOwl2Obo.owlObjectToTag(_OWLObject);
        testSubject0.setManager(_OWLOntologyManager);
        org.obolibrary.oboformat.model.OBODoc result2 = testSubject0.getObodoc();
        testSubject0.setObodoc(_OBODoc);
        org.obolibrary.oboformat.model.OBODoc result3 = testSubject0.convert(_OWLOntology);
        testSubject0.setStrictConversion(_boolean);
        boolean result4 = testSubject0.getStrictConversion();
        boolean result5 = testSubject0.isDiscardUntranslatable();
        testSubject0.setDiscardUntranslatable(_boolean);
        String result6 = OWLAPIOwl2Obo.getOntologyId(_OWLOntology);
        String result7 = OWLAPIOwl2Obo.getOntologyId(_IRI);
        java.util.Collection<OWLAxiom> result8 = testSubject0.getUntranslatableAxioms();
        String result9 = OWLAPIOwl2Obo.getDataVersion(_OWLOntology);
        String result10 = OWLAPIOwl2Obo.getIdentifierFromObject(_OWLObject, _OWLOntology, _String);
        String result11 = OWLAPIOwl2Obo.getIdentifierFromObject(_OWLObject, _OWLOntology);
        java.util.List<org.obolibrary.oboformat.model.Clause> result12 = OWLAPIOwl2Obo.normalizeRelationshipClauses(_List);
        String result13 = testSubject0.getIdentifier(_OWLObject);
        String result14 = OWLAPIOwl2Obo.getIdentifier(_IRI);
        String result15 = OWLAPIOwl2Obo.getIdentifier(_IRI, _OWLOntology);
    }

    public void verifyOwlStringTools() throws OwlStringException {
        OwlStringTools testSubject0 = new OwlStringTools();
        String result0 = OwlStringTools.translate(_Set, _OWLOntologyManager);
        java.util.Set<OWLAxiom> result1 = OwlStringTools.translate(_String, _OWLOntologyManager);
    }

    private boolean _boolean;
    private String _String = "";
    private java.util.Collection<org.obolibrary.oboformat.model.Clause> _Collection;
    private java.util.Collection<org.obolibrary.oboformat.model.QualifierValue> _Collection9;
    private java.util.List<org.obolibrary.oboformat.model.Clause> _List;
    private java.util.Set<OWLAxiom> _Set;
    private org.obolibrary.obo2owl.OboInOwlCardinalityTools.AnnotationCardinalityConfictHandler _AnnotationCardinalityConfictHandler;
    private org.obolibrary.obo2owl.OboInOwlCardinalityTools.AnnotationCardinalityReporter _AnnotationCardinalityReporter;
    private org.obolibrary.oboformat.model.Frame _Frame;
    private org.obolibrary.oboformat.model.OBODoc _OBODoc;
    private IRI _IRI;
    private OWLClass _OWLClass;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
}
