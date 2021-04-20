package bai14_thuat_toan_sap_xep.thuc_hanh.bai3_optional_sap_xep_noi_bot;

public class BubbleSort {
    static int[] list={2,3,2,5,6,1,-2,3,14,12};
    public static void bubble(int[] list){
        boolean needNextPass=true;
        for (int k=1;k<list.length && needNextPass;k++){
            for (int i=0;i<list.length-k;i++) {
                if (list[i] > list[i + 1]) {
                    int temp=list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;

                }
            }
        }
    }

    public static void main(String[] args) {
        bubble(list);
        for (int i=0;i<list.length;i++){
            System.out.println(list[i] + " ");
        }
    }
}
