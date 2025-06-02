
public class MergeSort 
{
    int[] data;
    int[] temp;
    int size;

    public static void main(String[] args) 
    {
        int[] nums = {48, 36, 13, 52, 19, 94, 21};
        MergeSort sorter = new MergeSort();
        sorter.sort(nums);
        System.out.print("Sorted Array: ");
        for (int n : nums) 
        {
            System.out.print(n + " ");
        }
    }

    public void sort(int[] input) 
    {
        this.data = input;
        this.size = input.length;
        this.temp = new int[size];
        split(0, size - 1);
    }

    public void split(int left, int right) 
    {
        if (left < right) {
            int mid = left + (right - left) / 2;
            split(left, mid);
            split(mid + 1, right);
            join(left, mid, right);
        }
    }

    public void join(int left, int mid, int right) 
    {
        for (int i = left; i <= right; i++) 
        {
            temp[i] = data[i];
        }
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) 
        {
            if (temp[i] <= temp[j]) 
            {
                data[k++] = temp[i++];
            } else {
                data[k++] = temp[j++];
            }
        }
        while (i <= mid) 
        {
            data[k++] = temp[i++];
        }
    }
}