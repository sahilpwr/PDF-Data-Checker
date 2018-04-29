package com.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.gui.Input;

public class PDF {
	
	public HashMap<String, Integer> scanPDF(String sectionType,String filePath,int fromPage,int toPage) throws IOException, ParseException
	{
		PDFTextStripper pdfStripper = null;
	    PDDocument pdDoc = null;
	    COSDocument cosDoc = null;
	    File file = new File(filePath);
	   
	    
	    RandomAccessRead randomacess=new RandomAccessFile(file, "r");
        PDFParser parser = new PDFParser(randomacess);
        parser.parse();
        cosDoc = parser.getDocument();
        pdfStripper = new PDFTextStripper();
        pdDoc = new PDDocument(cosDoc);
        pdfStripper.setStartPage(fromPage);
        pdfStripper.setEndPage(toPage);
        String parsedText = pdfStripper.getText(pdDoc);
        System.out.println(parsedText);
        
        
        
        if(sectionType.equals("total"))
        {
     	     Total total=new Total();
     	     return total.parseTotal(parsedText);
     	     
        }
        else if(sectionType.equals("main"))
        {
	 	    	   Main main=new Main();
	 	    	   return main.parseMain(parsedText);  
        }
        else if(sectionType.equals("online"))
        {
	 	    	 UFOnline online=new UFOnline();
	 	    	 return online.parseUFOnline(parsedText);
        }
        
        
		return null;
 		
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
	{
		PDF pdf=new PDF();
		
		Input input=new Input(pdf);
		input.setVisible(true);
		
		
		
    
      
       

	}

}
