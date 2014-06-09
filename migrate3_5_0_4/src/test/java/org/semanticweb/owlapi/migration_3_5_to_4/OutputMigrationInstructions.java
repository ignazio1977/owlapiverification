package org.semanticweb.owlapi.migration_3_5_to_4;

public class OutputMigrationInstructions {
    public static void main(String[] args) {
        Class[] classes = new Class[] { Gen_com_clarkparsia_owlapi_explanation_io.class, Gen_com_clarkparsia_owlapi_explanation_util.class,
                Gen_com_clarkparsia_owlapi_explanation.class, Gen_com_clarkparsia_owlapi_modularity_locality.class, Gen_de_uulm_ecs_ai_owlapi_krssparser.class,
                Gen_de_uulm_ecs_ai_owlapi_krssrenderer.class, Gen_obo_obolibrary_idrules.class, Gen_org_coode_owl_krssparser.class, Gen_org_coode_owlapi_functionalparser.class,
                Gen_org_coode_owlapi_functionalrenderer.class, Gen_org_coode_owlapi_latex.class, Gen_org_coode_owlapi_manchesterowlsyntax.class,
                Gen_org_coode_owlapi_obo_parser.class, Gen_org_coode_owlapi_obo_renderer.class, Gen_org_coode_owlapi_oboformat.class, Gen_org_coode_owlapi_owlxml_renderer.class,
                Gen_org_coode_owlapi_owlxmlparser.class, Gen_org_coode_owlapi_rdf_model.class, Gen_org_coode_owlapi_rdf_rdfxml.class, Gen_org_coode_owlapi_rdf_renderer.class,
                Gen_org_coode_owlapi_rdfxml_parser.class, Gen_org_coode_owlapi_turtle.class, Gen_org_coode_string.class, Gen_org_coode_xml.class, Gen_org_obolibrary_macro.class,
                Gen_org_obolibrary_obo2owl.class, Gen_org_obolibrary_oboformat_diff.class, Gen_org_obolibrary_oboformat_model.class, Gen_org_obolibrary_oboformat_parser.class,
                Gen_org_obolibrary_oboformat_writer.class, Gen_org_obolibrary_owl.class, Gen_org_semanticweb_owlapi_apibinding.class, Gen_org_semanticweb_owlapi_change.class,
                Gen_org_semanticweb_owlapi_debugging.class, Gen_org_semanticweb_owlapi_expression.class, Gen_org_semanticweb_owlapi_io.class,
                Gen_org_semanticweb_owlapi_metrics.class, Gen_org_semanticweb_owlapi_model.class, Gen_org_semanticweb_owlapi_modularity.class,
                Gen_org_semanticweb_owlapi_normalform.class, Gen_org_semanticweb_owlapi_profiles.class, Gen_org_semanticweb_owlapi_rdf_syntax.class,
                Gen_org_semanticweb_owlapi_rdf_util.class, Gen_org_semanticweb_owlapi_reasoner_impl.class, Gen_org_semanticweb_owlapi_reasoner_knowledgeexploration.class,
                Gen_org_semanticweb_owlapi_reasoner_structural.class, Gen_org_semanticweb_owlapi_reasoner.class, Gen_org_semanticweb_owlapi_util.class,
                Gen_org_semanticweb_owlapi_vocab.class, Gen_org_semanticweb_owlapi.class, Gen_uk_ac_manchester_cs_bhig_util.class,
                Gen_uk_ac_manchester_cs_owl_explanation_ordering.class, Gen_uk_ac_manchester_cs_owl_owlapi_mansyntaxrenderer.class,
                Gen_uk_ac_manchester_cs_owl_owlapi_turtle_parser.class, Gen_uk_ac_manchester_cs_owl_owlapi.class, Gen_uk_ac_manchester_cs_owlapi_dlsyntax_parser.class,
                Gen_uk_ac_manchester_cs_owlapi_dlsyntax.class, Gen_uk_ac_manchester_cs_owlapi_modularity.class, };
        System.out.println("OutputMigrationInstructions.main()");
        for (Class c : classes) {
            Migration m = (Migration) c.getAnnotation(Migration.class);
            if (m != null) {
                System.out.println(c.getSimpleName());
                for (String s : m.value()) {
                    System.out.println(s);
                }
            }
        }
    }
}
