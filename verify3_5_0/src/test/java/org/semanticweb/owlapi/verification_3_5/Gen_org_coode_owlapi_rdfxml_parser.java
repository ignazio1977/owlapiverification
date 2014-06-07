package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import org.coode.owlapi.rdfxml.parser.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_rdfxml_parser {
    @Test
    public void enforceInterfacesAbstractClassExpressionTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ClassExpressionTranslator.class.isAssignableFrom(AbstractClassExpressionTranslator.class));
    }

    public void verifyAbstractClassExpressionTranslator() {
        AbstractClassExpressionTranslator testSubject0 = new AbstractClassExpressionTranslator(_OWLRDFConsumer) {
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
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result1 = testSubject0.getConsumer();
        OWLClassExpression result2 = testSubject0.translate(_IRI);
        boolean result3 = testSubject0.matchesLax(_IRI);
        boolean result4 = testSubject0.matchesStrict(_IRI);
    }

    @Test
    public void enforceInterfacesAbstractLiteralTripleHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractTripleHandler.class.isAssignableFrom(AbstractLiteralTripleHandler.class));
    }

    public void verifyAbstractLiteralTripleHandler() {
        AbstractLiteralTripleHandler testSubject0 = new AbstractLiteralTripleHandler(_OWLRDFConsumer) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, OWLLiteral object) {
            }

            @Override
            public boolean canHandle(IRI subject, IRI predicate, OWLLiteral object) {
                return false;
            }

            @Override
            public boolean canHandleStreaming(IRI subject, IRI predicate, OWLLiteral object) {
                return false;
            }
        };
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesAbstractNamedEquivalentClassAxiomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(AbstractNamedEquivalentClassAxiomHandler.class));
    }

    public void verifyAbstractNamedEquivalentClassAxiomHandler() throws UnloadableImportException {
        AbstractNamedEquivalentClassAxiomHandler testSubject0 = new AbstractNamedEquivalentClassAxiomHandler(_OWLRDFConsumer, _IRI) {
            @Override
            protected OWLClassExpression translateEquivalentClass(IRI mainNode) {
                return null;
            }
        };
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesAbstractResourceTripleHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractTripleHandler.class.isAssignableFrom(AbstractResourceTripleHandler.class));
    }

    public void verifyAbstractResourceTripleHandler() throws UnloadableImportException {
        AbstractResourceTripleHandler testSubject0 = new AbstractResourceTripleHandler(_OWLRDFConsumer) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, IRI object) throws UnloadableImportException {
            }

            @Override
            public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) throws UnloadableImportException {
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
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    public void verifyAbstractTripleHandler() {
        AbstractTripleHandler testSubject0 = new AbstractTripleHandler(_OWLRDFConsumer);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result0 = testSubject0.getConsumer();
    }

    public void verifyInterfaceAnonymousNodeChecker() {
        AnonymousNodeChecker testSubject0 = mock(AnonymousNodeChecker.class);
        boolean result0 = testSubject0.isAnonymousNode(_IRI);
        boolean result1 = testSubject0.isAnonymousNode(_String);
        boolean result2 = testSubject0.isAnonymousSharedNode(_String);
    }

    @Test
    public void enforceInterfacesBuiltInTypeHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(BuiltInTypeHandler.class));
    }

    public void verifyBuiltInTypeHandler() throws UnloadableImportException {
        BuiltInTypeHandler testSubject0 = new BuiltInTypeHandler(_OWLRDFConsumer, _IRI) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, IRI object) throws UnloadableImportException {
            }
        };
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesClassExpressionListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(ClassExpressionListItemTranslator.class));
    }

    public void verifyClassExpressionListItemTranslator() {
        ClassExpressionListItemTranslator testSubject0 = new ClassExpressionListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_IRI);
        OWLObject result1 = testSubject0.translate(_OWLLiteral);
        OWLClassExpression result2 = testSubject0.translate(_OWLLiteral);
        OWLClassExpression result3 = testSubject0.translate(_IRI);
    }

    public void verifyInterfaceClassExpressionTranslator() {
        ClassExpressionTranslator testSubject0 = mock(ClassExpressionTranslator.class);
        boolean result0 = testSubject0.matches(_IRI, _Mode);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
    }

    @Test
    public void enforceInterfacesDataAllValuesFromTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataAllValuesFromTranslator.class));
    }

    public void verifyDataAllValuesFromTranslator() {
        DataAllValuesFromTranslator testSubject0 = new DataAllValuesFromTranslator(_OWLRDFConsumer);
        OWLDataAllValuesFrom result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataCardinalityTranslator.class));
    }

    public void verifyDataCardinalityTranslator() {
        DataCardinalityTranslator testSubject0 = new DataCardinalityTranslator(_OWLRDFConsumer);
        OWLDataExactCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataHasValueTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataHasValueTranslator.class));
    }

    public void verifyDataHasValueTranslator() {
        DataHasValueTranslator testSubject0 = new DataHasValueTranslator(_OWLRDFConsumer);
        OWLDataHasValue result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataMaxCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataMaxCardinalityTranslator.class));
    }

    public void verifyDataMaxCardinalityTranslator() {
        DataMaxCardinalityTranslator testSubject0 = new DataMaxCardinalityTranslator(_OWLRDFConsumer);
        OWLDataMaxCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataMaxQualifiedCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataMaxQualifiedCardinalityTranslator.class));
    }

    public void verifyDataMaxQualifiedCardinalityTranslator() {
        DataMaxQualifiedCardinalityTranslator testSubject0 = new DataMaxQualifiedCardinalityTranslator(_OWLRDFConsumer);
        OWLDataMaxCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataMinCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataMinCardinalityTranslator.class));
    }

    public void verifyDataMinCardinalityTranslator() {
        DataMinCardinalityTranslator testSubject0 = new DataMinCardinalityTranslator(_OWLRDFConsumer);
        OWLDataMinCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataMinQualifiedCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataMinQualifiedCardinalityTranslator.class));
    }

    public void verifyDataMinQualifiedCardinalityTranslator() {
        DataMinQualifiedCardinalityTranslator testSubject0 = new DataMinQualifiedCardinalityTranslator(_OWLRDFConsumer);
        OWLDataMinCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataPropertyListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(DataPropertyListItemTranslator.class));
    }

    public void verifyDataPropertyListItemTranslator() {
        DataPropertyListItemTranslator testSubject0 = new DataPropertyListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_IRI);
        OWLObject result1 = testSubject0.translate(_OWLLiteral);
        OWLDataPropertyExpression result2 = testSubject0.translate(_OWLLiteral);
        OWLDataPropertyExpression result3 = testSubject0.translate(_IRI);
    }

    @Test
    public void enforceInterfacesDataQualifiedCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataQualifiedCardinalityTranslator.class));
    }

    public void verifyDataQualifiedCardinalityTranslator() {
        DataQualifiedCardinalityTranslator testSubject0 = new DataQualifiedCardinalityTranslator(_OWLRDFConsumer);
        OWLDataExactCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesDataRangeListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(DataRangeListItemTranslator.class));
    }

    public void verifyDataRangeListItemTranslator() {
        DataRangeListItemTranslator testSubject0 = new DataRangeListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLDataRange result2 = testSubject0.translate(_IRI);
        OWLDataRange result3 = testSubject0.translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesDataSomeValuesFromTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(DataSomeValuesFromTranslator.class));
    }

    public void verifyDataSomeValuesFromTranslator() {
        DataSomeValuesFromTranslator testSubject0 = new DataSomeValuesFromTranslator(_OWLRDFConsumer);
        OWLDataSomeValuesFrom result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesGTPAnnotationLiteralHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class.isAssignableFrom(GTPAnnotationLiteralHandler.class));
    }

    public void verifyGTPAnnotationLiteralHandler() {
        GTPAnnotationLiteralHandler testSubject0 = new GTPAnnotationLiteralHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesGTPAnnotationResourceTripleHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class.isAssignableFrom(GTPAnnotationResourceTripleHandler.class));
    }

    public void verifyGTPAnnotationResourceTripleHandler() throws UnloadableImportException {
        GTPAnnotationResourceTripleHandler testSubject0 = new GTPAnnotationResourceTripleHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesGTPDataPropertyAssertionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class.isAssignableFrom(GTPDataPropertyAssertionHandler.class));
    }

    public void verifyGTPDataPropertyAssertionHandler() {
        GTPDataPropertyAssertionHandler testSubject0 = new GTPDataPropertyAssertionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesGTPLiteralTripleHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class.isAssignableFrom(GTPLiteralTripleHandler.class));
    }

    public void verifyGTPLiteralTripleHandler() {
        GTPLiteralTripleHandler testSubject0 = new GTPLiteralTripleHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesGTPObjectPropertyAssertionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class.isAssignableFrom(GTPObjectPropertyAssertionHandler.class));
    }

    public void verifyGTPObjectPropertyAssertionHandler() throws UnloadableImportException {
        GTPObjectPropertyAssertionHandler testSubject0 = new GTPObjectPropertyAssertionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesGTPResourceTripleHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class.isAssignableFrom(GTPResourceTripleHandler.class));
    }

    public void verifyGTPResourceTripleHandler() throws UnloadableImportException {
        GTPResourceTripleHandler testSubject0 = new GTPResourceTripleHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesHasKeyListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(HasKeyListItemTranslator.class));
    }

    public void verifyHasKeyListItemTranslator() {
        HasKeyListItemTranslator testSubject0 = new HasKeyListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLPropertyExpression<?, ?> result2 = testSubject0.translate(_IRI);
        OWLPropertyExpression<?, ?> result3 = testSubject0.translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesIndividualListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(IndividualListItemTranslator.class));
    }

    public void verifyIndividualListItemTranslator() {
        IndividualListItemTranslator testSubject0 = new IndividualListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLIndividual result2 = testSubject0.translate(_OWLLiteral);
        OWLIndividual result3 = testSubject0.translate(_IRI);
    }

    public void verifyInterfaceIRIProvider() {
        IRIProvider testSubject0 = mock(IRIProvider.class);
        IRI result0 = testSubject0.getIRI(_String);
    }

    public void verifyInterfaceListItemTranslator() {
        ListItemTranslator testSubject0 = mock(ListItemTranslator.class);
        OWLObject result0 = testSubject0.translate(_IRI);
        OWLObject result1 = testSubject0.translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesMode() {
        assertTrue(Enum.class.isAssignableFrom(Mode.class));
    }

    public void verifyEnumMode() {
        Mode testSubject0 = Mode.STRICT;
        Mode testSubject1 = Mode.LAX;
    }

    @Test
    public void enforceInterfacesNamedClassTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(NamedClassTranslator.class));
    }

    public void verifyNamedClassTranslator() {
        NamedClassTranslator testSubject0 = new NamedClassTranslator(_OWLRDFConsumer);
        OWLClass result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectAllValuesFromTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectAllValuesFromTranslator.class));
    }

    public void verifyObjectAllValuesFromTranslator() {
        ObjectAllValuesFromTranslator testSubject0 = new ObjectAllValuesFromTranslator(_OWLRDFConsumer);
        OWLObjectAllValuesFrom result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectCardinalityTranslator.class));
    }

    public void verifyObjectCardinalityTranslator() {
        ObjectCardinalityTranslator testSubject0 = new ObjectCardinalityTranslator(_OWLRDFConsumer);
        OWLObjectExactCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectComplementOfTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectComplementOfTranslator.class));
    }

    public void verifyObjectComplementOfTranslator() {
        ObjectComplementOfTranslator testSubject0 = new ObjectComplementOfTranslator(_OWLRDFConsumer);
        OWLObjectComplementOf result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectHasSelfTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectHasSelfTranslator.class));
    }

    public void verifyObjectHasSelfTranslator() {
        ObjectHasSelfTranslator testSubject0 = new ObjectHasSelfTranslator(_OWLRDFConsumer);
        OWLObjectHasSelf result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectHasValueTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectHasValueTranslator.class));
    }

    public void verifyObjectHasValueTranslator() {
        ObjectHasValueTranslator testSubject0 = new ObjectHasValueTranslator(_OWLRDFConsumer);
        OWLObjectHasValue result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectIntersectionOfTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectIntersectionOfTranslator.class));
    }

    public void verifyObjectIntersectionOfTranslator() {
        ObjectIntersectionOfTranslator testSubject0 = new ObjectIntersectionOfTranslator(_OWLRDFConsumer);
        OWLObjectIntersectionOf result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMaxCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectMaxCardinalityTranslator.class));
    }

    public void verifyObjectMaxCardinalityTranslator() {
        ObjectMaxCardinalityTranslator testSubject0 = new ObjectMaxCardinalityTranslator(_OWLRDFConsumer);
        OWLObjectMaxCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMaxQualifiedCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectMaxQualifiedCardinalityTranslator.class));
    }

    public void verifyObjectMaxQualifiedCardinalityTranslator() {
        ObjectMaxQualifiedCardinalityTranslator testSubject0 = new ObjectMaxQualifiedCardinalityTranslator(_OWLRDFConsumer);
        OWLObjectMaxCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMinCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectMinCardinalityTranslator.class));
    }

    public void verifyObjectMinCardinalityTranslator() {
        ObjectMinCardinalityTranslator testSubject0 = new ObjectMinCardinalityTranslator(_OWLRDFConsumer);
        OWLObjectMinCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectMinQualifiedCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectMinQualifiedCardinalityTranslator.class));
    }

    public void verifyObjectMinQualifiedCardinalityTranslator() {
        ObjectMinQualifiedCardinalityTranslator testSubject0 = new ObjectMinQualifiedCardinalityTranslator(_OWLRDFConsumer);
        OWLObjectMinCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectOneOfTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectOneOfTranslator.class));
    }

    public void verifyObjectOneOfTranslator() {
        ObjectOneOfTranslator testSubject0 = new ObjectOneOfTranslator(_OWLRDFConsumer);
        OWLObjectOneOf result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectPropertyListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(ObjectPropertyListItemTranslator.class));
    }

    public void verifyObjectPropertyListItemTranslator() {
        ObjectPropertyListItemTranslator testSubject0 = new ObjectPropertyListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLObjectPropertyExpression result2 = testSubject0.translate(_OWLLiteral);
        OWLObjectPropertyExpression result3 = testSubject0.translate(_IRI);
    }

    @Test
    public void enforceInterfacesObjectQualifiedCardinalityTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectQualifiedCardinalityTranslator.class));
    }

    public void verifyObjectQualifiedCardinalityTranslator() {
        ObjectQualifiedCardinalityTranslator testSubject0 = new ObjectQualifiedCardinalityTranslator(_OWLRDFConsumer);
        OWLObjectExactCardinality result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectSomeValuesFromTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectSomeValuesFromTranslator.class));
    }

    public void verifyObjectSomeValuesFromTranslator() {
        ObjectSomeValuesFromTranslator testSubject0 = new ObjectSomeValuesFromTranslator(_OWLRDFConsumer);
        OWLObjectSomeValuesFrom result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesObjectUnionOfTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractClassExpressionTranslator.class.isAssignableFrom(ObjectUnionOfTranslator.class));
    }

    public void verifyObjectUnionOfTranslator() {
        ObjectUnionOfTranslator testSubject0 = new ObjectUnionOfTranslator(_OWLRDFConsumer);
        OWLObjectUnionOf result0 = testSubject0.translate(_IRI);
        OWLClassExpression result1 = testSubject0.translate(_IRI);
        boolean result2 = testSubject0.matchesLax(_IRI);
        boolean result3 = testSubject0.matchesStrict(_IRI);
        boolean result4 = testSubject0.matches(_IRI, _Mode);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result5 = testSubject0.getConsumer();
    }

    public void verifyOptimisedListTranslator() {
        OptimisedListTranslator testSubject0 = new OptimisedListTranslator(_OWLRDFConsumer, mock(ListItemTranslator.class)) {
        };
        java.util.List<OWLObject> result0 = testSubject0.translateList(_IRI);
        java.util.Set<OWLObject> result1 = testSubject0.translateToSet(_IRI);
    }

    @Test
    public void enforceInterfacesOWLFacetRestrictionListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(OWLFacetRestrictionListItemTranslator.class));
    }

    public void verifyOWLFacetRestrictionListItemTranslator() {
        OWLFacetRestrictionListItemTranslator testSubject0 = new OWLFacetRestrictionListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLFacetRestriction result2 = testSubject0.translate(_IRI);
        OWLFacetRestriction result3 = testSubject0.translate(_OWLLiteral);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyExpressionListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(OWLObjectPropertyExpressionListItemTranslator.class));
    }

    public void verifyOWLObjectPropertyExpressionListItemTranslator() {
        OWLObjectPropertyExpressionListItemTranslator testSubject0 = new OWLObjectPropertyExpressionListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLObjectPropertyExpression result2 = testSubject0.translate(_OWLLiteral);
        OWLObjectPropertyExpression result3 = testSubject0.translate(_IRI);
    }

    @Test
    public void enforceInterfacesOWLRDFConsumer() {
        assertTrue(org.semanticweb.owlapi.rdf.syntax.RDFConsumer.class.isAssignableFrom(OWLRDFConsumer.class));
    }

    public void verifyOWLRDFConsumer() throws UnloadableImportException, SAXException {
        OWLRDFConsumer testSubject0 = new OWLRDFConsumer(_OWLOntologyManager, _OWLOntology, _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        OWLRDFConsumer testSubject1 = new OWLRDFConsumer(_OWLOntology, _AnonymousNodeChecker, _OWLOntologyLoaderConfiguration);
        testSubject0.handle(_IRI, _IRI, _OWLLiteral);
        testSubject0.handle(_IRI, _IRI, _IRI);
        testSubject0.addFirst(_IRI, _IRI);
        testSubject0.addFirst(_IRI, _OWLLiteral);
        OWLOntologyLoaderConfiguration result0 = testSubject0.getConfiguration();
        testSubject0.addTriple(_IRI, _IRI, _IRI);
        testSubject0.addTriple(_IRI, _IRI, _OWLLiteral);
        java.util.Set<OWLAnnotation> result1 = testSubject0.translateAnnotations(_IRI);
        OWLOntology result2 = testSubject0.getOntology();
        OWLDataFactory result3 = testSubject0.getDataFactory();
        testSubject0.addOntology(_IRI);
        IRI result4 = testSubject0.getResourceObject(_IRI, _OWLRDFVocabulary, _boolean);
        IRI result5 = testSubject0.getResourceObject(_IRI, _IRI, _boolean);
        OWLLiteral result6 = testSubject0.getLiteralObject(_IRI, _OWLRDFVocabulary, _boolean);
        OWLLiteral result7 = testSubject0.getLiteralObject(_IRI, _IRI, _boolean);
        boolean result8 = testSubject0.isRestriction(_IRI);
        boolean result9 = testSubject0.isClassExpression(_IRI);
        boolean result10 = testSubject0.isDataRange(_IRI);
        boolean result11 = testSubject0.isParsedAllTriples();
        testSubject0.importsClosureChanged();
        testSubject0.setIRIProvider(_IRIProvider);
        testSubject0.setExpectedAxioms(_int);
        java.util.Set<OWLAnnotation> result12 = testSubject0.getPendingAnnotations();
        testSubject0.setPendingAnnotations(_Set);
        OWLAxiom result13 = testSubject0.getLastAddedAxiom();
        testSubject0.addClassExpression(_IRI, _boolean);
        testSubject0.addObjectProperty(_IRI, _boolean);
        testSubject0.addDataProperty(_IRI, _boolean);
        testSubject0.addDataRange(_IRI, _boolean);
        testSubject0.addAnnotatedSource(_IRI, _IRI);
        java.util.Set<IRI> result14 = testSubject0.getAnnotatedSourceAnnotationMainNodes(_IRI);
        boolean result15 = testSubject0.isTriplePresent(_IRI, _IRI, _OWLLiteral, _boolean);
        boolean result16 = testSubject0.isTriplePresent(_IRI, _IRI, _IRI, _boolean);
        OWLIndividual result17 = testSubject0.translateIndividual(_IRI);
        OWLClassExpression result18 = testSubject0.translateClassExpression(_IRI);
        testSubject0.startModel(_String);
        testSubject0.endModel();
        testSubject0.addModelAttribte(_String, _String);
        testSubject0.includeModel(_String, _String);
        testSubject0.logicalURI(_String);
        IRI result19 = testSubject0.getSynonym(_IRI);
        testSubject0.statementWithLiteralValue(_String, _String, _String, _String, _String);
        testSubject0.statementWithResourceValue(_String, _String, _String);
        OWLDataRange result20 = testSubject0.translateDataRange(_IRI);
        java.util.Set<OWLDataRange> result21 = testSubject0.translateToDataRangeSet(_IRI);
        java.util.Set<OWLLiteral> result22 = testSubject0.translateToConstantSet(_IRI);
        java.util.Set<OWLFacetRestriction> result23 = testSubject0.translateToFacetRestrictionSet(_IRI);
        OWLDataPropertyExpression result24 = testSubject0.translateDataPropertyExpression(_IRI);
        OWLObjectPropertyExpression result25 = testSubject0.translateObjectPropertyExpression(_IRI);
        java.util.Set<IRI> result26 = testSubject0.getPredicatesBySubject(_IRI);
        java.util.Set<IRI> result27 = testSubject0.getResourceObjects(_IRI, _IRI);
        java.util.Set<OWLLiteral> result28 = testSubject0.getLiteralObjects(_IRI, _IRI);
        OWLClassExpression result29 = testSubject0.getClassExpressionIfTranslated(_IRI);
        java.util.List<OWLObjectPropertyExpression> result30 = testSubject0.translateToObjectPropertyList(_IRI);
        java.util.List<OWLDataPropertyExpression> result31 = testSubject0.translateToDataPropertyList(_IRI);
        java.util.Set<OWLClassExpression> result32 = testSubject0.translateToClassExpressionSet(_IRI);
        java.util.Set<OWLIndividual> result33 = testSubject0.translateToIndividualSet(_IRI);
        boolean result34 = testSubject0.hasPredicate(_IRI, _IRI);
        testSubject0.addRest(_IRI, _IRI);
        IRI result35 = testSubject0.getFirstResource(_IRI, _boolean);
        OWLLiteral result36 = testSubject0.getFirstLiteral(_IRI);
        IRI result37 = testSubject0.getRest(_IRI, _boolean);
        boolean result38 = testSubject0.isAxiom(_IRI);
        OWLOntologyManager result39 = testSubject0.getOWLOntologyManager();
        java.util.Set<IRI> result40 = testSubject0.getOntologies();
        testSubject0.addAxiom(_IRI);
        org.semanticweb.owlapi.io.RDFOntologyFormat result41 = testSubject0.getOntologyFormat();
        testSubject0.setOntologyFormat(_RDFOntologyFormat);
    }

    @Test
    public void enforceInterfacesOWLRDFParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OWLRDFParserException.class));
    }

    public void verifyOWLRDFParserException() {
        OWLRDFParserException testSubject0 = new OWLRDFParserException(_Throwable);
        OWLRDFParserException testSubject1 = new OWLRDFParserException(_String, _Throwable);
        OWLRDFParserException testSubject2 = new OWLRDFParserException(_String);
        OWLRDFParserException testSubject3 = new OWLRDFParserException();
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OWLRDFXMLParserException.class));
    }

    public void verifyOWLRDFXMLParserException() {
        OWLRDFXMLParserException testSubject0 = new OWLRDFXMLParserException(_String);
        OWLRDFXMLParserException testSubject1 = new OWLRDFXMLParserException(_String, _Throwable);
        OWLRDFXMLParserException testSubject2 = new OWLRDFXMLParserException(_Throwable);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserMalformedNodeException() {
        assertTrue(org.coode.owlapi.rdfxml.parser.OWLRDFXMLParserException.class.isAssignableFrom(OWLRDFXMLParserMalformedNodeException.class));
    }

    public void verifyOWLRDFXMLParserMalformedNodeException() {
        OWLRDFXMLParserMalformedNodeException testSubject0 = new OWLRDFXMLParserMalformedNodeException(_Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject1 = new OWLRDFXMLParserMalformedNodeException(_String, _Throwable);
        OWLRDFXMLParserMalformedNodeException testSubject2 = new OWLRDFXMLParserMalformedNodeException(_String);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesOWLRDFXMLParserSAXException() {
        assertTrue(org.coode.owlapi.rdfxml.parser.OWLRDFXMLParserException.class.isAssignableFrom(OWLRDFXMLParserSAXException.class));
    }

    public void verifyOWLRDFXMLParserSAXException() {
        OWLRDFXMLParserSAXException testSubject0 = new OWLRDFXMLParserSAXException(_SAXException);
        String result0 = testSubject0.getMessage();
        int result1 = testSubject0.getLineNumber();
        int result2 = testSubject0.getColumnNumber();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result3 = testSubject0.fillInStackTrace();
        Throwable result4 = testSubject0.getCause();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesRDFXMLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(RDFXMLParser.class));
    }

    public void verifyRDFXMLParser() throws OWLParserException, UnloadableImportException, IOException {
        RDFXMLParser testSubject0 = new RDFXMLParser();
        OWLOntologyFormat result0 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result2 = testSubject0.parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result3 = testSubject0.getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesRDFXMLParserFactory() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(RDFXMLParserFactory.class));
    }

    public void verifyRDFXMLParserFactory() {
        RDFXMLParserFactory testSubject0 = new RDFXMLParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0.createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesSKOSClassTripleHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(SKOSClassTripleHandler.class));
    }

    public void verifySKOSClassTripleHandler() throws UnloadableImportException {
        SKOSClassTripleHandler testSubject0 = new SKOSClassTripleHandler(_OWLRDFConsumer, _SKOSVocabulary);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesSWRLAtomListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(SWRLAtomListItemTranslator.class));
    }

    public void verifySWRLAtomListItemTranslator() {
        SWRLAtomListItemTranslator testSubject0 = new SWRLAtomListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_IRI);
        OWLObject result1 = testSubject0.translate(_OWLLiteral);
        SWRLAtom result2 = testSubject0.translate(_IRI);
        SWRLAtom result3 = testSubject0.translate(_OWLLiteral);
    }

    public void verifySWRLRuleTranslator() {
        SWRLRuleTranslator testSubject0 = new SWRLRuleTranslator(_OWLRDFConsumer);
        testSubject0.translateRule(_IRI);
    }

    @Test
    public void enforceInterfacesTPAllValuesFromHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPAllValuesFromHandler.class));
    }

    public void verifyTPAllValuesFromHandler() throws UnloadableImportException {
        TPAllValuesFromHandler testSubject0 = new TPAllValuesFromHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPAnnotatedPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPAnnotatedPropertyHandler.class));
    }

    public void verifyTPAnnotatedPropertyHandler() throws UnloadableImportException {
        TPAnnotatedPropertyHandler testSubject0 = new TPAnnotatedPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPAnnotatedSourceHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPAnnotatedSourceHandler.class));
    }

    public void verifyTPAnnotatedSourceHandler() throws UnloadableImportException {
        TPAnnotatedSourceHandler testSubject0 = new TPAnnotatedSourceHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPAnnotatedTargetHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPAnnotatedTargetHandler.class));
    }

    public void verifyTPAnnotatedTargetHandler() throws UnloadableImportException {
        TPAnnotatedTargetHandler testSubject0 = new TPAnnotatedTargetHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPComplementOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class.isAssignableFrom(TPComplementOfHandler.class));
    }

    public void verifyTPComplementOfHandler() throws UnloadableImportException {
        TPComplementOfHandler testSubject0 = new TPComplementOfHandler(_OWLRDFConsumer);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPDatatypeComplementOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPDatatypeComplementOfHandler.class));
    }

    public void verifyTPDatatypeComplementOfHandler() throws UnloadableImportException {
        TPDatatypeComplementOfHandler testSubject0 = new TPDatatypeComplementOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPDeclaredAsHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPDeclaredAsHandler.class));
    }

    public void verifyTPDeclaredAsHandler() throws UnloadableImportException {
        TPDeclaredAsHandler testSubject0 = new TPDeclaredAsHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPDifferentFromHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPDifferentFromHandler.class));
    }

    public void verifyTPDifferentFromHandler() throws UnloadableImportException {
        TPDifferentFromHandler testSubject0 = new TPDifferentFromHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPDisjointUnionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPDisjointUnionHandler.class));
    }

    public void verifyTPDisjointUnionHandler() throws UnloadableImportException {
        TPDisjointUnionHandler testSubject0 = new TPDisjointUnionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPDisjointWithHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPDisjointWithHandler.class));
    }

    public void verifyTPDisjointWithHandler() throws UnloadableImportException {
        TPDisjointWithHandler testSubject0 = new TPDisjointWithHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPDistinctMembersHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPDistinctMembersHandler.class));
    }

    public void verifyTPDistinctMembersHandler() throws UnloadableImportException {
        TPDistinctMembersHandler testSubject0 = new TPDistinctMembersHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPEquivalentClassHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPEquivalentClassHandler.class));
    }

    public void verifyTPEquivalentClassHandler() throws UnloadableImportException {
        TPEquivalentClassHandler testSubject0 = new TPEquivalentClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPEquivalentPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPEquivalentPropertyHandler.class));
    }

    public void verifyTPEquivalentPropertyHandler() throws UnloadableImportException {
        TPEquivalentPropertyHandler testSubject0 = new TPEquivalentPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPFirstLiteralHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractLiteralTripleHandler.class.isAssignableFrom(TPFirstLiteralHandler.class));
    }

    public void verifyTPFirstLiteralHandler() {
        TPFirstLiteralHandler testSubject0 = new TPFirstLiteralHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _OWLLiteral);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _OWLLiteral);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _OWLLiteral);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result2 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPFirstResourceHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPFirstResourceHandler.class));
    }

    public void verifyTPFirstResourceHandler() throws UnloadableImportException {
        TPFirstResourceHandler testSubject0 = new TPFirstResourceHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPHasKeyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPHasKeyHandler.class));
    }

    public void verifyTPHasKeyHandler() throws UnloadableImportException {
        TPHasKeyHandler testSubject0 = new TPHasKeyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPHasValueHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPHasValueHandler.class));
    }

    public void verifyTPHasValueHandler() throws UnloadableImportException {
        TPHasValueHandler testSubject0 = new TPHasValueHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPImportsHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPImportsHandler.class));
    }

    public void verifyTPImportsHandler() throws UnloadableImportException {
        TPImportsHandler testSubject0 = new TPImportsHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPIntersectionOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class.isAssignableFrom(TPIntersectionOfHandler.class));
    }

    public void verifyTPIntersectionOfHandler() throws UnloadableImportException {
        TPIntersectionOfHandler testSubject0 = new TPIntersectionOfHandler(_OWLRDFConsumer);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPInverseOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPInverseOfHandler.class));
    }

    public void verifyTPInverseOfHandler() throws UnloadableImportException {
        TPInverseOfHandler testSubject0 = new TPInverseOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.setAxiomParsingMode(_boolean);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.isAxiomParsingMode();
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPOnClassHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPOnClassHandler.class));
    }

    public void verifyTPOnClassHandler() throws UnloadableImportException {
        TPOnClassHandler testSubject0 = new TPOnClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPOnDataRangeHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPOnDataRangeHandler.class));
    }

    public void verifyTPOnDataRangeHandler() throws UnloadableImportException {
        TPOnDataRangeHandler testSubject0 = new TPOnDataRangeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPOneOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class.isAssignableFrom(TPOneOfHandler.class));
    }

    public void verifyTPOneOfHandler() throws UnloadableImportException {
        TPOneOfHandler testSubject0 = new TPOneOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPOnPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPOnPropertyHandler.class));
    }

    public void verifyTPOnPropertyHandler() throws UnloadableImportException {
        TPOnPropertyHandler testSubject0 = new TPOnPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyChainAxiomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPPropertyChainAxiomHandler.class));
    }

    public void verifyTPPropertyChainAxiomHandler() throws UnloadableImportException {
        TPPropertyChainAxiomHandler testSubject0 = new TPPropertyChainAxiomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyDisjointWithHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPPropertyDisjointWithHandler.class));
    }

    public void verifyTPPropertyDisjointWithHandler() throws UnloadableImportException {
        TPPropertyDisjointWithHandler testSubject0 = new TPPropertyDisjointWithHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyDomainHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPPropertyDomainHandler.class));
    }

    public void verifyTPPropertyDomainHandler() throws UnloadableImportException {
        TPPropertyDomainHandler testSubject0 = new TPPropertyDomainHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPPropertyRangeHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPPropertyRangeHandler.class));
    }

    public void verifyTPPropertyRangeHandler() throws UnloadableImportException {
        TPPropertyRangeHandler testSubject0 = new TPPropertyRangeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPRestHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPRestHandler.class));
    }

    public void verifyTPRestHandler() throws UnloadableImportException {
        TPRestHandler testSubject0 = new TPRestHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPSameAsHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPSameAsHandler.class));
    }

    public void verifyTPSameAsHandler() throws UnloadableImportException {
        TPSameAsHandler testSubject0 = new TPSameAsHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPSomeValuesFromHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPSomeValuesFromHandler.class));
    }

    public void verifyTPSomeValuesFromHandler() throws UnloadableImportException {
        TPSomeValuesFromHandler testSubject0 = new TPSomeValuesFromHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPSubClassOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPSubClassOfHandler.class));
    }

    public void verifyTPSubClassOfHandler() throws UnloadableImportException {
        TPSubClassOfHandler testSubject0 = new TPSubClassOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPSubPropertyOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPSubPropertyOfHandler.class));
    }

    public void verifyTPSubPropertyOfHandler() throws UnloadableImportException {
        TPSubPropertyOfHandler testSubject0 = new TPSubPropertyOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPTypeHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPTypeHandler.class));
    }

    public void verifyTPTypeHandler() throws UnloadableImportException {
        TPTypeHandler testSubject0 = new TPTypeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getPredicateIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPUnionOfHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractNamedEquivalentClassAxiomHandler.class.isAssignableFrom(TPUnionOfHandler.class));
    }

    public void verifyTPUnionOfHandler() throws UnloadableImportException {
        TPUnionOfHandler testSubject0 = new TPUnionOfHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTPVersionIRIHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.TriplePredicateHandler.class.isAssignableFrom(TPVersionIRIHandler.class));
    }

    public void verifyTPVersionIRIHandler() throws UnloadableImportException {
        TPVersionIRIHandler testSubject0 = new TPVersionIRIHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTranslatedOntologyChangeException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(TranslatedOntologyChangeException.class));
    }

    public void verifyTranslatedOntologyChangeException() {
        TranslatedOntologyChangeException testSubject0 = new TranslatedOntologyChangeException(_OWLOntologyChangeException);
        OWLOntologyChangeException result0 = testSubject0.getCause();
        Throwable result1 = testSubject0.getCause();
        String result2 = testSubject0.getMessage();
        Exception result3 = testSubject0.getException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result4 = testSubject0.fillInStackTrace();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesTranslatedUnloadedImportException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(TranslatedUnloadedImportException.class));
    }

    public void verifyTranslatedUnloadedImportException() {
        TranslatedUnloadedImportException testSubject0 = new TranslatedUnloadedImportException(_UnloadableImportException);
        UnloadableImportException result0 = testSubject0.getCause();
        Throwable result1 = testSubject0.getCause();
        String result2 = testSubject0.getMessage();
        Exception result3 = testSubject0.getException();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result4 = testSubject0.fillInStackTrace();
        Throwable result5 = testSubject0.initCause(_Throwable);
        String result6 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result7 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result8 = testSubject0.getSuppressed();
    }

    public void verifyInterfaceTriplePatternMatcher() {
        TriplePatternMatcher testSubject0 = mock(TriplePatternMatcher.class);
        boolean result0 = testSubject0.matches(_OWLRDFConsumer, _IRI);
        OWLObject result1 = testSubject0.createObject(_OWLRDFConsumer);
    }

    @Test
    public void enforceInterfacesTriplePredicateHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.AbstractResourceTripleHandler.class.isAssignableFrom(TriplePredicateHandler.class));
    }

    public void verifyTriplePredicateHandler() throws UnloadableImportException {
        TriplePredicateHandler testSubject0 = new TriplePredicateHandler(_OWLRDFConsumer, _IRI) {
            @Override
            public void handleTriple(IRI subject, IRI predicate, IRI object) throws UnloadableImportException {
            }

            @Override
            public boolean canHandleStreaming(IRI subject, IRI predicate, IRI object) throws UnloadableImportException {
                return false;
            }
        };
        IRI result0 = testSubject0.getPredicateIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        testSubject0.inferTypes(_IRI, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result3 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAllDifferentHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAllDifferentHandler.class));
    }

    public void verifyTypeAllDifferentHandler() throws UnloadableImportException {
        TypeAllDifferentHandler testSubject0 = new TypeAllDifferentHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getTypeIRI();
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAllDisjointClassesHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAllDisjointClassesHandler.class));
    }

    public void verifyTypeAllDisjointClassesHandler() throws UnloadableImportException {
        TypeAllDisjointClassesHandler testSubject0 = new TypeAllDisjointClassesHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result1 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result2 = testSubject0.getTypeIRI();
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAllDisjointPropertiesHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAllDisjointPropertiesHandler.class));
    }

    public void verifyTypeAllDisjointPropertiesHandler() throws UnloadableImportException {
        TypeAllDisjointPropertiesHandler testSubject0 = new TypeAllDisjointPropertiesHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAnnotationHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAnnotationHandler.class));
    }

    public void verifyTypeAnnotationHandler() throws UnloadableImportException {
        TypeAnnotationHandler testSubject0 = new TypeAnnotationHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAnnotationPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAnnotationPropertyHandler.class));
    }

    public void verifyTypeAnnotationPropertyHandler() throws UnloadableImportException {
        TypeAnnotationPropertyHandler testSubject0 = new TypeAnnotationPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAsymmetricPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAsymmetricPropertyHandler.class));
    }

    public void verifyTypeAsymmetricPropertyHandler() throws UnloadableImportException {
        TypeAsymmetricPropertyHandler testSubject0 = new TypeAsymmetricPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeAxiomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeAxiomHandler.class));
    }

    public void verifyTypeAxiomHandler() throws UnloadableImportException {
        TypeAxiomHandler testSubject0 = new TypeAxiomHandler(_OWLRDFConsumer);
        TypeAxiomHandler testSubject1 = new TypeAxiomHandler(_OWLRDFConsumer, _IRI);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeClassHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeClassHandler.class));
    }

    public void verifyTypeClassHandler() throws UnloadableImportException {
        TypeClassHandler testSubject0 = new TypeClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDataPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeDataPropertyHandler.class));
    }

    public void verifyTypeDataPropertyHandler() throws UnloadableImportException {
        TypeDataPropertyHandler testSubject0 = new TypeDataPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDataRangeHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeDataRangeHandler.class));
    }

    public void verifyTypeDataRangeHandler() throws UnloadableImportException {
        TypeDataRangeHandler testSubject0 = new TypeDataRangeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDatatypeHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeDatatypeHandler.class));
    }

    public void verifyTypeDatatypeHandler() throws UnloadableImportException {
        TypeDatatypeHandler testSubject0 = new TypeDatatypeHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypedConstantListItemTranslator() {
        assertTrue(org.coode.owlapi.rdfxml.parser.ListItemTranslator.class.isAssignableFrom(TypedConstantListItemTranslator.class));
    }

    public void verifyTypedConstantListItemTranslator() {
        TypedConstantListItemTranslator testSubject0 = new TypedConstantListItemTranslator(_OWLRDFConsumer);
        OWLObject result0 = testSubject0.translate(_OWLLiteral);
        OWLObject result1 = testSubject0.translate(_IRI);
        OWLLiteral result2 = testSubject0.translate(_OWLLiteral);
        OWLLiteral result3 = testSubject0.translate(_IRI);
    }

    @Test
    public void enforceInterfacesTypeDeprecatedClassHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeDeprecatedClassHandler.class));
    }

    public void verifyTypeDeprecatedClassHandler() throws UnloadableImportException {
        TypeDeprecatedClassHandler testSubject0 = new TypeDeprecatedClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeDeprecatedPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeDeprecatedPropertyHandler.class));
    }

    public void verifyTypeDeprecatedPropertyHandler() throws UnloadableImportException {
        TypeDeprecatedPropertyHandler testSubject0 = new TypeDeprecatedPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeFunctionalPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeFunctionalPropertyHandler.class));
    }

    public void verifyTypeFunctionalPropertyHandler() throws UnloadableImportException {
        TypeFunctionalPropertyHandler testSubject0 = new TypeFunctionalPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeInverseFunctionalPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeInverseFunctionalPropertyHandler.class));
    }

    public void verifyTypeInverseFunctionalPropertyHandler() throws UnloadableImportException {
        TypeInverseFunctionalPropertyHandler testSubject0 = new TypeInverseFunctionalPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeIrreflexivePropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeIrreflexivePropertyHandler.class));
    }

    public void verifyTypeIrreflexivePropertyHandler() throws UnloadableImportException {
        TypeIrreflexivePropertyHandler testSubject0 = new TypeIrreflexivePropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeListHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeListHandler.class));
    }

    public void verifyTypeListHandler() throws UnloadableImportException {
        TypeListHandler testSubject0 = new TypeListHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeNamedIndividualHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeNamedIndividualHandler.class));
    }

    public void verifyTypeNamedIndividualHandler() throws UnloadableImportException {
        TypeNamedIndividualHandler testSubject0 = new TypeNamedIndividualHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeNegativeDataPropertyAssertionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeNegativeDataPropertyAssertionHandler.class));
    }

    public void verifyTypeNegativeDataPropertyAssertionHandler() throws UnloadableImportException {
        TypeNegativeDataPropertyAssertionHandler testSubject0 = new TypeNegativeDataPropertyAssertionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeNegativePropertyAssertionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeNegativePropertyAssertionHandler.class));
    }

    public void verifyTypeNegativePropertyAssertionHandler() throws UnloadableImportException {
        TypeNegativePropertyAssertionHandler testSubject0 = new TypeNegativePropertyAssertionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeObjectPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeObjectPropertyHandler.class));
    }

    public void verifyTypeObjectPropertyHandler() throws UnloadableImportException {
        TypeObjectPropertyHandler testSubject0 = new TypeObjectPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeOntologyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeOntologyHandler.class));
    }

    public void verifyTypeOntologyHandler() throws UnloadableImportException {
        TypeOntologyHandler testSubject0 = new TypeOntologyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeOntologyPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeOntologyPropertyHandler.class));
    }

    public void verifyTypeOntologyPropertyHandler() throws UnloadableImportException {
        TypeOntologyPropertyHandler testSubject0 = new TypeOntologyPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypePropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypePropertyHandler.class));
    }

    public void verifyTypePropertyHandler() throws UnloadableImportException {
        TypePropertyHandler testSubject0 = new TypePropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeRDFSClassHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeRDFSClassHandler.class));
    }

    public void verifyTypeRDFSClassHandler() throws UnloadableImportException {
        TypeRDFSClassHandler testSubject0 = new TypeRDFSClassHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeReflexivePropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeReflexivePropertyHandler.class));
    }

    public void verifyTypeReflexivePropertyHandler() throws UnloadableImportException {
        TypeReflexivePropertyHandler testSubject0 = new TypeReflexivePropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeRestrictionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeRestrictionHandler.class));
    }

    public void verifyTypeRestrictionHandler() throws UnloadableImportException {
        TypeRestrictionHandler testSubject0 = new TypeRestrictionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSelfRestrictionHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSelfRestrictionHandler.class));
    }

    public void verifyTypeSelfRestrictionHandler() throws UnloadableImportException {
        TypeSelfRestrictionHandler testSubject0 = new TypeSelfRestrictionHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLAtomListHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLAtomListHandler.class));
    }

    public void verifyTypeSWRLAtomListHandler() throws UnloadableImportException {
        TypeSWRLAtomListHandler testSubject0 = new TypeSWRLAtomListHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLBuiltInAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLBuiltInAtomHandler.class));
    }

    public void verifyTypeSWRLBuiltInAtomHandler() throws UnloadableImportException {
        TypeSWRLBuiltInAtomHandler testSubject0 = new TypeSWRLBuiltInAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLBuiltInHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLBuiltInHandler.class));
    }

    public void verifyTypeSWRLBuiltInHandler() throws UnloadableImportException {
        TypeSWRLBuiltInHandler testSubject0 = new TypeSWRLBuiltInHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLClassAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLClassAtomHandler.class));
    }

    public void verifyTypeSWRLClassAtomHandler() throws UnloadableImportException {
        TypeSWRLClassAtomHandler testSubject0 = new TypeSWRLClassAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLDataRangeAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLDataRangeAtomHandler.class));
    }

    public void verifyTypeSWRLDataRangeAtomHandler() throws UnloadableImportException {
        TypeSWRLDataRangeAtomHandler testSubject0 = new TypeSWRLDataRangeAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLDataValuedPropertyAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLDataValuedPropertyAtomHandler.class));
    }

    public void verifyTypeSWRLDataValuedPropertyAtomHandler() throws UnloadableImportException {
        TypeSWRLDataValuedPropertyAtomHandler testSubject0 = new TypeSWRLDataValuedPropertyAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLDifferentIndividualsAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLDifferentIndividualsAtomHandler.class));
    }

    public void verifyTypeSWRLDifferentIndividualsAtomHandler() throws UnloadableImportException {
        TypeSWRLDifferentIndividualsAtomHandler testSubject0 = new TypeSWRLDifferentIndividualsAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLImpHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLImpHandler.class));
    }

    public void verifyTypeSWRLImpHandler() throws UnloadableImportException {
        TypeSWRLImpHandler testSubject0 = new TypeSWRLImpHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLIndividualPropertyAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLIndividualPropertyAtomHandler.class));
    }

    public void verifyTypeSWRLIndividualPropertyAtomHandler() throws UnloadableImportException {
        TypeSWRLIndividualPropertyAtomHandler testSubject0 = new TypeSWRLIndividualPropertyAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLSameIndividualAtomHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLSameIndividualAtomHandler.class));
    }

    public void verifyTypeSWRLSameIndividualAtomHandler() throws UnloadableImportException {
        TypeSWRLSameIndividualAtomHandler testSubject0 = new TypeSWRLSameIndividualAtomHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSWRLVariableHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSWRLVariableHandler.class));
    }

    public void verifyTypeSWRLVariableHandler() throws UnloadableImportException {
        TypeSWRLVariableHandler testSubject0 = new TypeSWRLVariableHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        IRI result0 = testSubject0.getTypeIRI();
        boolean result1 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        boolean result2 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeSymmetricPropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeSymmetricPropertyHandler.class));
    }

    public void verifyTypeSymmetricPropertyHandler() throws UnloadableImportException {
        TypeSymmetricPropertyHandler testSubject0 = new TypeSymmetricPropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    @Test
    public void enforceInterfacesTypeTransitivePropertyHandler() {
        assertTrue(org.coode.owlapi.rdfxml.parser.BuiltInTypeHandler.class.isAssignableFrom(TypeTransitivePropertyHandler.class));
    }

    public void verifyTypeTransitivePropertyHandler() throws UnloadableImportException {
        TypeTransitivePropertyHandler testSubject0 = new TypeTransitivePropertyHandler(_OWLRDFConsumer);
        testSubject0.handleTriple(_IRI, _IRI, _IRI);
        boolean result0 = testSubject0.canHandleStreaming(_IRI, _IRI, _IRI);
        IRI result1 = testSubject0.getTypeIRI();
        boolean result2 = testSubject0.canHandle(_IRI, _IRI, _IRI);
        IRI result3 = testSubject0.getPredicateIRI();
        testSubject0.inferTypes(_IRI, _IRI);
        org.coode.owlapi.rdfxml.parser.OWLRDFConsumer result4 = testSubject0.getConsumer();
    }

    private boolean _boolean;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
    private java.util.Set<OWLAnnotation> _Set;
    private org.coode.owlapi.rdfxml.parser.AnonymousNodeChecker _AnonymousNodeChecker;
    private org.coode.owlapi.rdfxml.parser.IRIProvider _IRIProvider;
    private org.coode.owlapi.rdfxml.parser.Mode _Mode;
    private org.coode.owlapi.rdfxml.parser.OWLRDFConsumer _OWLRDFConsumer;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.RDFOntologyFormat _RDFOntologyFormat;
    private IRI _IRI;
    private OWLLiteral _OWLLiteral;
    private OWLOntology _OWLOntology;
    private OWLOntologyChangeException _OWLOntologyChangeException;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private UnloadableImportException _UnloadableImportException;
    private org.semanticweb.owlapi.vocab.OWLRDFVocabulary _OWLRDFVocabulary;
    private org.semanticweb.owlapi.vocab.SKOSVocabulary _SKOSVocabulary;
    private org.xml.sax.SAXException _SAXException;
}
