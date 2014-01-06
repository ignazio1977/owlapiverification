package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.io.Writer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.AbstractOWLParser;
import org.semanticweb.owlapi.io.AbstractOWLRenderer;
import org.semanticweb.owlapi.io.DefaultOntologyFormat;
import org.semanticweb.owlapi.io.FileDocumentSource;
import org.semanticweb.owlapi.io.FileDocumentTarget;
import org.semanticweb.owlapi.io.GZipFileDocumentSource;
import org.semanticweb.owlapi.io.GZipFileDocumentTarget;
import org.semanticweb.owlapi.io.GZipStreamDocumentSource;
import org.semanticweb.owlapi.io.GZipStreamDocumentTarget;
import org.semanticweb.owlapi.io.IOProperties;
import org.semanticweb.owlapi.io.IRIDocumentSource;
import org.semanticweb.owlapi.io.OWLFunctionalSyntaxOntologyFormat;
import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.io.OWLOntologyCreationIOException;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.io.OWLOntologyInputSourceException;
import org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData;
import org.semanticweb.owlapi.io.OWLOntologyStorageIOException;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.io.OWLParserFactory;
import org.semanticweb.owlapi.io.OWLParserFactoryRegistry;
import org.semanticweb.owlapi.io.OWLParserIOException;
import org.semanticweb.owlapi.io.OWLParserSAXException;
import org.semanticweb.owlapi.io.OWLParserURISyntaxException;
import org.semanticweb.owlapi.io.OWLRenderer;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.io.OWLRendererIOException;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.io.OntologyIRIMappingNotFoundException;
import org.semanticweb.owlapi.io.RDFLiteral;
import org.semanticweb.owlapi.io.RDFNode;
import org.semanticweb.owlapi.io.RDFOntologyFormat;
import org.semanticweb.owlapi.io.RDFOntologyHeaderStatus;
import org.semanticweb.owlapi.io.RDFParserMetaData;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.io.RDFResourceParseError;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.io.RDFXMLOntologyFormat;
import org.semanticweb.owlapi.io.ReaderDocumentSource;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.io.StreamDocumentTarget;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.io.StringDocumentTarget;
import org.semanticweb.owlapi.io.SystemOutDocumentTarget;
import org.semanticweb.owlapi.io.ToStringRenderer;
import org.semanticweb.owlapi.io.UnparsableOntologyException;
import org.semanticweb.owlapi.io.WriterDocumentTarget;
import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.io.ZipDocumentTarget;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChangeException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.semanticweb.owlapi.model.UnloadableImportException;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_io {
    @Test
    public void enforceInterfacesAbstractOWLParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class
                .isAssignableFrom(AbstractOWLParser.class));
    }

    public void verifyAbstractOWLParser() throws Exception {
        AbstractOWLParser testSubject0 = new AbstractOWLParser() {
            @Override
            public OWLOntologyFormat parse(OWLOntologyDocumentSource documentSource,
                    OWLOntology ontology) throws OWLParserException, IOException,
                    OWLOntologyChangeException, UnloadableImportException {
                return null;
            }

            @Override
            public OWLOntologyFormat parse(OWLOntologyDocumentSource documentSource,
                    OWLOntology ontology, OWLOntologyLoaderConfiguration configuration)
                    throws OWLParserException, IOException, OWLOntologyChangeException,
                    UnloadableImportException {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLOntologyFormat result0 = testSubject0.parse(_IRI,
                _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result1 = testSubject0
                .getOWLOntologyManager();
        org.semanticweb.owlapi.model.OWLOntologyFormat result2 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntologyFormat result3 = testSubject0.parse(
                _OWLOntologyDocumentSource, _OWLOntology);
    }

    @Test
    public void enforceInterfacesAbstractOWLRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLRenderer.class
                .isAssignableFrom(AbstractOWLRenderer.class));
    }

    public void verifyAbstractOWLRenderer() throws Exception {
        AbstractOWLRenderer testSubject0 = new AbstractOWLRenderer() {
            @Override
            public void render(OWLOntology ontology, Writer writer)
                    throws OWLRendererException {}
        };
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
        testSubject0.render(_OWLOntology, _Writer);
    }

    @Test
    public void enforceInterfacesDefaultOntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.RDFXMLOntologyFormat.class
                .isAssignableFrom(DefaultOntologyFormat.class));
    }

    public void verifyDefaultOntologyFormat() throws Exception {
        DefaultOntologyFormat testSubject0 = new DefaultOntologyFormat();
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity, _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<java.lang.String, java.lang.String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result5 = testSubject0.getPrefixNames();
        java.lang.String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result8 = testSubject0.getDefaultPrefix();
        java.lang.String result9 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesFileDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(FileDocumentSource.class));
    }

    public void verifyFileDocumentSource() throws Exception {
        FileDocumentSource testSubject0 = new FileDocumentSource(_File);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
    }

    @Test
    public void enforceInterfacesFileDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(FileDocumentTarget.class));
    }

    public void verifyFileDocumentTarget() throws Exception {
        FileDocumentTarget testSubject0 = new FileDocumentTarget(_File);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesGZipFileDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(GZipFileDocumentSource.class));
    }

    public void verifyGZipFileDocumentSource() throws Exception {
        GZipFileDocumentSource testSubject0 = new GZipFileDocumentSource(_File);
        GZipFileDocumentSource testSubject1 = new GZipFileDocumentSource(_File, _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
        org.semanticweb.owlapi.model.IRI result5 = GZipFileDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesGZipFileDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(GZipFileDocumentTarget.class));
    }

    public void verifyGZipFileDocumentTarget() throws Exception {
        GZipFileDocumentTarget testSubject0 = new GZipFileDocumentTarget(_File);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesGZipStreamDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(GZipStreamDocumentSource.class));
    }

    public void verifyGZipStreamDocumentSource() throws Exception {
        GZipStreamDocumentSource testSubject0 = new GZipStreamDocumentSource(_InputStream);
        GZipStreamDocumentSource testSubject1 = new GZipStreamDocumentSource(
                _InputStream, _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
        org.semanticweb.owlapi.model.IRI result5 = GZipStreamDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesGZipStreamDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(GZipStreamDocumentTarget.class));
    }

    public void verifyGZipStreamDocumentTarget() throws Exception {
        GZipStreamDocumentTarget testSubject0 = new GZipStreamDocumentTarget(
                _OutputStream);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    

    public void verifyIOProperties() throws Exception {
        IOProperties testSubject0 = IOProperties.getInstance();
        boolean result1 = testSubject0.isConnectionAcceptHTTPCompression();
        int result2 = testSubject0.getConnectionTimeout();
        testSubject0.setConnectionTimeout(_int);
        testSubject0.setConnectionAcceptHTTPCompression(_boolean);
    }

    @Test
    public void enforceInterfacesIRIDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(IRIDocumentSource.class));
    }

    public void verifyIRIDocumentSource() throws Exception {
        IRIDocumentSource testSubject0 = new IRIDocumentSource(_IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
    }

    @Test
    public void enforceInterfacesOntologyIRIMappingNotFoundException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyCreationException.class
                .isAssignableFrom(OntologyIRIMappingNotFoundException.class));
    }

    public void verifyOntologyIRIMappingNotFoundException() throws Exception {
        OntologyIRIMappingNotFoundException testSubject0 = new OntologyIRIMappingNotFoundException(
                _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getOntologyIRI();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxOntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(OWLFunctionalSyntaxOntologyFormat.class));
    }

    public void verifyOWLFunctionalSyntaxOntologyFormat() throws Exception {
        OWLFunctionalSyntaxOntologyFormat testSubject0 = new OWLFunctionalSyntaxOntologyFormat();
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<java.lang.String, java.lang.String> result0 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result1 = testSubject0.getPrefixNames();
        java.lang.String result2 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result4 = testSubject0.getDefaultPrefix();
        java.lang.String result5 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result7 = testSubject0.getParameter(_Object, _Object);
        boolean result8 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result9 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result10 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    

    public void verifyInterfaceOWLObjectRenderer() throws Exception {
        OWLObjectRenderer testSubject0 = mock(OWLObjectRenderer.class);
        java.lang.String result0 = testSubject0.render(_OWLObject);
        testSubject0.setShortFormProvider(_ShortFormProvider);
    }

    @Test
    public void enforceInterfacesOWLOntologyCreationIOException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyCreationException.class
                .isAssignableFrom(OWLOntologyCreationIOException.class));
    }

    public void verifyOWLOntologyCreationIOException() throws Exception {
        OWLOntologyCreationIOException testSubject0 = new OWLOntologyCreationIOException(
                _IOException);
        java.lang.Throwable result0 = testSubject0.getCause();
        java.io.IOException result1 = testSubject0.getCause();
        java.lang.String result2 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLOntologyDocumentSource() throws Exception {
        OWLOntologyDocumentSource testSubject0 = mock(OWLOntologyDocumentSource.class);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
    }

    

    public void verifyInterfaceOWLOntologyDocumentTarget() throws Exception {
        OWLOntologyDocumentTarget testSubject0 = mock(OWLOntologyDocumentTarget.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesOWLOntologyInputSourceException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLOntologyInputSourceException.class));
    }

    public void verifyOWLOntologyInputSourceException() throws Exception {
        OWLOntologyInputSourceException testSubject0 = new OWLOntologyInputSourceException(
                _String, _Throwable);
        OWLOntologyInputSourceException testSubject1 = new OWLOntologyInputSourceException(
                _String);
        OWLOntologyInputSourceException testSubject2 = new OWLOntologyInputSourceException(
                _Throwable);
        OWLOntologyInputSourceException testSubject3 = new OWLOntologyInputSourceException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLOntologyLoaderMetaData() throws Exception {
        OWLOntologyLoaderMetaData testSubject0 = mock(OWLOntologyLoaderMetaData.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyStorageIOException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorageException.class
                .isAssignableFrom(OWLOntologyStorageIOException.class));
    }

    public void verifyOWLOntologyStorageIOException() throws Exception {
        OWLOntologyStorageIOException testSubject0 = new OWLOntologyStorageIOException(
                _IOException);
        java.io.IOException result0 = testSubject0.getIOException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLParser() throws Exception {
        OWLParser testSubject0 = mock(OWLParser.class);
        org.semanticweb.owlapi.model.OWLOntologyFormat result0 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntologyFormat result1 = testSubject0.parse(_IRI,
                _OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyFormat result2 = testSubject0.parse(
                _OWLOntologyDocumentSource, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOWLParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLParserException.class));
    }

    public void verifyOWLParserException() throws Exception {
        OWLParserException testSubject0 = new OWLParserException(_Throwable);
        OWLParserException testSubject1 = new OWLParserException(_String, _int, _int);
        OWLParserException testSubject2 = new OWLParserException(_Throwable, _int, _int);
        OWLParserException testSubject3 = new OWLParserException(_String, _Throwable,
                _int, _int);
        OWLParserException testSubject4 = new OWLParserException();
        OWLParserException testSubject5 = new OWLParserException(_String);
        OWLParserException testSubject6 = new OWLParserException(_String, _Throwable);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLParserFactory() throws Exception {
        OWLParserFactory testSubject0 = mock(OWLParserFactory.class);
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    

    public void verifyOWLParserFactoryRegistry() throws Exception {
        OWLParserFactoryRegistry testSubject0 = OWLParserFactoryRegistry.getInstance();
        java.util.List<org.semanticweb.owlapi.io.OWLParserFactory> result1 = testSubject0
                .getParserFactories();
        testSubject0.registerParserFactory(_OWLParserFactory);
        testSubject0.clearParserFactories();
        testSubject0.unregisterParserFactory(_OWLParserFactory);
    }

    @Test
    public void enforceInterfacesOWLParserIOException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLParserIOException.class));
    }

    public void verifyOWLParserIOException() throws Exception {
        OWLParserIOException testSubject0 = new OWLParserIOException(_IOException);
        java.lang.Throwable result0 = testSubject0.getCause();
        java.io.IOException result1 = testSubject0.getCause();
        java.lang.String result2 = testSubject0.getMessage();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result5 = testSubject0.fillInStackTrace();
        java.lang.Throwable result6 = testSubject0.initCause(_Throwable);
        java.lang.String result7 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result9 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLParserSAXException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLParserSAXException.class));
    }

    public void verifyOWLParserSAXException() throws Exception {
        OWLParserSAXException testSubject0 = new OWLParserSAXException(_SAXException);
        org.xml.sax.SAXException result0 = testSubject0.getCause();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.String result2 = testSubject0.getMessage();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result5 = testSubject0.fillInStackTrace();
        java.lang.Throwable result6 = testSubject0.initCause(_Throwable);
        java.lang.String result7 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result9 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLParserURISyntaxException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLParserURISyntaxException.class));
    }

    public void verifyOWLParserURISyntaxException() throws Exception {
        OWLParserURISyntaxException testSubject0 = new OWLParserURISyntaxException(
                _URISyntaxException, _int, _int);
        java.net.URISyntaxException result0 = testSubject0.getCause();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.String result2 = testSubject0.getMessage();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result5 = testSubject0.fillInStackTrace();
        java.lang.Throwable result6 = testSubject0.initCause(_Throwable);
        java.lang.String result7 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result9 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceOWLRenderer() throws Exception {
        OWLRenderer testSubject0 = mock(OWLRenderer.class);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOWLRendererException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorageException.class
                .isAssignableFrom(OWLRendererException.class));
    }

    public void verifyOWLRendererException() throws Exception {
        OWLRendererException testSubject0 = new OWLRendererException(_String);
        OWLRendererException testSubject1 = new OWLRendererException(_String, _Throwable);
        OWLRendererException testSubject2 = new OWLRendererException(_Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRendererIOException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLRendererException.class
                .isAssignableFrom(OWLRendererIOException.class));
    }

    public void verifyOWLRendererIOException() throws Exception {
        OWLRendererIOException testSubject0 = new OWLRendererIOException(_IOException);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLXMLOntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(OWLXMLOntologyFormat.class));
    }

    public void verifyOWLXMLOntologyFormat() throws Exception {
        OWLXMLOntologyFormat testSubject0 = new OWLXMLOntologyFormat();
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<java.lang.String, java.lang.String> result0 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result1 = testSubject0.getPrefixNames();
        java.lang.String result2 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result4 = testSubject0.getDefaultPrefix();
        java.lang.String result5 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result7 = testSubject0.getParameter(_Object, _Object);
        boolean result8 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result9 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result10 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesRDFLiteral() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.RDFNode.class
                .isAssignableFrom(RDFLiteral.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFLiteral.class));
    }

    public void verifyRDFLiteral() throws Exception {
        RDFLiteral testSubject0 = new RDFLiteral(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLLiteral result0 = testSubject0.getLiteral();
        boolean result1 = testSubject0.isLiteral();
    }

    

    public void verifyRDFNode() throws Exception {
        RDFNode testSubject0 = new RDFNode() {
            @Override
            public boolean isLiteral() {
                return false;
            }
        };
        boolean result0 = testSubject0.isLiteral();
    }

    @Test
    public void enforceInterfacesRDFOntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(RDFOntologyFormat.class));
    }

    public void verifyRDFOntologyFormat() throws Exception {
        RDFOntologyFormat testSubject0 = new RDFOntologyFormat() {};
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity, _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<java.lang.String, java.lang.String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result5 = testSubject0.getPrefixNames();
        java.lang.String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result8 = testSubject0.getDefaultPrefix();
        java.lang.String result9 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesRDFOntologyHeaderStatus() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(RDFOntologyHeaderStatus.class));
    }

    public void verifyEnumRDFOntologyHeaderStatus() throws Exception {
        RDFOntologyHeaderStatus testSubject0 = RDFOntologyHeaderStatus.PARSED_ZERO_HEADERS;
        RDFOntologyHeaderStatus testSubject1 = RDFOntologyHeaderStatus.PARSED_ONE_HEADER;
        RDFOntologyHeaderStatus testSubject2 = RDFOntologyHeaderStatus.PARSED_MULTIPLE_HEADERS;
    }

    @Test
    public void enforceInterfacesRDFParserMetaData() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData.class
                .isAssignableFrom(RDFParserMetaData.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFParserMetaData.class));
    }

    public void verifyRDFParserMetaData() throws Exception {
        RDFParserMetaData testSubject0 = new RDFParserMetaData(_RDFOntologyHeaderStatus,
                _int, _Set);
        int result0 = testSubject0.getTripleCount();
        org.semanticweb.owlapi.io.RDFOntologyHeaderStatus result1 = testSubject0
                .getHeaderState();
        java.util.Set<org.semanticweb.owlapi.io.RDFTriple> result2 = testSubject0
                .getUnparsedTriples();
    }

    @Test
    public void enforceInterfacesRDFResource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.RDFNode.class
                .isAssignableFrom(RDFResource.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFResource.class));
    }

    public void verifyRDFResource() throws Exception {
        RDFResource testSubject0 = new RDFResource(_IRI, _boolean);
        RDFResource testSubject1 = new RDFResource(_IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getResource();
        boolean result1 = testSubject0.isLiteral();
        boolean result2 = testSubject0.isAnonymous();
    }

    

    public void verifyRDFResourceParseError() throws Exception {
        RDFResourceParseError testSubject0 = new RDFResourceParseError(_OWLEntity,
                _RDFNode, _Set);
        org.semanticweb.owlapi.model.OWLEntity result0 = testSubject0
                .getParserGeneratedErrorEntity();
        org.semanticweb.owlapi.io.RDFNode result1 = testSubject0.getMainNode();
        java.util.Set<org.semanticweb.owlapi.io.RDFTriple> result2 = testSubject0
                .getMainNodeTriples();
    }

    @Test
    public void enforceInterfacesRDFTriple() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFTriple.class));
    }

    public void verifyRDFTriple() throws Exception {
        RDFTriple testSubject0 = new RDFTriple(_IRI, _boolean, _IRI, _boolean,
                _OWLLiteral);
        RDFTriple testSubject1 = new RDFTriple(_IRI, _boolean, _IRI, _boolean, _IRI,
                _boolean);
        RDFTriple testSubject2 = new RDFTriple(_RDFResource, _RDFResource, _RDFNode);
        org.semanticweb.owlapi.io.RDFNode result0 = testSubject0.getObject();
        org.semanticweb.owlapi.io.RDFResource result1 = testSubject0.getSubject();
        org.semanticweb.owlapi.io.RDFResource result2 = testSubject0.getPredicate();
    }

    @Test
    public void enforceInterfacesRDFXMLOntologyFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.RDFOntologyFormat.class
                .isAssignableFrom(RDFXMLOntologyFormat.class));
    }

    public void verifyRDFXMLOntologyFormat() throws Exception {
        RDFXMLOntologyFormat testSubject0 = new RDFXMLOntologyFormat();
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity, _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<java.lang.String, java.lang.String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result5 = testSubject0.getPrefixNames();
        java.lang.String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result8 = testSubject0.getDefaultPrefix();
        java.lang.String result9 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesReaderDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(ReaderDocumentSource.class));
    }

    public void verifyReaderDocumentSource() throws Exception {
        ReaderDocumentSource testSubject0 = new ReaderDocumentSource(_Reader, _IRI);
        ReaderDocumentSource testSubject1 = new ReaderDocumentSource(_Reader);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
        org.semanticweb.owlapi.model.IRI result5 = ReaderDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesStreamDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(StreamDocumentSource.class));
    }

    public void verifyStreamDocumentSource() throws Exception {
        StreamDocumentSource testSubject0 = new StreamDocumentSource(_InputStream);
        StreamDocumentSource testSubject1 = new StreamDocumentSource(_InputStream, _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
        org.semanticweb.owlapi.model.IRI result5 = StreamDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesStreamDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(StreamDocumentTarget.class));
    }

    public void verifyStreamDocumentTarget() throws Exception {
        StreamDocumentTarget testSubject0 = new StreamDocumentTarget(_OutputStream);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesStringDocumentSource() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(StringDocumentSource.class));
    }

    public void verifyStringDocumentSource() throws Exception {
        StringDocumentSource testSubject0 = new StringDocumentSource(_String);
        StringDocumentSource testSubject1 = new StringDocumentSource(_String, _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getDocumentIRI();
        org.semanticweb.owlapi.model.IRI result5 = StringDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesStringDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(StringDocumentTarget.class));
    }

    public void verifyStringDocumentTarget() throws Exception {
        StringDocumentTarget testSubject0 = new StringDocumentTarget();
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesSystemOutDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(SystemOutDocumentTarget.class));
    }

    public void verifySystemOutDocumentTarget() throws Exception {
        SystemOutDocumentTarget testSubject0 = new SystemOutDocumentTarget();
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    

    public void verifyToStringRenderer() throws Exception {
        ToStringRenderer testSubject0 = ToStringRenderer.getInstance();
        testSubject0.setShortFormProvider(_ShortFormProvider);
        org.semanticweb.owlapi.io.OWLObjectRenderer result1 = testSubject0.getRenderer();
        testSubject0.setRenderer(_OWLObjectRenderer);
        java.lang.String result2 = testSubject0.getRendering(_OWLObject);
    }

    @Test
    public void enforceInterfacesUnparsableOntologyException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyCreationException.class
                .isAssignableFrom(UnparsableOntologyException.class));
    }

    public void verifyUnparsableOntologyException() throws Exception {
        UnparsableOntologyException testSubject0 = new UnparsableOntologyException(_IRI,
                _Map, _OWLOntologyLoaderConfiguration);
        java.lang.String result0 = testSubject0.getMessage();
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getDocumentIRI();
        java.util.Map<org.semanticweb.owlapi.io.OWLParser, org.semanticweb.owlapi.io.OWLParserException> result2 = testSubject0
                .getExceptions();
        boolean result3 = UnparsableOntologyException.isIncludeStackTraceInMessage();
        UnparsableOntologyException.setIncludeStackTraceInMessage(_boolean);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result4 = testSubject0.fillInStackTrace();
        java.lang.Throwable result5 = testSubject0.getCause();
        java.lang.Throwable result6 = testSubject0.initCause(_Throwable);
        java.lang.String result7 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result9 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesWriterDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(WriterDocumentTarget.class));
    }

    public void verifyWriterDocumentTarget() throws Exception {
        WriterDocumentTarget testSubject0 = new WriterDocumentTarget(_Writer);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    

    public void verifyXMLUtils() throws Exception {
        XMLUtils testSubject0 = new XMLUtils();
        int result0 = XMLUtils.getNCNameSuffixIndex(_CharSequence);
        java.lang.String result1 = XMLUtils.getNCNamePrefix(_CharSequence);
        java.lang.String result2 = XMLUtils.getNCNameSuffix(_CharSequence);
        boolean result3 = XMLUtils.isXMLNameStartCharacter(_int);
        boolean result4 = XMLUtils.isXMLNameChar(_int);
        boolean result5 = XMLUtils.isNCNameStartChar(_int);
        boolean result6 = XMLUtils.isNCNameChar(_int);
        boolean result7 = XMLUtils.isNCName(_CharSequence);
        boolean result8 = XMLUtils.isQName(_CharSequence);
        boolean result9 = XMLUtils.hasNCNameSuffix(_CharSequence);
        java.lang.String result10 = XMLUtils.escapeXML(_CharSequence);
    }

    @Test
    public void enforceInterfacesZipDocumentTarget() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(ZipDocumentTarget.class));
    }

    public void verifyZipDocumentTarget() throws Exception {
        ZipDocumentTarget testSubject0 = new ZipDocumentTarget(_File);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    private boolean _boolean;
    private int _int;
    private java.io.File _File;
    private java.io.IOException _IOException;
    private java.io.InputStream _InputStream;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Reader _Reader;
    private java.io.Writer _Writer;
    private java.lang.CharSequence _CharSequence;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.net.URISyntaxException _URISyntaxException;
    private java.util.Map<org.semanticweb.owlapi.io.OWLParser, org.semanticweb.owlapi.io.OWLParserException> _Map;
    private java.util.Set<org.semanticweb.owlapi.io.RDFTriple> _Set;
    private org.semanticweb.owlapi.io.OWLObjectRenderer _OWLObjectRenderer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.io.OWLParserFactory _OWLParserFactory;
    private org.semanticweb.owlapi.io.RDFNode _RDFNode;
    private org.semanticweb.owlapi.io.RDFOntologyHeaderStatus _RDFOntologyHeaderStatus;
    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
    private org.semanticweb.owlapi.io.RDFResourceParseError _RDFResourceParseError;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLEntity _OWLEntity;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat _PrefixOWLOntologyFormat;
    private org.xml.sax.SAXException _SAXException;
}
