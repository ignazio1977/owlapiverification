package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.krss1.parser.KRSSOWLParser;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owl.krssparser to org.semanticweb.owlapi.krss1.parser",
        "class visibility: org.semanticweb.owlapi.krss1.parser.KRSSOWLParser main public class", })
public class Gen_org_coode_owl_krssparser {
    @Test
    public void enforceInterfacesJavaCharStream() {
        assertTrue(OWLParser.class.isAssignableFrom(KRSSOWLParser.class));
    }
}
