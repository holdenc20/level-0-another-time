import java.util.Random;
import javax.swing.JOptionPane;
public class lottery {
public static void main(String[] args) {
	while(1==1){
	int x=new Random().nextInt(50);
	x=x+1;
	JOptionPane.showMessageDialog(null, "Your number is "+x);
	int s=new Random().nextInt(50);
	s=s+1;
	JOptionPane.showMessageDialog(null, "The final number is "+s);
	if (x==s){
		JOptionPane.showMessageDialog(null, "You win with the number "+s);
		
	}
	else{
		JOptionPane.showMessageDialog(null, "You do not win");
	}
}
}
}