package challenge;

import java.lang.Math.*;

public class PrintingBooklet {
	
	public static void main(String[] args){
		int n = 9; //number of pages to print
		
		if(n%4==0){
			String side = "back";
			int pageNum=1;
			int lastIndex = n;
			for(int i=0; i<n/2; i++){
				if(side.equals("back")){
					side = "front";
					int indexToPrint = i+1;
					System.out.println("S"+pageNum+","+side+","+lastIndex+","+indexToPrint);
					lastIndex--;
				}else{
					side = "back";
					int indexToPrint = i+1;
					System.out.println("S"+pageNum+","+side+","+indexToPrint+","+lastIndex);
					lastIndex--;
					pageNum++;
				}
			}
			
		}else{
			String side = "back";
			int pageNum=1;
			int lastIndex = n;
			int l = 0;
			int m=0;
			for(int i=1; i<=25; i++){
				if((4*i)>n){
					l=(4*i)-n;
					m=4*i;
					break;
				}
			}
			int x = 0;
			
			for(int i=0; i<=n; i++){
				if(x==m){
					break;
				}
				if(side.equals("back")){
					side = "front";
					int indexToPrint = i+1;
					if(l>0){
						System.out.println("S"+pageNum+","+side+",blank,"+indexToPrint);
						l--;
						x+=2;
					}else{
						System.out.println("S"+pageNum+","+side+","+lastIndex+","+indexToPrint);
						lastIndex--;
						x+=2;
					}
					
					
				}else{
					side = "back";
					int indexToPrint = i+1;
					if(l>0){
						System.out.println("S"+pageNum+","+side+","+indexToPrint+",blank");
						l--;
						x+=2;
					}else{
						System.out.println("S"+pageNum+","+side+","+indexToPrint+","+lastIndex);
						lastIndex--;
						x+=2;
					}
					
					
					pageNum++;
				}
			}
			
			
			//System.out.println(l);
			
		}
	}
	

}
