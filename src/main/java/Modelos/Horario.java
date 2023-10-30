/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author mauri
 * Esta es la modelo de Asistente
 */
public class Horario {    private String url;
    private String id_hora;
    private String fecha;
    private String hora;
    private String estado;
    private String rut_cli;
    private String nombre_cli;
    private String telefono_cli;
    private String correo_cli;
    private String rut_vet;
    private String sucursal;

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

   

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId_hora() {
        return id_hora;
    }

    public void setId_hora(String id_hora) {
        this.id_hora = id_hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRut_cli() {
        return rut_cli;
    }

    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public String getRut_vet() {
        return rut_vet;
    }

    public void setRut_vet(String rut_vet) {
        this.rut_vet = rut_vet;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
}
