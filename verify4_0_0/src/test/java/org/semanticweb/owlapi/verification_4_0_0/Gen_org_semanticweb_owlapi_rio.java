package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.openrdf.repository.RepositoryException;
import org.openrdf.rio.RDFHandlerException;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rio.*;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rio {
    @Test
    public void enforceInterfacesAbstractRioParserFactory() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(AbstractRioParserFactory.class));
    }

    public void verifyAbstractRioParserFactory() {
        AbstractRioParserFactory testSubject0 = mock(AbstractRioParserFactory.class);
        java.lang.Object result0 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.createParser();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result3 = testSubject0.getRioFormatFactory();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioAnonymousNodeChecker() {
        assertTrue(org.semanticweb.owlapi.util.AnonymousNodeChecker.class.isAssignableFrom(RioAnonymousNodeChecker.class));
    }

    public void verifyRioAnonymousNodeChecker() {
        RioAnonymousNodeChecker testSubject0 = new RioAnonymousNodeChecker();
        boolean result0 = testSubject0.isAnonymousNode(_String);
        boolean result1 = testSubject0.isAnonymousNode(_IRI);
        boolean result2 = testSubject0.isAnonymousSharedNode(_String);
    }

    @Test
    public void enforceInterfacesRioBinaryRdfOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioBinaryRdfOntologyStorerFactory.class));
    }

    public void verifyRioBinaryRdfOntologyStorerFactory() {
        RioBinaryRdfOntologyStorerFactory testSubject0 = new RioBinaryRdfOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioBinaryRdfParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioBinaryRdfParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioBinaryRdfParserFactory.class));
    }

    public void verifyRioBinaryRdfParserFactory() {
        RioBinaryRdfParserFactory testSubject0 = new RioBinaryRdfParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioJsonOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioJsonOntologyStorerFactory.class));
    }

    public void verifyRioJsonOntologyStorerFactory() {
        RioJsonOntologyStorerFactory testSubject0 = new RioJsonOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioJsonParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioJsonParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioJsonParserFactory.class));
    }

    public void verifyRioJsonParserFactory() {
        RioJsonParserFactory testSubject0 = new RioJsonParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioMemoryTripleSource() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class.isAssignableFrom(RioMemoryTripleSource.class));
    }

    @SuppressWarnings("resource")
    public void verifyRioMemoryTripleSource() throws RepositoryException {
        RioMemoryTripleSource testSubject0 = new RioMemoryTripleSource(_CloseableIteration);
        RioMemoryTripleSource testSubject1 = new RioMemoryTripleSource(_CloseableIteration, _Map);
        RioMemoryTripleSource testSubject2 = new RioMemoryTripleSource(_Iterator, _Map);
        RioMemoryTripleSource testSubject3 = new RioMemoryTripleSource(_Iterator);
        RioMemoryTripleSource testSubject4 = new RioMemoryTripleSource(_Iterable);
        java.io.InputStream result0 = testSubject0.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> result1 = testSubject0.getNamespaces();
        java.util.Iterator<org.openrdf.model.Statement> result2 = testSubject0.getStatementIterator();
        boolean result3 = testSubject0.isReaderAvailable();
        java.io.Reader result4 = testSubject0.getReader();
        boolean result5 = testSubject0.isInputStreamAvailable();
        IRI result6 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result7 = testSubject0.getFormat();
        boolean result8 = testSubject0.isFormatKnown();
        java.lang.String result9 = testSubject0.getMIMEType();
        boolean result10 = testSubject0.isMIMETypeKnown();
        testSubject0.setNamespaces(_Set);
        testSubject0.setNamespaces(_Map);
    }

    @Test
    public void enforceInterfacesRioN3OntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioN3OntologyStorerFactory.class));
    }

    public void verifyRioN3OntologyStorerFactory() {
        RioN3OntologyStorerFactory testSubject0 = new RioN3OntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioN3ParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioN3ParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioN3ParserFactory.class));
    }

    public void verifyRioN3ParserFactory() {
        RioN3ParserFactory testSubject0 = new RioN3ParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioNQuadsOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioNQuadsOntologyStorerFactory.class));
    }

    public void verifyRioNQuadsOntologyStorerFactory() {
        RioNQuadsOntologyStorerFactory testSubject0 = new RioNQuadsOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioNQuadsParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioNQuadsParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioNQuadsParserFactory.class));
    }

    public void verifyRioNQuadsParserFactory() {
        RioNQuadsParserFactory testSubject0 = new RioNQuadsParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioNTriplesOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioNTriplesOntologyStorerFactory.class));
    }

    public void verifyRioNTriplesOntologyStorerFactory() {
        RioNTriplesOntologyStorerFactory testSubject0 = new RioNTriplesOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioNTriplesParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioNTriplesParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioNTriplesParserFactory.class));
    }

    public void verifyRioNTriplesParserFactory() {
        RioNTriplesParserFactory testSubject0 = new RioNTriplesParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(RioOntologyStorer.class));
    }

    public void verifyRioOntologyStorer() throws OWLOntologyStorageException {
        RioOntologyStorer testSubject0 = new RioOntologyStorer(_RioRDFOntologyFormatFactory, _RDFHandler, _Resource_array);
        RioOntologyStorer testSubject1 = new RioOntologyStorer(_RioRDFOntologyFormatFactory, _Resource_array);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        org.openrdf.rio.RDFHandler result1 = testSubject0.getRioHandler();
        testSubject0.setRioHandler(_RDFHandler);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesRioOWLRDFConsumerAdapter() {
        assertTrue(org.semanticweb.owlapi.rdf.rdfxml.parser.OWLRDFConsumer.class.isAssignableFrom(RioOWLRDFConsumerAdapter.class));
        assertTrue(org.openrdf.rio.RDFHandler.class.isAssignableFrom(RioOWLRDFConsumerAdapter.class));
    }

    public void verifyRioOWLRDFConsumerAdapter() throws RDFHandlerException {
        RioOWLRDFConsumerAdapter testSubject0 = new RioOWLRDFConsumerAdapter(_OWLOntology, _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        testSubject0.startRDF();
        testSubject0.endRDF();
        testSubject0.handleNamespace(_String, _String);
        testSubject0.handleStatement(_Statement);
        testSubject0.handleComment(_String);
        org.semanticweb.owlapi.formats.RDFOntologyFormat result0 = testSubject0.getOntologyFormat();
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

    @Test
    public void enforceInterfacesRioParser() {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class.isAssignableFrom(RioParser.class));
    }

    public void verifyInterfaceRioParser() throws OWLParserException, OWLOntologyChangeException, UnloadableImportException, IOException {
        RioParser testSubject0 = mock(RioParser.class);
        org.semanticweb.owlapi.formats.RioRDFOntologyFormat result0 = testSubject0.getParserFormat();
        java.lang.String result1 = testSubject0.getName();
        OWLOntologyFormat result2 = testSubject0.parse(_IRI, _OWLOntology);
        OWLOntologyFormat result3 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result5 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result6 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioParserImpl() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(RioParserImpl.class));
        assertTrue(org.semanticweb.owlapi.rio.RioParser.class.isAssignableFrom(RioParserImpl.class));
    }

    public void verifyRioParserImpl() throws OWLParserException, OWLOntologyChangeException, UnloadableImportException, IOException {
        RioParserImpl testSubject0 = new RioParserImpl(_RioRDFOntologyFormatFactory);
        OWLOntologyFormat result0 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.formats.RioRDFOntologyFormat result2 = testSubject0.getParserFormat();
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result3 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result4 = testSubject0.getSupportedFormats();
        java.lang.String result5 = testSubject0.getName();
        OWLOntologyFormat result6 = testSubject0.parse(_IRI, _OWLOntology);
    }

    @Test
    public void enforceInterfacesRioRDFXMLOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioRDFXMLOntologyStorerFactory.class));
    }

    public void verifyRioRDFXMLOntologyStorerFactory() {
        RioRDFXMLOntologyStorerFactory testSubject0 = new RioRDFXMLOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioRDFXMLParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioRDFXMLParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioRDFXMLParserFactory.class));
    }

    public void verifyRioRDFXMLParserFactory() {
        RioRDFXMLParserFactory testSubject0 = new RioRDFXMLParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioRenderer() {
        assertTrue(org.semanticweb.owlapi.rdf.RDFRendererBase.class.isAssignableFrom(RioRenderer.class));
    }

    public void verifyRioRenderer() throws IOException {
        RioRenderer testSubject0 = new RioRenderer(_OWLOntology, _RDFHandler, _OWLOntologyFormat, _Resource_array);
        testSubject0.render(_RDFResource);
        testSubject0.renderAnonRoots();
        testSubject0.render();
    }

    @Test
    public void enforceInterfacesRioTrigOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioTrigOntologyStorerFactory.class));
    }

    public void verifyRioTrigOntologyStorerFactory() {
        RioTrigOntologyStorerFactory testSubject0 = new RioTrigOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioTrigParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioTrigParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioTrigParserFactory.class));
    }

    public void verifyRioTrigParserFactory() {
        RioTrigParserFactory testSubject0 = new RioTrigParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioTrixOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioTrixOntologyStorerFactory.class));
    }

    public void verifyRioTrixOntologyStorerFactory() {
        RioTrixOntologyStorerFactory testSubject0 = new RioTrixOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioTrixParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioTrixParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioTrixParserFactory.class));
    }

    public void verifyRioTrixParserFactory() {
        RioTrixParserFactory testSubject0 = new RioTrixParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesRioTurtleOntologyStorerFactory() {
        assertTrue(org.semanticweb.owlapi.formats.RioRDFOntologyStorerFactory.class.isAssignableFrom(RioTurtleOntologyStorerFactory.class));
    }

    public void verifyRioTurtleOntologyStorerFactory() {
        RioTurtleOntologyStorerFactory testSubject0 = new RioTurtleOntologyStorerFactory();
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesRioTurtleParserFactory() {
        assertTrue(org.semanticweb.owlapi.rio.AbstractRioParserFactory.class.isAssignableFrom(RioTurtleParserFactory.class));
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RioTurtleParserFactory.class));
    }

    public void verifyRioTurtleParserFactory() {
        RioTurtleParserFactory testSubject0 = new RioTurtleParserFactory();
        org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory result0 = testSubject0.getRioFormatFactory();
        java.lang.Object result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result3 = testSubject0.createParser();
        java.lang.String result4 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result5 = testSubject0.getMIMETypes();
        boolean result6 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result7 = testSubject0.getSupportedFormats();
    }

    private boolean _boolean;
    private info.aduna.iteration.CloseableIteration<org.openrdf.model.Statement, ? extends org.openrdf.OpenRDFException> _CloseableIteration;
    private int _int;
    private java.lang.Iterable<org.openrdf.model.Statement> _Iterable;
    private java.lang.String _String;
    private java.util.Iterator<org.openrdf.model.Statement> _Iterator;
    private java.util.Map<java.lang.String, java.lang.String> _Map;
    private java.util.Set<org.openrdf.model.Namespace> _Set;
    private org.openrdf.model.Resource[] _Resource_array;
    private org.openrdf.model.Statement _Statement;
    private org.openrdf.repository.RepositoryResult<org.openrdf.model.Namespace> _RepositoryResult;
    private org.openrdf.rio.RDFHandler _RDFHandler;
    private org.semanticweb.owlapi.formats.RDFOntologyFormat _RDFOntologyFormat;
    private org.semanticweb.owlapi.formats.RioRDFOntologyFormatFactory _RioRDFOntologyFormatFactory;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
    private EntityType<OWLEntity> _EntityType;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.util.AnonymousNodeChecker _AnonymousNodeChecker;
}
