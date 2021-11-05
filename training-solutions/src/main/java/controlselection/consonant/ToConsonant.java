package controlselection.consonant;

public class ToConsonant {
    public char Consonant(char letter){
        String lettersOfTheAlphabet = "abcdefghijklmnopqrstuvwxyz";
        char returnChar;
        if (isVowel(letter)){
            int indexOfLetter = lettersOfTheAlphabet.indexOf(letter) + 1;
            returnChar = lettersOfTheAlphabet.charAt(indexOfLetter);
        } else {
            returnChar = letter;
        }
        return returnChar;
    }

    private boolean isVowel(char letter) {
        String lettersOfVowel = "aeiou";
        boolean returnValue = false;

        for (int i = 0; i < lettersOfVowel.length(); i++) {
            if (letter == lettersOfVowel.charAt(i)){
                returnValue = true;
            }
        }
        return returnValue;
    }

}
