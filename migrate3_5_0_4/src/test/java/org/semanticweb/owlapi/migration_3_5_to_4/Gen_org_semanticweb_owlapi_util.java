package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.util.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "serial", "null", "unused", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "class removed: MultiMap : use Guava Multimap", "class removed: OWLDataUtil",
        "class refactored: OWLOntologyChangeVisitorAdapterEx to OWLOntologyChangeVisitorExAdapter", "method deleted: OWLOntologyChangeVisitorExAdapter<init>(no args)",
        "class deleted: OWLAxiomTypeProcessor : just use the type already on the axiom", "method deleted: EscapeUtils<init> : all methods are static",
        "method changed: ImportsStructureEntitySorter<init> : dropped manager", "method changed: ImportsStructureObjectSorter<init> : dropped manager",
        "method changed: DefaultPrefixManager<init> : changed to nullable parameers", "method changed: InferredAxiomGenerator::createAxioms() : manager changed to OWLDataFactory",
        "method changed: OWLEntityRemover<init> : dropped manager", "class refactored: OWLOntologyURIChanger : OWLOntologyIRIChanger",
        "class refactored: NamespaceUtil : methods to split namespace and local name removed, use IRI methods",
        "method changed: ImportsStructureObjectSorter<init> : dropped manager", "method changed: DefaultPRefixManager::addPrefixes() : copyPrefixesFrom()",
        "method changed: AnnotationValueShortFormProvider<init> : OWLAnnotationValueVisitorEx removed",
        "method visibility: CachingBidirectionalShortFormProvider::remove() : protected", "method visibility: CachingBidirectionalShortFormProvider::rebuild() : protected",
        "method deleted: CachingBidirectionalShortFormProvider::update()", })
public class Gen_org_semanticweb_owlapi_util {
    @Test
    public void enforceInterfacesAbstractOWLOntologyStorer() {
        assertTrue(OWLOntologyStorer.class.isAssignableFrom(AbstractOWLOntologyStorer.class));
    }

    public void verifyAbstractOWLOntologyStorer() throws OWLOntologyStorageException {
        AbstractOWLOntologyStorer testSubject0 = new AbstractOWLOntologyStorer() {
            @Override
            public boolean canStoreOntology(OWLOntologyFormat ontologyFormat) {
                return false;
            }

            @Override
            protected void storeOntology(OWLOntology ontology, Writer writer, OWLOntologyFormat format) throws OWLOntologyStorageException {
            }
        };
        testSubject0.storeOntology(_OWLOntology, _OWLOntologyDocumentTarget, _OWLOntologyFormat);
        testSubject0.storeOntology(_OWLOntology, _IRI, _OWLOntologyFormat);
        boolean result0 = testSubject0.canStoreOntology(_OWLOntologyFormat);
    }

