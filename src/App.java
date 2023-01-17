public class App {
    public static void main(String[] args){
        String input = "BCABA";
        boolean found = false;
        char character = 0;

        for(int i=0; i<input.length(); i++){         
            if(!found){
                character = input.charAt(i);  
                for(int j=i+1; j<input.length(); j++){
                    if(character == input.charAt(j)){
                        found = true;
                        break;
                    }
                }
            }
            else{
                break;
            }
        }

        if(found == true){
            System.out.println("Huruf berulang pertama adalah "+character);
        }
        else{
            System.out.println("Tidak ada huruf berulang");
        }
    }
}
