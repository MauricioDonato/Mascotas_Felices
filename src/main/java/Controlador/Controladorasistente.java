/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Veterinario;
import Modelo.Sucursal;
import Modelo.Motivo;
import Modelo.Asistente;
import Modelo.Horario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
/**
 * Clase que contiene lógica de control para el rol de asistente en la aplicación.
 * Proporciona métodos para validar, buscar y realizar operaciones relacionadas con asistentes.
 * @author mauri
 */
public class Controladorasistente {
      String token = "4432703a71447984770c315364a7848f7d69bcc9";
     /**
     * Valida las credenciales de un asistente.
     *
     * @param rut    El RUT del asistente.
     * @param contra La contraseña del asistente.
     * @return Un valor que indica si la validación fue exitosa.
     */
     public String Validar(String rut, String contra) {
        String url = "https://davydvat.pythonanywhere.com/asistente/login/";
     
        try  {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
         
       
      
            httpPost.setHeader("Authorization", "Token " + token);
            String f = "\"user\":" + "\"" + rut + "\"";
            String h = "\"password\": " + "\"" + contra + "\"";
            String jsonBody = "{"+   
                f +"," +
                h 
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
             
        
            return responseBody;
                
            }
            
        }catch (Exception e) {
            e.printStackTrace();
           
        }
        return "0";
   }
 /**
     * Busca un asistente por su RUT.
     *
     * @param rut El RUT del asistente.
     * @return El RUT del asistente encontrado.
     */
   public String buscarPorRut(String rut) {
        String url = "https://davydvat.pythonanywhere.com/asistente/" + rut;

        String Rut_valor = "";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("Authorization", "Token " + token);
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    Gson gson = new Gson();
                    Asistente veterinario = gson.fromJson(responseBody, Asistente.class);     

                    Rut_valor = veterinario.getRutAsist();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return Rut_valor;
   }
   /**
 * Realiza una solicitud POST para agendar una atención.
 *
 * @param rut      El RUT del cliente.
 * @param fecha    La fecha de la atención.
 * @param hora     La hora de la atención.
 * @param sucursal La sucursal donde se realizará la atención.
 * @return Un valor que indica el resultado de la operación (éxito o fallo).
 */
   public String Post(String rut, String fecha, String hora, String sucursal) {
        String url = "https://davydvat.pythonanywhere.com/atencion/";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Content-Type", "application/json");
            Controladorasistente cm = new Controladorasistente();
            
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
                    
            }
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
       
       
  
   } /**
     * Obtiene el valor asociado a un RUT.
     *
     * @param Sucursal_v El Sucursal del cual se quiere obtener el valor.
     * @return El valor asociado al Sucursal.
     */
   public String Sucursal (String Sucursal_v){
       
     String url = "https://davydvat.pythonanywhere.com/sucursal";
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
   }  /**
     * Obtiene el valor asociado a un RUT.
     *
     * @param Rut_v El RUT del cual se quiere obtener el valor.
     * @return El valor asociado al RUT.
     */
   public String Rut (String Rut_v){
       String url = "https://davydvat.pythonanywhere.com/veterinario";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
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
       
   }   /**
     * Obtiene el valor asociado a un RUT.
     *
     * @param rut El RUT del cual se quiere obtener el valor.
     * @return El valor asociado al RUT.
     */
   public String valor_rut(String rut) {
        String url = rut;
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
                    Veterinario veterinario = gson.fromJson(responseBody, Veterinario.class);

                    // Acceder a las variables individuales
                 
                    Rut_valor = veterinario.getNombreVet();           
                 
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return Rut_valor;
   }
   /**
     * Obtiene el valor asociado a una sucursal.
     *
     * @param sucursal La sucursal de la cual se quiere obtener el valor.
     * @return El valor asociado a la sucursal.
     */
public String valor_sucursal(String sucursal) {
         String url = sucursal;
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
                   Gson gson = new Gson();
                    Sucursal veterinario = gson.fromJson(responseBody, Sucursal.class);
                   sucursal_valor = veterinario.getNombre_suc();
         }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       return sucursal_valor;
}
/**
     * Busca todos los motivos relacionados con un procedimiento.
     *
     * @param proc El procedimiento para el cual se buscan motivos.
     * @return Una lista de motivos relacionados con el procedimiento.
     * @throws IOException Si hay un error durante la búsqueda.
     */
 public List<Motivo> buscarTodos(String proc) throws IOException
    {
     String url = "https://davydvat.pythonanywhere.com/procedimiento/";
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
   /**
     * Obtiene los horarios relacionados con una disponibilidad.
     *
     * @param disp La disponibilidad para la cual se buscan horarios.
     * @return Una lista de horarios relacionados con la disponibilidad.
     */
public List<Horario> hora(String disp){
        String url = "https://davydvat.pythonanywhere.com/atencion/" + disp;
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
    
}  /**
     * Obtiene el nombre completo de un veterinario a partir de su RUT.
     *
     * @param Rut_v El RUT del veterinario.
     * @return El nombre completo del veterinario.
     */
 public String Nombre_vet (String Rut_v){
       String url = Rut_v;
 try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            Veterinario nombre;
            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);

            // Enviar la solicitud y obtener la respuesta
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    Gson gson = new Gson();
                   nombre = gson.fromJson(responseBody, Veterinario.class);
                    String valor = nombre.getNombreVet() + " " +nombre.getApellidoVet();
                    return valor;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
       return null;
 }
  /**
     * Obtiene el nombre y ubicación de una sucursal a partir de su nombre.
     *
     * @param Nombre_suc El nombre de la sucursal.
     * @return El nombre y la ubicación de la sucursal.
     */
 public String Nombre_suc (String Nombre_suc){
       String url = Nombre_suc;
 try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            Sucursal nombre;
            // Agregar el encabezado de autenticación con el token
            httpGet.setHeader("Authorization", "Token " + token);
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String responseBody = EntityUtils.toString(entity);
                    Gson gson = new Gson();
                    nombre = gson.fromJson(responseBody, Sucursal.class);
                    String valor = nombre.getNombre_suc() + "/ Ubicada en:" +nombre.getDirec_suc();
                    return valor;
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
            return "0";
        }
       return null;
 }
  /**
     * Valida si un RUT es válido.
     *
     * @param rut El RUT a validar.
     * @return true si el RUT es válido, false en caso contrario.
     */
       public static boolean validarRut(String rut) {
        if (rut == null || rut.isEmpty()) {
            return false;
        }

        // Quitar puntos y guión si están presentes en el RUT
        rut = rut.replace(".", "").replace("-", "");

        // Verificar que el RUT tiene un formato válido
        if (!rut.matches("^[0-9]{7,8}[Kk0-9]$")) {
            return false;
        }

        String numero = rut.substring(0, rut.length() - 1);
        char dv = Character.toUpperCase(rut.charAt(rut.length() - 1));

        // Calcular el dígito verificador esperado
        char dvEsperado = calcularDigitoVerificador(numero);

        return dv == dvEsperado;
    }

    private static char calcularDigitoVerificador(String numero) {
        int suma = 0;
        int multiplicador = 2;

        for (int i = numero.length() - 1; i >= 0; i--) {
            suma += Integer.parseInt(String.valueOf(numero.charAt(i))) * multiplicador;
            multiplicador = multiplicador < 7 ? multiplicador + 1 : 2;
        }

        int resto = suma % 11;
        char dv;

        dv = switch (resto) {
            case 1 -> 'K';
            case 0 -> '0';
            default -> Character.forDigit(11 - resto, 10);
        };

        return dv;
    }
}

