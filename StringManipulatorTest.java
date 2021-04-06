public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator test = new StringManipulator();
        System.out.println(test.trimAndConcat("     Hello   ", "    World    "));
        System.out.println(test.getIndexOrNull("Gorilla", 'i'));
        System.out.println(test.getIndexOrNull("Hello World", "llo"));
        System.out.println(test.concatSubstring("Hello", 1, 2, "World"));
    }
}
