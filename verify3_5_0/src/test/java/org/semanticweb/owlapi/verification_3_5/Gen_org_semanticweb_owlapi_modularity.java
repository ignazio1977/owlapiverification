package org.semanticweb.owlapi.verification_3_5;

import static org.mockito.Mockito.mock;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.modularity.OntologySegmenter;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_semanticweb_owlapi_modularity {
    public void verifyInterfaceOntologySegmenter() throws OWLOntologyCreationException {
        OntologySegmenter testSubject0 = mock(OntologySegmenter.class);
        OWLOntology result0 = testSubject0.extractAsOntology(_Set, _IRI, _int, _int, _OWLReasoner);
        OWLOntology result1 = testSubject0.extractAsOntology(_Set, _IRI);
        java.util.Set<OWLAxiom> result2 = testSubject0.extract(_Set, _int, _int, _OWLReasoner);
        java.util.Set<OWLAxiom> result3 = testSubject0.extract(_Set);
    }

    private int _int;
    private java.util.Set<OWLEntity> _Set;
    private IRI _IRI;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
}
