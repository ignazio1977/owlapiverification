package org.semanticweb.owlapi.verification_4_0_0;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.obo2owl.*;
import org.obolibrary.obo2owl.OWLAPIOwl2Obo.UntranslatableAxiomException;
import org.obolibrary.obo2owl.OboInOwlCardinalityTools.AnnotationCardinalityException;
import org.obolibrary.obo2owl.OwlStringTools.OwlStringException;
import org.obolibrary.oboformat.parser.OBOFormatParserException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_obo2owl {
    public void verifyIdTranslator() {
        IdTranslator testSubject0 = new IdTranslator();
        java.lang.String result0 = testSubject0.translateIRI(_IRI);
        java.lang.String result1 = testSubject0.translateIdToIRIString(_String);
        boolean result2 = testSubject0.isURI(_String);
        java.lang.String result3 = testSubject0.expandPrefix(_String);
    }

    public void verifyObo2OWLConstants() {
        Obo2OWLConstants testSubject0 = new Obo2OWLConstants();
        java.lang.String result0 = Obo2OWLConstants.format(_Date);
        org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary result1 = Obo2OWLConstants.getVocabularyObj(_String);
    }

    public void verifyOboInOwlCardinalityTools() throws AnnotationCardinalityException {
        OboInOwlCardinalityTools testSubject0 = new OboInOwlCardinalityTools();
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology, _AnnotationCardinalityReporter);
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology);
        OboInOwlCardinalityTools.checkAnnotationCardinality(_OWLOntology, _AnnotationCardinalityReporter, _AnnotationCardinalityConfictHandler);
    }

    public void verifyOWLAPIObo2Owl() throws OWLOntologyCreationException, OBOFormatParserException, OWLOntologyStorageException, IOException {
        OWLAPIObo2Owl testSubject0 = new OWLAPIObo2Owl(_OWLOntologyManager);
        OWLOntologyManager result0 = testSubject0.getManager();
        OWLAPIObo2Owl.convertURL(_String, _String, _String, _OWLOntologyManager);
        OWLAPIObo2Owl.convertURL(_String, _String, _OWLOntologyManager);
        testSubject0.setManager(_OWLOntologyManager);
        org.obolibrary.oboformat.model.OBODoc result1 = testSubject0.getObodoc();
        testSubject0.setObodoc(_OBODoc);
        testSubject0.trHeaderFrame(_Frame);
        OWLNamedObject result2 = testSubject0.trTypedefFrame(_Frame);
        OWLClassExpression result3 = testSubject0.trTermFrame(_Frame);
        IRI result4 = testSubject0.oboIdToIRI(_String);
        java.util.Set<OWLAxiom> result5 = testSubject0.trTermFrameClauses(_OWLClass, _Collection, _String);
        OWLClassExpression result6 = testSubject0.trRel(_String, _String, _Collection11);
        OWLOntology result7 = testSubject0.convert(_OBODoc, _OWLOntology);
        OWLOntology result8 = testSubject0.convert(_OBODoc);
        OWLOntology result9 = testSubject0.convert(_String);
        IRI result10 = OWLAPIObo2Owl.trTagToIRI(_String);
    }

    public void verifyOWLAPIOwl2Obo() throws UntranslatableAxiomException {
        OWLAPIOwl2Obo testSubject0 = new OWLAPIOwl2Obo(_OWLOntologyManager);
        OWLOntologyManager result0 = testSubject0.getManager();
        testSubject0.setManager(_OWLOntologyManager);
        org.obolibrary.oboformat.model.OBODoc result1 = testSubject0.getObodoc();
        testSubject0.setObodoc(_OBODoc);
        testSubject0.setStrictConversion(_boolean);
        boolean result2 = testSubject0.getStrictConversion();
        boolean result3 = testSubject0.isDiscardUntranslatable();
        testSubject0.setDiscardUntranslatable(_boolean);
        java.lang.String result4 = OWLAPIOwl2Obo.getOntologyId(_OWLOntology);
        java.lang.String result5 = OWLAPIOwl2Obo.getOntologyId(_IRI);
        java.util.Collection<OWLAxiom> result6 = testSubject0.getUntranslatableAxioms();
        java.lang.String result7 = OWLAPIOwl2Obo.getDataVersion(_OWLOntology);
        java.lang.String result8 = OWLAPIOwl2Obo.getIdentifierFromObject(_OWLObject, _OWLOntology, _String);
        java.lang.String result9 = OWLAPIOwl2Obo.getIdentifierFromObject(_OWLObject, _OWLOntology);
        boolean result10 = testSubject0.isMuteUntranslatableAxioms();
        testSubject0.setMuteUntranslatableAxioms(_boolean);
        java.util.List<org.obolibrary.oboformat.model.Clause> result11 = OWLAPIOwl2Obo.normalizeRelationshipClauses(_List);
        org.obolibrary.oboformat.model.OBODoc result12 = testSubject0.convert(_OWLOntology);
        java.lang.String result13 = OWLAPIOwl2Obo.owlObjectToTag(_OWLObject);
        java.lang.String result14 = testSubject0.getIdentifier(_OWLObject);
        java.lang.String result15 = OWLAPIOwl2Obo.getIdentifier(_IRI);
    }

    public void verifyOwlStringTools() throws OwlStringException {
        OwlStringTools testSubject0 = new OwlStringTools();
        java.lang.String result0 = OwlStringTools.translate(_Set, _OWLOntologyManager);
        java.util.Set<OWLAxiom> result1 = OwlStringTools.translate(_String, _OWLOntologyManager);
    }

    private boolean _boolean;
    private java.lang.String _String;
    private java.util.Collection<org.obolibrary.oboformat.model.Clause> _Collection;
    private java.util.Collection<org.obolibrary.oboformat.model.QualifierValue> _Collection11;
    private java.util.Date _Date;
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
