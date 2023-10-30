/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mauri
 * Esta es la modelo de Asistente
 */
public class Asistente {
          @SerializedName("url_asist")
    private String urlAsist;

    @SerializedName("rut_asist")
    private String rutAsist;

    @SerializedName("nombre_asist")
    private String nombreAsist;

    @SerializedName("apellido_asist")
    private String apellidoAsist;

    @SerializedName("telefono_asist")
    private String telefonoAsist;

    @SerializedName("correo_asist")
    private String correoAsist;

    @SerializedName("password_asist")
    private String passwordAsist;

    @SerializedName("sucursal")
    private int sucursal; 
    @SerializedName("estado")
    private String estado;

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

    public String getUrlAsist() {
        return urlAsist;
    }

    public void setUrlAsist(String urlAsist) {
        this.urlAsist = urlAsist;
    }

    public String getRutAsist() {
        return rutAsist;
    }

    public void setRutAsist(String rutAsist) {
        this.rutAsist = rutAsist;
    }

    public String getNombreAsist() {
        return nombreAsist;
    }

    public void setNombreAsist(String nombreAsist) {
        this.nombreAsist = nombreAsist;
    }

    public String getApellidoAsist() {
        return apellidoAsist;
    }

    public void setApellidoAsist(String apellidoAsist) {
        this.apellidoAsist = apellidoAsist;
    }

    public String getTelefonoAsist() {
        return telefonoAsist;
    }

    public void setTelefonoAsist(String telefonoAsist) {
        this.telefonoAsist = telefonoAsist;
    }

    public String getCorreoAsist() {
        return correoAsist;
    }

    public void setCorreoAsist(String correoAsist) {
        this.correoAsist = correoAsist;
    }

    public String getPasswordAsist() {
        return passwordAsist;
    }

    public void setPasswordAsist(String passwordAsist) {
        this.passwordAsist = passwordAsist;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
}
