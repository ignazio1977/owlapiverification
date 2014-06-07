package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.coode.owlapi.oboformat.OBOFormatOWLAPIParser;
import org.coode.owlapi.oboformat.OBOFormatParserFactory;
import org.coode.owlapi.oboformat.OBOFormatRenderer;
import org.coode.owlapi.oboformat.OBOFormatStorer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_oboformat {
    @Test
    public void enforceInterfacesOBOFormatOWLAPIParser() {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class.isAssignableFrom(OBOFormatOWLAPIParser.class));
    }

    public void verifyOBOFormatOWLAPIParser() throws OWLParserException, OWLOntologyChangeException, UnloadableImportException, IOException {
        OBOFormatOWLAPIParser testSubject0 = new OBOFormatOWLAPIParser(_OWLOntologyManager);
        OWLOntologyFormat result0 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result2 = testSubject0.parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOBOFormatParserFactory() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(OBOFormatParserFactory.class));
    }

    public void verifyOBOFormatParserFactory() {
        OBOFormatParserFactory testSubject0 = new OBOFormatParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0.createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOBOFormatRenderer() {
        assertTrue(org.semanticweb.owlapi.io.OWLRenderer.class.isAssignableFrom(OBOFormatRenderer.class));
    }

    public void verifyOBOFormatRenderer() throws OWLException {
        OBOFormatRenderer testSubject0 = new OBOFormatRenderer();
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOBOFormatStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(OBOFormatStorer.class));
    }

    public void verifyOBOFormatStorer() throws OWLOntologyStorageException {
        OBOFormatStorer testSubject0 = new OBOFormatStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
}
