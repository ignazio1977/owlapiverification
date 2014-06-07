package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.latex.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_latex {
    @Test
    public void enforceInterfacesLatexAxiomsListOntologyFormat() {
        assertTrue(OWLOntologyFormat.class.isAssignableFrom(LatexAxiomsListOntologyFormat.class));
    }

    public void verifyLatexAxiomsListOntologyFormat() {
        LatexAxiomsListOntologyFormat testSubject0 = new LatexAxiomsListOntologyFormat();
        testSubject0.setParameter(_Object, _Object);
        Object result0 = testSubject0.getParameter(_Object, _Object);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLatexBracketChecker() {
        assertTrue(OWLClassExpressionVisitor.class.isAssignableFrom(LatexBracketChecker.class));
    }

    public void verifyLatexBracketChecker() {
        LatexBracketChecker testSubject0 = mock(LatexBracketChecker.class);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataCardinalityRestriction);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectCardinalityRestriction);
        testSubject0.visit(_OWLObjectAllValuesFrom);
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
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLAnnotationValue);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLImportsDeclaration);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
    }

    @Test
    public void enforceInterfacesLatexOntologyFormat() {
        assertTrue(OWLOntologyFormat.class.isAssignableFrom(LatexOntologyFormat.class));
    }

    public void verifyLatexOntologyFormat() {
        LatexOntologyFormat testSubject0 = new LatexOntologyFormat();
        testSubject0.setParameter(_Object, _Object);
        Object result0 = testSubject0.getParameter(_Object, _Object);
        boolean result1 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result2 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result3 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesLatexOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(LatexOntologyStorer.class));
    }

    public void verifyLatexOntologyStorer() throws OWLOntologyStorageException {
        LatexOntologyStorer testSubject0 = new LatexOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI, _OWLOntologyFormat);
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
        LatexRenderer testSubject0 = new LatexRenderer(_OWLOntologyManager);
        LatexRenderer testSubject1 = new LatexRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
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
        assertTrue(org.coode.owlapi.latex.LatexRendererException.class.isAssignableFrom(LatexRendererIOException.class));
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
    private org.coode.owlapi.latex.LatexWriter _LatexWriter;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnnotationValue _OWLAnnotationValue;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataCardinalityRestriction _OWLDataCardinalityRestriction;
    private OWLDataComplementOf _OWLDataComplementOf;
    private OWLDataExactCardinality _OWLDataExactCardinality;
    private OWLDataFactory _OWLDataFactory;
    private OWLDataHasValue _OWLDataHasValue;
    private OWLDataIntersectionOf _OWLDataIntersectionOf;
    private OWLDataMaxCardinality _OWLDataMaxCardinality;
    private OWLDataMinCardinality _OWLDataMinCardinality;
    private OWLDataOneOf _OWLDataOneOf;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLDataUnionOf _OWLDataUnionOf;
    private OWLDatatype _OWLDatatype;
    private OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private OWLDatatypeRestriction _OWLDatatypeRestriction;
    private OWLDeclarationAxiom _OWLDeclarationAxiom;
    private OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObject _OWLObject;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private OWLObjectCardinalityRestriction _OWLObjectCardinalityRestriction;
    private OWLObjectComplementOf _OWLObjectComplementOf;
    private OWLObjectExactCardinality _OWLObjectExactCardinality;
    private OWLObjectHasSelf _OWLObjectHasSelf;
    private OWLObjectHasValue _OWLObjectHasValue;
    private OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private OWLObjectInverseOf _OWLObjectInverseOf;
    private OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private OWLObjectMinCardinality _OWLObjectMinCardinality;
    private OWLObjectOneOf _OWLObjectOneOf;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private SWRLBuiltInAtom _SWRLBuiltInAtom;
    private SWRLClassAtom _SWRLClassAtom;
    private SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private SWRLDataRangeAtom _SWRLDataRangeAtom;
    private SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private SWRLIndividualArgument _SWRLIndividualArgument;
    private SWRLLiteralArgument _SWRLLiteralArgument;
    private SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private SWRLRule _SWRLRule;
    private SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
}
