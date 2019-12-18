import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evt) {
		Double x;
		
		String deLa= (String) ConvertorView.DeLa.getSelectedItem();
		String panaLa= (String) ConvertorView.La.getSelectedItem();
		if(deLa=="EURO" && panaLa=="RON")
		{
			x=Double.parseDouble(ConvertorView.Input.getText());
			x=x*4.4693;
			String y=String.format("%.4f", x);
			ConvertorView.Output.setText(y);
		} 
		else if(deLa=="RON" && panaLa=="EURO")
		{
			x=Double.parseDouble(ConvertorView.Input.getText());
			x=x/4.4693;
			String y=String.format("%.4f", x);
			ConvertorView.Output.setText(y);
			
		}
		else if(deLa=="RON" && panaLa=="USD")
		{
			x=Double.parseDouble(ConvertorView.Input.getText());
			x=x/4.31;
			String y=String.format("%.4f", x);
			ConvertorView.Output.setText(y);
		}
		else if(deLa=="USD" && panaLa=="RON")
		{
			x=Double.parseDouble(ConvertorView.Input.getText());
			x=x*4.31;
			String y=String.format("%.4f", x);
			ConvertorView.Output.setText(y);
		}
		else if(deLa=="USD" && panaLa=="EURO")
		{
			x=Double.parseDouble(ConvertorView.Input.getText());
			x=x*0.9;
			String y=String.format("%.4f", x);
			ConvertorView.Output.setText(y);
		}
		else if(deLa=="EURO" && panaLa=="USD")
		{
			x=Double.parseDouble(ConvertorView.Input.getText());
			x=x/0.9;
			String y=String.format("%.4f", x);
			ConvertorView.Output.setText(y);
		}
		
	}
	

}
