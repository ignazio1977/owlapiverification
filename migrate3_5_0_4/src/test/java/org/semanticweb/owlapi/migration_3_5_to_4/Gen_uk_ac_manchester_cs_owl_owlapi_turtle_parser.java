package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import org.semanticweb.owlapi.formats.AbstractRDFDocumentFormat;
import org.semanticweb.owlapi.model.*;

import org.semanticweb.owlapi.rdf.rdfxml.parser.OWLRDFConsumer;
import org.semanticweb.owlapi.rdf.turtle.parser.*;

@Migration({ "Package change: from uk.ac.manchester.cs.owl.owlapi.turtle to org.semanticweb.owlapi.rdf.turtle.parser", "class visibility: ConsoleTripleHandler : package",
        "class visibility: JavaCharStream : package", "Package change: uk.ac.manchester.cs.BOMSafeJavaCharStream to org.semanticweb.owlapi.BOMSafeJavaCharStream",
        "method arguments: TripleHandler::handleBaseDirective() : from String to IRI",
        "method arguments: OWLRDFConsumerAdapter<init> : dropped manager, dropped anonymous node checker",
        "method visibility: OWLRDFConsumerAdapter::getConfiguration() : protected", "class visibility: ParseException : package",
        "class visibility: TurtleParserTokenManager : package", "class visibility: TurtleParserConstants : package", "class visibility: TurtleParserException : package",
        "class visibility: TurtleParser : package", "class visibility: Token : package", "class visibility: TokenMgrError : package",
        "method visibility: OWLRDFConsumerAdapter::getConfiguration() : protected", "method visibility: OWLRDFConsumerAdapter::addTriple() : protected",
        "method visibility: OWLRDFConsumerAdapter::addFirst() : protected", "method visibility: OWLRDFConsumerAdapter::translateAnnotations() : protected",
        "method visibility: OWLRDFConsumerAdapter::addOntology() : protected", "method visibility: OWLRDFConsumerAdapter::getResourceObject() : protected",
        "method visibility: OWLRDFConsumerAdapter::getLiteralObject() : protected", "method visibility: OWLRDFConsumerAdapter::isDataRange() : protected",
        "method visibility: OWLRDFConsumerAdapter::translateDataRange() : protected", "method visibility: OWLRDFConsumerAdapter::translateToDataRangeSet() : protected",
        "method visibility: OWLRDFConsumerAdapter::translateToConstantSet() : protected", "method removed: OWLRDFConsumerAdapter::addModelAttribte()",
        "method removed: OWLRDFConsumerAdapter::handle()", "method visibility: OWLRDFConsumerAdapter::importsClosureChanged() : protected",
        "method visibility: OWLRDFConsumerAdapter::setIRIProvider() : protected", "method visibility: OWLRDFConsumerAdapter::setPendingAnnotations() : protected",
        "method visibility: OWLRDFConsumerAdapter::isTriplePresent() : protected", "method visibility: OWLRDFConsumerAdapter::translateIndividual() : protected",
        "method visibility: OWLRDFConsumerAdapter::getSynonym() : protected", "method visibility: OWLRDFConsumerAdapter::translateDataPropertyExpression() : protected",
        "method visibility: OWLRDFConsumerAdapter::translateObjectPropertyExpression() : protected",
        "method visibility: OWLRDFConsumerAdapter::getPredicatesBySubject() : protected", "method visibility: OWLRDFConsumerAdapter::getResourceObjects() : protected",
        "method visibility: OWLRDFConsumerAdapter::getLiteralObjects() : protected", "method visibility: OWLRDFConsumerAdapter::hasPredicate() : protected",
        "method visibility: OWLRDFConsumerAdapter::addRest() : protected", "method visibility: OWLRDFConsumerAdapter::getFirstResource() : protected",
        "method visibility: OWLRDFConsumerAdapter::getFirstLiteral() : protected", "method visibility: OWLRDFConsumerAdapter::getRest() : protected",
        "method visibility: OWLRDFConsumerAdapter::isAxiom() : protected", "method visibility: OWLRDFConsumerAdapter::getOntologies() : protected",
        "method visibility: OWLRDFConsumerAdapter::addAxiom() : protected", "method visibility: OWLRDFConsumerAdapter::getOntologies() : protected",
        "method removed: OWLRDFConsumerAdapter::translateToFacetRestrictionSet()", "method removed: OWLRDFConsumerAdapter::getClassExpressionIfTranslated()",
        "method removed: OWLRDFConsumerAdapter::translateToObjectPropertyList()", "method removed: OWLRDFConsumerAdapter::translateToDataPropertyList()",
        "method removed: OWLRDFConsumerAdapter::translateToClassExpressionSet()", "method removed: OWLRDFConsumerAdapter::translateToIndividualSet()",
        "method arguments: OWLRDFConsumerAdapter::startModel() : from String to IRI", "method arguments: OWLRDFConsumerAdapter::logicalURI() : from String to IRI",
        "method arguments: TurtleOntologyParser::parse() : added OWLOntologyLoaderConfiguration", "method removed: TurtleOntologyParser::setOWLOntologyManager()",
        "method removed: TurtleOntologyParser::getOWLOntologyManager()", "class removed: TurtleOntologyParserFactory" })
