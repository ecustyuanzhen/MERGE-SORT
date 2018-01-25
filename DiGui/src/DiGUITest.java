import java.util.Random;




public class DiGUITest {

	/**
	 * @param args
	 */
	public static int[] aux;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		DiGUITest diGUITest = new DiGUITest();
		int[] comparables = new int[30];
		for(int i=0;i<30;i++){
			comparables[i] = random.nextInt(100);
		}
		for (int i=0;i<30;i++) {
			System.out.print(comparables[i]+",");
		}
		aux = new int[comparables.length];
		System.out.println();
		diGUITest.sort(comparables,0, comparables.length-1);
		for (int i=0;i<30;i++) {
			System.out.print(comparables[i]+",");
		}
		for (int i : comparables) {			
			//System.out.print(comparables[i]);
		}
	}
	public void sort(int[] a,int first,int last) {
		if (first>=last) {
			return;
		}
		int mid = first+(last-first)/2;
		sort(a,first, mid);
		sort(a,mid+1, last);
		mergesort(a,first,mid,last);
	}
	private void mergesort(int[] a,int first, int mid, int last) {
		// TODO Auto-generated method stub
		int i = first;
		int j = mid+1;
		for(int i1=first;i1<=last;i1++){
			aux[i1] = a[i1];
			//System.out.print(aux[i1]+",");
		}
		for(int i1=first;i1<=last;i1++){
			if(i>mid){
				a[i1] = aux[j++];
			}else if(j>last){
				a[i1] = aux[i++];
			}else if(aux[i]<=aux[j]){
				a[i1] = aux[i++];
			}else {
				a[i1] = aux[j++];
			} 
		}
	}
	

}
