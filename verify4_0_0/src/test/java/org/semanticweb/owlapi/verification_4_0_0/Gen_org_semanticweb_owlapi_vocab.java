package org.semanticweb.owlapi.verification_4_0_0;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.*;

@SuppressWarnings({ "javadoc", "unused", "null" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_org_semanticweb_owlapi_vocab {
    @Test
    public void enforceInterfacesBuiltInVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(BuiltInVocabulary.class));
    }

    public void verifyEnumBuiltInVocabulary() {
        BuiltInVocabulary testSubject0 = BuiltInVocabulary.DUBLIN_CORE;
        BuiltInVocabulary testSubject1 = BuiltInVocabulary.SKOS;
        BuiltInVocabulary testSubject2 = BuiltInVocabulary.SWRL;
    }

    @Test
    public void enforceInterfacesDublinCoreVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(DublinCoreVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(DublinCoreVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(DublinCoreVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(DublinCoreVocabulary.class));
    }

    public void verifyEnumDublinCoreVocabulary() {
        DublinCoreVocabulary testSubject0 = DublinCoreVocabulary.CONTRIBUTOR;
        DublinCoreVocabulary testSubject1 = DublinCoreVocabulary.COVERAGE;
        DublinCoreVocabulary testSubject2 = DublinCoreVocabulary.CREATOR;
        DublinCoreVocabulary testSubject3 = DublinCoreVocabulary.DATE;
        DublinCoreVocabulary testSubject4 = DublinCoreVocabulary.DESCRIPTION;
        DublinCoreVocabulary testSubject5 = DublinCoreVocabulary.FORMAT;
        DublinCoreVocabulary testSubject6 = DublinCoreVocabulary.IDENTIFIER;
        DublinCoreVocabulary testSubject7 = DublinCoreVocabulary.LANGUAGE;
        DublinCoreVocabulary testSubject8 = DublinCoreVocabulary.PUBLISHER;
        DublinCoreVocabulary testSubject9 = DublinCoreVocabulary.RELATION;
        DublinCoreVocabulary testSubject10 = DublinCoreVocabulary.RIGHTS;
        DublinCoreVocabulary testSubject11 = DublinCoreVocabulary.SOURCE;
        DublinCoreVocabulary testSubject12 = DublinCoreVocabulary.SUBJECT;
        DublinCoreVocabulary testSubject13 = DublinCoreVocabulary.TITLE;
        DublinCoreVocabulary testSubject14 = DublinCoreVocabulary.TYPE;
        java.lang.String result0 = testSubject0.getPrefixedName();
        IRI result1 = testSubject0.getIRI();
        java.lang.String result2 = testSubject0.getShortForm();
    }

    @Test
    public void enforceInterfacesNamespaces() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(Namespaces.class));
    }

    public void verifyEnumNamespaces() {
        Namespaces testSubject0 = Namespaces.OWL2;
        Namespaces testSubject1 = Namespaces.OWL11XML;
        Namespaces testSubject2 = Namespaces.OWL11;
        Namespaces testSubject3 = Namespaces.OWL;
        Namespaces testSubject4 = Namespaces.RDFS;
        Namespaces testSubject5 = Namespaces.RDF;
        Namespaces testSubject6 = Namespaces.XSD;
        Namespaces testSubject7 = Namespaces.XML;
        Namespaces testSubject8 = Namespaces.SWRL;
        Namespaces testSubject9 = Namespaces.SWRLB;
        Namespaces testSubject10 = Namespaces.SKOS;
        Namespaces testSubject11 = Namespaces.GRDDL;
        Namespaces testSubject12 = Namespaces.MA;
        Namespaces testSubject13 = Namespaces.PROV;
        Namespaces testSubject14 = Namespaces.RDFA;
        Namespaces testSubject15 = Namespaces.RIF;
        Namespaces testSubject16 = Namespaces.R2RML;
        Namespaces testSubject17 = Namespaces.SD;
        Namespaces testSubject18 = Namespaces.SKOSXL;
        Namespaces testSubject19 = Namespaces.POWDER;
        Namespaces testSubject20 = Namespaces.VOID;
        Namespaces testSubject21 = Namespaces.POWDERS;
        Namespaces testSubject22 = Namespaces.XHV;
        Namespaces testSubject23 = Namespaces.ORG;
        Namespaces testSubject24 = Namespaces.GLDP;
        Namespaces testSubject25 = Namespaces.CNT;
        Namespaces testSubject26 = Namespaces.DCAT;
        Namespaces testSubject27 = Namespaces.EARL;
        Namespaces testSubject28 = Namespaces.HT;
        Namespaces testSubject29 = Namespaces.PTR;
        Namespaces testSubject30 = Namespaces.CC;
        Namespaces testSubject31 = Namespaces.CTAG;
        Namespaces testSubject32 = Namespaces.DCTERMS;
        Namespaces testSubject33 = Namespaces.DC;
        Namespaces testSubject34 = Namespaces.FOAF;
        Namespaces testSubject35 = Namespaces.GR;
        Namespaces testSubject36 = Namespaces.ICAL;
        Namespaces testSubject37 = Namespaces.OG;
        Namespaces testSubject38 = Namespaces.REV;
        Namespaces testSubject39 = Namespaces.SIOC;
        Namespaces testSubject40 = Namespaces.VCARD;
        Namespaces testSubject41 = Namespaces.SCHEMA;
        Namespaces testSubject42 = Namespaces.GEO;
        Namespaces testSubject43 = Namespaces.SC;
        Namespaces testSubject44 = Namespaces.FB;
        Namespaces testSubject45 = Namespaces.GEONAMES;
        Namespaces testSubject46 = Namespaces.DBPEDIA;
        Namespaces testSubject47 = Namespaces.DBP;
        Namespaces testSubject48 = Namespaces.DBO;
        Namespaces testSubject49 = Namespaces.YAGO;
        boolean result0 = testSubject0.inNamespace(_IRI);
        boolean result1 = testSubject0.inNamespace(_String);
        boolean result2 = Namespaces.isDefaultIgnoredImport(_String);
        boolean result3 = Namespaces.isDefaultIgnoredImport(_IRI);
        java.lang.String result4 = testSubject0.getPrefixName();
        boolean result5 = testSubject0.isInUse();
        boolean result6 = testSubject0.isBuiltIn();
        java.lang.String result7 = testSubject0.getPrefixIRI();
    }

    @Test
    public void enforceInterfacesOWL2Datatype() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(OWL2Datatype.class));
        assertTrue(HasIRI.class.isAssignableFrom(OWL2Datatype.class));
        assertTrue(HasShortForm.class.isAssignableFrom(OWL2Datatype.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(OWL2Datatype.class));
    }

    public void verifyEnumOWL2Datatype() {
        OWL2Datatype testSubject0 = OWL2Datatype.RDF_XML_LITERAL;
        OWL2Datatype testSubject1 = OWL2Datatype.RDFS_LITERAL;
        OWL2Datatype testSubject2 = OWL2Datatype.RDF_PLAIN_LITERAL;
        OWL2Datatype testSubject3 = OWL2Datatype.OWL_REAL;
        OWL2Datatype testSubject4 = OWL2Datatype.OWL_RATIONAL;
        OWL2Datatype testSubject5 = OWL2Datatype.XSD_STRING;
        OWL2Datatype testSubject6 = OWL2Datatype.XSD_NORMALIZED_STRING;
        OWL2Datatype testSubject7 = OWL2Datatype.XSD_TOKEN;
        OWL2Datatype testSubject8 = OWL2Datatype.XSD_LANGUAGE;
        OWL2Datatype testSubject9 = OWL2Datatype.XSD_NAME;
        OWL2Datatype testSubject10 = OWL2Datatype.XSD_NCNAME;
        OWL2Datatype testSubject11 = OWL2Datatype.XSD_NMTOKEN;
        OWL2Datatype testSubject12 = OWL2Datatype.XSD_DECIMAL;
        OWL2Datatype testSubject13 = OWL2Datatype.XSD_INTEGER;
        OWL2Datatype testSubject14 = OWL2Datatype.XSD_NON_NEGATIVE_INTEGER;
        OWL2Datatype testSubject15 = OWL2Datatype.XSD_NON_POSITIVE_INTEGER;
        OWL2Datatype testSubject16 = OWL2Datatype.XSD_POSITIVE_INTEGER;
        OWL2Datatype testSubject17 = OWL2Datatype.XSD_NEGATIVE_INTEGER;
        OWL2Datatype testSubject18 = OWL2Datatype.XSD_LONG;
        OWL2Datatype testSubject19 = OWL2Datatype.XSD_INT;
        OWL2Datatype testSubject20 = OWL2Datatype.XSD_SHORT;
        OWL2Datatype testSubject21 = OWL2Datatype.XSD_BYTE;
        OWL2Datatype testSubject22 = OWL2Datatype.XSD_UNSIGNED_LONG;
        OWL2Datatype testSubject23 = OWL2Datatype.XSD_UNSIGNED_INT;
        OWL2Datatype testSubject24 = OWL2Datatype.XSD_UNSIGNED_SHORT;
        OWL2Datatype testSubject25 = OWL2Datatype.XSD_UNSIGNED_BYTE;
        OWL2Datatype testSubject26 = OWL2Datatype.XSD_DOUBLE;
        OWL2Datatype testSubject27 = OWL2Datatype.XSD_FLOAT;
        OWL2Datatype testSubject28 = OWL2Datatype.XSD_BOOLEAN;
        OWL2Datatype testSubject29 = OWL2Datatype.XSD_HEX_BINARY;
        OWL2Datatype testSubject30 = OWL2Datatype.XSD_BASE_64_BINARY;
        OWL2Datatype testSubject31 = OWL2Datatype.XSD_ANY_URI;
        OWL2Datatype testSubject32 = OWL2Datatype.XSD_DATE_TIME;
        OWL2Datatype testSubject33 = OWL2Datatype.XSD_DATE_TIME_STAMP;
        boolean result0 = testSubject0.isFinite();
        boolean result1 = testSubject0.isNumeric();
        OWLDatatype result2 = testSubject0.getDatatype(_OWLDataFactory);
        org.semanticweb.owlapi.vocab.OWL2Datatype result3 = OWL2Datatype.getDatatype(_IRI);
        java.lang.String result4 = testSubject0.getPrefixedName();
        boolean result5 = OWL2Datatype.isBuiltIn(_IRI);
        IRI result6 = testSubject0.getIRI();
        java.lang.String result7 = testSubject0.getShortForm();
        java.util.Set<IRI> result8 = OWL2Datatype.getDatatypeIRIs();
        java.util.regex.Pattern result9 = testSubject0.getPattern();
        org.semanticweb.owlapi.vocab.OWL2Datatype.Category result10 = testSubject0.getCategory();
        java.util.Collection<org.semanticweb.owlapi.vocab.OWLFacet> result11 = testSubject0.getFacets();
        boolean result12 = testSubject0.isInLexicalSpace(_String);
        String result13 = testSubject0.getPatternString();
    }

    @Test
    public void enforceInterfacesOWLFacet() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(OWLFacet.class));
        assertTrue(HasShortForm.class.isAssignableFrom(OWLFacet.class));
        assertTrue(HasIRI.class.isAssignableFrom(OWLFacet.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(OWLFacet.class));
    }

    public void verifyEnumOWLFacet() {
        OWLFacet testSubject0 = OWLFacet.LENGTH;
        OWLFacet testSubject1 = OWLFacet.MIN_LENGTH;
        OWLFacet testSubject2 = OWLFacet.MAX_LENGTH;
        OWLFacet testSubject3 = OWLFacet.PATTERN;
        OWLFacet testSubject4 = OWLFacet.MIN_INCLUSIVE;
        OWLFacet testSubject5 = OWLFacet.MIN_EXCLUSIVE;
        OWLFacet testSubject6 = OWLFacet.MAX_INCLUSIVE;
        OWLFacet testSubject7 = OWLFacet.MAX_EXCLUSIVE;
        OWLFacet testSubject8 = OWLFacet.TOTAL_DIGITS;
        OWLFacet testSubject9 = OWLFacet.FRACTION_DIGITS;
        OWLFacet testSubject10 = OWLFacet.LANG_RANGE;
        java.lang.String result0 = testSubject0.getPrefixedName();
        org.semanticweb.owlapi.vocab.OWLFacet result1 = OWLFacet.getFacet(_IRI);
        java.lang.String result2 = testSubject0.getSymbolicForm();
        java.util.Set<IRI> result3 = OWLFacet.getFacetIRIs();
        org.semanticweb.owlapi.vocab.OWLFacet result4 = OWLFacet.getFacetByShortName(_String);
        org.semanticweb.owlapi.vocab.OWLFacet result5 = OWLFacet.getFacetBySymbolicName(_String);
        IRI result6 = testSubject0.getIRI();
        java.lang.String result7 = testSubject0.getShortForm();
        java.util.Set<java.lang.String> result8 = OWLFacet.getFacets();
    }

    @Test
    public void enforceInterfacesOWLRDFVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(OWLRDFVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(OWLRDFVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(OWLRDFVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(OWLRDFVocabulary.class));
    }

    @SuppressWarnings("deprecation")
    public void verifyEnumOWLRDFVocabulary() {
        OWLRDFVocabulary testSubject0 = OWLRDFVocabulary.OWL_THING;
        OWLRDFVocabulary testSubject1 = OWLRDFVocabulary.OWL_NOTHING;
        OWLRDFVocabulary testSubject2 = OWLRDFVocabulary.OWL_CLASS;
        OWLRDFVocabulary testSubject3 = OWLRDFVocabulary.OWL_ONTOLOGY;
        OWLRDFVocabulary testSubject4 = OWLRDFVocabulary.OWL_IMPORTS;
        OWLRDFVocabulary testSubject5 = OWLRDFVocabulary.OWL_VERSION_IRI;
        OWLRDFVocabulary testSubject6 = OWLRDFVocabulary.OWL_VERSION_INFO;
        OWLRDFVocabulary testSubject7 = OWLRDFVocabulary.OWL_EQUIVALENT_CLASS;
        OWLRDFVocabulary testSubject8 = OWLRDFVocabulary.OWL_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject9 = OWLRDFVocabulary.OWL_DATA_PROPERTY;
        OWLRDFVocabulary testSubject10 = OWLRDFVocabulary.OWL_FUNCTIONAL_PROPERTY;
        OWLRDFVocabulary testSubject11 = OWLRDFVocabulary.OWL_ASYMMETRIC_PROPERTY;
        OWLRDFVocabulary testSubject12 = OWLRDFVocabulary.OWL_SYMMETRIC_PROPERTY;
        OWLRDFVocabulary testSubject13 = OWLRDFVocabulary.OWL_RESTRICTION;
        OWLRDFVocabulary testSubject14 = OWLRDFVocabulary.OWL_ON_PROPERTY;
        OWLRDFVocabulary testSubject15 = OWLRDFVocabulary.OWL_INTERSECTION_OF;
        OWLRDFVocabulary testSubject16 = OWLRDFVocabulary.OWL_UNION_OF;
        OWLRDFVocabulary testSubject17 = OWLRDFVocabulary.OWL_ALL_VALUES_FROM;
        OWLRDFVocabulary testSubject18 = OWLRDFVocabulary.OWL_SOME_VALUES_FROM;
        OWLRDFVocabulary testSubject19 = OWLRDFVocabulary.OWL_HAS_VALUE;
        OWLRDFVocabulary testSubject20 = OWLRDFVocabulary.OWL_DISJOINT_WITH;
        OWLRDFVocabulary testSubject21 = OWLRDFVocabulary.OWL_ONE_OF;
        OWLRDFVocabulary testSubject22 = OWLRDFVocabulary.OWL_HAS_SELF;
        OWLRDFVocabulary testSubject23 = OWLRDFVocabulary.OWL_DISJOINT_UNION_OF;
        OWLRDFVocabulary testSubject24 = OWLRDFVocabulary.OWL_MIN_CARDINALITY;
        OWLRDFVocabulary testSubject25 = OWLRDFVocabulary.OWL_CARDINALITY;
        OWLRDFVocabulary testSubject26 = OWLRDFVocabulary.OWL_QUALIFIED_CARDINALITY;
        OWLRDFVocabulary testSubject27 = OWLRDFVocabulary.OWL_ANNOTATION_PROPERTY;
        OWLRDFVocabulary testSubject28 = OWLRDFVocabulary.OWL_ANNOTATION;
        OWLRDFVocabulary testSubject29 = OWLRDFVocabulary.OWL_INDIVIDUAL;
        OWLRDFVocabulary testSubject30 = OWLRDFVocabulary.OWL_NAMED_INDIVIDUAL;
        OWLRDFVocabulary testSubject31 = OWLRDFVocabulary.OWL_DATATYPE;
        OWLRDFVocabulary testSubject32 = OWLRDFVocabulary.RDFS_SUBCLASS_OF;
        OWLRDFVocabulary testSubject33 = OWLRDFVocabulary.RDFS_SUB_PROPERTY_OF;
        OWLRDFVocabulary testSubject34 = OWLRDFVocabulary.RDF_TYPE;
        OWLRDFVocabulary testSubject35 = OWLRDFVocabulary.RDF_NIL;
        OWLRDFVocabulary testSubject36 = OWLRDFVocabulary.RDF_REST;
        OWLRDFVocabulary testSubject37 = OWLRDFVocabulary.RDF_FIRST;
        OWLRDFVocabulary testSubject38 = OWLRDFVocabulary.RDF_LIST;
        OWLRDFVocabulary testSubject39 = OWLRDFVocabulary.OWL_MAX_CARDINALITY;
        OWLRDFVocabulary testSubject40 = OWLRDFVocabulary.RDFS_LABEL;
        OWLRDFVocabulary testSubject41 = OWLRDFVocabulary.RDFS_COMMENT;
        OWLRDFVocabulary testSubject42 = OWLRDFVocabulary.RDFS_SEE_ALSO;
        OWLRDFVocabulary testSubject43 = OWLRDFVocabulary.RDFS_IS_DEFINED_BY;
        OWLRDFVocabulary testSubject44 = OWLRDFVocabulary.RDFS_RESOURCE;
        OWLRDFVocabulary testSubject45 = OWLRDFVocabulary.RDFS_LITERAL;
        OWLRDFVocabulary testSubject46 = OWLRDFVocabulary.RDFS_DATATYPE;
        OWLRDFVocabulary testSubject47 = OWLRDFVocabulary.OWL_TRANSITIVE_PROPERTY;
        OWLRDFVocabulary testSubject48 = OWLRDFVocabulary.OWL_REFLEXIVE_PROPERTY;
        OWLRDFVocabulary testSubject49 = OWLRDFVocabulary.OWL_IRREFLEXIVE_PROPERTY;
        OWLRDFVocabulary testSubject50 = OWLRDFVocabulary.OWL_INVERSE_OF;
        OWLRDFVocabulary testSubject51 = OWLRDFVocabulary.OWL_COMPLEMENT_OF;
        OWLRDFVocabulary testSubject52 = OWLRDFVocabulary.OWL_DATATYPE_COMPLEMENT_OF;
        OWLRDFVocabulary testSubject53 = OWLRDFVocabulary.OWL_ALL_DIFFERENT;
        OWLRDFVocabulary testSubject54 = OWLRDFVocabulary.OWL_DISTINCT_MEMBERS;
        OWLRDFVocabulary testSubject55 = OWLRDFVocabulary.OWL_SAME_AS;
        OWLRDFVocabulary testSubject56 = OWLRDFVocabulary.OWL_DIFFERENT_FROM;
        OWLRDFVocabulary testSubject57 = OWLRDFVocabulary.OWL_DEPRECATED_PROPERTY;
        OWLRDFVocabulary testSubject58 = OWLRDFVocabulary.OWL_EQUIVALENT_PROPERTY;
        OWLRDFVocabulary testSubject59 = OWLRDFVocabulary.OWL_DEPRECATED_CLASS;
        OWLRDFVocabulary testSubject60 = OWLRDFVocabulary.OWL_DATA_RANGE;
        OWLRDFVocabulary testSubject61 = OWLRDFVocabulary.RDFS_DOMAIN;
        OWLRDFVocabulary testSubject62 = OWLRDFVocabulary.RDFS_RANGE;
        OWLRDFVocabulary testSubject63 = OWLRDFVocabulary.RDFS_CLASS;
        OWLRDFVocabulary testSubject64 = OWLRDFVocabulary.RDF_PROPERTY;
        OWLRDFVocabulary testSubject65 = OWLRDFVocabulary.OWL_PRIOR_VERSION;
        OWLRDFVocabulary testSubject66 = OWLRDFVocabulary.OWL_DEPRECATED;
        OWLRDFVocabulary testSubject67 = OWLRDFVocabulary.OWL_INCOMPATIBLE_WITH;
        OWLRDFVocabulary testSubject68 = OWLRDFVocabulary.OWL_PROPERTY_DISJOINT_WITH;
        OWLRDFVocabulary testSubject69 = OWLRDFVocabulary.OWL_ON_CLASS;
        OWLRDFVocabulary testSubject70 = OWLRDFVocabulary.OWL_ON_DATA_RANGE;
        OWLRDFVocabulary testSubject71 = OWLRDFVocabulary.OWL_ON_DATA_TYPE;
        OWLRDFVocabulary testSubject72 = OWLRDFVocabulary.OWL_WITH_RESTRICTIONS;
        OWLRDFVocabulary testSubject73 = OWLRDFVocabulary.OWL_AXIOM;
        OWLRDFVocabulary testSubject74 = OWLRDFVocabulary.OWL_PROPERTY_CHAIN_AXIOM;
        OWLRDFVocabulary testSubject75 = OWLRDFVocabulary.OWL_ALL_DISJOINT_CLASSES;
        OWLRDFVocabulary testSubject76 = OWLRDFVocabulary.OWL_MEMBERS;
        OWLRDFVocabulary testSubject77 = OWLRDFVocabulary.OWL_ALL_DISJOINT_PROPERTIES;
        OWLRDFVocabulary testSubject78 = OWLRDFVocabulary.OWL_TOP_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject79 = OWLRDFVocabulary.OWL_BOTTOM_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject80 = OWLRDFVocabulary.OWL_TOP_DATA_PROPERTY;
        OWLRDFVocabulary testSubject81 = OWLRDFVocabulary.OWL_BOTTOM_DATA_PROPERTY;
        OWLRDFVocabulary testSubject82 = OWLRDFVocabulary.OWL_HAS_KEY;
        OWLRDFVocabulary testSubject83 = OWLRDFVocabulary.OWL_ANNOTATED_SOURCE;
        OWLRDFVocabulary testSubject84 = OWLRDFVocabulary.OWL_ANNOTATED_PROPERTY;
        OWLRDFVocabulary testSubject85 = OWLRDFVocabulary.OWL_ANNOTATED_TARGET;
        OWLRDFVocabulary testSubject86 = OWLRDFVocabulary.OWL_SOURCE_INDIVIDUAL;
        OWLRDFVocabulary testSubject87 = OWLRDFVocabulary.OWL_ASSERTION_PROPERTY;
        OWLRDFVocabulary testSubject88 = OWLRDFVocabulary.OWL_TARGET_INDIVIDUAL;
        OWLRDFVocabulary testSubject89 = OWLRDFVocabulary.OWL_TARGET_VALUE;
        OWLRDFVocabulary testSubject90 = OWLRDFVocabulary.OWL_INVERSE_FUNCTIONAL_PROPERTY;
        OWLRDFVocabulary testSubject91 = OWLRDFVocabulary.OWL_MIN_QUALIFIED_CARDINALITY;
        OWLRDFVocabulary testSubject92 = OWLRDFVocabulary.OWL_MAX_QUALIFIED_CARDINALITY;
        OWLRDFVocabulary testSubject93 = OWLRDFVocabulary.OWL_NEGATIVE_PROPERTY_ASSERTION;
        OWLRDFVocabulary testSubject94 = OWLRDFVocabulary.RDF_PLAIN_LITERAL;
        OWLRDFVocabulary testSubject95 = OWLRDFVocabulary.RDF_DESCRIPTION;
        OWLRDFVocabulary testSubject96 = OWLRDFVocabulary.RDF_XML_LITERAL;
        OWLRDFVocabulary testSubject97 = OWLRDFVocabulary.OWL_BACKWARD_COMPATIBLE_WITH;
        OWLRDFVocabulary testSubject98 = OWLRDFVocabulary.OWL_INVERSE_OBJECT_PROPERTY_EXPRESSION;
        OWLRDFVocabulary testSubject99 = OWLRDFVocabulary.OWL_ONTOLOGY_PROPERTY;
        OWLRDFVocabulary testSubject100 = OWLRDFVocabulary.OWL_ANTI_SYMMETRIC_PROPERTY;
        OWLRDFVocabulary testSubject101 = OWLRDFVocabulary.OWL_DATA_RESTRICTION;
        OWLRDFVocabulary testSubject102 = OWLRDFVocabulary.OWL_OBJECT_RESTRICTION;
        OWLRDFVocabulary testSubject103 = OWLRDFVocabulary.OWL_SELF_RESTRICTION;
        OWLRDFVocabulary testSubject104 = OWLRDFVocabulary.OWL_DECLARED_AS;
        OWLRDFVocabulary testSubject105 = OWLRDFVocabulary.OWL_NEGATIVE_OBJECT_PROPERTY_ASSERTION;
        OWLRDFVocabulary testSubject106 = OWLRDFVocabulary.OWL_NEGATIVE_DATA_PROPERTY_ASSERTION;
        OWLRDFVocabulary testSubject107 = OWLRDFVocabulary.RDF_SUBJECT;
        OWLRDFVocabulary testSubject108 = OWLRDFVocabulary.RDF_PREDICATE;
        OWLRDFVocabulary testSubject109 = OWLRDFVocabulary.RDF_OBJECT;
        OWLRDFVocabulary testSubject110 = OWLRDFVocabulary.OWL_SUBJECT;
        OWLRDFVocabulary testSubject111 = OWLRDFVocabulary.OWL_PREDICATE;
        OWLRDFVocabulary testSubject112 = OWLRDFVocabulary.OWL_OBJECT;
        OWLRDFVocabulary testSubject113 = OWLRDFVocabulary.OWL_OBJECT_PROPERTY_DOMAIN;
        OWLRDFVocabulary testSubject114 = OWLRDFVocabulary.OWL_DATA_PROPERTY_DOMAIN;
        OWLRDFVocabulary testSubject115 = OWLRDFVocabulary.OWL_DATA_PROPERTY_RANGE;
        OWLRDFVocabulary testSubject116 = OWLRDFVocabulary.OWL_OBJECT_PROPERTY_RANGE;
        OWLRDFVocabulary testSubject117 = OWLRDFVocabulary.OWL_SUB_OBJECT_PROPERTY_OF;
        OWLRDFVocabulary testSubject118 = OWLRDFVocabulary.OWL_SUB_DATA_PROPERTY_OF;
        OWLRDFVocabulary testSubject119 = OWLRDFVocabulary.OWL_DISJOINT_DATA_PROPERTIES;
        OWLRDFVocabulary testSubject120 = OWLRDFVocabulary.OWL_DISJOINT_OBJECT_PROPERTIES;
        OWLRDFVocabulary testSubject121 = OWLRDFVocabulary.OWL_EQUIVALENT_DATA_PROPERTIES;
        OWLRDFVocabulary testSubject122 = OWLRDFVocabulary.OWL_EQUIVALENT_OBJECT_PROPERTIES;
        OWLRDFVocabulary testSubject123 = OWLRDFVocabulary.OWL_FUNCTIONAL_DATA_PROPERTY;
        OWLRDFVocabulary testSubject124 = OWLRDFVocabulary.OWL_FUNCTIONAL_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject125 = OWLRDFVocabulary.OWL_PROPERTY_CHAIN;
        org.semanticweb.owlapi.vocab.Namespaces result0 = testSubject0.getNamespace();
        java.lang.String result1 = testSubject0.getPrefixedName();
        IRI result2 = testSubject0.getIRI();
        java.lang.String result3 = testSubject0.getShortForm();
    }

    @Test
    public void enforceInterfacesOWLXMLVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(OWLXMLVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(OWLXMLVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(OWLXMLVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(OWLXMLVocabulary.class));
    }

    public void verifyEnumOWLXMLVocabulary() {
        OWLXMLVocabulary testSubject0 = OWLXMLVocabulary.CLASS;
        OWLXMLVocabulary testSubject1 = OWLXMLVocabulary.DATA_PROPERTY;
        OWLXMLVocabulary testSubject2 = OWLXMLVocabulary.OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject3 = OWLXMLVocabulary.NAMED_INDIVIDUAL;
        OWLXMLVocabulary testSubject4 = OWLXMLVocabulary.ENTITY_ANNOTATION;
        OWLXMLVocabulary testSubject5 = OWLXMLVocabulary.ANNOTATION_PROPERTY;
        OWLXMLVocabulary testSubject6 = OWLXMLVocabulary.DATATYPE;
        OWLXMLVocabulary testSubject7 = OWLXMLVocabulary.ANNOTATION;
        OWLXMLVocabulary testSubject8 = OWLXMLVocabulary.ANONYMOUS_INDIVIDUAL;
        OWLXMLVocabulary testSubject9 = OWLXMLVocabulary.NODE_ID;
        OWLXMLVocabulary testSubject10 = OWLXMLVocabulary.ANNOTATION_URI;
        OWLXMLVocabulary testSubject11 = OWLXMLVocabulary.IMPORT;
        OWLXMLVocabulary testSubject12 = OWLXMLVocabulary.LABEL;
        OWLXMLVocabulary testSubject13 = OWLXMLVocabulary.COMMENT;
        OWLXMLVocabulary testSubject14 = OWLXMLVocabulary.DOCUMENTATION;
        OWLXMLVocabulary testSubject15 = OWLXMLVocabulary.ONTOLOGY;
        OWLXMLVocabulary testSubject16 = OWLXMLVocabulary.LITERAL;
        OWLXMLVocabulary testSubject17 = OWLXMLVocabulary.OBJECT_INVERSE_OF;
        OWLXMLVocabulary testSubject18 = OWLXMLVocabulary.DATA_COMPLEMENT_OF;
        OWLXMLVocabulary testSubject19 = OWLXMLVocabulary.DATA_ONE_OF;
        OWLXMLVocabulary testSubject20 = OWLXMLVocabulary.DATATYPE_RESTRICTION;
        OWLXMLVocabulary testSubject21 = OWLXMLVocabulary.FACET_RESTRICTION;
        OWLXMLVocabulary testSubject22 = OWLXMLVocabulary.DATA_UNION_OF;
        OWLXMLVocabulary testSubject23 = OWLXMLVocabulary.DATA_INTERSECTION_OF;
        OWLXMLVocabulary testSubject24 = OWLXMLVocabulary.DATATYPE_FACET;
        OWLXMLVocabulary testSubject25 = OWLXMLVocabulary.DATATYPE_IRI;
        OWLXMLVocabulary testSubject26 = OWLXMLVocabulary.DATA_RANGE;
        OWLXMLVocabulary testSubject27 = OWLXMLVocabulary.OBJECT_INTERSECTION_OF;
        OWLXMLVocabulary testSubject28 = OWLXMLVocabulary.OBJECT_UNION_OF;
        OWLXMLVocabulary testSubject29 = OWLXMLVocabulary.OBJECT_COMPLEMENT_OF;
        OWLXMLVocabulary testSubject30 = OWLXMLVocabulary.OBJECT_ONE_OF;
        OWLXMLVocabulary testSubject31 = OWLXMLVocabulary.OBJECT_SOME_VALUES_FROM;
        OWLXMLVocabulary testSubject32 = OWLXMLVocabulary.OBJECT_ALL_VALUES_FROM;
        OWLXMLVocabulary testSubject33 = OWLXMLVocabulary.OBJECT_HAS_SELF;
        OWLXMLVocabulary testSubject34 = OWLXMLVocabulary.OBJECT_HAS_VALUE;
        OWLXMLVocabulary testSubject35 = OWLXMLVocabulary.OBJECT_MIN_CARDINALITY;
        OWLXMLVocabulary testSubject36 = OWLXMLVocabulary.OBJECT_EXACT_CARDINALITY;
        OWLXMLVocabulary testSubject37 = OWLXMLVocabulary.OBJECT_MAX_CARDINALITY;
        OWLXMLVocabulary testSubject38 = OWLXMLVocabulary.DATA_SOME_VALUES_FROM;
        OWLXMLVocabulary testSubject39 = OWLXMLVocabulary.DATA_ALL_VALUES_FROM;
        OWLXMLVocabulary testSubject40 = OWLXMLVocabulary.DATA_HAS_VALUE;
        OWLXMLVocabulary testSubject41 = OWLXMLVocabulary.DATA_MIN_CARDINALITY;
        OWLXMLVocabulary testSubject42 = OWLXMLVocabulary.DATA_EXACT_CARDINALITY;
        OWLXMLVocabulary testSubject43 = OWLXMLVocabulary.DATA_MAX_CARDINALITY;
        OWLXMLVocabulary testSubject44 = OWLXMLVocabulary.SUB_CLASS_OF;
        OWLXMLVocabulary testSubject45 = OWLXMLVocabulary.EQUIVALENT_CLASSES;
        OWLXMLVocabulary testSubject46 = OWLXMLVocabulary.DISJOINT_CLASSES;
        OWLXMLVocabulary testSubject47 = OWLXMLVocabulary.DISJOINT_UNION;
        OWLXMLVocabulary testSubject48 = OWLXMLVocabulary.UNION_OF;
        OWLXMLVocabulary testSubject49 = OWLXMLVocabulary.SUB_OBJECT_PROPERTY_OF;
        OWLXMLVocabulary testSubject50 = OWLXMLVocabulary.OBJECT_PROPERTY_CHAIN;
        OWLXMLVocabulary testSubject51 = OWLXMLVocabulary.EQUIVALENT_OBJECT_PROPERTIES;
        OWLXMLVocabulary testSubject52 = OWLXMLVocabulary.DISJOINT_OBJECT_PROPERTIES;
        OWLXMLVocabulary testSubject53 = OWLXMLVocabulary.OBJECT_PROPERTY_DOMAIN;
        OWLXMLVocabulary testSubject54 = OWLXMLVocabulary.OBJECT_PROPERTY_RANGE;
        OWLXMLVocabulary testSubject55 = OWLXMLVocabulary.INVERSE_OBJECT_PROPERTIES;
        OWLXMLVocabulary testSubject56 = OWLXMLVocabulary.FUNCTIONAL_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject57 = OWLXMLVocabulary.INVERSE_FUNCTIONAL_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject58 = OWLXMLVocabulary.SYMMETRIC_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject59 = OWLXMLVocabulary.ASYMMETRIC_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject60 = OWLXMLVocabulary.REFLEXIVE_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject61 = OWLXMLVocabulary.IRREFLEXIVE_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject62 = OWLXMLVocabulary.TRANSITIVE_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject63 = OWLXMLVocabulary.SUB_DATA_PROPERTY_OF;
        OWLXMLVocabulary testSubject64 = OWLXMLVocabulary.EQUIVALENT_DATA_PROPERTIES;
        OWLXMLVocabulary testSubject65 = OWLXMLVocabulary.DISJOINT_DATA_PROPERTIES;
        OWLXMLVocabulary testSubject66 = OWLXMLVocabulary.DATA_PROPERTY_DOMAIN;
        OWLXMLVocabulary testSubject67 = OWLXMLVocabulary.DATA_PROPERTY_RANGE;
        OWLXMLVocabulary testSubject68 = OWLXMLVocabulary.FUNCTIONAL_DATA_PROPERTY;
        OWLXMLVocabulary testSubject69 = OWLXMLVocabulary.SAME_INDIVIDUAL;
        OWLXMLVocabulary testSubject70 = OWLXMLVocabulary.DIFFERENT_INDIVIDUALS;
        OWLXMLVocabulary testSubject71 = OWLXMLVocabulary.CLASS_ASSERTION;
        OWLXMLVocabulary testSubject72 = OWLXMLVocabulary.OBJECT_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject73 = OWLXMLVocabulary.DATA_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject74 = OWLXMLVocabulary.NEGATIVE_OBJECT_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject75 = OWLXMLVocabulary.NEGATIVE_DATA_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject76 = OWLXMLVocabulary.HAS_KEY;
        OWLXMLVocabulary testSubject77 = OWLXMLVocabulary.DECLARATION;
        OWLXMLVocabulary testSubject78 = OWLXMLVocabulary.ANNOTATION_ASSERTION;
        OWLXMLVocabulary testSubject79 = OWLXMLVocabulary.ANNOTATION_PROPERTY_DOMAIN;
        OWLXMLVocabulary testSubject80 = OWLXMLVocabulary.ANNOTATION_PROPERTY_RANGE;
        OWLXMLVocabulary testSubject81 = OWLXMLVocabulary.SUB_ANNOTATION_PROPERTY_OF;
        OWLXMLVocabulary testSubject82 = OWLXMLVocabulary.DATATYPE_DEFINITION;
        OWLXMLVocabulary testSubject83 = OWLXMLVocabulary.PREFIX;
        OWLXMLVocabulary testSubject84 = OWLXMLVocabulary.NAME_ATTRIBUTE;
        OWLXMLVocabulary testSubject85 = OWLXMLVocabulary.IRI_ATTRIBUTE;
        OWLXMLVocabulary testSubject86 = OWLXMLVocabulary.ABBREVIATED_IRI_ATTRIBUTE;
        OWLXMLVocabulary testSubject87 = OWLXMLVocabulary.IRI_ELEMENT;
        OWLXMLVocabulary testSubject88 = OWLXMLVocabulary.ABBREVIATED_IRI_ELEMENT;
        OWLXMLVocabulary testSubject89 = OWLXMLVocabulary.CARDINALITY_ATTRIBUTE;
        OWLXMLVocabulary testSubject90 = OWLXMLVocabulary.DL_SAFE_RULE;
        OWLXMLVocabulary testSubject91 = OWLXMLVocabulary.BODY;
        OWLXMLVocabulary testSubject92 = OWLXMLVocabulary.HEAD;
        OWLXMLVocabulary testSubject93 = OWLXMLVocabulary.CLASS_ATOM;
        OWLXMLVocabulary testSubject94 = OWLXMLVocabulary.DATA_RANGE_ATOM;
        OWLXMLVocabulary testSubject95 = OWLXMLVocabulary.OBJECT_PROPERTY_ATOM;
        OWLXMLVocabulary testSubject96 = OWLXMLVocabulary.DATA_PROPERTY_ATOM;
        OWLXMLVocabulary testSubject97 = OWLXMLVocabulary.BUILT_IN_ATOM;
        OWLXMLVocabulary testSubject98 = OWLXMLVocabulary.SAME_INDIVIDUAL_ATOM;
        OWLXMLVocabulary testSubject99 = OWLXMLVocabulary.DIFFERENT_INDIVIDUALS_ATOM;
        OWLXMLVocabulary testSubject100 = OWLXMLVocabulary.VARIABLE;
        OWLXMLVocabulary testSubject101 = OWLXMLVocabulary.DESCRIPTION_GRAPH_RULE;
        java.lang.String result0 = testSubject0.getPrefixedName();
        IRI result1 = testSubject0.getIRI();
        java.lang.String result2 = testSubject0.getShortForm();
    }

    @Test
    public void enforceInterfacesSKOSVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(SKOSVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(SKOSVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(SKOSVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(SKOSVocabulary.class));
    }

    @SuppressWarnings("deprecation")
    public void verifyEnumSKOSVocabulary() {
        SKOSVocabulary testSubject0 = SKOSVocabulary.BROADMATCH;
        SKOSVocabulary testSubject1 = SKOSVocabulary.BROADER;
        SKOSVocabulary testSubject2 = SKOSVocabulary.BROADERTRANSITIVE;
        SKOSVocabulary testSubject3 = SKOSVocabulary.CLOSEMATCH;
        SKOSVocabulary testSubject4 = SKOSVocabulary.EXACTMATCH;
        SKOSVocabulary testSubject5 = SKOSVocabulary.HASTOPCONCEPT;
        SKOSVocabulary testSubject6 = SKOSVocabulary.INSCHEME;
        SKOSVocabulary testSubject7 = SKOSVocabulary.MAPPINGRELATION;
        SKOSVocabulary testSubject8 = SKOSVocabulary.MEMBER;
        SKOSVocabulary testSubject9 = SKOSVocabulary.MEMBERLIST;
        SKOSVocabulary testSubject10 = SKOSVocabulary.NARROWMATCH;
        SKOSVocabulary testSubject11 = SKOSVocabulary.NARROWER;
        SKOSVocabulary testSubject12 = SKOSVocabulary.NARROWTRANSITIVE;
        SKOSVocabulary testSubject13 = SKOSVocabulary.RELATED;
        SKOSVocabulary testSubject14 = SKOSVocabulary.RELATEDMATCH;
        SKOSVocabulary testSubject15 = SKOSVocabulary.SEMANTICRELATION;
        SKOSVocabulary testSubject16 = SKOSVocabulary.TOPCONCEPTOF;
        SKOSVocabulary testSubject17 = SKOSVocabulary.COLLECTION;
        SKOSVocabulary testSubject18 = SKOSVocabulary.CONCEPT;
        SKOSVocabulary testSubject19 = SKOSVocabulary.CONCEPTSCHEME;
        SKOSVocabulary testSubject20 = SKOSVocabulary.ORDEREDCOLLECTION;
        SKOSVocabulary testSubject21 = SKOSVocabulary.TOPCONCEPT;
        SKOSVocabulary testSubject22 = SKOSVocabulary.ALTLABEL;
        SKOSVocabulary testSubject23 = SKOSVocabulary.CHANGENOTE;
        SKOSVocabulary testSubject24 = SKOSVocabulary.DEFINITION;
        SKOSVocabulary testSubject25 = SKOSVocabulary.EDITORIALNOTE;
        SKOSVocabulary testSubject26 = SKOSVocabulary.EXAMPLE;
        SKOSVocabulary testSubject27 = SKOSVocabulary.HIDDENLABEL;
        SKOSVocabulary testSubject28 = SKOSVocabulary.HISTORYNOTE;
        SKOSVocabulary testSubject29 = SKOSVocabulary.NOTE;
        SKOSVocabulary testSubject30 = SKOSVocabulary.PREFLABEL;
        SKOSVocabulary testSubject31 = SKOSVocabulary.SCOPENOTE;
        SKOSVocabulary testSubject32 = SKOSVocabulary.DOCUMENT;
        SKOSVocabulary testSubject33 = SKOSVocabulary.IMAGE;
        SKOSVocabulary testSubject34 = SKOSVocabulary.COLLECTABLEPROPERTY;
        SKOSVocabulary testSubject35 = SKOSVocabulary.RESOURCE;
        SKOSVocabulary testSubject36 = SKOSVocabulary.COMMENT;
        java.util.Set<OWLClass> result0 = SKOSVocabulary.getClasses(_OWLDataFactory);
        java.lang.String result1 = testSubject0.getPrefixedName();
        EntityType<?> result2 = testSubject0.getEntityType();
        IRI result3 = testSubject0.getIRI();
        java.util.Set<OWLAnnotationProperty> result4 = SKOSVocabulary.getAnnotationProperties(_OWLDataFactory);
        java.util.Set<OWLObjectProperty> result5 = SKOSVocabulary.getObjectProperties(_OWLDataFactory);
        java.util.Set<OWLDataProperty> result6 = SKOSVocabulary.getDataProperties(_OWLDataFactory);
        java.lang.String result7 = testSubject0.getShortForm();
        java.lang.String result8 = testSubject0.getLocalName();
    }

    @Test
    public void enforceInterfacesSWRLBuiltInsVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
    }

    public void verifyEnumSWRLBuiltInsVocabulary() {
        SWRLBuiltInsVocabulary testSubject0 = SWRLBuiltInsVocabulary.EQUAL;
        SWRLBuiltInsVocabulary testSubject1 = SWRLBuiltInsVocabulary.NOT_EQUAL;
        SWRLBuiltInsVocabulary testSubject2 = SWRLBuiltInsVocabulary.LESS_THAN;
        SWRLBuiltInsVocabulary testSubject3 = SWRLBuiltInsVocabulary.LESS_THAN_OR_EQUAL;
        SWRLBuiltInsVocabulary testSubject4 = SWRLBuiltInsVocabulary.GREATER_THAN;
        SWRLBuiltInsVocabulary testSubject5 = SWRLBuiltInsVocabulary.GREATER_THAN_OR_EQUAL;
        SWRLBuiltInsVocabulary testSubject6 = SWRLBuiltInsVocabulary.ADD;
        SWRLBuiltInsVocabulary testSubject7 = SWRLBuiltInsVocabulary.SUBTRACT;
        SWRLBuiltInsVocabulary testSubject8 = SWRLBuiltInsVocabulary.MULTIPLY;
        SWRLBuiltInsVocabulary testSubject9 = SWRLBuiltInsVocabulary.DIVIDE;
        SWRLBuiltInsVocabulary testSubject10 = SWRLBuiltInsVocabulary.INTEGER_DIVIDE;
        SWRLBuiltInsVocabulary testSubject11 = SWRLBuiltInsVocabulary.MOD;
        SWRLBuiltInsVocabulary testSubject12 = SWRLBuiltInsVocabulary.POW;
        SWRLBuiltInsVocabulary testSubject13 = SWRLBuiltInsVocabulary.UNARY_MINUS;
        SWRLBuiltInsVocabulary testSubject14 = SWRLBuiltInsVocabulary.UNARY_PLUS;
        SWRLBuiltInsVocabulary testSubject15 = SWRLBuiltInsVocabulary.ABS;
        SWRLBuiltInsVocabulary testSubject16 = SWRLBuiltInsVocabulary.CEILING;
        SWRLBuiltInsVocabulary testSubject17 = SWRLBuiltInsVocabulary.FLOOR;
        SWRLBuiltInsVocabulary testSubject18 = SWRLBuiltInsVocabulary.ROUND;
        SWRLBuiltInsVocabulary testSubject19 = SWRLBuiltInsVocabulary.ROUND_HALF_TO_EVEN;
        SWRLBuiltInsVocabulary testSubject20 = SWRLBuiltInsVocabulary.SIN;
        SWRLBuiltInsVocabulary testSubject21 = SWRLBuiltInsVocabulary.COS;
        SWRLBuiltInsVocabulary testSubject22 = SWRLBuiltInsVocabulary.TAN;
        SWRLBuiltInsVocabulary testSubject23 = SWRLBuiltInsVocabulary.BOOLEAN_NOT;
        SWRLBuiltInsVocabulary testSubject24 = SWRLBuiltInsVocabulary.STRING_EQUALS_IGNORE_CASE;
        SWRLBuiltInsVocabulary testSubject25 = SWRLBuiltInsVocabulary.STRING_CONCAT;
        SWRLBuiltInsVocabulary testSubject26 = SWRLBuiltInsVocabulary.SUBSTRING;
        SWRLBuiltInsVocabulary testSubject27 = SWRLBuiltInsVocabulary.STRING_LENGTH;
        SWRLBuiltInsVocabulary testSubject28 = SWRLBuiltInsVocabulary.NORMALIZE_SPACE;
        SWRLBuiltInsVocabulary testSubject29 = SWRLBuiltInsVocabulary.UPPER_CASE;
        SWRLBuiltInsVocabulary testSubject30 = SWRLBuiltInsVocabulary.LOWER_CASE;
        SWRLBuiltInsVocabulary testSubject31 = SWRLBuiltInsVocabulary.TRANSLATE;
        SWRLBuiltInsVocabulary testSubject32 = SWRLBuiltInsVocabulary.CONTAINS;
        SWRLBuiltInsVocabulary testSubject33 = SWRLBuiltInsVocabulary.CONTAINS_IGNORE_CASE;
        SWRLBuiltInsVocabulary testSubject34 = SWRLBuiltInsVocabulary.STARTS_WITH;
        SWRLBuiltInsVocabulary testSubject35 = SWRLBuiltInsVocabulary.ENDS_WITH;
        SWRLBuiltInsVocabulary testSubject36 = SWRLBuiltInsVocabulary.SUBSTRING_BEFORE;
        SWRLBuiltInsVocabulary testSubject37 = SWRLBuiltInsVocabulary.SUBSTRING_AFTER;
        SWRLBuiltInsVocabulary testSubject38 = SWRLBuiltInsVocabulary.MATCHES;
        SWRLBuiltInsVocabulary testSubject39 = SWRLBuiltInsVocabulary.REPLACE;
        SWRLBuiltInsVocabulary testSubject40 = SWRLBuiltInsVocabulary.TOKENIZE;
        SWRLBuiltInsVocabulary testSubject41 = SWRLBuiltInsVocabulary.YEAR_MONTH_DURATION;
        SWRLBuiltInsVocabulary testSubject42 = SWRLBuiltInsVocabulary.DAY_TIME_DURATION;
        SWRLBuiltInsVocabulary testSubject43 = SWRLBuiltInsVocabulary.DATE_TIME;
        SWRLBuiltInsVocabulary testSubject44 = SWRLBuiltInsVocabulary.DATE;
        SWRLBuiltInsVocabulary testSubject45 = SWRLBuiltInsVocabulary.TIME;
        SWRLBuiltInsVocabulary testSubject46 = SWRLBuiltInsVocabulary.SUBTRACT_DATES;
        SWRLBuiltInsVocabulary testSubject47 = SWRLBuiltInsVocabulary.SUBTRACT_TIMES;
        SWRLBuiltInsVocabulary testSubject48 = SWRLBuiltInsVocabulary.RESOLVE_URI;
        SWRLBuiltInsVocabulary testSubject49 = SWRLBuiltInsVocabulary.ANY_URI;
        SWRLBuiltInsVocabulary testSubject50 = SWRLBuiltInsVocabulary.ADD_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject51 = SWRLBuiltInsVocabulary.SUBTRACT_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject52 = SWRLBuiltInsVocabulary.MULTIPLY_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject53 = SWRLBuiltInsVocabulary.DIVIDE_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject54 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject55 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject56 = SWRLBuiltInsVocabulary.MULTIPLY_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject57 = SWRLBuiltInsVocabulary.DIVIDE_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject58 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATION_TO_DATE_TIME;
        SWRLBuiltInsVocabulary testSubject59 = SWRLBuiltInsVocabulary.SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE_TIME;
        SWRLBuiltInsVocabulary testSubject60 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATION_FROM_DATE_TIME;
        SWRLBuiltInsVocabulary testSubject61 = SWRLBuiltInsVocabulary.ADD_YEAR_MONTH_DURATION_TO_DATE;
        SWRLBuiltInsVocabulary testSubject62 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATION_TO_DATE;
        SWRLBuiltInsVocabulary testSubject63 = SWRLBuiltInsVocabulary.SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE;
        SWRLBuiltInsVocabulary testSubject64 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATION_FROM_DATE;
        SWRLBuiltInsVocabulary testSubject65 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATION_FROM_TIME;
        SWRLBuiltInsVocabulary testSubject66 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATION_FROM_TIME;
        SWRLBuiltInsVocabulary testSubject67 = SWRLBuiltInsVocabulary.SUBTRACT_DATE_TIMES_YIELDING_YEAR_MONTH_DURATION;
        SWRLBuiltInsVocabulary testSubject68 = SWRLBuiltInsVocabulary.SUBTRACT_DATE_TIMES_YIELDING_DAY_TIME_DURATION;
        java.lang.String result0 = testSubject0.getPrefixedName();
        int result1 = testSubject0.getMinArity();
        int result2 = testSubject0.getMaxArity();
        org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary result3 = SWRLBuiltInsVocabulary.getBuiltIn(_IRI);
        IRI result4 = testSubject0.getIRI();
        java.lang.String result5 = testSubject0.getShortForm();
    }

    @Test
    public void enforceInterfacesSWRLVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(SWRLVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(SWRLVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(SWRLVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(SWRLVocabulary.class));
    }

    public void verifyEnumSWRLVocabulary() {
        SWRLVocabulary testSubject0 = SWRLVocabulary.IMP;
        SWRLVocabulary testSubject1 = SWRLVocabulary.INDIVIDUAL_PROPERTY_ATOM;
        SWRLVocabulary testSubject2 = SWRLVocabulary.DATAVALUED_PROPERTY_ATOM;
        SWRLVocabulary testSubject3 = SWRLVocabulary.CLASS_ATOM;
        SWRLVocabulary testSubject4 = SWRLVocabulary.DATA_RANGE_ATOM;
        SWRLVocabulary testSubject5 = SWRLVocabulary.VARIABLE;
        SWRLVocabulary testSubject6 = SWRLVocabulary.ATOM_LIST;
        SWRLVocabulary testSubject7 = SWRLVocabulary.SAME_INDIVIDUAL_ATOM;
        SWRLVocabulary testSubject8 = SWRLVocabulary.DIFFERENT_INDIVIDUALS_ATOM;
        SWRLVocabulary testSubject9 = SWRLVocabulary.BUILT_IN_ATOM;
        SWRLVocabulary testSubject10 = SWRLVocabulary.HEAD;
        SWRLVocabulary testSubject11 = SWRLVocabulary.BODY;
        SWRLVocabulary testSubject12 = SWRLVocabulary.CLASS_PREDICATE;
        SWRLVocabulary testSubject13 = SWRLVocabulary.DATA_RANGE;
        SWRLVocabulary testSubject14 = SWRLVocabulary.PROPERTY_PREDICATE;
        SWRLVocabulary testSubject15 = SWRLVocabulary.BUILT_IN;
        SWRLVocabulary testSubject16 = SWRLVocabulary.BUILT_IN_CLASS;
        SWRLVocabulary testSubject17 = SWRLVocabulary.ARGUMENTS;
        SWRLVocabulary testSubject18 = SWRLVocabulary.ARGUMENT_1;
        SWRLVocabulary testSubject19 = SWRLVocabulary.ARGUMENT_2;
        java.lang.String result0 = testSubject0.getPrefixedName();
        IRI result1 = testSubject0.getIRI();
        java.lang.String result2 = testSubject0.getShortForm();
    }

    @Test
    public void enforceInterfacesXSDVocabulary() {
        assertTrue(java.lang.Enum.class.isAssignableFrom(XSDVocabulary.class));
        assertTrue(HasShortForm.class.isAssignableFrom(XSDVocabulary.class));
        assertTrue(HasIRI.class.isAssignableFrom(XSDVocabulary.class));
        assertTrue(HasPrefixedName.class.isAssignableFrom(XSDVocabulary.class));
    }

    public void verifyEnumXSDVocabulary() {
        XSDVocabulary testSubject0 = XSDVocabulary.ANY_TYPE;
        XSDVocabulary testSubject1 = XSDVocabulary.ANY_SIMPLE_TYPE;
        XSDVocabulary testSubject2 = XSDVocabulary.STRING;
        XSDVocabulary testSubject3 = XSDVocabulary.INTEGER;
        XSDVocabulary testSubject4 = XSDVocabulary.LONG;
        XSDVocabulary testSubject5 = XSDVocabulary.INT;
        XSDVocabulary testSubject6 = XSDVocabulary.SHORT;
        XSDVocabulary testSubject7 = XSDVocabulary.BYTE;
        XSDVocabulary testSubject8 = XSDVocabulary.DECIMAL;
        XSDVocabulary testSubject9 = XSDVocabulary.FLOAT;
        XSDVocabulary testSubject10 = XSDVocabulary.BOOLEAN;
        XSDVocabulary testSubject11 = XSDVocabulary.DOUBLE;
        XSDVocabulary testSubject12 = XSDVocabulary.NON_POSITIVE_INTEGER;
        XSDVocabulary testSubject13 = XSDVocabulary.NEGATIVE_INTEGER;
        XSDVocabulary testSubject14 = XSDVocabulary.NON_NEGATIVE_INTEGER;
        XSDVocabulary testSubject15 = XSDVocabulary.UNSIGNED_LONG;
        XSDVocabulary testSubject16 = XSDVocabulary.UNSIGNED_INT;
        XSDVocabulary testSubject17 = XSDVocabulary.POSITIVE_INTEGER;
        XSDVocabulary testSubject18 = XSDVocabulary.BASE_64_BINARY;
        XSDVocabulary testSubject19 = XSDVocabulary.NORMALIZED_STRING;
        XSDVocabulary testSubject20 = XSDVocabulary.HEX_BINARY;
        XSDVocabulary testSubject21 = XSDVocabulary.ANY_URI;
        XSDVocabulary testSubject22 = XSDVocabulary.Q_NAME;
        XSDVocabulary testSubject23 = XSDVocabulary.NOTATION;
        XSDVocabulary testSubject24 = XSDVocabulary.TOKEN;
        XSDVocabulary testSubject25 = XSDVocabulary.LANGUAGE;
        XSDVocabulary testSubject26 = XSDVocabulary.NAME;
        XSDVocabulary testSubject27 = XSDVocabulary.NCNAME;
        XSDVocabulary testSubject28 = XSDVocabulary.NMTOKEN;
        XSDVocabulary testSubject29 = XSDVocabulary.ID;
        XSDVocabulary testSubject30 = XSDVocabulary.IDREF;
        XSDVocabulary testSubject31 = XSDVocabulary.IDREFS;
        XSDVocabulary testSubject32 = XSDVocabulary.ENTITY;
        XSDVocabulary testSubject33 = XSDVocabulary.ENTITIES;
        XSDVocabulary testSubject34 = XSDVocabulary.DURATION;
        XSDVocabulary testSubject35 = XSDVocabulary.DATE_TIME;
        XSDVocabulary testSubject36 = XSDVocabulary.DATE_TIME_STAMP;
        XSDVocabulary testSubject37 = XSDVocabulary.TIME;
        XSDVocabulary testSubject38 = XSDVocabulary.DATE;
        XSDVocabulary testSubject39 = XSDVocabulary.G_YEAR_MONTH;
        XSDVocabulary testSubject40 = XSDVocabulary.G_YEAR;
        XSDVocabulary testSubject41 = XSDVocabulary.G_MONTH_DAY;
        XSDVocabulary testSubject42 = XSDVocabulary.G_DAY;
        XSDVocabulary testSubject43 = XSDVocabulary.G_MONTH;
        XSDVocabulary testSubject44 = XSDVocabulary.UNSIGNED_SHORT;
        XSDVocabulary testSubject45 = XSDVocabulary.UNSIGNED_BYTE;
        org.semanticweb.owlapi.vocab.XSDVocabulary result0 = XSDVocabulary.parseShortName(_String);
        java.lang.String result1 = testSubject0.getPrefixedName();
        IRI result2 = testSubject0.getIRI();
        java.lang.String result3 = testSubject0.getShortForm();
    }

    private java.lang.String _String;
    private IRI _IRI;
    private OWLDataFactory _OWLDataFactory;
}
