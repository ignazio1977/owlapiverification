package org.semanticweb.owlapi.migration_3_5_to_4;

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
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_functionalparser {

    @Test
    public void enforceInterfacesJavaCharStream()  {
        assertTrue(uk.ac.manchester.cs.BOMSafeJavaCharStream.class
                .isAssignableFrom(JavaCharStream.class));
    }

    public void verifyJavaCharStream()  {
        JavaCharStream testSubject0 = new JavaCharStream(_Reader, _int, _int);
        JavaCharStream testSubject1 = new JavaCharStream(_InputStream, _String,
                _int, _int);
        char result0 = testSubject0.readChar();
        testSubject0.backup(_int);
        char result1 = testSubject0.BeginToken();
        int result2 = testSubject0.getEndColumn();
        int result3 = testSubject0.getEndLine();
        int result4 = testSubject0.getBeginColumn();
        int result5 = testSubject0.getBeginLine();
        testSubject0.ReInit(_InputStream, _String, _int, _int);
        testSubject0.ReInit(_Reader, _int, _int);
        String result6 = testSubject0.GetImage();
    }

    public void verifyJJTOWLFunctionalSyntaxParserState()  {
        JJTOWLFunctionalSyntaxParserState testSubject0 = new JJTOWLFunctionalSyntaxParserState();
        testSubject0.reset();
        boolean result0 = testSubject0.nodeCreated();
        org.coode.owlapi.functionalparser.Node result1 = testSubject0
                .rootNode();
        testSubject0.pushNode(_Node);
        org.coode.owlapi.functionalparser.Node result2 = testSubject0.popNode();
        org.coode.owlapi.functionalparser.Node result3 = testSubject0
                .peekNode();
        int result4 = testSubject0.nodeArity();
        testSubject0.clearNodeScope(_Node);
        testSubject0.openNodeScope(_Node);
        testSubject0.closeNodeScope(_Node, _int);
        testSubject0.closeNodeScope(_Node, _boolean);
    }

    public void verifyInterfaceNode()  {
        Node testSubject0 = mock(Node.class);
        org.coode.owlapi.functionalparser.Node result0 = testSubject0
                .jjtGetParent();
        org.coode.owlapi.functionalparser.Node result1 = testSubject0
                .jjtGetChild(_int);
        int result2 = testSubject0.jjtGetNumChildren();
        testSubject0.jjtOpen();
        testSubject0.jjtSetParent(_Node);
        testSubject0.jjtAddChild(_Node, _int);
        testSubject0.jjtClose();
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxOWLParser()
             {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(OWLFunctionalSyntaxOWLParser.class));
    }

    public void verifyOWLFunctionalSyntaxOWLParser()  {
        OWLFunctionalSyntaxOWLParser testSubject0 = new OWLFunctionalSyntaxOWLParser();
        OWLOntologyFormat result0 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result1 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result2 = testSubject0
                .parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result3 = testSubject0
                .getOWLOntologyManager();
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParser()  {
        assertTrue(org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserConstants.class
                .isAssignableFrom(OWLFunctionalSyntaxParser.class));
    }

    public void verifyOWLFunctionalSyntaxParser()  {
        OWLFunctionalSyntaxParser testSubject0 = new OWLFunctionalSyntaxParser(
                _InputStream, _String);
        OWLFunctionalSyntaxParser testSubject1 = new OWLFunctionalSyntaxParser(
                _Reader);
        OWLFunctionalSyntaxParser testSubject2 = new OWLFunctionalSyntaxParser(
                _InputStream);
        OWLFunctionalSyntaxParser testSubject3 = new OWLFunctionalSyntaxParser(
                _OWLFunctionalSyntaxParserTokenManager);
        org.semanticweb.owlapi.io.OWLFunctionalSyntaxOntologyFormat result0 = testSubject0
                .parse();
        OWLImportsDeclaration result1 = testSubject0
                .ImportsDeclaration();
        int result2 = testSubject0.Integer();
        OWLClass result3 = testSubject0.Class();
        OWLClassExpression result4 = testSubject0
                .ObjectSomeValuesFrom();
        OWLClassExpression result5 = testSubject0
                .ObjectAllValuesFrom();
        OWLClassExpression result6 = testSubject0
                .ObjectMinCardinality();
        OWLClassExpression result7 = testSubject0
                .ObjectMaxCardinality();
        OWLClassExpression result8 = testSubject0
                .ObjectExactCardinality();
        OWLClassExpression result9 = testSubject0
                .ObjectHasValue();
        OWLClassExpression result10 = testSubject0
                .DataSomeValuesFrom();
        OWLClassExpression result11 = testSubject0
                .DataAllValuesFrom();
        OWLClassExpression result12 = testSubject0
                .DataMinCardinality();
        OWLClassExpression result13 = testSubject0
                .DataMaxCardinality();
        OWLClassExpression result14 = testSubject0
                .DataExactCardinality();
        OWLClassExpression result15 = testSubject0
                .DataHasValue();
        OWLClassExpression result16 = testSubject0
                .ObjectIntersectionOf();
        OWLClassExpression result17 = testSubject0
                .ObjectUnionOf();
        OWLClassExpression result18 = testSubject0
                .ObjectComplementOf();
        OWLClassExpression result19 = testSubject0
                .ObjectOneOf();
        OWLDatatype result20 = testSubject0
                .Datatype();
        OWLDataRange result21 = testSubject0
                .DataOneOf();
        OWLDataRange result22 = testSubject0
                .DataComplementOf();
        OWLDataRange result23 = testSubject0
                .DataUnionOf();
        OWLDataRange result24 = testSubject0
                .DataIntersectionOf();
        OWLObjectProperty result25 = testSubject0
                .ObjectProperty();
        OWLDataProperty result26 = testSubject0
                .DataProperty();
        OWLAnnotationProperty result27 = testSubject0
                .AnnotationProperty();
        OWLNamedIndividual result28 = testSubject0
                .NamedIndividual();
        testSubject0.Ontology();
        OWLAnnotation result29 = testSubject0
                .Annotation();
        OWLIndividual result30 = testSubject0
                .Individual();
        OWLLiteral result31 = testSubject0
                .Literal();
        OWLDataRange result32 = testSubject0
                .DataRange();
        OWLAxiom result33 = testSubject0.Axiom();
        OWLAxiom result34 = testSubject0
                .Declaration();
        OWLClassAxiom result35 = testSubject0
                .EquivalentClasses();
        OWLClassAxiom result36 = testSubject0
                .SubClassOf();
        OWLClassAxiom result37 = testSubject0
                .DisjointClasses();
        OWLClassAxiom result38 = testSubject0
                .DisjointUnion();
        OWLIndividualAxiom result39 = testSubject0
                .ClassAssertion();
        OWLIndividualAxiom result40 = testSubject0
                .DifferentIndividuals();
        OWLIndividualAxiom result41 = testSubject0
                .ObjectPropertyAssertion();
        OWLIndividualAxiom result42 = testSubject0
                .NegativeObjectPropertyAssertion();
        OWLIndividualAxiom result43 = testSubject0
                .DataPropertyAssertion();
        OWLIndividualAxiom result44 = testSubject0
                .NegativeDataPropertyAssertion();
        OWLPropertyAxiom result45 = testSubject0
                .EquivalentObjectProperties();
        OWLPropertyAxiom result46 = testSubject0
                .SubObjectPropertyOf();
        OWLPropertyAxiom result47 = testSubject0
                .InverseObjectProperties();
        OWLPropertyAxiom result48 = testSubject0
                .FunctionalObjectProperty();
        OWLPropertyAxiom result49 = testSubject0
                .InverseFunctionalObjectProperty();
        OWLPropertyAxiom result50 = testSubject0
                .SymmetricObjectProperty();
        OWLPropertyAxiom result51 = testSubject0
                .AsymmetricObjectProperty();
        OWLPropertyAxiom result52 = testSubject0
                .TransitiveObjectProperty();
        OWLPropertyAxiom result53 = testSubject0
                .ReflexiveObjectProperty();
        OWLPropertyAxiom result54 = testSubject0
                .ObjectPropertyDomain();
        OWLPropertyAxiom result55 = testSubject0
                .ObjectPropertyRange();
        OWLPropertyAxiom result56 = testSubject0
                .DisjointObjectProperties();
        OWLPropertyAxiom result57 = testSubject0
                .EquivalentDataProperties();
        OWLPropertyAxiom result58 = testSubject0
                .SubDataPropertyOf();
        OWLPropertyAxiom result59 = testSubject0
                .FunctionalDataProperty();
        OWLPropertyAxiom result60 = testSubject0
                .DataPropertyDomain();
        OWLPropertyAxiom result61 = testSubject0
                .DataPropertyRange();
        OWLPropertyAxiom result62 = testSubject0
                .DisjointDataProperties();
        OWLHasKeyAxiom result63 = testSubject0
                .HasKey();
        OWLAnnotationAssertionAxiom result64 = testSubject0
                .AnnotationAssertion();
        OWLSubAnnotationPropertyOfAxiom result65 = testSubject0
                .SubAnnotationPropertyOf();
        OWLAnnotationPropertyDomainAxiom result66 = testSubject0
                .AnnotationPropertyDomain();
        IRI result67 = testSubject0.IRI();
        OWLAnonymousIndividual result68 = testSubject0
                .AnonymousIndividual();
        OWLPropertyAxiom result69 = testSubject0
                .IrreflexiveObjectProperty();
        OWLAnnotationPropertyRangeAxiom result70 = testSubject0
                .AnnotationPropertyRange();
        testSubject0.Prefix();
        IRI result71 = testSubject0
                .AbbreviatedIRI();
        SWRLRule result72 = testSubject0
                .DLSafeRule();
        SWRLClassAtom result73 = testSubject0
                .ClassAtom();
        SWRLDataRangeAtom result74 = testSubject0
                .DataRangeAtom();
        SWRLObjectPropertyAtom result75 = testSubject0
                .ObjectPropertyAtom();
        SWRLDataPropertyAtom result76 = testSubject0
                .DataPropertyAtom();
        SWRLBuiltInAtom result77 = testSubject0
                .BuiltInAtom();
        SWRLSameIndividualAtom result78 = testSubject0
                .SameIndividualAtom();
        SWRLDifferentIndividualsAtom result79 = testSubject0
                .DifferentIndividualsAtom();
        testSubject0.ReInit(_InputStream, _String);
        testSubject0.ReInit(_InputStream);
        testSubject0.ReInit(_OWLFunctionalSyntaxParserTokenManager);
        testSubject0.ReInit(_Reader);
        org.coode.owlapi.functionalparser.Token result80 = testSubject0
                .getNextToken();
        org.coode.owlapi.functionalparser.ParseException result81 = testSubject0
                .generateParseException();
        org.coode.owlapi.functionalparser.Token result82 = testSubject0
                .getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        testSubject0.setIgnoreAnnotationsAndDeclarations(_boolean);
        IRI result83 = testSubject0
                .getIRI(_String);
        testSubject0.setUp(_OWLOntologyManager, _OWLOntology,
                _OWLOntologyLoaderConfiguration);
        testSubject0.setUp(_OWLOntology, _OWLOntologyLoaderConfiguration);
        testSubject0.setPrefixes(_PrefixManager);
        String result84 = testSubject0.PrefixName();
        IRI result85 = testSubject0.FullIRI();
        OWLClassExpression result86 = testSubject0
                .ClassExpression();
        OWLClass result87 = testSubject0
                .ClassIRI();
        OWLClassExpression result88 = testSubject0
                .ObjectSelf();
        java.util.Set<OWLClassExpression> result89 = testSubject0
                .ClassExpressionSet();
        java.util.Set<OWLIndividual> result90 = testSubject0
                .IndividualMinOneSet();
        OWLObjectPropertyExpression result91 = testSubject0
                .ObjectPropertyExpression();
        int result92 = testSubject0.Cardinality();
        OWLDataPropertyExpression result93 = testSubject0
                .DataPropertyExpression();
        OWLObjectPropertyExpression result94 = testSubject0
                .InverseObjectProperty();
        OWLObjectProperty result95 = testSubject0
                .ObjectPropertyIRI();
        OWLDataProperty result96 = testSubject0
                .DataPropertyIRI();
        OWLAnnotationProperty result97 = testSubject0
                .AnnotationPropertyIRI();
        OWLNamedIndividual result98 = testSubject0
                .IndividualIRI();
        OWLDatatype result99 = testSubject0
                .DatatypeIRI();
        OWLDatatypeDefinitionAxiom result100 = testSubject0
                .DatatypeDefinitionAxiom();
        java.util.Set<OWLAnnotation> result101 = testSubject0
                .AxiomAnnotationSet();
        OWLDataRange result102 = testSubject0
                .DataRangeRestriction();
        OWLFacetRestriction result103 = testSubject0
                .DataRangeFacetRestriction();
        OWLClassAxiom result104 = testSubject0
                .ClassAxiom();
        OWLPropertyAxiom result105 = testSubject0
                .ObjectPropertyAxiom();
        OWLPropertyAxiom result106 = testSubject0
                .DataPropertyAxiom();
        OWLIndividualAxiom result107 = testSubject0
                .IndividualAxiom();
        OWLAxiom result108 = testSubject0
                .AnnotationAxiom();
        java.util.List<OWLObjectPropertyExpression> result109 = testSubject0
                .SubObjectPropertyChain();
        java.util.Set<OWLObjectPropertyExpression> result110 = testSubject0
                .ObjectPropertySet();
        java.util.Set<OWLDataPropertyExpression> result111 = testSubject0
                .DataPropertySet();
        OWLIndividualAxiom result112 = testSubject0
                .SameIndividuals();
        java.util.Set<OWLIndividual> result113 = testSubject0
                .IndividualSet();
        OWLAnnotationValue result114 = testSubject0
                .AnnotationValue();
        OWLAnnotationSubject result115 = testSubject0
                .AnnotationSubject();
        OWLEntity result116 = testSubject0
                .Entity();
        String result117 = testSubject0.QuotedString();
        String result118 = testSubject0.LangTag();
        SWRLAtom result119 = testSubject0.Atom();
        SWRLIArgument result120 = testSubject0
                .IArg();
        SWRLDArgument result121 = testSubject0
                .DArg();
    }

    public void verifyInterfaceOWLFunctionalSyntaxParserConstants()
             {
        OWLFunctionalSyntaxParserConstants testSubject0 = mock(OWLFunctionalSyntaxParserConstants.class);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParserFactory()
             {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(OWLFunctionalSyntaxParserFactory.class));
    }

    public void verifyOWLFunctionalSyntaxParserFactory()  {
        OWLFunctionalSyntaxParserFactory testSubject0 = new OWLFunctionalSyntaxParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParserTokenManager()
             {
        assertTrue(org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserConstants.class
                .isAssignableFrom(OWLFunctionalSyntaxParserTokenManager.class));
    }

    public void verifyOWLFunctionalSyntaxParserTokenManager()  {
        OWLFunctionalSyntaxParserTokenManager testSubject0 = new OWLFunctionalSyntaxParserTokenManager(
                _JavaCharStream, _int);
        OWLFunctionalSyntaxParserTokenManager testSubject1 = new OWLFunctionalSyntaxParserTokenManager(
                _JavaCharStream);
        testSubject0.ReInit(_JavaCharStream);
        testSubject0.ReInit(_JavaCharStream, _int);
        org.coode.owlapi.functionalparser.Token result0 = testSubject0
                .getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
    }

    @Test
    public void enforceInterfacesOWLFunctionalSyntaxParserTreeConstants()
             {}

    public void verifyInterfaceOWLFunctionalSyntaxParserTreeConstants()
             {
        OWLFunctionalSyntaxParserTreeConstants testSubject0 = mock(OWLFunctionalSyntaxParserTreeConstants.class);
    }

    @Test
    public void enforceInterfacesParseException()  {
        assertTrue(Exception.class.isAssignableFrom(ParseException.class));
    }

    public void verifyParseException()  {
        ParseException testSubject0 = new ParseException(_String);
        ParseException testSubject1 = new ParseException();
        ParseException testSubject2 = new ParseException(_Token,
                _int_array_array, _String_array);
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result0 = testSubject0.fillInStackTrace();
        Throwable result1 = testSubject0.getCause();
        Throwable result2 = testSubject0.initCause(_Throwable);
        String result3 = testSubject0.getMessage();
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    @Test
    public void enforceInterfacesSimpleNode()  {
        assertTrue(org.coode.owlapi.functionalparser.Node.class
                .isAssignableFrom(SimpleNode.class));
    }

    public void verifySimpleNode()  {
        SimpleNode testSubject0 = new SimpleNode(_int);
        SimpleNode testSubject1 = new SimpleNode(_OWLFunctionalSyntaxParser,
                _int);
        testSubject0.dump(_String);
        org.coode.owlapi.functionalparser.Node result0 = testSubject0
                .jjtGetParent();
        org.coode.owlapi.functionalparser.Node result1 = testSubject0
                .jjtGetChild(_int);
        int result2 = testSubject0.jjtGetNumChildren();
        testSubject0.jjtOpen();
        testSubject0.jjtSetParent(_Node);
        testSubject0.jjtAddChild(_Node, _int);
        testSubject0.jjtClose();
        testSubject0.jjtSetValue(_Object);
        Object result3 = testSubject0.jjtGetValue();
    }

    @Test
    public void enforceInterfacesToken()  {
        assertTrue(java.io.Serializable.class.isAssignableFrom(Token.class));
    }

    public void verifyToken()  {
        Token testSubject0 = new Token(_int);
        Token testSubject1 = new Token();
        Token testSubject2 = new Token(_int, _String);
        Object result0 = testSubject0.getValue();
        org.coode.owlapi.functionalparser.Token result1 = Token.newToken(_int,
                _String);
        org.coode.owlapi.functionalparser.Token result2 = Token.newToken(_int);
    }

    @Test
    public void enforceInterfacesTokenMgrError()  {
        assertTrue(OWLRuntimeException.class
                .isAssignableFrom(TokenMgrError.class));
    }

    public void verifyTokenMgrError()  {
        TokenMgrError testSubject0 = new TokenMgrError(_String, _int);
        TokenMgrError testSubject1 = new TokenMgrError(_boolean, _int, _int,
                _int, _String, _char, _int);
        TokenMgrError testSubject2 = new TokenMgrError();
        String result0 = testSubject0.getMessage();
        testSubject0.printStackTrace();
        testSubject0.printStackTrace(_PrintWriter);
        testSubject0.printStackTrace(_PrintStream);
        Throwable result1 = testSubject0.fillInStackTrace();
        Throwable result2 = testSubject0.getCause();
        Throwable result3 = testSubject0.initCause(_Throwable);
        String result4 = testSubject0.getLocalizedMessage();
        StackTraceElement[] result5 = testSubject0.getStackTrace();
        testSubject0.setStackTrace(_StackTraceElement_array);
        testSubject0.addSuppressed(_Throwable);
        Throwable[] result6 = testSubject0.getSuppressed();
    }

    private boolean _boolean;
    private char _char;
    private int _int;
    private int[][] _int_array_array;
    private java.io.InputStream _InputStream;
    private java.io.PrintStream _PrintStream;
    private java.io.PrintWriter _PrintWriter;
    private java.io.Reader _Reader;
    private Object _Object;
    private StackTraceElement[] _StackTraceElement_array;
    private String _String;
    private String[] _String_array;
    private Throwable _Throwable;
    private org.coode.owlapi.functionalparser.JavaCharStream _JavaCharStream;
    private org.coode.owlapi.functionalparser.Node _Node;
    private org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParser _OWLFunctionalSyntaxParser;
    private org.coode.owlapi.functionalparser.OWLFunctionalSyntaxParserTokenManager _OWLFunctionalSyntaxParserTokenManager;
    private org.coode.owlapi.functionalparser.Token _Token;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private PrefixManager _PrefixManager;
}
