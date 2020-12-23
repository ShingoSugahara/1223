package poly.kansai.enshu;
import java.util.ArrayList;
import java.util.Scanner;

		class MyException extends Exception{
				MyException(String message){
				super(message);
				}
		}


			public class ArrayListScanner {
//0~100までの数字を入力し、-1が入力されたら入力を終了し、それまでの入力を表示する
	//※－2以下、101以上の数は最後に表示せず、文字列は例外処理を用いて入力を終了させる。

			void print(ArrayList<Integer> scores) {

				System.out.println("要素数"+scores.size());
				for(int i =0; i<scores.size();i++) {
					System.out.println(scores.get(i));
					}
				}


	 ArrayList<Integer> scoresImput()throws MyException {
			ArrayList<Integer> scores = new ArrayList<>();
			int imput =0;
		Scanner scan = new Scanner(System.in);
		while(true) {

			System.out.print("数字を入力してください:");
			if(scan.hasNextInt()) {
			imput = scan.nextInt();
			}else {
			
				System.out.println("終了です");
				throw new MyException("文字を入力しないでください");
				
			}
			//throw new MyException("文字を入力しないでください");

			if(imput==-1) {
				break;
			}else if(0<=imput&&imput<=100){
				scores.add(imput);
			}else if(imput<0||imput>100) {
				System.out.println("0～100までの値を入力してください");

			}	else {

			}
			
		}
		return scores;
	}


	public static void main(String[] args)  {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> scores = new ArrayList<>();
		ArrayListScanner arr = new ArrayListScanner();
		try {
		scores = arr.scoresImput();
		arr.print(scores);
		}
		catch(MyException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e);
			
		}



	}



}
