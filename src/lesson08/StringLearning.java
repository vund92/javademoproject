package lesson08;

public class StringLearning {
    public static void main(String[] args) {
        //Declare String Literal
        String myUrl = "httpS://Testez.io"; //String literal
        String stringObject = new String("httpS://Testez.io"); //String Object.

        //1. String Length
        System.out.printf("String length is: %d", myUrl.length());

        //2. Check for existing of char or substring
        int indexOfIO = myUrl.indexOf(".io");
        int indexOfSomething = myUrl.indexOf("abc");
        System.out.printf("Indoex of IO is: %d\n", indexOfIO);
        System.out.printf("Indoex of IO is: %d\n", indexOfSomething);

        //3. Substring - get a substring from String https://testez.io
        String domainName = myUrl.substring(8);
        System.out.printf("My domain name is: %s%n", domainName);

        //4. Trim a String
        String strWithSomeSpacesAtBeginning = "     Tror       ";
        System.out.printf("Length of Teo String before TRIM is %d%n", strWithSomeSpacesAtBeginning.length());
        String teoNameAfterTrimming = strWithSomeSpacesAtBeginning.trim();
        System.out.printf("Length of Teo String after TRIM is %d%n", teoNameAfterTrimming.length());

        //5. Replace, replace all
        String teoReplacedStr = strWithSomeSpacesAtBeginning.replace("r","e");
        System.out.printf("After replacing is %s%n", teoReplacedStr.trim());

        //6. toLowerCase, toUpperCase
        System.out.println(myUrl.toUpperCase());
        System.out.println(myUrl.toLowerCase());

        //7. Small Example to check characters in String

        //8. Combine 2 String with + operator and Concatenating
        String protocol = "https";
        String defaultSlashes = "//";
        String domain_name = "testez.io";

        String firstFullWebsiteLink = protocol + defaultSlashes + domain_name;
        String secondFullWebsiteLink = protocol.concat(defaultSlashes).concat(domain_name); //concat returns a String Object ("new String()");

        System.out.println(firstFullWebsiteLink);
        System.out.println(secondFullWebsiteLink);

        //9. Compare 2 String literal and comeback to compare 2 Strings after combine
        // this example to indicate the difference between two ways of declare String variable
        // String s1 = "abc" >< String s2 = new String("abc") ==> refer to different memory locations in Java Heap
        String teoName = "Teo";
        String teo_name = "Teo"; //teoName and teo_name refer to the same address of Teo in Java Heap
        String thirdWebsiteFillLink = "https//testez.io";
        boolean isSameContent = teoName == teo_name;
        boolean isSameWebsite = thirdWebsiteFillLink == secondFullWebsiteLink;
        System.out.println("is teoName and teo_name equal: " + isSameContent); //true
        System.out.println("is website links same: " + isSameWebsite); //false

        boolean isEqualWebsite = thirdWebsiteFillLink.equals(secondFullWebsiteLink);
        System.out.println("is website links equal to each other: " + isEqualWebsite); //true
        // ==> Note: should use .equals() instead ==, because .equals() includes ==

        //10. Converts String to numbers using valueof and numbers to String - With Sample
    }
}
