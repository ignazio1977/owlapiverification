package org.semanticweb.owlapi.migration_3_5_to_4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import uk.ac.manchester.cs.owlapi.modularity.ModuleType;
import uk.ac.manchester.cs.owlapi.modularity.SyntacticLocalityModuleExtractor;

@SuppressWarnings({ "javadoc", "deprecation" })
@RunWith(MockitoJUnitRunner.class)
public class Gen_uk_ac_manchester_cs_owlapi_modularity {

    @Test
    public void enforceInterfacesModuleType()  {
        assertTrue(Enum.class.isAssignableFrom(ModuleType.class));
    }

    public void verifyEnumModuleType()  {
        ModuleType testSubject0 = ModuleType.TOP;
        ModuleType testSubject1 = ModuleType.BOT;
        ModuleType testSubject2 = ModuleType.BOT_OF_TOP;
        ModuleType testSubject3 = ModuleType.TOP_OF_BOT;
        ModuleType testSubject4 = ModuleType.STAR;
    }

    @Test
    public void enforceInterfacesSyntacticLocalityModuleExtractor()
             {
        assertTrue(org.semanticweb.owlapi.modularity.OntologySegmenter.class
                .isAssignableFrom(SyntacticLocalityModuleExtractor.class));
    }

    public void verifySyntacticLocalityModuleExtractor()  {
        SyntacticLocalityModuleExtractor testSubject0 = new SyntacticLocalityModuleExtractor(
                _OWLOntologyManager, _OWLOntology, _ModuleType);
        SyntacticLocalityModuleExtractor testSubject1 = new SyntacticLocalityModuleExtractor(
                _OWLOntologyManager, _OWLOntology, _Set, _ModuleType);
        OWLOntology result0 = testSubject0
                .extractAsOntology(_Set4, _IRI);
        OWLOntology result1 = testSubject0
                .extractAsOntology(_Set4, _IRI, _int, _int, _OWLReasoner);
        testSubject0.setModuleType(_ModuleType);
        uk.ac.manchester.cs.owlapi.modularity.ModuleType result2 = testSubject0
                .getModuleType();
        java.util.Set<OWLAxiom> result3 = testSubject0
                .extract(_Set4, _int, _int, _OWLReasoner, _boolean);
        java.util.Set<OWLAxiom> result4 = testSubject0
                .extract(_Set4);
        java.util.Set<OWLAxiom> result5 = testSubject0
                .extract(_Set4, _int, _int, _OWLReasoner);
    }

    private boolean _boolean;
    private int _int;
    private java.util.Set<OWLAxiom> _Set;
    private java.util.Set<OWLEntity> _Set4;
    private IRI _IRI;
    private OWLOntology _OWLOntology;
    private OWLOntologyManager _OWLOntologyManager;
    private org.semanticweb.owlapi.reasoner.OWLReasoner _OWLReasoner;
    private uk.ac.manchester.cs.owlapi.modularity.ModuleType _ModuleType;
}
