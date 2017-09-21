import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import layout.TableLayout;

public class Janela extends JFrame implements ActionListener{
	
	JLabel lbl;
	JComboBox cmbPortas;
	JComboBox cmbVelocidades;
	JComboBox cmbDataBits;
	JCheckBox chkControle;
	JRadioButton par;
	JRadioButton impar;
	ButtonGroup bg;
	JPanel pnl;
	JPanel entradaPanel;
	JPanel pnl2;
	JTextField txtEntrada;
	JButton btn;
	
	String [] portas = {"COM1", "COM2", "COM3"};
	String [] velocidades = {"9600", "4800", "2400"};
	String [] bits = {"8", "4", "2"};
 
	
	public Janela(){
		createJanela();
	}
	
	public void createJanela(){
		
		setTitle("Configaração Porta Série");
		setPreferredSize(new Dimension(500, 360));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		double size [][] = {{20, 80, 170, 205},
				{20, 20, 10, 20, 10, 20, 10, 30, 10, 15, 15, 70, 20, 30}};
		setLayout(new TableLayout(size));
		
		
		lbl = new JLabel ("Porta: ");
		add(lbl, "1,1");
		
		cmbPortas = new JComboBox(portas);
		cmbPortas.setActionCommand("PORTA");
		cmbPortas.setSelectedIndex(0);
		cmbPortas.addActionListener(this);
		add(cmbPortas, "2,1");
		
		lbl = new JLabel ("Velocidade: ");
		add(lbl, "1,3");
		
		cmbVelocidades = new JComboBox(velocidades);
		cmbPortas.setActionCommand("PORTAS");
		cmbPortas.setSelectedIndex(0);
		cmbPortas.addActionListener(this);
		add(cmbVelocidades, "2,3");
		
		lbl = new JLabel("Data Bits: ");
		add(lbl, "1,5");
		
		cmbDataBits = new JComboBox(bits);
		cmbDataBits.setActionCommand("DATA BITS");
		cmbDataBits.setSelectedIndex(0);
		cmbDataBits.addActionListener(this);
		add(cmbDataBits, "2,5");
		
		
		lbl = new JLabel("Paridade: ");
		add(lbl, "1,7");
		
		par = new JRadioButton("Par");
		par.setActionCommand("PAR");
		par.setSelected(true);
		
		impar = new JRadioButton("Impar");
		impar.setActionCommand("IMPAR");
		
		bg = new ButtonGroup();
		bg.add(par);
		bg.add(impar);

		par.addActionListener(this);
		impar.addActionListener(this);
		
		pnl = new JPanel(new GridLayout(1,1));
		pnl.add(par);
		pnl.add(impar);
		
		add(pnl, "2,7");
		
		
		lbl = new JLabel ("Controle: ");
		add(lbl, "1,9");
		
		chkControle = new JCheckBox();
		chkControle.addActionListener(this);
		
		add(chkControle, "2,9");
		
		
		entradaPanel = new JPanel(new GridLayout(0,1));
		txtEntrada = new JTextField();
		
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED); 
	    TitledBorder title = BorderFactory.createTitledBorder(loweredetched, "Entrada");  
	    title.setTitleJustification(TitledBorder.LEFT);  
	    entradaPanel.setBorder(title);
	    entradaPanel.add(txtEntrada);
	   
	    add(entradaPanel, "1, 11, 3");
	    
	    pnl2 = new JPanel();
	    
	    btn = new JButton("Testar");
	    btn.setActionCommand("TESTAR");
	    btn.addActionListener(this);
	    
	    btn = new JButton("Aplicar");
	    btn.setActionCommand("APLICAR");
	    btn.addActionListener(this);
	    
	    btn = new JButton("imprimir");
	    btn.setActionCommand("IMPRIMIR");
	    btn.addActionListener(this);
	    
	    pnl2.add(btn);
	    add(btn, "3, 13");
		
	
		
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
}
