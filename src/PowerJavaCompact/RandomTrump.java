package PowerJavaCompact;

public class RandomTrump {

	public static void main(String[] args) {
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen","King", "Ace"};
		int[][] check = new int[4][13];
		int count = 0;
		
		//무작위 카드를 선택
		while(count < 5) {
			//3, 12가 맞지만 확률상 4, 13으로 작성
			int x = (int)(Math.random()*4), y = (int)(Math.random()*13);
			if (check[x][y] != 0)
				continue;
			System.out.println(suit[x] + "의  " + number[y]);
			check[x][y] = 1;
			count++;
		}
	}

}
