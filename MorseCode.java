import acm.program.ConsoleProgram;

import java.util.ArrayList;

public class MorseCode extends ConsoleProgram {


    public void run()
    {
        println("This program translates a line into Morse code. designed by Vincent.");
        ArrayList<Character> numb = new ArrayList<Character>();
        ArrayList<String> morseCode = new ArrayList<String>();

        for(char i='A'; i<'Z'; i++)
        {
            numb.add(i);
            switch(i){
                case 'A': morseCode.add(".-");break;
                case 'B' : morseCode.add("-...");break;
                case 'C' : morseCode.add("-.-.");break;
                case 'D' : morseCode.add("-..");break;
                case 'E' : morseCode.add(".");break;
                case 'F' : morseCode.add("..-.");break;
                case 'G' : morseCode.add("--.");break;
                case 'H' : morseCode.add("....");break;
                case 'I' : morseCode.add("..");break;
                case 'J' : morseCode.add(".---");break;
                case 'K' : morseCode.add("-.-");break;
                case 'L' : morseCode.add(".-..");break;
                case 'M' : morseCode.add("--");break;
                case 'N' : morseCode.add("-.");break;
                case 'O' : morseCode.add("---");break;
                case 'P' : morseCode.add(".--.");break;
                case 'Q' : morseCode.add("--.-");break;
                case 'R' : morseCode.add(".-.");break;
                case 'S' : morseCode.add("...");break;
                case 'T' : morseCode.add("-");break;
                case 'U' : morseCode.add("..-");break;
                case 'V' : morseCode.add("...-");break;
                case 'W' : morseCode.add(".--");break;
                case 'X' : morseCode.add("-..-");break;
                case 'Y' : morseCode.add("-.--");break;
                case 'Z' : morseCode.add("--..");break;

            }
        }
        numb.add((char) 32);
        morseCode.add("  ");
        while(true){
            String test = readLine("Enter english text to translate: ");
            test = test.toUpperCase();
            String moCd=" ";

            String res = "";
            int ind = 0;
            for(int a=0; a<test.length(); a++)
            {
                ind = numb.indexOf(test.charAt(a));
                moCd = morseCode.get(ind);
                res = res+ moCd;
            }
            println(res);
        }

    }
}
