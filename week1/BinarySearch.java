package week1;

public class BinarySearch {
    // applied in sorted array
 static    int normalBinary(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            mid = start + (end - start) / 2;
if(arr[mid]==target){
    return mid;
}else if(arr[mid]<target){
    start = mid+1;
}
else{
    end = mid-1;
}
        }
        return -1;
    }


// if target occur more than one time then find first index the target

static int firstBinary(int arr[],int target){
    int start = 0, end = arr.length - 1;
    int first =-1;
    int mid = start + (end - start) / 2;
    while (start <= end) {
        mid = start + (end - start) / 2;
if(arr[mid]==target){
first = mid;
end=mid-1;
}else if(arr[mid]<target){
start = mid+1;
}
else{
end = mid-1;
}
    }

    return first;
}

// if target occur more than one time then find last index the target

static int lastBinary(int arr[],int target){
    int start = 0, end = arr.length - 1;
    int last =-1;
    int mid = start + (end - start) / 2;
    while (start <= end) {
        mid = start + (end - start) / 2;
if(arr[mid]==target){
last = mid;
start=mid+1;
}else if(arr[mid]<target){
start = mid+1;
}
else{
end = mid-1;
}
    }

    return last;
}




// If we want to find the total number of occurnce of our target we can just simply say -----> Last - First




// find peak element in mountain array
int peakElement(int arr[]){

   int s=0,e = arr.length-1 ;
   int mid = s+(e-s)/2;
 while (s<=e) {
    if(arr[mid-1]<arr[mid]&&arr[mid]<arr[mid+1]){
         s=mid+1;
    }else{

    }
  }
  


return -1;

}

    public static void main(String[] args) {
int[] arr ={1,8,8,8,8,9};        

System.out.println(lastBinary(arr, 8));

    }

}
