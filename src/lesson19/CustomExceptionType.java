package lesson19;

public class CustomExceptionType extends Exception {

    private static String myCustomErrMsg = "CustomExceptionType - Msg";
    public CustomExceptionType(String errMsg){
        super(myCustomErrMsg);
    }
}
