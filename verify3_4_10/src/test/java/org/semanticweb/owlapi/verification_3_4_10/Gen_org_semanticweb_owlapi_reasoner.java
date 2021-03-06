package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.reasoner.AxiomNotInProfileException;
import org.semanticweb.owlapi.reasoner.BufferingMode;
import org.semanticweb.owlapi.reasoner.ClassExpressionNotInProfileException;
import org.semanticweb.owlapi.reasoner.ConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.FreshEntitiesException;
import org.semanticweb.owlapi.reasoner.FreshEntityPolicy;
import org.semanticweb.owlapi.reasoner.IllegalConfigurationException;
import org.semanticweb.owlapi.reasoner.ImportsClosureNotInProfileException;
import org.semanticweb.owlapi.reasoner.InconsistentOntologyException;
import org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy;
import org.semanticweb.owlapi.reasoner.InferenceType;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.NullReasonerProgressMonitor;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException;
import org.semanticweb.owlapi.reasoner.ReasonerInternalException;
import org.semanticweb.owlapi.reasoner.ReasonerInterruptedException;
import org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.reasoner.TimeOutException;
import org.semanticweb.owlapi.reasoner.TimedConsoleProgressMonitor;
import org.semanticweb.owlapi.reasoner.UnsupportedEntailmentTypeException;

