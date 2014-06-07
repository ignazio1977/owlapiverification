package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;

import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi_mansyntaxrenderer {
    public void verifyAbstractRenderer() throws OWLRendererException {
        AbstractRenderer testSubject0 = new AbstractRenderer(_Writer, _ShortFormProvider);
        testSubject0.flush();
        testSubject0.setUseTabbing(_boolean);
        testSubject0.setUseWrapping(_boolean);
        boolean result0 = testSubject0.isUseWrapping();
        boolean result1 = testSubject0.isUseTabbing();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxFrameRenderer() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxObjectRenderer.class.isAssignableFrom(ManchesterOWLSyntaxFrameRenderer.class));
        assertTrue(OWLEntityVisitor.class.isAssignableFrom(ManchesterOWLSyntaxFrameRenderer.class));
    }

    public void verifyManchesterOWLSyntaxFrameRenderer() throws OWLRendererException {
        ManchesterOWLSyntaxFrameRenderer testSubject0 = new ManchesterOWLSyntaxFrameRenderer(_Set, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject1 = new ManchesterOWLSyntaxFrameRenderer(_Set, _OWLOntology, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject2 = new ManchesterOWLSyntaxFrameRenderer(_OWLOntologyManager, _Set, _OWLOntology, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject3 = new ManchesterOWLSyntaxFrameRenderer(_OWLOntology, _Writer, _ShortFormProvider);
        ManchesterOWLSyntaxFrameRenderer testSubject4 = new ManchesterOWLSyntaxFrameRenderer(_OWLOntologyManager, _OWLOntology, _Writer, _ShortFormProvider);
        java.util.Set<OWLAxiom> result0 = testSubject0.write(_OWLDataProperty);
        java.util.Set<OWLAxiom> result1 = testSubject0.write(_OWLIndividual);
        java.util.Set<OWLAxiom> result2 = testSubject0.write(_OWLObjectPropertyExpression);
        java.util.Set<OWLAxiom> result3 = testSubject0.write(_OWLClass);
        java.util.Set<OWLAxiom> result4 = testSubject0.write(_OWLDatatype);
        java.util.Set<OWLAxiom> result5 = testSubject0.write(_SWRLRule);
        java.util.Set<OWLAxiom> result6 = testSubject0.write(_OWLAnnotationProperty);
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
        testSubject0.writeSection(_ManchesterOWLSyntax, _SectionMap, _String, _boolean, _OWLOntology_array);
        testSubject0.writeSection(_ManchesterOWLSyntax);
        testSubject0.writeSection(_ManchesterOWLSyntax, _Collection, _String, _boolean, _OWLOntology_array);
        testSubject0.writeFullURI(_String);
        boolean result7 = testSubject0.isFiltered(_AxiomType);
        boolean result8 = testSubject0.isDisplayed(_OWLAxiom);
        java.util.Set<OWLAxiom> result9 = testSubject0.writeFrame(_OWLEntity);
        testSubject0.writeComment(_String, _boolean);
        testSubject0.writeComment(_String, _String, _boolean);
        java.util.Set<OWLOntology> result10 = testSubject0.getOntologies();
        java.util.Set<OWLAnnotationAssertionAxiom> result11 = testSubject0.writeAnnotations(_OWLAnnotationSubject);
        testSubject0.flush();
        testSubject0.setUseTabbing(_boolean);
        testSubject0.setUseWrapping(_boolean);
        boolean result12 = testSubject0.isUseWrapping();
        boolean result13 = testSubject0.isUseTabbing();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxObjectRenderer() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.AbstractRenderer.class.isAssignableFrom(ManchesterOWLSyntaxObjectRenderer.class));
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(ManchesterOWLSyntaxObjectRenderer.class));
    }

    public void verifyManchesterOWLSyntaxObjectRenderer() throws OWLRendererException {
        ManchesterOWLSyntaxObjectRenderer testSubject0 = new ManchesterOWLSyntaxObjectRenderer(_Writer, _ShortFormProvider);
        testSubject0.flush();
        testSubject0.setUseTabbing(_boolean);
        testSubject0.setUseWrapping(_boolean);
        boolean result0 = testSubject0.isUseWrapping();
        boolean result1 = testSubject0.isUseTabbing();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyStorer() {
        assertTrue(org.semanticweb.owlapi.util.AbstractOWLOntologyStorer.class.isAssignableFrom(ManchesterOWLSyntaxOntologyStorer.class));
    }

    public void verifyManchesterOWLSyntaxOntologyStorer() throws OWLOntologyStorageException {
        ManchesterOWLSyntaxOntologyStorer testSubject0 = new ManchesterOWLSyntaxOntologyStorer();
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxOntologyStorerException() {
        assertTrue(OWLOntologyStorageException.class.isAssignableFrom(ManchesterOWLSyntaxOntologyStorerException.class));
    }

    public void verifyManchesterOWLSyntaxOntologyStorerException() {
        ManchesterOWLSyntaxOntologyStorerException testSubject0 = new ManchesterOWLSyntaxOntologyStorerException(_String);
        ManchesterOWLSyntaxOntologyStorerException testSubject1 = new ManchesterOWLSyntaxOntologyStorerException(_String, _Throwable);
        ManchesterOWLSyntaxOntologyStorerException testSubject2 = new ManchesterOWLSyntaxOntologyStorerException(_Throwable);
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
    public void enforceInterfacesManchesterOWLSyntaxOWLObjectRendererImpl() {
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class.isAssignableFrom(ManchesterOWLSyntaxOWLObjectRendererImpl.class));
    }

    public void verifyManchesterOWLSyntaxOWLObjectRendererImpl() {
        ManchesterOWLSyntaxOWLObjectRendererImpl testSubject0 = new ManchesterOWLSyntaxOWLObjectRendererImpl();
        String result0 = testSubject0.render(_OWLObject);
        testSubject0.setShortFormProvider(_ShortFormProvider);
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxPrefixNameShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(ManchesterOWLSyntaxPrefixNameShortFormProvider.class));
    }

    public void verifyManchesterOWLSyntaxPrefixNameShortFormProvider() {
        ManchesterOWLSyntaxPrefixNameShortFormProvider testSubject0 = new ManchesterOWLSyntaxPrefixNameShortFormProvider(_DefaultPrefixManager);
        ManchesterOWLSyntaxPrefixNameShortFormProvider testSubject1 = new ManchesterOWLSyntaxPrefixNameShortFormProvider(_OWLOntologyFormat);
        ManchesterOWLSyntaxPrefixNameShortFormProvider testSubject2 = new ManchesterOWLSyntaxPrefixNameShortFormProvider(_OWLOntologyManager, _OWLOntology);
        String result0 = testSubject0.getShortForm(_IRI);
        String result1 = testSubject0.getShortForm(_OWLEntity);
        PrefixManager result2 = testSubject0.getPrefixManager();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxRenderer() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLRenderer.class.isAssignableFrom(ManchesterOWLSyntaxRenderer.class));
    }

    public void verifyManchesterOWLSyntaxRenderer() throws OWLRendererException {
        ManchesterOWLSyntaxRenderer testSubject0 = new ManchesterOWLSyntaxRenderer(_OWLOntologyManager);
        ManchesterOWLSyntaxRenderer testSubject1 = new ManchesterOWLSyntaxRenderer();
        testSubject0.render(_OWLOntology, _Writer);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        testSubject0.render(_OWLOntology, _OutputStream);
    }

    public void verifyRendererEvent() {
        RendererEvent testSubject0 = new RendererEvent(_ManchesterOWLSyntaxFrameRenderer, _OWLObject);
        uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxFrameRenderer result0 = testSubject0.getFrameRenderer();
        testSubject0.writeCommentOnNewLine(_String);
        OWLObject result1 = testSubject0.getFrameSubject();
        testSubject0.writeComment(_String);
    }

    public void verifyInterfaceRendererListener() {
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

    public void verifyInterfaceRenderingDirector() {
        RenderingDirector testSubject0 = mock(RenderingDirector.class);
        boolean result0 = testSubject0.renderEmptyFrameSection(_ManchesterOWLSyntax, _OWLOntology_array);
    }

    public void verifySectionMap() {
        SectionMap testSubject0 = new SectionMap();
        testSubject0.add(_Object, _OWLAxiom);
        testSubject0.remove(_Object);
        boolean result0 = testSubject0.isEmpty();
        java.util.Collection<Object> result1 = testSubject0.getSectionObjects();
        java.util.Set<java.util.Set<OWLAnnotation>> result2 = testSubject0.getAnnotationsForSectionObject(_Object);
    }

    private boolean _boolean;
    private java.io.OutputStream _OutputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Writer _Writer;
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.util.Collection<?> _Collection;
    private java.util.Set<OWLOntology> _Set;
    private org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntax _ManchesterOWLSyntax;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private AxiomType<?> _AxiomType;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnnotationSubject _OWLAnnotationSubject;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private OWLDataComplementOf _OWLDataComplementOf;
    private OWLDataExactCardinality _OWLDataExactCardinality;
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
    private OWLEntity _OWLEntity;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLIndividual _OWLIndividual;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObject _OWLObject;
    private OWLObjectAllValuesFrom _OWLObjectAllValuesFrom;
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
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLOntology[] _OWLOntology_array;
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
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private org.semanticweb.owlapi.util.OWLAxiomFilter _OWLAxiomFilter;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.ManchesterOWLSyntaxFrameRenderer _ManchesterOWLSyntaxFrameRenderer;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RendererEvent _RendererEvent;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RendererListener _RendererListener;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.RenderingDirector _RenderingDirector;
    private uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.SectionMap _SectionMap;
}
