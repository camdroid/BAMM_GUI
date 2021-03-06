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
 * @author Cam Herringshaw
 */
enum ModelType { ESModel, Phenotypic };
public class Model {
    ModelType modelType;
    String treeFilename;
    boolean runMCMC;
    boolean loadEventData = false;

    public boolean getLoadEventData() {
        return loadEventData;
    }

    public void setLoadEventData(boolean loadEventData) {
        this.loadEventData = loadEventData;
    }

    public String getEventDataInfile() {
        return eventDataInfile;
    }

    public void setEventDataInfile(String eventDataInfile) {
        this.eventDataInfile = eventDataInfile;
    }
    String eventDataInfile;
    
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
    String getModelTypeString() {
        return ((getModelType() == ModelType.Phenotypic) ? "trait" : "extinctionspeciation");
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
