package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.Writer;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyCharacteristicAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyCharacteristicAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.util.*;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_util {
    @Test
    public void enforceInterfacesAbstractOWLOntologyStorer() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyStorer.class
                .isAssignableFrom(AbstractOWLOntologyStorer.class));
    }

    public void verifyAbstractOWLOntologyStorer() throws Exception {
        AbstractOWLOntologyStorer testSubject0 = new AbstractOWLOntologyStorer() {
            @Override
            public boolean canStoreOntology(OWLOntologyFormat ontologyFormat) {
                return false;
            }

            @Override
            protected void storeOntology(OWLOntologyManager manager,
                    OWLOntology ontology, Writer writer, OWLOntologyFormat format)
                    throws OWLOntologyStorageException {}

            @Override
            protected void storeOntology(OWLOntology ontology, Writer writer,
                    OWLOntologyFormat format) throws OWLOntologyStorageException {}
        };
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntologyManager, _OWLOntology, _IRI,
                _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesAnnotationValueShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(AnnotationValueShortFormProvider.class));
    }

    public void verifyAnnotationValueShortFormProvider() throws Exception {
        AnnotationValueShortFormProvider testSubject0 = new AnnotationValueShortFormProvider(
                _OWLOntologySetProvider, _ShortFormProvider, _IRIShortFormProvider,
                _List, _Map, _OWLAnnotationValueVisitorEx);
        AnnotationValueShortFormProvider testSubject1 = new AnnotationValueShortFormProvider(
                _OWLOntologySetProvider, _ShortFormProvider, _IRIShortFormProvider,
                _List, _Map);
        AnnotationValueShortFormProvider testSubject2 = new AnnotationValueShortFormProvider(
                _List, _Map, _OWLOntologySetProvider, _ShortFormProvider);
        AnnotationValueShortFormProvider testSubject3 = new AnnotationValueShortFormProvider(
                _List, _Map, _OWLOntologySetProvider);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        java.util.List<org.semanticweb.owlapi.model.OWLAnnotationProperty> result1 = testSubject0
                .getAnnotationProperties();
        java.util.Map<org.semanticweb.owlapi.model.OWLAnnotationProperty, java.util.List<java.lang.String>> result2 = testSubject0
                .getPreferredLanguageMap();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAutoIRIMapper() throws Exception {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class
                .isAssignableFrom(AutoIRIMapper.class));
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyIRIMapper.class
                .isAssignableFrom(AutoIRIMapper.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(AutoIRIMapper.class));
    }

    public void verifyAutoIRIMapper() throws Exception {
        AutoIRIMapper testSubject0 = new AutoIRIMapper(_File, _boolean);
        testSubject0.update();
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI(_IRI);
        java.util.Set<java.lang.String> result1 = testSubject0.getFileExtensions();
        testSubject0.setFileExtensions(_Set);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result2 = testSubject0
                .getOntologyIRIs();
        testSubject0.startElement(_String, _String, _String, _Attributes);
        testSubject0.error(_SAXParseException);
        testSubject0.warning(_SAXParseException);
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
    }

    @Test
    public void enforceInterfacesAxiomSubjectProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(AxiomSubjectProvider.class));
    }

    public void verifyAxiomSubjectProvider() throws Exception {
        AxiomSubjectProvider testSubject0 = new AxiomSubjectProvider();
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .getSubject(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesAxiomTypeProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(AxiomTypeProvider.class));
    }

    public void verifyAxiomTypeProvider() throws Exception {
        AxiomTypeProvider testSubject0 = new AxiomTypeProvider();
        org.semanticweb.owlapi.model.AxiomType<?> result0 = testSubject0
                .getAxiomType(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesBidirectionalShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(BidirectionalShortFormProvider.class));
    }

    public void verifyInterfaceBidirectionalShortFormProvider() throws Exception {
        BidirectionalShortFormProvider testSubject0 = mock(BidirectionalShortFormProvider.class);
        java.util.Set<java.lang.String> result0 = testSubject0.getShortForms();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getEntities(_String);
        org.semanticweb.owlapi.model.OWLEntity result2 = testSubject0.getEntity(_String);
        java.lang.String result3 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesBidirectionalShortFormProviderAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.CachingBidirectionalShortFormProvider.class
                .isAssignableFrom(BidirectionalShortFormProviderAdapter.class));
    }

    public void verifyBidirectionalShortFormProviderAdapter() throws Exception {
        BidirectionalShortFormProviderAdapter testSubject0 = new BidirectionalShortFormProviderAdapter(
                _OWLOntologyManager, _Set61, _ShortFormProvider);
        BidirectionalShortFormProviderAdapter testSubject1 = new BidirectionalShortFormProviderAdapter(
                _Set61, _ShortFormProvider);
        BidirectionalShortFormProviderAdapter testSubject2 = new BidirectionalShortFormProviderAdapter(
                _ShortFormProvider);
        testSubject0.dispose();
        testSubject0.add(_OWLEntity);
        testSubject0.remove(_OWLEntity);
        testSubject0.update(_OWLEntity);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.rebuild(_OWLEntitySetProvider);
        java.util.Set<java.lang.String> result1 = testSubject0.getShortForms();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getEntities(_String);
        org.semanticweb.owlapi.model.OWLEntity result3 = testSubject0.getEntity(_String);
    }

    @Test
    public void enforceInterfacesCachingBidirectionalShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.BidirectionalShortFormProvider.class
                .isAssignableFrom(CachingBidirectionalShortFormProvider.class));
    }

    public void verifyCachingBidirectionalShortFormProvider() throws Exception {
        CachingBidirectionalShortFormProvider testSubject0 = new CachingBidirectionalShortFormProvider() {
            @Override
            protected String generateShortForm(OWLEntity entity) {
                return null;
            }
        };
        testSubject0.add(_OWLEntity);
        testSubject0.remove(_OWLEntity);
        testSubject0.update(_OWLEntity);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.rebuild(_OWLEntitySetProvider);
        java.util.Set<java.lang.String> result1 = testSubject0.getShortForms();
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result2 = testSubject0
                .getEntities(_String);
        org.semanticweb.owlapi.model.OWLEntity result3 = testSubject0.getEntity(_String);
        testSubject0.dispose();
    }

    

    public void verifyCollectionFactory() throws Exception {
        CollectionFactory testSubject0 = new CollectionFactory();
        java.util.Map<K, V> result0 = CollectionFactory.createMap();
        java.util.Set<Object> result1 = CollectionFactory
                .getCopyOnRequestSetFromImmutableCollection(_Collection);
        java.util.Map<K, java.lang.ref.WeakReference<V>> result2 = CollectionFactory
                .createSyncWeakMap();
        CollectionFactory.setExpectedThreads(_int);
        int result3 = CollectionFactory.getExpectedThreads();
        java.util.Set<OWLObject> result4 = CollectionFactory.createSet(_Object_array);
        java.util.Set<Object> result5 = CollectionFactory.createSet();
        java.util.Set<Object> result6 = CollectionFactory.createSet(_Collection);
        java.util.Set<Object> result7 = CollectionFactory.createSet(_int);
        java.util.List<Object> result8 = CollectionFactory.createList();
        java.util.Set<Object> result9 = CollectionFactory.createSyncSet();
        java.util.concurrent.ConcurrentHashMap<K, V> result10 = CollectionFactory
                .createSyncMap();
        java.util.Set<Object> result11 = CollectionFactory
                .getCopyOnRequestSet(_Collection);
        java.util.Set<Object> result12 = CollectionFactory
                .getThreadSafeCopyOnRequestSet(_Set65);
        java.util.Set<Object> result13 = CollectionFactory
                .getCopyOnRequestSetFromMutableCollection(_Collection);
    }

    @Test
    public void enforceInterfacesCommonBaseIRIMapper() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyIRIMapper.class
                .isAssignableFrom(CommonBaseIRIMapper.class));
    }

    public void verifyCommonBaseIRIMapper() throws Exception {
        CommonBaseIRIMapper testSubject0 = new CommonBaseIRIMapper(_IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI(_IRI);
        testSubject0.addMapping(_IRI, _String);
    }

    @Test
    public void enforceInterfacesDefaultPrefixManager() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.PrefixManager.class
                .isAssignableFrom(DefaultPrefixManager.class));
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(DefaultPrefixManager.class));
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class
                .isAssignableFrom(DefaultPrefixManager.class));
    }

    public void verifyDefaultPrefixManager() throws Exception {
        DefaultPrefixManager testSubject0 = new DefaultPrefixManager(_PrefixManager,
                _Comparator);
        DefaultPrefixManager testSubject1 = new DefaultPrefixManager(_String, _Comparator);
        DefaultPrefixManager testSubject2 = new DefaultPrefixManager(_PrefixManager);
        DefaultPrefixManager testSubject3 = new DefaultPrefixManager(_String);
        DefaultPrefixManager testSubject4 = new DefaultPrefixManager();
        DefaultPrefixManager testSubject5 = new DefaultPrefixManager(_Comparator);
        testSubject0.clear();
        testSubject0.addPrefixes(_PrefixManager);
        testSubject0.unregisterNamespace(_String);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        java.lang.String result1 = testSubject0.getShortForm(_IRI);
        testSubject0.setPrefix(_String, _String);
        java.util.Map<java.lang.String, java.lang.String> result2 = testSubject0
                .getPrefixName2PrefixMap();
        java.util.Set<java.lang.String> result3 = testSubject0.getPrefixNames();
        java.lang.String result4 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result5 = testSubject0.containsPrefixMapping(_String);
        java.lang.String result6 = testSubject0.getDefaultPrefix();
        java.lang.String result7 = testSubject0.getPrefixIRI(_IRI);
        org.semanticweb.owlapi.model.IRI result8 = testSubject0.getIRI(_String);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDelegatingObjectVisitorEx() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitorEx.class
                .isAssignableFrom(DelegatingObjectVisitorEx.class));
    }

    public void verifyDelegatingObjectVisitorEx() throws Exception {
        DelegatingObjectVisitorEx<OWLObject> testSubject0 = new DelegatingObjectVisitorEx(
                _OWLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesDLExpressivityChecker() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(DLExpressivityChecker.class));
    }

    public void verifyDLExpressivityChecker() throws Exception {
        DLExpressivityChecker testSubject0 = new DLExpressivityChecker(_Set61);
        java.util.List<org.semanticweb.owlapi.util.DLExpressivityChecker.Construct> result0 = testSubject0
                .getConstructs();
        java.lang.String result1 = testSubject0.getDescriptionLogicName();
    }

    

    public void verifyEscapeUtils() throws Exception {
        EscapeUtils testSubject0 = new EscapeUtils();
        java.lang.String result0 = EscapeUtils.escapeString(_String);
        java.lang.String result1 = EscapeUtils.unescapeString(_String);
    }

    @Test
    public void enforceInterfacesFilteringOWLOntologyChangeListener() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLOntologyChangeFilter.class
                .isAssignableFrom(FilteringOWLOntologyChangeListener.class));
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeListener.class
                .isAssignableFrom(FilteringOWLOntologyChangeListener.class));
    }

    public void verifyFilteringOWLOntologyChangeListener() throws Exception {
        FilteringOWLOntologyChangeListener testSubject0 = new FilteringOWLOntologyChangeListener();
        testSubject0.ontologiesChanged(_List112);
        testSubject0.processChanges(_List112);
    }

    @Test
    public void enforceInterfacesHashCode() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(HashCode.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(HashCode.class));
    }

    public void verifyHashCode() throws Exception {
        HashCode testSubject0 = new HashCode();
    }

    @Test
    public void enforceInterfacesHornAxiomVisitorEx() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitorEx.class
                .isAssignableFrom(HornAxiomVisitorEx.class));
    }

    public void verifyHornAxiomVisitorEx() throws Exception {
        HornAxiomVisitorEx testSubject0 = new HornAxiomVisitorEx();
        java.lang.Object result16 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result18 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result29 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Object result35 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result36 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Boolean result39 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Boolean result42 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Boolean result43 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Boolean result46 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Boolean result49 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Boolean result52 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Boolean result58 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Boolean result60 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Boolean result62 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Boolean result63 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Boolean result77 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
    }

    @Test
    public void enforceInterfacesImportsStructureEntitySorter() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ImportsStructureObjectSorter.class
                .isAssignableFrom(ImportsStructureEntitySorter.class));
    }

    public void verifyImportsStructureEntitySorter() throws Exception {
        ImportsStructureEntitySorter testSubject0 = new ImportsStructureEntitySorter(
                _OWLOntology, _OWLOntologyManager);
        java.util.Map<org.semanticweb.owlapi.model.OWLOntology, java.util.Set<OWLEntity>> result0 = testSubject0
                .getObjects();
    }

    

    public void verifyImportsStructureObjectSorter() throws Exception {
        ImportsStructureObjectSorter testSubject0 = new ImportsStructureObjectSorter(
                _OWLOntology, _OWLOntologyManager, _ObjectSelector);
        java.util.Map<org.semanticweb.owlapi.model.OWLOntology, java.util.Set<OWLObject>> result0 = testSubject0
                .getObjects();
    }

    

    public void verifyInterfaceInferredAxiomGenerator() throws Exception {
        InferredAxiomGenerator testSubject0 = mock(InferredAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLOntologyManager,
                _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredClassAssertionAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredIndividualAxiomGenerator.class
                .isAssignableFrom(InferredClassAssertionAxiomGenerator.class));
    }

    public void verifyInferredClassAssertionAxiomGenerator() throws Exception {
        InferredClassAssertionAxiomGenerator testSubject0 = new InferredClassAssertionAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        java.util.Set<OWLClassAssertionAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredClassAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class
                .isAssignableFrom(InferredClassAxiomGenerator.class));
    }

    public void verifyInferredClassAxiomGenerator() throws Exception {
        InferredClassAxiomGenerator<OWLClassAxiom> testSubject0 = new InferredClassAxiomGenerator() {
            @Override
            public String getLabel() {
                return null;
            }

            @Override
            protected void addAxioms(OWLEntity entity, OWLReasoner reasoner,
                    OWLDataFactory dataFactory, Set result) {}
        };
        java.util.Set<OWLClassAxiom> result0 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredDataPropertyAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class
                .isAssignableFrom(InferredDataPropertyAxiomGenerator.class));
    }

    public void verifyInferredDataPropertyAxiomGenerator() throws Exception {
        InferredDataPropertyAxiomGenerator testSubject0 = mock(InferredDataPropertyAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLOntologyManager,
                _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredDataPropertyCharacteristicAxiomGenerator()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class
                .isAssignableFrom(InferredDataPropertyCharacteristicAxiomGenerator.class));
    }

    public void verifyInferredDataPropertyCharacteristicAxiomGenerator() throws Exception {
        InferredDataPropertyCharacteristicAxiomGenerator testSubject0 = new InferredDataPropertyCharacteristicAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLDataPropertyCharacteristicAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredDisjointClassesAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class
                .isAssignableFrom(InferredDisjointClassesAxiomGenerator.class));
    }

    public void verifyInferredDisjointClassesAxiomGenerator() throws Exception {
        InferredDisjointClassesAxiomGenerator testSubject0 = new InferredDisjointClassesAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLDisjointClassesAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEntityAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredAxiomGenerator.class
                .isAssignableFrom(InferredEntityAxiomGenerator.class));
    }

    public void verifyInferredEntityAxiomGenerator() throws Exception {
        InferredEntityAxiomGenerator<OWLEntity, OWLAxiom> testSubject0 = mock(InferredEntityAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLOntologyManager,
                _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredEquivalentClassAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class
                .isAssignableFrom(InferredEquivalentClassAxiomGenerator.class));
    }

    public void verifyInferredEquivalentClassAxiomGenerator() throws Exception {
        InferredEquivalentClassAxiomGenerator testSubject0 = new InferredEquivalentClassAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLEquivalentClassesAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEquivalentDataPropertiesAxiomGenerator()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class
                .isAssignableFrom(InferredEquivalentDataPropertiesAxiomGenerator.class));
    }

    public void verifyInferredEquivalentDataPropertiesAxiomGenerator() throws Exception {
        InferredEquivalentDataPropertiesAxiomGenerator testSubject0 = new InferredEquivalentDataPropertiesAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLEquivalentDataPropertiesAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEquivalentObjectPropertyAxiomGenerator()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class
                .isAssignableFrom(InferredEquivalentObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredEquivalentObjectPropertyAxiomGenerator() throws Exception {
        InferredEquivalentObjectPropertyAxiomGenerator testSubject0 = new InferredEquivalentObjectPropertyAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLEquivalentObjectPropertiesAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredIndividualAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class
                .isAssignableFrom(InferredIndividualAxiomGenerator.class));
    }

    public void verifyInferredIndividualAxiomGenerator() throws Exception {
        InferredIndividualAxiomGenerator testSubject0 = mock(InferredIndividualAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLOntologyManager,
                _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredInverseObjectPropertiesAxiomGenerator()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class
                .isAssignableFrom(InferredInverseObjectPropertiesAxiomGenerator.class));
    }

    public void verifyInferredInverseObjectPropertiesAxiomGenerator() throws Exception {
        InferredInverseObjectPropertiesAxiomGenerator testSubject0 = new InferredInverseObjectPropertiesAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLInverseObjectPropertiesAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredObjectPropertyAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class
                .isAssignableFrom(InferredObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredObjectPropertyAxiomGenerator() throws Exception {
        InferredObjectPropertyAxiomGenerator<OWLObjectPropertyAxiom> testSubject0 = mock(InferredObjectPropertyAxiomGenerator.class);
        java.util.Set<OWLObjectPropertyAxiom> result0 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
        java.lang.String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredObjectPropertyCharacteristicAxiomGenerator()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class
                .isAssignableFrom(InferredObjectPropertyCharacteristicAxiomGenerator.class));
    }

    public void verifyInferredObjectPropertyCharacteristicAxiomGenerator()
            throws Exception {
        InferredObjectPropertyCharacteristicAxiomGenerator testSubject0 = new InferredObjectPropertyCharacteristicAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLObjectPropertyCharacteristicAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    

    public void verifyInferredOntologyGenerator() throws Exception {
        InferredOntologyGenerator testSubject0 = new InferredOntologyGenerator(
                _OWLReasoner, _List115);
        InferredOntologyGenerator testSubject1 = new InferredOntologyGenerator(
                _OWLReasoner);
        java.util.List<org.semanticweb.owlapi.util.InferredAxiomGenerator<?>> result0 = testSubject0
                .getAxiomGenerators();
        testSubject0.addGenerator(_InferredAxiomGenerator);
        testSubject0.removeGenerator(_InferredAxiomGenerator);
        testSubject0.fillOntology(_OWLOntologyManager, _OWLOntology);
    }

    @Test
    public void enforceInterfacesInferredPropertyAssertionGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredIndividualAxiomGenerator.class
                .isAssignableFrom(InferredPropertyAssertionGenerator.class));
    }

    public void verifyInferredPropertyAssertionGenerator() throws Exception {
        InferredPropertyAssertionGenerator testSubject0 = new InferredPropertyAssertionGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLPropertyAssertionAxiom<?, ?>> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubClassAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class
                .isAssignableFrom(InferredSubClassAxiomGenerator.class));
    }

    public void verifyInferredSubClassAxiomGenerator() throws Exception {
        InferredSubClassAxiomGenerator testSubject0 = new InferredSubClassAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        java.util.Set<OWLSubClassOfAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubDataPropertyAxiomGenerator() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class
                .isAssignableFrom(InferredSubDataPropertyAxiomGenerator.class));
    }

    public void verifyInferredSubDataPropertyAxiomGenerator() throws Exception {
        InferredSubDataPropertyAxiomGenerator testSubject0 = new InferredSubDataPropertyAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLSubDataPropertyOfAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubObjectPropertyAxiomGenerator()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class
                .isAssignableFrom(InferredSubObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredSubObjectPropertyAxiomGenerator() throws Exception {
        InferredSubObjectPropertyAxiomGenerator testSubject0 = new InferredSubObjectPropertyAxiomGenerator();
        java.lang.String result0 = testSubject0.getLabel();
        Set<OWLSubObjectPropertyOfAxiom> result1 = testSubject0.createAxioms(
                _OWLOntologyManager, _OWLReasoner);
    }

    

    public void verifyInterfaceIRIShortFormProvider() throws Exception {
        IRIShortFormProvider testSubject0 = mock(IRIShortFormProvider.class);
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
    }

    @Test
    public void enforceInterfacesMaximumModalDepthFinder() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitorEx.class
                .isAssignableFrom(MaximumModalDepthFinder.class));
    }

    public void verifyMaximumModalDepthFinder() throws Exception {
        MaximumModalDepthFinder testSubject0 = new MaximumModalDepthFinder();
        java.lang.Object result12 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result15 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result26 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result38 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result75 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Integer result87 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        java.lang.Integer result93 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.lang.Integer result101 = testSubject0
                .visit(_OWLReflexiveObjectPropertyAxiom);
        java.lang.Integer result125 = testSubject0
                .visit(_OWLAnnotationPropertyRangeAxiom);
        java.lang.Integer result128 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
        java.lang.Integer result129 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Integer result131 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Integer result132 = testSubject0
                .visit(_OWLSymmetricObjectPropertyAxiom);
        java.lang.Integer result135 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
        java.lang.Integer result138 = testSubject0
                .visit(_OWLSubAnnotationPropertyOfAxiom);
        java.lang.Integer result139 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        java.lang.Integer result144 = testSubject0
                .visit(_OWLInverseObjectPropertiesAxiom);
        java.lang.Integer result152 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        java.lang.Integer result153 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Integer result156 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Integer result158 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
        java.lang.Integer result167 = testSubject0
                .visit(_OWLObjectPropertyAssertionAxiom);
    }

    

    public void verifyInterfaceMonitorable() throws Exception {
        Monitorable testSubject0 = mock(Monitorable.class);
        testSubject0.interrupt();
        testSubject0.setProgressMonitor(_ProgressMonitor);
        boolean result0 = testSubject0.canInterrupt();
    }

    @Test
    public void enforceInterfacesMultiMap() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(MultiMap.class));
    }

    public void verifyMultiMap() throws Exception {
        MultiMap testSubject0 = new MultiMap(_boolean, _boolean);
        MultiMap testSubject1 = new MultiMap(_boolean);
        MultiMap testSubject2 = new MultiMap();
        boolean result0 = testSubject0.remove(_Object, _Object119);
        boolean result1 = testSubject0.remove(_Object);
        java.util.Collection<Value> result2 = testSubject0.get(_Object);
        boolean result3 = testSubject0.put(_Object, _Object119);
        testSubject0.clear();
        boolean result4 = testSubject0.contains(_Object, _Object119);
        int result5 = testSubject0.size();
        testSubject0.putAll(_MultiMap);
        testSubject0.putAll(_Object, _Collection121);
        java.util.Set<Key> result6 = testSubject0.keySet();
        boolean result7 = testSubject0.containsValue(_Object119);
        boolean result8 = testSubject0.containsKey(_Object);
        testSubject0.setEntry(_Object, _Collection121);
        java.util.Set<Value> result9 = testSubject0.getAllValues();
        boolean result10 = testSubject0.isValueSetsEqual();
    }

    

    public void verifyNamedConjunctChecker() throws Exception {
        NamedConjunctChecker testSubject0 = new NamedConjunctChecker();
        boolean result0 = testSubject0.isNamedConjunct(_OWLClass, _OWLClassExpression);
        boolean result1 = testSubject0.hasNamedConjunct(_OWLClassExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getNamedConjuncts(_OWLClassExpression);
    }

    

    public void verifyNamespaceUtil() throws Exception {
        NamespaceUtil testSubject0 = new NamespaceUtil();
        java.lang.String[] result0 = testSubject0.split(_String);
        java.lang.String[] result1 = testSubject0.split(_String, _String_array);
        testSubject0.setPrefix(_String, _String);
        java.lang.String result2 = testSubject0.getPrefix(_String);
        java.lang.String result3 = testSubject0.generatePrefix(_String);
        java.util.Map<java.lang.String, java.lang.String> result4 = testSubject0
                .getNamespace2PrefixMap();
        boolean result5 = NamespaceUtil.isNCNameStartChar(_char);
        boolean result6 = NamespaceUtil.isNCNameChar(_char);
    }

    @Test
    public void enforceInterfacesNNF() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx.class
                .isAssignableFrom(NNF.class));
        assertTrue(org.semanticweb.owlapi.model.OWLDataVisitorEx.class
                .isAssignableFrom(NNF.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitorEx.class
                .isAssignableFrom(NNF.class));
    }

    public void verifyNNF() throws Exception {
        NNF testSubject0 = new NNF(_OWLDataFactory);
        testSubject0.reset();
        java.lang.Object result9 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result10 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result29 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result31 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result56 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLDataRange result65 = testSubject0
                .visit(_OWLDataOneOf);
        org.semanticweb.owlapi.model.OWLDataRange result66 = testSubject0
                .visit(_OWLDataIntersectionOf);
        org.semanticweb.owlapi.model.OWLDataRange result67 = testSubject0
                .visit(_OWLDataUnionOf);
        org.semanticweb.owlapi.model.OWLAxiom result68 = testSubject0
                .visit(_OWLHasKeyAxiom);
        org.semanticweb.owlapi.model.OWLDataRange result69 = testSubject0
                .visit(_OWLDatatypeRestriction);
        org.semanticweb.owlapi.model.OWLClassExpression result70 = testSubject0
                .visit(_OWLDataMaxCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result71 = testSubject0
                .visit(_OWLDataMinCardinality);
        org.semanticweb.owlapi.model.OWLDataRange result72 = testSubject0
                .visit(_OWLDatatype);
        org.semanticweb.owlapi.model.OWLDataRange result73 = testSubject0
                .visit(_OWLDataComplementOf);
        org.semanticweb.owlapi.model.OWLAxiom result74 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result75 = testSubject0
                .visit(_OWLReflexiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result76 = testSubject0
                .visit(_OWLDisjointClassesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result77 = testSubject0
                .visit(_OWLDataPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLDataRange result78 = testSubject0
                .visit(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataRange result79 = testSubject0
                .visit(_OWLFacetRestriction);
        org.semanticweb.owlapi.model.OWLAxiom result80 = testSubject0
                .visit(_OWLSubClassOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result81 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLClassExpression result82 = testSubject0
                .visit(_OWLObjectSomeValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result83 = testSubject0
                .visit(_OWLObjectAllValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result84 = testSubject0
                .visit(_OWLObjectHasValue);
        org.semanticweb.owlapi.model.OWLClassExpression result85 = testSubject0
                .visit(_OWLObjectMinCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result86 = testSubject0
                .visit(_OWLClass);
        org.semanticweb.owlapi.model.OWLClassExpression result87 = testSubject0
                .visit(_OWLObjectIntersectionOf);
        org.semanticweb.owlapi.model.OWLClassExpression result88 = testSubject0
                .visit(_OWLObjectUnionOf);
        org.semanticweb.owlapi.model.OWLClassExpression result89 = testSubject0
                .visit(_OWLObjectComplementOf);
        org.semanticweb.owlapi.model.OWLClassExpression result90 = testSubject0
                .visit(_OWLDataSomeValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result91 = testSubject0
                .visit(_OWLDataAllValuesFrom);
        org.semanticweb.owlapi.model.OWLClassExpression result92 = testSubject0
                .visit(_OWLDataHasValue);
        org.semanticweb.owlapi.model.OWLClassExpression result93 = testSubject0
                .visit(_OWLDataExactCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result94 = testSubject0
                .visit(_OWLObjectExactCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result95 = testSubject0
                .visit(_OWLObjectMaxCardinality);
        org.semanticweb.owlapi.model.OWLClassExpression result96 = testSubject0
                .visit(_OWLObjectHasSelf);
        org.semanticweb.owlapi.model.OWLClassExpression result97 = testSubject0
                .visit(_OWLObjectOneOf);
        org.semanticweb.owlapi.model.OWLAxiom result98 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result99 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result100 = testSubject0
                .visit(_OWLSubDataPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result101 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result102 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result103 = testSubject0
                .visit(_OWLClassAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result104 = testSubject0
                .visit(_OWLEquivalentClassesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result105 = testSubject0
                .visit(_OWLDataPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result106 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result107 = testSubject0
                .visit(_OWLAnnotationPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result108 = testSubject0
                .visit(_OWLSubAnnotationPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result109 = testSubject0
                .visit(_OWLDatatypeDefinitionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result110 = testSubject0
                .visit(_OWLSameIndividualAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result111 = testSubject0
                .visit(_OWLSubPropertyChainOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result112 = testSubject0
                .visit(_OWLInverseObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result114 = testSubject0
                .visit(_OWLDisjointDataPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result115 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result116 = testSubject0
                .visit(_OWLObjectPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result117 = testSubject0
                .visit(_OWLObjectPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result118 = testSubject0
                .visit(_OWLObjectPropertyDomainAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result119 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result120 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result121 = testSubject0
                .visit(_OWLDifferentIndividualsAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result122 = testSubject0
                .visit(_OWLAnnotationAssertionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result123 = testSubject0
                .visit(_OWLSymmetricObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result124 = testSubject0
                .visit(_OWLDataPropertyRangeAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result125 = testSubject0
                .visit(_OWLFunctionalDataPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result126 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result127 = testSubject0
                .visit(_OWLSubObjectPropertyOfAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result128 = testSubject0
                .visit(_OWLDisjointUnionAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result129 = testSubject0
                .visit(_OWLDeclarationAxiom);
    }

    @Test
    public void enforceInterfacesNonMappingOntologyIRIMapper() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyIRIMapper.class
                .isAssignableFrom(NonMappingOntologyIRIMapper.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(NonMappingOntologyIRIMapper.class));
    }

    public void verifyNonMappingOntologyIRIMapper() throws Exception {
        NonMappingOntologyIRIMapper testSubject0 = new NonMappingOntologyIRIMapper();
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesNullProgressMonitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ProgressMonitor.class
                .isAssignableFrom(NullProgressMonitor.class));
    }

    public void verifyNullProgressMonitor() throws Exception {
        NullProgressMonitor testSubject0 = new NullProgressMonitor();
        testSubject0.setSize(_long);
        testSubject0.setStarted();
        testSubject0.setProgress(_long);
        testSubject0.setMessage(_String);
        testSubject0.setIndeterminate(_boolean);
        testSubject0.setFinished();
        boolean result0 = testSubject0.isCancelled();
    }

    

    public void verifyObjectPropertySimplifier() throws Exception {
        ObjectPropertySimplifier testSubject0 = new ObjectPropertySimplifier(
                _OWLDataFactory);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result0 = testSubject0
                .getSimplified(_OWLObjectPropertyExpression);
    }

    @Test
    public void enforceInterfacesOntologyIRIShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class
                .isAssignableFrom(OntologyIRIShortFormProvider.class));
    }

    public void verifyOntologyIRIShortFormProvider() throws Exception {
        OntologyIRIShortFormProvider testSubject0 = new OntologyIRIShortFormProvider();
        java.lang.String result0 = testSubject0.getShortForm(_OWLOntology);
        java.lang.String result1 = testSubject0.getShortForm(_IRI);
    }

    

    public void verifyInterfaceOWLAxiomFilter() throws Exception {
        OWLAxiomFilter testSubject0 = mock(OWLAxiomFilter.class);
        boolean result0 = testSubject0.passes(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesOWLAxiomSearchFilter() throws Exception {
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLAxiomSearchFilter.class));
    }

    public void verifyInterfaceOWLAxiomSearchFilter() throws Exception {
        OWLAxiomSearchFilter testSubject0 = mock(OWLAxiomSearchFilter.class);
        org.semanticweb.owlapi.model.AxiomType result0 = testSubject0.getAxiomType();
        boolean result1 = testSubject0.pass(_OWLAxiom128, _Object129);
    }

    @Test
    public void enforceInterfacesOWLAxiomTypeProcessor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(OWLAxiomTypeProcessor.class));
    }

    public void verifyOWLAxiomTypeProcessor() throws Exception {
        OWLAxiomTypeProcessor testSubject0 = new OWLAxiomTypeProcessor() {
            @Override
            public void visit(OWLDatatypeDefinitionAxiom axiom) {}

            @Override
            protected void process(OWLAxiom axiom, AxiomType<?> type) {}
        };
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitorAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(OWLAxiomVisitorAdapter.class));
    }

    public void verifyOWLAxiomVisitorAdapter() throws Exception {
        OWLAxiomVisitorAdapter testSubject0 = new OWLAxiomVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionCollector() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitorEx.class
                .isAssignableFrom(OWLClassExpressionCollector.class));
    }

    public void verifyOWLClassExpressionCollector() throws Exception {
        OWLClassExpressionCollector testSubject0 = new OWLClassExpressionCollector();
        java.lang.Object result12 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.lang.Object result15 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.lang.Object result26 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.lang.Object result38 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.lang.Object result75 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result84 = testSubject0
                .visit(_OWLObjectUnionOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result85 = testSubject0
                .visit(_OWLFacetRestriction);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result86 = testSubject0
                .visit(_SWRLLiteralArgument);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result87 = testSubject0
                .visit(_OWLAsymmetricObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result88 = testSubject0
                .visit(_OWLObjectComplementOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result89 = testSubject0
                .visit(_SWRLSameIndividualAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result90 = testSubject0
                .visit(_SWRLVariable);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result91 = testSubject0
                .visit(_OWLLiteral);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result92 = testSubject0
                .visit(_OWLObjectIntersectionOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result93 = testSubject0
                .visit(_OWLNegativeObjectPropertyAssertionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result94 = testSubject0
                .visit(_SWRLIndividualArgument);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result95 = testSubject0
                .visit(_OWLObjectHasValue);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result96 = testSubject0
                .visit(_OWLDataPropertyDomainAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result97 = testSubject0
                .visit(_OWLObjectMinCardinality);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result98 = testSubject0
                .visit(_OWLObjectPropertyDomainAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result99 = testSubject0
                .visit(_OWLObjectExactCardinality);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result100 = testSubject0
                .visit(_OWLObjectSomeValuesFrom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result101 = testSubject0
                .visit(_OWLReflexiveObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result102 = testSubject0
                .visit(_SWRLDifferentIndividualsAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result103 = testSubject0
                .visit(_OWLObjectAllValuesFrom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result104 = testSubject0
                .visit(_OWLDisjointClassesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result105 = testSubject0
                .visit(_OWLObjectInverseOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result106 = testSubject0
                .visit(_SWRLDataRangeAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result107 = testSubject0
                .visit(_OWLAnnotation);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result108 = testSubject0
                .visit(_OWLDataOneOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result109 = testSubject0
                .visit(_OWLDataProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result110 = testSubject0
                .visit(_SWRLObjectPropertyAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result111 = testSubject0
                .visit(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result112 = testSubject0
                .visit(_OWLDatatype);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result113 = testSubject0
                .visit(_OWLObjectProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result114 = testSubject0
                .visit(_OWLAnonymousIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result115 = testSubject0
                .visit(_SWRLClassAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result116 = testSubject0
                .visit(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result117 = testSubject0
                .visit(_OWLDatatypeRestriction);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result118 = testSubject0
                .visit(_SWRLBuiltInAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result119 = testSubject0
                .visit(_OWLAnnotationProperty);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result120 = testSubject0
                .visit(_OWLClass);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result121 = testSubject0
                .visit(_OWLDataIntersectionOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result122 = testSubject0
                .visit(_OWLNamedIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result123 = testSubject0
                .visit(_OWLDataUnionOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result124 = testSubject0
                .visit(_OWLSubClassOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result125 = testSubject0
                .visit(_OWLAnnotationPropertyRangeAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result126 = testSubject0
                .visit(_OWLEquivalentClassesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result127 = testSubject0
                .visit(_OWLDataPropertyAssertionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result128 = testSubject0
                .visit(_OWLTransitiveObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result129 = testSubject0
                .visit(_OWLIrreflexiveObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result130 = testSubject0
                .visit(_OWLSubDataPropertyOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result131 = testSubject0
                .visit(_OWLInverseFunctionalObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result132 = testSubject0
                .visit(_OWLSymmetricObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result133 = testSubject0
                .visit(_OWLDataPropertyRangeAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result134 = testSubject0
                .visit(_OWLFunctionalDataPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result135 = testSubject0
                .visit(_OWLEquivalentDataPropertiesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result136 = testSubject0
                .visit(_OWLClassAssertionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result137 = testSubject0
                .visit(_SWRLRule);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result138 = testSubject0
                .visit(_OWLSubAnnotationPropertyOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result139 = testSubject0
                .visit(_OWLAnnotationPropertyDomainAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result140 = testSubject0
                .visit(_OWLDataComplementOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result141 = testSubject0
                .visit(_SWRLDataPropertyAtom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result142 = testSubject0
                .visit(_OWLSameIndividualAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result143 = testSubject0
                .visit(_OWLSubPropertyChainOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result144 = testSubject0
                .visit(_OWLInverseObjectPropertiesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result145 = testSubject0
                .visit(_OWLHasKeyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result146 = testSubject0
                .visit(_OWLDatatypeDefinitionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result147 = testSubject0
                .visit(_OWLDifferentIndividualsAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result148 = testSubject0
                .visit(_OWLDataSomeValuesFrom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result149 = testSubject0
                .visit(_OWLDataAllValuesFrom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result150 = testSubject0
                .visit(_OWLDisjointDataPropertiesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result151 = testSubject0
                .visit(_OWLDataHasValue);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result152 = testSubject0
                .visit(_OWLDisjointObjectPropertiesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result153 = testSubject0
                .visit(_OWLEquivalentObjectPropertiesAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result154 = testSubject0
                .visit(_OWLObjectMaxCardinality);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result155 = testSubject0
                .visit(_OWLObjectHasSelf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result156 = testSubject0
                .visit(_OWLNegativeDataPropertyAssertionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result157 = testSubject0
                .visit(_OWLObjectOneOf);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result158 = testSubject0
                .visit(_OWLFunctionalObjectPropertyAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result159 = testSubject0
                .visit(_OWLSubObjectPropertyOfAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result160 = testSubject0
                .visit(_OWLDisjointUnionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result161 = testSubject0
                .visit(_OWLDeclarationAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result162 = testSubject0
                .visit(_OWLAnnotationAssertionAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result163 = testSubject0
                .visit(_OWLDataMinCardinality);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result164 = testSubject0
                .visit(_OWLObjectPropertyRangeAxiom);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result165 = testSubject0
                .visit(_OWLDataExactCardinality);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result166 = testSubject0
                .visit(_OWLDataMaxCardinality);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result167 = testSubject0
                .visit(_OWLObjectPropertyAssertionAxiom);
    }

    @Test
    public void enforceInterfacesOWLClassExpressionVisitorAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitor.class
                .isAssignableFrom(OWLClassExpressionVisitorAdapter.class));
    }

    public void verifyOWLClassExpressionVisitorAdapter() throws Exception {
        OWLClassExpressionVisitorAdapter testSubject0 = new OWLClassExpressionVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionVisitorExAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx.class
                .isAssignableFrom(OWLClassExpressionVisitorExAdapter.class));
    }

    public void verifyOWLClassExpressionVisitorExAdapter() throws Exception {
        OWLClassExpressionVisitorExAdapter<OWLObject> testSubject0 = new OWLClassExpressionVisitorExAdapter();
        OWLClassExpressionVisitorExAdapter testSubject1 = new OWLClassExpressionVisitorExAdapter(
                _Object130);
    }

    @Test
    public void enforceInterfacesOWLClassLiteralCollector() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectWalker.class
                .isAssignableFrom(OWLClassLiteralCollector.class));
    }

    public void verifyOWLClassLiteralCollector() throws Exception {
        OWLClassLiteralCollector testSubject0 = new OWLClassLiteralCollector(_Set131);
        OWLClassLiteralCollector testSubject1 = new OWLClassLiteralCollector(_Set131,
                _boolean);
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result0 = testSubject0
                .getPositiveLiterals();
        java.util.Set<org.semanticweb.owlapi.model.OWLClass> result1 = testSubject0
                .getNegativeLiterals();
        org.semanticweb.owlapi.model.OWLAnnotation result2 = testSubject0.getAnnotation();
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0.getOntology();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result4 = testSubject0
                .getClassExpressionPath();
        boolean result5 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<org.semanticweb.owlapi.model.OWLDataRange> result6 = testSubject0
                .getDataRangePath();
        org.semanticweb.owlapi.model.OWLAxiom result7 = testSubject0.getAxiom();
        testSubject0.walkStructure(_OWLObjectVisitorEx132);
    }

    

    public void verifyOWLDataUtil() throws Exception {
        OWLDataUtil testSubject0 = new OWLDataUtil();
        org.semanticweb.owlapi.model.OWLDatatype result0 = OWLDataUtil.getDatatype(
                _OWLDataFactory, _Number);
        org.semanticweb.owlapi.model.OWLDatatype result1 = OWLDataUtil
                .getIntDatatype(_OWLDataFactory);
        org.semanticweb.owlapi.model.OWLDatatype result2 = OWLDataUtil
                .getLongDatatype(_OWLDataFactory);
        org.semanticweb.owlapi.model.OWLDatatype result3 = OWLDataUtil
                .getFloatDatatype(_OWLDataFactory);
        org.semanticweb.owlapi.model.OWLDatatype result4 = OWLDataUtil
                .getDoubleDatatype(_OWLDataFactory);
        java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> result5 = OWLDataUtil
                .getFacetRestrictionSet(_OWLDataFactory, _OWLFacet, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLLiteral result6 = OWLDataUtil.getTypedConstant(
                _OWLDataFactory, _Number);
        org.semanticweb.owlapi.model.OWLDataRange result7 = OWLDataUtil
                .getMinInclusiveRestrictedInt(_OWLDataFactory, _Number);
        org.semanticweb.owlapi.model.OWLDataRange result8 = OWLDataUtil
                .getMinExclusiveRestrictedInt(_OWLDataFactory, _Number);
        org.semanticweb.owlapi.model.OWLDataRange result9 = OWLDataUtil
                .getMaxInclusiveRestrictedInteger(_OWLDataFactory, _Number);
        org.semanticweb.owlapi.model.OWLDataRange result10 = OWLDataUtil
                .getMaxExclusiveRestrictedInteger(_OWLDataFactory, _Number);
        org.semanticweb.owlapi.model.OWLDataRange result11 = OWLDataUtil
                .getMinMaxInclusiveRestrictedInteger(_OWLDataFactory, _Number, _Number);
        org.semanticweb.owlapi.model.OWLDataRange result12 = OWLDataUtil
                .getMinMaxExclusiveRestrictedInteger(_OWLDataFactory, _Number, _Number);
    }

    @Test
    public void enforceInterfacesOWLEntityCollectingOntologyChangeListener()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeListener.class
                .isAssignableFrom(OWLEntityCollectingOntologyChangeListener.class));
    }

    public void verifyOWLEntityCollectingOntologyChangeListener() throws Exception {
        OWLEntityCollectingOntologyChangeListener testSubject0 = new OWLEntityCollectingOntologyChangeListener() {
            @Override
            public void ontologiesChanged() throws OWLException {}
        };
        testSubject0.ontologiesChanged();
        testSubject0.ontologiesChanged(_List112);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getEntities();
    }

    @Test
    public void enforceInterfacesOWLEntityCollector() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLEntityCollector.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(OWLEntityCollector.class));
    }

    public void verifyOWLEntityCollector() throws Exception {
        OWLEntityCollector testSubject0 = new OWLEntityCollector(_Set135);
        OWLEntityCollector testSubject1 = new OWLEntityCollector(_Set135, _Collection136);
        OWLEntityCollector testSubject2 = new OWLEntityCollector();
        testSubject0.reset(_Set135);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getObjects();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnonymousIndividual> result1 = testSubject0
                .getAnonymousIndividuals();
        testSubject0.setCollectClasses(_boolean);
        testSubject0.setCollectObjectProperties(_boolean);
        testSubject0.setCollectDataProperties(_boolean);
        testSubject0.setCollectIndividuals(_boolean);
        testSubject0.setCollectDatatypes(_boolean);
    }

    @Test
    public void enforceInterfacesOWLEntityComparator() throws Exception {
        assertTrue(java.util.Comparator.class.isAssignableFrom(OWLEntityComparator.class));
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitor.class
                .isAssignableFrom(OWLEntityComparator.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLEntityComparator.class));
    }

    public void verifyOWLEntityComparator() throws Exception {
        OWLEntityComparator testSubject0 = new OWLEntityComparator(_ShortFormProvider);
        int result1 = testSubject0.compare(_OWLEntity, _OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityIRIComparator() throws Exception {
        assertTrue(java.util.Comparator.class
                .isAssignableFrom(OWLEntityIRIComparator.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(OWLEntityIRIComparator.class));
    }

    public void verifyOWLEntityIRIComparator() throws Exception {
        OWLEntityIRIComparator testSubject0 = new OWLEntityIRIComparator();
        int result0 = testSubject0.compare(_OWLEntity, _OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityRemover() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitor.class
                .isAssignableFrom(OWLEntityRemover.class));
    }

    public void verifyOWLEntityRemover() throws Exception {
        OWLEntityRemover testSubject0 = new OWLEntityRemover(_OWLOntologyManager, _Set61);
        testSubject0.reset();
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    

    public void verifyOWLEntityRenamer() throws Exception {
        OWLEntityRenamer testSubject0 = new OWLEntityRenamer(_OWLOntologyManager, _Set61);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .changeIRI(_Map138);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result1 = testSubject0
                .changeIRI(_OWLEntity, _IRI);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result2 = testSubject0
                .changeIRI(_IRI, _IRI);
    }

    

    public void verifyInterfaceOWLEntitySetProvider() throws Exception {
        OWLEntitySetProvider testSubject0 = mock(OWLEntitySetProvider.class);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLEntityTinyURIConversionStrategy() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy.class
                .isAssignableFrom(OWLEntityTinyURIConversionStrategy.class));
    }

    public void verifyOWLEntityTinyURIConversionStrategy() throws Exception {
        OWLEntityTinyURIConversionStrategy testSubject0 = new OWLEntityTinyURIConversionStrategy();
        OWLEntityTinyURIConversionStrategy testSubject1 = new OWLEntityTinyURIConversionStrategy(
                _String);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getConvertedIRI(_OWLEntity);
    }

    

    public void verifyOWLEntityURIConverter() throws Exception {
        OWLEntityURIConverter testSubject0 = new OWLEntityURIConverter(
                _OWLOntologyManager, _Set61, _OWLEntityURIConverterStrategy);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges();
    }

    

    public void verifyInterfaceOWLEntityURIConverterStrategy() throws Exception {
        OWLEntityURIConverterStrategy testSubject0 = mock(OWLEntityURIConverterStrategy.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getConvertedIRI(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityURIUnderscores2CamelBackConverterStrategy()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy.class
                .isAssignableFrom(OWLEntityURIUnderscores2CamelBackConverterStrategy.class));
    }

    public void verifyOWLEntityURIUnderscores2CamelBackConverterStrategy()
            throws Exception {
        OWLEntityURIUnderscores2CamelBackConverterStrategy testSubject0 = new OWLEntityURIUnderscores2CamelBackConverterStrategy();
        org.semanticweb.owlapi.model.IRI result0 = testSubject0
                .getConvertedIRI(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityVisitorAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitor.class
                .isAssignableFrom(OWLEntityVisitorAdapter.class));
    }

    public void verifyOWLEntityVisitorAdapter() throws Exception {
        OWLEntityVisitorAdapter testSubject0 = new OWLEntityVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLEntityVisitorExAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLEntityVisitorEx.class
                .isAssignableFrom(OWLEntityVisitorExAdapter.class));
    }

    public void verifyOWLEntityVisitorExAdapter() throws Exception {
        OWLEntityVisitorExAdapter<OWLObject> testSubject0 = new OWLEntityVisitorExAdapter(
                _Object130);
        OWLEntityVisitorExAdapter testSubject1 = new OWLEntityVisitorExAdapter();
    }

    @Test
    public void enforceInterfacesOWLObjectComponentCollector() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLObjectComponentCollector.class));
    }

    public void verifyOWLObjectComponentCollector() throws Exception {
        OWLObjectComponentCollector testSubject0 = new OWLObjectComponentCollector();
        java.util.Set<org.semanticweb.owlapi.model.OWLObject> result0 = testSubject0
                .getComponents(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLObject> result1 = testSubject0
                .getResult();
    }

    @Test
    public void enforceInterfacesOWLObjectDuplicator() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLObjectDuplicator.class));
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(OWLObjectDuplicator.class));
    }

    public void verifyOWLObjectDuplicator() throws Exception {
        OWLObjectDuplicator testSubject0 = new OWLObjectDuplicator(_Map138,
                _OWLDataFactory);
        OWLObjectDuplicator testSubject1 = new OWLObjectDuplicator(_OWLDataFactory,
                _Map141);
        OWLObjectDuplicator testSubject2 = new OWLObjectDuplicator(_OWLDataFactory);
        OWLObject result0 = testSubject0.duplicateObject(_OWLObject);
    }

    

    public void verifyOWLObjectPropertyManager() throws Exception {
        OWLObjectPropertyManager testSubject0 = new OWLObjectPropertyManager(
                _OWLOntologyManager, _OWLOntology);
        java.util.Collection<java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> result0 = OWLObjectPropertyManager
                .getEquivalentObjectProperties(_Set61);
        java.util.Collection<java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> result1 = testSubject0
                .getEquivalentObjectProperties();
        boolean result2 = testSubject0.isComposite(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result3 = testSubject0
                .getCompositeProperties();
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> result4 = testSubject0
                .getPropertyHierarchy();
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> result5 = testSubject0
                .getHierarchyReflexiveTransitiveClosure();
        boolean result6 = testSubject0.isSubPropertyOf(_OWLObjectPropertyExpression,
                _OWLObjectPropertyExpression);
        boolean result7 = testSubject0.isNonSimple(_OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result8 = testSubject0
                .getNonSimpleProperties();
        java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> result9 = testSubject0
                .getPropertyPartialOrdering();
        boolean result10 = testSubject0.isLessThan(_OWLObjectPropertyExpression,
                _OWLObjectPropertyExpression);
        OWLObjectPropertyManager.tarjan(_Set61, _OWLObjectPropertyExpression, _int,
                _Stack, _Map143, _Map143, _Set144, _Set145, _Set145);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesOWLObjectTypeIndexProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLObjectTypeIndexProvider.class));
    }

    public void verifyOWLObjectTypeIndexProvider() throws Exception {
        OWLObjectTypeIndexProvider testSubject0 = new OWLObjectTypeIndexProvider();
        int result0 = testSubject0.getTypeIndex(_OWLObject);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(OWLObjectVisitorAdapter.class));
    }

    public void verifyOWLObjectVisitorAdapter() throws Exception {
        OWLObjectVisitorAdapter testSubject0 = new OWLObjectVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorExAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitorEx.class
                .isAssignableFrom(OWLObjectVisitorExAdapter.class));
    }

    public void verifyOWLObjectVisitorExAdapter() throws Exception {
        OWLObjectVisitorExAdapter<OWLObject> testSubject0 = new OWLObjectVisitorExAdapter(
                _Object130);
        OWLObjectVisitorExAdapter testSubject1 = new OWLObjectVisitorExAdapter();
    }

    

    public void verifyOWLObjectWalker() throws Exception {
        OWLObjectWalker testSubject0 = new OWLObjectWalker(_Set146);
        OWLObjectWalker testSubject1 = new OWLObjectWalker(_Set146, _boolean);
        org.semanticweb.owlapi.model.OWLAnnotation result0 = testSubject0.getAnnotation();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.getOntology();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getClassExpressionPath();
        boolean result3 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<org.semanticweb.owlapi.model.OWLDataRange> result4 = testSubject0
                .getDataRangePath();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getAxiom();
        testSubject0.walkStructure(_OWLObjectVisitorEx132);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeFilter() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter.class
                .isAssignableFrom(OWLOntologyChangeFilter.class));
        assertTrue(org.semanticweb.owlapi.model.OWLAxiomVisitor.class
                .isAssignableFrom(OWLOntologyChangeFilter.class));
    }

    public void verifyOWLOntologyChangeFilter() throws Exception {
        OWLOntologyChangeFilter testSubject0 = new OWLOntologyChangeFilter();
        testSubject0.processChanges(_List112);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVisitorAdapter() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeVisitor.class
                .isAssignableFrom(OWLOntologyChangeVisitorAdapter.class));
    }

    public void verifyOWLOntologyChangeVisitorAdapter() throws Exception {
        OWLOntologyChangeVisitorAdapter testSubject0 = new OWLOntologyChangeVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVisitorAdapterEx() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeVisitorEx.class
                .isAssignableFrom(OWLOntologyChangeVisitorAdapterEx.class));
    }

    public void verifyOWLOntologyChangeVisitorAdapterEx() throws Exception {
        OWLOntologyChangeVisitorAdapterEx<OWLObject> testSubject0 = new OWLOntologyChangeVisitorAdapterEx(
                _Object130);
        OWLOntologyChangeVisitorAdapterEx testSubject1 = new OWLOntologyChangeVisitorAdapterEx();
    }

    @Test
    public void enforceInterfacesOWLOntologyImportsClosureSetProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologySetProvider.class
                .isAssignableFrom(OWLOntologyImportsClosureSetProvider.class));
    }

    public void verifyOWLOntologyImportsClosureSetProvider() throws Exception {
        OWLOntologyImportsClosureSetProvider testSubject0 = new OWLOntologyImportsClosureSetProvider(
                _OWLOntologyManager, _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result0 = testSubject0
                .getOntologies();
    }

    @Test
    public void enforceInterfacesOWLOntologyMerger() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomFilter.class
                .isAssignableFrom(OWLOntologyMerger.class));
    }

    public void verifyOWLOntologyMerger() throws Exception {
        OWLOntologyMerger testSubject0 = new OWLOntologyMerger(_OWLOntologySetProvider,
                _OWLAxiomFilter);
        OWLOntologyMerger testSubject1 = new OWLOntologyMerger(_OWLOntologySetProvider,
                _boolean);
        OWLOntologyMerger testSubject2 = new OWLOntologyMerger(_OWLOntologySetProvider);
        org.semanticweb.owlapi.model.OWLOntology result0 = testSubject0
                .createMergedOntology(_OWLOntologyManager, _IRI);
        boolean result1 = testSubject0.passes(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologySingletonSetProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologySetProvider.class
                .isAssignableFrom(OWLOntologySingletonSetProvider.class));
    }

    public void verifyOWLOntologySingletonSetProvider() throws Exception {
        OWLOntologySingletonSetProvider testSubject0 = new OWLOntologySingletonSetProvider(
                _OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result0 = testSubject0
                .getOntologies();
    }

    

    public void verifyOWLOntologyURIChanger() throws Exception {
        OWLOntologyURIChanger testSubject0 = new OWLOntologyURIChanger(
                _OWLOntologyManager);
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result0 = testSubject0
                .getChanges(_OWLOntology, _IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyWalker() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectWalker.class
                .isAssignableFrom(OWLOntologyWalker.class));
    }

    public void verifyOWLOntologyWalker() throws Exception {
        OWLOntologyWalker testSubject0 = new OWLOntologyWalker(_Set61);
        org.semanticweb.owlapi.model.OWLAnnotation result0 = testSubject0.getAnnotation();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.getOntology();
        java.util.List<org.semanticweb.owlapi.model.OWLClassExpression> result2 = testSubject0
                .getClassExpressionPath();
        boolean result3 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<org.semanticweb.owlapi.model.OWLDataRange> result4 = testSubject0
                .getDataRangePath();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getAxiom();
        testSubject0.walkStructure(_OWLObjectVisitorEx132);
    }

    @Test
    public void enforceInterfacesOWLOntologyWalkerVisitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorExAdapter.class
                .isAssignableFrom(OWLOntologyWalkerVisitor.class));
    }

    public void verifyOWLOntologyWalkerVisitor() throws Exception {
        OWLOntologyWalkerVisitor<OWLObject> testSubject0 = new OWLOntologyWalkerVisitor(
                _OWLOntologyWalker);
        org.semanticweb.owlapi.model.OWLAxiom result0 = testSubject0.getCurrentAxiom();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0
                .getCurrentOntology();
        org.semanticweb.owlapi.model.OWLAnnotation result2 = testSubject0
                .getCurrentAnnotation();
    }

    

    public void verifyInterfaceProgressMonitor() throws Exception {
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
    public void enforceInterfacesPropertyAssertionValueShortFormProvider()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(PropertyAssertionValueShortFormProvider.class));
    }

    public void verifyPropertyAssertionValueShortFormProvider() throws Exception {
        PropertyAssertionValueShortFormProvider testSubject0 = new PropertyAssertionValueShortFormProvider(
                _List156, _Map157, _OWLOntologySetProvider);
        PropertyAssertionValueShortFormProvider testSubject1 = new PropertyAssertionValueShortFormProvider(
                _List156, _Map157, _OWLOntologySetProvider, _ShortFormProvider);
        java.util.List<org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>> result0 = testSubject0
                .getProperties();
        java.lang.String result1 = testSubject0.getShortForm(_OWLEntity);
        java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.List<java.lang.String>> result2 = testSubject0
                .getPreferredLanguageMap();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesQNameShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(QNameShortFormProvider.class));
    }

    public void verifyQNameShortFormProvider() throws Exception {
        QNameShortFormProvider testSubject0 = new QNameShortFormProvider();
        QNameShortFormProvider testSubject1 = new QNameShortFormProvider(_Map158);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedEntitySetProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.OWLEntitySetProvider.class
                .isAssignableFrom(ReferencedEntitySetProvider.class));
    }

    public void verifyReferencedEntitySetProvider() throws Exception {
        ReferencedEntitySetProvider testSubject0 = new ReferencedEntitySetProvider(_Set61);
        java.util.Set<org.semanticweb.owlapi.model.OWLEntity> result0 = testSubject0
                .getEntities();
    }

    

    public void verifyInterfaceRootClassChecker() throws Exception {
        RootClassChecker testSubject0 = mock(RootClassChecker.class);
        boolean result0 = testSubject0.isRootClass(_OWLClass);
    }

    

    public void verifyInterfaceShortFormProvider() throws Exception {
        ShortFormProvider testSubject0 = mock(ShortFormProvider.class);
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesSimpleIRIMapper() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyIRIMapper.class
                .isAssignableFrom(SimpleIRIMapper.class));
    }

    public void verifySimpleIRIMapper() throws Exception {
        SimpleIRIMapper testSubject0 = new SimpleIRIMapper(_IRI, _IRI);
        SimpleIRIMapper testSubject1 = new SimpleIRIMapper(_URI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesSimpleIRIShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class
                .isAssignableFrom(SimpleIRIShortFormProvider.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(SimpleIRIShortFormProvider.class));
    }

    public void verifySimpleIRIShortFormProvider() throws Exception {
        SimpleIRIShortFormProvider testSubject0 = new SimpleIRIShortFormProvider();
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
    }

    @Test
    public void enforceInterfacesSimpleRenderer() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLObjectVisitor.class
                .isAssignableFrom(SimpleRenderer.class));
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class
                .isAssignableFrom(SimpleRenderer.class));
    }

    public void verifySimpleRenderer() throws Exception {
        SimpleRenderer testSubject0 = new SimpleRenderer();
        testSubject0.reset();
        java.lang.String result0 = testSubject0.getShortForm(_IRI);
        java.lang.String result1 = testSubject0.render(_OWLObject);
        testSubject0.setPrefix(_String, _String);
        testSubject0.setShortFormProvider(_ShortFormProvider);
        testSubject0.resetShortFormProvider();
        boolean result2 = testSubject0.isUsingDefaultShortFormProvider();
        testSubject0.setPrefixesFromOntologyFormat(_OWLOntology, _OWLOntologyManager,
                _boolean);
        testSubject0.writeAnnotations(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesSimpleRootClassChecker() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.RootClassChecker.class
                .isAssignableFrom(SimpleRootClassChecker.class));
    }

    public void verifySimpleRootClassChecker() throws Exception {
        SimpleRootClassChecker testSubject0 = new SimpleRootClassChecker(_Set61);
        boolean result0 = testSubject0.isRootClass(_OWLClass);
    }

    @Test
    public void enforceInterfacesSimpleShortFormProvider() throws Exception {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class
                .isAssignableFrom(SimpleShortFormProvider.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(SimpleShortFormProvider.class));
    }

    public void verifySimpleShortFormProvider() throws Exception {
        SimpleShortFormProvider testSubject0 = new SimpleShortFormProvider();
        java.lang.String result0 = testSubject0.getShortForm(_OWLEntity);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesStringLengthComparator() throws Exception {
        assertTrue(java.util.Comparator.class
                .isAssignableFrom(StringLengthComparator.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(StringLengthComparator.class));
    }

    public void verifyStringLengthComparator() throws Exception {
        StringLengthComparator testSubject0 = new StringLengthComparator();
        int result0 = testSubject0.compare(_String, _String);
        int result1 = testSubject0.compare(_Object137, _Object137);
    }

    

    public void verifyStructuralTransformation() throws Exception {
        StructuralTransformation testSubject0 = new StructuralTransformation(
                _OWLDataFactory);
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getTransformedAxioms(_Set160);
    }

    @Test
    public void enforceInterfacesSWRLVariableExtractor() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.SWRLObjectVisitor.class
                .isAssignableFrom(SWRLVariableExtractor.class));
    }

    public void verifySWRLVariableExtractor() throws Exception {
        SWRLVariableExtractor testSubject0 = new SWRLVariableExtractor();
        java.util.Set<org.semanticweb.owlapi.model.SWRLVariable> result0 = testSubject0
                .getVariables();
    }

    

    public void verifyInterfaceSWRLVariableShortFormProvider() throws Exception {
        SWRLVariableShortFormProvider testSubject0 = mock(SWRLVariableShortFormProvider.class);
        java.lang.String result0 = testSubject0.getShortForm(_SWRLVariable);
    }

    

    public void verifyVersion() throws Exception {
        Version testSubject0 = new Version(_int, _int, _int, _int);
        int result0 = testSubject0.getMajor();
        int result1 = testSubject0.getMinor();
        int result2 = testSubject0.getPatch();
        int result3 = testSubject0.getBuild();
    }

    

    public void verifyVersionInfo() throws Exception {
        VersionInfo testSubject0 = VersionInfo.getVersionInfo();
        java.lang.String result1 = testSubject0.getVersion();
        java.lang.String result2 = testSubject0.getGeneratedByMessage();
    }

    @Test
    public void enforceInterfacesWeakCache() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(WeakCache.class));
    }

    public void verifyWeakCache() throws Exception {
        WeakCache<K> testSubject0 = new WeakCache<K>();
        K result0 = testSubject0.cache(_Object129);
        testSubject0.clear();
        boolean result1 = testSubject0.contains(_Object129);
    }

    @Test
    public void enforceInterfacesWeakIndexCache() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(WeakIndexCache.class));
    }

    public void verifyWeakIndexCache() throws Exception {
        WeakIndexCache<K, V> testSubject0 = new WeakIndexCache<Gen_org_semanticweb_owlapi_util.K, Gen_org_semanticweb_owlapi_util.V>();
        V result0 = testSubject0.get(_Object129);
        V result1 = testSubject0.cache(_Object129, _Object161);
        testSubject0.clear();
        boolean result2 = testSubject0.contains(_Object129);
    }

    private static class Key {}

    private static class V {}

    private static class K {}

    private static class Value {}

    private static class N {}

    private K _Object129;
    private Key _Object;
    private Double _Number;
    private OWLAxiom _OWLAxiom128;
    private OWLObject _Object130;
    private OWLObject[] _Object_array;
    private V _Object161;
    private Value _Object119;
    private boolean _boolean;
    private char _char;
    private char[] _char_array;
    private int _int;
    private java.io.File _File;
    private java.lang.String _Object137;
    private java.lang.String _String;
    private java.lang.String[] _String_array;
    private java.net.URI _URI;
    private java.util.Collection<Object> _Collection;
    private java.util.Collection<Value> _Collection121;
    private java.util.Collection<org.semanticweb.owlapi.model.OWLAnonymousIndividual> _Collection136;
    private java.util.Comparator<java.lang.String> _Comparator;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLOntologyChange> _List112;
    private java.util.List<org.semanticweb.owlapi.model.OWLAnnotationProperty> _List;
    private java.util.List<org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?>> _List156;
    private java.util.List<org.semanticweb.owlapi.util.InferredAxiomGenerator<? extends org.semanticweb.owlapi.model.OWLAxiom>> _List115;
    private java.util.Map<java.lang.String, java.lang.String> _Map158;
    private java.util.Map<org.semanticweb.owlapi.model.IRI, org.semanticweb.owlapi.model.IRI> _Map141;
    private java.util.Map<org.semanticweb.owlapi.model.OWLAnnotationProperty, java.util.List<java.lang.String>> _Map;
    private java.util.Map<org.semanticweb.owlapi.model.OWLDataPropertyExpression, java.util.List<java.lang.String>> _Map157;
    private java.util.Map<org.semanticweb.owlapi.model.OWLEntity, org.semanticweb.owlapi.model.IRI> _Map138;
    private java.util.Map<org.semanticweb.owlapi.model.OWLObjectPropertyExpression, java.lang.Integer> _Map143;
    private java.util.Set<OWLObject> _Set146;
    private java.util.Set<Object> _Set65;
    private java.util.Set<java.lang.String> _Set;
    private java.util.Set<java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression>> _Set144;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> _Set160;
    private java.util.Set<org.semanticweb.owlapi.model.OWLEntity> _Set135;
    private java.util.Set<org.semanticweb.owlapi.model.OWLObject> _Set131;
    private java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Set145;
    private java.util.Set<org.semanticweb.owlapi.model.OWLOntology> _Set61;
    private java.util.Stack<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> _Stack;
    private long _long;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private org.semanticweb.owlapi.model.AddAxiom _AddAxiom;
    private org.semanticweb.owlapi.model.AddImport _AddImport;
    private org.semanticweb.owlapi.model.AddOntologyAnnotation _AddOntologyAnnotation;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAnnotation _OWLAnnotation;
    private org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationProperty _OWLAnnotationProperty;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private org.semanticweb.owlapi.model.OWLAnnotationValueVisitorEx<java.lang.String> _OWLAnnotationValueVisitorEx;
    private org.semanticweb.owlapi.model.OWLAnonymousIndividual _OWLAnonymousIndividual;
    private org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLDataAllValuesFrom _OWLDataAllValuesFrom;
    private org.semanticweb.owlapi.model.OWLDataComplementOf _OWLDataComplementOf;
    private org.semanticweb.owlapi.model.OWLDataExactCardinality _OWLDataExactCardinality;
    private org.semanticweb.owlapi.model.OWLDataFactory _OWLDataFactory;
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
    private org.semanticweb.owlapi.model.OWLObjectVisitorEx<?> _OWLObjectVisitorEx132;
    private org.semanticweb.owlapi.model.OWLObjectVisitorEx<OWLObject> _OWLObjectVisitorEx;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyFormat _OWLOntologyFormat;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.OWLOntologySetProvider _OWLOntologySetProvider;
    private org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom _OWLReflexiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLSameIndividualAxiom _OWLSameIndividualAxiom;
    private org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom _OWLSubAnnotationPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubClassOfAxiom _OWLSubClassOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom _OWLSubDataPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom _OWLSubObjectPropertyOfAxiom;
    private org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom _OWLSubPropertyChainOfAxiom;
    private org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom _OWLSymmetricObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom _OWLTransitiveObjectPropertyAxiom;
    private org.semanticweb.owlapi.model.PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.model.RemoveAxiom _RemoveAxiom;
    private org.semanticweb.owlapi.model.RemoveImport _RemoveImport;
    private org.semanticweb.owlapi.model.RemoveOntologyAnnotation _RemoveOntologyAnnotation;
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
    private org.semanticweb.owlapi.model.SetOntologyID _SetOntologyID;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
    private org.semanticweb.owlapi.util.IRIShortFormProvider _IRIShortFormProvider;
    private org.semanticweb.owlapi.util.ImportsStructureObjectSorter.ObjectSelector<OWLObject> _ObjectSelector;
    private org.semanticweb.owlapi.util.InferredAxiomGenerator<?> _InferredAxiomGenerator;
    private org.semanticweb.owlapi.util.MultiMap<Key, Value> _MultiMap;
    private org.semanticweb.owlapi.util.OWLAxiomFilter _OWLAxiomFilter;
    private org.semanticweb.owlapi.util.OWLEntitySetProvider<org.semanticweb.owlapi.model.OWLEntity> _OWLEntitySetProvider;
    private org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy _OWLEntityURIConverterStrategy;
    private org.semanticweb.owlapi.util.OWLOntologyWalker _OWLOntologyWalker;
    private org.semanticweb.owlapi.util.ProgressMonitor _ProgressMonitor;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
