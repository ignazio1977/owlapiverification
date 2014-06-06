package org.semanticweb.owlapi.migration_3_5_to_4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.util.EscapeUtils;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: org.coode.string to org.semanticweb.owlapi.util", })
public class Gen_org_coode_string {
    @Test
    public void verifyEscapeUtils() {
        EscapeUtils.escapeString("test");
    }
}
