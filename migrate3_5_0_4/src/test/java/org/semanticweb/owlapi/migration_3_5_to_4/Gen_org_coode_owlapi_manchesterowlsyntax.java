package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.OWLOntologyChecker;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.OWLParser;
import org.semanticweb.owlapi.mansyntax.parser.ManchesterOWLSyntaxClassFrameParser;
import org.semanticweb.owlapi.mansyntax.parser.ManchesterOWLSyntaxParserImpl;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.coode.owlapi.manchesterowlsyntax to org.semanticweb.owlapi.mansyntax.parser",
        "class visibility: org.semanticweb.owlapi.mansyntax.parser.ManchesterOWLSyntaxOntologyParser main public class",
        "utils: org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser Manchester parser interface", "method removed: ManchesterOWLSyntaxParser::parseClassFrameEOF()",
        "method removed: ManchesterOWLSyntaxParser::parseConstant(): use parseLiteral(null)",
        "method arguments: ManchesterOWLSyntaxParser::parseClassExpressionList() : boolean removed",
        "method removed: ManchesterOWLSyntaxParser::parseClassAxiom() : use parseAxiom()", })
public class Gen_org_coode_owlapi_manchesterowlsyntax {
    @Test
    public void enforceInterfacesManchesterOWLSyntaxParserImpl() {
        assertTrue(ManchesterOWLSyntaxParser.class.isAssignableFrom(ManchesterOWLSyntaxParserImpl.class));
    }

    public void verifyInterfaceManchesterOWLSyntaxParser() throws UnloadableImportException {
        ManchesterOWLSyntaxParser testSubject0 = mock(ManchesterOWLSyntaxParser.class);
        OWLAxiom testSubject1 = testSubject0.parseAxiom();
        OWLClassExpression testSubject2 = testSubject0.parseClassExpression();
        OWLLiteral testSubject4 = testSubject0.parseLiteral(mock(OWLDatatype.class));
        testSubject0.setOWLEntityChecker(mock(OWLEntityChecker.class));
        testSubject0.setOWLOntologyChecker(mock(OWLOntologyChecker.class));
        List<OWLObjectPropertyExpression> testSubject5 = testSubject0.parseObjectPropertyChain();
        ManchesterSyntaxDocumentFormat testSubject6 = testSubject0.parseOntology(mock(OWLOntology.class));
        Set<OWLClassExpression> testSubject7 = testSubject0.parseClassExpressionList();
        Set<OWLObjectPropertyExpression> testSubject8 = testSubject0.parseObjectPropertyList();
        Set<OWLClassExpression> testSubject9 = testSubject0.parseClassExpressionList();
        OWLAxiom testSubject10 = testSubject0.parseAxiom();
        OWLDataRange testSubject11 = testSubject0.parseDataRange();
        Set<OWLPropertyExpression> testSubject12 = testSubject0.parsePropertyList();
        IRI testSubject14 = testSubject0.parseVariable();
    }

    @Test
    public void enforceInterfacesManchesterOWLSyntaxClassFrameParser() {
        assertTrue(OWLParser.class.isAssignableFrom(ManchesterOWLSyntaxClassFrameParser.class));
    }
}
