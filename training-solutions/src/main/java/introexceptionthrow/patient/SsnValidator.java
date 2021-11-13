package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        boolean valid = true;
        int ssnNumber;
        if(ssn.trim().length() != 9) {
            valid = false;
            throw new IllegalArgumentException("Érvénytelen a TAJ szám, nem 9 karakter");
        }

        try {
            ssnNumber = Integer.parseInt(ssn.trim());
        }
        catch (NumberFormatException nfe){
            System.out.println("Nem számot adtál meg");
            valid = false;
        }

        ssn = ssn.trim();

        if (!isValidChecksum(ssn)) {
            valid = false;
            throw new IllegalArgumentException("Érvénytelen a TAJ szám!");
        }
        return valid;
    }

    boolean isValidChecksum(String ssn) {
        char[] charsOfSsn = ssn.toCharArray();
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                sum += Character.getNumericValue(charsOfSsn[i]) * 3;
            } else {
                sum += Character.getNumericValue(charsOfSsn[i]) * 7;
            }
        }
        if (sum % 10 == Character.getNumericValue(charsOfSsn[8])){
            return true;
        } else {
            return false;
        }
    }

}
