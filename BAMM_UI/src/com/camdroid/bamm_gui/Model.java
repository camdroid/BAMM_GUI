/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.camdroid.bamm_gui;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author camhe_000
 */
enum ModelType { ESModel, Phenotypic };
public class Model {
    ModelType modelType;
    String treeFilename;
    boolean runMCMC;
    
    void setTreeFile(String filename) {
        treeFilename = filename;
    }
    void setSeed(long seed) {
        //TODO Set seed
    }
    void setRunMCMC(boolean enable) {
        runMCMC = enable;
    }
    boolean getRunMCMC() {
        return runMCMC;
    }
    void setModelType(ModelType type) {
        modelType = type;
    }
    //TODO: Instead of using toString, I should make a method that accepts a file reference
    // and writes to that file.
    @Override
    public String toString() {
        String file = "";
        file += "#This is a comment and will not be read by BAMM.\n";
        file += ("modeltype = " + ((modelType == ModelType.Phenotypic) ? "phenotypic" : "extinctionspeciation") + "\n");
        
        
        return file;
    }
    
    ModelType getModelType() {
        return modelType;
    }
    String getTreeFilename() {
        return treeFilename;
    }
//    void printToFile(BufferedWriter writer) {
//        try{ 
//           
//        } catch(IOException ioe) {
//            ioe.printStackTrace();
//        }
//    }
}
