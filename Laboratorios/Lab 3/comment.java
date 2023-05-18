/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */

public class comment {
    private String comentario; 

    //constructor con y sin parametros
    public comment(String comentario){
        this.comentario= comentario;
    }

    public comment(){
        this.comentario= "ninguno";
    }

    
    /** 
     * @param comentario
     */
    //sets y gets
    public void setComment(String comentario) {
        this.comentario = comentario;
    }
    
    
    /** 
     * @return String
     */
    public String getComment(){
        return comentario;
    }

    
    /** 
     * @return String
     */
    // to string
    public String toString() {
        return " "+ comentario;
    }
}
