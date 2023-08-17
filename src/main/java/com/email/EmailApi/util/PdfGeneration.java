package com.email.EmailApi.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfGeneration {
    private static final String FILE_NAME = "D:\\EmailApi\\pdfdocs\\pdfolder.pdf";


    public void writeUsingIText() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("Ticket");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);


            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("Ticket Details", f));
            PdfPTable pdfPTable = new PdfPTable(2);
            pdfPTable.setWidthPercentage(100);
            pdfPTable.setSpacingAfter(10f);
            pdfPTable.setSpacingBefore(10f);

            //Create cells
            PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Cell 1"));
            PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Cell 2"));

            //Add cells to table
            pdfPTable.addCell(pdfPCell1);
            pdfPTable.addCell(pdfPCell2);


            //Add content to the document using Table objects.
            document.add(pdfPTable);


            //close
            document.close();

            System.out.println("Done");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

