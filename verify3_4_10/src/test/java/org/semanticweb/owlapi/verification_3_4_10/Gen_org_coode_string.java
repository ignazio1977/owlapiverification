package org.semanticweb.owlapi.verification_3_4_10;

import org.coode.string.EscapeUtils;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_coode_string {
    public void verifyEscapeUtils() throws Exception {
        EscapeUtils testSubject0 = new EscapeUtils();
        java.lang.String result0 = EscapeUtils.escapeString(_String);
        java.lang.String result1 = EscapeUtils.unescapeString(_String);
        java.lang.String result2 = EscapeUtils.escapeXML(_String);
    }

    private java.lang.String _String;
}
