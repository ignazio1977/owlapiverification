package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.AbstractRenderer;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxFrameRenderer;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxOWLObjectRendererImpl;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxObjectRenderer;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxOntologyStorer;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxOntologyStorerException;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxPrefixNameShortFormProvider;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxRenderer;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RendererEvent;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RendererListener;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RenderingDirector;
import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.SectionMap;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi_mansyntaxrenderer {
    public void verifyAbstractRenderer() throws Exception {
        AbstractRenderer testSubject0 = new AbstractRenderer(_Writer, _ShortFormProvider);
        testSubject0.flush();
        testSubject0.setUseTabbing(_boolean);
        testSubject0.setUseWrapping(_boolean);
        boolean result0 = testSubject0.isUseWrapping();
        boolean result1 = testSubject0.isUseTabbing();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxFrameRenderer() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxObjectRenderer.class
                .isAssignableFrom(ManchesterOWLSyntaxFrameRenderer.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitor.class
                .isAssignableFrom(ManchesterOWLSyntaxFrameRenderer.class));
    }

    public void verifyManchesterOWLSyntaxFrameRenderer() throws Exception {
        ManchesterOWLSyntaxFrameRenderer testSubject0 = new ManchesterOWLSyntaxFrameRenderer(
                _Set, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject1 = new ManchesterOWLSyntaxFrameRenderer(
                _Set, _OWLOntology, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject2 = new ManchesterOWLSyntaxFrameRenderer(
                _OWLOntologyManager, _Set, _OWLOntology, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject3 = new ManchesterOWLSyntaxFrameRenderer(
                _OWLOntology, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject4 = new ManchesterOWLSyntaxFrameRenderer(
                _OWLOntologyManager, _OWLOntology, _Writer, _ShortFormProvider);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .write(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result1 = testSubject0
                .write(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result2 = testSubject0
                .write(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result3 = testSubject0
                .write(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result4 = testSubject0
                .write(_OWLDatatype);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result5 = testSubject0
                .write(_SWRLRule);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result6 = testSubject0
                .write(_OWLAnnotationProperty);
        testSubject0.setRenderingDirector(_RenderingDirector);
        testSubject0.addRendererListener(_RendererListener);
        testSubject0.removeRendererListener(_RendererListener);
        testSubject0.setAxiomFilter(_OWLAxiomFilter);
        testSubject0.clearFilteredAxiomTypes();
        testSubject0.addFilteredAxiomType(_AxiomType);
        testSubject0.setRenderExtensions(_boolean);
        testSubject0.writeOntology();
        testSubject0.writePrefixMap();
        testSubject0.writeOntologyHeader(_OWLOntology);
        testSubject0.writeSection(_ManchesterOWLSyntax, _SectionMap, _String, _boolean,
                _OWLOntology_array);
        testSubject0.writeSection(_ManchesterOWLSyntax);
        testSubject0.writeSection(_ManchesterOWLSyntax, _Collection, _String, _boolean,
                _OWLOntology_array);
        testSubject0.writeFullURI(_String);
        boolean result7 = testSubject0.isFiltered(_AxiomType);
        boolean result8 = testSubject0.isDisplayed(_OWLAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result9 = testSubject0
                .writeFrame(_OWLEntity);
        testSubject0.writeComment(_String, _boolean);
        testSubject0.writeComment(_String, _String, _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result10 = testSubject0
                .getOntologies();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom> result11 = testSubject0
                .writeAnnotations(_OWLAnnotationSubject);
        testSubject0.flush();
        testSubject0.setUseTabbing(_boolean);
        testSubject0.setUseWrapping(_boolean);
        boolean result12 = testSubject0.isUseWrapping();
        boolean result13 = testSubject0.isUseTabbing();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxObjectRenderer() throws Exception {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.AbstractRenderer.class
                .isAssignableFrom(ManchesterOWLSyntaxObjectRenderer.class));
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(ManchesterOWLSyntaxObjectRenderer.class));
    }

    public void verifyManchesterOWLSyntaxObjectRenderer() throws Exception {
        ManchesterOWLSyntaxObjectRenderer testSubject0 = new ManchesterOWLSyntaxObjectRenderer(
                _Writer, _ShortFormProvider);
        testSubject0.flush();
        testSubject0.setUseTabbing(_boolean);
        testSubject0.setUseWrapping(_boolean);
        boolean result0 = testSubject0.isUseWrapping();
        boolean result1 = testSubject0.isUseTabbing();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class
                .isAssignableFrom(ManchesterOWLSyntaxOntologyStorer.class));
    }

    public void verifyManchesterOWLSyntaxOntologyStorer() throws Exception {
        ManchesterOWLSyntaxOntologyStorer testSubject0 = new ManchesterOWLSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyStorerException()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorageException.class
                .isAssignableFrom(ManchesterOWLSyntaxOntologyStorerException.class));
    }

    public void verifyManchesterOWLSyntaxOntologyStorerException() throws Exception {
        ManchesterOWLSyntaxOntologyStorerException testSubject0 = new ManchesterOWLSyntaxOntologyStorerException(
                _String);
        ManchesterOWLSyntaxOntologyStorerException testSubject1 = new ManchesterOWLSyntaxOntologyStorerException(
                _String, _Throwable);
        ManchesterOWLSyntaxOntologyStorerException testSubject2 = new ManchesterOWLSyntaxOntologyStorerException(
                _Throwable);
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
    public void enforceInterfacesManchesterOWLSyntaxOWLObjectRendererImpl()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class
                .isAssignableFrom(ManchesterOWLSyntaxOWLObjectRendererImpl.class));
    }

    public void verifyManchesterOWLSyntaxOWLObjectRendererImpl() throws Exception {
        ManchesterOWLSyntaxOWLObjectRendererImpl testSubject0 = new ManchesterOWLSyntaxOWLObjectRendererImpl();
        java.lang.String result0 = testSubject0.render(_OWLObject);
        testSubject0.setShortFormProvider(_ShortFormProvider);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxPrefixNameShortFormProvider()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(ManchesterOWLSyntaxPrefixNameShortFormProvider.class));
    }

    public void verifyManchesterOWLSyntaxPrefixNameShortFormProvider() throws Exception {
        ManchesterOWLSyntaxPrefixNameShortFormProvider testSubject0 = new ManchesterOWLSyntaxPrefixNameShortFormProvider(
                _DefaultPrefixManager);
        ManchesterOWLSyntaxPrefixNameShortFormProvider testSubject1 = new ManchesterOWLSyntaxPrefixNameShortFormProvider(
                _OWLOntologyFormat);
        ManchesterOWLSyntaxPrefixNameShortFormProvider testSubject2 = new ManchesterOWLSyntaxPrefixNameShortFormProvider(
                _OWLOntologyManager, _OWLOntology);
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
        java.lang.String result1 = testSubject0.getShortForm(_OWLEntity);
        org.semanticweb.owlapi.model.PrefixManager result2 = testSubject0
                .getPrefixManager();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class
                .isAssignableFrom(ManchesterOWLSyntaxRenderer.class));
    }

    public void verifyManchesterOWLSyntaxRenderer() throws Exception {
        ManchesterOWLSyntaxRenderer testSubject0 = new ManchesterOWLSyntaxRenderer(
                _OWLOntologyManager);
        ManchesterOWLSyntaxRenderer testSubject1 = new ManchesterOWLSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    public void verifyRendererEvent() throws Exception {
        RendererEvent testSubject0 = new RendererEvent(_ManchesterOWLSyntaxFrameRenderer,
                _OWLObject);
        uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxFrameRenderer result0 = testSubject0
                .getFrameRenderer();
        testSubject0.writeCommentOnNewLine(_String);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.getFrameSubject();
        testSubject0.writeComment(_String);
    }

    public void verifyInterfaceRendererListener() throws Exception {
        RendererListener testSubject0 = mock(RendererListener.class);
        testSubject0.frameRenderingPrepared(_String, _RendererEvent);
        testSubject0.frameRenderingStarted(_String, _RendererEvent);
        testSubject0.frameRenderingFinished(_String, _RendererEvent);
        testSubject0.sectionRenderingPrepared(_String, _RendererEvent);
        testSubject0.sectionRenderingStarted(_String, _RendererEvent);
        testSubject0.sectionRenderingFinished(_String, _RendererEvent);
        testSubject0.sectionItemPrepared(_String, _RendererEvent);
        testSubject0.sectionItemFinished(_String, _RendererEvent);
    }

    public void verifyInterfaceRenderingDirector() throws Exception {
        RenderingDirector testSubject0 = mock(RenderingDirector.class);
        boolean result0 = testSubject0.renderEmptyFrameSection(_ManchesterOWLSyntax,
                _OWLOntology_array);
    }

    public void verifySectionMap() throws Exception {
        SectionMap testSubject0 = new SectionMap();
        testSubject0.add(_Object, _OWLAxiom);
        testSubject0.remove(_Object);
        boolean result0 = testSubject0.isEmpty();
        java.util.Collection<java.lang.Object> result1 = testSubject0.getSectionObjects();
        java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation>> result2 = testSubject0
                .getAnnotationsForSectionObject(_Object);
    }

    private boolean _boolean;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Collection<?> _Collection;
    private java.util.Set<org.semanticweb.owlapi.model.OWLOntology> _Set;
    private org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntax _ManchesterOWLSyntax;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.AxiomType<?> _AxiomType;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationSubject _OWLAnnotationSubject;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataComplementOf _OWLDataComplementOf;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataHasValue _OWLDataHasValue;
    private org.semanticweb.owlapi.model.OWLDataIntersectionOf _OWLDataIntersectionOf;
    private org.semanticweb.owlapi.model.OWLDataMaxCardinality _OWLDataMaxCardinality;
    private org.semanticweb.owlapi.model.OWLDataMinCardinality _OWLDataMinCardinality;
    private org.semanticweb.owlapi.model.OWLDataOneOf _OWLDataOneOf;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom _OWLDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom _OWLDataPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataUnionOf _OWLDataUnionOf;
    private org.semanticweb.owlapi.model.OWLDatatype _OWLDatatype;
    private org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom _OWLDatatypeDefinitionAxiom;
    private org.semanticweb.owlapi.model.OWLDatatypeRestriction _OWLDatatypeRestriction;
    private org.semanticweb.owlapi.model.OWLDeclarationAxiom _OWLDeclarationAxiom;
    private org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom _OWLDifferentIndividualsAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointClassesAxiom _OWLDisjointClassesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom _OWLDisjointDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom _OWLDisjointObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLDisjointUnionAxiom _OWLDisjointUnionAxiom;
    private org.semanticweb.owlapi.model.OWLEntity _OWLEntity;
    private org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLFacetRestriction _OWLFacetRestriction;
    private org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLHasKeyAxiom _OWLHasKeyAxiom;
    private org.semanticweb.owlapi.model.OWLIndividual _OWLIndividual;
    private org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObject _OWLObject;
    private org.semanticweb.owlapi.model.OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectComplementOf _OWLObjectComplementOf;
    private org.semanticweb.owlapi.model.OWLObjectExactCardinality _OWLObjectExactCardinality;
    private org.semanticweb.owlapi.model.OWLObjectHasSelf _OWLObjectHasSelf;
    private org.semanticweb.owlapi.model.OWLObjectHasValue _OWLObjectHasValue;
    private org.semanticweb.owlapi.model.OWLObjectIntersectionOf _OWLObjectIntersectionOf;
    private org.semanticweb.owlapi.model.OWLObjectInverseOf _OWLObjectInverseOf;
    private org.semanticweb.owlapi.model.OWLObjectMaxCardinality _OWLObjectMaxCardinality;
    private org.semanticweb.owlapi.model.OWLObjectMinCardinality _OWLObjectMinCardinality;
    private org.semanticweb.owlapi.model.OWLObjectOneOf _OWLObjectOneOf;
    private org.semanticweb.owlapi.model.OWLObjectProperty _OWLObjectProperty;
    private org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom _OWLObjectPropertyAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom _OWLObjectPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private org.semanticweb.owlapi.model.OWLObjectUnionOf _OWLObjectUnionOf;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.OWLOntology[] _OWLOntology_array;
    private org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.SWRLBuiltInAtom _SWRLBuiltInAtom;
    private org.semanticweb.owlapi.model.SWRLClassAtom _SWRLClassAtom;
    private org.semanticweb.owlapi.model.SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLDataRangeAtom _SWRLDataRangeAtom;
    private org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private org.semanticweb.owlapi.model.SWRLIndividualArgument _SWRLIndividualArgument;
    private org.semanticweb.owlapi.model.SWRLLiteralArgument _SWRLLiteralArgument;
    private org.semanticweb.owlapi.model.SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private org.semanticweb.owlapi.model.SWRLRule _SWRLRule;
    private org.semanticweb.owlapi.model.SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private org.semanticweb.owlapi.model.SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.util.OWLAxiomFilter _OWLAxiomFilter;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxFrameRenderer _ManchesterOWLSyntaxFrameRenderer;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RendererEvent _RendererEvent;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RendererListener _RendererListener;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RenderingDirector _RenderingDirector;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.SectionMap _SectionMap;
}
