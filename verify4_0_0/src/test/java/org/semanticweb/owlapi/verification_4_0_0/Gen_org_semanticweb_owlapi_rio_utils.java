package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.rio.utils.OWLAPICompatibleComparator;
import org.semanticweb.owlapi.rio.utils.OWLAPICompatibleValueComparator;
import org.semanticweb.owlapi.rio.utils.RioUtils;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_rio_utils {
    @Test
    public void enforceInterfacesOWLAPICompatibleComparator() {
        assertTrue(java.util.Comparator.class.isAssignableFrom(OWLAPICompatibleComparator.class));
    }

    public void verifyOWLAPICompatibleComparator() {
        OWLAPICompatibleComparator testSubject0 = new OWLAPICompatibleComparator();
        int result0 = testSubject0.compare(_Statement, _Statement);
    }

    @Test
    public void enforceInterfacesOWLAPICompatibleValueComparator() {
        assertTrue(java.util.Comparator.class.isAssignableFrom(OWLAPICompatibleValueComparator.class));
    }

    public void verifyOWLAPICompatibleValueComparator() {
        OWLAPICompatibleValueComparator testSubject0 = new OWLAPICompatibleValueComparator();
        int result0 = testSubject0.compare(_Value, _Value);
    }

    public void verifyRioUtils() {
        RioUtils testSubject0 = new RioUtils();
        org.openrdf.model.Statement result0 = RioUtils.tripleAsStatement(_RDFTriple);
        java.util.Collection<org.openrdf.model.Statement> result1 = RioUtils.tripleAsStatements(_RDFTriple, _Resource_array);
    }

    private org.openrdf.model.Resource[] _Resource_array;
    private org.openrdf.model.Statement _Statement;
    private org.openrdf.model.Value _Value;
    private org.semanticweb.owlapi.io.RDFTriple _RDFTriple;
}
