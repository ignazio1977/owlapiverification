package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.owl.LabelFunctionalSyntaxOntologyStorer;
import org.semanticweb.owlapi.formats.LabelFunctionalFormat;
import org.semanticweb.owlapi.formats.PrefixOWLOntologyFormat;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_owl {
    @Test
    public void enforceInterfacesLabelFunctionalFormat() {
        assertTrue(OWLOntologyFormat.class.isAssignableFrom(LabelFunctionalFormat.class));
    }

    public void verifyLabelFunctionalFormat() {
        LabelFunctionalFormat testSubject0 = new LabelFunctionalFormat();
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixOWLOntologyFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLabelFunctionalSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(LabelFunctionalSyntaxOntologyStorer.class));
    }

    public void verifyLabelFunctionalSyntaxOntologyStorer() throws OWLOntologyStorageException {
        LabelFunctionalSyntaxOntologyStorer testSubject0 = new LabelFunctionalSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
}
