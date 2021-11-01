package stringmethods.filename;

public class FileNameManipulator {

    public static char findLastCharacter(String str) {
        str = str.trim();
        return str.charAt(str.length()-1);
    }

    public static String findFileExtension(String fileName) {
        fileName = fileName.trim();
        return fileName.substring(fileName.lastIndexOf('.'));
    }

    public static boolean identifyFilesByExtension(String ext, String fileName) {
        return ext.equalsIgnoreCase(findFileExtension(fileName));
    }

    public static boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public static String changeExtensionToLowerCase(String fileName) {
        fileName=fileName.trim();
        int fileNamePartIndex = fileName.trim().lastIndexOf('.');
        return fileName.substring(0,fileNamePartIndex) + findFileExtension(fileName).toLowerCase();
    }

    public static String replaceStringPart(String fileName, String present, String target) {
        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }

    public static void main(String[] args) {
        System.out.println(findLastCharacter(" 123456 "));
        System.out.println(findFileExtension(" aa.txt  "));
        System.out.println(identifyFilesByExtension(".txt","file.TXT"));
        System.out.println(identifyFilesByExtension(".txt","file.com"));
        System.out.println(compareFilesByName("ALMA.TXT", "alma.txt"));
        System.out.println(compareFilesByName("ALMA.TXT", "falma.txt"));
        System.out.println(changeExtensionToLowerCase("ALMA.TXT"));
        System.out.println(replaceStringPart("alma.txt","alma", "korte"));
        System.out.println(replaceStringPart("alma.txt","falma", "korte"));

    }
}
