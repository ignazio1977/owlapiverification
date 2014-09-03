package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.vocab.BuiltInVocabulary;
import org.semanticweb.owlapi.vocab.DublinCoreVocabulary;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.vocab.OWLXMLVocabulary;
import org.semanticweb.owlapi.formats.PrefixDocumentFormat;
import org.semanticweb.owlapi.vocab.SKOSVocabulary;
import org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary;
import org.semanticweb.owlapi.vocab.SWRLVocabulary;
import org.semanticweb.owlapi.vocab.XSDVocabulary;
import org.semanticweb.owlapi.model.*;

@SuppressWarnings({ "javadoc", "deprecation", "null", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: org.semanticweb.owlapi.vocab.PrefixOWLOntologyFormat to org.semanticweb.owlapi.formats.PrefixOWLOntologyFormat",
        "method deleted: DublinCoreVocabulary::getURI()", "method deleted: OWL2Datatype::getURI()", "method deleted: OWLRDFVocabulary::getURI()",
        "method deleted: OWLXMLVocabulary::getURI()", "method deleted: SWRLVocabulary::getURI()", "method deleted: SKOSVocabulary::getURI()",
        "method changed: PrefixOWLOntologyFormat::clearPrefixes() : clear()", "method changed: OWL2Datatype::getShortName() : getShortForm()",
        "method changed: OWLRDFVocabulary::getShortName() : getShortForm()", "method changed: OWLXMLVocabulary::getShortName() : getShortForm()",
        "method changed: SWRLVocabulary::getShortName() : getShortForm()", "method changed: SKOSVocabulary::getShortName() : getShortForm()",
        "method changed: OWLFacet::getShortName() : getShortForm()", "method changed: DublinCoreVocabulary::getQName() : getPrefixedName()",
        "method changed: SWRLBuiltInsVocabulary::getShortName() : getShortForm()", "method changed: SWRLBuiltInsVocabulary::getArity() : getMinArity(), getMaxArity()",
        "method changed: SWRLBuiltInsVocabulary::getShortName() : getShortForm()", })
