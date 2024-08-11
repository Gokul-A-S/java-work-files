public class Main {
    public static void main(String[] args) {
        int[] list = {1,0,9,3,2,7};
        int n=list.length;
        quicksort(list,0,n-1);
        for (int j : list) {
            System.out.print(j);

        }
    }

    public static void swap(int[] list, int i, int j){
        int temp= list[i];
        list[i]=list[j];
        list[j]=temp;
    }

    public static int partition(int[] list, int low, int high){

        int pivot= list[high];
        int i= low-1;
        for(int j=low;j<=high;j++){
            if(list[j]<pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i+1, high);
        return i+1;
    }

    public static void quicksort(int[] list,int low,int high){
        if(low<high){
            int pi=partition(list,low,high);
            quicksort(list,low,pi-1);
            quicksort(list ,pi+1,high);
        }
    }
}