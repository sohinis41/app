package test;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class OpenWebPageInApplet extends Applet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6599123941174310355L;
	Button btngo;
	TextField textUrl;
	
	public void init() {
		textUrl = new TextField("Enter");
		btngo = new Button("Go");
		btngo.setPreferredSize(new Dimension(100,50));
		btngo.setVisible(true);
		btngo.setFocusable(true);
		add(btngo);
		add(textUrl);
		btngo.addActionListener(this);
		this.add(btngo);
		this.setVisible(true);
		this.setSize(new Dimension(100,50));
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btngo) {
			try {
				URL url = new URL("http://"+textUrl.getText()+" ");
				AppletContext context = getAppletContext();
				context.showDocument(url,"_self");
			}
			catch (MalformedURLException mfe) {
				mfe.printStackTrace();
			}
		}
		
	}

}
