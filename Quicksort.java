public class Quicksort{
	// campos
	public int[] a;

	// constructor
	public Quicksort(int n){
		a = new int[n];
		fill();
	}
	public void start(){
		qSort(0, (a.length-1));
	}
	public void qSort(int p, int r){
		int q;

		if(p<r){
			q = partition(p, r);
			qSort(p, q-1);
			qSort((q+1), r);
		}

	}
	public void insertionSort(){
		int n, j, key;
		n = a.length;
		for (int i=1; i<n; i++) {
			key = a[i];
			j = i - 1;
			while(j>=0 && (a[j]>key)){
				a[j+1] = a[j];
				j = j - 1;
			}
			a[j+1] = key;
		}
		
		
	}
	void insertionSort2(){
		int n, j, key;
		int size = a.length;
		n = size;
		for (int i=1; i<n; i++){
			key = a[i];
			j = i - 1;
			if(j>=0 && (a[j]>key)){
				for (int z=0; z<1; z++){
					if(j<0 || a[j]<= key){
						break;
					}
					a[j+1] = a[j];
					j = j - 1;
					z = z - 1 ;
				}
			}
			a[j+1] = key;
		}	
	}
	public int partition(int p, int r){
		int x, i, j, aux;
		x = a[p];
		i = p;
		j = r + 1;
		while (i<j) {
			j = j - 1;
			while (a[j] <= x){
				j = j -1;
			}
			i = i + 1;
			while(a[i]>= x){
				i = i + 1;
			}
			if(i<j){
				aux = a[i];
				a[i] = a[j];
				a[j] = aux;
			} else {
				return j;
			}
		}
		return j;
	}
	public void fill(){
		for (int i=0; i<a.length; i++) {
			a[i] = a.length-i;
		}
	}
	public String toString(){
		String str = "";
		for (int i=0; i<a.length; i++) {
			str = str + a[i] +" ";
		}
		return str;
	}
	public static void main(String[] args) {
		Quicksort hola = new Quicksort(10);
		
		System.out.println("sin sort");
		System.out.println(hola);

		hola.insertionSort2();
		System.out.println("con sort");
		System.out.println(hola);
	}
}