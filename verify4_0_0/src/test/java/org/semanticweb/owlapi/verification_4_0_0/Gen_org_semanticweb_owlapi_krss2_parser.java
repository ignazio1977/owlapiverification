package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.krss2.parser.KRSS2OWLParser;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_krss2_parser {
    @Test
    public void enforceInterfacesKRSS2OWLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(KRSS2OWLParser.class));
    }

    public void verifyKRSS2OWLParser() throws UnloadableImportException, IOException {
        KRSS2OWLParser testSubject0 = new KRSS2OWLParser();
        java.lang.String result0 = testSubject0.getName();
        OWLDocumentFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLDocumentFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        OWLDocumentFormatFactory result4 = testSubject0.getSupportedFormat();
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
