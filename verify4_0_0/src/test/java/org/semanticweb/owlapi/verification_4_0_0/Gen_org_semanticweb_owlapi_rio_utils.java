package org.semanticweb.owlapi.verification_4_0_0;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.rio.utils.RioUtils;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_semanticweb_owlapi_rio_utils {
    public void verifyRioUtils() {
        org.openrdf.model.Statement result0 = RioUtils.tripleAsStatement(_RDFTriple);
        java.util.Collection<org.openrdf.model.Statement> result1 = RioUtils.tripleAsStatements(_RDFTriple, _Resource_array);
    }

    private org.openrdf.model.Resource[] _Resource_array;
    private org.openrdf.model.Statement _Statement;
    private org.openrdf.model.Value _Value;
    private org.semanticweb.owlapi.io.RDFTriple _RDFTriple;
}
