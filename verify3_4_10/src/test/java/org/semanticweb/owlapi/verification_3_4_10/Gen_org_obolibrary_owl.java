package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.owl.LabelFunctionalFormat;
import org.obolibrary.owl.LabelFunctionalSyntaxOntologyStorer;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_owl {
    @Test
    public void enforceInterfacesLabelFunctionalFormat() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyFormat.class
                .isAssignableFrom(LabelFunctionalFormat.class));
    }

    public void verifyLabelFunctionalFormat() throws Exception {
        LabelFunctionalFormat testSubject0 = new LabelFunctionalFormat();
        testSubject0.setParameter(_Object, _Object);
        java.lang.Object result0 = testSubject0.getParameter(_Object, _Object);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result2 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLabelFunctionalSyntaxOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(LabelFunctionalSyntaxOntologyStorer.class));
    }

    public void verifyLabelFunctionalSyntaxOntologyStorer() throws Exception {
        LabelFunctionalSyntaxOntologyStorer testSubject0 = new LabelFunctionalSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    private java.lang.Object _Object;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
}
