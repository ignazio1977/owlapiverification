package org.semanticweb.owlapi.verification_3_5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.util.Set;

import org.coode.owlapi.owlxmlparser.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.*;
import org.xml.sax.SAXException;

@SuppressWarnings({ "javadoc", "deprecation", "unchecked", "rawtypes" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_owlxmlparser {
    @Test
    public void enforceInterfacesAbbreviatedIRIElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractIRIElementHandler.class.isAssignableFrom(AbbreviatedIRIElementHandler.class));
    }

    public void verifyAbbreviatedIRIElementHandler() throws OWLParserException, UnloadableImportException {
        AbbreviatedIRIElementHandler testSubject0 = new AbbreviatedIRIElementHandler(_OWLXMLParserHandler);
        boolean result0 = testSubject0.isTextContentPossible();
        Object result1 = testSubject0.getOWLObject();
        IRI result2 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractClassExpressionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(AbstractClassExpressionElementHandler.class));
    }

    public void verifyAbstractClassExpressionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractClassExpressionElementHandler testSubject0 = new AbstractClassExpressionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected void endClassExpressionElement() throws OWLXMLParserException {
            }
        };
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractClassExpressionFillerRestriction() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractObjectRestrictionElementHandler.class.isAssignableFrom(AbstractClassExpressionFillerRestriction.class));
    }

    public void verifyAbstractClassExpressionFillerRestriction() throws OWLParserException, UnloadableImportException {
        AbstractClassExpressionFillerRestriction testSubject0 = new AbstractClassExpressionFillerRestriction(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractClassExpressionOperandAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class.isAssignableFrom(AbstractClassExpressionOperandAxiomElementHandler.class));
    }

    public void verifyAbstractClassExpressionOperandAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractClassExpressionOperandAxiomElementHandler testSubject0 = new AbstractClassExpressionOperandAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractDataCardinalityRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRangeFillerRestrictionElementHandler.class.isAssignableFrom(AbstractDataCardinalityRestrictionElementHandler.class));
    }

    public void verifyAbstractDataCardinalityRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractDataCardinalityRestrictionElementHandler testSubject0 = new AbstractDataCardinalityRestrictionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractDataRangeFillerRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRestrictionElementHandler.class.isAssignableFrom(AbstractDataRangeFillerRestrictionElementHandler.class));
    }

    public void verifyAbstractDataRangeFillerRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractDataRangeFillerRestrictionElementHandler testSubject0 = new AbstractDataRangeFillerRestrictionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractDataRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractRestrictionElementHandler.class.isAssignableFrom(AbstractDataRestrictionElementHandler.class));
    }

    public void verifyAbstractDataRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractDataRestrictionElementHandler testSubject0 = new AbstractDataRestrictionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractElementHandlerFactory() {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLElementHandlerFactory.class.isAssignableFrom(AbstractElementHandlerFactory.class));
    }

    public void verifyAbstractElementHandlerFactory() {
        AbstractElementHandlerFactory testSubject0 = new AbstractElementHandlerFactory(_OWLXMLVocabulary) {
            @Override
            public OWLElementHandler<?> createHandler(OWLXMLParserHandler handler) {
                return null;
            }
        };
        String result0 = testSubject0.getElementName();
        org.coode.owlapi.owlxmlparser.OWLElementHandler<?> result1 = testSubject0.createHandler(_OWLXMLParserHandler);
    }

    @Test
    public void enforceInterfacesAbstractIRIElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(AbstractIRIElementHandler.class));
    }

    public void verifyAbstractIRIElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractIRIElementHandler testSubject0 = new AbstractIRIElementHandler(_OWLXMLParserHandler) {
            @Override
            public void endElement() throws OWLParserException, UnloadableImportException {
            }

            @Override
            public IRI getOWLObject() throws OWLXMLParserException {
                return null;
            }
        };
        OWLOntologyLoaderConfiguration result0 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result1 = testSubject0.isTextContentPossible();
        String result2 = testSubject0.getText();
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
        IRI result3 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result4 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        OWLObject result5 = testSubject0.getOWLObject();
        testSubject0.endElement();
    }

    @Test
    public void enforceInterfacesAbstractNaryBooleanClassExpressionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class.isAssignableFrom(AbstractNaryBooleanClassExpressionElementHandler.class));
    }

    public void verifyAbstractNaryBooleanClassExpressionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractNaryBooleanClassExpressionElementHandler testSubject0 = new AbstractNaryBooleanClassExpressionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createClassExpression(Set<OWLClassExpression> expressions) {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractObjectRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractRestrictionElementHandler.class.isAssignableFrom(AbstractObjectRestrictionElementHandler.class));
    }

    public void verifyAbstractObjectRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractObjectRestrictionElementHandler testSubject0 = new AbstractObjectRestrictionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOperandAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(AbstractOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOperandAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOperandAxiomElementHandler testSubject0 = new AbstractOperandAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(AbstractOWLAssertionAxiomElementHandler.class));
    }

    public void verifyAbstractOWLAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLAssertionAxiomElementHandler testSubject0 = new AbstractOWLAssertionAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLObject);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(AbstractOWLAxiomElementHandler.class));
    }

    public void verifyAbstractOWLAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLAxiomElementHandler testSubject0 = new AbstractOWLAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLDataPropertyAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAssertionAxiomElementHandler.class.isAssignableFrom(AbstractOWLDataPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyAbstractOWLDataPropertyAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLDataPropertyAssertionAxiomElementHandler testSubject0 = new AbstractOWLDataPropertyAssertionAxiomElementHandler(_OWLXMLParserHandler) {
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
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLLiteral);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLDataPropertyOperandAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class.isAssignableFrom(AbstractOWLDataPropertyOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOWLDataPropertyOperandAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLDataPropertyOperandAxiomElementHandler testSubject0 = new AbstractOWLDataPropertyOperandAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLDataRangeHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(AbstractOWLDataRangeHandler.class));
    }

    public void verifyAbstractOWLDataRangeHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLDataRangeHandler testSubject0 = new AbstractOWLDataRangeHandler(_OWLXMLParserHandler) {
            @Override
            protected void endDataRangeElement() throws OWLXMLParserException {
            }
        };
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLElementHandler.class.isAssignableFrom(AbstractOWLElementHandler.class));
    }

    public void verifyAbstractOWLElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLElementHandler<OWLObject> testSubject0 = new AbstractOWLElementHandler(_OWLXMLParserHandler) {
            @Override
            public void endElement() throws OWLParserException, UnloadableImportException {
            }

            @Override
            public Object getOWLObject() throws OWLXMLParserException {
                return null;
            }
        };
        OWLOntologyLoaderConfiguration result0 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result1 = testSubject0.isTextContentPossible();
        String result2 = testSubject0.getText();
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
        IRI result3 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result4 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        OWLObject result5 = testSubject0.getOWLObject();
        testSubject0.endElement();
    }

    @Test
    public void enforceInterfacesAbstractOWLIndividualOperandAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class.isAssignableFrom(AbstractOWLIndividualOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOWLIndividualOperandAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLIndividualOperandAxiomElementHandler testSubject0 = new AbstractOWLIndividualOperandAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionFillerRestriction.class.isAssignableFrom(AbstractOWLObjectCardinalityElementHandler.class));
    }

    public void verifyAbstractOWLObjectCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLObjectCardinalityElementHandler testSubject0 = new AbstractOWLObjectCardinalityElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createCardinalityRestriction() {
                return null;
            }
        };
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAssertionAxiomElementHandler.class.isAssignableFrom(AbstractOWLObjectPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLObjectPropertyAssertionAxiomElementHandler testSubject0 = new AbstractOWLObjectPropertyAssertionAxiomElementHandler(_OWLXMLParserHandler) {
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
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLIndividual);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyCharacteristicAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyCharacteristicAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLObjectPropertyCharacteristicAxiomElementHandler testSubject0 = new AbstractOWLObjectPropertyCharacteristicAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createPropertyCharacteristicAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(AbstractOWLObjectPropertyElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLObjectPropertyElementHandler testSubject0 = new AbstractOWLObjectPropertyElementHandler(_OWLXMLParserHandler) {
            @Override
            protected void endObjectPropertyElement() throws OWLXMLParserException {
            }
        };
        Object result0 = testSubject0.getOWLObject();
        OWLObjectPropertyExpression result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLObjectPropertyOperandAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOperandAxiomElementHandler.class.isAssignableFrom(AbstractOWLObjectPropertyOperandAxiomElementHandler.class));
    }

    public void verifyAbstractOWLObjectPropertyOperandAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLObjectPropertyOperandAxiomElementHandler testSubject0 = new AbstractOWLObjectPropertyOperandAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractOWLPropertyCharacteristicAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(AbstractOWLPropertyCharacteristicAxiomElementHandler.class));
    }

    public void verifyAbstractOWLPropertyCharacteristicAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractOWLPropertyCharacteristicAxiomElementHandler testSubject0 = new AbstractOWLPropertyCharacteristicAxiomElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLAxiom createPropertyCharacteristicAxiom() throws OWLXMLParserException {
                return null;
            }
        };
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesAbstractRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class.isAssignableFrom(AbstractRestrictionElementHandler.class));
    }

    public void verifyAbstractRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        AbstractRestrictionElementHandler testSubject0 = new AbstractRestrictionElementHandler(_OWLXMLParserHandler) {
            @Override
            protected OWLClassExpression createRestriction() {
                return null;
            }
        };
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesIRIElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractIRIElementHandler.class.isAssignableFrom(IRIElementHandler.class));
    }

    public void verifyIRIElementHandler() throws OWLParserException, UnloadableImportException {
        IRIElementHandler testSubject0 = new IRIElementHandler(_OWLXMLParserHandler);
        boolean result0 = testSubject0.isTextContentPossible();
        Object result1 = testSubject0.getOWLObject();
        IRI result2 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesLegacyEntityAnnotationElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(LegacyEntityAnnotationElementHandler.class));
    }

    public void verifyLegacyEntityAnnotationElementHandler() throws OWLParserException, UnloadableImportException {
        LegacyEntityAnnotationElementHandler testSubject0 = new LegacyEntityAnnotationElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationAssertionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLAnnotationAssertionElementHandler.class));
    }

    public void verifyOWLAnnotationAssertionElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAnnotationAssertionElementHandler testSubject0 = new OWLAnnotationAssertionElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLAnnotationElementHandler.class));
    }

    public void verifyOWLAnnotationElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAnnotationElementHandler testSubject0 = new OWLAnnotationElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        boolean result0 = testSubject0.isTextContentPossible();
        OWLAnnotation result1 = testSubject0.getOWLObject();
        Object result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyDomainElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLAnnotationPropertyDomainElementHandler.class));
    }

    public void verifyOWLAnnotationPropertyDomainElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAnnotationPropertyDomainElementHandler testSubject0 = new OWLAnnotationPropertyDomainElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLAnnotationPropertyElementHandler.class));
    }

    public void verifyOWLAnnotationPropertyElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAnnotationPropertyElementHandler testSubject0 = new OWLAnnotationPropertyElementHandler(_OWLXMLParserHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLAnnotationProperty result1 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnnotationPropertyRangeElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLAnnotationPropertyRangeElementHandler.class));
    }

    public void verifyOWLAnnotationPropertyRangeElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAnnotationPropertyRangeElementHandler testSubject0 = new OWLAnnotationPropertyRangeElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAnonymousIndividualElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLAnonymousIndividualElementHandler.class));
    }

    public void verifyOWLAnonymousIndividualElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAnonymousIndividualElementHandler testSubject0 = new OWLAnonymousIndividualElementHandler(_OWLXMLParserHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLAnonymousIndividual result1 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLAsymmetricObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLAsymmetricObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAsymmetricObjectPropertyAxiomElementHandler testSubject0 = new OWLAsymmetricObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLAsymmetricObjectPropertyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class.isAssignableFrom(OWLAsymmetricObjectPropertyElementHandler.class));
    }

    public void verifyOWLAsymmetricObjectPropertyElementHandler() throws OWLParserException, UnloadableImportException {
        OWLAsymmetricObjectPropertyElementHandler testSubject0 = new OWLAsymmetricObjectPropertyElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLClassAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLClassAssertionAxiomElementHandler.class));
    }

    public void verifyOWLClassAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLClassAssertionAxiomElementHandler testSubject0 = new OWLClassAssertionAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLClassElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class.isAssignableFrom(OWLClassElementHandler.class));
    }

    public void verifyOWLClassElementHandler() throws OWLParserException, UnloadableImportException {
        OWLClassElementHandler testSubject0 = new OWLClassElementHandler(_OWLXMLParserHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endClassExpressionElement();
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataAllValuesFromElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRangeFillerRestrictionElementHandler.class.isAssignableFrom(OWLDataAllValuesFromElementHandler.class));
    }

    public void verifyOWLDataAllValuesFromElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataAllValuesFromElementHandler testSubject0 = new OWLDataAllValuesFromElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataComplementOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDataComplementOfElementHandler.class));
    }

    public void verifyOWLDataComplementOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataComplementOfElementHandler testSubject0 = new OWLDataComplementOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataExactCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataCardinalityRestrictionElementHandler.class.isAssignableFrom(OWLDataExactCardinalityElementHandler.class));
    }

    public void verifyOWLDataExactCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataExactCardinalityElementHandler testSubject0 = new OWLDataExactCardinalityElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataHasValueElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRestrictionElementHandler.class.isAssignableFrom(OWLDataHasValueElementHandler.class));
    }

    public void verifyOWLDataHasValueElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataHasValueElementHandler testSubject0 = new OWLDataHasValueElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataIntersectionOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDataIntersectionOfElementHandler.class));
    }

    public void verifyOWLDataIntersectionOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataIntersectionOfElementHandler testSubject0 = new OWLDataIntersectionOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataMaxCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataCardinalityRestrictionElementHandler.class.isAssignableFrom(OWLDataMaxCardinalityElementHandler.class));
    }

    public void verifyOWLDataMaxCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataMaxCardinalityElementHandler testSubject0 = new OWLDataMaxCardinalityElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataMinCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataCardinalityRestrictionElementHandler.class.isAssignableFrom(OWLDataMinCardinalityElementHandler.class));
    }

    public void verifyOWLDataMinCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataMinCardinalityElementHandler testSubject0 = new OWLDataMinCardinalityElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataOneOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDataOneOfElementHandler.class));
    }

    public void verifyOWLDataOneOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataOneOfElementHandler testSubject0 = new OWLDataOneOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyAssertionAxiomElementHandler.class.isAssignableFrom(OWLDataPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLDataPropertyAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataPropertyAssertionAxiomElementHandler testSubject0 = new OWLDataPropertyAssertionAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLLiteral);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyDomainAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLDataPropertyDomainAxiomElementHandler.class));
    }

    public void verifyOWLDataPropertyDomainAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataPropertyDomainAxiomElementHandler testSubject0 = new OWLDataPropertyDomainAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLDataPropertyElementHandler.class));
    }

    public void verifyOWLDataPropertyElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataPropertyElementHandler testSubject0 = new OWLDataPropertyElementHandler(_OWLXMLParserHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLDataPropertyExpression result1 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataPropertyRangeAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLDataPropertyRangeAxiomElementHandler.class));
    }

    public void verifyOWLDataPropertyRangeAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataPropertyRangeAxiomElementHandler testSubject0 = new OWLDataPropertyRangeAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDataRestrictionElementHandler.class));
    }

    public void verifyOWLDataRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataRestrictionElementHandler testSubject0 = new OWLDataRestrictionElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.attribute(_String, _String);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataSomeValuesFromElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractDataRangeFillerRestrictionElementHandler.class.isAssignableFrom(OWLDataSomeValuesFromElementHandler.class));
    }

    public void verifyOWLDataSomeValuesFromElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataSomeValuesFromElementHandler testSubject0 = new OWLDataSomeValuesFromElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeDefinitionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLDatatypeDefinitionElementHandler.class));
    }

    public void verifyOWLDatatypeDefinitionElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDatatypeDefinitionElementHandler testSubject0 = new OWLDatatypeDefinitionElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDatatypeElementHandler.class));
    }

    public void verifyOWLDatatypeElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDatatypeElementHandler testSubject0 = new OWLDatatypeElementHandler(_OWLXMLParserHandler);
        testSubject0.attribute(_String, _String);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeFacetRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLDatatypeFacetRestrictionElementHandler.class));
    }

    public void verifyOWLDatatypeFacetRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDatatypeFacetRestrictionElementHandler testSubject0 = new OWLDatatypeFacetRestrictionElementHandler(_OWLXMLParserHandler);
        OWLFacetRestriction result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDatatypeRestrictionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDatatypeRestrictionElementHandler.class));
    }

    public void verifyOWLDatatypeRestrictionElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDatatypeRestrictionElementHandler testSubject0 = new OWLDatatypeRestrictionElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDataUnionOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataRangeHandler.class.isAssignableFrom(OWLDataUnionOfElementHandler.class));
    }

    public void verifyOWLDataUnionOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDataUnionOfElementHandler testSubject0 = new OWLDataUnionOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLDataRange result1 = testSubject0.getOWLObject();
        testSubject0.setDataRange(_OWLDataRange);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDeclarationAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLDeclarationAxiomElementHandler.class));
    }

    public void verifyOWLDeclarationAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDeclarationAxiomElementHandler testSubject0 = new OWLDeclarationAxiomElementHandler(_OWLXMLParserHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getEntityAnnotations();
        testSubject0.startElement(_String);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<OWLAnnotation> result1 = testSubject0.getAnnotations();
        Object result2 = testSubject0.getOWLObject();
        OWLAxiom result3 = testSubject0.getOWLObject();
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result4 = testSubject0.getConfiguration();
        boolean result5 = testSubject0.isTextContentPossible();
        String result6 = testSubject0.getText();
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        testSubject0.handleChild(_OWLDatatypeFacetRestrictionElementHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractIRIElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        IRI result7 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result8 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDifferentIndividualsAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLIndividualOperandAxiomElementHandler.class.isAssignableFrom(OWLDifferentIndividualsAxiomElementHandler.class));
    }

    public void verifyOWLDifferentIndividualsAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDifferentIndividualsAxiomElementHandler testSubject0 = new OWLDifferentIndividualsAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointClassesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionOperandAxiomElementHandler.class.isAssignableFrom(OWLDisjointClassesAxiomElementHandler.class));
    }

    public void verifyOWLDisjointClassesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDisjointClassesAxiomElementHandler testSubject0 = new OWLDisjointClassesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointDataPropertiesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyOperandAxiomElementHandler.class.isAssignableFrom(OWLDisjointDataPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLDisjointDataPropertiesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDisjointDataPropertiesAxiomElementHandler testSubject0 = new OWLDisjointDataPropertiesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointObjectPropertiesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyOperandAxiomElementHandler.class.isAssignableFrom(OWLDisjointObjectPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLDisjointObjectPropertiesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDisjointObjectPropertiesAxiomElementHandler testSubject0 = new OWLDisjointObjectPropertiesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLDisjointUnionElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLDisjointUnionElementHandler.class));
    }

    public void verifyOWLDisjointUnionElementHandler() throws OWLParserException, UnloadableImportException {
        OWLDisjointUnionElementHandler testSubject0 = new OWLDisjointUnionElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    public void verifyInterfaceOWLElementHandler() throws OWLParserException, UnloadableImportException {
        OWLElementHandler<OWLObject> testSubject0 = mock(OWLElementHandler.class);
        testSubject0.startElement(_String);
        boolean result0 = testSubject0.isTextContentPossible();
        OWLObject result1 = testSubject0.getOWLObject();
        String result2 = testSubject0.getText();
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

    public void verifyInterfaceOWLElementHandlerFactory() {
        OWLElementHandlerFactory testSubject0 = mock(OWLElementHandlerFactory.class);
        String result0 = testSubject0.getElementName();
        org.coode.owlapi.owlxmlparser.OWLElementHandler<?> result1 = testSubject0.createHandler(_OWLXMLParserHandler);
    }

    @Test
    public void enforceInterfacesOWLEquivalentClassesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionOperandAxiomElementHandler.class.isAssignableFrom(OWLEquivalentClassesAxiomElementHandler.class));
    }

    public void verifyOWLEquivalentClassesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLEquivalentClassesAxiomElementHandler testSubject0 = new OWLEquivalentClassesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLEquivalentDataPropertiesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyOperandAxiomElementHandler.class.isAssignableFrom(OWLEquivalentDataPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLEquivalentDataPropertiesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLEquivalentDataPropertiesAxiomElementHandler testSubject0 = new OWLEquivalentDataPropertiesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLEquivalentObjectPropertiesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyOperandAxiomElementHandler.class.isAssignableFrom(OWLEquivalentObjectPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLEquivalentObjectPropertiesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLEquivalentObjectPropertiesAxiomElementHandler testSubject0 = new OWLEquivalentObjectPropertiesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLFunctionalDataPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLPropertyCharacteristicAxiomElementHandler.class.isAssignableFrom(OWLFunctionalDataPropertyAxiomElementHandler.class));
    }

    public void verifyOWLFunctionalDataPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLFunctionalDataPropertyAxiomElementHandler testSubject0 = new OWLFunctionalDataPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLFunctionalObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLFunctionalObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLFunctionalObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLFunctionalObjectPropertyAxiomElementHandler testSubject0 = new OWLFunctionalObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLHasKeyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLHasKeyElementHandler.class));
    }

    public void verifyOWLHasKeyElementHandler() throws OWLParserException, UnloadableImportException {
        OWLHasKeyElementHandler testSubject0 = new OWLHasKeyElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLImportsHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLImportsHandler.class));
    }

    public void verifyOWLImportsHandler() throws OWLParserException, UnloadableImportException {
        OWLImportsHandler testSubject0 = new OWLImportsHandler(_OWLXMLParserHandler);
        boolean result0 = testSubject0.isTextContentPossible();
        Object result1 = testSubject0.getOWLObject();
        OWLOntology result2 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLIndividualElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLIndividualElementHandler.class));
    }

    public void verifyOWLIndividualElementHandler() throws OWLParserException, UnloadableImportException {
        OWLIndividualElementHandler testSubject0 = new OWLIndividualElementHandler(_OWLXMLParserHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLNamedIndividual result1 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLInverseFunctionalObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLInverseFunctionalObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLInverseFunctionalObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLInverseFunctionalObjectPropertyAxiomElementHandler testSubject0 = new OWLInverseFunctionalObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertiesAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyOperandAxiomElementHandler.class.isAssignableFrom(OWLInverseObjectPropertiesAxiomElementHandler.class));
    }

    public void verifyOWLInverseObjectPropertiesAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLInverseObjectPropertiesAxiomElementHandler testSubject0 = new OWLInverseObjectPropertiesAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLInverseObjectPropertyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyElementHandler.class.isAssignableFrom(OWLInverseObjectPropertyElementHandler.class));
    }

    public void verifyOWLInverseObjectPropertyElementHandler() throws OWLParserException, UnloadableImportException {
        OWLInverseObjectPropertyElementHandler testSubject0 = new OWLInverseObjectPropertyElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        Object result0 = testSubject0.getOWLObject();
        OWLObjectPropertyExpression result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLIrreflexiveObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLIrreflexiveObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLIrreflexiveObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLIrreflexiveObjectPropertyAxiomElementHandler testSubject0 = new OWLIrreflexiveObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLLiteralElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLLiteralElementHandler.class));
    }

    public void verifyOWLLiteralElementHandler() throws OWLParserException, UnloadableImportException {
        OWLLiteralElementHandler testSubject0 = new OWLLiteralElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        boolean result0 = testSubject0.isTextContentPossible();
        OWLLiteral result1 = testSubject0.getOWLObject();
        Object result2 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLNegativeDataPropertyAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLDataPropertyAssertionAxiomElementHandler.class
                .isAssignableFrom(OWLNegativeDataPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLNegativeDataPropertyAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLNegativeDataPropertyAssertionAxiomElementHandler testSubject0 = new OWLNegativeDataPropertyAssertionAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLDataPropertyExpression);
        OWLDataPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLLiteral);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLNegativeObjectPropertyAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyAssertionAxiomElementHandler.class
                .isAssignableFrom(OWLNegativeObjectPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLNegativeObjectPropertyAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLNegativeObjectPropertyAssertionAxiomElementHandler testSubject0 = new OWLNegativeObjectPropertyAssertionAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLIndividual);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectAllValuesFromElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionFillerRestriction.class.isAssignableFrom(OWLObjectAllValuesFromElementHandler.class));
    }

    public void verifyOWLObjectAllValuesFromElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectAllValuesFromElementHandler testSubject0 = new OWLObjectAllValuesFromElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectComplementOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class.isAssignableFrom(OWLObjectComplementOfElementHandler.class));
    }

    public void verifyOWLObjectComplementOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectComplementOfElementHandler testSubject0 = new OWLObjectComplementOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectExactCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectCardinalityElementHandler.class.isAssignableFrom(OWLObjectExactCardinalityElementHandler.class));
    }

    public void verifyOWLObjectExactCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectExactCardinalityElementHandler testSubject0 = new OWLObjectExactCardinalityElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectExistsSelfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class.isAssignableFrom(OWLObjectExistsSelfElementHandler.class));
    }

    public void verifyOWLObjectExistsSelfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectExistsSelfElementHandler testSubject0 = new OWLObjectExistsSelfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectHasValueElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractObjectRestrictionElementHandler.class.isAssignableFrom(OWLObjectHasValueElementHandler.class));
    }

    public void verifyOWLObjectHasValueElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectHasValueElementHandler testSubject0 = new OWLObjectHasValueElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectIntersectionOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractNaryBooleanClassExpressionElementHandler.class.isAssignableFrom(OWLObjectIntersectionOfElementHandler.class));
    }

    public void verifyOWLObjectIntersectionOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectIntersectionOfElementHandler testSubject0 = new OWLObjectIntersectionOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectMaxCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectCardinalityElementHandler.class.isAssignableFrom(OWLObjectMaxCardinalityElementHandler.class));
    }

    public void verifyOWLObjectMaxCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectMaxCardinalityElementHandler testSubject0 = new OWLObjectMaxCardinalityElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectMinCardinalityElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectCardinalityElementHandler.class.isAssignableFrom(OWLObjectMinCardinalityElementHandler.class));
    }

    public void verifyOWLObjectMinCardinalityElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectMinCardinalityElementHandler testSubject0 = new OWLObjectMinCardinalityElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectOneOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionElementHandler.class.isAssignableFrom(OWLObjectOneOfElementHandler.class));
    }

    public void verifyOWLObjectOneOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectOneOfElementHandler testSubject0 = new OWLObjectOneOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyAssertionAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyAssertionAxiomElementHandler.class.isAssignableFrom(OWLObjectPropertyAssertionAxiomElementHandler.class));
    }

    public void verifyOWLObjectPropertyAssertionAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectPropertyAssertionAxiomElementHandler testSubject0 = new OWLObjectPropertyAssertionAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.setProperty(_OWLObjectPropertyExpression);
        OWLObjectPropertyExpression result0 = testSubject0.getProperty();
        OWLObject result1 = testSubject0.getObject();
        OWLIndividual result2 = testSubject0.getSubject();
        testSubject0.setSubject(_OWLIndividual);
        testSubject0.setObject(_OWLIndividual);
        java.util.Set<OWLAnnotation> result3 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result4 = testSubject0.getOWLObject();
        OWLAxiom result5 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result6 = testSubject0.getConfiguration();
        boolean result7 = testSubject0.isTextContentPossible();
        String result8 = testSubject0.getText();
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
        IRI result9 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result10 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyDomainElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLObjectPropertyDomainElementHandler.class));
    }

    public void verifyOWLObjectPropertyDomainElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectPropertyDomainElementHandler testSubject0 = new OWLObjectPropertyDomainElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyElementHandler.class.isAssignableFrom(OWLObjectPropertyElementHandler.class));
    }

    public void verifyOWLObjectPropertyElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectPropertyElementHandler testSubject0 = new OWLObjectPropertyElementHandler(_OWLXMLParserHandler);
        testSubject0.attribute(_String, _String);
        Object result0 = testSubject0.getOWLObject();
        OWLObjectPropertyExpression result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectPropertyRangeAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLObjectPropertyRangeAxiomElementHandler.class));
    }

    public void verifyOWLObjectPropertyRangeAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectPropertyRangeAxiomElementHandler testSubject0 = new OWLObjectPropertyRangeAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectSomeValuesFromElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractClassExpressionFillerRestriction.class.isAssignableFrom(OWLObjectSomeValuesFromElementHandler.class));
    }

    public void verifyOWLObjectSomeValuesFromElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectSomeValuesFromElementHandler testSubject0 = new OWLObjectSomeValuesFromElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLObjectUnionOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractNaryBooleanClassExpressionElementHandler.class.isAssignableFrom(OWLObjectUnionOfElementHandler.class));
    }

    public void verifyOWLObjectUnionOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLObjectUnionOfElementHandler testSubject0 = new OWLObjectUnionOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLOntologyHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLOntologyHandler.class));
    }

    public void verifyOWLOntologyHandler() throws OWLParserException, UnloadableImportException {
        OWLOntologyHandler testSubject0 = new OWLOntologyHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        Object result0 = testSubject0.getOWLObject();
        OWLOntology result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.handleChild(_AbstractOWLAxiomElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLReflexiveObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLReflexiveObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLReflexiveObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLReflexiveObjectPropertyAxiomElementHandler testSubject0 = new OWLReflexiveObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSameIndividualsAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLIndividualOperandAxiomElementHandler.class.isAssignableFrom(OWLSameIndividualsAxiomElementHandler.class));
    }

    public void verifyOWLSameIndividualsAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSameIndividualsAxiomElementHandler testSubject0 = new OWLSameIndividualsAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.startElement(_String);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubAnnotationPropertyOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLSubAnnotationPropertyOfElementHandler.class));
    }

    public void verifyOWLSubAnnotationPropertyOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSubAnnotationPropertyOfElementHandler testSubject0 = new OWLSubAnnotationPropertyOfElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLAnnotationPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubClassAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLSubClassAxiomElementHandler.class));
    }

    public void verifyOWLSubClassAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSubClassAxiomElementHandler testSubject0 = new OWLSubClassAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.startElement(_String);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubDataPropertyOfAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLSubDataPropertyOfAxiomElementHandler.class));
    }

    public void verifyOWLSubDataPropertyOfAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSubDataPropertyOfAxiomElementHandler testSubject0 = new OWLSubDataPropertyOfAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyChainElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLSubObjectPropertyChainElementHandler.class));
    }

    public void verifyOWLSubObjectPropertyChainElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSubObjectPropertyChainElementHandler testSubject0 = new OWLSubObjectPropertyChainElementHandler(_OWLXMLParserHandler);
        Object result0 = testSubject0.getOWLObject();
        java.util.List<OWLObjectPropertyExpression> result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSubObjectPropertyOfAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(OWLSubObjectPropertyOfAxiomElementHandler.class));
    }

    public void verifyOWLSubObjectPropertyOfAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSubObjectPropertyOfAxiomElementHandler testSubject0 = new OWLSubObjectPropertyOfAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.handleChild(_OWLSubObjectPropertyChainElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLSymmetricObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLSymmetricObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLSymmetricObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLSymmetricObjectPropertyAxiomElementHandler testSubject0 = new OWLSymmetricObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLTransitiveObjectPropertyAxiomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLObjectPropertyCharacteristicAxiomElementHandler.class
                .isAssignableFrom(OWLTransitiveObjectPropertyAxiomElementHandler.class));
    }

    public void verifyOWLTransitiveObjectPropertyAxiomElementHandler() throws OWLParserException, UnloadableImportException {
        OWLTransitiveObjectPropertyAxiomElementHandler testSubject0 = new OWLTransitiveObjectPropertyAxiomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.setProperty(_OWLObject27);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLUnionOfElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(OWLUnionOfElementHandler.class));
    }

    public void verifyOWLUnionOfElementHandler() throws OWLParserException, UnloadableImportException {
        OWLUnionOfElementHandler testSubject0 = new OWLUnionOfElementHandler(_OWLXMLParserHandler);
        OWLClassExpression result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesOWLXMLParser() {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class.isAssignableFrom(OWLXMLParser.class));
    }

    public void verifyOWLXMLParser() throws OWLParserException, UnloadableImportException, IOException {
        OWLXMLParser testSubject0 = new OWLXMLParser();
        OWLOntologyFormat result0 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result1 = testSubject0.parse(_OWLOntologyDocumentSource, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result2 = testSubject0.parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result3 = testSubject0.getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesOWLXMLParserAttributeNotFoundException() {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLXMLParserException.class.isAssignableFrom(OWLXMLParserAttributeNotFoundException.class));
    }

    public void verifyOWLXMLParserAttributeNotFoundException() {
        OWLXMLParserAttributeNotFoundException testSubject0 = new OWLXMLParserAttributeNotFoundException(_int, _int, _String);
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
    public void enforceInterfacesOWLXMLParserElementNotFoundException() {
        assertTrue(org.coode.owlapi.owlxmlparser.OWLXMLParserException.class.isAssignableFrom(OWLXMLParserElementNotFoundException.class));
    }

    public void verifyOWLXMLParserElementNotFoundException() {
        OWLXMLParserElementNotFoundException testSubject0 = new OWLXMLParserElementNotFoundException(_int, _int, _String);
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
    public void enforceInterfacesOWLXMLParserException() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class.isAssignableFrom(OWLXMLParserException.class));
    }

    public void verifyOWLXMLParserException() {
        OWLXMLParserException testSubject0 = new OWLXMLParserException(_String, _int, _int);
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
    public void enforceInterfacesOWLXMLParserException2SAXExceptionTranslation() {
    }

    @Test
    public void enforceInterfacesOWLXMLParserFactory() {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class.isAssignableFrom(OWLXMLParserFactory.class));
    }

    public void verifyOWLXMLParserFactory() {
        OWLXMLParserFactory testSubject0 = new OWLXMLParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0.createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOWLXMLParserHandler() {
        assertTrue(org.xml.sax.helpers.DefaultHandler.class.isAssignableFrom(OWLXMLParserHandler.class));
    }

    public void verifyOWLXMLParserHandler() throws IOException, SAXException {
        OWLXMLParserHandler testSubject0 = new OWLXMLParserHandler(_OWLOntologyManager, _OWLOntology, _OWLElementHandler);
        OWLXMLParserHandler testSubject1 = new OWLXMLParserHandler(_OWLOntology, _OWLElementHandler);
        OWLXMLParserHandler testSubject2 = new OWLXMLParserHandler(_OWLOntology, _OWLElementHandler, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject3 = new OWLXMLParserHandler(_OWLOntologyManager, _OWLOntology, _OWLElementHandler, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject4 = new OWLXMLParserHandler(_OWLOntology);
        OWLXMLParserHandler testSubject5 = new OWLXMLParserHandler(_OWLOntologyManager, _OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject6 = new OWLXMLParserHandler(_OWLOntology, _OWLOntologyLoaderConfiguration);
        OWLXMLParserHandler testSubject7 = new OWLXMLParserHandler(_OWLOntologyManager, _OWLOntology);
        int result0 = testSubject0.getLineNumber();
        int result1 = testSubject0.getColumnNumber();
        java.util.Map<String, String> result2 = testSubject0.getPrefixName2PrefixMap();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        OWLOntology result4 = testSubject0.getOntology();
        OWLDataFactory result5 = testSubject0.getDataFactory();
        OWLOntologyManager result6 = testSubject0.getOWLOntologyManager();
        IRI result7 = testSubject0.getIRI(_String);
        testSubject0.startElement(_String, _String, _String, _Attributes);
        IRI result8 = testSubject0.getAbbreviatedIRI(_String);
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
    public void enforceInterfacesSWRLAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(SWRLAtomElementHandler.class));
    }

    public void verifySWRLAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLAtomElementHandler testSubject0 = new SWRLAtomElementHandler(_OWLXMLParserHandler) {
            @Override
            public void endElement() throws OWLParserException, UnloadableImportException {
            }
        };
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
        testSubject0.endElement();
    }

    @Test
    public void enforceInterfacesSWRLAtomListElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(SWRLAtomListElementHandler.class));
    }

    public void verifySWRLAtomListElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLAtomListElementHandler testSubject0 = mock(SWRLAtomListElementHandler.class);
        Object result0 = testSubject0.getOWLObject();
        java.util.List<SWRLAtom> result1 = testSubject0.getOWLObject();
        testSubject0.handleChild(_SWRLAtomElementHandler);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLBuiltInAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLBuiltInAtomElementHandler.class));
    }

    public void verifySWRLBuiltInAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLBuiltInAtomElementHandler testSubject0 = new SWRLBuiltInAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLClassAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLClassAtomElementHandler.class));
    }

    public void verifySWRLClassAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLClassAtomElementHandler testSubject0 = new SWRLClassAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_AbstractClassExpressionElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLDataPropertyAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLDataPropertyAtomElementHandler.class));
    }

    public void verifySWRLDataPropertyAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLDataPropertyAtomElementHandler testSubject0 = new SWRLDataPropertyAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_OWLAnonymousIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_OWLDataPropertyElementHandler);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLDataRangeAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLDataRangeAtomElementHandler.class));
    }

    public void verifySWRLDataRangeAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLDataRangeAtomElementHandler testSubject0 = new SWRLDataRangeAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLLiteralElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractOWLDataRangeHandler);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLDifferentIndividualsAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLDifferentIndividualsAtomElementHandler.class));
    }

    public void verifySWRLDifferentIndividualsAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLDifferentIndividualsAtomElementHandler testSubject0 = new SWRLDifferentIndividualsAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLObjectPropertyAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLObjectPropertyAtomElementHandler.class));
    }

    public void verifySWRLObjectPropertyAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLObjectPropertyAtomElementHandler testSubject0 = new SWRLObjectPropertyAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.handleChild(_AbstractOWLObjectPropertyElementHandler);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLRuleElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLAxiomElementHandler.class.isAssignableFrom(SWRLRuleElementHandler.class));
    }

    public void verifySWRLRuleElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLRuleElementHandler testSubject0 = new SWRLRuleElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_SWRLAtomListElementHandler);
        java.util.Set<OWLAnnotation> result0 = testSubject0.getAnnotations();
        testSubject0.startElement(_String);
        Object result1 = testSubject0.getOWLObject();
        OWLAxiom result2 = testSubject0.getOWLObject();
        testSubject0.handleChild(_OWLAnnotationElementHandler);
        testSubject0.setAxiom(_OWLAxiom);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result3 = testSubject0.getConfiguration();
        boolean result4 = testSubject0.isTextContentPossible();
        String result5 = testSubject0.getText();
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
        IRI result6 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result7 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLSameIndividualAtomElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.SWRLAtomElementHandler.class.isAssignableFrom(SWRLSameIndividualAtomElementHandler.class));
    }

    public void verifySWRLSameIndividualAtomElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLSameIndividualAtomElementHandler testSubject0 = new SWRLSameIndividualAtomElementHandler(_OWLXMLParserHandler);
        testSubject0.handleChild(_OWLIndividualElementHandler);
        testSubject0.handleChild(_SWRLVariableElementHandler);
        testSubject0.endElement();
        Object result0 = testSubject0.getOWLObject();
        SWRLAtom result1 = testSubject0.getOWLObject();
        testSubject0.setAtom(_SWRLAtom);
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.attribute(_String, _String);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesSWRLVariableElementHandler() {
        assertTrue(org.coode.owlapi.owlxmlparser.AbstractOWLElementHandler.class.isAssignableFrom(SWRLVariableElementHandler.class));
    }

    public void verifySWRLVariableElementHandler() throws OWLParserException, UnloadableImportException {
        SWRLVariableElementHandler testSubject0 = new SWRLVariableElementHandler(_OWLXMLParserHandler) {
        };
        SWRLVariable result0 = testSubject0.getOWLObject();
        Object result1 = testSubject0.getOWLObject();
        testSubject0.attribute(_String, _String);
        testSubject0.endElement();
        OWLOntologyLoaderConfiguration result2 = testSubject0.getConfiguration();
        testSubject0.startElement(_String);
        boolean result3 = testSubject0.isTextContentPossible();
        String result4 = testSubject0.getText();
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
        IRI result5 = testSubject0.getIRIFromAttribute(_String, _String);
        IRI result6 = testSubject0.getIRIFromElement(_String, _String);
        testSubject0.setParentHandler(_OWLElementHandler);
        testSubject0.handleChars(_char_array, _int, _int);
    }

    @Test
    public void enforceInterfacesTranslatedOWLOntologyChangeException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(TranslatedOWLOntologyChangeException.class));
    }

    public void verifyTranslatedOWLOntologyChangeException() {
        TranslatedOWLOntologyChangeException testSubject0 = new TranslatedOWLOntologyChangeException(_OWLOntologyChangeException);
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
    public void enforceInterfacesTranslatedOWLParserException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(TranslatedOWLParserException.class));
    }

    public void verifyTranslatedOWLParserException() {
        TranslatedOWLParserException testSubject0 = new TranslatedOWLParserException(_OWLParserException);
        org.semanticweb.owlapi.io.OWLParserException result0 = testSubject0.getParserException();
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
    public void enforceInterfacesTranslatedUnloadableImportException() {
        assertTrue(org.xml.sax.SAXException.class.isAssignableFrom(TranslatedUnloadableImportException.class));
    }

    public void verifyTranslatedUnloadableImportException() {
        TranslatedUnloadableImportException testSubject0 = new TranslatedUnloadableImportException(_UnloadableImportException);
        UnloadableImportException result0 = testSubject0.getUnloadableImportException();
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

    private static class P {
    }

    private OWLObject _OWLObject;
    private OWLLiteral _OWLLiteral;
    private OWLObjectPropertyExpression _OWLObject27;
    private OWLObjectPropertyExpression _OWLObjectPropertyExpression;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private char[] _char_array;
    private int _int;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private Throwable _Throwable;
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
    private IRI _IRI;
    private OWLAxiom _OWLAxiom;
    private OWLDataRange _OWLDataRange;
    private OWLIndividual _OWLIndividual;
    private OWLOntology _OWLOntology;
    private OWLOntologyChangeException _OWLOntologyChangeException;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private SWRLAtom _SWRLAtom;
    private UnloadableImportException _UnloadableImportException;
    private org.semanticweb.owlapi.vocab.OWLXMLVocabulary _OWLXMLVocabulary;
    private org.xml.sax.Attributes _Attributes;
    private org.xml.sax.Locator _Locator;
    private org.xml.sax.SAXParseException _SAXParseException;
}
