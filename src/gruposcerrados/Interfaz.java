package gruposcerrados;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Interfaz extends JFrame implements ActionListener
{
    private JLabel labelLogo;
    private JLabel labelTitulo;
 
    private JLabel labelNodo1;
    private JLabel labelMsgNodo1;
    private JTextField campoParaNodo1;
    private JLabel labelParaNodo1;
    private JTextField campoNodoM1;
    private JTextArea areaNodoG1;
    private JScrollPane scrollNodoG1;
    private JButton botonUnirseNodo1;
    private JButton botonEnviarNodo1;
    
    private JLabel labelNodo2;
    private JTextField campoNodoM2;
    private JLabel labelParaNodo2;
    private JTextArea areaNodoG2;
    private JScrollPane scrollNodoG2;
    private JButton botonUnirseNodo2;
    private JButton botonEnviarNodo2;
    private JLabel labelMsgNodo2;
    private JTextField campoParaNodo2;
    
    private JLabel labelNodo3;
    private JTextField campoNodoM3;
    private JLabel labelParaNodo3;
    private JTextArea areaNodoG3;
    private JScrollPane scrollNodoG3;
    private JButton botonUnirseNodo3;
    private JButton botonEnviarNodo3;
    private JLabel labelMsgNodo3;
    private JTextField campoParaNodo3;
    
    private JLabel labelNodo4;
    private JTextField campoNodoM4;
    private JLabel labelParaNodo4;
    private JTextArea areaNodoG4;
    private JScrollPane scrollNodoG4;
    private JButton botonUnirseNodo4;
    private JButton botonEnviarNodo4;
    private JLabel labelMsgNodo4;
    private JTextField campoParaNodo4;
    
    private JLabel labelGrupo;
    private JTextArea areaGrupo;
    private JScrollPane scrollGrupo;
    private JLabel labelErrorGrupo;
    
    private Nodo nodo1;
    private Nodo nodo2;
    private Nodo nodo3;
    private Nodo nodo4;
    private ArrayList<Nodo> nodos;
    private Grupo grupoNodos;
    
    public Interfaz()
    {
        setLayout(null);
        setSize(1200,550);
        this.setLocationRelativeTo(null);
        setTitle("Grupos Cerrados");
        

        this.labelLogo=new JLabel();
        this.labelLogo.setSize(80, 80);
        this.labelLogo.setBounds(10, 10, 120, 120);
        ImageIcon logo = new javax.swing.ImageIcon("src/img/upiizLogo.png");
        Icon icono=new ImageIcon(logo.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
        this.labelLogo.setIcon(icono);
        add(this.labelLogo);

        //----------------------------------
        this.labelTitulo=new JLabel("Grupo Cerrado");
        this.labelTitulo.setFont(new java.awt.Font("", 0, 36)); 
        this.labelTitulo.setBounds(500, 30, 300, 40);
        this.labelTitulo.setForeground(new Color(110,19,18)); 
        add(this.labelTitulo);

        //--------------------NODOS
        this.labelNodo1=new JLabel();
        this.labelNodo1.setBounds(10, 150, 50, 30);
        add(this.labelNodo1);

        this.botonUnirseNodo1=new JButton("Unirse");
        this.botonUnirseNodo1.setBounds(110, 150, 100, 30);
        this.botonUnirseNodo1.addActionListener(this);
        add(this.botonUnirseNodo1);

        this.labelMsgNodo1=new JLabel("Msg");
        this.labelMsgNodo1.setBounds(10, 190, 50, 30);
        add(this.labelMsgNodo1);

        this.campoNodoM1=new JTextField();
        this.campoNodoM1.setBounds(60, 190, 150, 30);
        add(this.campoNodoM1);

        this.labelParaNodo1=new JLabel("Para");
        this.labelParaNodo1.setBounds(10, 230, 50, 30);
        add(this.labelParaNodo1);

        this.campoParaNodo1=new JTextField();
        this.campoParaNodo1.setBounds(60, 230, 150, 30);
        add(this.campoParaNodo1);

        this.botonEnviarNodo1=new JButton("Enviar");
        this.botonEnviarNodo1.setBounds(10, 270, 200, 30);
        this.botonEnviarNodo1.addActionListener(this);
        add(this.botonEnviarNodo1);

        this.areaNodoG1= new JTextArea();
        this.scrollNodoG1 = new JScrollPane(areaNodoG1);
        this.scrollNodoG1.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG1.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG1.setBounds(10, 320, 200, 150);
        this.areaNodoG1.setEditable(false);
        add(this.scrollNodoG1);

        //--------------NODO 2
        this.labelNodo2=new JLabel();
        this.labelNodo2.setBounds(240, 150, 50, 30);
        add(this.labelNodo2);

        this.botonUnirseNodo2=new JButton("Unirse");
        this.botonUnirseNodo2.setBounds(340, 150, 100, 30);
        this.botonUnirseNodo2.addActionListener(this);
        add(this.botonUnirseNodo2);

        this.labelMsgNodo2=new JLabel("Msg");
        this.labelMsgNodo2.setBounds(240, 190, 50, 30);
        add(this.labelMsgNodo2);

        this.campoNodoM2=new JTextField();
        this.campoNodoM2.setBounds(290, 190, 150, 30);
        add(this.campoNodoM2);

        this.labelParaNodo2=new JLabel("Para");
        this.labelParaNodo2.setBounds(240, 230, 50, 30);
        add(this.labelParaNodo2);

        this.campoParaNodo2=new JTextField();
        this.campoParaNodo2.setBounds(290, 230, 150, 30);
        add(this.campoParaNodo2);

        this.botonEnviarNodo2=new JButton("Enviar");
        this.botonEnviarNodo2.setBounds(240, 270, 200, 30);
        this.botonEnviarNodo2.addActionListener(this);
        add(this.botonEnviarNodo2);

        this.areaNodoG2= new JTextArea();
        this.scrollNodoG2 = new JScrollPane(areaNodoG2);
        this.scrollNodoG2.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG2.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG2.setBounds(240, 320, 200, 150);
        this.areaNodoG2.setEditable(false);
        add(this.scrollNodoG2);
        //----------Nodo 3
        this.labelNodo3=new JLabel();
        this.labelNodo3.setBounds(470, 150, 50, 30);
        add(this.labelNodo3);

         this.botonUnirseNodo3=new JButton("Unirse");
        this.botonUnirseNodo3.setBounds(570, 150, 100, 30);
        this.botonUnirseNodo3.addActionListener(this);
        add(this.botonUnirseNodo3);

        this.labelMsgNodo3=new JLabel("Msg");
        this.labelMsgNodo3.setBounds(470, 190, 50, 30);
        add(this.labelMsgNodo3);

        this.campoNodoM3=new JTextField();
        this.campoNodoM3.setBounds(520, 190, 150, 30);
        add(this.campoNodoM3);

        this.labelParaNodo3=new JLabel("Para");
        this.labelParaNodo3.setBounds(470, 230, 50, 30);
        add(this.labelParaNodo3);

        this.campoParaNodo3=new JTextField();
        this.campoParaNodo3.setBounds(520, 230, 150, 30);
        add(this.campoParaNodo3);

        this.botonEnviarNodo3=new JButton("Enviar");
        this.botonEnviarNodo3.setBounds(470, 270, 200, 30);
        this.botonEnviarNodo3.addActionListener(this);
        add(this.botonEnviarNodo3);

        this.areaNodoG3= new JTextArea();
        this.scrollNodoG3 = new JScrollPane(areaNodoG3);
        this.scrollNodoG3.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG3.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG3.setBounds(470, 320, 200, 150);
        this.areaNodoG3.setEditable(false);
        add(this.scrollNodoG3);

        //--------Nodo 4
        this.labelNodo4=new JLabel();
        this.labelNodo4.setBounds(700, 150, 50, 30);
        add(this.labelNodo4);

         this.botonUnirseNodo4=new JButton("Unirse");
        this.botonUnirseNodo4.setBounds(800, 150, 100, 30);
        this.botonUnirseNodo4.addActionListener(this);
        add(this.botonUnirseNodo4);

        this.labelMsgNodo4=new JLabel("Msg");
        this.labelMsgNodo4.setBounds(700, 190, 50, 30);
        add(this.labelMsgNodo4);

        this.campoNodoM4=new JTextField();
        this.campoNodoM4.setBounds(750, 190, 150, 30);
        add(this.campoNodoM4);

        this.labelParaNodo4=new JLabel("Para");
        this.labelParaNodo4.setBounds(700, 230, 50, 30);
        add(this.labelParaNodo4);

        this.campoParaNodo4=new JTextField();
        this.campoParaNodo4.setBounds(750, 230, 150, 30);
        add(this.campoParaNodo4);

        this.botonEnviarNodo4=new JButton("Enviar");
        this.botonEnviarNodo4.setBounds(700, 270, 200, 30);
        this.botonEnviarNodo4.addActionListener(this);
        add(this.botonEnviarNodo4);

        this.areaNodoG4= new JTextArea();
        this.scrollNodoG4 = new JScrollPane(areaNodoG4);
        this.scrollNodoG4.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG4.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.scrollNodoG4.setBounds(700, 320, 200, 150);
        this.areaNodoG4.setEditable(false);
        add(this.scrollNodoG4);

        //----Chat Grupal
        this.labelGrupo=new JLabel("Grupo");
        this.labelGrupo.setBounds(1000, 100, 200, 30);
        add(this.labelGrupo);

        this.areaGrupo= new JTextArea();
        this.scrollGrupo = new JScrollPane(areaGrupo);
        this.scrollGrupo.setHorizontalScrollBarPolicy (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.scrollGrupo.setVerticalScrollBarPolicy (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.scrollGrupo.setBounds(950, 140, 200, 300);
        this.areaGrupo.setEditable(false);
        add(this.scrollGrupo);

        this.labelErrorGrupo=new JLabel("");
        this.labelErrorGrupo.setBounds(1000, 450, 200, 30);
        add(this.labelErrorGrupo);

        this.nodo1=new Nodo("Alexyz");
        this.labelNodo1.setText("Alexyz");
        this.nodo2=new Nodo("Chuy");
        this.labelNodo2.setText("Chuy");
        this.nodo3=new Nodo("Gamez");
        this.labelNodo3.setText("Gamez");
        this.nodo4=new Nodo("Cesar");
        this.labelNodo4.setText("Cesar");

        this.nodos=new ArrayList();
        this.nodos.add(nodo1);
        this.nodos.add(nodo2);
        this.nodos.add(nodo3);
        this.nodos.add(nodo4);
        this.grupoNodos=new Grupo();

        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==this.botonUnirseNodo1)
        {
            this.grupoNodos.agregarNodo(nodo1);
            this.botonUnirseNodo1.setEnabled(false);
        }
        
        if(e.getSource()==this.botonUnirseNodo2)
        {
            this.grupoNodos.agregarNodo(nodo2);
            this.botonUnirseNodo2.setEnabled(false);
        }
         
        if(e.getSource()==this.botonUnirseNodo3)
        {
            this.grupoNodos.agregarNodo(nodo3);
            this.botonUnirseNodo3.setEnabled(false);
        }
        
        if(e.getSource()==this.botonUnirseNodo4)
        {
            this.grupoNodos.agregarNodo(nodo4);
            this.botonUnirseNodo4.setEnabled(false);
        }
        //-----------------------------Enviar Nodo 1
        if(e.getSource()==this.botonEnviarNodo1)
        {
            Nodo destinatario=this.nodo1.elegirDestinatario(this.campoParaNodo1.getText(), nodos);
            
            if(this.campoParaNodo1.getText().equals("Grupo"))
            {
                if(this.grupoNodos.existe(this.nodo1))
                {
                    this.nodo1.enviarMensajeGrupal(this.campoNodoM1.getText(), nodo1, grupoNodos);
                    this.labelErrorGrupo.setText("Mensaje Enviado");
                }
                else
                {
                    this.labelErrorGrupo.setText("No estas en el grupo");
                }
                
            }
            else if(destinatario!=null)
            {
                this.nodo1.enviarMensajeParticular(this.campoNodoM1.getText(), nodo1, destinatario);
                this.labelErrorGrupo.setText("Mensaje Enviado");
            }
            else
            {
                this.labelErrorGrupo.setText("El destinatario no existe");
            }
            
            this.campoNodoM1.setText("");
            this.campoParaNodo1.setText("");
        }
        //---------------Enviar Nodo 2
         if(e.getSource()==this.botonEnviarNodo2)
        {
            Nodo destinatario=this.nodo1.elegirDestinatario(this.campoParaNodo2.getText(), nodos);
            
            if(this.campoParaNodo2.getText().equals("Grupo"))
            {
                if(this.grupoNodos.existe(this.nodo2))
                {
                    this.nodo2.enviarMensajeGrupal(this.campoNodoM2.getText(), nodo2, grupoNodos);
                    this.labelErrorGrupo.setText("Mensaje Enviado");
                }
                else
                {
                    this.labelErrorGrupo.setText("No estas en el grupo");
                }
                
            }
            else if(destinatario!=null)
            {
                this.nodo2.enviarMensajeParticular(this.campoNodoM2.getText(), nodo2, destinatario);
                this.labelErrorGrupo.setText("Mensaje Enviado");
            }
            else
            {
                this.labelErrorGrupo.setText("El destinatario no existe");
            }
            this.campoNodoM2.setText("");
            this.campoParaNodo2.setText("");
        }
             //---------------Enviar Nodo 3
         if(e.getSource()==this.botonEnviarNodo3)
        {
            Nodo destinatario=this.nodo3.elegirDestinatario(this.campoParaNodo3.getText(), nodos);
            
            if(this.campoParaNodo3.getText().equals("Grupo"))
            {
                if(this.grupoNodos.existe(this.nodo3))
                {
                    this.nodo3.enviarMensajeGrupal(this.campoNodoM3.getText(), nodo3, grupoNodos);
                    this.labelErrorGrupo.setText("Mensaje Enviado");
                }
                else
                {
                    this.labelErrorGrupo.setText("No estas en el grupo");
                }
                
            }
            else if(destinatario!=null)
            {
                this.nodo3.enviarMensajeParticular(this.campoNodoM3.getText(), nodo3, destinatario);
                this.labelErrorGrupo.setText("Mensaje Enviado");
            }
            else
            {
                this.labelErrorGrupo.setText("El destinatario no existe");
            }
            this.campoNodoM3.setText("");
            this.campoParaNodo3.setText("");
        }
             //---------------Enviar Nodo 4
         if(e.getSource()==this.botonEnviarNodo4)
        {
            Nodo destinatario=this.nodo1.elegirDestinatario(this.campoParaNodo4.getText(), nodos);
            
            if(this.campoParaNodo4.getText().equals("Grupo"))
            {
                if(this.grupoNodos.existe(this.nodo4))
                {
                    this.nodo4.enviarMensajeGrupal(this.campoNodoM4.getText(), nodo4, grupoNodos);
                    this.labelErrorGrupo.setText("Mensaje Enviado");
                }
                else
                {
                    this.labelErrorGrupo.setText("No estas en el grupo");
                }
                
            }
            else if(destinatario!=null)
            {
                this.nodo4.enviarMensajeParticular(this.campoNodoM4.getText(), nodo4, destinatario);
                this.labelErrorGrupo.setText("Mensaje Enviado");
            }
            else
            {
                this.labelErrorGrupo.setText("El destinatario no existe");
            }
            this.campoNodoM4.setText("");
            this.campoParaNodo4.setText("");
        }
        this.areaNodoG1.setText(this.nodo1.getConversacion());
        this.areaNodoG2.setText(this.nodo2.getConversacion());
        this.areaNodoG3.setText(this.nodo3.getConversacion());
        this.areaNodoG4.setText(this.nodo4.getConversacion());
        this.areaGrupo.setText(this.grupoNodos.getConversacion());
    }
}
