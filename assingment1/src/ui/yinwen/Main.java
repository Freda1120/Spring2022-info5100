package ui.yinwen;


import java.util.Arrays;




public class Main {

    public static void main(String[] args) {

        // 1
        String s = "abbbba";
        System.out.println(isPalindrome(s));

        // 2
        String checkUniqueString = "abceda";
        System.out.println(isAllUnique(checkUniqueString));

        // 3
        String checkDuplicateString = "abcdefga";
        System.out.println(containDuplicate(checkDuplicateString));

        //4
        String str1 = "tea";
        String str2 = "ate";
        System.out.println(isAnagrams(str1, str2));

        // 5
        int year = 2022;
        System.out.println(isLeapYear(year));


        //6
        int callNumber = 145;
        calculateBills(callNumber);

        // 7
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));

        // 8
        Character grade = 'B';
        getGrade(grade);

        // 9
        Book book = new Book("Data Structure", 1, "Computer Science", 40);
        System.out.println("Book: " + book.getName() + " bookID: " + book.getBookID() + " Genres: " + book.getGenres() + " Prices: " + book.getPrice());

        // 10
        Box boxA = new Box(12, 24,8);
        double volume = boxA.calculateVolume();
        System.out.println(volume);

    }

    // 1
    private static boolean isPalindrome(String str)
    {

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    // 2
    private static boolean isAllUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // 3
    private static boolean containDuplicate(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // 4
    private static boolean isAnagrams(String str1, String str2) {
        char[] strCharArray1 = str1.toCharArray();
        char[] strCharArray2 = str2.toCharArray();
        Arrays.sort(strCharArray1);
        Arrays.sort(strCharArray2);
        str1 = new String(strCharArray1);
        str2 = new String(strCharArray2);

        return str1.equals(str2);
    }

    // 5
    public static boolean isLeapYear(int year) {
        boolean isLeapYear;
        if (year % 4 == 0) {
            isLeapYear = true;
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            }
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }


    // 6
    private static void calculateBills(int callNumber){
        int caseCondition;
        if (callNumber > 0 && callNumber <= 100){
            caseCondition = 1;
        }else if (callNumber > 100 && callNumber <= 150){
            caseCondition = 2;
        }else if (callNumber > 150 && callNumber <= 200){
            caseCondition = 3;
        }else{
            caseCondition = 4;
        }
        double bill;
        switch (caseCondition) {
            case 1:
                bill = 200;
                System.out.println("Bill is " + bill);
                break;
            case 2:
                 bill = 200 + (callNumber - 100) * 0.6;
                 System.out.println("Bill is " + bill);
                break;
            case 3:
                 bill = 200 + 50 * 0.6 + (callNumber - 150) * 0.5;
                 System.out.println("Bill is " + bill);
                break;
            case 4:
                 bill = 200 + 50 * 0.6 + 50 * 0.5 + (callNumber - 200) * 0.4;
                 System.out.println("Bill is " + bill);
                break;
        }

    }
    // 7
    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    // 8
    private static void getGrade(Character grade){
        if (grade.equals('A')){
            System.out.println("Excellent");
        }
        else if (grade.equals('B')){
            System.out.println("Good");
        }
        else if (grade.equals('C')){
            System.out.println("Average");
        }
        else if (grade.equals('D')){
            System.out.println("Deficient");
        }
        else if (grade.equals('F')){
            System.out.println("Failing");
        }

        else
            System.out.println("Grade is Incorrect");
        }

}
