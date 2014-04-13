package org.semanticweb.owlapi.verification_3_4_10;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.BOMSafeJavaCharStream;

@SuppressWarnings({ "javadoc" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_uk_ac_manchester_cs {

    public void verifyBOMSafeJavaCharStream()  {
        BOMSafeJavaCharStream testSubject0 = new BOMSafeJavaCharStream(
                _InputStream, _String, _int, _int);
        BOMSafeJavaCharStream testSubject1 = new BOMSafeJavaCharStream(_Reader,
                _int, _int);
        char result0 = testSubject0.readChar();
        testSubject0.backup(_int);
        char result1 = testSubject0.BeginToken();
        int result2 = testSubject0.getEndColumn();
        int result3 = testSubject0.getEndLine();
        int result4 = testSubject0.getBeginColumn();
        int result5 = testSubject0.getBeginLine();
        testSubject0.ReInit(_InputStream, _String, _int, _int);
        testSubject0.ReInit(_Reader, _int, _int);
        String result6 = testSubject0.GetImage();
    }

    private int _int;
    private java.io.InputStream _InputStream;
    private java.io.Reader _Reader;
    private String _String;
}
