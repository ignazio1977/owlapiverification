package org.semanticweb.owlapi.verification_4_0_0;

import org.obolibrary.oboformat.diff.Diff;
import org.obolibrary.oboformat.diff.OBODocDiffer;

@SuppressWarnings({ "javadoc", "unused" })
public class Gen_org_obolibrary_oboformat_diff {
    public void verifyDiff() {
        Diff testSubject0 = new Diff(_String, _String, _Frame, _int);
        Diff testSubject1 = new Diff(_String, _String, _Frame, _Frame, _Clause, _int);
        java.lang.String result0 = testSubject0.getType();
        org.obolibrary.oboformat.model.Frame result1 = testSubject0.getFrame1();
        testSubject0.setFrame1(_Frame);
        org.obolibrary.oboformat.model.Frame result2 = testSubject0.getFrame2();
        testSubject0.setFrame2(_Frame);
        org.obolibrary.oboformat.model.Clause result3 = testSubject0.getClause1();
        testSubject0.setClause1(_Clause);
        org.obolibrary.oboformat.model.Clause result4 = testSubject0.getClause2();
        testSubject0.setClause2(_Clause);
        testSubject0.setType(_String);
    }

    public void verifyOBODocDiffer() throws Exception {
        OBODocDiffer testSubject0 = new OBODocDiffer();
        OBODocDiffer.main(_String_array);
        java.util.List<org.obolibrary.oboformat.diff.Diff> result0 = testSubject0.getDiffs(_OBODoc, _OBODoc);
    }

    private int _int;
    private java.lang.String _String;
    private java.lang.String[] _String_array;
    private org.obolibrary.oboformat.model.Clause _Clause;
    private org.obolibrary.oboformat.model.Frame _Frame;
    private org.obolibrary.oboformat.model.OBODoc _OBODoc;
}
