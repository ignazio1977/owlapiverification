package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.owl.LabelFunctionalFormat;
import org.obolibrary.owl.LabelFunctionalSyntaxOntologyStorer;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_owl {
    @Test
    public void enforceInterfacesLabelFunctionalFormat() {
        assertTrue(OWLOntologyFormat.class.isAssignableFrom(LabelFunctionalFormat.class));
    }

    public void verifyLabelFunctionalFormat() {
        LabelFunctionalFormat testSubject0 = new LabelFunctionalFormat();
        testSubject0.setParameter(_Object, _Object);
        Object result0 = testSubject0.getParameter(_Object, _Object);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
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
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    private Object _Object;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
}
