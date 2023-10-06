/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.google.gson.annotations.SerializedName;

/**
 *
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

    public Sucursal(String url, String id_suc, String nombre_suc, String direc_suc, String telefono_suc, String correo_suc, String estadoSuc) {
        this.url = url;
        this.id_suc = id_suc;
        this.nombre_suc = nombre_suc;
        this.direc_suc = direc_suc;
        this.telefono_suc = telefono_suc;
        this.correo_suc = correo_suc;
        this.estadoSuc = estadoSuc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId_suc() {
        return id_suc;
    }

    public void setId_suc(String id_suc) {
        this.id_suc = id_suc;
    }

    public String getNombre_suc() {
        return nombre_suc;
    }

    public void setNombre_suc(String nombre_suc) {
        this.nombre_suc = nombre_suc;
    }

    public String getDirec_suc() {
        return direc_suc;
    }

    public void setDirec_suc(String direc_suc) {
        this.direc_suc = direc_suc;
    }

    public String getTelefono_suc() {
        return telefono_suc;
    }

    public void setTelefono_suc(String telefono_suc) {
        this.telefono_suc = telefono_suc;
    }

    public String getCorreo_suc() {
        return correo_suc;
    }

    public void setCorreo_suc(String correo_suc) {
        this.correo_suc = correo_suc;
    }

    public String getEstadoSuc() {
        return estadoSuc;
    }

    public void setEstadoSuc(String estadoSuc) {
        this.estadoSuc = estadoSuc;
    }

}
