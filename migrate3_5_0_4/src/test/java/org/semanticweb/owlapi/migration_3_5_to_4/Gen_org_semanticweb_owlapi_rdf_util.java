package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.semanticweb.owlapi.rdf.rdfxml.parser.RDFConstants.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.semanticweb.owlapi.rdf.rdfxml.parser.*;

@SuppressWarnings({ "javadoc", "unused" })
@RunWith(MockitoJUnitRunner.class)
@Migration({ "Package change: from org.semanticweb.owlapi.rdf.util to org.semanticweb.owlapi.rdf.rdfxml.parser" })
public class Gen_org_semanticweb_owlapi_rdf_util {
    @Test
    public void verifyInterfaceRDFConstants() {
        RDFConstants testSubject0 = mock(RDFConstants.class);
        assertEquals(XMLNS, "http://www.w3.org/XML/1998/namespace");
        assertEquals(XMLLANG, "xml:lang");
        assertEquals(RDFNS, "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        assertEquals(ATTR_ID, "ID");
        assertEquals(ATTR_RESOURCE, "resource");
        assertEquals(ATTR_BAG_ID, "bagID");
        assertEquals(ATTR_ABOUT, "about");
        assertEquals(ATTR_ABOUT_EACH, "aboutEach");
        assertEquals(ATTR_ABOUT_EACH_PREFIX, "aboutEachPrefix");
        assertEquals(ATTR_PARSE_TYPE, "parseType");
        assertEquals(ATTR_DATATYPE, "datatype");
        assertEquals(ATTR_NODE_ID, "nodeID");
        assertEquals(PARSE_TYPE_LITERAL, "Literal");
        assertEquals(PARSE_TYPE_RESOURCE, "Resource");
        assertEquals(PARSE_TYPE_COLLECTION, "Collection");
        assertEquals(ELT_TYPE, "type");
        assertEquals(ELT_RDF, "RDF");
        assertEquals(ELT_DESCRIPTION, "Description");
        assertEquals(ELT_BAG, "Bag");
        assertEquals(ELT_SEQ, "Seq");
        assertEquals(ELT_ALT, "Alt");
        assertEquals(ELT_LI, "li");
        assertEquals(RDF_RDF, RDFNS + ELT_RDF);
        assertEquals(RDF_ID, RDFNS + ATTR_ID);
        assertEquals(RDF_LI, RDFNS + ELT_LI);
        assertEquals(RDF_RESOURCE, RDFNS + ATTR_RESOURCE);
        assertEquals(RDF_TYPE, RDFNS + ELT_TYPE);
        assertEquals(RDF_NODE_ID, RDFNS + ATTR_NODE_ID);
        assertEquals(RDF_DESCRIPTION, RDFNS + ELT_DESCRIPTION);
        assertEquals(RDF_ABOUT, RDFNS + ATTR_ABOUT);
        assertEquals(RDF_PARSE_TYPE, RDFNS + ATTR_PARSE_TYPE);
        assertEquals(RDF_DATATYPE, RDFNS + ATTR_DATATYPE);
        assertEquals(RDF_SUBJECT, RDFNS + "subject");
        assertEquals(RDF_OBJECT, RDFNS + "object");
        assertEquals(RDF_PREDICATE, RDFNS + "predicate");
        assertEquals(RDF_STATEMENT, RDFNS + "statement");
        assertEquals(RDF_BAG, RDFNS + ELT_BAG);
        assertEquals(RDF_PROPERTY, RDFNS + "Property");
        assertEquals(RDF_FIRST, RDFNS + "first");
        assertEquals(RDF_REST, RDFNS + "rest");
        assertEquals(RDF_LIST, RDFNS + "List");
        assertEquals(RDF_NIL, RDFNS + "nil");
        assertEquals(RDF_XMLLITERAL, RDFNS + "XMLLiteral");
        assertEquals(RDFSNS, "http://www.w3.org/2000/01/rdf-schema#");
        assertEquals(RDFS_CLASS, RDFSNS + "Class");
        assertEquals(RDFS_SUBCLASSOF, RDFSNS + "subClassOf");
        assertEquals(RDFS_SUBPROPERTYOF, RDFSNS + "subPropertyOf");
        assertEquals(RDFS_LABEL, RDFSNS + "label");
        assertEquals(RDFS_COMMENT, RDFSNS + "comment");
        assertEquals(RDFS_DOMAIN, RDFSNS + "domain");
        assertEquals(RDFS_RANGE, RDFSNS + "range");
        assertEquals(KAONNS, "http://kaon.semanticweb.org/2001/11/kaon-lexical#");
    }
}
