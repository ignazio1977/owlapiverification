package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Set;

import org.coode.owlapi.owlxmlparser.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.UnloadableImportException;

@SuppressWarnings({ "javadoc", "unused", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_owlxmlparser {
    @Test
    public void enforceInterfacesAbbreviatedIRIElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractIRIElementHandler.class
                .isAssignableFrom(AbbreviatedIRIElementHandler.class));
    }

    public void verifyAbbreviatedIRIElementHandler() throws Exception {
        AbbreviatedIRIElementHandler testSubject0 = new AbbreviatedIRIElementHandler(
                _OWLXMLParserHandler);
        boolean result0 = testSubject0.isTextContentPossible();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractClassExpressionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(AbstractClassExpressionElementHandler.class));
    }

    public void verifyAbstractClassExpressionElementHandler() throws Exception {
        AbstractClassExpressionElementHandler testSubject0 = new AbstractClassExpressionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected void endClassExpressionElement() throws OWLXMLParserException {}
        };
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractClassExpressionFillerRestriction()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractObjectRestrictionElementHandler.class
                .isAssignableFrom(AbstractClassExpressionFillerRestriction.class));
    }

    public void verifyAbstractClassExpressionFillerRestriction() throws Exception {
        AbstractClassExpressionFillerRestriction testSubject0 = new AbstractClassExpressionFillerRestriction(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractClassExpressionOperandAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class
                .isAssignableFrom(AbstractClassExpressionOperandAxiomElementHandler.class));
    }

    public void verifyAbstractClassExpressionOperandAxiomElementHandler()
            throws Exception {
        AbstractClassExpressionOperandAxiomElementHandler testSubject0 = new AbstractClassExpressionOperandAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractDataCardinalityRestrictionElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRangeFillerRestrictionElementHandler.class
                .isAssignableFrom(AbstractDataCardinalityRestrictionElementHandler.class));
    }

    public void verifyAbstractDataCardinalityRestrictionElementHandler() throws Exception {
        AbstractDataCardinalityRestrictionElementHandler testSubject0 = new AbstractDataCardinalityRestrictionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractDataRangeFillerRestrictionElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRestrictionElementHandler.class
                .isAssignableFrom(AbstractDataRangeFillerRestrictionElementHandler.class));
    }

    public void verifyAbstractDataRangeFillerRestrictionElementHandler() throws Exception {
        AbstractDataRangeFillerRestrictionElementHandler testSubject0 = new AbstractDataRangeFillerRestrictionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractDataRestrictionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractRestrictionElementHandler.class
                .isAssignableFrom(AbstractDataRestrictionElementHandler.class));
    }

    public void verifyAbstractDataRestrictionElementHandler() throws Exception {
        AbstractDataRestrictionElementHandler testSubject0 = new AbstractDataRestrictionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractElementHandlerFactory() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLElementHandlerFactory.class
                .isAssignableFrom(AbstractElementHandlerFactory.class));
    }

    public void verifyAbstractElementHandlerFactory() throws Exception {
        AbstractElementHandlerFactory testSubject0 = new AbstractElementHandlerFactory(
                _OWLXMLVocabulary) {
            @Override
            public OWLElementHandler<?> createHandler(OWLXMLParserHandler handler) {
                return null;
            }
        };
        java.lang.String result0 = testSubject0.getElementName();
        org.coode.owlapi.owlxmlparser.OWLElementHandler<?> result1 = testSubject0
                .createHandler(_OWLXMLParserHandler);
    }

    @Test
    public void enforceInterfacesAbstractIRIElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(AbstractIRIElementHandler.class));
    }

    public void verifyAbstractIRIElementHandler() throws Exception {
        AbstractIRIElementHandler testSubject0 = new AbstractIRIElementHandler(
                _OWLXMLParserHandler) {
            @Override
            public void endElement() throws OWLParserException, UnloadableImportException {}

            @Override
            public IRI getOWLObject() throws OWLXMLParserException {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result0 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result1 = testSubject0.isTextContentPossible();
        java.lang.String result2 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        OWLObject result5 = testSubject0.getOWLObject();
        testSubject0.endElement();
    }

    @Test
    public void enforceInterfacesAbstractNaryBooleanClassExpressionElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class
                .isAssignableFrom(AbstractNaryBooleanClassExpressionElementHandler.class));
    }

    public void verifyAbstractNaryBooleanClassExpressionElementHandler() throws Exception {
        AbstractNaryBooleanClassExpressionElementHandler testSubject0 = new AbstractNaryBooleanClassExpressionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createClassExpression(
                    Set<OWLClassExpression> expressions) {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractObjectRestrictionElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractRestrictionElementHandler.class
                .isAssignableFrom(AbstractObjectRestrictionElementHandler.class));
    }

    public void verifyAbstractObjectRestrictionElementHandler() throws Exception {
        AbstractObjectRestrictionElementHandler testSubject0 = new AbstractObjectRestrictionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOperandAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(AbstractOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOperandAxiomElementHandler() throws Exception {
        AbstractOperandAxiomElementHandler testSubject0 = new AbstractOperandAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLAssertionAxiomElementHandler.class));
    }

    public void verifyAbstractOWLAssertionAxiomElementHandler() throws Exception {
        AbstractOWLAssertionAxiomElementHandler testSubject0 = new AbstractOWLAssertionAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLObject);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(AbstractOWLAxiomElementHandler.class));
    }

    public void verifyAbstractOWLAxiomElementHandler() throws Exception {
        AbstractOWLAxiomElementHandler testSubject0 = new AbstractOWLAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLDataPropertyAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAssertionAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLDataPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyAbstractOWLDataPropertyAssertionAxiomElementHandler()
            throws Exception {
        AbstractOWLDataPropertyAssertionAxiomElementHandler testSubject0 = new AbstractOWLDataPropertyAssertionAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLLiteral);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLDataPropertyOperandAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLDataPropertyOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOWLDataPropertyOperandAxiomElementHandler()
            throws Exception {
        AbstractOWLDataPropertyOperandAxiomElementHandler testSubject0 = new AbstractOWLDataPropertyOperandAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLDataRangeHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(AbstractOWLDataRangeHandler.class));
    }

    public void verifyAbstractOWLDataRangeHandler() throws Exception {
        AbstractOWLDataRangeHandler testSubject0 = new AbstractOWLDataRangeHandler(
                _OWLXMLParserHandler) {
            @Override
            protected void endDataRangeElement() throws OWLXMLParserException {}
        };
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLElementHandler.class
                .isAssignableFrom(AbstractOWLElementHandler.class));
    }

    public void verifyAbstractOWLElementHandler() throws Exception {
        AbstractOWLElementHandler<OWLObject> testSubject0 = new AbstractOWLElementHandler(
                _OWLXMLParserHandler) {
            @Override
            public void endElement() throws OWLParserException, UnloadableImportException {}

            @Override
            public Object getOWLObject() throws OWLXMLParserException {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result0 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result1 = testSubject0.isTextContentPossible();
        java.lang.String result2 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result3 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result4 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        OWLObject result5 = testSubject0.getOWLObject();
        testSubject0.endElement();
    }

    @Test
    public void enforceInterfacesAbstractOWLIndividualOperandAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLIndividualOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOWLIndividualOperandAxiomElementHandler() throws Exception {
        AbstractOWLIndividualOperandAxiomElementHandler testSubject0 = new AbstractOWLIndividualOperandAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectCardinalityElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionFillerRestriction.class
                .isAssignableFrom(AbstractOWLObjectCardinalityElementHandler.class));
    }

    public void verifyAbstractOWLObjectCardinalityElementHandler() throws Exception {
        AbstractOWLObjectCardinalityElementHandler testSubject0 = new AbstractOWLObjectCardinalityElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createCardinalityRestriction() {
                return null;
            }
        };
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAssertionAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLObjectPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyAssertionAxiomElementHandler()
            throws Exception {
        AbstractOWLObjectPropertyAssertionAxiomElementHandler testSubject0 = new AbstractOWLObjectPropertyAssertionAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void
            enforceInterfacesAbstractOWLObjectPropertyCharacteristicAxiomElementHandler()
                    throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyCharacteristicAxiomElementHandler()
            throws Exception {
        AbstractOWLObjectPropertyCharacteristicAxiomElementHandler testSubject0 = new AbstractOWLObjectPropertyCharacteristicAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createPropertyCharacteristicAxiom()
                    throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(AbstractOWLObjectPropertyElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyElementHandler() throws Exception {
        AbstractOWLObjectPropertyElementHandler testSubject0 = new AbstractOWLObjectPropertyElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected void endObjectPropertyElement() throws OWLXMLParserException {}
        };
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result1 = testSubject0
                .getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyOperandAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLObjectPropertyOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyOperandAxiomElementHandler()
            throws Exception {
        AbstractOWLObjectPropertyOperandAxiomElementHandler testSubject0 = new AbstractOWLObjectPropertyOperandAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLPropertyCharacteristicAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLPropertyCharacteristicAxiomElementHandler.class));
    }

    public void verifyAbstractOWLPropertyCharacteristicAxiomElementHandler()
            throws Exception {
        AbstractOWLPropertyCharacteristicAxiomElementHandler testSubject0 = new AbstractOWLPropertyCharacteristicAxiomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createPropertyCharacteristicAxiom()
                    throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractRestrictionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class
                .isAssignableFrom(AbstractRestrictionElementHandler.class));
    }

    public void verifyAbstractRestrictionElementHandler() throws Exception {
        AbstractRestrictionElementHandler testSubject0 = new AbstractRestrictionElementHandler(
                _OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesIRIElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractIRIElementHandler.class
                .isAssignableFrom(IRIElementHandler.class));
    }

    public void verifyIRIElementHandler() throws Exception {
        IRIElementHandler testSubject0 = new IRIElementHandler(_OWLXMLParserHandler);
        boolean result0 = testSubject0.isTextContentPossible();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.IRI result2 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesLegacyEntityAnnotationElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(LegacyEntityAnnotationElementHandler.class));
    }

    public void verifyLegacyEntityAnnotationElementHandler() throws Exception {
        LegacyEntityAnnotationElementHandler testSubject0 = new LegacyEntityAnnotationElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLAnnotationAssertionElementHandler.class));
    }

    public void verifyOWLAnnotationAssertionElementHandler() throws Exception {
        OWLAnnotationAssertionElementHandler testSubject0 = new OWLAnnotationAssertionElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLAnnotationElementHandler.class));
    }

    public void verifyOWLAnnotationElementHandler() throws Exception {
        OWLAnnotationElementHandler testSubject0 = new OWLAnnotationElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        boolean result0 = testSubject0.isTextContentPossible();
        org.semanticweb.owlapi.model.OWLAnnotation result1 = testSubject0.getOWLObject();
        java.lang.Object result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLAnnotationPropertyDomainElementHandler.class));
    }

    public void verifyOWLAnnotationPropertyDomainElementHandler() throws Exception {
        OWLAnnotationPropertyDomainElementHandler testSubject0 = new OWLAnnotationPropertyDomainElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLAnnotationPropertyElementHandler.class));
    }

    public void verifyOWLAnnotationPropertyElementHandler() throws Exception {
        OWLAnnotationPropertyElementHandler testSubject0 = new OWLAnnotationPropertyElementHandler(
                _OWLXMLParserHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result1 = testSubject0
                .getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLAnnotationPropertyRangeElementHandler.class));
    }

    public void verifyOWLAnnotationPropertyRangeElementHandler() throws Exception {
        OWLAnnotationPropertyRangeElementHandler testSubject0 = new OWLAnnotationPropertyRangeElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLAnonymousIndividualElementHandler.class));
    }

    public void verifyOWLAnonymousIndividualElementHandler() throws Exception {
        OWLAnonymousIndividualElementHandler testSubject0 = new OWLAnonymousIndividualElementHandler(
                _OWLXMLParserHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result1 = testSubject0
                .getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLAsymmetricObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLAsymmetricObjectPropertyAxiomElementHandler() throws Exception {
        OWLAsymmetricObjectPropertyAxiomElementHandler testSubject0 = new OWLAsymmetricObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLAsymmetricObjectPropertyElementHandler.class));
    }

    public void verifyOWLAsymmetricObjectPropertyElementHandler() throws Exception {
        OWLAsymmetricObjectPropertyElementHandler testSubject0 = new OWLAsymmetricObjectPropertyElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLClassAssertionAxiomElementHandler.class));
    }

    public void verifyOWLClassAssertionAxiomElementHandler() throws Exception {
        OWLClassAssertionAxiomElementHandler testSubject0 = new OWLClassAssertionAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLClassElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class
                .isAssignableFrom(OWLClassElementHandler.class));
    }

    public void verifyOWLClassElementHandler() throws Exception {
        OWLClassElementHandler testSubject0 = new OWLClassElementHandler(
                _OWLXMLParserHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endClassExpressionElement();
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFromElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRangeFillerRestrictionElementHandler.class
                .isAssignableFrom(OWLDataAllValuesFromElementHandler.class));
    }

    public void verifyOWLDataAllValuesFromElementHandler() throws Exception {
        OWLDataAllValuesFromElementHandler testSubject0 = new OWLDataAllValuesFromElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataComplementOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDataComplementOfElementHandler.class));
    }

    public void verifyOWLDataComplementOfElementHandler() throws Exception {
        OWLDataComplementOfElementHandler testSubject0 = new OWLDataComplementOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinalityElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataCardinalityRestrictionElementHandler.class
                .isAssignableFrom(OWLDataExactCardinalityElementHandler.class));
    }

    public void verifyOWLDataExactCardinalityElementHandler() throws Exception {
        OWLDataExactCardinalityElementHandler testSubject0 = new OWLDataExactCardinalityElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataHasValueElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRestrictionElementHandler.class
                .isAssignableFrom(OWLDataHasValueElementHandler.class));
    }

    public void verifyOWLDataHasValueElementHandler() throws Exception {
        OWLDataHasValueElementHandler testSubject0 = new OWLDataHasValueElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDataIntersectionOfElementHandler.class));
    }

    public void verifyOWLDataIntersectionOfElementHandler() throws Exception {
        OWLDataIntersectionOfElementHandler testSubject0 = new OWLDataIntersectionOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinalityElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataCardinalityRestrictionElementHandler.class
                .isAssignableFrom(OWLDataMaxCardinalityElementHandler.class));
    }

    public void verifyOWLDataMaxCardinalityElementHandler() throws Exception {
        OWLDataMaxCardinalityElementHandler testSubject0 = new OWLDataMaxCardinalityElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinalityElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataCardinalityRestrictionElementHandler.class
                .isAssignableFrom(OWLDataMinCardinalityElementHandler.class));
    }

    public void verifyOWLDataMinCardinalityElementHandler() throws Exception {
        OWLDataMinCardinalityElementHandler testSubject0 = new OWLDataMinCardinalityElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataOneOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDataOneOfElementHandler.class));
    }

    public void verifyOWLDataOneOfElementHandler() throws Exception {
        OWLDataOneOfElementHandler testSubject0 = new OWLDataOneOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyAssertionAxiomElementHandler.class
                .isAssignableFrom(OWLDataPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLDataPropertyAssertionAxiomElementHandler() throws Exception {
        OWLDataPropertyAssertionAxiomElementHandler testSubject0 = new OWLDataPropertyAssertionAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLLiteral);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLDataPropertyDomainAxiomElementHandler.class));
    }

    public void verifyOWLDataPropertyDomainAxiomElementHandler() throws Exception {
        OWLDataPropertyDomainAxiomElementHandler testSubject0 = new OWLDataPropertyDomainAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLDataPropertyElementHandler.class));
    }

    public void verifyOWLDataPropertyElementHandler() throws Exception {
        OWLDataPropertyElementHandler testSubject0 = new OWLDataPropertyElementHandler(
                _OWLXMLParserHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result1 = testSubject0
                .getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLDataPropertyRangeAxiomElementHandler.class));
    }

    public void verifyOWLDataPropertyRangeAxiomElementHandler() throws Exception {
        OWLDataPropertyRangeAxiomElementHandler testSubject0 = new OWLDataPropertyRangeAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataRestrictionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDataRestrictionElementHandler.class));
    }

    public void verifyOWLDataRestrictionElementHandler() throws Exception {
        OWLDataRestrictionElementHandler testSubject0 = new OWLDataRestrictionElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.attribute(_String, _String);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFromElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRangeFillerRestrictionElementHandler.class
                .isAssignableFrom(OWLDataSomeValuesFromElementHandler.class));
    }

    public void verifyOWLDataSomeValuesFromElementHandler() throws Exception {
        OWLDataSomeValuesFromElementHandler testSubject0 = new OWLDataSomeValuesFromElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLDatatypeDefinitionElementHandler.class));
    }

    public void verifyOWLDatatypeDefinitionElementHandler() throws Exception {
        OWLDatatypeDefinitionElementHandler testSubject0 = new OWLDatatypeDefinitionElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDatatypeElementHandler.class));
    }

    public void verifyOWLDatatypeElementHandler() throws Exception {
        OWLDatatypeElementHandler testSubject0 = new OWLDatatypeElementHandler(
                _OWLXMLParserHandler);
        testSubject0.attribute(_String, _String);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeFacetRestrictionElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLDatatypeFacetRestrictionElementHandler.class));
    }

    public void verifyOWLDatatypeFacetRestrictionElementHandler() throws Exception {
        OWLDatatypeFacetRestrictionElementHandler testSubject0 = new OWLDatatypeFacetRestrictionElementHandler(
                _OWLXMLParserHandler);
        org.semanticweb.owlapi.model.OWLFacetRestriction result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestrictionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDatatypeRestrictionElementHandler.class));
    }

    public void verifyOWLDatatypeRestrictionElementHandler() throws Exception {
        OWLDatatypeRestrictionElementHandler testSubject0 = new OWLDatatypeRestrictionElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataUnionOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class
                .isAssignableFrom(OWLDataUnionOfElementHandler.class));
    }

    public void verifyOWLDataUnionOfElementHandler() throws Exception {
        OWLDataUnionOfElementHandler testSubject0 = new OWLDataUnionOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDeclarationAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLDeclarationAxiomElementHandler.class));
    }

    public void verifyOWLDeclarationAxiomElementHandler() throws Exception {
        OWLDeclarationAxiomElementHandler testSubject0 = new OWLDeclarationAxiomElementHandler(
                _OWLXMLParserHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getEntityAnnotations();
        testSubject0.startElement(_String);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result1 = testSubject0
                .getAnnotations();
        java.lang.Object result2 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result3 = testSubject0.getOWLObject();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result4 = testSubject0
                .getConfiguration();
        boolean result5 = testSubject0.isTextContentPossible();
        java.lang.String result6 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result8 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLIndividualOperandAxiomElementHandler.class
                .isAssignableFrom(OWLDifferentIndividualsAxiomElementHandler.class));
    }

    public void verifyOWLDifferentIndividualsAxiomElementHandler() throws Exception {
        OWLDifferentIndividualsAxiomElementHandler testSubject0 = new OWLDifferentIndividualsAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionOperandAxiomElementHandler.class
                .isAssignableFrom(OWLDisjointClassesAxiomElementHandler.class));
    }

    public void verifyOWLDisjointClassesAxiomElementHandler() throws Exception {
        OWLDisjointClassesAxiomElementHandler testSubject0 = new OWLDisjointClassesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyOperandAxiomElementHandler.class
                .isAssignableFrom(OWLDisjointDataPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLDisjointDataPropertiesAxiomElementHandler() throws Exception {
        OWLDisjointDataPropertiesAxiomElementHandler testSubject0 = new OWLDisjointDataPropertiesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyOperandAxiomElementHandler.class
                .isAssignableFrom(OWLDisjointObjectPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLDisjointObjectPropertiesAxiomElementHandler() throws Exception {
        OWLDisjointObjectPropertiesAxiomElementHandler testSubject0 = new OWLDisjointObjectPropertiesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLDisjointUnionElementHandler.class));
    }

    public void verifyOWLDisjointUnionElementHandler() throws Exception {
        OWLDisjointUnionElementHandler testSubject0 = new OWLDisjointUnionElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    public void verifyInterfaceOWLElementHandler() throws Exception {
        OWLElementHandler<OWLObject> testSubject0 = mock(OWLElementHandler.class);
        testSubject0.startElement(_String);
        boolean result0 = testSubject0.isTextContentPossible();
        OWLObject result1 = testSubject0.getOWLObject();
        java.lang.String result2 = testSubject0.getText();
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        testSubject0.endElement();
    }

    public void verifyInterfaceOWLElementHandlerFactory() throws Exception {
        OWLElementHandlerFactory testSubject0 = mock(OWLElementHandlerFactory.class);
        java.lang.String result0 = testSubject0.getElementName();
        org.coode.owlapi.owlxmlparser.OWLElementHandler<?> result1 = testSubject0
                .createHandler(_OWLXMLParserHandler);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionOperandAxiomElementHandler.class
                .isAssignableFrom(OWLEquivalentClassesAxiomElementHandler.class));
    }

    public void verifyOWLEquivalentClassesAxiomElementHandler() throws Exception {
        OWLEquivalentClassesAxiomElementHandler testSubject0 = new OWLEquivalentClassesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyOperandAxiomElementHandler.class
                .isAssignableFrom(OWLEquivalentDataPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLEquivalentDataPropertiesAxiomElementHandler() throws Exception {
        OWLEquivalentDataPropertiesAxiomElementHandler testSubject0 = new OWLEquivalentDataPropertiesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyOperandAxiomElementHandler.class
                .isAssignableFrom(OWLEquivalentObjectPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLEquivalentObjectPropertiesAxiomElementHandler() throws Exception {
        OWLEquivalentObjectPropertiesAxiomElementHandler testSubject0 = new OWLEquivalentObjectPropertiesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLFunctionalDataPropertyAxiomElementHandler.class));
    }

    public void verifyOWLFunctionalDataPropertyAxiomElementHandler() throws Exception {
        OWLFunctionalDataPropertyAxiomElementHandler testSubject0 = new OWLFunctionalDataPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLFunctionalObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLFunctionalObjectPropertyAxiomElementHandler() throws Exception {
        OWLFunctionalObjectPropertyAxiomElementHandler testSubject0 = new OWLFunctionalObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLHasKeyElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLHasKeyElementHandler.class));
    }

    public void verifyOWLHasKeyElementHandler() throws Exception {
        OWLHasKeyElementHandler testSubject0 = new OWLHasKeyElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLImportsHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLImportsHandler.class));
    }

    public void verifyOWLImportsHandler() throws Exception {
        OWLImportsHandler testSubject0 = new OWLImportsHandler(_OWLXMLParserHandler);
        boolean result0 = testSubject0.isTextContentPossible();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLOntology result2 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLIndividualElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLIndividualElementHandler.class));
    }

    public void verifyOWLIndividualElementHandler() throws Exception {
        OWLIndividualElementHandler testSubject0 = new OWLIndividualElementHandler(
                _OWLXMLParserHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLNamedIndividual result1 = testSubject0
                .getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLInverseFunctionalObjectPropertyAxiomElementHandler()
            throws Exception {
        OWLInverseFunctionalObjectPropertyAxiomElementHandler testSubject0 = new OWLInverseFunctionalObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyOperandAxiomElementHandler.class
                .isAssignableFrom(OWLInverseObjectPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLInverseObjectPropertiesAxiomElementHandler() throws Exception {
        OWLInverseObjectPropertiesAxiomElementHandler testSubject0 = new OWLInverseObjectPropertiesAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertyElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyElementHandler.class
                .isAssignableFrom(OWLInverseObjectPropertyElementHandler.class));
    }

    public void verifyOWLInverseObjectPropertyElementHandler() throws Exception {
        OWLInverseObjectPropertyElementHandler testSubject0 = new OWLInverseObjectPropertyElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result1 = testSubject0
                .getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLIrreflexiveObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLIrreflexiveObjectPropertyAxiomElementHandler() throws Exception {
        OWLIrreflexiveObjectPropertyAxiomElementHandler testSubject0 = new OWLIrreflexiveObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLLiteralElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLLiteralElementHandler.class));
    }

    public void verifyOWLLiteralElementHandler() throws Exception {
        OWLLiteralElementHandler testSubject0 = new OWLLiteralElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        boolean result0 = testSubject0.isTextContentPossible();
        org.semanticweb.owlapi.model.OWLLiteral result1 = testSubject0.getOWLObject();
        java.lang.Object result2 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyAssertionAxiomElementHandler.class
                .isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLNegativeDataPropertyAssertionAxiomElementHandler()
            throws Exception {
        OWLNegativeDataPropertyAssertionAxiomElementHandler testSubject0 = new OWLNegativeDataPropertyAssertionAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLLiteral);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyAssertionAxiomElementHandler.class
                .isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLNegativeObjectPropertyAssertionAxiomElementHandler()
            throws Exception {
        OWLNegativeObjectPropertyAssertionAxiomElementHandler testSubject0 = new OWLNegativeObjectPropertyAssertionAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFromElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionFillerRestriction.class
                .isAssignableFrom(OWLObjectAllValuesFromElementHandler.class));
    }

    public void verifyOWLObjectAllValuesFromElementHandler() throws Exception {
        OWLObjectAllValuesFromElementHandler testSubject0 = new OWLObjectAllValuesFromElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class
                .isAssignableFrom(OWLObjectComplementOfElementHandler.class));
    }

    public void verifyOWLObjectComplementOfElementHandler() throws Exception {
        OWLObjectComplementOfElementHandler testSubject0 = new OWLObjectComplementOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinalityElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectCardinalityElementHandler.class
                .isAssignableFrom(OWLObjectExactCardinalityElementHandler.class));
    }

    public void verifyOWLObjectExactCardinalityElementHandler() throws Exception {
        OWLObjectExactCardinalityElementHandler testSubject0 = new OWLObjectExactCardinalityElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectExistsSelfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class
                .isAssignableFrom(OWLObjectExistsSelfElementHandler.class));
    }

    public void verifyOWLObjectExistsSelfElementHandler() throws Exception {
        OWLObjectExistsSelfElementHandler testSubject0 = new OWLObjectExistsSelfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectHasValueElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractObjectRestrictionElementHandler.class
                .isAssignableFrom(OWLObjectHasValueElementHandler.class));
    }

    public void verifyOWLObjectHasValueElementHandler() throws Exception {
        OWLObjectHasValueElementHandler testSubject0 = new OWLObjectHasValueElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractNaryBooleanClassExpressionElementHandler.class
                .isAssignableFrom(OWLObjectIntersectionOfElementHandler.class));
    }

    public void verifyOWLObjectIntersectionOfElementHandler() throws Exception {
        OWLObjectIntersectionOfElementHandler testSubject0 = new OWLObjectIntersectionOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinalityElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectCardinalityElementHandler.class
                .isAssignableFrom(OWLObjectMaxCardinalityElementHandler.class));
    }

    public void verifyOWLObjectMaxCardinalityElementHandler() throws Exception {
        OWLObjectMaxCardinalityElementHandler testSubject0 = new OWLObjectMaxCardinalityElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinalityElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectCardinalityElementHandler.class
                .isAssignableFrom(OWLObjectMinCardinalityElementHandler.class));
    }

    public void verifyOWLObjectMinCardinalityElementHandler() throws Exception {
        OWLObjectMinCardinalityElementHandler testSubject0 = new OWLObjectMinCardinalityElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectOneOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class
                .isAssignableFrom(OWLObjectOneOfElementHandler.class));
    }

    public void verifyOWLObjectOneOfElementHandler() throws Exception {
        OWLObjectOneOfElementHandler testSubject0 = new OWLObjectOneOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyAssertionAxiomElementHandler.class
                .isAssignableFrom(OWLObjectPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLObjectPropertyAssertionAxiomElementHandler() throws Exception {
        OWLObjectPropertyAssertionAxiomElementHandler testSubject0 = new OWLObjectPropertyAssertionAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        org.semanticweb.owlapi.model.OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLIndividual);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result3 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result4 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result6 = testSubject0
                .getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        java.lang.String result8 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result9 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result10 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLObjectPropertyDomainElementHandler.class));
    }

    public void verifyOWLObjectPropertyDomainElementHandler() throws Exception {
        OWLObjectPropertyDomainElementHandler testSubject0 = new OWLObjectPropertyDomainElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyElementHandler.class
                .isAssignableFrom(OWLObjectPropertyElementHandler.class));
    }

    public void verifyOWLObjectPropertyElementHandler() throws Exception {
        OWLObjectPropertyElementHandler testSubject0 = new OWLObjectPropertyElementHandler(
                _OWLXMLParserHandler);
        testSubject0.attribute(_String, _String);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result1 = testSubject0
                .getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLObjectPropertyRangeAxiomElementHandler.class));
    }

    public void verifyOWLObjectPropertyRangeAxiomElementHandler() throws Exception {
        OWLObjectPropertyRangeAxiomElementHandler testSubject0 = new OWLObjectPropertyRangeAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFromElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionFillerRestriction.class
                .isAssignableFrom(OWLObjectSomeValuesFromElementHandler.class));
    }

    public void verifyOWLObjectSomeValuesFromElementHandler() throws Exception {
        OWLObjectSomeValuesFromElementHandler testSubject0 = new OWLObjectSomeValuesFromElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractNaryBooleanClassExpressionElementHandler.class
                .isAssignableFrom(OWLObjectUnionOfElementHandler.class));
    }

    public void verifyOWLObjectUnionOfElementHandler() throws Exception {
        OWLObjectUnionOfElementHandler testSubject0 = new OWLObjectUnionOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLOntologyHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLOntologyHandler.class));
    }

    public void verifyOWLOntologyHandler() throws Exception {
        OWLOntologyHandler testSubject0 = new OWLOntologyHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLOntology result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLReflexiveObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLReflexiveObjectPropertyAxiomElementHandler() throws Exception {
        OWLReflexiveObjectPropertyAxiomElementHandler testSubject0 = new OWLReflexiveObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSameIndividualsAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLIndividualOperandAxiomElementHandler.class
                .isAssignableFrom(OWLSameIndividualsAxiomElementHandler.class));
    }

    public void verifyOWLSameIndividualsAxiomElementHandler() throws Exception {
        OWLSameIndividualsAxiomElementHandler testSubject0 = new OWLSameIndividualsAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLSubAnnotationPropertyOfElementHandler.class));
    }

    public void verifyOWLSubAnnotationPropertyOfElementHandler() throws Exception {
        OWLSubAnnotationPropertyOfElementHandler testSubject0 = new OWLSubAnnotationPropertyOfElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubClassAxiomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLSubClassAxiomElementHandler.class));
    }

    public void verifyOWLSubClassAxiomElementHandler() throws Exception {
        OWLSubClassAxiomElementHandler testSubject0 = new OWLSubClassAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLSubDataPropertyOfAxiomElementHandler.class));
    }

    public void verifyOWLSubDataPropertyOfAxiomElementHandler() throws Exception {
        OWLSubDataPropertyOfAxiomElementHandler testSubject0 = new OWLSubDataPropertyOfAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyChainElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLSubObjectPropertyChainElementHandler.class));
    }

    public void verifyOWLSubObjectPropertyChainElementHandler() throws Exception {
        OWLSubObjectPropertyChainElementHandler testSubject0 = new OWLSubObjectPropertyChainElementHandler(
                _OWLXMLParserHandler);
        java.lang.Object result0 = testSubject0.getOWLObject();
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result1 = testSubject0
                .getOWLObject();
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(OWLSubObjectPropertyOfAxiomElementHandler.class));
    }

    public void verifyOWLSubObjectPropertyOfAxiomElementHandler() throws Exception {
        OWLSubObjectPropertyOfAxiomElementHandler testSubject0 = new OWLSubObjectPropertyOfAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLSymmetricObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLSymmetricObjectPropertyAxiomElementHandler() throws Exception {
        OWLSymmetricObjectPropertyAxiomElementHandler testSubject0 = new OWLSymmetricObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLTransitiveObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLTransitiveObjectPropertyAxiomElementHandler() throws Exception {
        OWLTransitiveObjectPropertyAxiomElementHandler testSubject0 = new OWLTransitiveObjectPropertyAxiomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLUnionOfElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(OWLUnionOfElementHandler.class));
    }

    public void verifyOWLUnionOfElementHandler() throws Exception {
        OWLUnionOfElementHandler testSubject0 = new OWLUnionOfElementHandler(
                _OWLXMLParserHandler);
        org.semanticweb.owlapi.model.OWLClassExpression result0 = testSubject0
                .getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLXMLParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(OWLXMLParser.class));
    }

    public void verifyOWLXMLParser() throws Exception {
        OWLXMLParser testSubject0 = new OWLXMLParser();
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
    public void enforceInterfacesOWLXMLParserAttributeNotFoundException()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLXMLParserException.class
                .isAssignableFrom(OWLXMLParserAttributeNotFoundException.class));
    }

    public void verifyOWLXMLParserAttributeNotFoundException() throws Exception {
        OWLXMLParserAttributeNotFoundException testSubject0 = new OWLXMLParserAttributeNotFoundException(
                _int, _int, _String);
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
    public void enforceInterfacesOWLXMLParserElementNotFoundException() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLXMLParserException.class
                .isAssignableFrom(OWLXMLParserElementNotFoundException.class));
    }

    public void verifyOWLXMLParserElementNotFoundException() throws Exception {
        OWLXMLParserElementNotFoundException testSubject0 = new OWLXMLParserElementNotFoundException(
                _int, _int, _String);
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
    public void enforceInterfacesOWLXMLParserException() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OWLXMLParserException.class));
    }

    public void verifyOWLXMLParserException() throws Exception {
        OWLXMLParserException testSubject0 = new OWLXMLParserException(_String, _int,
                _int);
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
    public void enforceInterfacesOWLXMLParserException2SAXExceptionTranslation()
            throws Exception {}

    @Test
    public void enforceInterfacesOWLXMLParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(OWLXMLParserFactory.class));
    }

    public void verifyOWLXMLParserFactory() throws Exception {
        OWLXMLParserFactory testSubject0 = new OWLXMLParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOWLXMLParserHandler() throws Exception {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class
                .isAssignableFrom(OWLXMLParserHandler.class));
    }

    public void verifyOWLXMLParserHandler() throws Exception {
        OWLXMLParserHandler testSubject0 = new OWLXMLParserHandler(_OWLOntologyManager,
                _OWLOntology, _OWLElementHandler);
        OWLXMLParserHandler testSubject1 = new OWLXMLParserHandler(_OWLOntology,
                _OWLElementHandler);
        OWLXMLParserHandler testSubject2 = new OWLXMLParserHandler(_OWLOntology,
                _OWLElementHandler, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject3 = new OWLXMLParserHandler(_OWLOntologyManager,
                _OWLOntology, _OWLElementHandler, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject4 = new OWLXMLParserHandler(_OWLOntology);
        OWLXMLParserHandler testSubject5 = new OWLXMLParserHandler(_OWLOntologyManager,
                _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject6 = new OWLXMLParserHandler(_OWLOntology,
                _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject7 = new OWLXMLParserHandler(_OWLOntologyManager,
                _OWLOntology);
        int result0 = testSubject0.getLineNumber();
        int result1 = testSubject0.getColumnNumber();
        java.util.Map<java.lang.String, java.lang.String> result2 = testSubject0
                .getPrefixName2PrefixMap();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        org.semanticweb.owlapi.model.OWLOntology result4 = testSubject0.getOntology();
        org.semanticweb.owlapi.model.OWLDataFactory result5 = testSubject0
                .getDataFactory();
        org.semanticweb.owlapi.model.OWLOntologyManager result6 = testSubject0
                .getOWLOntologyManager();
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRI(_String);
        testSubject0.startElement(_String, _String, _String, _Attributes);
        org.semanticweb.owlapi.model.IRI result8 = testSubject0
                .getAbbreviatedIRI(_String);
        java.net.URI result9 = testSubject0.getBase();
        org.xml.sax.InputSource result10 = testSubject0.resolveEntity(_String, _String);
        testSubject0.setDocumentLocator(_Locator);
        testSubject0.startDocument();
        testSubject0.endDocument();
        testSubject0.startPrefixMapping(_String, _String);
        testSubject0.endElement(_String, _String, _String);
        testSubject0.characters(_char_array, _int, _int);
        testSubject0.error(_SAXParseException);
        testSubject0.warning(_SAXParseException);
        testSubject0.notationDecl(_String, _String, _String);
        testSubject0.unparsedEntityDecl(_String, _String, _String, _String);
        testSubject0.endPrefixMapping(_String);
        testSubject0.ignorableWhitespace(_char_array, _int, _int);
        testSubject0.processingInstruction(_String, _String);
        testSubject0.skippedEntity(_String);
        testSubject0.fatalError(_SAXParseException);
    }

    @Test
    public void enforceInterfacesSWRLAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(SWRLAtomElementHandler.class));
    }

    public void verifySWRLAtomElementHandler() throws Exception {
        SWRLAtomElementHandler testSubject0 = new SWRLAtomElementHandler(
                _OWLXMLParserHandler) {
            @Override
            public void endElement() throws OWLParserException, UnloadableImportException {}
        };
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        testSubject0.endElement();
    }

    @Test
    public void enforceInterfacesSWRLAtomListElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(SWRLAtomListElementHandler.class));
    }

    public void verifySWRLAtomListElementHandler() throws Exception {
        SWRLAtomListElementHandler testSubject0 = mock(SWRLAtomListElementHandler.class);
        java.lang.Object result0 = testSubject0.getOWLObject();
        java.util.List<org.semanticweb.owlapi.model.SWRLAtom> result1 = testSubject0
                .getOWLObject();
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLBuiltInAtomElementHandler.class));
    }

    public void verifySWRLBuiltInAtomElementHandler() throws Exception {
        SWRLBuiltInAtomElementHandler testSubject0 = new SWRLBuiltInAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLClassAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLClassAtomElementHandler.class));
    }

    public void verifySWRLClassAtomElementHandler() throws Exception {
        SWRLClassAtomElementHandler testSubject0 = new SWRLClassAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLDataPropertyAtomElementHandler.class));
    }

    public void verifySWRLDataPropertyAtomElementHandler() throws Exception {
        SWRLDataPropertyAtomElementHandler testSubject0 = new SWRLDataPropertyAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLDataRangeAtomElementHandler.class));
    }

    public void verifySWRLDataRangeAtomElementHandler() throws Exception {
        SWRLDataRangeAtomElementHandler testSubject0 = new SWRLDataRangeAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtomElementHandler()
            throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLDifferentIndividualsAtomElementHandler.class));
    }

    public void verifySWRLDifferentIndividualsAtomElementHandler() throws Exception {
        SWRLDifferentIndividualsAtomElementHandler testSubject0 = new SWRLDifferentIndividualsAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLObjectPropertyAtomElementHandler.class));
    }

    public void verifySWRLObjectPropertyAtomElementHandler() throws Exception {
        SWRLObjectPropertyAtomElementHandler testSubject0 = new SWRLObjectPropertyAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLRuleElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class
                .isAssignableFrom(SWRLRuleElementHandler.class));
    }

    public void verifySWRLRuleElementHandler() throws Exception {
        SWRLRuleElementHandler testSubject0 = new SWRLRuleElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result0 = testSubject0
                .getAnnotations();
        testSubject0.startElement(_String);
        java.lang.Object result1 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result3 = testSubject0
                .getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        java.lang.String result5 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result7 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtomElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class
                .isAssignableFrom(SWRLSameIndividualAtomElementHandler.class));
    }

    public void verifySWRLSameIndividualAtomElementHandler() throws Exception {
        SWRLSameIndividualAtomElementHandler testSubject0 = new SWRLSameIndividualAtomElementHandler(
                _OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.endElement();
        java.lang.Object result0 = testSubject0.getOWLObject();
        org.semanticweb.owlapi.model.SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLVariableElementHandler() throws Exception {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class
                .isAssignableFrom(SWRLVariableElementHandler.class));
    }

    public void verifySWRLVariableElementHandler() throws Exception {
        SWRLVariableElementHandler testSubject0 = new SWRLVariableElementHandler(
                _OWLXMLParserHandler) {};
        org.semanticweb.owlapi.model.SWRLVariable result0 = testSubject0.getOWLObject();
        java.lang.Object result1 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration result2 = testSubject0
                .getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        java.lang.String result4 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        org.semanticweb.owlapi.model.IRI result5 = testSubject0.getIRIFromAttribute(
                _String, _String);
        org.semanticweb.owlapi.model.IRI result6 = testSubject0.getIRIFromElement(
                _String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesTranslatedOWLOntologyChangeException() throws Exception {
        assertTrue(org.xml.sax.SAXException.class
                .isAssignableFrom(TranslatedOWLOntologyChangeException.class));
    }

    public void verifyTranslatedOWLOntologyChangeException() throws Exception {
        TranslatedOWLOntologyChangeException testSubject0 = new TranslatedOWLOntologyChangeException(
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
    public void enforceInterfacesTranslatedOWLParserException() throws Exception {
        assertTrue(org.xml.sax.SAXException.class
                .isAssignableFrom(TranslatedOWLParserException.class));
    }

    public void verifyTranslatedOWLParserException() throws Exception {
        TranslatedOWLParserException testSubject0 = new TranslatedOWLParserException(
                _OWLParserException);
        org.semanticweb.owlapi.io.OWLParserException result0 = testSubject0
                .getParserException();
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
    public void enforceInterfacesTranslatedUnloadableImportException() throws Exception {
        assertTrue(org.xml.sax.SAXException.class
                .isAssignableFrom(TranslatedUnloadableImportException.class));
    }

    public void verifyTranslatedUnloadableImportException() throws Exception {
        TranslatedUnloadableImportException testSubject0 = new TranslatedUnloadableImportException(
                _UnloadableImportException);
        org.semanticweb.owlapi.model.UnloadableImportException result0 = testSubject0
                .getUnloadableImportException();
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

    private static class P {}

    private OWLObject _OWLObject;
    private OWLLiteral _OWLLiteral;
    private OWLObjectPropertyExpression _OWLObject27;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private char[] _char_array;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.Throwable _Throwable;
    private org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler _AbstractClassExpressionElementHandler;
    private org.coode.owlapi.owlxmlparser.AbstractIRIElementHandler _AbstractIRIElementHandler;
    private org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler _AbstractOWLAxiomElementHandler;
    private org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler _AbstractOWLDataRangeHandler;
    private org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyElementHandler _AbstractOWLObjectPropertyElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLAnnotationElementHandler _OWLAnnotationElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLAnnotationPropertyElementHandler _OWLAnnotationPropertyElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLAnonymousIndividualElementHandler _OWLAnonymousIndividualElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLDataPropertyElementHandler _OWLDataPropertyElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLDatatypeFacetRestrictionElementHandler _OWLDatatypeFacetRestrictionElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLElementHandler<?> _OWLElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLIndividualElementHandler _OWLIndividualElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLLiteralElementHandler _OWLLiteralElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLSubObjectPropertyChainElementHandler _OWLSubObjectPropertyChainElementHandler;
    private org.coode.owlapi.owlxmlparser.OWLXMLParserHandler _OWLXMLParserHandler;
    private org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler _SWRLAtomElementHandler;
    private org.coode.owlapi.owlxmlparser.SWRLAtomListElementHandler _SWRLAtomListElementHandler;
    private org.coode.owlapi.owlxmlparser.SWRLVariableElementHandler _SWRLVariableElementHandler;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLParserException _OWLParserException;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLAxiom _OWLAxiom;
    private org.semanticweb.owlapi.model.OWLDataRange _OWLDataRange;
    private org.semanticweb.owlapi.model.OWLIndividual _OWLIndividual;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyChangeException _OWLOntologyChangeException;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.SWRLAtom _SWRLAtom;
    private org.semanticweb.owlapi.model.UnloadableImportException _UnloadableImportException;
    private org.semanticweb.owlapi.vocab.OWLXMLVocabulary _OWLXMLVocabulary;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
