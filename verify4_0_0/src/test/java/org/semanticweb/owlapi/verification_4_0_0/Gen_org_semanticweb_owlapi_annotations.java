package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.annotations.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_annotations {
    @Test
    public void enforceInterfacesHasIdentifierKey() {
        assertTrue(java.lang.annotation.Annotation.class.isAssignableFrom(HasIdentifierKey.class));
    }

    public void verifyInterfaceHasIdentifierKey() {
        HasIdentifierKey testSubject0 = mock(HasIdentifierKey.class);
        java.lang.String result0 = testSubject0.value();
        java.lang.Class<? extends java.lang.annotation.Annotation> result1 = testSubject0.annotationType();
    }

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
    public void enforceInterfacesIsBinaryFormat() {
        assertTrue(java.lang.annotation.Annotation.class.isAssignableFrom(IsBinaryFormat.class));
    }

    public void verifyInterfaceIsBinaryFormat() {
        IsBinaryFormat testSubject0 = mock(IsBinaryFormat.class);
        boolean result0 = testSubject0.value();
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

    @Test
    public void enforceInterfacesSupportsMIMEType() {
        assertTrue(java.lang.annotation.Annotation.class.isAssignableFrom(SupportsMIMEType.class));
    }

    public void verifyInterfaceSupportsMIMEType() {
        SupportsMIMEType testSubject0 = mock(SupportsMIMEType.class);
        java.lang.String[] result0 = testSubject0.supportedMIMEtypes();
        java.lang.String result1 = testSubject0.defaultMIMEType();
        java.lang.Class<? extends java.lang.annotation.Annotation> result2 = testSubject0.annotationType();
    }
}
