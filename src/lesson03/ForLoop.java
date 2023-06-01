package lesson03;

public class ForLoop {
    public static void main(String[] args) {
        //camelCase, snake_case
        //BAD: int CAmelCAse = 3;
        int maxMistakesAllowed = 3; //Java
        //int max_mistakes_allowed = 3; //Python

        final int MAX_MISTAKES_ALLOWED = 3; //declare a const

        for(int mistakeNumber = 0;  mistakeNumber < MAX_MISTAKES_ALLOWED; mistakeNumber++ ){
            System.out.printf("Play outside because the mistake is %d%n", mistakeNumber);
        }

        System.out.println("OUT OF THE LOOP");
    }
}
