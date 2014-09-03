package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.owl.LabelFunctionalSyntaxStorer;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_owl {
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
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
}
