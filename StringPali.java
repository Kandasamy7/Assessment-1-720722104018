class StringPali{
    public static void main(String[] args) {
        // String a = ")(@tha234yoli@()";
        // System.out.println(withoutbuildin(a));
        // System.out.println(Stringbuilder(a));
        // System.out.println(Stringbuffer(a));
        // System.out.println(WithBUildin(a));
        // System.out.println(SubObj(a));
        // System.out.println(BufferSub(a));
        // System.out.println(BuilderSub(a));
        String x = "i love  java      programming";
        // StrNUm(x);
        elavu(x);
    }

    static String withoutbuildin(String a) {
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }
        if(reverse.equals(a)){
            return "yes";
        }else
            return "no";
    }

   static String Stringbuilder(String a){
    StringBuilder s = new StringBuilder(a);
     s.reverse();
     String revtoString = s.toString();
    if(a.equals(revtoString)){
        return "yes";
    }
    return "no";

   }

   static String Stringbuffer(String a){
    StringBuffer s = new StringBuffer(a);
     s.reverse();
     String revtoString = s.toString();
    if(a.equals(revtoString)){
        return "yes";
    }
    return "no";
   }
   static String WithBUildin(String a){
    int n = a.length();

    for (int i = 0; i < n / 2; i++) {
        if (a.charAt(i) != a.charAt(n - 1 - i)) {
            return "no"; 
        }
    }
    return "yes"; 
}
    static String SubObj(String a){

        String str = a.substring(1,4);
        return str;
    }
   static String BufferSub(String a){
    StringBuffer s = new StringBuffer(a);
    
     String ab = s.substring(4,8);
     return ab;
   }
   static String BuilderSub(String a){
    StringBuilder s = new StringBuilder(a);
    
     String ab = s.substring(3,11);
     return ab;
   }
   static void StrNUm(String x) {
    int n = x.length();
    String ch = "";  // String to hold the current character(s)
    int digit = 0;    // Variable to hold the digit(s)
    String result = "";  // String to store the final result
    StringBuilder numberBuilder = new StringBuilder();  // To store digits

    for (int i = 0; i < n; i++) {
        char currentChar = x.charAt(i);
        
        if (Character.isLetter(currentChar)) {
            // If the character is a letter, add it to `ch`
            ch = ch + currentChar;
        } else if (Character.isDigit(currentChar)) {
            // If the character is a digit, store it in the numberBuilder
            numberBuilder.append(currentChar);
            
            // If the next character is not a digit or we are at the end of the string
            if (i == n - 1 || !Character.isDigit(x.charAt(i + 1))) {
                // Convert the accumulated digits in numberBuilder to an integer
                digit = Integer.parseInt(numberBuilder.toString());
                
                // Repeat the current value of `ch` `digit` times and append to result
                for (int j = 0; j < digit; j++) {
                    result = result + ch;
                }
                
                // Reset the numberBuilder and `ch`
                numberBuilder.setLength(0); // Clear the builder for next digit(s)
                ch = "";  // Reset `ch` after appending repeated character(s)
            }
        }
    }
    
    // Append any remaining characters (letters) to the result
    result = result + ch;
    
    // Print the final result
    System.out.println(result);
}

    static void elavu(String x) {
        int n = x.length();
        String revname = "";
        boolean isWord = false; 
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = x.charAt(i);
            if (currentChar == ' ') {
                if (isWord) {
                    System.out.print(revname + " ");
                    revname = ""; 
                    isWord = false;  
                }
            } else {
                revname = currentChar + revname;
                isWord = true;
            }
        }
   
        if (isWord) {
            System.out.print(revname);
        }
    }
}

