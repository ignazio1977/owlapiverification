package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.model.AbstractTranslator;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.rdf.model to org.semanticweb.owlapi.io", })
public class Gen_org_coode_owlapi_rdf_model {
    @Test
    public void enforceInterfacesAbstractTranslator() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(AbstractTranslator.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(AbstractTranslator.class));
    }
}
