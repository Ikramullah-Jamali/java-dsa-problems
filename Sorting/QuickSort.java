
public class QuickSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = arr.length;

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, length - 1);

        System.out.print("Sorted array: ");
        qs.printArray(arr);
    }

    int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[low];
        while (low <= high) {
            while (arr[low] < pivot) 
            {
                low++;
            }
            while (arr[high] > pivot) 
            {
                high--;
            }
            if (low <= high) 
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    void quickSort(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi, high);
        }
    }

    void printArray(int[] arr) 
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}