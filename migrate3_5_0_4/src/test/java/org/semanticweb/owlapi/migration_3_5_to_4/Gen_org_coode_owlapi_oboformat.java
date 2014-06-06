package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.oboformat.parser.OBOFormatParser;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.oboformat to org.obolibrary.oboformat.parser",
        "class visibility: org.obolibrary.oboformat.parser.OBOFormatParser main public class", })
public class Gen_org_coode_owlapi_oboformat {
    @Test
    public void enforceInterfacesOBOFormatOWLAPIParser() {
        assertTrue(org.semanticweb.owlapi.io.OWLParser.class.isAssignableFrom(OBOFormatParser.class));
    }
}
