package poly.kansai.enshu;
import java.util.ArrayList;
import java.util.Scanner;

public class EnhanceFor {


		int sumResult(ArrayList<Integer> scores) {
			int sum =0;
			for(int t:scores) {
				sum += t;

			}
			return sum;
		}

		double aveResult(int sum,ArrayList<Integer> scores) {
			double ave = 0;
			if(0<scores.size()) {
				ave =(double)sum/scores.size();
			}else {

			}

			return ave;
		}


		int maxResult(ArrayList<Integer> scores) {
			int max=0;
			if(scores.size()>0) {
				max=scores.get(0);
			}

			for(int t:scores) {
				if(max<=t) {
					max=t;
				}
			}
			return max;
		}

		void showResult(int sum,double ave,int max) {
			System.out.println("合計は"+sum);
			System.out.println("平均は"+ave);
			System.out.println("最大値は"+max);
		}


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


public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	ArrayList<Integer> scores = new ArrayList<>();
	EnhanceFor arr = new EnhanceFor();
	try {
		scores = arr.scoresImput();
		arr.print(scores);
		int sum =arr.sumResult(scores);
		double ave =arr.aveResult(sum,scores);
		int max =arr.maxResult(scores);
		arr.showResult(sum,ave,max);

	} catch (MyException e) {
		System.out.println("例外をキャッチしました");
		System.out.println(e);

	}

}
}