package test3_p38;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample19 {
	public static void main(String[] args) throws IOException {
		System.out.println("請輸入字串");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String str = br1.readLine();
		
		System.out.println("請輸入要檢索的文字");
		String str2 = br1.readLine();
		char ch = str2.charAt(0);
		
		int num =str.indexOf(ch);
		
		if(num!=-1)
			System.out.println(str+"的第"+(num+1)+"個字就是「"+ch+"」");
		else
			System.out.println(str+"中沒有「" + ch+"」這個字");
		
	}
}
