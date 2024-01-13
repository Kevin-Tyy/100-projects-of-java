package rw.ac.oracle.exe;

public class CustomException extends Exception {
    private String country;
    public static void check(String country) throws NationalityException {
        if (country != "Rwanda" ) {
            throw new NationalityException("You are not a Rwandan");
        }
    }

    public static void main(String[] args) {
        try{
            check("Rwanda");
        }catch (NationalityException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Thank you for applying");
        }
    }
}
