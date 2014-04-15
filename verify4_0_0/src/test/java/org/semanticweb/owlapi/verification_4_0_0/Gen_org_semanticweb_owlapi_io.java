package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "resource", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_io {
    @Test
    public void enforceInterfacesAbstractOWLParser() {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class.isAssignableFrom(AbstractOWLParser.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(AbstractOWLParser.class));
    }

    public void verifyAbstractOWLParser() throws OWLParserException, UnloadableImportException, IOException {
        AbstractOWLParser testSubject0 = mock(AbstractOWLParser.class);
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyFormat result1 = testSubject0.parse(_IRI, _OWLOntology);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result2 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result3 = testSubject0.getSupportedFormats();
        OWLOntologyFormat result4 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result5 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
    }

    @Test
    public void enforceInterfacesAbstractOWLRenderer() {
        assertTrue(org.semanticweb.owlapi.io.OWLRenderer.class.isAssignableFrom(AbstractOWLRenderer.class));
    }

    public void verifyAbstractOWLRenderer() throws OWLRendererException {
        AbstractOWLRenderer testSubject0 = mock(AbstractOWLRenderer.class);
        testSubject0.render(_OWLOntology, _OutputStream);
        testSubject0.render(_OWLOntology, _Writer);
    }

    @Test
    public void enforceInterfacesFileDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.class.isAssignableFrom(FileDocumentSource.class));
    }

    public void verifyFileDocumentSource() {
        FileDocumentSource testSubject0 = new FileDocumentSource(_File, _OWLOntologyFormat, _String);
        FileDocumentSource testSubject1 = new FileDocumentSource(_File, _OWLOntologyFormat);
        FileDocumentSource testSubject2 = new FileDocumentSource(_File);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result5 = testSubject0.getFormat();
        boolean result6 = testSubject0.isFormatKnown();
        java.lang.String result7 = testSubject0.getMIMEType();
        boolean result8 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesFileDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(FileDocumentTarget.class));
    }

    public void verifyFileDocumentTarget() throws IOException {
        FileDocumentTarget testSubject0 = new FileDocumentTarget(_File);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesGZipFileDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.class.isAssignableFrom(GZipFileDocumentSource.class));
    }

    public void verifyGZipFileDocumentSource() {
        GZipFileDocumentSource testSubject0 = new GZipFileDocumentSource(_File);
        GZipFileDocumentSource testSubject1 = new GZipFileDocumentSource(_File, _IRI, _OWLOntologyFormat, _String);
        java.io.InputStream result0 = testSubject0.getInputStream();
        IRI result1 = GZipFileDocumentSource.getNextDocumentIRI();
        boolean result2 = testSubject0.isReaderAvailable();
        java.io.Reader result3 = testSubject0.getReader();
        boolean result4 = testSubject0.isInputStreamAvailable();
        IRI result5 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result6 = testSubject0.getFormat();
        boolean result7 = testSubject0.isFormatKnown();
        java.lang.String result8 = testSubject0.getMIMEType();
        boolean result9 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesGZipFileDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(GZipFileDocumentTarget.class));
    }

    public void verifyGZipFileDocumentTarget() {
        GZipFileDocumentTarget testSubject0 = new GZipFileDocumentTarget(_File);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesGZipStreamDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.class.isAssignableFrom(GZipStreamDocumentSource.class));
    }

    public void verifyGZipStreamDocumentSource() {
        GZipStreamDocumentSource testSubject0 = new GZipStreamDocumentSource(_InputStream, _IRI, _OWLOntologyFormat, _String);
        GZipStreamDocumentSource testSubject1 = new GZipStreamDocumentSource(_InputStream);
        java.io.InputStream result0 = testSubject0.getInputStream();
        IRI result1 = GZipStreamDocumentSource.getNextDocumentIRI();
        boolean result2 = testSubject0.isReaderAvailable();
        java.io.Reader result3 = testSubject0.getReader();
        boolean result4 = testSubject0.isInputStreamAvailable();
        IRI result5 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result6 = testSubject0.getFormat();
        boolean result7 = testSubject0.isFormatKnown();
        java.lang.String result8 = testSubject0.getMIMEType();
        boolean result9 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesGZipStreamDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(GZipStreamDocumentTarget.class));
    }

    public void verifyGZipStreamDocumentTarget() {
        GZipStreamDocumentTarget testSubject0 = new GZipStreamDocumentTarget(_OutputStream);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesIRIDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.class.isAssignableFrom(IRIDocumentSource.class));
    }

    public void verifyIRIDocumentSource() {
        IRIDocumentSource testSubject0 = new IRIDocumentSource(_IRI, _OWLOntologyFormat, _String);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result5 = testSubject0.getFormat();
        boolean result6 = testSubject0.isFormatKnown();
        java.lang.String result7 = testSubject0.getMIMEType();
        boolean result8 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesOntologyIRIMappingNotFoundException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(OntologyIRIMappingNotFoundException.class));
    }

    public void verifyOntologyIRIMappingNotFoundException() {
        OntologyIRIMappingNotFoundException testSubject0 = new OntologyIRIMappingNotFoundException(_IRI);
        IRI result0 = testSubject0.getOntologyIRI();
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

    public void verifyInterfaceOWLObjectRenderer() {
        OWLObjectRenderer testSubject0 = mock(OWLObjectRenderer.class);
        testSubject0.setShortFormProvider(_ShortFormProvider);
        java.lang.String result0 = testSubject0.render(_OWLObject);
    }

    @Test
    public void enforceInterfacesOWLOntologyCreationIOException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(OWLOntologyCreationIOException.class));
    }

    public void verifyOWLOntologyCreationIOException() {
        OWLOntologyCreationIOException testSubject0 = new OWLOntologyCreationIOException(_IOException);
        java.lang.String result0 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceOWLOntologyDocumentSource() {
        OWLOntologyDocumentSource testSubject0 = mock(OWLOntologyDocumentSource.class);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result5 = testSubject0.getFormat();
        boolean result6 = testSubject0.isFormatKnown();
        java.lang.String result7 = testSubject0.getMIMEType();
        boolean result8 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesOWLOntologyDocumentSourceBase() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSource.class.isAssignableFrom(OWLOntologyDocumentSourceBase.class));
    }

    public void verifyOWLOntologyDocumentSourceBase() {
        OWLOntologyDocumentSourceBase testSubject0 = mock(OWLOntologyDocumentSourceBase.class);
        OWLOntologyFormat result0 = testSubject0.getFormat();
        boolean result1 = testSubject0.isFormatKnown();
        java.lang.String result2 = testSubject0.getMIMEType();
        boolean result3 = testSubject0.isMIMETypeKnown();
        java.io.InputStream result4 = testSubject0.getInputStream();
        boolean result5 = testSubject0.isReaderAvailable();
        java.io.Reader result6 = testSubject0.getReader();
        boolean result7 = testSubject0.isInputStreamAvailable();
        IRI result8 = testSubject0.getDocumentIRI();
    }

    public void verifyInterfaceOWLOntologyDocumentTarget() throws IOException {
        OWLOntologyDocumentTarget testSubject0 = mock(OWLOntologyDocumentTarget.class);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesOWLOntologyInputSourceException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLOntologyInputSourceException.class));
    }

    public void verifyOWLOntologyInputSourceException() {
        OWLOntologyInputSourceException testSubject0 = new OWLOntologyInputSourceException(_String, _Throwable);
        OWLOntologyInputSourceException testSubject1 = new OWLOntologyInputSourceException(_String);
        OWLOntologyInputSourceException testSubject2 = new OWLOntologyInputSourceException(_Throwable);
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

    public void verifyInterfaceOWLOntologyLoaderMetaData() {
        OWLOntologyLoaderMetaData testSubject0 = mock(OWLOntologyLoaderMetaData.class);
    }

    @Test
    public void enforceInterfacesOWLOntologyStorageIOException() {
        assertTrue(OWLOntologyStorageException.class.isAssignableFrom(OWLOntologyStorageIOException.class));
    }

    public void verifyOWLOntologyStorageIOException() {
        OWLOntologyStorageIOException testSubject0 = new OWLOntologyStorageIOException(_IOException);
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

    public void verifyInterfaceOWLParser() throws OWLParserException, OWLOntologyChangeException, UnloadableImportException, IOException {
        OWLParser testSubject0 = mock(OWLParser.class);
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyFormat result1 = testSubject0.parse(_IRI, _OWLOntology);
        OWLOntologyFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result3 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result4 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result5 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesOWLParserException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLParserException.class));
    }

    public void verifyOWLParserException() {
        OWLParserException testSubject0 = new OWLParserException(_Throwable);
        OWLParserException testSubject1 = new OWLParserException(_String, _int, _int);
        OWLParserException testSubject2 = new OWLParserException(_Throwable, _int, _int);
        OWLParserException testSubject3 = new OWLParserException(_String, _Throwable, _int, _int);
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

    @Test
    public void enforceInterfacesOWLParserFactory() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLParserFactory.class));
        assertTrue(javax.inject.Provider.class.isAssignableFrom(OWLParserFactory.class));
        assertTrue(MIMETypeAware.class.isAssignableFrom(OWLParserFactory.class));
    }

    public void verifyInterfaceOWLParserFactory() {
        OWLParserFactory testSubject0 = mock(OWLParserFactory.class);
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0.createParser();
        java.util.Set<OWLOntologyFormatFactory> result1 = testSubject0.getSupportedFormats();
        java.lang.Object result2 = testSubject0.get();
        java.lang.String result3 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result4 = testSubject0.getMIMETypes();
        boolean result5 = testSubject0.handlesMimeType(_String);
    }

    @Test
    public void enforceInterfacesOWLParserFactoryImpl() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(OWLParserFactoryImpl.class));
    }

    public void verifyOWLParserFactoryImpl() {
        OWLParserFactoryImpl<OWLParser> testSubject0 = new OWLParserFactoryImpl<OWLParser>(OWLParser.class);
        java.lang.Object result0 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result1 = testSubject0.get();
        org.semanticweb.owlapi.io.OWLParser result2 = testSubject0.createParser();
        java.lang.String result3 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result4 = testSubject0.getMIMETypes();
        boolean result5 = testSubject0.handlesMimeType(_String);
        java.util.Set<OWLOntologyFormatFactory> result6 = testSubject0.getSupportedFormats();
    }

    public void verifyInterfaceOWLRenderer() throws OWLException {
        OWLRenderer testSubject0 = mock(OWLRenderer.class);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOWLRendererException() {
        assertTrue(OWLOntologyStorageException.class.isAssignableFrom(OWLRendererException.class));
    }

    public void verifyOWLRendererException() {
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
    public void enforceInterfacesOWLRendererIOException() {
        assertTrue(org.semanticweb.owlapi.io.OWLRendererException.class.isAssignableFrom(OWLRendererIOException.class));
    }

    public void verifyOWLRendererIOException() {
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
    public void enforceInterfacesRDFLiteral() {
        assertTrue(org.semanticweb.owlapi.io.RDFNode.class.isAssignableFrom(RDFLiteral.class));
    }

    public void verifyRDFLiteral() {
        RDFLiteral testSubject0 = new RDFLiteral(_String, _String, _IRI);
        RDFLiteral testSubject1 = new RDFLiteral(_OWLLiteral);
        int result0 = testSubject0.compareTo(_RDFNode);
        IRI result2 = testSubject0.getIRI();
        boolean result3 = testSubject0.isAnonymous();
        boolean result4 = testSubject0.isPlainLiteral();
        java.lang.String result5 = testSubject0.getLang();
        IRI result6 = testSubject0.getDatatype();
        boolean result7 = testSubject0.isLiteral();
        java.lang.String result8 = testSubject0.getLexicalValue();
        boolean result9 = testSubject0.hasLang();
    }

    @Test
    public void enforceInterfacesRDFNode() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFNode.class));
        assertTrue(java.lang.Comparable.class.isAssignableFrom(RDFNode.class));
        assertTrue(HasIRI.class.isAssignableFrom(RDFNode.class));
    }

    public void verifyRDFNode() {
        RDFNode testSubject0 = mock(RDFNode.class);
        boolean result0 = testSubject0.isAnonymous();
        boolean result1 = testSubject0.isLiteral();
        int result2 = testSubject0.compareTo(_RDFNode);
        IRI result3 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesRDFOntologyHeaderStatus() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(RDFOntologyHeaderStatus.class));
    }

    public void verifyEnumRDFOntologyHeaderStatus() {
        RDFOntologyHeaderStatus testSubject0 = RDFOntologyHeaderStatus.PARSED_ZERO_HEADERS;
        RDFOntologyHeaderStatus testSubject1 = RDFOntologyHeaderStatus.PARSED_ONE_HEADER;
        RDFOntologyHeaderStatus testSubject2 = RDFOntologyHeaderStatus.PARSED_MULTIPLE_HEADERS;
    }

    @Test
    public void enforceInterfacesRDFParserMetaData() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData.class.isAssignableFrom(RDFParserMetaData.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFParserMetaData.class));
    }

    public void verifyRDFParserMetaData() {
        RDFParserMetaData testSubject0 = new RDFParserMetaData(_RDFOntologyHeaderStatus, _int, _Set);
        int result0 = testSubject0.getTripleCount();
        org.semanticweb.owlapi.io.RDFOntologyHeaderStatus result1 = testSubject0.getHeaderState();
        java.util.Set<org.semanticweb.owlapi.io.RDFTriple> result2 = testSubject0.getUnparsedTriples();
    }

    @Test
    public void enforceInterfacesRDFResource() {
        assertTrue(org.semanticweb.owlapi.io.RDFNode.class.isAssignableFrom(RDFResource.class));
    }

    public void verifyRDFResource() {
        RDFResource testSubject0 = mock(RDFResource.class);
        int result1 = testSubject0.compareTo(_RDFNode);
        IRI result2 = testSubject0.getResource();
        boolean result3 = testSubject0.isAnonymous();
        boolean result4 = testSubject0.isLiteral();
        IRI result5 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesRDFResourceBlankNode() {
        assertTrue(org.semanticweb.owlapi.io.RDFResource.class.isAssignableFrom(RDFResourceBlankNode.class));
    }

    public void verifyRDFResourceBlankNode() {
        RDFResourceBlankNode testSubject0 = new RDFResourceBlankNode(_IRI);
        RDFResourceBlankNode testSubject1 = new RDFResourceBlankNode(_int);
        IRI result0 = testSubject0.getResource();
        IRI result1 = testSubject0.getIRI();
        boolean result2 = testSubject0.isAnonymous();
        boolean result3 = testSubject0.isLiteral();
        int result5 = testSubject0.compareTo(_RDFNode);
    }

    @Test
    public void enforceInterfacesRDFResourceIRI() {
        assertTrue(org.semanticweb.owlapi.io.RDFResource.class.isAssignableFrom(RDFResourceIRI.class));
    }

    public void verifyRDFResourceIRI() {
        RDFResourceIRI testSubject0 = new RDFResourceIRI(_IRI);
        IRI result0 = testSubject0.getResource();
        IRI result1 = testSubject0.getIRI();
        boolean result2 = testSubject0.isAnonymous();
        boolean result3 = testSubject0.isLiteral();
        int result5 = testSubject0.compareTo(_RDFNode);
    }

    public void verifyRDFResourceParseError() {
        RDFResourceParseError testSubject0 = new RDFResourceParseError(_OWLEntity, _RDFNode, _Set);
        OWLEntity result0 = testSubject0.getParserGeneratedErrorEntity();
        org.semanticweb.owlapi.io.RDFNode result1 = testSubject0.getMainNode();
        java.util.Set<org.semanticweb.owlapi.io.RDFTriple> result2 = testSubject0.getMainNodeTriples();
    }

    @Test
    public void enforceInterfacesRDFTriple() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(RDFTriple.class));
        assertTrue(java.lang.Comparable.class.isAssignableFrom(RDFTriple.class));
    }

    public void verifyRDFTriple() {
        RDFTriple testSubject0 = new RDFTriple(_IRI, _boolean, _IRI, _IRI, _boolean);
        RDFTriple testSubject1 = new RDFTriple(_RDFResource, _RDFResourceIRI, _RDFNode);
        RDFTriple testSubject2 = new RDFTriple(_IRI, _boolean, _IRI, _OWLLiteral);
        int result0 = testSubject0.compareTo(_RDFTriple);
        org.semanticweb.owlapi.io.RDFNode result2 = testSubject0.getObject();
        org.semanticweb.owlapi.io.RDFResource result3 = testSubject0.getSubject();
        org.semanticweb.owlapi.io.RDFResourceIRI result4 = testSubject0.getPredicate();
    }

    @Test
    public void enforceInterfacesReaderDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.StreamDocumentSourceBase.class.isAssignableFrom(ReaderDocumentSource.class));
    }

    public void verifyReaderDocumentSource() {
        ReaderDocumentSource testSubject0 = new ReaderDocumentSource(_Reader);
        ReaderDocumentSource testSubject1 = new ReaderDocumentSource(_Reader, _IRI, _OWLOntologyFormat, _String);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result5 = testSubject0.getFormat();
        boolean result6 = testSubject0.isFormatKnown();
        java.lang.String result7 = testSubject0.getMIMEType();
        boolean result8 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesStreamDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.StreamDocumentSourceBase.class.isAssignableFrom(StreamDocumentSource.class));
    }

    public void verifyStreamDocumentSource() {
        StreamDocumentSource testSubject0 = new StreamDocumentSource(_InputStream);
        StreamDocumentSource testSubject1 = new StreamDocumentSource(_InputStream, _IRI, _OWLOntologyFormat, _String);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result5 = testSubject0.getFormat();
        boolean result6 = testSubject0.isFormatKnown();
        java.lang.String result7 = testSubject0.getMIMEType();
        boolean result8 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesStreamDocumentSourceBase() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.class.isAssignableFrom(StreamDocumentSourceBase.class));
    }

    public void verifyStreamDocumentSourceBase() {
        StreamDocumentSourceBase testSubject0 = mock(StreamDocumentSourceBase.class);
        java.io.InputStream result0 = testSubject0.getInputStream();
        boolean result1 = testSubject0.isReaderAvailable();
        java.io.Reader result2 = testSubject0.getReader();
        boolean result3 = testSubject0.isInputStreamAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result5 = testSubject0.getFormat();
        boolean result6 = testSubject0.isFormatKnown();
        java.lang.String result7 = testSubject0.getMIMEType();
        boolean result8 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesStreamDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(StreamDocumentTarget.class));
    }

    public void verifyStreamDocumentTarget() {
        StreamDocumentTarget testSubject0 = new StreamDocumentTarget(_OutputStream);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesStringDocumentSource() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase.class.isAssignableFrom(StringDocumentSource.class));
    }

    public void verifyStringDocumentSource() {
        StringDocumentSource testSubject0 = new StringDocumentSource(_String, _IRI, _OWLOntologyFormat, _String);
        StringDocumentSource testSubject1 = new StringDocumentSource(_String);
        StringDocumentSource testSubject2 = new StringDocumentSource(_StringDocumentTarget);
        java.io.InputStream result0 = testSubject0.getInputStream();
        IRI result1 = StringDocumentSource.getNextDocumentIRI();
        boolean result2 = testSubject0.isReaderAvailable();
        java.io.Reader result3 = testSubject0.getReader();
        boolean result4 = testSubject0.isInputStreamAvailable();
        IRI result5 = testSubject0.getDocumentIRI();
        OWLOntologyFormat result6 = testSubject0.getFormat();
        boolean result7 = testSubject0.isFormatKnown();
        java.lang.String result8 = testSubject0.getMIMEType();
        boolean result9 = testSubject0.isMIMETypeKnown();
    }

    @Test
    public void enforceInterfacesStringDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(StringDocumentTarget.class));
    }

    public void verifyStringDocumentTarget() {
        StringDocumentTarget testSubject0 = new StringDocumentTarget();
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    @Test
    public void enforceInterfacesSystemOutDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(SystemOutDocumentTarget.class));
    }

    public void verifySystemOutDocumentTarget() throws IOException {
        SystemOutDocumentTarget testSubject0 = new SystemOutDocumentTarget();
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    public void verifyToStringRenderer() {
        ToStringRenderer testSubject0 = ToStringRenderer.getInstance();
        testSubject0.setShortFormProvider(_ShortFormProvider);
        testSubject0.setRenderer(_OWLObjectRenderer);
        java.lang.String result1 = testSubject0.getRendering(_OWLObject);
    }

    @Test
    public void enforceInterfacesUnparsableOntologyException() {
        assertTrue(OWLOntologyCreationException.class.isAssignableFrom(UnparsableOntologyException.class));
    }

    public void verifyUnparsableOntologyException() {
        UnparsableOntologyException testSubject0 = new UnparsableOntologyException(_IRI, _Map, _OWLOntologyLoaderConfiguration);
        java.lang.String result0 = testSubject0.getMessage();
        java.util.Map<org.semanticweb.owlapi.io.OWLParser, org.semanticweb.owlapi.io.OWLParserException> result1 = testSubject0.getExceptions();
        IRI result2 = testSubject0.getDocumentIRI();
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

    @Test
    public void enforceInterfacesWriterDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(WriterDocumentTarget.class));
    }

    public void verifyWriterDocumentTarget() {
        WriterDocumentTarget testSubject0 = new WriterDocumentTarget(_Writer);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
        java.io.OutputStream result5 = testSubject0.getOutputStream();
    }

    public void verifyXMLUtils() {
        XMLUtils testSubject0 = new XMLUtils();
        boolean result0 = XMLUtils.isXMLNameStartCharacter(_int);
        boolean result1 = XMLUtils.isXMLNameChar(_int);
        boolean result2 = XMLUtils.isNCNameStartChar(_int);
        boolean result3 = XMLUtils.isNCNameChar(_int);
        boolean result4 = XMLUtils.isNCName(_CharSequence);
        boolean result5 = XMLUtils.isNullOrEmpty(_CharSequence);
        boolean result6 = XMLUtils.isQName(_CharSequence);
        boolean result7 = XMLUtils.hasNCNameSuffix(_CharSequence);
        java.lang.String result8 = XMLUtils.escapeXML(_CharSequence);
        int result9 = XMLUtils.getNCNameSuffixIndex(_CharSequence);
        java.lang.String result10 = XMLUtils.getNCNamePrefix(_CharSequence);
        java.lang.String result11 = XMLUtils.getNCNameSuffix(_CharSequence);
    }

    @Test
    public void enforceInterfacesZipDocumentTarget() {
        assertTrue(org.semanticweb.owlapi.io.OWLOntologyDocumentTarget.class.isAssignableFrom(ZipDocumentTarget.class));
    }

    public void verifyZipDocumentTarget() throws IOException {
        ZipDocumentTarget testSubject0 = new ZipDocumentTarget(_File);
        java.io.Writer result0 = testSubject0.getWriter();
        boolean result1 = testSubject0.isWriterAvailable();
        boolean result2 = testSubject0.isOutputStreamAvailable();
        boolean result3 = testSubject0.isDocumentIRIAvailable();
        IRI result4 = testSubject0.getDocumentIRI();
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
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Map<org.semanticweb.owlapi.io.OWLParser, org.semanticweb.owlapi.io.OWLParserException> _Map;
    private java.util.Set<org.semanticweb.owlapi.io.RDFTriple> _Set;
    private org.semanticweb.owlapi.io.OWLObjectRenderer _OWLObjectRenderer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.RDFNode _RDFNode;
    private org.semanticweb.owlapi.io.RDFOntologyHeaderStatus _RDFOntologyHeaderStatus;
    private org.semanticweb.owlapi.io.RDFResource _RDFResource;
    private org.semanticweb.owlapi.io.RDFResourceIRI _RDFResourceIRI;
    private org.semanticweb.owlapi.io.RDFTriple _RDFTriple;
    private org.semanticweb.owlapi.io.StringDocumentTarget _StringDocumentTarget;
    private IRI _IRI;
    private OWLEntity _OWLEntity;
    private OWLLiteral _OWLLiteral;
    private OWLObject _OWLObject;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
