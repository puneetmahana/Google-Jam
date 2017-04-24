import java.util.Scanner;

public class TidyNumbers {

	static void Tidy(String s, int caseNumber){
	char[] charArr = s.toCharArray();
	int n = charArr.length;
	boolean bool=false;
	for(int i=n-1;i>0;i--){
		if(charArr[i]<charArr[i-1]){
			charArr[i] = '9';
			charArr[i-1] = (char)(charArr[i-1]-1);
		}
	}
	for(int j =0; j<n-1;j++){
		if(charArr[j]>charArr[j+1])
			charArr[j+1] = '9';
	}
	StringBuilder sb = new StringBuilder();
	String output = sb.append(charArr).toString();
	String result = output.replaceAll("^0*", "");
	System.out.println("Case #"+caseNumber+": "+result);
	
	}
	public static void main(String[] args){
     	Scanner sc = new Scanner(System.in);
     	String s;
     	int t = Integer.parseInt(sc.nextLine());
	    for(int i=1;i<=t;i++){
     	s = sc.nextLine();
	    Tidy(s,i);
	    }
	    
}
}
