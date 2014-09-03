package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.formats.LatexAxiomsListDocumentFormat;
import org.semanticweb.owlapi.formats.LatexDocumentFormat;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.latex.renderer.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.latex to org.semanticweb.owlapi.latex.renderer", "method change: LatexRenderer<init> : dropped manager",
        "method deleted: LatexRenderer::setOWLOntologyManager()", })
public class Gen_org_coode_owlapi_latex {
    @Test
    public void enforceInterfacesLatexAxiomsListOntologyFormat() {
        assertTrue(OWLDocumentFormat.class.isAssignableFrom(LatexAxiomsListDocumentFormat.class));
    }

    public void verifyLatexAxiomsListOntologyFormat() {
        LatexAxiomsListDocumentFormat testSubject0 = new LatexAxiomsListDocumentFormat();
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixDocumentFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLatexBracketChecker() {
        assertTrue(OWLClassExpressionVisitor.class.isAssignableFrom(LatexBracketChecker.class));
    }

    public void verifyLatexBracketChecker() {
        LatexBracketChecker testSubject0 = mock(LatexBracketChecker.class);
        boolean result0 = LatexBracketChecker.requiresBracket(_OWLClassExpression);
    }

    @Test
    public void enforceInterfacesLatexObjectVisitor() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(LatexObjectVisitor.class));
    }

    public void verifyLatexObjectVisitor() {
        LatexObjectVisitor testSubject0 = new LatexObjectVisitor(_LatexWriter, _OWLDataFactory);
        testSubject0.setShortFormProvider(_ShortFormProvider);
        testSubject0.setSubject(_OWLObject);
        boolean result0 = testSubject0.isPrettyPrint();
        testSubject0.setPrettyPrint(_boolean);
    }

    @Test
    public void enforceInterfacesLatexOntologyFormat() {
        assertTrue(OWLDocumentFormat.class.isAssignableFrom(LatexDocumentFormat.class));
    }

    public void verifyLatexOntologyFormat() {
        LatexDocumentFormat testSubject0 = new LatexDocumentFormat();
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixDocumentFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLatexOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLStorer.class.isAssignableFrom(LatexStorer.class));
    }

    public void verifyLatexOntologyStorer() throws OWLOntologyStorageException {
        LatexStorer testSubject0 = new LatexStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesLatexOWLObjectRenderer() {
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class.isAssignableFrom(LatexOWLObjectRenderer.class));
    }

    public void verifyLatexOWLObjectRenderer() {
        LatexOWLObjectRenderer testSubject0 = new LatexOWLObjectRenderer(_OWLDataFactory);
        String result0 = testSubject0.render(_OWLObject);
        testSubject0.setShortFormProvider(_ShortFormProvider);
    }

    @Test
    public void enforceInterfacesLatexRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(LatexRenderer.class));
    }

    public void verifyLatexRenderer() throws OWLRendererException {
        LatexRenderer testSubject0 = new LatexRenderer();
        LatexRenderer testSubject1 = new LatexRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    @Test
    public void enforceInterfacesLatexRendererException() {
        assertTrue(org.semanticweb.owlapi.io.OWLRendererException.class.isAssignableFrom(LatexRendererException.class));
    }

    public void verifyLatexRendererException() {
        LatexRendererException testSubject0 = new LatexRendererException(_Throwable);
        LatexRendererException testSubject1 = new LatexRendererException(_String);
        LatexRendererException testSubject2 = new LatexRendererException(_String, _Throwable);
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
    public void enforceInterfacesLatexRendererIOException() {
        assertTrue(LatexRendererException.class.isAssignableFrom(LatexRendererIOException.class));
    }

    public void verifyLatexRendererIOException() {
        LatexRendererIOException testSubject0 = new LatexRendererIOException(_IOException);
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

    public void verifyLatexWriter() {
        LatexWriter testSubject0 = new LatexWriter(_Writer);
        testSubject0.write(_Object);
        testSubject0.flush();
        testSubject0.writeSpace();
        testSubject0.writeOpenBrace();
        testSubject0.writeCloseBrace();
        testSubject0.writeNewLine();
    }

    private boolean _boolean;
    private java.io.IOException _IOException;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private LatexWriter _LatexWriter;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLClass _OWLClass;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataCardinalityRestriction _OWLDataCardinalityRestriction;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLObject _OWLObject;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectCardinalityRestriction _OWLObjectCardinalityRestriction;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLOntology _OWLOntology;
    private OWLDocumentFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
