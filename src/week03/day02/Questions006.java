package week03.day02;


//6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti 4 sayısının adetinden büyükse true değilse false yazdıralım.
//   -> 1,4,5,6,1,1,4,8
public class Questions006 {
	public static void main(String[] args) {
		
		int[] numbers = {1,4,5,6,4,4,4,8};
		int count1=0,count4=0;
		/**for (int kackere:numbers){
			if (kackere==1){
				count1++;
			}
			else if (kackere==4) {
				count4++;
			}
		}
		
		if (count1 > count4) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}*/
		
		boolean isOneCountMore;
		for (int kackere:numbers){
			if (kackere==1){
				count1++;
			}
			else if (kackere==4) {
				count4++;
			}
		}
		isOneCountMore=count1>count4;
		System.out.println(isOneCountMore);
	}
}