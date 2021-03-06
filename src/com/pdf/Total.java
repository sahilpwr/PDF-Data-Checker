package com.pdf;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Total
{
	public HashMap<String, Integer> parseTotal(String parsedText) throws ParseException
	{
	
		HashMap<String, Integer> sectionTotals=new HashMap();
        int totals=0;
        ArrayList<String> subTitles = new ArrayList<String>();
    
        subTitles.add("Total Students by Residency");
        subTitles.add("Total Students by Gender");
        subTitles.add("Total Students by Ethnicity");
        subTitles.add("Total Students by Classification");
        subTitles.add("Total Students by Colege");
        subTitles.add("Total Students by Age");
        
        
       String[] lines = parsedText.split("\\r?\\n");
   	   Pattern p = Pattern.compile(".*\\d+.*"); 
       
       for(int i=0;i<lines.length;i++)
       {
    	   		Matcher m = p.matcher(lines[i]); 
    	     if(subTitles.contains(lines[i])||(m.matches()&&!lines[i].contains("%")&&!lines[i].contains("years")))
    	     {
	    	    	 if(!subTitles.contains(lines[i])&&!lines[i].contains("Total Number of Students")&&!lines[i].contains("(As of")&&!lines[i].contains("Main Campus"))
	    	    	 {
	    	    		 System.out.println(NumberFormat.getNumberInstance(java.util.Locale.US).parse(lines[i]));
	    	    		 totals+=NumberFormat.getNumberInstance(java.util.Locale.US).parse(lines[i]).intValue();
	    	    	 }
	    	    	 else if(!lines[i].contains("(As of"))
	    	    	 {
	    	    		
	    	    		 System.out.println(lines[i]);
	    	    		 System.out.println("total"+totals);
	    	    		 sectionTotals.put(lines[i], totals);
	    	    		 totals=0;
	    	    	 }
    	     }
       }
       
		
		
		return sectionTotals;
	}
}
