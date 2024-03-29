package controlador;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ComprobanteDAO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Comprobante;
import modelo.Configuracion;

public class GeneradorComprobante extends GenerarReporte{
    
    public GeneradorComprobante(Configuracion configuracion) {
        super(configuracion);
    }
    
    public void crearComprobante() {
        ComprobanteDAO cdao = new ComprobanteDAO();
        Comprobante comprobante = cdao.findBy("");
        nombreArchivo = "comprobantes/comprobante-" + comprobante.getId() + ".pdf";
        try {
            FileOutputStream ficheroPdf = new FileOutputStream(nombreArchivo);
            PdfWriter.getInstance(doc, ficheroPdf);
            Image imagen = Image.getInstance("logo.png");
            imagen.scaleAbsolute(new Rectangle(50, 50));
            doc.open();
            imagen.setAlignment(Element.ALIGN_CENTER);
            doc.add(imagen);
            agregarLinea("---------------------------------------------------------------", 10);
            agregarLineaCenter(configuracion.getRazonSocial(), 10);
            agregarLineaCenter("RUC: " + configuracion.getRUC(), 12);
            agregarLineaCenter(configuracion.getNombreComercial() + " - " + "NUEVO CHIMBOTE", 12);
            agregarLineaCenter("Boleta N° " + comprobante.getTicket().getId(), 16);
            agregarLinea("---------------------------------------------------------------", 10);
            agregarLinea("Placa                   : " + comprobante.getTicket().getPlaca(), 10);
            agregarLinea("Descripción         : Parqueo vehícular", 10);
            agregarLinea("Fecha emisión    : " + comprobante.getFecha(), 10);
            agregarLinea("Importe total       :                                     S/ " + comprobante.getImporte(), 10);
            agregarLinea("---------------------------------------------------------------", 10);
            agregarLineaCenter("Gracias por su visita, vuelva pronto.", 8);
            agregarLinea("---------------------------------------------------------------", 10);
            doc.close();
            System.out.println(nombreArchivo + " creado");
        } catch (DocumentException | IOException e) {
            Logger.getLogger(GeneradorComprobante.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}