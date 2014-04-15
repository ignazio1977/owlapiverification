package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.obolibrary.oboformat.parser.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_obolibrary_oboformat_parser {
    @Test
    public void enforceInterfacesInvalidXrefMapException() {
        assertTrue(org.obolibrary.oboformat.parser.OBOFormatException.class.isAssignableFrom(InvalidXrefMapException.class));
    }

    public void verifyInvalidXrefMapException() {
        InvalidXrefMapException testSubject0 = new InvalidXrefMapException(_Throwable);
        InvalidXrefMapException testSubject1 = new InvalidXrefMapException(_String);
        InvalidXrefMapException testSubject2 = new InvalidXrefMapException(_String, _Throwable);
        InvalidXrefMapException testSubject3 = new InvalidXrefMapException();
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    public void verifyOBOFormatConstants() {
        OBOFormatConstants testSubject0 = new OBOFormatConstants();
        org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag result0 = OBOFormatConstants.getTag(_String);
    }

    @Test
    public void enforceInterfacesOBOFormatDanglingReferenceException() {
        assertTrue(org.obolibrary.oboformat.parser.OBOFormatException.class.isAssignableFrom(OBOFormatDanglingReferenceException.class));
    }

    public void verifyOBOFormatDanglingReferenceException() {
        OBOFormatDanglingReferenceException testSubject0 = new OBOFormatDanglingReferenceException(_String, _Throwable);
        OBOFormatDanglingReferenceException testSubject1 = new OBOFormatDanglingReferenceException(_Throwable);
        OBOFormatDanglingReferenceException testSubject2 = new OBOFormatDanglingReferenceException(_String);
        OBOFormatDanglingReferenceException testSubject3 = new OBOFormatDanglingReferenceException();
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOBOFormatException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OBOFormatException.class));
    }

    public void verifyOBOFormatException() {
        OBOFormatException testSubject0 = new OBOFormatException(_String, _Throwable);
        OBOFormatException testSubject1 = new OBOFormatException(_Throwable);
        OBOFormatException testSubject2 = new OBOFormatException(_String);
        OBOFormatException testSubject3 = new OBOFormatException();
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    public void verifyOBOFormatParser() throws OBOFormatParserException, IOException {
        OBOFormatParser testSubject0 = new OBOFormatParser();
        org.obolibrary.oboformat.model.OBODoc result0 = testSubject0.parse(_String);
        org.obolibrary.oboformat.model.OBODoc result1 = testSubject0.parse(_File);
        org.obolibrary.oboformat.model.OBODoc result2 = testSubject0.parse(_URL);
        org.obolibrary.oboformat.model.OBODoc result3 = testSubject0.parse(_BufferedReader);
        org.obolibrary.oboformat.model.OBODoc result4 = testSubject0.parseURL(_String);
        testSubject0.setReader(_BufferedReader);
        testSubject0.setFollowImports(_boolean);
        boolean result5 = testSubject0.getFollowImports();
        testSubject0.parseOBODoc(_OBODoc);
        testSubject0.parseHeaderFrame(_Frame);
        testSubject0.parseEntityFrame(_OBODoc);
        java.util.List<java.lang.String> result6 = testSubject0.checkDanglingReferences(_OBODoc);
        testSubject0.parseTermFrame(_OBODoc);
        testSubject0.parseTypedefFrame(_OBODoc);
        org.obolibrary.oboformat.model.Clause result7 = testSubject0.parseTermFrameClause();
        testSubject0.parseEOL(_Clause);
        org.obolibrary.oboformat.model.Clause result8 = testSubject0.parseTypedefFrameClause();
    }

    @Test
    public void enforceInterfacesOBOFormatParserException() {
        assertTrue(org.obolibrary.oboformat.parser.OBOFormatException.class.isAssignableFrom(OBOFormatParserException.class));
    }

    public void verifyOBOFormatParserException() {
        OBOFormatParserException testSubject0 = new OBOFormatParserException(_Throwable, _int, _String);
        OBOFormatParserException testSubject1 = new OBOFormatParserException(_String, _int, _String);
        OBOFormatParserException testSubject2 = new OBOFormatParserException(_String, _Throwable, _int, _String);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNo();
        java.lang.String result2 = testSubject0.getLine();
        int result3 = testSubject0.getLineNumber();
        int result4 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result5 = testSubject0.fillInStackTrace();
        java.lang.Throwable result6 = testSubject0.getCause();
        java.lang.Throwable result7 = testSubject0.initCause(_Throwable);
        java.lang.String result8 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result9 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result10 = testSubject0.getSuppressed();
    }

    public void verifyXrefExpander() {
        XrefExpander testSubject0 = new XrefExpander(_OBODoc, _String);
        XrefExpander testSubject1 = new XrefExpander(_OBODoc);
        XrefExpander testSubject2 = new XrefExpander(_OBODoc, _OBODoc);
        testSubject0.setUp();
        org.obolibrary.oboformat.model.OBODoc result0 = testSubject0.getTargetDoc(_String);
        testSubject0.expandXrefs();
    }

    private boolean _boolean;
    private int _int;
    private java.io.BufferedReader _BufferedReader;
    private java.io.File _File;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.net.URL _URL;
    private org.obolibrary.oboformat.model.Clause _Clause;
    private org.obolibrary.oboformat.model.Frame _Frame;
    private org.obolibrary.oboformat.model.OBODoc _OBODoc;
}
