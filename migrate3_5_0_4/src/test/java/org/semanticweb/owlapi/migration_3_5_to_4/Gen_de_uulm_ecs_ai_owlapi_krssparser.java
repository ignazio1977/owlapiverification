package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.krss2.parser.*;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from de.uulm.ecs.ai.owlapi.krssparser to de.uulm.ecs.ai.owlapi.krssparser",
        "class visibility: org.semanticweb.owlapi.krss2.parser.KRSS2OWLParser main public class", })
public class Gen_de_uulm_ecs_ai_owlapi_krssparser {
    @Test
    public void enforceInterfacesJavaCharStream() {
        assertTrue(OWLParser.class.isAssignableFrom(KRSS2OWLParser.class));
    }
}
