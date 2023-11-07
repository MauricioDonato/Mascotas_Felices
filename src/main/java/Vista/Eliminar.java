/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *Esta es la vista de eliminar hora asis
 * @author mauri
 */

import Controlador.Controladorasistente;
import Modelo.Horario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.util.EntityUtils;
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Hora", "Disponibilidad", "Rut Cli", "Nombre Cli", "Correo Cli", "Telefono Cli", "Nombre Veterinario", "Reservar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListado);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Reserva:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnBuscar)
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String url = "https://davydvat.pythonanywhere.com/atencion";
        String token = "4432703a71447984770c315364a7848f7d69bcc9";
        DefaultTableModel modelo = (DefaultTableModel) tblListado.getModel();
        modelo.setRowCount(0);
       
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Crea una solicitud GET
            HttpGet httpGet = new HttpGet(url);

            // Agrega el token de autenticación en el encabezado
             httpGet.addHeader("Authorization", "Token " + token);

            // Ejecuta la solicitud GET y obtén la respuesta
            HttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();

            // Procesa la respuesta
            
                String responseBody = EntityUtils.toString(entity);

                // Utiliza Gson para analizar la respuesta JSON en una lista de objetos
                Gson gson = new Gson();
                java.lang.reflect.Type listType = new TypeToken<List<Horario>>() {}.getType();
                List<Horario> listaHorarios = gson.fromJson(responseBody, listType);

                // Ahora tienes la lista de objetos en 'tuObjetos' para trabajar con ellos
               
                 for (Horario inscripcion : listaHorarios) {
                Controladorasistente cm = new Controladorasistente();
               
                String valor = cm.valor_rut(inscripcion.getRut_vet());
                String valor_sucursal = cm.valor_sucursal(inscripcion.getSucursal());
                modelo.addRow(new Object[]{inscripcion.getId_hora(), inscripcion.getFecha(),inscripcion.getHora(), inscripcion.getEstado(),inscripcion.getRut_cli(),inscripcion.getNombre_cli(),inscripcion.getCorreo_cli(),inscripcion.getTelefono_cli(),valor, valor_sucursal});
           
                    // Agrega aquí más campos según la estructura de tu objeto JSON
                
                }
        

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String Id= txtId.getText();
             long tInicio = System.currentTimeMillis();
          String url = "https://davydvat.pythonanywhere.com/atencion/" + Id + "/";
        String token = "4432703a71447984770c315364a7848f7d69bcc9";
        
         Horario hora = null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);
            HttpResponse res = httpClient.execute(httpGet);
            int statusCode = res.getStatusLine().getStatusCode();

            if (statusCode == 404) {
                JOptionPane.showMessageDialog(this, "Error en Ingreso de datos");
            }

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    
          

                    // Parsear el JSON utilizando Gson
                    Gson gson = new Gson();
                    
                    
                    // Imprimir las variables
                    hora = gson.fromJson(responseBody, Horario.class);
                    
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Controladorasistente cm = new Controladorasistente();
        String nom_vet = cm.Nombre_vet(hora.getRut_vet());
        String nom_suc = cm.Nombre_suc(hora.getSucursal());
        if(hora.getCorreo_cli() != null){
        String url2 = "https://davydvat.pythonanywhere.com/correo/veterinario_cancelar/"; 
        String jsonBody2 = "{"
            + "\"nombre\":\"" + hora.getNombre_cli() +"\","
            + "\"fecha\":\""+ hora.getFecha() +"\","
            + "\"hora\":\""+ hora.getHora()+"\","
            + "\"veterinario\":\""+ nom_vet +"\","
            + "\"sucursal\":\""+ nom_suc +"\","
            + "\"telefono\":\""+ hora.getTelefono_cli() +"\","
            + "\"correo\":\""+ hora.getCorreo_cli() +"\""
            + "}";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
          
            HttpPost httpPost = new HttpPost(url2);
            httpPost.setHeader("Content-Type", "application/json");

          
            httpPost.setHeader("Authorization", "Token " + token);

            StringEntity requestEntity = new StringEntity(jsonBody2);
            httpPost.setEntity(requestEntity);

            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();

           
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        try (CloseableHttpClient httpClient = HttpClients.custom()
                .setRedirectStrategy(new LaxRedirectStrategy()) 
                .build()) {

            HttpDelete httpDelete = new HttpDelete(url);

            httpDelete.setHeader("Authorization", "Token " + token);

            HttpResponse response = httpClient.execute(httpDelete);

            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == 204) {
   
                  JOptionPane.showMessageDialog(this, "Reserva Eliminada");
            
            } else {
               
                 JOptionPane.showMessageDialog(this, "Error en Ingreso de datos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        menu frm = new  menu ();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
