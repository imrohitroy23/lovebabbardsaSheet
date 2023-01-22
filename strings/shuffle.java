public class shuffle {
    
        public static boolean isValidShuffle(String s, String s1, String s2) {
            if (s1.length() + s2.length() != s.length()) {
                return false;
            }
            int i = 0, j = 0, k = 0;
            while (k < s.length()) {
                if (i < s1.length() && s1.charAt(i) == s.charAt(k)) {
                    i++;
                } else if (j < s2.length() && s2.charAt(j) == s.charAt(k)) {
                    j++;
                } else {
                    return false;
                }
                k++;
            }
            return true;
        }
    
        public static void main(String[] args) {
            String s = "abcdef";
            String s1 = "ab";
            String s2 = "cedf";
            System.out.println(isValidShuffle(s, s1, s2));
        }
    }
    
