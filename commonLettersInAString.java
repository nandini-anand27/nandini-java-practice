public class commonLettersInAString {
    public static void main(String[]args){
        String a = "sam";
        String b = "samantha";
        String c = "sample";
        String common=" ";
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(b.indexOf(ch)!=-1 && c.indexOf(ch)!=-1){
                if(common.indexOf(ch)==-1){
                common+=ch;
            }
        }
    }
    System.out.println("Common letters in the three strings are: "+common);
    }
}
