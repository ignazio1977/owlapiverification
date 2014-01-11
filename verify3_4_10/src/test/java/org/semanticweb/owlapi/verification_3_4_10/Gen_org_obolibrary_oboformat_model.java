package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.oboformat.model.Clause;
import org.obolibrary.oboformat.model.DocumentStructureException;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.FrameMergeException;
import org.obolibrary.oboformat.model.FrameStructureException;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.model.QualifierValue;
import org.obolibrary.oboformat.model.Xref;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_oboformat_model {
    public void verifyClause() throws Exception {
        Clause testSubject0 = new Clause();
        Clause testSubject1 = new Clause(_OboFormatTag, _String);
        Clause testSubject2 = new Clause(_String, _String);
        Clause testSubject3 = new Clause(_String);
        Clause testSubject4 = new Clause(_OboFormatTag);
        java.lang.Object result0 = testSubject0.getValue();
        Object result1 = testSubject0.getValue(_Class);
        testSubject0.setValue(_Object);
        java.lang.String result2 = testSubject0.getTag();
        java.lang.Object result3 = testSubject0.getValue2();
        Object result4 = testSubject0.getValue2(_Class);
        java.util.Collection<org.obolibrary.oboformat.model.QualifierValue> result5 = testSubject0
                .getQualifierValues();
        java.util.Collection<org.obolibrary.oboformat.model.Xref> result6 = testSubject0
                .getXrefs();
        testSubject0.setTag(_String);
        testSubject0.setValues(_Collection);
        testSubject0.addValue(_Object);
        testSubject0.setXrefs(_Collection5);
        testSubject0.addXref(_Xref);
        testSubject0.setQualifierValues(_Collection7);
        testSubject0.addQualifierValue(_QualifierValue);
        java.util.Collection<java.lang.Object> result7 = testSubject0.getValues();
    }

    @Test
    public void enforceInterfacesDocumentStructureException() throws Exception {
        assertTrue(java.io.IOException.class
                .isAssignableFrom(DocumentStructureException.class));
    }

    public void verifyDocumentStructureException() throws Exception {
        DocumentStructureException testSubject0 = new DocumentStructureException(_String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyFrame() throws Exception {
        Frame testSubject0 = new Frame();
        Frame testSubject1 = new Frame(_FrameType);
        java.lang.String result0 = testSubject0.getId();
        org.obolibrary.oboformat.model.Frame.FrameType result1 = testSubject0.getType();
        testSubject0.check();
        testSubject0.merge(_Frame);
        org.obolibrary.oboformat.model.Clause result2 = testSubject0
                .getClause(_OboFormatTag);
        org.obolibrary.oboformat.model.Clause result3 = testSubject0.getClause(_String);
        java.util.Collection<org.obolibrary.oboformat.model.Clause> result4 = testSubject0
                .getClauses();
        java.util.Collection<org.obolibrary.oboformat.model.Clause> result5 = testSubject0
                .getClauses(_String);
        java.util.Collection<org.obolibrary.oboformat.model.Clause> result6 = testSubject0
                .getClauses(_OboFormatTag);
        java.util.Set<java.lang.String> result7 = testSubject0.getTags();
        java.util.Collection<java.lang.Object> result8 = testSubject0
                .getTagValues(_OboFormatTag);
        java.util.Collection<java.lang.Object> result9 = testSubject0
                .getTagValues(_String);
        java.util.Collection<?> result10 = testSubject0.getTagValues(_OboFormatTag,
                _Class);
        java.util.Collection<?> result11 = testSubject0.getTagValues(_String, _Class);
        Object result12 = testSubject0.getTagValue(_OboFormatTag, _Class);
        java.lang.Object result13 = testSubject0.getTagValue(_String);
        java.lang.Object result14 = testSubject0.getTagValue(_OboFormatTag);
        Object result15 = testSubject0.getTagValue(_String, _Class);
        testSubject0.addClause(_Clause);
        testSubject0.setId(_String);
        testSubject0.setType(_FrameType);
        testSubject0.setClauses(_Collection16);
        java.util.Collection<org.obolibrary.oboformat.model.Xref> result16 = testSubject0
                .getTagXrefs(_String);
    }

    @Test
    public void enforceInterfacesFrameMergeException() throws Exception {
        assertTrue(java.lang.Exception.class.isAssignableFrom(FrameMergeException.class));
    }

    public void verifyFrameMergeException() throws Exception {
        FrameMergeException testSubject0 = new FrameMergeException(_String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesFrameStructureException() throws Exception {
        assertTrue(org.obolibrary.oboformat.model.DocumentStructureException.class
                .isAssignableFrom(FrameStructureException.class));
    }

    public void verifyFrameStructureException() throws Exception {
        FrameStructureException testSubject0 = new FrameStructureException(_String);
        FrameStructureException testSubject1 = new FrameStructureException(_Frame,
                _String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyOBODoc() throws Exception {
        OBODoc testSubject0 = new OBODoc();
        testSubject0.check();
        testSubject0.addDefaultOntologyHeader(_String);
        java.util.Collection<org.obolibrary.oboformat.model.Frame> result0 = testSubject0
                .getTypedefFrames();
        java.util.Collection<org.obolibrary.oboformat.model.Frame> result1 = testSubject0
                .getTermFrames();
        org.obolibrary.oboformat.model.Frame result2 = testSubject0
                .getTypedefFrame(_String);
        org.obolibrary.oboformat.model.Frame result3 = testSubject0.getTypedefFrame(
                _String, _boolean);
        boolean result4 = testSubject0.isTreatXrefsAsEquivalent(_String);
        testSubject0.setHeaderFrame(_Frame);
        java.util.Collection<org.obolibrary.oboformat.model.Frame> result5 = testSubject0
                .getInstanceFrames();
        org.obolibrary.oboformat.model.Frame result6 = testSubject0.getTermFrame(_String,
                _boolean);
        org.obolibrary.oboformat.model.Frame result7 = testSubject0.getTermFrame(_String);
        org.obolibrary.oboformat.model.Frame result8 = testSubject0
                .getInstanceFrame(_String);
        java.util.Collection<org.obolibrary.oboformat.model.OBODoc> result9 = testSubject0
                .getImportedOBODocs();
        testSubject0.setImportedOBODocs(_Collection18);
        testSubject0.addImportedOBODoc(_OBODoc);
        testSubject0.addFrame(_Frame);
        testSubject0.addTermFrame(_Frame);
        testSubject0.addTypedefFrame(_Frame);
        testSubject0.addInstanceFrame(_Frame);
        java.lang.String result10 = testSubject0.getIDSpace(_String);
        testSubject0.mergeContents(_OBODoc);
        org.obolibrary.oboformat.model.Frame result11 = testSubject0.getHeaderFrame();
    }

    public void verifyQualifierValue() throws Exception {
        QualifierValue testSubject0 = new QualifierValue(_String, _String);
        java.lang.Object result0 = testSubject0.getValue();
        testSubject0.setValue(_Object);
        java.lang.String result1 = testSubject0.getQualifier();
        testSubject0.setQualifier(_String);
    }

    public void verifyXref() throws Exception {
        Xref testSubject0 = new Xref(_String);
        java.lang.String result0 = testSubject0.getAnnotation();
        java.lang.String result1 = testSubject0.getIdref();
        testSubject0.setAnnotation(_String);
        testSubject0.setIdref(_String);
    }

    private boolean _boolean;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.Class<?> _Class;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Collection<java.lang.Object> _Collection;
    private java.util.Collection<org.obolibrary.oboformat.model.Clause> _Collection16;
    private java.util.Collection<org.obolibrary.oboformat.model.OBODoc> _Collection18;
    private java.util.Collection<org.obolibrary.oboformat.model.QualifierValue> _Collection7;
    private java.util.Collection<org.obolibrary.oboformat.model.Xref> _Collection5;
    private org.obolibrary.oboformat.model.Clause _Clause;
    private org.obolibrary.oboformat.model.Frame _Frame;
    private org.obolibrary.oboformat.model.Frame.FrameType _FrameType;
    private org.obolibrary.oboformat.model.OBODoc _OBODoc;
    private org.obolibrary.oboformat.model.QualifierValue _QualifierValue;
    private org.obolibrary.oboformat.model.Xref _Xref;
    private org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag _OboFormatTag;
}
