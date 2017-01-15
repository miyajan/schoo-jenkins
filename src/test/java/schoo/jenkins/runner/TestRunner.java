package schoo.jenkins.runner;

import org.junit.internal.RealSystem;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void main(String... args) {
        Result result = runTests(args);
        System.exit(result.wasSuccessful() ? 0 : 1);
    }

    private static Result runTests(String... args) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.addListener(new AntXmlRunListener());
        jUnitCore.addListener(new TextListener(new RealSystem()));
        Class[] classes = toClasses(args);
        return jUnitCore.run(classes);
    }

    private static Class[] toClasses(String[] args) {
        List<Class> classes = new ArrayList<>(args.length);
        for (String arg : args) {
            try {
                classes.add(Class.forName(arg));
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return classes.toArray(new Class[classes.size()]);
    }
}
