package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.oboformat.OBOFormatOWLAPIParser;
import org.semanticweb.owlapi.oboformat.OBOFormatRenderer;
import org.semanticweb.owlapi.oboformat.OBOFormatStorer;
import org.semanticweb.owlapi.oboformat.OWLAPIOBOModule;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_oboformat {
    @Test
    public void enforceInterfacesOBOFormatOWLAPIParser() {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class.isAssignableFrom(OBOFormatOWLAPIParser.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OBOFormatOWLAPIParser.class));
    }

    public void verifyOBOFormatOWLAPIParser() throws OWLParserException, OWLOntologyChangeException, UnloadableImportException, IOException {
        OBOFormatOWLAPIParser testSubject0 = new OBOFormatOWLAPIParser();
        java.lang.String result0 = testSubject0.getName();
        OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        java.util.Set<java.lang.Class<OWLOntologyFormat>> result4 = testSubject0.getSupportedFormatClasses();
        java.util.Set<OWLOntologyFormatFactory> result5 = testSubject0.getSupportedFormats();
    }

    @Test
    public void enforceInterfacesOBOFormatRenderer() {
        assertTrue(org.semanticweb.owlapi.io.OWLRenderer.class.isAssignableFrom(OBOFormatRenderer.class));
    }

    public void verifyOBOFormatRenderer() throws OWLOntologyStorageException {
        OBOFormatRenderer testSubject0 = new OBOFormatRenderer();
        testSubject0.render(_OWLOntology, _OutputStream);
        OBOFormatRenderer.render(_OWLOntology, _Writer);
    }

    @Test
    public void enforceInterfacesOBOFormatStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(OBOFormatStorer.class));
    }

    public void verifyOBOFormatStorer() throws OWLOntologyStorageException {
        OBOFormatStorer testSubject0 = new OBOFormatStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLAPIOBOModule() {
        assertTrue(com.google.inject.AbstractModule.class.isAssignableFrom(OWLAPIOBOModule.class));
    }

    public void verifyOWLAPIOBOModule() {
        OWLAPIOBOModule testSubject0 = new OWLAPIOBOModule();
        testSubject0.configure(_Binder);
    }

    private com.google.inject.Binder _Binder;
    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
