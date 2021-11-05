package controlselection.accents;

public class WithoutAccents {
    public char withoutAccent (char inputChar) {
        String accents = "áéíóöőúüűÁÉÍÓÖŐÚŰ";
        String withoutAccents = "aeiooouuuAEIOOOUU";
        int indexOfChar = accents.indexOf(inputChar);
        if (indexOfChar > -1) {
            return withoutAccents.charAt(indexOfChar);
        }
        return inputChar;
    }
}
