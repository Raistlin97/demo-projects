/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gs.tools.doc.extractor.core;

/**
 *
 * @author sabuj
 */
public interface WebDocumentExtractor {
    
    long extract(String sourceUrl, String targetFolderName) throws Exception;
    
}