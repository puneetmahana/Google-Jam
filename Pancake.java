import java.util.Scanner;

public class Pancake{
 
	static void HappyFace(String s, int flipperLength, int caseNumber){
		char[] charArr = s.toCharArray();
		int k = flipperLength;
		int minFlips =0;
		boolean contains = false;
		int n =charArr.length;
		for(int i=0;i<n;i++){
			if(charArr[i] == '-')
			{   
				
				int incrementor = 0;
				for( int j=i; i+k<=n && incrementor != k; j++)
				{
				  if(charArr[j] == '-')
					  charArr[j] = '+';
				  else
					  charArr[j] = '-';
				  incrementor++;
				}
				minFlips++;
			}
		   		
		}
		for (char c : charArr){ 
		    if (c == '-') {
		        contains = true;
		        System.out.println("Case #"+caseNumber+": "+"IMPOSSIBLE");
				break;
		    }
		}
		if(contains == false)
		    	System.out.println("Case #"+caseNumber+": "+minFlips);
					
	}


public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    String[] s;
    int t = Integer.parseInt(sc.nextLine());
    for(int i=1;i<=t;i++){
      s = sc.nextLine().split(" ");
      int k = Integer.parseInt(s[1]);
    HappyFace(s[0],k,i);
    }
    sc.close();
       
}
}
