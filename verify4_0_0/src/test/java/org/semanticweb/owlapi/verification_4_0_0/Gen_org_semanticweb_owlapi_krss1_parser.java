package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.krss1.parser.KRSSOWLParser;
import org.semanticweb.owlapi.krss1.parser.NameResolverStrategy;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_krss1_parser {
    @Test
    public void enforceInterfacesKRSSOWLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(KRSSOWLParser.class));
    }

    public void verifyKRSSOWLParser() throws OWLOntologyChangeException, UnloadableImportException, IOException {
        KRSSOWLParser testSubject0 = new KRSSOWLParser();
        java.lang.String result0 = testSubject0.getName();
        OWLDocumentFormat result2 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLDocumentFormat result3 = testSubject0.parse(_IRI, _OWLOntology);
        OWLDocumentFormatFactory result4 = testSubject0.getSupportedFormat();
    }

    @Test
    public void enforceInterfacesNameResolverStrategy() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(NameResolverStrategy.class));
    }

    public void verifyEnumNameResolverStrategy() {
        NameResolverStrategy testSubject0 = NameResolverStrategy.ADAPTIVE;
        NameResolverStrategy testSubject1 = NameResolverStrategy.IRI;
        NameResolverStrategy testSubject2 = NameResolverStrategy.NAME;
        NameResolverStrategy testSubject3 = NameResolverStrategy.CHECK;
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
}
