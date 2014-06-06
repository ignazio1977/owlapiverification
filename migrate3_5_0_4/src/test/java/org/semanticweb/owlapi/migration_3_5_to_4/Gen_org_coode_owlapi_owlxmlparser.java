package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.owlxml.parser.OWLXMLParser;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.owlxmlparser to org.semanticweb.owlapi.owlxml.parser", "class visibility: OWLXMLParser main public class", })
public class Gen_org_coode_owlapi_owlxmlparser {
    @Test
    public void enforceInterfacesAbbreviatedIRIElementHandler() {
        assertTrue(OWLParser.class.isAssignableFrom(OWLXMLParser.class));
    }

    @Test
    public void enforceInterfacesOWLXMLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(OWLXMLParser.class));
    }

    @Test
    public void enforceInterfacesOWLXMLParserException2SAXExceptionTranslation() {
    }
}
