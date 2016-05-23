package Sort;
/**
 * @author LIn
 * �㷨���ƣ���������(�۰��������)
 * �㷨��������ֱ�Ӳ���������е�ĳһ��ʱ��ǰi-1����¼�����򣬴�ʱ
 *        ����ֱ�Ӳ������򣬶���Ϊ�����۰���ң��ҵ����ٲ���
 * �㷨�Ľ������Ƚϴ���������O(nlogn)�����ƶ� ������δO(n^2)
 * 
 * ���Ӷȷ�����
 * 1.ƽ��ʱ�临�Ӷȣ�O(n^2)
 * 2.�ռ临�Ӷȣ�O(1)(��ʱ���ݽ����ռ�)
 */
public class BinarySort {

	public static void BinarySort(int[] a){
		int low,high,mid;
		int temp;
		for(int i = 0; i < a.length; i++){
			temp = a[i];
			low = 0;
			high = i - 1;
			while(low <= high){
				mid = (low + high) / 2;
				if(a[mid] > temp){
					high = mid - 1;
				}else{
					low = mid + 1;
				}
			}
			for(int j = i-1; j > high; j--){
				a[j+1] = a[j];
			}
			a[high+1] = temp;
		}
	}

}
