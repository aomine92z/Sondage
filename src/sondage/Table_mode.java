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
public class Table_mode extends AbstractTableModel {
    
    private List<String> listeDesReponses;	
    private List<Integer> listeDesScores;
 
   public Table_mode(List<String> valListeDesReponses, List<Integer> valListeDesScores) {
       this.listeDesReponses = valListeDesReponses;
       this.listeDesScores = valListeDesScores;
   }
 
   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
       if (columnIndex==0){
           return this.listeDesReponses.get(rowIndex);
       }
       else if (columnIndex==1){
           return this.listeDesScores.get(rowIndex);
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