public class Gen_org_semanticweb_owlapi_vocab {
    @Test
    public void enforceInterfacesBuiltInVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(BuiltInVocabulary.class));
    }

    public void verifyEnumBuiltInVocabulary() {
        BuiltInVocabulary testSubject0 = BuiltInVocabulary.DUBLIN_CORE;
        BuiltInVocabulary testSubject1 = BuiltInVocabulary.SKOS;
        BuiltInVocabulary testSubject2 = BuiltInVocabulary.SWRL;
    }

    @Test
    public void enforceInterfacesDublinCoreVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(DublinCoreVocabulary.class));
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
        String result0 = testSubject0.getShortForm();
        IRI result1 = testSubject0.getIRI();
        String result3 = testSubject0.getPrefixedName();
    }

    @Test
    public void enforceInterfacesNamespaces() {
        assertTrue(Enum.class.isAssignableFrom(Namespaces.class));
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
        boolean result2 = testSubject0.isBuiltIn();
        String result3 = testSubject0.getPrefixIRI();
        String result4 = testSubject0.getPrefixName();
        boolean result5 = testSubject0.isInUse();
    }

    @Test
    public void enforceInterfacesOWL2Datatype() {
        assertTrue(Enum.class.isAssignableFrom(OWL2Datatype.class));
    }

    public void verifyEnumOWL2Datatype() {
        OWL2Datatype testSubject0 = OWL2Datatype.RDF_XML_LITERAL;
        OWL2Datatype testSubject1 = OWL2Datatype.RDFS_LITERAL;
        OWL2Datatype testSubject2 = OWL2Datatype.RDF_PLAIN_LITERAL;
        OWL2Datatype testSubject3 = OWL2Datatype.OWL_REAL;
        OWL2Datatype testSubject4 = OWL2Datatype.OWL_RATIONAL;
        OWL2Datatype testSubject5 = OWL2Datatype.XSD_DECIMAL;
        OWL2Datatype testSubject6 = OWL2Datatype.XSD_INTEGER;
        OWL2Datatype testSubject7 = OWL2Datatype.XSD_NON_NEGATIVE_INTEGER;
        OWL2Datatype testSubject8 = OWL2Datatype.XSD_NON_POSITIVE_INTEGER;
        OWL2Datatype testSubject9 = OWL2Datatype.XSD_POSITIVE_INTEGER;
        OWL2Datatype testSubject10 = OWL2Datatype.XSD_NEGATIVE_INTEGER;
        OWL2Datatype testSubject11 = OWL2Datatype.XSD_LONG;
        OWL2Datatype testSubject12 = OWL2Datatype.XSD_INT;
        OWL2Datatype testSubject13 = OWL2Datatype.XSD_SHORT;
        OWL2Datatype testSubject14 = OWL2Datatype.XSD_BYTE;
        OWL2Datatype testSubject15 = OWL2Datatype.XSD_UNSIGNED_LONG;
        OWL2Datatype testSubject16 = OWL2Datatype.XSD_UNSIGNED_INT;
        OWL2Datatype testSubject17 = OWL2Datatype.XSD_UNSIGNED_SHORT;
        OWL2Datatype testSubject18 = OWL2Datatype.XSD_UNSIGNED_BYTE;
        OWL2Datatype testSubject19 = OWL2Datatype.XSD_DOUBLE;
        OWL2Datatype testSubject20 = OWL2Datatype.XSD_FLOAT;
        OWL2Datatype testSubject21 = OWL2Datatype.XSD_STRING;
        OWL2Datatype testSubject22 = OWL2Datatype.XSD_NORMALIZED_STRING;
        OWL2Datatype testSubject23 = OWL2Datatype.XSD_TOKEN;
        OWL2Datatype testSubject24 = OWL2Datatype.XSD_LANGUAGE;
        OWL2Datatype testSubject25 = OWL2Datatype.XSD_NAME;
        OWL2Datatype testSubject26 = OWL2Datatype.XSD_NCNAME;
        OWL2Datatype testSubject27 = OWL2Datatype.XSD_NMTOKEN;
        OWL2Datatype testSubject28 = OWL2Datatype.XSD_BOOLEAN;
        OWL2Datatype testSubject29 = OWL2Datatype.XSD_HEX_BINARY;
        OWL2Datatype testSubject30 = OWL2Datatype.XSD_BASE_64_BINARY;
        OWL2Datatype testSubject31 = OWL2Datatype.XSD_ANY_URI;
        OWL2Datatype testSubject32 = OWL2Datatype.XSD_DATE_TIME;
        OWL2Datatype testSubject33 = OWL2Datatype.XSD_DATE_TIME_STAMP;
        boolean result0 = testSubject0.isFinite();
        boolean result1 = testSubject0.isNumeric();
        boolean result2 = OWL2Datatype.isBuiltIn(_IRI);
        String result3 = testSubject0.getShortForm();
        org.semanticweb.owlapi.vocab.OWL2Datatype result4 = OWL2Datatype.getDatatype(_IRI);
        OWLDatatype result5 = testSubject0.getDatatype(_OWLDataFactory);
        java.util.Set<IRI> result6 = OWL2Datatype.getDatatypeIRIs();
        java.util.regex.Pattern result7 = testSubject0.getPattern();
        org.semanticweb.owlapi.vocab.OWL2Datatype.Category result8 = testSubject0.getCategory();
        java.util.Collection<org.semanticweb.owlapi.vocab.OWLFacet> result9 = testSubject0.getFacets();
        boolean result10 = testSubject0.isInLexicalSpace(_String);
        IRI result11 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLFacet() {
        assertTrue(Enum.class.isAssignableFrom(OWLFacet.class));
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
        String result0 = testSubject0.getShortForm();
        java.util.Set<String> result1 = OWLFacet.getFacets();
        org.semanticweb.owlapi.vocab.OWLFacet result2 = OWLFacet.getFacet(_IRI);
        String result3 = testSubject0.getSymbolicForm();
        java.util.Set<IRI> result4 = OWLFacet.getFacetIRIs();
        org.semanticweb.owlapi.vocab.OWLFacet result5 = OWLFacet.getFacetByShortName(_String);
        org.semanticweb.owlapi.vocab.OWLFacet result6 = OWLFacet.getFacetBySymbolicName(_String);
        IRI result7 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLRDFVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(OWLRDFVocabulary.class));
    }

    public void verifyEnumOWLRDFVocabulary() {
        OWLRDFVocabulary testSubject0 = OWLRDFVocabulary.OWL_THING;
        OWLRDFVocabulary testSubject1 = OWLRDFVocabulary.OWL_NOTHING;
        OWLRDFVocabulary testSubject2 = OWLRDFVocabulary.OWL_CLASS;
        OWLRDFVocabulary testSubject3 = OWLRDFVocabulary.OWL_ONTOLOGY;
        OWLRDFVocabulary testSubject4 = OWLRDFVocabulary.OWL_ONTOLOGY_PROPERTY;
        OWLRDFVocabulary testSubject5 = OWLRDFVocabulary.OWL_IMPORTS;
        OWLRDFVocabulary testSubject6 = OWLRDFVocabulary.OWL_VERSION_IRI;
        OWLRDFVocabulary testSubject7 = OWLRDFVocabulary.OWL_VERSION_INFO;
        OWLRDFVocabulary testSubject8 = OWLRDFVocabulary.OWL_EQUIVALENT_CLASS;
        OWLRDFVocabulary testSubject9 = OWLRDFVocabulary.OWL_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject10 = OWLRDFVocabulary.OWL_DATA_PROPERTY;
        OWLRDFVocabulary testSubject11 = OWLRDFVocabulary.OWL_FUNCTIONAL_PROPERTY;
        OWLRDFVocabulary testSubject12 = OWLRDFVocabulary.OWL_INVERSE_FUNCTIONAL_PROPERTY;
        OWLRDFVocabulary testSubject13 = OWLRDFVocabulary.OWL_ANTI_SYMMETRIC_PROPERTY;
        OWLRDFVocabulary testSubject14 = OWLRDFVocabulary.OWL_ASYMMETRIC_PROPERTY;
        OWLRDFVocabulary testSubject15 = OWLRDFVocabulary.OWL_SYMMETRIC_PROPERTY;
        OWLRDFVocabulary testSubject16 = OWLRDFVocabulary.OWL_RESTRICTION;
        OWLRDFVocabulary testSubject17 = OWLRDFVocabulary.OWL_DATA_RESTRICTION;
        OWLRDFVocabulary testSubject18 = OWLRDFVocabulary.OWL_OBJECT_RESTRICTION;
        OWLRDFVocabulary testSubject19 = OWLRDFVocabulary.OWL_ON_PROPERTY;
        OWLRDFVocabulary testSubject20 = OWLRDFVocabulary.OWL_INTERSECTION_OF;
        OWLRDFVocabulary testSubject21 = OWLRDFVocabulary.OWL_UNION_OF;
        OWLRDFVocabulary testSubject22 = OWLRDFVocabulary.OWL_ALL_VALUES_FROM;
        OWLRDFVocabulary testSubject23 = OWLRDFVocabulary.OWL_SOME_VALUES_FROM;
        OWLRDFVocabulary testSubject24 = OWLRDFVocabulary.OWL_HAS_VALUE;
        OWLRDFVocabulary testSubject25 = OWLRDFVocabulary.OWL_DISJOINT_WITH;
        OWLRDFVocabulary testSubject26 = OWLRDFVocabulary.OWL_ONE_OF;
        OWLRDFVocabulary testSubject27 = OWLRDFVocabulary.OWL_SELF_RESTRICTION;
        OWLRDFVocabulary testSubject28 = OWLRDFVocabulary.OWL_HAS_SELF;
        OWLRDFVocabulary testSubject29 = OWLRDFVocabulary.OWL_DISJOINT_UNION_OF;
        OWLRDFVocabulary testSubject30 = OWLRDFVocabulary.OWL_MIN_CARDINALITY;
        OWLRDFVocabulary testSubject31 = OWLRDFVocabulary.OWL_MIN_QUALIFIED_CARDINALITY;
        OWLRDFVocabulary testSubject32 = OWLRDFVocabulary.OWL_CARDINALITY;
        OWLRDFVocabulary testSubject33 = OWLRDFVocabulary.OWL_QUALIFIED_CARDINALITY;
        OWLRDFVocabulary testSubject34 = OWLRDFVocabulary.OWL_ANNOTATION_PROPERTY;
        OWLRDFVocabulary testSubject35 = OWLRDFVocabulary.OWL_ANNOTATION;
        OWLRDFVocabulary testSubject36 = OWLRDFVocabulary.OWL_DECLARED_AS;
        OWLRDFVocabulary testSubject37 = OWLRDFVocabulary.OWL_INDIVIDUAL;
        OWLRDFVocabulary testSubject38 = OWLRDFVocabulary.OWL_NAMED_INDIVIDUAL;
        OWLRDFVocabulary testSubject39 = OWLRDFVocabulary.OWL_DATATYPE;
        OWLRDFVocabulary testSubject40 = OWLRDFVocabulary.RDFS_SUBCLASS_OF;
        OWLRDFVocabulary testSubject41 = OWLRDFVocabulary.RDFS_SUB_PROPERTY_OF;
        OWLRDFVocabulary testSubject42 = OWLRDFVocabulary.RDF_TYPE;
        OWLRDFVocabulary testSubject43 = OWLRDFVocabulary.RDF_NIL;
        OWLRDFVocabulary testSubject44 = OWLRDFVocabulary.RDF_REST;
        OWLRDFVocabulary testSubject45 = OWLRDFVocabulary.RDF_FIRST;
        OWLRDFVocabulary testSubject46 = OWLRDFVocabulary.RDF_LIST;
        OWLRDFVocabulary testSubject47 = OWLRDFVocabulary.OWL_MAX_CARDINALITY;
        OWLRDFVocabulary testSubject48 = OWLRDFVocabulary.OWL_MAX_QUALIFIED_CARDINALITY;
        OWLRDFVocabulary testSubject49 = OWLRDFVocabulary.OWL_NEGATIVE_OBJECT_PROPERTY_ASSERTION;
        OWLRDFVocabulary testSubject50 = OWLRDFVocabulary.OWL_NEGATIVE_DATA_PROPERTY_ASSERTION;
        OWLRDFVocabulary testSubject51 = OWLRDFVocabulary.OWL_NEGATIVE_PROPERTY_ASSERTION;
        OWLRDFVocabulary testSubject52 = OWLRDFVocabulary.RDFS_LABEL;
        OWLRDFVocabulary testSubject53 = OWLRDFVocabulary.RDFS_COMMENT;
        OWLRDFVocabulary testSubject54 = OWLRDFVocabulary.RDFS_SEE_ALSO;
        OWLRDFVocabulary testSubject55 = OWLRDFVocabulary.RDFS_IS_DEFINED_BY;
        OWLRDFVocabulary testSubject56 = OWLRDFVocabulary.RDFS_RESOURCE;
        OWLRDFVocabulary testSubject57 = OWLRDFVocabulary.RDFS_LITERAL;
        OWLRDFVocabulary testSubject58 = OWLRDFVocabulary.RDF_PLAIN_LITERAL;
        OWLRDFVocabulary testSubject59 = OWLRDFVocabulary.RDFS_DATATYPE;
        OWLRDFVocabulary testSubject60 = OWLRDFVocabulary.OWL_TRANSITIVE_PROPERTY;
        OWLRDFVocabulary testSubject61 = OWLRDFVocabulary.OWL_REFLEXIVE_PROPERTY;
        OWLRDFVocabulary testSubject62 = OWLRDFVocabulary.OWL_IRREFLEXIVE_PROPERTY;
        OWLRDFVocabulary testSubject63 = OWLRDFVocabulary.OWL_INVERSE_OF;
        OWLRDFVocabulary testSubject64 = OWLRDFVocabulary.OWL_COMPLEMENT_OF;
        OWLRDFVocabulary testSubject65 = OWLRDFVocabulary.OWL_DATATYPE_COMPLEMENT_OF;
        OWLRDFVocabulary testSubject66 = OWLRDFVocabulary.OWL_ALL_DIFFERENT;
        OWLRDFVocabulary testSubject67 = OWLRDFVocabulary.OWL_DISTINCT_MEMBERS;
        OWLRDFVocabulary testSubject68 = OWLRDFVocabulary.OWL_SAME_AS;
        OWLRDFVocabulary testSubject69 = OWLRDFVocabulary.OWL_DIFFERENT_FROM;
        OWLRDFVocabulary testSubject70 = OWLRDFVocabulary.OWL_DEPRECATED_PROPERTY;
        OWLRDFVocabulary testSubject71 = OWLRDFVocabulary.OWL_EQUIVALENT_PROPERTY;
        OWLRDFVocabulary testSubject72 = OWLRDFVocabulary.OWL_DEPRECATED_CLASS;
        OWLRDFVocabulary testSubject73 = OWLRDFVocabulary.OWL_DATA_RANGE;
        OWLRDFVocabulary testSubject74 = OWLRDFVocabulary.RDFS_DOMAIN;
        OWLRDFVocabulary testSubject75 = OWLRDFVocabulary.RDFS_RANGE;
        OWLRDFVocabulary testSubject76 = OWLRDFVocabulary.RDFS_CLASS;
        OWLRDFVocabulary testSubject77 = OWLRDFVocabulary.RDF_PROPERTY;
        OWLRDFVocabulary testSubject78 = OWLRDFVocabulary.RDF_SUBJECT;
        OWLRDFVocabulary testSubject79 = OWLRDFVocabulary.RDF_PREDICATE;
        OWLRDFVocabulary testSubject80 = OWLRDFVocabulary.RDF_OBJECT;
        OWLRDFVocabulary testSubject81 = OWLRDFVocabulary.OWL_SUBJECT;
        OWLRDFVocabulary testSubject82 = OWLRDFVocabulary.OWL_PREDICATE;
        OWLRDFVocabulary testSubject83 = OWLRDFVocabulary.OWL_OBJECT;
        OWLRDFVocabulary testSubject84 = OWLRDFVocabulary.RDF_DESCRIPTION;
        OWLRDFVocabulary testSubject85 = OWLRDFVocabulary.RDF_XML_LITERAL;
        OWLRDFVocabulary testSubject86 = OWLRDFVocabulary.OWL_PRIOR_VERSION;
        OWLRDFVocabulary testSubject87 = OWLRDFVocabulary.OWL_DEPRECATED;
        OWLRDFVocabulary testSubject88 = OWLRDFVocabulary.OWL_BACKWARD_COMPATIBLE_WITH;
        OWLRDFVocabulary testSubject89 = OWLRDFVocabulary.OWL_INCOMPATIBLE_WITH;
        OWLRDFVocabulary testSubject90 = OWLRDFVocabulary.OWL_OBJECT_PROPERTY_DOMAIN;
        OWLRDFVocabulary testSubject91 = OWLRDFVocabulary.OWL_DATA_PROPERTY_DOMAIN;
        OWLRDFVocabulary testSubject92 = OWLRDFVocabulary.OWL_DATA_PROPERTY_RANGE;
        OWLRDFVocabulary testSubject93 = OWLRDFVocabulary.OWL_OBJECT_PROPERTY_RANGE;
        OWLRDFVocabulary testSubject94 = OWLRDFVocabulary.OWL_SUB_OBJECT_PROPERTY_OF;
        OWLRDFVocabulary testSubject95 = OWLRDFVocabulary.OWL_SUB_DATA_PROPERTY_OF;
        OWLRDFVocabulary testSubject96 = OWLRDFVocabulary.OWL_DISJOINT_DATA_PROPERTIES;
        OWLRDFVocabulary testSubject97 = OWLRDFVocabulary.OWL_DISJOINT_OBJECT_PROPERTIES;
        OWLRDFVocabulary testSubject98 = OWLRDFVocabulary.OWL_PROPERTY_DISJOINT_WITH;
        OWLRDFVocabulary testSubject99 = OWLRDFVocabulary.OWL_EQUIVALENT_DATA_PROPERTIES;
        OWLRDFVocabulary testSubject100 = OWLRDFVocabulary.OWL_EQUIVALENT_OBJECT_PROPERTIES;
        OWLRDFVocabulary testSubject101 = OWLRDFVocabulary.OWL_FUNCTIONAL_DATA_PROPERTY;
        OWLRDFVocabulary testSubject102 = OWLRDFVocabulary.OWL_FUNCTIONAL_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject103 = OWLRDFVocabulary.OWL_ON_CLASS;
        OWLRDFVocabulary testSubject104 = OWLRDFVocabulary.OWL_ON_DATA_RANGE;
        OWLRDFVocabulary testSubject105 = OWLRDFVocabulary.OWL_ON_DATA_TYPE;
        OWLRDFVocabulary testSubject106 = OWLRDFVocabulary.OWL_WITH_RESTRICTIONS;
        OWLRDFVocabulary testSubject107 = OWLRDFVocabulary.OWL_INVERSE_OBJECT_PROPERTY_EXPRESSION;
        OWLRDFVocabulary testSubject108 = OWLRDFVocabulary.OWL_AXIOM;
        OWLRDFVocabulary testSubject109 = OWLRDFVocabulary.OWL_PROPERTY_CHAIN;
        OWLRDFVocabulary testSubject110 = OWLRDFVocabulary.OWL_PROPERTY_CHAIN_AXIOM;
        OWLRDFVocabulary testSubject111 = OWLRDFVocabulary.OWL_ALL_DISJOINT_CLASSES;
        OWLRDFVocabulary testSubject112 = OWLRDFVocabulary.OWL_MEMBERS;
        OWLRDFVocabulary testSubject113 = OWLRDFVocabulary.OWL_ALL_DISJOINT_PROPERTIES;
        OWLRDFVocabulary testSubject114 = OWLRDFVocabulary.OWL_TOP_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject115 = OWLRDFVocabulary.OWL_BOTTOM_OBJECT_PROPERTY;
        OWLRDFVocabulary testSubject116 = OWLRDFVocabulary.OWL_TOP_DATA_PROPERTY;
        OWLRDFVocabulary testSubject117 = OWLRDFVocabulary.OWL_BOTTOM_DATA_PROPERTY;
        OWLRDFVocabulary testSubject118 = OWLRDFVocabulary.OWL_HAS_KEY;
        OWLRDFVocabulary testSubject119 = OWLRDFVocabulary.OWL_ANNOTATED_SOURCE;
        OWLRDFVocabulary testSubject120 = OWLRDFVocabulary.OWL_ANNOTATED_PROPERTY;
        OWLRDFVocabulary testSubject121 = OWLRDFVocabulary.OWL_ANNOTATED_TARGET;
        OWLRDFVocabulary testSubject122 = OWLRDFVocabulary.OWL_SOURCE_INDIVIDUAL;
        OWLRDFVocabulary testSubject123 = OWLRDFVocabulary.OWL_ASSERTION_PROPERTY;
        OWLRDFVocabulary testSubject124 = OWLRDFVocabulary.OWL_TARGET_INDIVIDUAL;
        OWLRDFVocabulary testSubject125 = OWLRDFVocabulary.OWL_TARGET_VALUE;
        org.semanticweb.owlapi.vocab.Namespaces result0 = testSubject0.getNamespace();
        String result1 = testSubject0.getShortForm();
        IRI result2 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesOWLXMLVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(OWLXMLVocabulary.class));
    }

    public void verifyEnumOWLXMLVocabulary() {
        OWLXMLVocabulary testSubject0 = OWLXMLVocabulary.CLASS;
        OWLXMLVocabulary testSubject1 = OWLXMLVocabulary.DATA_PROPERTY;
        OWLXMLVocabulary testSubject2 = OWLXMLVocabulary.OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject3 = OWLXMLVocabulary.NAMED_INDIVIDUAL;
        OWLXMLVocabulary testSubject4 = OWLXMLVocabulary.ANNOTATION_PROPERTY;
        OWLXMLVocabulary testSubject5 = OWLXMLVocabulary.DATATYPE;
        OWLXMLVocabulary testSubject6 = OWLXMLVocabulary.ANNOTATION;
        OWLXMLVocabulary testSubject7 = OWLXMLVocabulary.ANONYMOUS_INDIVIDUAL;
        OWLXMLVocabulary testSubject8 = OWLXMLVocabulary.NODE_ID;
        OWLXMLVocabulary testSubject9 = OWLXMLVocabulary.ANNOTATION_URI;
        OWLXMLVocabulary testSubject10 = OWLXMLVocabulary.IMPORT;
        OWLXMLVocabulary testSubject11 = OWLXMLVocabulary.LABEL;
        OWLXMLVocabulary testSubject12 = OWLXMLVocabulary.COMMENT;
        OWLXMLVocabulary testSubject13 = OWLXMLVocabulary.DOCUMENTATION;
        OWLXMLVocabulary testSubject14 = OWLXMLVocabulary.ONTOLOGY;
        OWLXMLVocabulary testSubject15 = OWLXMLVocabulary.LITERAL;
        OWLXMLVocabulary testSubject16 = OWLXMLVocabulary.OBJECT_INVERSE_OF;
        OWLXMLVocabulary testSubject17 = OWLXMLVocabulary.DATA_COMPLEMENT_OF;
        OWLXMLVocabulary testSubject18 = OWLXMLVocabulary.DATA_ONE_OF;
        OWLXMLVocabulary testSubject19 = OWLXMLVocabulary.DATATYPE_RESTRICTION;
        OWLXMLVocabulary testSubject20 = OWLXMLVocabulary.FACET_RESTRICTION;
        OWLXMLVocabulary testSubject21 = OWLXMLVocabulary.DATA_UNION_OF;
        OWLXMLVocabulary testSubject22 = OWLXMLVocabulary.DATA_INTERSECTION_OF;
        OWLXMLVocabulary testSubject23 = OWLXMLVocabulary.DATATYPE_FACET;
        OWLXMLVocabulary testSubject24 = OWLXMLVocabulary.DATATYPE_IRI;
        OWLXMLVocabulary testSubject25 = OWLXMLVocabulary.DATA_RANGE;
        OWLXMLVocabulary testSubject26 = OWLXMLVocabulary.OBJECT_INTERSECTION_OF;
        OWLXMLVocabulary testSubject27 = OWLXMLVocabulary.OBJECT_UNION_OF;
        OWLXMLVocabulary testSubject28 = OWLXMLVocabulary.OBJECT_COMPLEMENT_OF;
        OWLXMLVocabulary testSubject29 = OWLXMLVocabulary.OBJECT_ONE_OF;
        OWLXMLVocabulary testSubject30 = OWLXMLVocabulary.OBJECT_SOME_VALUES_FROM;
        OWLXMLVocabulary testSubject31 = OWLXMLVocabulary.OBJECT_ALL_VALUES_FROM;
        OWLXMLVocabulary testSubject32 = OWLXMLVocabulary.OBJECT_HAS_SELF;
        OWLXMLVocabulary testSubject33 = OWLXMLVocabulary.OBJECT_HAS_VALUE;
        OWLXMLVocabulary testSubject34 = OWLXMLVocabulary.OBJECT_MIN_CARDINALITY;
        OWLXMLVocabulary testSubject35 = OWLXMLVocabulary.OBJECT_EXACT_CARDINALITY;
        OWLXMLVocabulary testSubject36 = OWLXMLVocabulary.OBJECT_MAX_CARDINALITY;
        OWLXMLVocabulary testSubject37 = OWLXMLVocabulary.DATA_SOME_VALUES_FROM;
        OWLXMLVocabulary testSubject38 = OWLXMLVocabulary.DATA_ALL_VALUES_FROM;
        OWLXMLVocabulary testSubject39 = OWLXMLVocabulary.DATA_HAS_VALUE;
        OWLXMLVocabulary testSubject40 = OWLXMLVocabulary.DATA_MIN_CARDINALITY;
        OWLXMLVocabulary testSubject41 = OWLXMLVocabulary.DATA_EXACT_CARDINALITY;
        OWLXMLVocabulary testSubject42 = OWLXMLVocabulary.DATA_MAX_CARDINALITY;
        OWLXMLVocabulary testSubject43 = OWLXMLVocabulary.SUB_CLASS_OF;
        OWLXMLVocabulary testSubject44 = OWLXMLVocabulary.EQUIVALENT_CLASSES;
        OWLXMLVocabulary testSubject45 = OWLXMLVocabulary.DISJOINT_CLASSES;
        OWLXMLVocabulary testSubject46 = OWLXMLVocabulary.DISJOINT_UNION;
        OWLXMLVocabulary testSubject47 = OWLXMLVocabulary.UNION_OF;
        OWLXMLVocabulary testSubject48 = OWLXMLVocabulary.SUB_OBJECT_PROPERTY_OF;
        OWLXMLVocabulary testSubject49 = OWLXMLVocabulary.OBJECT_PROPERTY_CHAIN;
        OWLXMLVocabulary testSubject50 = OWLXMLVocabulary.EQUIVALENT_OBJECT_PROPERTIES;
        OWLXMLVocabulary testSubject51 = OWLXMLVocabulary.DISJOINT_OBJECT_PROPERTIES;
        OWLXMLVocabulary testSubject52 = OWLXMLVocabulary.OBJECT_PROPERTY_DOMAIN;
        OWLXMLVocabulary testSubject53 = OWLXMLVocabulary.OBJECT_PROPERTY_RANGE;
        OWLXMLVocabulary testSubject54 = OWLXMLVocabulary.INVERSE_OBJECT_PROPERTIES;
        OWLXMLVocabulary testSubject55 = OWLXMLVocabulary.FUNCTIONAL_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject56 = OWLXMLVocabulary.INVERSE_FUNCTIONAL_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject57 = OWLXMLVocabulary.SYMMETRIC_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject58 = OWLXMLVocabulary.ASYMMETRIC_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject59 = OWLXMLVocabulary.REFLEXIVE_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject60 = OWLXMLVocabulary.IRREFLEXIVE_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject61 = OWLXMLVocabulary.TRANSITIVE_OBJECT_PROPERTY;
        OWLXMLVocabulary testSubject62 = OWLXMLVocabulary.SUB_DATA_PROPERTY_OF;
        OWLXMLVocabulary testSubject63 = OWLXMLVocabulary.EQUIVALENT_DATA_PROPERTIES;
        OWLXMLVocabulary testSubject64 = OWLXMLVocabulary.DISJOINT_DATA_PROPERTIES;
        OWLXMLVocabulary testSubject65 = OWLXMLVocabulary.DATA_PROPERTY_DOMAIN;
        OWLXMLVocabulary testSubject66 = OWLXMLVocabulary.DATA_PROPERTY_RANGE;
        OWLXMLVocabulary testSubject67 = OWLXMLVocabulary.FUNCTIONAL_DATA_PROPERTY;
        OWLXMLVocabulary testSubject68 = OWLXMLVocabulary.SAME_INDIVIDUAL;
        OWLXMLVocabulary testSubject69 = OWLXMLVocabulary.DIFFERENT_INDIVIDUALS;
        OWLXMLVocabulary testSubject70 = OWLXMLVocabulary.CLASS_ASSERTION;
        OWLXMLVocabulary testSubject71 = OWLXMLVocabulary.OBJECT_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject72 = OWLXMLVocabulary.DATA_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject73 = OWLXMLVocabulary.NEGATIVE_OBJECT_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject74 = OWLXMLVocabulary.NEGATIVE_DATA_PROPERTY_ASSERTION;
        OWLXMLVocabulary testSubject75 = OWLXMLVocabulary.HAS_KEY;
        OWLXMLVocabulary testSubject76 = OWLXMLVocabulary.DECLARATION;
        OWLXMLVocabulary testSubject77 = OWLXMLVocabulary.ANNOTATION_ASSERTION;
        OWLXMLVocabulary testSubject78 = OWLXMLVocabulary.ANNOTATION_PROPERTY_DOMAIN;
        OWLXMLVocabulary testSubject79 = OWLXMLVocabulary.ANNOTATION_PROPERTY_RANGE;
        OWLXMLVocabulary testSubject80 = OWLXMLVocabulary.SUB_ANNOTATION_PROPERTY_OF;
        OWLXMLVocabulary testSubject81 = OWLXMLVocabulary.DATATYPE_DEFINITION;
        OWLXMLVocabulary testSubject82 = OWLXMLVocabulary.PREFIX;
        OWLXMLVocabulary testSubject83 = OWLXMLVocabulary.NAME_ATTRIBUTE;
        OWLXMLVocabulary testSubject84 = OWLXMLVocabulary.IRI_ATTRIBUTE;
        OWLXMLVocabulary testSubject85 = OWLXMLVocabulary.ABBREVIATED_IRI_ATTRIBUTE;
        OWLXMLVocabulary testSubject86 = OWLXMLVocabulary.IRI_ELEMENT;
        OWLXMLVocabulary testSubject87 = OWLXMLVocabulary.ABBREVIATED_IRI_ELEMENT;
        OWLXMLVocabulary testSubject88 = OWLXMLVocabulary.CARDINALITY_ATTRIBUTE;
        OWLXMLVocabulary testSubject89 = OWLXMLVocabulary.DL_SAFE_RULE;
        OWLXMLVocabulary testSubject90 = OWLXMLVocabulary.BODY;
        OWLXMLVocabulary testSubject91 = OWLXMLVocabulary.HEAD;
        OWLXMLVocabulary testSubject92 = OWLXMLVocabulary.CLASS_ATOM;
        OWLXMLVocabulary testSubject93 = OWLXMLVocabulary.DATA_RANGE_ATOM;
        OWLXMLVocabulary testSubject94 = OWLXMLVocabulary.OBJECT_PROPERTY_ATOM;
        OWLXMLVocabulary testSubject95 = OWLXMLVocabulary.DATA_PROPERTY_ATOM;
        OWLXMLVocabulary testSubject96 = OWLXMLVocabulary.BUILT_IN_ATOM;
        OWLXMLVocabulary testSubject97 = OWLXMLVocabulary.SAME_INDIVIDUAL_ATOM;
        OWLXMLVocabulary testSubject98 = OWLXMLVocabulary.DIFFERENT_INDIVIDUALS_ATOM;
        OWLXMLVocabulary testSubject99 = OWLXMLVocabulary.VARIABLE;
        OWLXMLVocabulary testSubject100 = OWLXMLVocabulary.DESCRIPTION_GRAPH_RULE;
        String result0 = testSubject0.getShortForm();
        IRI result1 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesPrefixOWLOntologyFormat() {
        assertTrue(OWLDocumentFormat.class.isAssignableFrom(PrefixDocumentFormat.class));
        assertTrue(PrefixManager.class.isAssignableFrom(PrefixDocumentFormat.class));
    }

    public void verifyPrefixOWLOntologyFormat() {
        PrefixDocumentFormat testSubject0 = new PrefixDocumentFormat();
        PrefixDocumentFormat testSubject1 = new PrefixDocumentFormat(_DefaultPrefixManager);
        testSubject0.setPrefixManager(_DefaultPrefixManager);
        testSubject0.setPrefix(_String, _String);
        testSubject0.clear();
        testSubject0.copyPrefixesFrom(_PrefixOWLOntologyFormat);
        testSubject0.copyPrefixesFrom(_PrefixManager);
        java.util.Map<String, String> result0 = testSubject0.getPrefixName2PrefixMap();
        java.util.Set<String> result1 = testSubject0.getPrefixNames();
        String result2 = testSubject0.getPrefix(_String);
        testSubject0.setDefaultPrefix(_String);
        boolean result3 = testSubject0.containsPrefixMapping(_String);
        String result4 = testSubject0.getDefaultPrefix();
        String result5 = testSubject0.getPrefixIRI(_IRI);
        IRI result6 = testSubject0.getIRI(_String);
        boolean result8 = testSubject0.isPrefixOWLOntologyFormat();
        PrefixDocumentFormat result9 = testSubject0.asPrefixOWLOntologyFormat();
        org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData result10 = testSubject0.getOntologyLoaderMetaData();
        testSubject0.setOntologyLoaderMetaData(_OWLOntologyLoaderMetaData);
    }

    @Test
    public void enforceInterfacesSKOSVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(SKOSVocabulary.class));
    }

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
        java.util.Set<OWLObjectProperty> result1 = SKOSVocabulary.getObjectProperties(_OWLDataFactory);
        java.util.Set<OWLDataProperty> result2 = SKOSVocabulary.getDataProperties(_OWLDataFactory);
        IRI result3 = testSubject0.getIRI();
        EntityType<?> result5 = testSubject0.getEntityType();
        java.util.Set<OWLAnnotationProperty> result6 = SKOSVocabulary.getAnnotationProperties(_OWLDataFactory);
        String result7 = testSubject0.getLocalName();
    }

    @Test
    public void enforceInterfacesSWRLBuiltInsVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
        assertTrue(SWRLPredicate.class.isAssignableFrom(SWRLBuiltInsVocabulary.class));
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
        SWRLBuiltInsVocabulary testSubject46 = SWRLBuiltInsVocabulary.ADD_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject47 = SWRLBuiltInsVocabulary.SUBTRACT_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject48 = SWRLBuiltInsVocabulary.MULTIPLY_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject49 = SWRLBuiltInsVocabulary.DIVIDE_YEAR_MONTH_DURATIONS;
        SWRLBuiltInsVocabulary testSubject50 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject51 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject52 = SWRLBuiltInsVocabulary.MULTIPLY_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject53 = SWRLBuiltInsVocabulary.DIVIDE_DAY_TIME_DURATIONS;
        SWRLBuiltInsVocabulary testSubject54 = SWRLBuiltInsVocabulary.SUBTRACT_DATES;
        SWRLBuiltInsVocabulary testSubject55 = SWRLBuiltInsVocabulary.SUBTRACT_TIMES;
        SWRLBuiltInsVocabulary testSubject56 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATION_TO_DATE_TIME;
        SWRLBuiltInsVocabulary testSubject57 = SWRLBuiltInsVocabulary.SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE_TIME;
        SWRLBuiltInsVocabulary testSubject58 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATION_FROM_DATE_TIME;
        SWRLBuiltInsVocabulary testSubject59 = SWRLBuiltInsVocabulary.ADD_YEAR_MONTH_DURATION_TO_DATE;
        SWRLBuiltInsVocabulary testSubject60 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATION_TO_DATE;
        SWRLBuiltInsVocabulary testSubject61 = SWRLBuiltInsVocabulary.SUBTRACT_YEAR_MONTH_DURATION_FROM_DATE;
        SWRLBuiltInsVocabulary testSubject62 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATION_FROM_DATE;
        SWRLBuiltInsVocabulary testSubject63 = SWRLBuiltInsVocabulary.ADD_DAY_TIME_DURATION_FROM_TIME;
        SWRLBuiltInsVocabulary testSubject64 = SWRLBuiltInsVocabulary.SUBTRACT_DAY_TIME_DURATION_FROM_TIME;
        SWRLBuiltInsVocabulary testSubject65 = SWRLBuiltInsVocabulary.SUBTRACT_DATE_TIMES_YIELDING_YEAR_MONTH_DURATION;
        SWRLBuiltInsVocabulary testSubject66 = SWRLBuiltInsVocabulary.SUBTRACT_DATE_TIMES_YIELDING_DAY_TIME_DURATION;
        SWRLBuiltInsVocabulary testSubject67 = SWRLBuiltInsVocabulary.RESOLVE_URI;
        SWRLBuiltInsVocabulary testSubject68 = SWRLBuiltInsVocabulary.ANY_URI;
        int result0 = testSubject0.getMinArity();
        int result1 = testSubject0.getMaxArity();
        org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary result4 = SWRLBuiltInsVocabulary.getBuiltIn(_IRI);
        String result5 = testSubject0.getShortForm();
        IRI result6 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesSWRLVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(SWRLVocabulary.class));
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
        String result0 = testSubject0.getShortForm();
        IRI result1 = testSubject0.getIRI();
    }

    @Test
    public void enforceInterfacesXSDVocabulary() {
        assertTrue(Enum.class.isAssignableFrom(XSDVocabulary.class));
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
        XSDVocabulary testSubject19 = XSDVocabulary.HEX_BINARY;
        XSDVocabulary testSubject20 = XSDVocabulary.ANY_URI;
        XSDVocabulary testSubject21 = XSDVocabulary.Q_NAME;
        XSDVocabulary testSubject22 = XSDVocabulary.NOTATION;
        XSDVocabulary testSubject23 = XSDVocabulary.NORMALIZED_STRING;
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
        String result0 = testSubject0.getShortForm();
        org.semanticweb.owlapi.vocab.XSDVocabulary result1 = XSDVocabulary.parseShortName(_String);
        IRI result2 = testSubject0.getIRI();
    }

    private String _String;
    private org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData _OWLOntologyLoaderMetaData;
    private IRI _IRI;
    private OWLDataFactory _OWLDataFactory;
    private PrefixManager _PrefixManager;
    private org.semanticweb.owlapi.util.DefaultPrefixManager _DefaultPrefixManager;
    private PrefixDocumentFormat _PrefixOWLOntologyFormat;
}
