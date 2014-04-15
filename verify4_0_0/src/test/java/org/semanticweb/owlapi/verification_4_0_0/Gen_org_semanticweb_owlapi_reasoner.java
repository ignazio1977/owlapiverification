package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.*;

@SuppressWarnings({ "javadoc", "unchecked", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner {
    @Test
    public void enforceInterfacesAxiomNotInProfileException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(AxiomNotInProfileException.class));
    }

    public void verifyAxiomNotInProfileException() {
        AxiomNotInProfileException testSubject0 = new AxiomNotInProfileException(_OWLAxiom, _OWLProfile);
        org.semanticweb.owlapi.profiles.OWLProfile result0 = testSubject0.getProfile();
        OWLAxiom result1 = testSubject0.getAxiom();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getMessage();
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesBufferingMode() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(BufferingMode.class));
    }

    public void verifyEnumBufferingMode() {
        BufferingMode testSubject0 = BufferingMode.BUFFERING;
        BufferingMode testSubject1 = BufferingMode.NON_BUFFERING;
    }

    @Test
    public void enforceInterfacesClassExpressionNotInProfileException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(ClassExpressionNotInProfileException.class));
    }

    public void verifyClassExpressionNotInProfileException() {
        ClassExpressionNotInProfileException testSubject0 = new ClassExpressionNotInProfileException(_OWLClassExpression, _Object);
        java.lang.Object result0 = testSubject0.getProfile();
        OWLClassExpression result1 = testSubject0.getClassExpression();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getMessage();
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesConsoleProgressMonitor() {
        assertTrue(org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor.class.isAssignableFrom(ConsoleProgressMonitor.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(ConsoleProgressMonitor.class));
    }

    public void verifyConsoleProgressMonitor() {
        ConsoleProgressMonitor testSubject0 = new ConsoleProgressMonitor();
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    @Test
    public void enforceInterfacesFreshEntitiesException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(FreshEntitiesException.class));
    }

    public void verifyFreshEntitiesException() {
        FreshEntitiesException testSubject0 = new FreshEntitiesException(_OWLEntity, _Throwable);
        FreshEntitiesException testSubject1 = new FreshEntitiesException(_OWLEntity);
        FreshEntitiesException testSubject2 = new FreshEntitiesException(_Collection, _Throwable);
        FreshEntitiesException testSubject3 = new FreshEntitiesException(_Collection);
        java.lang.String result0 = testSubject0.getMessage();
        java.util.Collection<OWLEntity> result1 = testSubject0.getEntities();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result2 = testSubject0.fillInStackTrace();
        java.lang.Throwable result3 = testSubject0.getCause();
        java.lang.Throwable result4 = testSubject0.initCause(_Throwable);
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesFreshEntityPolicy() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(FreshEntityPolicy.class));
    }

    public void verifyEnumFreshEntityPolicy() {
        FreshEntityPolicy testSubject0 = FreshEntityPolicy.ALLOW;
        FreshEntityPolicy testSubject1 = FreshEntityPolicy.DISALLOW;
    }

    @Test
    public void enforceInterfacesIllegalConfigurationException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(IllegalConfigurationException.class));
    }

    public void verifyIllegalConfigurationException() {
        IllegalConfigurationException testSubject0 = new IllegalConfigurationException(_String, _Throwable, _OWLReasonerConfiguration);
        IllegalConfigurationException testSubject1 = new IllegalConfigurationException(_String, _OWLReasonerConfiguration);
        IllegalConfigurationException testSubject2 = new IllegalConfigurationException(_Throwable, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration result0 = testSubject0.getConfiguration();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesImportsClosureNotInProfileException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(ImportsClosureNotInProfileException.class));
    }

    public void verifyImportsClosureNotInProfileException() {
        ImportsClosureNotInProfileException testSubject0 = new ImportsClosureNotInProfileException(_Object);
        java.lang.Object result0 = testSubject0.getProfile();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesInconsistentOntologyException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(InconsistentOntologyException.class));
    }

    public void verifyInconsistentOntologyException() {
        InconsistentOntologyException testSubject0 = new InconsistentOntologyException();
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
    public void enforceInterfacesIndividualNodeSetPolicy() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(IndividualNodeSetPolicy.class));
    }

    public void verifyEnumIndividualNodeSetPolicy() {
        IndividualNodeSetPolicy testSubject0 = IndividualNodeSetPolicy.BY_SAME_AS;
        IndividualNodeSetPolicy testSubject1 = IndividualNodeSetPolicy.BY_NAME;
    }

    @Test
    public void enforceInterfacesInferenceType() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(InferenceType.class));
    }

    public void verifyEnumInferenceType() {
        InferenceType testSubject0 = InferenceType.CLASS_HIERARCHY;
        InferenceType testSubject1 = InferenceType.OBJECT_PROPERTY_HIERARCHY;
        InferenceType testSubject2 = InferenceType.DATA_PROPERTY_HIERARCHY;
        InferenceType testSubject3 = InferenceType.CLASS_ASSERTIONS;
        InferenceType testSubject4 = InferenceType.OBJECT_PROPERTY_ASSERTIONS;
        InferenceType testSubject5 = InferenceType.DATA_PROPERTY_ASSERTIONS;
        InferenceType testSubject6 = InferenceType.SAME_INDIVIDUAL;
        InferenceType testSubject7 = InferenceType.DIFFERENT_INDIVIDUALS;
        InferenceType testSubject8 = InferenceType.DISJOINT_CLASSES;
    }

    @Test
    public void enforceInterfacesNode() {
        assertTrue(java.lang.Iterable.class.isAssignableFrom(Node.class));
    }

    public void verifyInterfaceNode() {
        Node<OWLClass> testSubject0 = mock(Node.class);
        boolean result0 = testSubject0.contains(mock(OWLClass.class));
        int result1 = testSubject0.getSize();
        java.util.Set<OWLClass> result2 = testSubject0.getEntities();
        boolean result3 = testSubject0.isTopNode();
        boolean result4 = testSubject0.isBottomNode();
        java.util.Set<OWLClass> result5 = testSubject0.getEntitiesMinus(mock(OWLClass.class));
        java.util.Set<OWLClass> result6 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLClass> result7 = testSubject0.getEntitiesMinusBottom();
        boolean result8 = testSubject0.isSingleton();
        OWLClass result9 = testSubject0.getRepresentativeElement();
        java.util.Iterator<OWLClass> result10 = testSubject0.iterator();
    }

    @Test
    public void enforceInterfacesNodeSet() {
        assertTrue(java.lang.Iterable.class.isAssignableFrom(NodeSet.class));
    }

    public void verifyInterfaceNodeSet() {
        NodeSet<OWLClass> testSubject0 = mock(NodeSet.class);
        boolean result0 = testSubject0.isEmpty();
        java.util.Set<OWLClass> result1 = testSubject0.getFlattened();
        boolean result2 = testSubject0.containsEntity(mock(OWLClass.class));
        boolean result3 = testSubject0.isTopSingleton();
        boolean result4 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> result5 = testSubject0.getNodes();
        boolean result6 = testSubject0.isSingleton();
        java.util.Iterator<Node<OWLClass>> result7 = testSubject0.iterator();
    }

    @Test
    public void enforceInterfacesNullReasonerProgressMonitor() {
        assertTrue(org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor.class.isAssignableFrom(NullReasonerProgressMonitor.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(NullReasonerProgressMonitor.class));
    }

    public void verifyNullReasonerProgressMonitor() {
        NullReasonerProgressMonitor testSubject0 = new NullReasonerProgressMonitor();
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    public void verifyInterfaceOWLReasoner() {
        OWLReasoner testSubject0 = mock(OWLReasoner.class);
        testSubject0.interrupt();
        testSubject0.flush();
        java.lang.String result0 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.util.Version result1 = testSubject0.getReasonerVersion();
        org.semanticweb.owlapi.reasoner.BufferingMode result2 = testSubject0.getBufferingMode();
        java.util.List<OWLOntologyChange<?>> result3 = testSubject0.getPendingChanges();
        java.util.Set<OWLAxiom> result4 = testSubject0.getPendingAxiomAdditions();
        java.util.Set<OWLAxiom> result5 = testSubject0.getPendingAxiomRemovals();
        OWLOntology result6 = testSubject0.getRootOntology();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result7 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result8 = testSubject0.getPrecomputableInferenceTypes();
        boolean result9 = testSubject0.isConsistent();
        boolean result10 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result11 = testSubject0.getUnsatisfiableClasses();
        boolean result12 = testSubject0.isEntailed(_Set);
        boolean result13 = testSubject0.isEntailed(_OWLAxiom);
        boolean result14 = testSubject0.isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result15 = testSubject0.getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result16 = testSubject0.getBottomClassNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result17 = testSubject0.getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result18 = testSubject0.getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLClass> result19 = testSubject0.getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result20 = testSubject0.getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result21 = testSubject0.getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result22 = testSubject0.getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result23 = testSubject0.getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result24 = testSubject0.getSuperObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result25 = testSubject0.getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLObjectPropertyExpression> result26 = testSubject0.getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<OWLObjectPropertyExpression> result27 = testSubject0.getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result28 = testSubject0.getObjectPropertyDomains(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result29 = testSubject0.getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result30 = testSubject0.getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result31 = testSubject0.getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result32 = testSubject0.getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result33 = testSubject0.getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<OWLDataProperty> result34 = testSubject0.getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLDataProperty> result35 = testSubject0.getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result36 = testSubject0.getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLClass> result37 = testSubject0.getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result38 = testSubject0.getInstances(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result39 = testSubject0.getObjectPropertyValues(_OWLNamedIndividual, _OWLObjectPropertyExpression);
        java.util.Set<OWLLiteral> result40 = testSubject0.getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<OWLNamedIndividual> result41 = testSubject0.getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<OWLNamedIndividual> result42 = testSubject0.getDifferentIndividuals(_OWLNamedIndividual);
        testSubject0.dispose();
        long result43 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result44 = testSubject0.getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result45 = testSubject0.getIndividualNodeSetPolicy();
    }

    public void verifyInterfaceOWLReasonerConfiguration() {
        OWLReasonerConfiguration testSubject0 = mock(OWLReasonerConfiguration.class);
        org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor result0 = testSubject0.getProgressMonitor();
        long result1 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result2 = testSubject0.getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result3 = testSubject0.getIndividualNodeSetPolicy();
    }

    public void verifyInterfaceOWLReasonerFactory() {
        OWLReasonerFactory testSubject0 = mock(OWLReasonerFactory.class);
        org.semanticweb.owlapi.reasoner.OWLReasoner result0 = testSubject0.createNonBufferingReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0.createNonBufferingReasoner(_OWLOntology);
        java.lang.String result2 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.reasoner.OWLReasoner result3 = testSubject0.createReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result4 = testSubject0.createReasoner(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWLReasonerRuntimeException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(OWLReasonerRuntimeException.class));
    }

    public void verifyOWLReasonerRuntimeException() {
        OWLReasonerRuntimeException testSubject0 = new OWLReasonerRuntimeException(_String, _Throwable);
        OWLReasonerRuntimeException testSubject1 = new OWLReasonerRuntimeException(_String);
        OWLReasonerRuntimeException testSubject2 = new OWLReasonerRuntimeException(_Throwable);
        OWLReasonerRuntimeException testSubject3 = new OWLReasonerRuntimeException();
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
    public void enforceInterfacesReasonerInternalException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(ReasonerInternalException.class));
    }

    public void verifyReasonerInternalException() {
        ReasonerInternalException testSubject0 = new ReasonerInternalException(_Throwable);
        ReasonerInternalException testSubject1 = new ReasonerInternalException(_String);
        ReasonerInternalException testSubject2 = new ReasonerInternalException(_String, _Throwable);
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
    public void enforceInterfacesReasonerInterruptedException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(ReasonerInterruptedException.class));
    }

    public void verifyReasonerInterruptedException() {
        ReasonerInterruptedException testSubject0 = new ReasonerInterruptedException(_Throwable);
        ReasonerInterruptedException testSubject1 = new ReasonerInterruptedException(_String, _Throwable);
        ReasonerInterruptedException testSubject2 = new ReasonerInterruptedException(_String);
        ReasonerInterruptedException testSubject3 = new ReasonerInterruptedException();
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

    public void verifyInterfaceReasonerProgressMonitor() {
        ReasonerProgressMonitor testSubject0 = mock(ReasonerProgressMonitor.class);
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    @Test
    public void enforceInterfacesSimpleConfiguration() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration.class.isAssignableFrom(SimpleConfiguration.class));
    }

    public void verifySimpleConfiguration() {
        SimpleConfiguration testSubject0 = new SimpleConfiguration(_long);
        SimpleConfiguration testSubject1 = new SimpleConfiguration(_FreshEntityPolicy, _long);
        SimpleConfiguration testSubject2 = new SimpleConfiguration(_ReasonerProgressMonitor, _FreshEntityPolicy, _long, _IndividualNodeSetPolicy);
        SimpleConfiguration testSubject3 = new SimpleConfiguration();
        SimpleConfiguration testSubject4 = new SimpleConfiguration(_ReasonerProgressMonitor);
        SimpleConfiguration testSubject5 = new SimpleConfiguration(_ReasonerProgressMonitor, _long);
        org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor result0 = testSubject0.getProgressMonitor();
        long result1 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result2 = testSubject0.getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result3 = testSubject0.getIndividualNodeSetPolicy();
    }

    @Test
    public void enforceInterfacesTimedConsoleProgressMonitor() {
        assertTrue(org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor.class.isAssignableFrom(TimedConsoleProgressMonitor.class));
        assertTrue(java.io.Serializable.class.isAssignableFrom(TimedConsoleProgressMonitor.class));
    }

    public void verifyTimedConsoleProgressMonitor() {
        TimedConsoleProgressMonitor testSubject0 = new TimedConsoleProgressMonitor();
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    @Test
    public void enforceInterfacesTimeOutException() {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class.isAssignableFrom(TimeOutException.class));
    }

    public void verifyTimeOutException() {
        TimeOutException testSubject0 = new TimeOutException();
        TimeOutException testSubject1 = new TimeOutException(_String);
        TimeOutException testSubject2 = new TimeOutException(_String, _Throwable);
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
    public void enforceInterfacesUnsupportedEntailmentTypeException() {
        assertTrue(OWLRuntimeException.class.isAssignableFrom(UnsupportedEntailmentTypeException.class));
    }

    public void verifyUnsupportedEntailmentTypeException() {
        UnsupportedEntailmentTypeException testSubject0 = new UnsupportedEntailmentTypeException(_OWLAxiom);
        OWLAxiom result0 = testSubject0.getAxiom();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getMessage();
        java.lang.String result5 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result6 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result7 = testSubject0.getSuppressed();
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Collection<OWLEntity> _Collection;
    private java.util.Set<? extends OWLAxiom> _Set;
    private long _long;
    private AxiomType<?> _AxiomType;
    private OWLAxiom _OWLAxiom;
    private OWLClassExpression _OWLClassExpression;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLEntity _OWLEntity;
    private OWLNamedIndividual _OWLNamedIndividual;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.profiles.OWLProfile _OWLProfile;
    private org.semanticweb.owlapi.reasoner.FreshEntityPolicy _FreshEntityPolicy;
    private org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy _IndividualNodeSetPolicy;
    private org.semanticweb.owlapi.reasoner.InferenceType _InferenceType;
    private org.semanticweb.owlapi.reasoner.InferenceType[] _InferenceType_array;
    private org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration _OWLReasonerConfiguration;
    private org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor _ReasonerProgressMonitor;
}
