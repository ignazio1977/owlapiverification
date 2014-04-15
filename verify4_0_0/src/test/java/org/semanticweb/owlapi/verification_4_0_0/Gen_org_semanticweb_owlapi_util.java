package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "unchecked", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_util {
    @Test
    public void enforceInterfacesAbstractOWLOntologyStorer() {
        assertTrue(OWLOntologyStorer.class.isAssignableFrom(AbstractOWLOntologyStorer.class));
    }

    public void verifyAbstractOWLOntologyStorer() throws OWLOntologyStorageException {
        AbstractOWLOntologyStorer testSubject0 = mock(AbstractOWLOntologyStorer.class);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesAnnotationValueShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(AnnotationValueShortFormProvider.class));
    }

    public void verifyAnnotationValueShortFormProvider() {
        AnnotationValueShortFormProvider testSubject0 = new AnnotationValueShortFormProvider(_OWLOntologySetProvider, _ShortFormProvider, _IRIShortFormProvider, _List, _Map,
                _OWLAnnotationValueVisitorEx);
        AnnotationValueShortFormProvider testSubject1 = new AnnotationValueShortFormProvider(_OWLOntologySetProvider, _ShortFormProvider, _IRIShortFormProvider, _List, _Map);
        AnnotationValueShortFormProvider testSubject2 = new AnnotationValueShortFormProvider(_List, _Map, _OWLOntologySetProvider, _ShortFormProvider);
        AnnotationValueShortFormProvider testSubject3 = new AnnotationValueShortFormProvider(_List, _Map, _OWLOntologySetProvider);
        java.util.List<OWLAnnotationProperty> result0 = testSubject0.getAnnotationProperties();
        java.util.Map<OWLAnnotationProperty, java.util.List<java.lang.String>> result1 = testSubject0.getPreferredLanguageMap();
        java.lang.String result2 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    public void verifyInterfaceAnonymousNodeChecker() {
        AnonymousNodeChecker testSubject0 = mock(AnonymousNodeChecker.class);
        boolean result0 = testSubject0.isAnonymousNode(_IRI);
        boolean result1 = testSubject0.isAnonymousNode(_String);
        boolean result2 = testSubject0.isAnonymousSharedNode(_String);
    }

    @Test
    public void enforceInterfacesAnonymousNodeCheckerImpl() {
        assertTrue(org.semanticweb.owlapi.util.AnonymousNodeChecker.class.isAssignableFrom(AnonymousNodeCheckerImpl.class));
    }

    public void verifyAnonymousNodeCheckerImpl() {
        AnonymousNodeCheckerImpl testSubject0 = new AnonymousNodeCheckerImpl();
        boolean result0 = testSubject0.isAnonymousNode(_String);
        boolean result1 = testSubject0.isAnonymousNode(_IRI);
        boolean result2 = testSubject0.isAnonymousSharedNode(_String);
    }

    @Test
    public void enforceInterfacesAutoIRIMapper() {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class.isAssignableFrom(AutoIRIMapper.class));
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(AutoIRIMapper.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(AutoIRIMapper.class));
    }

    public void verifyAutoIRIMapper() throws IOException, SAXException {
        AutoIRIMapper testSubject0 = new AutoIRIMapper(_File, _boolean);
        testSubject0.update();
        java.util.Set<java.lang.String> result0 = testSubject0.getFileExtensions();
        testSubject0.setFileExtensions(_Set);
        java.util.Set<IRI> result1 = testSubject0.getOntologyIRIs();
        testSubject0.startElement(_String, _String, _String, _Attributes);
        IRI result2 = testSubject0.getDocumentIRI(_IRI);
        testSubject0.error(_SAXParseException);
        org.xml.sax.InputSource result3 = testSubject0.resolveEntity(_String, _String);
        testSubject0.notationDecl(_String, _String, _String);
        testSubject0.unparsedEntityDecl(_String, _String, _String, _String);
        testSubject0.setDocumentLocator(_Locator);
        testSubject0.startDocument();
        testSubject0.endDocument();
        testSubject0.startPrefixMapping(_String, _String);
        testSubject0.endPrefixMapping(_String);
        testSubject0.endElement(_String, _String, _String);
        testSubject0.characters(_char_array, _int, _int);
        testSubject0.ignorableWhitespace(_char_array, _int, _int);
        testSubject0.processingInstruction(_String, _String);
        testSubject0.skippedEntity(_String);
        testSubject0.fatalError(_SAXParseException);
        testSubject0.warning(_SAXParseException);
    }

    @Test
    public void enforceInterfacesAxiomSubjectProvider() {
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(AxiomSubjectProvider.class));
    }

    public void verifyAxiomSubjectProvider() {
        AxiomSubjectProvider testSubject0 = new AxiomSubjectProvider();
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result0 = testSubject0.getSubject(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesBidirectionalShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(BidirectionalShortFormProvider.class));
    }

    public void verifyInterfaceBidirectionalShortFormProvider() {
        BidirectionalShortFormProvider testSubject0 = mock(BidirectionalShortFormProvider.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities(_String);
        OWLEntity result1 = testSubject0.getEntity(_String);
        java.util.Set<java.lang.String> result2 = testSubject0.getShortForms();
        java.lang.String result3 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesBidirectionalShortFormProviderAdapter() {
        assertTrue(org.semanticweb.owlapi.util.CachingBidirectionalShortFormProvider.class.isAssignableFrom(BidirectionalShortFormProviderAdapter.class));
    }

    public void verifyBidirectionalShortFormProviderAdapter() {
        BidirectionalShortFormProviderAdapter testSubject0 = new BidirectionalShortFormProviderAdapter(_OWLOntologyManager, _Set61, _ShortFormProvider);
        BidirectionalShortFormProviderAdapter testSubject1 = new BidirectionalShortFormProviderAdapter(_Set61, _ShortFormProvider);
        BidirectionalShortFormProviderAdapter testSubject2 = new BidirectionalShortFormProviderAdapter(_ShortFormProvider);
        testSubject0.dispose();
        testSubject0.add(_OWLEntity);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities(_String);
        OWLEntity result1 = testSubject0.getEntity(_String);
        java.util.Set<java.lang.String> result2 = testSubject0.getShortForms();
        java.lang.String result3 = testSubject0.getShortForm(_OWLEntity);
    }

    @Test
    public void enforceInterfacesCachingBidirectionalShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.BidirectionalShortFormProvider.class.isAssignableFrom(CachingBidirectionalShortFormProvider.class));
    }

    public void verifyCachingBidirectionalShortFormProvider() {
        CachingBidirectionalShortFormProvider testSubject0 = mock(CachingBidirectionalShortFormProvider.class);
        testSubject0.add(_OWLEntity);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities(_String);
        OWLEntity result1 = testSubject0.getEntity(_String);
        java.util.Set<java.lang.String> result2 = testSubject0.getShortForms();
        java.lang.String result3 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    public void verifyCollectionFactory() {
        CollectionFactory testSubject0 = new CollectionFactory();
        java.util.Map<Object, Object> result0 = CollectionFactory.createMap();
        java.util.Set<java.lang.Object> result1 = CollectionFactory.getCopyOnRequestSetFromImmutableCollection(_Collection);
        java.util.Set<java.lang.Object> result2 = CollectionFactory.createSet(_Collection);
        java.util.Set<java.lang.Object> result3 = CollectionFactory.createSet(_int);
        java.util.Set<java.lang.Object> result4 = CollectionFactory.createSet();
        java.util.Set<java.lang.Object> result5 = CollectionFactory.createSet(_Object_array);
        CollectionFactory.setExpectedThreads(_int);
        int result6 = CollectionFactory.getExpectedThreads();
        java.util.List<java.lang.Object> result7 = CollectionFactory.createList();
        java.util.Map<Object, java.lang.ref.WeakReference<java.lang.Object>> result8 = CollectionFactory.createSyncWeakMap();
        java.util.Set<java.lang.Object> result9 = CollectionFactory.createSyncSet();
        java.util.concurrent.ConcurrentHashMap<Object, Object> result10 = CollectionFactory.createSyncMap();
        java.util.Set<java.lang.Object> result11 = CollectionFactory.getCopyOnRequestSet(_Collection);
        java.util.Set<java.lang.Object> result12 = CollectionFactory.getThreadSafeCopyOnRequestSet(_Set64);
        java.util.Set<java.lang.Object> result13 = CollectionFactory.getCopyOnRequestSetFromMutableCollection(_Collection);
    }

    @Test
    public void enforceInterfacesCommonBaseIRIMapper() {
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(CommonBaseIRIMapper.class));
    }

    public void verifyCommonBaseIRIMapper() {
        CommonBaseIRIMapper testSubject0 = new CommonBaseIRIMapper(_IRI);
        testSubject0.addMapping(_IRI, _String);
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesDefaultPrefixManager() {
        assertTrue(PrefixManager.class.isAssignableFrom(DefaultPrefixManager.class));
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(DefaultPrefixManager.class));
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class.isAssignableFrom(DefaultPrefixManager.class));
    }

    public void verifyDefaultPrefixManager() {
        DefaultPrefixManager testSubject0 = new DefaultPrefixManager(_String, _Comparator);
        DefaultPrefixManager testSubject1 = new DefaultPrefixManager(_String);
        DefaultPrefixManager testSubject2 = new DefaultPrefixManager(_PrefixManager);
        DefaultPrefixManager testSubject3 = new DefaultPrefixManager(_Comparator);
        DefaultPrefixManager testSubject4 = new DefaultPrefixManager();
        DefaultPrefixManager testSubject5 = new DefaultPrefixManager(_PrefixManager, _Comparator);
        testSubject0.clear();
        IRI result0 = testSubject0.getIRI(_String);
        java.lang.String result1 = testSubject0.getShortForm(_OWLEntity);
        java.lang.String result2 = testSubject0.getShortForm(_IRI);
        testSubject0.dispose();
        testSubject0.setPrefix(_String, _String);
        java.util.Set<java.lang.String> result3 = testSubject0.getPrefixNames();
        testSubject0.setDefaultPrefix(_String);
        boolean result4 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result5 = testSubject0.getDefaultPrefix();
        java.util.Map<java.lang.String, java.lang.String> result6 = testSubject0.getPrefixName2PrefixMap();
        java.lang.String result7 = testSubject0.getPrefix(_String);
        java.lang.String result8 = testSubject0.getPrefixIRI(_IRI);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        testSubject0.unregisterNamespace(_String);
    }

    @Test
    public void enforceInterfacesDelegatingObjectVisitorEx() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(DelegatingObjectVisitorEx.class));
    }

    public void verifyDelegatingObjectVisitorEx() {
        DelegatingObjectVisitorEx<OWLObject> testSubject0 = new DelegatingObjectVisitorEx<OWLObject>(_OWLObjectVisitorEx);
        OWLObject result0 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result1 = testSubject0.visit(_OWLDatatype);
        OWLObject result2 = testSubject0.visit(_OWLLiteral);
        OWLObject result3 = testSubject0.visit(_OWLFacetRestriction);
        OWLObject result4 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result5 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result6 = testSubject0.visit(_SWRLVariable);
        OWLObject result7 = testSubject0.visit(_SWRLLiteralArgument);
        OWLObject result8 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result9 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result10 = testSubject0.visit(_OWLDataProperty);
        OWLObject result11 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLObject result12 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLObject result13 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLObject result14 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLObject result15 = testSubject0.visit(_OWLObjectComplementOf);
        OWLObject result16 = testSubject0.visit(_OWLObjectHasValue);
        OWLObject result17 = testSubject0.visit(_OWLObjectUnionOf);
        OWLObject result18 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLObject result19 = testSubject0.visit(_OWLObjectHasSelf);
        OWLObject result20 = testSubject0.visit(_OWLObjectOneOf);
        OWLObject result21 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLObject result22 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result23 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result24 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result25 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result26 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result27 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result28 = testSubject0.visit(_IRI);
        OWLObject result29 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result30 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result31 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result32 = testSubject0.visit(_SWRLDataPropertyAtom);
        OWLObject result33 = testSubject0.visit(_SWRLDataRangeAtom);
        OWLObject result34 = testSubject0.visit(_SWRLClassAtom);
        OWLObject result35 = testSubject0.visit(_SWRLBuiltInAtom);
        OWLObject result36 = testSubject0.visit(_SWRLIndividualArgument);
        OWLObject result37 = testSubject0.visit(_OWLAnnotation);
        OWLObject result38 = testSubject0.visit(_OWLOntology);
        OWLObject result39 = testSubject0.visit(_SWRLSameIndividualAtom);
        OWLObject result40 = testSubject0.visit(_SWRLObjectPropertyAtom);
        OWLObject result41 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        OWLObject result42 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result43 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result44 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result45 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result46 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result47 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLObject result48 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result49 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result50 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result51 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result52 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result53 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result54 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result55 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result56 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result57 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result58 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result59 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result60 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result61 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result62 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result63 = testSubject0.visit(_OWLDataExactCardinality);
        OWLObject result64 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLObject result65 = testSubject0.visit(_OWLClass);
        OWLObject result66 = testSubject0.visit(_SWRLRule);
        OWLObject result67 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result68 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result69 = testSubject0.visit(_OWLObjectAllValuesFrom);
        OWLObject result70 = testSubject0.visit(_OWLDataHasValue);
        OWLObject result71 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLObject result72 = testSubject0.visit(_OWLDataMinCardinality);
        OWLObject result73 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLObject result74 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result75 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result76 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result77 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result78 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result79 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result80 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result81 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result82 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result83 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
    }

    @Test
    public void enforceInterfacesDLExpressivityChecker() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorAdapter.class.isAssignableFrom(DLExpressivityChecker.class));
    }

    public void verifyDLExpressivityChecker() {
        DLExpressivityChecker testSubject0 = new DLExpressivityChecker(_Set61);
        java.util.List<org.semanticweb.owlapi.util.DLExpressivityChecker.Construct> result0 = testSubject0.getConstructs();
        java.lang.String result1 = testSubject0.getDescriptionLogicName();
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
    }

    public void verifyEscapeUtils() {
        EscapeUtils testSubject0 = new EscapeUtils();
        java.lang.String result0 = EscapeUtils.escapeString(_String);
        java.lang.String result1 = EscapeUtils.unescapeString(_String);
    }

    @Test
    public void enforceInterfacesFilteringOWLOntologyChangeListener() {
        assertTrue(org.semanticweb.owlapi.util.OWLOntologyChangeFilter.class.isAssignableFrom(FilteringOWLOntologyChangeListener.class));
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(FilteringOWLOntologyChangeListener.class));
    }

    public void verifyFilteringOWLOntologyChangeListener() throws OWLException {
        FilteringOWLOntologyChangeListener testSubject0 = new FilteringOWLOntologyChangeListener();
        testSubject0.ontologiesChanged(_List111);
        testSubject0.visit(_AddImport);
        testSubject0.visit(_SetOntologyID);
        testSubject0.visit(_RemoveAxiom);
        testSubject0.visit(_RemoveImport);
        testSubject0.visit(_AddOntologyAnnotation);
        testSubject0.visit(_RemoveOntologyAnnotation);
        testSubject0.visit(_AddAxiom);
        testSubject0.processChanges(_List111);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesHashCode() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(HashCode.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(HashCode.class));
    }

    public void verifyHashCode() {
        HashCode testSubject0 = new HashCode();
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
    }

    @Test
    public void enforceInterfacesHasPriorityComparator() {
        assertTrue(java.util.Comparator.class.isAssignableFrom(HasPriorityComparator.class));
    }

    public void verifyHasPriorityComparator() {
        HasPriorityComparator<Object> testSubject0 = new HasPriorityComparator<Object>();
        int result0 = testSubject0.compare(_Object, _Object);
    }

    @Test
    public void enforceInterfacesHornAxiomVisitorEx() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomVisitorExAdapter.class.isAssignableFrom(HornAxiomVisitorEx.class));
    }

    public void verifyHornAxiomVisitorEx() {
        HornAxiomVisitorEx testSubject0 = new HornAxiomVisitorEx();
        java.lang.Object result0 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result1 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result2 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result4 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result5 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result9 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result10 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result11 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result12 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result13 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result14 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result15 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result17 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Boolean result18 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Boolean result19 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Boolean result20 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Boolean result21 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Boolean result22 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Boolean result23 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Boolean result24 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Boolean result25 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Boolean result26 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Boolean result27 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Boolean result28 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Boolean result29 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Boolean result30 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Boolean result31 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Boolean result32 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Boolean result33 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Boolean result34 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Boolean result35 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        Boolean result36 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        Boolean result37 = testSubject0.visit(_OWLClassAssertionAxiom);
        Boolean result38 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        Boolean result39 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        Boolean result40 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        Boolean result41 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        Boolean result42 = testSubject0.visit(_OWLHasKeyAxiom);
        Boolean result43 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        Boolean result44 = testSubject0.visit(_SWRLRule);
        Boolean result45 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        Boolean result46 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        Boolean result47 = testSubject0.visit(_OWLSameIndividualAxiom);
        Boolean result48 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        Boolean result49 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        Boolean result50 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        Boolean result51 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        Boolean result52 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        Boolean result53 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        Boolean result54 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        Boolean result55 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        Boolean result56 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesImportsStructureEntitySorter() {
        assertTrue(org.semanticweb.owlapi.util.ImportsStructureObjectSorter.class.isAssignableFrom(ImportsStructureEntitySorter.class));
    }

    public void verifyImportsStructureEntitySorter() {
        ImportsStructureEntitySorter testSubject0 = new ImportsStructureEntitySorter(_OWLOntology);
        java.util.Map<OWLOntology, java.util.Set<OWLEntity>> result0 = testSubject0.getObjects();
    }

    public void verifyImportsStructureObjectSorter() {
        ImportsStructureObjectSorter<OWLObject> testSubject0 = new ImportsStructureObjectSorter<OWLObject>(_OWLOntology, _ObjectSelector);
        java.util.Map<OWLOntology, java.util.Set<OWLObject>> result0 = testSubject0.getObjects();
    }

    public void verifyInterfaceInferredAxiomGenerator() {
        InferredAxiomGenerator<OWLAxiom> testSubject0 = mock(InferredAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredClassAssertionAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredIndividualAxiomGenerator.class.isAssignableFrom(InferredClassAssertionAxiomGenerator.class));
    }

    public void verifyInferredClassAssertionAxiomGenerator() {
        InferredClassAssertionAxiomGenerator testSubject0 = new InferredClassAssertionAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLClassAssertionAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredClassAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredClassAxiomGenerator.class));
    }

    public void verifyInferredClassAxiomGenerator() {
        InferredClassAxiomGenerator<OWLClassAxiom> testSubject0 = mock(InferredClassAxiomGenerator.class);
        java.util.Set<OWLClassAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredDataPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredDataPropertyAxiomGenerator.class));
    }

    public void verifyInferredDataPropertyAxiomGenerator() {
        InferredDataPropertyAxiomGenerator<OWLDataPropertyAxiom> testSubject0 = mock(InferredDataPropertyAxiomGenerator.class);
        java.util.Set<OWLDataPropertyAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredDataPropertyCharacteristicAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class.isAssignableFrom(InferredDataPropertyCharacteristicAxiomGenerator.class));
    }

    public void verifyInferredDataPropertyCharacteristicAxiomGenerator() {
        InferredDataPropertyCharacteristicAxiomGenerator testSubject0 = new InferredDataPropertyCharacteristicAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLDataPropertyCharacteristicAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredDisjointClassesAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class.isAssignableFrom(InferredDisjointClassesAxiomGenerator.class));
    }

    public void verifyInferredDisjointClassesAxiomGenerator() {
        InferredDisjointClassesAxiomGenerator testSubject0 = new InferredDisjointClassesAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLDisjointClassesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEntityAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredAxiomGenerator.class.isAssignableFrom(InferredEntityAxiomGenerator.class));
    }

    public void verifyInferredEntityAxiomGenerator() {
        InferredEntityAxiomGenerator<OWLEntity, OWLAxiom> testSubject0 = mock(InferredEntityAxiomGenerator.class);
        Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredEquivalentClassAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class.isAssignableFrom(InferredEquivalentClassAxiomGenerator.class));
    }

    public void verifyInferredEquivalentClassAxiomGenerator() {
        InferredEquivalentClassAxiomGenerator testSubject0 = new InferredEquivalentClassAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLEquivalentClassesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEquivalentDataPropertiesAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class.isAssignableFrom(InferredEquivalentDataPropertiesAxiomGenerator.class));
    }

    public void verifyInferredEquivalentDataPropertiesAxiomGenerator() {
        InferredEquivalentDataPropertiesAxiomGenerator testSubject0 = new InferredEquivalentDataPropertiesAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLEquivalentDataPropertiesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEquivalentObjectPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredEquivalentObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredEquivalentObjectPropertyAxiomGenerator() {
        InferredEquivalentObjectPropertyAxiomGenerator testSubject0 = new InferredEquivalentObjectPropertyAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLEquivalentObjectPropertiesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredIndividualAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredIndividualAxiomGenerator.class));
    }

    public void verifyInferredIndividualAxiomGenerator() {
        InferredIndividualAxiomGenerator<OWLIndividualAxiom> testSubject0 = mock(InferredIndividualAxiomGenerator.class);
        Set<OWLIndividualAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredInverseObjectPropertiesAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredInverseObjectPropertiesAxiomGenerator.class));
    }

    public void verifyInferredInverseObjectPropertiesAxiomGenerator() {
        InferredInverseObjectPropertiesAxiomGenerator testSubject0 = new InferredInverseObjectPropertiesAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLInverseObjectPropertiesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredObjectPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredObjectPropertyAxiomGenerator() {
        InferredObjectPropertyAxiomGenerator<OWLObjectPropertyAxiom> testSubject0 = mock(InferredObjectPropertyAxiomGenerator.class);
        Set<OWLObjectPropertyAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredObjectPropertyCharacteristicAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredObjectPropertyCharacteristicAxiomGenerator.class));
    }

    public void verifyInferredObjectPropertyCharacteristicAxiomGenerator() {
        InferredObjectPropertyCharacteristicAxiomGenerator testSubject0 = new InferredObjectPropertyCharacteristicAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLObjectPropertyCharacteristicAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    public void verifyInferredOntologyGenerator() {
        InferredOntologyGenerator testSubject0 = new InferredOntologyGenerator(_OWLReasoner, _List123);
        InferredOntologyGenerator testSubject1 = new InferredOntologyGenerator(_OWLReasoner);
        java.util.List<org.semanticweb.owlapi.util.InferredAxiomGenerator<?>> result0 = testSubject0.getAxiomGenerators();
        testSubject0.addGenerator(_InferredAxiomGenerator);
        testSubject0.removeGenerator(_InferredAxiomGenerator);
        testSubject0.fillOntology(_OWLDataFactory, _OWLOntology);
    }

    @Test
    public void enforceInterfacesInferredPropertyAssertionGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredIndividualAxiomGenerator.class.isAssignableFrom(InferredPropertyAssertionGenerator.class));
    }

    public void verifyInferredPropertyAssertionGenerator() {
        InferredPropertyAssertionGenerator testSubject0 = new InferredPropertyAssertionGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLPropertyAssertionAxiom<?, ?>> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubClassAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class.isAssignableFrom(InferredSubClassAxiomGenerator.class));
    }

    public void verifyInferredSubClassAxiomGenerator() {
        InferredSubClassAxiomGenerator testSubject0 = new InferredSubClassAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLSubClassOfAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubDataPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class.isAssignableFrom(InferredSubDataPropertyAxiomGenerator.class));
    }

    public void verifyInferredSubDataPropertyAxiomGenerator() {
        InferredSubDataPropertyAxiomGenerator testSubject0 = new InferredSubDataPropertyAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLSubDataPropertyOfAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubObjectPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredSubObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredSubObjectPropertyAxiomGenerator() {
        InferredSubObjectPropertyAxiomGenerator testSubject0 = new InferredSubObjectPropertyAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLSubObjectPropertyOfAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    public void verifyInterfaceIRIShortFormProvider() {
        IRIShortFormProvider testSubject0 = mock(IRIShortFormProvider.class);
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
    }

    @Test
    public void enforceInterfacesMaximumModalDepthFinder() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(MaximumModalDepthFinder.class));
    }

    public void verifyMaximumModalDepthFinder() {
        MaximumModalDepthFinder testSubject0 = new MaximumModalDepthFinder();
        java.lang.Object result0 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Object result1 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Object result2 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result4 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Object result5 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result9 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result10 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result11 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Object result12 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result13 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Object result14 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Object result15 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Object result17 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result18 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Object result19 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Object result20 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result21 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result22 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result23 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result24 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Object result25 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result26 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result27 = testSubject0.visit(_SWRLDataPropertyAtom);
        java.lang.Object result28 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Object result29 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result30 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result31 = testSubject0.visit(_SWRLRule);
        java.lang.Object result32 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result33 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result34 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result35 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result36 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result37 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result38 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result39 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result40 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result41 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result42 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result43 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result44 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Object result45 = testSubject0.visit(_OWLNamedIndividual);
        java.lang.Object result46 = testSubject0.visit(_OWLDataIntersectionOf);
        java.lang.Object result47 = testSubject0.visit(_SWRLObjectPropertyAtom);
        java.lang.Object result48 = testSubject0.visit(_OWLClass);
        java.lang.Object result49 = testSubject0.visit(_OWLAnnotationProperty);
        java.lang.Object result50 = testSubject0.visit(_SWRLBuiltInAtom);
        java.lang.Object result51 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Object result52 = testSubject0.visit(_OWLOntology);
        java.lang.Object result53 = testSubject0.visit(_SWRLClassAtom);
        java.lang.Object result54 = testSubject0.visit(_OWLAnonymousIndividual);
        java.lang.Object result55 = testSubject0.visit(_OWLObjectProperty);
        java.lang.Object result56 = testSubject0.visit(_OWLDatatype);
        java.lang.Object result57 = testSubject0.visit(_IRI);
        java.lang.Object result58 = testSubject0.visit(_OWLDataProperty);
        java.lang.Object result59 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Object result60 = testSubject0.visit(_OWLAnnotation);
        java.lang.Object result61 = testSubject0.visit(_SWRLDataRangeAtom);
        java.lang.Object result62 = testSubject0.visit(_OWLObjectInverseOf);
        java.lang.Object result63 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result64 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Object result65 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        java.lang.Object result66 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result67 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Object result68 = testSubject0.visit(_SWRLSameIndividualAtom);
        java.lang.Object result69 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Object result70 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Object result71 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Object result72 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Object result73 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Object result74 = testSubject0.visit(_SWRLIndividualArgument);
        java.lang.Object result75 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result76 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Object result77 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result78 = testSubject0.visit(_SWRLVariable);
        java.lang.Object result79 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Object result80 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result81 = testSubject0.visit(_SWRLLiteralArgument);
        java.lang.Object result82 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Object result83 = testSubject0.visit(_OWLObjectUnionOf);
        java.lang.Integer result84 = testSubject0.visit(_OWLObjectUnionOf);
        java.lang.Integer result85 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Integer result86 = testSubject0.visit(_SWRLLiteralArgument);
        java.lang.Integer result87 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Integer result88 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Integer result89 = testSubject0.visit(_SWRLSameIndividualAtom);
        java.lang.Integer result90 = testSubject0.visit(_SWRLVariable);
        java.lang.Integer result91 = testSubject0.visit(_OWLLiteral);
        java.lang.Integer result92 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Integer result93 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Integer result94 = testSubject0.visit(_SWRLIndividualArgument);
        java.lang.Integer result95 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Integer result96 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Integer result97 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Integer result98 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Integer result99 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Integer result100 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Integer result101 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Integer result102 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        java.lang.Integer result103 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Integer result104 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Integer result105 = testSubject0.visit(_OWLObjectInverseOf);
        java.lang.Integer result106 = testSubject0.visit(_SWRLDataRangeAtom);
        java.lang.Integer result107 = testSubject0.visit(_OWLAnnotation);
        java.lang.Integer result108 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Integer result109 = testSubject0.visit(_OWLDataProperty);
        java.lang.Integer result110 = testSubject0.visit(_SWRLObjectPropertyAtom);
        java.lang.Integer result111 = testSubject0.visit(_IRI);
        java.lang.Integer result112 = testSubject0.visit(_OWLDatatype);
        java.lang.Integer result113 = testSubject0.visit(_OWLObjectProperty);
        java.lang.Integer result114 = testSubject0.visit(_OWLAnonymousIndividual);
        java.lang.Integer result115 = testSubject0.visit(_SWRLClassAtom);
        java.lang.Integer result116 = testSubject0.visit(_OWLOntology);
        java.lang.Integer result117 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Integer result118 = testSubject0.visit(_SWRLBuiltInAtom);
        java.lang.Integer result119 = testSubject0.visit(_OWLAnnotationProperty);
        java.lang.Integer result120 = testSubject0.visit(_OWLClass);
        java.lang.Integer result121 = testSubject0.visit(_OWLDataIntersectionOf);
        java.lang.Integer result122 = testSubject0.visit(_OWLNamedIndividual);
        java.lang.Integer result123 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Integer result124 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Integer result125 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Integer result126 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Integer result127 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Integer result128 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Integer result129 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Integer result130 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Integer result131 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Integer result132 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Integer result133 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Integer result134 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Integer result135 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Integer result136 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Integer result137 = testSubject0.visit(_SWRLRule);
        java.lang.Integer result138 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Integer result139 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Integer result140 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Integer result141 = testSubject0.visit(_SWRLDataPropertyAtom);
        java.lang.Integer result142 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Integer result143 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Integer result144 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Integer result145 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Integer result146 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Integer result147 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Integer result148 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Integer result149 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Integer result150 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Integer result151 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Integer result152 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Integer result153 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Integer result154 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Integer result155 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Integer result156 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Integer result157 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Integer result158 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Integer result159 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Integer result160 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Integer result161 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Integer result162 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Integer result163 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Integer result164 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Integer result165 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Integer result166 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Integer result167 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
    }

    public void verifyInterfaceMonitorable() throws InterruptedException {
        Monitorable testSubject0 = mock(Monitorable.class);
        testSubject0.interrupt();
        testSubject0.setProgressMonitor(_ProgressMonitor);
        boolean result0 = testSubject0.canInterrupt();
    }

    public void verifyNamedConjunctChecker() {
        NamedConjunctChecker testSubject0 = new NamedConjunctChecker();
        boolean result0 = testSubject0.isNamedConjunct(_OWLClass, _OWLClassExpression);
        boolean result1 = testSubject0.hasNamedConjunct(_OWLClassExpression);
        java.util.Set<OWLClass> result2 = testSubject0.getNamedConjuncts(_OWLClassExpression);
    }

    public void verifyNamespaceUtil() {
        NamespaceUtil testSubject0 = new NamespaceUtil();
        java.util.Map<java.lang.String, java.lang.String> result0 = testSubject0.getNamespace2PrefixMap();
        testSubject0.setPrefix(_String, _String);
        java.lang.String result1 = testSubject0.getPrefix(_String);
    }

    @Test
    public void enforceInterfacesNNF() {
        assertTrue(OWLClassExpressionVisitorEx.class.isAssignableFrom(NNF.class));
        assertTrue(OWLDataVisitorEx.class.isAssignableFrom(NNF.class));
        assertTrue(OWLAxiomVisitorEx.class.isAssignableFrom(NNF.class));
    }

    public void verifyNNF() {
        NNF testSubject0 = new NNF(_OWLDataFactory);
        testSubject0.reset();
        java.lang.Object result0 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result1 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result2 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result4 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result5 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result9 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result10 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result11 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result12 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Object result13 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.lang.Object result14 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result15 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result17 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result18 = testSubject0.visit(_SWRLRule);
        java.lang.Object result19 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result20 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLAxiom result21 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result22 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result23 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result24 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result25 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result26 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result27 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result28 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result29 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result30 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result31 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result32 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result33 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Object result34 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Object result35 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Object result36 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Object result37 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Object result38 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Object result39 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Object result40 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Object result41 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Object result42 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Object result43 = testSubject0.visit(_OWLObjectUnionOf);
        java.lang.Object result44 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Object result45 = testSubject0.visit(_OWLClass);
        java.lang.Object result46 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Object result47 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Object result48 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Object result49 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Object result50 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result51 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result52 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Object result53 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result54 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Object result55 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result56 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result57 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result58 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Object result59 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Object result60 = testSubject0.visit(_OWLDatatype);
        java.lang.Object result61 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Object result62 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Object result63 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result64 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Object result65 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLDataRange result66 = testSubject0.visit(_OWLDataOneOf);
        OWLDataRange result67 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLDataRange result68 = testSubject0.visit(_OWLDataUnionOf);
        OWLAxiom result69 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLClassExpression result70 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLClassExpression result71 = testSubject0.visit(_OWLDataMinCardinality);
        OWLDataRange result72 = testSubject0.visit(_OWLDatatype);
        OWLDataRange result73 = testSubject0.visit(_OWLDataComplementOf);
        OWLAxiom result74 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLAxiom result75 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLAxiom result76 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLAxiom result77 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLDataRange result78 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLDataRange result79 = testSubject0.visit(_OWLLiteral);
        OWLDataRange result80 = testSubject0.visit(_OWLFacetRestriction);
        OWLAxiom result81 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLClassExpression result82 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLClassExpression result83 = testSubject0.visit(_OWLObjectAllValuesFrom);
        OWLClassExpression result84 = testSubject0.visit(_OWLObjectHasValue);
        OWLClassExpression result85 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLClassExpression result86 = testSubject0.visit(_OWLClass);
        OWLClassExpression result87 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLClassExpression result88 = testSubject0.visit(_OWLObjectUnionOf);
        OWLClassExpression result89 = testSubject0.visit(_OWLObjectComplementOf);
        OWLClassExpression result90 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLClassExpression result91 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLClassExpression result92 = testSubject0.visit(_OWLDataHasValue);
        OWLClassExpression result93 = testSubject0.visit(_OWLDataExactCardinality);
        OWLClassExpression result94 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLClassExpression result95 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLClassExpression result96 = testSubject0.visit(_OWLObjectHasSelf);
        OWLClassExpression result97 = testSubject0.visit(_OWLObjectOneOf);
        OWLAxiom result98 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLAxiom result99 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLAxiom result100 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLAxiom result101 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLAxiom result102 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLAxiom result103 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLAxiom result104 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLAxiom result105 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLAxiom result106 = testSubject0.visit(_SWRLRule);
        OWLAxiom result107 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLAxiom result108 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLAxiom result109 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLAxiom result110 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLAxiom result111 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLAxiom result112 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLAxiom result113 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLAxiom result114 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLAxiom result115 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLAxiom result116 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLAxiom result117 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLAxiom result118 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLAxiom result119 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLAxiom result120 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLAxiom result121 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLAxiom result122 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLAxiom result123 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLAxiom result124 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLAxiom result125 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLAxiom result126 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLAxiom result127 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLAxiom result128 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLAxiom result129 = testSubject0.visit(_OWLDisjointUnionAxiom);
    }

    @Test
    public void enforceInterfacesNonMappingOntologyIRIMapper() {
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(NonMappingOntologyIRIMapper.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(NonMappingOntologyIRIMapper.class));
    }

    public void verifyNonMappingOntologyIRIMapper() {
        NonMappingOntologyIRIMapper testSubject0 = new NonMappingOntologyIRIMapper();
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesNullProgressMonitor() {
        assertTrue(org.semanticweb.owlapi.util.ProgressMonitor.class.isAssignableFrom(NullProgressMonitor.class));
    }

    public void verifyNullProgressMonitor() {
        NullProgressMonitor testSubject0 = new NullProgressMonitor();
        testSubject0.setSize(_long);
        testSubject0.setStarted();
        testSubject0.setProgress(_long);
        testSubject0.setMessage(_String);
        testSubject0.setIndeterminate(_boolean);
        testSubject0.setFinished();
        boolean result0 = testSubject0.isCancelled();
    }

    public void verifyObjectPropertySimplifier() {
        ObjectPropertySimplifier testSubject0 = new ObjectPropertySimplifier(_OWLDataFactory);
        OWLObjectPropertyExpression result0 = testSubject0.getSimplified(_OWLObjectPropertyExpression);
    }

    public void verifyOntologyAxiomPair() {
        OntologyAxiomPair testSubject0 = new OntologyAxiomPair(_OWLOntology, _OWLAxiom);
        OWLAxiom result0 = testSubject0.getAxiom();
        OWLOntology result1 = testSubject0.getOntology();
    }

    @Test
    public void enforceInterfacesOntologyIRIShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class.isAssignableFrom(OntologyIRIShortFormProvider.class));
    }

    public void verifyOntologyIRIShortFormProvider() {
        OntologyIRIShortFormProvider testSubject0 = new OntologyIRIShortFormProvider();
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
        java.lang.String result1 = testSubject0.getShortForm(_OWLOntology);
    }

    public void verifyOWLAPIPreconditions() {
        OWLAPIPreconditions testSubject0 = new OWLAPIPreconditions();
        OWLAPIPreconditions.checkNotNegative(_long, _String);
        OWLAPIPreconditions.checkNotNegative(_long);
        java.lang.Object result0 = OWLAPIPreconditions.checkNotNull(_Object, _String);
        java.lang.Object result1 = OWLAPIPreconditions.checkNotNull(_Object);
        java.lang.Object result2 = OWLAPIPreconditions.checkNotNull(_Optional, _String);
    }

    public void verifyInterfaceOWLAxiomFilter() {
        OWLAxiomFilter testSubject0 = mock(OWLAxiomFilter.class);
        boolean result0 = testSubject0.passes(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesOWLAxiomSearchFilter() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLAxiomSearchFilter.class));
    }

    public void verifyInterfaceOWLAxiomSearchFilter() {
        OWLAxiomSearchFilter testSubject0 = mock(OWLAxiomSearchFilter.class);
        java.lang.Iterable<AxiomType<?>> result0 = testSubject0.getAxiomTypes();
        boolean result1 = testSubject0.pass(_OWLAxiom, _Object);
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitorAdapter() {
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(OWLAxiomVisitorAdapter.class));
    }

    public void verifyOWLAxiomVisitorAdapter() {
        OWLAxiomVisitorAdapter testSubject0 = new OWLAxiomVisitorAdapter();
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitorExAdapter() {
        assertTrue(OWLAxiomVisitorEx.class.isAssignableFrom(OWLAxiomVisitorExAdapter.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLAxiomVisitorExAdapter.class));
    }

    public void verifyOWLAxiomVisitorExAdapter() {
        OWLAxiomVisitorExAdapter<OWLObject> testSubject0 = new OWLAxiomVisitorExAdapter<OWLObject>();
        OWLAxiomVisitorExAdapter<OWLObject> testSubject1 = new OWLAxiomVisitorExAdapter<OWLObject>(_Object134);
        OWLObject result0 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result1 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result2 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result3 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result4 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result5 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result6 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result7 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result8 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result9 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result10 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result11 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result12 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result13 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result14 = testSubject0.visit(_SWRLRule);
        OWLObject result15 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result16 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result17 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result18 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result19 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result20 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result21 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result22 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result23 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result24 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        OWLObject result25 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result26 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result27 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result28 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result29 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result30 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLObject result31 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result32 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result33 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result34 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result35 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result36 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result37 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result38 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLClassExpressionCollector() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(OWLClassExpressionCollector.class));
    }

    public void verifyOWLClassExpressionCollector() {
        OWLClassExpressionCollector testSubject0 = new OWLClassExpressionCollector();
        java.lang.Object result0 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Object result1 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Object result2 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.lang.Object result3 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result4 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Object result5 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result6 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result7 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result8 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result9 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result10 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result11 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Object result12 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result13 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Object result14 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Object result15 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result16 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Object result17 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result18 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Object result19 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Object result20 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result21 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result22 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result23 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result24 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Object result25 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result26 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result27 = testSubject0.visit(_SWRLDataPropertyAtom);
        java.lang.Object result28 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Object result29 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result30 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result31 = testSubject0.visit(_SWRLRule);
        java.lang.Object result32 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result33 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result34 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result35 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result36 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result37 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result38 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result39 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result40 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result41 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result42 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result43 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result44 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Object result45 = testSubject0.visit(_OWLNamedIndividual);
        java.lang.Object result46 = testSubject0.visit(_OWLDataIntersectionOf);
        java.lang.Object result47 = testSubject0.visit(_SWRLObjectPropertyAtom);
        java.lang.Object result48 = testSubject0.visit(_OWLClass);
        java.lang.Object result49 = testSubject0.visit(_OWLAnnotationProperty);
        java.lang.Object result50 = testSubject0.visit(_SWRLBuiltInAtom);
        java.lang.Object result51 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Object result52 = testSubject0.visit(_OWLOntology);
        java.lang.Object result53 = testSubject0.visit(_SWRLClassAtom);
        java.lang.Object result54 = testSubject0.visit(_OWLAnonymousIndividual);
        java.lang.Object result55 = testSubject0.visit(_OWLObjectProperty);
        java.lang.Object result56 = testSubject0.visit(_OWLDatatype);
        java.lang.Object result57 = testSubject0.visit(_IRI);
        java.lang.Object result58 = testSubject0.visit(_OWLDataProperty);
        java.lang.Object result59 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Object result60 = testSubject0.visit(_OWLAnnotation);
        java.lang.Object result61 = testSubject0.visit(_SWRLDataRangeAtom);
        java.lang.Object result62 = testSubject0.visit(_OWLObjectInverseOf);
        java.lang.Object result63 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result64 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Object result65 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        java.lang.Object result66 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result67 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Object result68 = testSubject0.visit(_SWRLSameIndividualAtom);
        java.lang.Object result69 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Object result70 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Object result71 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Object result72 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Object result73 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Object result74 = testSubject0.visit(_SWRLIndividualArgument);
        java.lang.Object result75 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result76 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Object result77 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result78 = testSubject0.visit(_SWRLVariable);
        java.lang.Object result79 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Object result80 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result81 = testSubject0.visit(_SWRLLiteralArgument);
        java.lang.Object result82 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Object result83 = testSubject0.visit(_OWLObjectUnionOf);
        java.util.Set<OWLClassExpression> result84 = testSubject0.visit(_OWLObjectUnionOf);
        java.util.Set<OWLClassExpression> result85 = testSubject0.visit(_OWLFacetRestriction);
        java.util.Set<OWLClassExpression> result86 = testSubject0.visit(_SWRLLiteralArgument);
        java.util.Set<OWLClassExpression> result87 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result88 = testSubject0.visit(_OWLObjectComplementOf);
        java.util.Set<OWLClassExpression> result89 = testSubject0.visit(_SWRLSameIndividualAtom);
        java.util.Set<OWLClassExpression> result90 = testSubject0.visit(_SWRLVariable);
        java.util.Set<OWLClassExpression> result91 = testSubject0.visit(_OWLLiteral);
        java.util.Set<OWLClassExpression> result92 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.util.Set<OWLClassExpression> result93 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.util.Set<OWLClassExpression> result94 = testSubject0.visit(_SWRLIndividualArgument);
        java.util.Set<OWLClassExpression> result95 = testSubject0.visit(_OWLObjectHasValue);
        java.util.Set<OWLClassExpression> result96 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.util.Set<OWLClassExpression> result97 = testSubject0.visit(_OWLObjectMinCardinality);
        java.util.Set<OWLClassExpression> result98 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.util.Set<OWLClassExpression> result99 = testSubject0.visit(_OWLObjectExactCardinality);
        java.util.Set<OWLClassExpression> result100 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.util.Set<OWLClassExpression> result101 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result102 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        java.util.Set<OWLClassExpression> result103 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.util.Set<OWLClassExpression> result104 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.util.Set<OWLClassExpression> result105 = testSubject0.visit(_OWLObjectInverseOf);
        java.util.Set<OWLClassExpression> result106 = testSubject0.visit(_SWRLDataRangeAtom);
        java.util.Set<OWLClassExpression> result107 = testSubject0.visit(_OWLAnnotation);
        java.util.Set<OWLClassExpression> result108 = testSubject0.visit(_OWLDataOneOf);
        java.util.Set<OWLClassExpression> result109 = testSubject0.visit(_OWLDataProperty);
        java.util.Set<OWLClassExpression> result110 = testSubject0.visit(_SWRLObjectPropertyAtom);
        java.util.Set<OWLClassExpression> result111 = testSubject0.visit(_IRI);
        java.util.Set<OWLClassExpression> result112 = testSubject0.visit(_OWLDatatype);
        java.util.Set<OWLClassExpression> result113 = testSubject0.visit(_OWLObjectProperty);
        java.util.Set<OWLClassExpression> result114 = testSubject0.visit(_OWLAnonymousIndividual);
        java.util.Set<OWLClassExpression> result115 = testSubject0.visit(_SWRLClassAtom);
        java.util.Set<OWLClassExpression> result116 = testSubject0.visit(_OWLOntology);
        java.util.Set<OWLClassExpression> result117 = testSubject0.visit(_OWLDatatypeRestriction);
        java.util.Set<OWLClassExpression> result118 = testSubject0.visit(_SWRLBuiltInAtom);
        java.util.Set<OWLClassExpression> result119 = testSubject0.visit(_OWLAnnotationProperty);
        java.util.Set<OWLClassExpression> result120 = testSubject0.visit(_OWLClass);
        java.util.Set<OWLClassExpression> result121 = testSubject0.visit(_OWLDataIntersectionOf);
        java.util.Set<OWLClassExpression> result122 = testSubject0.visit(_OWLNamedIndividual);
        java.util.Set<OWLClassExpression> result123 = testSubject0.visit(_OWLDataUnionOf);
        java.util.Set<OWLClassExpression> result124 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.util.Set<OWLClassExpression> result125 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.util.Set<OWLClassExpression> result126 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.util.Set<OWLClassExpression> result127 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.util.Set<OWLClassExpression> result128 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result129 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result130 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.util.Set<OWLClassExpression> result131 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result132 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result133 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.util.Set<OWLClassExpression> result134 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.util.Set<OWLClassExpression> result135 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.util.Set<OWLClassExpression> result136 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.util.Set<OWLClassExpression> result137 = testSubject0.visit(_SWRLRule);
        java.util.Set<OWLClassExpression> result138 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.util.Set<OWLClassExpression> result139 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.util.Set<OWLClassExpression> result140 = testSubject0.visit(_OWLDataComplementOf);
        java.util.Set<OWLClassExpression> result141 = testSubject0.visit(_SWRLDataPropertyAtom);
        java.util.Set<OWLClassExpression> result142 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.util.Set<OWLClassExpression> result143 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.util.Set<OWLClassExpression> result144 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.util.Set<OWLClassExpression> result145 = testSubject0.visit(_OWLHasKeyAxiom);
        java.util.Set<OWLClassExpression> result146 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.util.Set<OWLClassExpression> result147 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.util.Set<OWLClassExpression> result148 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.util.Set<OWLClassExpression> result149 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.util.Set<OWLClassExpression> result150 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.util.Set<OWLClassExpression> result151 = testSubject0.visit(_OWLDataHasValue);
        java.util.Set<OWLClassExpression> result152 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.util.Set<OWLClassExpression> result153 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.util.Set<OWLClassExpression> result154 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.util.Set<OWLClassExpression> result155 = testSubject0.visit(_OWLObjectHasSelf);
        java.util.Set<OWLClassExpression> result156 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.util.Set<OWLClassExpression> result157 = testSubject0.visit(_OWLObjectOneOf);
        java.util.Set<OWLClassExpression> result158 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.util.Set<OWLClassExpression> result159 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.util.Set<OWLClassExpression> result160 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.util.Set<OWLClassExpression> result161 = testSubject0.visit(_OWLDeclarationAxiom);
        java.util.Set<OWLClassExpression> result162 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.util.Set<OWLClassExpression> result163 = testSubject0.visit(_OWLDataMinCardinality);
        java.util.Set<OWLClassExpression> result164 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.util.Set<OWLClassExpression> result165 = testSubject0.visit(_OWLDataExactCardinality);
        java.util.Set<OWLClassExpression> result166 = testSubject0.visit(_OWLDataMaxCardinality);
        java.util.Set<OWLClassExpression> result167 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
    }

    @Test
    public void enforceInterfacesOWLClassExpressionVisitorAdapter() {
        assertTrue(OWLClassExpressionVisitor.class.isAssignableFrom(OWLClassExpressionVisitorAdapter.class));
    }

    public void verifyOWLClassExpressionVisitorAdapter() {
        OWLClassExpressionVisitorAdapter testSubject0 = new OWLClassExpressionVisitorAdapter();
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
    }

    @Test
    public void enforceInterfacesOWLClassExpressionVisitorExAdapter() {
        assertTrue(OWLClassExpressionVisitorEx.class.isAssignableFrom(OWLClassExpressionVisitorExAdapter.class));
    }

    public void verifyOWLClassExpressionVisitorExAdapter() {
        OWLClassExpressionVisitorExAdapter<OWLObject> testSubject0 = new OWLClassExpressionVisitorExAdapter<OWLObject>();
        OWLClassExpressionVisitorExAdapter<OWLObject> testSubject1 = new OWLClassExpressionVisitorExAdapter<OWLObject>(_Object134);
        OWLObject result0 = testSubject0.visit(_OWLObjectOneOf);
        OWLObject result1 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLObject result2 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLObject result3 = testSubject0.visit(_OWLObjectHasSelf);
        OWLObject result4 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLObject result5 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLObject result6 = testSubject0.visit(_OWLDataExactCardinality);
        OWLObject result7 = testSubject0.visit(_OWLDataMinCardinality);
        OWLObject result8 = testSubject0.visit(_OWLDataHasValue);
        OWLObject result9 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLObject result10 = testSubject0.visit(_OWLObjectComplementOf);
        OWLObject result11 = testSubject0.visit(_OWLObjectUnionOf);
        OWLObject result12 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLObject result13 = testSubject0.visit(_OWLClass);
        OWLObject result14 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLObject result15 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLObject result16 = testSubject0.visit(_OWLObjectHasValue);
        OWLObject result17 = testSubject0.visit(_OWLObjectAllValuesFrom);
    }

    @Test
    public void enforceInterfacesOWLClassLiteralCollector() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectWalker.class.isAssignableFrom(OWLClassLiteralCollector.class));
    }

    public void verifyOWLClassLiteralCollector() {
        OWLClassLiteralCollector testSubject0 = new OWLClassLiteralCollector(_Set135);
        OWLClassLiteralCollector testSubject1 = new OWLClassLiteralCollector(_Set135, _boolean);
        java.util.Set<OWLClass> result0 = testSubject0.getNegativeLiterals();
        java.util.Set<OWLClass> result1 = testSubject0.getPositiveLiterals();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        testSubject0.walkStructure(_OWLObjectVisitorEx136);
        testSubject0.walkStructure(_OWLObjectVisitor);
        testSubject0.setStructureWalker(_ObjectStructureWalker);
        java.util.List<OWLClassExpression> result3 = testSubject0.getClassExpressionPath();
        boolean result4 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result5 = testSubject0.getDataRangePath();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.setAnnotation(_OWLAnnotation);
        OWLAxiom result6 = testSubject0.getAxiom();
        OWLOntology result7 = testSubject0.getOntology();
    }

    @Test
    public void enforceInterfacesOWLEntityCollectingOntologyChangeListener() {
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(OWLEntityCollectingOntologyChangeListener.class));
    }

    public void verifyOWLEntityCollectingOntologyChangeListener() throws OWLException {
        OWLEntityCollectingOntologyChangeListener testSubject0 = mock(OWLEntityCollectingOntologyChangeListener.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities();
        testSubject0.ontologiesChanged(_List111);
        testSubject0.ontologiesChanged();
    }

    @Test
    public void enforceInterfacesOWLEntityCollector() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(OWLEntityCollector.class));
        assertTrue(SWRLObjectVisitorEx.class.isAssignableFrom(OWLEntityCollector.class));
    }

    public void verifyOWLEntityCollector() {
        OWLEntityCollector testSubject0 = new OWLEntityCollector(_Set139);
        java.lang.Object result0 = testSubject0.visit(_OWLFacetRestriction);
        java.lang.Object result1 = testSubject0.visit(_OWLLiteral);
        java.lang.Object result2 = testSubject0.visit(_OWLObjectInverseOf);
        java.lang.Object result3 = testSubject0.visit(_OWLDatatypeRestriction);
        java.lang.Object result4 = testSubject0.visit(_OWLDataUnionOf);
        java.lang.Object result5 = testSubject0.visit(_OWLDataIntersectionOf);
        java.lang.Object result6 = testSubject0.visit(_OWLAnnotation);
        java.lang.Object result7 = testSubject0.visit(_OWLDatatype);
        java.lang.Object result8 = testSubject0.visit(_OWLNamedIndividual);
        java.lang.Object result9 = testSubject0.visit(_OWLDataProperty);
        java.lang.Object result10 = testSubject0.visit(_OWLObjectProperty);
        java.lang.Object result11 = testSubject0.visit(_OWLDataHasValue);
        java.lang.Object result12 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.lang.Object result13 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.lang.Object result14 = testSubject0.visit(_OWLObjectOneOf);
        java.lang.Object result15 = testSubject0.visit(_OWLObjectHasSelf);
        java.lang.Object result16 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.lang.Object result17 = testSubject0.visit(_OWLDataOneOf);
        java.lang.Object result18 = testSubject0.visit(_OWLDataComplementOf);
        java.lang.Object result19 = testSubject0.visit(_OWLDataMaxCardinality);
        java.lang.Object result20 = testSubject0.visit(_OWLDataExactCardinality);
        java.lang.Object result21 = testSubject0.visit(_OWLDataMinCardinality);
        java.lang.Object result22 = testSubject0.visit(_SWRLVariable);
        java.lang.Object result23 = testSubject0.visit(_SWRLBuiltInAtom);
        java.lang.Object result24 = testSubject0.visit(_SWRLDataPropertyAtom);
        java.lang.Object result25 = testSubject0.visit(_SWRLObjectPropertyAtom);
        java.lang.Object result26 = testSubject0.visit(_SWRLDataRangeAtom);
        java.lang.Object result27 = testSubject0.visit(_SWRLClassAtom);
        java.util.Collection<OWLEntity> result28 = testSubject0.visit(_SWRLSameIndividualAtom);
        java.lang.Object result29 = testSubject0.visit(_SWRLSameIndividualAtom);
        java.lang.Object result30 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        java.lang.Object result31 = testSubject0.visit(_SWRLLiteralArgument);
        java.lang.Object result32 = testSubject0.visit(_SWRLIndividualArgument);
        java.lang.Object result33 = testSubject0.visit(_OWLAnnotationProperty);
        java.lang.Object result34 = testSubject0.visit(_OWLOntology);
        java.lang.Object result35 = testSubject0.visit(_IRI);
        java.lang.Object result36 = testSubject0.visit(_OWLAnonymousIndividual);
        java.lang.Object result37 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.lang.Object result38 = testSubject0.visit(_SWRLRule);
        java.lang.Object result39 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.lang.Object result40 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Object result41 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Object result42 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Object result43 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.lang.Object result44 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Object result45 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.lang.Object result46 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.lang.Object result47 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Object result48 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.lang.Object result49 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.lang.Object result50 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.lang.Object result51 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Object result52 = testSubject0.visit(_OWLDeclarationAxiom);
        java.lang.Object result53 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.lang.Object result54 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.lang.Object result55 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Object result56 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Object result57 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result58 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.lang.Object result59 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.lang.Object result60 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result61 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result62 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.lang.Object result63 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.lang.Object result64 = testSubject0.visit(_OWLObjectComplementOf);
        java.lang.Object result65 = testSubject0.visit(_OWLObjectUnionOf);
        java.lang.Object result66 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.lang.Object result67 = testSubject0.visit(_OWLClass);
        java.lang.Object result68 = testSubject0.visit(_OWLHasKeyAxiom);
        java.lang.Object result69 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Object result70 = testSubject0.visit(_OWLObjectExactCardinality);
        java.lang.Object result71 = testSubject0.visit(_OWLObjectMinCardinality);
        java.lang.Object result72 = testSubject0.visit(_OWLObjectHasValue);
        java.lang.Object result73 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.lang.Object result74 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.lang.Object result75 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Object result76 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.lang.Object result77 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.lang.Object result78 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.lang.Object result79 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Object result80 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.lang.Object result81 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.lang.Object result82 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result83 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.lang.Object result84 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result85 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result86 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        java.util.Collection<OWLEntity> result87 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result88 = testSubject0.visit(_OWLSameIndividualAxiom);
        java.util.Collection<OWLEntity> result89 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        java.util.Collection<OWLEntity> result90 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        java.util.Collection<OWLEntity> result91 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.util.Collection<OWLEntity> result92 = testSubject0.visit(_OWLClassAssertionAxiom);
        java.util.Collection<OWLEntity> result93 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        java.util.Collection<OWLEntity> result94 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        java.util.Collection<OWLEntity> result95 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result96 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        java.util.Collection<OWLEntity> result97 = testSubject0.visit(_OWLObjectAllValuesFrom);
        java.util.Collection<OWLEntity> result98 = testSubject0.visit(_OWLObjectHasValue);
        java.util.Collection<OWLEntity> result99 = testSubject0.visit(_OWLObjectMinCardinality);
        java.util.Collection<OWLEntity> result100 = testSubject0.visit(_OWLObjectExactCardinality);
        java.util.Collection<OWLEntity> result101 = testSubject0.visit(_OWLHasKeyAxiom);
        java.util.Collection<OWLEntity> result102 = testSubject0.visit(_OWLClass);
        java.util.Collection<OWLEntity> result103 = testSubject0.visit(_OWLObjectIntersectionOf);
        java.util.Collection<OWLEntity> result104 = testSubject0.visit(_OWLObjectUnionOf);
        java.util.Collection<OWLEntity> result105 = testSubject0.visit(_OWLObjectComplementOf);
        java.util.Collection<OWLEntity> result106 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        java.util.Collection<OWLEntity> result107 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        java.util.Collection<OWLEntity> result108 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        java.util.Collection<OWLEntity> result109 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.util.Collection<OWLEntity> result110 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        java.util.Collection<OWLEntity> result111 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        java.util.Collection<OWLEntity> result112 = testSubject0.visit(_OWLSubClassOfAxiom);
        java.util.Collection<OWLEntity> result113 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.util.Collection<OWLEntity> result114 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result115 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result116 = testSubject0.visit(_OWLDisjointClassesAxiom);
        java.util.Collection<OWLEntity> result117 = testSubject0.visit(_OWLDisjointUnionAxiom);
        java.util.Collection<OWLEntity> result118 = testSubject0.visit(_OWLDeclarationAxiom);
        java.util.Collection<OWLEntity> result119 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result120 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        java.util.Collection<OWLEntity> result121 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        java.util.Collection<OWLEntity> result122 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        java.util.Collection<OWLEntity> result123 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        java.util.Collection<OWLEntity> result124 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        java.util.Collection<OWLEntity> result125 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        java.util.Collection<OWLEntity> result126 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        java.util.Collection<OWLEntity> result127 = testSubject0.visit(_OWLOntology);
        java.util.Collection<OWLEntity> result128 = testSubject0.visit(_OWLAnnotationProperty);
        java.util.Collection<OWLEntity> result129 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        java.util.Collection<OWLEntity> result130 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        java.util.Collection<OWLEntity> result131 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        java.util.Collection<OWLEntity> result132 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        java.util.Collection<OWLEntity> result133 = testSubject0.visit(_OWLDatatype);
        java.util.Collection<OWLEntity> result134 = testSubject0.visit(_OWLAnnotation);
        java.util.Collection<OWLEntity> result135 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        java.util.Collection<OWLEntity> result136 = testSubject0.visit(_OWLAnonymousIndividual);
        java.util.Collection<OWLEntity> result137 = testSubject0.visit(_IRI);
        java.util.Collection<OWLEntity> result138 = testSubject0.visit(_SWRLBuiltInAtom);
        java.util.Collection<OWLEntity> result139 = testSubject0.visit(_SWRLVariable);
        java.util.Collection<OWLEntity> result140 = testSubject0.visit(_SWRLIndividualArgument);
        java.util.Collection<OWLEntity> result141 = testSubject0.visit(_SWRLLiteralArgument);
        java.util.Collection<OWLEntity> result142 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        java.util.Collection<OWLEntity> result143 = testSubject0.visit(_SWRLRule);
        java.util.Collection<OWLEntity> result144 = testSubject0.visit(_SWRLClassAtom);
        java.util.Collection<OWLEntity> result145 = testSubject0.visit(_SWRLDataRangeAtom);
        java.util.Collection<OWLEntity> result146 = testSubject0.visit(_SWRLObjectPropertyAtom);
        java.util.Collection<OWLEntity> result147 = testSubject0.visit(_SWRLDataPropertyAtom);
        java.util.Collection<OWLEntity> result148 = testSubject0.visit(_OWLDataHasValue);
        java.util.Collection<OWLEntity> result149 = testSubject0.visit(_OWLDataMinCardinality);
        java.util.Collection<OWLEntity> result150 = testSubject0.visit(_OWLDataExactCardinality);
        java.util.Collection<OWLEntity> result151 = testSubject0.visit(_OWLDataMaxCardinality);
        java.util.Collection<OWLEntity> result152 = testSubject0.visit(_OWLDataComplementOf);
        java.util.Collection<OWLEntity> result153 = testSubject0.visit(_OWLObjectMaxCardinality);
        java.util.Collection<OWLEntity> result154 = testSubject0.visit(_OWLObjectHasSelf);
        java.util.Collection<OWLEntity> result155 = testSubject0.visit(_OWLObjectOneOf);
        java.util.Collection<OWLEntity> result156 = testSubject0.visit(_OWLDataSomeValuesFrom);
        java.util.Collection<OWLEntity> result157 = testSubject0.visit(_OWLDataAllValuesFrom);
        java.util.Collection<OWLEntity> result158 = testSubject0.visit(_OWLLiteral);
        java.util.Collection<OWLEntity> result159 = testSubject0.visit(_OWLObjectInverseOf);
        java.util.Collection<OWLEntity> result160 = testSubject0.visit(_OWLObjectProperty);
        java.util.Collection<OWLEntity> result161 = testSubject0.visit(_OWLDataProperty);
        java.util.Collection<OWLEntity> result162 = testSubject0.visit(_OWLNamedIndividual);
        java.util.Collection<OWLEntity> result163 = testSubject0.visit(_OWLDataOneOf);
        java.util.Collection<OWLEntity> result164 = testSubject0.visit(_OWLDataIntersectionOf);
        java.util.Collection<OWLEntity> result165 = testSubject0.visit(_OWLDataUnionOf);
        java.util.Collection<OWLEntity> result166 = testSubject0.visit(_OWLDatatypeRestriction);
        java.util.Collection<OWLEntity> result167 = testSubject0.visit(_OWLFacetRestriction);
    }

    @Test
    public void enforceInterfacesOWLEntityComparator() {
        assertTrue(java.util.Comparator.class.isAssignableFrom(OWLEntityComparator.class));
        assertTrue(OWLEntityVisitor.class.isAssignableFrom(OWLEntityComparator.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLEntityComparator.class));
    }

    public void verifyOWLEntityComparator() {
        OWLEntityComparator testSubject0 = new OWLEntityComparator(_ShortFormProvider);
        int result1 = testSubject0.compare(_OWLEntity, _OWLEntity);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectProperty);
    }

    @Test
    public void enforceInterfacesOWLEntityIRIComparator() {
        assertTrue(java.util.Comparator.class.isAssignableFrom(OWLEntityIRIComparator.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLEntityIRIComparator.class));
    }

    public void verifyOWLEntityIRIComparator() {
        OWLEntityIRIComparator testSubject0 = new OWLEntityIRIComparator();
        int result0 = testSubject0.compare(_OWLEntity, _OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityRemover() {
        assertTrue(OWLEntityVisitor.class.isAssignableFrom(OWLEntityRemover.class));
    }

    public void verifyOWLEntityRemover() {
        OWLEntityRemover testSubject0 = new OWLEntityRemover(_Set61);
        testSubject0.reset();
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLClass);
        java.util.List<RemoveAxiom> result0 = testSubject0.getChanges();
    }

    public void verifyOWLEntityRenamer() {
        OWLEntityRenamer testSubject0 = new OWLEntityRenamer(_OWLOntologyManager, _Set61);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.changeIRI(_Map140);
        java.util.List<OWLOntologyChange<?>> result1 = testSubject0.changeIRI(_OWLEntity, _IRI);
        java.util.List<OWLOntologyChange<?>> result2 = testSubject0.changeIRI(_IRI, _IRI);
    }

    public void verifyInterfaceOWLEntitySetProvider() {
        OWLEntitySetProvider<OWLEntity> testSubject0 = mock(OWLEntitySetProvider.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLEntityTinyURIConversionStrategy() {
        assertTrue(org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy.class.isAssignableFrom(OWLEntityTinyURIConversionStrategy.class));
    }

    public void verifyOWLEntityTinyURIConversionStrategy() {
        OWLEntityTinyURIConversionStrategy testSubject0 = new OWLEntityTinyURIConversionStrategy();
        OWLEntityTinyURIConversionStrategy testSubject1 = new OWLEntityTinyURIConversionStrategy(_String);
        IRI result0 = testSubject0.getConvertedIRI(_OWLEntity);
    }

    public void verifyOWLEntityURIConverter() {
        OWLEntityURIConverter testSubject0 = new OWLEntityURIConverter(_OWLOntologyManager, _Set61, _OWLEntityURIConverterStrategy);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges();
    }

    public void verifyInterfaceOWLEntityURIConverterStrategy() {
        OWLEntityURIConverterStrategy testSubject0 = mock(OWLEntityURIConverterStrategy.class);
        IRI result0 = testSubject0.getConvertedIRI(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityURIUnderscores2CamelBackConverterStrategy() {
        assertTrue(org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy.class.isAssignableFrom(OWLEntityURIUnderscores2CamelBackConverterStrategy.class));
    }

    public void verifyOWLEntityURIUnderscores2CamelBackConverterStrategy() {
        OWLEntityURIUnderscores2CamelBackConverterStrategy testSubject0 = new OWLEntityURIUnderscores2CamelBackConverterStrategy();
        IRI result0 = testSubject0.getConvertedIRI(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityVisitorAdapter() {
        assertTrue(OWLEntityVisitor.class.isAssignableFrom(OWLEntityVisitorAdapter.class));
    }

    public void verifyOWLEntityVisitorAdapter() {
        OWLEntityVisitorAdapter testSubject0 = new OWLEntityVisitorAdapter();
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLClass);
    }

    @Test
    public void enforceInterfacesOWLEntityVisitorExAdapter() {
        assertTrue(OWLEntityVisitorEx.class.isAssignableFrom(OWLEntityVisitorExAdapter.class));
    }

    public void verifyOWLEntityVisitorExAdapter() {
        OWLEntityVisitorExAdapter<OWLObject> testSubject0 = new OWLEntityVisitorExAdapter<OWLObject>(_Object134);
        OWLEntityVisitorExAdapter<OWLObject> testSubject1 = new OWLEntityVisitorExAdapter<OWLObject>();
        OWLObject result0 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result1 = testSubject0.visit(_OWLDataProperty);
        OWLObject result2 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result3 = testSubject0.visit(_OWLDatatype);
        OWLObject result4 = testSubject0.visit(_OWLClass);
        OWLObject result5 = testSubject0.visit(_OWLAnnotationProperty);
    }

    @Test
    public void enforceInterfacesOWLObjectComponentCollector() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectComponentCollector.class));
    }

    public void verifyOWLObjectComponentCollector() {
        OWLObjectComponentCollector testSubject0 = new OWLObjectComponentCollector();
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        java.util.Set<OWLObject> result0 = testSubject0.getComponents(_OWLObject);
        java.util.Set<OWLObject> result1 = testSubject0.getResult();
    }

    @Test
    public void enforceInterfacesOWLObjectDuplicator() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectDuplicator.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(OWLObjectDuplicator.class));
    }

    public void verifyOWLObjectDuplicator() {
        OWLObjectDuplicator testSubject0 = new OWLObjectDuplicator(_Map140, _OWLDataFactory);
        OWLObjectDuplicator testSubject1 = new OWLObjectDuplicator(_OWLDataFactory, _Map143);
        OWLObjectDuplicator testSubject2 = new OWLObjectDuplicator(_OWLDataFactory);
        OWLObject result0 = testSubject0.duplicateObject(_OWLObject);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
    }

    public void verifyOWLObjectPropertyManager() {
        OWLObjectPropertyManager testSubject0 = new OWLObjectPropertyManager(_OWLOntologyManager, _OWLOntology);
        boolean result0 = testSubject0.isComposite(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0.getCompositeProperties();
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLObjectPropertyExpression>> result2 = testSubject0.getPropertyHierarchy();
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLObjectPropertyExpression>> result3 = testSubject0.getHierarchyReflexiveTransitiveClosure();
        boolean result4 = testSubject0.isSubPropertyOf(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        boolean result5 = testSubject0.isNonSimple(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0.getNonSimpleProperties();
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLObjectPropertyExpression>> result7 = testSubject0.getPropertyPartialOrdering();
        boolean result8 = testSubject0.isLessThan(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLObjectPropertyManager.tarjan(_Set61, _OWLObjectPropertyExpression, _int, _Stack, _Map145, _Map145, _Set146, _Set147, _Set147);
        java.util.Collection<java.util.Set<OWLObjectPropertyExpression>> result9 = OWLObjectPropertyManager.getEquivalentObjectProperties(_Set61);
        java.util.Collection<java.util.Set<OWLObjectPropertyExpression>> result10 = testSubject0.getEquivalentObjectProperties();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesOWLObjectTypeIndexProvider() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectTypeIndexProvider.class));
    }

    public void verifyOWLObjectTypeIndexProvider() {
        OWLObjectTypeIndexProvider testSubject0 = new OWLObjectTypeIndexProvider();
        int result0 = testSubject0.getTypeIndex(_OWLObject);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorAdapter() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter.class.isAssignableFrom(OWLObjectVisitorAdapter.class));
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectVisitorAdapter.class));
    }

    public void verifyOWLObjectVisitorAdapter() {
        OWLObjectVisitorAdapter testSubject0 = new OWLObjectVisitorAdapter();
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorExAdapter() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(OWLObjectVisitorExAdapter.class));
    }

    public void verifyOWLObjectVisitorExAdapter() {
        OWLObjectVisitorExAdapter<OWLObject> testSubject0 = new OWLObjectVisitorExAdapter<OWLObject>(_Object134);
        OWLObjectVisitorExAdapter<OWLObject> testSubject1 = new OWLObjectVisitorExAdapter<OWLObject>();
        OWLObject result0 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result1 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLObject result2 = testSubject0.visit(_OWLDatatype);
        OWLObject result3 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result4 = testSubject0.visit(_OWLObjectUnionOf);
        OWLObject result5 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLObject result6 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result7 = testSubject0.visit(_OWLDataProperty);
        OWLObject result8 = testSubject0.visit(_OWLFacetRestriction);
        OWLObject result9 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result10 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result11 = testSubject0.visit(_OWLObjectHasSelf);
        OWLObject result12 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLObject result13 = testSubject0.visit(_OWLObjectComplementOf);
        OWLObject result14 = testSubject0.visit(_OWLObjectAllValuesFrom);
        OWLObject result15 = testSubject0.visit(_OWLDataHasValue);
        OWLObject result16 = testSubject0.visit(_OWLObjectOneOf);
        OWLObject result17 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLObject result18 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLObject result19 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLObject result20 = testSubject0.visit(_OWLObjectHasValue);
        OWLObject result21 = testSubject0.visit(_SWRLDataRangeAtom);
        OWLObject result22 = testSubject0.visit(_SWRLClassAtom);
        OWLObject result23 = testSubject0.visit(_SWRLBuiltInAtom);
        OWLObject result24 = testSubject0.visit(_SWRLIndividualArgument);
        OWLObject result25 = testSubject0.visit(_SWRLVariable);
        OWLObject result26 = testSubject0.visit(_SWRLLiteralArgument);
        OWLObject result27 = testSubject0.visit(_OWLOntology);
        OWLObject result28 = testSubject0.visit(_SWRLSameIndividualAtom);
        OWLObject result29 = testSubject0.visit(_SWRLObjectPropertyAtom);
        OWLObject result30 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        OWLObject result31 = testSubject0.visit(_SWRLDataPropertyAtom);
        OWLObject result32 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result33 = testSubject0.visit(_OWLAnnotation);
        OWLObject result34 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result35 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result36 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result37 = testSubject0.visit(_OWLLiteral);
        OWLObject result38 = testSubject0.visit(_IRI);
        OWLObject result39 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result40 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result41 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result42 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result43 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result44 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result45 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result46 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLObject result47 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result48 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result49 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result50 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result51 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result52 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result53 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result54 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result55 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result56 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result57 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLObject result58 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result59 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result60 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result61 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result62 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result63 = testSubject0.visit(_OWLClass);
        OWLObject result64 = testSubject0.visit(_SWRLRule);
        OWLObject result65 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result66 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result67 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result68 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result69 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result70 = testSubject0.visit(_OWLDataMinCardinality);
        OWLObject result71 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLObject result72 = testSubject0.visit(_OWLDataExactCardinality);
        OWLObject result73 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLObject result74 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result75 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result76 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result77 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result78 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result79 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result80 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result81 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result82 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result83 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
    }

    public void verifyOWLObjectWalker() {
        OWLObjectWalker<OWLOntology> testSubject0 = new OWLObjectWalker<OWLOntology>(_Set61);
        OWLObjectWalker<OWLOntology> testSubject1 = new OWLObjectWalker<OWLOntology>(_Set61, _boolean);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        testSubject0.walkStructure(_OWLObjectVisitorEx136);
        testSubject0.walkStructure(_OWLObjectVisitor);
        testSubject0.setStructureWalker(_StructureWalker);
        java.util.List<OWLClassExpression> result1 = testSubject0.getClassExpressionPath();
        boolean result2 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result3 = testSubject0.getDataRangePath();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.setAnnotation(_OWLAnnotation);
        OWLAxiom result4 = testSubject0.getAxiom();
        OWLOntology result5 = testSubject0.getOntology();
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeFilter() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter.class.isAssignableFrom(OWLOntologyChangeFilter.class));
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(OWLOntologyChangeFilter.class));
        assertTrue(OWLOntologyChangeVisitor.class.isAssignableFrom(OWLOntologyChangeFilter.class));
    }

    public void verifyOWLOntologyChangeFilter() {
        OWLOntologyChangeFilter testSubject0 = new OWLOntologyChangeFilter();
        testSubject0.visit(_AddImport);
        testSubject0.visit(_SetOntologyID);
        testSubject0.visit(_RemoveAxiom);
        testSubject0.visit(_RemoveImport);
        testSubject0.visit(_AddOntologyAnnotation);
        testSubject0.visit(_RemoveOntologyAnnotation);
        testSubject0.visit(_AddAxiom);
        testSubject0.processChanges(_List111);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVisitorAdapter() {
        assertTrue(OWLOntologyChangeVisitor.class.isAssignableFrom(OWLOntologyChangeVisitorAdapter.class));
    }

    public void verifyOWLOntologyChangeVisitorAdapter() {
        OWLOntologyChangeVisitorAdapter testSubject0 = new OWLOntologyChangeVisitorAdapter();
        testSubject0.visit(_RemoveImport);
        testSubject0.visit(_AddImport);
        testSubject0.visit(_AddOntologyAnnotation);
        testSubject0.visit(_RemoveOntologyAnnotation);
        testSubject0.visit(_AddAxiom);
        testSubject0.visit(_SetOntologyID);
        testSubject0.visit(_RemoveAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVisitorExAdapter() {
        assertTrue(OWLOntologyChangeVisitorEx.class.isAssignableFrom(OWLOntologyChangeVisitorExAdapter.class));
    }

    public void verifyOWLOntologyChangeVisitorExAdapter() {
        OWLOntologyChangeVisitorExAdapter<OWLObject> testSubject0 = new OWLOntologyChangeVisitorExAdapter<OWLObject>();
        OWLOntologyChangeVisitorExAdapter<OWLObject> testSubject1 = new OWLOntologyChangeVisitorExAdapter<OWLObject>(_Object134);
        OWLObject result0 = testSubject0.visit(_RemoveImport);
        OWLObject result1 = testSubject0.visit(_AddImport);
        OWLObject result2 = testSubject0.visit(_AddOntologyAnnotation);
        OWLObject result3 = testSubject0.visit(_RemoveOntologyAnnotation);
        OWLObject result4 = testSubject0.visit(_RemoveAxiom);
        OWLObject result5 = testSubject0.visit(_SetOntologyID);
        OWLObject result6 = testSubject0.visit(_AddAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologyFormatFactoryImpl() {
        assertTrue(OWLOntologyFormatFactory.class.isAssignableFrom(OWLOntologyFormatFactoryImpl.class));
    }

    public void verifyOWLOntologyFormatFactoryImpl() {
        OWLOntologyFormatFactoryImpl<OWLOntologyFormat> testSubject0 = new OWLOntologyFormatFactoryImpl<OWLOntologyFormat>(OWLOntologyFormat.class);
        OWLOntologyFormat result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        java.lang.String result2 = testSubject0.getKey();
        boolean result3 = testSubject0.isTextual();
        OWLOntologyFormat result4 = testSubject0.createFormat();
        java.lang.String result5 = testSubject0.getDefaultMIMEType();
        java.util.List<java.lang.String> result6 = testSubject0.getMIMETypes();
        boolean result7 = testSubject0.handlesMimeType(_String);
    }

    @Test
    public void enforceInterfacesOWLOntologyImportsClosureSetProvider() {
        assertTrue(OWLOntologySetProvider.class.isAssignableFrom(OWLOntologyImportsClosureSetProvider.class));
    }

    public void verifyOWLOntologyImportsClosureSetProvider() {
        OWLOntologyImportsClosureSetProvider testSubject0 = new OWLOntologyImportsClosureSetProvider(_OWLOntologyManager, _OWLOntology);
        java.util.Set<OWLOntology> result0 = testSubject0.getOntologies();
    }

    public void verifyOWLOntologyIRIChanger() {
        OWLOntologyIRIChanger testSubject0 = new OWLOntologyIRIChanger(_OWLOntologyManager);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.getChanges(_OWLOntology, _IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyMerger() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomFilter.class.isAssignableFrom(OWLOntologyMerger.class));
    }

    public void verifyOWLOntologyMerger() throws OWLOntologyCreationException {
        OWLOntologyMerger testSubject0 = new OWLOntologyMerger(_OWLOntologySetProvider, _OWLAxiomFilter);
        OWLOntologyMerger testSubject1 = new OWLOntologyMerger(_OWLOntologySetProvider, _boolean);
        OWLOntologyMerger testSubject2 = new OWLOntologyMerger(_OWLOntologySetProvider);
        boolean result0 = testSubject0.passes(_OWLAxiom);
        OWLOntology result1 = testSubject0.createMergedOntology(_OWLOntologyManager, _IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologySingletonSetProvider() {
        assertTrue(OWLOntologySetProvider.class.isAssignableFrom(OWLOntologySingletonSetProvider.class));
    }

    public void verifyOWLOntologySingletonSetProvider() {
        OWLOntologySingletonSetProvider testSubject0 = new OWLOntologySingletonSetProvider(_OWLOntology);
        java.util.Set<OWLOntology> result0 = testSubject0.getOntologies();
    }

    @Test
    public void enforceInterfacesOWLOntologyStorerFactoryImpl() {
        assertTrue(OWLOntologyStorerFactory.class.isAssignableFrom(OWLOntologyStorerFactoryImpl.class));
    }

    public void verifyOWLOntologyStorerFactoryImpl() {
        OWLOntologyStorerFactoryImpl<OWLOntologyStorer> testSubject0 = new OWLOntologyStorerFactoryImpl<OWLOntologyStorer>(OWLOntologyStorer.class);
        OWLOntologyStorer result0 = testSubject0.get();
        java.lang.Object result1 = testSubject0.get();
        OWLOntologyStorer result2 = testSubject0.createStorer();
        OWLOntologyFormatFactory result3 = testSubject0.getFormatFactory();
    }

    @Test
    public void enforceInterfacesOWLOntologyWalker() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectWalker.class.isAssignableFrom(OWLOntologyWalker.class));
    }

    public void verifyOWLOntologyWalker() {
        OWLOntologyWalker testSubject0 = new OWLOntologyWalker(_Set61);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        testSubject0.walkStructure(_OWLObjectVisitorEx136);
        testSubject0.walkStructure(_OWLObjectVisitor);
        testSubject0.setStructureWalker(_StructureWalker);
        java.util.List<OWLClassExpression> result1 = testSubject0.getClassExpressionPath();
        boolean result2 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result3 = testSubject0.getDataRangePath();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.setAnnotation(_OWLAnnotation);
        OWLAxiom result4 = testSubject0.getAxiom();
        OWLOntology result5 = testSubject0.getOntology();
    }

    @Test
    public void enforceInterfacesOWLOntologyWalkerVisitor() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorAdapter.class.isAssignableFrom(OWLOntologyWalkerVisitor.class));
    }

    public void verifyOWLOntologyWalkerVisitor() {
        OWLOntologyWalkerVisitor testSubject0 = new OWLOntologyWalkerVisitor(_OWLOntologyWalker);
        OWLAxiom result0 = testSubject0.getCurrentAxiom();
        OWLOntology result1 = testSubject0.getCurrentOntology();
        OWLAnnotation result2 = testSubject0.getCurrentAnnotation();
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologyWalkerVisitorEx() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorExAdapter.class.isAssignableFrom(OWLOntologyWalkerVisitorEx.class));
    }

    public void verifyOWLOntologyWalkerVisitorEx() {
        OWLOntologyWalkerVisitorEx<OWLObject> testSubject0 = new OWLOntologyWalkerVisitorEx<OWLObject>(_OWLOntologyWalker);
        OWLAxiom result0 = testSubject0.getCurrentAxiom();
        OWLOntology result1 = testSubject0.getCurrentOntology();
        OWLAnnotation result2 = testSubject0.getCurrentAnnotation();
        OWLObject result3 = testSubject0.visit(_OWLDataOneOf);
        OWLObject result4 = testSubject0.visit(_OWLDataIntersectionOf);
        OWLObject result5 = testSubject0.visit(_OWLDatatype);
        OWLObject result6 = testSubject0.visit(_OWLDataComplementOf);
        OWLObject result7 = testSubject0.visit(_OWLObjectUnionOf);
        OWLObject result8 = testSubject0.visit(_OWLObjectSomeValuesFrom);
        OWLObject result9 = testSubject0.visit(_OWLObjectProperty);
        OWLObject result10 = testSubject0.visit(_OWLDataProperty);
        OWLObject result11 = testSubject0.visit(_OWLFacetRestriction);
        OWLObject result12 = testSubject0.visit(_OWLDataUnionOf);
        OWLObject result13 = testSubject0.visit(_OWLDatatypeRestriction);
        OWLObject result14 = testSubject0.visit(_OWLObjectHasSelf);
        OWLObject result15 = testSubject0.visit(_OWLObjectExactCardinality);
        OWLObject result16 = testSubject0.visit(_OWLObjectComplementOf);
        OWLObject result17 = testSubject0.visit(_OWLObjectAllValuesFrom);
        OWLObject result18 = testSubject0.visit(_OWLDataHasValue);
        OWLObject result19 = testSubject0.visit(_OWLObjectOneOf);
        OWLObject result20 = testSubject0.visit(_OWLObjectMinCardinality);
        OWLObject result21 = testSubject0.visit(_OWLObjectMaxCardinality);
        OWLObject result22 = testSubject0.visit(_OWLObjectIntersectionOf);
        OWLObject result23 = testSubject0.visit(_OWLObjectHasValue);
        OWLObject result24 = testSubject0.visit(_SWRLDataRangeAtom);
        OWLObject result25 = testSubject0.visit(_SWRLClassAtom);
        OWLObject result26 = testSubject0.visit(_SWRLBuiltInAtom);
        OWLObject result27 = testSubject0.visit(_SWRLIndividualArgument);
        OWLObject result28 = testSubject0.visit(_SWRLVariable);
        OWLObject result29 = testSubject0.visit(_SWRLLiteralArgument);
        OWLObject result30 = testSubject0.visit(_OWLOntology);
        OWLObject result31 = testSubject0.visit(_SWRLSameIndividualAtom);
        OWLObject result32 = testSubject0.visit(_SWRLObjectPropertyAtom);
        OWLObject result33 = testSubject0.visit(_SWRLDifferentIndividualsAtom);
        OWLObject result34 = testSubject0.visit(_SWRLDataPropertyAtom);
        OWLObject result35 = testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        OWLObject result36 = testSubject0.visit(_OWLAnnotation);
        OWLObject result37 = testSubject0.visit(_OWLAnnotationProperty);
        OWLObject result38 = testSubject0.visit(_OWLNamedIndividual);
        OWLObject result39 = testSubject0.visit(_OWLObjectInverseOf);
        OWLObject result40 = testSubject0.visit(_OWLLiteral);
        OWLObject result41 = testSubject0.visit(_IRI);
        OWLObject result42 = testSubject0.visit(_OWLAnonymousIndividual);
        OWLObject result43 = testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        OWLObject result44 = testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        OWLObject result45 = testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        OWLObject result46 = testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        OWLObject result47 = testSubject0.visit(_OWLEquivalentClassesAxiom);
        OWLObject result48 = testSubject0.visit(_OWLDisjointUnionAxiom);
        OWLObject result49 = testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        OWLObject result50 = testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        OWLObject result51 = testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        OWLObject result52 = testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        OWLObject result53 = testSubject0.visit(_OWLHasKeyAxiom);
        OWLObject result54 = testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        OWLObject result55 = testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        OWLObject result56 = testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        OWLObject result57 = testSubject0.visit(_OWLClassAssertionAxiom);
        OWLObject result58 = testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        OWLObject result59 = testSubject0.visit(_OWLAnnotationAssertionAxiom);
        OWLObject result60 = testSubject0.visit(_OWLDataSomeValuesFrom);
        OWLObject result61 = testSubject0.visit(_OWLDisjointClassesAxiom);
        OWLObject result62 = testSubject0.visit(_OWLDifferentIndividualsAxiom);
        OWLObject result63 = testSubject0.visit(_OWLDeclarationAxiom);
        OWLObject result64 = testSubject0.visit(_OWLDataPropertyRangeAxiom);
        OWLObject result65 = testSubject0.visit(_OWLDataPropertyDomainAxiom);
        OWLObject result66 = testSubject0.visit(_OWLClass);
        OWLObject result67 = testSubject0.visit(_SWRLRule);
        OWLObject result68 = testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        OWLObject result69 = testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        OWLObject result70 = testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        OWLObject result71 = testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        OWLObject result72 = testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        OWLObject result73 = testSubject0.visit(_OWLDataMinCardinality);
        OWLObject result74 = testSubject0.visit(_OWLDataMaxCardinality);
        OWLObject result75 = testSubject0.visit(_OWLDataExactCardinality);
        OWLObject result76 = testSubject0.visit(_OWLDataAllValuesFrom);
        OWLObject result77 = testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        OWLObject result78 = testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        OWLObject result79 = testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        OWLObject result80 = testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        OWLObject result81 = testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        OWLObject result82 = testSubject0.visit(_OWLSubClassOfAxiom);
        OWLObject result83 = testSubject0.visit(_OWLSameIndividualAxiom);
        OWLObject result84 = testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        OWLObject result85 = testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        OWLObject result86 = testSubject0.visit(_OWLObjectPropertyDomainAxiom);
    }

    @Test
    public void enforceInterfacesPriorityCollection() {
        assertTrue(java.lang.Iterable.class.isAssignableFrom(PriorityCollection.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(PriorityCollection.class));
    }

    public void verifyPriorityCollection() {
        PriorityCollection<OWLObject> testSubject0 = new PriorityCollection<OWLObject>();
        testSubject0.add(_Object134);
        testSubject0.add(_Object134, _Object134);
        testSubject0.remove(_Object134);
        testSubject0.clear();
        int result0 = testSubject0.size();
        java.util.Iterator<OWLObject> result1 = testSubject0.iterator();
        testSubject0.set(_Object134, _Object134);
        testSubject0.set(Arrays.asList(_Object134));
        org.semanticweb.owlapi.util.PriorityCollection<OWLObject> result2 = testSubject0.getByMIMEType(_String);
    }

    public void verifyInterfaceProgressMonitor() {
        ProgressMonitor testSubject0 = mock(ProgressMonitor.class);
        testSubject0.setSize(_long);
        testSubject0.setStarted();
        testSubject0.setProgress(_long);
        testSubject0.setMessage(_String);
        testSubject0.setIndeterminate(_boolean);
        testSubject0.setFinished();
        boolean result0 = testSubject0.isCancelled();
    }

    @Test
    public void enforceInterfacesPropertyAssertionValueShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(PropertyAssertionValueShortFormProvider.class));
    }

    public void verifyPropertyAssertionValueShortFormProvider() {
        PropertyAssertionValueShortFormProvider testSubject0 = new PropertyAssertionValueShortFormProvider(_List151, _Map152, _OWLOntologySetProvider);
        PropertyAssertionValueShortFormProvider testSubject1 = new PropertyAssertionValueShortFormProvider(_List151, _Map152, _OWLOntologySetProvider, _ShortFormProvider);
        java.util.List<OWLPropertyExpression> result0 = testSubject0.getProperties();
        java.util.Map<OWLDataPropertyExpression, java.util.List<java.lang.String>> result1 = testSubject0.getPreferredLanguageMap();
        java.lang.String result2 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesQNameShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(QNameShortFormProvider.class));
    }

    public void verifyQNameShortFormProvider() {
        QNameShortFormProvider testSubject0 = new QNameShortFormProvider();
        QNameShortFormProvider testSubject1 = new QNameShortFormProvider(_Map153);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedEntitySetProvider() {
        assertTrue(org.semanticweb.owlapi.util.OWLEntitySetProvider.class.isAssignableFrom(ReferencedEntitySetProvider.class));
    }

    public void verifyReferencedEntitySetProvider() {
        ReferencedEntitySetProvider testSubject0 = new ReferencedEntitySetProvider(_Set61);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities();
    }

    public void verifyInterfaceRootClassChecker() {
        RootClassChecker testSubject0 = mock(RootClassChecker.class);
        boolean result0 = testSubject0.isRootClass(_OWLClass);
    }

    public void verifyInterfaceShortFormProvider() {
        ShortFormProvider testSubject0 = mock(ShortFormProvider.class);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesSimpleIRIMapper() {
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(SimpleIRIMapper.class));
    }

    public void verifySimpleIRIMapper() {
        SimpleIRIMapper testSubject0 = new SimpleIRIMapper(_IRI, _IRI);
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesSimpleIRIShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class.isAssignableFrom(SimpleIRIShortFormProvider.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(SimpleIRIShortFormProvider.class));
    }

    public void verifySimpleIRIShortFormProvider() {
        SimpleIRIShortFormProvider testSubject0 = new SimpleIRIShortFormProvider();
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
    }

    @Test
    public void enforceInterfacesSimpleRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(SimpleRenderer.class));
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class.isAssignableFrom(SimpleRenderer.class));
    }

    public void verifySimpleRenderer() {
        SimpleRenderer testSubject0 = new SimpleRenderer();
        testSubject0.reset();
        testSubject0.setShortFormProvider(_ShortFormProvider);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.String result0 = testSubject0.render(_OWLObject);
        testSubject0.resetShortFormProvider();
        boolean result1 = testSubject0.isUsingDefaultShortFormProvider();
        testSubject0.setPrefixesFromOntologyFormat(_OWLOntology, _OWLOntologyManager, _boolean);
        testSubject0.writeAnnotations(_OWLAxiom);
        java.lang.String result2 = testSubject0.getShortForm(_IRI);
        testSubject0.setPrefix(_String, _String);
    }

    @Test
    public void enforceInterfacesSimpleRootClassChecker() {
        assertTrue(org.semanticweb.owlapi.util.RootClassChecker.class.isAssignableFrom(SimpleRootClassChecker.class));
    }

    public void verifySimpleRootClassChecker() {
        SimpleRootClassChecker testSubject0 = new SimpleRootClassChecker(_Set61);
        boolean result0 = testSubject0.isRootClass(_OWLClass);
    }

    @Test
    public void enforceInterfacesSimpleShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(SimpleShortFormProvider.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(SimpleShortFormProvider.class));
    }

    public void verifySimpleShortFormProvider() {
        SimpleShortFormProvider testSubject0 = new SimpleShortFormProvider();
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesStringLengthComparator() {
        assertTrue(java.util.Comparator.class.isAssignableFrom(StringLengthComparator.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(StringLengthComparator.class));
    }

    public void verifyStringLengthComparator() {
        StringLengthComparator testSubject0 = new StringLengthComparator();
        int result0 = testSubject0.compare(_String, _String);
    }

    public void verifyStructuralTransformation() {
        StructuralTransformation testSubject0 = new StructuralTransformation(_OWLDataFactory);
        java.util.Set<OWLAxiom> result0 = testSubject0.getTransformedAxioms(_Set154);
    }

    @Test
    public void enforceInterfacesStructureWalker() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(StructureWalker.class));
    }

    public void verifyStructureWalker() {
        StructureWalker<OWLObject> testSubject0 = new StructureWalker<OWLObject>(_OWLObjectWalker);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectOneOf);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
    }

    @Test
    public void enforceInterfacesSWRLVariableExtractor() {
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(SWRLVariableExtractor.class));
    }

    public void verifySWRLVariableExtractor() {
        SWRLVariableExtractor testSubject0 = new SWRLVariableExtractor();
        java.util.LinkedHashSet<SWRLVariable> result0 = testSubject0.getVariables();
        testSubject0.visit(_SWRLVariable);
        testSubject0.visit(_SWRLIndividualArgument);
        testSubject0.visit(_SWRLBuiltInAtom);
        testSubject0.visit(_SWRLLiteralArgument);
        testSubject0.visit(_SWRLSameIndividualAtom);
        testSubject0.visit(_SWRLDifferentIndividualsAtom);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_SWRLClassAtom);
        testSubject0.visit(_SWRLDataRangeAtom);
        testSubject0.visit(_SWRLObjectPropertyAtom);
        testSubject0.visit(_SWRLDataPropertyAtom);
    }

    public void verifyInterfaceSWRLVariableShortFormProvider() {
        SWRLVariableShortFormProvider testSubject0 = mock(SWRLVariableShortFormProvider.class);
        java.lang.String result0 = testSubject0.getShortForm(_SWRLVariable);
    }

    public void verifyVersion() {
        Version testSubject0 = new Version(_int, _int, _int, _int);
        int result0 = testSubject0.getMajor();
        int result1 = testSubject0.getMinor();
        int result2 = testSubject0.getPatch();
        int result3 = testSubject0.getBuild();
    }

    public void verifyVersionInfo() {
        VersionInfo testSubject0 = mock(VersionInfo.class);
        org.semanticweb.owlapi.util.VersionInfo result0 = VersionInfo.getVersionInfo();
        java.lang.String result1 = testSubject0.getVersion();
        java.lang.String result2 = testSubject0.getGeneratedByMessage();
    }

    @Test
    public void enforceInterfacesWeakCache() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(WeakCache.class));
    }

    public void verifyWeakCache() {
        WeakCache<Object> testSubject0 = new WeakCache<Object>();
        java.lang.Object result0 = testSubject0.cache(_Object);
        testSubject0.clear();
        boolean result1 = testSubject0.contains(_Object);
    }

    @Test
    public void enforceInterfacesWeakIndexCache() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(WeakIndexCache.class));
    }

    public void verifyWeakIndexCache() {
        WeakIndexCache<Object, Object> testSubject0 = new WeakIndexCache<Object, Object>();
        java.lang.Object result0 = testSubject0.get(_Object);
        java.lang.Object result1 = testSubject0.cache(_Object, _Object);
        testSubject0.clear();
        boolean result2 = testSubject0.contains(_Object);
    }

    private Object _Object126;
    private Object[] _Object_array;
    private Object _Object127;
    private boolean _boolean;
    private char[] _char_array;
    private com.google.common.base.Optional<java.lang.Object> _Optional;
    private int _int;
    private java.io.File _File;
    private java.lang.Class<java.lang.Object> _Class;
    private java.lang.Object _Object;
    private java.lang.String _String;
    private java.util.Collection<Object> _Collection129;
    private java.util.Collection<java.lang.Object> _Collection;
    private java.util.Comparator<java.lang.String> _Comparator;
    private java.util.List<? extends OWLOntologyChange<?>> _List111;
    private java.util.List<OWLAnnotationProperty> _List;
    private java.util.List<OWLPropertyExpression> _List151;
    private java.util.List<org.semanticweb.owlapi.util.InferredAxiomGenerator<? extends OWLAxiom>> _List123;
    private java.util.Map<java.lang.String, java.lang.String> _Map153;
    private java.util.Map<IRI, IRI> _Map143;
    private java.util.Map<OWLAnnotationProperty, java.util.List<java.lang.String>> _Map;
    private java.util.Map<OWLDataPropertyExpression, java.util.List<java.lang.String>> _Map152;
    private java.util.Map<OWLEntity, IRI> _Map140;
    private java.util.Map<OWLObjectPropertyExpression, java.lang.Integer> _Map145;
    private java.util.Set<java.lang.Object> _Set64;
    private java.util.Set<java.lang.String> _Set;
    private java.util.Set<java.util.Set<OWLObjectPropertyExpression>> _Set146;
    private java.util.Set<OWLAxiom> _Set154;
    private java.util.Set<OWLEntity> _Set139;
    private java.util.Set<OWLObject> _Set135;
    private java.util.Set<OWLObjectPropertyExpression> _Set147;
    private java.util.Set<OWLOntology> _Set61;
    private java.util.Stack<OWLObjectPropertyExpression> _Stack;
    private long _long;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private AddAxiom _AddAxiom;
    private AddImport _AddImport;
    private AddOntologyAnnotation _AddOntologyAnnotation;
    private IRI _IRI;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnnotationValueVisitorEx<java.lang.String> _OWLAnnotationValueVisitorEx;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataAllValuesFrom _OWLDataAllValuesFrom;
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
    private OWLEntity _OWLEntity;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNegativeDataPropertyAssertionAxiom _OWLNegativeDataPropertyAssertionAxiom;
    private OWLNegativeObjectPropertyAssertionAxiom _OWLNegativeObjectPropertyAssertionAxiom;
    private OWLObject _OWLObject;
    private OWLObject _Object134;
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
    private OWLObjectVisitor _OWLObjectVisitor;
    private OWLObjectVisitorEx<?> _OWLObjectVisitorEx136;
    private OWLObjectVisitorEx<OWLObject> _OWLObjectVisitorEx;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLOntologySetProvider _OWLOntologySetProvider;
    private OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private PrefixManager _PrefixManager;
    private RemoveAxiom _RemoveAxiom;
    private RemoveImport _RemoveImport;
    private RemoveOntologyAnnotation _RemoveOntologyAnnotation;
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
    private SetOntologyID _SetOntologyID;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
    private org.semanticweb.owlapi.util.IRIShortFormProvider _IRIShortFormProvider;
    private org.semanticweb.owlapi.util.ImportsStructureObjectSorter.ObjectSelector<OWLObject> _ObjectSelector;
    private org.semanticweb.owlapi.util.InferredAxiomGenerator<?> _InferredAxiomGenerator;
    private org.semanticweb.owlapi.util.OWLAxiomFilter _OWLAxiomFilter;
    private org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy _OWLEntityURIConverterStrategy;
    private org.semanticweb.owlapi.util.OWLObjectWalker<OWLObject> _OWLObjectWalker;
    private org.semanticweb.owlapi.util.OWLOntologyWalker _OWLOntologyWalker;
    private org.semanticweb.owlapi.util.ProgressMonitor _ProgressMonitor;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private org.semanticweb.owlapi.util.StructureWalker<OWLOntology> _StructureWalker;
    private org.semanticweb.owlapi.util.StructureWalker<OWLObject> _ObjectStructureWalker;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
