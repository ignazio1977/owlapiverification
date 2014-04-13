package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.metrics.AbstractOWLMetric;
import org.semanticweb.owlapi.metrics.AverageAssertedNamedSuperclassCount;
import org.semanticweb.owlapi.metrics.AxiomCount;
import org.semanticweb.owlapi.metrics.AxiomCountMetric;
import org.semanticweb.owlapi.metrics.AxiomTypeCountMetricFactory;
import org.semanticweb.owlapi.metrics.AxiomTypeMetric;
import org.semanticweb.owlapi.metrics.DLExpressivity;
import org.semanticweb.owlapi.metrics.DoubleValuedMetric;
import org.semanticweb.owlapi.metrics.GCICount;
import org.semanticweb.owlapi.metrics.HiddenGCICount;
import org.semanticweb.owlapi.metrics.ImportClosureSize;
import org.semanticweb.owlapi.metrics.IntegerValuedMetric;
import org.semanticweb.owlapi.metrics.LogicalAxiomCount;
import org.semanticweb.owlapi.metrics.MaximumNumberOfNamedSuperclasses;
import org.semanticweb.owlapi.metrics.NumberOfClassesWithMultipleInheritance;
import org.semanticweb.owlapi.metrics.OWLMetric;
import org.semanticweb.owlapi.metrics.OWLMetricManager;
import org.semanticweb.owlapi.metrics.ObjectCountMetric;
import org.semanticweb.owlapi.metrics.ReferencedClassCount;
import org.semanticweb.owlapi.metrics.ReferencedDataPropertyCount;
import org.semanticweb.owlapi.metrics.ReferencedIndividualCount;
import org.semanticweb.owlapi.metrics.ReferencedObjectPropertyCount;
import org.semanticweb.owlapi.metrics.UnsatisfiableClassCountMetric;
import OWLAxiom;
import OWLOntology;
import OWLOntologyChange;

