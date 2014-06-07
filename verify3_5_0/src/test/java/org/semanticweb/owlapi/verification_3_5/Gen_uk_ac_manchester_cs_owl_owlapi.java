package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.model.*;

import uk.ac.manchester.cs.owl.owlapi.*;
import uk.ac.manchester.cs.owl.owlapi.Internals.Pointer;

@SuppressWarnings({ "javadoc", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owl_owlapi {
    @Test
    public void enforceInterfacesAbstractEntityRegistrationManager() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(AbstractEntityRegistrationManager.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(AbstractEntityRegistrationManager.class));
    }

    public void verifyAbstractEntityRegistrationManager() {
        AbstractEntityRegistrationManager testSubject0 = new AbstractEntityRegistrationManager() {
            @Override
            public void visit(OWLClass ce) {
            }

            @Override
            public void visit(OWLDatatype node) {
            }

            @Override
            public void visit(OWLObjectProperty property) {
            }

            @Override
            public void visit(OWLDataProperty property) {
            }

            @Override
            public void visit(OWLNamedIndividual individual) {
            }

            @Override
            public void visit(OWLAnnotationProperty property) {
            }

            @Override
            public void visit(OWLAnonymousIndividual individual) {
            }
        };
    }

    @Test
    public void enforceInterfacesAbstractInMemOWLOntologyFactory() {
        assertTrue(OWLOntologyFactory.class.isAssignableFrom(AbstractInMemOWLOntologyFactory.class));
    }

    public void verifyAbstractInMemOWLOntologyFactory() throws OWLOntologyCreationException {
        AbstractInMemOWLOntologyFactory testSubject0 = new AbstractInMemOWLOntologyFactory() {
            @Override
            public OWLOntology loadOWLOntology(OWLOntologyDocumentSource documentSource, OWLOntologyCreationHandler handler) throws OWLOntologyCreationException {
                return null;
            }

            @Override
            public OWLOntology loadOWLOntology(OWLOntologyDocumentSource documentSource, OWLOntologyCreationHandler handler, OWLOntologyLoaderConfiguration configuration)
                    throws OWLOntologyCreationException {
                return null;
            }

            @Override
            public boolean canLoad(OWLOntologyDocumentSource documentSource) {
                return false;
            }
        };
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result0 = testSubject0.getOWLOntologyManager();
        boolean result1 = testSubject0.canCreateFromDocumentIRI(_IRI);
        OWLOntology result2 = testSubject0.createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        OWLOntology result3 = testSubject0.loadOWLOntology(_OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        OWLOntology result4 = testSubject0.loadOWLOntology(_OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        boolean result5 = testSubject0.canLoad(_OWLOntologyDocumentSource);
    }

    @Test
    public void enforceInterfacesAbstractInternalsImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.Internals.class.isAssignableFrom(AbstractInternalsImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(AbstractInternalsImpl.class));
    }

    public void verifyAbstractInternalsImpl() {
        AbstractInternalsImpl testSubject0 = mock(AbstractInternalsImpl.class);
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result0 = testSubject0.getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLClassAxiom> result1 = testSubject0.getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLSubClassOfAxiom> result2 = testSubject0.getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result3 = testSubject0.getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result4 = testSubject0.getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLSubClassOfAxiom> result5 = testSubject0.getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result6 = testSubject0.getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLEquivalentClassesAxiom> result7 = testSubject0.getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result8 = testSubject0.getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLDisjointClassesAxiom> result9 = testSubject0.getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result10 = testSubject0.getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLDisjointUnionAxiom> result11 = testSubject0.getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLHasKeyAxiom> result12 = testSubject0.getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result13 = testSubject0.getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom> result14 = testSubject0.getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result15 = testSubject0.getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result16 = testSubject0.getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom> result17 = testSubject0.getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result18 = testSubject0.getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLEquivalentObjectPropertiesAxiom> result19 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLDisjointObjectPropertiesAxiom> result20 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result21 = testSubject0.getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLObjectPropertyDomainAxiom> result22 = testSubject0.getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result23 = testSubject0.getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLObjectPropertyRangeAxiom> result24 = testSubject0.getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result25 = testSubject0.getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result26 = testSubject0.getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLFunctionalObjectPropertyAxiom> result27 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLInverseFunctionalObjectPropertyAxiom> result28 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result29 = testSubject0.getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLSymmetricObjectPropertyAxiom> result30 = testSubject0.getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result31 = testSubject0.getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLAsymmetricObjectPropertyAxiom> result32 = testSubject0.getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result33 = testSubject0.getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLReflexiveObjectPropertyAxiom> result34 = testSubject0.getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result35 = testSubject0.getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLIrreflexiveObjectPropertyAxiom> result36 = testSubject0.getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result37 = testSubject0.getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result38 = testSubject0.getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLTransitiveObjectPropertyAxiom> result39 = testSubject0.getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result40 = testSubject0.getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLInverseObjectPropertiesAxiom> result41 = testSubject0.getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result42 = testSubject0.getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom> result43 = testSubject0.getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom> result44 = testSubject0.getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result45 = testSubject0.getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result46 = testSubject0.getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLEquivalentDataPropertiesAxiom> result47 = testSubject0.getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result48 = testSubject0.getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLDisjointDataPropertiesAxiom> result49 = testSubject0.getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLDataPropertyDomainAxiom> result50 = testSubject0.getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result51 = testSubject0.getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLDataPropertyRangeAxiom> result52 = testSubject0.getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result53 = testSubject0.getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result54 = testSubject0.getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLFunctionalDataPropertyAxiom> result55 = testSubject0.getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result56 = testSubject0.getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLClassAssertionAxiom> result57 = testSubject0.getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result58 = testSubject0.getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClassExpression, OWLClassAssertionAxiom> result59 = testSubject0.getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLObjectPropertyAssertionAxiom> result60 = testSubject0.getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result61 = testSubject0.getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result62 = testSubject0.getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLDataPropertyAssertionAxiom> result63 = testSubject0.getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLNegativeObjectPropertyAssertionAxiom> result64 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result65 = testSubject0.getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLNegativeDataPropertyAssertionAxiom> result66 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result67 = testSubject0.getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result68 = testSubject0.getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLDifferentIndividualsAxiom> result69 = testSubject0.getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLSameIndividualAxiom> result70 = testSubject0.getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result71 = testSubject0.getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLAnnotationSubject, OWLAnnotationAssertionAxiom> result72 = testSubject0.getAnnotationAssertionAxiomsBySubject();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result73 = testSubject0.getAnnotationAssertionAxiomsBySubject();
        boolean result74 = testSubject0.add(_Pointer, _Object, _OWLAxiom);
        boolean result75 = testSubject0.remove(_Pointer, _Object, _OWLAxiom);
        boolean result76 = testSubject0.isEmpty();
        boolean result77 = testSubject0.contains(_Pointer, _Object);
        boolean result78 = testSubject0.contains(_Pointer, _Object, _OWLAxiom);
        java.util.Set<OWLAxiom> result79 = testSubject0.getValues(_Pointer, _Object);
        Pointer<AxiomType<?>, OWLAxiom> result80 = testSubject0.getAxiomsByType();
        testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result81 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result82 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        Pointer<OWLEntity, OWLDeclarationAxiom> result83 = testSubject0.getDeclarationsByEntity();
        java.util.Set<OWLAnnotation> result84 = testSubject0.getOntologyAnnotations();
        Pointer<OWLAnnotationProperty, OWLAxiom> result85 = testSubject0.getOwlAnnotationPropertyReferences();
        Pointer<OWLAnonymousIndividual, OWLAxiom> result86 = testSubject0.getOwlAnonymousIndividualReferences();
        Pointer<OWLClass, OWLAxiom> result87 = testSubject0.getOwlClassReferences();
        Pointer<OWLDataProperty, OWLAxiom> result88 = testSubject0.getOwlDataPropertyReferences();
        Pointer<OWLDatatype, OWLAxiom> result89 = testSubject0.getOwlDatatypeReferences();
        Pointer<OWLNamedIndividual, OWLAxiom> result90 = testSubject0.getOwlIndividualReferences();
        Pointer<OWLObjectProperty, OWLAxiom> result91 = testSubject0.getOwlObjectPropertyReferences();
        boolean result92 = testSubject0.hasValues(_Pointer, _Object);
        java.util.Set<OWLClass> result93 = testSubject0.getKeyset(_Pointer);
        java.util.Set<OWLAxiom> result94 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object);
        testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result95 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result96 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        java.util.Set<OWLImportsDeclaration> result97 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result98 = testSubject0.getAxioms();
        int result99 = testSubject0.getAxiomCount(_AxiomType);
        int result100 = testSubject0.getAxiomCount();
        java.util.Set<OWLLogicalAxiom> result101 = testSubject0.getLogicalAxioms();
        int result102 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLClassAxiom> result103 = testSubject0.getGeneralClassAxioms();
        boolean result104 = testSubject0.isDeclared(_OWLDeclarationAxiom);
        boolean result105 = testSubject0.addAxiom(_OWLAxiom96);
        boolean result106 = testSubject0.removeAxiom(_OWLAxiom96);
    }

    @Test
    public void enforceInterfacesClassAxiomByClassPointer() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.MapPointer.class.isAssignableFrom(ClassAxiomByClassPointer.class));
    }

    public void verifyClassAxiomByClassPointer() {
        ClassAxiomByClassPointer testSubject0 = new ClassAxiomByClassPointer(_AxiomType97, _OWLAxiomVisitorEx, _boolean, _Internals);
        testSubject0.init();
        boolean result0 = testSubject0.remove(_Object, _OWLAxiom);
        boolean result1 = testSubject0.put(_Object, _OWLAxiom);
        boolean result2 = testSubject0.contains(_Object, _OWLAxiom);
        int result3 = testSubject0.size();
        java.util.Set<OWLClass> result4 = testSubject0.keySet();
        boolean result5 = testSubject0.containsKey(_Object);
        java.util.Set<OWLClassAxiom> result6 = testSubject0.getAllValues();
        java.util.Set<OWLClassAxiom> result7 = testSubject0.getValues(_Object);
        boolean result8 = testSubject0.hasValues(_Object);
        boolean result9 = testSubject0.isInitialized();
    }

    public void verifyInterfaceCollectionContainer() {
        CollectionContainer<Object> testSubject0 = mock(CollectionContainer.class);
        testSubject0.accept(_CollectionContainerVisitor);
    }

    public void verifyInterfaceCollectionContainerVisitor() {
        CollectionContainerVisitor<Object> testSubject0 = mock(CollectionContainerVisitor.class);
        testSubject0.visitItem(_Object103);
    }

    @Test
    public void enforceInterfacesEmptyInMemOWLOntologyFactory() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInMemOWLOntologyFactory.class.isAssignableFrom(EmptyInMemOWLOntologyFactory.class));
    }

    public void verifyEmptyInMemOWLOntologyFactory() throws OWLOntologyCreationException {
        EmptyInMemOWLOntologyFactory testSubject0 = new EmptyInMemOWLOntologyFactory();
        OWLOntology result0 = testSubject0.loadOWLOntology(_OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        OWLOntology result1 = testSubject0.loadOWLOntology(_OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        OWLOntology result2 = testSubject0.createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
        boolean result3 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result4 = testSubject0.getOWLOntologyManager();
        boolean result5 = testSubject0.canCreateFromDocumentIRI(_IRI);
    }

    public void verifyImplUtils() {
        ImplUtils testSubject0 = new ImplUtils();
        java.util.Set<OWLAnnotation> result0 = ImplUtils.getAnnotations(_OWLEntity, _OWLAnnotationProperty, _Set);
        java.util.Set<OWLAnnotation> result1 = ImplUtils.getAnnotations(_OWLEntity, _Set);
        java.util.Set<OWLAnnotationAssertionAxiom> result2 = ImplUtils.getAnnotationAxioms(_OWLEntity, _Set);
    }

    public void verifyInitVisitorFactory() {
        InitVisitorFactory testSubject0 = new InitVisitorFactory();
    }

    public void verifyInterfaceInternals() {
        Internals testSubject0 = mock(Internals.class);
        boolean result0 = testSubject0.add(_Pointer, _Object, _OWLAxiom);
        boolean result1 = testSubject0.remove(_Pointer, _Object, _OWLAxiom);
        boolean result2 = testSubject0.isEmpty();
        boolean result3 = testSubject0.contains(_Pointer, _Object);
        boolean result4 = testSubject0.contains(_Pointer, _Object, _OWLAxiom);
        java.util.Set<OWLAxiom> result5 = testSubject0.getValues(_Pointer, _Object);
        Pointer<OWLClass, OWLClassAxiom> result6 = testSubject0.getClassAxiomsByClass();
        Pointer<OWLClass, OWLSubClassOfAxiom> result7 = testSubject0.getSubClassAxiomsByLHS();
        Pointer<OWLClass, OWLSubClassOfAxiom> result8 = testSubject0.getSubClassAxiomsByRHS();
        Pointer<OWLClass, OWLEquivalentClassesAxiom> result9 = testSubject0.getEquivalentClassesAxiomsByClass();
        Pointer<OWLClass, OWLDisjointClassesAxiom> result10 = testSubject0.getDisjointClassesAxiomsByClass();
        Pointer<OWLClass, OWLDisjointUnionAxiom> result11 = testSubject0.getDisjointUnionAxiomsByClass();
        Pointer<OWLClass, OWLHasKeyAxiom> result12 = testSubject0.getHasKeyAxiomsByClass();
        Pointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom> result13 = testSubject0.getObjectSubPropertyAxiomsByLHS();
        Pointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom> result14 = testSubject0.getObjectSubPropertyAxiomsByRHS();
        Pointer<OWLObjectPropertyExpression, OWLEquivalentObjectPropertiesAxiom> result15 = testSubject0.getEquivalentObjectPropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLDisjointObjectPropertiesAxiom> result16 = testSubject0.getDisjointObjectPropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLObjectPropertyDomainAxiom> result17 = testSubject0.getObjectPropertyDomainAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLObjectPropertyRangeAxiom> result18 = testSubject0.getObjectPropertyRangeAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLFunctionalObjectPropertyAxiom> result19 = testSubject0.getFunctionalObjectPropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLInverseFunctionalObjectPropertyAxiom> result20 = testSubject0.getInverseFunctionalPropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLSymmetricObjectPropertyAxiom> result21 = testSubject0.getSymmetricPropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLAsymmetricObjectPropertyAxiom> result22 = testSubject0.getAsymmetricPropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLReflexiveObjectPropertyAxiom> result23 = testSubject0.getReflexivePropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLIrreflexiveObjectPropertyAxiom> result24 = testSubject0.getIrreflexivePropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLTransitiveObjectPropertyAxiom> result25 = testSubject0.getTransitivePropertyAxiomsByProperty();
        Pointer<OWLObjectPropertyExpression, OWLInverseObjectPropertiesAxiom> result26 = testSubject0.getInversePropertyAxiomsByProperty();
        Pointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom> result27 = testSubject0.getDataSubPropertyAxiomsByLHS();
        Pointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom> result28 = testSubject0.getDataSubPropertyAxiomsByRHS();
        Pointer<OWLDataPropertyExpression, OWLEquivalentDataPropertiesAxiom> result29 = testSubject0.getEquivalentDataPropertyAxiomsByProperty();
        Pointer<OWLDataPropertyExpression, OWLDisjointDataPropertiesAxiom> result30 = testSubject0.getDisjointDataPropertyAxiomsByProperty();
        Pointer<OWLDataPropertyExpression, OWLDataPropertyDomainAxiom> result31 = testSubject0.getDataPropertyDomainAxiomsByProperty();
        Pointer<OWLDataPropertyExpression, OWLDataPropertyRangeAxiom> result32 = testSubject0.getDataPropertyRangeAxiomsByProperty();
        Pointer<OWLDataPropertyExpression, OWLFunctionalDataPropertyAxiom> result33 = testSubject0.getFunctionalDataPropertyAxiomsByProperty();
        Pointer<OWLIndividual, OWLClassAssertionAxiom> result34 = testSubject0.getClassAssertionAxiomsByIndividual();
        Pointer<OWLClassExpression, OWLClassAssertionAxiom> result35 = testSubject0.getClassAssertionAxiomsByClass();
        Pointer<OWLIndividual, OWLObjectPropertyAssertionAxiom> result36 = testSubject0.getObjectPropertyAssertionsByIndividual();
        Pointer<OWLIndividual, OWLDataPropertyAssertionAxiom> result37 = testSubject0.getDataPropertyAssertionsByIndividual();
        Pointer<OWLIndividual, OWLNegativeObjectPropertyAssertionAxiom> result38 = testSubject0.getNegativeObjectPropertyAssertionAxiomsByIndividual();
        Pointer<OWLIndividual, OWLNegativeDataPropertyAssertionAxiom> result39 = testSubject0.getNegativeDataPropertyAssertionAxiomsByIndividual();
        Pointer<OWLIndividual, OWLDifferentIndividualsAxiom> result40 = testSubject0.getDifferentIndividualsAxiomsByIndividual();
        Pointer<OWLIndividual, OWLSameIndividualAxiom> result41 = testSubject0.getSameIndividualsAxiomsByIndividual();
        Pointer<OWLAnnotationSubject, OWLAnnotationAssertionAxiom> result42 = testSubject0.getAnnotationAssertionAxiomsBySubject();
        Pointer<AxiomType<?>, OWLAxiom> result43 = testSubject0.getAxiomsByType();
        testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result44 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result45 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        Pointer<OWLEntity, OWLDeclarationAxiom> result46 = testSubject0.getDeclarationsByEntity();
        java.util.Set<OWLAnnotation> result47 = testSubject0.getOntologyAnnotations();
        Pointer<OWLAnnotationProperty, OWLAxiom> result48 = testSubject0.getOwlAnnotationPropertyReferences();
        Pointer<OWLAnonymousIndividual, OWLAxiom> result49 = testSubject0.getOwlAnonymousIndividualReferences();
        Pointer<OWLClass, OWLAxiom> result50 = testSubject0.getOwlClassReferences();
        Pointer<OWLDataProperty, OWLAxiom> result51 = testSubject0.getOwlDataPropertyReferences();
        Pointer<OWLDatatype, OWLAxiom> result52 = testSubject0.getOwlDatatypeReferences();
        Pointer<OWLNamedIndividual, OWLAxiom> result53 = testSubject0.getOwlIndividualReferences();
        Pointer<OWLObjectProperty, OWLAxiom> result54 = testSubject0.getOwlObjectPropertyReferences();
        boolean result55 = testSubject0.hasValues(_Pointer, _Object);
        java.util.Set<OWLClass> result56 = testSubject0.getKeyset(_Pointer);
        java.util.Set<OWLAxiom> result57 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object);
        testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result58 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result59 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        java.util.Set<OWLImportsDeclaration> result60 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result61 = testSubject0.getAxioms();
        int result62 = testSubject0.getAxiomCount(_AxiomType);
        int result63 = testSubject0.getAxiomCount();
        java.util.Set<OWLLogicalAxiom> result64 = testSubject0.getLogicalAxioms();
        int result65 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLClassAxiom> result66 = testSubject0.getGeneralClassAxioms();
        boolean result67 = testSubject0.isDeclared(_OWLDeclarationAxiom);
        boolean result68 = testSubject0.addAxiom(_OWLAxiom96);
        boolean result69 = testSubject0.removeAxiom(_OWLAxiom96);
    }

    @Test
    public void enforceInterfacesInternalsImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.AbstractInternalsImpl.class.isAssignableFrom(InternalsImpl.class));
    }

    public void verifyInternalsImpl() {
        InternalsImpl testSubject0 = new InternalsImpl();
        boolean result0 = testSubject0.add(_Pointer, _Object, _OWLAxiom);
        boolean result1 = testSubject0.remove(_Pointer, _Object, _OWLAxiom);
        boolean result2 = testSubject0.isEmpty();
        boolean result3 = testSubject0.contains(_Pointer, _Object, _OWLAxiom);
        boolean result4 = testSubject0.contains(_Pointer, _Object);
        java.util.Set<OWLAxiom> result5 = testSubject0.getValues(_Pointer, _Object);
        uk.ac.manchester.cs.owl.owlapi.MapPointer<AxiomType<?>, OWLAxiom> result6 = testSubject0.getAxiomsByType();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result7 = testSubject0.getAxiomsByType();
        testSubject0.addGeneralClassAxioms(_OWLClassAxiom);
        boolean result8 = testSubject0.addImportsDeclaration(_OWLImportsDeclaration);
        boolean result9 = testSubject0.addOntologyAnnotation(_OWLAnnotation);
        testSubject0.addPropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result10 = testSubject0.getDeclarationsByEntity();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLEntity, OWLDeclarationAxiom> result11 = testSubject0.getDeclarationsByEntity();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getOntologyAnnotations();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLAnnotationProperty, OWLAxiom> result13 = testSubject0.getOwlAnnotationPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result14 = testSubject0.getOwlAnnotationPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLAnonymousIndividual, OWLAxiom> result15 = testSubject0.getOwlAnonymousIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result16 = testSubject0.getOwlAnonymousIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result17 = testSubject0.getOwlClassReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLAxiom> result18 = testSubject0.getOwlClassReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataProperty, OWLAxiom> result19 = testSubject0.getOwlDataPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result20 = testSubject0.getOwlDataPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result21 = testSubject0.getOwlDatatypeReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDatatype, OWLAxiom> result22 = testSubject0.getOwlDatatypeReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result23 = testSubject0.getOwlIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLNamedIndividual, OWLAxiom> result24 = testSubject0.getOwlIndividualReferences();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result25 = testSubject0.getOwlObjectPropertyReferences();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectProperty, OWLAxiom> result26 = testSubject0.getOwlObjectPropertyReferences();
        boolean result27 = testSubject0.hasValues(_Pointer, _Object);
        java.util.Set<OWLClass> result28 = testSubject0.getKeyset(_Pointer);
        java.util.Set<OWLAxiom> result29 = testSubject0.filterAxioms(_OWLAxiomSearchFilter, _Object);
        testSubject0.removeGeneralClassAxioms(_OWLClassAxiom);
        boolean result30 = testSubject0.removeImportsDeclaration(_OWLImportsDeclaration);
        boolean result31 = testSubject0.removeOntologyAnnotation(_OWLAnnotation);
        testSubject0.removePropertyChainSubPropertyAxioms(_OWLSubPropertyChainOfAxiom);
        java.util.Set<OWLImportsDeclaration> result32 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAxiom> result33 = testSubject0.getAxioms();
        int result34 = testSubject0.getAxiomCount();
        int result35 = testSubject0.getAxiomCount(_AxiomType);
        java.util.Set<OWLLogicalAxiom> result36 = testSubject0.getLogicalAxioms();
        int result37 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLClassAxiom> result38 = testSubject0.getGeneralClassAxioms();
        boolean result39 = testSubject0.isDeclared(_OWLDeclarationAxiom);
        boolean result40 = testSubject0.addAxiom(_OWLAxiom96);
        boolean result41 = testSubject0.removeAxiom(_OWLAxiom96);
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result42 = testSubject0.getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLClassAxiom> result43 = testSubject0.getClassAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLSubClassOfAxiom> result44 = testSubject0.getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result45 = testSubject0.getSubClassAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result46 = testSubject0.getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLSubClassOfAxiom> result47 = testSubject0.getSubClassAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result48 = testSubject0.getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLEquivalentClassesAxiom> result49 = testSubject0.getEquivalentClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result50 = testSubject0.getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLDisjointClassesAxiom> result51 = testSubject0.getDisjointClassesAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result52 = testSubject0.getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLDisjointUnionAxiom> result53 = testSubject0.getDisjointUnionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClass, OWLHasKeyAxiom> result54 = testSubject0.getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result55 = testSubject0.getHasKeyAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom> result56 = testSubject0.getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result57 = testSubject0.getObjectSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result58 = testSubject0.getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLSubObjectPropertyOfAxiom> result59 = testSubject0.getObjectSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result60 = testSubject0.getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLEquivalentObjectPropertiesAxiom> result61 = testSubject0
                .getEquivalentObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLDisjointObjectPropertiesAxiom> result62 = testSubject0
                .getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result63 = testSubject0.getDisjointObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLObjectPropertyDomainAxiom> result64 = testSubject0.getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result65 = testSubject0.getObjectPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLObjectPropertyRangeAxiom> result66 = testSubject0.getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result67 = testSubject0.getObjectPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result68 = testSubject0.getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLFunctionalObjectPropertyAxiom> result69 = testSubject0
                .getFunctionalObjectPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLInverseFunctionalObjectPropertyAxiom> result70 = testSubject0
                .getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result71 = testSubject0.getInverseFunctionalPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLSymmetricObjectPropertyAxiom> result72 = testSubject0.getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result73 = testSubject0.getSymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLAsymmetricObjectPropertyAxiom> result74 = testSubject0.getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result75 = testSubject0.getAsymmetricPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLReflexiveObjectPropertyAxiom> result76 = testSubject0.getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result77 = testSubject0.getReflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLIrreflexiveObjectPropertyAxiom> result78 = testSubject0.getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result79 = testSubject0.getIrreflexivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result80 = testSubject0.getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLTransitiveObjectPropertyAxiom> result81 = testSubject0.getTransitivePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result82 = testSubject0.getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLObjectPropertyExpression, OWLInverseObjectPropertiesAxiom> result83 = testSubject0.getInversePropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result84 = testSubject0.getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom> result85 = testSubject0.getDataSubPropertyAxiomsByLHS();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLSubDataPropertyOfAxiom> result86 = testSubject0.getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result87 = testSubject0.getDataSubPropertyAxiomsByRHS();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result88 = testSubject0.getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLEquivalentDataPropertiesAxiom> result89 = testSubject0.getEquivalentDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result90 = testSubject0.getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLDisjointDataPropertiesAxiom> result91 = testSubject0.getDisjointDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLDataPropertyDomainAxiom> result92 = testSubject0.getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result93 = testSubject0.getDataPropertyDomainAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLDataPropertyRangeAxiom> result94 = testSubject0.getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result95 = testSubject0.getDataPropertyRangeAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result96 = testSubject0.getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLDataPropertyExpression, OWLFunctionalDataPropertyAxiom> result97 = testSubject0.getFunctionalDataPropertyAxiomsByProperty();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result98 = testSubject0.getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLClassAssertionAxiom> result99 = testSubject0.getClassAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result100 = testSubject0.getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLClassExpression, OWLClassAssertionAxiom> result101 = testSubject0.getClassAssertionAxiomsByClass();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLObjectPropertyAssertionAxiom> result102 = testSubject0.getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result103 = testSubject0.getObjectPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result104 = testSubject0.getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLDataPropertyAssertionAxiom> result105 = testSubject0.getDataPropertyAssertionsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLNegativeObjectPropertyAssertionAxiom> result106 = testSubject0
                .getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result107 = testSubject0.getNegativeObjectPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLNegativeDataPropertyAssertionAxiom> result108 = testSubject0
                .getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result109 = testSubject0.getNegativeDataPropertyAssertionAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result110 = testSubject0.getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLDifferentIndividualsAxiom> result111 = testSubject0.getDifferentIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLIndividual, OWLSameIndividualAxiom> result112 = testSubject0.getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result113 = testSubject0.getSameIndividualsAxiomsByIndividual();
        uk.ac.manchester.cs.owl.owlapi.MapPointer<OWLAnnotationSubject, OWLAnnotationAssertionAxiom> result114 = testSubject0.getAnnotationAssertionAxiomsBySubject();
        uk.ac.manchester.cs.owl.owlapi.Internals.Pointer result115 = testSubject0.getAnnotationAssertionAxiomsBySubject();
    }

    @Test
    public void enforceInterfacesInternalsNoCache() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryInternals.class.isAssignableFrom(InternalsNoCache.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(InternalsNoCache.class));
    }

    public void verifyInternalsNoCache() {
        InternalsNoCache testSubject0 = new InternalsNoCache(_boolean);
        OWLClass result0 = testSubject0.getOWLClass(_IRI);
        testSubject0.purge();
        OWLNamedIndividual result1 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result2 = testSubject0.getTopDatatype();
        OWLObjectProperty result3 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result4 = testSubject0.getOWLDataProperty(_IRI);
        OWLAnnotationProperty result5 = testSubject0.getOWLAnnotationProperty(_IRI);
        OWLDatatype result6 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result7 = testSubject0.getOWLDatatype(_IRI);
        OWLDatatype result8 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result9 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result10 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result11 = testSubject0.getBooleanOWLDatatype();
        OWLLiteral result12 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result13 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result14 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result15 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result16 = testSubject0.getOWLLiteral(_String, _String);
        OWLLiteral result17 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result18 = testSubject0.getOWLLiteral(_float);
    }

    @Test
    public void enforceInterfacesMapPointer() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.Internals.Pointer.class.isAssignableFrom(MapPointer.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(MapPointer.class));
    }

    public void verifyMapPointer() {
        MapPointer testSubject0 = new MapPointer(_AxiomType97, _OWLAxiomVisitorEx, _boolean, _Internals);
        boolean result0 = testSubject0.remove(_Object, _OWLAxiom);
        boolean result1 = testSubject0.put(_Object, _OWLAxiom);
        boolean result2 = testSubject0.contains(_Object, _OWLAxiom);
        int result3 = testSubject0.size();
        testSubject0.init();
        java.util.Set<K> result4 = testSubject0.keySet();
        boolean result5 = testSubject0.containsKey(_Object);
        java.util.Set<V> result6 = testSubject0.getAllValues();
        java.util.Set<V> result7 = testSubject0.getValues(_Object);
        boolean result8 = testSubject0.hasValues(_Object);
        boolean result9 = testSubject0.isInitialized();
    }

    @Test
    public void enforceInterfacesOWL2DatatypeImpl() {
        assertTrue(OWLDatatype.class.isAssignableFrom(OWL2DatatypeImpl.class));
    }

    public void verifyOWL2DatatypeImpl() {
        OWL2DatatypeImpl testSubject0 = (OWL2DatatypeImpl) OWL2DatatypeImpl.getDatatype(_OWL2Datatype);
        int result0 = testSubject0.compareTo(_Object110);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLOntology);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<OWLEntity> result4 = testSubject0.getSignature();
        boolean result5 = testSubject0.isType(_EntityType);
        OWLObject result6 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result7 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result8 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result9 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLDataVisitor);
        boolean result10 = testSubject0.isBuiltIn();
        boolean result11 = testSubject0.isString();
        org.semanticweb.owlapi.vocab.OWL2Datatype result12 = testSubject0.getBuiltInDatatype();
        boolean result13 = testSubject0.isDatatype();
        boolean result14 = testSubject0.isTopDatatype();
        DataRangeType result15 = testSubject0.getDataRangeType();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        boolean result25 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result26 = OWL2DatatypeImpl.getDatatype(_OWL2Datatype);
        boolean result27 = testSubject0.isInteger();
        boolean result28 = testSubject0.isBoolean();
        boolean result29 = testSubject0.isDouble();
        boolean result30 = testSubject0.isFloat();
        java.util.Set<OWLAxiom> result31 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAxiom> result32 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAnnotationAssertionAxiom> result33 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        IRI result34 = testSubject0.getIRI();
        EntityType<?> result35 = testSubject0.getEntityType();
        OWLEntity result36 = testSubject0.getOWLEntity(_EntityType123);
        boolean result37 = testSubject0.isOWLClass();
        OWLClass result38 = testSubject0.asOWLClass();
        boolean result39 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result40 = testSubject0.asOWLObjectProperty();
        boolean result41 = testSubject0.isOWLDataProperty();
        OWLDataProperty result42 = testSubject0.asOWLDataProperty();
        boolean result43 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result44 = testSubject0.asOWLNamedIndividual();
        boolean result45 = testSubject0.isOWLDatatype();
        OWLDatatype result46 = testSubject0.asOWLDatatype();
        boolean result47 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result48 = testSubject0.asOWLAnnotationProperty();
        String result49 = testSubject0.toStringID();
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLAnnotationAssertionAxiomImpl.class));
        assertTrue(OWLAnnotationAssertionAxiom.class.isAssignableFrom(OWLAnnotationAssertionAxiomImpl.class));
    }

    public void verifyOWLAnnotationAssertionAxiomImpl() {
        OWLAnnotationAssertionAxiomImpl testSubject0 = new OWLAnnotationAssertionAxiomImpl(_OWLAnnotationSubject, _OWLAnnotationProperty, _OWLAnnotationValue, _Collection);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLAnnotationValue result1 = testSubject0.getValue();
        OWLAnnotation result2 = testSubject0.getAnnotation();
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLAnnotationSubject result5 = testSubject0.getSubject();
        boolean result6 = testSubject0.isDeprecatedIRIAssertion();
        OWLAnnotationAssertionAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAnnotationAssertionAxiom result9 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set130);
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result13 = testSubject0.getAxiomType();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAnnotationImpl.class));
        assertTrue(OWLAnnotation.class.isAssignableFrom(OWLAnnotationImpl.class));
    }

    public void verifyOWLAnnotationImpl() {
        OWLAnnotationImpl testSubject0 = new OWLAnnotationImpl(_OWLAnnotationProperty, _OWLAnnotationValue, _Set134);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLAnnotationValue result1 = testSubject0.getValue();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations();
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAnnotationObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationObjectVisitorEx);
        boolean result5 = testSubject0.isComment();
        boolean result6 = testSubject0.isLabel();
        boolean result7 = testSubject0.isDeprecatedIRIAnnotation();
        OWLAnnotation result8 = testSubject0.getAnnotatedAnnotation(_Set129);
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiomImpl.class));
        assertTrue(OWLAnnotationPropertyDomainAxiom.class.isAssignableFrom(OWLAnnotationPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLAnnotationPropertyDomainAxiomImpl() {
        OWLAnnotationPropertyDomainAxiomImpl testSubject0 = new OWLAnnotationPropertyDomainAxiomImpl(_OWLAnnotationProperty, _IRI, _Collection);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx127);
        IRI result3 = testSubject0.getDomain();
        OWLAnnotationPropertyDomainAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLAnnotationPropertyDomainAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAnnotationPropertyImpl.class));
        assertTrue(OWLAnnotationProperty.class.isAssignableFrom(OWLAnnotationPropertyImpl.class));
    }

    public void verifyOWLAnnotationPropertyImpl() {
        OWLAnnotationPropertyImpl testSubject0 = new OWLAnnotationPropertyImpl(_IRI);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLOntology);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLAnnotationProperty> result5 = testSubject0.getSuperProperties(_Set);
        java.util.Set<OWLAnnotationProperty> result6 = testSubject0.getSuperProperties(_OWLOntology);
        java.util.Set<OWLAnnotationProperty> result7 = testSubject0.getSuperProperties(_OWLOntology, _boolean);
        java.util.Set<OWLAnnotationProperty> result8 = testSubject0.getSubProperties(_OWLOntology);
        java.util.Set<OWLAnnotationProperty> result9 = testSubject0.getSubProperties(_Set);
        java.util.Set<OWLAnnotationProperty> result10 = testSubject0.getSubProperties(_OWLOntology, _boolean);
        boolean result11 = testSubject0.isBuiltIn();
        boolean result12 = testSubject0.isComment();
        boolean result13 = testSubject0.isLabel();
        boolean result14 = testSubject0.isDeprecated();
        java.util.Set<OWLAxiom> result15 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAxiom> result16 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAnnotationAssertionAxiom> result17 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        IRI result18 = testSubject0.getIRI();
        EntityType<?> result19 = testSubject0.getEntityType();
        OWLEntity result20 = testSubject0.getOWLEntity(_EntityType123);
        boolean result21 = testSubject0.isOWLClass();
        OWLClass result22 = testSubject0.asOWLClass();
        boolean result23 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result24 = testSubject0.asOWLObjectProperty();
        boolean result25 = testSubject0.isOWLDataProperty();
        OWLDataProperty result26 = testSubject0.asOWLDataProperty();
        boolean result27 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result28 = testSubject0.asOWLNamedIndividual();
        boolean result29 = testSubject0.isOWLDatatype();
        OWLDatatype result30 = testSubject0.asOWLDatatype();
        boolean result31 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result32 = testSubject0.asOWLAnnotationProperty();
        String result33 = testSubject0.toStringID();
        int result34 = testSubject0.compareTo(_Object110);
        int result35 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result36 = testSubject0.getSignature();
        java.util.Set<OWLClass> result37 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result38 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result39 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result40 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result41 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result42 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result43 = testSubject0.getNestedClassExpressions();
        boolean result44 = testSubject0.isTopEntity();
        boolean result45 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiomImpl.class));
        assertTrue(OWLAnnotationPropertyRangeAxiom.class.isAssignableFrom(OWLAnnotationPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLAnnotationPropertyRangeAxiomImpl() {
        OWLAnnotationPropertyRangeAxiomImpl testSubject0 = new OWLAnnotationPropertyRangeAxiomImpl(_OWLAnnotationProperty, _IRI, _Collection);
        OWLAnnotationProperty result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx127);
        IRI result3 = testSubject0.getRange();
        OWLAnnotationPropertyRangeAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLAnnotationPropertyRangeAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAnonymousClassExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassExpressionImpl.class.isAssignableFrom(OWLAnonymousClassExpressionImpl.class));
        assertTrue(OWLAnonymousClassExpression.class.isAssignableFrom(OWLAnonymousClassExpressionImpl.class));
    }

    public void verifyOWLAnonymousClassExpressionImpl() {
        OWLAnonymousClassExpressionImpl testSubject0 = new OWLAnonymousClassExpressionImpl() {
            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public boolean isClassExpressionLiteral() {
                return false;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isOWLThing();
        boolean result1 = testSubject0.isOWLNothing();
        OWLClassExpression result2 = testSubject0.getComplementNNF();
        OWLClassExpression result3 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result4 = testSubject0.asConjunctSet();
        boolean result5 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result6 = testSubject0.asDisjunctSet();
        OWLClassExpression result7 = testSubject0.getNNF();
        boolean result8 = testSubject0.isAnonymous();
        OWLClass result9 = testSubject0.asOWLClass();
        int result10 = testSubject0.compareTo(_Object110);
        int result11 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result12 = testSubject0.getSignature();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result14 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result15 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result16 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result17 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result18 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result19 = testSubject0.getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result23 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result24 = testSubject0.getClassExpressionType();
        boolean result25 = testSubject0.isClassExpressionLiteral();
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualImpl.class.isAssignableFrom(OWLAnonymousIndividualImpl.class));
        assertTrue(OWLAnonymousIndividual.class.isAssignableFrom(OWLAnonymousIndividualImpl.class));
    }

    public void verifyOWLAnonymousIndividualImpl() {
        OWLAnonymousIndividualImpl testSubject0 = new OWLAnonymousIndividualImpl(_NodeID);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result2 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationSubjectVisitor);
        OWLEntity result3 = testSubject0.accept(_OWLAnnotationSubjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLIndividualVisitor);
        NodeID result4 = testSubject0.getID();
        boolean result5 = testSubject0.isNamed();
        OWLAnonymousIndividual result6 = testSubject0.asOWLAnonymousIndividual();
        boolean result7 = testSubject0.isAnonymous();
        OWLNamedIndividual result8 = testSubject0.asOWLNamedIndividual();
        String result9 = testSubject0.toStringID();
        java.util.Set<OWLClassExpression> result10 = testSubject0.getTypes(_Set);
        java.util.Set<OWLClassExpression> result11 = testSubject0.getTypes(_OWLOntology);
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLIndividual>> result12 = testSubject0.getObjectPropertyValues(_OWLOntology);
        java.util.Set<OWLIndividual> result13 = testSubject0.getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        boolean result14 = testSubject0.hasObjectPropertyValue(_OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result15 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        boolean result16 = testSubject0.hasNegativeObjectPropertyValue(_OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLIndividual>> result17 = testSubject0.getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<OWLDataPropertyExpression, java.util.Set<OWLLiteral>> result18 = testSubject0.getDataPropertyValues(_OWLOntology);
        java.util.Set<OWLLiteral> result19 = testSubject0.getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<OWLDataPropertyExpression, java.util.Set<OWLLiteral>> result20 = testSubject0.getNegativeDataPropertyValues(_OWLOntology);
        boolean result21 = testSubject0.hasNegativeDataPropertyValue(_OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<OWLIndividual> result22 = testSubject0.getSameIndividuals(_OWLOntology);
        java.util.Set<OWLIndividual> result23 = testSubject0.getDifferentIndividuals(_OWLOntology);
        boolean result24 = testSubject0.isBuiltIn();
        boolean result25 = testSubject0.isOWLClass();
        OWLClass result26 = testSubject0.asOWLClass();
        boolean result27 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result28 = testSubject0.asOWLObjectProperty();
        boolean result29 = testSubject0.isOWLDataProperty();
        OWLDataProperty result30 = testSubject0.asOWLDataProperty();
        boolean result31 = testSubject0.isOWLDatatype();
        OWLDatatype result32 = testSubject0.asOWLDatatype();
        int result33 = testSubject0.compareTo(_Object110);
        int result34 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result35 = testSubject0.getSignature();
        java.util.Set<OWLClass> result36 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result37 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result38 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result39 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result40 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result41 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result42 = testSubject0.getNestedClassExpressions();
        boolean result43 = testSubject0.isTopEntity();
        boolean result44 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLAsymmetricObjectPropertyAxiomImpl.class));
        assertTrue(OWLAsymmetricObjectPropertyAxiom.class.isAssignableFrom(OWLAsymmetricObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLAsymmetricObjectPropertyAxiomImpl() {
        OWLAsymmetricObjectPropertyAxiomImpl testSubject0 = new OWLAsymmetricObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLAsymmetricObjectPropertyAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAsymmetricObjectPropertyAxiom result4 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLPropertyExpression result7 = testSubject0.getProperty();
        OWLObjectPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLAxiomImpl.class));
        assertTrue(OWLAxiom.class.isAssignableFrom(OWLAxiomImpl.class));
        assertTrue(uk.ac.manchester.cs.owl.owlapi.CollectionContainer.class.isAssignableFrom(OWLAxiomImpl.class));
    }

    public void verifyOWLAxiomImpl() {
        OWLAxiomImpl testSubject0 = new OWLAxiomImpl(_Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public boolean isLogicalAxiom() {
                return false;
            }

            @Override
            public boolean isAnnotationAxiom() {
                return false;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result2 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result3 = testSubject0.isAnnotated();
        boolean result4 = testSubject0.isOfType(_Set132);
        boolean result5 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result6 = testSubject0.getNNF();
        int result7 = testSubject0.compareTo(_Object110);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
        OWLObject result19 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result20 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result21 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result22 = testSubject0.getAnnotatedAxiom(_Set129);
        boolean result23 = testSubject0.isLogicalAxiom();
        boolean result24 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLCardinalityRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLCardinalityRestrictionImpl.class));
        assertTrue(OWLCardinalityRestriction.class.isAssignableFrom(OWLCardinalityRestrictionImpl.class));
    }

    public void verifyOWLCardinalityRestrictionImpl() {
        OWLCardinalityRestrictionImpl testSubject0 = mock(OWLCardinalityRestrictionImpl.class);
        int result0 = testSubject0.getCardinality();
        OWLPropertyRange result1 = testSubject0.getFiller();
        OWLPropertyExpression result2 = testSubject0.getProperty();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        boolean result4 = testSubject0.isOWLThing();
        boolean result5 = testSubject0.isOWLNothing();
        OWLClassExpression result6 = testSubject0.getComplementNNF();
        OWLClassExpression result7 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result8 = testSubject0.asConjunctSet();
        boolean result9 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.asDisjunctSet();
        OWLClassExpression result11 = testSubject0.getNNF();
        boolean result12 = testSubject0.isAnonymous();
        OWLClass result13 = testSubject0.asOWLClass();
        int result14 = testSubject0.compareTo(_Object110);
        int result15 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result16 = testSubject0.getSignature();
        java.util.Set<OWLClass> result17 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result18 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result19 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result20 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result21 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result22 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result23 = testSubject0.getNestedClassExpressions();
        boolean result24 = testSubject0.isTopEntity();
        boolean result25 = testSubject0.isBottomEntity();
        OWLObject result26 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result27 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result28 = testSubject0.getClassExpressionType();
        boolean result29 = testSubject0.isObjectRestriction();
        boolean result30 = testSubject0.isDataRestriction();
        boolean result31 = testSubject0.isQualified();
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
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLIndividual result2 = testSubject0.getIndividual();
        OWLClassExpression result3 = testSubject0.getClassExpression();
        OWLSubClassOfAxiom result4 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassAssertionAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLClassAssertionAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
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
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result23 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result24 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLClassExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLClassExpressionImpl.class));
        assertTrue(OWLClassExpression.class.isAssignableFrom(OWLClassExpressionImpl.class));
    }

    public void verifyOWLClassExpressionImpl() {
        OWLClassExpressionImpl testSubject0 = new OWLClassExpressionImpl() {
            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public boolean isClassExpressionLiteral() {
                return false;
            }

            @Override
            public OWLClass asOWLClass() {
                return null;
            }

            @Override
            public boolean isOWLThing() {
                return false;
            }

            @Override
            public boolean isOWLNothing() {
                return false;
            }

            @Override
            public OWLClassExpression getNNF() {
                return null;
            }

            @Override
            public OWLClassExpression getComplementNNF() {
                return null;
            }

            @Override
            public OWLClassExpression getObjectComplementOf() {
                return null;
            }

            @Override
            public Set<OWLClassExpression> asConjunctSet() {
                return null;
            }

            @Override
            public boolean containsConjunct(OWLClassExpression ce) {
                return false;
            }

            @Override
            public Set<OWLClassExpression> asDisjunctSet() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        int result0 = testSubject0.compareTo(_Object110);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        OWLObject result12 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result13 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        boolean result14 = testSubject0.isOWLThing();
        ClassExpressionType result15 = testSubject0.getClassExpressionType();
        boolean result16 = testSubject0.isClassExpressionLiteral();
        boolean result17 = testSubject0.isOWLNothing();
        OWLClassExpression result18 = testSubject0.getComplementNNF();
        OWLClassExpression result19 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result20 = testSubject0.asConjunctSet();
        boolean result21 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result22 = testSubject0.asDisjunctSet();
        OWLClassExpression result23 = testSubject0.getNNF();
        boolean result24 = testSubject0.isAnonymous();
        OWLClass result25 = testSubject0.asOWLClass();
    }

    @Test
    public void enforceInterfacesOWLClassImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassExpressionImpl.class.isAssignableFrom(OWLClassImpl.class));
        assertTrue(OWLClass.class.isAssignableFrom(OWLClassImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLClassImpl.class));
    }

    public void verifyOWLClassImpl() {
        OWLClassImpl testSubject0 = new OWLClassImpl(_IRI);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLOntology);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        boolean result2 = testSubject0.isType(_EntityType);
        boolean result3 = testSubject0.isDefined(_Set);
        boolean result4 = testSubject0.isDefined(_OWLOntology);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result6 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result7 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Set<OWLClassExpression> result8 = testSubject0.getSuperClasses(_Set);
        java.util.Set<OWLClassExpression> result9 = testSubject0.getSuperClasses(_OWLOntology);
        java.util.Set<OWLClassExpression> result10 = testSubject0.getSubClasses(_Set);
        java.util.Set<OWLClassExpression> result11 = testSubject0.getSubClasses(_OWLOntology);
        java.util.Set<OWLClassExpression> result12 = testSubject0.getEquivalentClasses(_OWLOntology);
        java.util.Set<OWLClassExpression> result13 = testSubject0.getEquivalentClasses(_Set);
        java.util.Set<OWLClassExpression> result14 = testSubject0.getDisjointClasses(_Set);
        java.util.Set<OWLClassExpression> result15 = testSubject0.getDisjointClasses(_OWLOntology);
        java.util.Set<OWLIndividual> result16 = testSubject0.getIndividuals(_Set);
        java.util.Set<OWLIndividual> result17 = testSubject0.getIndividuals(_OWLOntology);
        boolean result18 = testSubject0.isOWLThing();
        ClassExpressionType result19 = testSubject0.getClassExpressionType();
        boolean result20 = testSubject0.isClassExpressionLiteral();
        boolean result21 = testSubject0.isOWLNothing();
        OWLClassExpression result22 = testSubject0.getComplementNNF();
        OWLClassExpression result23 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result24 = testSubject0.asConjunctSet();
        boolean result25 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result26 = testSubject0.asDisjunctSet();
        java.util.Set<OWLSubClassOfAxiom> result27 = testSubject0.getSubClassAxioms(_OWLOntology);
        boolean result28 = testSubject0.isBuiltIn();
        OWLClassExpression result29 = testSubject0.getNNF();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
        boolean result32 = testSubject0.isAnonymous();
        java.util.Set<OWLAxiom> result33 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAxiom> result34 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAnnotationAssertionAxiom> result35 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        java.util.Set<OWLEquivalentClassesAxiom> result36 = testSubject0.getEquivalentClassesAxioms(_OWLOntology);
        java.util.Set<OWLDisjointClassesAxiom> result37 = testSubject0.getDisjointClassesAxioms(_OWLOntology);
        java.util.Set<OWLDisjointUnionAxiom> result38 = testSubject0.getDisjointUnionAxioms(_OWLOntology);
        IRI result39 = testSubject0.getIRI();
        EntityType<?> result40 = testSubject0.getEntityType();
        OWLEntity result41 = testSubject0.getOWLEntity(_EntityType123);
        boolean result42 = testSubject0.isOWLClass();
        OWLClass result43 = testSubject0.asOWLClass();
        boolean result44 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result45 = testSubject0.asOWLObjectProperty();
        boolean result46 = testSubject0.isOWLDataProperty();
        OWLDataProperty result47 = testSubject0.asOWLDataProperty();
        boolean result48 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result49 = testSubject0.asOWLNamedIndividual();
        boolean result50 = testSubject0.isOWLDatatype();
        OWLDatatype result51 = testSubject0.asOWLDatatype();
        boolean result52 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result53 = testSubject0.asOWLAnnotationProperty();
        String result54 = testSubject0.toStringID();
        int result55 = testSubject0.compareTo(_Object110);
        int result56 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result57 = testSubject0.getSignature();
        java.util.Set<OWLClass> result58 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result59 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result60 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result61 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result62 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result63 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result64 = testSubject0.getNestedClassExpressions();
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
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLDataRange result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataCardinalityRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataCardinalityRestrictionImpl.class));
        assertTrue(OWLDataCardinalityRestriction.class.isAssignableFrom(OWLDataCardinalityRestrictionImpl.class));
    }

    public void verifyOWLDataCardinalityRestrictionImpl() {
        OWLDataCardinalityRestrictionImpl testSubject0 = mock(OWLDataCardinalityRestrictionImpl.class);
        boolean result0 = testSubject0.isQualified();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        int result3 = testSubject0.getCardinality();
        OWLDataRange result4 = testSubject0.getFiller();
        OWLPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        OWLObject result29 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result30 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result31 = testSubject0.getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLDataComplementOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDataComplementOfImpl.class));
        assertTrue(OWLDataComplementOf.class.isAssignableFrom(OWLDataComplementOfImpl.class));
    }

    public void verifyOWLDataComplementOfImpl() {
        OWLDataComplementOfImpl testSubject0 = new OWLDataComplementOfImpl(_OWLDataRange);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDataRange result6 = testSubject0.getDataRange();
        OWLDatatype result7 = testSubject0.asOWLDatatype();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataExactCardinalityImpl.class));
        assertTrue(OWLDataExactCardinality.class.isAssignableFrom(OWLDataExactCardinalityImpl.class));
    }

    public void verifyOWLDataExactCardinalityImpl() {
        OWLDataExactCardinalityImpl testSubject0 = new OWLDataExactCardinalityImpl(_OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLDataExactCardinalityImpl testSubject1 = new OWLDataExactCardinalityImpl(_OWLDataPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        OWLClassExpression result3 = testSubject0.asIntersectionOfMinMax();
        boolean result4 = testSubject0.isQualified();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        int result7 = testSubject0.getCardinality();
        OWLDataRange result8 = testSubject0.getFiller();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLThing();
        boolean result12 = testSubject0.isOWLNothing();
        OWLClassExpression result13 = testSubject0.getComplementNNF();
        OWLClassExpression result14 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result15 = testSubject0.asConjunctSet();
        boolean result16 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result17 = testSubject0.asDisjunctSet();
        OWLClassExpression result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.isAnonymous();
        OWLClass result20 = testSubject0.asOWLClass();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataFactoryImpl() {
        assertTrue(OWLDataFactory.class.isAssignableFrom(OWLDataFactoryImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLDataFactoryImpl.class));
    }

    public void verifyOWLDataFactoryImpl() {
        OWLDataFactoryImpl testSubject0 = new OWLDataFactoryImpl(_boolean, _boolean);
        OWLDataFactoryImpl testSubject1 = new OWLDataFactoryImpl();
        OWLDataFactory result0 = OWLDataFactoryImpl.getInstance();
        OWLEquivalentClassesAxiom result1 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression, _Set134);
        OWLEquivalentClassesAxiom result2 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression_array);
        OWLEquivalentClassesAxiom result3 = testSubject0.getOWLEquivalentClassesAxiom(_Set152, _Set134);
        OWLEquivalentClassesAxiom result4 = testSubject0.getOWLEquivalentClassesAxiom(_Set152);
        OWLEquivalentClassesAxiom result5 = testSubject0.getOWLEquivalentClassesAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLDisjointClassesAxiom result6 = testSubject0.getOWLDisjointClassesAxiom(_Set152, _Set134);
        OWLDisjointClassesAxiom result7 = testSubject0.getOWLDisjointClassesAxiom(_OWLClassExpression_array);
        OWLDisjointClassesAxiom result8 = testSubject0.getOWLDisjointClassesAxiom(_Set152);
        OWLClass result9 = testSubject0.getOWLClass(_String, _PrefixManager);
        OWLClass result10 = testSubject0.getOWLClass(_IRI);
        OWLClass result11 = testSubject0.getOWLThing();
        testSubject0.purge();
        OWLNamedIndividual result12 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLNamedIndividual result13 = testSubject0.getOWLNamedIndividual(_String, _PrefixManager);
        OWLObjectInverseOf result14 = testSubject0.getOWLObjectInverseOf(_OWLObjectPropertyExpression);
        OWLDatatype result15 = testSubject0.getTopDatatype();
        OWLObjectProperty result16 = testSubject0.getOWLObjectProperty(_IRI);
        OWLObjectProperty result17 = testSubject0.getOWLObjectProperty(_String, _PrefixManager);
        OWLDataProperty result18 = testSubject0.getOWLDataProperty(_IRI);
        OWLDataProperty result19 = testSubject0.getOWLDataProperty(_String, _PrefixManager);
        OWLClass result20 = testSubject0.getOWLNothing();
        OWLObjectProperty result21 = testSubject0.getOWLTopObjectProperty();
        OWLDataProperty result22 = testSubject0.getOWLTopDataProperty();
        OWLObjectProperty result23 = testSubject0.getOWLBottomObjectProperty();
        OWLDataProperty result24 = testSubject0.getOWLBottomDataProperty();
        OWLAnonymousIndividual result25 = testSubject0.getOWLAnonymousIndividual();
        OWLAnonymousIndividual result26 = testSubject0.getOWLAnonymousIndividual(_String);
        OWLAnnotationProperty result27 = testSubject0.getOWLAnnotationProperty(_String, _PrefixManager);
        OWLAnnotationProperty result28 = testSubject0.getOWLAnnotationProperty(_IRI);
        OWLAnnotationProperty result29 = testSubject0.getRDFSLabel();
        OWLAnnotationProperty result30 = testSubject0.getRDFSComment();
        OWLAnnotationProperty result31 = testSubject0.getRDFSSeeAlso();
        OWLAnnotationProperty result32 = testSubject0.getRDFSIsDefinedBy();
        OWLAnnotationProperty result33 = testSubject0.getOWLVersionInfo();
        OWLAnnotationProperty result34 = testSubject0.getOWLBackwardCompatibleWith();
        OWLAnnotationProperty result35 = testSubject0.getOWLIncompatibleWith();
        OWLAnnotationProperty result36 = testSubject0.getOWLDeprecated();
        OWLDatatype result37 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result38 = testSubject0.getOWLDatatype(_String, _PrefixManager);
        OWLDatatype result39 = testSubject0.getOWLDatatype(_IRI);
        OWLDatatype result40 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result41 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result42 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result43 = testSubject0.getBooleanOWLDatatype();
        OWLLiteral result44 = testSubject0.getOWLLiteral(_String, _String);
        OWLLiteral result45 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result46 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result47 = testSubject0.getOWLLiteral(_String, _OWL2Datatype);
        OWLLiteral result48 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result49 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result50 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result51 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result52 = testSubject0.getOWLTypedLiteral(_String, _OWLDatatype);
        OWLLiteral result53 = testSubject0.getOWLTypedLiteral(_boolean);
        OWLLiteral result54 = testSubject0.getOWLTypedLiteral(_float);
        OWLLiteral result55 = testSubject0.getOWLTypedLiteral(_String);
        OWLLiteral result56 = testSubject0.getOWLTypedLiteral(_double);
        OWLLiteral result57 = testSubject0.getOWLTypedLiteral(_String, _OWL2Datatype);
        OWLLiteral result58 = testSubject0.getOWLTypedLiteral(_int);
        OWLLiteral result59 = testSubject0.getOWLStringLiteral(_String, _String);
        OWLLiteral result60 = testSubject0.getOWLStringLiteral(_String);
        OWLDataOneOf result61 = testSubject0.getOWLDataOneOf(_Set154);
        OWLDataOneOf result62 = testSubject0.getOWLDataOneOf(_OWLLiteral_array);
        OWLDataComplementOf result63 = testSubject0.getOWLDataComplementOf(_OWLDataRange);
        OWLDatatypeRestriction result64 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacetRestriction_array);
        OWLDatatypeRestriction result65 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _OWLFacet, _OWLLiteral);
        OWLDatatypeRestriction result66 = testSubject0.getOWLDatatypeRestriction(_OWLDatatype, _Set158);
        OWLDatatypeRestriction result67 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_double);
        OWLDatatypeRestriction result68 = testSubject0.getOWLDatatypeMinInclusiveRestriction(_int);
        OWLDatatypeRestriction result69 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_int);
        OWLDatatypeRestriction result70 = testSubject0.getOWLDatatypeMaxInclusiveRestriction(_double);
        OWLDatatypeRestriction result71 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_int, _int);
        OWLDatatypeRestriction result72 = testSubject0.getOWLDatatypeMinMaxInclusiveRestriction(_double, _double);
        OWLDatatypeRestriction result73 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_double);
        OWLDatatypeRestriction result74 = testSubject0.getOWLDatatypeMinExclusiveRestriction(_int);
        OWLDatatypeRestriction result75 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_double);
        OWLDatatypeRestriction result76 = testSubject0.getOWLDatatypeMaxExclusiveRestriction(_int);
        OWLDatatypeRestriction result77 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_int, _int);
        OWLDatatypeRestriction result78 = testSubject0.getOWLDatatypeMinMaxExclusiveRestriction(_double, _double);
        OWLFacetRestriction result79 = testSubject0.getOWLFacetRestriction(_OWLFacet, _float);
        OWLFacetRestriction result80 = testSubject0.getOWLFacetRestriction(_OWLFacet, _int);
        OWLFacetRestriction result81 = testSubject0.getOWLFacetRestriction(_OWLFacet, _double);
        OWLFacetRestriction result82 = testSubject0.getOWLFacetRestriction(_OWLFacet, _OWLLiteral);
        OWLDataUnionOf result83 = testSubject0.getOWLDataUnionOf(_Set159);
        OWLDataUnionOf result84 = testSubject0.getOWLDataUnionOf(_OWLDataRange_array);
        OWLDataIntersectionOf result85 = testSubject0.getOWLDataIntersectionOf(_Set159);
        OWLDataIntersectionOf result86 = testSubject0.getOWLDataIntersectionOf(_OWLDataRange_array);
        OWLObjectIntersectionOf result87 = testSubject0.getOWLObjectIntersectionOf(_OWLClassExpression_array);
        OWLObjectIntersectionOf result88 = testSubject0.getOWLObjectIntersectionOf(_Set152);
        OWLDataSomeValuesFrom result89 = testSubject0.getOWLDataSomeValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataAllValuesFrom result90 = testSubject0.getOWLDataAllValuesFrom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result91 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataExactCardinality result92 = testSubject0.getOWLDataExactCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMaxCardinality result93 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMaxCardinality result94 = testSubject0.getOWLDataMaxCardinality(_int, _OWLDataPropertyExpression);
        OWLDataMinCardinality result95 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression, _OWLDataRange);
        OWLDataMinCardinality result96 = testSubject0.getOWLDataMinCardinality(_int, _OWLDataPropertyExpression);
        OWLDataHasValue result97 = testSubject0.getOWLDataHasValue(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObjectComplementOf result98 = testSubject0.getOWLObjectComplementOf(_OWLClassExpression);
        OWLObjectOneOf result99 = testSubject0.getOWLObjectOneOf(_Set161);
        OWLObjectOneOf result100 = testSubject0.getOWLObjectOneOf(_OWLIndividual_array);
        OWLObjectAllValuesFrom result101 = testSubject0.getOWLObjectAllValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectSomeValuesFrom result102 = testSubject0.getOWLObjectSomeValuesFrom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectExactCardinality result103 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectExactCardinality result104 = testSubject0.getOWLObjectExactCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMinCardinality result105 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMinCardinality result106 = testSubject0.getOWLObjectMinCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectMaxCardinality result107 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectMaxCardinality result108 = testSubject0.getOWLObjectMaxCardinality(_int, _OWLObjectPropertyExpression);
        OWLObjectHasSelf result109 = testSubject0.getOWLObjectHasSelf(_OWLObjectPropertyExpression);
        OWLObjectHasValue result110 = testSubject0.getOWLObjectHasValue(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObjectUnionOf result111 = testSubject0.getOWLObjectUnionOf(_OWLClassExpression_array);
        OWLObjectUnionOf result112 = testSubject0.getOWLObjectUnionOf(_Set152);
        OWLDeclarationAxiom result113 = testSubject0.getOWLDeclarationAxiom(_OWLEntity, _Set134);
        OWLDeclarationAxiom result114 = testSubject0.getOWLDeclarationAxiom(_OWLEntity);
        OWLSubClassOfAxiom result115 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression, _Set134);
        OWLSubClassOfAxiom result116 = testSubject0.getOWLSubClassOfAxiom(_OWLClassExpression, _OWLClassExpression);
        OWLDisjointUnionAxiom result117 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set152);
        OWLDisjointUnionAxiom result118 = testSubject0.getOWLDisjointUnionAxiom(_OWLClass, _Set152, _Set134);
        OWLSubObjectPropertyOfAxiom result119 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set134);
        OWLSubObjectPropertyOfAxiom result120 = testSubject0.getOWLSubObjectPropertyOfAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLSubPropertyChainOfAxiom result121 = testSubject0.getOWLSubPropertyChainOfAxiom(_List, _OWLObjectPropertyExpression, _Set134);
        OWLSubPropertyChainOfAxiom result122 = testSubject0.getOWLSubPropertyChainOfAxiom(_List, _OWLObjectPropertyExpression);
        OWLEquivalentObjectPropertiesAxiom result123 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLEquivalentObjectPropertiesAxiom result124 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set134);
        OWLEquivalentObjectPropertiesAxiom result125 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set164, _Set134);
        OWLEquivalentObjectPropertiesAxiom result126 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_Set164);
        OWLEquivalentObjectPropertiesAxiom result127 = testSubject0.getOWLEquivalentObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result128 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_OWLObjectPropertyExpression_array);
        OWLDisjointObjectPropertiesAxiom result129 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set164, _Set134);
        OWLDisjointObjectPropertiesAxiom result130 = testSubject0.getOWLDisjointObjectPropertiesAxiom(_Set164);
        OWLInverseObjectPropertiesAxiom result131 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Set134);
        OWLInverseObjectPropertiesAxiom result132 = testSubject0.getOWLInverseObjectPropertiesAxiom(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression);
        OWLObjectPropertyDomainAxiom result133 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set134);
        OWLObjectPropertyDomainAxiom result134 = testSubject0.getOWLObjectPropertyDomainAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result135 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression);
        OWLObjectPropertyRangeAxiom result136 = testSubject0.getOWLObjectPropertyRangeAxiom(_OWLObjectPropertyExpression, _OWLClassExpression, _Set134);
        OWLFunctionalObjectPropertyAxiom result137 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLFunctionalObjectPropertyAxiom result138 = testSubject0.getOWLFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result139 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLInverseFunctionalObjectPropertyAxiom result140 = testSubject0.getOWLInverseFunctionalObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLReflexiveObjectPropertyAxiom result141 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLReflexiveObjectPropertyAxiom result142 = testSubject0.getOWLReflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLIrreflexiveObjectPropertyAxiom result143 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLIrreflexiveObjectPropertyAxiom result144 = testSubject0.getOWLIrreflexiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLSymmetricObjectPropertyAxiom result145 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLSymmetricObjectPropertyAxiom result146 = testSubject0.getOWLSymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLAsymmetricObjectPropertyAxiom result147 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLAsymmetricObjectPropertyAxiom result148 = testSubject0.getOWLAsymmetricObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLTransitiveObjectPropertyAxiom result149 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression);
        OWLTransitiveObjectPropertyAxiom result150 = testSubject0.getOWLTransitiveObjectPropertyAxiom(_OWLObjectPropertyExpression, _Set134);
        OWLSubDataPropertyOfAxiom result151 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLSubDataPropertyOfAxiom result152 = testSubject0.getOWLSubDataPropertyOfAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set134);
        OWLEquivalentDataPropertiesAxiom result153 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLEquivalentDataPropertiesAxiom result154 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set167);
        OWLEquivalentDataPropertiesAxiom result155 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression);
        OWLEquivalentDataPropertiesAxiom result156 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Set134);
        OWLEquivalentDataPropertiesAxiom result157 = testSubject0.getOWLEquivalentDataPropertiesAxiom(_Set167, _Set134);
        OWLDisjointDataPropertiesAxiom result158 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set167);
        OWLDisjointDataPropertiesAxiom result159 = testSubject0.getOWLDisjointDataPropertiesAxiom(_OWLDataPropertyExpression_array);
        OWLDisjointDataPropertiesAxiom result160 = testSubject0.getOWLDisjointDataPropertiesAxiom(_Set167, _Set134);
        OWLDataPropertyDomainAxiom result161 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression);
        OWLDataPropertyDomainAxiom result162 = testSubject0.getOWLDataPropertyDomainAxiom(_OWLDataPropertyExpression, _OWLClassExpression, _Set134);
        OWLDataPropertyRangeAxiom result163 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange, _Set134);
        OWLDataPropertyRangeAxiom result164 = testSubject0.getOWLDataPropertyRangeAxiom(_OWLDataPropertyExpression, _OWLDataRange);
        OWLFunctionalDataPropertyAxiom result165 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression);
        OWLFunctionalDataPropertyAxiom result166 = testSubject0.getOWLFunctionalDataPropertyAxiom(_OWLDataPropertyExpression, _Set134);
        OWLHasKeyAxiom result167 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set168, _Set134);
        OWLHasKeyAxiom result168 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _OWLPropertyExpression_array);
        OWLHasKeyAxiom result169 = testSubject0.getOWLHasKeyAxiom(_OWLClassExpression, _Set168);
        OWLDatatypeDefinitionAxiom result170 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange);
        OWLDatatypeDefinitionAxiom result171 = testSubject0.getOWLDatatypeDefinitionAxiom(_OWLDatatype, _OWLDataRange, _Set134);
        OWLSameIndividualAxiom result172 = testSubject0.getOWLSameIndividualAxiom(_OWLIndividual_array);
        OWLSameIndividualAxiom result173 = testSubject0.getOWLSameIndividualAxiom(_Set161);
        OWLSameIndividualAxiom result174 = testSubject0.getOWLSameIndividualAxiom(_Set161, _Set134);
        OWLDifferentIndividualsAxiom result175 = testSubject0.getOWLDifferentIndividualsAxiom(_OWLIndividual_array);
        OWLDifferentIndividualsAxiom result176 = testSubject0.getOWLDifferentIndividualsAxiom(_Set161);
        OWLDifferentIndividualsAxiom result177 = testSubject0.getOWLDifferentIndividualsAxiom(_Set161, _Set134);
        OWLClassAssertionAxiom result178 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual, _Set134);
        OWLClassAssertionAxiom result179 = testSubject0.getOWLClassAssertionAxiom(_OWLClassExpression, _OWLIndividual);
        OWLObjectPropertyAssertionAxiom result180 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual, _Set134);
        OWLObjectPropertyAssertionAxiom result181 = testSubject0.getOWLObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeObjectPropertyAssertionAxiom result182 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual);
        OWLNegativeObjectPropertyAssertionAxiom result183 = testSubject0.getOWLNegativeObjectPropertyAssertionAxiom(_OWLObjectPropertyExpression, _OWLIndividual, _OWLIndividual,
                _Set134);
        OWLDataPropertyAssertionAxiom result184 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set134);
        OWLDataPropertyAssertionAxiom result185 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLDataPropertyAssertionAxiom result186 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _int);
        OWLDataPropertyAssertionAxiom result187 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _double);
        OWLDataPropertyAssertionAxiom result188 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _String);
        OWLDataPropertyAssertionAxiom result189 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _float);
        OWLDataPropertyAssertionAxiom result190 = testSubject0.getOWLDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _boolean);
        OWLNegativeDataPropertyAssertionAxiom result191 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral, _Set134);
        OWLNegativeDataPropertyAssertionAxiom result192 = testSubject0.getOWLNegativeDataPropertyAssertionAxiom(_OWLDataPropertyExpression, _OWLIndividual, _OWLLiteral);
        OWLAnnotation result193 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue);
        OWLAnnotation result194 = testSubject0.getOWLAnnotation(_OWLAnnotationProperty, _OWLAnnotationValue, _Set134);
        OWLAnnotationAssertionAxiom result195 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue, _Set134);
        OWLAnnotationAssertionAxiom result196 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation, _Set134);
        OWLAnnotationAssertionAxiom result197 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationSubject, _OWLAnnotation);
        OWLAnnotationAssertionAxiom result198 = testSubject0.getOWLAnnotationAssertionAxiom(_OWLAnnotationProperty, _OWLAnnotationSubject, _OWLAnnotationValue);
        OWLAnnotationAssertionAxiom result199 = testSubject0.getDeprecatedOWLAnnotationAssertionAxiom(_IRI);
        OWLImportsDeclaration result200 = testSubject0.getOWLImportsDeclaration(_IRI);
        OWLAnnotationPropertyDomainAxiom result201 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI, _Set134);
        OWLAnnotationPropertyDomainAxiom result202 = testSubject0.getOWLAnnotationPropertyDomainAxiom(_OWLAnnotationProperty, _IRI);
        OWLAnnotationPropertyRangeAxiom result203 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI, _Set134);
        OWLAnnotationPropertyRangeAxiom result204 = testSubject0.getOWLAnnotationPropertyRangeAxiom(_OWLAnnotationProperty, _IRI);
        OWLSubAnnotationPropertyOfAxiom result205 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty);
        OWLSubAnnotationPropertyOfAxiom result206 = testSubject0.getOWLSubAnnotationPropertyOfAxiom(_OWLAnnotationProperty, _OWLAnnotationProperty, _Set134);
        SWRLRule result207 = testSubject0.getSWRLRule(_NodeID, _Set170, _Set170);
        SWRLRule result208 = testSubject0.getSWRLRule(_Set170, _Set170);
        SWRLRule result209 = testSubject0.getSWRLRule(_IRI, _Set170, _Set170);
        SWRLRule result210 = testSubject0.getSWRLRule(_Set170, _Set170, _Set129);
        SWRLClassAtom result211 = testSubject0.getSWRLClassAtom(_OWLClassExpression, _SWRLIArgument);
        SWRLDataRangeAtom result212 = testSubject0.getSWRLDataRangeAtom(_OWLDataRange, _SWRLDArgument);
        SWRLObjectPropertyAtom result213 = testSubject0.getSWRLObjectPropertyAtom(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        SWRLDataPropertyAtom result214 = testSubject0.getSWRLDataPropertyAtom(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        SWRLBuiltInAtom result215 = testSubject0.getSWRLBuiltInAtom(_IRI, _List173);
        SWRLVariable result216 = testSubject0.getSWRLVariable(_IRI);
        SWRLIndividualArgument result217 = testSubject0.getSWRLIndividualArgument(_OWLIndividual);
        SWRLLiteralArgument result218 = testSubject0.getSWRLLiteralArgument(_OWLLiteral);
        SWRLSameIndividualAtom result219 = testSubject0.getSWRLSameIndividualAtom(_SWRLIArgument, _SWRLIArgument);
        SWRLDifferentIndividualsAtom result220 = testSubject0.getSWRLDifferentIndividualsAtom(_SWRLIArgument, _SWRLIArgument);
        OWLEntity result221 = testSubject0.getOWLEntity(_EntityType123, _IRI);
    }

    public void verifyInterfaceOWLDataFactoryInternals() {
        OWLDataFactoryInternals testSubject0 = mock(OWLDataFactoryInternals.class);
        OWLClass result0 = testSubject0.getOWLClass(_IRI);
        testSubject0.purge();
        OWLNamedIndividual result1 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLDatatype result2 = testSubject0.getTopDatatype();
        OWLObjectProperty result3 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result4 = testSubject0.getOWLDataProperty(_IRI);
        OWLAnnotationProperty result5 = testSubject0.getOWLAnnotationProperty(_IRI);
        OWLDatatype result6 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result7 = testSubject0.getOWLDatatype(_IRI);
        OWLDatatype result8 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result9 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result10 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result11 = testSubject0.getBooleanOWLDatatype();
        OWLLiteral result12 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result13 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result14 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result15 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result16 = testSubject0.getOWLLiteral(_float);
        OWLLiteral result17 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result18 = testSubject0.getOWLLiteral(_String, _String);
    }

    @Test
    public void enforceInterfacesOWLDataFactoryInternalsImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.InternalsNoCache.class.isAssignableFrom(OWLDataFactoryInternalsImpl.class));
    }

    public void verifyOWLDataFactoryInternalsImpl() {
        OWLDataFactoryInternalsImpl testSubject0 = new OWLDataFactoryInternalsImpl(_boolean);
        OWLClass result0 = testSubject0.getOWLClass(_IRI);
        testSubject0.purge();
        OWLNamedIndividual result1 = testSubject0.getOWLNamedIndividual(_IRI);
        OWLObjectProperty result2 = testSubject0.getOWLObjectProperty(_IRI);
        OWLDataProperty result3 = testSubject0.getOWLDataProperty(_IRI);
        OWLAnnotationProperty result4 = testSubject0.getOWLAnnotationProperty(_IRI);
        OWLDatatype result5 = testSubject0.getOWLDatatype(_IRI);
        OWLLiteral result6 = testSubject0.getOWLLiteral(_String);
        OWLLiteral result7 = testSubject0.getOWLLiteral(_int);
        OWLLiteral result8 = testSubject0.getOWLLiteral(_double);
        OWLLiteral result9 = testSubject0.getOWLLiteral(_String, _OWLDatatype);
        OWLLiteral result10 = testSubject0.getOWLLiteral(_float);
        OWLDatatype result11 = testSubject0.getTopDatatype();
        OWLDatatype result12 = testSubject0.getRDFPlainLiteral();
        OWLDatatype result13 = testSubject0.getIntegerOWLDatatype();
        OWLDatatype result14 = testSubject0.getFloatOWLDatatype();
        OWLDatatype result15 = testSubject0.getDoubleOWLDatatype();
        OWLDatatype result16 = testSubject0.getBooleanOWLDatatype();
        OWLLiteral result17 = testSubject0.getOWLLiteral(_boolean);
        OWLLiteral result18 = testSubject0.getOWLLiteral(_String, _String);
    }

    @Test
    public void enforceInterfacesOWLDataHasValueImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLValueRestrictionImpl.class.isAssignableFrom(OWLDataHasValueImpl.class));
        assertTrue(OWLDataHasValue.class.isAssignableFrom(OWLDataHasValueImpl.class));
    }

    public void verifyOWLDataHasValueImpl() {
        OWLDataHasValueImpl testSubject0 = new OWLDataHasValueImpl(_OWLDataPropertyExpression, _OWLLiteral);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLClassExpression result5 = testSubject0.asSomeValuesFrom();
        OWLLiteral result6 = testSubject0.getValue();
        OWLPropertyExpression result7 = testSubject0.getProperty();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryDataRangeImpl.class.isAssignableFrom(OWLDataIntersectionOfImpl.class));
        assertTrue(OWLDataIntersectionOf.class.isAssignableFrom(OWLDataIntersectionOfImpl.class));
    }

    public void verifyOWLDataIntersectionOfImpl() {
        OWLDataIntersectionOfImpl testSubject0 = new OWLDataIntersectionOfImpl(_Set159);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        DataRangeType result3 = testSubject0.getDataRangeType();
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<OWLDataRange> result7 = testSubject0.getOperands();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataMaxCardinalityImpl.class));
        assertTrue(OWLDataMaxCardinality.class.isAssignableFrom(OWLDataMaxCardinalityImpl.class));
    }

    public void verifyOWLDataMaxCardinalityImpl() {
        OWLDataMaxCardinalityImpl testSubject0 = new OWLDataMaxCardinalityImpl(_OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLDataMaxCardinalityImpl testSubject1 = new OWLDataMaxCardinalityImpl(_OWLDataPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLDataRange result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataCardinalityRestrictionImpl.class.isAssignableFrom(OWLDataMinCardinalityImpl.class));
        assertTrue(OWLDataMinCardinality.class.isAssignableFrom(OWLDataMinCardinalityImpl.class));
    }

    public void verifyOWLDataMinCardinalityImpl() {
        OWLDataMinCardinalityImpl testSubject0 = new OWLDataMinCardinalityImpl(_OWLDataPropertyExpression, _int, _OWLDataRange);
        OWLDataMinCardinalityImpl testSubject1 = new OWLDataMinCardinalityImpl(_OWLDataPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLDataRange result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataOneOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDataOneOfImpl.class));
        assertTrue(OWLDataOneOf.class.isAssignableFrom(OWLDataOneOfImpl.class));
    }

    public void verifyOWLDataOneOfImpl() {
        OWLDataOneOfImpl testSubject0 = new OWLDataOneOfImpl(_Set154);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        java.util.Set<OWLLiteral> result6 = testSubject0.getValues();
        OWLDatatype result7 = testSubject0.asOWLDatatype();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLDataPropertyAssertionAxiomImpl.class));
        assertTrue(OWLDataPropertyAssertionAxiom.class.isAssignableFrom(OWLDataPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLDataPropertyAssertionAxiomImpl() {
        OWLDataPropertyAssertionAxiomImpl testSubject0 = new OWLDataPropertyAssertionAxiomImpl(_OWLIndividual, _OWLDataPropertyExpression, _OWLLiteral, _Set134);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyAssertionAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLDataPropertyAssertionAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObject result9 = testSubject0.getObject();
        OWLIndividual result10 = testSubject0.getSubject();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set132);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyCharacteristicAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiomImpl.class));
        assertTrue(OWLDataPropertyCharacteristicAxiom.class.isAssignableFrom(OWLDataPropertyCharacteristicAxiomImpl.class));
    }

    public void verifyOWLDataPropertyCharacteristicAxiomImpl() {
        OWLDataPropertyCharacteristicAxiomImpl testSubject0 = new OWLDataPropertyCharacteristicAxiomImpl(_OWLDataPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLDataPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyDomainAxiomImpl.class.isAssignableFrom(OWLDataPropertyDomainAxiomImpl.class));
        assertTrue(OWLDataPropertyDomainAxiom.class.isAssignableFrom(OWLDataPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLDataPropertyDomainAxiomImpl() {
        OWLDataPropertyDomainAxiomImpl testSubject0 = new OWLDataPropertyDomainAxiomImpl(_OWLDataPropertyExpression, _OWLClassExpression, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyDomainAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLClassExpression result7 = testSubject0.getDomain();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyExpressionImpl.class.isAssignableFrom(OWLDataPropertyImpl.class));
        assertTrue(OWLDataProperty.class.isAssignableFrom(OWLDataPropertyImpl.class));
    }

    public void verifyOWLDataPropertyImpl() {
        OWLDataPropertyImpl testSubject0 = new OWLDataPropertyImpl(_IRI);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result6 = testSubject0.isFunctional(_Set);
        boolean result7 = testSubject0.isFunctional(_OWLOntology);
        boolean result8 = testSubject0.isDataPropertyExpression();
        boolean result9 = testSubject0.isObjectPropertyExpression();
        boolean result10 = testSubject0.isOWLTopObjectProperty();
        boolean result11 = testSubject0.isOWLBottomObjectProperty();
        boolean result12 = testSubject0.isOWLTopDataProperty();
        boolean result13 = testSubject0.isOWLBottomDataProperty();
        boolean result14 = testSubject0.isBuiltIn();
        boolean result15 = testSubject0.isTopEntity();
        boolean result16 = testSubject0.isBottomEntity();
        boolean result17 = testSubject0.isAnonymous();
        java.util.Set<OWLAxiom> result18 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAxiom> result19 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAnnotationAssertionAxiom> result20 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        IRI result21 = testSubject0.getIRI();
        EntityType<?> result22 = testSubject0.getEntityType();
        OWLEntity result23 = testSubject0.getOWLEntity(_EntityType123);
        boolean result24 = testSubject0.isOWLClass();
        OWLClass result25 = testSubject0.asOWLClass();
        boolean result26 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result27 = testSubject0.asOWLObjectProperty();
        boolean result28 = testSubject0.isOWLDataProperty();
        OWLDataProperty result29 = testSubject0.asOWLDataProperty();
        boolean result30 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result31 = testSubject0.asOWLNamedIndividual();
        boolean result32 = testSubject0.isOWLDatatype();
        OWLDatatype result33 = testSubject0.asOWLDatatype();
        boolean result34 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result35 = testSubject0.asOWLAnnotationProperty();
        String result36 = testSubject0.toStringID();
        java.util.Set<OWLClassExpression> result37 = testSubject0.getDomains(_Set);
        java.util.Set<OWLClassExpression> result38 = testSubject0.getDomains(_OWLOntology);
        java.util.Set<OWLDataRange> result39 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLDataRange> result40 = testSubject0.getRanges(_Set);
        java.util.Set<OWLDataPropertyExpression> result41 = testSubject0.getSuperProperties(_Set);
        java.util.Set<OWLDataPropertyExpression> result42 = testSubject0.getSuperProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result43 = testSubject0.getSubProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result44 = testSubject0.getSubProperties(_Set);
        java.util.Set<OWLDataPropertyExpression> result45 = testSubject0.getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result46 = testSubject0.getEquivalentProperties(_Set);
        java.util.Set<OWLDataPropertyExpression> result47 = testSubject0.getDisjointProperties(_OWLOntology);
        java.util.Set<OWLDataPropertyExpression> result48 = testSubject0.getDisjointProperties(_Set);
        int result49 = testSubject0.compareTo(_Object110);
        int result50 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result51 = testSubject0.getSignature();
        java.util.Set<OWLClass> result52 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result53 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result54 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result55 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result56 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result57 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result58 = testSubject0.getNestedClassExpressions();
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyRangeAxiomImpl.class.isAssignableFrom(OWLDataPropertyRangeAxiomImpl.class));
        assertTrue(OWLDataPropertyRangeAxiom.class.isAssignableFrom(OWLDataPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLDataPropertyRangeAxiomImpl() {
        OWLDataPropertyRangeAxiomImpl testSubject0 = new OWLDataPropertyRangeAxiomImpl(_OWLDataPropertyExpression, _OWLDataRange, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDataPropertyRangeAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLDataRange result7 = testSubject0.getRange();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
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
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLDataRange result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLDatatypeDefinitionAxiomImpl.class));
        assertTrue(OWLDatatypeDefinitionAxiom.class.isAssignableFrom(OWLDatatypeDefinitionAxiomImpl.class));
    }

    public void verifyOWLDatatypeDefinitionAxiomImpl() {
        OWLDatatypeDefinitionAxiomImpl testSubject0 = new OWLDatatypeDefinitionAxiomImpl(_OWLDatatype, _OWLDataRange, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLDataRange result2 = testSubject0.getDataRange();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDatatypeDefinitionAxiom result4 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLDatatype result9 = testSubject0.getDatatype();
        java.util.Set<OWLAnnotation> result10 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set132);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDatatypeImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLDatatypeImpl.class));
        assertTrue(OWLDatatype.class.isAssignableFrom(OWLDatatypeImpl.class));
    }

    public void verifyOWLDatatypeImpl() {
        OWLDatatypeImpl testSubject0 = new OWLDatatypeImpl(_IRI);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result6 = testSubject0.accept(_OWLDataRangeVisitorEx);
        boolean result7 = testSubject0.isBuiltIn();
        boolean result8 = testSubject0.isString();
        org.semanticweb.owlapi.vocab.OWL2Datatype result9 = testSubject0.getBuiltInDatatype();
        boolean result10 = testSubject0.isDatatype();
        boolean result11 = testSubject0.isTopDatatype();
        DataRangeType result12 = testSubject0.getDataRangeType();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        boolean result15 = testSubject0.isRDFPlainLiteral();
        boolean result16 = testSubject0.isInteger();
        boolean result17 = testSubject0.isBoolean();
        boolean result18 = testSubject0.isDouble();
        boolean result19 = testSubject0.isFloat();
        java.util.Set<OWLAxiom> result20 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAxiom> result21 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAnnotationAssertionAxiom> result22 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        IRI result23 = testSubject0.getIRI();
        EntityType<?> result24 = testSubject0.getEntityType();
        OWLEntity result25 = testSubject0.getOWLEntity(_EntityType123);
        boolean result26 = testSubject0.isOWLClass();
        OWLClass result27 = testSubject0.asOWLClass();
        boolean result28 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result29 = testSubject0.asOWLObjectProperty();
        boolean result30 = testSubject0.isOWLDataProperty();
        OWLDataProperty result31 = testSubject0.asOWLDataProperty();
        boolean result32 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result33 = testSubject0.asOWLNamedIndividual();
        boolean result34 = testSubject0.isOWLDatatype();
        OWLDatatype result35 = testSubject0.asOWLDatatype();
        boolean result36 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result37 = testSubject0.asOWLAnnotationProperty();
        String result38 = testSubject0.toStringID();
        int result39 = testSubject0.compareTo(_Object110);
        int result40 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result41 = testSubject0.getSignature();
        java.util.Set<OWLClass> result42 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result43 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result44 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result45 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result46 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result47 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result48 = testSubject0.getNestedClassExpressions();
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
        boolean result3 = testSubject0.isDatatype();
        boolean result4 = testSubject0.isTopDatatype();
        DataRangeType result5 = testSubject0.getDataRangeType();
        OWLDatatype result6 = testSubject0.getDatatype();
        java.util.Set<OWLFacetRestriction> result7 = testSubject0.getFacetRestrictions();
        OWLDatatype result8 = testSubject0.asOWLDatatype();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDataUnionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryDataRangeImpl.class.isAssignableFrom(OWLDataUnionOfImpl.class));
        assertTrue(OWLDataUnionOf.class.isAssignableFrom(OWLDataUnionOfImpl.class));
    }

    public void verifyOWLDataUnionOfImpl() {
        OWLDataUnionOfImpl testSubject0 = new OWLDataUnionOfImpl(_Set159);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        DataRangeType result3 = testSubject0.getDataRangeType();
        boolean result4 = testSubject0.isDatatype();
        boolean result5 = testSubject0.isTopDatatype();
        OWLDatatype result6 = testSubject0.asOWLDatatype();
        java.util.Set<OWLDataRange> result7 = testSubject0.getOperands();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
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
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLDeclarationAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLDeclarationAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        boolean result6 = testSubject0.isLogicalAxiom();
        boolean result7 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLEntity result9 = testSubject0.getEntity();
        java.util.Set<OWLAnnotation> result10 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set132);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryIndividualAxiomImpl.class.isAssignableFrom(OWLDifferentIndividualsAxiomImpl.class));
        assertTrue(OWLDifferentIndividualsAxiom.class.isAssignableFrom(OWLDifferentIndividualsAxiomImpl.class));
    }

    public void verifyOWLDifferentIndividualsAxiomImpl() {
        OWLDifferentIndividualsAxiomImpl testSubject0 = new OWLDifferentIndividualsAxiomImpl(_Set161, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        java.util.Set<OWLDifferentIndividualsAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result3 = testSubject0.asOWLSubClassOfAxioms();
        boolean result4 = testSubject0.containsAnonymousIndividuals();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLDifferentIndividualsAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLDifferentIndividualsAxiom result8 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result9 = testSubject0.getAxiomType();
        java.util.Set<OWLIndividual> result10 = testSubject0.getIndividuals();
        java.util.List<OWLIndividual> result11 = testSubject0.getIndividualsAsList();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryClassAxiomImpl.class.isAssignableFrom(OWLDisjointClassesAxiomImpl.class));
        assertTrue(OWLDisjointClassesAxiom.class.isAssignableFrom(OWLDisjointClassesAxiomImpl.class));
    }

    public void verifyOWLDisjointClassesAxiomImpl() {
        OWLDisjointClassesAxiomImpl testSubject0 = new OWLDisjointClassesAxiomImpl(_Set152, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<OWLDisjointClassesAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result3 = testSubject0.asOWLSubClassOfAxioms();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointClassesAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointClassesAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result8 = testSubject0.getAxiomType();
        boolean result9 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result10 = testSubject0.getClassExpressions();
        java.util.List<OWLClassExpression> result11 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLDisjointDataPropertiesAxiomImpl.class));
        assertTrue(OWLDisjointDataPropertiesAxiom.class.isAssignableFrom(OWLDisjointDataPropertiesAxiomImpl.class));
    }

    public void verifyOWLDisjointDataPropertiesAxiomImpl() {
        OWLDisjointDataPropertiesAxiomImpl testSubject0 = new OWLDisjointDataPropertiesAxiomImpl(_Set167, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointDataPropertiesAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointDataPropertiesAxiom result4 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        java.util.Set<OWLDataPropertyExpression> result7 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result8 = testSubject0.getPropertiesMinus(_OWLDataPropertyExpression);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiomImpl.class));
        assertTrue(OWLDisjointObjectPropertiesAxiom.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLDisjointObjectPropertiesAxiomImpl() {
        OWLDisjointObjectPropertiesAxiomImpl testSubject0 = new OWLDisjointObjectPropertiesAxiomImpl(_Set164, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointObjectPropertiesAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointObjectPropertiesAxiom result4 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class.isAssignableFrom(OWLDisjointUnionAxiomImpl.class));
        assertTrue(OWLDisjointUnionAxiom.class.isAssignableFrom(OWLDisjointUnionAxiomImpl.class));
    }

    public void verifyOWLDisjointUnionAxiomImpl() {
        OWLDisjointUnionAxiomImpl testSubject0 = new OWLDisjointUnionAxiomImpl(_OWLClass, _Set152, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        java.util.Set<OWLClassExpression> result2 = testSubject0.getClassExpressions();
        OWLEquivalentClassesAxiom result3 = testSubject0.getOWLEquivalentClassesAxiom();
        OWLDisjointClassesAxiom result4 = testSubject0.getOWLDisjointClassesAxiom();
        OWLClass result5 = testSubject0.getOWLClass();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLDisjointUnionAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLDisjointUnionAxiom result9 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result10 = testSubject0.getAxiomType();
        boolean result11 = testSubject0.isLogicalAxiom();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set132);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLEntityCollectionContainerCollector() {
        assertTrue(OWLObjectVisitor.class.isAssignableFrom(OWLEntityCollectionContainerCollector.class));
        assertTrue(SWRLObjectVisitor.class.isAssignableFrom(OWLEntityCollectionContainerCollector.class));
    }

    public void verifyOWLEntityCollectionContainerCollector() {
        OWLEntityCollectionContainerCollector testSubject0 = new OWLEntityCollectionContainerCollector(_Set177);
        OWLEntityCollectionContainerCollector testSubject1 = new OWLEntityCollectionContainerCollector(_Set177, _Collection178);
        OWLEntityCollectionContainerCollector testSubject2 = new OWLEntityCollectionContainerCollector();
        testSubject0.reset(_Set177);
        java.util.Set<OWLEntity> result0 = testSubject0.getObjects();
        java.util.Set<OWLAnonymousIndividual> result1 = testSubject0.getAnonymousIndividuals();
        testSubject0.setCollectClasses(_boolean);
        testSubject0.setCollectObjectProperties(_boolean);
        testSubject0.setCollectDataProperties(_boolean);
        testSubject0.setCollectIndividuals(_boolean);
        testSubject0.setCollectDatatypes(_boolean);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryClassAxiomImpl.class.isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
        assertTrue(OWLEquivalentClassesAxiom.class.isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLEquivalentClassesAxiomImpl.class));
    }

    public void verifyOWLEquivalentClassesAxiomImpl() {
        OWLEquivalentClassesAxiomImpl testSubject0 = new OWLEquivalentClassesAxiomImpl(_Set152, _Collection);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        boolean result2 = testSubject0.containsOWLThing();
        boolean result3 = testSubject0.containsOWLNothing();
        java.util.Set<OWLClass> result4 = testSubject0.getNamedClasses();
        boolean result5 = testSubject0.containsNamedEquivalentClass();
        java.util.Set<OWLEquivalentClassesAxiom> result6 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result7 = testSubject0.asOWLSubClassOfAxioms();
        OWLAxiom result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentClassesAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentClassesAxiom result10 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result11 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result12 = testSubject0.getAxiomType();
        boolean result13 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.getClassExpressions();
        java.util.List<OWLClassExpression> result15 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        boolean result17 = testSubject0.isLogicalAxiom();
        boolean result18 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result19 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result20 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result21 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result22 = testSubject0.isAnnotated();
        boolean result23 = testSubject0.isOfType(_Set132);
        boolean result24 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result25 = testSubject0.getNNF();
        int result26 = testSubject0.compareTo(_Object110);
        int result27 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result28 = testSubject0.getSignature();
        java.util.Set<OWLClass> result29 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result30 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result31 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result32 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result33 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result34 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result35 = testSubject0.getNestedClassExpressions();
        boolean result36 = testSubject0.isTopEntity();
        boolean result37 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiomImpl.class));
        assertTrue(OWLEquivalentDataPropertiesAxiom.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiomImpl.class));
    }

    public void verifyOWLEquivalentDataPropertiesAxiomImpl() {
        OWLEquivalentDataPropertiesAxiomImpl testSubject0 = new OWLEquivalentDataPropertiesAxiomImpl(_Set167, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<OWLSubDataPropertyOfAxiom> result2 = testSubject0.asSubDataPropertyOfAxioms();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentDataPropertiesAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLEquivalentDataPropertiesAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        java.util.Set<OWLDataPropertyExpression> result8 = testSubject0.getProperties();
        java.util.Set<OWLDataPropertyExpression> result9 = testSubject0.getPropertiesMinus(_OWLDataPropertyExpression);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiomImpl.class));
        assertTrue(OWLEquivalentObjectPropertiesAxiom.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLEquivalentObjectPropertiesAxiomImpl() {
        OWLEquivalentObjectPropertiesAxiomImpl testSubject0 = new OWLEquivalentObjectPropertiesAxiomImpl(_Set164, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result2 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLEquivalentObjectPropertiesAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLEquivalentObjectPropertiesAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLFacetRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLFacetRestrictionImpl.class));
        assertTrue(OWLFacetRestriction.class.isAssignableFrom(OWLFacetRestrictionImpl.class));
    }

    public void verifyOWLFacetRestrictionImpl() {
        OWLFacetRestrictionImpl testSubject0 = new OWLFacetRestrictionImpl(_OWLFacet, _OWLLiteral);
        OWLObject result0 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLLiteral result2 = testSubject0.getFacetValue();
        org.semanticweb.owlapi.vocab.OWLFacet result3 = testSubject0.getFacet();
        int result4 = testSubject0.compareTo(_Object110);
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLDataPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLFunctionalDataPropertyAxiomImpl.class));
        assertTrue(OWLFunctionalDataPropertyAxiom.class.isAssignableFrom(OWLFunctionalDataPropertyAxiomImpl.class));
    }

    public void verifyOWLFunctionalDataPropertyAxiomImpl() {
        OWLFunctionalDataPropertyAxiomImpl testSubject0 = new OWLFunctionalDataPropertyAxiomImpl(_OWLDataPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLFunctionalDataPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLFunctionalDataPropertyAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLDataPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiomImpl.class));
        assertTrue(OWLFunctionalObjectPropertyAxiom.class.isAssignableFrom(OWLFunctionalObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLFunctionalObjectPropertyAxiomImpl() {
        OWLFunctionalObjectPropertyAxiomImpl testSubject0 = new OWLFunctionalObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLFunctionalObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLFunctionalObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLHasKeyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLHasKeyAxiomImpl.class));
        assertTrue(OWLHasKeyAxiom.class.isAssignableFrom(OWLHasKeyAxiomImpl.class));
    }

    public void verifyOWLHasKeyAxiomImpl() {
        OWLHasKeyAxiomImpl testSubject0 = new OWLHasKeyAxiomImpl(_OWLClassExpression, _Set168, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLClassExpression result2 = testSubject0.getClassExpression();
        java.util.Set<OWLPropertyExpression<?, ?>> result3 = testSubject0.getPropertyExpressions();
        java.util.Set<OWLObjectPropertyExpression> result4 = testSubject0.getObjectPropertyExpressions();
        java.util.Set<OWLDataPropertyExpression> result5 = testSubject0.getDataPropertyExpressions();
        OWLAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLHasKeyAxiom result7 = testSubject0.getAxiomWithoutAnnotations();
        OWLHasKeyAxiom result8 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result9 = testSubject0.getAnnotatedAxiom(_Set130);
        boolean result10 = testSubject0.isLogicalAxiom();
        AxiomType<?> result11 = testSubject0.getAxiomType();
        boolean result12 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result15 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result16 = testSubject0.isAnnotated();
        boolean result17 = testSubject0.isOfType(_Set132);
        boolean result18 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result19 = testSubject0.getNNF();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLImportsDeclarationImpl() {
        assertTrue(OWLImportsDeclaration.class.isAssignableFrom(OWLImportsDeclarationImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLImportsDeclarationImpl.class));
    }

    public void verifyOWLImportsDeclarationImpl() {
        OWLImportsDeclarationImpl testSubject0 = new OWLImportsDeclarationImpl(_IRI);
        int result0 = testSubject0.compareTo(_OWLImportsDeclaration);
        boolean result2 = testSubject0.isLogicalAxiom();
        IRI result3 = testSubject0.getIRI();
        java.net.URI result4 = testSubject0.getURI();
    }

    @Test
    public void enforceInterfacesOWLIndividualAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLIndividualAxiomImpl.class));
        assertTrue(OWLIndividualAxiom.class.isAssignableFrom(OWLIndividualAxiomImpl.class));
    }

    public void verifyOWLIndividualAxiomImpl() {
        OWLIndividualAxiomImpl testSubject0 = new OWLIndividualAxiomImpl(_Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result23 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result24 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLIndividualImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLIndividualImpl.class));
        assertTrue(OWLIndividual.class.isAssignableFrom(OWLIndividualImpl.class));
    }

    public void verifyOWLIndividualImpl() {
        OWLIndividualImpl testSubject0 = new OWLIndividualImpl() {
            @Override
            public boolean isNamed() {
                return false;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public OWLNamedIndividual asOWLNamedIndividual() {
                return null;
            }

            @Override
            public OWLAnonymousIndividual asOWLAnonymousIndividual() {
                return null;
            }

            @Override
            public String toStringID() {
                return null;
            }

            @Override
            public void accept(OWLIndividualVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLIndividualVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        java.util.Set<OWLClassExpression> result0 = testSubject0.getTypes(_Set);
        java.util.Set<OWLClassExpression> result1 = testSubject0.getTypes(_OWLOntology);
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLIndividual>> result2 = testSubject0.getObjectPropertyValues(_OWLOntology);
        java.util.Set<OWLIndividual> result3 = testSubject0.getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        boolean result4 = testSubject0.hasObjectPropertyValue(_OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result5 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        boolean result6 = testSubject0.hasNegativeObjectPropertyValue(_OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLIndividual>> result7 = testSubject0.getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<OWLDataPropertyExpression, java.util.Set<OWLLiteral>> result8 = testSubject0.getDataPropertyValues(_OWLOntology);
        java.util.Set<OWLLiteral> result9 = testSubject0.getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<OWLDataPropertyExpression, java.util.Set<OWLLiteral>> result10 = testSubject0.getNegativeDataPropertyValues(_OWLOntology);
        boolean result11 = testSubject0.hasNegativeDataPropertyValue(_OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<OWLIndividual> result12 = testSubject0.getSameIndividuals(_OWLOntology);
        java.util.Set<OWLIndividual> result13 = testSubject0.getDifferentIndividuals(_OWLOntology);
        boolean result14 = testSubject0.isBuiltIn();
        boolean result15 = testSubject0.isOWLClass();
        OWLClass result16 = testSubject0.asOWLClass();
        boolean result17 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result18 = testSubject0.asOWLObjectProperty();
        boolean result19 = testSubject0.isOWLDataProperty();
        OWLDataProperty result20 = testSubject0.asOWLDataProperty();
        boolean result21 = testSubject0.isOWLDatatype();
        OWLDatatype result22 = testSubject0.asOWLDatatype();
        int result23 = testSubject0.compareTo(_Object110);
        int result24 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result25 = testSubject0.getSignature();
        java.util.Set<OWLClass> result26 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result27 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result28 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result29 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result30 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result31 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result32 = testSubject0.getNestedClassExpressions();
        boolean result33 = testSubject0.isTopEntity();
        boolean result34 = testSubject0.isBottomEntity();
        OWLObject result35 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result36 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        boolean result37 = testSubject0.isNamed();
        OWLAnonymousIndividual result38 = testSubject0.asOWLAnonymousIndividual();
        boolean result39 = testSubject0.isAnonymous();
        OWLNamedIndividual result40 = testSubject0.asOWLNamedIndividual();
        String result41 = testSubject0.toStringID();
    }

    @Test
    public void enforceInterfacesOWLIndividualRelationshipAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(OWLIndividualRelationshipAxiomImpl.class));
        assertTrue(OWLPropertyAssertionAxiom.class.isAssignableFrom(OWLIndividualRelationshipAxiomImpl.class));
    }

    public void verifyOWLIndividualRelationshipAxiomImpl() {
        OWLIndividualRelationshipAxiomImpl<OWLObjectPropertyExpression, OWLIndividual> testSubject0 = new OWLIndividualRelationshipAxiomImpl(_OWLIndividual,
                _OWLPropertyExpression, _OWLIndividual, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {
                return null;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        boolean result3 = testSubject0.isLogicalAxiom();
        boolean result4 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result7 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result8 = testSubject0.isAnnotated();
        boolean result9 = testSubject0.isOfType(_Set132);
        boolean result10 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result11 = testSubject0.getNNF();
        int result12 = testSubject0.compareTo(_Object110);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result25 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result26 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result27 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result28 = testSubject0.getAxiomType();
        OWLSubClassOfAxiom result29 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomImpl.class));
        assertTrue(OWLInverseFunctionalObjectPropertyAxiom.class.isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLInverseFunctionalObjectPropertyAxiomImpl() {
        OWLInverseFunctionalObjectPropertyAxiomImpl testSubject0 = new OWLInverseFunctionalObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLInverseFunctionalObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLInverseFunctionalObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryPropertyAxiomImpl.class.isAssignableFrom(OWLInverseObjectPropertiesAxiomImpl.class));
        assertTrue(OWLInverseObjectPropertiesAxiom.class.isAssignableFrom(OWLInverseObjectPropertiesAxiomImpl.class));
    }

    public void verifyOWLInverseObjectPropertiesAxiomImpl() {
        OWLInverseObjectPropertiesAxiomImpl testSubject0 = new OWLInverseObjectPropertiesAxiomImpl(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObjectPropertyExpression result2 = testSubject0.getSecondProperty();
        java.util.Set<OWLSubObjectPropertyOfAxiom> result3 = testSubject0.asSubObjectPropertyOfAxioms();
        OWLObjectPropertyExpression result4 = testSubject0.getFirstProperty();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLInverseObjectPropertiesAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result7 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLInverseObjectPropertiesAxiom result8 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result9 = testSubject0.getAxiomType();
        java.util.Set<OWLObjectPropertyExpression> result10 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result11 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
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
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLIrreflexiveObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLIrreflexiveObjectPropertyAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
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
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataVisitor);
        String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplBoolean() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplBoolean.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplBoolean.class));
    }

    public void verifyOWLLiteralImplBoolean() {
        OWLLiteralImplBoolean testSubject0 = new OWLLiteralImplBoolean(_boolean);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
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
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
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
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
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
        testSubject0.accept(_OWLDataVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result5 = testSubject0.accept(_OWLDataVisitorEx);
        String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang(_String);
        boolean result10 = testSubject0.hasLang();
        String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLiteralImplNoCompression() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLLiteralImplNoCompression.class));
        assertTrue(OWLLiteral.class.isAssignableFrom(OWLLiteralImplNoCompression.class));
    }

    public void verifyOWLLiteralImplNoCompression() {
        OWLLiteralImplNoCompression testSubject0 = new OWLLiteralImplNoCompression(_String, _String, _OWLDatatype);
        boolean result0 = testSubject0.parseBoolean();
        float result1 = testSubject0.parseFloat();
        double result2 = testSubject0.parseDouble();
        testSubject0.accept(_OWLDataVisitor);
        testSubject0.accept(_OWLAnnotationValueVisitor);
        OWLObject result3 = testSubject0.accept(_OWLDataVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLAnnotationValueVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLObjectVisitorEx);
        String result6 = testSubject0.getLiteral();
        boolean result7 = testSubject0.isRDFPlainLiteral();
        OWLDatatype result8 = testSubject0.getDatatype();
        boolean result9 = testSubject0.hasLang();
        boolean result10 = testSubject0.hasLang(_String);
        String result11 = testSubject0.getLang();
        boolean result12 = testSubject0.isInteger();
        int result13 = testSubject0.parseInteger();
        boolean result14 = testSubject0.isBoolean();
        boolean result15 = testSubject0.isDouble();
        boolean result16 = testSubject0.isFloat();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLLogicalAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLLogicalAxiomImpl.class));
        assertTrue(OWLLogicalAxiom.class.isAssignableFrom(OWLLogicalAxiomImpl.class));
    }

    public void verifyOWLLogicalAxiomImpl() {
        OWLLogicalAxiomImpl testSubject0 = new OWLLogicalAxiomImpl(_Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isLogicalAxiom();
        boolean result1 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result23 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result24 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLNamedIndividualImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualImpl.class.isAssignableFrom(OWLNamedIndividualImpl.class));
        assertTrue(OWLNamedIndividual.class.isAssignableFrom(OWLNamedIndividualImpl.class));
    }

    public void verifyOWLNamedIndividualImpl() {
        OWLNamedIndividualImpl testSubject0 = new OWLNamedIndividualImpl(_IRI);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLIndividualVisitorEx);
        testSubject0.accept(_OWLIndividualVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result5 = testSubject0.accept(_OWLEntityVisitorEx);
        testSubject0.accept(_OWLEntityVisitor);
        boolean result6 = testSubject0.isNamed();
        OWLAnonymousIndividual result7 = testSubject0.asOWLAnonymousIndividual();
        boolean result8 = testSubject0.isAnonymous();
        java.util.Set<OWLAxiom> result9 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAxiom> result10 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAnnotationAssertionAxiom> result11 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        IRI result12 = testSubject0.getIRI();
        EntityType<?> result13 = testSubject0.getEntityType();
        OWLEntity result14 = testSubject0.getOWLEntity(_EntityType123);
        boolean result15 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result16 = testSubject0.asOWLNamedIndividual();
        boolean result17 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result18 = testSubject0.asOWLAnnotationProperty();
        String result19 = testSubject0.toStringID();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getTypes(_Set);
        java.util.Set<OWLClassExpression> result21 = testSubject0.getTypes(_OWLOntology);
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLIndividual>> result22 = testSubject0.getObjectPropertyValues(_OWLOntology);
        java.util.Set<OWLIndividual> result23 = testSubject0.getObjectPropertyValues(_OWLObjectPropertyExpression, _OWLOntology);
        boolean result24 = testSubject0.hasObjectPropertyValue(_OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        boolean result25 = testSubject0.hasDataPropertyValue(_OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        boolean result26 = testSubject0.hasNegativeObjectPropertyValue(_OWLObjectPropertyExpression, _OWLIndividual, _OWLOntology);
        java.util.Map<OWLObjectPropertyExpression, java.util.Set<OWLIndividual>> result27 = testSubject0.getNegativeObjectPropertyValues(_OWLOntology);
        java.util.Map<OWLDataPropertyExpression, java.util.Set<OWLLiteral>> result28 = testSubject0.getDataPropertyValues(_OWLOntology);
        java.util.Set<OWLLiteral> result29 = testSubject0.getDataPropertyValues(_OWLDataPropertyExpression, _OWLOntology);
        java.util.Map<OWLDataPropertyExpression, java.util.Set<OWLLiteral>> result30 = testSubject0.getNegativeDataPropertyValues(_OWLOntology);
        boolean result31 = testSubject0.hasNegativeDataPropertyValue(_OWLDataPropertyExpression, _OWLLiteral, _OWLOntology);
        java.util.Set<OWLIndividual> result32 = testSubject0.getSameIndividuals(_OWLOntology);
        java.util.Set<OWLIndividual> result33 = testSubject0.getDifferentIndividuals(_OWLOntology);
        boolean result34 = testSubject0.isBuiltIn();
        boolean result35 = testSubject0.isOWLClass();
        OWLClass result36 = testSubject0.asOWLClass();
        boolean result37 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result38 = testSubject0.asOWLObjectProperty();
        boolean result39 = testSubject0.isOWLDataProperty();
        OWLDataProperty result40 = testSubject0.asOWLDataProperty();
        boolean result41 = testSubject0.isOWLDatatype();
        OWLDatatype result42 = testSubject0.asOWLDatatype();
        int result43 = testSubject0.compareTo(_Object110);
        int result44 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result45 = testSubject0.getSignature();
        java.util.Set<OWLClass> result46 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result47 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result48 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result49 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result50 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result51 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result52 = testSubject0.getNestedClassExpressions();
        boolean result53 = testSubject0.isTopEntity();
        boolean result54 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLNaryBooleanClassExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLNaryBooleanClassExpressionImpl.class));
        assertTrue(OWLNaryBooleanClassExpression.class.isAssignableFrom(OWLNaryBooleanClassExpressionImpl.class));
    }

    public void verifyOWLNaryBooleanClassExpressionImpl() {
        OWLNaryBooleanClassExpressionImpl testSubject0 = new OWLNaryBooleanClassExpressionImpl(_Set152) {
            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        boolean result0 = testSubject0.isClassExpressionLiteral();
        java.util.List<OWLClassExpression> result1 = testSubject0.getOperandsAsList();
        java.util.Set<OWLClassExpression> result2 = testSubject0.getOperands();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result27 = testSubject0.getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLNaryClassAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class.isAssignableFrom(OWLNaryClassAxiomImpl.class));
        assertTrue(OWLNaryClassAxiom.class.isAssignableFrom(OWLNaryClassAxiomImpl.class));
    }

    public void verifyOWLNaryClassAxiomImpl() {
        OWLNaryClassAxiomImpl testSubject0 = new OWLNaryClassAxiomImpl(_Set152, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public Set<? extends OWLNaryAxiom> asPairwiseAxioms() {
                return null;
            }

            @Override
            public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {
                return null;
            }
        };
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result1 = testSubject0.getClassExpressions();
        java.util.List<OWLClassExpression> result2 = testSubject0.getClassExpressionsAsList();
        java.util.Set<OWLClassExpression> result3 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        boolean result4 = testSubject0.isLogicalAxiom();
        boolean result5 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result6 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result7 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result8 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result9 = testSubject0.isAnnotated();
        boolean result10 = testSubject0.isOfType(_Set132);
        boolean result11 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result12 = testSubject0.getNNF();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result26 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result27 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result28 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result29 = testSubject0.getAxiomType();
        java.util.Set<? extends OWLNaryAxiom> result30 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result31 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryDataRangeImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLNaryDataRangeImpl.class));
        assertTrue(OWLNaryDataRange.class.isAssignableFrom(OWLNaryDataRangeImpl.class));
    }

    public void verifyOWLNaryDataRangeImpl() {
        OWLNaryDataRangeImpl testSubject0 = mock(OWLNaryDataRangeImpl.class);
        boolean result0 = testSubject0.isDatatype();
        boolean result1 = testSubject0.isTopDatatype();
        OWLDatatype result2 = testSubject0.asOWLDatatype();
        java.util.Set<OWLDataRange> result3 = testSubject0.getOperands();
        int result4 = testSubject0.compareTo(_Object110);
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLDataRangeVisitor);
        OWLObject result17 = testSubject0.accept(_OWLDataVisitorEx);
        OWLObject result18 = testSubject0.accept(_OWLDataRangeVisitorEx);
        testSubject0.accept(_OWLDataVisitor);
        DataRangeType result19 = testSubject0.getDataRangeType();
    }

    @Test
    public void enforceInterfacesOWLNaryIndividualAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualAxiomImpl.class.isAssignableFrom(OWLNaryIndividualAxiomImpl.class));
        assertTrue(OWLNaryIndividualAxiom.class.isAssignableFrom(OWLNaryIndividualAxiomImpl.class));
    }

    public void verifyOWLNaryIndividualAxiomImpl() {
        OWLNaryIndividualAxiomImpl testSubject0 = new OWLNaryIndividualAxiomImpl(_Set161, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public Set<? extends OWLNaryAxiom> asPairwiseAxioms() {
                return null;
            }

            @Override
            public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {
                return null;
            }
        };
        java.util.Set<OWLIndividual> result0 = testSubject0.getIndividuals();
        java.util.List<OWLIndividual> result1 = testSubject0.getIndividualsAsList();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        java.util.Set<? extends OWLNaryAxiom> result28 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result29 = testSubject0.asOWLSubClassOfAxioms();
    }

    @Test
    public void enforceInterfacesOWLNaryPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLNaryPropertyAxiomImpl.class));
        assertTrue(OWLNaryPropertyAxiom.class.isAssignableFrom(OWLNaryPropertyAxiomImpl.class));
    }

    public void verifyOWLNaryPropertyAxiomImpl() {
        OWLNaryPropertyAxiomImpl<OWLObjectPropertyExpression> testSubject0 = new OWLNaryPropertyAxiomImpl(_Set181, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        java.util.Set<OWLObjectPropertyExpression> result0 = testSubject0.getProperties();
        java.util.Set<OWLObjectPropertyExpression> result1 = testSubject0.getPropertiesMinus(_OWLObjectPropertyExpression);
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomImpl.class));
        assertTrue(OWLNegativeDataPropertyAssertionAxiom.class.isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLNegativeDataPropertyAssertionAxiomImpl() {
        OWLNegativeDataPropertyAssertionAxiomImpl testSubject0 = new OWLNegativeDataPropertyAssertionAxiomImpl(_OWLIndividual, _OWLDataPropertyExpression, _OWLLiteral, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        boolean result3 = testSubject0.containsAnonymousIndividuals();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLNegativeDataPropertyAssertionAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLNegativeDataPropertyAssertionAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObject result10 = testSubject0.getObject();
        OWLIndividual result11 = testSubject0.getSubject();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomImpl.class));
        assertTrue(OWLNegativeObjectPropertyAssertionAxiom.class.isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLNegativeObjectPropertyAssertionAxiomImpl() {
        OWLNegativeObjectPropertyAssertionAxiomImpl testSubject0 = new OWLNegativeObjectPropertyAssertionAxiomImpl(_OWLIndividual, _OWLObjectPropertyExpression, _OWLIndividual,
                _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        boolean result3 = testSubject0.containsAnonymousIndividuals();
        OWLNegativeObjectPropertyAssertionAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLNegativeObjectPropertyAssertionAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result8 = testSubject0.getAxiomType();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        OWLObject result10 = testSubject0.getObject();
        OWLIndividual result11 = testSubject0.getSubject();
        boolean result12 = testSubject0.isLogicalAxiom();
        boolean result13 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result14 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result16 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result17 = testSubject0.isAnnotated();
        boolean result18 = testSubject0.isOfType(_Set132);
        boolean result19 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result20 = testSubject0.getNNF();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
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
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLClassExpression result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectCardinalityRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectCardinalityRestrictionImpl.class));
        assertTrue(OWLObjectCardinalityRestriction.class.isAssignableFrom(OWLObjectCardinalityRestrictionImpl.class));
    }

    public void verifyOWLObjectCardinalityRestrictionImpl() {
        OWLObjectCardinalityRestrictionImpl testSubject0 = mock(OWLObjectCardinalityRestrictionImpl.class);
        boolean result0 = testSubject0.isQualified();
        boolean result1 = testSubject0.isObjectRestriction();
        boolean result2 = testSubject0.isDataRestriction();
        int result3 = testSubject0.getCardinality();
        OWLClassExpression result4 = testSubject0.getFiller();
        OWLPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
        OWLObject result29 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result30 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result31 = testSubject0.getClassExpressionType();
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLObjectComplementOfImpl.class));
        assertTrue(OWLObjectComplementOf.class.isAssignableFrom(OWLObjectComplementOfImpl.class));
    }

    public void verifyOWLObjectComplementOfImpl() {
        OWLObjectComplementOfImpl testSubject0 = new OWLObjectComplementOfImpl(_OWLClassExpression);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isClassExpressionLiteral();
        OWLClassExpression result4 = testSubject0.getOperand();
        boolean result5 = testSubject0.isOWLThing();
        boolean result6 = testSubject0.isOWLNothing();
        OWLClassExpression result7 = testSubject0.getComplementNNF();
        OWLClassExpression result8 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result9 = testSubject0.asConjunctSet();
        boolean result10 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result11 = testSubject0.asDisjunctSet();
        OWLClassExpression result12 = testSubject0.getNNF();
        boolean result13 = testSubject0.isAnonymous();
        OWLClass result14 = testSubject0.asOWLClass();
        int result15 = testSubject0.compareTo(_Object110);
        int result16 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result17 = testSubject0.getSignature();
        java.util.Set<OWLClass> result18 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result19 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result20 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result21 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result22 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result23 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result24 = testSubject0.getNestedClassExpressions();
        boolean result25 = testSubject0.isTopEntity();
        boolean result26 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectExactCardinalityImpl.class));
        assertTrue(OWLObjectExactCardinality.class.isAssignableFrom(OWLObjectExactCardinalityImpl.class));
    }

    public void verifyOWLObjectExactCardinalityImpl() {
        OWLObjectExactCardinalityImpl testSubject0 = new OWLObjectExactCardinalityImpl(_OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        OWLClassExpression result3 = testSubject0.asIntersectionOfMinMax();
        boolean result4 = testSubject0.isQualified();
        boolean result5 = testSubject0.isObjectRestriction();
        boolean result6 = testSubject0.isDataRestriction();
        int result7 = testSubject0.getCardinality();
        OWLClassExpression result8 = testSubject0.getFiller();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isClassExpressionLiteral();
        boolean result11 = testSubject0.isOWLThing();
        boolean result12 = testSubject0.isOWLNothing();
        OWLClassExpression result13 = testSubject0.getComplementNNF();
        OWLClassExpression result14 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result15 = testSubject0.asConjunctSet();
        boolean result16 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result17 = testSubject0.asDisjunctSet();
        OWLClassExpression result18 = testSubject0.getNNF();
        boolean result19 = testSubject0.isAnonymous();
        OWLClass result20 = testSubject0.asOWLClass();
        int result21 = testSubject0.compareTo(_Object110);
        int result22 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result23 = testSubject0.getSignature();
        java.util.Set<OWLClass> result24 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result25 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result26 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result27 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result28 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result29 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result30 = testSubject0.getNestedClassExpressions();
        boolean result31 = testSubject0.isTopEntity();
        boolean result32 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectHasSelfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLObjectHasSelfImpl.class));
        assertTrue(OWLObjectHasSelf.class.isAssignableFrom(OWLObjectHasSelfImpl.class));
    }

    public void verifyOWLObjectHasSelfImpl() {
        OWLObjectHasSelfImpl testSubject0 = new OWLObjectHasSelfImpl(_OWLObjectPropertyExpression);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLPropertyExpression result5 = testSubject0.getProperty();
        boolean result6 = testSubject0.isClassExpressionLiteral();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result13 = testSubject0.asDisjunctSet();
        OWLClassExpression result14 = testSubject0.getNNF();
        boolean result15 = testSubject0.isAnonymous();
        OWLClass result16 = testSubject0.asOWLClass();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectHasValueImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLValueRestrictionImpl.class.isAssignableFrom(OWLObjectHasValueImpl.class));
        assertTrue(OWLObjectHasValue.class.isAssignableFrom(OWLObjectHasValueImpl.class));
    }

    public void verifyOWLObjectHasValueImpl() {
        OWLObjectHasValueImpl testSubject0 = new OWLObjectHasValueImpl(_OWLObjectPropertyExpression, _OWLIndividual);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLClassExpression result5 = testSubject0.asSomeValuesFrom();
        OWLIndividual result6 = testSubject0.getValue();
        OWLPropertyExpression result7 = testSubject0.getProperty();
        boolean result8 = testSubject0.isClassExpressionLiteral();
        boolean result9 = testSubject0.isOWLThing();
        boolean result10 = testSubject0.isOWLNothing();
        OWLClassExpression result11 = testSubject0.getComplementNNF();
        OWLClassExpression result12 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result13 = testSubject0.asConjunctSet();
        boolean result14 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result15 = testSubject0.asDisjunctSet();
        OWLClassExpression result16 = testSubject0.getNNF();
        boolean result17 = testSubject0.isAnonymous();
        OWLClass result18 = testSubject0.asOWLClass();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectImpl() {
        assertTrue(OWLObject.class.isAssignableFrom(OWLObjectImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLObjectImpl.class));
    }

    public void verifyOWLObjectImpl() {
        OWLObjectImpl testSubject0 = new OWLObjectImpl() {
            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        int result0 = testSubject0.compareTo(_Object110);
        int result1 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLClass> result3 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result4 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result5 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result6 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result7 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result8 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result9 = testSubject0.getNestedClassExpressions();
        boolean result10 = testSubject0.isTopEntity();
        boolean result11 = testSubject0.isBottomEntity();
        OWLObject result12 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryBooleanClassExpressionImpl.class.isAssignableFrom(OWLObjectIntersectionOfImpl.class));
        assertTrue(OWLObjectIntersectionOf.class.isAssignableFrom(OWLObjectIntersectionOfImpl.class));
    }

    public void verifyOWLObjectIntersectionOfImpl() {
        OWLObjectIntersectionOfImpl testSubject0 = new OWLObjectIntersectionOfImpl(_Set152);
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
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        OWLClass result15 = testSubject0.asOWLClass();
        int result16 = testSubject0.compareTo(_Object110);
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
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
        boolean result2 = testSubject0.isOWLTopObjectProperty();
        boolean result3 = testSubject0.isOWLBottomObjectProperty();
        boolean result4 = testSubject0.isOWLTopDataProperty();
        boolean result5 = testSubject0.isOWLBottomDataProperty();
        OWLObjectPropertyExpression result6 = testSubject0.getInverse();
        boolean result7 = testSubject0.isAnonymous();
        OWLObjectProperty result8 = testSubject0.asOWLObjectProperty();
        boolean result9 = testSubject0.isFunctional(_OWLOntology);
        boolean result10 = testSubject0.isFunctional(_Set);
        boolean result11 = testSubject0.isDataPropertyExpression();
        boolean result12 = testSubject0.isObjectPropertyExpression();
        boolean result13 = testSubject0.isTransitive(_OWLOntology);
        boolean result14 = testSubject0.isTransitive(_Set);
        java.util.Set<OWLObjectPropertyExpression> result15 = testSubject0.getInverses(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result16 = testSubject0.getInverses(_Set);
        OWLObjectPropertyExpression result17 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result18 = testSubject0.getSimplified();
        boolean result19 = testSubject0.isSymmetric(_Set);
        boolean result20 = testSubject0.isSymmetric(_OWLOntology);
        boolean result21 = testSubject0.isInverseFunctional(_OWLOntology);
        boolean result22 = testSubject0.isInverseFunctional(_Set);
        OWLObjectProperty result23 = testSubject0.getNamedProperty();
        boolean result24 = testSubject0.isAsymmetric(_Set);
        boolean result25 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result26 = testSubject0.isReflexive(_OWLOntology);
        boolean result27 = testSubject0.isReflexive(_Set);
        boolean result28 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result29 = testSubject0.isIrreflexive(_Set);
        java.util.Set<OWLClassExpression> result30 = testSubject0.getDomains(_Set);
        java.util.Set<OWLClassExpression> result31 = testSubject0.getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result32 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result33 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result34 = testSubject0.getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result35 = testSubject0.getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result36 = testSubject0.getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result37 = testSubject0.getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result38 = testSubject0.getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result39 = testSubject0.getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result40 = testSubject0.getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result41 = testSubject0.getDisjointProperties(_Set);
        int result42 = testSubject0.compareTo(_Object110);
        int result43 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result44 = testSubject0.getSignature();
        java.util.Set<OWLClass> result45 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result46 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result47 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result48 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result49 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result50 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result51 = testSubject0.getNestedClassExpressions();
        boolean result52 = testSubject0.isTopEntity();
        boolean result53 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinalityImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectCardinalityRestrictionImpl.class.isAssignableFrom(OWLObjectMaxCardinalityImpl.class));
        assertTrue(OWLObjectMaxCardinality.class.isAssignableFrom(OWLObjectMaxCardinalityImpl.class));
    }

    public void verifyOWLObjectMaxCardinalityImpl() {
        OWLObjectMaxCardinalityImpl testSubject0 = new OWLObjectMaxCardinalityImpl(_OWLObjectPropertyExpression, _int, _OWLClassExpression);
        OWLObjectMaxCardinalityImpl testSubject1 = new OWLObjectMaxCardinalityImpl(_OWLObjectPropertyExpression, _int);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLClassExpression result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
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
        boolean result3 = testSubject0.isQualified();
        boolean result4 = testSubject0.isObjectRestriction();
        boolean result5 = testSubject0.isDataRestriction();
        int result6 = testSubject0.getCardinality();
        OWLClassExpression result7 = testSubject0.getFiller();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        boolean result9 = testSubject0.isClassExpressionLiteral();
        boolean result10 = testSubject0.isOWLThing();
        boolean result11 = testSubject0.isOWLNothing();
        OWLClassExpression result12 = testSubject0.getComplementNNF();
        OWLClassExpression result13 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result14 = testSubject0.asConjunctSet();
        boolean result15 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result16 = testSubject0.asDisjunctSet();
        OWLClassExpression result17 = testSubject0.getNNF();
        boolean result18 = testSubject0.isAnonymous();
        OWLClass result19 = testSubject0.asOWLClass();
        int result20 = testSubject0.compareTo(_Object110);
        int result21 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result22 = testSubject0.getSignature();
        java.util.Set<OWLClass> result23 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result24 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result25 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result26 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result27 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result28 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result29 = testSubject0.getNestedClassExpressions();
        boolean result30 = testSubject0.isTopEntity();
        boolean result31 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectOneOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLObjectOneOfImpl.class));
        assertTrue(OWLObjectOneOf.class.isAssignableFrom(OWLObjectOneOfImpl.class));
    }

    public void verifyOWLObjectOneOfImpl() {
        OWLObjectOneOfImpl testSubject0 = new OWLObjectOneOfImpl(_Set161);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        java.util.Set<OWLIndividual> result2 = testSubject0.getIndividuals();
        ClassExpressionType result3 = testSubject0.getClassExpressionType();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        OWLClassExpression result5 = testSubject0.asObjectUnionOf();
        boolean result6 = testSubject0.isOWLThing();
        boolean result7 = testSubject0.isOWLNothing();
        OWLClassExpression result8 = testSubject0.getComplementNNF();
        OWLClassExpression result9 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result10 = testSubject0.asConjunctSet();
        boolean result11 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result12 = testSubject0.asDisjunctSet();
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        OWLClass result15 = testSubject0.asOWLClass();
        int result16 = testSubject0.compareTo(_Object110);
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLIndividualRelationshipAxiomImpl.class.isAssignableFrom(OWLObjectPropertyAssertionAxiomImpl.class));
        assertTrue(OWLObjectPropertyAssertionAxiom.class.isAssignableFrom(OWLObjectPropertyAssertionAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyAssertionAxiomImpl() {
        OWLObjectPropertyAssertionAxiomImpl testSubject0 = new OWLObjectPropertyAssertionAxiomImpl(_OWLIndividual, _OWLObjectPropertyExpression, _OWLIndividual, _Set134);
        testSubject0.accept(_OWLAxiomVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyAssertionAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyAssertionAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        boolean result8 = testSubject0.isInSimplifiedForm();
        OWLObjectPropertyAssertionAxiom result9 = testSubject0.getSimplified();
        OWLPropertyExpression result10 = testSubject0.getProperty();
        OWLObject result11 = testSubject0.getObject();
        OWLIndividual result12 = testSubject0.getSubject();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyCharacteristicAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiomImpl.class));
        assertTrue(OWLObjectPropertyCharacteristicAxiom.class.isAssignableFrom(OWLObjectPropertyCharacteristicAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyCharacteristicAxiomImpl() {
        OWLObjectPropertyCharacteristicAxiomImpl testSubject0 = new OWLObjectPropertyCharacteristicAxiomImpl(_OWLObjectPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObjectPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyDomainAxiomImpl.class.isAssignableFrom(OWLObjectPropertyDomainAxiomImpl.class));
        assertTrue(OWLObjectPropertyDomainAxiom.class.isAssignableFrom(OWLObjectPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyDomainAxiomImpl() {
        OWLObjectPropertyDomainAxiomImpl testSubject0 = new OWLObjectPropertyDomainAxiomImpl(_OWLObjectPropertyExpression, _OWLClassExpression, _Set134);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyDomainAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLObjectPropertyDomainAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLClassExpression result8 = testSubject0.getDomain();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyExpressionImpl.class.isAssignableFrom(OWLObjectPropertyExpressionImpl.class));
        assertTrue(OWLObjectPropertyExpression.class.isAssignableFrom(OWLObjectPropertyExpressionImpl.class));
    }

    public void verifyOWLObjectPropertyExpressionImpl() {
        OWLObjectPropertyExpressionImpl testSubject0 = new OWLObjectPropertyExpressionImpl() {
            @Override
            public OWLObjectProperty asOWLObjectProperty() {
                return null;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public void accept(OWLPropertyExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLPropertyExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public boolean isOWLTopObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLTopDataProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomDataProperty() {
                return false;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected Set<? extends OWLSubPropertyAxiom<OWLObjectPropertyExpression>> getSubPropertyAxiomsForRHS(OWLOntology ont) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        boolean result0 = testSubject0.isFunctional(_OWLOntology);
        boolean result1 = testSubject0.isFunctional(_Set);
        boolean result2 = testSubject0.isDataPropertyExpression();
        boolean result3 = testSubject0.isObjectPropertyExpression();
        boolean result4 = testSubject0.isTransitive(_OWLOntology);
        boolean result5 = testSubject0.isTransitive(_Set);
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0.getInverses(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0.getInverses(_Set);
        OWLObjectPropertyExpression result8 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getSimplified();
        boolean result10 = testSubject0.isSymmetric(_Set);
        boolean result11 = testSubject0.isSymmetric(_OWLOntology);
        boolean result12 = testSubject0.isInverseFunctional(_OWLOntology);
        boolean result13 = testSubject0.isInverseFunctional(_Set);
        OWLObjectProperty result14 = testSubject0.getNamedProperty();
        boolean result15 = testSubject0.isAsymmetric(_Set);
        boolean result16 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result17 = testSubject0.isReflexive(_OWLOntology);
        boolean result18 = testSubject0.isReflexive(_Set);
        boolean result19 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result20 = testSubject0.isIrreflexive(_Set);
        java.util.Set<OWLClassExpression> result21 = testSubject0.getDomains(_Set);
        java.util.Set<OWLClassExpression> result22 = testSubject0.getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result23 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result24 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result25 = testSubject0.getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result26 = testSubject0.getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result27 = testSubject0.getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result28 = testSubject0.getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result29 = testSubject0.getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result30 = testSubject0.getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result31 = testSubject0.getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result32 = testSubject0.getDisjointProperties(_Set);
        int result33 = testSubject0.compareTo(_Object110);
        int result34 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result35 = testSubject0.getSignature();
        java.util.Set<OWLClass> result36 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result37 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result38 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result39 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result40 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result41 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result42 = testSubject0.getNestedClassExpressions();
        boolean result43 = testSubject0.isTopEntity();
        boolean result44 = testSubject0.isBottomEntity();
        OWLObject result45 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result46 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result47 = testSubject0.isOWLTopObjectProperty();
        boolean result48 = testSubject0.isOWLBottomObjectProperty();
        boolean result49 = testSubject0.isOWLTopDataProperty();
        boolean result50 = testSubject0.isOWLBottomDataProperty();
        boolean result51 = testSubject0.isAnonymous();
        OWLObjectProperty result52 = testSubject0.asOWLObjectProperty();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyExpressionImpl.class.isAssignableFrom(OWLObjectPropertyImpl.class));
        assertTrue(OWLObjectProperty.class.isAssignableFrom(OWLObjectPropertyImpl.class));
    }

    public void verifyOWLObjectPropertyImpl() {
        OWLObjectPropertyImpl testSubject0 = new OWLObjectPropertyImpl(_IRI);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations(_OWLOntology, _OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations(_OWLOntology);
        boolean result2 = testSubject0.isType(_EntityType);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        testSubject0.accept(_OWLEntityVisitor);
        OWLObject result3 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result4 = testSubject0.accept(_OWLEntityVisitorEx);
        OWLObject result5 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        testSubject0.accept(_OWLNamedObjectVisitor);
        boolean result6 = testSubject0.isOWLTopObjectProperty();
        boolean result7 = testSubject0.isOWLBottomObjectProperty();
        boolean result8 = testSubject0.isOWLTopDataProperty();
        boolean result9 = testSubject0.isOWLBottomDataProperty();
        boolean result10 = testSubject0.isBuiltIn();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        boolean result13 = testSubject0.isAnonymous();
        java.util.Set<OWLAxiom> result14 = testSubject0.getReferencingAxioms(_OWLOntology);
        java.util.Set<OWLAxiom> result15 = testSubject0.getReferencingAxioms(_OWLOntology, _boolean);
        java.util.Set<OWLAnnotationAssertionAxiom> result16 = testSubject0.getAnnotationAssertionAxioms(_OWLOntology);
        IRI result17 = testSubject0.getIRI();
        EntityType<?> result18 = testSubject0.getEntityType();
        OWLEntity result19 = testSubject0.getOWLEntity(_EntityType123);
        boolean result20 = testSubject0.isOWLClass();
        OWLClass result21 = testSubject0.asOWLClass();
        boolean result22 = testSubject0.isOWLObjectProperty();
        OWLObjectProperty result23 = testSubject0.asOWLObjectProperty();
        boolean result24 = testSubject0.isOWLDataProperty();
        OWLDataProperty result25 = testSubject0.asOWLDataProperty();
        boolean result26 = testSubject0.isOWLNamedIndividual();
        OWLNamedIndividual result27 = testSubject0.asOWLNamedIndividual();
        boolean result28 = testSubject0.isOWLDatatype();
        OWLDatatype result29 = testSubject0.asOWLDatatype();
        boolean result30 = testSubject0.isOWLAnnotationProperty();
        OWLAnnotationProperty result31 = testSubject0.asOWLAnnotationProperty();
        String result32 = testSubject0.toStringID();
        boolean result33 = testSubject0.isFunctional(_OWLOntology);
        boolean result34 = testSubject0.isFunctional(_Set);
        boolean result35 = testSubject0.isDataPropertyExpression();
        boolean result36 = testSubject0.isObjectPropertyExpression();
        boolean result37 = testSubject0.isTransitive(_OWLOntology);
        boolean result38 = testSubject0.isTransitive(_Set);
        java.util.Set<OWLObjectPropertyExpression> result39 = testSubject0.getInverses(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result40 = testSubject0.getInverses(_Set);
        OWLObjectPropertyExpression result41 = testSubject0.getInverseProperty();
        OWLObjectPropertyExpression result42 = testSubject0.getSimplified();
        boolean result43 = testSubject0.isSymmetric(_Set);
        boolean result44 = testSubject0.isSymmetric(_OWLOntology);
        boolean result45 = testSubject0.isInverseFunctional(_OWLOntology);
        boolean result46 = testSubject0.isInverseFunctional(_Set);
        OWLObjectProperty result47 = testSubject0.getNamedProperty();
        boolean result48 = testSubject0.isAsymmetric(_Set);
        boolean result49 = testSubject0.isAsymmetric(_OWLOntology);
        boolean result50 = testSubject0.isReflexive(_OWLOntology);
        boolean result51 = testSubject0.isReflexive(_Set);
        boolean result52 = testSubject0.isIrreflexive(_OWLOntology);
        boolean result53 = testSubject0.isIrreflexive(_Set);
        java.util.Set<OWLClassExpression> result54 = testSubject0.getDomains(_Set);
        java.util.Set<OWLClassExpression> result55 = testSubject0.getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result56 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result57 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result58 = testSubject0.getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result59 = testSubject0.getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result60 = testSubject0.getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result61 = testSubject0.getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result62 = testSubject0.getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result63 = testSubject0.getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result64 = testSubject0.getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result65 = testSubject0.getDisjointProperties(_Set);
        int result66 = testSubject0.compareTo(_Object110);
        int result67 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result68 = testSubject0.getSignature();
        java.util.Set<OWLClass> result69 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result70 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result71 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result72 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result73 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result74 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result75 = testSubject0.getNestedClassExpressions();
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyRangeAxiomImpl.class.isAssignableFrom(OWLObjectPropertyRangeAxiomImpl.class));
        assertTrue(OWLObjectPropertyRangeAxiom.class.isAssignableFrom(OWLObjectPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLObjectPropertyRangeAxiomImpl() {
        OWLObjectPropertyRangeAxiomImpl testSubject0 = new OWLObjectPropertyRangeAxiomImpl(_OWLObjectPropertyExpression, _OWLClassExpression, _Set134);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLObjectPropertyRangeAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLObjectPropertyRangeAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLClassExpression result8 = testSubject0.getRange();
        OWLPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
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
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        boolean result3 = testSubject0.isObjectRestriction();
        boolean result4 = testSubject0.isDataRestriction();
        OWLClassExpression result5 = testSubject0.getFiller();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        boolean result7 = testSubject0.isClassExpressionLiteral();
        boolean result8 = testSubject0.isOWLThing();
        boolean result9 = testSubject0.isOWLNothing();
        OWLClassExpression result10 = testSubject0.getComplementNNF();
        OWLClassExpression result11 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result12 = testSubject0.asConjunctSet();
        boolean result13 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result14 = testSubject0.asDisjunctSet();
        OWLClassExpression result15 = testSubject0.getNNF();
        boolean result16 = testSubject0.isAnonymous();
        OWLClass result17 = testSubject0.asOWLClass();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOfImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLNaryBooleanClassExpressionImpl.class.isAssignableFrom(OWLObjectUnionOfImpl.class));
        assertTrue(OWLObjectUnionOf.class.isAssignableFrom(OWLObjectUnionOfImpl.class));
    }

    public void verifyOWLObjectUnionOfImpl() {
        OWLObjectUnionOfImpl testSubject0 = new OWLObjectUnionOfImpl(_Set152);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result2 = testSubject0.getClassExpressionType();
        java.util.Set<OWLClassExpression> result3 = testSubject0.asDisjunctSet();
        boolean result4 = testSubject0.isClassExpressionLiteral();
        java.util.List<OWLClassExpression> result5 = testSubject0.getOperandsAsList();
        java.util.Set<OWLClassExpression> result6 = testSubject0.getOperands();
        boolean result7 = testSubject0.isOWLThing();
        boolean result8 = testSubject0.isOWLNothing();
        OWLClassExpression result9 = testSubject0.getComplementNNF();
        OWLClassExpression result10 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result11 = testSubject0.asConjunctSet();
        boolean result12 = testSubject0.containsConjunct(_OWLClassExpression);
        OWLClassExpression result13 = testSubject0.getNNF();
        boolean result14 = testSubject0.isAnonymous();
        OWLClass result15 = testSubject0.asOWLClass();
        int result16 = testSubject0.compareTo(_Object110);
        int result17 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result18 = testSubject0.getSignature();
        java.util.Set<OWLClass> result19 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result20 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result21 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result22 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result23 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result24 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result25 = testSubject0.getNestedClassExpressions();
        boolean result26 = testSubject0.isTopEntity();
        boolean result27 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLOntologyImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLOntologyImpl.class));
        assertTrue(OWLMutableOntology.class.isAssignableFrom(OWLOntologyImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyImpl.class));
    }

    public void verifyOWLOntologyImpl() {
        OWLOntologyImpl testSubject0 = new OWLOntologyImpl(_OWLOntologyManager, _OWLOntologyID);
        boolean result0 = testSubject0.isEmpty();
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        java.util.Set<OWLEntity> result2 = testSubject0.getSignature();
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature(_boolean);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLNamedObjectVisitor);
        OWLObject result4 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLOntologyID result5 = testSubject0.getOntologyID();
        java.util.Set<OWLClass> result6 = testSubject0.getClassesInSignature(_boolean);
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature(_boolean);
        java.util.Set<OWLDataProperty> result10 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result11 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature(_boolean);
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature(_boolean);
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature(_boolean);
        boolean result17 = testSubject0.isAnonymous();
        OWLOntologyManager result18 = testSubject0.getOWLOntologyManager();
        java.util.Set<IRI> result19 = testSubject0.getDirectImportsDocuments();
        java.util.Set<OWLOntology> result20 = testSubject0.getDirectImports();
        java.util.Set<OWLOntology> result21 = testSubject0.getImports();
        java.util.Set<OWLOntology> result22 = testSubject0.getImportsClosure();
        java.util.Set<OWLImportsDeclaration> result23 = testSubject0.getImportsDeclarations();
        java.util.Set<OWLAnnotationAxiom> result24 = testSubject0.getAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLClassAxiom> result25 = testSubject0.getAxioms(_OWLClass);
        java.util.Set<OWLObjectPropertyAxiom> result26 = testSubject0.getAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDataPropertyAxiom> result27 = testSubject0.getAxioms(_OWLDataProperty);
        java.util.Set<OWLDatatypeDefinitionAxiom> result28 = testSubject0.getAxioms(_OWLDatatype);
        java.util.Set<OWLIndividualAxiom> result29 = testSubject0.getAxioms(_OWLIndividual);
        java.util.Set<OWLAxiom> result30 = testSubject0.getAxioms();
        java.util.Set<OWLAxiom> result31 = testSubject0.getAxioms(_AxiomType);
        java.util.Set<OWLAxiom> result32 = testSubject0.getAxioms(_AxiomType, _boolean);
        int result33 = testSubject0.getAxiomCount(_AxiomType);
        int result34 = testSubject0.getAxiomCount(_AxiomType, _boolean);
        int result35 = testSubject0.getAxiomCount();
        java.util.Set<OWLLogicalAxiom> result36 = testSubject0.getLogicalAxioms();
        int result37 = testSubject0.getLogicalAxiomCount();
        java.util.Set<OWLAxiom> result38 = testSubject0.getTBoxAxioms(_boolean);
        java.util.Set<OWLAxiom> result39 = testSubject0.getABoxAxioms(_boolean);
        java.util.Set<OWLAxiom> result40 = testSubject0.getRBoxAxioms(_boolean);
        boolean result41 = testSubject0.containsAxiom(_OWLAxiom96, _boolean);
        boolean result42 = testSubject0.containsAxiom(_OWLAxiom96);
        boolean result43 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom96);
        boolean result44 = testSubject0.containsAxiomIgnoreAnnotations(_OWLAxiom96, _boolean);
        java.util.Set<OWLAxiom> result45 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom96);
        java.util.Set<OWLAxiom> result46 = testSubject0.getAxiomsIgnoreAnnotations(_OWLAxiom96, _boolean);
        java.util.Set<OWLClassAxiom> result47 = testSubject0.getGeneralClassAxioms();
        java.util.Set<OWLAnonymousIndividual> result48 = testSubject0.getReferencedAnonymousIndividuals();
        java.util.Set<OWLAnnotationProperty> result49 = testSubject0.getAnnotationPropertiesInSignature();
        java.util.Set<OWLAxiom> result50 = testSubject0.getReferencingAxioms(_OWLAnonymousIndividual);
        java.util.Set<OWLAxiom> result51 = testSubject0.getReferencingAxioms(_OWLEntity);
        java.util.Set<OWLAxiom> result52 = testSubject0.getReferencingAxioms(_OWLEntity, _boolean);
        boolean result53 = testSubject0.containsEntityInSignature(_IRI);
        boolean result54 = testSubject0.containsEntityInSignature(_OWLEntity);
        boolean result55 = testSubject0.containsEntityInSignature(_IRI, _boolean);
        boolean result56 = testSubject0.containsEntityInSignature(_OWLEntity, _boolean);
        boolean result57 = testSubject0.isDeclared(_OWLEntity);
        boolean result58 = testSubject0.isDeclared(_OWLEntity, _boolean);
        boolean result59 = testSubject0.containsClassInSignature(_IRI);
        boolean result60 = testSubject0.containsClassInSignature(_IRI, _boolean);
        boolean result61 = testSubject0.containsObjectPropertyInSignature(_IRI, _boolean);
        boolean result62 = testSubject0.containsObjectPropertyInSignature(_IRI);
        boolean result63 = testSubject0.containsDataPropertyInSignature(_IRI);
        boolean result64 = testSubject0.containsDataPropertyInSignature(_IRI, _boolean);
        boolean result65 = testSubject0.containsAnnotationPropertyInSignature(_IRI, _boolean);
        boolean result66 = testSubject0.containsAnnotationPropertyInSignature(_IRI);
        boolean result67 = testSubject0.containsIndividualInSignature(_IRI, _boolean);
        boolean result68 = testSubject0.containsIndividualInSignature(_IRI);
        boolean result69 = testSubject0.containsDatatypeInSignature(_IRI, _boolean);
        boolean result70 = testSubject0.containsDatatypeInSignature(_IRI);
        java.util.Set<OWLEntity> result71 = testSubject0.getEntitiesInSignature(_IRI);
        java.util.Set<OWLEntity> result72 = testSubject0.getEntitiesInSignature(_IRI, _boolean);
        java.util.Set<OWLSubAnnotationPropertyOfAxiom> result73 = testSubject0.getSubAnnotationPropertyOfAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyDomainAxiom> result74 = testSubject0.getAnnotationPropertyDomainAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotationPropertyRangeAxiom> result75 = testSubject0.getAnnotationPropertyRangeAxioms(_OWLAnnotationProperty);
        java.util.Set<OWLDeclarationAxiom> result76 = testSubject0.getDeclarationAxioms(_OWLEntity);
        java.util.Set<OWLAnnotationAssertionAxiom> result77 = testSubject0.getAnnotationAssertionAxioms(_OWLAnnotationSubject);
        java.util.Set<OWLSubClassOfAxiom> result78 = testSubject0.getSubClassAxiomsForSubClass(_OWLClass);
        java.util.Set<OWLSubClassOfAxiom> result79 = testSubject0.getSubClassAxiomsForSuperClass(_OWLClass);
        java.util.Set<OWLEquivalentClassesAxiom> result80 = testSubject0.getEquivalentClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointClassesAxiom> result81 = testSubject0.getDisjointClassesAxioms(_OWLClass);
        java.util.Set<OWLDisjointUnionAxiom> result82 = testSubject0.getDisjointUnionAxioms(_OWLClass);
        java.util.Set<OWLHasKeyAxiom> result83 = testSubject0.getHasKeyAxioms(_OWLClass);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result84 = testSubject0.getObjectSubPropertyAxiomsForSubProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result85 = testSubject0.getObjectSubPropertyAxiomsForSuperProperty(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyDomainAxiom> result86 = testSubject0.getObjectPropertyDomainAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLObjectPropertyRangeAxiom> result87 = testSubject0.getObjectPropertyRangeAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseObjectPropertiesAxiom> result88 = testSubject0.getInverseObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLEquivalentObjectPropertiesAxiom> result89 = testSubject0.getEquivalentObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLDisjointObjectPropertiesAxiom> result90 = testSubject0.getDisjointObjectPropertiesAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLFunctionalObjectPropertyAxiom> result91 = testSubject0.getFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLInverseFunctionalObjectPropertyAxiom> result92 = testSubject0.getInverseFunctionalObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSymmetricObjectPropertyAxiom> result93 = testSubject0.getSymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLAsymmetricObjectPropertyAxiom> result94 = testSubject0.getAsymmetricObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLReflexiveObjectPropertyAxiom> result95 = testSubject0.getReflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLIrreflexiveObjectPropertyAxiom> result96 = testSubject0.getIrreflexiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLTransitiveObjectPropertyAxiom> result97 = testSubject0.getTransitiveObjectPropertyAxioms(_OWLObjectPropertyExpression);
        java.util.Set<OWLSubDataPropertyOfAxiom> result98 = testSubject0.getDataSubPropertyAxiomsForSubProperty(_OWLDataProperty);
        java.util.Set<OWLSubDataPropertyOfAxiom> result99 = testSubject0.getDataSubPropertyAxiomsForSuperProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLDataPropertyDomainAxiom> result100 = testSubject0.getDataPropertyDomainAxioms(_OWLDataProperty);
        java.util.Set<OWLDataPropertyRangeAxiom> result101 = testSubject0.getDataPropertyRangeAxioms(_OWLDataProperty);
        java.util.Set<OWLEquivalentDataPropertiesAxiom> result102 = testSubject0.getEquivalentDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLDisjointDataPropertiesAxiom> result103 = testSubject0.getDisjointDataPropertiesAxioms(_OWLDataProperty);
        java.util.Set<OWLFunctionalDataPropertyAxiom> result104 = testSubject0.getFunctionalDataPropertyAxioms(_OWLDataPropertyExpression);
        java.util.Set<OWLClassAssertionAxiom> result105 = testSubject0.getClassAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLClassAssertionAxiom> result106 = testSubject0.getClassAssertionAxioms(_OWLClassExpression);
        java.util.Set<OWLDataPropertyAssertionAxiom> result107 = testSubject0.getDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLObjectPropertyAssertionAxiom> result108 = testSubject0.getObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeObjectPropertyAssertionAxiom> result109 = testSubject0.getNegativeObjectPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLNegativeDataPropertyAssertionAxiom> result110 = testSubject0.getNegativeDataPropertyAssertionAxioms(_OWLIndividual);
        java.util.Set<OWLSameIndividualAxiom> result111 = testSubject0.getSameIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDifferentIndividualsAxiom> result112 = testSubject0.getDifferentIndividualAxioms(_OWLIndividual);
        java.util.Set<OWLDatatypeDefinitionAxiom> result113 = testSubject0.getDatatypeDefinitions(_OWLDatatype);
        java.util.List<OWLOntologyChange> result114 = testSubject0.applyChanges(_List182);
        java.util.List<OWLOntologyChange> result115 = testSubject0.applyChange(_OWLOntologyChange);
        boolean result116 = testSubject0.containsReference(_OWLDatatype);
        boolean result117 = testSubject0.containsReference(_OWLAnnotationProperty);
        boolean result118 = testSubject0.containsReference(_OWLObjectProperty);
        boolean result119 = testSubject0.containsReference(_OWLDataProperty);
        boolean result120 = testSubject0.containsReference(_OWLClass);
        boolean result121 = testSubject0.containsReference(_OWLNamedIndividual);
        java.util.Set<OWLNamedObject> result122 = testSubject0.getReferencedObjects();
        java.util.Set<OWLAnnotationProperty> result123 = testSubject0.getReferencedAnnotationProperties(_boolean);
        int result124 = testSubject0.compareTo(_Object110);
        int result125 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLClassExpression> result126 = testSubject0.getNestedClassExpressions();
        boolean result127 = testSubject0.isTopEntity();
        boolean result128 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLOntologyIRIMapperImpl() {
        assertTrue(OWLOntologyIRIMapper.class.isAssignableFrom(OWLOntologyIRIMapperImpl.class));
    }

    public void verifyOWLOntologyIRIMapperImpl() {
        OWLOntologyIRIMapperImpl testSubject0 = new OWLOntologyIRIMapperImpl();
        IRI result0 = testSubject0.getDocumentIRI(_IRI);
        testSubject0.addMapping(_IRI, _IRI);
    }

    @Test
    public void enforceInterfacesOWLOntologyManagerImpl() {
        assertTrue(OWLOntologyManager.class.isAssignableFrom(OWLOntologyManagerImpl.class));
        assertTrue(OWLOntologyFactory.OWLOntologyCreationHandler.class.isAssignableFrom(OWLOntologyManagerImpl.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(OWLOntologyManagerImpl.class));
    }

    public void verifyOWLOntologyManagerImpl() throws OWLOntologyStorageException, OWLOntologyCreationException {
        OWLOntologyManagerImpl testSubject0 = new OWLOntologyManagerImpl(_OWLDataFactory);
        boolean result0 = testSubject0.contains(_OWLOntologyID);
        boolean result1 = testSubject0.contains(_IRI);
        boolean result2 = testSubject0.contains(_OWLOntology);
        OWLOntologyManagerProperties result3 = testSubject0.getProperties();
        OWLOntology result4 = testSubject0.getOntology(_IRI);
        OWLOntology result5 = testSubject0.getOntology(_OWLOntologyID);
        java.util.Set<OWLOntology> result6 = testSubject0.getDirectImports(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getImports(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0.getImportsClosure(_OWLOntology);
        OWLDataFactory result9 = testSubject0.getOWLDataFactory();
        java.util.Set<OWLOntology> result10 = testSubject0.getOntologies();
        java.util.Set<OWLOntology> result11 = testSubject0.getOntologies(_OWLAxiom96);
        java.util.Set<OWLOntology> result12 = testSubject0.getVersions(_IRI);
        boolean result13 = testSubject0.containsVersion(_IRI);
        java.util.Set<OWLOntologyID> result14 = testSubject0.getOntologyIDsByVersion(_IRI);
        OWLOntology result15 = testSubject0.getImportedOntology(_OWLImportsDeclaration);
        java.util.List<OWLOntology> result16 = testSubject0.getSortedImportsClosure(_OWLOntology);
        java.util.List<OWLOntologyChange> result17 = testSubject0.applyChanges(_List185);
        java.util.List<OWLOntologyChange> result18 = testSubject0.addAxioms(_OWLOntology, _Set186);
        java.util.List<OWLOntologyChange> result19 = testSubject0.addAxiom(_OWLOntology, _OWLAxiom96);
        java.util.List<OWLOntologyChange> result20 = testSubject0.removeAxiom(_OWLOntology, _OWLAxiom96);
        java.util.List<OWLOntologyChange> result21 = testSubject0.removeAxioms(_OWLOntology, _Set186);
        java.util.List<OWLOntologyChange> result22 = testSubject0.applyChange(_OWLOntologyChange);
        OWLOntology result23 = testSubject0.createOntology(_IRI, _IRI);
        OWLOntology result24 = testSubject0.createOntology(_IRI);
        OWLOntology result25 = testSubject0.createOntology(_OWLOntologyID);
        OWLOntology result26 = testSubject0.createOntology();
        OWLOntology result27 = testSubject0.createOntology(_Set187);
        OWLOntology result28 = testSubject0.createOntology(_IRI, _Set, _boolean);
        OWLOntology result29 = testSubject0.createOntology(_Set187, _IRI);
        OWLOntology result30 = testSubject0.createOntology(_IRI, _Set);
        OWLOntology result31 = testSubject0.loadOntology(_IRI);
        OWLOntology result32 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource);
        OWLOntology result33 = testSubject0.loadOntologyFromOntologyDocument(_InputStream);
        OWLOntology result34 = testSubject0.loadOntologyFromOntologyDocument(_File);
        OWLOntology result35 = testSubject0.loadOntologyFromOntologyDocument(_OWLOntologyDocumentSource, _OWLOntologyLoaderConfiguration);
        OWLOntology result36 = testSubject0.loadOntologyFromOntologyDocument(_IRI);
        testSubject0.removeOntology(_OWLOntology);
        testSubject0.removeOntology(_OWLOntologyID);
        IRI result37 = testSubject0.getOntologyDocumentIRI(_OWLOntology);
        testSubject0.setOntologyDocumentIRI(_OWLOntology, _IRI);
        OWLOntologyFormat result38 = testSubject0.getOntologyFormat(_OWLOntology);
        testSubject0.setOntologyFormat(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OutputStream);
        testSubject0.saveOntology(_OWLOntology, _IRI);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _IRI);
        testSubject0.saveOntology(_OWLOntology);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OWLOntologyDocumentTarget);
        testSubject0.saveOntology(_OWLOntology, _OWLOntologyFormat, _OutputStream);
        testSubject0.addIRIMapper(_OWLOntologyIRIMapper);
        testSubject0.removeIRIMapper(_OWLOntologyIRIMapper);
        testSubject0.clearIRIMappers();
        testSubject0.addOntologyFactory(_OWLOntologyFactory);
        testSubject0.removeOntologyFactory(_OWLOntologyFactory);
        java.util.Collection<OWLOntologyFactory> result39 = testSubject0.getOntologyFactories();
        testSubject0.addOntologyStorer(_OWLOntologyStorer);
        testSubject0.removeOntologyStorer(_OWLOntologyStorer);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener, _OWLOntologyChangeBroadcastStrategy);
        testSubject0.addOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.addImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.removeImpendingOntologyChangeListener(_ImpendingOWLOntologyChangeListener);
        testSubject0.addOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0.removeOntologyChangesVetoedListener(_OWLOntologyChangesVetoedListener);
        testSubject0.setDefaultChangeBroadcastStrategy(_OWLOntologyChangeBroadcastStrategy);
        testSubject0.removeOntologyChangeListener(_OWLOntologyChangeListener);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration);
        testSubject0.makeLoadImportRequest(_OWLImportsDeclaration, _OWLOntologyLoaderConfiguration);
        testSubject0.setSilentMissingImportsHandling(_boolean);
        boolean result40 = testSubject0.isSilentMissingImportsHandling();
        testSubject0.addMissingImportListener(_MissingImportListener);
        testSubject0.removeMissingImportListener(_MissingImportListener);
        testSubject0.addOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.removeOntologyLoaderListener(_OWLOntologyLoaderListener);
        testSubject0.addOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0.removeOntologyChangeProgessListener(_OWLOntologyChangeProgressListener);
        testSubject0.ontologyCreated(_OWLOntology);
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
        java.util.Set<OWLAnnotation> result2 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result4 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result5 = testSubject0.isAnnotated();
        boolean result6 = testSubject0.isOfType(_Set132);
        boolean result7 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result8 = testSubject0.getNNF();
        int result9 = testSubject0.compareTo(_Object110);
        int result10 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result11 = testSubject0.getSignature();
        java.util.Set<OWLClass> result12 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result13 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result14 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result15 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result16 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result17 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result18 = testSubject0.getNestedClassExpressions();
        boolean result19 = testSubject0.isTopEntity();
        boolean result20 = testSubject0.isBottomEntity();
        OWLObject result21 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result22 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result23 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result24 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result25 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLPropertyDomainAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLUnaryPropertyAxiomImpl.class.isAssignableFrom(OWLPropertyDomainAxiomImpl.class));
        assertTrue(OWLPropertyDomainAxiom.class.isAssignableFrom(OWLPropertyDomainAxiomImpl.class));
    }

    public void verifyOWLPropertyDomainAxiomImpl() {
        OWLPropertyDomainAxiomImpl testSubject0 = new OWLPropertyDomainAxiomImpl(_OWLPropertyExpression, _OWLClassExpression, _Set134) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {
                return null;
            }
        };
        OWLClassExpression result0 = testSubject0.getDomain();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLPropertyExpressionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(OWLPropertyExpressionImpl.class));
        assertTrue(OWLPropertyExpression.class.isAssignableFrom(OWLPropertyExpressionImpl.class));
    }

    public void verifyOWLPropertyExpressionImpl() {
        OWLPropertyExpressionImpl<OWLClassExpression, OWLObjectPropertyExpression> testSubject0 = new OWLPropertyExpressionImpl() {
            @Override
            public boolean isFunctional(OWLOntology ontology) {
                return false;
            }

            @Override
            public boolean isFunctional(Set ontologies) {
                return false;
            }

            @Override
            public boolean isAnonymous() {
                return false;
            }

            @Override
            public void accept(OWLPropertyExpressionVisitor visitor) {
            }

            @Override
            public Object accept(OWLPropertyExpressionVisitorEx visitor) {
                return null;
            }

            @Override
            public boolean isDataPropertyExpression() {
                return false;
            }

            @Override
            public boolean isObjectPropertyExpression() {
                return false;
            }

            @Override
            public boolean isOWLTopObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomObjectProperty() {
                return false;
            }

            @Override
            public boolean isOWLTopDataProperty() {
                return false;
            }

            @Override
            public boolean isOWLBottomDataProperty() {
                return false;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected Set getSubPropertyAxiomsForRHS(OWLOntology ont) {
                return null;
            }

            @Override
            protected Set getDomainAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getRangeAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getSubPropertyAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getEquivalentPropertiesAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected Set getDisjointPropertiesAxioms(OWLOntology ontology) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        java.util.Set<OWLClassExpression> result0 = testSubject0.getDomains(_Set);
        java.util.Set<OWLClassExpression> result1 = testSubject0.getDomains(_OWLOntology);
        java.util.Set<OWLClassExpression> result2 = testSubject0.getRanges(_OWLOntology);
        java.util.Set<OWLClassExpression> result3 = testSubject0.getRanges(_Set);
        java.util.Set<OWLObjectPropertyExpression> result4 = testSubject0.getSuperProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result5 = testSubject0.getSuperProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result6 = testSubject0.getSubProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0.getSubProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result8 = testSubject0.getEquivalentProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result9 = testSubject0.getEquivalentProperties(_Set);
        java.util.Set<OWLObjectPropertyExpression> result10 = testSubject0.getDisjointProperties(_OWLOntology);
        java.util.Set<OWLObjectPropertyExpression> result11 = testSubject0.getDisjointProperties(_Set);
        int result12 = testSubject0.compareTo(_Object110);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLPropertyExpressionVisitor);
        OWLObject result25 = testSubject0.accept(_OWLPropertyExpressionVisitorEx);
        boolean result26 = testSubject0.isFunctional(_OWLOntology);
        boolean result27 = testSubject0.isFunctional(_Set);
        boolean result28 = testSubject0.isDataPropertyExpression();
        boolean result29 = testSubject0.isObjectPropertyExpression();
        boolean result30 = testSubject0.isOWLTopObjectProperty();
        boolean result31 = testSubject0.isOWLBottomObjectProperty();
        boolean result32 = testSubject0.isOWLTopDataProperty();
        boolean result33 = testSubject0.isOWLBottomDataProperty();
        boolean result34 = testSubject0.isAnonymous();
    }

    @Test
    public void enforceInterfacesOWLPropertyRangeAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLUnaryPropertyAxiomImpl.class.isAssignableFrom(OWLPropertyRangeAxiomImpl.class));
        assertTrue(OWLPropertyRangeAxiom.class.isAssignableFrom(OWLPropertyRangeAxiomImpl.class));
    }

    public void verifyOWLPropertyRangeAxiomImpl() {
        OWLPropertyRangeAxiomImpl testSubject0 = new OWLPropertyRangeAxiomImpl(_OWLPropertyExpression, _OWLPropertyRange, _Set134) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {
                return null;
            }
        };
        OWLPropertyRange result0 = testSubject0.getRange();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
        OWLSubClassOfAxiom result28 = testSubject0.asOWLSubClassOfAxiom();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedDataRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedRestrictionImpl.class.isAssignableFrom(OWLQuantifiedDataRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedDataRestrictionImpl() {
        OWLQuantifiedDataRestrictionImpl testSubject0 = new OWLQuantifiedDataRestrictionImpl(_OWLDataPropertyExpression, _OWLDataRange) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLDataRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result27 = testSubject0.getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedObjectRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLQuantifiedRestrictionImpl.class.isAssignableFrom(OWLQuantifiedObjectRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedObjectRestrictionImpl() {
        OWLQuantifiedObjectRestrictionImpl testSubject0 = new OWLQuantifiedObjectRestrictionImpl(_OWLObjectPropertyExpression, _OWLClassExpression) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLClassExpression result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result27 = testSubject0.getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
    }

    @Test
    public void enforceInterfacesOWLQuantifiedRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLQuantifiedRestrictionImpl.class));
        assertTrue(OWLQuantifiedRestriction.class.isAssignableFrom(OWLQuantifiedRestrictionImpl.class));
    }

    public void verifyOWLQuantifiedRestrictionImpl() {
        OWLQuantifiedRestrictionImpl testSubject0 = new OWLQuantifiedRestrictionImpl(_OWLPropertyExpression, _OWLPropertyRange) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyRange result0 = testSubject0.getFiller();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
        ClassExpressionType result27 = testSubject0.getClassExpressionType();
        boolean result28 = testSubject0.isObjectRestriction();
        boolean result29 = testSubject0.isDataRestriction();
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
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLSubClassOfAxiom result2 = testSubject0.asOWLSubClassOfAxiom();
        OWLReflexiveObjectPropertyAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLReflexiveObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAnonymousClassExpressionImpl.class.isAssignableFrom(OWLRestrictionImpl.class));
        assertTrue(OWLRestriction.class.isAssignableFrom(OWLRestrictionImpl.class));
    }

    public void verifyOWLRestrictionImpl() {
        OWLRestrictionImpl testSubject0 = new OWLRestrictionImpl(_OWLPropertyExpression) {
            @Override
            public boolean isObjectRestriction() {
                return false;
            }

            @Override
            public boolean isDataRestriction() {
                return false;
            }

            @Override
            public ClassExpressionType getClassExpressionType() {
                return null;
            }

            @Override
            public void accept(OWLClassExpressionVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isClassExpressionLiteral();
        boolean result2 = testSubject0.isOWLThing();
        boolean result3 = testSubject0.isOWLNothing();
        OWLClassExpression result4 = testSubject0.getComplementNNF();
        OWLClassExpression result5 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result6 = testSubject0.asConjunctSet();
        boolean result7 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result8 = testSubject0.asDisjunctSet();
        OWLClassExpression result9 = testSubject0.getNNF();
        boolean result10 = testSubject0.isAnonymous();
        OWLClass result11 = testSubject0.asOWLClass();
        int result12 = testSubject0.compareTo(_Object110);
        int result13 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result14 = testSubject0.getSignature();
        java.util.Set<OWLClass> result15 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result16 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result17 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result18 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result19 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result20 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result21 = testSubject0.getNestedClassExpressions();
        boolean result22 = testSubject0.isTopEntity();
        boolean result23 = testSubject0.isBottomEntity();
        OWLObject result24 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result25 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
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
        OWLSameIndividualAxiomImpl testSubject0 = new OWLSameIndividualAxiomImpl(_Set161, _Set134);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        java.util.Set<OWLSameIndividualAxiom> result2 = testSubject0.asPairwiseAxioms();
        java.util.Set<OWLSubClassOfAxiom> result3 = testSubject0.asOWLSubClassOfAxioms();
        boolean result4 = testSubject0.containsAnonymousIndividuals();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLSameIndividualAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLSameIndividualAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result9 = testSubject0.getAxiomType();
        java.util.Set<OWLSameIndividualAxiom> result10 = testSubject0.asPairwiseSameIndividualAxioms();
        java.util.Set<OWLIndividual> result11 = testSubject0.getIndividuals();
        java.util.List<OWLIndividual> result12 = testSubject0.getIndividualsAsList();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLAxiomImpl.class.isAssignableFrom(OWLSubAnnotationPropertyOfAxiomImpl.class));
        assertTrue(OWLSubAnnotationPropertyOfAxiom.class.isAssignableFrom(OWLSubAnnotationPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubAnnotationPropertyOfAxiomImpl() {
        OWLSubAnnotationPropertyOfAxiomImpl testSubject0 = new OWLSubAnnotationPropertyOfAxiomImpl(_OWLAnnotationProperty, _OWLAnnotationProperty, _Collection);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLAnnotationProperty result2 = testSubject0.getSubProperty();
        OWLAnnotationProperty result3 = testSubject0.getSuperProperty();
        OWLSubAnnotationPropertyOfAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result6 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLSubAnnotationPropertyOfAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        AxiomType<?> result10 = testSubject0.getAxiomType();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubClassOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLClassAxiomImpl.class.isAssignableFrom(OWLSubClassOfAxiomImpl.class));
        assertTrue(OWLSubClassOfAxiom.class.isAssignableFrom(OWLSubClassOfAxiomImpl.class));
    }

    public void verifyOWLSubClassOfAxiomImpl() {
        OWLSubClassOfAxiomImpl testSubject0 = new OWLSubClassOfAxiomImpl(_OWLClassExpression, _OWLClassExpression, _Collection);
        boolean result0 = testSubject0.contains(_OWLClassExpression);
        OWLObject result1 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result2 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLClassExpression> result3 = testSubject0.getClassExpressions();
        java.util.Set<OWLClassExpression> result4 = testSubject0.getClassExpressionsMinus(_OWLClassExpression_array);
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubClassOfAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubClassOfAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result9 = testSubject0.getAxiomType();
        OWLClassExpression result10 = testSubject0.getSubClass();
        OWLClassExpression result11 = testSubject0.getSuperClass();
        boolean result12 = testSubject0.isGCI();
        boolean result13 = testSubject0.isLogicalAxiom();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLSubPropertyAxiomImpl.class.isAssignableFrom(OWLSubDataPropertyOfAxiomImpl.class));
        assertTrue(OWLSubDataPropertyOfAxiom.class.isAssignableFrom(OWLSubDataPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubDataPropertyOfAxiomImpl() {
        OWLSubDataPropertyOfAxiomImpl testSubject0 = new OWLSubDataPropertyOfAxiomImpl(_OWLDataPropertyExpression, _OWLDataPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubDataPropertyOfAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLSubDataPropertyOfAxiom result5 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLPropertyExpression result7 = testSubject0.getSubProperty();
        OWLPropertyExpression result8 = testSubject0.getSuperProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLSubPropertyAxiomImpl.class.isAssignableFrom(OWLSubObjectPropertyOfAxiomImpl.class));
        assertTrue(OWLSubObjectPropertyOfAxiom.class.isAssignableFrom(OWLSubObjectPropertyOfAxiomImpl.class));
    }

    public void verifyOWLSubObjectPropertyOfAxiomImpl() {
        OWLSubObjectPropertyOfAxiomImpl testSubject0 = new OWLSubObjectPropertyOfAxiomImpl(_OWLObjectPropertyExpression, _OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubObjectPropertyOfAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubObjectPropertyOfAxiom result4 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result6 = testSubject0.getAxiomType();
        OWLPropertyExpression result7 = testSubject0.getSubProperty();
        OWLPropertyExpression result8 = testSubject0.getSuperProperty();
        boolean result9 = testSubject0.isLogicalAxiom();
        boolean result10 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result13 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result14 = testSubject0.isAnnotated();
        boolean result15 = testSubject0.isOfType(_Set132);
        boolean result16 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result17 = testSubject0.getNNF();
        int result18 = testSubject0.compareTo(_Object110);
        int result19 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result20 = testSubject0.getSignature();
        java.util.Set<OWLClass> result21 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result22 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result23 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result24 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result25 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result26 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result27 = testSubject0.getNestedClassExpressions();
        boolean result28 = testSubject0.isTopEntity();
        boolean result29 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLSubPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLSubPropertyAxiomImpl.class));
        assertTrue(OWLSubPropertyAxiom.class.isAssignableFrom(OWLSubPropertyAxiomImpl.class));
    }

    public void verifyOWLSubPropertyAxiomImpl() {
        OWLSubPropertyAxiomImpl testSubject0 = new OWLSubPropertyAxiomImpl(_OWLPropertyExpression, _OWLPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getSubProperty();
        OWLPropertyExpression result1 = testSubject0.getSuperProperty();
        boolean result2 = testSubject0.isLogicalAxiom();
        boolean result3 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result5 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result6 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result7 = testSubject0.isAnnotated();
        boolean result8 = testSubject0.isOfType(_Set132);
        boolean result9 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result10 = testSubject0.getNNF();
        int result11 = testSubject0.compareTo(_Object110);
        int result12 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result13 = testSubject0.getSignature();
        java.util.Set<OWLClass> result14 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result15 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result16 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result17 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result18 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result19 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result20 = testSubject0.getNestedClassExpressions();
        boolean result21 = testSubject0.isTopEntity();
        boolean result22 = testSubject0.isBottomEntity();
        OWLObject result23 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result24 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result25 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result26 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result27 = testSubject0.getAxiomType();
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
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObjectPropertyExpression result2 = testSubject0.getSuperProperty();
        java.util.List<OWLObjectPropertyExpression> result3 = testSubject0.getPropertyChain();
        boolean result4 = testSubject0.isEncodingOfTransitiveProperty();
        OWLAxiom result5 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubPropertyChainOfAxiom result6 = testSubject0.getAxiomWithoutAnnotations();
        OWLSubPropertyChainOfAxiom result7 = testSubject0.getAnnotatedAxiom(_Set129);
        OWLAxiom result8 = testSubject0.getAnnotatedAxiom(_Set130);
        AxiomType<?> result9 = testSubject0.getAxiomType();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
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
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        java.util.Set<OWLSubObjectPropertyOfAxiom> result2 = testSubject0.asSubPropertyAxioms();
        OWLAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLSymmetricObjectPropertyAxiom result4 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result5 = testSubject0.getAnnotatedAxiom(_Set130);
        OWLSymmetricObjectPropertyAxiom result6 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result7 = testSubject0.getAxiomType();
        OWLPropertyExpression result8 = testSubject0.getProperty();
        OWLObjectPropertyExpression result9 = testSubject0.getProperty();
        boolean result10 = testSubject0.isLogicalAxiom();
        boolean result11 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result12 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result13 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result14 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result15 = testSubject0.isAnnotated();
        boolean result16 = testSubject0.isOfType(_Set132);
        boolean result17 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result18 = testSubject0.getNNF();
        int result19 = testSubject0.compareTo(_Object110);
        int result20 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result21 = testSubject0.getSignature();
        java.util.Set<OWLClass> result22 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result23 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result24 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result25 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result26 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result27 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result28 = testSubject0.getNestedClassExpressions();
        boolean result29 = testSubject0.isTopEntity();
        boolean result30 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectPropertyCharacteristicAxiomImpl.class.isAssignableFrom(OWLTransitiveObjectPropertyAxiomImpl.class));
        assertTrue(OWLTransitiveObjectPropertyAxiom.class.isAssignableFrom(OWLTransitiveObjectPropertyAxiomImpl.class));
    }

    public void verifyOWLTransitiveObjectPropertyAxiomImpl() {
        OWLTransitiveObjectPropertyAxiomImpl testSubject0 = new OWLTransitiveObjectPropertyAxiomImpl(_OWLObjectPropertyExpression, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLAxiom result2 = testSubject0.getAxiomWithoutAnnotations();
        OWLTransitiveObjectPropertyAxiom result3 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result4 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result5 = testSubject0.getAxiomType();
        OWLPropertyExpression result6 = testSubject0.getProperty();
        OWLObjectPropertyExpression result7 = testSubject0.getProperty();
        boolean result8 = testSubject0.isLogicalAxiom();
        boolean result9 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result10 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result11 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result12 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result13 = testSubject0.isAnnotated();
        boolean result14 = testSubject0.isOfType(_Set132);
        boolean result15 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result16 = testSubject0.getNNF();
        int result17 = testSubject0.compareTo(_Object110);
        int result18 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result19 = testSubject0.getSignature();
        java.util.Set<OWLClass> result20 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result21 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result22 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result23 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result24 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result25 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result26 = testSubject0.getNestedClassExpressions();
        boolean result27 = testSubject0.isTopEntity();
        boolean result28 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesOWLUnaryPropertyAxiomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLPropertyAxiomImpl.class.isAssignableFrom(OWLUnaryPropertyAxiomImpl.class));
        assertTrue(OWLUnaryPropertyAxiom.class.isAssignableFrom(OWLUnaryPropertyAxiomImpl.class));
    }

    public void verifyOWLUnaryPropertyAxiomImpl() {
        OWLUnaryPropertyAxiomImpl testSubject0 = new OWLUnaryPropertyAxiomImpl(_OWLPropertyExpression, _Collection) {
            @Override
            public void accept(OWLAxiomVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLAxiomVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public OWLAxiom getAxiomWithoutAnnotations() {
                return null;
            }

            @Override
            public OWLAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {
                return null;
            }

            @Override
            public AxiomType<?> getAxiomType() {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        OWLPropertyExpression result0 = testSubject0.getProperty();
        boolean result1 = testSubject0.isLogicalAxiom();
        boolean result2 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result4 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result5 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result6 = testSubject0.isAnnotated();
        boolean result7 = testSubject0.isOfType(_Set132);
        boolean result8 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result9 = testSubject0.getNNF();
        int result10 = testSubject0.compareTo(_Object110);
        int result11 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result12 = testSubject0.getSignature();
        java.util.Set<OWLClass> result13 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result14 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result15 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result16 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result17 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result18 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result19 = testSubject0.getNestedClassExpressions();
        boolean result20 = testSubject0.isTopEntity();
        boolean result21 = testSubject0.isBottomEntity();
        OWLObject result22 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_OWLAxiomVisitor);
        OWLObject result23 = testSubject0.accept(_OWLAxiomVisitorEx127);
        OWLAxiom result24 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result25 = testSubject0.getAnnotatedAxiom(_Set129);
        AxiomType<?> result26 = testSubject0.getAxiomType();
    }

    @Test
    public void enforceInterfacesOWLValueRestrictionImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLRestrictionImpl.class.isAssignableFrom(OWLValueRestrictionImpl.class));
        assertTrue(OWLHasValueRestriction.class.isAssignableFrom(OWLValueRestrictionImpl.class));
    }

    public void verifyOWLValueRestrictionImpl() {
        OWLValueRestrictionImpl testSubject0 = mock(OWLValueRestrictionImpl.class);
        OWLObject result0 = testSubject0.getValue();
        OWLPropertyExpression result1 = testSubject0.getProperty();
        boolean result2 = testSubject0.isClassExpressionLiteral();
        boolean result3 = testSubject0.isOWLThing();
        boolean result4 = testSubject0.isOWLNothing();
        OWLClassExpression result5 = testSubject0.getComplementNNF();
        OWLClassExpression result6 = testSubject0.getObjectComplementOf();
        java.util.Set<OWLClassExpression> result7 = testSubject0.asConjunctSet();
        boolean result8 = testSubject0.containsConjunct(_OWLClassExpression);
        java.util.Set<OWLClassExpression> result9 = testSubject0.asDisjunctSet();
        OWLClassExpression result10 = testSubject0.getNNF();
        boolean result11 = testSubject0.isAnonymous();
        OWLClass result12 = testSubject0.asOWLClass();
        int result13 = testSubject0.compareTo(_Object110);
        int result14 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result15 = testSubject0.getSignature();
        java.util.Set<OWLClass> result16 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result17 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result18 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result19 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result20 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result21 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result22 = testSubject0.getNestedClassExpressions();
        boolean result23 = testSubject0.isTopEntity();
        boolean result24 = testSubject0.isBottomEntity();
        OWLObject result25 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result26 = testSubject0.accept(_OWLClassExpressionVisitorEx);
        testSubject0.accept(_OWLClassExpressionVisitor);
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
        ParsableOWLOntologyFactory testSubject0 = new ParsableOWLOntologyFactory();
        OWLOntology result0 = testSubject0.loadOWLOntology(_OWLOntologyDocumentSource, _OWLOntologyCreationHandler);
        OWLOntology result1 = testSubject0.loadOWLOntology(_OWLOntologyDocumentSource, _OWLOntologyCreationHandler, _OWLOntologyLoaderConfiguration);
        boolean result2 = testSubject0.canCreateFromDocumentIRI(_IRI);
        OWLOntology result3 = testSubject0.createOWLOntology(_URI, _URI);
        boolean result4 = testSubject0.canLoad(_OWLOntologyDocumentSource);
        java.util.List<org.semanticweb.owlapi.io.OWLParser> result5 = testSubject0.getParsers();
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result6 = testSubject0.getOWLOntologyManager();
        OWLOntology result7 = testSubject0.createOWLOntology(_OWLOntologyID, _IRI, _OWLOntologyCreationHandler);
    }

    @Test
    public void enforceInterfacesSWRLAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLAtomImpl.class));
        assertTrue(SWRLAtom.class.isAssignableFrom(SWRLAtomImpl.class));
    }

    public void verifySWRLAtomImpl() {
        SWRLAtomImpl testSubject0 = mock(SWRLAtomImpl.class);
        SWRLPredicate result0 = testSubject0.getPredicate();
        int result1 = testSubject0.compareTo(_Object110);
        int result2 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result3 = testSubject0.getSignature();
        java.util.Set<OWLClass> result4 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result5 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result6 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result7 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result8 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result9 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result10 = testSubject0.getNestedClassExpressions();
        boolean result11 = testSubject0.isTopEntity();
        boolean result12 = testSubject0.isBottomEntity();
        OWLObject result13 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        java.util.Collection<SWRLArgument> result14 = testSubject0.getAllArguments();
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result15 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLBinaryAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class.isAssignableFrom(SWRLBinaryAtomImpl.class));
        assertTrue(SWRLBinaryAtom.class.isAssignableFrom(SWRLBinaryAtomImpl.class));
    }

    public void verifySWRLBinaryAtomImpl() {
        SWRLBinaryAtomImpl testSubject0 = new SWRLBinaryAtomImpl(_SWRLPredicate, _SWRLArgument, _SWRLArgument) {
            @Override
            public void accept(SWRLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(SWRLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }
        };
        SWRLArgument result0 = testSubject0.getFirstArgument();
        SWRLArgument result1 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result2 = testSubject0.getAllArguments();
        SWRLPredicate result3 = testSubject0.getPredicate();
        int result4 = testSubject0.compareTo(_Object110);
        int result5 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result6 = testSubject0.getSignature();
        java.util.Set<OWLClass> result7 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result8 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result9 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result10 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result11 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result12 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result13 = testSubject0.getNestedClassExpressions();
        boolean result14 = testSubject0.isTopEntity();
        boolean result15 = testSubject0.isBottomEntity();
        OWLObject result16 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result17 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class.isAssignableFrom(SWRLBuiltInAtomImpl.class));
        assertTrue(SWRLBuiltInAtom.class.isAssignableFrom(SWRLBuiltInAtomImpl.class));
    }

    public void verifySWRLBuiltInAtomImpl() {
        SWRLBuiltInAtomImpl testSubject0 = new SWRLBuiltInAtomImpl(_IRI, _List173);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        SWRLPredicate result2 = testSubject0.getPredicate();
        IRI result3 = testSubject0.getPredicate();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        boolean result5 = testSubject0.isCoreBuiltIn();
        java.util.List<SWRLDArgument> result6 = testSubject0.getArguments();
        int result7 = testSubject0.compareTo(_Object110);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLClassAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLUnaryAtomImpl.class.isAssignableFrom(SWRLClassAtomImpl.class));
        assertTrue(SWRLClassAtom.class.isAssignableFrom(SWRLClassAtomImpl.class));
    }

    public void verifySWRLClassAtomImpl() {
        SWRLClassAtomImpl testSubject0 = new SWRLClassAtomImpl(_OWLClassExpression, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLClassExpression result3 = testSubject0.getPredicate();
        SWRLIArgument result4 = testSubject0.getArgument();
        java.util.Collection<SWRLArgument> result5 = testSubject0.getAllArguments();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLDataPropertyAtomImpl.class));
        assertTrue(SWRLDataPropertyAtom.class.isAssignableFrom(SWRLDataPropertyAtomImpl.class));
    }

    public void verifySWRLDataPropertyAtomImpl() {
        SWRLDataPropertyAtomImpl testSubject0 = new SWRLDataPropertyAtomImpl(_OWLDataPropertyExpression, _SWRLIArgument, _SWRLDArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLDataPropertyExpression result3 = testSubject0.getPredicate();
        SWRLIArgument result4 = testSubject0.getFirstArgument();
        SWRLDArgument result5 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result6 = testSubject0.getAllArguments();
        int result7 = testSubject0.compareTo(_Object110);
        int result8 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result9 = testSubject0.getSignature();
        java.util.Set<OWLClass> result10 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result11 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result12 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result13 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result14 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result15 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result16 = testSubject0.getNestedClassExpressions();
        boolean result17 = testSubject0.isTopEntity();
        boolean result18 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLUnaryAtomImpl.class.isAssignableFrom(SWRLDataRangeAtomImpl.class));
        assertTrue(SWRLDataRangeAtom.class.isAssignableFrom(SWRLDataRangeAtomImpl.class));
    }

    public void verifySWRLDataRangeAtomImpl() {
        SWRLDataRangeAtomImpl testSubject0 = new SWRLDataRangeAtomImpl(_OWLDataRange, _SWRLDArgument);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLDataRange result3 = testSubject0.getPredicate();
        SWRLDArgument result4 = testSubject0.getArgument();
        java.util.Collection<SWRLArgument> result5 = testSubject0.getAllArguments();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLDifferentIndividualsAtomImpl.class));
        assertTrue(SWRLDifferentIndividualsAtom.class.isAssignableFrom(SWRLDifferentIndividualsAtomImpl.class));
    }

    public void verifySWRLDifferentIndividualsAtomImpl() {
        SWRLDifferentIndividualsAtomImpl testSubject0 = new SWRLDifferentIndividualsAtomImpl(_OWLDataFactory, _SWRLIArgument, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        SWRLIArgument result2 = testSubject0.getFirstArgument();
        SWRLIArgument result3 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        SWRLPredicate result5 = testSubject0.getPredicate();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLIndividualArgumentImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLIndividualArgumentImpl.class));
        assertTrue(SWRLIndividualArgument.class.isAssignableFrom(SWRLIndividualArgumentImpl.class));
    }

    public void verifySWRLIndividualArgumentImpl() {
        SWRLIndividualArgumentImpl testSubject0 = new SWRLIndividualArgumentImpl(_OWLIndividual);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLIndividual result2 = testSubject0.getIndividual();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLLiteralArgumentImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLLiteralArgumentImpl.class));
        assertTrue(SWRLLiteralArgument.class.isAssignableFrom(SWRLLiteralArgumentImpl.class));
    }

    public void verifySWRLLiteralArgumentImpl() {
        SWRLLiteralArgumentImpl testSubject0 = new SWRLLiteralArgumentImpl(_OWLLiteral);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        OWLLiteral result2 = testSubject0.getLiteral();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLObjectPropertyAtomImpl.class));
        assertTrue(SWRLObjectPropertyAtom.class.isAssignableFrom(SWRLObjectPropertyAtomImpl.class));
    }

    public void verifySWRLObjectPropertyAtomImpl() {
        SWRLObjectPropertyAtomImpl testSubject0 = new SWRLObjectPropertyAtomImpl(_OWLObjectPropertyExpression, _SWRLIArgument, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        SWRLPredicate result2 = testSubject0.getPredicate();
        OWLObjectPropertyExpression result3 = testSubject0.getPredicate();
        SWRLObjectPropertyAtom result4 = testSubject0.getSimplified();
        SWRLIArgument result5 = testSubject0.getFirstArgument();
        SWRLIArgument result6 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result7 = testSubject0.getAllArguments();
        int result8 = testSubject0.compareTo(_Object110);
        int result9 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result10 = testSubject0.getSignature();
        java.util.Set<OWLClass> result11 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result12 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result13 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result14 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result15 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result16 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result17 = testSubject0.getNestedClassExpressions();
        boolean result18 = testSubject0.isTopEntity();
        boolean result19 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLRuleImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLLogicalAxiomImpl.class.isAssignableFrom(SWRLRuleImpl.class));
        assertTrue(SWRLRule.class.isAssignableFrom(SWRLRuleImpl.class));
    }

    public void verifySWRLRuleImpl() {
        SWRLRuleImpl testSubject0 = new SWRLRuleImpl(_Set170, _Set170, _Collection);
        testSubject0.accept(_OWLObjectVisitor);
        OWLObject result0 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result1 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result2 = testSubject0.accept(_OWLAxiomVisitorEx127);
        testSubject0.accept(_OWLAxiomVisitor);
        boolean result3 = testSubject0.containsAnonymousClassExpressions();
        java.util.Set<OWLClassExpression> result4 = testSubject0.getClassAtomPredicates();
        java.util.Set<SWRLAtom> result5 = testSubject0.getBody();
        java.util.Set<SWRLAtom> result6 = testSubject0.getHead();
        java.util.Set<SWRLVariable> result7 = testSubject0.getVariables();
        SWRLRule result8 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result9 = testSubject0.getAxiomWithoutAnnotations();
        OWLAxiom result10 = testSubject0.getAnnotatedAxiom(_Set129);
        boolean result11 = testSubject0.isLogicalAxiom();
        AxiomType<?> result12 = testSubject0.getAxiomType();
        SWRLRule result13 = testSubject0.getSimplified();
        boolean result14 = testSubject0.isAnnotationAxiom();
        java.util.Set<OWLAnnotation> result15 = testSubject0.getAnnotations(_OWLAnnotationProperty);
        java.util.Set<OWLAnnotation> result16 = testSubject0.getAnnotations();
        testSubject0.accept(_CollectionContainerVisitor131);
        boolean result17 = testSubject0.equalsIgnoreAnnotations(_OWLAxiom96);
        boolean result18 = testSubject0.isAnnotated();
        boolean result19 = testSubject0.isOfType(_Set132);
        boolean result20 = testSubject0.isOfType(_AxiomType_array);
        OWLAxiom result21 = testSubject0.getNNF();
        int result22 = testSubject0.compareTo(_Object110);
        int result23 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result24 = testSubject0.getSignature();
        java.util.Set<OWLClass> result25 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result26 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result27 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result28 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result29 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result30 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result31 = testSubject0.getNestedClassExpressions();
        boolean result32 = testSubject0.isTopEntity();
        boolean result33 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLBinaryAtomImpl.class.isAssignableFrom(SWRLSameIndividualAtomImpl.class));
        assertTrue(SWRLSameIndividualAtom.class.isAssignableFrom(SWRLSameIndividualAtomImpl.class));
    }

    public void verifySWRLSameIndividualAtomImpl() {
        SWRLSameIndividualAtomImpl testSubject0 = new SWRLSameIndividualAtomImpl(_OWLDataFactory, _SWRLIArgument, _SWRLIArgument);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        SWRLIArgument result2 = testSubject0.getFirstArgument();
        SWRLIArgument result3 = testSubject0.getSecondArgument();
        java.util.Collection<SWRLArgument> result4 = testSubject0.getAllArguments();
        SWRLPredicate result5 = testSubject0.getPredicate();
        int result6 = testSubject0.compareTo(_Object110);
        int result7 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result8 = testSubject0.getSignature();
        java.util.Set<OWLClass> result9 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result10 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result11 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result12 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result13 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result14 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result15 = testSubject0.getNestedClassExpressions();
        boolean result16 = testSubject0.isTopEntity();
        boolean result17 = testSubject0.isBottomEntity();
    }

    @Test
    public void enforceInterfacesSWRLUnaryAtomImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.SWRLAtomImpl.class.isAssignableFrom(SWRLUnaryAtomImpl.class));
        assertTrue(SWRLUnaryAtom.class.isAssignableFrom(SWRLUnaryAtomImpl.class));
    }

    public void verifySWRLUnaryAtomImpl() {
        SWRLUnaryAtomImpl testSubject0 = new SWRLUnaryAtomImpl(_SWRLPredicate, _SWRLArgument) {
            @Override
            public void accept(SWRLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(SWRLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            public void accept(OWLObjectVisitor visitor) {
            }

            @Override
            public <O> O accept(OWLObjectVisitorEx<O> visitor) {
                return null;
            }

            @Override
            protected int compareObjectOfSameType(OWLObject object) {
                return 0;
            }
        };
        SWRLArgument result0 = testSubject0.getArgument();
        java.util.Collection<SWRLArgument> result1 = testSubject0.getAllArguments();
        SWRLPredicate result2 = testSubject0.getPredicate();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
        OWLObject result15 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_OWLObjectVisitor);
        testSubject0.accept(_SWRLObjectVisitor);
        OWLObject result16 = testSubject0.accept(_SWRLObjectVisitorEx);
    }

    @Test
    public void enforceInterfacesSWRLVariableImpl() {
        assertTrue(uk.ac.manchester.cs.owl.owlapi.OWLObjectImpl.class.isAssignableFrom(SWRLVariableImpl.class));
        assertTrue(SWRLVariable.class.isAssignableFrom(SWRLVariableImpl.class));
    }

    public void verifySWRLVariableImpl() {
        SWRLVariableImpl testSubject0 = mock(SWRLVariableImpl.class);
        OWLObject result0 = testSubject0.accept(_SWRLObjectVisitorEx);
        OWLObject result1 = testSubject0.accept(_OWLObjectVisitorEx);
        testSubject0.accept(_SWRLObjectVisitor);
        testSubject0.accept(_OWLObjectVisitor);
        IRI result2 = testSubject0.getIRI();
        int result3 = testSubject0.compareTo(_Object110);
        int result4 = testSubject0.compareTo(_OWLObject);
        java.util.Set<OWLEntity> result5 = testSubject0.getSignature();
        java.util.Set<OWLClass> result6 = testSubject0.getClassesInSignature();
        java.util.Set<OWLAnonymousIndividual> result7 = testSubject0.getAnonymousIndividuals();
        java.util.Set<OWLDataProperty> result8 = testSubject0.getDataPropertiesInSignature();
        java.util.Set<OWLObjectProperty> result9 = testSubject0.getObjectPropertiesInSignature();
        java.util.Set<OWLNamedIndividual> result10 = testSubject0.getIndividualsInSignature();
        java.util.Set<OWLDatatype> result11 = testSubject0.getDatatypesInSignature();
        java.util.Set<OWLClassExpression> result12 = testSubject0.getNestedClassExpressions();
        boolean result13 = testSubject0.isTopEntity();
        boolean result14 = testSubject0.isBottomEntity();
    }

    private static class R {
    }

    private static class V {
    }

    private static class F {
    }

    private static class K {
    }

    private static class T {
    }

    private SWRLArgument _SWRLArgument;
    private OWLClass _Object;
    private OWLObject _OWLPropertyAssertionObject;
    private OWLPropertyExpression _OWLPropertyExpression;
    private Pointer<OWLClass, OWLAxiom> _Pointer;
    private OWLPropertyRange _OWLPropertyRange;
    private T _Object103;
    private OWLClassAxiom _OWLAxiom;
    private byte[] _byte_array;
    private boolean _boolean;
    private double _double;
    private float _float;
    private int _int;
    private java.io.File _File;
    private java.io.InputStream _InputStream;
    private java.io.OutputStream _OutputStream;
    private OWLObject _Object110;
    private String _String;
    private java.net.URI _URI;
    private java.util.Collection<? extends OWLAnnotation> _Collection;
    private java.util.Collection<OWLAnonymousIndividual> _Collection178;
    private java.util.List<? extends OWLObjectPropertyExpression> _List;
    private java.util.List<? extends OWLOntologyChange> _List185;
    private java.util.List<OWLOntologyChange> _List182;
    private java.util.List<SWRLDArgument> _List173;
    private java.util.Set<OWLAnnotation> _Set130;
    private java.util.Set<OWLObjectPropertyExpression> _Set181;
    private java.util.Set<? extends OWLAnnotation> _Set134;
    private java.util.Set<? extends OWLAxiom> _Set186;
    private java.util.Set<? extends OWLClassExpression> _Set152;
    private java.util.Set<? extends OWLDataPropertyExpression> _Set167;
    private java.util.Set<? extends OWLDataRange> _Set159;
    private java.util.Set<? extends OWLIndividual> _Set161;
    private java.util.Set<? extends OWLLiteral> _Set154;
    private java.util.Set<? extends OWLObjectPropertyExpression> _Set164;
    private java.util.Set<? extends OWLPropertyExpression<?, ?>> _Set168;
    private java.util.Set<? extends SWRLAtom> _Set170;
    private java.util.Set<AxiomType<?>> _Set132;
    private java.util.Set<OWLAnnotation> _Set129;
    private java.util.Set<OWLAxiom> _Set187;
    private java.util.Set<OWLEntity> _Set177;
    private java.util.Set<OWLFacetRestriction> _Set158;
    private java.util.Set<OWLOntology> _Set;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentTarget _OWLOntologyDocumentTarget;
    private AxiomType<?> _AxiomType97;
    private AxiomType<?>[] _AxiomType_array;
    private AxiomType<OWLAxiom> _AxiomType;
    private EntityType<?> _EntityType;
    private EntityType<OWLEntity> _EntityType123;
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
    private OWLAnnotationSubjectVisitorEx<OWLEntity> _OWLAnnotationSubjectVisitorEx;
    private OWLAnnotationValue _OWLAnnotationValue;
    private OWLAnnotationValueVisitor _OWLAnnotationValueVisitor;
    private OWLAnnotationValueVisitorEx<OWLObject> _OWLAnnotationValueVisitorEx;
    private OWLAnonymousIndividual _OWLAnonymousIndividual;
    private OWLAsymmetricObjectPropertyAxiom _OWLAsymmetricObjectPropertyAxiom;
    private OWLAxiom _OWLAxiom96;
    private OWLAxiomVisitor _OWLAxiomVisitor;
    private OWLAxiomVisitorEx<?> _OWLAxiomVisitorEx;
    private OWLAxiomVisitorEx<OWLObject> _OWLAxiomVisitorEx127;
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
    private OWLOntologyChange _OWLOntologyChange;
    private OWLOntologyChangeBroadcastStrategy _OWLOntologyChangeBroadcastStrategy;
    private OWLOntologyChangeListener _OWLOntologyChangeListener;
    private OWLOntologyChangeProgressListener _OWLOntologyChangeProgressListener;
    private OWLOntologyChangesVetoedListener _OWLOntologyChangesVetoedListener;
    private OWLOntologyFactory _OWLOntologyFactory;
    private OWLOntologyFactory.OWLOntologyCreationHandler _OWLOntologyCreationHandler;
    private OWLOntologyFormat _OWLOntologyFormat;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyIRIMapper _OWLOntologyIRIMapper;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyLoaderListener _OWLOntologyLoaderListener;
    private OWLOntologyManager _OWLOntologyManager;
    private OWLOntologyStorer _OWLOntologyStorer;
    private OWLPropertyExpression<?, ?>[] _OWLPropertyExpression_array;
    private OWLPropertyExpressionVisitor _OWLPropertyExpressionVisitor;
    private OWLPropertyExpressionVisitorEx<OWLObject> _OWLPropertyExpressionVisitorEx;
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
    private org.semanticweb.owlapi.util.OWLAxiomSearchFilter<OWLAxiom, OWLClass> _OWLAxiomSearchFilter;
    private org.semanticweb.owlapi.vocab.OWL2Datatype _OWL2Datatype;
    private org.semanticweb.owlapi.vocab.OWLFacet _OWLFacet;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainer<Object> _CollectionContainer;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainerVisitor<Object> _CollectionContainerVisitor;
    private uk.ac.manchester.cs.owl.owlapi.CollectionContainerVisitor<OWLAnnotation> _CollectionContainerVisitor131;
    private uk.ac.manchester.cs.owl.owlapi.Internals _Internals;
}
