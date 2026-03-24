public class InputValidation {
 
    public static boolean isNumaric( String num){
        if(num == null || num.isEmpty()){
            return false;
        }
    
        try{
            Integer.parseInt(num);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
