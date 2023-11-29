package co.edu.udistrital.controller;


import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PDF {

    public void prueba() {
              
        Document document = new Document();

        try {
         
            PdfWriter writer = PdfWriter.getInstance(document, 
                    new FileOutputStream("Sistemas de información HIDE & SEEK"));

         
            document.open();
            
       
            PdfContentByte cb = writer.getDirectContent();
            Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());

            //--------------------- pagina 1 --------------------------
    
            g.setColor(Color.GRAY);
            g.fillOval(252, 90, 280, 100);
                        
            Font font1 = new Font("Tahoma", Font.BOLD + Font.ITALIC, 35);
            g.setFont(font1);

            g.setColor(Color.BLACK);
            g.drawString("Datos  HIDE & SEEK", 147, 150);
            
            g.setColor(Color.WHITE);
            g.drawString(" HIDE & SEEK", 264, 150);
            
            ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/Logo.jpeg"));
            g.drawImage(img1.getImage(), 200, 250, 200, 200, null);
            
            Font font2 = new Font("Tahoma", Font.PLAIN, 15);
            g.setFont(font2);
            g.setColor(Color.BLACK);
            g.drawString("Estos son los datos de análisis de los cupos de tarjeta de los usiario de ", 60, 470);
            g.drawString("la plataforma HIDE & SEEK unicamente válido para administradores.", 65 , 490);
            
            document.newPage();
            //--------------------- pagina 2 --------------------------



Font font3 = new Font("Tahoma", Font.BOLD, 20);
g.setFont(font3);

g.setColor(Color.BLACK);
g.drawString("Resultados del Análisis", 220, 100);

// Aquí debes colocar el código para calcular la media, la mediana y la moda
double media =1; // Reemplaza con el método o fórmula adecuada
double mediana = 2; // Reemplaza con el método o fórmula adecuada
double moda = 2; // Reemplaza con el método o fórmula adecuada

Font font4 = new Font("Tahoma", Font.PLAIN, 15);
g.setFont(font4);

g.drawString("Media: ________", 100, 200);
g.drawString(String.format("Media: %.2f", media), 100, 200);

Image imgModa = Image.getInstance(getClass().getResource("/imagenes/Logo.jpeg"));
imgModa.setAbsolutePosition(100, 480);  // Ajusta la posición según tus necesidades
imgModa.scaleToFit(100, 100);
document.add(imgModa);




g.drawString("Mediana: ________", 100, 320);
g.drawString(String.format("Mediana: %.2f", mediana), 100, 320);

Image imgMediana = Image.getInstance(getClass().getResource("/imagenes/Logo.jpeg"));
imgMediana.setAbsolutePosition(100, 360);  // Ajusta la posición según tus necesidades
imgMediana.scaleToFit(100, 100);
document.add(imgMediana);


g.drawString("Moda: ________", 100, 440);
g.drawString(String.format("Moda: %.2f", moda), 100, 440);

Image imgMedia = Image.getInstance(getClass().getResource("/imagenes/Logo.jpeg"));
imgMedia.setAbsolutePosition(100, 240);  // Ajusta la posición según tus necesidades
imgMedia.scaleToFit(100, 100);
document.add(imgMedia);





            
            
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            System.err.println(ex.getMessage());
            
        }
        // step 5: we close the document
        document.close();

        JOptionPane.showMessageDialog(null, 
                "Se creo el archivo 'Sistemas de información HIDE & SEEK' en la carpeta del proyecto");
}

    public static void main(String[] args) {
        PDF obj = new PDF();
        obj.prueba();
    }
}
