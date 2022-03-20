package �������迭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ����ã�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = br.read()-48;
		br.read(); //���鹮��
		int m = br.read()-48;
		br.read(); //������
		
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
//					//����ĭ8������ ������ ���� �����ֱ�
//					//��(i-1,j) // i=0�̸� ���� ����
//					if(i>0&&board[i-1][j]=='*') cun++;
//					
//					//��������(i-1,j+1) // �ǿ�����m�϶��� �������̾���
//					if(i>0 && j<m-1 && board[i-1][j+1] =='*') cun++;
//					
//					//������(i,j+1)
//					if(j<m-1 && board[i][j+1] == '*') cun++;
//					
//					//�Ʒ�������(i+1,j+1)
//					if(i<n-1 && j<m-1 && board[i+1][j+1] == '*') cun++;
//					
//					//�Ʒ�(i+1,j)
//					if(i<n-1&&board[i+1][j] == '*')cun++;
//					
//					//�Ʒ�����(i+1,j-1)
//					if(i<n-1&&j>0&&board[i+1][j-1] == '*')cun++;
//					
//					//����(i,j-1)
//					if(j>0 && board[i][j-1] == '*')cun++;
//					
//					//������(i-1,j-1)
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
