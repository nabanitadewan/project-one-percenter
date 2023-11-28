public class Crack {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        boolean ch = isUnique("abcd");
        boolean qw = isUnique("qwwerty") ;
        boolean we =  isUniqueBitManipulation("abcd");
        System.out.println(we);
    }

    private static boolean isUnique(String s) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) {
            if(arr[ch - 97] >= 1) return false;
            arr[ch - 97]++;
        }
        return true;
    }

    private static boolean isUniqueBitManipulation(String s) {
        int memory = 0;
        for(int i =0; i< s.length();i++) {
            int ch = s.charAt(i) - 'a';
            if(((memory >> ch) & 1) > 0) return false;
            memory |= 1 << ch;
        }
        return true;
    }
}
