/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forensic_project;

import java.util.ArrayList;
import forensic_project.HistoryContent;
/**
 *
 * @author Ayaa
 */
//interface class
public interface IFile {
    
    
    //set file path
    public void SetFilePath(String path);
    //get file path
    public String GetFilePath();
    //get file of history,cashes,... and return list of historyContent
    public ArrayList<HistoryContent> GetFile(String path);
}
