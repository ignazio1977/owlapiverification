package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.coode.owlapi.oboformat.OBOFormatOWLAPIParser;
import org.coode.owlapi.oboformat.OBOFormatParserFactory;
import org.coode.owlapi.oboformat.OBOFormatRenderer;
import org.coode.owlapi.oboformat.OBOFormatStorer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_oboformat {
    @Test
    public void enforceInterfacesOBOFormatOWLAPIParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class
                .isAssignableFrom(OBOFormatOWLAPIParser.class));
    }

    public void verifyOBOFormatOWLAPIParser() throws Exception {
        OBOFormatOWLAPIParser testSubject0 = new OBOFormatOWLAPIParser(
                _OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyFormat result0 = testSubject0.parse(
                _OWLOntologyDocumentSource, _OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyFormat result1 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntologyFormat result2 = testSubject0.parse(_IRI,
                _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOBOFormatParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(OBOFormatParserFactory.class));
    }

    public void verifyOBOFormatParserFactory() throws Exception {
        OBOFormatParserFactory testSubject0 = new OBOFormatParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOBOFormatRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLRenderer.class
                .isAssignableFrom(OBOFormatRenderer.class));
    }

    public void verifyOBOFormatRenderer() throws Exception {
        OBOFormatRenderer testSubject0 = new OBOFormatRenderer();
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesOBOFormatStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(OBOFormatStorer.class));
    }

    public void verifyOBOFormatStorer() throws Exception {
        OBOFormatStorer testSubject0 = new OBOFormatStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    private java.io.OutputStream _OutputStream;
    private java.io.Writer _Writer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
