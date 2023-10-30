/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mauri
 *  Esta es la modelo de Asistente
 */
public class Veterinario {
     @SerializedName("url")
    private String url;

    @SerializedName("rut_vet")
    private String rutVet;

    @SerializedName("nombre_vet")
    private String nombreVet;

    @SerializedName("apellido_vet")
    private String apellidoVet;

    @SerializedName("telefono_vet")
    private String telefonoVet;

    @SerializedName("correo_vet")
    private String correoVet;

    @SerializedName("password_vet")
    private String passwordVet;
    @SerializedName("estado_vet")
    private String estadoVet;

    public Veterinario(String url, String rutVet, String nombreVet, String apellidoVet, String telefonoVet, String correoVet, String passwordVet, String estadoVet) {
        this.url = url;
        this.rutVet = rutVet;
        this.nombreVet = nombreVet;
        this.apellidoVet = apellidoVet;
        this.telefonoVet = telefonoVet;
        this.correoVet = correoVet;
        this.passwordVet = passwordVet;
        this.estadoVet = estadoVet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRutVet() {
        return rutVet;
    }

    public void setRutVet(String rutVet) {
        this.rutVet = rutVet;
    }

    public String getNombreVet() {
        return nombreVet;
    }

    public void setNombreVet(String nombreVet) {
        this.nombreVet = nombreVet;
    }

    public String getApellidoVet() {
        return apellidoVet;
    }

    public void setApellidoVet(String apellidoVet) {
        this.apellidoVet = apellidoVet;
    }

    public String getTelefonoVet() {
        return telefonoVet;
    }

    public void setTelefonoVet(String telefonoVet) {
        this.telefonoVet = telefonoVet;
    }

    public String getCorreoVet() {
        return correoVet;
    }

    public void setCorreoVet(String correoVet) {
        this.correoVet = correoVet;
    }

    public String getPasswordVet() {
        return passwordVet;
    }

    public void setPasswordVet(String passwordVet) {
        this.passwordVet = passwordVet;
    }

    public String getEstadoVet() {
        return estadoVet;
    }

    public void setEstado(String estadoVet) {
        this.estadoVet = estadoVet;
    }

   
    
}
