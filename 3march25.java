class StringPali{
    public static void main(String[] args) {
        
        // System.out.println(withoutbuildin(a));
        // System.out.println(Stringbuilder(a));
        // System.out.println(Stringbuffer(a));
        // System.out.println(WithBUildin(a));
        // System.out.println(SubObj(a));
        // System.out.println(BufferSub(a));
        // System.out.println(BuilderSub(a));
        String x = "i love  java      pubg";
        // StrNUm(x);
        pg(x);
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
    String ch = "";  
    int digit = 0;  
    String result = "";
    StringBuilder numberBuilder = new StringBuilder();
    for (int i = 0; i < n; i++) {
        char currentChar = x.charAt(i);
        if (Character.isLetter(currentChar)) {
            ch = ch + currentChar;
        } else if (Character.isDigit(currentChar)) {
            numberBuilder.append(currentChar);
            if (i == n - 1 || !Character.isDigit(x.charAt(i + 1))) {
                digit = Integer.parseInt(numberBuilder.toString());
                for (int j = 0; j < digit; j++) {
                    result = result + ch;
                }
                numberBuilder.setLength(0); 
                ch = "";  
            }
        }
    }
    result = result + ch;
    System.out.println(result);
}

    static void pg(String x) {
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

