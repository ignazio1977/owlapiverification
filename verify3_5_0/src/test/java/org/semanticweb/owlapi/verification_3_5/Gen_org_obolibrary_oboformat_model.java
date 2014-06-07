package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.oboformat.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_oboformat_model {
    public void verifyClause() {
        Clause testSubject0 = new Clause();
        Clause testSubject1 = new Clause(_OboFormatTag, _String);
        Clause testSubject2 = new Clause(_String, _String);
        Clause testSubject3 = new Clause(_String);
        Clause testSubject4 = new Clause(_OboFormatTag);
        Object result0 = testSubject0.getValue();
        Object result1 = testSubject0.getValue(_Class);
        testSubject0.setValue(_Object);
        String result2 = testSubject0.getTag();
        Object result3 = testSubject0.getValue2();
        Object result4 = testSubject0.getValue2(_Class);
        java.util.Collection<org.obolibrary.oboformat.model.QualifierValue> result5 = testSubject0.getQualifierValues();
        java.util.Collection<org.obolibrary.oboformat.model.Xref> result6 = testSubject0.getXrefs();
        testSubject0.setTag(_String);
        testSubject0.setValues(_Collection);
        testSubject0.addValue(_Object);
        testSubject0.setXrefs(_Collection5);
        testSubject0.addXref(_Xref);
        testSubject0.setQualifierValues(_Collection7);
        testSubject0.addQualifierValue(_QualifierValue);
        java.util.Collection<Object> result7 = testSubject0.getValues();
    }

    @Test
    public void enforceInterfacesDocumentStructureException() {
        assertTrue(java.io.IOException.class.isAssignableFrom(DocumentStructureException.class));
    }

    public void verifyDocumentStructureException() {
        DocumentStructureException testSubject0 = new DocumentStructureException(_String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyFrame() throws FrameStructureException, FrameMergeException {
        Frame testSubject0 = new Frame();
        Frame testSubject1 = new Frame(_FrameType);
        String result0 = testSubject0.getId();
        org.obolibrary.oboformat.model.Frame.FrameType result1 = testSubject0.getType();
        testSubject0.check();
        testSubject0.merge(_Frame);
        org.obolibrary.oboformat.model.Clause result2 = testSubject0.getClause(_OboFormatTag);
        org.obolibrary.oboformat.model.Clause result3 = testSubject0.getClause(_String);
        java.util.Collection<org.obolibrary.oboformat.model.Clause> result4 = testSubject0.getClauses();
        java.util.Collection<org.obolibrary.oboformat.model.Clause> result5 = testSubject0.getClauses(_String);
        java.util.Collection<org.obolibrary.oboformat.model.Clause> result6 = testSubject0.getClauses(_OboFormatTag);
        java.util.Set<String> result7 = testSubject0.getTags();
        java.util.Collection<Object> result8 = testSubject0.getTagValues(_OboFormatTag);
        java.util.Collection<Object> result9 = testSubject0.getTagValues(_String);
        java.util.Collection<?> result10 = testSubject0.getTagValues(_OboFormatTag, _Class);
        java.util.Collection<?> result11 = testSubject0.getTagValues(_String, _Class);
        Object result12 = testSubject0.getTagValue(_OboFormatTag, _Class);
        Object result13 = testSubject0.getTagValue(_String);
        Object result14 = testSubject0.getTagValue(_OboFormatTag);
        Object result15 = testSubject0.getTagValue(_String, _Class);
        testSubject0.addClause(_Clause);
        testSubject0.setId(_String);
        testSubject0.setType(_FrameType);
        testSubject0.setClauses(_Collection16);
        java.util.Collection<org.obolibrary.oboformat.model.Xref> result16 = testSubject0.getTagXrefs(_String);
    }

    @Test
    public void enforceInterfacesFrameMergeException() {
        assertTrue(Exception.class.isAssignableFrom(FrameMergeException.class));
    }

    public void verifyFrameMergeException() {
        FrameMergeException testSubject0 = new FrameMergeException(_String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesFrameStructureException() {
        assertTrue(org.obolibrary.oboformat.model.DocumentStructureException.class.isAssignableFrom(FrameStructureException.class));
    }

    public void verifyFrameStructureException() {
        FrameStructureException testSubject0 = new FrameStructureException(_String);
        FrameStructureException testSubject1 = new FrameStructureException(_Frame, _String);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    public void verifyOBODoc() throws FrameMergeException, FrameStructureException {
        OBODoc testSubject0 = new OBODoc();
        testSubject0.check();
        testSubject0.addDefaultOntologyHeader(_String);
        java.util.Collection<org.obolibrary.oboformat.model.Frame> result0 = testSubject0.getTypedefFrames();
        java.util.Collection<org.obolibrary.oboformat.model.Frame> result1 = testSubject0.getTermFrames();
        org.obolibrary.oboformat.model.Frame result2 = testSubject0.getTypedefFrame(_String);
        org.obolibrary.oboformat.model.Frame result3 = testSubject0.getTypedefFrame(_String, _boolean);
        boolean result4 = testSubject0.isTreatXrefsAsEquivalent(_String);
        testSubject0.setHeaderFrame(_Frame);
        java.util.Collection<org.obolibrary.oboformat.model.Frame> result5 = testSubject0.getInstanceFrames();
        org.obolibrary.oboformat.model.Frame result6 = testSubject0.getTermFrame(_String, _boolean);
        org.obolibrary.oboformat.model.Frame result7 = testSubject0.getTermFrame(_String);
        org.obolibrary.oboformat.model.Frame result8 = testSubject0.getInstanceFrame(_String);
        java.util.Collection<org.obolibrary.oboformat.model.OBODoc> result9 = testSubject0.getImportedOBODocs();
        testSubject0.setImportedOBODocs(_Collection18);
        testSubject0.addImportedOBODoc(_OBODoc);
        testSubject0.addFrame(_Frame);
        testSubject0.addTermFrame(_Frame);
        testSubject0.addTypedefFrame(_Frame);
        testSubject0.addInstanceFrame(_Frame);
        String result10 = testSubject0.getIDSpace(_String);
        testSubject0.mergeContents(_OBODoc);
        org.obolibrary.oboformat.model.Frame result11 = testSubject0.getHeaderFrame();
    }

    public void verifyQualifierValue() {
        QualifierValue testSubject0 = new QualifierValue(_String, _String);
        Object result0 = testSubject0.getValue();
        testSubject0.setValue(_Object);
        String result1 = testSubject0.getQualifier();
        testSubject0.setQualifier(_String);
    }

    public void verifyXref() {
        Xref testSubject0 = new Xref(_String);
        String result0 = testSubject0.getAnnotation();
        String result1 = testSubject0.getIdref();
        testSubject0.setAnnotation(_String);
        testSubject0.setIdref(_String);
    }

    private boolean _boolean;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private Class<?> _Class;
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.util.Collection<Object> _Collection;
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
