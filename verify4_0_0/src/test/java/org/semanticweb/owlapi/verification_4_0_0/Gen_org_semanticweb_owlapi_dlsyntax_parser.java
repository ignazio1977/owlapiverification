package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.dlsyntax.parser.DLSyntaxOWLParser;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLOntologyChangeException;
import org.semanticweb.owlapi.model.UnloadableImportException;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_dlsyntax_parser {
    @Test
    public void enforceInterfacesDLSyntaxOWLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(DLSyntaxOWLParser.class));
    }

    public void verifyDLSyntaxOWLParser() throws OWLOntologyChangeException, UnloadableImportException, IOException {
        DLSyntaxOWLParser testSubject0 = new DLSyntaxOWLParser();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.OWLDocumentFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLDocumentFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        OWLDocumentFormatFactory result4 = testSubject0.getSupportedFormat();
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
