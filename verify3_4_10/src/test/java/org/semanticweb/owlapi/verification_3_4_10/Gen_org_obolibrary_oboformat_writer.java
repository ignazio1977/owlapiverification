package org.semanticweb.owlapi.verification_3_4_10;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.oboformat.writer.OBOFormatWriter;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Ignore
public class Gen_org_obolibrary_oboformat_writer {
    public void verifyOBOFormatWriter() throws Exception {
        OBOFormatWriter testSubject0 = new OBOFormatWriter();
        testSubject0.write(_OBODoc, _String);
        testSubject0.write(_OBODoc, _BufferedWriter);
        testSubject0.write(_BufferedReader, _BufferedWriter);
        testSubject0.write(_OBODoc, _BufferedWriter, _NameProvider);
        testSubject0.write(_Clause, _BufferedWriter, _NameProvider);
        testSubject0.write(_Frame, _BufferedWriter, _NameProvider);
        testSubject0.write(_URL, _BufferedWriter);
        testSubject0.write(_String, _BufferedWriter);
        testSubject0.setCheckStructure(_boolean);
        boolean result0 = testSubject0.isCheckStructure();
        testSubject0.writePropertyValue(_Clause, _BufferedWriter);
        testSubject0.writeDef(_Clause, _BufferedWriter);
        testSubject0.writeSynonym(_Clause, _BufferedWriter);
        OBOFormatWriter.sortTermClauses(_List);
        testSubject0.writeHeader(_Frame, _BufferedWriter, _NameProvider);
    }

    private boolean _boolean;
    private java.io.BufferedReader _BufferedReader;
    private java.io.BufferedWriter _BufferedWriter;
    private java.lang.String _String;
    private java.net.URL _URL;
    private java.util.List<org.obolibrary.oboformat.model.Clause> _List;
    private org.obolibrary.oboformat.model.Clause _Clause;
    private org.obolibrary.oboformat.model.Frame _Frame;
    private org.obolibrary.oboformat.model.OBODoc _OBODoc;
    private org.obolibrary.oboformat.writer.OBOFormatWriter.NameProvider _NameProvider;
}
