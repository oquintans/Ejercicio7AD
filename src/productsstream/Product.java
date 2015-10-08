/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsstream;

/**
 *
 * @author Óscar
 */
public class Product {

    private String cod;
    private String descrip;
    private int precio;

    public Product() {
        cod = "";
        descrip = "";
        precio = 0;
    }

    public Product(String cod, String descrip, int precio) {
        this.cod = cod;
        this.descrip = descrip;
        this.precio = precio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
