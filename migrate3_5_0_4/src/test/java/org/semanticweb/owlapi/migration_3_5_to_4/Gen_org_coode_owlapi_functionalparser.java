package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParser;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.functionalparser to org.semanticweb.owlapi.functional.parser",
        "class visibility: org.semanticweb.owlapi.functional.parser.OWLFunctionalSyntaxOWLParser.class main public class", })
public class Gen_org_coode_owlapi_functionalparser {
    @Test
    public void enforceInterfacesJavaCharStream() {
        assertTrue(OWLParser.class.isAssignableFrom(org.semanticweb.owlapi.functional.parser.OWLFunctionalSyntaxOWLParser.class));
    }
}
