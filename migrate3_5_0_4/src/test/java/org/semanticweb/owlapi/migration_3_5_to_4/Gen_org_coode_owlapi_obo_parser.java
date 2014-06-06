package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.obolibrary.oboformat.parser.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParser;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.obo.parser to org.obolibrary.oboformat.parser",
        "class visibility: org.obolibrary.oboformat.parser.OBOFormatParser main public class", })
public class Gen_org_coode_owlapi_obo_parser {
    @Test
    public void enforceInterfacesParseException() {
        assertTrue(OWLParser.class.isAssignableFrom(OBOFormatParser.class));
    }
}
