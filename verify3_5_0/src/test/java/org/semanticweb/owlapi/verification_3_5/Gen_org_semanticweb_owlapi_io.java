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
import OWLOntology;
import OWLOntologyChangeException;
import OWLOntologyFormat;
import OWLOntologyLoaderConfiguration;
import UnloadableImportException;

@SuppressWarnings({ "javadoc", "serial", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_io {

    @Test
    public void enforceInterfacesAbstractOWLParser()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class
                .isAssignableFrom(AbstractOWLParser.class));
    }

    public void verifyAbstractOWLParser()  {
        AbstractOWLParser testSubject0 = new AbstractOWLParser() {

            @Override
            public OWLOntologyFormat parse(
                    OWLOntologyDocumentSource documentSource,
                    OWLOntology ontology) throws OWLParserException,
                    IOException, OWLOntologyChangeException,
                    UnloadableImportException {
                return null;
            }

            @Override
            public OWLOntologyFormat parse(
                    OWLOntologyDocumentSource documentSource,
                    OWLOntology ontology,
                    OWLOntologyLoaderConfiguration configuration)
                    throws OWLParserException, IOException,
                    OWLOntologyChangeException, UnloadableImportException {
                return null;
            }
        };
        OWLOntologyFormat result0 = testSubject0
                .parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result1 = testSubject0
                .getOWLOntologyManager();
        OWLOntologyFormat result2 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result3 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology);
    }

    @Test
    public void enforceInterfacesAbstractOWLRenderer()  {
        assertTrue(org.semanticweb.owlapi.io.OWLRenderer.class
                .isAssignableFrom(AbstractOWLRenderer.class));
    }

    public void verifyAbstractOWLRenderer()  {
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
    public void enforceInterfacesDefaultOntologyFormat()  {
        assertTrue(org.semanticweb.owlapi.io.RDFXMLOntologyFormat.class
                .isAssignableFrom(DefaultOntologyFormat.class));
    }

    public void verifyDefaultOntologyFormat()  {
        DefaultOntologyFormat testSubject0 = new DefaultOntologyFormat();
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity,
                _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result5 = testSubject0.getPrefixNames();
        String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        String result8 = testSubject0.getDefaultPrefix();
        String result9 = testSubject0.getPrefixIRI(_IRI);
        IRI result10 = testSubject0
                .getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesFileDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(FileDocumentSource.class));
    }

    public void verifyFileDocumentSource()  {
        FileDocumentSource testSubject0 = new FileDocumentSource(_File);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
    }

    @Test
    public void enforceInterfacesFileDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(FileDocumentTarget.class));
    }

    public void verifyFileDocumentTarget()  {
        FileDocumentTarget testSubject0 = new FileDocumentTarget(_File);
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesGZipFileDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(GZipFileDocumentSource.class));
    }

    public void verifyGZipFileDocumentSource()  {
        GZipFileDocumentSource testSubject0 = new GZipFileDocumentSource(_File);
        GZipFileDocumentSource testSubject1 = new GZipFileDocumentSource(_File,
                _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
        IRI result5 = GZipFileDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesGZipFileDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(GZipFileDocumentTarget.class));
    }

    public void verifyGZipFileDocumentTarget()  {
        GZipFileDocumentTarget testSubject0 = new GZipFileDocumentTarget(_File);
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesGZipStreamDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(GZipStreamDocumentSource.class));
    }

    public void verifyGZipStreamDocumentSource()  {
        GZipStreamDocumentSource testSubject0 = new GZipStreamDocumentSource(
                _InputStream);
        GZipStreamDocumentSource testSubject1 = new GZipStreamDocumentSource(
                _InputStream, _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
        IRI result5 = GZipStreamDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesGZipStreamDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(GZipStreamDocumentTarget.class));
    }

    public void verifyGZipStreamDocumentTarget()  {
        GZipStreamDocumentTarget testSubject0 = new GZipStreamDocumentTarget(
                _OutputStream);
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    public void verifyIOProperties()  {
        IOProperties testSubject0 = IOProperties.getInstance();
        boolean result1 = testSubject0.isConnectionAcceptHTTPCompression();
        int result2 = testSubject0.getConnectionTimeout();
        testSubject0.setConnectionTimeout(_int);
        testSubject0.setConnectionAcceptHTTPCompression(_boolean);
    }

    @Test
    public void enforceInterfacesIRIDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(IRIDocumentSource.class));
    }

    public void verifyIRIDocumentSource()  {
        IRIDocumentSource testSubject0 = new IRIDocumentSource(_IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
    }

    @Test
    public void enforceInterfacesOntologyIRIMappingNotFoundException()
             {
        assertTrue(OWLOntologyCreationException.class
                .isAssignableFrom(OntologyIRIMappingNotFoundException.class));
    }

    public void verifyOntologyIRIMappingNotFoundException()  {
        OntologyIRIMappingNotFoundException testSubject0 = new OntologyIRIMappingNotFoundException(
                _IRI);
        IRI result0 = testSubject0
                .getOntologyIRI();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getMessage();
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxOntologyFormat()
             {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(OWLFunctionalSyntaxOntologyFormat.class));
    }

    public void verifyOWLFunctionalSyntaxOntologyFormat()  {
        OWLFunctionalSyntaxOntologyFormat testSubject0 = new OWLFunctionalSyntaxOntologyFormat();
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result0 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result1 = testSubject0.getPrefixNames();
        String result2 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        String result4 = testSubject0.getDefaultPrefix();
        String result5 = testSubject0.getPrefixIRI(_IRI);
        IRI result6 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result7 = testSubject0.getParameter(_Object, _Object);
        boolean result8 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result9 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result10 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    public void verifyInterfaceOWLObjectRenderer()  {
        OWLObjectRenderer testSubject0 = mock(OWLObjectRenderer.class);
        String result0 = testSubject0.render(_OWLObject);
        testSubject0.setShortFormProvider(_ShortFormProvider);
    }

    @Test
    public void enforceInterfacesOWLOntologyCreationIOException()
             {
        assertTrue(OWLOntologyCreationException.class
                .isAssignableFrom(OWLOntologyCreationIOException.class));
    }

    public void verifyOWLOntologyCreationIOException()  {
        OWLOntologyCreationIOException testSubject0 = new OWLOntologyCreationIOException(
                _IOException);
        Throwable result0 = testSubject0.getCause();
        java.io.IOException result1 = testSubject0.getCause();
        String result2 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.initCause(_Throwable);
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLOntologyDocumentSource()  {
        OWLOntologyDocumentSource testSubject0 = mock(OWLOntologyDocumentSource.class);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
    }

    public void verifyInterfaceOWLOntologyDocumentTarget()  {
        OWLOntologyDocumentTarget testSubject0 = mock(OWLOntologyDocumentTarget.class);
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesOWLOntologyInputSourceException()
             {
        assertTrue(OWLRuntimeException.class
                .isAssignableFrom(OWLOntologyInputSourceException.class));
    }

    public void verifyOWLOntologyInputSourceException()  {
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
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLOntologyLoaderMetaData()  {
        OWLOntologyLoaderMetaData testSubject0 = mock(OWLOntologyLoaderMetaData.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyStorageIOException()
             {
        assertTrue(OWLOntologyStorageException.class
                .isAssignableFrom(OWLOntologyStorageIOException.class));
    }

    public void verifyOWLOntologyStorageIOException()  {
        OWLOntologyStorageIOException testSubject0 = new OWLOntologyStorageIOException(
                _IOException);
        java.io.IOException result0 = testSubject0.getIOException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getMessage();
        String result5 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result7 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLParser()  {
        OWLParser testSubject0 = mock(OWLParser.class);
        OWLOntologyFormat result0 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result1 = testSubject0
                .parse(_IRI, _OWLOntology);
        OWLOntologyFormat result2 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOWLParserException()  {
        assertTrue(OWLRuntimeException.class
                .isAssignableFrom(OWLParserException.class));
    }

    public void verifyOWLParserException()  {
        OWLParserException testSubject0 = new OWLParserException(_Throwable);
        OWLParserException testSubject1 = new OWLParserException(_String, _int,
                _int);
        OWLParserException testSubject2 = new OWLParserException(_Throwable,
                _int, _int);
        OWLParserException testSubject3 = new OWLParserException(_String,
                _Throwable, _int, _int);
        OWLParserException testSubject4 = new OWLParserException();
        OWLParserException testSubject5 = new OWLParserException(_String);
        OWLParserException testSubject6 = new OWLParserException(_String,
                _Throwable);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLParserFactory()  {
        OWLParserFactory testSubject0 = mock(OWLParserFactory.class);
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    public void verifyOWLParserFactoryRegistry()  {
        OWLParserFactoryRegistry testSubject0 = OWLParserFactoryRegistry
                .getInstance();
        java.util.List<org.semanticweb.owlapi.io.OWLParserFactory> result1 = testSubject0
                .getParserFactories();
        testSubject0.registerParserFactory(_OWLParserFactory);
        testSubject0.clearParserFactories();
        testSubject0.unregisterParserFactory(_OWLParserFactory);
    }

    @Test
    public void enforceInterfacesOWLParserIOException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLParserIOException.class));
    }

    public void verifyOWLParserIOException()  {
        OWLParserIOException testSubject0 = new OWLParserIOException(
                _IOException);
        Throwable result0 = testSubject0.getCause();
        java.io.IOException result1 = testSubject0.getCause();
        String result2 = testSubject0.getMessage();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result5 = testSubject0.fillInStackTrace();
        Throwable result6 = testSubject0.initCause(_Throwable);
        String result7 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result9 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLParserSAXException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLParserSAXException.class));
    }

    public void verifyOWLParserSAXException()  {
        OWLParserSAXException testSubject0 = new OWLParserSAXException(
                _SAXException);
        org.xml.sax.SAXException result0 = testSubject0.getCause();
        Throwable result1 = testSubject0.getCause();
        String result2 = testSubject0.getMessage();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result5 = testSubject0.fillInStackTrace();
        Throwable result6 = testSubject0.initCause(_Throwable);
        String result7 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result9 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLParserURISyntaxException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLParserURISyntaxException.class));
    }

    public void verifyOWLParserURISyntaxException()  {
        OWLParserURISyntaxException testSubject0 = new OWLParserURISyntaxException(
                _URISyntaxException, _int, _int);
        java.net.URISyntaxException result0 = testSubject0.getCause();
        Throwable result1 = testSubject0.getCause();
        String result2 = testSubject0.getMessage();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result5 = testSubject0.fillInStackTrace();
        Throwable result6 = testSubject0.initCause(_Throwable);
        String result7 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result9 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLRenderer()  {
        OWLRenderer testSubject0 = mock(OWLRenderer.class);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOWLRendererException()  {
        assertTrue(OWLOntologyStorageException.class
                .isAssignableFrom(OWLRendererException.class));
    }

    public void verifyOWLRendererException()  {
        OWLRendererException testSubject0 = new OWLRendererException(_String);
        OWLRendererException testSubject1 = new OWLRendererException(_String,
                _Throwable);
        OWLRendererException testSubject2 = new OWLRendererException(_Throwable);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRendererIOException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLRendererException.class
                .isAssignableFrom(OWLRendererIOException.class));
    }

    public void verifyOWLRendererIOException()  {
        OWLRendererIOException testSubject0 = new OWLRendererIOException(
                _IOException);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLXMLOntologyFormat()  {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(OWLXMLOntologyFormat.class));
    }

    public void verifyOWLXMLOntologyFormat()  {
        OWLXMLOntologyFormat testSubject0 = new OWLXMLOntologyFormat();
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result0 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result1 = testSubject0.getPrefixNames();
        String result2 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        String result4 = testSubject0.getDefaultPrefix();
        String result5 = testSubject0.getPrefixIRI(_IRI);
        IRI result6 = testSubject0.getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result7 = testSubject0.getParameter(_Object, _Object);
        boolean result8 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result9 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result10 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesRDFLiteral()  {
        assertTrue(org.semanticweb.owlapi.io.RDFNode.class
                .isAssignableFrom(RDFLiteral.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(RDFLiteral.class));
    }

    public void verifyRDFLiteral()  {
        RDFLiteral testSubject0 = new RDFLiteral(_OWLLiteral);
        OWLLiteral result0 = testSubject0
                .getLiteral();
        boolean result1 = testSubject0.isLiteral();
    }

    public void verifyRDFNode()  {
        RDFNode testSubject0 = new RDFNode() {

            @Override
            public boolean isLiteral() {
                return false;
            }
        };
        boolean result0 = testSubject0.isLiteral();
    }

    @Test
    public void enforceInterfacesRDFOntologyFormat()  {
        assertTrue(org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat.class
                .isAssignableFrom(RDFOntologyFormat.class));
    }

    public void verifyRDFOntologyFormat()  {
        RDFOntologyFormat testSubject0 = new RDFOntologyFormat() {};
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity,
                _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result5 = testSubject0.getPrefixNames();
        String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        String result8 = testSubject0.getDefaultPrefix();
        String result9 = testSubject0.getPrefixIRI(_IRI);
        IRI result10 = testSubject0
                .getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesRDFOntologyHeaderStatus()  {
        assertTrue(Enum.class.isAssignableFrom(RDFOntologyHeaderStatus.class));
    }

    public void verifyEnumRDFOntologyHeaderStatus()  {
        RDFOntologyHeaderStatus testSubject0 = RDFOntologyHeaderStatus.PARSED_ZERO_HEADERS;
        RDFOntologyHeaderStatus testSubject1 = RDFOntologyHeaderStatus.PARSED_ONE_HEADER;
        RDFOntologyHeaderStatus testSubject2 = RDFOntologyHeaderStatus.PARSED_MULTIPLE_HEADERS;
    }

    @Test
    public void enforceInterfacesRDFParserMetaData()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData.class
                .isAssignableFrom(RDFParserMetaData.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(RDFParserMetaData.class));
    }

    public void verifyRDFParserMetaData()  {
        RDFParserMetaData testSubject0 = new RDFParserMetaData(
                _RDFOntologyHeaderStatus, _int, _Set);
        int result0 = testSubject0.getTripleCount();
        org.semanticweb.owlapi.io.RDFOntologyHeaderStatus result1 = testSubject0
                .getHeaderState();
        java.util.Set<org.semanticweb.owlapi.io.RDFTriple> result2 = testSubject0
                .getUnparsedTriples();
    }

    @Test
    public void enforceInterfacesRDFResource()  {
        assertTrue(org.semanticweb.owlapi.io.RDFNode.class
                .isAssignableFrom(RDFResource.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(RDFResource.class));
    }

    public void verifyRDFResource()  {
        RDFResource testSubject0 = new RDFResource(_IRI, _boolean);
        RDFResource testSubject1 = new RDFResource(_IRI);
        IRI result0 = testSubject0.getResource();
        boolean result1 = testSubject0.isLiteral();
        boolean result2 = testSubject0.isAnonymous();
    }

    public void verifyRDFResourceParseError()  {
        RDFResourceParseError testSubject0 = new RDFResourceParseError(
                _OWLEntity, _RDFNode, _Set);
        OWLEntity result0 = testSubject0
                .getParserGeneratedErrorEntity();
        org.semanticweb.owlapi.io.RDFNode result1 = testSubject0.getMainNode();
        java.util.Set<org.semanticweb.owlapi.io.RDFTriple> result2 = testSubject0
                .getMainNodeTriples();
    }

    @Test
    public void enforceInterfacesRDFTriple()  {
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFTriple.class));
    }

    public void verifyRDFTriple()  {
        RDFTriple testSubject0 = new RDFTriple(_IRI, _boolean, _IRI, _boolean,
                _OWLLiteral);
        RDFTriple testSubject1 = new RDFTriple(_IRI, _boolean, _IRI, _boolean,
                _IRI, _boolean);
        RDFTriple testSubject2 = new RDFTriple(_RDFResource, _RDFResource,
                _RDFNode);
        org.semanticweb.owlapi.io.RDFNode result0 = testSubject0.getObject();
        org.semanticweb.owlapi.io.RDFResource result1 = testSubject0
                .getSubject();
        org.semanticweb.owlapi.io.RDFResource result2 = testSubject0
                .getPredicate();
    }

    @Test
    public void enforceInterfacesRDFXMLOntologyFormat()  {
        assertTrue(org.semanticweb.owlapi.io.RDFOntologyFormat.class
                .isAssignableFrom(RDFXMLOntologyFormat.class));
    }

    public void verifyRDFXMLOntologyFormat()  {
        RDFXMLOntologyFormat testSubject0 = new RDFXMLOntologyFormat();
        org.semanticweb.owlapi.io.RDFParserMetaData result0 = testSubject0
                .getOntologyLoaderMetaData();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result1 = testSubject0
                .getOntologyLoaderMetaData();
        boolean result2 = testSubject0.isAddMissingTypes();
        boolean result3 = RDFOntologyFormat.isMissingType(_OWLEntity,
                _OWLOntology);
        testSubject0.setAddMissingTypes(_boolean);
        testSubject0.addError(_RDFResourceParseError);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clearPrefixes();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result4 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<String> result5 = testSubject0.getPrefixNames();
        String result6 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result7 = testSubject0.containsPrefixMapping(_String);
        String result8 = testSubject0.getDefaultPrefix();
        String result9 = testSubject0.getPrefixIRI(_IRI);
        IRI result10 = testSubject0
                .getIRI(_String);
        testSubject0.setParameter(_Object, _Object);
        Object result11 = testSubject0.getParameter(_Object, _Object);
        boolean result12 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result13 = testSubject0
                .asPrefixOWLOntologyFormat();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesReaderDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(ReaderDocumentSource.class));
    }

    public void verifyReaderDocumentSource()  {
        ReaderDocumentSource testSubject0 = new ReaderDocumentSource(_Reader,
                _IRI);
        ReaderDocumentSource testSubject1 = new ReaderDocumentSource(_Reader);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
        IRI result5 = ReaderDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesStreamDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(StreamDocumentSource.class));
    }

    public void verifyStreamDocumentSource()  {
        StreamDocumentSource testSubject0 = new StreamDocumentSource(
                _InputStream);
        StreamDocumentSource testSubject1 = new StreamDocumentSource(
                _InputStream, _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
        IRI result5 = StreamDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesStreamDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(StreamDocumentTarget.class));
    }

    public void verifyStreamDocumentTarget()  {
        StreamDocumentTarget testSubject0 = new StreamDocumentTarget(
                _OutputStream);
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesStringDocumentSource()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class
                .isAssignableFrom(StringDocumentSource.class));
    }

    public void verifyStringDocumentSource()  {
        StringDocumentSource testSubject0 = new StringDocumentSource(_String);
        StringDocumentSource testSubject1 = new StringDocumentSource(_String,
                _IRI);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0
                .getDocumentIRI();
        IRI result5 = StringDocumentSource
                .getNextDocumentIRI();
    }

    @Test
    public void enforceInterfacesStringDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(StringDocumentTarget.class));
    }

    public void verifyStringDocumentTarget()  {
        StringDocumentTarget testSubject0 = new StringDocumentTarget();
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesSystemOutDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(SystemOutDocumentTarget.class));
    }

    public void verifySystemOutDocumentTarget()  {
        SystemOutDocumentTarget testSubject0 = new SystemOutDocumentTarget();
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    public void verifyToStringRenderer()  {
        ToStringRenderer testSubject0 = ToStringRenderer.getInstance();
        testSubject0.setShortFormProvider(_ShortFormProvider);
        org.semanticweb.owlapi.io.OWLObjectRenderer result1 = testSubject0
                .getRenderer();
        testSubject0.setRenderer(_OWLObjectRenderer);
        String result2 = testSubject0.getRendering(_OWLObject);
    }

    @Test
    public void enforceInterfacesUnparsableOntologyException()  {
        assertTrue(OWLOntologyCreationException.class
                .isAssignableFrom(UnparsableOntologyException.class));
    }

    public void verifyUnparsableOntologyException()  {
        UnparsableOntologyException testSubject0 = new UnparsableOntologyException(
                _IRI, _Map, _OWLOntologyLoaderConfiguration);
        String result0 = testSubject0.getMessage();
        IRI result1 = testSubject0
                .getDocumentIRI();
        java.util.Map<org.semanticweb.owlapi.io.OWLParser, org.semanticweb.owlapi.io.OWLParserException> result2 = testSubject0
                .getExceptions();
        boolean result3 = UnparsableOntologyException
                .isIncludeStackTraceInMessage();
        UnparsableOntologyException.setIncludeStackTraceInMessage(_boolean);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result4 = testSubject0.fillInStackTrace();
        Throwable result5 = testSubject0.getCause();
        Throwable result6 = testSubject0.initCause(_Throwable);
        String result7 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result8 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result9 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesWriterDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(WriterDocumentTarget.class));
    }

    public void verifyWriterDocumentTarget()  {
        WriterDocumentTarget testSubject0 = new WriterDocumentTarget(_Writer);
        IRI result0 = testSubject0
                .getDocumentIRI();
        boolean result1 = testSubject0.isWriterAvailable();
        java.io.Writer result2 = testSubject0.getWriter();
        boolean result3 = testSubject0.isOutputStreamAvailable();
        boolean result4 = testSubject0.isDocumentIRIAvailable();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    public void verifyXMLUtils()  {
        XMLUtils testSubject0 = new XMLUtils();
        int result0 = XMLUtils.getNCNameSuffixIndex(_CharSequence);
        String result1 = XMLUtils.getNCNamePrefix(_CharSequence);
        String result2 = XMLUtils.getNCNameSuffix(_CharSequence);
        boolean result3 = XMLUtils.isXMLNameStartCharacter(_int);
        boolean result4 = XMLUtils.isXMLNameChar(_int);
        boolean result5 = XMLUtils.isNCNameStartChar(_int);
        boolean result6 = XMLUtils.isNCNameChar(_int);
        boolean result7 = XMLUtils.isNCName(_CharSequence);
        boolean result8 = XMLUtils.isQName(_CharSequence);
        boolean result9 = XMLUtils.hasNCNameSuffix(_CharSequence);
        String result10 = XMLUtils.escapeXML(_CharSequence);
    }

    @Test
    public void enforceInterfacesZipDocumentTarget()  {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class
                .isAssignableFrom(ZipDocumentTarget.class));
    }

    public void verifyZipDocumentTarget()  {
        ZipDocumentTarget testSubject0 = new ZipDocumentTarget(_File);
        IRI result0 = testSubject0
                .getDocumentIRI();
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
    private CharSequence _CharSequence;
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
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
    private IRI _IRI;
    private OWLEntity _OWLEntity;
    private OWLLiteral _OWLLiteral;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat _PrefixOWLOntologyFormat;
    private org.xml.sax.SAXException _SAXException;
}
