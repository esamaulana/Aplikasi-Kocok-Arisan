/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.error;

/**
 *
 * @author faldi
 */
public class KelompokArisanException extends Exception {

    /**
     * Creates a new instance of <code>AdminException</code> without detail
     * message.
     */
    public KelompokArisanException() {
    }

    /**
     * Constructs an instance of <code>AdminException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public KelompokArisanException(String msg) {
        super(msg);
    }
}
