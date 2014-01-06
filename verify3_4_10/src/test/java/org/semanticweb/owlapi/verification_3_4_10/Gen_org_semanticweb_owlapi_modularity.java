package org.semanticweb.owlapi.verification_3_4_10;

import static org.mockito.Mockito.mock;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.modularity.OntologySegmenter;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_semanticweb_owlapi_modularity {
    public void verifyInterfaceOntologySegmenter() throws Exception {
        OntologySegmenter testSubject0 = mock(OntologySegmenter.class);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0
                .extractAsOntology(_Set, _IRI, _int, _int, _OWLReasoner);
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0
                .extractAsOntology(_Set, _IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result2 = testSubject0
                .extract(_Set, _int, _int, _OWLReasoner);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result3 = testSubject0
                .extract(_Set);
    }

    private int _int;
    private java.util.Set<org.semanticweb.owlapi.model.OWLEntity> _Set;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
}
