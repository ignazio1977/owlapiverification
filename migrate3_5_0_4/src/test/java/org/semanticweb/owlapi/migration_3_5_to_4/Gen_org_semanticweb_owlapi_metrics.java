package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.metrics.*;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "unchecked", "rawtypes", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "method changed: AbstractOWLMetric<init> : manager dropped, OWLOntology added",
        "method changed: AverageAssertedNamedSuperclassCount<init> : manager dropped, OWLOntology added", "method changed: AxiomCount<init> : manager dropped, OWLOntology added",
        "method changed: AxiomCountMetric<init> : manager dropped, OWLOntology added", "method visibility: AxiomTypeCountMetricFactory<init> : private. Use Factory method.",
        "method changed: AxiomTypeCountMetricFactory::createMetrics() : manager dropped, OWLOntology added",
        "method changed: AxiomTypeMetric<init> : manager dropped, OWLOntology added", "method changed: DLExpressivity<init> : manager dropped, OWLOntology added",
        "method changed: DoubleValuedMetric<init> : manager dropped, OWLOntology added", "method changed: GCICount<init> : manager dropped, OWLOntology added",
        "method changed: HiddenGCICount<init> : manager dropped, OWLOntology added", "method changed: IntegerValuedMetric<init> : manager dropped, OWLOntology added",
        "method changed: ImportClosureSize<init> : manager dropped, OWLOntology added", "method changed: LogicalAxiomCount<init> : manager dropped, OWLOntology added",
        "method changed: MaximumNumberOfNamedSuperclasses<init> : manager dropped, OWLOntology added",
        "method changed: NumberOfClassesWithMultipleInheritance<init> : manager dropped, OWLOntology added",
        "method changed: ObjectCountMetric<init> : manager dropped, OWLOntology added", "method changed: ReferencedClassCount<init> : manager dropped, OWLOntology added",
        "method changed: ReferencedDataPropertyCount<init> : manager dropped, OWLOntology added", "method changed: UnsatisfiableClassCountMetric<init> : manager dropped",
        "method changed: ReferencedIndividualCount<init> : manager dropped, OWLOntology added",
        "method changed: ReferencedObjectPropertyCount<init> : manager dropped, OWLOntology added", })
