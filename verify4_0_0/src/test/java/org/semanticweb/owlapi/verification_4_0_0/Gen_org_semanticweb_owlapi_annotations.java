package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.annotations.HasPriority;
import org.semanticweb.owlapi.annotations.OwlapiModule;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_annotations {
    @Test
    public void enforceInterfacesHasPriority() {
        assertTrue(java.lang.annotation.Annotation.class.isAssignableFrom(HasPriority.class));
    }

    public void verifyInterfaceHasPriority() {
        HasPriority testSubject0 = mock(HasPriority.class);
        double result0 = testSubject0.value();
        java.lang.Class<? extends java.lang.annotation.Annotation> result1 = testSubject0.annotationType();
    }

    @Test
    public void enforceInterfacesOwlapiModule() {
        assertTrue(java.lang.annotation.Annotation.class.isAssignableFrom(OwlapiModule.class));
    }

    public void verifyInterfaceOwlapiModule() {
        OwlapiModule testSubject0 = mock(OwlapiModule.class);
        java.lang.Class<? extends java.lang.annotation.Annotation> result0 = testSubject0.annotationType();
    }
}
