package org.semanticweb.owlapi.verification_3_4_10;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.coode.owlapi.obo.parser.AbstractTagValueHandler;
import org.coode.owlapi.obo.parser.AltIdTagValueHandler;
import org.coode.owlapi.obo.parser.AsymmetricHandler;
import org.coode.owlapi.obo.parser.DataVersionTagValueHandler;
import org.coode.owlapi.obo.parser.DefTagValueHandler;
import org.coode.owlapi.obo.parser.DefaultNamespaceTagValueHandler;
import org.coode.owlapi.obo.parser.DisjointFromHandler;
import org.coode.owlapi.obo.parser.DomainHandler;
import org.coode.owlapi.obo.parser.IDSpaceManager;
import org.coode.owlapi.obo.parser.IDSpaceTagValueHandler;
import org.coode.owlapi.obo.parser.IDTagValueHandler;
import org.coode.owlapi.obo.parser.IntersectionOfHandler;
import org.coode.owlapi.obo.parser.InverseHandler;
import org.coode.owlapi.obo.parser.IsATagValueHandler;
import org.coode.owlapi.obo.parser.IsObsoleteTagValueHandler;
import org.coode.owlapi.obo.parser.JavaCharStream;
import org.coode.owlapi.obo.parser.Modifiers;
import org.coode.owlapi.obo.parser.NameTagValueHandler;
import org.coode.owlapi.obo.parser.OBOConsumer;
import org.coode.owlapi.obo.parser.OBOFrame;
import org.coode.owlapi.obo.parser.OBOIdTranslator;
import org.coode.owlapi.obo.parser.OBOIdType;
import org.coode.owlapi.obo.parser.OBOOntologyFormat;
import org.coode.owlapi.obo.parser.OBOParser;
import org.coode.owlapi.obo.parser.OBOParserConstants;
import org.coode.owlapi.obo.parser.OBOParserException;
import org.coode.owlapi.obo.parser.OBOParserFactory;
import org.coode.owlapi.obo.parser.OBOParserHandler;
import org.coode.owlapi.obo.parser.OBOParserHandlerAdapter;
import org.coode.owlapi.obo.parser.OBOParserTokenManager;
import org.coode.owlapi.obo.parser.OBOPrefix;
import org.coode.owlapi.obo.parser.OBOTagValuePair;
import org.coode.owlapi.obo.parser.OBOVocabulary;
import org.coode.owlapi.obo.parser.OWLOBOParser;
import org.coode.owlapi.obo.parser.OntologyTagValueHandler;
import org.coode.owlapi.obo.parser.ParseException;
import org.coode.owlapi.obo.parser.PartOfTagValueHandler;
import org.coode.owlapi.obo.parser.RawFrameHandler;
import org.coode.owlapi.obo.parser.ReflexiveHandler;
import org.coode.owlapi.obo.parser.RelationshipTagValueHandler;
import org.coode.owlapi.obo.parser.SymmetricTagValueHandler;
import org.coode.owlapi.obo.parser.SynonymScope;
import org.coode.owlapi.obo.parser.SynonymTagValueHandler;
import org.coode.owlapi.obo.parser.SynonymTypeDefTagHandler;
import org.coode.owlapi.obo.parser.TagValueHandler;
import org.coode.owlapi.obo.parser.Token;
import org.coode.owlapi.obo.parser.TokenMgrError;
import org.coode.owlapi.obo.parser.TransitiveOverHandler;
import org.coode.owlapi.obo.parser.TransitiveTagValueHandler;
import org.coode.owlapi.obo.parser.UnionOfHandler;
import org.coode.owlapi.obo.parser.XRefTagHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_coode_owlapi_obo_parser {

    @Test
    public void enforceInterfacesAbstractTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.TagValueHandler.class
                .isAssignableFrom(AbstractTagValueHandler.class));
    }

    public void verifyAbstractTagValueHandler()  {
        AbstractTagValueHandler testSubject0 = new AbstractTagValueHandler(
                _String, _OBOConsumer) {

            @Override
            public void handle(String currentId, String value,
                    String qualifierBlock, String comment) {}
        };
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
        testSubject0.handle(_String, _String, _String, _String);
    }

    @Test
    public void enforceInterfacesAltIdTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(AltIdTagValueHandler.class));
    }

    public void verifyAltIdTagValueHandler()  {
        AltIdTagValueHandler testSubject0 = new AltIdTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesAsymmetricHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(AsymmetricHandler.class));
    }

    public void verifyAsymmetricHandler()  {
        AsymmetricHandler testSubject0 = new AsymmetricHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesDataVersionTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(DataVersionTagValueHandler.class));
    }

    public void verifyDataVersionTagValueHandler()  {
        DataVersionTagValueHandler testSubject0 = new DataVersionTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesDefaultNamespaceTagValueHandler()
             {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(DefaultNamespaceTagValueHandler.class));
    }

    public void verifyDefaultNamespaceTagValueHandler()  {
        DefaultNamespaceTagValueHandler testSubject0 = new DefaultNamespaceTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesDefTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(DefTagValueHandler.class));
    }

    public void verifyDefTagValueHandler()  {
        DefTagValueHandler testSubject0 = new DefTagValueHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesDisjointFromHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(DisjointFromHandler.class));
    }

    public void verifyDisjointFromHandler()  {
        DisjointFromHandler testSubject0 = new DisjointFromHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesDomainHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(DomainHandler.class));
    }

    public void verifyDomainHandler()  {
        DomainHandler testSubject0 = new DomainHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    public void verifyIDSpaceManager()  {
        IDSpaceManager testSubject0 = new IDSpaceManager();
        IDSpaceManager testSubject1 = new IDSpaceManager(_IDSpaceManager);
        testSubject0.setIRIPrefix(_String, _String);
        String result0 = testSubject0.getIRIPrefix(_String);
        String result1 = testSubject0.getDefaultIRIPrefix();
    }

    @Test
    public void enforceInterfacesIDSpaceTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(IDSpaceTagValueHandler.class));
    }

    public void verifyIDSpaceTagValueHandler()  {
        IDSpaceTagValueHandler testSubject0 = new IDSpaceTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesIDTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(IDTagValueHandler.class));
    }

    public void verifyIDTagValueHandler()  {
        IDTagValueHandler testSubject0 = new IDTagValueHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesIntersectionOfHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(IntersectionOfHandler.class));
    }

    public void verifyIntersectionOfHandler()  {
        IntersectionOfHandler testSubject0 = new IntersectionOfHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesInverseHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(InverseHandler.class));
    }

    public void verifyInverseHandler()  {
        InverseHandler testSubject0 = new InverseHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesIsATagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(IsATagValueHandler.class));
    }

    public void verifyIsATagValueHandler()  {
        IsATagValueHandler testSubject0 = new IsATagValueHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesIsObsoleteTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(IsObsoleteTagValueHandler.class));
    }

    public void verifyIsObsoleteTagValueHandler()  {
        IsObsoleteTagValueHandler testSubject0 = new IsObsoleteTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

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

    public void verifyModifiers()  {
        Modifiers testSubject0 = new Modifiers();
        org.coode.owlapi.obo.parser.Modifiers result0 = Modifiers
                .parseModifiers(_String);
        testSubject0.addModifier(_String, _String);
        java.util.Set<String> result1 = testSubject0.getModifierNames();
        java.util.Set<String> result2 = testSubject0.getModifierValues(_String);
    }

    @Test
    public void enforceInterfacesNameTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(NameTagValueHandler.class));
    }

    public void verifyNameTagValueHandler()  {
        NameTagValueHandler testSubject0 = new NameTagValueHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesOBOConsumer()  {
        assertTrue(org.coode.owlapi.obo.parser.OBOParserHandler.class
                .isAssignableFrom(OBOConsumer.class));
    }

    public void verifyOBOConsumer()  {
        OBOConsumer testSubject0 = new OBOConsumer(_OWLOntologyManager,
                _OWLOntology, _OWLOntologyLoaderConfiguration, _IRI);
        OBOConsumer testSubject1 = new OBOConsumer(_OWLOntology,
                _OWLOntologyLoaderConfiguration, _IRI);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        IRI result1 = testSubject0
                .getIRIFromTagName(_String);
        IRI result2 = testSubject0
                .getIRIFromOBOId(_String);
        String result3 = testSubject0.getCurrentId();
        IRI result4 = testSubject0
                .getRelationIRIFromSymbolicIdOrOBOId(_String);
        testSubject0.addSymbolicIdMapping(_String, _IRI);
        testSubject0.setDefaultNamespaceTagValue(_String);
        String result5 = testSubject0.getDefaultNamespaceTagValue();
        testSubject0.setOntologyTagValue(_String);
        testSubject0.setDataVersionTagValue(_String);
        testSubject0.registerIdSpace(_String, _String);
        org.coode.owlapi.obo.parser.IDSpaceManager result6 = testSubject0
                .getIdSpaceManager();
        testSubject0.setCurrentId(_String);
        testSubject0.addUnionOfOperand(_OWLClassExpression);
        testSubject0.addIntersectionOfOperand(_OWLClassExpression);
        String result7 = testSubject0.getStanzaType();
        boolean result8 = testSubject0.isTerm();
        boolean result9 = testSubject0.isTypedef();
        boolean result10 = testSubject0.isInstanceType();
        testSubject0.startHeader();
        testSubject0.endHeader();
        testSubject0.startFrame(_String);
        testSubject0.endFrame();
        testSubject0.handleTagValue(_String, _String, _String, _String);
        String result11 = testSubject0.unescapeTagValue(_String);
        OWLEntity result12 = testSubject0
                .getCurrentEntity();
        OWLAnnotation result13 = testSubject0
                .parseXRef(_String);
        OWLOntology result14 = testSubject0
                .getOntology();
        OWLOntologyManager result15 = testSubject0
                .getOWLOntologyManager();
    }

    public void verifyOBOFrame()  {
        OBOFrame testSubject0 = new OBOFrame(_List);
        OBOFrame testSubject1 = new OBOFrame(_String, _List);
        String result0 = testSubject0.getFrameType();
        java.util.List<org.coode.owlapi.obo.parser.OBOTagValuePair> result1 = testSubject0
                .getTagValuePairs();
        boolean result2 = testSubject0.isHeaderFrame();
        boolean result3 = testSubject0.isTypeDefFrame();
    }

    public void verifyOBOIdTranslator()  {
        OBOIdTranslator testSubject0 = new OBOIdTranslator();
        IRI result0 = testSubject0
                .getIRIFromOBOId(_String);
        String result1 = testSubject0.getOBOIdFromIRI();
    }

    @Test
    public void enforceInterfacesOBOIdType()  {
        assertTrue(Enum.class.isAssignableFrom(OBOIdType.class));
    }

    public void verifyEnumOBOIdType()  {
        OBOIdType testSubject0 = OBOIdType.URL_AS_ID;
        OBOIdType testSubject1 = OBOIdType.UNPREFIXED_ID;
        OBOIdType testSubject2 = OBOIdType.CANONICAL_PREFIXED_ID;
        OBOIdType testSubject3 = OBOIdType.NON_CANONICAL_PREFIXED_ID;
        IRI result0 = testSubject0
                .getIRIFromOBOId(_OWLOntologyID, _IDSpaceManager, _String);
        org.coode.owlapi.obo.parser.OBOIdType result1 = OBOIdType
                .getIdType(_String);
        java.util.regex.Pattern result2 = testSubject0.getPattern();
    }

    @Test
    public void enforceInterfacesOBOOntologyFormat()  {
        assertTrue(OWLOntologyFormat.class
                .isAssignableFrom(OBOOntologyFormat.class));
    }

    public void verifyOBOOntologyFormat()  {
        OBOOntologyFormat testSubject0 = new OBOOntologyFormat();
        org.coode.owlapi.obo.parser.IDSpaceManager result0 = testSubject0
                .getIdSpaceManager();
        testSubject0.setIDSpaceManager(_IDSpaceManager);
        testSubject0.setParameter(_Object, _Object);
        Object result1 = testSubject0.getParameter(_Object, _Object);
        boolean result2 = testSubject0.isPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat result3 = testSubject0
                .asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result4 = testSubject0
                .getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesOBOParser()  {
        assertTrue(org.coode.owlapi.obo.parser.OBOParserConstants.class
                .isAssignableFrom(OBOParser.class));
    }

    public void verifyOBOParser()  {
        OBOParser testSubject0 = new OBOParser(_OBOParserTokenManager);
        OBOParser testSubject1 = new OBOParser(_InputStream);
        OBOParser testSubject2 = new OBOParser(_InputStream, _String);
        OBOParser testSubject3 = new OBOParser(_Reader);
        testSubject0.parse();
        String result0 = testSubject0.Comment();
        testSubject0.ReInit(_OBOParserTokenManager);
        testSubject0.ReInit(_InputStream);
        testSubject0.ReInit(_Reader);
        testSubject0.ReInit(_InputStream, _String);
        org.coode.owlapi.obo.parser.Token result1 = testSubject0.getNextToken();
        org.coode.owlapi.obo.parser.ParseException result2 = testSubject0
                .generateParseException();
        org.coode.owlapi.obo.parser.Token result3 = testSubject0.getToken(_int);
        testSubject0.enable_tracing();
        testSubject0.disable_tracing();
        testSubject0.setHandler(_OBOParserHandler);
        testSubject0.Header();
        testSubject0.Stanza();
        testSubject0.TagValuePair();
    }

    public void verifyInterfaceOBOParserConstants()  {
        OBOParserConstants testSubject0 = mock(OBOParserConstants.class);
    }

    @Test
    public void enforceInterfacesOBOParserException()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserException.class
                .isAssignableFrom(OBOParserException.class));
    }

    public void verifyOBOParserException()  {
        OBOParserException testSubject0 = new OBOParserException(_String);
        OBOParserException testSubject1 = new OBOParserException(_String,
                _Throwable);
        OBOParserException testSubject2 = new OBOParserException(_Throwable);
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
    public void enforceInterfacesOBOParserFactory()  {
        assertTrue(org.semanticweb.owlapi.io.OWLParserFactory.class
                .isAssignableFrom(OBOParserFactory.class));
    }

    public void verifyOBOParserFactory()  {
        OBOParserFactory testSubject0 = new OBOParserFactory();
        org.semanticweb.owlapi.io.OWLParser result0 = testSubject0
                .createParser(_OWLOntologyManager);
    }

    public void verifyInterfaceOBOParserHandler()  {
        OBOParserHandler testSubject0 = mock(OBOParserHandler.class);
        testSubject0.startHeader();
        testSubject0.endHeader();
        testSubject0.startFrame(_String);
        testSubject0.endFrame();
        testSubject0.handleTagValue(_String, _String, _String, _String);
    }

    @Test
    public void enforceInterfacesOBOParserHandlerAdapter()  {
        assertTrue(org.coode.owlapi.obo.parser.OBOParserHandler.class
                .isAssignableFrom(OBOParserHandlerAdapter.class));
    }

    public void verifyOBOParserHandlerAdapter()  {
        OBOParserHandlerAdapter testSubject0 = new OBOParserHandlerAdapter();
        testSubject0.startHeader();
        testSubject0.endHeader();
        testSubject0.startFrame(_String);
        testSubject0.endFrame();
        testSubject0.handleTagValue(_String, _String, _String, _String);
    }

    @Test
    public void enforceInterfacesOBOParserTokenManager()  {
        assertTrue(org.coode.owlapi.obo.parser.OBOParserConstants.class
                .isAssignableFrom(OBOParserTokenManager.class));
    }

    public void verifyOBOParserTokenManager()  {
        OBOParserTokenManager testSubject0 = new OBOParserTokenManager(
                _BOMSafeJavaCharStream, _int);
        OBOParserTokenManager testSubject1 = new OBOParserTokenManager(
                _BOMSafeJavaCharStream);
        testSubject0.ReInit(_BOMSafeJavaCharStream);
        testSubject0.ReInit(_BOMSafeJavaCharStream, _int);
        org.coode.owlapi.obo.parser.Token result0 = testSubject0.getNextToken();
        testSubject0.setDebugStream(_PrintStream);
        testSubject0.SwitchTo(_int);
    }

    @Test
    public void enforceInterfacesOBOPrefix()  {
        assertTrue(Enum.class.isAssignableFrom(OBOPrefix.class));
    }

    public void verifyEnumOBOPrefix()  {
        OBOPrefix testSubject0 = OBOPrefix.OBO;
        OBOPrefix testSubject1 = OBOPrefix.IAO;
        OBOPrefix testSubject2 = OBOPrefix.OBO_IN_OWL;
        String result0 = testSubject0.getPrefix();
    }

    public void verifyOBOTagValuePair()  {
        OBOTagValuePair testSubject0 = new OBOTagValuePair(_String, _String,
                _String, _String);
        String result0 = testSubject0.getValue();
        String result1 = testSubject0.getComment();
        String result2 = testSubject0.getTagName();
        String result3 = testSubject0.getQualifier();
    }

    @Test
    public void enforceInterfacesOBOVocabulary()  {
        assertTrue(Enum.class.isAssignableFrom(OBOVocabulary.class));
    }

    public void verifyEnumOBOVocabulary()  {
        OBOVocabulary testSubject0 = OBOVocabulary.DATA_VERSION;
        OBOVocabulary testSubject1 = OBOVocabulary.VERSION;
        OBOVocabulary testSubject2 = OBOVocabulary.DATE;
        OBOVocabulary testSubject3 = OBOVocabulary.SAVED_BY;
        OBOVocabulary testSubject4 = OBOVocabulary.AUTO_GENERATED_BY;
        OBOVocabulary testSubject5 = OBOVocabulary.ONTOLOGY;
        OBOVocabulary testSubject6 = OBOVocabulary.SUBSETDEF;
        OBOVocabulary testSubject7 = OBOVocabulary.IMPORT;
        OBOVocabulary testSubject8 = OBOVocabulary.SYNONYM_TYPE_DEF;
        OBOVocabulary testSubject9 = OBOVocabulary.SYNONYM_TYPE;
        OBOVocabulary testSubject10 = OBOVocabulary.ID_SPACE;
        OBOVocabulary testSubject11 = OBOVocabulary.DEFAULT_RELATIONSHIP_ID_PREFIX;
        OBOVocabulary testSubject12 = OBOVocabulary.ID_MAPPING;
        OBOVocabulary testSubject13 = OBOVocabulary.REMARK;
        OBOVocabulary testSubject14 = OBOVocabulary.ID;
        OBOVocabulary testSubject15 = OBOVocabulary.NAME;
        OBOVocabulary testSubject16 = OBOVocabulary.FORMAT_VERSION;
        OBOVocabulary testSubject17 = OBOVocabulary.TYPEDEF;
        OBOVocabulary testSubject18 = OBOVocabulary.ALT_ID;
        OBOVocabulary testSubject19 = OBOVocabulary.SHORT_HAND;
        OBOVocabulary testSubject20 = OBOVocabulary.ALT_NAME;
        OBOVocabulary testSubject21 = OBOVocabulary.NAMESPACE;
        OBOVocabulary testSubject22 = OBOVocabulary.DEFAULT_NAMESPACE;
        OBOVocabulary testSubject23 = OBOVocabulary.DEF;
        OBOVocabulary testSubject24 = OBOVocabulary.COMMENT;
        OBOVocabulary testSubject25 = OBOVocabulary.SUBSET;
        OBOVocabulary testSubject26 = OBOVocabulary.SYNONYM;
        OBOVocabulary testSubject27 = OBOVocabulary.HAS_SCOPE;
        OBOVocabulary testSubject28 = OBOVocabulary.RELATED_SYNONYM;
        OBOVocabulary testSubject29 = OBOVocabulary.EXACT_SYNONYM;
        OBOVocabulary testSubject30 = OBOVocabulary.BROAD_SYNONYM;
        OBOVocabulary testSubject31 = OBOVocabulary.NARROW_SYNONYM;
        OBOVocabulary testSubject32 = OBOVocabulary.XREF;
        OBOVocabulary testSubject33 = OBOVocabulary.XREF_ANALOGUE;
        OBOVocabulary testSubject34 = OBOVocabulary.XREF_UNKNOWN;
        OBOVocabulary testSubject35 = OBOVocabulary.IS_A;
        OBOVocabulary testSubject36 = OBOVocabulary.IS_OBSOLETE;
        OBOVocabulary testSubject37 = OBOVocabulary.PART_OF;
        OBOVocabulary testSubject38 = OBOVocabulary.RELATIONSHIP;
        OBOVocabulary testSubject39 = OBOVocabulary.REPLACED_BY;
        OBOVocabulary testSubject40 = OBOVocabulary.CONSIDER;
        OBOVocabulary testSubject41 = OBOVocabulary.USE_TERM;
        OBOVocabulary testSubject42 = OBOVocabulary.DOMAIN;
        OBOVocabulary testSubject43 = OBOVocabulary.RANGE;
        OBOVocabulary testSubject44 = OBOVocabulary.IS_CYCLIC;
        OBOVocabulary testSubject45 = OBOVocabulary.IS_TRANSITIVE;
        OBOVocabulary testSubject46 = OBOVocabulary.IS_SYMMETRIC;
        OBOVocabulary testSubject47 = OBOVocabulary.IS_ASYMMETRIC;
        OBOVocabulary testSubject48 = OBOVocabulary.IS_REFLEXIVE;
        OBOVocabulary testSubject49 = OBOVocabulary.INVERSE;
        OBOVocabulary testSubject50 = OBOVocabulary.TRANSITIVE_OVER;
        OBOVocabulary testSubject51 = OBOVocabulary.INTERSECTION_OF;
        OBOVocabulary testSubject52 = OBOVocabulary.UNION_OF;
        OBOVocabulary testSubject53 = OBOVocabulary.DISJOINT_FROM;
        OBOVocabulary testSubject54 = OBOVocabulary.TERM;
        OBOVocabulary testSubject55 = OBOVocabulary.BUILTIN;
        OBOVocabulary testSubject56 = OBOVocabulary.IS_METADATA_TAG;
        OBOVocabulary testSubject57 = OBOVocabulary.CARDINALITY;
        OBOVocabulary testSubject58 = OBOVocabulary.MAX_CARDINALITY;
        OBOVocabulary testSubject59 = OBOVocabulary.MIN_CARDINALITY;
        OBOVocabulary testSubject60 = OBOVocabulary.INSTANCE;
        OBOVocabulary testSubject61 = OBOVocabulary.INSTANCE_OF;
        OBOVocabulary testSubject62 = OBOVocabulary.PROPERTY_VALUE;
        OBOVocabulary testSubject63 = OBOVocabulary.IS_ANONYMOUS;
        String result0 = testSubject0.getName();
        IRI result1 = OBOVocabulary.ID2IRI(
                _String, _IDSpaceManager);
        IRI result2 = OBOVocabulary
                .ID2IRI(_String);
        String result3 = OBOVocabulary.IRI2ID(_IRI);
        boolean result4 = OBOVocabulary.isOBOIRI(_IRI);
        java.util.List<org.coode.owlapi.obo.parser.OBOVocabulary> result5 = OBOVocabulary
                .getHeaderTags();
        java.util.List<org.coode.owlapi.obo.parser.OBOVocabulary> result6 = OBOVocabulary
                .getTermStanzaTags();
        java.util.List<org.coode.owlapi.obo.parser.OBOVocabulary> result7 = OBOVocabulary
                .getTypeDefStanzaTags();
        java.util.List<org.coode.owlapi.obo.parser.OBOVocabulary> result8 = OBOVocabulary
                .getInstanceStanzaTags();
        IRI result9 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOntologyTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(OntologyTagValueHandler.class));
    }

    public void verifyOntologyTagValueHandler()  {
        OntologyTagValueHandler testSubject0 = new OntologyTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesOWLOBOParser()  {
        assertTrue(org.semanticweb.owlapi.io.AbstractOWLParser.class
                .isAssignableFrom(OWLOBOParser.class));
    }

    public void verifyOWLOBOParser()  {
        OWLOBOParser testSubject0 = new OWLOBOParser();
        OWLOntologyFormat result0 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology,
                        _OWLOntologyLoaderConfiguration);
        OWLOntologyFormat result1 = testSubject0
                .parse(_OWLOntologyDocumentSource, _OWLOntology);
        OWLOntologyFormat result2 = testSubject0
                .parse(_IRI, _OWLOntology);
        testSubject0.setOWLOntologyManager(_OWLOntologyManager);
        OWLOntologyManager result3 = testSubject0
                .getOWLOntologyManager();
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
    public void enforceInterfacesPartOfTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(PartOfTagValueHandler.class));
    }

    public void verifyPartOfTagValueHandler()  {
        PartOfTagValueHandler testSubject0 = new PartOfTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesRawFrameHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.OBOParserHandler.class
                .isAssignableFrom(RawFrameHandler.class));
    }

    public void verifyRawFrameHandler()  {
        RawFrameHandler testSubject0 = new RawFrameHandler();
        testSubject0.startHeader();
        testSubject0.endHeader();
        testSubject0.startFrame(_String);
        testSubject0.endFrame();
        testSubject0.handleTagValue(_String, _String, _String, _String);
        java.util.List<org.coode.owlapi.obo.parser.OBOFrame> result0 = testSubject0
                .getTypeDefFrames();
        java.util.List<org.coode.owlapi.obo.parser.OBOFrame> result1 = testSubject0
                .getNonTypeDefFrames();
        org.coode.owlapi.obo.parser.OBOFrame result2 = testSubject0
                .getHeaderFrame();
    }

    @Test
    public void enforceInterfacesReflexiveHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(ReflexiveHandler.class));
    }

    public void verifyReflexiveHandler()  {
        ReflexiveHandler testSubject0 = new ReflexiveHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesRelationshipTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(RelationshipTagValueHandler.class));
    }

    public void verifyRelationshipTagValueHandler()  {
        RelationshipTagValueHandler testSubject0 = new RelationshipTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesSymmetricTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(SymmetricTagValueHandler.class));
    }

    public void verifySymmetricTagValueHandler()  {
        SymmetricTagValueHandler testSubject0 = new SymmetricTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesSynonymScope()  {
        assertTrue(Enum.class.isAssignableFrom(SynonymScope.class));
    }

    public void verifyEnumSynonymScope()  {
        SynonymScope testSubject0 = SynonymScope.EXACT;
        SynonymScope testSubject1 = SynonymScope.BROAD;
        SynonymScope testSubject2 = SynonymScope.NARROW;
        SynonymScope testSubject3 = SynonymScope.RELATED;
    }

    @Test
    public void enforceInterfacesSynonymTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(SynonymTagValueHandler.class));
    }

    public void verifySynonymTagValueHandler()  {
        SynonymTagValueHandler testSubject0 = new SynonymTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesSynonymTypeDefTagHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(SynonymTypeDefTagHandler.class));
    }

    public void verifySynonymTypeDefTagHandler()  {
        SynonymTypeDefTagHandler testSubject0 = new SynonymTypeDefTagHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    public void verifyInterfaceTagValueHandler()  {
        TagValueHandler testSubject0 = mock(TagValueHandler.class);
        testSubject0.handle(_String, _String, _String, _String);
        String result0 = testSubject0.getTagName();
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
        org.coode.owlapi.obo.parser.Token result1 = Token.newToken(_int,
                _String);
        org.coode.owlapi.obo.parser.Token result2 = Token.newToken(_int);
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

    @Test
    public void enforceInterfacesTransitiveOverHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(TransitiveOverHandler.class));
    }

    public void verifyTransitiveOverHandler()  {
        TransitiveOverHandler testSubject0 = new TransitiveOverHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesTransitiveTagValueHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(TransitiveTagValueHandler.class));
    }

    public void verifyTransitiveTagValueHandler()  {
        TransitiveTagValueHandler testSubject0 = new TransitiveTagValueHandler(
                _OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesUnionOfHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(UnionOfHandler.class));
    }

    public void verifyUnionOfHandler()  {
        UnionOfHandler testSubject0 = new UnionOfHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
    }

    @Test
    public void enforceInterfacesXRefTagHandler()  {
        assertTrue(org.coode.owlapi.obo.parser.AbstractTagValueHandler.class
                .isAssignableFrom(XRefTagHandler.class));
    }

    public void verifyXRefTagHandler()  {
        XRefTagHandler testSubject0 = new XRefTagHandler(_OBOConsumer);
        testSubject0.handle(_String, _String, _String, _String);
        OWLClass result0 = testSubject0
                .getCurrentClass();
        String result1 = testSubject0.getTagName();
        org.coode.owlapi.obo.parser.OBOConsumer result2 = testSubject0
                .getConsumer();
        IRI result3 = testSubject0
                .getTagIRI(_String);
        IRI result4 = testSubject0
                .getTagIRI(_OBOVocabulary);
        IRI result5 = testSubject0
                .getIRIFromOBOId(_String);
        OWLAnnotation result6 = testSubject0
                .getAnnotationForTagValuePair(_String, _String);
        OWLClass result7 = testSubject0
                .getClassFromId(_String);
        OWLOntology result8 = testSubject0
                .getOntology();
        OWLDataFactory result9 = testSubject0
                .getDataFactory();
        OWLOntologyManager result10 = testSubject0
                .getOWLOntologyManager();
        testSubject0.applyChange(_OWLOntologyChange);
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
    private java.util.List<org.coode.owlapi.obo.parser.OBOTagValuePair> _List;
    private org.coode.owlapi.obo.parser.IDSpaceManager _IDSpaceManager;
    private org.coode.owlapi.obo.parser.OBOConsumer _OBOConsumer;
    private org.coode.owlapi.obo.parser.OBOParserHandler _OBOParserHandler;
    private org.coode.owlapi.obo.parser.OBOParserTokenManager _OBOParserTokenManager;
    private org.coode.owlapi.obo.parser.OBOVocabulary _OBOVocabulary;
    private org.coode.owlapi.obo.parser.Token _Token;
    private org.semanticweb.owlapi.io.OWLOntologyDocumentSource _OWLOntologyDocumentSource;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLClassExpression _OWLClassExpression;
    private OWLOntology _OWLOntology;
    private OWLOntologyChange _OWLOntologyChange;
    private OWLOntologyID _OWLOntologyID;
    private OWLOntologyLoaderConfiguration _OWLOntologyLoaderConfiguration;
    private OWLOntologyManager _OWLOntologyManager;
    private uk.ac.manchester.cs.BOMSafeJavaCharStream _BOMSafeJavaCharStream;
}
