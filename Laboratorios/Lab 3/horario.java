/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.Calendar;
//atributos
public class horario {
    private int ano;
    private int mes;
    private int dia;
    private String horaPost;
    Calendar calendario = Calendar.getInstance();
    

//constructores con y sin parametros
    public horario(){
        this.horaPost = "00:00:00";
        this.ano = 0;
        this.mes = 0;
        this.dia = 0;
        
    }
    
    public horario(int ano, int mes, int dia){
        horaPost = horaMomento();
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        

    }

    //sets y gets
    /** 
     * @return int
     */
    public int getAno() {
        return this.ano;
    }

    
    /** 
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    
    /** 
     * @return int
     */
    public int getMes() {
        return this.mes;
    }

    
    /** 
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    
    /** 
     * @return int
     */
    public int getDia() {
        return this.dia;
    }

    
    /** 
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    
    /** 
     * @return String
     */
    public String getHoraPost() {
        return this.horaPost;
    }

    
    /** 
     * @param horaPost
     */
    public void setHoraPost(String horaPost) {
        this.horaPost = horaPost;
    }

    
    /** 
     * @return Calendar
     */
    public Calendar getCalendario() {
        return this.calendario;
    }

    
    /** 
     * @param calendario
     */
    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    
    /** 
     * @return String
     */
    public String fechaActual(){
        int day = calendario.get(Calendar.DAY_OF_WEEK)-1;
        int month = calendario.get(Calendar.MONTH)+1;
        int year = calendario.get(Calendar.YEAR);
        
        
        return day+"/"+month+"/"+year;
    }
    

    
    /** 
     * @return String
     * calcula la hora
     */
    public String horaMomento(){
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        return hora+":"+minutos;
    }



    
    /** 
     * @return String 
     * to string
     */

    @Override
    public String toString() {
        return "{" +
            " ano='" + getAno() + "'" +
            ", mes='" + getMes() + "'" +
            ", dia='" + getDia() + "'" +
            ", horaPost='" + getHoraPost() + "'" +
            ", calendario='" + getCalendario() + "'" +
            "}";
    }

    
}

