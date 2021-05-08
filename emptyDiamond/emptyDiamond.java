public class emptyDiamond{
        public static void main(String[] args){
            int vara = -1;
            for(int i=0; i<5; i++){
                for(int k=i; k<6; k++){
                    System.out.print(" ");
                }
                if(vara!=-1){
                    System.out.print("*");
                }
                for(int m=i; m<i+vara; m++){
                    System.out.print(" ");
                }
                for(int l=i; l<=i; l++){
                    System.out.print("*");
                }
                System.out.println();
                vara = vara + 2;
            }
            vara = vara - 2;
            for(int i=5; i>0; i--){
                for(int k=i; k<7; k++){
                    System.out.print(" ");
                }
                if(vara!=-1){
                    System.out.print("*");
                }
                for(int m=i; m<i+vara; m++){
                    System.out.print(" ");
                }
                for(int l=i; l<=i; l++){
                    System.out.print("*");
                }
            System.out.println();
            vara = vara - 2;
        }
    }
}
    