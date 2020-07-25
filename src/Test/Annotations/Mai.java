package Test.Annotations;

import java.lang.annotation.Annotation;

public class Mai {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        Annotation[] annotations = testClass.getClass().getAnnotations();
        System.out.println(annotations.length);
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        TestAnnotation annotation = testClass.getClass().getAnnotation(TestAnnotation.class);
        System.out.println(annotation.x()+annotation.str()+annotation.another());

    }
}
