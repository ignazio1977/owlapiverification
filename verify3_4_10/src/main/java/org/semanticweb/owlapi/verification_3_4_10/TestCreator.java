package org.semanticweb.owlapi.verification_3_4_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("javadoc")
public class TestCreator {
    private static class Container {
        PrintStream out;
        TreeSet<String> mocks = new TreeSet<String>();
        LinkedHashSet<String> mockNames = new LinkedHashSet<String>();

        public Container() {}

        String getMockName(Class<?> class1, Type gen) {
            String mockName = "_" + class1.getSimpleName();
            mockName = mockName.replace("[]", "_array");
            String mock = "@Mock private " + genName(gen) + " " + mockName;
            if (mockNames.contains(mockName) && !mocks.contains(mock)) {
                // System.out.println("TestCreator.Container.getMockName() " +
                // mockName);
                // System.out.println("TestCreator.Container.getMockName() " +
                // mock);
                // the name is duplicated across different mocks
                // look for another one
                boolean found = false;
                for (String s : mocks) {
                    if (s.startsWith(mock)) {
                        mockName = mockName + s.replace(mock, "");
                        mock = s;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    mockName = mockName + mocks.size();
                    mock = "@Mock private " + genName(gen) + " " + mockName;
                }
                // System.out.println("TestCreator.Container.getMockName() " +
                // mock);
                // System.out.println("TestCreator.Container.getMockName() " +
                // mockName);
            }
            mocks.add(mock);
            mockNames.add(mockName);
            return mockName;
        }

        void addClasses() {
            Set<String> classesToAdd = new HashSet<String>();
            for (String m : mocks) {
                classesToAdd.add(addClass(m));
            }
            for (String s : classesToAdd) {
                out.println(s);
            }
        }

        String addClass(String mock) {
            mock = mock.substring("@Mock private ".length());
            mock = mock.substring(0, mock.indexOf(" "));
            if (mock.startsWith("int") || mock.startsWith("boolean")
                    || mock.startsWith("char") || mock.startsWith("float")
                    || mock.startsWith("double") || mock.startsWith("long")) {
                return "";
            }
            mock = mock.replace("[]", "");
            if (!mock.contains(".")) {
                return "private static class " + mock + " {}";
            }
            return "";
        }
    }

    public static void main(String[] args) throws ClassNotFoundException,
            FileNotFoundException {
        Map<String, Container> streams = new HashMap<String, Container>();
        File[] roots = new File[] { new File("api/src/main/java"),
                new File("apibinding/src/main/java"), new File("impl/src/main/java"),
                new File("tools/src/main/java"), new File("parsers/src/main/java"),
                new File("oboformat/src/main/java") };
        for (File root : roots) {
            visit(root, null, streams);
        }
        for (Container out : streams.values()) {
            out.addClasses();
            for (String s : out.mocks) {
                out.out.println(s + ";");
            }
            out.out.println("}");
            out.out.close();
        }
    }

