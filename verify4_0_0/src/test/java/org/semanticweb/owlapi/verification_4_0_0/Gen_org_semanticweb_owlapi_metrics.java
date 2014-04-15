package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.metrics.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unused", "unchecked" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_metrics {
    @Test
    public void enforceInterfacesAbstractOWLMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.OWLMetric.class.isAssignableFrom(AbstractOWLMetric.class));
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(AbstractOWLMetric.class));
    }

    public void verifyAbstractOWLMetric() throws OWLException {
        AbstractOWLMetric<Integer> testSubject0 = mock(AbstractOWLMetric.class);
        Integer result0 = testSubject0.getValue();
        java.util.Set<OWLOntology> result1 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result2 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result3 = testSubject0.getManager();
        boolean result4 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
        java.lang.String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesAverageAssertedNamedSuperclassCount() {
        assertTrue(org.semanticweb.owlapi.metrics.DoubleValuedMetric.class.isAssignableFrom(AverageAssertedNamedSuperclassCount.class));
    }

    public void verifyAverageAssertedNamedSuperclassCount() throws OWLException {
        AverageAssertedNamedSuperclassCount testSubject0 = new AverageAssertedNamedSuperclassCount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Double result2 = testSubject0.recomputeMetric();
        Double result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCount() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(AxiomCount.class));
    }

    public void verifyAxiomCount() throws OWLException {
        AxiomCount testSubject0 = new AxiomCount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        java.util.Set<OWLOntology> result2 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCountMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(AxiomCountMetric.class));
    }

    public void verifyAxiomCountMetric() throws OWLException {
        AxiomCountMetric testSubject0 = mock(AxiomCountMetric.class);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0.getAxioms();
        java.lang.String result1 = testSubject0.getName();
        java.lang.Object result2 = testSubject0.recomputeMetric();
        java.lang.Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result7 = testSubject0.getManager();
        boolean result8 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    public void verifyAxiomTypeCountMetricFactory() {
        AxiomTypeCountMetricFactory testSubject0 = new AxiomTypeCountMetricFactory();
        java.util.Set<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = AxiomTypeCountMetricFactory.createMetrics(_OWLOntology);
    }

    @Test
    public void enforceInterfacesAxiomTypeMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class.isAssignableFrom(AxiomTypeMetric.class));
    }

    public void verifyAxiomTypeMetric() throws OWLException {
        AxiomTypeMetric testSubject0 = new AxiomTypeMetric(_OWLOntology, _AxiomType);
        AxiomType<?> result0 = testSubject0.getAxiomType();
        java.util.Set<? extends OWLAxiom> result1 = testSubject0.getAxioms();
        java.lang.String result2 = testSubject0.getName();
        java.lang.Object result3 = testSubject0.recomputeMetric();
        java.lang.Integer result4 = testSubject0.recomputeMetric();
        Integer result5 = testSubject0.getValue();
        java.util.Set<OWLOntology> result6 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result8 = testSubject0.getManager();
        boolean result9 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDLExpressivity() {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class.isAssignableFrom(DLExpressivity.class));
    }

    public void verifyDLExpressivity() throws OWLException {
        DLExpressivity testSubject0 = new DLExpressivity(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.String result2 = testSubject0.recomputeMetric();
        String result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDoubleValuedMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class.isAssignableFrom(DoubleValuedMetric.class));
    }

    public void verifyDoubleValuedMetric() throws OWLException {
        DoubleValuedMetric testSubject0 = mock(DoubleValuedMetric.class);
        Double result0 = testSubject0.getValue();
        java.util.Set<OWLOntology> result1 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result2 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result3 = testSubject0.getManager();
        boolean result4 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
        java.lang.String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesGCICount() {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class.isAssignableFrom(GCICount.class));
    }

    public void verifyGCICount() throws OWLException {
        GCICount testSubject0 = new GCICount(_OWLOntology);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0.getAxioms();
        java.lang.String result1 = testSubject0.getName();
        java.lang.Object result2 = testSubject0.recomputeMetric();
        java.lang.Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result7 = testSubject0.getManager();
        boolean result8 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesHiddenGCICount() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(HiddenGCICount.class));
    }

    public void verifyHiddenGCICount() throws OWLException {
        HiddenGCICount testSubject0 = new HiddenGCICount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        java.util.Set<OWLOntology> result2 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesImportClosureSize() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(ImportClosureSize.class));
    }

    public void verifyImportClosureSize() throws OWLException {
        ImportClosureSize testSubject0 = new ImportClosureSize(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        java.util.Set<OWLOntology> result2 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesIntegerValuedMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class.isAssignableFrom(IntegerValuedMetric.class));
    }

    public void verifyIntegerValuedMetric() throws OWLException {
        IntegerValuedMetric testSubject0 = mock(IntegerValuedMetric.class);
        Integer result0 = testSubject0.getValue();
        java.util.Set<OWLOntology> result1 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result2 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result3 = testSubject0.getManager();
        boolean result4 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
        java.lang.String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesLogicalAxiomCount() {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class.isAssignableFrom(LogicalAxiomCount.class));
    }

    public void verifyLogicalAxiomCount() throws OWLException {
        LogicalAxiomCount testSubject0 = new LogicalAxiomCount(_OWLOntology);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0.getAxioms();
        java.lang.String result1 = testSubject0.getName();
        java.lang.Object result2 = testSubject0.recomputeMetric();
        java.lang.Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result7 = testSubject0.getManager();
        boolean result8 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesMaximumNumberOfNamedSuperclasses() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(MaximumNumberOfNamedSuperclasses.class));
    }

    public void verifyMaximumNumberOfNamedSuperclasses() throws OWLException {
        MaximumNumberOfNamedSuperclasses testSubject0 = new MaximumNumberOfNamedSuperclasses(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesNumberOfClassesWithMultipleInheritance() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(NumberOfClassesWithMultipleInheritance.class));
    }

    public void verifyNumberOfClassesWithMultipleInheritance() throws OWLException {
        NumberOfClassesWithMultipleInheritance testSubject0 = new NumberOfClassesWithMultipleInheritance(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesObjectCountMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(ObjectCountMetric.class));
    }

    public void verifyObjectCountMetric() throws OWLException {
        ObjectCountMetric<Integer> testSubject0 = mock(ObjectCountMetric.class);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    public void verifyInterfaceOWLMetric() {
        OWLMetric<Integer> testSubject0 = mock(OWLMetric.class);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntology result2 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result3 = testSubject0.getManager();
        boolean result4 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    public void verifyOWLMetricManager() {
        OWLMetricManager testSubject0 = new OWLMetricManager(_List4);
        testSubject0.setOntology(_OWLOntology);
        java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = testSubject0.getMetrics();
    }

    @Test
    public void enforceInterfacesReferencedClassCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedClassCount.class));
    }

    public void verifyReferencedClassCount() throws OWLException {
        ReferencedClassCount testSubject0 = new ReferencedClassCount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedDataPropertyCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedDataPropertyCount.class));
    }

    public void verifyReferencedDataPropertyCount() throws OWLException {
        ReferencedDataPropertyCount testSubject0 = new ReferencedDataPropertyCount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedIndividualCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedIndividualCount.class));
    }

    public void verifyReferencedIndividualCount() throws OWLException {
        ReferencedIndividualCount testSubject0 = new ReferencedIndividualCount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedObjectPropertyCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedObjectPropertyCount.class));
    }

    public void verifyReferencedObjectPropertyCount() throws OWLException {
        ReferencedObjectPropertyCount testSubject0 = new ReferencedObjectPropertyCount(_OWLOntology);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result5 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesUnsatisfiableClassCountMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(UnsatisfiableClassCountMetric.class));
    }

    public void verifyUnsatisfiableClassCountMetric() throws OWLException {
        UnsatisfiableClassCountMetric testSubject0 = new UnsatisfiableClassCountMetric(_OWLReasoner);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        java.util.Set<OWLOntology> result2 = testSubject0.getOntologies();
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.util.List<? extends OWLOntologyChange<?>> _List;
    private java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> _List4;
    private AxiomType<?> _AxiomType;
    private OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
}
