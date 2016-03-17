/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosapp.command;

import java.io.File;

/**
 *
 * @author Prakriti
 */
public class MDCommand extends DosCommand {

    @Override
    public void execute(String[] params) {
        if(params.length>1){
                        new File(params[1]).mkdir();
                    
                    }
        
    }
    
}
