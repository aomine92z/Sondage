/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sondage;

import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author Amine
 */
public class Table_mode_etu extends AbstractTableModel {
    
    private List<String> listeDesReponses;	

 
   public Table_mode_etu(List<String> valListeDesReponses) {
       this.listeDesReponses = valListeDesReponses;

   }
 
   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
       if (columnIndex==0){
           String numRep = "Réponse numéro " + rowIndex;
           return numRep;
       }
       else if (columnIndex==1){
           return this.listeDesReponses.get(rowIndex);
       }
       return null;
   }
 
   @Override
   public int getRowCount() {
       return listeDesReponses.size(); // le nombre de lignes
   }
 
   @Override
   public int getColumnCount() {
       return 2; 
   }
 
}
