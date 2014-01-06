package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.rdfxml.parser.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.UnloadableImportException;

@SuppressWarnings({ "javadoc", "unused", "serial", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_rdfxml_parser {
    @Test
    public void enforceInterfacesAbstractClassExpressionTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ClassExpressionTranslator.class
                .isAssignableFrom(AbstractClassExpressionTranslator.class));
    }

    public void verifyAbstractClassExpressionTranslator() throws Exception {
        AbstractClassExpressionTranslator testSubject0 = new AbstractClassExpressionTranslator(
                _OWLRDFConsumer) {
            @Override
            public boolean matchesStrict(IRI mainNode) {
                return false;
            }

            @Override
            public boolean matchesLax(IRI mainNode) {
                return false;
            }

            @Override
            public OWLClassExpression translate(IRI mainNode) {
                return null;
            }
        };
        boolean result0 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result1 = testSubject0
                .getConsumer();
        org.semanticweb.owlapi.model.OWLClassExpression result2 = testSubject0
                .translate(_IRI);
        boolean result3 = testSubject0.matchesLax(_IRI);
        boolean result4 = testSubject0.matchesStrict(_IRI);
    }

    @Test
    public void enforceInterfacesAbstractLiteralTripleHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractTripleHandler.class
                .isAssignableFrom(AbstractLiteralTripleHandler.class));
    }

    public void verifyAbstractLiteralTripleHandler() throws Exception {
        AbstractLiteralTripleHandler testSubject0 = new AbstractLiteralTripleHandler(
                _OWLRDFConsumer) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, OWLLiteral object) {}

            @Override
            public boolean canHandle(IRI subject, IRI predicate, OWLLiteral object) {
                return false;
            }

            @Override
            public boolean canHandleStreaming(IRI subject, IRI predicate,
                    OWLLiteral object) {
                return false;
            }
        };
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesAbstractNamedEquivalentClassAxiomHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(AbstractNamedEquivalentClassAxiomHandler.class));
    }

    public void verifyAbstractNamedEquivalentClassAxiomHandler() throws Exception {
        AbstractNamedEquivalentClassAxiomHandler testSubject0 = new AbstractNamedEquivalentClassAxiomHandler(
                _OWLRDFConsumer, _IRI) {
            @Override
            protected OWLClassExpression translateEquivalentClass(IRI mainNode) {
                return null;
            }
        };
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesAbstractResourceTripleHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractTripleHandler.class
                .isAssignableFrom(AbstractResourceTripleHandler.class));
    }

    public void verifyAbstractResourceTripleHandler() throws Exception {
        AbstractResourceTripleHandler testSubject0 = new AbstractResourceTripleHandler(
                _OWLRDFConsumer) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, IRI object)
                    throws UnloadableImportException {}

            @Override
            public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object)
                    throws UnloadableImportException {
                return false;
            }

            @Override
            public boolean canHandle(IRI subject, IRI predicate, IRI object) {
                return false;
            }
        };
        testSubject0.inferTypes(_IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    

    public void verifyAbstractTripleHandler() throws Exception {
        AbstractTripleHandler testSubject0 = new AbstractTripleHandler(_OWLRDFConsumer);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result0 = testSubject0
                .getConsumer();
    }

    

    public void verifyInterfaceAnonymousNodeChecker() throws Exception {
        AnonymousNodeChecker testSubject0 = mock(AnonymousNodeChecker.class);
        boolean result0 = testSubject0.isAnonymousNode(_IRI);
        boolean result1 = testSubject0.isAnonymousNode(_String);
        boolean result2 = testSubject0.isAnonymousSharedNode(_String);
    }

    @Test
    public void enforceInterfacesBuiltInTypeHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(BuiltInTypeHandler.class));
    }

    public void verifyBuiltInTypeHandler() throws Exception {
        BuiltInTypeHandler testSubject0 = new BuiltInTypeHandler(_OWLRDFConsumer, _IRI) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, IRI object)
                    throws UnloadableImportException {}
        };
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesClassExpressionListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(ClassExpressionListItemTranslator.class));
    }

    public void verifyClassExpressionListItemTranslator() throws Exception {
        ClassExpressionListItemTranslator testSubject0 = new ClassExpressionListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLClassExpression result2 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLClassExpression result3 = testSubject0
                .translate(_IRI);
    }

    

    public void verifyInterfaceClassExpressionTranslator() throws Exception {
        ClassExpressionTranslator testSubject0 = mock(ClassExpressionTranslator.class);
        boolean result0 = testSubject0.matches(_IRI, _Mode);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
    }

    @Test
    public void enforceInterfacesDataAllValuesFromTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataAllValuesFromTranslator.class));
    }

    public void verifyDataAllValuesFromTranslator() throws Exception {
        DataAllValuesFromTranslator testSubject0 = new DataAllValuesFromTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataAllValuesFrom result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataCardinalityTranslator.class));
    }

    public void verifyDataCardinalityTranslator() throws Exception {
        DataCardinalityTranslator testSubject0 = new DataCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataHasValueTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataHasValueTranslator.class));
    }

    public void verifyDataHasValueTranslator() throws Exception {
        DataHasValueTranslator testSubject0 = new DataHasValueTranslator(_OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataHasValue result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataMaxCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataMaxCardinalityTranslator.class));
    }

    public void verifyDataMaxCardinalityTranslator() throws Exception {
        DataMaxCardinalityTranslator testSubject0 = new DataMaxCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataMaxQualifiedCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataMaxQualifiedCardinalityTranslator.class));
    }

    public void verifyDataMaxQualifiedCardinalityTranslator() throws Exception {
        DataMaxQualifiedCardinalityTranslator testSubject0 = new DataMaxQualifiedCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataMaxCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataMinCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataMinCardinalityTranslator.class));
    }

    public void verifyDataMinCardinalityTranslator() throws Exception {
        DataMinCardinalityTranslator testSubject0 = new DataMinCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataMinQualifiedCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataMinQualifiedCardinalityTranslator.class));
    }

    public void verifyDataMinQualifiedCardinalityTranslator() throws Exception {
        DataMinQualifiedCardinalityTranslator testSubject0 = new DataMinQualifiedCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataMinCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataPropertyListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(DataPropertyListItemTranslator.class));
    }

    public void verifyDataPropertyListItemTranslator() throws Exception {
        DataPropertyListItemTranslator testSubject0 = new DataPropertyListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result2 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result3 = testSubject0
                .translate(_IRI);
    }

    @Test
    public void enforceInterfacesDataQualifiedCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataQualifiedCardinalityTranslator.class));
    }

    public void verifyDataQualifiedCardinalityTranslator() throws Exception {
        DataQualifiedCardinalityTranslator testSubject0 = new DataQualifiedCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataExactCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesDataRangeListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(DataRangeListItemTranslator.class));
    }

    public void verifyDataRangeListItemTranslator() throws Exception {
        DataRangeListItemTranslator testSubject0 = new DataRangeListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLDataRange result2 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLDataRange result3 = testSubject0
                .translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesDataSomeValuesFromTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(DataSomeValuesFromTranslator.class));
    }

    public void verifyDataSomeValuesFromTranslator() throws Exception {
        DataSomeValuesFromTranslator testSubject0 = new DataSomeValuesFromTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLDataSomeValuesFrom result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesGTPAnnotationLiteralHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class
                .isAssignableFrom(GTPAnnotationLiteralHandler.class));
    }

    public void verifyGTPAnnotationLiteralHandler() throws Exception {
        GTPAnnotationLiteralHandler testSubject0 = new GTPAnnotationLiteralHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesGTPAnnotationResourceTripleHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class
                .isAssignableFrom(GTPAnnotationResourceTripleHandler.class));
    }

    public void verifyGTPAnnotationResourceTripleHandler() throws Exception {
        GTPAnnotationResourceTripleHandler testSubject0 = new GTPAnnotationResourceTripleHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesGTPDataPropertyAssertionHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class
                .isAssignableFrom(GTPDataPropertyAssertionHandler.class));
    }

    public void verifyGTPDataPropertyAssertionHandler() throws Exception {
        GTPDataPropertyAssertionHandler testSubject0 = new GTPDataPropertyAssertionHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesGTPLiteralTripleHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class
                .isAssignableFrom(GTPLiteralTripleHandler.class));
    }

    public void verifyGTPLiteralTripleHandler() throws Exception {
        GTPLiteralTripleHandler testSubject0 = new GTPLiteralTripleHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesGTPObjectPropertyAssertionHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class
                .isAssignableFrom(GTPObjectPropertyAssertionHandler.class));
    }

    public void verifyGTPObjectPropertyAssertionHandler() throws Exception {
        GTPObjectPropertyAssertionHandler testSubject0 = new GTPObjectPropertyAssertionHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesGTPResourceTripleHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class
                .isAssignableFrom(GTPResourceTripleHandler.class));
    }

    public void verifyGTPResourceTripleHandler() throws Exception {
        GTPResourceTripleHandler testSubject0 = new GTPResourceTripleHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesHasKeyListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(HasKeyListItemTranslator.class));
    }

    public void verifyHasKeyListItemTranslator() throws Exception {
        HasKeyListItemTranslator testSubject0 = new HasKeyListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?> result2 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLPropertyExpression<?, ?> result3 = testSubject0
                .translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesIndividualListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(IndividualListItemTranslator.class));
    }

    public void verifyIndividualListItemTranslator() throws Exception {
        IndividualListItemTranslator testSubject0 = new IndividualListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLIndividual result3 = testSubject0.translate(_IRI);
    }

    

    public void verifyInterfaceIRIProvider() throws Exception {
        IRIProvider testSubject0 = mock(IRIProvider.class);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getIRI(_String);
    }

    

    public void verifyInterfaceListItemTranslator() throws Exception {
        ListItemTranslator testSubject0 = mock(ListItemTranslator.class);
        OWLObject result0 = testSubject0.translate(_IRI);
        OWLObject result1 = testSubject0.translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesMode() throws Exception {
        assertTrue(java.lang.Enum.class.isAssignableFrom(Mode.class));
    }

    public void verifyEnumMode() throws Exception {
        Mode testSubject0 = Mode.STRICT;
        Mode testSubject1 = Mode.LAX;
    }

    @Test
    public void enforceInterfacesNamedClassTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(NamedClassTranslator.class));
    }

    public void verifyNamedClassTranslator() throws Exception {
        NamedClassTranslator testSubject0 = new NamedClassTranslator(_OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLClass result0 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectAllValuesFromTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectAllValuesFromTranslator.class));
    }

    public void verifyObjectAllValuesFromTranslator() throws Exception {
        ObjectAllValuesFromTranslator testSubject0 = new ObjectAllValuesFromTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectAllValuesFrom result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectCardinalityTranslator.class));
    }

    public void verifyObjectCardinalityTranslator() throws Exception {
        ObjectCardinalityTranslator testSubject0 = new ObjectCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectComplementOfTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectComplementOfTranslator.class));
    }

    public void verifyObjectComplementOfTranslator() throws Exception {
        ObjectComplementOfTranslator testSubject0 = new ObjectComplementOfTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectComplementOf result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectHasSelfTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectHasSelfTranslator.class));
    }

    public void verifyObjectHasSelfTranslator() throws Exception {
        ObjectHasSelfTranslator testSubject0 = new ObjectHasSelfTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectHasSelf result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectHasValueTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectHasValueTranslator.class));
    }

    public void verifyObjectHasValueTranslator() throws Exception {
        ObjectHasValueTranslator testSubject0 = new ObjectHasValueTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectHasValue result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectIntersectionOfTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectIntersectionOfTranslator.class));
    }

    public void verifyObjectIntersectionOfTranslator() throws Exception {
        ObjectIntersectionOfTranslator testSubject0 = new ObjectIntersectionOfTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectIntersectionOf result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMaxCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectMaxCardinalityTranslator.class));
    }

    public void verifyObjectMaxCardinalityTranslator() throws Exception {
        ObjectMaxCardinalityTranslator testSubject0 = new ObjectMaxCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMaxQualifiedCardinalityTranslator()
            throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectMaxQualifiedCardinalityTranslator.class));
    }

    public void verifyObjectMaxQualifiedCardinalityTranslator() throws Exception {
        ObjectMaxQualifiedCardinalityTranslator testSubject0 = new ObjectMaxQualifiedCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectMaxCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMinCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectMinCardinalityTranslator.class));
    }

    public void verifyObjectMinCardinalityTranslator() throws Exception {
        ObjectMinCardinalityTranslator testSubject0 = new ObjectMinCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMinQualifiedCardinalityTranslator()
            throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectMinQualifiedCardinalityTranslator.class));
    }

    public void verifyObjectMinQualifiedCardinalityTranslator() throws Exception {
        ObjectMinQualifiedCardinalityTranslator testSubject0 = new ObjectMinQualifiedCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectMinCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectOneOfTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectOneOfTranslator.class));
    }

    public void verifyObjectOneOfTranslator() throws Exception {
        ObjectOneOfTranslator testSubject0 = new ObjectOneOfTranslator(_OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectOneOf result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectPropertyListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(ObjectPropertyListItemTranslator.class));
    }

    public void verifyObjectPropertyListItemTranslator() throws Exception {
        ObjectPropertyListItemTranslator testSubject0 = new ObjectPropertyListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result2 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result3 = testSubject0
                .translate(_IRI);
    }

    @Test
    public void enforceInterfacesObjectQualifiedCardinalityTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectQualifiedCardinalityTranslator.class));
    }

    public void verifyObjectQualifiedCardinalityTranslator() throws Exception {
        ObjectQualifiedCardinalityTranslator testSubject0 = new ObjectQualifiedCardinalityTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectExactCardinality result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectSomeValuesFromTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectSomeValuesFromTranslator.class));
    }

    public void verifyObjectSomeValuesFromTranslator() throws Exception {
        ObjectSomeValuesFromTranslator testSubject0 = new ObjectSomeValuesFromTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesObjectUnionOfTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class
                .isAssignableFrom(ObjectUnionOfTranslator.class));
    }

    public void verifyObjectUnionOfTranslator() throws Exception {
        ObjectUnionOfTranslator testSubject0 = new ObjectUnionOfTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObjectUnionOf result0 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result1 = testSubject0
                .translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0
                .getConsumer();
    }

    

    public void verifyOptimisedListTranslator() throws Exception {
        OptimisedListTranslator testSubject0 = new OptimisedListTranslator(
                _OWLRDFConsumer, mock(ListItemTranslator.class)) {};
        java.util.List<OWLObject> result0 = testSubject0.translateList(_IRI);
        java.util.Set<OWLObject> result1 = testSubject0.translateToSet(_IRI);
    }

    @Test
    public void enforceInterfacesOWLFacetRestrictionListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(OWLFacetRestrictionListItemTranslator.class));
    }

    public void verifyOWLFacetRestrictionListItemTranslator() throws Exception {
        OWLFacetRestrictionListItemTranslator testSubject0 = new OWLFacetRestrictionListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLFacetRestriction result2 = testSubject0
                .translate(_IRI);
        org.semanticweb.owlapi.model.OWLFacetRestriction result3 = testSubject0
                .translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpressionListItemTranslator()
            throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(OWLObjectPropertyExpressionListItemTranslator.class));
    }

    public void verifyOWLObjectPropertyExpressionListItemTranslator() throws Exception {
        OWLObjectPropertyExpressionListItemTranslator testSubject0 = new OWLObjectPropertyExpressionListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result2 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result3 = testSubject0
                .translate(_IRI);
    }

    @Test
    public void enforceInterfacesOWLRDFConsumer() throws Exception {
        assertTrue(org.semanticweb.owlapi.rdf.syntax.RDFConsumer.class
                .isAssignableFrom(OWLRDFConsumer.class));
    }

    public void verifyOWLRDFConsumer() throws Exception {
        OWLRDFConsumer testSubject0 = new OWLRDFConsumer(_OWLOntologyManager,
                _OWLOntology, _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        OWLRDFConsumer testSubject1 = new OWLRDFConsumer(_OWLOntology,
                _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        testSubject0.handle(_IRI, _IRI, _OWLLiteral);
        testSubject0.handle(_IRI, _IRI, _IRI);
        testSubject0.addFirst(_IRI, _IRI);
        testSubject0.addFirst(_IRI, _OWLLiteral);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result0 = testSubject0
                .getConfiguration();
        testSubject0.addTriple(_IRI, _IRI, _IRI);
        testSubject0.addTriple(_IRI, _IRI, _OWLLiteral);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .translateAnnotations(_IRI);
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0.getOntology();
        org.semanticweb.owlapi.model.OWLDataFactory result3 = testSubject0
                .getDataFactory();
        testSubject0.addOntology(_IRI);
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getResourceObject(_IRI,
                _OWLRDFVocabulary, _boolean);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getResourceObject(_IRI,
                _IRI, _boolean);
        org.semanticweb.owlapi.model.OWLLiteral result6 = testSubject0.getLiteralObject(
                _IRI, _OWLRDFVocabulary, _boolean);
        org.semanticweb.owlapi.model.OWLLiteral result7 = testSubject0.getLiteralObject(
                _IRI, _IRI, _boolean);
        boolean result8 = testSubject0.isRestriction(_IRI);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        boolean result10 = testSubject0.isDataRange(_IRI);
        boolean result11 = testSubject0.isParsedAllTriples();
        testSubject0.importsClosureChanged();
        testSubject0.setIRIProvider(_IRIProvider);
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result12 = testSubject0
                .getPendingAnnotations();
        testSubject0.setPendingAnnotations(_Set);
        org.semanticweb.owlapi.model.OWLAxiom result13 = testSubject0.getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result14 = testSubject0
                .getAnnotatedSourceAnnotationMainNodes(_IRI);
        boolean result15 = testSubject0
                .isTriplePresent(_IRI, _IRI, _OWLLiteral, _boolean);
        boolean result16 = testSubject0.isTriplePresent(_IRI, _IRI, _IRI, _boolean);
        org.semanticweb.owlapi.model.OWLIndividual result17 = testSubject0
                .translateIndividual(_IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0
                .translateClassExpression(_IRI);
        testSubject0.startModel(_String);
        testSubject0.endModel();
        testSubject0.addModelAttribte(_String, _String);
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_String);
        org.semanticweb.owlapi.model.IRI result19 = testSubject0.getSynonym(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String,
                _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        org.semanticweb.owlapi.model.OWLDataRange result20 = testSubject0
                .translateDataRange(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLDataRange> result21 = testSubject0
                .translateToDataRangeSet(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result22 = testSubject0
                .translateToConstantSet(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLFacetRestriction> result23 = testSubject0
                .translateToFacetRestrictionSet(_IRI);
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result24 = testSubject0
                .translateDataPropertyExpression(_IRI);
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result25 = testSubject0
                .translateObjectPropertyExpression(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result26 = testSubject0
                .getPredicatesBySubject(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.IRI> result27 = testSubject0
                .getResourceObjects(_IRI, _IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLLiteral> result28 = testSubject0
                .getLiteralObjects(_IRI, _IRI);
        org.semanticweb.owlapi.model.OWLClassExpression result29 = testSubject0
                .getClassExpressionIfTranslated(_IRI);
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result30 = testSubject0
                .translateToObjectPropertyList(_IRI);
        java.util.List<org.semanticweb.owlapi.model.OWLDataPropertyExpression> result31 = testSubject0
                .translateToDataPropertyList(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result32 = testSubject0
                .translateToClassExpressionSet(_IRI);
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result33 = testSubject0
                .translateToIndividualSet(_IRI);
        boolean result34 = testSubject0.hasPredicate(_IRI, _IRI);
        testSubject0.addRest(_IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result35 = testSubject0.getFirstResource(_IRI,
                _boolean);
        org.semanticweb.owlapi.model.OWLLiteral result36 = testSubject0
                .getFirstLiteral(_IRI);
        org.semanticweb.owlapi.model.IRI result37 = testSubject0.getRest(_IRI, _boolean);
        boolean result38 = testSubject0.isAxiom(_IRI);
        org.semanticweb.owlapi.model.OWLOntologyManager result39 = testSubject0
                .getOWLOntologyManager();
        java.util.Set<org.semanticweb.owlapi.model.IRI> result40 = testSubject0
                .getOntologies();
        testSubject0.addAxiom(_IRI);
        org.semanticweb.owlapi.io.RDFOntologyFormat result41 = testSubject0
                .getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLRDFParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLRDFParserException.class));
    }

    public void verifyOWLRDFParserException() throws Exception {
        OWLRDFParserException testSubject0 = new OWLRDFParserException(_Throwable);
        OWLRDFParserException testSubject1 = new OWLRDFParserException(_String,
                _Throwable);
        OWLRDFParserException testSubject2 = new OWLRDFParserException(_String);
        OWLRDFParserException testSubject3 = new OWLRDFParserException();
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLRDFXMLParserException.class));
    }

    public void verifyOWLRDFXMLParserException() throws Exception {
        OWLRDFXMLParserException testSubject0 = new OWLRDFXMLParserException(_String);
        OWLRDFXMLParserException testSubject1 = new OWLRDFXMLParserException(_String,
                _Throwable);
        OWLRDFXMLParserException testSubject2 = new OWLRDFXMLParserException(_Throwable);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserMalformedNodeException() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.OWLRDFXMLParserException.class
                .isAssignableFrom(OWLRDFXMLParserMalformedNodeException.class));
    }

    public void verifyOWLRDFXMLParserMalformedNodeException() throws Exception {
        OWLRDFXMLParserMalformedNodeException testSubject0 = new OWLRDFXMLParserMalformedNodeException(
                _Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject1 = new OWLRDFXMLParserMalformedNodeException(
                _String, _Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject2 = new OWLRDFXMLParserMalformedNodeException(
                _String);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserSAXException() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.OWLRDFXMLParserException.class
                .isAssignableFrom(OWLRDFXMLParserSAXException.class));
    }

    public void verifyOWLRDFXMLParserSAXException() throws Exception {
        OWLRDFXMLParserSAXException testSubject0 = new OWLRDFXMLParserSAXException(
                _SAXException);
        java.lang.String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result3 = testSubject0.fillInStackTrace();
        java.lang.Throwable result4 = testSubject0.getCause();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesRDFXMLParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(RDFXMLParser.class));
    }

    public void verifyRDFXMLParser() throws Exception {
        RDFXMLParser testSubject0 = new RDFXMLParser();
        org.semanticweb.owlapi.model.OWLOntologyFormat result0 = testSubject0.parse(
                _OWLOntologyDocumentSource, _OWLOntology);
        org.semanticweb.owlapi.model.OWLOntologyFormat result1 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        org.semanticweb.owlapi.model.OWLOntologyFormat result2 = testSubject0.parse(_IRI,
                _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        org.semanticweb.owlapi.model.OWLOntologyManager result3 = testSubject0
                .getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesRDFXMLParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(RDFXMLParserFactory.class));
    }

    public void verifyRDFXMLParserFactory() throws Exception {
        RDFXMLParserFactory testSubject0 = new RDFXMLParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesSKOSClassTripleHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(SKOSClassTripleHandler.class));
    }

    public void verifySKOSClassTripleHandler() throws Exception {
        SKOSClassTripleHandler testSubject0 = new SKOSClassTripleHandler(_OWLRDFConsumer,
                _SKOSVocabulary);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesSWRLAtomListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(SWRLAtomListItemTranslator.class));
    }

    public void verifySWRLAtomListItemTranslator() throws Exception {
        SWRLAtomListItemTranslator testSubject0 = new SWRLAtomListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.SWRLAtom result2 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.SWRLAtom result3 = testSubject0
                .translate(_OWLLiteral);
    }

    

    public void verifySWRLRuleTranslator() throws Exception {
        SWRLRuleTranslator testSubject0 = new SWRLRuleTranslator(_OWLRDFConsumer);
        testSubject0.translateRule(_IRI);
    }

    @Test
    public void enforceInterfacesTPAllValuesFromHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPAllValuesFromHandler.class));
    }

    public void verifyTPAllValuesFromHandler() throws Exception {
        TPAllValuesFromHandler testSubject0 = new TPAllValuesFromHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPAnnotatedPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPAnnotatedPropertyHandler.class));
    }

    public void verifyTPAnnotatedPropertyHandler() throws Exception {
        TPAnnotatedPropertyHandler testSubject0 = new TPAnnotatedPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPAnnotatedSourceHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPAnnotatedSourceHandler.class));
    }

    public void verifyTPAnnotatedSourceHandler() throws Exception {
        TPAnnotatedSourceHandler testSubject0 = new TPAnnotatedSourceHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPAnnotatedTargetHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPAnnotatedTargetHandler.class));
    }

    public void verifyTPAnnotatedTargetHandler() throws Exception {
        TPAnnotatedTargetHandler testSubject0 = new TPAnnotatedTargetHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPComplementOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class
                .isAssignableFrom(TPComplementOfHandler.class));
    }

    public void verifyTPComplementOfHandler() throws Exception {
        TPComplementOfHandler testSubject0 = new TPComplementOfHandler(_OWLRDFConsumer);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPDatatypeComplementOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPDatatypeComplementOfHandler.class));
    }

    public void verifyTPDatatypeComplementOfHandler() throws Exception {
        TPDatatypeComplementOfHandler testSubject0 = new TPDatatypeComplementOfHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPDeclaredAsHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPDeclaredAsHandler.class));
    }

    public void verifyTPDeclaredAsHandler() throws Exception {
        TPDeclaredAsHandler testSubject0 = new TPDeclaredAsHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPDifferentFromHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPDifferentFromHandler.class));
    }

    public void verifyTPDifferentFromHandler() throws Exception {
        TPDifferentFromHandler testSubject0 = new TPDifferentFromHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPDisjointUnionHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPDisjointUnionHandler.class));
    }

    public void verifyTPDisjointUnionHandler() throws Exception {
        TPDisjointUnionHandler testSubject0 = new TPDisjointUnionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPDisjointWithHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPDisjointWithHandler.class));
    }

    public void verifyTPDisjointWithHandler() throws Exception {
        TPDisjointWithHandler testSubject0 = new TPDisjointWithHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPDistinctMembersHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPDistinctMembersHandler.class));
    }

    public void verifyTPDistinctMembersHandler() throws Exception {
        TPDistinctMembersHandler testSubject0 = new TPDistinctMembersHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPEquivalentClassHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPEquivalentClassHandler.class));
    }

    public void verifyTPEquivalentClassHandler() throws Exception {
        TPEquivalentClassHandler testSubject0 = new TPEquivalentClassHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPEquivalentPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPEquivalentPropertyHandler.class));
    }

    public void verifyTPEquivalentPropertyHandler() throws Exception {
        TPEquivalentPropertyHandler testSubject0 = new TPEquivalentPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPFirstLiteralHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class
                .isAssignableFrom(TPFirstLiteralHandler.class));
    }

    public void verifyTPFirstLiteralHandler() throws Exception {
        TPFirstLiteralHandler testSubject0 = new TPFirstLiteralHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPFirstResourceHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPFirstResourceHandler.class));
    }

    public void verifyTPFirstResourceHandler() throws Exception {
        TPFirstResourceHandler testSubject0 = new TPFirstResourceHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPHasKeyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPHasKeyHandler.class));
    }

    public void verifyTPHasKeyHandler() throws Exception {
        TPHasKeyHandler testSubject0 = new TPHasKeyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPHasValueHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPHasValueHandler.class));
    }

    public void verifyTPHasValueHandler() throws Exception {
        TPHasValueHandler testSubject0 = new TPHasValueHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPImportsHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPImportsHandler.class));
    }

    public void verifyTPImportsHandler() throws Exception {
        TPImportsHandler testSubject0 = new TPImportsHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPIntersectionOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class
                .isAssignableFrom(TPIntersectionOfHandler.class));
    }

    public void verifyTPIntersectionOfHandler() throws Exception {
        TPIntersectionOfHandler testSubject0 = new TPIntersectionOfHandler(
                _OWLRDFConsumer);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPInverseOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPInverseOfHandler.class));
    }

    public void verifyTPInverseOfHandler() throws Exception {
        TPInverseOfHandler testSubject0 = new TPInverseOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.setAxiomParsingMode(_boolean);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.isAxiomParsingMode();
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPOnClassHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPOnClassHandler.class));
    }

    public void verifyTPOnClassHandler() throws Exception {
        TPOnClassHandler testSubject0 = new TPOnClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPOnDataRangeHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPOnDataRangeHandler.class));
    }

    public void verifyTPOnDataRangeHandler() throws Exception {
        TPOnDataRangeHandler testSubject0 = new TPOnDataRangeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPOneOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class
                .isAssignableFrom(TPOneOfHandler.class));
    }

    public void verifyTPOneOfHandler() throws Exception {
        TPOneOfHandler testSubject0 = new TPOneOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPOnPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPOnPropertyHandler.class));
    }

    public void verifyTPOnPropertyHandler() throws Exception {
        TPOnPropertyHandler testSubject0 = new TPOnPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyChainAxiomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPPropertyChainAxiomHandler.class));
    }

    public void verifyTPPropertyChainAxiomHandler() throws Exception {
        TPPropertyChainAxiomHandler testSubject0 = new TPPropertyChainAxiomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyDisjointWithHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPPropertyDisjointWithHandler.class));
    }

    public void verifyTPPropertyDisjointWithHandler() throws Exception {
        TPPropertyDisjointWithHandler testSubject0 = new TPPropertyDisjointWithHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyDomainHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPPropertyDomainHandler.class));
    }

    public void verifyTPPropertyDomainHandler() throws Exception {
        TPPropertyDomainHandler testSubject0 = new TPPropertyDomainHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyRangeHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPPropertyRangeHandler.class));
    }

    public void verifyTPPropertyRangeHandler() throws Exception {
        TPPropertyRangeHandler testSubject0 = new TPPropertyRangeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPRestHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPRestHandler.class));
    }

    public void verifyTPRestHandler() throws Exception {
        TPRestHandler testSubject0 = new TPRestHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPSameAsHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPSameAsHandler.class));
    }

    public void verifyTPSameAsHandler() throws Exception {
        TPSameAsHandler testSubject0 = new TPSameAsHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPSomeValuesFromHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPSomeValuesFromHandler.class));
    }

    public void verifyTPSomeValuesFromHandler() throws Exception {
        TPSomeValuesFromHandler testSubject0 = new TPSomeValuesFromHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPSubClassOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPSubClassOfHandler.class));
    }

    public void verifyTPSubClassOfHandler() throws Exception {
        TPSubClassOfHandler testSubject0 = new TPSubClassOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPSubPropertyOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPSubPropertyOfHandler.class));
    }

    public void verifyTPSubPropertyOfHandler() throws Exception {
        TPSubPropertyOfHandler testSubject0 = new TPSubPropertyOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPTypeHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPTypeHandler.class));
    }

    public void verifyTPTypeHandler() throws Exception {
        TPTypeHandler testSubject0 = new TPTypeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPUnionOfHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class
                .isAssignableFrom(TPUnionOfHandler.class));
    }

    public void verifyTPUnionOfHandler() throws Exception {
        TPUnionOfHandler testSubject0 = new TPUnionOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTPVersionIRIHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class
                .isAssignableFrom(TPVersionIRIHandler.class));
    }

    public void verifyTPVersionIRIHandler() throws Exception {
        TPVersionIRIHandler testSubject0 = new TPVersionIRIHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTranslatedOntologyChangeException() throws Exception {
        assertTrue(org.xml.sax.SAXException.class
                .isAssignableFrom(TranslatedOntologyChangeException.class));
    }

    public void verifyTranslatedOntologyChangeException() throws Exception {
        TranslatedOntologyChangeException testSubject0 = new TranslatedOntologyChangeException(
                _OWLOntologyChangeException);
        org.semanticweb.owlapi.model.OWLOntologyChangeException result0 = testSubject0
                .getCause();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.String result2 = testSubject0.getMessage();
        java.lang.Exception result3 = testSubject0.getException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result4 = testSubject0.fillInStackTrace();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesTranslatedUnloadedImportException() throws Exception {
        assertTrue(org.xml.sax.SAXException.class
                .isAssignableFrom(TranslatedUnloadedImportException.class));
    }

    public void verifyTranslatedUnloadedImportException() throws Exception {
        TranslatedUnloadedImportException testSubject0 = new TranslatedUnloadedImportException(
                _UnloadableImportException);
        org.semanticweb.owlapi.model.UnloadableImportException result0 = testSubject0
                .getCause();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.String result2 = testSubject0.getMessage();
        java.lang.Exception result3 = testSubject0.getException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result4 = testSubject0.fillInStackTrace();
        java.lang.Throwable result5 = testSubject0.initCause(_Throwable);
        java.lang.String result6 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result8 = testSubject0.getSuppressed();
    }

    

    public void verifyInterfaceTriplePatternMatcher() throws Exception {
        TriplePatternMatcher testSubject0 = mock(TriplePatternMatcher.class);
        boolean result0 = testSubject0.matches(_OWLRDFConsumer, _IRI);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0
                .createObject(_OWLRDFConsumer);
    }

    @Test
    public void enforceInterfacesTriplePredicateHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class
                .isAssignableFrom(TriplePredicateHandler.class));
    }

    public void verifyTriplePredicateHandler() throws Exception {
        TriplePredicateHandler testSubject0 = new TriplePredicateHandler(_OWLRDFConsumer,
                _IRI) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, IRI object)
                    throws UnloadableImportException {}

            @Override
            public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object)
                    throws UnloadableImportException {
                return false;
            }
        };
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getPredicateIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAllDifferentHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAllDifferentHandler.class));
    }

    public void verifyTypeAllDifferentHandler() throws Exception {
        TypeAllDifferentHandler testSubject0 = new TypeAllDifferentHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getTypeIRI();
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAllDisjointClassesHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAllDisjointClassesHandler.class));
    }

    public void verifyTypeAllDisjointClassesHandler() throws Exception {
        TypeAllDisjointClassesHandler testSubject0 = new TypeAllDisjointClassesHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getTypeIRI();
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAllDisjointPropertiesHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAllDisjointPropertiesHandler.class));
    }

    public void verifyTypeAllDisjointPropertiesHandler() throws Exception {
        TypeAllDisjointPropertiesHandler testSubject0 = new TypeAllDisjointPropertiesHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAnnotationHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAnnotationHandler.class));
    }

    public void verifyTypeAnnotationHandler() throws Exception {
        TypeAnnotationHandler testSubject0 = new TypeAnnotationHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAnnotationPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAnnotationPropertyHandler.class));
    }

    public void verifyTypeAnnotationPropertyHandler() throws Exception {
        TypeAnnotationPropertyHandler testSubject0 = new TypeAnnotationPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAsymmetricPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAsymmetricPropertyHandler.class));
    }

    public void verifyTypeAsymmetricPropertyHandler() throws Exception {
        TypeAsymmetricPropertyHandler testSubject0 = new TypeAsymmetricPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAxiomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeAxiomHandler.class));
    }

    public void verifyTypeAxiomHandler() throws Exception {
        TypeAxiomHandler testSubject0 = new TypeAxiomHandler(_OWLRDFConsumer);
        TypeAxiomHandler testSubject1 = new TypeAxiomHandler(_OWLRDFConsumer, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeClassHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeClassHandler.class));
    }

    public void verifyTypeClassHandler() throws Exception {
        TypeClassHandler testSubject0 = new TypeClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDataPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeDataPropertyHandler.class));
    }

    public void verifyTypeDataPropertyHandler() throws Exception {
        TypeDataPropertyHandler testSubject0 = new TypeDataPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDataRangeHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeDataRangeHandler.class));
    }

    public void verifyTypeDataRangeHandler() throws Exception {
        TypeDataRangeHandler testSubject0 = new TypeDataRangeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDatatypeHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeDatatypeHandler.class));
    }

    public void verifyTypeDatatypeHandler() throws Exception {
        TypeDatatypeHandler testSubject0 = new TypeDatatypeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypedConstantListItemTranslator() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class
                .isAssignableFrom(TypedConstantListItemTranslator.class));
    }

    public void verifyTypedConstantListItemTranslator() throws Exception {
        TypedConstantListItemTranslator testSubject0 = new TypedConstantListItemTranslator(
                _OWLRDFConsumer);
        org.semanticweb.owlapi.model.OWLObject result0 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLObject result1 = testSubject0.translate(_IRI);
        org.semanticweb.owlapi.model.OWLLiteral result2 = testSubject0
                .translate(_OWLLiteral);
        org.semanticweb.owlapi.model.OWLLiteral result3 = testSubject0.translate(_IRI);
    }

    @Test
    public void enforceInterfacesTypeDeprecatedClassHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeDeprecatedClassHandler.class));
    }

    public void verifyTypeDeprecatedClassHandler() throws Exception {
        TypeDeprecatedClassHandler testSubject0 = new TypeDeprecatedClassHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDeprecatedPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeDeprecatedPropertyHandler.class));
    }

    public void verifyTypeDeprecatedPropertyHandler() throws Exception {
        TypeDeprecatedPropertyHandler testSubject0 = new TypeDeprecatedPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeFunctionalPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeFunctionalPropertyHandler.class));
    }

    public void verifyTypeFunctionalPropertyHandler() throws Exception {
        TypeFunctionalPropertyHandler testSubject0 = new TypeFunctionalPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeInverseFunctionalPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeInverseFunctionalPropertyHandler.class));
    }

    public void verifyTypeInverseFunctionalPropertyHandler() throws Exception {
        TypeInverseFunctionalPropertyHandler testSubject0 = new TypeInverseFunctionalPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeIrreflexivePropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeIrreflexivePropertyHandler.class));
    }

    public void verifyTypeIrreflexivePropertyHandler() throws Exception {
        TypeIrreflexivePropertyHandler testSubject0 = new TypeIrreflexivePropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeListHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeListHandler.class));
    }

    public void verifyTypeListHandler() throws Exception {
        TypeListHandler testSubject0 = new TypeListHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeNamedIndividualHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeNamedIndividualHandler.class));
    }

    public void verifyTypeNamedIndividualHandler() throws Exception {
        TypeNamedIndividualHandler testSubject0 = new TypeNamedIndividualHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeNegativeDataPropertyAssertionHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeNegativeDataPropertyAssertionHandler.class));
    }

    public void verifyTypeNegativeDataPropertyAssertionHandler() throws Exception {
        TypeNegativeDataPropertyAssertionHandler testSubject0 = new TypeNegativeDataPropertyAssertionHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeNegativePropertyAssertionHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeNegativePropertyAssertionHandler.class));
    }

    public void verifyTypeNegativePropertyAssertionHandler() throws Exception {
        TypeNegativePropertyAssertionHandler testSubject0 = new TypeNegativePropertyAssertionHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeObjectPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeObjectPropertyHandler.class));
    }

    public void verifyTypeObjectPropertyHandler() throws Exception {
        TypeObjectPropertyHandler testSubject0 = new TypeObjectPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeOntologyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeOntologyHandler.class));
    }

    public void verifyTypeOntologyHandler() throws Exception {
        TypeOntologyHandler testSubject0 = new TypeOntologyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeOntologyPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeOntologyPropertyHandler.class));
    }

    public void verifyTypeOntologyPropertyHandler() throws Exception {
        TypeOntologyPropertyHandler testSubject0 = new TypeOntologyPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypePropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypePropertyHandler.class));
    }

    public void verifyTypePropertyHandler() throws Exception {
        TypePropertyHandler testSubject0 = new TypePropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeRDFSClassHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeRDFSClassHandler.class));
    }

    public void verifyTypeRDFSClassHandler() throws Exception {
        TypeRDFSClassHandler testSubject0 = new TypeRDFSClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeReflexivePropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeReflexivePropertyHandler.class));
    }

    public void verifyTypeReflexivePropertyHandler() throws Exception {
        TypeReflexivePropertyHandler testSubject0 = new TypeReflexivePropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeRestrictionHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeRestrictionHandler.class));
    }

    public void verifyTypeRestrictionHandler() throws Exception {
        TypeRestrictionHandler testSubject0 = new TypeRestrictionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSelfRestrictionHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSelfRestrictionHandler.class));
    }

    public void verifyTypeSelfRestrictionHandler() throws Exception {
        TypeSelfRestrictionHandler testSubject0 = new TypeSelfRestrictionHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLAtomListHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLAtomListHandler.class));
    }

    public void verifyTypeSWRLAtomListHandler() throws Exception {
        TypeSWRLAtomListHandler testSubject0 = new TypeSWRLAtomListHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLBuiltInAtomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLBuiltInAtomHandler.class));
    }

    public void verifyTypeSWRLBuiltInAtomHandler() throws Exception {
        TypeSWRLBuiltInAtomHandler testSubject0 = new TypeSWRLBuiltInAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLBuiltInHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLBuiltInHandler.class));
    }

    public void verifyTypeSWRLBuiltInHandler() throws Exception {
        TypeSWRLBuiltInHandler testSubject0 = new TypeSWRLBuiltInHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLClassAtomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLClassAtomHandler.class));
    }

    public void verifyTypeSWRLClassAtomHandler() throws Exception {
        TypeSWRLClassAtomHandler testSubject0 = new TypeSWRLClassAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLDataRangeAtomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLDataRangeAtomHandler.class));
    }

    public void verifyTypeSWRLDataRangeAtomHandler() throws Exception {
        TypeSWRLDataRangeAtomHandler testSubject0 = new TypeSWRLDataRangeAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLDataValuedPropertyAtomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLDataValuedPropertyAtomHandler.class));
    }

    public void verifyTypeSWRLDataValuedPropertyAtomHandler() throws Exception {
        TypeSWRLDataValuedPropertyAtomHandler testSubject0 = new TypeSWRLDataValuedPropertyAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLDifferentIndividualsAtomHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLDifferentIndividualsAtomHandler.class));
    }

    public void verifyTypeSWRLDifferentIndividualsAtomHandler() throws Exception {
        TypeSWRLDifferentIndividualsAtomHandler testSubject0 = new TypeSWRLDifferentIndividualsAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLImpHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLImpHandler.class));
    }

    public void verifyTypeSWRLImpHandler() throws Exception {
        TypeSWRLImpHandler testSubject0 = new TypeSWRLImpHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLIndividualPropertyAtomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLIndividualPropertyAtomHandler.class));
    }

    public void verifyTypeSWRLIndividualPropertyAtomHandler() throws Exception {
        TypeSWRLIndividualPropertyAtomHandler testSubject0 = new TypeSWRLIndividualPropertyAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLSameIndividualAtomHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLSameIndividualAtomHandler.class));
    }

    public void verifyTypeSWRLSameIndividualAtomHandler() throws Exception {
        TypeSWRLSameIndividualAtomHandler testSubject0 = new TypeSWRLSameIndividualAtomHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLVariableHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSWRLVariableHandler.class));
    }

    public void verifyTypeSWRLVariableHandler() throws Exception {
        TypeSWRLVariableHandler testSubject0 = new TypeSWRLVariableHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSymmetricPropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeSymmetricPropertyHandler.class));
    }

    public void verifyTypeSymmetricPropertyHandler() throws Exception {
        TypeSymmetricPropertyHandler testSubject0 = new TypeSymmetricPropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    @Test
    public void enforceInterfacesTypeTransitivePropertyHandler() throws Exception {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class
                .isAssignableFrom(TypeTransitivePropertyHandler.class));
    }

    public void verifyTypeTransitivePropertyHandler() throws Exception {
        TypeTransitivePropertyHandler testSubject0 = new TypeTransitivePropertyHandler(
                _OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0
                .getConsumer();
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> _Set;
    private org.coode.owlapi.rdfxml.parser.AnonymousNodeChecker _AnonymousNodeChecker;
    private org.coode.owlapi.rdfxml.parser.IRIProvider _IRIProvider;
    private org.coode.owlapi.rdfxml.parser.Mode _Mode;
    private org.coode.owlapi.rdfxml.parser.OWLRDFConsumer _OWLRDFConsumer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.RDFOntologyFormat _RDFOntologyFormat;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLLiteral _OWLLiteral;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyChangeException _OWLOntologyChangeException;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.UnloadableImportException _UnloadableImportException;
    private org.semanticweb.owlapi.vocab.OWLRDFVocabulary _OWLRDFVocabulary;
    private org.semanticweb.owlapi.vocab.SKOSVocabulary _SKOSVocabulary;
    private org.xml.sax.SAXException _SAXException;
}
