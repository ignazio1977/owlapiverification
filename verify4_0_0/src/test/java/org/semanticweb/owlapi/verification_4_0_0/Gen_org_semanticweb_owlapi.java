package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.BOMSafeJavaCharStream;
import org.semanticweb.owlapi.OWLAPIParsersModule;
import org.semanticweb.owlapi.OWLAPIServiceLoaderModule;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi {
    @Test
    public void enforceInterfacesOWLAPIServiceLoaderModule() {
        assertTrue(com.google.inject.AbstractModule.class.isAssignableFrom(OWLAPIServiceLoaderModule.class));
    }

    public void verifyOWLAPIServiceLoaderModule() {
        OWLAPIServiceLoaderModule testSubject0 = new OWLAPIServiceLoaderModule();
        testSubject0.configure(_Binder);
    }

    public void verifyBOMSafeJavaCharStream() throws IOException {
        BOMSafeJavaCharStream testSubject0 = new BOMSafeJavaCharStream(_InputStream, _String, _int, _int);
        BOMSafeJavaCharStream testSubject1 = new BOMSafeJavaCharStream(_Reader, _int, _int);
        char result0 = testSubject0.readChar();
        testSubject0.backup(_int);
        char result1 = testSubject0.BeginToken();
        int result2 = testSubject0.getEndColumn();
        int result3 = testSubject0.getEndLine();
        int result4 = testSubject0.getBeginColumn();
        int result5 = testSubject0.getBeginLine();
        testSubject0.ReInit(_InputStream, _String, _int, _int);
        testSubject0.ReInit(_Reader, _int, _int);
        java.lang.String result6 = testSubject0.GetImage();
    }

    @Test
    public void enforceInterfacesOWLAPIParsersModule() {
        assertTrue(com.google.inject.AbstractModule.class.isAssignableFrom(OWLAPIParsersModule.class));
    }

    public void verifyOWLAPIParsersModule() {
        OWLAPIParsersModule testSubject0 = new OWLAPIParsersModule();
        testSubject0.configure(_Binder);
    }

    private com.google.inject.Binder _Binder;
    private int _int;
    private java.io.InputStream _InputStream;
    private java.io.Reader _Reader;
    private java.lang.String _String;
}
