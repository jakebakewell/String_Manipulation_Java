public class StringManipulator {
    public StringManipulator(){
    }
    public String trimAndConcat(String strOne, String strTwo) {
        String one = strOne.trim();
        String two = strTwo.trim();
        String stringsTogether = one + two;
        return stringsTogether;
    }
    public Integer getIndexOrNull(String str, char letter) {
        return str.indexOf(letter);
    }
    public Integer getIndexOrNull(String str, String subStr) {
        return str.indexOf(subStr);
    }
    public String concatSubstring(String str, int num, int numTwo, String strTwo) {
        String modStr = str.substring(num, numTwo);
        String newStr = modStr + strTwo;
        return newStr;
    }
}
