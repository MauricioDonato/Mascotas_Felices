/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Clase que representa el modelo de un asistente.
 * Contiene información como la URL, el nombre, el apellido, etc.
 * @author mauri
 */
public class Asistente {
    /**
     * URL del asistente.
     */
      @SerializedName("url_asist")
    private String urlAsist;
/**
     * rut del asistente.
     */
    @SerializedName("rut_asist")
    private String rutAsist;
/**
     * nombre del asistente.
     */
    @SerializedName("nombre_asist")
    private String nombreAsist;
/**
     * Apellido del asistente.
     */
    @SerializedName("apellido_asist")
    private String apellidoAsist;
/**
     * Telefono del asistente.
     */
    @SerializedName("telefono_asist")
    private String telefonoAsist;
/**
     * Correo del asistente.
     */
    @SerializedName("correo_asist")
    private String correoAsist;
/**
     * Password del asistente.
     */
    @SerializedName("password_asist")
    private String passwordAsist;
/**
     * Sucursal del asistente.
     */
    @SerializedName("sucursal")
    private int sucursal; 
    /**
     * Estado del asistente.
     */
    @SerializedName("estado")
    private String estado;
/**
     * Constructor de la clase Asistente.
     * @param urlAsist URL del asistente.
     * @param rutAsist Rut del asistente.
     * @param nombreAsist Nombre del asistente.
     * @param apellidoAsist Apellido del asistente.
     * @param telefonoAsist Teléfono del asistente.
     * @param correoAsist Correo del asistente.
     * @param passwordAsist Contraseña del asistente.
     * @param sucursal Sucursal a la que pertenece el asistente.
     * @param estado Estado del asistente.
     */
    public Asistente(String urlAsist, String rutAsist, String nombreAsist, String apellidoAsist, String telefonoAsist, String correoAsist, String passwordAsist, int sucursal, String estado) {
        this.urlAsist = urlAsist;
        this.rutAsist = rutAsist;
        this.nombreAsist = nombreAsist;
        this.apellidoAsist = apellidoAsist;
        this.telefonoAsist = telefonoAsist;
        this.correoAsist = correoAsist;
        this.passwordAsist = passwordAsist;
        this.sucursal = sucursal;
        this.estado = estado;
    }
 /**
     * Obtiene la URL del asistente.
     * @return URL del asistente.
     */
    public String getUrlAsist() {
        return urlAsist;
    }
/**
     * Establece la URL del asistente.
     * @param urlAsist Nueva URL del asistente.
     */
    public void setUrlAsist(String urlAsist) {
        this.urlAsist = urlAsist;
    }  /**
     * Obtiene el Rut del asistente.
     * @return Rut del asistente.
     */
    public String getRutAsist() {
        return rutAsist;
    }
  /**
     * Establece el Rut del asistente.
     * @param rutAsist Nuevo Rut del asistente.
     */
    public void setRutAsist(String rutAsist) {
        this.rutAsist = rutAsist;
    }
/**
     * Obtiene el nombre del asistente.
     * @return Nombre del asistente.
     */
    public String getNombreAsist() {
        return nombreAsist;
    }
 /**
     * Establece el nombre del asistente.
     * @param nombreAsist Nuevo nombre del asistente.
     */
    public void setNombreAsist(String nombreAsist) {
        this.nombreAsist = nombreAsist;
    }
 /**
     * Obtiene el apellido del asistente.
     * @return Apellido del asistente.
     */
    public String getApellidoAsist() {
        return apellidoAsist;
    }
 /**
     * Establece el apellido del asistente.
     * @param apellidoAsist Nuevo apellido del asistente.
     */
    public void setApellidoAsist(String apellidoAsist) {
        this.apellidoAsist = apellidoAsist;
    }/**
     * Obtiene el teléfono del asistente.
     * @return Teléfono del asistente.
     */

    public String getTelefonoAsist() {
        return telefonoAsist;
    } /**
     * Establece el teléfono del asistente.
     * @param telefonoAsist Nuevo teléfono del asistente.
     */

    public void setTelefonoAsist(String telefonoAsist) {
        this.telefonoAsist = telefonoAsist;
    }
 /**
     * Obtiene el correo del asistente.
     * @return Correo del asistente.
     */
    public String getCorreoAsist() {
        return correoAsist;
    }
   /**
     * Establece el correo del asistente.
     * @param correoAsist Nuevo correo del asistente.
     */
    public void setCorreoAsist(String correoAsist) {
        this.correoAsist = correoAsist;
    }
/**
     * Obtiene la contraseña del asistente.
     * @return Contraseña del asistente.
     */
    public String getPasswordAsist() {
        return passwordAsist;
    }
  /**
     * Establece la contraseña del asistente.
     * @param passwordAsist Nueva contraseña del asistente.
     */
    public void setPasswordAsist(String passwordAsist) {
        this.passwordAsist = passwordAsist;
    }
  /**
     * Obtiene la sucursal a la que pertenece el asistente.
     * @return Sucursal del asistente.
     */
    public int getSucursal() {
        return sucursal;
    }
   /**
     * Establece la sucursal a la que pertenece el asistente.
     * @param sucursal Nueva sucursal del asistente.
     */
    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }
  /**
     * Obtiene el estado del asistente.
     * @return Estado del asistente.
     */
    public String getEstado() {
        return estado;
    }
   /**
     * Establece el estado del asistente.
     * @param estado Nuevo estado del asistente.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
  
    

}
