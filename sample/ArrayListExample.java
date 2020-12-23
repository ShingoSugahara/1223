package sample;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String>months = new ArrayList<String>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		
		System.out.println("要素数"+months.size());
		for(int i =0; i<months.size();i++) {
			System.out.println(months.get(i));
		}
		
		months.remove(1);
		System.out.println("要素数"+months.size());
		for(int i =0; i<months.size();i++) {
			System.out.println(months.get(i));
		
		}
	}

}
