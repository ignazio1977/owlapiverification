package org.semanticweb.owlapi.migration_3_5_to_4;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.obo2owl.IdTranslator;
import org.semanticweb.owlapi.model.*;
@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_obo_obolibrary_idrules {

    public void verifyIdTranslator()  {
        IdTranslator testSubject0 = new IdTranslator();
        String result0 = testSubject0.translateIRI(_IRI);
        String result1 = testSubject0.translateIdToIRIString(_String);
        boolean result2 = testSubject0.isURI(_String);
        String result3 = testSubject0.expandPrefix(_String);
    }

    private String _String;
    private IRI _IRI;
}
