/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amin0
 */
public class matriz {
  public static void main (String[] args) {
    double[][] mUnidad= new double[4][4];
  
    for (int i=0; i < mUnidad.length; i++) {
        for (int j=0; j < mUnidad[i].length; j++) {
            if (i == j) {
                mUnidad[i][j]=1.0;
            }else {
                mUnidad[i][j] = 0.0;
            }
        }
    }

    for (int i=0; i < mUnidad.length; i++) {
        for (int j=0; j < mUnidad[i].length; j++) {
            System.out.print(mUnidad[i][j]+"\t");
        }
        System.out.println("");
    }
  }
}