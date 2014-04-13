package org.semanticweb.owlapi.verification_4_0_0;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_util_mansyntax {
    @Test
    public void enforceInterfacesManchesterOWLSyntaxParser() {
    }

    public void verifyInterfaceManchesterOWLSyntaxParser() {
        ManchesterOWLSyntaxParser testSubject0 = mock(ManchesterOWLSyntaxParser.class);
        testSubject0.setOWLEntityChecker(_OWLEntityChecker);
        java.util.List<OWLObjectPropertyExpression> result0 = testSubject0.parseObjectPropertyChain();
        OWLAxiom result1 = testSubject0.parseAxiom();
        OWLClassExpression result2 = testSubject0.parseClassExpression();
        java.util.Set<org.semanticweb.owlapi.util.OntologyAxiomPair> result3 = testSubject0.parseClassFrameEOF();
        OWLLiteral result4 = testSubject0.parseLiteral(_OWLDatatype);
        testSubject0.setOWLOntologyChecker(_OWLOntologyChecker);
        org.semanticweb.owlapi.formats.ManchesterOWLSyntaxOntologyFormat result5 = testSubject0.parseOntology(_OWLOntology);
        java.util.Set<OWLClassExpression> result6 = testSubject0.parseClassExpressionList();
        java.util.Set<OWLObjectPropertyExpression> result7 = testSubject0.parseObjectPropertyList();
        OWLDataRange result8 = testSubject0.parseDataRange();
        java.util.Set<OWLPropertyExpression> result9 = testSubject0.parsePropertyList();
        java.util.List<org.semanticweb.owlapi.util.OntologyAxiomPair> result10 = testSubject0.parseRuleFrame();
        IRI result11 = testSubject0.parseVariable();
    }

    private org.semanticweb.owlapi.expression.OWLEntityChecker _OWLEntityChecker;
    private org.semanticweb.owlapi.expression.OWLOntologyChecker _OWLOntologyChecker;
    private OWLDatatype _OWLDatatype;
    private OWLOntology _OWLOntology;
}
