package Sort;
/**
 * @author LIn
 * �㷨���ƣ���������
 * �㷨������
 * 1.ͨ��һ������Ҫ��������ݷָ�ɶ����������֣�����һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС
 * 2.�ظ�����1�������������ݷֱ���п�����������������̿��Եݹ���У��Դ˴ﵽ�������ݱ���������С�
 *
 * ���Ӷȷ�����
 * 1.ƽ��ʱ�临�Ӷȣ�O(nlogn)
 * 2.�ռ临�Ӷȣ�O(logn)(��ֵԪ�ش洢�ռ�)
 */
public class QuickSort {

	public static void QuickSort(int[] a, int left, int right){
		int pivotpos;  //���ֺ��׼��λ��
		if(left < right){
			pivotpos = Partition(a, left ,right);
			QuickSort(a, left, pivotpos-1);
			QuickSort(a, pivotpos+1, right);
		}
	}
	
	/**
	 * ��ͨѡ���׼
	 */
	private static int Partition(int[] a, int i, int j){
		//����Partition(a,left,right)ʱ����a[left...right]������
		//�����ػ�׼��¼��λ��
		int pivot = a[i];  //������ĵ�һ����¼��Ϊ��׼
		
		while(i < j){  //���������˽������м�ɨ�裬ֱ��i=jΪֹ
			while(i < j && a[j] >= pivot){   //pivot�൱����λ��i��
				j--;
			}
			if(i < j){   //��ʾ�ҵ�a[j]<pivot,����a[i]��a[j]
				a[i++] = a[j];
			}
			while(i < j && a[i] <= pivot){ //pivot�൱����λ��j��
				i++;     //������ɨ�裬���ҵ�һ������pivot������Ԫ��
			}
			if(i < j){   //��ʾ�ҵ�a[i]>pivot,����a[i]��a[j]
				a[j--] = a[i];
			}	
		}
		
		a[i] = pivot;
		return i;
	}
	
	public static void main(String[] args) {
		int[] a = {4,2,1,6,3,6,0,-5,1,1};
		QuickSort(a,0,a.length-1);
		
		for(int i = 0; i < a.length; i++){
			System.out.printf("%d ",a[i]);
		}

	}

}
