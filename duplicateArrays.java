public class duplicateArrays {
    public static void main(String[] args) {
        int[]n = {1,2,3,4,5,6,7,8,9};
        int[]m = {1,2,3,4,5,6,7,8,9};
        boolean same = true;
        if(n.length != m.length){
            same = false;
        }
        else{
            for(int i=0; i<n.length; i++){
                if(n[i] != m[i]){
                    same = false;
                    break;
                }
            }
        }

    
if (same){
    System.out.println("The two arrays are the same");
}else{
    System.out.println("The two arrays are not the same");
}
    }
}