public class Gen_org_semanticweb_owlapi_metrics {
    @Test
    public void enforceInterfacesAbstractOWLMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.OWLMetric.class.isAssignableFrom(AbstractOWLMetric.class));
        assertTrue(OWLOntologyChangeListener.class.isAssignableFrom(AbstractOWLMetric.class));
    }

    public void verifyAbstractOWLMetric() {
        AbstractOWLMetric<Serializable> testSubject0 = new AbstractOWLMetric<Serializable>(_OWLOntology) {
            @Override
            public String getName() {
                return null;
            }

            @Override
            protected Serializable recomputeMetric() {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(List<? extends OWLOntologyChange> changes) {
                return false;
            }

            @Override
            protected void disposeMetric() {
            }
        };
        Object result0 = testSubject0.getValue();
        OWLOntologyManager result1 = testSubject0.getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.dispose();
        String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesAverageAssertedNamedSuperclassCount() {
        assertTrue(org.semanticweb.owlapi.metrics.DoubleValuedMetric.class.isAssignableFrom(AverageAssertedNamedSuperclassCount.class));
    }

    public void verifyAverageAssertedNamedSuperclassCount() {
        AverageAssertedNamedSuperclassCount testSubject0 = new AverageAssertedNamedSuperclassCount(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Double result2 = testSubject0.recomputeMetric();
        Double result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCount() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(AxiomCount.class));
    }

    public void verifyAxiomCount() {
        AxiomCount testSubject0 = new AxiomCount(_OWLOntology);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0.getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCountMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(AxiomCountMetric.class));
    }

    public void verifyAxiomCountMetric() {
        AxiomCountMetric testSubject0 = new AxiomCountMetric(_OWLOntology) {
            @Override
            protected String getObjectTypeName() {
                return null;
            }

            @Override
            protected Set<? extends OWLAxiom> getObjects(OWLOntology ont) {
                return null;
            }
        };
        java.util.Set<? extends OWLAxiom> result0 = testSubject0.getAxioms();
        String result1 = testSubject0.getName();
        Object result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        OWLOntologyManager result5 = testSubject0.getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    public void verifyAxiomTypeCountMetricFactory() {
        java.util.Set<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = AxiomTypeCountMetricFactory.createMetrics(_OWLOntology);
    }

    @Test
    public void enforceInterfacesAxiomTypeMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class.isAssignableFrom(AxiomTypeMetric.class));
    }

    public void verifyAxiomTypeMetric() {
        AxiomTypeMetric testSubject0 = new AxiomTypeMetric(_OWLOntology, _AxiomType);
        AxiomType<?> result0 = testSubject0.getAxiomType();
        java.util.Set<? extends OWLAxiom> result1 = testSubject0.getAxioms();
        String result2 = testSubject0.getName();
        Object result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.recomputeMetric();
        Integer result5 = testSubject0.getValue();
        OWLOntologyManager result6 = testSubject0.getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result8 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result9 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDLExpressivity() {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class.isAssignableFrom(DLExpressivity.class));
    }

    public void verifyDLExpressivity() {
        DLExpressivity testSubject0 = new DLExpressivity(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        String result2 = testSubject0.recomputeMetric();
        String result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDoubleValuedMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class.isAssignableFrom(DoubleValuedMetric.class));
    }

    public void verifyDoubleValuedMetric() {
        DoubleValuedMetric testSubject0 = new DoubleValuedMetric(_OWLOntology) {
            @Override
            public String getName() {
                return null;
            }

            @Override
            protected Double recomputeMetric() {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(List<? extends OWLOntologyChange> changes) {
                return false;
            }

            @Override
            protected void disposeMetric() {
            }
        };
        double result0 = testSubject0.getValue();
        OWLOntologyManager result1 = testSubject0.getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.dispose();
        String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesGCICount() {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class.isAssignableFrom(GCICount.class));
    }

    public void verifyGCICount() {
        GCICount testSubject0 = new GCICount(_OWLOntology);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0.getAxioms();
        String result1 = testSubject0.getName();
        Object result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        OWLOntologyManager result5 = testSubject0.getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesHiddenGCICount() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(HiddenGCICount.class));
    }

    public void verifyHiddenGCICount() {
        HiddenGCICount testSubject0 = new HiddenGCICount(_OWLOntology);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0.getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesImportClosureSize() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(ImportClosureSize.class));
    }

    public void verifyImportClosureSize() {
        ImportClosureSize testSubject0 = new ImportClosureSize(_OWLOntology);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0.getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesIntegerValuedMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class.isAssignableFrom(IntegerValuedMetric.class));
    }

    public void verifyIntegerValuedMetric() {
        IntegerValuedMetric testSubject0 = new IntegerValuedMetric(_OWLOntology) {
            @Override
            public String getName() {
                return null;
            }

            @Override
            protected Integer recomputeMetric() {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(List<? extends OWLOntologyChange> changes) {
                return false;
            }

            @Override
            protected void disposeMetric() {
            }
        };
        Integer result0 = testSubject0.getValue();
        OWLOntologyManager result1 = testSubject0.getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0.getOntologies();
        testSubject0.dispose();
        String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesLogicalAxiomCount() {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class.isAssignableFrom(LogicalAxiomCount.class));
    }

    public void verifyLogicalAxiomCount() {
        LogicalAxiomCount testSubject0 = new LogicalAxiomCount(_OWLOntology);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0.getAxioms();
        String result1 = testSubject0.getName();
        Object result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        OWLOntologyManager result5 = testSubject0.getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesMaximumNumberOfNamedSuperclasses() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(MaximumNumberOfNamedSuperclasses.class));
    }

    public void verifyMaximumNumberOfNamedSuperclasses() {
        MaximumNumberOfNamedSuperclasses testSubject0 = new MaximumNumberOfNamedSuperclasses(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesNumberOfClassesWithMultipleInheritance() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(NumberOfClassesWithMultipleInheritance.class));
    }

    public void verifyNumberOfClassesWithMultipleInheritance() {
        NumberOfClassesWithMultipleInheritance testSubject0 = new NumberOfClassesWithMultipleInheritance(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesObjectCountMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(ObjectCountMetric.class));
    }

    public void verifyObjectCountMetric() {
        ObjectCountMetric<Object> testSubject0 = new ObjectCountMetric<Object>(_OWLOntology) {
            @Override
            protected String getObjectTypeName() {
                return null;
            }

            @Override
            protected Set getObjects(OWLOntology ont) {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(List<? extends OWLOntologyChange> changes) {
                return false;
            }
        };
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    public void verifyInterfaceOWLMetric() {
        OWLMetric<Object> testSubject0 = mock(OWLMetric.class);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0.getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        testSubject0.dispose();
    }

    public void verifyOWLMetricManager() {
        OWLMetricManager testSubject0 = new OWLMetricManager(_List5);
        java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = testSubject0.getMetrics();
        testSubject0.setOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesReferencedClassCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedClassCount.class));
    }

    public void verifyReferencedClassCount() {
        ReferencedClassCount testSubject0 = new ReferencedClassCount(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedDataPropertyCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedDataPropertyCount.class));
    }

    public void verifyReferencedDataPropertyCount() {
        ReferencedDataPropertyCount testSubject0 = new ReferencedDataPropertyCount(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedIndividualCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedIndividualCount.class));
    }

    public void verifyReferencedIndividualCount() {
        ReferencedIndividualCount testSubject0 = new ReferencedIndividualCount(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedObjectPropertyCount() {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class.isAssignableFrom(ReferencedObjectPropertyCount.class));
    }

    public void verifyReferencedObjectPropertyCount() {
        ReferencedObjectPropertyCount testSubject0 = new ReferencedObjectPropertyCount(_OWLOntology);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0.getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesUnsatisfiableClassCountMetric() {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class.isAssignableFrom(UnsatisfiableClassCountMetric.class));
    }

    public void verifyUnsatisfiableClassCountMetric() {
        UnsatisfiableClassCountMetric testSubject0 = new UnsatisfiableClassCountMetric(_OWLReasoner);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0.getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0.getOntologies();
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.util.List<? extends OWLOntologyChange> _List;
    private java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> _List5;
    private AxiomType<?> _AxiomType;
    private OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
}
