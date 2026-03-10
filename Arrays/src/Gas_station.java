public class Gas_station {
    static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3, 4, 5, 1, 2};
        int start=0;
        int current=0;
        int totgas=0;
        int totcost=0;
        for (int i = 0; i < gas.length; i++) {
            totcost+=cost[i];
            totgas+=gas[i];
            current=gas[i]-cost[i];

            if(current<0){
                start=i+1;
                current=0;
            }

        }
        if(totgas<totcost){
            System.out.println(-1);
        }else {
            System.out.println(start);
        }
    }
}
