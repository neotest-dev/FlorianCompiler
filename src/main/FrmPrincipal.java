/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import lexer.Lexer;
import lexer.Tokens;
import parser.Sintax;

/**
 *
 * @author noefl
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Paquete:
                    resultado += "  <Reservada paquete>\t" + lexer.lexeme + "\n";
                    break;
                case Publico:
                    resultado += "  <Reservada publico>\t" + lexer.lexeme + "\n";
                    break;
                case Clase:
                    resultado += "  <Reservada clase>\t" + lexer.lexeme + "\n";
                    break;
                case Static:
                    resultado += "  <Reservada static>\t" + lexer.lexeme + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada void>\t" + lexer.lexeme + "\n";
                    break;
                case Args:
                    resultado += "  <Reservada args>\t" + lexer.lexeme + "\n";
                    break;
                case SYSTEM:
                    resultado += "  <Reservada System>\t" + lexer.lexeme + "\n";
                    break;
                case Signo_punto:
                    resultado += "  <Signo - Punto>\t" + lexer.lexeme + "\n";
                    break;
                case Out:
                    resultado += "  <Reservada out>\t" + lexer.lexeme + "\n";
                    break;
                case Imprimir:
                    resultado += "  <Reservada imprimir>\t" + lexer.lexeme + "\n";
                    break;
                case P_dos:
                    resultado += "  <Dos - Puntos>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarSeman = new javax.swing.JTextArea();
        btnAnalizarLex = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnSemantica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAnalizarSin = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnInfo1 = new javax.swing.JButton();
        btnInfo2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txt.png"))); // NOI18N
        btnArchivo.setText("Abrir txt");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        txtAnalizarSeman.setEditable(false);
        txtAnalizarSeman.setColumns(20);
        txtAnalizarSeman.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarSeman);

        btnAnalizarLex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarLex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compilador.png"))); // NOI18N
        btnAnalizarLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexActionPerformed(evt);
            }
        });

        txtAnalizarLex.setEditable(false);
        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane4.setViewportView(txtAnalizarLex);

        btnSemantica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSemantica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compilador.png"))); // NOI18N
        btnSemantica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemanticaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Analizador Sintáctico");

        btnAnalizarSin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarSin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compilador.png"))); // NOI18N
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Input");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Analizador Semántico");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Analizador Léxico");

        btnInfo.setBackground(new java.awt.Color(0, 0, 0));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnInfo1.setBackground(new java.awt.Color(0, 0, 0));
        btnInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btnInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfo1ActionPerformed(evt);
            }
        });

        btnInfo2.setBackground(new java.awt.Color(0, 0, 0));
        btnInfo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btnInfo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfo2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/index.png"))); // NOI18N
        jLabel5.setText("  FloriánCompiler");

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Desarrollado por: neotest-dev");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/uct.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnArchivo)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnalizarLex, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(btnSemantica, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnalizarSin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnalizarLex)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(btnArchivo))
                    .addComponent(btnInfo1)
                    .addComponent(btnInfo2)
                    .addComponent(btnSemantica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAnalizarSin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel6)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("FlorianCompiler");
        jPanel1.getAccessibleContext().setAccessibleDescription("FlorianCompiler");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        String ST = txtResultado.getText();
        System.out.println("Texto a analizar: " + ST);
        Sintax s = new Sintax(new parser.LexerCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("Análisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(57, 255, 20)); 
        } catch (Exception ex) {
            Symbol sym = s.getS();

            if (sym != null) {
                // Suponiendo que sym.left te da la posición del error,
                // ajustamos la línea en función del valor de sym.left
                int lineaError = calcularLinea(sym.left, ST); // calculamos la línea a partir de la posición

                String errorMsg = "Error de sintaxis. Línea: " + lineaError + 
                                  ", Texto: \"" + (sym.value != null ? sym.value.toString() : "Token no reconocido") + "\"";

                txtAnalizarSin.setText(errorMsg);
            } else {
                txtAnalizarSin.setText("Error de sintaxis desconocido.");
            }

            txtAnalizarSin.setForeground(Color.red);
        }

    }//GEN-LAST:event_btnAnalizarSinActionPerformed
    
    // Este método calcula la línea en la que se encuentra el error.
    private int calcularLinea(int posicion, String texto) {
        // Dividir el texto en líneas
        String[] lineas = texto.split("\n");

        int totalCaracteres = 0;
        for (int i = 0; i < lineas.length; i++) {
            totalCaracteres += lineas[i].length() + 1; // +1 por el salto de línea
            if (totalCaracteres > posicion) {
                return i + 1; // La línea es 1-indexada
            }
        }

        // Si la posición es mayor a la longitud del texto, retorna la última línea
        return lineas.length;
    }

    private void btnSemanticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemanticaActionPerformed
        // TODO add your handling code here:
        try {
            analizarLexico2();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSemanticaActionPerformed

    private void btnAnalizarLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfo1ActionPerformed
        // Crear un mensaje explicativo sobre el análisis léxico
        String mensaje = 
                     "Un analizador léxico es un componente fundamental en el proceso de análisis de código fuente en la compilación. " +
                     "Su tarea principal es leer el código fuente (como un archivo o cadena de texto) y dividirlo en unidades mínimas llamadas tokens.\n" +
                     "Cada token representa un componente léxico del lenguaje de programación, como palabras clave, identificadores, operadores, " +
                     "números, símbolos de puntuación, entre otros. Por ejemplo, en el código int x = 5; , los tokens serían: " +
                     "int, x, =, 5, ; .\n" +
                     "El analizador léxico ayuda a comprender la estructura básica del código y es el primer paso antes de realizar el análisis sintáctico, " +
                     "que verifica si la secuencia de tokens sigue las reglas del lenguaje.";
    
        // Crear un JTextArea para el mensaje
        JTextArea textArea = new JTextArea(mensaje);
        textArea.setEditable(false);  // No permitir edición
        textArea.setLineWrap(true);   // Ajustar el texto
        textArea.setWrapStyleWord(true);  // Ajustar las palabras
        textArea.setCaretPosition(0);  // Asegurarse de que el texto empiece desde el inicio

        // Crear un JScrollPane para el JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));  // Ajustar el tamaño aquí

        // Mostrar el cuadro de mensaje con el JScrollPane contenido
        JOptionPane.showMessageDialog(null, scrollPane, "Información sobre Analizador Léxico", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfo1ActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // Crear un mensaje explicativo sobre el análisis sintáctico
        String mensaje = 
                    "Un analizador sintáctico es el segundo paso en el proceso de compilación, después del análisis léxico. " +
                    "Su tarea principal es verificar que la secuencia de tokens generada por el analizador léxico siga las reglas gramaticales del lenguaje de programación.\n" +
                    "El análisis sintáctico construye una estructura jerárquica, generalmente un árbol de sintaxis abstracta (AST), " +
                    "que refleja cómo los elementos del código fuente se combinan y se organizan de acuerdo con las reglas del lenguaje.\n" +
                    "Si el código fuente no sigue una secuencia válida de tokens o tiene errores gramaticales, el analizador sintáctico genera un error de sintaxis.";

        // Crear un JTextArea para el mensaje
        JTextArea textArea = new JTextArea(mensaje);
        textArea.setEditable(false);  // No permitir edición
        textArea.setLineWrap(true);   // Ajustar el texto
        textArea.setWrapStyleWord(true);  // Ajustar las palabras
        textArea.setCaretPosition(0);  // Asegurarse de que el texto empiece desde el inicio

        // Crear un JScrollPane para el JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));  // Ajustar el tamaño aquí

        // Mostrar el cuadro de mensaje con el JScrollPane contenido
        JOptionPane.showMessageDialog(null, scrollPane, "Información sobre Analizador Sintáctico", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnInfo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfo2ActionPerformed
        // Crear un mensaje explicativo sobre el análisis semántico
        String mensaje = 
                    "El análisis semántico es la fase que sigue al análisis sintáctico en el proceso de compilación. " +
                    "Su objetivo es verificar que el código fuente no solo sea gramaticalmente correcto, sino que también tenga sentido a nivel semántico.\n" +
                    "Esto implica comprobar que las variables están declaradas antes de usarse, que las operaciones son válidas para los tipos de datos involucrados, " +
                    "que no hay variables sin inicializar, entre otras verificaciones.\n" +
                    "Si se encuentran inconsistencias semánticas, el analizador semántico generará un error, indicando qué parte del código es problemática.";

        // Crear un JTextArea para el mensaje
        JTextArea textArea = new JTextArea(mensaje);
        textArea.setEditable(false);  // No permitir edición
        textArea.setLineWrap(true);   // Ajustar el texto
        textArea.setWrapStyleWord(true);  // Ajustar las palabras
        textArea.setCaretPosition(0);  // Asegurarse de que el texto empiece desde el inicio

        // Crear un JScrollPane para el JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));  // Ajustar el tamaño aquí

        // Mostrar el cuadro de mensaje con el JScrollPane contenido
        JOptionPane.showMessageDialog(null, scrollPane, "Información sobre Analizador Semántico", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfo2ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
        txtAnalizarLex.setText("");
        txtAnalizarSeman.setText("");
        txtAnalizarSin.setText("");
        txtResultado.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    private void analizarLexico2() throws IOException {
        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "ACCION SEMANTICA\n";

        // Aquí creamos un conjunto para las variables declaradas (como ejemplo para verificar declaraciones)
        Set<String> variablesDeclaradas = new HashSet<>();

        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarSeman.setText(resultado);
                return;
            }

            switch (token) {
                case Paquete:
                    resultado += "  <Se declara el paquete: " + lexer.lexeme + ">\n";
                    break;
                case Comillas:
                    resultado += "  <Se encuentra una cadena: " + lexer.lexeme + ">\n";
                    break;

                case T_dato:
                    resultado += "  <Se declara tipo de dato: " + lexer.lexeme + ">\n";
                    break;

                case Identificador:
                    resultado += "  <Se declara la variable: " + lexer.lexeme + ">\n";
                    break;

                case Igual:
                    resultado += "  <Se realiza una asignación>\n";
                    break;

                case Numero:
                    resultado += "  <Se encuentra un valor numérico: " + lexer.lexeme + ">\n";
                    break;

                case Suma:
                    resultado += "  <Se realiza una operación de suma>\n";
                    break;

                case Resta:
                    resultado += "  <Se realiza una operación de resta>\n";
                    break;

                case Multiplicacion:
                    resultado += "  <Se realiza una operación de multiplicación>\n";
                    break;

                case Division:
                    resultado += "  <Se realiza una operación de división>\n";
                    break;

                case Op_logico:
                    resultado += "  <Se realiza una operación lógica>\n";
                    break;

                case Op_incremento:
                    resultado += "  <Se realiza un incremento>\n";
                    break;

                case Parentesis_a:
                    resultado += "  <Se abre un paréntesis>\n";
                    break;

                case Parentesis_c:
                    resultado += "  <Se cierra un paréntesis>\n";
                    break;

                case Llave_a:
                    resultado += "  <Se abre una llave>\n";
                    break;

                case Llave_c:
                    resultado += "  <Se cierra una llave>\n";
                    break;

                case Corchete_a:
                    resultado += "  <Se abre un corchete>\n";
                    break;

                case Corchete_c:
                    resultado += "  <Se cierra un corchete>\n";
                    break;

                case Main:
                    resultado += "  <Se declara el método main>\n";
                    break;

                case Publico:
                    resultado += "  <Se encuentra la palabra clave 'publico'>\n";
                    break;

                case If:
                    resultado += "  <Se declara una sentencia IF>\n";
                    break;

                case Else:
                    resultado += "  <Se declara una sentencia ELSE>\n";
                    break;

                case While:
                    resultado += "  <Se declara una sentencia WHILE>\n";
                    break;

                case For:
                    resultado += "  <Se declara una sentencia FOR>\n";
                    break;

                case SYSTEM:
                    resultado += "  <Se usa la palabra clave SYSTEM>\n";
                    break;

                case Out:
                    resultado += "  <Se usa la palabra clave OUT>\n";
                    break;

                case Imprimir:
                    resultado += "  <Se imprime algo>\n";
                    break;

                case P_coma:
                    resultado += "  <Se encuentra un punto y coma>\n";
                    break;

                case ERROR:
                    resultado += "  <Error: Símbolo no reconocido>\n";
                    break;

                default:
                    break;
            }

            // Descripción semántica de las declaraciones de variables
            if (token == Tokens.T_dato) {
                // Verifica que el siguiente token sea un identificador
                Tokens siguienteToken = lexer.yylex();
                if (siguienteToken == Tokens.Identificador) {
                    variablesDeclaradas.add(lexer.lexeme); // Agregar la variable a la lista de declaradas
                    resultado += "  <Se declara la variable: " + lexer.lexeme + ">\n";
                }
            }
        }
    }


    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLex;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInfo1;
    private javax.swing.JButton btnInfo2;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSemantica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSeman;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
