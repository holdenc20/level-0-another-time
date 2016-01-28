import javax.swing.JOptionPane;
public class AreYouHappy {
public static void main(String[] args) {
	int q = 0;
	while(q==0){
		String answer1=JOptionPane.showInputDialog("Are You Happy?");
		if(answer1.equalsIgnoreCase("Yes")){ 
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You Are Doing!");
}
		else{
			String answer2=JOptionPane.showInputDialog("Do You Want To Be Happy?");
			if(answer2.equalsIgnoreCase("No")){
			JOptionPane.showMessageDialog(null,"Keep Doing Whatever You Are Doing!");	
			}
			else{
				JOptionPane.showMessageDialog(null, "Change Something!");
			}
}	
}
}
}