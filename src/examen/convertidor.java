
package examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Karla Alejandra Gracia Barajas 
 * Grupo 5IM8 
 * Boleta 2016090272 
 * Turno matutino
 */
public class convertidor extends JFrame implements ActionListener {

    //Se declaran las variables
    private JTextField numero;
    private JLabel titulo;
    private JButton convertir;
    private JButton limpiar;
    private JButton punto;
    private JButton cero;
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;

    /*
    *Se crea el constructor 
    para que inicialice 
    los componentes
    de la ventana
     */
    public convertidor() {
        ventana();
        componentes();
    }

    //Metodo que tien el diseño de la ventana
    public void ventana() {
        this.setTitle("Convertidor");
        this.setSize(500, 700);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Diseño y declaracion de los objetos
    public void componentes() {
        titulo = new JLabel("CONVERTIDOR");
        titulo.setBounds(10, 5, 100, 20); //(X,Y,LARGO,ANCHO)
        add(titulo);

        numero = new JTextField();
        numero.setBounds(10, 40, 300, 50); //(X,Y,LARGO,ANCHO)
        add(numero);
        numero.addActionListener(this);

        convertir = new JButton();
        convertir.setText("convertir");
        convertir.setBounds(280, 100, 150, 50); //(X,Y,LARGO,ANCHO)
        add(convertir);
        convertir.addActionListener(this);

        limpiar = new JButton();
        limpiar.setText("limpiar");
        limpiar.setBounds(280, 160, 150, 50); //(X,Y,LARGO,ANCHO)
        add(limpiar);
        limpiar.addActionListener(this);

        uno = new JButton();
        uno.setText("1");
        uno.setBounds(10, 100, 80, 50); //(X,Y,LARGO,ANCHO)
        add(uno);
        uno.addActionListener(this);

        dos = new JButton();
        dos.setText("2");
        dos.setBounds(100, 100, 80, 50); //(X,Y,LARGO,ANCHO)
        add(dos);
        dos.addActionListener(this);

        tres = new JButton();
        tres.setText("3");
        tres.setBounds(190, 100, 80, 50); //(X,Y,LARGO,ANCHO)
        add(tres);
        tres.addActionListener(this);

        cuatro = new JButton();
        cuatro.setText("4");
        cuatro.setBounds(10, 160, 80, 50); //(X,Y,LARGO,ANCHO)
        add(cuatro);
        cuatro.addActionListener(this);

        cinco = new JButton();
        cinco.setText("5");
        cinco.setBounds(100, 160, 80, 50); //(X,Y,LARGO,ANCHO)
        add(cinco);
        cinco.addActionListener(this);

        seis = new JButton();
        seis.setText("6");
        seis.setBounds(190, 160, 80, 50); //(X,Y,LARGO,ANCHO)
        add(seis);
        seis.addActionListener(this);

        siete = new JButton();
        siete.setText("7");
        siete.setBounds(10, 220, 80, 50); //(X,Y,LARGO,ANCHO)
        add(siete);
        siete.addActionListener(this);

        ocho = new JButton();
        ocho.setText("8");
        ocho.setBounds(100, 220, 80, 50); //(X,Y,LARGO,ANCHO)
        add(ocho);
        ocho.addActionListener(this);

        nueve = new JButton();
        nueve.setText("9");
        nueve.setBounds(190, 220, 80, 50); //(X,Y,LARGO,ANCHO)
        add(nueve);
        nueve.addActionListener(this);

        cero = new JButton();
        cero.setText("0");
        cero.setBounds(10, 280, 80, 50); //(X,Y,LARGO,ANCHO)
        add(cero);
        cero.addActionListener(this);

        punto = new JButton();
        punto.setText(".");
        punto.setBounds(100, 280, 80, 50); //(X,Y,LARGO,ANCHO)
        add(punto);
        punto.addActionListener(this);
    }

    //Metodo abstracto
    @Override
    public void actionPerformed(ActionEvent e) {

        //Instrucciones que mandan el dato de los botones al cuadro de texto
        if (e.getSource() == uno) {
            String textnum = numero.getText();
            numero.setText(textnum + "1");
        }
        if (e.getSource() == dos) {
            String textnum = numero.getText();
            numero.setText(textnum + "2");
        }
        if (e.getSource() == tres) {
            String textnum = numero.getText();
            numero.setText(textnum + "3");
        }
        if (e.getSource() == cuatro) {
            String textnum = numero.getText();
            numero.setText(textnum + "4");
        }

        if (e.getSource() == cinco) {
            String textnum = numero.getText();
            numero.setText(textnum + "5");
        }

        if (e.getSource() == seis) {
            String textnum = numero.getText();
            numero.setText(textnum + "6");
        }
        if (e.getSource() == siete) {
            String textnum = numero.getText();
            numero.setText(textnum + "7");
        }

        if (e.getSource() == ocho) {
            String textnum = numero.getText();
            numero.setText(textnum + "8");
        }

        if (e.getSource() == nueve) {
            String textnum = numero.getText();
            numero.setText(textnum + "9");
        }

        if (e.getSource() == cero) {
            String textnum = numero.getText();
            numero.setText(textnum + "0");
        }

        if (e.getSource() == punto) {
            String textnum = numero.getText();
            numero.setText(textnum + ".");
        }

        //********************************
        /*Instruccion que hace la conversion si se hace clic en el boton convertir, 
        convierte el texto a flotante y hace la operacion y 
        posteriormente lo manda al cuadro de texto el resultado.*/
        if (e.getSource() == convertir) {
            String textnum = numero.getText();
            float num = Float.parseFloat(textnum);
            float resultado = (num / 17);
            String resultadotexto = String.valueOf(resultado);
            numero.setText(resultadotexto);
        }
        //Limpia el cuadro de texto para ingresar más numeros
        if (e.getSource() == limpiar) {
            numero.setText("");
        }
    }

}