    private static PrintStream initPrintStream(String _name) throws FileNotFoundException {
        String name = _name.replace("/", "_");
        PrintStream out = new PrintStream(
                "contract/src/test/java/org/semanticweb/owlapi/verification/Gen" + name
                        + ".java");
        out.println("package org.semanticweb.owlapi.verification;\n\n");
        out.println("import " + _name.replace("/", ".").substring(1) + ".*;");
        out.println("import com.clarkparsia.owlapi.explanation.*;\n"
                + "import com.clarkparsia.owlapi.explanation.io.*;\n"
                + "import com.clarkparsia.owlapi.explanation.util.*;\n"
                + "import com.clarkparsia.owlapi.modularity.locality.*;\n"
                // + "import de.uulm.ecs.ai.owlapi.krssparser.*;\n"
                // + "import de.uulm.ecs.ai.owlapi.krssrenderer.*;\n"
                + "import org.junit.Test;\n"
                + "import static org.junit.Assert.*;\n"
                + "import java.io.*;\n"
                + "import java.net.*;\n"
                + "import java.util.*;\n"
                + "import java.util.concurrent.*;\n"
                + "import java.util.regex.*;\n"
                + "import obo.obolibrary.idrules.*;\n"
                // + "import org.coode.owl.krssparser.*;\n"
                // + "import org.coode.owlapi.functionalparser.*;\n"
                // + "import org.coode.owlapi.functionalrenderer.*;\n"
                // + "import org.coode.owlapi.latex.*;\n"
                // + "import org.coode.owlapi.manchesterowlsyntax.*;\n"
                // + "import org.coode.owlapi.obo.parser.*;\n"
                // + "import org.coode.owlapi.obo.renderer.*;\n"
                // + "import org.coode.owlapi.oboformat.*;\n"
                // + "import org.coode.owlapi.owlxml.renderer.*;\n"
                // + "import org.coode.owlapi.owlxmlparser.*;\n"
                // + "import org.coode.owlapi.rdf.model.*;\n"
                // + "import org.coode.owlapi.rdf.rdfxml.*;\n"
                // + "import org.coode.owlapi.rdf.renderer.*;\n"
                // + "import org.coode.owlapi.rdfxml.parser.*;\n"
                // + "import org.coode.owlapi.turtle.*;\n"
                + "import org.coode.string.*;\n"
                // + "import org.coode.xml.*;\n"
                // + "import org.obolibrary.macro.*;\n"
                // + "import org.obolibrary.obo2owl.*;\n"
                // +
                // "import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;\n"
                // + "import org.obolibrary.obo2owl.Obo2OWLConstants;\n"
                // +
                // "import org.obolibrary.obo2owl.OboInOwlCardinalityTools.*;\n"
                // + "import org.obolibrary.obo2owl.OboInOwlCardinalityTools;\n"
                // + "import org.obolibrary.obo2owl.OwlStringTools;\n"
                // + "import org.obolibrary.oboformat.diff.*;\n"
                // + "import org.obolibrary.oboformat.model.*;\n"
                // + "import org.obolibrary.oboformat.model.Frame.*;\n"
                // + "import org.obolibrary.oboformat.parser.*;\n"
                // +
                // "import org.obolibrary.oboformat.writer.OBOFormatWriter.*;\n"
                // + "import org.obolibrary.oboformat.writer.OBOFormatWriter;\n"
                // + "import org.obolibrary.owl.*;\n"
                + "import org.semanticweb.owlapi.*;\n"
                + "import org.semanticweb.owlapi.apibinding.*;\n"
                + "import org.semanticweb.owlapi.change.*;\n"
                + "import org.semanticweb.owlapi.debugging.*;\n"
                + "import org.semanticweb.owlapi.expression.*;\n"
                + "import org.semanticweb.owlapi.io.*;\n"
                + "import org.semanticweb.owlapi.metrics.*;\n"
                + "import org.semanticweb.owlapi.model.*;\n"
                + "import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration.MissingOntologyHeaderStrategy;\n"
                + "import org.semanticweb.owlapi.modularity.OntologySegmenter;\n"
                + "import org.semanticweb.owlapi.normalform.*;\n"
                + "import org.semanticweb.owlapi.profiles.*;\n"
                + "import org.semanticweb.owlapi.rdf.syntax.*;\n"
                + "import org.semanticweb.owlapi.rdf.util.RDFConstants;\n"
                + "import org.semanticweb.owlapi.reasoner.*;\n"
                + "import org.semanticweb.owlapi.reasoner.impl.*;\n"
                + "import org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner.RootNode;\n"
                + "import org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner;\n"
                + "import org.semanticweb.owlapi.reasoner.structural.*;\n"
                + "import org.semanticweb.owlapi.util.*;\n"
                + "import org.semanticweb.owlapi.util.ImportsStructureObjectSorter.ObjectSelector;\n"
                + "import org.semanticweb.owlapi.vocab.*;\n"
                + "import org.xml.sax.*;\n"
                + "import static org.mockito.Mockito.mock;\n"
                + "import uk.ac.manchester.cs.BOMSafeJavaCharStream;\n"
                + "import uk.ac.manchester.cs.bhig.util.*;\n"
                + "import uk.ac.manchester.cs.owl.explanation.ordering.*;\n"
                + "import uk.ac.manchester.cs.owl.owlapi.*;\n"
                + "import uk.ac.manchester.cs.owl.owlapi.Internals.Pointer;\n"
                // +
                // "import uk.ac.manchester.cs.owl.owlapi.mansyntaxrenderer.*;\n"
                // + "import uk.ac.manchester.cs.owl.owlapi.turtle.parser.*;\n"
                // + "import uk.ac.manchester.cs.owlapi.dlsyntax.*;\n"
                // + "import uk.ac.manchester.cs.owlapi.dlsyntax.parser.*;\n"
                + "import uk.ac.manchester.cs.owlapi.modularity.ModuleType;\n"
                + "import uk.ac.manchester.cs.owlapi.modularity.SyntacticLocalityModuleExtractor;\n"
                + "import org.junit.runner.RunWith;\n" + "import org.mockito.Mock;\n"
                + "import org.mockito.runners.MockitoJUnitRunner;");
        out.println("@SuppressWarnings({\"javadoc\",\"unused\"})\n"
                + "@RunWith(MockitoJUnitRunner.class)\n" + "public class Gen" + name
                + "{");
        return out;
    }

