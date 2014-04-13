package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.dlsyntax.parser.DLSyntaxOWLParser;
import org.semanticweb.owlapi.model.OWLOntologyChangeException;
import org.semanticweb.owlapi.model.UnloadableImportException;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_dlsyntax_parser {
    @Test
    public void enforceInterfacesDLSyntaxOWLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(DLSyntaxOWLParser.class));
    }

    public void verifyDLSyntaxOWLParser() throws OWLOntologyChangeException, UnloadableImportException, IOException {
        DLSyntaxOWLParser testSubject0 = new DLSyntaxOWLParser();
        java.lang.String result0 = testSubject0.getName();
        org.semanticweb.owlapi.model.OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntologyFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        java.util.Set<java.lang.Class<org.semanticweb.owlapi.model.OWLOntologyFormat>> result4 = testSubject0.getSupportedFormatClasses();
        java.util.Set<org.semanticweb.owlapi.model.OWLOntologyFormatFactory> result5 = testSubject0.getSupportedFormats();
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
