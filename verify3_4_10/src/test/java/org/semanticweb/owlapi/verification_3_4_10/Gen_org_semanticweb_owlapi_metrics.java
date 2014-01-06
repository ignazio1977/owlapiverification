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
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_metrics {
    @Test
    public void enforceInterfacesAbstractOWLMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.OWLMetric.class
                .isAssignableFrom(AbstractOWLMetric.class));
        assertTrue(org.semanticweb.owlapi.model.OWLOntologyChangeListener.class
                .isAssignableFrom(AbstractOWLMetric.class));
    }

    public void verifyAbstractOWLMetric() throws Exception {
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
        org.semanticweb.owlapi.model.OWLOntologyManager result1 = testSubject0
                .getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result4 = testSubject0
                .getOntologies();
        testSubject0.dispose();
        java.lang.String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesAverageAssertedNamedSuperclassCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.DoubleValuedMetric.class
                .isAssignableFrom(AverageAssertedNamedSuperclassCount.class));
    }

    public void verifyAverageAssertedNamedSuperclassCount() throws Exception {
        AverageAssertedNamedSuperclassCount testSubject0 = new AverageAssertedNamedSuperclassCount(
                _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Double result2 = testSubject0.recomputeMetric();
        Double result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(AxiomCount.class));
    }

    public void verifyAxiomCount() throws Exception {
        AxiomCount testSubject0 = new AxiomCount(_OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesAxiomCountMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(AxiomCountMetric.class));
    }

    public void verifyAxiomCountMetric() throws Exception {
        AxiomCountMetric testSubject0 = new AxiomCountMetric(_OWLOntologyManager) {
            @Override
            protected String getObjectTypeName() {
                return null;
            }

            @Override
            protected Set<? extends OWLAxiom> getObjects(OWLOntology ont) {
                return null;
            }
        };
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getAxioms();
        java.lang.String result1 = testSubject0.getName();
        java.lang.Object result2 = testSubject0.recomputeMetric();
        java.lang.Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result5 = testSubject0
                .getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result8 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    public void verifyAxiomTypeCountMetricFactory() throws Exception {
        AxiomTypeCountMetricFactory testSubject0 = new AxiomTypeCountMetricFactory();
        java.util.Set<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = AxiomTypeCountMetricFactory
                .createMetrics(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesAxiomTypeMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class
                .isAssignableFrom(AxiomTypeMetric.class));
    }

    public void verifyAxiomTypeMetric() throws Exception {
        AxiomTypeMetric testSubject0 = new AxiomTypeMetric(_OWLOntologyManager,
                _AxiomType);
        org.semanticweb.owlapi.model.AxiomType<?> result0 = testSubject0.getAxiomType();
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> result1 = testSubject0
                .getAxioms();
        java.lang.String result2 = testSubject0.getName();
        java.lang.Object result3 = testSubject0.recomputeMetric();
        java.lang.Integer result4 = testSubject0.recomputeMetric();
        Integer result5 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result6 = testSubject0
                .getManager();
        boolean result7 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result8 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result9 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDLExpressivity() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class
                .isAssignableFrom(DLExpressivity.class));
    }

    public void verifyDLExpressivity() throws Exception {
        DLExpressivity testSubject0 = new DLExpressivity(_OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.String result2 = testSubject0.recomputeMetric();
        String result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesDoubleValuedMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class
                .isAssignableFrom(DoubleValuedMetric.class));
    }

    public void verifyDoubleValuedMetric() throws Exception {
        DoubleValuedMetric testSubject0 = new DoubleValuedMetric(_OWLOntologyManager) {
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
        org.semanticweb.owlapi.model.OWLOntologyManager result1 = testSubject0
                .getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result4 = testSubject0
                .getOntologies();
        testSubject0.dispose();
        java.lang.String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesGCICount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class
                .isAssignableFrom(GCICount.class));
    }

    public void verifyGCICount() throws Exception {
        GCICount testSubject0 = new GCICount(_OWLOntologyManager);
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getAxioms();
        java.lang.String result1 = testSubject0.getName();
        java.lang.Object result2 = testSubject0.recomputeMetric();
        java.lang.Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result5 = testSubject0
                .getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result8 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesHiddenGCICount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(HiddenGCICount.class));
    }

    public void verifyHiddenGCICount() throws Exception {
        HiddenGCICount testSubject0 = new HiddenGCICount(_OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesImportClosureSize() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(ImportClosureSize.class));
    }

    public void verifyImportClosureSize() throws Exception {
        ImportClosureSize testSubject0 = new ImportClosureSize(_OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesIntegerValuedMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.AbstractOWLMetric.class
                .isAssignableFrom(IntegerValuedMetric.class));
    }

    public void verifyIntegerValuedMetric() throws Exception {
        IntegerValuedMetric testSubject0 = new IntegerValuedMetric(_OWLOntologyManager) {
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
        org.semanticweb.owlapi.model.OWLOntologyManager result1 = testSubject0
                .getManager();
        boolean result2 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result3 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result4 = testSubject0
                .getOntologies();
        testSubject0.dispose();
        java.lang.String result5 = testSubject0.getName();
    }

    @Test
    public void enforceInterfacesLogicalAxiomCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.AxiomCountMetric.class
                .isAssignableFrom(LogicalAxiomCount.class));
    }

    public void verifyLogicalAxiomCount() throws Exception {
        LogicalAxiomCount testSubject0 = new LogicalAxiomCount(_OWLOntologyManager);
        java.util.Set<? extends org.semanticweb.owlapi.model.OWLAxiom> result0 = testSubject0
                .getAxioms();
        java.lang.String result1 = testSubject0.getName();
        java.lang.Object result2 = testSubject0.recomputeMetric();
        java.lang.Integer result3 = testSubject0.recomputeMetric();
        Integer result4 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result5 = testSubject0
                .getManager();
        boolean result6 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result7 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result8 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesMaximumNumberOfNamedSuperclasses() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(MaximumNumberOfNamedSuperclasses.class));
    }

    public void verifyMaximumNumberOfNamedSuperclasses() throws Exception {
        MaximumNumberOfNamedSuperclasses testSubject0 = new MaximumNumberOfNamedSuperclasses(
                _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesNumberOfClassesWithMultipleInheritance()
            throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(NumberOfClassesWithMultipleInheritance.class));
    }

    public void verifyNumberOfClassesWithMultipleInheritance() throws Exception {
        NumberOfClassesWithMultipleInheritance testSubject0 = new NumberOfClassesWithMultipleInheritance(
                _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesObjectCountMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(ObjectCountMetric.class));
    }

    public void verifyObjectCountMetric() throws Exception {
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
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    public void verifyInterfaceOWLMetric() throws Exception {
        OWLMetric<Object> testSubject0 = mock(OWLMetric.class);
        java.lang.String result0 = testSubject0.getName();
        Object result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        testSubject0.dispose();
    }

    public void verifyOWLMetricManager() throws Exception {
        OWLMetricManager testSubject0 = new OWLMetricManager(_List5);
        java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> result0 = testSubject0
                .getMetrics();
        testSubject0.setOntology(_OWLOntology);
    }

    @Test
    public void enforceInterfacesReferencedClassCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedClassCount.class));
    }

    public void verifyReferencedClassCount() throws Exception {
        ReferencedClassCount testSubject0 = new ReferencedClassCount(_OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedDataPropertyCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedDataPropertyCount.class));
    }

    public void verifyReferencedDataPropertyCount() throws Exception {
        ReferencedDataPropertyCount testSubject0 = new ReferencedDataPropertyCount(
                _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedIndividualCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedIndividualCount.class));
    }

    public void verifyReferencedIndividualCount() throws Exception {
        ReferencedIndividualCount testSubject0 = new ReferencedIndividualCount(
                _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesReferencedObjectPropertyCount() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.ObjectCountMetric.class
                .isAssignableFrom(ReferencedObjectPropertyCount.class));
    }

    public void verifyReferencedObjectPropertyCount() throws Exception {
        ReferencedObjectPropertyCount testSubject0 = new ReferencedObjectPropertyCount(
                _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        java.lang.Object result1 = testSubject0.recomputeMetric();
        java.lang.Integer result2 = testSubject0.recomputeMetric();
        Integer result3 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result4 = testSubject0
                .getManager();
        boolean result5 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result6 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result7 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    @Test
    public void enforceInterfacesUnsatisfiableClassCountMetric() throws Exception {
        assertTrue(org.semanticweb.owlapi.metrics.IntegerValuedMetric.class
                .isAssignableFrom(UnsatisfiableClassCountMetric.class));
    }

    public void verifyUnsatisfiableClassCountMetric() throws Exception {
        UnsatisfiableClassCountMetric testSubject0 = new UnsatisfiableClassCountMetric(
                _OWLReasoner, _OWLOntologyManager);
        java.lang.String result0 = testSubject0.getName();
        Integer result1 = testSubject0.getValue();
        org.semanticweb.owlapi.model.OWLOntologyManager result2 = testSubject0
                .getManager();
        boolean result3 = testSubject0.isImportsClosureUsed();
        testSubject0.setImportsClosureUsed(_boolean);
        testSubject0.ontologiesChanged(_List);
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology();
        testSubject0.setOntology(_OWLOntology);
        java.util.Set<org.semanticweb.owlapi.model.OWLOntology> result5 = testSubject0
                .getOntologies();
        testSubject0.dispose();
    }

    private boolean _boolean;
    private java.util.List<? extends org.semanticweb.owlapi.model.OWLOntologyChange> _List;
    private java.util.List<org.semanticweb.owlapi.metrics.OWLMetric<?>> _List5;
    private org.semanticweb.owlapi.model.AxiomType<?> _AxiomType;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
}
