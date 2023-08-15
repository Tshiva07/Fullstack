public class palindrome {
    public static void main(String[] args){
        String str= "MADAM";
        StringBuffer newStr = new StringBuffer();
        for (int i = str.length()-1; i>=0; i--){
            newStr = newStr.append(str.charAt(i));

        }if (str.equalsIgnoreCase(newStr.toString())){
            System.out.println("string is palindrome");

        }else{
            System.out.println("string is not palindrome");
        }
    }
}

