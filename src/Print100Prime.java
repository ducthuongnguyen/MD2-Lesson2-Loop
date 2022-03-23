public class Print100Prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count <=100 ; i++) {
            boolean check = true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(i+" ");
                count++;
            }
        }
    }
}
