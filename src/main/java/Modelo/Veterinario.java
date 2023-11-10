/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.gson.annotations.SerializedName;

/**
 *Esta el Modelo de Veterinario
 * @author mauri
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

 /**
     * Constructor de la clase Veterinario.
     *
     * @param url         La URL del veterinario.
     * @param rutVet      El RUT del veterinario.
     * @param nombreVet   El nombre del veterinario.
     * @param apellidoVet El apellido del veterinario.
     * @param telefonoVet El número de teléfono del veterinario.
     * @param correoVet   El correo electrónico del veterinario.
     * @param passwordVet La contraseña del veterinario.
     * @param estadoVet   El estado del veterinario.
     */
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

    /**
     * Obtiene la URL del veterinario.
     *
     * @return La URL del veterinario.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Establece la URL del veterinario.
     *
     * @param url La nueva URL del veterinario.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Obtiene el RUT del veterinario.
     *
     * @return El RUT del veterinario.
     */
    public String getRutVet() {
        return rutVet;
    }

    /**
     * Establece el RUT del veterinario.
     *
     * @param rutVet El nuevo RUT del veterinario.
     */
    public void setRutVet(String rutVet) {
        this.rutVet = rutVet;
    }

    /**
     * Obtiene el nombre del veterinario.
     *
     * @return El nombre del veterinario.
     */
    public String getNombreVet() {
        return nombreVet;
    }

    /**
     * Establece el nombre del veterinario.
     *
     * @param nombreVet El nuevo nombre del veterinario.
     */
    public void setNombreVet(String nombreVet) {
        this.nombreVet = nombreVet;
    }

    /**
     * Obtiene el apellido del veterinario.
     *
     * @return El apellido del veterinario.
     */
    public String getApellidoVet() {
        return apellidoVet;
    }

    /**
     * Establece el apellido del veterinario.
     *
     * @param apellidoVet El nuevo apellido del veterinario.
     */
    public void setApellidoVet(String apellidoVet) {
        this.apellidoVet = apellidoVet;
    }

    /**
     * Obtiene el número de teléfono del veterinario.
     *
     * @return El número de teléfono del veterinario.
     */
    public String getTelefonoVet() {
        return telefonoVet;
    }

    /**
     * Establece el número de teléfono del veterinario.
     *
     * @param telefonoVet El nuevo número de teléfono del veterinario.
     */
    public void setTelefonoVet(String telefonoVet) {
        this.telefonoVet = telefonoVet;
    }

    /**
     * Obtiene el correo electrónico del veterinario.
     *
     * @return El correo electrónico del veterinario.
     */
    public String getCorreoVet() {
        return correoVet;
    }

    /**
     * Establece el correo electrónico del veterinario.
     *
     * @param correoVet El nuevo correo electrónico del veterinario.
     */
    public void setCorreoVet(String correoVet) {
        this.correoVet = correoVet;
    }

    /**
     * Obtiene la contraseña del veterinario.
     *
     * @return La contraseña del veterinario.
     */
    public String getPasswordVet() {
        return passwordVet;
    }

    /**
     * Establece la contraseña del veterinario.
     *
     * @param passwordVet La nueva contraseña del veterinario.
     */
    public void setPasswordVet(String passwordVet) {
        this.passwordVet = passwordVet;
    }

    /**
     * Obtiene el estado del veterinario.
     *
     * @return El estado del veterinario.
     */
    public String getEstadoVet() {
        return estadoVet;
    }

    /**
     * Establece el estado del veterinario.
     *
     * @param estadoVet El nuevo estado del veterinario.
     */
    public void setEstadoVet(String estadoVet) {
        this.estadoVet = estadoVet;
    }
}
