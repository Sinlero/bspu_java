package Test.Annotations;

@TestAnnotation(str = "Hello", x = 100)
public class TestClass {
    TestClass() {
        System.out.println("Test");
    }

    @Deprecated
    public void doNothing() {
        System.out.println("ssss");
    }

    @Override
    public String toString() {
        return "Test.Annotations.TestClass";
    }
}
