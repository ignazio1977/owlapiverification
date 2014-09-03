package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.owl.LabelFunctionalSyntaxStorer;
import org.semanticweb.owlapi.formats.LabelFunctionalDocumentFormat;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_owl {
    @Test
    public void enforceInterfacesLabelFunctionalFormat() {
        assertTrue(OWLDocumentFormat.class.isAssignableFrom(LabelFunctionalDocumentFormat.class));
    }

    public void verifyLabelFunctionalFormat() {
        LabelFunctionalDocumentFormat testSubject0 = new LabelFunctionalDocumentFormat();
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixDocumentFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLabelFunctionalSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(LabelFunctionalSyntaxStorer.class));
    }

    public void verifyLabelFunctionalSyntaxOntologyStorer() throws OWLOntologyStorageException {
        LabelFunctionalSyntaxStorer testSubject0 = new LabelFunctionalSyntaxStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
}
