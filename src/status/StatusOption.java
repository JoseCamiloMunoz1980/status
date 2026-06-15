/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author pepecamilo
 */
public class StatusOption {
    
    public enum Status{ZERO,ONE,TWO,THREE,FOUR}
    private Status status;
    
    public StatusOption(Status s)
    {
        this.status=s;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Status status) {
        this.status = status;
    }    
    
}
