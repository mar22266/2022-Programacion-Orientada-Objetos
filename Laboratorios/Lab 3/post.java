/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.ArrayList;


public abstract class post {
    //atributos
    horario tiempo = new horario();
    protected ArrayList<comment> comentarios = new ArrayList<>(); 
    protected ArrayList<String> hashtags = new ArrayList<>();
    protected String nombre; 
    protected int likes;
    protected String hora;
    protected String fecha;
    protected boolean existe;


    //constructor con parametros
    public post(String nombre,ArrayList<String> hashtagsList, String fecha){
        this.nombre = nombre;
        likes = 0;
        hora = tiempo.horaMomento();
        this.fecha = fecha;
        for (int i = 0; i < hashtagsList.size(); i++){
            hashtags.add(hashtagsList.get(i));
        }
 
    }


    
    /** sets y gets
     * @return horario
     */
    public horario getTiempo() {
        return this.tiempo;
    }

    
    /** 
     * @param tiempo
     */
    public void setTiempo(horario tiempo) {
        this.tiempo = tiempo;
    }

    
    /** 
     * @return ArrayList<comment>
     */
    public ArrayList<comment> getComentarios() {
        return this.comentarios;
    }

    
    /** 
     * @param comentarios
     */
    public void setComentarios(ArrayList<comment> comentarios) {
        this.comentarios = comentarios;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getHashtags() {
        return this.hashtags;
    }

    
    /** 
     * @param hashtags
     */
    public void setHashtags(ArrayList<String> hashtags) {
        this.hashtags = hashtags;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return int
     */
    public int getLikes() {
        return this.likes;
    }

    
    /** 
     * @param likes
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    
    /** 
     * @return String
     */
    public String getHora() {
        return this.hora;
    }

    
    /** 
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    
    /** 
     * @return String
     */
    public String getFecha() {
        return this.fecha;
    }

    
    /** 
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    /** 
     * @return boolean
     */
    public boolean isExiste() {
        return this.existe;
    }

    
    /** 
     * @return boolean
     */
    public boolean getExiste() {
        return this.existe;
    }

    
    /** 
     * @param existe
     */
    public void setExiste(boolean existe) {
        this.existe = existe;
    }


 
    
    /** 
     * @return int
     * likear un post
     */
    public int likear(){
		if (likes<0){
			likes = 1;
		}else{
            likes= likes+1;
        }
		return likes; 
	}


    
    /** 
     * @param comentario
     * agregar comentario 
     * @return ArrayList<comment>
     */
    public ArrayList<comment> Comentar(comment comentario){
        comentarios.add(comentario);
        return comentarios;
    }
  
	public abstract void mostrar();

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ "Likes:"+ likes ;
    }


    
}