@SuppressWarnings({ "javadoc", "unused", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_reasoner {
    @Test
    public void enforceInterfacesAxiomNotInProfileException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(AxiomNotInProfileException.class));
    }

    public void verifyAxiomNotInProfileException() throws Exception {
        AxiomNotInProfileException testSubject0 = new AxiomNotInProfileException(
                _OWLAxiom, _OWLProfile);
        org.semanticweb.owlapi.model.OWLAxiom result0 = testSubject0.getAxiom();
        org.semanticweb.owlapi.profiles.OWLProfile result1 = testSubject0.getProfile();
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
    public void enforceInterfacesBufferingMode() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(BufferingMode.class));
    }

    public void verifyEnumBufferingMode() throws Exception {
        BufferingMode testSubject0 = BufferingMode.BUFFERING;
        BufferingMode testSubject1 = BufferingMode.NON_BUFFERING;
    }

    @Test
    public void enforceInterfacesClassExpressionNotInProfileException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(ClassExpressionNotInProfileException.class));
    }

    public void verifyClassExpressionNotInProfileException() throws Exception {
        ClassExpressionNotInProfileException testSubject0 = new ClassExpressionNotInProfileException(
                _OWLClassExpression, _OWLProfile);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getClassExpression();
        org.semanticweb.owlapi.profiles.OWLProfile result1 = testSubject0.getProfile();
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
    public void enforceInterfacesConsoleProgressMonitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor.class
                .isAssignableFrom(ConsoleProgressMonitor.class));
    }

    public void verifyConsoleProgressMonitor() throws Exception {
        ConsoleProgressMonitor testSubject0 = new ConsoleProgressMonitor();
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    @Test
    public void enforceInterfacesFreshEntitiesException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(FreshEntitiesException.class));
    }

    public void verifyFreshEntitiesException() throws Exception {
        FreshEntitiesException testSubject0 = new FreshEntitiesException(_OWLEntity,
                _Throwable);
        FreshEntitiesException testSubject1 = new FreshEntitiesException(_OWLEntity);
        FreshEntitiesException testSubject2 = new FreshEntitiesException(_Collection,
                _Throwable);
        FreshEntitiesException testSubject3 = new FreshEntitiesException(_Set);
        FreshEntitiesException testSubject4 = new FreshEntitiesException(_Collection);
        java.lang.String result0 = testSubject0.getMessage();
        java.util.List<org.semanticweb.owlapi.model.OWLEntity> result1 = testSubject0
                .getEntities();
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
    public void enforceInterfacesFreshEntityPolicy() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(FreshEntityPolicy.class));
    }

    public void verifyEnumFreshEntityPolicy() throws Exception {
        FreshEntityPolicy testSubject0 = FreshEntityPolicy.ALLOW;
        FreshEntityPolicy testSubject1 = FreshEntityPolicy.DISALLOW;
    }

    @Test
    public void enforceInterfacesIllegalConfigurationException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(IllegalConfigurationException.class));
    }

    public void verifyIllegalConfigurationException() throws Exception {
        IllegalConfigurationException testSubject0 = new IllegalConfigurationException(
                _String, _Throwable, _OWLReasonerConfiguration);
        IllegalConfigurationException testSubject1 = new IllegalConfigurationException(
                _String, _OWLReasonerConfiguration);
        IllegalConfigurationException testSubject2 = new IllegalConfigurationException(
                _Throwable, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration result0 = testSubject0
                .getConfiguration();
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
    public void enforceInterfacesImportsClosureNotInProfileException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(ImportsClosureNotInProfileException.class));
    }

    public void verifyImportsClosureNotInProfileException() throws Exception {
        ImportsClosureNotInProfileException testSubject0 = new ImportsClosureNotInProfileException(
                _OWLProfile);
        org.semanticweb.owlapi.profiles.OWLProfile result0 = testSubject0.getProfile();
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
    public void enforceInterfacesInconsistentOntologyException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(InconsistentOntologyException.class));
    }

    public void verifyInconsistentOntologyException() throws Exception {
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
    public void enforceInterfacesIndividualNodeSetPolicy() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(IndividualNodeSetPolicy.class));
    }

    public void verifyEnumIndividualNodeSetPolicy() throws Exception {
        IndividualNodeSetPolicy testSubject0 = IndividualNodeSetPolicy.BY_SAME_AS;
        IndividualNodeSetPolicy testSubject1 = IndividualNodeSetPolicy.BY_NAME;
    }

    @Test
    public void enforceInterfacesInferenceType() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(InferenceType.class));
    }

    public void verifyEnumInferenceType() throws Exception {
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
    public void enforceInterfacesNode() throws Exception {
        assertTrue(java.lang.Iterable.class.isAssignableFrom(Node.class));
    }

    public void verifyInterfaceNode() throws Exception {
        Node<OWLClass> testSubject0 = mock(Node.class);
        boolean result0 = testSubject0.contains(_OWLClass);
        int result1 = testSubject0.getSize();
        boolean result2 = testSubject0.isTopNode();
        boolean result3 = testSubject0.isBottomNode();
        java.util.Set<OWLClass> result4 = testSubject0.getEntitiesMinus(_OWLClass);
        java.util.Set<OWLClass> result5 = testSubject0.getEntitiesMinusTop();
        java.util.Set<OWLClass> result6 = testSubject0.getEntitiesMinusBottom();
        boolean result7 = testSubject0.isSingleton();
        OWLClass result8 = testSubject0.getRepresentativeElement();
        java.util.Set<OWLClass> result9 = testSubject0.getEntities();
        java.util.Iterator<OWLClass> result10 = testSubject0.iterator();
    }

    @Test
    public void enforceInterfacesNodeSet() throws Exception {
        assertTrue(java.lang.Iterable.class.isAssignableFrom(NodeSet.class));
    }

    public void verifyInterfaceNodeSet() throws Exception {
        NodeSet<OWLClass> testSubject0 = mock(NodeSet.class);
        boolean result0 = testSubject0.isEmpty();
        boolean result1 = testSubject0.isSingleton();
        java.util.Set<OWLClass> result2 = testSubject0.getFlattened();
        boolean result3 = testSubject0.containsEntity(_OWLClass);
        boolean result4 = testSubject0.isTopSingleton();
        boolean result5 = testSubject0.isBottomSingleton();
        java.util.Set<org.semanticweb.owlapi.reasoner.Node<OWLClass>> result6 = testSubject0
                .getNodes();
        java.util.Iterator<Node<OWLClass>> result7 = testSubject0.iterator();
    }

    @Test
    public void enforceInterfacesNullReasonerProgressMonitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor.class
                .isAssignableFrom(NullReasonerProgressMonitor.class));
        assertTrue(java.io.Serializable.class
                .isAssignableFrom(NullReasonerProgressMonitor.class));
    }

    public void verifyNullReasonerProgressMonitor() throws Exception {
        NullReasonerProgressMonitor testSubject0 = new NullReasonerProgressMonitor();
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    public void verifyInterfaceOWLReasoner() throws Exception {
        OWLReasoner testSubject0 = mock(OWLReasoner.class);
        testSubject0.interrupt();
        testSubject0.flush();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result0 = testSubject0
                .getSuperClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result1 = testSubject0
                .getSubClasses(_OWLClassExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result2 = testSubject0
                .getEquivalentClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result3 = testSubject0
                .getDisjointClasses(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result4 = testSubject0
                .getTypes(_OWLNamedIndividual, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result5 = testSubject0
                .getObjectPropertyValues(_OWLNamedIndividual,
                        _OWLObjectPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result6 = testSubject0
                .getDataPropertyValues(_OWLNamedIndividual, _OWLDataProperty);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLNamedIndividual> result7 = testSubject0
                .getSameIndividuals(_OWLNamedIndividual);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result8 = testSubject0
                .getDifferentIndividuals(_OWLNamedIndividual);
        long result9 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result10 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result11 = testSubject0
                .getIndividualNodeSetPolicy();
        org.semanticweb.owlapi.util.Version result12 = testSubject0.getReasonerVersion();
        java.lang.String result13 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.reasoner.BufferingMode result14 = testSubject0
                .getBufferingMode();
        java.util.List<org.semanticweb.owlapi.model.OWLOntologyChange> result15 = testSubject0
                .getPendingChanges();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result16 = testSubject0
                .getPendingAxiomAdditions();
        java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> result17 = testSubject0
                .getPendingAxiomRemovals();
        org.semanticweb.owlapi.model.OWLOntology result18 = testSubject0
                .getRootOntology();
        testSubject0.precomputeInferences(_InferenceType_array);
        boolean result19 = testSubject0.isPrecomputed(_InferenceType);
        java.util.Set<org.semanticweb.owlapi.reasoner.InferenceType> result20 = testSubject0
                .getPrecomputableInferenceTypes();
        boolean result21 = testSubject0.isConsistent();
        boolean result22 = testSubject0.isSatisfiable(_OWLClassExpression);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result23 = testSubject0
                .getUnsatisfiableClasses();
        boolean result24 = testSubject0.isEntailed(_Set20);
        boolean result25 = testSubject0.isEntailed(_OWLAxiom);
        boolean result26 = testSubject0.isEntailmentCheckingSupported(_AxiomType);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result27 = testSubject0
                .getTopClassNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLClass> result28 = testSubject0
                .getBottomClassNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result29 = testSubject0
                .getTopObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result30 = testSubject0
                .getBottomObjectPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result31 = testSubject0
                .getSubObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result32 = testSubject0
                .getSuperObjectProperties(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result33 = testSubject0
                .getEquivalentObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result34 = testSubject0
                .getDisjointObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result35 = testSubject0
                .getInverseObjectProperties(_OWLObjectPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result36 = testSubject0
                .getObjectPropertyDomains(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result37 = testSubject0
                .getObjectPropertyRanges(_OWLObjectPropertyExpression, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result38 = testSubject0
                .getTopDataPropertyNode();
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result39 = testSubject0
                .getBottomDataPropertyNode();
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result40 = testSubject0
                .getSubDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result41 = testSubject0
                .getSuperDataProperties(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.Node<org.semanticweb.owlapi.model.OWLDataProperty> result42 = testSubject0
                .getEquivalentDataProperties(_OWLDataProperty);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLDataProperty> result43 = testSubject0
                .getDisjointDataProperties(_OWLDataPropertyExpression);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLClass> result44 = testSubject0
                .getDataPropertyDomains(_OWLDataProperty, _boolean);
        org.semanticweb.owlapi.reasoner.NodeSet<org.semanticweb.owlapi.model.OWLNamedIndividual> result45 = testSubject0
                .getInstances(_OWLClassExpression, _boolean);
        testSubject0.dispose();
    }

    public void verifyInterfaceOWLReasonerConfiguration() throws Exception {
        OWLReasonerConfiguration testSubject0 = mock(OWLReasonerConfiguration.class);
        org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor result0 = testSubject0
                .getProgressMonitor();
        long result1 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result2 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result3 = testSubject0
                .getIndividualNodeSetPolicy();
    }

    public void verifyInterfaceOWLReasonerFactory() throws Exception {
        OWLReasonerFactory testSubject0 = mock(OWLReasonerFactory.class);
        java.lang.String result0 = testSubject0.getReasonerName();
        org.semanticweb.owlapi.reasoner.OWLReasoner result1 = testSubject0
                .createNonBufferingReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result2 = testSubject0
                .createNonBufferingReasoner(_OWLOntology);
        org.semanticweb.owlapi.reasoner.OWLReasoner result3 = testSubject0
                .createReasoner(_OWLOntology, _OWLReasonerConfiguration);
        org.semanticweb.owlapi.reasoner.OWLReasoner result4 = testSubject0
                .createReasoner(_OWLOntology);
    }

    @Test
    public void enforceInterfacesOWLReasonerRuntimeException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(OWLReasonerRuntimeException.class));
    }

    public void verifyOWLReasonerRuntimeException() throws Exception {
        OWLReasonerRuntimeException testSubject0 = new OWLReasonerRuntimeException(
                _String, _Throwable);
        OWLReasonerRuntimeException testSubject1 = new OWLReasonerRuntimeException(
                _String);
        OWLReasonerRuntimeException testSubject2 = new OWLReasonerRuntimeException(
                _Throwable);
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
    public void enforceInterfacesReasonerInternalException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(ReasonerInternalException.class));
    }

    public void verifyReasonerInternalException() throws Exception {
        ReasonerInternalException testSubject0 = new ReasonerInternalException(_Throwable);
        ReasonerInternalException testSubject1 = new ReasonerInternalException(_String);
        ReasonerInternalException testSubject2 = new ReasonerInternalException(_String,
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
    public void enforceInterfacesReasonerInterruptedException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(ReasonerInterruptedException.class));
    }

    public void verifyReasonerInterruptedException() throws Exception {
        ReasonerInterruptedException testSubject0 = new ReasonerInterruptedException(
                _Throwable);
        ReasonerInterruptedException testSubject1 = new ReasonerInterruptedException(
                _String, _Throwable);
        ReasonerInterruptedException testSubject2 = new ReasonerInterruptedException(
                _String);
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

    public void verifyInterfaceReasonerProgressMonitor() throws Exception {
        ReasonerProgressMonitor testSubject0 = mock(ReasonerProgressMonitor.class);
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    @Test
    public void enforceInterfacesSimpleConfiguration() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration.class
                .isAssignableFrom(SimpleConfiguration.class));
    }

    public void verifySimpleConfiguration() throws Exception {
        SimpleConfiguration testSubject0 = new SimpleConfiguration(_long);
        SimpleConfiguration testSubject1 = new SimpleConfiguration(_FreshEntityPolicy,
                _long);
        SimpleConfiguration testSubject2 = new SimpleConfiguration(
                _ReasonerProgressMonitor, _FreshEntityPolicy, _long,
                _IndividualNodeSetPolicy);
        SimpleConfiguration testSubject3 = new SimpleConfiguration();
        SimpleConfiguration testSubject4 = new SimpleConfiguration(
                _ReasonerProgressMonitor);
        SimpleConfiguration testSubject5 = new SimpleConfiguration(
                _ReasonerProgressMonitor, _long);
        org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor result0 = testSubject0
                .getProgressMonitor();
        long result1 = testSubject0.getTimeOut();
        org.semanticweb.owlapi.reasoner.FreshEntityPolicy result2 = testSubject0
                .getFreshEntityPolicy();
        org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy result3 = testSubject0
                .getIndividualNodeSetPolicy();
    }

    @Test
    public void enforceInterfacesTimedConsoleProgressMonitor() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor.class
                .isAssignableFrom(TimedConsoleProgressMonitor.class));
    }

    public void verifyTimedConsoleProgressMonitor() throws Exception {
        TimedConsoleProgressMonitor testSubject0 = new TimedConsoleProgressMonitor();
        testSubject0.reasonerTaskStarted(_String);
        testSubject0.reasonerTaskStopped();
        testSubject0.reasonerTaskProgressChanged(_int, _int);
        testSubject0.reasonerTaskBusy();
    }

    @Test
    public void enforceInterfacesTimeOutException() throws Exception {
        assertTrue(org.semanticweb.owlapi.reasoner.OWLReasonerRuntimeException.class
                .isAssignableFrom(TimeOutException.class));
    }

    public void verifyTimeOutException() throws Exception {
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
    public void enforceInterfacesUnsupportedEntailmentTypeException() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(UnsupportedEntailmentTypeException.class));
    }

    public void verifyUnsupportedEntailmentTypeException() throws Exception {
        UnsupportedEntailmentTypeException testSubject0 = new UnsupportedEntailmentTypeException(
                _OWLAxiom);
        org.semanticweb.owlapi.model.OWLAxiom result0 = testSubject0.getAxiom();
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

    private static class E {}

    private E _OWLObject;
    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Collection<org.semanticweb.owlapi.model.OWLEntity> _Collection;
    private java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> _Set20;
    private java.util.Set<org.semanticweb.owlapi.model.OWLEntity> _Set;
    private long _long;
    private org.semanticweb.owlapi.model.AxiomType<?> _AxiomType;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLClassExpression _OWLClassExpression;
    private org.semanticweb.owlapi.model.OWLClass _OWLClass;
    private org.semanticweb.owlapi.model.OWLDataProperty _OWLDataProperty;
    private org.semanticweb.owlapi.model.OWLDataPropertyExpression _OWLDataPropertyExpression;
    private org.semanticweb.owlapi.model.OWLEntity _OWLEntity;
    private org.semanticweb.owlapi.model.OWLNamedIndividual _OWLNamedIndividual;
    private org.semanticweb.owlapi.model.OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.profiles.OWLProfile _OWLProfile;
    private org.semanticweb.owlapi.reasoner.FreshEntityPolicy _FreshEntityPolicy;
    private org.semanticweb.owlapi.reasoner.IndividualNodeSetPolicy _IndividualNodeSetPolicy;
    private org.semanticweb.owlapi.reasoner.InferenceType _InferenceType;
    private org.semanticweb.owlapi.reasoner.InferenceType[] _InferenceType_array;
    private org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration _OWLReasonerConfiguration;
    private org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor _ReasonerProgressMonitor;
}
