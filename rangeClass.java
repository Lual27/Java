class rangeClass{
	int[] makeRange(int lower, int upper){
		int arr[] = new int[ (upper - lower) + 1];

		for (int i = 0; i < arr.length; i++){
			arr[i] = lower++;
			}
			return arr;
		}

		public static void main (String [] args){
			int theArray[];
			rangeClass theRange = new rangeClass();

			theArray = theRange.makeRange(1,10);
			System.out.print("The array: [ " );
			for (int i = 0; i < theArray.length; i++){
				System.out.print(theArray[i] + " ");
				}
				System.out.println("]");
			}
		}
