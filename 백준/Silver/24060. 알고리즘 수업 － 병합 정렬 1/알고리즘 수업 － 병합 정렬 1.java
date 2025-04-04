import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    static int mergeCnt = 0;
    static int answer = -1;
    static int a;
    static int k;
    static int[] arr;
    static int[] sorted;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        a = Integer.parseInt(temp.split(" ")[0]);
        k = Integer.parseInt(temp.split(" ")[1]);
        String[] t = br.readLine().split(" ");
        arr = new int[a];
        sorted = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(t[i]);
        }


        mergeSort(arr, 0, arr.length-1);
        if(mergeCnt < k){
            System.out.println(-1);
        }else{
            System.out.println(answer);
        }

    }

    static void mergeSort(int[] arr, int l, int r){
        if(l == r) return ;
        int mid = (l+r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, r, mid);

    }

    static void merge(int[] arr, int left, int right, int mid){
        int idx = left;
        int l = left;
        int r = mid+1;
        while(l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                sorted[idx++] = arr[l++];
            }else{
                sorted[idx++] = arr[r++];
            }
        }
        if(l<=mid){
            while(l <= mid){
                sorted[idx++] = arr[l++];
            }
        }else{
            while(r <= right){
                sorted[idx++] = arr[r++];
            }
        }
        for(int i = left; i < idx; i++){
            arr[i] = sorted[i];
            mergeCnt++;
            if(mergeCnt == k){
                answer = arr[i];
                break;
            }
        }
    }
}


