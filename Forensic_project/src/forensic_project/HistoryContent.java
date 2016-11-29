/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forensic_project;

import javax.print.attribute.DateTimeSyntax;

/**
 *
 * @author Ayaa
 */
//history content class includes retrun of getfile 
public class HistoryContent {
    //url
    public String URL;
    //title
    public String Title;
    //visitCount
    public int VisitCount;
    //visited time and date
    public DateTimeSyntax VisitedDate;
    
    //set URL
    public void SetURL(String URL)
    {
        this.URL=URL;
    }
    //get url
    public String GetURL(){
        
        return this.URL;
    }
    //set title
    public void SetTitle(String Title)
    {
        this.Title=Title;
    }
    //getTitle
     public String GetTitle(){
        
        return this.Title;
    }
     //set VisitCount
      public void SetVisitCount(int  VisitCount)
    {
        this.VisitCount=VisitCount;
    }
      //get visit count
       public int GetVisitCount(){
        
        return this.VisitCount;
    }
       //set visit date
       public void SetVisitedDate(DateTimeSyntax VisitedDate)
    {
        this.VisitedDate=VisitedDate;
    }
       //get visit date
        public DateTimeSyntax GetVisitedDate(){
        
        return this.VisitedDate;
    }
}
