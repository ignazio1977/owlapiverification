package org.semanticweb.owlapi.verification_4_0_0;

import static org.mockito.Mockito.mock;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.search.Searcher;

@SuppressWarnings({ "javadoc", "unused", "null" })
public class Gen_org_semanticweb_owlapi_search {
    public void verifySearcher() {
        java.util.Set<OWLAnnotation> result0 = Searcher.annotations(_OWLAxiom, _OWLAnnotationProperty);
        java.util.Collection<OWLAnnotation> result1 = Searcher.annotations(_Collection);
        java.util.Collection<OWLAnnotation> result2 = Searcher.annotations(_Collection, _OWLAnnotationProperty);
        java.util.Collection<OWLIndividual> result3 = Searcher.values(_Collection43, mock(OWLObjectPropertyExpression.class));
        java.util.Collection<OWLAnnotationValue> result4 = Searcher.values(_Collection45, _OWLAnnotationProperty);
        java.util.Collection<OWLLiteral> result5 = Searcher.values(_Collection46, _OWLDataPropertyExpression);
        java.util.Collection<OWLAnnotationValue> result6 = Searcher.values(_Collection45);
        java.util.Collection<OWLObject> result7 = Searcher.domain(_Collection, _Class);
        OWLObject result8 = Searcher.domain(_OWLAxiom);
        java.util.Collection<OWLObject> result9 = Searcher.domain(_Collection);
        boolean result10 = Searcher.isDefined(_OWLOntology, _OWLClass);
        java.util.Collection<OWLObjectPropertyExpression> result11 = Searcher.inverse(_Collection51, mock(OWLObjectPropertyExpression.class));
        java.util.Collection<OWLObject> result12 = Searcher.sub(_Collection);
        OWLObject result13 = Searcher.sub(_OWLAxiom);
        java.util.Collection<OWLObject> result14 = Searcher.sub(_Collection, _Class);
        java.util.Collection<OWLObject> result15 = Searcher.equivalent(_Collection);
        java.util.Collection<OWLObject> result16 = Searcher.equivalent(_Collection, _Class);
        java.util.Set<OWLObject> result17 = Searcher.equivalent(_OWLAxiom);
        java.util.Collection<OWLClassExpression> result18 = Searcher.types(_Collection52);
        java.util.Collection<OWLLiteral> result19 = Searcher.negValues(_Collection53, _OWLDataPropertyExpression);
        java.util.Collection<OWLIndividual> result20 = Searcher.negValues(_Collection54, mock(OWLObjectPropertyExpression.class));
        java.util.Collection<OWLObject> result21 = Searcher.different(_Collection);
        java.util.Collection<OWLObject> result22 = Searcher.different(_Collection, _Class);
        java.util.Set<OWLObject> result23 = Searcher.different(_OWLAxiom);
        boolean result24 = Searcher.isTransitive(_OWLOntology, _OWLObjectProperty);
        boolean result25 = Searcher.isSymmetric(_OWLOntology, _OWLObjectProperty);
        boolean result26 = Searcher.isAsymmetric(_OWLOntology, _OWLObjectProperty);
        boolean result27 = Searcher.isReflexive(_OWLOntology, _OWLObjectProperty);
        boolean result28 = Searcher.isIrreflexive(_OWLOntology, _OWLObjectProperty);
        boolean result29 = Searcher.isInverseFunctional(_OWLOntology, _OWLObjectProperty);
        boolean result30 = Searcher.isFunctional(_OWLOntology, _OWLObjectProperty);
        boolean result31 = Searcher.isFunctional(_OWLOntology, _OWLDataProperty);
        java.util.Collection<OWLObject> result32 = Searcher.sup(_Collection, _Class);
        OWLObject result33 = Searcher.sup(_OWLAxiom);
        java.util.Collection<OWLObject> result34 = Searcher.sup(_Collection);
        java.util.Collection<OWLObject> result35 = Searcher.range(_Collection);
        java.util.Collection<OWLObject> result36 = Searcher.range(_Collection, _Class);
        OWLObject result37 = Searcher.range(_OWLAxiom);
        java.util.Collection<OWLIndividual> result38 = Searcher.instances(_Collection52);
    }

    private java.lang.Class<OWLObject> _Class;
    private java.util.Collection<? extends OWLAxiom> _Collection;
    private java.util.Collection<OWLAnnotation> _Collection45;
    private java.util.Collection<OWLClassAssertionAxiom> _Collection52;
    private java.util.Collection<OWLDataPropertyAssertionAxiom> _Collection46;
    private java.util.Collection<OWLInverseObjectPropertiesAxiom> _Collection51;
    private java.util.Collection<OWLNegativeDataPropertyAssertionAxiom> _Collection53;
    private java.util.Collection<OWLNegativeObjectPropertyAssertionAxiom> _Collection54;
    private java.util.Collection<OWLObjectPropertyAssertionAxiom> _Collection43;
    private OWLAnnotationProperty _OWLAnnotationProperty;
    private OWLAxiom _OWLAxiom;
    private OWLClass _OWLClass;
    private OWLDataProperty _OWLDataProperty;
    private OWLDataPropertyExpression _OWLDataPropertyExpression;
    private OWLObjectProperty _OWLObjectProperty;
    private OWLOntology _OWLOntology;
}
