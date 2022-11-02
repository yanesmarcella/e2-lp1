package log;
import java.util.ArrayList;
//import java.util.List;
import java.util.HashSet;

public class Dados {
    ArrayList<Caixa> caixas = new ArrayList<>();
     
     public boolean cadastrarCaixa (Caixa c){
         if (c != null){
             caixas.add(c);   
             return true;
         }else{
             return false;
         }
           
     }
       
   public String numeroCaixa (){
      return caixas.size() + "";
      }
    
    
   HashSet<String> id = new HashSet<>();
    public HashSet<String> retornaHash(){
       return  id;
   } 
   
    public void cadastroId (Caixa c){
            id.add(c.getId());
           
        
    }
    
    public HashSet<String> exibeIds(){
        return id;
    } 
   

}


     
    


    

