package org.semanticweb.owlapi.verification_3_5;

import org.coode.string.EscapeUtils;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_coode_string {
    public void verifyEscapeUtils() {
        EscapeUtils testSubject0 = new EscapeUtils();
        String result0 = EscapeUtils.escapeString(_String);
        String result1 = EscapeUtils.unescapeString(_String);
        String result2 = EscapeUtils.escapeXML(_String);
    }

    private String _String;
}
