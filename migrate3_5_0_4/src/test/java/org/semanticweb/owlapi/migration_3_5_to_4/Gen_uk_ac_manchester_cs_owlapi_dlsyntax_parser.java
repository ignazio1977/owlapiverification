package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.dlsyntax.parser.DLSyntaxOWLParser;
import org.semanticweb.owlapi.io.OWLParser;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from uk.ac.manchester.cs.owlapi.dlsyntax.parser to org.semanticweb.owlapi.dlsyntax.parser",
        "new class: DLSyntaxOWLParser : public parser for use in actual parsing", "class visibility: JavaCharStream : package", "class visibility: ParseException : package",
        "class visibility: DLSyntaxParserTokenManager : package", "class visibility: DLSyntaxParser : package", "class visibility: DLSyntaxParserConstants : package",
        "class visibility: Token : package", "class visibility: Token : TokenMgrError", })
public class Gen_uk_ac_manchester_cs_owlapi_dlsyntax_parser {
    @Test
    public void enforceInterfacesTokenMgrError() {
        assertTrue(OWLParser.class.isAssignableFrom(DLSyntaxOWLParser.class));
    }
}
