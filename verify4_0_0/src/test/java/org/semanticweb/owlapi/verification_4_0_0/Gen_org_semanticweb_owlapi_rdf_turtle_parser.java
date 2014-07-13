package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.turtle.parser.NullTripleHandler;
import org.semanticweb.owlapi.rdf.turtle.parser.OWLRDFConsumerAdapter;
import org.semanticweb.owlapi.rdf.turtle.parser.TripleHandler;
import org.semanticweb.owlapi.rdf.turtle.parser.TurtleOntologyParser;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rdf_turtle_parser {
    @Test
    public void enforceInterfacesNullTripleHandler() {
        assertTrue(org.semanticweb.owlapi.rdf.turtle.parser.TripleHandler.class.isAssignableFrom(NullTripleHandler.class));
    }

    public void verifyNullTripleHandler() {
        NullTripleHandler testSubject0 = new NullTripleHandler();
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_IRI);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
    }

    @Test
    public void enforceInterfacesOWLRDFConsumerAdapter() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.parser.OWLRDFConsumer.class.isAssignableFrom(OWLRDFConsumerAdapter.class));
        assertTrue(org.semanticweb.owlapi.rdf.turtle.parser.TripleHandler.class.isAssignableFrom(OWLRDFConsumerAdapter.class));
    }

    public void verifyOWLRDFConsumerAdapter() {
        OWLRDFConsumerAdapter testSubject0 = new OWLRDFConsumerAdapter(_OWLOntology, _OWLOntologyLoaderConfiguration);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_IRI);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        org.semanticweb.owlapi.formats.AbstractRDFDocumentFormat result0 = testSubject0.getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
        OWLOntology result1 = testSubject0.getOntology();
        boolean result2 = testSubject0.isAnonymousNode(_String);
        boolean result3 = testSubject0.isAnonymousNode(_IRI);
        boolean result4 = testSubject0.isAnonymousSharedNode(_String);
        OWLDataFactory result5 = testSubject0.getDataFactory();
        OWLOntologyManager result6 = testSubject0.getOWLOntologyManager();
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<OWLAnnotation> result7 = testSubject0.getPendingAnnotations();
        OWLAxiom result8 = testSubject0.getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        boolean result10 = testSubject0.isRestriction(_IRI);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<IRI> result11 = testSubject0.getAnnotatedSourceAnnotationMainNodes(_IRI);
        testSubject0.startModel(_IRI);
        boolean result12 = testSubject0.isParsedAllTriples();
        testSubject0.endModel();
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithLiteralValue(_IRI, _IRI, _String, _String, _IRI);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        testSubject0.statementWithResourceValue(_IRI, _IRI, _IRI);
        OWLEntity result13 = testSubject0.generateAndLogParseError(_EntityType, _IRI);
    }

    public void verifyInterfaceTripleHandler() {
        TripleHandler testSubject0 = mock(TripleHandler.class);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_IRI);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
    }

    @Test
    public void enforceInterfacesTurtleOntologyParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(TurtleOntologyParser.class));
    }

    public void verifyTurtleOntologyParser() throws UnloadableImportException, IOException {
        TurtleOntologyParser testSubject0 = new TurtleOntologyParser();
        java.lang.String result0 = testSubject0.getName();
        OWLDocumentFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLDocumentFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        OWLDocumentFormatFactory result4 = testSubject0.getSupportedFormat();
    }

    private boolean _boolean;
    private int _int;
    private java.lang.String _String;
    private org.semanticweb.owlapi.formats.AbstractRDFDocumentFormat _RDFOntologyFormat;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private EntityType<OWLEntity> _EntityType;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
