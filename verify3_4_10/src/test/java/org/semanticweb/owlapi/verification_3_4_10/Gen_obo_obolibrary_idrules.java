package org.semanticweb.owlapi.verification_3_4_10;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.obo2owl.IdTranslator;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_obo_obolibrary_idrules {
    public void verifyIdTranslator() throws Exception {
        IdTranslator testSubject0 = new IdTranslator();
        java.lang.String result0 = testSubject0.translateIRI(_IRI);
        java.lang.String result1 = testSubject0.translateIdToIRIString(_String);
        boolean result2 = testSubject0.isURI(_String);
        java.lang.String result3 = testSubject0.expandPrefix(_String);
    }

    private java.lang.String _String;
    private org.semanticweb.owlapi.model.IRI _IRI;
}
