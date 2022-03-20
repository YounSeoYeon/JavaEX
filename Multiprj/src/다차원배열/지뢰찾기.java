package 다차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 지뢰찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = br.read()-48;
		br.read(); //공백문자
		int m = br.read()-48;
		br.read(); //뉴라인
		
		System.out.printf("%d,%d",n,m);
		
		char[][] board = new char[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				board[i][j] = (char)br.read();
			}
			br.read();
		}
		for(int i=0; i<n; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
		
		int [] di = {-1, -1, 0, 1, 1, 1, 0, -1};
		int [] dj = {0, 1, 1, 1, 0, -1, -1, -1};
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int cun = 0;
				if(board[i][j]!='*') {
					for(int k=0; k<8; k++) {
						int ni = i+di[k];
						int nj = j+dj[k];
						if(ni<n&&nj<m&&n>0&&m>0&&board[i][j]=='*') cun++;
					}
				}
				board[i][j] = (char)(cun+48);
			}
		}
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				int cun = 0;
//				if(board[i][j]!='*') {
//					//인접칸8개에서 지뢰의 갯수 세어주기
//					//위(i-1,j) // i=0이면 위가 없음
//					if(i>0&&board[i-1][j]=='*') cun++;
//					
//					//위오른쪽(i-1,j+1) // 맨오른쪽m일때는 오른쪽이없음
//					if(i>0 && j<m-1 && board[i-1][j+1] =='*') cun++;
//					
//					//오른쪽(i,j+1)
//					if(j<m-1 && board[i][j+1] == '*') cun++;
//					
//					//아래오른쪽(i+1,j+1)
//					if(i<n-1 && j<m-1 && board[i+1][j+1] == '*') cun++;
//					
//					//아래(i+1,j)
//					if(i<n-1&&board[i+1][j] == '*')cun++;
//					
//					//아래왼쪽(i+1,j-1)
//					if(i<n-1&&j>0&&board[i+1][j-1] == '*')cun++;
//					
//					//왼쪽(i,j-1)
//					if(j>0 && board[i][j-1] == '*')cun++;
//					
//					//위왼쪽(i-1,j-1)
//					if(i>0&&j>0&&board[i-1][j-1] == '*')cun++;					
//				}
//				board[i][j] = (char)(cun+48);
//			}
//		}
		
		for(int i=0;i<n; i++) {
			for( char val: board[i] ) {
				System.out.print(val);
		}
			System.out.println();
	}

	}
}