    private static void visit(File root, File current, Map<String, Container> outMap)
            throws ClassNotFoundException, FileNotFoundException {
        if (current == null) {
            for (File f : root.listFiles()) {
                visit(root, f, outMap);
            }
        } else if (current.isDirectory()) {
            for (File f : current.listFiles()) {
                visit(root, f, outMap);
            }
        } else if (current.getName().endsWith(".java")) {
            Set<String> skip = new HashSet<String>(methodNamesToSkip);
            String id = current.getParentFile().getAbsolutePath()
                    .replace(root.getAbsolutePath(), "");
            Container out = outMap.get(id);
            if (out == null) {
                out = new Container();
                out.out = initPrintStream(id);
                outMap.put(id, out);
            }
            String fullyQualifiedName = current.getAbsolutePath().replace(".java", "")
                    .replace(root.getAbsolutePath(), "").replace("/", ".").substring(1);
            Class<?> theClass = Class.forName(fullyQualifiedName);
            String name = theClass.getSimpleName();
            out.out.println("@Test\npublic void enforceInterfaces" + name
                    + "()throws Exception{");
            Class<?> l = theClass.getSuperclass();
            if (l != null) {
                String genericSuperclass = l.toString().replace("class ", "");
                if (!"java.lang.Object".equals(genericSuperclass)) {
                    out.out.println("assertTrue(" + genericSuperclass.toString()
                            + ".class.isAssignableFrom(" + name + ".class));");
                }
            }
            for (Type t : theClass.getInterfaces()) {
                out.out.println("assertTrue(" + t.toString().replace("interface ", "")
                        + ".class.isAssignableFrom(" + name + ".class));");
            }
            out.out.println("}");
            if (theClass.isInterface()) {
                out.out.println("\npublic void verifyInterface" + name
                        + "()throws Exception{");
                out.out.println(name + " testSubject0 = mock(" + name + ".class);");
            } else if (theClass.isEnum()) {
                out.out.println("\npublic void verifyEnum" + name + "()throws Exception{");
                for (int i = 0; i < theClass.getFields().length; i++) {
                    Field f = theClass.getFields()[i];
                    String simpleName = f.getType().getSimpleName();
                    if (simpleName.equals(name)) {
                        out.out.println(name + " testSubject" + i + "=" + name + "."
                                + f.getName() + ";");
                    }
                }
                skip.add("name");
                skip.add("compareTo");
                skip.add("valueOf");
                skip.add("getDeclaringClass");
                skip.add("ordinal");
                skip.add("values");
            } else {
                out.out.println("\npublic void verify" + name + "()throws Exception{");
                int counter = 0;
                Constructor<?>[] constructors = theClass.getConstructors();
                if (constructors.length > 0) {
                    for (Constructor<?> c : constructors) {
                        out.out.print(name + " testSubject" + counter++ + " = new "
                                + name + "(");
                        for (int i = 0; i < c.getGenericParameterTypes().length; i++) {
                            Class<?> class1 = c.getParameterTypes()[i];
                            Type gen = c.getGenericParameterTypes()[i];
                            String mockName = out.getMockName(class1, gen);
                            out.out.print(mockName);
                            if (i < c.getParameterTypes().length - 1) {
                                out.out.print(",");
                            }
                        }
                        out.out.println(");");
                    }
                } else {
                    out.out.print(name + " testSubject0 = new " + name + "(){};");
                }
            }
            int counter = 0;
            for (Method m : theClass.getMethods()) {
                if (!skip.contains(m.getName())) {
                    String string = genName(m.getGenericReturnType());
                    if (!string.equals("void")) {
                        out.out.print(string + " result" + counter++ + " = ");
                    }
                    out.out.print("testSubject0." + m.getName() + "(");
                    for (int i = 0; i < m.getGenericParameterTypes().length; i++) {
                        Class<?> class1 = m.getParameterTypes()[i];
                        Type gen = m.getGenericParameterTypes()[i];
                        String mockName = out.getMockName(class1, gen);
                        out.out.print(mockName);
                        if (i < m.getGenericParameterTypes().length - 1) {
                            out.out.print(",");
                        }
                    }
                    out.out.println(");");
                }
            }
            out.out.println("}");
        }
    }

    static String genName(Type m) {
        String s = m.toString();
        s = s.replace("class ", "").replace("interface ", "");
        if (s.startsWith("[L")) {
            s = s.replace("[L", "").replace(";", "[]");
        }
        if (s.equals("[[I")) {
            return "int[][]";
        }
        if (s.equals("[C")) {
            return "char[]";
        }
        if (s.equals("[B")) {
            return "byte[]";
        }
        s = s.replace("$", ".");
        s = s.replace(
                "uk.ac.manchester.cs.owl.owlapi.Internals.uk.ac.manchester.cs.owl.owlapi.Internals.Pointer",
                "Pointer");
        s = s.replace("<O>", "<OWLObject>");
        if (s.equals("O")) {
            s = "OWLObject";
        }
        return s;
    }

    private static Set<String> methodNamesToSkip = new HashSet<String>(Arrays.asList(
            "wait", "equals", "toString", "hashCode", "getClass", "notify", "notifyAll"));
}
