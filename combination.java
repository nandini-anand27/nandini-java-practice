public class combination {
    public static void main(String[] args) {
        int[]n = {1,2,3};
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                for(int k = 0;k<3;k++){
                    if(i!=j && j!=k && i!=k){
                        System.out.println(n[i] + " " + n[j] + " " + n[k]);
                    }
                }
            }
        }
    }
    
}
