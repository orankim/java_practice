public class GuGuDan {
    public static void main(String[] args){
        printGuGuDan(9);
    }

    public static void printGuGuDan(int num){
        for(int i=2;i<num+1;i++) printDan(i);
    }

    public static void printDan(int dan){
        System.out.printf("%d단\n", dan);
        for(int i=1;i<=9;i++){
            System.out.printf("\t");
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        }
    }
    
}
