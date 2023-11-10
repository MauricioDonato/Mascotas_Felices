/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.gson.annotations.SerializedName;

/**
 *Esta el Modelo de sucursal
 * @author mauri
 */
public class Sucursal {
      @SerializedName("url")
    private String url;

    @SerializedName("id_suc")
    private String id_suc;

    @SerializedName("nombre_suc")
    private String nombre_suc;

    @SerializedName("direc_suc")
    private String direc_suc;

    @SerializedName("telefono_suc")
    private String telefono_suc;

    @SerializedName("correo_suc")
    private String correo_suc;

    @SerializedName("estado_suc")
    private String estadoSuc;

 /**
     * Constructor de la clase Sucursal.
     *
     * @param url         La URL de la sucursal.
     * @param id_suc      El identificador de la sucursal.
     * @param nombre_suc  El nombre de la sucursal.
     * @param direc_suc   La dirección de la sucursal.
     * @param telefono_suc El número de teléfono de la sucursal.
     * @param correo_suc  El correo electrónico de la sucursal.
     * @param estadoSuc   El estado de la sucursal.
     */
    public Sucursal(String url, String id_suc, String nombre_suc, String direc_suc, String telefono_suc, String correo_suc, String estadoSuc) {
        this.url = url;
        this.id_suc = id_suc;
        this.nombre_suc = nombre_suc;
        this.direc_suc = direc_suc;
        this.telefono_suc = telefono_suc;
        this.correo_suc = correo_suc;
        this.estadoSuc = estadoSuc;
    }

    /**
     * Obtiene la URL de la sucursal.
     *
     * @return La URL de la sucursal.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Establece la URL de la sucursal.
     *
     * @param url La nueva URL de la sucursal.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Obtiene el identificador de la sucursal.
     *
     * @return El identificador de la sucursal.
     */
    public String getId_suc() {
        return id_suc;
    }

    /**
     * Establece el identificador de la sucursal.
     *
     * @param id_suc El nuevo identificador de la sucursal.
     */
    public void setId_suc(String id_suc) {
        this.id_suc = id_suc;
    }

    /**
     * Obtiene el nombre de la sucursal.
     *
     * @return El nombre de la sucursal.
     */
    public String getNombre_suc() {
        return nombre_suc;
    }

    /**
     * Establece el nombre de la sucursal.
     *
     * @param nombre_suc El nuevo nombre de la sucursal.
     */
    public void setNombre_suc(String nombre_suc) {
        this.nombre_suc = nombre_suc;
    }

    /**
     * Obtiene la dirección de la sucursal.
     *
     * @return La dirección de la sucursal.
     */
    public String getDirec_suc() {
        return direc_suc;
    }

    /**
     * Establece la dirección de la sucursal.
     *
     * @param direc_suc La nueva dirección de la sucursal.
     */
    public void setDirec_suc(String direc_suc) {
        this.direc_suc = direc_suc;
    }

    /**
     * Obtiene el número de teléfono de la sucursal.
     *
     * @return El número de teléfono de la sucursal.
     */
    public String getTelefono_suc() {
        return telefono_suc;
    }

    /**
     * Establece el número de teléfono de la sucursal.
     *
     * @param telefono_suc El nuevo número de teléfono de la sucursal.
     */
    public void setTelefono_suc(String telefono_suc) {
        this.telefono_suc = telefono_suc;
    }

    /**
     * Obtiene el correo electrónico de la sucursal.
     *
     * @return El correo electrónico de la sucursal.
     */
    public String getCorreo_suc() {
        return correo_suc;
    }

    /**
     * Establece el correo electrónico de la sucursal.
     *
     * @param correo_suc El nuevo correo electrónico de la sucursal.
     */
    public void setCorreo_suc(String correo_suc) {
        this.correo_suc = correo_suc;
    }

    /**
     * Obtiene el estado de la sucursal.
     *
     * @return El estado de la sucursal.
     */
    public String getEstadoSuc() {
        return estadoSuc;
    }

    /**
     * Establece el estado de la sucursal.
     *
     * @param estadoSuc El nuevo estado de la sucursal.
     */
    public void setEstadoSuc(String estadoSuc) {
        this.estadoSuc = estadoSuc;
    }

}
