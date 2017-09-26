/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanel;

public abstract class AbstractChanel implements Chanel {

    protected String type;
    protected Integer size;
    protected Integer method;
    
    @Override
    public String getType() {
        return type;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public Integer getMethod() {
        return method;
    }
 
    

}
