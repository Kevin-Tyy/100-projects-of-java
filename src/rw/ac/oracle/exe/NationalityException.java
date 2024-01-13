package rw.ac.oracle.exe;

public class NationalityException extends Exception{
    private String message;
    public NationalityException(String message){
       // super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "Custom Exception: " + message;
    }
}
