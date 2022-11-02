package log;
public class Caixa {
    private String id;
    private String destinatario;  
    private float peso;   
    private String distribuidora;  
    private String conteudo;

    // CONSTRUTOR
    public Caixa(String id, String destinatario, float peso, String distribuidora, String conteudo) {
        this.id = id;
        this.destinatario = destinatario;
        this.peso = peso;
        this.distribuidora = distribuidora;
        this.conteudo = conteudo;
    }

    
    public Caixa() {
        
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

     public String getId() {
        return id;
    }

    public void setId(String codigoid) {
        this.id = codigoid;
    }
    public String getDestinatario(){  
        return destinatario;  
    }  

    public void setDestinatario(String destinatario){  
        this.destinatario = destinatario;  
    }  


     public float getPeso(){ 
        return peso;  
    }  

    public void setPeso(float peso){  
        this.peso = peso;  
    }  
   

    public String getDistribuidora(){  
        return distribuidora;  

    }  

    public void setDistribuidora(String distribuidora){  
        this.distribuidora = distribuidora; 

    }  
 
} 
 

