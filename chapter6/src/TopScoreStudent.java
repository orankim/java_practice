public class TopScoreStudent {
    public static void main(String[] args){
        String[] names={"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Sam"};
        int[] scores={65,74,23,75,68,96,88,98,54};

        int i=topIndex(scores);

        System.out.printf("1등: %s(%d점)", names[i],scores[i]);
    }

    public static int topIndex(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i]) max=i;
        }
        return max;
    }
}
