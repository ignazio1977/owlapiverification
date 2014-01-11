package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.functionalparser.JJTOWLFunctionalSyntaxParserState;
import org.coode.owlapi.functionalparser.JavaCharStream;
import org.coode.owlapi.functionalparser.Node;
import org.coode.owlapi.functionalparser.OWLFunctionalSyntaxOWLParser;
import org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParser;
import org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserConstants;
import org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserFactory;
import org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserTokenManager;
import org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserTreeConstants;
import org.coode.owlapi.functionalparser.ParseException;
import org.coode.owlapi.functionalparser.SimpleNode;
import org.coode.owlapi.functionalparser.Token;
import org.coode.owlapi.functionalparser.TokenMgrError;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "unused", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_functionalparser {
    @Test
    public void enforceInterfacesJavaCharStream() throws Exception {
        assertTrue(uk.ac.manchester.cs.BOMSafeJavaCharStream.class
                .isAssignableFrom(JavaCharStream.class));
    }

    public void verifyJavaCharStream() throws Exception {
        JavaCharStream testSubject0 = new JavaCharStream(_Reader, _int, _int);
        JavaCharStream testSubject1 = new JavaCharStream(_InputStream, _String, _int,
                _int);
        char result0 = testSubject0.readChar();
        testSubject0.backup(_int);
        char result1 = testSubject0.BeginToken();
        int result2 = testSubject0.getEndColumn();
        int result3 = testSubject0.getEndLine();
        int result4 = testSubject0.getBeginColumn();
        int result5 = testSubject0.getBeginLine();
        testSubject0.ReInit(_InputStream, _String, _int, _int);
        testSubject0.ReInit(_Reader, _int, _int);
        java.lang.String result6 = testSubject0.GetImage();
    }

    public void verifyJJTOWLFunctionalSyntaxParserState() throws Exception {
        JJTOWLFunctionalSyntaxParserState testSubject0 = new JJTOWLFunctionalSyntaxParserState();
        testSubject0.reset();
        boolean result0 = testSubject0.nodeCreated();
        org.coode.owlapi.functionalparser.Node result1 = testSubject0.rootNode();
        testSubject0.pushNode(_Node);
        org.coode.owlapi.functionalparser.Node result2 = testSubject0.popNode();
        org.coode.owlapi.functionalparser.Node result3 = testSubject0.peekNode();
        int result4 = testSubject0.nodeArity();
        testSubject0.clearNodeScope(_Node);
        testSubject0.openNodeScope(_Node);
        testSubject0.closeNodeScope(_Node, _int);
        testSubject0.closeNodeScope(_Node, _boolean);
    }

    public void verifyInterfaceNode() throws Exception {
        Node testSubject0 = mock(Node.class);
        org.coode.owlapi.functionalparser.Node result0 = testSubject0.jjtGetParent();
        org.coode.owlapi.functionalparser.Node result1 = testSubject0.jjtGetChild(_int);
        int result2 = testSubject0.jjtGetNumChildren();
        testSubject0.jjtOpen();
        testSubject0.jjtSetParent(_Node);
        testSubject0.jjtAddChild(_Node, _int);
        testSubject0.jjtClose();
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxOWLParser() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(OWLFunctionalSyntaxOWLParser.class));
    }

    public void verifyOWLFunctionalSyntaxOWLParser() throws Exception {
        OWLFunctionalSyntaxOWLParser testSubject0 = new OWLFunctionalSyntaxOWLParser();
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
    public void enforceInterfacesOWLFunctionalSyntaxParser() throws Exception {
        assertTrue(org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserConstants.class
                .isAssignableFrom(OWLFunctionalSyntaxParser.class));
    }

    public void verifyOWLFunctionalSyntaxParser() throws Exception {
        OWLFunctionalSyntaxParser testSubject0 = new OWLFunctionalSyntaxParser(
                _InputStream, _String);
        OWLFunctionalSyntaxParser testSubject1 = new OWLFunctionalSyntaxParser(_Reader);
        OWLFunctionalSyntaxParser testSubject2 = new OWLFunctionalSyntaxParser(
                _InputStream);
        OWLFunctionalSyntaxParser testSubject3 = new OWLFunctionalSyntaxParser(
                _OWLFunctionalSyntaxParserTokenManager);
        org.semanticweb.owlapi.io.OWLFunctionalSyntaxOntologyFormat result0 = testSubject0
                .parse();
        org.semanticweb.owlapi.model.OWLImportsDeclaration result1 = testSubject0
                .ImportsDeclaration();
        int result2 = testSubject0.Integer();
        org.semanticweb.owlapi.model.OWLClass result3 = testSubject0.Class();
        org.semanticweb.owlapi.model.OWLClassExpression result4 = testSubject0
                .ObjectSomeValuesFrom();
        org.semanticweb.owlapi.model.OWLClassExpression result5 = testSubject0
                .ObjectAllValuesFrom();
        org.semanticweb.owlapi.model.OWLClassExpression result6 = testSubject0
                .ObjectMinCardinality();
        org.semanticweb.owlapi.model.OWLClassExpression result7 = testSubject0
                .ObjectMaxCardinality();
        org.semanticweb.owlapi.model.OWLClassExpression result8 = testSubject0
                .ObjectExactCardinality();
        org.semanticweb.owlapi.model.OWLClassExpression result9 = testSubject0
                .ObjectHasValue();
        org.semanticweb.owlapi.model.OWLClassExpression result10 = testSubject0
                .DataSomeValuesFrom();
        org.semanticweb.owlapi.model.OWLClassExpression result11 = testSubject0
                .DataAllValuesFrom();
        org.semanticweb.owlapi.model.OWLClassExpression result12 = testSubject0
                .DataMinCardinality();
        org.semanticweb.owlapi.model.OWLClassExpression result13 = testSubject0
                .DataMaxCardinality();
        org.semanticweb.owlapi.model.OWLClassExpression result14 = testSubject0
                .DataExactCardinality();
        org.semanticweb.owlapi.model.OWLClassExpression result15 = testSubject0
                .DataHasValue();
        org.semanticweb.owlapi.model.OWLClassExpression result16 = testSubject0
                .ObjectIntersectionOf();
        org.semanticweb.owlapi.model.OWLClassExpression result17 = testSubject0
                .ObjectUnionOf();
        org.semanticweb.owlapi.model.OWLClassExpression result18 = testSubject0
                .ObjectComplementOf();
        org.semanticweb.owlapi.model.OWLClassExpression result19 = testSubject0
                .ObjectOneOf();
        org.semanticweb.owlapi.model.OWLDatatype result20 = testSubject0.Datatype();
        org.semanticweb.owlapi.model.OWLDataRange result21 = testSubject0.DataOneOf();
        org.semanticweb.owlapi.model.OWLDataRange result22 = testSubject0
                .DataComplementOf();
        org.semanticweb.owlapi.model.OWLDataRange result23 = testSubject0.DataUnionOf();
        org.semanticweb.owlapi.model.OWLDataRange result24 = testSubject0
                .DataIntersectionOf();
        org.semanticweb.owlapi.model.OWLObjectProperty result25 = testSubject0
                .ObjectProperty();
        org.semanticweb.owlapi.model.OWLDataProperty result26 = testSubject0
                .DataProperty();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result27 = testSubject0
                .AnnotationProperty();
        org.semanticweb.owlapi.model.OWLNamedIndividual result28 = testSubject0
                .NamedIndividual();
        testSubject0.Ontology();
        org.semanticweb.owlapi.model.OWLAnnotation result29 = testSubject0.Annotation();
        org.semanticweb.owlapi.model.OWLIndividual result30 = testSubject0.Individual();
        org.semanticweb.owlapi.model.OWLLiteral result31 = testSubject0.Literal();
        org.semanticweb.owlapi.model.OWLDataRange result32 = testSubject0.DataRange();
        org.semanticweb.owlapi.model.OWLAxiom result33 = testSubject0.Axiom();
        org.semanticweb.owlapi.model.OWLAxiom result34 = testSubject0.Declaration();
        org.semanticweb.owlapi.model.OWLClassAxiom result35 = testSubject0
                .EquivalentClasses();
        org.semanticweb.owlapi.model.OWLClassAxiom result36 = testSubject0.SubClassOf();
        org.semanticweb.owlapi.model.OWLClassAxiom result37 = testSubject0
                .DisjointClasses();
        org.semanticweb.owlapi.model.OWLClassAxiom result38 = testSubject0
                .DisjointUnion();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result39 = testSubject0
                .ClassAssertion();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result40 = testSubject0
                .DifferentIndividuals();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result41 = testSubject0
                .ObjectPropertyAssertion();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result42 = testSubject0
                .NegativeObjectPropertyAssertion();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result43 = testSubject0
                .DataPropertyAssertion();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result44 = testSubject0
                .NegativeDataPropertyAssertion();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result45 = testSubject0
                .EquivalentObjectProperties();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result46 = testSubject0
                .SubObjectPropertyOf();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result47 = testSubject0
                .InverseObjectProperties();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result48 = testSubject0
                .FunctionalObjectProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result49 = testSubject0
                .InverseFunctionalObjectProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result50 = testSubject0
                .SymmetricObjectProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result51 = testSubject0
                .AsymmetricObjectProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result52 = testSubject0
                .TransitiveObjectProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result53 = testSubject0
                .ReflexiveObjectProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result54 = testSubject0
                .ObjectPropertyDomain();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result55 = testSubject0
                .ObjectPropertyRange();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result56 = testSubject0
                .DisjointObjectProperties();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result57 = testSubject0
                .EquivalentDataProperties();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result58 = testSubject0
                .SubDataPropertyOf();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result59 = testSubject0
                .FunctionalDataProperty();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result60 = testSubject0
                .DataPropertyDomain();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result61 = testSubject0
                .DataPropertyRange();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result62 = testSubject0
                .DisjointDataProperties();
        org.semanticweb.owlapi.model.OWLHasKeyAxiom result63 = testSubject0.HasKey();
        org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom result64 = testSubject0
                .AnnotationAssertion();
        org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom result65 = testSubject0
                .SubAnnotationPropertyOf();
        org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom result66 = testSubject0
                .AnnotationPropertyDomain();
        org.semanticweb.owlapi.model.IRI result67 = testSubject0.IRI();
        org.semanticweb.owlapi.model.OWLAnonymousIndividual result68 = testSubject0
                .AnonymousIndividual();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result69 = testSubject0
                .IrreflexiveObjectProperty();
        org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom result70 = testSubject0
                .AnnotationPropertyRange();
        testSubject0.Prefix();
        org.semanticweb.owlapi.model.IRI result71 = testSubject0.AbbreviatedIRI();
        org.semanticweb.owlapi.model.SWRLRule result72 = testSubject0.DLSafeRule();
        org.semanticweb.owlapi.model.SWRLClassAtom result73 = testSubject0.ClassAtom();
        org.semanticweb.owlapi.model.SWRLDataRangeAtom result74 = testSubject0
                .DataRangeAtom();
        org.semanticweb.owlapi.model.SWRLObjectPropertyAtom result75 = testSubject0
                .ObjectPropertyAtom();
        org.semanticweb.owlapi.model.SWRLDataPropertyAtom result76 = testSubject0
                .DataPropertyAtom();
        org.semanticweb.owlapi.model.SWRLBuiltInAtom result77 = testSubject0
                .BuiltInAtom();
        org.semanticweb.owlapi.model.SWRLSameIndividualAtom result78 = testSubject0
                .SameIndividualAtom();
        org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom result79 = testSubject0
                .DifferentIndividualsAtom();
        testSubject0.ReInit(_InputStream, _String);
        testSubject0.ReInit(_InputStream);
        testSubject0.ReInit(_OWLFunctionalSyntaxParserTokenManager);
        testSubject0.ReInit(_Reader);
        org.coode.owlapi.functionalparser.Token result80 = testSubject0.getNextToken();
        org.coode.owlapi.functionalparser.ParseException result81 = testSubject0
                .generateParseException();
        org.coode.owlapi.functionalparser.Token result82 = testSubject0.getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        testSubject0.setIgnoreAnnotationsAndDeclarations(_boolean);
        org.semanticweb.owlapi.model.IRI result83 = testSubject0.getIRI(_String);
        testSubject0.setUp(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyLoaderConfiguration);
        testSubject0.setUp(_OWLOntology, _OWLOntologyLoaderConfiguration);
        testSubject0.setPrefixes(_PrefixManager);
        java.lang.String result84 = testSubject0.PrefixName();
        org.semanticweb.owlapi.model.IRI result85 = testSubject0.FullIRI();
        org.semanticweb.owlapi.model.OWLClassExpression result86 = testSubject0
                .ClassExpression();
        org.semanticweb.owlapi.model.OWLClass result87 = testSubject0.ClassIRI();
        org.semanticweb.owlapi.model.OWLClassExpression result88 = testSubject0
                .ObjectSelf();
        java.util.Set<org.semanticweb.owlapi.model.OWLClassExpression> result89 = testSubject0
                .ClassExpressionSet();
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result90 = testSubject0
                .IndividualMinOneSet();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result91 = testSubject0
                .ObjectPropertyExpression();
        int result92 = testSubject0.Cardinality();
        org.semanticweb.owlapi.model.OWLDataPropertyExpression result93 = testSubject0
                .DataPropertyExpression();
        org.semanticweb.owlapi.model.OWLObjectPropertyExpression result94 = testSubject0
                .InverseObjectProperty();
        org.semanticweb.owlapi.model.OWLObjectProperty result95 = testSubject0
                .ObjectPropertyIRI();
        org.semanticweb.owlapi.model.OWLDataProperty result96 = testSubject0
                .DataPropertyIRI();
        org.semanticweb.owlapi.model.OWLAnnotationProperty result97 = testSubject0
                .AnnotationPropertyIRI();
        org.semanticweb.owlapi.model.OWLNamedIndividual result98 = testSubject0
                .IndividualIRI();
        org.semanticweb.owlapi.model.OWLDatatype result99 = testSubject0.DatatypeIRI();
        org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom result100 = testSubject0
                .DatatypeDefinitionAxiom();
        java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> result101 = testSubject0
                .AxiomAnnotationSet();
        org.semanticweb.owlapi.model.OWLDataRange result102 = testSubject0
                .DataRangeRestriction();
        org.semanticweb.owlapi.model.OWLFacetRestriction result103 = testSubject0
                .DataRangeFacetRestriction();
        org.semanticweb.owlapi.model.OWLClassAxiom result104 = testSubject0.ClassAxiom();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result105 = testSubject0
                .ObjectPropertyAxiom();
        org.semanticweb.owlapi.model.OWLPropertyAxiom result106 = testSubject0
                .DataPropertyAxiom();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result107 = testSubject0
                .IndividualAxiom();
        org.semanticweb.owlapi.model.OWLAxiom result108 = testSubject0.AnnotationAxiom();
        java.util.List<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result109 = testSubject0
                .SubObjectPropertyChain();
        java.util.Set<org.semanticweb.owlapi.model.OWLObjectPropertyExpression> result110 = testSubject0
                .ObjectPropertySet();
        java.util.Set<org.semanticweb.owlapi.model.OWLDataPropertyExpression> result111 = testSubject0
                .DataPropertySet();
        org.semanticweb.owlapi.model.OWLIndividualAxiom result112 = testSubject0
                .SameIndividuals();
        java.util.Set<org.semanticweb.owlapi.model.OWLIndividual> result113 = testSubject0
                .IndividualSet();
        org.semanticweb.owlapi.model.OWLAnnotationValue result114 = testSubject0
                .AnnotationValue();
        org.semanticweb.owlapi.model.OWLAnnotationSubject result115 = testSubject0
                .AnnotationSubject();
        org.semanticweb.owlapi.model.OWLEntity result116 = testSubject0.Entity();
        java.lang.String result117 = testSubject0.QuotedString();
        java.lang.String result118 = testSubject0.LangTag();
        org.semanticweb.owlapi.model.SWRLAtom result119 = testSubject0.Atom();
        org.semanticweb.owlapi.model.SWRLIArgument result120 = testSubject0.IArg();
        org.semanticweb.owlapi.model.SWRLDArgument result121 = testSubject0.DArg();
    }

    public void verifyInterfaceOWLFunctionalSyntaxParserConstants() throws Exception {
        OWLFunctionalSyntaxParserConstants testSubject0 = mock(OWLFunctionalSyntaxParserConstants.class);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParserFactory() throws Exception {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(OWLFunctionalSyntaxParserFactory.class));
    }

    public void verifyOWLFunctionalSyntaxParserFactory() throws Exception {
        OWLFunctionalSyntaxParserFactory testSubject0 = new OWLFunctionalSyntaxParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParserTokenManager() throws Exception {
        assertTrue(org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserConstants.class
                .isAssignableFrom(OWLFunctionalSyntaxParserTokenManager.class));
    }

    public void verifyOWLFunctionalSyntaxParserTokenManager() throws Exception {
        OWLFunctionalSyntaxParserTokenManager testSubject0 = new OWLFunctionalSyntaxParserTokenManager(
                _JavaCharStream, _int);
        OWLFunctionalSyntaxParserTokenManager testSubject1 = new OWLFunctionalSyntaxParserTokenManager(
                _JavaCharStream);
        testSubject0.ReInit(_JavaCharStream);
        testSubject0.ReInit(_JavaCharStream, _int);
        org.coode.owlapi.functionalparser.Token result0 = testSubject0.getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParserTreeConstants()
            throws Exception {}

    public void verifyInterfaceOWLFunctionalSyntaxParserTreeConstants() throws Exception {
        OWLFunctionalSyntaxParserTreeConstants testSubject0 = mock(OWLFunctionalSyntaxParserTreeConstants.class);
    }

    @Test
    public void enforceInterfacesParseException() throws Exception {
        assertTrue(java.lang.Exception.class.isAssignableFrom(ParseException.class));
    }

    public void verifyParseException() throws Exception {
        ParseException testSubject0 = new ParseException(_String);
        ParseException testSubject1 = new ParseException();
        ParseException testSubject2 = new ParseException(_Token, _int_array_array,
                _String_array);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result0 = testSubject0.fillInStackTrace();
        java.lang.Throwable result1 = testSubject0.getCause();
        java.lang.Throwable result2 = testSubject0.initCause(_Throwable);
        java.lang.String result3 = testSubject0.getMessage();
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesSimpleNode() throws Exception {
        assertTrue(org.coode.owlapi.functionalparser.Node.class
                .isAssignableFrom(SimpleNode.class));
    }

    public void verifySimpleNode() throws Exception {
        SimpleNode testSubject0 = new SimpleNode(_int);
        SimpleNode testSubject1 = new SimpleNode(_OWLFunctionalSyntaxParser, _int);
        testSubject0.dump(_String);
        org.coode.owlapi.functionalparser.Node result0 = testSubject0.jjtGetParent();
        org.coode.owlapi.functionalparser.Node result1 = testSubject0.jjtGetChild(_int);
        int result2 = testSubject0.jjtGetNumChildren();
        testSubject0.jjtOpen();
        testSubject0.jjtSetParent(_Node);
        testSubject0.jjtAddChild(_Node, _int);
        testSubject0.jjtClose();
        testSubject0.jjtSetValue(_Object);
        java.lang.Object result3 = testSubject0.jjtGetValue();
    }

    @Test
    public void enforceInterfacesToken() throws Exception {
        assertTrue(java.io.Serializable.class.isAssignableFrom(Token.class));
    }

    public void verifyToken() throws Exception {
        Token testSubject0 = new Token(_int);
        Token testSubject1 = new Token();
        Token testSubject2 = new Token(_int, _String);
        java.lang.Object result0 = testSubject0.getValue();
        org.coode.owlapi.functionalparser.Token result1 = Token.newToken(_int, _String);
        org.coode.owlapi.functionalparser.Token result2 = Token.newToken(_int);
    }

    @Test
    public void enforceInterfacesTokenMgrError() throws Exception {
        assertTrue(org.semanticweb.owlapi.model.OWLRuntimeException.class
                .isAssignableFrom(TokenMgrError.class));
    }

    public void verifyTokenMgrError() throws Exception {
        TokenMgrError testSubject0 = new TokenMgrError(_String, _int);
        TokenMgrError testSubject1 = new TokenMgrError(_boolean, _int, _int, _int,
                _String, _char, _int);
        TokenMgrError testSubject2 = new TokenMgrError();
        java.lang.String result0 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        java.lang.Throwable result1 = testSubject0.fillInStackTrace();
        java.lang.Throwable result2 = testSubject0.getCause();
        java.lang.Throwable result3 = testSubject0.initCause(_Throwable);
        java.lang.String result4 = testSubject0.getLocalizedMessage();
        java.lang.StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        java.lang.Throwable[] result6 = testSubject0.getSuppressed();
    }

    private boolean _boolean;
    private char _char;
    private int _int;
    private int[][] _int_array_array;
    private java.io.InputStream _InputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Reader _Reader;
    private java.lang.Object _Object;
    private java.lang.StackTraceElement[] _StackTraceElement_array;
    private java.lang.String _String;
    private java.lang.String[] _String_array;
    private java.lang.Throwable _Throwable;
    private org.coode.owlapi.functionalparser.JavaCharStream _JavaCharStream;
    private org.coode.owlapi.functionalparser.Node _Node;
    private org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParser _OWLFunctionalSyntaxParser;
    private org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserTokenManager _OWLFunctionalSyntaxParserTokenManager;
    private org.coode.owlapi.functionalparser.Token _Token;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.model.IRI _IRI;
    private org.semanticweb.owlapi.model.OWLOntology _OWLOntology;
    private org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private org.semanticweb.owlapi.model.OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.model.PrefixManager _PrefixManager;
}
