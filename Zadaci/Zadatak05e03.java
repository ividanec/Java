package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	// program učitava od korisnika dva cijela broja
	// te ispisuje sve parne brojeve između njih
	
	// ulaz x=4, y=8     izlaz: 4,6,8
	// ulaz x=5, y=8     izlaz: 6,8
	// ulaz x=8, y=4     izlaz: 8,6,4
	// ulaz x=9, y=3     izlaz: 8,6,4,2    
	
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj:"));
		
		
		
		if(x<y) {
			for(int i=x;i<=y;i++) {
				if(i%2==0) {
					System.out.println(""+i);
				}
				
			}
		}else if(x>y){
			
			for(int i=x;i>=y;i--) {
				if(i%2==0) {
					System.out.println("" +i);
				}
			}
		}
		
			
}
}
