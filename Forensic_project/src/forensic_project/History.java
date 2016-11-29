/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forensic_project;

import java.util.ArrayList;
import forensic_project.Tokens;

/**
 *
 * @author Ayaa
 */
public class History implements IFile {
    //array list of history content
    public ArrayList<HistoryContent> historyContent=new ArrayList<HistoryContent>();
    //list of titles
    public ArrayList<String> TitlesList=new ArrayList<String>();
    //list of urls
    public ArrayList<String> URLList=new ArrayList<String>();
    //list of pagecontent words
     public ArrayList<String> PageContentList=new ArrayList<String>();
     //intersts list
     public ArrayList<String> InterestsList=new ArrayList<String>();
    //file path
    public String path;
    
    
    @Override
    public ArrayList<HistoryContent> GetFile(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SetFilePath(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //get file of history,cashes,...
    @Override
    public String GetFilePath() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //get keywords from title
    public ArrayList<String> GetTitleKeyword(ArrayList<String> TitleList){
        
       return TitleList; 
    }
    //get url keywords
    public ArrayList<String> GetURLKeyword(ArrayList<String> URLList){
        
       return URLList; 
    }
    //get page content keywords
    public ArrayList<String> GetPageContentKeyword(ArrayList<String> PageContentList){
        
       return PageContentList; 
    }
    //find interests from keywords list
    public ArrayList<String> FindInterest(ArrayList<String> TitleList,ArrayList<String> URLList,ArrayList<String> PAgeContentList){
       
        return  InterestsList;
    }
    
}