@SuppressWarnings({ "javadoc", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_metrics {

    @Test
    public void enforceInterfacesAbstractOWLMetric()  {
        assertTrue(org.semanticweb.owlapi.metrics.OWLMetric.class
                .isAssignableFrom(AbstractOWLMetric.class));
        assertTrue(OWLOntologyChangeListener.class
                .isAssignableFrom(AbstractOWLMetric.class));
    }

    public void verifyAbstractOWLMetric()  {
        AbstractOWLMetric<Object> testSubject0 = new AbstractOWLMetric<Object>(
                _OWLOntologyManager) {

            @Override
            public String getName() {
                return null;
            }

            @Override
            protected Object recomputeMetric() {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(
                    List<? extends OWLOntologyChange> changes) {
                return false;
            }

            @Override
            protected void disposeMetric() {}
        };
        Object result0 = testSubject0.getValue();
        OWLOntologyManager result1 = testSubject0
                .getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0
                .getOntologies();
        testSubject0.dispose();
        String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesAverageAssertedNamedSuperclassCount()
             {
        assertTrue(org.semanticweb.owlapi.metrics.DoubleValuedMetric.class
                .isAssignableFrom(AverageAssertedNamedSuperclassCount.class));
    }

    public void verifyAverageAssertedNamedSuperclassCount()  {
        AverageAssertedNamedSuperclassCount testSubject0 = new AverageAssertedNamedSuperclassCount(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Double result2 = testSubject0.recomputeMetric();
        Double result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCount()  {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(AxiomCount.class));
    }

    public void verifyAxiomCount()  {
        AxiomCount testSubject0 = new AxiomCount(_OWLOntologyManager);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCountMetric()  {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(AxiomCountMetric.class));
    }

    public void verifyAxiomCountMetric()  {
        AxiomCountMetric testSubject0 = new AxiomCountMetric(
                _OWLOntologyManager) {

            @Override
            protected String getObjectTypeName() {
                return null;
            }

            @Override
            protected Set<? extends OWLAxiom> getObjects(OWLOntology ont) {
                return null;
            }
        };
        java.util.Set<? extends OWLAxiom> result0 = testSubject0
                .getAxioms();
        String result1 = testSubject0.getName();
        Object result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        OWLOntologyManager result5 = testSubject0
                .getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    public void verifyAxiomTypeCountMetricFactory()  {
        AxiomTypeCountMetricFactory testSubject0 = new AxiomTypeCountMetricFactory();
        java.util.Set<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = AxiomTypeCountMetricFactory
                .createMetrics(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesAxiomTypeMetric()  {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class
                .isAssignableFrom(AxiomTypeMetric.class));
    }

    public void verifyAxiomTypeMetric()  {
        AxiomTypeMetric testSubject0 = new AxiomTypeMetric(_OWLOntologyManager,
                _AxiomType);
        AxiomType<?> result0 = testSubject0
                .getAxiomType();
        java.util.Set<? extends OWLAxiom> result1 = testSubject0
                .getAxioms();
        String result2 = testSubject0.getName();
        Object result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.recomputeMetric();
        Integer result5 = testSubject0.getValue();
        OWLOntologyManager result6 = testSubject0
                .getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result8 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result9 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDLExpressivity()  {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class
                .isAssignableFrom(DLExpressivity.class));
    }

    public void verifyDLExpressivity()  {
        DLExpressivity testSubject0 = new DLExpressivity(_OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        String result2 = testSubject0.recomputeMetric();
        String result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDoubleValuedMetric()  {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class
                .isAssignableFrom(DoubleValuedMetric.class));
    }

    public void verifyDoubleValuedMetric()  {
        DoubleValuedMetric testSubject0 = new DoubleValuedMetric(
                _OWLOntologyManager) {

            @Override
            public String getName() {
                return null;
            }

            @Override
            protected Double recomputeMetric() {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(
                    List<? extends OWLOntologyChange> changes) {
                return false;
            }

            @Override
            protected void disposeMetric() {}
        };
        double result0 = testSubject0.getValue();
        OWLOntologyManager result1 = testSubject0
                .getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0
                .getOntologies();
        testSubject0.dispose();
        String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesGCICount()  {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class
                .isAssignableFrom(GCICount.class));
    }

    public void verifyGCICount()  {
        GCICount testSubject0 = new GCICount(_OWLOntologyManager);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0
                .getAxioms();
        String result1 = testSubject0.getName();
        Object result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        OWLOntologyManager result5 = testSubject0
                .getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesHiddenGCICount()  {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(HiddenGCICount.class));
    }

    public void verifyHiddenGCICount()  {
        HiddenGCICount testSubject0 = new HiddenGCICount(_OWLOntologyManager);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesImportClosureSize()  {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(ImportClosureSize.class));
    }

    public void verifyImportClosureSize()  {
        ImportClosureSize testSubject0 = new ImportClosureSize(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesIntegerValuedMetric()  {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class
                .isAssignableFrom(IntegerValuedMetric.class));
    }

    public void verifyIntegerValuedMetric()  {
        IntegerValuedMetric testSubject0 = new IntegerValuedMetric(
                _OWLOntologyManager) {

            @Override
            public String getName() {
                return null;
            }

            @Override
            protected Integer recomputeMetric() {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(
                    List<? extends OWLOntologyChange> changes) {
                return false;
            }

            @Override
            protected void disposeMetric() {}
        };
        Integer result0 = testSubject0.getValue();
        OWLOntologyManager result1 = testSubject0
                .getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result3 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result4 = testSubject0
                .getOntologies();
        testSubject0.dispose();
        String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesLogicalAxiomCount()  {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class
                .isAssignableFrom(LogicalAxiomCount.class));
    }

    public void verifyLogicalAxiomCount()  {
        LogicalAxiomCount testSubject0 = new LogicalAxiomCount(
                _OWLOntologyManager);
        java.util.Set<? extends OWLAxiom> result0 = testSubject0
                .getAxioms();
        String result1 = testSubject0.getName();
        Object result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        OWLOntologyManager result5 = testSubject0
                .getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result7 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result8 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesMaximumNumberOfNamedSuperclasses()
             {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(MaximumNumberOfNamedSuperclasses.class));
    }

    public void verifyMaximumNumberOfNamedSuperclasses()  {
        MaximumNumberOfNamedSuperclasses testSubject0 = new MaximumNumberOfNamedSuperclasses(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesNumberOfClassesWithMultipleInheritance()
             {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(NumberOfClassesWithMultipleInheritance.class));
    }

    public void verifyNumberOfClassesWithMultipleInheritance()  {
        NumberOfClassesWithMultipleInheritance testSubject0 = new NumberOfClassesWithMultipleInheritance(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesObjectCountMetric()  {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(ObjectCountMetric.class));
    }

    public void verifyObjectCountMetric()  {
        ObjectCountMetric<Object> testSubject0 = new ObjectCountMetric<Object>(
                _OWLOntologyManager) {

            @Override
            protected String getObjectTypeName() {
                return null;
            }

            @Override
            protected Set getObjects(OWLOntology ont) {
                return null;
            }

            @Override
            protected boolean isMetricInvalidated(
                    List<? extends OWLOntologyChange> changes) {
                return false;
            }
        };
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    public void verifyInterfaceOWLMetric()  {
        OWLMetric<Object> testSubject0 = mock(OWLMetric.class);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        OWLOntology result4 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        testSubject0.dispose();
    }

    public void verifyOWLMetricManager()  {
        OWLMetricManager testSubject0 = new OWLMetricManager(_List5);
        java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = testSubject0
                .getMetrics();
        testSubject0.setOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesReferencedClassCount()  {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedClassCount.class));
    }

    public void verifyReferencedClassCount()  {
        ReferencedClassCount testSubject0 = new ReferencedClassCount(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedDataPropertyCount()  {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedDataPropertyCount.class));
    }

    public void verifyReferencedDataPropertyCount()  {
        ReferencedDataPropertyCount testSubject0 = new ReferencedDataPropertyCount(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedIndividualCount()  {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedIndividualCount.class));
    }

    public void verifyReferencedIndividualCount()  {
        ReferencedIndividualCount testSubject0 = new ReferencedIndividualCount(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedObjectPropertyCount()
             {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedObjectPropertyCount.class));
    }

    public void verifyReferencedObjectPropertyCount()  {
        ReferencedObjectPropertyCount testSubject0 = new ReferencedObjectPropertyCount(
                _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Object result1 = testSubject0.recomputeMetric();
        Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result6 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesUnsatisfiableClassCountMetric()
             {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(UnsatisfiableClassCountMetric.class));
    }

    public void verifyUnsatisfiableClassCountMetric()  {
        UnsatisfiableClassCountMetric testSubject0 = new UnsatisfiableClassCountMetric(
                _OWLReasoner, _OWLOntologyManager);
        String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        OWLOntology result4 = testSubject0
                .getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.util.List<? extends OWLOntologyChange> _List;
    private java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> _List5;
    private AxiomType<?> _AxiomType;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
}
