
public class MedianTwoArr {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		double res=0;
		int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        for(int i = 0; i<nums1.length; i++){
            arr[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            arr[nums1.length + i] = nums2[i];
        }
        quickSort(arr);
        System.out.println("length:"+arr.length);
        for(int i=0; i<arr.length; i++){
        	System.out.println(arr[i]+" ");
        }
   
        if((arr.length%2)==0){
            res = ((arr[(arr.length)/2-1]+arr[arr.length/2])/2.0);
        }else{
            res = (arr[(arr.length)/2]);
        }
        System.out.println("result:"+res);
    }
    public static void quickSort(int[] arr){
        qsort(arr, 0, arr.length-1);
    }
    private static void qsort(int[] arr, int low, int high){
        if (low < high){
            int pivot=partition(arr, low, high);        //�������Ϊ������
            qsort(arr, low, pivot-1);                   //�ݹ�������������
            qsort(arr, pivot+1, high);                  //�ݹ�������������
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];     //�����¼
        while (low<high){
            while (low<high && arr[high]>=pivot) --high;
            arr[low]=arr[high];             //����������С�ļ�¼�����
            while (low<high && arr[low]<=pivot) ++low;
            arr[high] = arr[low];           //����������С�ļ�¼���Ҷ�
        }
        //ɨ����ɣ����ᵽλ
        arr[low] = pivot;
        //���ص��������λ��
        return low;
    }
}
