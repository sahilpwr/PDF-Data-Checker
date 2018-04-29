package com.pdf;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Innovation {

	public HashMap<String, Integer>  parseUFOnline(String parsedText) throws ParseException
	{
	
		Map<String, Integer> sectionTotals=new HashMap();
        int totals=0;
        ArrayList<String> subTitles = new ArrayList<String>();
        ArrayList<String> subTitlesBreakDown=new ArrayList<String>();
        ArrayList<Integer> totalBreakdown=new ArrayList<Integer>();
    
        
        subTitles.add("Innovation Academy Students by Gender");
        subTitles.add("Innovation Academy Students by Ethnicity");
       // subTitles.add("UF Online Students by Level");
        subTitles.add("Innovation Academy Students by Colege");
        subTitles.add("Innovation Academy Students by Age");
    
    
    
        
       subTitlesBreakDown.add("Innovation Academy Students by Residency");
        subTitlesBreakDown.add("Innovation Academy Students by Admit Status");
       subTitlesBreakDown.add("Innovation Academy Students Credit Hours");
       subTitlesBreakDown.add("Innovation Academy Students Enrolment Status");
        
       String[] lines = parsedText.split("\\r?\\n");
   	   Pattern p = Pattern.compile(".*\\d+.*"); 
       
       for(int i=0;i<lines.length;i++)
       {
    	   		Matcher m = p.matcher(lines[i]); 
    	     if(subTitlesBreakDown.contains(lines[i])||subTitles.contains(lines[i])||(m.matches()&&!lines[i].contains("%")&&!lines[i].contains("years")))
    	     {
    	    	 	
    	    	 
	    	    	 if(!subTitlesBreakDown.contains(lines[i])&&!subTitles.contains(lines[i])&&!lines[i].contains("Total Number of Students")&&!lines[i].contains("Grand Total")&&!lines[i].contains("(As of")&&!lines[i].contains("Total Credit Hours"))
	    	    	 {
	    	    		 System.out.println(lines[i]);
	    	    		// System.out.println(NumberFormat.getNumberInstance(java.util.Locale.US).parse(lines[i]));
	    	    		 totals+=NumberFormat.getNumberInstance(java.util.Locale.US).parse(lines[i]).intValue();
	    	    		 totalBreakdown.add(NumberFormat.getNumberInstance(java.util.Locale.US).parse(lines[i]).intValue());
	    	    		 
	    	    	 }
	    	    	 if(lines[i].contains("UF Online Students by Residency"))
	    	    	 {
	    	    		System.out.println(lines[i]);
	    	    		 totals=totalBreakdown.get(0)+totalBreakdown.get(1);	    	    
              	 sectionTotals.put(lines[i], totals);
	    	    		
	    	    		 totals=0;
	    	    		
	    	    		 totalBreakdown.clear();
	    	    		 
	    	    	 }
	    	    	 if(lines[i].contains("UF Online Students by Enrolment Status"))
	    	    	 {
	    	    		System.out.println(lines[i]);
	    	    		 totals=totalBreakdown.get(0)+totalBreakdown.get(1);
	    	    		 sectionTotals.put(lines[i], totals);
	    	    		 totals=0;
	    	    			

	    	    		 totalBreakdown.clear();
	    	    		 
	    	    	 }
	    	    	 if(lines[i].contains("UF Online Students by Admit Status"))
	    	    	 {
	    	    		 
	    	    		System.out.println(lines[i]);
	    	    		int size=totalBreakdown.size();
	    	    		
	    	    		 totals=totalBreakdown.get(size-1)+totalBreakdown.get(size-2);
	    	    		 if(!sectionTotals.containsKey("UF Online Students by Admit Status"))
	    	    			 	sectionTotals.put(lines[i], totals);
	    	    		 else
	    	    		   sectionTotals.put(lines[i]+" ", totals);
	    	    		 
	    	    		 totals=0;
	    	    			System.out.println("sahil"+totalBreakdown.get(size-1)+totalBreakdown.get(size-2));

	    	    		 totalBreakdown.clear();
	    	    		 
	    	    	 }
	    	    	 if(lines[i].contains("UF Online Student Credit Hours"))
	    	    	 {
	    	    		 
	    	    		System.out.println(lines[i]);
	    	    		int size=totalBreakdown.size();
	    	    		
	    	    		 totals=totalBreakdown.get(0)+totalBreakdown.get(1);
	    	    		 if(!sectionTotals.containsKey("UF Online Students by Admit Status"))
	    	    			 	sectionTotals.put(lines[i], totals);
	    	    		 else
	    	    		   sectionTotals.put(lines[i], totals);
	    	    		 
	    	    		 totals=0;
	    	    			System.out.println("sahil"+totalBreakdown.get(size-1)+totalBreakdown.get(size-2));

	    	    		 totalBreakdown.clear();
	    	    		 
	    	    	 }
	    	    	 if(lines[i].contains("UF Online Enrolment"))
	    	    	 {
	    	    		 totalBreakdown.clear();
	    	    	 }
	    	    	 else if(subTitles.contains(lines[i]))
	    	    	 {
	    	    		 System.out.println(lines[i]);
	    	    		 System.out.println("total"+totals);
	    	    		 sectionTotals.put(lines[i], totals);
	    	    		 totals=0;
	    	    		 totalBreakdown.clear();
	    	    	 }
    	    	 
    	     }
       }
	for (String v:sectionTotals.keySet())
		System.out.println(v+":"+sectionTotals.get(v));
	
	
	return (HashMap<String, Integer>) sectionTotals;
			
	}

	
}
