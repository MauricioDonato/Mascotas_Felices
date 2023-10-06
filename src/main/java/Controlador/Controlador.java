/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.Asistente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author mauri
 */
public class Controlador {
     public String buscarPorRut(String rut) {
        String url = "https://davydvat.pythonanywhere.com/asistente/" + rut;
        String token = "4432703a71447984770c315364a7848f7d69bcc9";
        String Rut_valor = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    
                    System.out.println(responseBody);

                    // Parsear el JSON utilizando Gson
                    Gson gson = new Gson();
                    Asistente veterinario = gson.fromJson(responseBody, Asistente.class);     

                    Rut_valor = veterinario.getRutAsist();
                    // Imprimir las variables
                 
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return Rut_valor;
   }
   public String Post(String rut, String fecha, String hora, String sucursal) {
        String url = "https://davydvat.pythonanywhere.com/atencion/"; // Reemplaza con la URL correcta de la API
        String token = "4432703a71447984770c315364a7848f7d69bcc9"; 
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Crear una solicitud POST
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
            Controlador cm = new Controlador();
            
            String suc = cm.Sucursal(sucursal);
            if("0".equals(suc)){
                return "fallo";
            }
            String r = cm.Rut(rut);
            if("0".equals(r)){
                return "fallo";
            }
            String f = "\"fecha\":" + "\"" + fecha + "\"";
            String h = "\"hora\": " + "\"" + hora + "\"";
            String estado = "\"estado\": \"Disponible\"";
            String rut_cli = "\"rut_cli\": \"\"";
            String nombre_cli ="\"nombre_cli\": \"\"";
            String telefono_cli ="\"telefono_cli\": \"\"";
            String correo_cli ="\"correo_cli\": \"\"";
            String motivo = "\"motivo\": \"\"";
            String rut_vet = "\"rut_vet\":" + "\"" + r + "\"";
            String s= "\"sucursal\":" + "\"" + suc + "\"";
             
            // Agregar el token de autenticación en el encabezado
            httpPost.setHeader("Authorization", "Token " + token);

              String jsonBody = "{"+   
                f +"," +
                h +"," +
                estado +  "," +
                rut_cli +","+
                nombre_cli +","+
                telefono_cli +"," +
                correo_cli + ","+
                motivo + "," +
                rut_vet + "," +
                s

                + "}";

            // Configurar el JSON como el contenido del cuerpo de la solicitud
            StringEntity requestEntity = new StringEntity(jsonBody);
            httpPost.setEntity(requestEntity);

            // Ejecutar la solicitud POST y obtener la respuesta
            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();

            // Procesar la respuesta
            if (responseEntity != null) {
                String responseBody = EntityUtils.toString(responseEntity);
                System.out.println("Respuesta del servidor:");
                System.out.println(responseBody);

                
            }
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
       
       
  
   }
   public String Sucursal (String Sucursal_v){
       
     String url = "https://davydvat.pythonanywhere.com/sucursal";
        String token = "4432703a71447984770c315364a7848f7d69bcc9";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

      
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                Gson gson = new Gson();
                java.lang.reflect.Type listType = new TypeToken<List<Sucursal>>() {}.getType();
                List<Sucursal> listaHorarios = gson.fromJson(EntityUtils.toString(entity), listType);
                for (Sucursal valor : listaHorarios) {
                    if (Sucursal_v.equals(valor.getNombre_suc())) {
                        String respuesta = valor.getUrl();
                        return respuesta;
                        

                    
 

                  
                }
                }
                return "0";
                
            }

        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
   } 
   public String Rut (String Rut_v){
       String url = "https://davydvat.pythonanywhere.com/veterinario";
        String token = "4432703a71447984770c315364a7848f7d69bcc9";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

      
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                Gson gson = new Gson();
                java.lang.reflect.Type listType = new TypeToken<List<Veterinario>>() {}.getType();
                List<Veterinario> listaHorarios = gson.fromJson(EntityUtils.toString(entity), listType);
                for (Veterinario valor : listaHorarios) {
                    if (Rut_v.equals(valor.getNombreVet())) {
                        String respuesta = valor.getUrl();
                        return respuesta;
                        

                    
 

                  
                }
                }
                return "0";
                
            }

        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
       
   }
   public String valor_rut(String rut) {
        String url = rut;
        String token = "4432703a71447984770c315364a7848f7d69bcc9";
        String Rut_valor = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
        
                    // Parsear el JSON utilizando Gson
                    Gson gson = new Gson();
                    Asistente veterinario = gson.fromJson(responseBody, Asistente.class);

                    // Acceder a las variables individuales
                    String urlVeterinario = veterinario.getUrlAsist();
                    String rutVet = veterinario.getRutAsist();
                    String nombreVet = veterinario.getNombreAsist();
                    String apellidoVet = veterinario.getApellidoAsist();
                    String telefonoVet = veterinario.getTelefonoAsist();
                    String correoVet = veterinario.getCorreoAsist();
                    String passwordVet = veterinario.getPasswordAsist();
                    Rut_valor = veterinario.getRutAsist();
                    // Imprimir las variables
                 
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return Rut_valor;
   }
public String valor_sucursal(String sucursal) {
         String url = sucursal;
        String token = "4432703a71447984770c315364a7848f7d69bcc9";
        String sucursal_valor = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    
          

                    // Parsear el JSON utilizando Gson
                    Gson gson = new Gson();
                    Sucursal veterinario = gson.fromJson(responseBody, Sucursal.class);

                    // Acceder a las variables individuales
                    sucursal_valor = veterinario.getNombre_suc();
                    
                    // Imprimir las variables
                 
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return sucursal_valor;
}
 public List<Motivo> buscarTodos(String proc) throws IOException
    {
     String url = "https://davydvat.pythonanywhere.com/procedimiento/";
        String token = "4432703a71447984770c315364a7848f7d69bcc9";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
              
                    String responseBody = EntityUtils.toString(entity);
                    Gson gson = new Gson();
                    java.lang.reflect.Type listType = new TypeToken<List<Motivo>>() {}.getType();
                    List<Motivo> listaMotivo = gson.fromJson(responseBody, listType);
                    
                  return listaMotivo;            
                }               
            }

        } 
public List<Horario> hora(String disp){
        String url = "https://davydvat.pythonanywhere.com/atencion/" + disp;
        String token = "4432703a71447984770c315364a7848f7d69bcc9";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);

            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
              
                    String responseBody = EntityUtils.toString(entity);
                    Gson gson = new Gson();
                    java.lang.reflect.Type listType = new TypeToken<List<Motivo>>() {}.getType();
                    List<Horario> listaHorarios = gson.fromJson(responseBody, listType);
                                
                  return listaHorarios;
            }
     
         
            
          
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
}   
}
