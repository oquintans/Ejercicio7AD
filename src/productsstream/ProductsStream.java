/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Óscar
 */
public class ProductsStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file = "produtos.txt";
        Product po1 = new Product("cod1", "parafusos", 3);
        Product po2 = new Product("cod2", "arandelas", 4);
        Product po3 = new Product();
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)));

            dos.writeUTF(po1.getCod());
            dos.writeUTF(po1.getDescrip());
            dos.writeInt(po1.getPrecio());

            dos.writeUTF(po2.getCod());
            dos.writeUTF(po2.getDescrip());
            dos.writeInt(po2.getPrecio());

            dos.close();

            while (dis.available() != 0) {
                String cod = dis.readUTF();
                String descrip = dis.readUTF();
                int precio = dis.readInt();

                po3.setCod(cod);
                po3.setDescrip(descrip);
                po3.setPrecio(precio);

                System.out.println(po3.getCod());
                System.out.println(po3.getDescrip());
                System.out.println(po3.getPrecio());
            }
            dis.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProductsStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProductsStream.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