    @Test
    public void enforceInterfacesAnnotationValueShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(AnnotationValueShortFormProvider.class));
    }

    public void verifyAnnotationValueShortFormProvider() {
        AnnotationValueShortFormProvider testSubject0 = new AnnotationValueShortFormProvider(_OWLOntologySetProvider, _ShortFormProvider, _IRIShortFormProvider, _List, _Map);
        AnnotationValueShortFormProvider testSubject2 = new AnnotationValueShortFormProvider(_List, _Map, _OWLOntologySetProvider, _ShortFormProvider);
        AnnotationValueShortFormProvider testSubject3 = new AnnotationValueShortFormProvider(_List, _Map, _OWLOntologySetProvider);
        String result0 = testSubject0.getShortForm(_OWLEntity);
        java.util.List<OWLAnnotationProperty> result1 = testSubject0.getAnnotationProperties();
        java.util.Map<OWLAnnotationProperty, java.util.List<String>> result2 = testSubject0.getPreferredLanguageMap();
        testSubject0.dispose();
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
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
        java.util.Set<String> result1 = testSubject0.getFileExtensions();
        testSubject0.setFileExtensions(_Set);
        java.util.Set<IRI> result2 = testSubject0.getOntologyIRIs();
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
    public void enforceInterfacesAxiomSubjectProvider() {
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(AxiomSubjectProvider.class));
    }

    public void verifyAxiomSubjectProvider() {
        AxiomSubjectProvider testSubject0 = new AxiomSubjectProvider();
        OWLObject result0 = testSubject0.getSubject(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesBidirectionalShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(BidirectionalShortFormProvider.class));
    }

    public void verifyInterfaceBidirectionalShortFormProvider() {
        BidirectionalShortFormProvider testSubject0 = mock(BidirectionalShortFormProvider.class);
        java.util.Set<String> result0 = testSubject0.getShortForms();
        java.util.Set<OWLEntity> result1 = testSubject0.getEntities(_String);
        OWLEntity result2 = testSubject0.getEntity(_String);
        String result3 = testSubject0.getShortForm(_OWLEntity);
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
        String result0 = testSubject0.getShortForm(_OWLEntity);
        java.util.Set<String> result1 = testSubject0.getShortForms();
        java.util.Set<OWLEntity> result2 = testSubject0.getEntities(_String);
        OWLEntity result3 = testSubject0.getEntity(_String);
    }

    @Test
    public void enforceInterfacesCachingBidirectionalShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.BidirectionalShortFormProvider.class.isAssignableFrom(CachingBidirectionalShortFormProvider.class));
    }

    public void verifyCachingBidirectionalShortFormProvider() {
        CachingBidirectionalShortFormProvider testSubject0 = new CachingBidirectionalShortFormProvider() {
            @Override
            protected String generateShortForm(OWLEntity entity) {
                return null;
            }
        };
        testSubject0.add(_OWLEntity);
        String result0 = testSubject0.getShortForm(_OWLEntity);
        java.util.Set<String> result1 = testSubject0.getShortForms();
        java.util.Set<OWLEntity> result2 = testSubject0.getEntities(_String);
        OWLEntity result3 = testSubject0.getEntity(_String);
        testSubject0.dispose();
    }

    public void verifyCollectionFactory() {
        java.util.Map<Object, Object> result0 = CollectionFactory.createMap();
        java.util.Set<Object> result1 = CollectionFactory.getCopyOnRequestSetFromImmutableCollection(_Collection);
        java.util.Map<Object, WeakReference<Object>> result2 = CollectionFactory.createSyncWeakMap();
        CollectionFactory.setExpectedThreads(_int);
        int result3 = CollectionFactory.getExpectedThreads();
        java.util.Set<OWLObject> result4 = CollectionFactory.createSet(_Object_array);
        java.util.Set<Object> result5 = CollectionFactory.createSet();
        java.util.Set<Object> result6 = CollectionFactory.createSet(_Collection);
        java.util.Set<Object> result7 = CollectionFactory.createSet(_int);
        java.util.List<Object> result8 = CollectionFactory.createList();
        java.util.Set<Object> result9 = CollectionFactory.createSyncSet();
        java.util.concurrent.ConcurrentHashMap<Object, Object> result10 = CollectionFactory.createSyncMap();
        java.util.Set<Object> result11 = CollectionFactory.getCopyOnRequestSet(_Collection);
        java.util.Set<Object> result13 = CollectionFactory.getCopyOnRequestSetFromMutableCollection(_Collection);
    }

    @Test
    public void enforceInterfacesCommonBaseIRIMapper() {
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(CommonBaseIRIMapper.class));
    }

    public void verifyCommonBaseIRIMapper() {
        CommonBaseIRIMapper testSubject0 = new CommonBaseIRIMapper(_IRI);
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
        testSubject0.addMapping(_IRI, _String);
    }

    @Test
    public void enforceInterfacesDefaultPrefixManager() {
        assertTrue(PrefixManager.class.isAssignableFrom(DefaultPrefixManager.class));
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(DefaultPrefixManager.class));
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class.isAssignableFrom(DefaultPrefixManager.class));
    }

    public void verifyDefaultPrefixManager() {
        DefaultPrefixManager testSubject0 = new DefaultPrefixManager(_PrefixManager, _Comparator, _String);
        testSubject0.clear();
        testSubject0.unregisterNamespace(_String);
        String result0 = testSubject0.getShortForm(_OWLEntity);
        String result1 = testSubject0.getShortForm(_IRI);
        testSubject0.setPrefix(_String, _String);
        java.util.Map<String, String> result2 = testSubject0.getPrefixName2PrefixMap();
        java.util.Set<String> result3 = testSubject0.getPrefixNames();
        String result4 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result5 = testSubject0.containsPrefixMapping(_String);
        String result6 = testSubject0.getDefaultPrefix();
        String result7 = testSubject0.getPrefixIRI(_IRI);
        IRI result8 = testSubject0.getIRI(_String);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDelegatingObjectVisitorEx() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(DelegatingObjectVisitorEx.class));
    }

    public void verifyDelegatingObjectVisitorEx() {
        DelegatingObjectVisitorEx<OWLObject> testSubject0 = new DelegatingObjectVisitorEx(_OWLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesDLExpressivityChecker() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(DLExpressivityChecker.class));
    }

    public void verifyDLExpressivityChecker() {
        DLExpressivityChecker testSubject0 = new DLExpressivityChecker(_Set61);
        java.util.List<org.semanticweb.owlapi.util.DLExpressivityChecker.Construct> result0 = testSubject0.getConstructs();
        String result1 = testSubject0.getDescriptionLogicName();
    }

    public void verifyEscapeUtils() {
        String result0 = EscapeUtils.escapeString(_String);
        String result1 = EscapeUtils.unescapeString(_String);
    }

    @Test
    public void enforceInterfacesFilteringOWLOntologyChangeListener() {
        assertTrue(org.semanticweb.owlapi.util.OWLOntologyChangeFilter.class.isAssignableFrom(FilteringOWLOntologyChangeListener.class));
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(FilteringOWLOntologyChangeListener.class));
    }

    public void verifyFilteringOWLOntologyChangeListener() {
        FilteringOWLOntologyChangeListener testSubject0 = new FilteringOWLOntologyChangeListener();
        testSubject0.ontologiesChanged(_List112);
        testSubject0.processChanges(_List112);
    }

    @Test
    public void enforceInterfacesHashCode() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(HashCode.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(HashCode.class));
    }

    public void verifyHashCode() {
        HashCode testSubject0 = new HashCode();
    }

    @Test
    public void enforceInterfacesHornAxiomVisitorEx() {
        assertTrue(OWLAxiomVisitorEx.class.isAssignableFrom(HornAxiomVisitorEx.class));
    }

    public void verifyHornAxiomVisitorEx() {
        HornAxiomVisitorEx testSubject0 = new HornAxiomVisitorEx();
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
        ImportsStructureObjectSorter testSubject0 = new ImportsStructureObjectSorter(_OWLOntology, _ObjectSelector);
        java.util.Map<OWLOntology, java.util.Set<OWLObject>> result0 = testSubject0.getObjects();
    }

    public void verifyInterfaceInferredAxiomGenerator() {
        InferredAxiomGenerator testSubject0 = mock(InferredAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredClassAssertionAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredIndividualAxiomGenerator.class.isAssignableFrom(InferredClassAssertionAxiomGenerator.class));
    }

    public void verifyInferredClassAssertionAxiomGenerator() {
        InferredClassAssertionAxiomGenerator testSubject0 = new InferredClassAssertionAxiomGenerator();
        String result0 = testSubject0.getLabel();
        java.util.Set<OWLClassAssertionAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredClassAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredClassAxiomGenerator.class));
    }

    public void verifyInferredClassAxiomGenerator() {
        InferredClassAxiomGenerator<OWLClassAxiom> testSubject0 = new InferredClassAxiomGenerator() {
            @Override
            public String getLabel() {
                return null;
            }

            @Override
            protected void addAxioms(OWLEntity entity, OWLReasoner reasoner, OWLDataFactory dataFactory, Set result) {
            }
        };
        java.util.Set<OWLClassAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredDataPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredDataPropertyAxiomGenerator.class));
    }

    public void verifyInferredDataPropertyAxiomGenerator() {
        InferredDataPropertyAxiomGenerator testSubject0 = mock(InferredDataPropertyAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredDataPropertyCharacteristicAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class.isAssignableFrom(InferredDataPropertyCharacteristicAxiomGenerator.class));
    }

    public void verifyInferredDataPropertyCharacteristicAxiomGenerator() {
        InferredDataPropertyCharacteristicAxiomGenerator testSubject0 = new InferredDataPropertyCharacteristicAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLDataPropertyCharacteristicAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredDisjointClassesAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class.isAssignableFrom(InferredDisjointClassesAxiomGenerator.class));
    }

    public void verifyInferredDisjointClassesAxiomGenerator() {
        InferredDisjointClassesAxiomGenerator testSubject0 = new InferredDisjointClassesAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLDisjointClassesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEntityAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredAxiomGenerator.class.isAssignableFrom(InferredEntityAxiomGenerator.class));
    }

    public void verifyInferredEntityAxiomGenerator() {
        InferredEntityAxiomGenerator<OWLEntity, OWLAxiom> testSubject0 = mock(InferredEntityAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredEquivalentClassAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class.isAssignableFrom(InferredEquivalentClassAxiomGenerator.class));
    }

    public void verifyInferredEquivalentClassAxiomGenerator() {
        InferredEquivalentClassAxiomGenerator testSubject0 = new InferredEquivalentClassAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLEquivalentClassesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEquivalentDataPropertiesAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class.isAssignableFrom(InferredEquivalentDataPropertiesAxiomGenerator.class));
    }

    public void verifyInferredEquivalentDataPropertiesAxiomGenerator() {
        InferredEquivalentDataPropertiesAxiomGenerator testSubject0 = new InferredEquivalentDataPropertiesAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLEquivalentDataPropertiesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredEquivalentObjectPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredEquivalentObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredEquivalentObjectPropertyAxiomGenerator() {
        InferredEquivalentObjectPropertyAxiomGenerator testSubject0 = new InferredEquivalentObjectPropertyAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLEquivalentObjectPropertiesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredIndividualAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredIndividualAxiomGenerator.class));
    }

    public void verifyInferredIndividualAxiomGenerator() {
        InferredIndividualAxiomGenerator testSubject0 = mock(InferredIndividualAxiomGenerator.class);
        java.util.Set<OWLAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredInverseObjectPropertiesAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredInverseObjectPropertiesAxiomGenerator.class));
    }

    public void verifyInferredInverseObjectPropertiesAxiomGenerator() {
        InferredInverseObjectPropertiesAxiomGenerator testSubject0 = new InferredInverseObjectPropertiesAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLInverseObjectPropertiesAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredObjectPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredEntityAxiomGenerator.class.isAssignableFrom(InferredObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredObjectPropertyAxiomGenerator() {
        InferredObjectPropertyAxiomGenerator<OWLObjectPropertyAxiom> testSubject0 = mock(InferredObjectPropertyAxiomGenerator.class);
        java.util.Set<OWLObjectPropertyAxiom> result0 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
        String result1 = testSubject0.getLabel();
    }

    @Test
    public void enforceInterfacesInferredObjectPropertyCharacteristicAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredObjectPropertyCharacteristicAxiomGenerator.class));
    }

    public void verifyInferredObjectPropertyCharacteristicAxiomGenerator() {
        InferredObjectPropertyCharacteristicAxiomGenerator testSubject0 = new InferredObjectPropertyCharacteristicAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLObjectPropertyCharacteristicAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    public void verifyInferredOntologyGenerator() {
        InferredOntologyGenerator testSubject0 = new InferredOntologyGenerator(_OWLReasoner, _List115);
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
        String result0 = testSubject0.getLabel();
        Set<OWLPropertyAssertionAxiom<?, ?>> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubClassAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredClassAxiomGenerator.class.isAssignableFrom(InferredSubClassAxiomGenerator.class));
    }

    public void verifyInferredSubClassAxiomGenerator() {
        InferredSubClassAxiomGenerator testSubject0 = new InferredSubClassAxiomGenerator();
        String result0 = testSubject0.getLabel();
        java.util.Set<OWLSubClassOfAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubDataPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredDataPropertyAxiomGenerator.class.isAssignableFrom(InferredSubDataPropertyAxiomGenerator.class));
    }

    public void verifyInferredSubDataPropertyAxiomGenerator() {
        InferredSubDataPropertyAxiomGenerator testSubject0 = new InferredSubDataPropertyAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLSubDataPropertyOfAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    @Test
    public void enforceInterfacesInferredSubObjectPropertyAxiomGenerator() {
        assertTrue(org.semanticweb.owlapi.util.InferredObjectPropertyAxiomGenerator.class.isAssignableFrom(InferredSubObjectPropertyAxiomGenerator.class));
    }

    public void verifyInferredSubObjectPropertyAxiomGenerator() {
        InferredSubObjectPropertyAxiomGenerator testSubject0 = new InferredSubObjectPropertyAxiomGenerator();
        String result0 = testSubject0.getLabel();
        Set<OWLSubObjectPropertyOfAxiom> result1 = testSubject0.createAxioms(_OWLDataFactory, _OWLReasoner);
    }

    public void verifyInterfaceIRIShortFormProvider() {
        IRIShortFormProvider testSubject0 = mock(IRIShortFormProvider.class);
        String result0 = testSubject0.getShortForm(_IRI);
    }

    @Test
    public void enforceInterfacesMaximumModalDepthFinder() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(MaximumModalDepthFinder.class));
    }

    public void verifyMaximumModalDepthFinder() {
        MaximumModalDepthFinder testSubject0 = new MaximumModalDepthFinder();
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
        testSubject0.setPrefix(_String, _String);
        String result2 = testSubject0.getPrefix(_String);
        java.util.Map<String, String> result4 = testSubject0.getNamespace2PrefixMap();
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

    @Test
    public void enforceInterfacesOntologyIRIShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.IRIShortFormProvider.class.isAssignableFrom(OntologyIRIShortFormProvider.class));
    }

    public void verifyOntologyIRIShortFormProvider() {
        OntologyIRIShortFormProvider testSubject0 = new OntologyIRIShortFormProvider();
        String result0 = testSubject0.getShortForm(_OWLOntology);
        String result1 = testSubject0.getShortForm(_IRI);
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
        boolean result1 = testSubject0.pass(_OWLAxiom128, _Object129);
    }

    @Test
    public void enforceInterfacesOWLAxiomVisitorAdapter() {
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(OWLAxiomVisitorAdapter.class));
    }

    public void verifyOWLAxiomVisitorAdapter() {
        OWLAxiomVisitorAdapter testSubject0 = new OWLAxiomVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionCollector() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(OWLClassExpressionCollector.class));
    }

    public void verifyOWLClassExpressionCollector() {
        OWLClassExpressionCollector testSubject0 = new OWLClassExpressionCollector();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionVisitorAdapter() {
        assertTrue(OWLClassExpressionVisitor.class.isAssignableFrom(OWLClassExpressionVisitorAdapter.class));
    }

    public void verifyOWLClassExpressionVisitorAdapter() {
        OWLClassExpressionVisitorAdapter testSubject0 = new OWLClassExpressionVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionVisitorExAdapter() {
        assertTrue(OWLClassExpressionVisitorEx.class.isAssignableFrom(OWLClassExpressionVisitorExAdapter.class));
    }

    public void verifyOWLClassExpressionVisitorExAdapter() {
        OWLClassExpressionVisitorExAdapter testSubject1 = new OWLClassExpressionVisitorExAdapter(_Object130);
    }

    @Test
    public void enforceInterfacesOWLClassLiteralCollector() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectWalker.class.isAssignableFrom(OWLClassLiteralCollector.class));
    }

    public void verifyOWLClassLiteralCollector() {
        OWLClassLiteralCollector testSubject0 = new OWLClassLiteralCollector(_Set131);
        OWLClassLiteralCollector testSubject1 = new OWLClassLiteralCollector(_Set131, _boolean);
        java.util.Set<OWLClass> result0 = testSubject0.getPositiveLiterals();
        java.util.Set<OWLClass> result1 = testSubject0.getNegativeLiterals();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        OWLOntology result3 = testSubject0.getOntology();
        java.util.List<OWLClassExpression> result4 = testSubject0.getClassExpressionPath();
        boolean result5 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result6 = testSubject0.getDataRangePath();
        OWLAxiom result7 = testSubject0.getAxiom();
        testSubject0.walkStructure(_OWLObjectVisitorEx132);
    }

    @Test
    public void enforceInterfacesOWLEntityCollectingOntologyChangeListener() {
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(OWLEntityCollectingOntologyChangeListener.class));
    }

    public void verifyOWLEntityCollectingOntologyChangeListener() throws OWLException {
        OWLEntityCollectingOntologyChangeListener testSubject0 = new OWLEntityCollectingOntologyChangeListener() {
            @Override
            public void ontologiesChanged() throws OWLException {
            }
        };
        testSubject0.ontologiesChanged();
        testSubject0.ontologiesChanged(_List112);
        java.util.Set<OWLEntity> result0 = testSubject0.getEntities();
    }

    @Test
    public void enforceInterfacesOWLEntityCollector() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLEntityCollector.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(OWLEntityCollector.class));
    }

    public void verifyOWLEntityCollector() {
        OWLEntityCollector testSubject0 = new OWLEntityCollector(_Set135);
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
        java.util.List<RemoveAxiom> result0 = testSubject0.getChanges();
    }

    public void verifyOWLEntityRenamer() {
        OWLEntityRenamer testSubject0 = new OWLEntityRenamer(_OWLOntologyManager, _Set61);
        java.util.List<OWLOntologyChange> result0 = testSubject0.changeIRI(_Map138);
        java.util.List<OWLOntologyChange> result1 = testSubject0.changeIRI(_OWLEntity, _IRI);
        java.util.List<OWLOntologyChange> result2 = testSubject0.changeIRI(_IRI, _IRI);
    }

    public void verifyInterfaceOWLEntitySetProvider() {
        OWLEntitySetProvider testSubject0 = mock(OWLEntitySetProvider.class);
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
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges();
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
    }

    @Test
    public void enforceInterfacesOWLEntityVisitorExAdapter() {
        assertTrue(OWLEntityVisitorEx.class.isAssignableFrom(OWLEntityVisitorExAdapter.class));
    }

    @Test
    public void enforceInterfacesOWLObjectComponentCollector() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectComponentCollector.class));
    }

    public void verifyOWLObjectComponentCollector() {
        OWLObjectComponentCollector testSubject0 = new OWLObjectComponentCollector();
        java.util.Set<OWLObject> result0 = testSubject0.getComponents(_OWLObject);
        java.util.Set<OWLObject> result1 = testSubject0.getResult();
    }

    @Test
    public void enforceInterfacesOWLObjectDuplicator() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectDuplicator.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(OWLObjectDuplicator.class));
    }

    public void verifyOWLObjectDuplicator() {
        OWLObjectDuplicator testSubject0 = new OWLObjectDuplicator(_Map138, _OWLDataFactory);
        OWLObjectDuplicator testSubject1 = new OWLObjectDuplicator(_OWLDataFactory, _Map141);
        OWLObjectDuplicator testSubject2 = new OWLObjectDuplicator(_OWLDataFactory);
        OWLObject result0 = testSubject0.duplicateObject(_OWLObject);
    }

    public void verifyOWLObjectPropertyManager() {
        OWLObjectPropertyManager testSubject0 = new OWLObjectPropertyManager(_OWLOntologyManager, _OWLOntology);
        java.util.Collection<java.util.Set<OWLObjectPropertyExpression>> result0 = OWLObjectPropertyManager.getEquivalentObjectProperties(_Set61);
        java.util.Collection<java.util.Set<OWLObjectPropertyExpression>> result1 = testSubject0.getEquivalentObjectProperties();
        boolean result2 = testSubject0.isComposite(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyExpression> result3 = testSubject0.getCompositeProperties();
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLObjectPropertyExpression>> result4 = testSubject0.getPropertyHierarchy();
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLObjectPropertyExpression>> result5 = testSubject0.getHierarchyReflexiveTransitiveClosure();
        boolean result6 = testSubject0.isSubPropertyOf(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        boolean result7 = testSubject0.isNonSimple(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0.getNonSimpleProperties();
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLObjectPropertyExpression>> result9 = testSubject0.getPropertyPartialOrdering();
        boolean result10 = testSubject0.isLessThan(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLObjectPropertyManager.tarjan(_Set61, _OWLObjectPropertyExpression, _int, _Stack, _Map143, _Map143, _Set144, _Set145, _Set145);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesOWLObjectTypeIndexProvider() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectTypeIndexProvider.class));
    }

    public void verifyOWLObjectTypeIndexProvider() {
        OWLObjectTypeIndexProvider testSubject0 = new OWLObjectTypeIndexProvider();
        int result0 = testSubject0.getTypeIndex(_OWLObject);
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorAdapter() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLObjectVisitorAdapter.class));
    }

    public void verifyOWLObjectVisitorAdapter() {
        OWLObjectVisitorAdapter testSubject0 = new OWLObjectVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLObjectVisitorExAdapter() {
        assertTrue(OWLObjectVisitorEx.class.isAssignableFrom(OWLObjectVisitorExAdapter.class));
    }

    public void verifyOWLObjectVisitorExAdapter() {
        OWLObjectVisitorExAdapter<OWLObject> testSubject0 = new OWLObjectVisitorExAdapter(_Object130);
    }

    public void verifyOWLObjectWalker() {
        OWLObjectWalker testSubject0 = new OWLObjectWalker(_Set146);
        OWLObjectWalker testSubject1 = new OWLObjectWalker(_Set146, _boolean);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        OWLOntology result1 = testSubject0.getOntology();
        java.util.List<OWLClassExpression> result2 = testSubject0.getClassExpressionPath();
        boolean result3 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result4 = testSubject0.getDataRangePath();
        OWLAxiom result5 = testSubject0.getAxiom();
        testSubject0.walkStructure(_OWLObjectVisitorEx132);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeFilter() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter.class.isAssignableFrom(OWLOntologyChangeFilter.class));
        assertTrue(OWLAxiomVisitor.class.isAssignableFrom(OWLOntologyChangeFilter.class));
    }

    public void verifyOWLOntologyChangeFilter() {
        OWLOntologyChangeFilter testSubject0 = new OWLOntologyChangeFilter();
        testSubject0.processChanges(_List112);
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVisitorAdapter() {
        assertTrue(OWLOntologyChangeVisitor.class.isAssignableFrom(OWLOntologyChangeVisitorAdapter.class));
    }

    public void verifyOWLOntologyChangeVisitorAdapter() {
        OWLOntologyChangeVisitorAdapter testSubject0 = new OWLOntologyChangeVisitorAdapter();
    }

    @Test
    public void enforceInterfacesOWLOntologyChangeVisitorAdapterEx() {
        assertTrue(OWLOntologyChangeVisitorEx.class.isAssignableFrom(OWLOntologyChangeVisitorExAdapter.class));
    }

    public void verifyOWLOntologyChangeVisitorAdapterEx() {
        OWLOntologyChangeVisitorExAdapter<OWLObject> testSubject0 = new OWLOntologyChangeVisitorExAdapter(_Object130);
    }

    @Test
    public void enforceInterfacesOWLOntologyImportsClosureSetProvider() {
        assertTrue(OWLOntologySetProvider.class.isAssignableFrom(OWLOntologyImportsClosureSetProvider.class));
    }

    public void verifyOWLOntologyImportsClosureSetProvider() {
        OWLOntologyImportsClosureSetProvider testSubject0 = new OWLOntologyImportsClosureSetProvider(_OWLOntologyManager, _OWLOntology);
        java.util.Set<OWLOntology> result0 = testSubject0.getOntologies();
    }

    @Test
    public void enforceInterfacesOWLOntologyMerger() {
        assertTrue(org.semanticweb.owlapi.util.OWLAxiomFilter.class.isAssignableFrom(OWLOntologyMerger.class));
    }

    public void verifyOWLOntologyMerger() throws OWLOntologyCreationException {
        OWLOntologyMerger testSubject0 = new OWLOntologyMerger(_OWLOntologySetProvider, _OWLAxiomFilter);
        OWLOntologyMerger testSubject1 = new OWLOntologyMerger(_OWLOntologySetProvider, _boolean);
        OWLOntologyMerger testSubject2 = new OWLOntologyMerger(_OWLOntologySetProvider);
        OWLOntology result0 = testSubject0.createMergedOntology(_OWLOntologyManager, _IRI);
        boolean result1 = testSubject0.passes(_OWLAxiom);
    }

    @Test
    public void enforceInterfacesOWLOntologySingletonSetProvider() {
        assertTrue(OWLOntologySetProvider.class.isAssignableFrom(OWLOntologySingletonSetProvider.class));
    }

    public void verifyOWLOntologySingletonSetProvider() {
        OWLOntologySingletonSetProvider testSubject0 = new OWLOntologySingletonSetProvider(_OWLOntology);
        java.util.Set<OWLOntology> result0 = testSubject0.getOntologies();
    }

    public void verifyOWLOntologyURIChanger() {
        OWLOntologyIRIChanger testSubject0 = new OWLOntologyIRIChanger(_OWLOntologyManager);
        java.util.List<OWLOntologyChange> result0 = testSubject0.getChanges(_OWLOntology, _IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyWalker() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectWalker.class.isAssignableFrom(OWLOntologyWalker.class));
    }

    public void verifyOWLOntologyWalker() {
        OWLOntologyWalker testSubject0 = new OWLOntologyWalker(_Set61);
        OWLAnnotation result0 = testSubject0.getAnnotation();
        OWLOntology result1 = testSubject0.getOntology();
        java.util.List<OWLClassExpression> result2 = testSubject0.getClassExpressionPath();
        boolean result3 = testSubject0.isFirstClassExpressionInPath(_OWLClassExpression);
        java.util.List<OWLDataRange> result4 = testSubject0.getDataRangePath();
        OWLAxiom result5 = testSubject0.getAxiom();
        testSubject0.walkStructure(_OWLObjectVisitorEx132);
    }

    @Test
    public void enforceInterfacesOWLOntologyWalkerVisitor() {
        assertTrue(org.semanticweb.owlapi.util.OWLObjectVisitorExAdapter.class.isAssignableFrom(OWLOntologyWalkerVisitor.class));
    }

    public void verifyOWLOntologyWalkerVisitor() {
        OWLOntologyWalkerVisitor testSubject0 = new OWLOntologyWalkerVisitor(_OWLOntologyWalker);
        OWLAxiom result0 = testSubject0.getCurrentAxiom();
        OWLOntology result1 = testSubject0.getCurrentOntology();
        OWLAnnotation result2 = testSubject0.getCurrentAnnotation();
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
        PropertyAssertionValueShortFormProvider testSubject0 = new PropertyAssertionValueShortFormProvider(_List156, _Map157, _OWLOntologySetProvider);
        PropertyAssertionValueShortFormProvider testSubject1 = new PropertyAssertionValueShortFormProvider(_List156, _Map157, _OWLOntologySetProvider, _ShortFormProvider);
        java.util.List<OWLPropertyExpression> result0 = testSubject0.getProperties();
        String result1 = testSubject0.getShortForm(_OWLEntity);
        java.util.Map<OWLDataPropertyExpression, java.util.List<String>> result2 = testSubject0.getPreferredLanguageMap();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesQNameShortFormProvider() {
        assertTrue(org.semanticweb.owlapi.util.ShortFormProvider.class.isAssignableFrom(QNameShortFormProvider.class));
    }

    public void verifyQNameShortFormProvider() {
        QNameShortFormProvider testSubject0 = new QNameShortFormProvider();
        QNameShortFormProvider testSubject1 = new QNameShortFormProvider(_Map158);
        String result0 = testSubject0.getShortForm(_OWLEntity);
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
        String result0 = testSubject0.getShortForm(_OWLEntity);
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
        String result0 = testSubject0.getShortForm(_IRI);
    }

    @Test
    public void enforceInterfacesSimpleRenderer() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(SimpleRenderer.class));
        assertTrue(org.semanticweb.owlapi.io.OWLObjectRenderer.class.isAssignableFrom(SimpleRenderer.class));
    }

    public void verifySimpleRenderer() {
        SimpleRenderer testSubject0 = new SimpleRenderer();
        testSubject0.reset();
        String result0 = testSubject0.getShortForm(_IRI);
        String result1 = testSubject0.render(_OWLObject);
        testSubject0.setPrefix(_String, _String);
        testSubject0.setShortFormProvider(_ShortFormProvider);
        testSubject0.resetShortFormProvider();
        boolean result2 = testSubject0.isUsingDefaultShortFormProvider();
        testSubject0.setPrefixesFromOntologyFormat(_OWLOntology, _OWLOntologyManager, _boolean);
        testSubject0.writeAnnotations(_OWLAxiom);
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
        String result0 = testSubject0.getShortForm(_OWLEntity);
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
        int result1 = testSubject0.compare(_Object137, _Object137);
    }

    public void verifyStructuralTransformation() {
        StructuralTransformation testSubject0 = new StructuralTransformation(_OWLDataFactory);
        java.util.Set<OWLAxiom> result0 = testSubject0.getTransformedAxioms(_Set160);
    }

    @Test
    public void enforceInterfacesSWRLVariableExtractor() {
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(SWRLVariableExtractor.class));
    }

    public void verifySWRLVariableExtractor() {
        SWRLVariableExtractor testSubject0 = new SWRLVariableExtractor();
        // XXX testSubject0.reset();
        java.util.Set<SWRLVariable> result0 = testSubject0.getVariables();
    }

    public void verifyInterfaceSWRLVariableShortFormProvider() {
        SWRLVariableShortFormProvider testSubject0 = mock(SWRLVariableShortFormProvider.class);
        String result0 = testSubject0.getShortForm(_SWRLVariable);
    }

    public void verifyVersion() {
        Version testSubject0 = new Version(_int, _int, _int, _int);
        int result0 = testSubject0.getMajor();
        int result1 = testSubject0.getMinor();
        int result2 = testSubject0.getPatch();
        int result3 = testSubject0.getBuild();
    }

    public void verifyVersionInfo() {
        VersionInfo testSubject0 = VersionInfo.getVersionInfo();
        String result1 = testSubject0.getVersion();
        String result2 = testSubject0.getGeneratedByMessage();
    }

    @Test
    public void enforceInterfacesWeakCache() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(WeakCache.class));
    }

    public void verifyWeakCache() {
        WeakCache<Object> testSubject0 = new WeakCache<Object>();
        Object result0 = testSubject0.cache(_Object129);
        testSubject0.clear();
        boolean result1 = testSubject0.contains(_Object129);
    }

    @Test
    public void enforceInterfacesWeakIndexCache() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(WeakIndexCache.class));
    }

    public void verifyWeakIndexCache() {
        WeakIndexCache<Object, Object> testSubject0 = new WeakIndexCache<Object, Object>();
        Object result0 = testSubject0.get(_Object129);
        Object result1 = testSubject0.cache(_Object129, _Object161);
        testSubject0.clear();
        boolean result2 = testSubject0.contains(_Object129);
    }

    private Object _Object129;
    private OWLAxiom _OWLAxiom128;
    private OWLObject _Object130;
    private OWLObject[] _Object_array;
    private Object _Object161;
    private boolean _boolean;
    private char[] _char_array;
    private int _int;
    private java.io.File _File;
    private String _Object137;
    private String _String;
    private java.util.Collection<Object> _Collection;
    private StringComparator _Comparator;
    private java.util.List<? extends OWLOntologyChange> _List112;
    private java.util.List<OWLAnnotationProperty> _List;
    private java.util.List<OWLPropertyExpression> _List156;
    private java.util.List<org.semanticweb.owlapi.util.InferredAxiomGenerator<? extends OWLAxiom>> _List115;
    private java.util.Map<String, String> _Map158;
    private java.util.Map<IRI, IRI> _Map141;
    private java.util.Map<OWLAnnotationProperty, java.util.List<String>> _Map;
    private java.util.Map<OWLDataPropertyExpression, java.util.List<String>> _Map157;
    private java.util.Map<OWLEntity, IRI> _Map138;
    private java.util.Map<OWLObjectPropertyExpression, Integer> _Map143;
    private java.util.Set<OWLObject> _Set146;
    private java.util.Set<String> _Set;
    private java.util.Set<java.util.Set<OWLObjectPropertyExpression>> _Set144;
    private java.util.Set<OWLAxiom> _Set160;
    private java.util.Set<OWLEntity> _Set135;
    private java.util.Set<OWLObject> _Set131;
    private java.util.Set<OWLObjectPropertyExpression> _Set145;
    private java.util.Set<OWLOntology> _Set61;
    private java.util.Stack<OWLObjectPropertyExpression> _Stack;
    private long _long;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private IRI _IRI;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataFactory _OWLDataFactory;
    private OWLEntity _OWLEntity;
    private OWLObject _OWLObject;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLObjectVisitorEx<?> _OWLObjectVisitorEx132;
    private OWLObjectVisitorEx<OWLObject> _OWLObjectVisitorEx;
    private OWLOntology _OWLOntology;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLOntologySetProvider _OWLOntologySetProvider;
    private PrefixManager _PrefixManager;
    private SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
    private org.semanticweb.owlapi.util.IRIShortFormProvider _IRIShortFormProvider;
    private org.semanticweb.owlapi.util.ImportsStructureObjectSorter.ObjectSelector<OWLObject> _ObjectSelector;
    private org.semanticweb.owlapi.util.InferredAxiomGenerator<?> _InferredAxiomGenerator;
    private org.semanticweb.owlapi.util.OWLAxiomFilter _OWLAxiomFilter;
    private org.semanticweb.owlapi.util.OWLEntityURIConverterStrategy _OWLEntityURIConverterStrategy;
    private org.semanticweb.owlapi.util.OWLOntologyWalker _OWLOntologyWalker;
    private org.semanticweb.owlapi.util.ProgressMonitor _ProgressMonitor;
    private org.semanticweb.owlapi.util.ShortFormProvider _ShortFormProvider;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