@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi_turtle_parser {
    @Test
    public void enforceInterfacesNullTripleHandler() {
        assertTrue(TripleHandler.class.isAssignableFrom(NullTripleHandler.class));
    }

    public void verifyNullTripleHandler() {
        NullTripleHandler testSubject0 = new NullTripleHandler();
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_IRI);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String);
    }

    @Test
    public void enforceInterfacesOWLRDFConsumerAdapter() {
        assertTrue(OWLRDFConsumer.class.isAssignableFrom(OWLRDFConsumerAdapter.class));
        assertTrue(TripleHandler.class.isAssignableFrom(OWLRDFConsumerAdapter.class));
    }

    public void verifyOWLRDFConsumerAdapter() {
        OWLRDFConsumerAdapter testSubject0 = new OWLRDFConsumerAdapter(_OWLOntology, _OWLOntologyLoaderConfiguration);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_IRI);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String);
        OWLOntology result2 = testSubject0.getOntology();
        OWLDataFactory result3 = testSubject0.getDataFactory();
        boolean result8 = testSubject0.isRestriction(_IRI);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        boolean result11 = testSubject0.isParsedAllTriples();
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getPendingAnnotations();
        OWLAxiom result13 = testSubject0.getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<IRI> result14 = testSubject0.getAnnotatedSourceAnnotationMainNodes(_IRI);
        testSubject0.startModel(_IRI);
        testSubject0.endModel();
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        AbstractRDFDocumentFormat result41 = testSubject0.getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
    }

    public void verifyInterfaceTripleHandler() {
        TripleHandler testSubject0 = mock(TripleHandler.class);
        testSubject0.handlePrefixDirective(_String, _String);
        testSubject0.handleBaseDirective(_IRI);
        testSubject0.handleComment(_String);
        testSubject0.handleEnd();
        testSubject0.handleTriple(_IRI, _IRI, _String);
        testSubject0.handleTriple(_IRI, _IRI, _String, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _String, _String);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
    }

    @Test
    public void enforceInterfacesTurtleOntologyParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(TurtleOntologyParser.class));
    }

    public void verifyTurtleOntologyParser() throws IOException {
        TurtleOntologyParser testSubject0 = new TurtleOntologyParser();
        OWLDocumentFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLDocumentFormat result2 = testSubject0.parse(_IRI, _OWLOntology);
    }

    private boolean _boolean;
    private int _int;
    private String _String;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.formats.AbstractRDFDocumentFormat _RDFOntologyFormat;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
