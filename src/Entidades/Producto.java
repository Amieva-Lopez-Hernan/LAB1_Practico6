package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JulianC
 */
// IMplementamos interfaz Comparable:
public class Producto implements Comparable<Producto> {
    
    int codigo;
    String descripcion;
    double precio;
    int stock;
    private Categoria rubro;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }
    // Usamos compareTo para ordenar nuestra lista de productos:
    @Override
    public int compareTo(Producto o) {
        
        if (this.codigo == o.codigo){
            return 0;
        } else {
            if (this.codigo > o.codigo){
                return 1;
            } else {
                return -1;
            }
        }
    }
    
    
}
