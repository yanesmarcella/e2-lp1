package log;
import java.util.ArrayList;
//import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Dados {
    private ArrayList<Caixa> caixas = new ArrayList<>();
    private HashSet<String> caixa2 = new HashSet<>();
    private Map<String,String> id = new HashMap<>();
    private Map<String,String> destinatario = new HashMap<>();
    private Map<String,String> peso = new HashMap<>();
    private Map<String, String> distribuidora = new HashMap<>();
    private Map<String,String> conteudo = new HashMap<>();
    
    
   public boolean Map (Caixa c) {
    

    if (c != null){
        id.put("Id",c.getId());
        destinatario.put("Destinatario", c.getDestinatario());
        peso.put("Peso", c.getPeso());
        distribuidora.put("Distribuidora", c.getDistribuidora());
        conteudo.put("Conteudo",c.getConteudo());
        
        return true;
        
    } else{
     return false;
            

}
   }

   public Map<String,String> retornaId(){
        return id;
    }
    
    public Map<String,String> retornaDestinatario(){
        return destinatario;
    }
    
    public Map<String,String> retornaPeso(){
        return peso;
    }
    
    public Map<String,String> retornaDistribuidora(){
        return distribuidora;
    }
    
    public Map<String,String> retornaConteudo(){
        return conteudo;
    }
    
    public HashSet<String> retornaHashSet(){
        return caixa2;
    }
    
    public boolean salvar(Caixa c){
     
        if (c != null){
            caixas.add(c);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean salvarHash(Caixa c){
        
        if (c != null){
            caixa2.add(c.getId());
            return true;
            
        } else{
            return false;
        }
    }
    
    public ArrayList<Caixa> retornaCaixas(){
        return caixas;
        
    }
    
 public String numeroCaixa (){
      return caixas.size() + "";
}
}





 // public boolean cadastrarCaixa (Caixa c){
   //      if (c != null){
   //          caixas.add(c);   
   //          return true;
   //      }else{
   //          return false;
    //     }
           
    // }
       
   //public String numeroCaixa (){
  //    return caixas.size() + "";
    //  }
    
    
   //HashSet<String> ids = new HashSet<>();
   //public HashSet<String> CadastrarId(String i) {
    //    ids.add(i);
       
  //HashMap<Integrer,String> caixas = new HashMap<Integrer, String>();
                
     
    


    

