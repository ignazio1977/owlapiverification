package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;

import uk.ac.manchester.cs.owl.owlapi.*;

@SuppressWarnings({ "javadoc", "unused", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi {
    @Test
    public void enforceInterfacesAbstractEntityRegistrationManager() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(AbstractEntityRegistrationManager.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(AbstractEntityRegistrationManager.class));
    }

    public void verifyAbstractEntityRegistrationManager() {
        AbstractEntityRegistrationManager testSubject0 = mock(AbstractEntityRegistrationManager.class);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
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
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
    }

    @Test
    public void enforceInterfacesAbstractInMemOWLOntologyFactory() {
        assertTrue(OWLOntologyFactory.class.isAssignableFrom(AbstractInMemOWLOntologyFactory.class));
    }

    public void verifyAbstractInMemOWLOntologyFactory() throws OWLOntologyCreationException {
        AbstractInMemOWLOntologyFactory testSubject0 = mock(AbstractInMemOWLOntologyFactory.class);
        boolean result0 = testSubject0.canCreateFromDocumentIRI(_IRI);
        OWLOntology result1 = testSubject0.createOWLOntology(_OWLOntologyManager, _OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        OWLOntology result2 = testSubject0.loadOWLOntology(_OWLOntologyManager, _OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        boolean result3 = testSubject0.canLoad(_OWLOntologyDocumentSource);
    }

    @Test
    public void enforceInterfacesClassAxiomByClassPointer() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.MapPointer.class.isAssignableFrom(ClassAxiomByClassPointer.class));
    }

    public void verifyClassAxiomByClassPointer() {
        ClassAxiomByClassPointer testSubject0 = mock(ClassAxiomByClassPointer.class);
        uk.ac.manchester.cs.owl.owlapi.ClassAxiomByClassPointer result0 = testSubject0.init();
        boolean result2 = testSubject0.remove(_OWLClass, _OWLClassAxiom);
        boolean result3 = testSubject0.put(_OWLClass, _OWLClassAxiom);
        boolean result4 = testSubject0.isEmpty();
        boolean result5 = testSubject0.contains(_OWLClass, _OWLClassAxiom);
        int result6 = testSubject0.size();
        Set<OWLClass> result7 = testSubject0.keySet();
        boolean result8 = testSubject0.containsKey(_OWLClass);
        boolean result9 = testSubject0.isInitialized();
        boolean result11 = testSubject0.hasValues(_OWLClass);
        Set<OWLClassAxiom> result12 = testSubject0.getAllValues();
        Set<OWLClassAxiom> result13 = testSubject0.getValues(_OWLClass);
    }

    public void verifyInterfaceCollectionContainer() {
        CollectionContainer<OWLObject> testSubject0 = mock(CollectionContainer.class);
        testSubject0.accept(_CollectionContainerVisitor);
    }

    public void verifyInterfaceCollectionContainerVisitor() {
        CollectionContainerVisitor<OWLObject> testSubject0 = mock(CollectionContainerVisitor.class);
        testSubject0.visit(_CollectionContainer);
        testSubject0.visitItem(_OWLObject);
    }

    @Test
    public void enforceInterfacesEmptyInMemOWLOntologyFactory() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInMemOWLOntologyFactory.class.isAssignableFrom(EmptyInMemOWLOntologyFactory.class));
    }

    public void verifyEmptyInMemOWLOntologyFactory() throws OWLOntologyCreationException {
        EmptyInMemOWLOntologyFactory testSubject0 = new EmptyInMemOWLOntologyFactory(_OWLOntologyBuilder);
        OWLOntology result0 = testSubject0.createOWLOntology(_OWLOntologyManager, _OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        OWLOntology result1 = testSubject0.loadOWLOntology(_OWLOntologyManager, _OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        boolean result2 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        boolean result3 = testSubject0.canCreateFromDocumentIRI(_IRI);
    }

    public void verifyInitVisitorFactory() {
        InitVisitorFactory testSubject0 = new InitVisitorFactory();
    }

    @Test
    public void enforceInterfacesInternals() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(Internals.class));
    }

    public void verifyInternals() {
        Internals testSubject0 = new Internals();
        boolean result0 = testSubject0.isEmpty();
        boolean result1 = testSubject0.contains(_MapPointer, _Object, _OWLAxiom);
        boolean result2 = testSubject0.contains(_OWLAxiomSearchFilter, _Object);
        java.lang.Iterable<OWLImportsDeclaration> result3 = testSubject0.getImportsDeclarations(_boolean);
        java.util.Set<OWLClassAxiom> result4 = testSubject0.getGeneralClassAxioms();
        boolean result5 = testSubject0.isDeclared(_OWLEntity);
        java.util.Set<OWLAxiom> result6 = testSubject0.getAxioms();
        java.util.Set<OWLLogicalAxiom> result7 = testSubject0.getLogicalAxioms();
        boolean result8 = testSubject0.addAxiom(_OWLAxiom101);
        boolean result9 = testSubject0.removeAxiom(_OWLAxiom101);
        uk.ac.manchester.cs.owl.owlapi.MapPointer<AxiomType<?>, OWLAxiom> result10 = testSubject0.getAxiomsByType();
        boolean result11 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result12 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result13 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        boolean result14 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        boolean result15 = testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result16 = testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result17 = testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        boolean result18 = testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        int result19 = testSubject0.getAxiomCount();
        int result20 = testSubject0.getAxiomCount(_AxiomType104);
        int result21 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLAxiom> result22 = testSubject0.getReferencingAxioms(_OWLEntity);
        boolean result23 = testSubject0.containsReference(_OWLEntity);
        java.util.Collection<OWLAxiom> result24 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object);
    }

    @Test
    public void enforceInterfacesInternalsNoCache() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryInternals.class.isAssignableFrom(InternalsNoCache.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(InternalsNoCache.class));
    }

    public void verifyInternalsNoCache() {
        InternalsNoCache testSubject0 = new InternalsNoCache(_boolean);
        OWLAnnotationProperty result0 = testSubject0.getOWLAnnotationProperty(_IRI);
        testSubject0.purge();
        OWLObjectProperty result1 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result2 = testSubject0.getOWLDataProperty(_IRI);
        OWLNamedIndividual result3 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result4 = testSubject0.getOWLDatatype(_IRI);
        OWLLiteral result5 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result6 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result7 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result8 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result9 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result10 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result11 = testSubject0.getOWLLiteral(_String, _String);
        OWLDatatype result12 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result13 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result14 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result15 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result16 = testSubject0.getTopDatatype();
        OWLDatatype result17 = testSubject0.getBooleanOWLDatatype();
        OWLClass result18 = testSubject0.getOWLClass(_IRI);
    }

    @Test
    public void enforceInterfacesMapPointer() {
        assertTrue(java.io.Serializable.class.isAssignableFrom(MapPointer.class));
    }

    public void verifyMapPointer() {
        MapPointer<Object, OWLAxiom> testSubject0 = new MapPointer<Object, OWLAxiom>(_AxiomType, _OWLAxiomVisitorEx, _boolean, _Internals);
        boolean result0 = testSubject0.remove(_Object, _OWLAxiom);
        boolean result1 = testSubject0.put(_Object, _OWLAxiom);
        boolean result2 = testSubject0.isEmpty();
        boolean result3 = testSubject0.contains(_Object, _OWLAxiom);
        int result4 = testSubject0.size();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<Object, OWLAxiom> result5 = testSubject0.init();
        java.util.Set<java.lang.Object> result6 = testSubject0.keySet();
        boolean result7 = testSubject0.containsKey(_Object);
        boolean result8 = testSubject0.isInitialized();
        boolean result10 = testSubject0.hasValues(_Object);
        Set<OWLAxiom> result11 = testSubject0.getAllValues();
        Set<OWLAxiom> result12 = testSubject0.getValues(_Object);
    }

    @Test
    public void enforceInterfacesOWL2DatatypeImpl() {
        assertTrue(OWLDatatype.class.isAssignableFrom(OWL2DatatypeImpl.class));
    }

    public void verifyOWL2DatatypeImpl() {
        OWL2DatatypeImpl testSubject0 = new OWL2DatatypeImpl(_OWL2Datatype);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        boolean result3 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result4 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result5 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result6 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        boolean result8 = testSubject0.isRDFPlainLiteral();
        boolean result9 = testSubject0.isInteger();
        boolean result10 = testSubject0.isBoolean();
        boolean result11 = testSubject0.isDouble();
        boolean result12 = testSubject0.isFloat();
        OWLObjectProperty result13 = testSubject0.asOWLObjectProperty();
        OWLClass result14 = testSubject0.asOWLClass();
        IRI result15 = testSubject0.getIRI();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        boolean result26 = testSubject0.isTopDatatype();
        OWLDatatype result27 = testSubject0.asOWLDatatype();
        DataRangeType result28 = testSubject0.getDataRangeType();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result30 = testSubject0.isDatatype();
        org.semanticweb.owlapi.vocab.OWL2Datatype result31 = testSubject0.getBuiltInDatatype();
        boolean result32 = testSubject0.isString();
        EntityType<?> result33 = testSubject0.getEntityType();
        boolean result34 = testSubject0.isBuiltIn();
        boolean result35 = testSubject0.isOWLClass();
        boolean result36 = testSubject0.isOWLObjectProperty();
        boolean result37 = testSubject0.isOWLDataProperty();
        OWLDataProperty result38 = testSubject0.asOWLDataProperty();
        boolean result39 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result40 = testSubject0.asOWLNamedIndividual();
        boolean result41 = testSubject0.isOWLDatatype();
        boolean result42 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result43 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result44 = testSubject0.toStringID();
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLAnnotationAssertionAxiomImpl.class));
        assertTrue(OWLAnnotationAssertionAxiom.class.isAssignableFrom(OWLAnnotationAssertionAxiomImpl.class));
    }

    public void verifyOWLAnnotationAssertionAxiomImpl() {
        OWLAnnotationAssertionAxiomImpl testSubject0 = new OWLAnnotationAssertionAxiomImpl(_OWLAnnotationSubject, _OWLAnnotationProperty, _OWLAnnotationValue, _Collection);
        OWLObject result0 = testSubject0.getProperty();
        OWLAnnotationProperty result1 = testSubject0.getProperty();
        OWLAnnotationValue result2 = testSubject0.getValue();
        OWLAnnotation result3 = testSubject0.getAnnotation();
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLAnnotationSubject result6 = testSubject0.getSubject();
        OWLObject result7 = testSubject0.getSubject();
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        OWLAnnotationAssertionAxiom result11 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result12 = testSubject0.getAxiomWithoutAnnotations();
        OWLAnnotationAssertionAxiom result13 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result14 = testSubject0.getAnnotatedAxiom(_Set127);
        boolean result15 = testSubject0.isDeprecatedIRIAssertion();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result17 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set129);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        boolean result22 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnnotationImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAnnotationImpl.class));
        assertTrue(OWLAnnotation.class.isAssignableFrom(OWLAnnotationImpl.class));
    }

    public void verifyOWLAnnotationImpl() {
        OWLAnnotationImpl testSubject0 = new OWLAnnotationImpl(_OWLAnnotationProperty, _OWLAnnotationValue, _Set131);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getProperty();
        OWLAnnotationValue result2 = testSubject0.getValue();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        OWLObject result4 = testSubject0.accept(_OWLAnnotationObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result6 = testSubject0.isDeprecatedIRIAnnotation();
        OWLAnnotation result7 = testSubject0.getAnnotatedAnnotation(_Set);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiomImpl.class));
        assertTrue(OWLAnnotationPropertyDomainAxiom.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLAnnotationPropertyDomainAxiomImpl() {
        OWLAnnotationPropertyDomainAxiomImpl testSubject0 = new OWLAnnotationPropertyDomainAxiomImpl(_OWLAnnotationProperty, _IRI, _Collection);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getProperty();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx125);
        IRI result4 = testSubject0.getDomain();
        OWLObject result5 = testSubject0.getDomain();
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLAnnotationPropertyDomainAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLAnnotationPropertyDomainAxiom result12 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAnnotationPropertyImpl.class));
        assertTrue(OWLAnnotationProperty.class.isAssignableFrom(OWLAnnotationPropertyImpl.class));
    }

    public void verifyOWLAnnotationPropertyImpl() {
        OWLAnnotationPropertyImpl testSubject0 = new OWLAnnotationPropertyImpl(_IRI);
        boolean result0 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        boolean result4 = testSubject0.isOWLTopDataProperty();
        OWLObjectProperty result5 = testSubject0.asOWLObjectProperty();
        boolean result6 = testSubject0.isAnonymous();
        OWLClass result7 = testSubject0.asOWLClass();
        boolean result8 = testSubject0.isDataPropertyExpression();
        boolean result9 = testSubject0.isObjectPropertyExpression();
        boolean result10 = testSubject0.isOWLTopObjectProperty();
        boolean result11 = testSubject0.isOWLBottomObjectProperty();
        boolean result12 = testSubject0.isOWLBottomDataProperty();
        IRI result13 = testSubject0.getIRI();
        OWLDatatype result14 = testSubject0.asOWLDatatype();
        EntityType<?> result15 = testSubject0.getEntityType();
        boolean result16 = testSubject0.isBuiltIn();
        boolean result17 = testSubject0.isLabel();
        boolean result18 = testSubject0.isDeprecated();
        boolean result19 = testSubject0.isOWLClass();
        boolean result20 = testSubject0.isOWLObjectProperty();
        boolean result21 = testSubject0.isOWLDataProperty();
        OWLDataProperty result22 = testSubject0.asOWLDataProperty();
        boolean result23 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result24 = testSubject0.asOWLNamedIndividual();
        boolean result25 = testSubject0.isOWLDatatype();
        boolean result26 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result27 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result28 = testSubject0.toStringID();
        boolean result29 = testSubject0.isComment();
        int result31 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result32 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result33 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result34 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result35 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result36 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result37 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result38 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result39 = testSubject0.getNestedClassExpressions();
        boolean result40 = testSubject0.isTopEntity();
        boolean result41 = testSubject0.isBottomEntity();
        boolean result42 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiomImpl.class));
        assertTrue(OWLAnnotationPropertyRangeAxiom.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLAnnotationPropertyRangeAxiomImpl() {
        OWLAnnotationPropertyRangeAxiomImpl testSubject0 = new OWLAnnotationPropertyRangeAxiomImpl(_OWLAnnotationProperty, _IRI, _Collection);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getProperty();
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result4 = testSubject0.getRange();
        IRI result5 = testSubject0.getRange();
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLAnnotationPropertyRangeAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLAnnotationPropertyRangeAxiom result12 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAnonymousClassExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassExpressionImpl.class.isAssignableFrom(OWLAnonymousClassExpressionImpl.class));
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLAnonymousClassExpressionImpl.class));
    }

    public void verifyOWLAnonymousClassExpressionImpl() {
        OWLAnonymousClassExpressionImpl testSubject0 = mock(OWLAnonymousClassExpressionImpl.class);
        boolean result0 = testSubject0.isAnonymous();
        OWLClass result1 = testSubject0.asOWLClass();
        boolean result2 = testSubject0.isOWLThing();
        boolean result3 = testSubject0.isOWLNothing();
        OWLClassExpression result4 = testSubject0.getComplementNNF();
        OWLClassExpression result5 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result6 = testSubject0.asConjunctSet();
        boolean result7 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result8 = testSubject0.asDisjunctSet();
        OWLClassExpression result9 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result12 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result15 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result16 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result17 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result18 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result19 = testSubject0.getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        boolean result22 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result24 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result25 = testSubject0.getClassExpressionType();
        boolean result26 = testSubject0.isClassExpressionLiteral();
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualImpl.class.isAssignableFrom(OWLAnonymousIndividualImpl.class));
        assertTrue(OWLAnonymousIndividual.class.isAssignableFrom(OWLAnonymousIndividualImpl.class));
    }

    public void verifyOWLAnonymousIndividualImpl() {
        OWLAnonymousIndividualImpl testSubject0 = new OWLAnonymousIndividualImpl(_NodeID);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result0 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        Object result3 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        NodeID result4 = testSubject0.getID();
        boolean result5 = testSubject0.isAnonymous();
        OWLNamedIndividual result6 = testSubject0.asOWLNamedIndividual();
        java.lang.String result7 = testSubject0.toStringID();
        boolean result8 = testSubject0.isNamed();
        OWLAnonymousIndividual result9 = testSubject0.asOWLAnonymousIndividual();
        int result11 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result12 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result15 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result16 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result17 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result18 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result19 = testSubject0.getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        boolean result22 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAPIImplModule() {
        assertTrue(com.google.inject.AbstractModule.class.isAssignableFrom(OWLAPIImplModule.class));
    }

    public void verifyOWLAPIImplModule() {
        OWLAPIImplModule testSubject0 = new OWLAPIImplModule();
        testSubject0.configure(_Binder);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLAsymmetricObjectPropertyAxiomImpl.class));
        assertTrue(OWLAsymmetricObjectPropertyAxiom.class.isAssignableFrom(OWLAsymmetricObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLAsymmetricObjectPropertyAxiomImpl() {
        OWLAsymmetricObjectPropertyAxiomImpl testSubject0 = new OWLAsymmetricObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAsymmetricObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAsymmetricObjectPropertyAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLObject result7 = testSubject0.getProperty();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set129);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAxiomImpl.class));
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLAxiomImpl.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.CollectionContainer.class.isAssignableFrom(OWLAxiomImpl.class));
    }

    public void verifyOWLAxiomImpl() {
        OWLAxiomImpl testSubject0 = mock(OWLAxiomImpl.class);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result2 = testSubject0.isAnnotated();
        boolean result3 = testSubject0.isOfType(_Set129);
        boolean result4 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result5 = testSubject0.getNNF();
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result20 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result21 = testSubject0.accept(_OWLAxiomVisitorEx125);
        boolean result22 = testSubject0.isLogicalAxiom();
        boolean result23 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result24 = testSubject0.getAxiomType();
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLAxiomIndexImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAxiomIndexImpl.class));
        assertTrue(OWLAxiomIndex.class.isAssignableFrom(OWLAxiomIndexImpl.class));
    }

    public void verifyOWLAxiomIndexImpl() {
        OWLAxiomIndexImpl testSubject0 = mock(OWLAxiomIndexImpl.class);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result0 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result1 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result2 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result3 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result4 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result5 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result6 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result7 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result8 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result9 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result10 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result11 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result12 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result13 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result14 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result15 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result16 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result17 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result18 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result19 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result20 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result21 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result22 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result23 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result24 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result25 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result26 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result27 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result28 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result29 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result30 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result31 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result32 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLClassAssertionAxiom> result33 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLDataPropertyAssertionAxiom> result34 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result35 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result36 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result37 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result38 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result39 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result40 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
        int result42 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result43 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result44 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result45 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result46 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result47 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result48 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result49 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result50 = testSubject0.getNestedClassExpressions();
        boolean result51 = testSubject0.isTopEntity();
        boolean result52 = testSubject0.isBottomEntity();
        boolean result53 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result54 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        boolean result55 = testSubject0.contains(_OWLAxiomSearchFilter, _Object, _import);
        Set<OWLAxiom> result56 = testSubject0.getAxioms(_Class, _Class151, _OWLObject, _import, _ignore);
        Set<OWLAxiom> result57 = testSubject0.getAxioms(_Class, _OWLObject, _import, _ignore);
        java.util.Collection<OWLAxiom> result58 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object, _import);
    }

    @Test
    public void enforceInterfacesOWLCardinalityRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLCardinalityRestrictionImpl.class));
        assertTrue(OWLCardinalityRestriction.class.isAssignableFrom(OWLCardinalityRestrictionImpl.class));
    }

    public void verifyOWLCardinalityRestrictionImpl() {
        OWLCardinalityRestrictionImpl<OWLPropertyRange> testSubject0 = mock(OWLCardinalityRestrictionImpl.class);
        int result0 = testSubject0.getCardinality();
        OWLObject result1 = testSubject0.getFiller();
        java.lang.Object result2 = testSubject0.getFiller();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        boolean result4 = testSubject0.isAnonymous();
        OWLClass result5 = testSubject0.asOWLClass();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        int result15 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result27 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result28 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result29 = testSubject0.getClassExpressionType();
        boolean result30 = testSubject0.isObjectRestriction();
        boolean result31 = testSubject0.isDataRestriction();
        boolean result32 = testSubject0.isQualified();
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualAxiomImpl.class.isAssignableFrom(OWLClassAssertionAxiomImpl.class));
        assertTrue(OWLClassAssertionAxiom.class.isAssignableFrom(OWLClassAssertionAxiomImpl.class));
    }

    public void verifyOWLClassAssertionAxiomImpl() {
        OWLClassAssertionAxiomImpl testSubject0 = new OWLClassAssertionAxiomImpl(_OWLIndividual, _OWLClassExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLClassExpression result2 = testSubject0.getClassExpression();
        OWLIndividual result3 = testSubject0.getIndividual();
        AxiomType<?> result4 = testSubject0.getAxiomType();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassAssertionAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLClassAssertionAxiom result8 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result9 = testSubject0.asOWLSubClassOfAxiom();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set129);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLClassAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLClassAxiomImpl.class));
        assertTrue(OWLClassAxiom.class.isAssignableFrom(OWLClassAxiomImpl.class));
    }

    public void verifyOWLClassAxiomImpl() {
        OWLClassAxiomImpl testSubject0 = mock(OWLClassAxiomImpl.class);
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result4 = testSubject0.isAnnotated();
        boolean result5 = testSubject0.isOfType(_Set129);
        boolean result6 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result7 = testSubject0.getNNF();
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result23 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result24 = testSubject0.getAxiomType();
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLClassExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLClassExpressionImpl.class));
        assertTrue(OWLClassExpression.class.isAssignableFrom(OWLClassExpressionImpl.class));
    }

    public void verifyOWLClassExpressionImpl() {
        OWLClassExpressionImpl testSubject0 = mock(OWLClassExpressionImpl.class);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result14 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        boolean result15 = testSubject0.isAnonymous();
        ClassExpressionType result16 = testSubject0.getClassExpressionType();
        boolean result17 = testSubject0.isClassExpressionLiteral();
        OWLClass result18 = testSubject0.asOWLClass();
        boolean result19 = testSubject0.isOWLThing();
        boolean result20 = testSubject0.isOWLNothing();
        OWLClassExpression result21 = testSubject0.getComplementNNF();
        OWLClassExpression result22 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result23 = testSubject0.asConjunctSet();
        boolean result24 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result25 = testSubject0.asDisjunctSet();
        OWLClassExpression result26 = testSubject0.getNNF();
    }

    @Test
    public void enforceInterfacesOWLClassImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassExpressionImpl.class.isAssignableFrom(OWLClassImpl.class));
        assertTrue(OWLClass.class.isAssignableFrom(OWLClassImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLClassImpl.class));
    }

    public void verifyOWLClassImpl() {
        OWLClassImpl testSubject0 = new OWLClassImpl(_IRI);
        boolean result0 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObjectProperty result4 = testSubject0.asOWLObjectProperty();
        boolean result5 = testSubject0.isAnonymous();
        ClassExpressionType result6 = testSubject0.getClassExpressionType();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        OWLClass result8 = testSubject0.asOWLClass();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        IRI result16 = testSubject0.getIRI();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        OWLDatatype result20 = testSubject0.asOWLDatatype();
        EntityType<?> result21 = testSubject0.getEntityType();
        boolean result22 = testSubject0.isBuiltIn();
        boolean result23 = testSubject0.isOWLClass();
        boolean result24 = testSubject0.isOWLObjectProperty();
        boolean result25 = testSubject0.isOWLDataProperty();
        OWLDataProperty result26 = testSubject0.asOWLDataProperty();
        boolean result27 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result28 = testSubject0.asOWLNamedIndividual();
        boolean result29 = testSubject0.isOWLDatatype();
        boolean result30 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result31 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result32 = testSubject0.toStringID();
        int result34 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result35 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result36 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result37 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result38 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result39 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result40 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result41 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result42 = testSubject0.getNestedClassExpressions();
        boolean result43 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFromImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedDataRestrictionImpl.class.isAssignableFrom(OWLDataAllValuesFromImpl.class));
        assertTrue(OWLDataAllValuesFrom.class.isAssignableFrom(OWLDataAllValuesFromImpl.class));
    }

    public void verifyOWLDataAllValuesFromImpl() {
        OWLDataAllValuesFromImpl testSubject0 = new OWLDataAllValuesFromImpl(_OWLDataPropertyExpression, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.isObjectRestriction();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.getProperty();
        OWLDataPropertyExpression result6 = testSubject0.getProperty();
        java.lang.Object result7 = testSubject0.getFiller();
        OWLObject result8 = testSubject0.getFiller();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLThing();
        boolean result13 = testSubject0.isOWLNothing();
        OWLClassExpression result14 = testSubject0.getComplementNNF();
        OWLClassExpression result15 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result16 = testSubject0.asConjunctSet();
        boolean result17 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result18 = testSubject0.asDisjunctSet();
        OWLClassExpression result19 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataCardinalityRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataCardinalityRestrictionImpl.class));
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataCardinalityRestrictionImpl.class));
    }

    public void verifyOWLDataCardinalityRestrictionImpl() {
        OWLDataCardinalityRestrictionImpl testSubject0 = mock(OWLDataCardinalityRestrictionImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLDataPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isDataRestriction();
        int result5 = testSubject0.getCardinality();
        OWLObject result6 = testSubject0.getFiller();
        java.lang.Object result7 = testSubject0.getFiller();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isAnonymous();
        OWLClass result10 = testSubject0.asOWLClass();
        boolean result11 = testSubject0.isOWLThing();
        boolean result12 = testSubject0.isOWLNothing();
        OWLClassExpression result13 = testSubject0.getComplementNNF();
        OWLClassExpression result14 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result15 = testSubject0.asConjunctSet();
        boolean result16 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result17 = testSubject0.asDisjunctSet();
        OWLClassExpression result18 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result32 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result33 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result34 = testSubject0.getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLDataComplementOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDataComplementOfImpl.class));
        assertTrue(OWLDataComplementOf.class.isAssignableFrom(OWLDataComplementOfImpl.class));
    }

    public void verifyOWLDataComplementOfImpl() {
        OWLDataComplementOfImpl testSubject0 = new OWLDataComplementOfImpl(_OWLDataRange);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLDataRange result3 = testSubject0.getDataRange();
        boolean result4 = testSubject0.isTopDatatype();
        OWLDatatype result5 = testSubject0.asOWLDatatype();
        DataRangeType result6 = testSubject0.getDataRangeType();
        boolean result7 = testSubject0.isDatatype();
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataExactCardinalityImpl.class));
        assertTrue(OWLDataExactCardinality.class.isAssignableFrom(OWLDataExactCardinalityImpl.class));
    }

    public void verifyOWLDataExactCardinalityImpl() {
        OWLDataExactCardinalityImpl testSubject0 = new OWLDataExactCardinalityImpl(_OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLClassExpression result2 = testSubject0.asIntersectionOfMinMax();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        OWLObject result4 = testSubject0.getProperty();
        OWLDataPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isObjectRestriction();
        boolean result7 = testSubject0.isQualified();
        boolean result8 = testSubject0.isDataRestriction();
        int result9 = testSubject0.getCardinality();
        OWLObject result10 = testSubject0.getFiller();
        java.lang.Object result11 = testSubject0.getFiller();
        boolean result12 = testSubject0.isClassExpressionLiteral();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        boolean result15 = testSubject0.isOWLThing();
        boolean result16 = testSubject0.isOWLNothing();
        OWLClassExpression result17 = testSubject0.getComplementNNF();
        OWLClassExpression result18 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result19 = testSubject0.asConjunctSet();
        boolean result20 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result21 = testSubject0.asDisjunctSet();
        OWLClassExpression result22 = testSubject0.getNNF();
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataFactoryImpl() {
        assertTrue(OWLDataFactory.class.isAssignableFrom(OWLDataFactoryImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLDataFactoryImpl.class));
        assertTrue(OWLClassProvider.class.isAssignableFrom(OWLDataFactoryImpl.class));
    }

    public void verifyOWLDataFactoryImpl() {
        OWLDataFactoryImpl testSubject0 = new OWLDataFactoryImpl(_boolean, _boolean);
        OWLDataFactoryImpl testSubject1 = new OWLDataFactoryImpl();
        OWLEquivalentClassesAxiom result0 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression, _Set131);
        OWLEquivalentClassesAxiom result1 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression_array);
        OWLEquivalentClassesAxiom result2 = testSubject0.getOWLEquivalentClassesAxiom(_Set154);
        OWLEquivalentClassesAxiom result3 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLEquivalentClassesAxiom result4 = testSubject0.getOWLEquivalentClassesAxiom(_Set154, _Set131);
        OWLDisjointClassesAxiom result5 = testSubject0.getOWLDisjointClassesAxiom(_Set154, _Set131);
        OWLDisjointClassesAxiom result6 = testSubject0.getOWLDisjointClassesAxiom(_OWLClassExpression_array);
        OWLDisjointClassesAxiom result7 = testSubject0.getOWLDisjointClassesAxiom(_Set154);
        OWLAnnotationProperty result8 = testSubject0.getOWLAnnotationProperty(_String, _PrefixManager);
        OWLAnnotationProperty result9 = testSubject0.getOWLAnnotationProperty(_IRI);
        testSubject0.purge();
        OWLObjectProperty result10 = testSubject0.getOWLObjectProperty(_String, _PrefixManager);
        OWLObjectProperty result11 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result12 = testSubject0.getOWLDataProperty(_IRI);
        OWLDataProperty result13 = testSubject0.getOWLDataProperty(_String, _PrefixManager);
        OWLNamedIndividual result14 = testSubject0.getOWLNamedIndividual(_String, _PrefixManager);
        OWLNamedIndividual result15 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result16 = testSubject0.getOWLDatatype(_IRI);
        OWLDatatype result17 = testSubject0.getOWLDatatype(_String, _PrefixManager);
        OWLLiteral result18 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result19 = testSubject0.getOWLLiteral(_String, _OWL2Datatype);
        OWLLiteral result20 = testSubject0.getOWLLiteral(_String, _String);
        OWLLiteral result21 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result22 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result23 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result24 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result25 = testSubject0.getOWLLiteral(_String);
        OWLDatatype result26 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result27 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result28 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result29 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result30 = testSubject0.getTopDatatype();
        OWLDatatype result31 = testSubject0.getBooleanOWLDatatype();
        OWLClass result32 = testSubject0.getOWLClass(_String, _PrefixManager);
        OWLClass result33 = testSubject0.getOWLClass(_IRI);
        OWLClass result34 = testSubject0.getOWLThing();
        OWLDataProperty result35 = testSubject0.getOWLTopDataProperty();
        OWLClass result36 = testSubject0.getOWLNothing();
        OWLObjectProperty result37 = testSubject0.getOWLTopObjectProperty();
        OWLObjectProperty result38 = testSubject0.getOWLBottomObjectProperty();
        OWLDataProperty result39 = testSubject0.getOWLBottomDataProperty();
        OWLObjectInverseOf result40 = testSubject0.getOWLObjectInverseOf(_OWLObjectPropertyExpression);
        OWLAnnotationProperty result41 = testSubject0.getRDFSLabel();
        OWLAnnotationProperty result42 = testSubject0.getRDFSComment();
        OWLAnnotationProperty result43 = testSubject0.getRDFSSeeAlso();
        OWLAnnotationProperty result44 = testSubject0.getRDFSIsDefinedBy();
        OWLAnnotationProperty result45 = testSubject0.getOWLVersionInfo();
        OWLAnnotationProperty result46 = testSubject0.getOWLBackwardCompatibleWith();
        OWLAnnotationProperty result47 = testSubject0.getOWLIncompatibleWith();
        OWLAnnotationProperty result48 = testSubject0.getOWLDeprecated();
        OWLDataOneOf result49 = testSubject0.getOWLDataOneOf(_OWLLiteral_array);
        OWLDataOneOf result50 = testSubject0.getOWLDataOneOf(_Set157);
        OWLDataComplementOf result51 = testSubject0.getOWLDataComplementOf(_OWLDataRange);
        OWLDatatypeRestriction result52 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _Set158);
        OWLDatatypeRestriction result53 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacet, _OWLLiteral);
        OWLDatatypeRestriction result54 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        OWLDatatypeRestriction result55 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_int);
        OWLDatatypeRestriction result56 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_double);
        OWLDatatypeRestriction result57 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_int);
        OWLDatatypeRestriction result58 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_double);
        OWLDatatypeRestriction result59 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_int, _int);
        OWLDatatypeRestriction result60 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_double, _double);
        OWLDatatypeRestriction result61 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_double);
        OWLDatatypeRestriction result62 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_int);
        OWLDatatypeRestriction result63 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_int);
        OWLDatatypeRestriction result64 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_double);
        OWLDatatypeRestriction result65 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_int, _int);
        OWLDatatypeRestriction result66 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_double, _double);
        OWLFacetRestriction result67 = testSubject0.getOWLFacetRestriction(_OWLFacet, _OWLLiteral);
        OWLFacetRestriction result68 = testSubject0.getOWLFacetRestriction(_OWLFacet, _float);
        OWLFacetRestriction result69 = testSubject0.getOWLFacetRestriction(_OWLFacet, _int);
        OWLFacetRestriction result70 = testSubject0.getOWLFacetRestriction(_OWLFacet, _double);
        OWLDataUnionOf result71 = testSubject0.getOWLDataUnionOf(_Set161);
        OWLDataUnionOf result72 = testSubject0.getOWLDataUnionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result73 = testSubject0.getOWLDataIntersectionOf(_Set161);
        OWLDataIntersectionOf result74 = testSubject0.getOWLDataIntersectionOf(_OWLDataRange_array);
        OWLObjectIntersectionOf result75 = testSubject0.getOWLObjectIntersectionOf(_OWLClassExpression_array);
        OWLObjectIntersectionOf result76 = testSubject0.getOWLObjectIntersectionOf(_Set154);
        OWLDataSomeValuesFrom result77 = testSubject0.getOWLDataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataAllValuesFrom result78 = testSubject0.getOWLDataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result79 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result80 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMaxCardinality result81 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMaxCardinality result82 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result83 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result84 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression);
        OWLDataHasValue result85 = testSubject0.getOWLDataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObjectComplementOf result86 = testSubject0.getOWLObjectComplementOf(_OWLClassExpression);
        OWLObjectOneOf result87 = testSubject0.getOWLObjectOneOf(_Set163);
        OWLObjectOneOf result88 = testSubject0.getOWLObjectOneOf(_OWLIndividual_array);
        OWLObjectAllValuesFrom result89 = testSubject0.getOWLObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectSomeValuesFrom result90 = testSubject0.getOWLObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result91 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result92 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMinCardinality result93 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMinCardinality result94 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result95 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result96 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectHasSelf result97 = testSubject0.getOWLObjectHasSelf(_OWLObjectPropertyExpression);
        OWLObjectHasValue result98 = testSubject0.getOWLObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObjectUnionOf result99 = testSubject0.getOWLObjectUnionOf(_OWLClassExpression_array);
        OWLObjectUnionOf result100 = testSubject0.getOWLObjectUnionOf(_Set154);
        OWLDeclarationAxiom result101 = testSubject0.getOWLDeclarationAxiom(_OWLEntity);
        OWLDeclarationAxiom result102 = testSubject0.getOWLDeclarationAxiom(_OWLEntity, _Set131);
        OWLSubClassOfAxiom result103 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression, _Set131);
        OWLSubClassOfAxiom result104 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLDisjointUnionAxiom result105 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set154);
        OWLDisjointUnionAxiom result106 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set154, _Set131);
        OWLSubObjectPropertyOfAxiom result107 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLSubObjectPropertyOfAxiom result108 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set131);
        OWLSubPropertyChainOfAxiom result109 = testSubject0.getOWLSubPropertyChainOfAxiom(_List, _OWLObjectPropertyExpression);
        OWLSubPropertyChainOfAxiom result110 = testSubject0.getOWLSubPropertyChainOfAxiom(_List, _OWLObjectPropertyExpression, _Set131);
        OWLEquivalentObjectPropertiesAxiom result111 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set166);
        OWLEquivalentObjectPropertiesAxiom result112 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLEquivalentObjectPropertiesAxiom result113 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLEquivalentObjectPropertiesAxiom result114 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set131);
        OWLEquivalentObjectPropertiesAxiom result115 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set166, _Set131);
        OWLDisjointObjectPropertiesAxiom result116 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set166, _Set131);
        OWLDisjointObjectPropertiesAxiom result117 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result118 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set166);
        OWLInverseObjectPropertiesAxiom result119 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set131);
        OWLInverseObjectPropertiesAxiom result120 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLObjectPropertyDomainAxiom result121 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set131);
        OWLObjectPropertyDomainAxiom result122 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result123 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set131);
        OWLObjectPropertyRangeAxiom result124 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLFunctionalObjectPropertyAxiom result125 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLFunctionalObjectPropertyAxiom result126 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result127 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLInverseFunctionalObjectPropertyAxiom result128 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLReflexiveObjectPropertyAxiom result129 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLReflexiveObjectPropertyAxiom result130 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLIrreflexiveObjectPropertyAxiom result131 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLIrreflexiveObjectPropertyAxiom result132 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLSymmetricObjectPropertyAxiom result133 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLSymmetricObjectPropertyAxiom result134 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result135 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result136 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLTransitiveObjectPropertyAxiom result137 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLTransitiveObjectPropertyAxiom result138 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set131);
        OWLSubDataPropertyOfAxiom result139 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set131);
        OWLSubDataPropertyOfAxiom result140 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result141 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result142 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set168, _Set131);
        OWLEquivalentDataPropertiesAxiom result143 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set131);
        OWLEquivalentDataPropertiesAxiom result144 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLEquivalentDataPropertiesAxiom result145 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set168);
        OWLDisjointDataPropertiesAxiom result146 = testSubject0.getOWLDisjointDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLDisjointDataPropertiesAxiom result147 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set168);
        OWLDisjointDataPropertiesAxiom result148 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set168, _Set131);
        OWLDataPropertyDomainAxiom result149 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression);
        OWLDataPropertyDomainAxiom result150 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression, _Set131);
        OWLDataPropertyRangeAxiom result151 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataPropertyRangeAxiom result152 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange, _Set131);
        OWLFunctionalDataPropertyAxiom result153 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression);
        OWLFunctionalDataPropertyAxiom result154 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression, _Set131);
        OWLHasKeyAxiom result155 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _OWLPropertyExpression_array);
        OWLHasKeyAxiom result156 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set171, _Set131);
        OWLHasKeyAxiom result157 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set171);
        OWLDatatypeDefinitionAxiom result158 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange);
        OWLDatatypeDefinitionAxiom result159 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange, _Set131);
        OWLSameIndividualAxiom result160 = testSubject0.getOWLSameIndividualAxiom(_OWLIndividual_array);
        OWLSameIndividualAxiom result161 = testSubject0.getOWLSameIndividualAxiom(_Set163);
        OWLSameIndividualAxiom result162 = testSubject0.getOWLSameIndividualAxiom(_Set163, _Set131);
        OWLDifferentIndividualsAxiom result163 = testSubject0.getOWLDifferentIndividualsAxiom(_Set163);
        OWLDifferentIndividualsAxiom result164 = testSubject0.getOWLDifferentIndividualsAxiom(_Set163, _Set131);
        OWLDifferentIndividualsAxiom result165 = testSubject0.getOWLDifferentIndividualsAxiom(_OWLIndividual_array);
        OWLClassAssertionAxiom result166 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual);
        OWLClassAssertionAxiom result167 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual, _Set131);
        OWLObjectPropertyAssertionAxiom result168 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLObjectPropertyAssertionAxiom result169 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual, _Set131);
        OWLNegativeObjectPropertyAssertionAxiom result170 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual,
                _Set131);
        OWLNegativeObjectPropertyAssertionAxiom result171 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLDataPropertyAssertionAxiom result172 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLDataPropertyAssertionAxiom result173 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _boolean);
        OWLDataPropertyAssertionAxiom result174 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _String);
        OWLDataPropertyAssertionAxiom result175 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set131);
        OWLDataPropertyAssertionAxiom result176 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _int);
        OWLDataPropertyAssertionAxiom result177 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _double);
        OWLDataPropertyAssertionAxiom result178 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _float);
        OWLNegativeDataPropertyAssertionAxiom result179 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set131);
        OWLNegativeDataPropertyAssertionAxiom result180 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLAnnotation result181 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        OWLAnnotation result182 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue, _Set131);
        OWLAnnotationAssertionAxiom result183 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue, _Set131);
        OWLAnnotationAssertionAxiom result184 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue);
        OWLAnnotationAssertionAxiom result185 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation, _Set131);
        OWLAnnotationAssertionAxiom result186 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation);
        OWLAnnotationAssertionAxiom result187 = testSubject0.getDeprecatedOWLAnnotationAssertionAxiom(_IRI);
        OWLImportsDeclaration result188 = testSubject0.getOWLImportsDeclaration(_IRI);
        OWLAnnotationPropertyDomainAxiom result189 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI, _Set131);
        OWLAnnotationPropertyDomainAxiom result190 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyRangeAxiom result191 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI, _Set131);
        OWLAnnotationPropertyRangeAxiom result192 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI);
        OWLSubAnnotationPropertyOfAxiom result193 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty, _Set131);
        OWLSubAnnotationPropertyOfAxiom result194 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty);
        SWRLRule result195 = testSubject0.getSWRLRule(_Set172, _Set172, _Set);
        SWRLRule result196 = testSubject0.getSWRLRule(_Set172, _Set172);
        SWRLClassAtom result197 = testSubject0.getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        SWRLDataRangeAtom result198 = testSubject0.getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        SWRLObjectPropertyAtom result199 = testSubject0.getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        SWRLDataPropertyAtom result200 = testSubject0.getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        SWRLBuiltInAtom result201 = testSubject0.getSWRLBuiltInAtom(_IRI, _List175);
        SWRLVariable result202 = testSubject0.getSWRLVariable(_IRI);
        SWRLIndividualArgument result203 = testSubject0.getSWRLIndividualArgument(_OWLIndividual);
        SWRLLiteralArgument result204 = testSubject0.getSWRLLiteralArgument(_OWLLiteral);
        SWRLSameIndividualAtom result205 = testSubject0.getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        SWRLDifferentIndividualsAtom result206 = testSubject0.getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
        OWLAnonymousIndividual result207 = testSubject0.getOWLAnonymousIndividual(_String);
        OWLAnonymousIndividual result208 = testSubject0.getOWLAnonymousIndividual();
        OWLEntity result209 = testSubject0.getOWLEntity(_EntityType, _IRI);
    }

    public void verifyInterfaceOWLDataFactoryInternals() {
        OWLDataFactoryInternals testSubject0 = mock(OWLDataFactoryInternals.class);
        OWLAnnotationProperty result0 = testSubject0.getOWLAnnotationProperty(_IRI);
        testSubject0.purge();
        OWLObjectProperty result1 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result2 = testSubject0.getOWLDataProperty(_IRI);
        OWLNamedIndividual result3 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result4 = testSubject0.getOWLDatatype(_IRI);
        OWLLiteral result5 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result6 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result7 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result8 = testSubject0.getOWLLiteral(_String, _String);
        OWLLiteral result9 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result10 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result11 = testSubject0.getOWLLiteral(_double);
        OWLDatatype result12 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result13 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result14 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result15 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result16 = testSubject0.getTopDatatype();
        OWLDatatype result17 = testSubject0.getBooleanOWLDatatype();
        OWLClass result18 = testSubject0.getOWLClass(_IRI);
    }

    @Test
    public void enforceInterfacesOWLDataFactoryInternalsImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.InternalsNoCache.class.isAssignableFrom(OWLDataFactoryInternalsImpl.class));
    }

    public void verifyOWLDataFactoryInternalsImpl() {
        OWLDataFactoryInternalsImpl testSubject0 = new OWLDataFactoryInternalsImpl(_boolean);
        OWLAnnotationProperty result0 = testSubject0.getOWLAnnotationProperty(_IRI);
        testSubject0.purge();
        OWLObjectProperty result1 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result2 = testSubject0.getOWLDataProperty(_IRI);
        OWLNamedIndividual result3 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result4 = testSubject0.getOWLDatatype(_IRI);
        OWLLiteral result5 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result6 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result7 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result8 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result9 = testSubject0.getOWLLiteral(_double);
        OWLClass result10 = testSubject0.getOWLClass(_IRI);
        OWLLiteral result11 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result12 = testSubject0.getOWLLiteral(_String, _String);
        OWLDatatype result13 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result14 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result15 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result16 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result17 = testSubject0.getTopDatatype();
        OWLDatatype result18 = testSubject0.getBooleanOWLDatatype();
    }

    @Test
    public void enforceInterfacesOWLDataHasValueImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLValueRestrictionImpl.class.isAssignableFrom(OWLDataHasValueImpl.class));
        assertTrue(OWLDataHasValue.class.isAssignableFrom(OWLDataHasValueImpl.class));
        assertTrue(OWLDataRestriction.class.isAssignableFrom(OWLDataHasValueImpl.class));
    }

    public void verifyOWLDataHasValueImpl() {
        OWLDataHasValueImpl testSubject0 = new OWLDataHasValueImpl(_OWLDataPropertyExpression, _OWLLiteral);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getProperty();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isObjectRestriction();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isDataRestriction();
        OWLClassExpression result7 = testSubject0.asSomeValuesFrom();
        java.lang.Object result8 = testSubject0.getFiller();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLThing();
        boolean result13 = testSubject0.isOWLNothing();
        OWLClassExpression result14 = testSubject0.getComplementNNF();
        OWLClassExpression result15 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result16 = testSubject0.asConjunctSet();
        boolean result17 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result18 = testSubject0.asDisjunctSet();
        OWLClassExpression result19 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryDataRangeImpl.class.isAssignableFrom(OWLDataIntersectionOfImpl.class));
        assertTrue(OWLDataIntersectionOf.class.isAssignableFrom(OWLDataIntersectionOfImpl.class));
    }

    public void verifyOWLDataIntersectionOfImpl() {
        OWLDataIntersectionOfImpl testSubject0 = new OWLDataIntersectionOfImpl(_Set161);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        DataRangeType result3 = testSubject0.getDataRangeType();
        java.util.Set<OWLDataRange> result4 = testSubject0.getOperands();
        boolean result5 = testSubject0.isTopDatatype();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        boolean result7 = testSubject0.isDatatype();
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataMaxCardinalityImpl.class));
        assertTrue(OWLDataMaxCardinality.class.isAssignableFrom(OWLDataMaxCardinalityImpl.class));
    }

    public void verifyOWLDataMaxCardinalityImpl() {
        OWLDataMaxCardinalityImpl testSubject0 = new OWLDataMaxCardinalityImpl(_OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        OWLObject result3 = testSubject0.getProperty();
        OWLDataPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isQualified();
        boolean result7 = testSubject0.isDataRestriction();
        int result8 = testSubject0.getCardinality();
        OWLObject result9 = testSubject0.getFiller();
        java.lang.Object result10 = testSubject0.getFiller();
        boolean result11 = testSubject0.isClassExpressionLiteral();
        boolean result12 = testSubject0.isAnonymous();
        OWLClass result13 = testSubject0.asOWLClass();
        boolean result14 = testSubject0.isOWLThing();
        boolean result15 = testSubject0.isOWLNothing();
        OWLClassExpression result16 = testSubject0.getComplementNNF();
        OWLClassExpression result17 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result18 = testSubject0.asConjunctSet();
        boolean result19 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result20 = testSubject0.asDisjunctSet();
        OWLClassExpression result21 = testSubject0.getNNF();
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataMinCardinalityImpl.class));
        assertTrue(OWLDataMinCardinality.class.isAssignableFrom(OWLDataMinCardinalityImpl.class));
    }

    public void verifyOWLDataMinCardinalityImpl() {
        OWLDataMinCardinalityImpl testSubject0 = new OWLDataMinCardinalityImpl(_OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        OWLObject result3 = testSubject0.getProperty();
        OWLDataPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isQualified();
        boolean result7 = testSubject0.isDataRestriction();
        int result8 = testSubject0.getCardinality();
        OWLObject result9 = testSubject0.getFiller();
        java.lang.Object result10 = testSubject0.getFiller();
        boolean result11 = testSubject0.isClassExpressionLiteral();
        boolean result12 = testSubject0.isAnonymous();
        OWLClass result13 = testSubject0.asOWLClass();
        boolean result14 = testSubject0.isOWLThing();
        boolean result15 = testSubject0.isOWLNothing();
        OWLClassExpression result16 = testSubject0.getComplementNNF();
        OWLClassExpression result17 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result18 = testSubject0.asConjunctSet();
        boolean result19 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result20 = testSubject0.asDisjunctSet();
        OWLClassExpression result21 = testSubject0.getNNF();
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataOneOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDataOneOfImpl.class));
        assertTrue(OWLDataOneOf.class.isAssignableFrom(OWLDataOneOfImpl.class));
    }

    public void verifyOWLDataOneOfImpl() {
        OWLDataOneOfImpl testSubject0 = new OWLDataOneOfImpl(_Set157);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        java.util.Set<OWLLiteral> result3 = testSubject0.getValues();
        boolean result4 = testSubject0.isTopDatatype();
        OWLDatatype result5 = testSubject0.asOWLDatatype();
        DataRangeType result6 = testSubject0.getDataRangeType();
        boolean result7 = testSubject0.isDatatype();
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLDataPropertyAssertionAxiomImpl.class));
        assertTrue(OWLDataPropertyAssertionAxiom.class.isAssignableFrom(OWLDataPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLDataPropertyAssertionAxiomImpl() {
        OWLDataPropertyAssertionAxiomImpl testSubject0 = new OWLDataPropertyAssertionAxiomImpl(_OWLIndividual, _OWLDataPropertyExpression, _OWLLiteral, _Set131);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyAssertionAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyAssertionAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result8 = testSubject0.getProperty();
        java.lang.Object result9 = testSubject0.getProperty();
        OWLObject result10 = testSubject0.getObject();
        java.lang.Object result11 = testSubject0.getObject();
        OWLObject result12 = testSubject0.getSubject();
        OWLIndividual result13 = testSubject0.getSubject();
        boolean result14 = testSubject0.isLogicalAxiom();
        boolean result15 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result17 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set129);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        boolean result22 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyCharacteristicAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiomImpl.class));
        assertTrue(OWLDataPropertyCharacteristicAxiom.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiomImpl.class));
    }

    public void verifyOWLDataPropertyCharacteristicAxiomImpl() {
        OWLDataPropertyCharacteristicAxiomImpl testSubject0 = mock(OWLDataPropertyCharacteristicAxiomImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        OWLDataPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set129);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result26 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        OWLAxiom result28 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result29 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyDomainAxiomImpl.class.isAssignableFrom(OWLDataPropertyDomainAxiomImpl.class));
        assertTrue(OWLDataPropertyDomainAxiom.class.isAssignableFrom(OWLDataPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLDataPropertyDomainAxiomImpl() {
        OWLDataPropertyDomainAxiomImpl testSubject0 = new OWLDataPropertyDomainAxiomImpl(_OWLDataPropertyExpression, _OWLClassExpression, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyDomainAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result6 = testSubject0.asOWLSubClassOfAxiom();
        OWLClassExpression result7 = testSubject0.getDomain();
        OWLObject result8 = testSubject0.getDomain();
        OWLObject result9 = testSubject0.getProperty();
        java.lang.Object result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyExpressionImpl.class.isAssignableFrom(OWLDataPropertyImpl.class));
        assertTrue(OWLDataProperty.class.isAssignableFrom(OWLDataPropertyImpl.class));
    }

    public void verifyOWLDataPropertyImpl() {
        OWLDataPropertyImpl testSubject0 = new OWLDataPropertyImpl(_IRI);
        boolean result0 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLEntityVisitorEx);
        boolean result4 = testSubject0.isOWLTopDataProperty();
        OWLObjectProperty result5 = testSubject0.asOWLObjectProperty();
        boolean result6 = testSubject0.isAnonymous();
        OWLClass result7 = testSubject0.asOWLClass();
        boolean result8 = testSubject0.isDataPropertyExpression();
        boolean result9 = testSubject0.isObjectPropertyExpression();
        boolean result10 = testSubject0.isOWLTopObjectProperty();
        boolean result11 = testSubject0.isOWLBottomObjectProperty();
        boolean result12 = testSubject0.isOWLBottomDataProperty();
        IRI result13 = testSubject0.getIRI();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        OWLDatatype result16 = testSubject0.asOWLDatatype();
        EntityType<?> result17 = testSubject0.getEntityType();
        boolean result18 = testSubject0.isBuiltIn();
        boolean result19 = testSubject0.isOWLClass();
        boolean result20 = testSubject0.isOWLObjectProperty();
        boolean result21 = testSubject0.isOWLDataProperty();
        OWLDataProperty result22 = testSubject0.asOWLDataProperty();
        boolean result23 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result24 = testSubject0.asOWLNamedIndividual();
        boolean result25 = testSubject0.isOWLDatatype();
        boolean result26 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result27 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result28 = testSubject0.toStringID();
        int result30 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result31 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result32 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result33 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result34 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result35 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result36 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result37 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result38 = testSubject0.getNestedClassExpressions();
        boolean result39 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyRangeAxiomImpl.class.isAssignableFrom(OWLDataPropertyRangeAxiomImpl.class));
        assertTrue(OWLDataPropertyRangeAxiom.class.isAssignableFrom(OWLDataPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLDataPropertyRangeAxiomImpl() {
        OWLDataPropertyRangeAxiomImpl testSubject0 = new OWLDataPropertyRangeAxiomImpl(_OWLDataPropertyExpression, _OWLDataRange, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyRangeAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result6 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result7 = testSubject0.getRange();
        OWLObject result8 = testSubject0.getRange();
        OWLObject result9 = testSubject0.getProperty();
        java.lang.Object result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFromImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedDataRestrictionImpl.class.isAssignableFrom(OWLDataSomeValuesFromImpl.class));
        assertTrue(OWLDataSomeValuesFrom.class.isAssignableFrom(OWLDataSomeValuesFromImpl.class));
    }

    public void verifyOWLDataSomeValuesFromImpl() {
        OWLDataSomeValuesFromImpl testSubject0 = new OWLDataSomeValuesFromImpl(_OWLDataPropertyExpression, _OWLDataRange);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.isObjectRestriction();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.getProperty();
        OWLDataPropertyExpression result6 = testSubject0.getProperty();
        java.lang.Object result7 = testSubject0.getFiller();
        OWLObject result8 = testSubject0.getFiller();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLThing();
        boolean result13 = testSubject0.isOWLNothing();
        OWLClassExpression result14 = testSubject0.getComplementNNF();
        OWLClassExpression result15 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result16 = testSubject0.asConjunctSet();
        boolean result17 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result18 = testSubject0.asDisjunctSet();
        OWLClassExpression result19 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLDatatypeDefinitionAxiomImpl.class));
        assertTrue(OWLDatatypeDefinitionAxiom.class.isAssignableFrom(OWLDatatypeDefinitionAxiomImpl.class));
    }

    public void verifyOWLDatatypeDefinitionAxiomImpl() {
        OWLDatatypeDefinitionAxiomImpl testSubject0 = new OWLDatatypeDefinitionAxiomImpl(_OWLDatatype, _OWLDataRange, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLDataRange result2 = testSubject0.getDataRange();
        OWLDatatype result3 = testSubject0.getDatatype();
        boolean result4 = testSubject0.isLogicalAxiom();
        boolean result5 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLDatatypeDefinitionAxiom result9 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<OWLAnnotation> result10 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result12 = testSubject0.isAnnotated();
        boolean result13 = testSubject0.isOfType(_Set129);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDatatypeImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDatatypeImpl.class));
        assertTrue(OWLDatatype.class.isAssignableFrom(OWLDatatypeImpl.class));
    }

    public void verifyOWLDatatypeImpl() {
        OWLDatatypeImpl testSubject0 = new OWLDatatypeImpl(_IRI);
        boolean result0 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result5 = testSubject0.isRDFPlainLiteral();
        boolean result6 = testSubject0.isInteger();
        boolean result7 = testSubject0.isBoolean();
        boolean result8 = testSubject0.isDouble();
        boolean result9 = testSubject0.isFloat();
        OWLObjectProperty result10 = testSubject0.asOWLObjectProperty();
        OWLClass result11 = testSubject0.asOWLClass();
        IRI result12 = testSubject0.getIRI();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.isTopDatatype();
        OWLDatatype result16 = testSubject0.asOWLDatatype();
        DataRangeType result17 = testSubject0.getDataRangeType();
        boolean result18 = testSubject0.isDatatype();
        org.semanticweb.owlapi.vocab.OWL2Datatype result19 = testSubject0.getBuiltInDatatype();
        boolean result20 = testSubject0.isString();
        EntityType<?> result21 = testSubject0.getEntityType();
        boolean result22 = testSubject0.isBuiltIn();
        boolean result23 = testSubject0.isOWLClass();
        boolean result24 = testSubject0.isOWLObjectProperty();
        boolean result25 = testSubject0.isOWLDataProperty();
        OWLDataProperty result26 = testSubject0.asOWLDataProperty();
        boolean result27 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result28 = testSubject0.asOWLNamedIndividual();
        boolean result29 = testSubject0.isOWLDatatype();
        boolean result30 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result31 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result32 = testSubject0.toStringID();
        int result34 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result35 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result36 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result37 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result38 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result39 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result40 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result41 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result42 = testSubject0.getNestedClassExpressions();
        boolean result43 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDatatypeRestrictionImpl.class));
        assertTrue(OWLDatatypeRestriction.class.isAssignableFrom(OWLDatatypeRestrictionImpl.class));
    }

    public void verifyOWLDatatypeRestrictionImpl() {
        OWLDatatypeRestrictionImpl testSubject0 = new OWLDatatypeRestrictionImpl(_OWLDatatype, _Set158);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLDatatype result3 = testSubject0.getDatatype();
        java.util.Set<OWLFacetRestriction> result4 = testSubject0.getFacetRestrictions();
        boolean result5 = testSubject0.isTopDatatype();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        DataRangeType result7 = testSubject0.getDataRangeType();
        boolean result8 = testSubject0.isDatatype();
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDataUnionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryDataRangeImpl.class.isAssignableFrom(OWLDataUnionOfImpl.class));
        assertTrue(OWLDataUnionOf.class.isAssignableFrom(OWLDataUnionOfImpl.class));
    }

    public void verifyOWLDataUnionOfImpl() {
        OWLDataUnionOfImpl testSubject0 = new OWLDataUnionOfImpl(_Set161);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        DataRangeType result3 = testSubject0.getDataRangeType();
        java.util.Set<OWLDataRange> result4 = testSubject0.getOperands();
        boolean result5 = testSubject0.isTopDatatype();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        boolean result7 = testSubject0.isDatatype();
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDeclarationAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLDeclarationAxiomImpl.class));
        assertTrue(OWLDeclarationAxiom.class.isAssignableFrom(OWLDeclarationAxiomImpl.class));
    }

    public void verifyOWLDeclarationAxiomImpl() {
        OWLDeclarationAxiomImpl testSubject0 = new OWLDeclarationAxiomImpl(_OWLEntity, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLEntity result2 = testSubject0.getEntity();
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result5 = testSubject0.getAxiomType();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLDeclarationAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLDeclarationAxiom result9 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<OWLAnnotation> result10 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result12 = testSubject0.isAnnotated();
        boolean result13 = testSubject0.isOfType(_Set129);
        boolean result14 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryIndividualAxiomImpl.class.isAssignableFrom(OWLDifferentIndividualsAxiomImpl.class));
        assertTrue(OWLDifferentIndividualsAxiom.class.isAssignableFrom(OWLDifferentIndividualsAxiomImpl.class));
    }

    public void verifyOWLDifferentIndividualsAxiomImpl() {
        OWLDifferentIndividualsAxiomImpl testSubject0 = new OWLDifferentIndividualsAxiomImpl(_Set163, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        java.util.Set<OWLDifferentIndividualsAxiom> result2 = testSubject0.asPairwiseAxioms();
        boolean result3 = testSubject0.containsAnonymousIndividuals();
        java.util.Set<OWLSubClassOfAxiom> result4 = testSubject0.asOWLSubClassOfAxioms();
        AxiomType<?> result5 = testSubject0.getAxiomType();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLDifferentIndividualsAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLDifferentIndividualsAxiom result9 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.List<OWLIndividual> result10 = testSubject0.getIndividualsAsList();
        java.util.Collection<java.lang.Object> result11 = testSubject0.walkPairwise(_OWLPairwiseVisitor);
        java.util.Set<OWLIndividual> result12 = testSubject0.getIndividuals();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set129);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        boolean result21 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryClassAxiomImpl.class.isAssignableFrom(OWLDisjointClassesAxiomImpl.class));
        assertTrue(OWLDisjointClassesAxiom.class.isAssignableFrom(OWLDisjointClassesAxiomImpl.class));
    }

    public void verifyOWLDisjointClassesAxiomImpl() {
        OWLDisjointClassesAxiomImpl testSubject0 = new OWLDisjointClassesAxiomImpl(_Set154, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<OWLDisjointClassesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result3 = testSubject0.asOWLSubClassOfAxioms();
        AxiomType<?> result4 = testSubject0.getAxiomType();
        OWLDisjointClassesAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLDisjointClassesAxiom result8 = testSubject0.getAnnotatedAxiom(_Set);
        boolean result9 = testSubject0.contains(_OWLClassExpression);
        java.util.Collection<java.lang.Object> result10 = testSubject0.walkPairwise(_OWLPairwiseVisitor178);
        java.util.List<OWLClassExpression> result11 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<OWLClassExpression> result13 = testSubject0.getClassExpressions();
        boolean result14 = testSubject0.isLogicalAxiom();
        boolean result15 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result17 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set129);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        boolean result22 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLDisjointDataPropertiesAxiomImpl.class));
        assertTrue(OWLDisjointDataPropertiesAxiom.class.isAssignableFrom(OWLDisjointDataPropertiesAxiomImpl.class));
    }

    public void verifyOWLDisjointDataPropertiesAxiomImpl() {
        OWLDisjointDataPropertiesAxiomImpl testSubject0 = new OWLDisjointDataPropertiesAxiomImpl(_Set168, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        AxiomType<?> result3 = testSubject0.getAxiomType();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointDataPropertiesAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointDataPropertiesAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set127);
        Set<OWLDataPropertyExpression> result8 = testSubject0.getProperties();
        java.util.Collection<java.lang.Object> result9 = testSubject0.walkPairwise(_OWLPairwiseVisitor179);
        Set<OWLDataPropertyExpression> result10 = testSubject0.getPropertiesMinus(_OWLDataPropertyExpression);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiomImpl.class));
        assertTrue(OWLDisjointObjectPropertiesAxiom.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLDisjointObjectPropertiesAxiomImpl() {
        OWLDisjointObjectPropertiesAxiomImpl testSubject0 = new OWLDisjointObjectPropertiesAxiomImpl(_Set166, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        AxiomType<?> result3 = testSubject0.getAxiomType();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointObjectPropertiesAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointObjectPropertiesAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set127);
        Set<OWLObjectPropertyExpression> result8 = testSubject0.getProperties();
        java.util.Collection<java.lang.Object> result9 = testSubject0.walkPairwise(_OWLPairwiseVisitor185);
        Set<OWLObjectPropertyExpression> result10 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class.isAssignableFrom(OWLDisjointUnionAxiomImpl.class));
        assertTrue(OWLDisjointUnionAxiom.class.isAssignableFrom(OWLDisjointUnionAxiomImpl.class));
    }

    public void verifyOWLDisjointUnionAxiomImpl() {
        OWLDisjointUnionAxiomImpl testSubject0 = new OWLDisjointUnionAxiomImpl(_OWLClass, _Set154, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLEquivalentClassesAxiom result2 = testSubject0.getOWLEquivalentClassesAxiom();
        OWLDisjointClassesAxiom result3 = testSubject0.getOWLDisjointClassesAxiom();
        java.util.Set<OWLClassExpression> result4 = testSubject0.getClassExpressions();
        OWLClass result5 = testSubject0.getOWLClass();
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointUnionAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLDisjointUnionAxiom result10 = testSubject0.getAnnotatedAxiom(_Set);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEntityCollectionContainerCollector() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractEntityRegistrationManager.class.isAssignableFrom(OWLEntityCollectionContainerCollector.class));
    }

    public void verifyOWLEntityCollectionContainerCollector() {
        OWLEntityCollectionContainerCollector testSubject0 = new OWLEntityCollectionContainerCollector(_Set181);
        OWLEntityCollectionContainerCollector testSubject2 = new OWLEntityCollectionContainerCollector(_Set181, _Collection182);
        testSubject0.reset(_Set181);
        testSubject0.visit(_OWLNamedIndividual);
        testSubject0.visit(_OWLDataProperty);
        testSubject0.visit(_OWLObjectProperty);
        testSubject0.visit(_OWLClass);
        testSubject0.visit(_OWLDatatype);
        testSubject0.visit(_OWLAnonymousIndividual);
        testSubject0.visit(_OWLOntology);
        testSubject0.visit(_OWLAnnotationProperty);
        testSubject0.setCollectClasses(_boolean);
        testSubject0.setCollectObjectProperties(_boolean);
        testSubject0.setCollectDataProperties(_boolean);
        testSubject0.setCollectIndividuals(_boolean);
        testSubject0.setCollectDatatypes(_boolean);
        testSubject0.visit(_OWLDataComplementOf);
        testSubject0.visit(_OWLDataOneOf);
        testSubject0.visit(_OWLDataIntersectionOf);
        testSubject0.visit(_OWLDataMaxCardinality);
        testSubject0.visit(_OWLDataExactCardinality);
        testSubject0.visit(_OWLObjectInverseOf);
        testSubject0.visit(_OWLLiteral);
        testSubject0.visit(_OWLFacetRestriction);
        testSubject0.visit(_OWLDatatypeRestriction);
        testSubject0.visit(_OWLDataUnionOf);
        testSubject0.visit(_OWLObjectHasSelf);
        testSubject0.visit(_OWLObjectMaxCardinality);
        testSubject0.visit(_OWLObjectExactCardinality);
        testSubject0.visit(_OWLObjectMinCardinality);
        testSubject0.visit(_OWLObjectHasValue);
        testSubject0.visit(_OWLDataMinCardinality);
        testSubject0.visit(_OWLDataHasValue);
        testSubject0.visit(_OWLDataAllValuesFrom);
        testSubject0.visit(_OWLDataSomeValuesFrom);
        testSubject0.visit(_OWLObjectOneOf);
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
        testSubject0.visit(_OWLAnnotationPropertyDomainAxiom);
        testSubject0.visit(_IRI);
        testSubject0.visit(_OWLAnnotationAssertionAxiom);
        testSubject0.visit(_OWLAnnotation);
        testSubject0.visit(_SWRLRule);
        testSubject0.visit(_OWLDatatypeDefinitionAxiom);
        testSubject0.visit(_OWLSubAnnotationPropertyOfAxiom);
        testSubject0.visit(_OWLAnnotationPropertyRangeAxiom);
        testSubject0.visit(_OWLObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLObjectPropertyRangeAxiom);
        testSubject0.visit(_OWLDisjointObjectPropertiesAxiom);
        testSubject0.visit(_OWLDisjointDataPropertiesAxiom);
        testSubject0.visit(_OWLDifferentIndividualsAxiom);
        testSubject0.visit(_OWLSymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLDeclarationAxiom);
        testSubject0.visit(_OWLDisjointUnionAxiom);
        testSubject0.visit(_OWLSubObjectPropertyOfAxiom);
        testSubject0.visit(_OWLFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLDisjointClassesAxiom);
        testSubject0.visit(_OWLReflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLAsymmetricObjectPropertyAxiom);
        testSubject0.visit(_OWLNegativeObjectPropertyAssertionAxiom);
        testSubject0.visit(_OWLSubClassOfAxiom);
        testSubject0.visit(_OWLNegativeDataPropertyAssertionAxiom);
        testSubject0.visit(_OWLEquivalentObjectPropertiesAxiom);
        testSubject0.visit(_OWLObjectPropertyDomainAxiom);
        testSubject0.visit(_OWLDataPropertyDomainAxiom);
        testSubject0.visit(_OWLHasKeyAxiom);
        testSubject0.visit(_OWLInverseObjectPropertiesAxiom);
        testSubject0.visit(_OWLSubPropertyChainOfAxiom);
        testSubject0.visit(_OWLSameIndividualAxiom);
        testSubject0.visit(_OWLInverseFunctionalObjectPropertyAxiom);
        testSubject0.visit(_OWLObjectAllValuesFrom);
        testSubject0.visit(_OWLObjectSomeValuesFrom);
        testSubject0.visit(_OWLObjectComplementOf);
        testSubject0.visit(_OWLObjectUnionOf);
        testSubject0.visit(_OWLObjectIntersectionOf);
        testSubject0.visit(_OWLEquivalentClassesAxiom);
        testSubject0.visit(_OWLClassAssertionAxiom);
        testSubject0.visit(_OWLEquivalentDataPropertiesAxiom);
        testSubject0.visit(_OWLFunctionalDataPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyRangeAxiom);
        testSubject0.visit(_OWLSubDataPropertyOfAxiom);
        testSubject0.visit(_OWLIrreflexiveObjectPropertyAxiom);
        testSubject0.visit(_OWLTransitiveObjectPropertyAxiom);
        testSubject0.visit(_OWLDataPropertyAssertionAxiom);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryClassAxiomImpl.class.isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
        assertTrue(OWLEquivalentClassesAxiom.class.isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
    }

    public void verifyOWLEquivalentClassesAxiomImpl() {
        OWLEquivalentClassesAxiomImpl testSubject0 = new OWLEquivalentClassesAxiomImpl(_Set154, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        java.util.Set<OWLEquivalentClassesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result3 = testSubject0.asOWLSubClassOfAxioms();
        boolean result4 = testSubject0.containsOWLNothing();
        java.util.Set<OWLClass> result5 = testSubject0.getNamedClasses();
        boolean result6 = testSubject0.containsOWLThing();
        boolean result7 = testSubject0.containsNamedEquivalentClass();
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLEquivalentClassesAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLEquivalentClassesAxiom result12 = testSubject0.getAnnotatedAxiom(_Set);
        boolean result13 = testSubject0.contains(_OWLClassExpression);
        java.util.Collection<java.lang.Object> result14 = testSubject0.walkPairwise(_OWLPairwiseVisitor178);
        java.util.List<OWLClassExpression> result15 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<OWLClassExpression> result17 = testSubject0.getClassExpressions();
        boolean result18 = testSubject0.isLogicalAxiom();
        boolean result19 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result20 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result21 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result22 = testSubject0.isAnnotated();
        boolean result23 = testSubject0.isOfType(_Set129);
        boolean result24 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result25 = testSubject0.getNNF();
        boolean result26 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result28 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result29 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result30 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result31 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result32 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result33 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result34 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result35 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result36 = testSubject0.getNestedClassExpressions();
        boolean result37 = testSubject0.isTopEntity();
        boolean result38 = testSubject0.isBottomEntity();
        boolean result39 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiomImpl.class));
        assertTrue(OWLEquivalentDataPropertiesAxiom.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiomImpl.class));
    }

    public void verifyOWLEquivalentDataPropertiesAxiomImpl() {
        OWLEquivalentDataPropertiesAxiomImpl testSubject0 = new OWLEquivalentDataPropertiesAxiomImpl(_Set168, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubDataPropertyOfAxiom> result3 = testSubject0.asSubDataPropertyOfAxioms();
        AxiomType<?> result4 = testSubject0.getAxiomType();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentDataPropertiesAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentDataPropertiesAxiom result7 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set127);
        Set<OWLDataPropertyExpression> result9 = testSubject0.getProperties();
        java.util.Collection<java.lang.Object> result10 = testSubject0.walkPairwise(_OWLPairwiseVisitor179);
        Set<OWLDataPropertyExpression> result11 = testSubject0.getPropertiesMinus(_OWLDataPropertyExpression);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set129);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        boolean result20 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
        boolean result33 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiomImpl.class));
        assertTrue(OWLEquivalentObjectPropertiesAxiom.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLEquivalentObjectPropertiesAxiomImpl() {
        OWLEquivalentObjectPropertiesAxiomImpl testSubject0 = new OWLEquivalentObjectPropertiesAxiomImpl(_Set166, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubObjectPropertyOfAxiom> result3 = testSubject0.asSubObjectPropertyOfAxioms();
        AxiomType<?> result4 = testSubject0.getAxiomType();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentObjectPropertiesAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentObjectPropertiesAxiom result7 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set127);
        Set<OWLObjectPropertyExpression> result9 = testSubject0.getProperties();
        java.util.Collection<java.lang.Object> result10 = testSubject0.walkPairwise(_OWLPairwiseVisitor185);
        Set<OWLObjectPropertyExpression> result11 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set129);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        boolean result20 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
        boolean result33 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLFacetRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLFacetRestrictionImpl.class));
        assertTrue(OWLFacetRestriction.class.isAssignableFrom(OWLFacetRestrictionImpl.class));
    }

    public void verifyOWLFacetRestrictionImpl() {
        OWLFacetRestrictionImpl testSubject0 = new OWLFacetRestrictionImpl(_OWLFacet, _OWLLiteral);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        org.semanticweb.owlapi.vocab.OWLFacet result2 = testSubject0.getFacet();
        OWLLiteral result3 = testSubject0.getFacetValue();
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        boolean result16 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLFunctionalDataPropertyAxiomImpl.class));
        assertTrue(OWLFunctionalDataPropertyAxiom.class.isAssignableFrom(OWLFunctionalDataPropertyAxiomImpl.class));
    }

    public void verifyOWLFunctionalDataPropertyAxiomImpl() {
        OWLFunctionalDataPropertyAxiomImpl testSubject0 = new OWLFunctionalDataPropertyAxiomImpl(_OWLDataPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLFunctionalDataPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLFunctionalDataPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result8 = testSubject0.getProperty();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLDataPropertyExpression result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiomImpl.class));
        assertTrue(OWLFunctionalObjectPropertyAxiom.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLFunctionalObjectPropertyAxiomImpl() {
        OWLFunctionalObjectPropertyAxiomImpl testSubject0 = new OWLFunctionalObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLFunctionalObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLFunctionalObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result8 = testSubject0.getProperty();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObjectPropertyExpression result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLHasKeyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLHasKeyAxiomImpl.class));
        assertTrue(OWLHasKeyAxiom.class.isAssignableFrom(OWLHasKeyAxiomImpl.class));
    }

    public void verifyOWLHasKeyAxiomImpl() {
        OWLHasKeyAxiomImpl testSubject0 = new OWLHasKeyAxiomImpl(_OWLClassExpression, _Set171, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        java.util.Set<OWLObjectPropertyExpression> result2 = testSubject0.getObjectPropertyExpressions();
        java.util.Set<OWLDataPropertyExpression> result3 = testSubject0.getDataPropertyExpressions();
        OWLClassExpression result4 = testSubject0.getClassExpression();
        java.util.Set<OWLPropertyExpression> result5 = testSubject0.getPropertyExpressions();
        boolean result6 = testSubject0.isLogicalAxiom();
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLHasKeyAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLHasKeyAxiom result10 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set127);
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLImmutableOntologyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomIndexImpl.class.isAssignableFrom(OWLImmutableOntologyImpl.class));
        assertTrue(OWLOntology.class.isAssignableFrom(OWLImmutableOntologyImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLImmutableOntologyImpl.class));
    }

    public void verifyOWLImmutableOntologyImpl() {
        OWLImmutableOntologyImpl testSubject0 = new OWLImmutableOntologyImpl(_OWLOntologyManager, _OWLOntologyID);
        boolean result0 = testSubject0.isEmpty();
        boolean result1 = testSubject0.contains(_OWLAxiomSearchFilter, _Object, _import);
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature(_import);
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        boolean result6 = testSubject0.isAnonymous();
        OWLOntologyID result7 = testSubject0.getOntologyID();
        OWLOntologyManager result8 = testSubject0.getOWLOntologyManager();
        java.util.Set<OWLOntology> result9 = testSubject0.getDirectImports();
        java.util.Set<IRI> result10 = testSubject0.getDirectImportsDocuments();
        java.util.Set<OWLOntology> result11 = testSubject0.getImports();
        java.util.Set<OWLOntology> result12 = testSubject0.getImportsClosure();
        java.util.Set<OWLImportsDeclaration> result13 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result14 = testSubject0.getTBoxAxioms(_import);
        java.util.Set<OWLAxiom> result15 = testSubject0.getABoxAxioms(_import);
        java.util.Set<OWLAxiom> result16 = testSubject0.getRBoxAxioms(_import);
        java.util.Set<OWLClassAxiom> result17 = testSubject0.getGeneralClassAxioms();
        boolean result18 = testSubject0.isDeclared(_OWLEntity);
        boolean result19 = testSubject0.isDeclared(_OWLEntity, _import);
        java.util.Set<OWLObjectPropertyAxiom> result20 = testSubject0.getAxioms(_OWLObjectPropertyExpression, _import);
        java.util.Set<OWLClassAxiom> result21 = testSubject0.getAxioms(_OWLClass, _import);
        Set<OWLAxiom> result22 = testSubject0.getAxioms(_Class, _Class151, _OWLObject, _import, _ignore);
        java.util.Set<OWLAxiom> result23 = testSubject0.getAxioms();
        java.util.Set<OWLAxiom> result24 = testSubject0.getAxioms(_import);
        Set<?> result25 = testSubject0.getAxioms(_AxiomType104);
        Set<OWLAxiom> result26 = testSubject0.getAxioms(_Class, _OWLObject, _import, _ignore);
        Set<?> result27 = testSubject0.getAxioms(_AxiomType104, _import);
        java.util.Set<OWLDataPropertyAxiom> result28 = testSubject0.getAxioms(_OWLDataProperty, _import);
        java.util.Set<OWLAnnotationAxiom> result29 = testSubject0.getAxioms(_OWLAnnotationProperty, _import);
        java.util.Set<OWLDatatypeDefinitionAxiom> result30 = testSubject0.getAxioms(_OWLDatatype, _import);
        java.util.Set<OWLIndividualAxiom> result31 = testSubject0.getAxioms(_OWLIndividual, _import);
        boolean result32 = testSubject0.containsAxiom(_OWLAxiom101, _import, _ignore);
        boolean result33 = testSubject0.containsAxiom(_OWLAxiom101);
        java.util.Set<OWLEntity> result34 = testSubject0.getEntitiesInSignature(_IRI, _import);
        java.util.Set<OWLEntity> result35 = testSubject0.getEntitiesInSignature(_IRI);
        java.util.Set<OWLLogicalAxiom> result36 = testSubject0.getLogicalAxioms(_import);
        java.util.Set<OWLLogicalAxiom> result37 = testSubject0.getLogicalAxioms();
        int result38 = testSubject0.getAxiomCount(_AxiomType104);
        int result39 = testSubject0.getAxiomCount(_import);
        int result40 = testSubject0.getAxiomCount(_AxiomType104, _import);
        int result41 = testSubject0.getAxiomCount();
        java.util.Set<OWLAnonymousIndividual> result42 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result43 = testSubject0.getClassesInSignature();
        java.util.Set<OWLClass> result44 = testSubject0.getClassesInSignature(_import);
        java.util.Set<OWLDataProperty> result45 = testSubject0.getDataPropertiesInSignature(_import);
        java.util.Set<OWLDataProperty> result46 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result47 = testSubject0.getObjectPropertiesInSignature(_import);
        java.util.Set<OWLObjectProperty> result48 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result49 = testSubject0.getIndividualsInSignature(_import);
        java.util.Set<OWLNamedIndividual> result50 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result51 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLDatatype> result52 = testSubject0.getDatatypesInSignature(_import);
        boolean result53 = testSubject0.containsEntityInSignature(_IRI, _import);
        boolean result54 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result55 = testSubject0.containsEntityInSignature(_OWLEntity, _import);
        int result56 = testSubject0.getLogicalAxiomCount(_import);
        int result57 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLAxiom> result58 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom101, _import);
        java.util.Set<OWLAxiom> result59 = testSubject0.getReferencingAxioms(_OWLPrimitive, _import);
        boolean result60 = testSubject0.containsReference(_OWLEntity, _import);
        java.util.Set<OWLAnonymousIndividual> result61 = testSubject0.getReferencedAnonymousIndividuals(_import);
        java.util.Set<OWLAnnotationProperty> result62 = testSubject0.getAnnotationPropertiesInSignature(_import);
        boolean result63 = testSubject0.containsClassInSignature(_IRI, _import);
        boolean result64 = testSubject0.containsObjectPropertyInSignature(_IRI, _import);
        boolean result65 = testSubject0.containsDataPropertyInSignature(_IRI, _import);
        boolean result66 = testSubject0.containsAnnotationPropertyInSignature(_IRI, _import);
        boolean result67 = testSubject0.containsIndividualInSignature(_IRI, _import);
        boolean result68 = testSubject0.containsDatatypeInSignature(_IRI, _import);
        java.util.Collection<OWLAxiom> result69 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object, _import);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result70 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result71 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result72 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result73 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result74 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result75 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result76 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result77 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result78 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result79 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result80 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result81 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result82 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result83 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result84 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result85 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result86 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result87 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result88 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result89 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result90 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result91 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result92 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result93 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result94 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result95 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result96 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result97 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result98 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result99 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result100 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result101 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result102 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLClassAssertionAxiom> result103 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLDataPropertyAssertionAxiom> result104 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result105 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result106 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result107 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result108 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result109 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result110 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
        int result112 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLClassExpression> result113 = testSubject0.getNestedClassExpressions();
        boolean result114 = testSubject0.isTopEntity();
        boolean result115 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLImportsDeclarationImpl() {
        assertTrue(OWLImportsDeclaration.class.isAssignableFrom(OWLImportsDeclarationImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLImportsDeclarationImpl.class));
    }

    public void verifyOWLImportsDeclarationImpl() {
        OWLImportsDeclarationImpl testSubject0 = new OWLImportsDeclarationImpl(_IRI);
        int result1 = testSubject0.compareTo(_OWLImportsDeclaration);
        IRI result2 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLIndividualAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLIndividualAxiomImpl.class));
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLIndividualAxiomImpl.class));
    }

    public void verifyOWLIndividualAxiomImpl() {
        OWLIndividualAxiomImpl testSubject0 = mock(OWLIndividualAxiomImpl.class);
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result4 = testSubject0.isAnnotated();
        boolean result5 = testSubject0.isOfType(_Set129);
        boolean result6 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result7 = testSubject0.getNNF();
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result23 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result24 = testSubject0.getAxiomType();
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLIndividualImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLIndividualImpl.class));
        assertTrue(OWLIndividual.class.isAssignableFrom(OWLIndividualImpl.class));
    }

    public void verifyOWLIndividualImpl() {
        OWLIndividualImpl testSubject0 = mock(OWLIndividualImpl.class);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result14 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result15 = testSubject0.isAnonymous();
        OWLNamedIndividual result16 = testSubject0.asOWLNamedIndividual();
        java.lang.String result17 = testSubject0.toStringID();
        boolean result18 = testSubject0.isNamed();
        OWLAnonymousIndividual result19 = testSubject0.asOWLAnonymousIndividual();
    }

    @Test
    public void enforceInterfacesOWLIndividualRelationshipAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLIndividualRelationshipAxiomImpl.class));
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLIndividualRelationshipAxiomImpl.class));
    }

    public void verifyOWLIndividualRelationshipAxiomImpl() {
        OWLIndividualRelationshipAxiomImpl<OWLPropertyExpression, OWLPropertyAssertionObject> testSubject0 = mock(OWLIndividualRelationshipAxiomImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        OWLObject result2 = testSubject0.getObject();
        OWLPropertyAssertionObject result3 = testSubject0.getObject();
        OWLObject result4 = testSubject0.getSubject();
        OWLIndividual result5 = testSubject0.getSubject();
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result8 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result9 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result10 = testSubject0.isAnnotated();
        boolean result11 = testSubject0.isOfType(_Set129);
        boolean result12 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result16 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result28 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result29 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result30 = testSubject0.getAxiomType();
        OWLAxiom result31 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result32 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result33 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomImpl.class));
        assertTrue(OWLInverseFunctionalObjectPropertyAxiom.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLInverseFunctionalObjectPropertyAxiomImpl() {
        OWLInverseFunctionalObjectPropertyAxiomImpl testSubject0 = new OWLInverseFunctionalObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLInverseFunctionalObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLInverseFunctionalObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result8 = testSubject0.getProperty();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObjectPropertyExpression result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLInverseObjectPropertiesAxiomImpl.class));
        assertTrue(OWLInverseObjectPropertiesAxiom.class.isAssignableFrom(OWLInverseObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLInverseObjectPropertiesAxiomImpl() {
        OWLInverseObjectPropertiesAxiomImpl testSubject0 = new OWLInverseObjectPropertiesAxiomImpl(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Collection<java.lang.Object> result3 = testSubject0.walkPairwise(_OWLPairwiseVisitor185);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result4 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLObjectPropertyExpression result5 = testSubject0.getFirstProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getSecondProperty();
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLInverseObjectPropertiesAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLInverseObjectPropertiesAxiom result11 = testSubject0.getAnnotatedAxiom(_Set);
        Set<OWLObjectPropertyExpression> result12 = testSubject0.getProperties();
        Set<OWLObjectPropertyExpression> result13 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result14 = testSubject0.isLogicalAxiom();
        boolean result15 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result17 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set129);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        boolean result22 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLIrreflexiveObjectPropertyAxiomImpl.class));
        assertTrue(OWLIrreflexiveObjectPropertyAxiom.class.isAssignableFrom(OWLIrreflexiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLIrreflexiveObjectPropertyAxiomImpl() {
        OWLIrreflexiveObjectPropertyAxiomImpl testSubject0 = new OWLIrreflexiveObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLIrreflexiveObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLIrreflexiveObjectPropertyAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result8 = testSubject0.getProperty();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObjectPropertyExpression result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLiteralImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImpl.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImpl.class));
    }

    public void verifyOWLLiteralImpl() {
        OWLLiteralImpl testSubject0 = new OWLLiteralImpl(_String, _String, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        java.lang.String result6 = testSubject0.getLang();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        boolean result8 = testSubject0.hasLang();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        OWLDatatype result15 = testSubject0.getDatatype();
        java.lang.String result16 = testSubject0.getLiteral();
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLiteralImplBoolean() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplBoolean.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplBoolean.class));
    }

    public void verifyOWLLiteralImplBoolean() {
        OWLLiteralImplBoolean testSubject0 = new OWLLiteralImplBoolean(_boolean, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        testSubject0.accept(_OWLDataVisitor);
        java.lang.String result6 = testSubject0.getLang();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        boolean result8 = testSubject0.hasLang();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        OWLDatatype result15 = testSubject0.getDatatype();
        java.lang.String result16 = testSubject0.getLiteral();
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLiteralImplDouble() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplDouble.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplDouble.class));
    }

    public void verifyOWLLiteralImplDouble() {
        OWLLiteralImplDouble testSubject0 = new OWLLiteralImplDouble(_double, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        testSubject0.accept(_OWLDataVisitor);
        java.lang.String result6 = testSubject0.getLang();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        boolean result8 = testSubject0.hasLang();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        OWLDatatype result15 = testSubject0.getDatatype();
        java.lang.String result16 = testSubject0.getLiteral();
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLiteralImplFloat() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplFloat.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplFloat.class));
    }

    public void verifyOWLLiteralImplFloat() {
        OWLLiteralImplFloat testSubject0 = new OWLLiteralImplFloat(_float, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        testSubject0.accept(_OWLDataVisitor);
        java.lang.String result6 = testSubject0.getLang();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        boolean result8 = testSubject0.hasLang();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        OWLDatatype result15 = testSubject0.getDatatype();
        java.lang.String result16 = testSubject0.getLiteral();
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLiteralImplInteger() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplInteger.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplInteger.class));
    }

    public void verifyOWLLiteralImplInteger() {
        OWLLiteralImplInteger testSubject0 = new OWLLiteralImplInteger(_int, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        testSubject0.accept(_OWLDataVisitor);
        java.lang.String result6 = testSubject0.getLang();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        boolean result8 = testSubject0.hasLang();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        OWLDatatype result15 = testSubject0.getDatatype();
        java.lang.String result16 = testSubject0.getLiteral();
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLiteralImplNoCompression() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplNoCompression.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplNoCompression.class));
    }

    public void verifyOWLLiteralImplNoCompression() {
        OWLLiteralImplNoCompression testSubject0 = new OWLLiteralImplNoCompression(_byte_array, _String, _OWLDatatype);
        OWLLiteralImplNoCompression testSubject1 = new OWLLiteralImplNoCompression(_String, _String, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result4 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        java.lang.String result6 = testSubject0.getLang();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        boolean result8 = testSubject0.hasLang(_String);
        boolean result9 = testSubject0.hasLang();
        boolean result10 = testSubject0.isInteger();
        int result11 = testSubject0.parseInteger();
        boolean result12 = testSubject0.isBoolean();
        boolean result13 = testSubject0.isDouble();
        boolean result14 = testSubject0.isFloat();
        OWLDatatype result15 = testSubject0.getDatatype();
        java.lang.String result16 = testSubject0.getLiteral();
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        boolean result29 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLLogicalAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLLogicalAxiomImpl.class));
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLLogicalAxiomImpl.class));
    }

    public void verifyOWLLogicalAxiomImpl() {
        OWLLogicalAxiomImpl testSubject0 = mock(OWLLogicalAxiomImpl.class);
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result4 = testSubject0.isAnnotated();
        boolean result5 = testSubject0.isOfType(_Set129);
        boolean result6 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result7 = testSubject0.getNNF();
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result23 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result24 = testSubject0.getAxiomType();
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualImpl.class.isAssignableFrom(OWLNamedIndividualImpl.class));
        assertTrue(OWLNamedIndividual.class.isAssignableFrom(OWLNamedIndividualImpl.class));
    }

    public void verifyOWLNamedIndividualImpl() {
        OWLNamedIndividualImpl testSubject0 = new OWLNamedIndividualImpl(_IRI);
        boolean result0 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        OWLObjectProperty result4 = testSubject0.asOWLObjectProperty();
        boolean result5 = testSubject0.isAnonymous();
        OWLClass result6 = testSubject0.asOWLClass();
        IRI result7 = testSubject0.getIRI();
        OWLDatatype result8 = testSubject0.asOWLDatatype();
        EntityType<?> result9 = testSubject0.getEntityType();
        boolean result10 = testSubject0.isBuiltIn();
        boolean result11 = testSubject0.isOWLClass();
        boolean result12 = testSubject0.isOWLObjectProperty();
        boolean result13 = testSubject0.isOWLDataProperty();
        OWLDataProperty result14 = testSubject0.asOWLDataProperty();
        boolean result15 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result16 = testSubject0.asOWLNamedIndividual();
        boolean result17 = testSubject0.isOWLDatatype();
        boolean result18 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result19 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result20 = testSubject0.toStringID();
        boolean result21 = testSubject0.isNamed();
        OWLAnonymousIndividual result22 = testSubject0.asOWLAnonymousIndividual();
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLNaryBooleanClassExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLNaryBooleanClassExpressionImpl.class));
        assertTrue(OWLNaryBooleanClassExpression.class.isAssignableFrom(OWLNaryBooleanClassExpressionImpl.class));
    }

    public void verifyOWLNaryBooleanClassExpressionImpl() {
        OWLNaryBooleanClassExpressionImpl testSubject0 = mock(OWLNaryBooleanClassExpressionImpl.class);
        boolean result0 = testSubject0.isClassExpressionLiteral();
        java.util.List<OWLClassExpression> result1 = testSubject0.getOperandsAsList();
        java.util.Set<OWLClassExpression> result2 = testSubject0.getOperands();
        boolean result3 = testSubject0.isAnonymous();
        OWLClass result4 = testSubject0.asOWLClass();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result27 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result28 = testSubject0.getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLNaryClassAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class.isAssignableFrom(OWLNaryClassAxiomImpl.class));
        assertTrue(OWLNaryClassAxiom.class.isAssignableFrom(OWLNaryClassAxiomImpl.class));
    }

    public void verifyOWLNaryClassAxiomImpl() {
        OWLNaryClassAxiomImpl testSubject0 = mock(OWLNaryClassAxiomImpl.class);
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        java.util.Collection<java.lang.Object> result1 = testSubject0.walkPairwise(_OWLPairwiseVisitor178);
        java.util.List<OWLClassExpression> result2 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result3 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        java.util.Set<OWLClassExpression> result4 = testSubject0.getClassExpressions();
        boolean result5 = testSubject0.isLogicalAxiom();
        boolean result6 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result8 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result9 = testSubject0.isAnnotated();
        boolean result10 = testSubject0.isOfType(_Set129);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result15 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result27 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result28 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result29 = testSubject0.getAxiomType();
        OWLAxiom result30 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result31 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<? extends OWLNaryAxiom<OWLClassExpression>> result32 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result33 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryDataRangeImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLNaryDataRangeImpl.class));
        assertTrue(OWLNaryDataRange.class.isAssignableFrom(OWLNaryDataRangeImpl.class));
    }

    public void verifyOWLNaryDataRangeImpl() {
        OWLNaryDataRangeImpl testSubject0 = mock(OWLNaryDataRangeImpl.class);
        java.util.Set<OWLDataRange> result0 = testSubject0.getOperands();
        boolean result1 = testSubject0.isTopDatatype();
        OWLDatatype result2 = testSubject0.asOWLDatatype();
        boolean result3 = testSubject0.isDatatype();
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        boolean result16 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result18 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result19 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        DataRangeType result20 = testSubject0.getDataRangeType();
    }

    @Test
    public void enforceInterfacesOWLNaryIndividualAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualAxiomImpl.class.isAssignableFrom(OWLNaryIndividualAxiomImpl.class));
        assertTrue(OWLNaryIndividualAxiom.class.isAssignableFrom(OWLNaryIndividualAxiomImpl.class));
    }

    public void verifyOWLNaryIndividualAxiomImpl() {
        OWLNaryIndividualAxiomImpl testSubject0 = mock(OWLNaryIndividualAxiomImpl.class);
        java.util.List<OWLIndividual> result0 = testSubject0.getIndividualsAsList();
        java.util.Collection<java.lang.Object> result1 = testSubject0.walkPairwise(_OWLPairwiseVisitor);
        java.util.Set<OWLIndividual> result2 = testSubject0.getIndividuals();
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set129);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result26 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        OWLAxiom result28 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result29 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<? extends OWLNaryAxiom<OWLIndividual>> result30 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result31 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLNaryPropertyAxiomImpl.class));
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLNaryPropertyAxiomImpl.class));
    }

    public void verifyOWLNaryPropertyAxiomImpl() {
        OWLNaryPropertyAxiomImpl<OWLObjectPropertyExpression> testSubject0 = mock(OWLNaryPropertyAxiomImpl.class);
        Set<OWLObjectPropertyExpression> result0 = testSubject0.getProperties();
        java.util.Collection<java.lang.Object> result1 = testSubject0.walkPairwise(_OWLPairwiseVisitor185);
        Set<OWLObjectPropertyExpression> result2 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set129);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result26 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        OWLAxiom result28 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result29 = testSubject0.getAnnotatedAxiom(_Set);
        Set<? extends OWLNaryAxiom<OWLObjectPropertyExpression>> result30 = testSubject0.asPairwiseAxioms();
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomImpl.class));
        assertTrue(OWLNegativeDataPropertyAssertionAxiom.class.isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLNegativeDataPropertyAssertionAxiomImpl() {
        OWLNegativeDataPropertyAssertionAxiomImpl testSubject0 = new OWLNegativeDataPropertyAssertionAxiomImpl(_OWLIndividual, _OWLDataPropertyExpression, _OWLLiteral, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        boolean result2 = testSubject0.containsAnonymousIndividuals();
        AxiomType<?> result3 = testSubject0.getAxiomType();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLNegativeDataPropertyAssertionAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLNegativeDataPropertyAssertionAxiom result7 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result8 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result9 = testSubject0.getProperty();
        java.lang.Object result10 = testSubject0.getProperty();
        OWLObject result11 = testSubject0.getObject();
        java.lang.Object result12 = testSubject0.getObject();
        OWLObject result13 = testSubject0.getSubject();
        OWLIndividual result14 = testSubject0.getSubject();
        boolean result15 = testSubject0.isLogicalAxiom();
        boolean result16 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result17 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result18 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result19 = testSubject0.isAnnotated();
        boolean result20 = testSubject0.isOfType(_Set129);
        boolean result21 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result22 = testSubject0.getNNF();
        boolean result23 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result25 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result26 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result27 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result28 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result29 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result30 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result31 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result32 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result33 = testSubject0.getNestedClassExpressions();
        boolean result34 = testSubject0.isTopEntity();
        boolean result35 = testSubject0.isBottomEntity();
        boolean result36 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomImpl.class));
        assertTrue(OWLNegativeObjectPropertyAssertionAxiom.class.isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLNegativeObjectPropertyAssertionAxiomImpl() {
        OWLNegativeObjectPropertyAssertionAxiomImpl testSubject0 = new OWLNegativeObjectPropertyAssertionAxiomImpl(_OWLIndividual, _OWLObjectPropertyExpression, _OWLIndividual,
                _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        boolean result2 = testSubject0.containsAnonymousIndividuals();
        AxiomType<?> result3 = testSubject0.getAxiomType();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLNegativeObjectPropertyAssertionAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLNegativeObjectPropertyAssertionAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSubClassOfAxiom result8 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result9 = testSubject0.getProperty();
        java.lang.Object result10 = testSubject0.getProperty();
        OWLObject result11 = testSubject0.getObject();
        java.lang.Object result12 = testSubject0.getObject();
        OWLObject result13 = testSubject0.getSubject();
        OWLIndividual result14 = testSubject0.getSubject();
        boolean result15 = testSubject0.isLogicalAxiom();
        boolean result16 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result17 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result18 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result19 = testSubject0.isAnnotated();
        boolean result20 = testSubject0.isOfType(_Set129);
        boolean result21 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result22 = testSubject0.getNNF();
        boolean result23 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result25 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result26 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result27 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result28 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result29 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result30 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result31 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result32 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result33 = testSubject0.getNestedClassExpressions();
        boolean result34 = testSubject0.isTopEntity();
        boolean result35 = testSubject0.isBottomEntity();
        boolean result36 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFromImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedObjectRestrictionImpl.class.isAssignableFrom(OWLObjectAllValuesFromImpl.class));
        assertTrue(OWLObjectAllValuesFrom.class.isAssignableFrom(OWLObjectAllValuesFromImpl.class));
    }

    public void verifyOWLObjectAllValuesFromImpl() {
        OWLObjectAllValuesFromImpl testSubject0 = new OWLObjectAllValuesFromImpl(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result2 = testSubject0.isObjectRestriction();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.getProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getProperty();
        java.lang.Object result7 = testSubject0.getFiller();
        OWLObject result8 = testSubject0.getFiller();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLThing();
        boolean result13 = testSubject0.isOWLNothing();
        OWLClassExpression result14 = testSubject0.getComplementNNF();
        OWLClassExpression result15 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result16 = testSubject0.asConjunctSet();
        boolean result17 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result18 = testSubject0.asDisjunctSet();
        OWLClassExpression result19 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectCardinalityRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectCardinalityRestrictionImpl.class));
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectCardinalityRestrictionImpl.class));
    }

    public void verifyOWLObjectCardinalityRestrictionImpl() {
        OWLObjectCardinalityRestrictionImpl testSubject0 = mock(OWLObjectCardinalityRestrictionImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isObjectRestriction();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isDataRestriction();
        int result5 = testSubject0.getCardinality();
        OWLObject result6 = testSubject0.getFiller();
        java.lang.Object result7 = testSubject0.getFiller();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isAnonymous();
        OWLClass result10 = testSubject0.asOWLClass();
        boolean result11 = testSubject0.isOWLThing();
        boolean result12 = testSubject0.isOWLNothing();
        OWLClassExpression result13 = testSubject0.getComplementNNF();
        OWLClassExpression result14 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result15 = testSubject0.asConjunctSet();
        boolean result16 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result17 = testSubject0.asDisjunctSet();
        OWLClassExpression result18 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result32 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result33 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result34 = testSubject0.getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLObjectComplementOfImpl.class));
        assertTrue(OWLObjectComplementOf.class.isAssignableFrom(OWLObjectComplementOfImpl.class));
    }

    public void verifyOWLObjectComplementOfImpl() {
        OWLObjectComplementOfImpl testSubject0 = new OWLObjectComplementOfImpl(_OWLClassExpression);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        OWLClassExpression result4 = testSubject0.getOperand();
        boolean result5 = testSubject0.isAnonymous();
        OWLClass result6 = testSubject0.asOWLClass();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        int result16 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectExactCardinalityImpl.class));
        assertTrue(OWLObjectExactCardinality.class.isAssignableFrom(OWLObjectExactCardinalityImpl.class));
    }

    public void verifyOWLObjectExactCardinalityImpl() {
        OWLObjectExactCardinalityImpl testSubject0 = new OWLObjectExactCardinalityImpl(_OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLClassExpression result2 = testSubject0.asIntersectionOfMinMax();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        OWLObject result4 = testSubject0.getProperty();
        OWLObjectPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isObjectRestriction();
        boolean result7 = testSubject0.isQualified();
        boolean result8 = testSubject0.isDataRestriction();
        int result9 = testSubject0.getCardinality();
        OWLObject result10 = testSubject0.getFiller();
        java.lang.Object result11 = testSubject0.getFiller();
        boolean result12 = testSubject0.isClassExpressionLiteral();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        boolean result15 = testSubject0.isOWLThing();
        boolean result16 = testSubject0.isOWLNothing();
        OWLClassExpression result17 = testSubject0.getComplementNNF();
        OWLClassExpression result18 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result19 = testSubject0.asConjunctSet();
        boolean result20 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result21 = testSubject0.asDisjunctSet();
        OWLClassExpression result22 = testSubject0.getNNF();
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result27 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        boolean result35 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectHasSelfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLObjectHasSelfImpl.class));
        assertTrue(OWLObjectHasSelf.class.isAssignableFrom(OWLObjectHasSelfImpl.class));
    }

    public void verifyOWLObjectHasSelfImpl() {
        OWLObjectHasSelfImpl testSubject0 = new OWLObjectHasSelfImpl(_OWLObjectPropertyExpression);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getProperty();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isObjectRestriction();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isDataRestriction();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isAnonymous();
        OWLClass result9 = testSubject0.asOWLClass();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectHasValueImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLValueRestrictionImpl.class.isAssignableFrom(OWLObjectHasValueImpl.class));
        assertTrue(OWLObjectHasValue.class.isAssignableFrom(OWLObjectHasValueImpl.class));
        assertTrue(OWLObjectRestriction.class.isAssignableFrom(OWLObjectHasValueImpl.class));
    }

    public void verifyOWLObjectHasValueImpl() {
        OWLObjectHasValueImpl testSubject0 = new OWLObjectHasValueImpl(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getProperty();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result4 = testSubject0.isObjectRestriction();
        ClassExpressionType result5 = testSubject0.getClassExpressionType();
        boolean result6 = testSubject0.isDataRestriction();
        OWLClassExpression result7 = testSubject0.asSomeValuesFrom();
        java.lang.Object result8 = testSubject0.getFiller();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLThing();
        boolean result13 = testSubject0.isOWLNothing();
        OWLClassExpression result14 = testSubject0.getComplementNNF();
        OWLClassExpression result15 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result16 = testSubject0.asConjunctSet();
        boolean result17 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result18 = testSubject0.asDisjunctSet();
        OWLClassExpression result19 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectImpl() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLObjectImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObjectImpl.class));
    }

    public void verifyOWLObjectImpl() {
        OWLObjectImpl testSubject0 = mock(OWLObjectImpl.class);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryBooleanClassExpressionImpl.class.isAssignableFrom(OWLObjectIntersectionOfImpl.class));
        assertTrue(OWLObjectIntersectionOf.class.isAssignableFrom(OWLObjectIntersectionOfImpl.class));
    }

    public void verifyOWLObjectIntersectionOfImpl() {
        OWLObjectIntersectionOfImpl testSubject0 = new OWLObjectIntersectionOfImpl(_Set154);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        java.util.Set<OWLClassExpression> result3 = testSubject0.asConjunctSet();
        boolean result4 = testSubject0.containsConjunct(_OWLClassExpression);
        boolean result5 = testSubject0.isClassExpressionLiteral();
        java.util.List<OWLClassExpression> result6 = testSubject0.getOperandsAsList();
        java.util.Set<OWLClassExpression> result7 = testSubject0.getOperands();
        boolean result8 = testSubject0.isAnonymous();
        OWLClass result9 = testSubject0.asOWLClass();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectInverseOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyExpressionImpl.class.isAssignableFrom(OWLObjectInverseOfImpl.class));
        assertTrue(OWLObjectInverseOf.class.isAssignableFrom(OWLObjectInverseOfImpl.class));
    }

    public void verifyOWLObjectInverseOfImpl() {
        OWLObjectInverseOfImpl testSubject0 = new OWLObjectInverseOfImpl(_OWLObjectPropertyExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result2 = testSubject0.isOWLTopDataProperty();
        OWLObjectProperty result3 = testSubject0.asOWLObjectProperty();
        boolean result4 = testSubject0.isAnonymous();
        boolean result5 = testSubject0.isOWLTopObjectProperty();
        boolean result6 = testSubject0.isOWLBottomObjectProperty();
        boolean result7 = testSubject0.isOWLBottomDataProperty();
        OWLObjectPropertyExpression result8 = testSubject0.getInverse();
        OWLObjectProperty result9 = testSubject0.getNamedProperty();
        OWLObjectPropertyExpression result10 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result11 = testSubject0.getSimplified();
        boolean result12 = testSubject0.isDataPropertyExpression();
        boolean result13 = testSubject0.isObjectPropertyExpression();
        int result15 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        boolean result26 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectMaxCardinalityImpl.class));
        assertTrue(OWLObjectMaxCardinality.class.isAssignableFrom(OWLObjectMaxCardinalityImpl.class));
    }

    public void verifyOWLObjectMaxCardinalityImpl() {
        OWLObjectMaxCardinalityImpl testSubject0 = new OWLObjectMaxCardinalityImpl(_OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        OWLObject result3 = testSubject0.getProperty();
        OWLObjectPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isQualified();
        boolean result7 = testSubject0.isDataRestriction();
        int result8 = testSubject0.getCardinality();
        OWLObject result9 = testSubject0.getFiller();
        java.lang.Object result10 = testSubject0.getFiller();
        boolean result11 = testSubject0.isClassExpressionLiteral();
        boolean result12 = testSubject0.isAnonymous();
        OWLClass result13 = testSubject0.asOWLClass();
        boolean result14 = testSubject0.isOWLThing();
        boolean result15 = testSubject0.isOWLNothing();
        OWLClassExpression result16 = testSubject0.getComplementNNF();
        OWLClassExpression result17 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result18 = testSubject0.asConjunctSet();
        boolean result19 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result20 = testSubject0.asDisjunctSet();
        OWLClassExpression result21 = testSubject0.getNNF();
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectMinCardinalityImpl.class));
        assertTrue(OWLObjectMinCardinality.class.isAssignableFrom(OWLObjectMinCardinalityImpl.class));
    }

    public void verifyOWLObjectMinCardinalityImpl() {
        OWLObjectMinCardinalityImpl testSubject0 = new OWLObjectMinCardinalityImpl(_OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        OWLObject result3 = testSubject0.getProperty();
        OWLObjectPropertyExpression result4 = testSubject0.getProperty();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isQualified();
        boolean result7 = testSubject0.isDataRestriction();
        int result8 = testSubject0.getCardinality();
        OWLObject result9 = testSubject0.getFiller();
        java.lang.Object result10 = testSubject0.getFiller();
        boolean result11 = testSubject0.isClassExpressionLiteral();
        boolean result12 = testSubject0.isAnonymous();
        OWLClass result13 = testSubject0.asOWLClass();
        boolean result14 = testSubject0.isOWLThing();
        boolean result15 = testSubject0.isOWLNothing();
        OWLClassExpression result16 = testSubject0.getComplementNNF();
        OWLClassExpression result17 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result18 = testSubject0.asConjunctSet();
        boolean result19 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result20 = testSubject0.asDisjunctSet();
        OWLClassExpression result21 = testSubject0.getNNF();
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectOneOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLObjectOneOfImpl.class));
        assertTrue(OWLObjectOneOf.class.isAssignableFrom(OWLObjectOneOfImpl.class));
    }

    public void verifyOWLObjectOneOfImpl() {
        OWLObjectOneOfImpl testSubject0 = new OWLObjectOneOfImpl(_Set163);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        OWLClassExpression result4 = testSubject0.asObjectUnionOf();
        java.util.Set<OWLIndividual> result5 = testSubject0.getIndividuals();
        boolean result6 = testSubject0.isAnonymous();
        OWLClass result7 = testSubject0.asOWLClass();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLObjectPropertyAssertionAxiomImpl.class));
        assertTrue(OWLObjectPropertyAssertionAxiom.class.isAssignableFrom(OWLObjectPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyAssertionAxiomImpl() {
        OWLObjectPropertyAssertionAxiomImpl testSubject0 = new OWLObjectPropertyAssertionAxiomImpl(_OWLIndividual, _OWLObjectPropertyExpression, _OWLIndividual, _Set131);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObjectPropertyAssertionAxiom result2 = testSubject0.getSimplified();
        AxiomType<?> result3 = testSubject0.getAxiomType();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyAssertionAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyAssertionAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set127);
        boolean result8 = testSubject0.isInSimplifiedForm();
        OWLSubClassOfAxiom result9 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result10 = testSubject0.getProperty();
        java.lang.Object result11 = testSubject0.getProperty();
        OWLObject result12 = testSubject0.getObject();
        java.lang.Object result13 = testSubject0.getObject();
        OWLObject result14 = testSubject0.getSubject();
        OWLIndividual result15 = testSubject0.getSubject();
        boolean result16 = testSubject0.isLogicalAxiom();
        boolean result17 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result18 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result19 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result20 = testSubject0.isAnnotated();
        boolean result21 = testSubject0.isOfType(_Set129);
        boolean result22 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result23 = testSubject0.getNNF();
        boolean result24 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result26 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result27 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result28 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result29 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result30 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result31 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result32 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result33 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result34 = testSubject0.getNestedClassExpressions();
        boolean result35 = testSubject0.isTopEntity();
        boolean result36 = testSubject0.isBottomEntity();
        boolean result37 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyCharacteristicAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiomImpl.class));
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyCharacteristicAxiomImpl() {
        OWLObjectPropertyCharacteristicAxiomImpl testSubject0 = mock(OWLObjectPropertyCharacteristicAxiomImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set129);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result26 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        OWLAxiom result28 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result29 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyDomainAxiomImpl.class.isAssignableFrom(OWLObjectPropertyDomainAxiomImpl.class));
        assertTrue(OWLObjectPropertyDomainAxiom.class.isAssignableFrom(OWLObjectPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyDomainAxiomImpl() {
        OWLObjectPropertyDomainAxiomImpl testSubject0 = new OWLObjectPropertyDomainAxiomImpl(_OWLObjectPropertyExpression, _OWLClassExpression, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyDomainAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLObjectPropertyDomainAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLClassExpression result8 = testSubject0.getDomain();
        OWLObject result9 = testSubject0.getDomain();
        OWLObject result10 = testSubject0.getProperty();
        java.lang.Object result11 = testSubject0.getProperty();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set129);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        boolean result20 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
        boolean result33 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyExpressionImpl.class.isAssignableFrom(OWLObjectPropertyExpressionImpl.class));
        assertTrue(OWLObjectPropertyExpression.class.isAssignableFrom(OWLObjectPropertyExpressionImpl.class));
    }

    public void verifyOWLObjectPropertyExpressionImpl() {
        OWLObjectPropertyExpressionImpl testSubject0 = mock(OWLObjectPropertyExpressionImpl.class);
        OWLObjectProperty result0 = testSubject0.getNamedProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result2 = testSubject0.getSimplified();
        boolean result3 = testSubject0.isDataPropertyExpression();
        boolean result4 = testSubject0.isObjectPropertyExpression();
        int result6 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result7 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result12 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result13 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result14 = testSubject0.getNestedClassExpressions();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        boolean result17 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result18 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result19 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result20 = testSubject0.isOWLTopDataProperty();
        boolean result21 = testSubject0.isAnonymous();
        boolean result22 = testSubject0.isOWLTopObjectProperty();
        boolean result23 = testSubject0.isOWLBottomObjectProperty();
        boolean result24 = testSubject0.isOWLBottomDataProperty();
        OWLObjectProperty result25 = testSubject0.asOWLObjectProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyExpressionImpl.class.isAssignableFrom(OWLObjectPropertyImpl.class));
        assertTrue(OWLObjectProperty.class.isAssignableFrom(OWLObjectPropertyImpl.class));
    }

    public void verifyOWLObjectPropertyImpl() {
        OWLObjectPropertyImpl testSubject0 = new OWLObjectPropertyImpl(_IRI);
        boolean result0 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result1 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result4 = testSubject0.isOWLTopDataProperty();
        OWLObjectProperty result5 = testSubject0.asOWLObjectProperty();
        boolean result6 = testSubject0.isAnonymous();
        OWLClass result7 = testSubject0.asOWLClass();
        boolean result8 = testSubject0.isOWLTopObjectProperty();
        boolean result9 = testSubject0.isOWLBottomObjectProperty();
        boolean result10 = testSubject0.isOWLBottomDataProperty();
        IRI result11 = testSubject0.getIRI();
        boolean result12 = testSubject0.isTopEntity();
        boolean result13 = testSubject0.isBottomEntity();
        OWLDatatype result14 = testSubject0.asOWLDatatype();
        EntityType<?> result15 = testSubject0.getEntityType();
        boolean result16 = testSubject0.isBuiltIn();
        boolean result17 = testSubject0.isOWLClass();
        boolean result18 = testSubject0.isOWLObjectProperty();
        boolean result19 = testSubject0.isOWLDataProperty();
        OWLDataProperty result20 = testSubject0.asOWLDataProperty();
        boolean result21 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result22 = testSubject0.asOWLNamedIndividual();
        boolean result23 = testSubject0.isOWLDatatype();
        boolean result24 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result25 = testSubject0.asOWLAnnotationProperty();
        java.lang.String result26 = testSubject0.toStringID();
        OWLObjectProperty result27 = testSubject0.getNamedProperty();
        OWLObjectPropertyExpression result28 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result29 = testSubject0.getSimplified();
        boolean result30 = testSubject0.isDataPropertyExpression();
        boolean result31 = testSubject0.isObjectPropertyExpression();
        int result33 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result34 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result35 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result36 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result37 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result38 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result39 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result40 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result41 = testSubject0.getNestedClassExpressions();
        boolean result42 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyRangeAxiomImpl.class.isAssignableFrom(OWLObjectPropertyRangeAxiomImpl.class));
        assertTrue(OWLObjectPropertyRangeAxiom.class.isAssignableFrom(OWLObjectPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyRangeAxiomImpl() {
        OWLObjectPropertyRangeAxiomImpl testSubject0 = new OWLObjectPropertyRangeAxiomImpl(_OWLObjectPropertyExpression, _OWLClassExpression, _Set131);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyRangeAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLObjectPropertyRangeAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        java.lang.Object result8 = testSubject0.getRange();
        OWLObject result9 = testSubject0.getRange();
        OWLObject result10 = testSubject0.getProperty();
        java.lang.Object result11 = testSubject0.getProperty();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set129);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        boolean result20 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
        boolean result33 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFromImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedObjectRestrictionImpl.class.isAssignableFrom(OWLObjectSomeValuesFromImpl.class));
        assertTrue(OWLObjectSomeValuesFrom.class.isAssignableFrom(OWLObjectSomeValuesFromImpl.class));
    }

    public void verifyOWLObjectSomeValuesFromImpl() {
        OWLObjectSomeValuesFromImpl testSubject0 = new OWLObjectSomeValuesFromImpl(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.isObjectRestriction();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isDataRestriction();
        OWLObject result5 = testSubject0.getProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getProperty();
        java.lang.Object result7 = testSubject0.getFiller();
        OWLObject result8 = testSubject0.getFiller();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        boolean result12 = testSubject0.isOWLThing();
        boolean result13 = testSubject0.isOWLNothing();
        OWLClassExpression result14 = testSubject0.getComplementNNF();
        OWLClassExpression result15 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result16 = testSubject0.asConjunctSet();
        boolean result17 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result18 = testSubject0.asDisjunctSet();
        OWLClassExpression result19 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryBooleanClassExpressionImpl.class.isAssignableFrom(OWLObjectUnionOfImpl.class));
        assertTrue(OWLObjectUnionOf.class.isAssignableFrom(OWLObjectUnionOfImpl.class));
    }

    public void verifyOWLObjectUnionOfImpl() {
        OWLObjectUnionOfImpl testSubject0 = new OWLObjectUnionOfImpl(_Set154);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        java.util.Set<OWLClassExpression> result3 = testSubject0.asDisjunctSet();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        java.util.List<OWLClassExpression> result5 = testSubject0.getOperandsAsList();
        java.util.Set<OWLClassExpression> result6 = testSubject0.getOperands();
        boolean result7 = testSubject0.isAnonymous();
        OWLClass result8 = testSubject0.asOWLClass();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        OWLClassExpression result15 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
        boolean result28 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLOntologyBuilderImpl() {
        assertTrue(OWLOntologyBuilder.class.isAssignableFrom(OWLOntologyBuilderImpl.class));
    }

    public void verifyOWLOntologyBuilderImpl() {
        OWLOntologyBuilderImpl testSubject0 = new OWLOntologyBuilderImpl();
        OWLOntology result0 = testSubject0.createOWLOntology(_OWLOntologyManager, _OWLOntologyID);
    }

    @Test
    public void enforceInterfacesOWLOntologyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLImmutableOntologyImpl.class.isAssignableFrom(OWLOntologyImpl.class));
        assertTrue(OWLMutableOntology.class.isAssignableFrom(OWLOntologyImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyImpl.class));
    }

    public void verifyOWLOntologyImpl() {
        OWLOntologyImpl testSubject0 = new OWLOntologyImpl(_OWLOntologyManager, _OWLOntologyID);
        java.util.List<OWLOntologyChange<?>> result0 = testSubject0.applyChanges(_List188);
        OWLOntologyChange<java.lang.Object> result1 = testSubject0.applyChange(_OWLOntologyChange);
        boolean result2 = testSubject0.isEmpty();
        boolean result3 = testSubject0.contains(_OWLAxiomSearchFilter, _Object, _import);
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature(_import);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        boolean result8 = testSubject0.isAnonymous();
        OWLOntologyID result9 = testSubject0.getOntologyID();
        OWLOntologyManager result10 = testSubject0.getOWLOntologyManager();
        java.util.Set<OWLOntology> result11 = testSubject0.getDirectImports();
        java.util.Set<IRI> result12 = testSubject0.getDirectImportsDocuments();
        java.util.Set<OWLOntology> result13 = testSubject0.getImports();
        java.util.Set<OWLOntology> result14 = testSubject0.getImportsClosure();
        java.util.Set<OWLImportsDeclaration> result15 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result16 = testSubject0.getTBoxAxioms(_import);
        java.util.Set<OWLAxiom> result17 = testSubject0.getABoxAxioms(_import);
        java.util.Set<OWLAxiom> result18 = testSubject0.getRBoxAxioms(_import);
        java.util.Set<OWLClassAxiom> result19 = testSubject0.getGeneralClassAxioms();
        boolean result20 = testSubject0.isDeclared(_OWLEntity);
        boolean result21 = testSubject0.isDeclared(_OWLEntity, _import);
        java.util.Set<OWLObjectPropertyAxiom> result22 = testSubject0.getAxioms(_OWLObjectPropertyExpression, _import);
        java.util.Set<OWLClassAxiom> result23 = testSubject0.getAxioms(_OWLClass, _import);
        Set<OWLAxiom> result24 = testSubject0.getAxioms(_Class, _Class151, _OWLObject, _import, _ignore);
        java.util.Set<OWLAxiom> result25 = testSubject0.getAxioms();
        java.util.Set<OWLAxiom> result26 = testSubject0.getAxioms(_import);
        Set<?> result27 = testSubject0.getAxioms(_AxiomType104);
        Set<OWLAxiom> result28 = testSubject0.getAxioms(_Class, _OWLObject, _import, _ignore);
        Set<?> result29 = testSubject0.getAxioms(_AxiomType104, _import);
        java.util.Set<OWLDataPropertyAxiom> result30 = testSubject0.getAxioms(_OWLDataProperty, _import);
        java.util.Set<OWLAnnotationAxiom> result31 = testSubject0.getAxioms(_OWLAnnotationProperty, _import);
        java.util.Set<OWLDatatypeDefinitionAxiom> result32 = testSubject0.getAxioms(_OWLDatatype, _import);
        java.util.Set<OWLIndividualAxiom> result33 = testSubject0.getAxioms(_OWLIndividual, _import);
        boolean result34 = testSubject0.containsAxiom(_OWLAxiom101, _import, _ignore);
        boolean result35 = testSubject0.containsAxiom(_OWLAxiom101);
        java.util.Set<OWLEntity> result36 = testSubject0.getEntitiesInSignature(_IRI, _import);
        java.util.Set<OWLEntity> result37 = testSubject0.getEntitiesInSignature(_IRI);
        java.util.Set<OWLLogicalAxiom> result38 = testSubject0.getLogicalAxioms(_import);
        java.util.Set<OWLLogicalAxiom> result39 = testSubject0.getLogicalAxioms();
        int result40 = testSubject0.getAxiomCount(_AxiomType104);
        int result41 = testSubject0.getAxiomCount(_import);
        int result42 = testSubject0.getAxiomCount(_AxiomType104, _import);
        int result43 = testSubject0.getAxiomCount();
        java.util.Set<OWLAnonymousIndividual> result44 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result45 = testSubject0.getClassesInSignature();
        java.util.Set<OWLClass> result46 = testSubject0.getClassesInSignature(_import);
        java.util.Set<OWLDataProperty> result47 = testSubject0.getDataPropertiesInSignature(_import);
        java.util.Set<OWLDataProperty> result48 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result49 = testSubject0.getObjectPropertiesInSignature(_import);
        java.util.Set<OWLObjectProperty> result50 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result51 = testSubject0.getIndividualsInSignature(_import);
        java.util.Set<OWLNamedIndividual> result52 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result53 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLDatatype> result54 = testSubject0.getDatatypesInSignature(_import);
        boolean result55 = testSubject0.containsEntityInSignature(_IRI, _import);
        boolean result56 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result57 = testSubject0.containsEntityInSignature(_OWLEntity, _import);
        int result58 = testSubject0.getLogicalAxiomCount(_import);
        int result59 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLAxiom> result60 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom101, _import);
        java.util.Set<OWLAxiom> result61 = testSubject0.getReferencingAxioms(_OWLPrimitive, _import);
        boolean result62 = testSubject0.containsReference(_OWLEntity, _import);
        java.util.Set<OWLAnonymousIndividual> result63 = testSubject0.getReferencedAnonymousIndividuals(_import);
        java.util.Set<OWLAnnotationProperty> result64 = testSubject0.getAnnotationPropertiesInSignature(_import);
        boolean result65 = testSubject0.containsClassInSignature(_IRI, _import);
        boolean result66 = testSubject0.containsObjectPropertyInSignature(_IRI, _import);
        boolean result67 = testSubject0.containsDataPropertyInSignature(_IRI, _import);
        boolean result68 = testSubject0.containsAnnotationPropertyInSignature(_IRI, _import);
        boolean result69 = testSubject0.containsIndividualInSignature(_IRI, _import);
        boolean result70 = testSubject0.containsDatatypeInSignature(_IRI, _import);
        java.util.Collection<OWLAxiom> result71 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object, _import);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result72 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result73 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result74 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result75 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result76 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result77 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result78 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result79 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result80 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result81 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result82 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result83 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result84 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result85 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result86 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result87 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result88 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result89 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result90 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result91 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result92 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result93 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result94 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result95 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result96 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result97 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result98 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result99 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result100 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result101 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result102 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result103 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result104 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLClassAssertionAxiom> result105 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLDataPropertyAssertionAxiom> result106 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result107 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result108 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result109 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result110 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result111 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result112 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
        int result114 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLClassExpression> result115 = testSubject0.getNestedClassExpressions();
        boolean result116 = testSubject0.isTopEntity();
        boolean result117 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLOntologyIRIMapperImpl() {
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(OWLOntologyIRIMapperImpl.class));
    }

    public void verifyOWLOntologyIRIMapperImpl() {
        OWLOntologyIRIMapperImpl testSubject0 = new OWLOntologyIRIMapperImpl();
        testSubject0.addMapping(_IRI, _IRI);
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyManagerImpl() {
        assertTrue(OWLOntologyManager.class.isAssignableFrom(OWLOntologyManagerImpl.class));
        assertTrue(OWLOntologyFactory.OWLOntologyCreationHandler.class.isAssignableFrom(OWLOntologyManagerImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyManagerImpl.class));
    }

    public void verifyOWLOntologyManagerImpl() throws OWLOntologyCreationException, UnknownOWLOntologyException, OWLOntologyStorageException {
        OWLOntologyManagerImpl testSubject0 = new OWLOntologyManagerImpl(_OWLDataFactory);
        boolean result0 = testSubject0.contains(_OWLOntology);
        boolean result1 = testSubject0.contains(_OWLOntologyID);
        boolean result2 = testSubject0.contains(_IRI);
        java.util.Set<OWLOntology> result3 = testSubject0.getDirectImports(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0.getImports(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0.getImportsClosure(_OWLOntology);
        testSubject0.ontologyCreated(_OWLOntology);
        OWLDataFactory result6 = testSubject0.getOWLDataFactory();
        java.util.Set<OWLOntology> result7 = testSubject0.getVersions(_IRI);
        java.util.Set<OWLOntology> result8 = testSubject0.getOntologies();
        java.util.Set<OWLOntology> result9 = testSubject0.getOntologies(_OWLAxiom101);
        boolean result10 = testSubject0.containsVersion(_IRI);
        java.util.Set<OWLOntologyID> result11 = testSubject0.getOntologyIDsByVersion(_IRI);
        OWLOntology result12 = testSubject0.getOntology(_OWLOntologyID);
        OWLOntology result13 = testSubject0.getOntology(_IRI);
        OWLOntology result14 = testSubject0.getImportedOntology(_OWLImportsDeclaration);
        java.util.List<OWLOntology> result15 = testSubject0.getSortedImportsClosure(_OWLOntology);
        java.util.List<OWLOntologyChange<?>> result16 = testSubject0.applyChanges(_List188);
        java.util.List<OWLOntologyChange<?>> result17 = testSubject0.addAxioms(_OWLOntology, _Set191);
        java.util.List<OWLOntologyChange<?>> result18 = testSubject0.addAxiom(_OWLOntology, _OWLAxiom101);
        java.util.List<OWLOntologyChange<?>> result19 = testSubject0.removeAxiom(_OWLOntology, _OWLAxiom101);
        java.util.List<OWLOntologyChange<?>> result20 = testSubject0.removeAxioms(_OWLOntology, _Set191);
        java.util.List<OWLOntologyChange<?>> result21 = testSubject0.applyChange(_OWLOntologyChange192);
        OWLOntology result22 = testSubject0.createOntology(_Set193);
        OWLOntology result23 = testSubject0.createOntology(_Set193, _IRI);
        OWLOntology result24 = testSubject0.createOntology(_IRI);
        OWLOntology result25 = testSubject0.createOntology(_OWLOntologyID);
        OWLOntology result26 = testSubject0.createOntology(_IRI, _Set194);
        OWLOntology result27 = testSubject0.createOntology();
        OWLOntology result28 = testSubject0.createOntology(_IRI, _Set194, _boolean);
        OWLOntology result29 = testSubject0.loadOntology(_IRI);
        OWLOntology result30 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource);
        OWLOntology result31 = testSubject0.loadOntologyFromOntologyDocument(_InputStream);
        OWLOntology result32 = testSubject0.loadOntologyFromOntologyDocument(_File);
        OWLOntology result33 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource, _OWLOntologyLoaderConfiguration);
        OWLOntology result34 = testSubject0.loadOntologyFromOntologyDocument(_IRI);
        testSubject0.removeOntology(_OWLOntology);
        testSubject0.removeOntology(_OWLOntologyID);
        IRI result35 = testSubject0.getOntologyDocumentIRI(_OWLOntology);
        testSubject0.setOntologyDocumentIRI(_OWLOntology, _IRI);
        OWLOntologyFormat result36 = testSubject0.getOntologyFormat(_OWLOntology);
        testSubject0.setOntologyFormat(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _IRI);
        testSubject0.saveOntology(_OWLOntology, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OWLOntologyDocumentTarget);
        testSubject0.setIRIMappers(_Set200);
        org.semanticweb.owlapi.util.PriorityCollection<OWLOntologyIRIMapper> result37 = testSubject0.getIRIMappers();
        testSubject0.setOntologyParsers(_Set201);
        org.semanticweb.owlapi.util.PriorityCollection<org.semanticweb.owlapi.io.OWLParser> result38 = testSubject0.getOntologyParsers();
        testSubject0.setOntologyFactories(_Set202);
        org.semanticweb.owlapi.util.PriorityCollection<OWLOntologyFactory> result39 = testSubject0.getOntologyFactories();
        testSubject0.setOntologyStorers(_Set203);
        org.semanticweb.owlapi.util.PriorityCollection<OWLOntologyStorer> result40 = testSubject0.getOntologyStorers();
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener, _OWLOntologyChangeBroadcastStrategy);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.addImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.removeImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.addOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0.removeOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0.setDefaultChangeBroadcastStrategy(_OWLOntologyChangeBroadcastStrategy);
        testSubject0.removeOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration, _OWLOntologyLoaderConfiguration);
        testSubject0.addMissingImportListener(_MissingImportListener);
        testSubject0.removeMissingImportListener(_MissingImportListener);
        testSubject0.addOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.removeOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.addOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0.removeOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
    }

    @Test
    public void enforceInterfacesOWLPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLPropertyAxiomImpl.class));
        assertTrue(OWLPropertyAxiom.class.isAssignableFrom(OWLPropertyAxiomImpl.class));
    }

    public void verifyOWLPropertyAxiomImpl() {
        OWLPropertyAxiomImpl testSubject0 = mock(OWLPropertyAxiomImpl.class);
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result4 = testSubject0.isAnnotated();
        boolean result5 = testSubject0.isOfType(_Set129);
        boolean result6 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result7 = testSubject0.getNNF();
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        boolean result21 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result23 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result24 = testSubject0.getAxiomType();
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLUnaryPropertyAxiomImpl.class.isAssignableFrom(OWLPropertyDomainAxiomImpl.class));
        assertTrue(OWLPropertyDomainAxiom.class.isAssignableFrom(OWLPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLPropertyDomainAxiomImpl() {
        OWLPropertyDomainAxiomImpl<OWLPropertyExpression> testSubject0 = mock(OWLPropertyDomainAxiomImpl.class);
        OWLClassExpression result0 = testSubject0.getDomain();
        OWLObject result1 = testSubject0.getDomain();
        OWLObject result2 = testSubject0.getProperty();
        java.lang.Object result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isLogicalAxiom();
        boolean result5 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result8 = testSubject0.isAnnotated();
        boolean result9 = testSubject0.isOfType(_Set129);
        boolean result10 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result27 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result28 = testSubject0.getAxiomType();
        OWLAxiom result29 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result30 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result31 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLPropertyExpressionImpl.class));
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLPropertyExpressionImpl.class));
    }

    public void verifyOWLPropertyExpressionImpl() {
        OWLPropertyExpressionImpl testSubject0 = mock(OWLPropertyExpressionImpl.class);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result3 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        boolean result12 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result14 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        boolean result15 = testSubject0.isOWLTopDataProperty();
        boolean result16 = testSubject0.isAnonymous();
        boolean result17 = testSubject0.isDataPropertyExpression();
        boolean result18 = testSubject0.isObjectPropertyExpression();
        boolean result19 = testSubject0.isOWLTopObjectProperty();
        boolean result20 = testSubject0.isOWLBottomObjectProperty();
        boolean result21 = testSubject0.isOWLBottomDataProperty();
    }

    @Test
    public void enforceInterfacesOWLPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLUnaryPropertyAxiomImpl.class.isAssignableFrom(OWLPropertyRangeAxiomImpl.class));
        assertTrue(OWLPropertyRangeAxiom.class.isAssignableFrom(OWLPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLPropertyRangeAxiomImpl() {
        OWLPropertyRangeAxiomImpl<OWLPropertyExpression, OWLPropertyRange> testSubject0 = mock(OWLPropertyRangeAxiomImpl.class);
        java.lang.Object result0 = testSubject0.getRange();
        OWLPropertyRange result1 = testSubject0.getRange();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        java.lang.Object result3 = testSubject0.getProperty();
        boolean result4 = testSubject0.isLogicalAxiom();
        boolean result5 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result8 = testSubject0.isAnnotated();
        boolean result9 = testSubject0.isOfType(_Set129);
        boolean result10 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result27 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result28 = testSubject0.getAxiomType();
        OWLAxiom result29 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result30 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result31 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedDataRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedRestrictionImpl.class.isAssignableFrom(OWLQuantifiedDataRestrictionImpl.class));
        assertTrue(OWLDataRestriction.class.isAssignableFrom(OWLQuantifiedDataRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedDataRestrictionImpl() {
        OWLQuantifiedDataRestrictionImpl testSubject0 = mock(OWLQuantifiedDataRestrictionImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLDataPropertyExpression result1 = testSubject0.getProperty();
        java.lang.Object result2 = testSubject0.getFiller();
        OWLObject result3 = testSubject0.getFiller();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isAnonymous();
        OWLClass result6 = testSubject0.asOWLClass();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        int result16 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result28 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result29 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result30 = testSubject0.getClassExpressionType();
        boolean result31 = testSubject0.isObjectRestriction();
        boolean result32 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedObjectRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedRestrictionImpl.class.isAssignableFrom(OWLQuantifiedObjectRestrictionImpl.class));
        assertTrue(OWLObjectRestriction.class.isAssignableFrom(OWLQuantifiedObjectRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedObjectRestrictionImpl() {
        OWLQuantifiedObjectRestrictionImpl testSubject0 = mock(OWLQuantifiedObjectRestrictionImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        java.lang.Object result2 = testSubject0.getFiller();
        OWLObject result3 = testSubject0.getFiller();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        boolean result5 = testSubject0.isAnonymous();
        OWLClass result6 = testSubject0.asOWLClass();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        int result16 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
        boolean result27 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result28 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result29 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result30 = testSubject0.getClassExpressionType();
        boolean result31 = testSubject0.isObjectRestriction();
        boolean result32 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLQuantifiedRestrictionImpl.class));
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLQuantifiedRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedRestrictionImpl() {
        OWLQuantifiedRestrictionImpl<OWLPropertyRange> testSubject0 = mock(OWLQuantifiedRestrictionImpl.class);
        OWLPropertyRange result0 = testSubject0.getFiller();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isAnonymous();
        OWLClass result4 = testSubject0.asOWLClass();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        boolean result25 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result27 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result28 = testSubject0.getClassExpressionType();
        boolean result29 = testSubject0.isObjectRestriction();
        boolean result30 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLReflexiveObjectPropertyAxiomImpl.class));
        assertTrue(OWLReflexiveObjectPropertyAxiom.class.isAssignableFrom(OWLReflexiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLReflexiveObjectPropertyAxiomImpl() {
        OWLReflexiveObjectPropertyAxiomImpl testSubject0 = new OWLReflexiveObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLReflexiveObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLReflexiveObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        OWLSubClassOfAxiom result7 = testSubject0.asOWLSubClassOfAxiom();
        OWLObject result8 = testSubject0.getProperty();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObjectPropertyExpression result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLRestrictionImpl.class));
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLRestrictionImpl.class));
    }

    public void verifyOWLRestrictionImpl() {
        OWLRestrictionImpl testSubject0 = mock(OWLRestrictionImpl.class);
        boolean result0 = testSubject0.isClassExpressionLiteral();
        boolean result1 = testSubject0.isAnonymous();
        OWLClass result2 = testSubject0.asOWLClass();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result14 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        boolean result23 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result25 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result26 = testSubject0.getClassExpressionType();
        boolean result27 = testSubject0.isObjectRestriction();
        boolean result28 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLSameIndividualAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryIndividualAxiomImpl.class.isAssignableFrom(OWLSameIndividualAxiomImpl.class));
        assertTrue(OWLSameIndividualAxiom.class.isAssignableFrom(OWLSameIndividualAxiomImpl.class));
    }

    public void verifyOWLSameIndividualAxiomImpl() {
        OWLSameIndividualAxiomImpl testSubject0 = new OWLSameIndividualAxiomImpl(_Set163, _Set131);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        java.util.Set<OWLSameIndividualAxiom> result2 = testSubject0.asPairwiseAxioms();
        boolean result3 = testSubject0.containsAnonymousIndividuals();
        java.util.Set<OWLSubClassOfAxiom> result4 = testSubject0.asOWLSubClassOfAxioms();
        AxiomType<?> result5 = testSubject0.getAxiomType();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLSameIndividualAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSameIndividualAxiom result9 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.List<OWLIndividual> result10 = testSubject0.getIndividualsAsList();
        java.util.Collection<java.lang.Object> result11 = testSubject0.walkPairwise(_OWLPairwiseVisitor);
        java.util.Set<OWLIndividual> result12 = testSubject0.getIndividuals();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set129);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        boolean result21 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLSubAnnotationPropertyOfAxiomImpl.class));
        assertTrue(OWLSubAnnotationPropertyOfAxiom.class.isAssignableFrom(OWLSubAnnotationPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubAnnotationPropertyOfAxiomImpl() {
        OWLSubAnnotationPropertyOfAxiomImpl testSubject0 = new OWLSubAnnotationPropertyOfAxiomImpl(_OWLAnnotationProperty, _OWLAnnotationProperty, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLAnnotationProperty result2 = testSubject0.getSubProperty();
        OWLAnnotationProperty result3 = testSubject0.getSuperProperty();
        boolean result4 = testSubject0.isLogicalAxiom();
        boolean result5 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubAnnotationPropertyOfAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSubAnnotationPropertyOfAxiom result10 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set129);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubClassOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class.isAssignableFrom(OWLSubClassOfAxiomImpl.class));
        assertTrue(OWLSubClassOfAxiom.class.isAssignableFrom(OWLSubClassOfAxiomImpl.class));
    }

    public void verifyOWLSubClassOfAxiomImpl() {
        OWLSubClassOfAxiomImpl testSubject0 = new OWLSubClassOfAxiomImpl(_OWLClassExpression, _OWLClassExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx125);
        boolean result2 = testSubject0.isGCI();
        OWLClassExpression result3 = testSubject0.getSubClass();
        OWLClassExpression result4 = testSubject0.getSuperClass();
        AxiomType<?> result5 = testSubject0.getAxiomType();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubClassOfAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubClassOfAxiom result8 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set127);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set129);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLSubPropertyAxiomImpl.class.isAssignableFrom(OWLSubDataPropertyOfAxiomImpl.class));
        assertTrue(OWLSubDataPropertyOfAxiom.class.isAssignableFrom(OWLSubDataPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubDataPropertyOfAxiomImpl() {
        OWLSubDataPropertyOfAxiomImpl testSubject0 = new OWLSubDataPropertyOfAxiomImpl(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubDataPropertyOfAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSubDataPropertyOfAxiom result6 = testSubject0.getAnnotatedAxiom(_Set);
        java.lang.Object result7 = testSubject0.getSubProperty();
        java.lang.Object result8 = testSubject0.getSuperProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set129);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLSubPropertyAxiomImpl.class.isAssignableFrom(OWLSubObjectPropertyOfAxiomImpl.class));
        assertTrue(OWLSubObjectPropertyOfAxiom.class.isAssignableFrom(OWLSubObjectPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubObjectPropertyOfAxiomImpl() {
        OWLSubObjectPropertyOfAxiomImpl testSubject0 = new OWLSubObjectPropertyOfAxiomImpl(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubObjectPropertyOfAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubObjectPropertyOfAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set127);
        java.lang.Object result7 = testSubject0.getSubProperty();
        java.lang.Object result8 = testSubject0.getSuperProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set129);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLSubPropertyAxiomImpl.class));
        assertTrue(OWLSubPropertyAxiom.class.isAssignableFrom(OWLSubPropertyAxiomImpl.class));
    }

    public void verifyOWLSubPropertyAxiomImpl() {
        OWLSubPropertyAxiomImpl<OWLPropertyExpression> testSubject0 = mock(OWLSubPropertyAxiomImpl.class);
        OWLPropertyExpression result0 = testSubject0.getSubProperty();
        OWLPropertyExpression result1 = testSubject0.getSuperProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result6 = testSubject0.isAnnotated();
        boolean result7 = testSubject0.isOfType(_Set129);
        boolean result8 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result9 = testSubject0.getNNF();
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result14 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        boolean result23 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result25 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result26 = testSubject0.getAxiomType();
        OWLAxiom result27 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result28 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLSubPropertyChainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLSubPropertyChainAxiomImpl.class));
        assertTrue(OWLSubPropertyChainOfAxiom.class.isAssignableFrom(OWLSubPropertyChainAxiomImpl.class));
    }

    public void verifyOWLSubPropertyChainAxiomImpl() {
        OWLSubPropertyChainAxiomImpl testSubject0 = new OWLSubPropertyChainAxiomImpl(_List, _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.isEncodingOfTransitiveProperty();
        OWLObjectPropertyExpression result3 = testSubject0.getSuperProperty();
        java.util.List<OWLObjectPropertyExpression> result4 = testSubject0.getPropertyChain();
        AxiomType<?> result5 = testSubject0.getAxiomType();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubPropertyChainOfAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubPropertyChainOfAxiom result8 = testSubject0.getAnnotatedAxiom(_Set);
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set127);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set129);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
        boolean result31 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLSymmetricObjectPropertyAxiomImpl.class));
        assertTrue(OWLSymmetricObjectPropertyAxiom.class.isAssignableFrom(OWLSymmetricObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLSymmetricObjectPropertyAxiomImpl() {
        OWLSymmetricObjectPropertyAxiomImpl testSubject0 = new OWLSymmetricObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result2 = testSubject0.asSubPropertyAxioms();
        AxiomType<?> result3 = testSubject0.getAxiomType();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLSymmetricObjectPropertyAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set127);
        OWLSymmetricObjectPropertyAxiom result7 = testSubject0.getAnnotatedAxiom(_Set);
        OWLObject result8 = testSubject0.getProperty();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObjectPropertyExpression result10 = testSubject0.getProperty();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set129);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLTransitiveObjectPropertyAxiomImpl.class));
        assertTrue(OWLTransitiveObjectPropertyAxiom.class.isAssignableFrom(OWLTransitiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLTransitiveObjectPropertyAxiomImpl() {
        OWLTransitiveObjectPropertyAxiomImpl testSubject0 = new OWLTransitiveObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx125);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        AxiomType<?> result2 = testSubject0.getAxiomType();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLTransitiveObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set);
        OWLObject result6 = testSubject0.getProperty();
        OWLPropertyExpression result7 = testSubject0.getProperty();
        OWLObjectPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set129);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
        boolean result30 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesOWLUnaryPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLUnaryPropertyAxiomImpl.class));
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLUnaryPropertyAxiomImpl.class));
    }

    public void verifyOWLUnaryPropertyAxiomImpl() {
        OWLUnaryPropertyAxiomImpl<OWLPropertyExpression> testSubject0 = mock(OWLUnaryPropertyAxiomImpl.class);
        OWLObject result0 = testSubject0.getProperty();
        java.lang.Object result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result6 = testSubject0.isAnnotated();
        boolean result7 = testSubject0.isOfType(_Set129);
        boolean result8 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result9 = testSubject0.getNNF();
        boolean result10 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result14 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        boolean result23 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result25 = testSubject0.accept(_OWLAxiomVisitorEx125);
        AxiomType<?> result26 = testSubject0.getAxiomType();
        OWLAxiom result27 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result28 = testSubject0.getAnnotatedAxiom(_Set);
    }

    @Test
    public void enforceInterfacesOWLValueRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLValueRestrictionImpl.class));
        assertTrue(OWLHasValueRestriction.class.isAssignableFrom(OWLValueRestrictionImpl.class));
    }

    public void verifyOWLValueRestrictionImpl() {
        OWLValueRestrictionImpl<OWLObject> testSubject0 = mock(OWLValueRestrictionImpl.class);
        java.lang.Object result0 = testSubject0.getFiller();
        boolean result1 = testSubject0.isClassExpressionLiteral();
        boolean result2 = testSubject0.isAnonymous();
        OWLClass result3 = testSubject0.asOWLClass();
        boolean result4 = testSubject0.isOWLThing();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        boolean result24 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result27 = testSubject0.getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
        OWLClassExpression result30 = testSubject0.asSomeValuesFrom();
    }

    @Test
    public void enforceInterfacesParsableOWLOntologyFactory() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInMemOWLOntologyFactory.class.isAssignableFrom(ParsableOWLOntologyFactory.class));
    }

    public void verifyParsableOWLOntologyFactory() throws OWLOntologyCreationException {
        ParsableOWLOntologyFactory testSubject0 = new ParsableOWLOntologyFactory(_OWLOntologyBuilder);
        boolean result0 = testSubject0.canCreateFromDocumentIRI(_IRI);
        OWLOntology result1 = testSubject0.loadOWLOntology(_OWLOntologyManager, _OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        boolean result2 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        OWLOntology result3 = testSubject0.createOWLOntology(_OWLOntologyManager, _OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
    }

    @Test
    public void enforceInterfacesSWRLAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLAtomImpl.class));
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLAtomImpl.class));
    }

    public void verifySWRLAtomImpl() {
        SWRLAtomImpl testSubject0 = mock(SWRLAtomImpl.class);
        SWRLPredicate result0 = testSubject0.getPredicate();
        int result2 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result5 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        boolean result13 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result14 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Collection<SWRLArgument> result15 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result16 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLBinaryAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class.isAssignableFrom(SWRLBinaryAtomImpl.class));
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLBinaryAtomImpl.class));
    }

    public void verifySWRLBinaryAtomImpl() {
        SWRLBinaryAtomImpl<SWRLArgument, SWRLArgument> testSubject0 = mock(SWRLBinaryAtomImpl.class);
        java.lang.Object result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result2 = testSubject0.getAllArguments();
        SWRLPredicate result3 = testSubject0.getPredicate();
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result8 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        boolean result16 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result17 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result18 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class.isAssignableFrom(SWRLBuiltInAtomImpl.class));
        assertTrue(SWRLBuiltInAtom.class.isAssignableFrom(SWRLBuiltInAtomImpl.class));
    }

    public void verifySWRLBuiltInAtomImpl() {
        SWRLBuiltInAtomImpl testSubject0 = new SWRLBuiltInAtomImpl(_IRI, _List175);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.isCoreBuiltIn();
        java.util.List<SWRLDArgument> result3 = testSubject0.getArguments();
        SWRLPredicate result4 = testSubject0.getPredicate();
        IRI result5 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result6 = testSubject0.getAllArguments();
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLClassAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLUnaryAtomImpl.class.isAssignableFrom(SWRLClassAtomImpl.class));
        assertTrue(SWRLClassAtom.class.isAssignableFrom(SWRLClassAtomImpl.class));
    }

    public void verifySWRLClassAtomImpl() {
        SWRLClassAtomImpl testSubject0 = new SWRLClassAtomImpl(_OWLClassExpression, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLClassExpression result3 = testSubject0.getPredicate();
        java.lang.Object result4 = testSubject0.getArgument();
        java.util.Collection<SWRLArgument> result5 = testSubject0.getAllArguments();
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLDataPropertyAtomImpl.class));
        assertTrue(SWRLDataPropertyAtom.class.isAssignableFrom(SWRLDataPropertyAtomImpl.class));
    }

    public void verifySWRLDataPropertyAtomImpl() {
        SWRLDataPropertyAtomImpl testSubject0 = new SWRLDataPropertyAtomImpl(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLDataPropertyExpression result3 = testSubject0.getPredicate();
        java.lang.Object result4 = testSubject0.getFirstArgument();
        SWRLArgument result5 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result6 = testSubject0.getAllArguments();
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        boolean result19 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLUnaryAtomImpl.class.isAssignableFrom(SWRLDataRangeAtomImpl.class));
        assertTrue(SWRLDataRangeAtom.class.isAssignableFrom(SWRLDataRangeAtomImpl.class));
    }

    public void verifySWRLDataRangeAtomImpl() {
        SWRLDataRangeAtomImpl testSubject0 = new SWRLDataRangeAtomImpl(_OWLDataRange, _SWRLDArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLDataRange result3 = testSubject0.getPredicate();
        java.lang.Object result4 = testSubject0.getArgument();
        java.util.Collection<SWRLArgument> result5 = testSubject0.getAllArguments();
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLDifferentIndividualsAtomImpl.class));
        assertTrue(SWRLDifferentIndividualsAtom.class.isAssignableFrom(SWRLDifferentIndividualsAtomImpl.class));
    }

    public void verifySWRLDifferentIndividualsAtomImpl() {
        SWRLDifferentIndividualsAtomImpl testSubject0 = new SWRLDifferentIndividualsAtomImpl(_OWLObjectProperty, _SWRLIArgument, _SWRLIArgument);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.lang.Object result2 = testSubject0.getFirstArgument();
        SWRLArgument result3 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        SWRLPredicate result5 = testSubject0.getPredicate();
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLIndividualArgumentImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLIndividualArgumentImpl.class));
        assertTrue(SWRLIndividualArgument.class.isAssignableFrom(SWRLIndividualArgumentImpl.class));
    }

    public void verifySWRLIndividualArgumentImpl() {
        SWRLIndividualArgumentImpl testSubject0 = new SWRLIndividualArgumentImpl(_OWLIndividual);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLIndividual result2 = testSubject0.getIndividual();
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLLiteralArgumentImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLLiteralArgumentImpl.class));
        assertTrue(SWRLLiteralArgument.class.isAssignableFrom(SWRLLiteralArgumentImpl.class));
    }

    public void verifySWRLLiteralArgumentImpl() {
        SWRLLiteralArgumentImpl testSubject0 = new SWRLLiteralArgumentImpl(_OWLLiteral);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLLiteral result2 = testSubject0.getLiteral();
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLObjectPropertyAtomImpl.class));
        assertTrue(SWRLObjectPropertyAtom.class.isAssignableFrom(SWRLObjectPropertyAtomImpl.class));
    }

    public void verifySWRLObjectPropertyAtomImpl() {
        SWRLObjectPropertyAtomImpl testSubject0 = new SWRLObjectPropertyAtomImpl(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        SWRLObjectPropertyAtom result2 = testSubject0.getSimplified();
        SWRLPredicate result3 = testSubject0.getPredicate();
        OWLObjectPropertyExpression result4 = testSubject0.getPredicate();
        java.lang.Object result5 = testSubject0.getFirstArgument();
        SWRLArgument result6 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result7 = testSubject0.getAllArguments();
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
        boolean result20 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLRuleImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(SWRLRuleImpl.class));
        assertTrue(SWRLRule.class.isAssignableFrom(SWRLRuleImpl.class));
    }

    public void verifySWRLRuleImpl() {
        SWRLRuleImpl testSubject0 = new SWRLRuleImpl(_Set172, _Set172);
        SWRLRuleImpl testSubject1 = new SWRLRuleImpl(_Set172, _Set172, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx125);
        SWRLRule result3 = testSubject0.getSimplified();
        java.util.Set<SWRLAtom> result4 = testSubject0.getBody();
        java.util.Set<SWRLAtom> result5 = testSubject0.getHead();
        boolean result6 = testSubject0.isLogicalAxiom();
        AxiomType<?> result7 = testSubject0.getAxiomType();
        SWRLRule result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set);
        java.util.Set<SWRLVariable> result11 = testSubject0.getVariables();
        boolean result12 = testSubject0.containsAnonymousClassExpressions();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getClassAtomPredicates();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        testSubject0.accept(_CollectionContainerVisitor128);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set129);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        boolean result21 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom101);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
        boolean result34 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLSameIndividualAtomImpl.class));
        assertTrue(SWRLSameIndividualAtom.class.isAssignableFrom(SWRLSameIndividualAtomImpl.class));
    }

    public void verifySWRLSameIndividualAtomImpl() {
        SWRLSameIndividualAtomImpl testSubject0 = new SWRLSameIndividualAtomImpl(_OWLObjectProperty, _SWRLIArgument, _SWRLIArgument);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.lang.Object result2 = testSubject0.getFirstArgument();
        SWRLArgument result3 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        SWRLPredicate result5 = testSubject0.getPredicate();
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result9 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
        boolean result18 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    @Test
    public void enforceInterfacesSWRLUnaryAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class.isAssignableFrom(SWRLUnaryAtomImpl.class));
        assertTrue(SWRLUnaryAtom.class.isAssignableFrom(SWRLUnaryAtomImpl.class));
    }

    public void verifySWRLUnaryAtomImpl() {
        SWRLUnaryAtomImpl<SWRLArgument> testSubject0 = mock(SWRLUnaryAtomImpl.class);
        java.lang.Object result0 = testSubject0.getArgument();
        java.util.Collection<SWRLArgument> result1 = testSubject0.getAllArguments();
        SWRLPredicate result2 = testSubject0.getPredicate();
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.containsEntityInSignature(_OWLEntity);
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result17 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLVariableImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLVariableImpl.class));
        assertTrue(SWRLVariable.class.isAssignableFrom(SWRLVariableImpl.class));
    }

    public void verifySWRLVariableImpl() {
        SWRLVariableImpl testSubject0 = mock(SWRLVariableImpl.class);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        IRI result2 = testSubject0.getIRI();
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLAnonymousIndividual> result6 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.containsEntityInSignature(_OWLEntity);
    }

    private Imports _import;
    private Search _ignore;
    private boolean _boolean;
    private byte[] _byte_array;
    private com.google.inject.Binder _Binder;
    private double _double;
    private float _float;
    private int _int;
    private java.io.File _File;
    private java.io.InputStream _InputStream;
    private java.io.OutputStream _OutputStream;
    private java.lang.Class<? extends OWLObject> _Class151;
    private java.lang.Class<OWLAxiom> _Class;
    private OWLAxiom _OWLAxiom;
    private java.lang.Object _Object;
    private java.lang.String _String;
    private java.util.Collection<? extends OWLAnnotation> _Collection;
    private java.util.Collection<OWLAnonymousIndividual> _Collection182;
    private java.util.List<? extends OWLObjectPropertyExpression> _List;
    private java.util.List<? extends OWLOntologyChange<?>> _List188;
    private java.util.List<SWRLDArgument> _List175;
    private java.util.Set<OWLAnnotation> _Set127;
    private java.util.Set<? extends OWLAnnotation> _Set131;
    private java.util.Set<? extends OWLAxiom> _Set191;
    private java.util.Set<? extends OWLClassExpression> _Set154;
    private java.util.Set<? extends OWLDataPropertyExpression> _Set168;
    private java.util.Set<? extends OWLDataRange> _Set161;
    private java.util.Set<? extends OWLIndividual> _Set163;
    private java.util.Set<? extends OWLLiteral> _Set157;
    private java.util.Set<? extends OWLObjectPropertyExpression> _Set166;
    private java.util.Set<? extends OWLPropertyExpression> _Set171;
    private java.util.Set<? extends SWRLAtom> _Set172;
    private java.util.Set<org.semanticweb.owlapi.io.OWLParser> _Set201;
    private java.util.Set<AxiomType<?>> _Set129;
    private java.util.Set<OWLAnnotation> _Set;
    private java.util.Set<OWLAxiom> _Set193;
    private java.util.Set<OWLEntity> _Set181;
    private java.util.Set<OWLFacetRestriction> _Set158;
    private java.util.Set<OWLOntology> _Set194;
    private java.util.Set<OWLOntologyFactory> _Set202;
    private java.util.Set<OWLOntologyIRIMapper> _Set200;
    private java.util.Set<OWLOntologyStorer> _Set203;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private AxiomType<?> _AxiomType;
    private AxiomType<?>[] _AxiomType_array;
    private AxiomType<?> _AxiomType104;
    private EntityType<?> _EntityType;
    private IRI _IRI;
    private ImpendingOWLOntologyChangeListener _ImpendingOWLOntologyChangeListener;
    private MissingImportListener _MissingImportListener;
    private NodeID _NodeID;
    private OWLAnnotation _OWLAnnotation;
    private OWLAnnotationAssertionAxiom _OWLAnnotationAssertionAxiom;
    private OWLAnnotationObjectVisitor _OWLAnnotationObjectVisitor;
    private OWLAnnotationObjectVisitorEx<OWLObject> _OWLAnnotationObjectVisitorEx;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAnnotationPropertyDomainAxiom _OWLAnnotationPropertyDomainAxiom;
    private OWLAnnotationPropertyRangeAxiom _OWLAnnotationPropertyRangeAxiom;
    private OWLAnnotationSubject _OWLAnnotationSubject;
    private OWLAnnotationSubjectVisitor _OWLAnnotationSubjectVisitor;
    private OWLAnnotationSubjectVisitorEx<Object> _OWLAnnotationSubjectVisitorEx;
    private OWLAnnotationValue _OWLAnnotationValue;
    private OWLAnnotationValueVisitor _OWLAnnotationValueVisitor;
    private OWLAnnotationValueVisitorEx<OWLObject> _OWLAnnotationValueVisitorEx;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom101;
    private OWLAxiomVisitor _OWLAxiomVisitor;
    private OWLAxiomVisitorEx<?> _OWLAxiomVisitorEx;
    private OWLAxiomVisitorEx<OWLObject> _OWLAxiomVisitorEx125;
    private OWLClass _OWLClass;
    private OWLClassAssertionAxiom _OWLClassAssertionAxiom;
    private OWLClassAxiom _OWLClassAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLClassExpressionVisitor _OWLClassExpressionVisitor;
    private OWLClassExpressionVisitorEx<OWLObject> _OWLClassExpressionVisitorEx;
    private OWLClassExpression[] _OWLClassExpression_array;
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
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLDataPropertyExpression[] _OWLDataPropertyExpression_array;
    private OWLDataPropertyRangeAxiom _OWLDataPropertyRangeAxiom;
    private OWLDataRange _OWLDataRange;
    private OWLDataRangeVisitor _OWLDataRangeVisitor;
    private OWLDataRangeVisitorEx<OWLObject> _OWLDataRangeVisitorEx;
    private OWLDataRange[] _OWLDataRange_array;
    private OWLDataSomeValuesFrom _OWLDataSomeValuesFrom;
    private OWLDataUnionOf _OWLDataUnionOf;
    private OWLDataVisitor _OWLDataVisitor;
    private OWLDataVisitorEx<OWLObject> _OWLDataVisitorEx;
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
    private OWLEntityVisitor _OWLEntityVisitor;
    private OWLEntityVisitorEx<OWLObject> _OWLEntityVisitorEx;
    private OWLEquivalentClassesAxiom _OWLEquivalentClassesAxiom;
    private OWLEquivalentDataPropertiesAxiom _OWLEquivalentDataPropertiesAxiom;
    private OWLEquivalentObjectPropertiesAxiom _OWLEquivalentObjectPropertiesAxiom;
    private OWLFacetRestriction _OWLFacetRestriction;
    private OWLFacetRestriction[] _OWLFacetRestriction_array;
    private OWLFunctionalDataPropertyAxiom _OWLFunctionalDataPropertyAxiom;
    private OWLFunctionalObjectPropertyAxiom _OWLFunctionalObjectPropertyAxiom;
    private OWLHasKeyAxiom _OWLHasKeyAxiom;
    private OWLImportsDeclaration _OWLImportsDeclaration;
    private OWLIndividual _OWLIndividual;
    private OWLIndividualVisitor _OWLIndividualVisitor;
    private OWLIndividualVisitorEx<OWLObject> _OWLIndividualVisitorEx;
    private OWLIndividual[] _OWLIndividual_array;
    private OWLInverseFunctionalObjectPropertyAxiom _OWLInverseFunctionalObjectPropertyAxiom;
    private OWLInverseObjectPropertiesAxiom _OWLInverseObjectPropertiesAxiom;
    private OWLIrreflexiveObjectPropertyAxiom _OWLIrreflexiveObjectPropertyAxiom;
    private OWLLiteral _OWLLiteral;
    private OWLLiteral[] _OWLLiteral_array;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLNamedObjectVisitor _OWLNamedObjectVisitor;
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
    private OWLObjectPropertyExpression[] _OWLObjectPropertyExpression_array;
    private OWLObjectPropertyRangeAxiom _OWLObjectPropertyRangeAxiom;
    private OWLObjectSomeValuesFrom _OWLObjectSomeValuesFrom;
    private OWLObjectUnionOf _OWLObjectUnionOf;
    private OWLObjectVisitor _OWLObjectVisitor;
    private OWLObjectVisitorEx<OWLObject> _OWLObjectVisitorEx;
    private OWLOntology _OWLOntology;
    private OWLOntologyBuilder _OWLOntologyBuilder;
    private OWLOntologyChange<?> _OWLOntologyChange192;
    private OWLOntologyChange<java.lang.Object> _OWLOntologyChange;
    private OWLOntologyChangeBroadcastStrategy _OWLOntologyChangeBroadcastStrategy;
    private OWLOntologyChangeListener _OWLOntologyChangeListener;
    private OWLOntologyChangeProgressListener _OWLOntologyChangeProgressListener;
    private OWLOntologyChangesVetoedListener _OWLOntologyChangesVetoedListener;
    private OWLOntologyFactory.OWLOntologyCreationHandler _OWLOntologyCreationHandler;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyLoaderListener _OWLOntologyLoaderListener;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLPairwiseVisitor<Object, OWLDataPropertyExpression> _OWLPairwiseVisitor179;
    private OWLPairwiseVisitor<Object, OWLClassExpression> _OWLPairwiseVisitor178;
    private OWLPairwiseVisitor<Object, OWLIndividual> _OWLPairwiseVisitor;
    private OWLPairwiseVisitor<Object, OWLObjectPropertyExpression> _OWLPairwiseVisitor185;
    private OWLPrimitive _OWLPrimitive;
    private OWLPropertyExpressionVisitor _OWLPropertyExpressionVisitor;
    private OWLPropertyExpressionVisitorEx<OWLObject> _OWLPropertyExpressionVisitorEx;
    private OWLPropertyExpression[] _OWLPropertyExpression_array;
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
    private SWRLBuiltInAtom _SWRLBuiltInAtom;
    private SWRLClassAtom _SWRLClassAtom;
    private SWRLDArgument _SWRLDArgument;
    private SWRLDataPropertyAtom _SWRLDataPropertyAtom;
    private SWRLDataRangeAtom _SWRLDataRangeAtom;
    private SWRLDifferentIndividualsAtom _SWRLDifferentIndividualsAtom;
    private SWRLIArgument _SWRLIArgument;
    private SWRLIndividualArgument _SWRLIndividualArgument;
    private SWRLLiteralArgument _SWRLLiteralArgument;
    private SWRLObjectPropertyAtom _SWRLObjectPropertyAtom;
    private SWRLObjectVisitor _SWRLObjectVisitor;
    private SWRLObjectVisitorEx<OWLObject> _SWRLObjectVisitorEx;
    private SWRLPredicate _SWRLPredicate;
    private SWRLRule _SWRLRule;
    private SWRLSameIndividualAtom _SWRLSameIndividualAtom;
    private SWRLVariable _SWRLVariable;
    private org.semanticweb.owlapi.util.OWLAxiomSearchFilter _OWLAxiomSearchFilter;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainer<OWLObject> _CollectionContainer;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainerVisitor<OWLObject> _CollectionContainerVisitor;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainerVisitor<OWLAnnotation> _CollectionContainerVisitor128;
    private uk.ac.manchester.cs.owl.owlapi.Internals _Internals;
    private uk.ac.manchester.cs.owl.owlapi.MapPointer<Object, OWLAxiom> _MapPointer;
}
