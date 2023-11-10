/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.gson.annotations.SerializedName;

/**
 *Esta el Modelo de Atencion
 * @author mauri
 */
public class Horario {    
 /**
     * URL de la hora.
     */
    private String url;
 /**
     * Id de la hora.
     */
    private String id_hora;
 /**
     * fecha de la hora.
     */
    private String fecha;
 /**
     * hora de la hora.
     */
    private String hora;
 /**
     * estado de la hora.
     */
    private String estado;
 /**
     * rut_cli de la hora.
     */
    private String rut_cli;
 /**
     * nombre_cli de la hora.
     */
    private String nombre_cli;
 /**
     * telefono_cli de la hora.
     */
    private String telefono_cli;
 /**
     * correo_cli de la hora.
     */
    private String correo_cli;
 /**
     * rut_vet de la hora.
     */
    private String rut_vet;
    
 /**
     * sucursal de la hora.
     */

    private String sucursal;
/**
 * Constructor de la clase Horario.
 *
 * @param url URL del horario.
 * @param id_hora Identificador del horario.
 * @param fecha Fecha del horario.
 * @param hora Hora del horario.
 * @param estado Estado del horario.
 * @param rut_cli Rut del cliente asociado al horario.
 * @param nombre_cli Nombre del cliente asociado al horario.
 * @param telefono_cli Teléfono del cliente asociado al horario.
 * @param correo_cli Correo del cliente asociado al horario.
 * @param rut_vet Rut del veterinario asociado al horario.
 * @param sucursal Sucursal del horario.
 */
    public Horario(String url, String id_hora, String fecha, String hora, String estado, String rut_cli, String nombre_cli, String telefono_cli, String correo_cli, String rut_vet, String sucursal) {
        this.url = url;
        this.id_hora = id_hora;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.rut_cli = rut_cli;
        this.nombre_cli = nombre_cli;
        this.telefono_cli = telefono_cli;
        this.correo_cli = correo_cli;
        this.rut_vet = rut_vet;
        this.sucursal = sucursal;
    }

   /**
 * Obtiene la URL del horario.
 *
 * @return La URL del horario.
 */

  
    public String getUrl() {
        return url;
    }
/**
 * Establece la URL del horario.
 *
 * @param url La nueva URL del horario.
 */
    public void setUrl(String url) {
        this.url = url;
    }
/**
 * Obtiene el identificador de la hora.
 *
 * @return El identificador de la hora.
 */
    public String getId_hora() {
        return id_hora;
    }
/**
 * Establece el identificador de la hora.
 *
 * @param id_hora El nuevo identificador de la hora.
 */
public void setId_hora(String id_hora) {
    this.id_hora = id_hora;
}

    /**
     * Obtiene la fecha del horario.
     *
     * @return La fecha del horario.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del horario.
     *
     * @param fecha La nueva fecha del horario.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora del horario.
     *
     * @return La hora del horario.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la hora del horario.
     *
     * @param hora La nueva hora del horario.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el estado del horario.
     *
     * @return El estado del horario.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del horario.
     *
     * @param estado El nuevo estado del horario.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el RUT del cliente asociado al horario.
     *
     * @return El RUT del cliente asociado al horario.
     */
    public String getRut_cli() {
        return rut_cli;
    }

    /**
     * Establece el RUT del cliente asociado al horario.
     *
     * @param rut_cli El nuevo RUT del cliente asociado al horario.
     */
    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }

    /**
     * Obtiene el nombre del cliente asociado al horario.
     *
     * @return El nombre del cliente asociado al horario.
     */
    public String getNombre_cli() {
        return nombre_cli;
    }

    /**
     * Establece el nombre del cliente asociado al horario.
     *
     * @param nombre_cli El nuevo nombre del cliente asociado al horario.
     */
    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    /**
     * Obtiene el teléfono del cliente asociado al horario.
     *
     * @return El teléfono del cliente asociado al horario.
     */
    public String getTelefono_cli() {
        return telefono_cli;
    }

    /**
     * Establece el teléfono del cliente asociado al horario.
     *
     * @param telefono_cli El nuevo teléfono del cliente asociado al horario.
     */
    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    /**
     * Obtiene el correo del cliente asociado al horario.
     *
     * @return El correo del cliente asociado al horario.
     */
    public String getCorreo_cli() {
        return correo_cli;
    }

    /**
     * Establece el correo del cliente asociado al horario.
     *
     * @param correo_cli El nuevo correo del cliente asociado al horario.
     */
    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    /**
     * Obtiene el RUT del veterinario asociado al horario.
     *
     * @return El RUT del veterinario asociado al horario.
     */
    public String getRut_vet() {
        return rut_vet;
    }

    /**
     * Establece el RUT del veterinario asociado al horario.
     *
     * @param rut_vet El nuevo RUT del veterinario asociado al horario.
     */
    public void setRut_vet(String rut_vet) {
        this.rut_vet = rut_vet;
    }

    /**
     * Obtiene la sucursal asociada al horario.
     *
     * @return La sucursal asociada al horario.
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Establece la sucursal asociada al horario.
     *
     * @param sucursal La nueva sucursal asociada al horario.
     */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
}
