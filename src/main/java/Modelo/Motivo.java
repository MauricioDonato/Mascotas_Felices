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
    public Motivo(String url, String id_proc, String nombre_proc, String precio_proc, String descrip_proc, String estado_proc) {
        this.url = url;
        this.id_proc = id_proc;
        this.nombre_proc = nombre_proc;
        this.precio_proc = precio_proc;
        this.descrip_proc = descrip_proc;
        this.estado_proc = estado_proc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId_proc() {
        return id_proc;
    }

    public void setId_proc(String id_proc) {
        this.id_proc = id_proc;
    }

    public String getNombre_proc() {
        return nombre_proc;
    }

    public void setNombre_proc(String nombre_proc) {
        this.nombre_proc = nombre_proc;
    }

    public String getPrecio_proc() {
        return precio_proc;
    }

    public void setPrecio_proc(String precio_proc) {
        this.precio_proc = precio_proc;
    }

    public String getDescrip_proc() {
        return descrip_proc;
    }

    public void setDescrip_proc(String descrip_proc) {
        this.descrip_proc = descrip_proc;
    }

    public String getEstado_proc() {
        return estado_proc;
    }

    public void setEstado_proc(String estado_proc) {
        this.estado_proc = estado_proc;
    }
    
    
}
