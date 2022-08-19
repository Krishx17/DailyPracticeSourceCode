public class DecreasingSort{
    public static void main(String args[]){
        //WAP to sort a list of elements in a non decreasing manner 
        int arr[] = {5,3,6,7,1};
        int temp = 0;
        int num = 5;
        for(int j = 0 ; j < num-1 ; j++)
        {
            for(int i = 0 ; i < num-1 ; i++)
        {
            if(arr[i] > arr[i+1])
            {
               temp = arr[i+1];
               arr[i+1] = arr[i];
               arr[i] = temp; 
            }
        }
        }
        System.out.print("Sorted Array : ");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}