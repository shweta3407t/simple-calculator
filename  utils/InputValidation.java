package utils;

public class InputValidation {
 
    private static boolean isNumaric(int num){
        if(num == null || num.isEmpty()){
            return false;
        }
    
        try{
            Double.parseDouble(num);
            Integer.parseInt(num);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
