import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class SpojSort2D2DSort {
    public void answer()throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(input.readLine());
        while (t--!=0){
            int n=Integer.parseInt(input.readLine());
            int[] fArr=new int[n];
            int[]sArr=new int[n];
          //  int[]br=new int[n*2];
            for (int i = 0; i <n ; i++) {
                String[] s=input.readLine().split(" ");
                fArr[i]=Integer.parseInt(s[0]);
                sArr[i]=Integer.parseInt(s[1]);
            }
            ascendingQuickSort(fArr,sArr,0,n-1,0);
           /* int  pre=fArr[0];
            int preIndex=0;
            for (int i = 1,st=0,end=0; i <n ;i++) {
                if(fArr[i]==pre){
                    st=preIndex;
                    end=i;
                }else{
                    if(st!=end){
                        quickSort(sArr,fArr,st,end,st);
                    }
                }
            }*/
            for (int i = 0; i <n ; i++) {
                System.out.println(fArr[i]+" "+sArr[i]);
            }
        }
    }
    public static void ascendingQuickSort(int []arr,int []arr2,int st,int end,int pivot){
        int start=st,finish=end;
        if(st>=end)
            return;
        while (st<end) {
            if (arr[st] > arr[end]) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                temp=arr2[st];
                arr2[st] = arr2[end];
                arr2[end] = temp;
                if (arr[end] == pivot)
                    st++;
            }else if(arr[st]==arr[end]){
                if(arr2[st]<arr2[end]){
                    int temp = arr[st];
                    arr[st] = arr[end];
                    arr[end] = temp;
                    temp=arr2[st];
                    arr2[st] = arr2[end];
                    arr2[end] = temp;
                    if (arr[end] == pivot)
                        st++;
                }else
                    end--;
            }
            else
                end--;
        }
        ascendingQuickSort(arr,arr2,start,st-1,arr[(st+start)/2]);
        ascendingQuickSort(arr,arr2,end+1,finish,arr[(finish+end)/2]);
    }
/*    public static void quickSort(int []arr,int []arr2,int st,int end,int pivot){
        int start=st,finish=end;
        if(st>=end)
            return;
        while (st<end) {
            if (arr[st] < arr[end]) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                temp=arr2[st];
                arr2[st] = arr2[end];
                arr2[end] = temp;
                if (arr[end] == pivot)
                    st++;
            }else
                end--;
        }
        quickSort(arr,arr2,start,st-1,arr[(st+start)/2]);
        quickSort(arr,arr2,end+1,finish,arr[(finish+end)/2]);
    }*/
}
