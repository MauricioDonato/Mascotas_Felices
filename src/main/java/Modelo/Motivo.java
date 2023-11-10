/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.gson.annotations.SerializedName;

/**Esta el Modelo de motivo
 *
 * @author mauri
 */
public class Motivo {
@SerializedName("url")
    private String url;

    @SerializedName("id_proc")
    private String id_proc;

    @SerializedName("nombre_proc")
    private String nombre_proc;

    @SerializedName("precio_proc")
    private String precio_proc;
    @SerializedName("descrip_proc")
    private String descrip_proc;
    @SerializedName("estado_proc")
    private String estado_proc;
    
     /**
     * Constructor de la clase Motivo.
     *
     * @param url           La URL del motivo.
     * @param id_proc       El identificador del procedimiento.
     * @param nombre_proc   El nombre del procedimiento.
     * @param precio_proc   El precio del procedimiento.
     * @param descrip_proc  La descripción del procedimiento.
     * @param estado_proc   El estado del procedimiento.
     */
    public Motivo(String url, String id_proc, String nombre_proc, String precio_proc, String descrip_proc, String estado_proc) {
        this.url = url;
        this.id_proc = id_proc;
        this.nombre_proc = nombre_proc;
        this.precio_proc = precio_proc;
        this.descrip_proc = descrip_proc;
        this.estado_proc = estado_proc;
    }

    /**
     * Obtiene la URL del motivo.
     *
     * @return La URL del motivo.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Establece la URL del motivo.
     *
     * @param url La nueva URL del motivo.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Obtiene el identificador del procedimiento.
     *
     * @return El identificador del procedimiento.
     */
    public String getId_proc() {
        return id_proc;
    }

    /**
     * Establece el identificador del procedimiento.
     *
     * @param id_proc El nuevo identificador del procedimiento.
     */
    public void setId_proc(String id_proc) {
        this.id_proc = id_proc;
    }

    /**
     * Obtiene el nombre del procedimiento.
     *
     * @return El nombre del procedimiento.
     */
    public String getNombre_proc() {
        return nombre_proc;
    }

    /**
     * Establece el nombre del procedimiento.
     *
     * @param nombre_proc El nuevo nombre del procedimiento.
     */
    public void setNombre_proc(String nombre_proc) {
        this.nombre_proc = nombre_proc;
    }

    /**
     * Obtiene el precio del procedimiento.
     *
     * @return El precio del procedimiento.
     */
    public String getPrecio_proc() {
        return precio_proc;
    }

    /**
     * Establece el precio del procedimiento.
     *
     * @param precio_proc El nuevo precio del procedimiento.
     */
    public void setPrecio_proc(String precio_proc) {
        this.precio_proc = precio_proc;
    }

    /**
     * Obtiene la descripción del procedimiento.
     *
     * @return La descripción del procedimiento.
     */
    public String getDescrip_proc() {
        return descrip_proc;
    }

    /**
     * Establece la descripción del procedimiento.
     *
     * @param descrip_proc La nueva descripción del procedimiento.
     */
    public void setDescrip_proc(String descrip_proc) {
        this.descrip_proc = descrip_proc;
    }

    /**
     * Obtiene el estado del procedimiento.
     *
     * @return El estado del procedimiento.
     */
    public String getEstado_proc() {
        return estado_proc;
    }

    /**
     * Establece el estado del procedimiento.
     *
     * @param estado_proc El nuevo estado del procedimiento.
     */
    public void setEstado_proc(String estado_proc) {
        this.estado_proc = estado_proc;
    }
  /**
     * Establece el estado del procedimiento.
     *
     * @return el estado con error
     */
    public String setEstado_proc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
