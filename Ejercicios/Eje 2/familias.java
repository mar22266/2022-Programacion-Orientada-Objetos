public class familias {
    //atributos de la familia
    private String familia1;
    private String familia2;
    private String familia3;
    private int edad;
    private int hijos;



    //valores iniciales de los atributos
    public familias(){
        edad = 0;
        familia1 = "";
        familia2 = "";
        familia3 = "";
        hijos = 0;
    }
    //establecer familias atributos
    public familias(int edad,int hijos, String familia1, String familia2, String familia3){
        this.hijos = edad;
        this.familia1 = familia1;
        this.familia2= familia2;
        this.familia3 = familia3;
        this.hijos = hijos;
    }

    //contructor familia 1
    public void familia1(){

    
        System.out.println("Solo puede adoptar perros pequeños y medianos excepto razas peligrosas \n");
      
    }
    //constructor familia 2
    public void familia2(){
            System.out.println("Solo puede adoptar perros pequeños y labradores temporalmente \n");
    
    }
    //constructor familia 3
    public void familia3(){

            System.out.println("Puede adoptar cualquier perro\n");
    
    }




    //edad hijos
    public familias(int edad){
        this.edad = edad;
    }

    
    /** 
     * @return int SETS Y GETS de los atributos de la familia
     */
    public int getEdad() {
        return this.edad;
    }

    
    /** 
     * @return String
     */
    public String getFamilia1() {
        return this.familia1;
    }

    
    /** 
     * @param familia1
     */
    public void setFamilia1(String familia1) {
        this.familia1 = familia1;
    }

    
    /** 
     * @return String
     */
    public String getFamilia2() {
        return this.familia2;
    }

    
    /** 
     * @param familia2
     */
    public void setFamilia2(String familia2) {
        this.familia2 = familia2;
    }

    
    /** 
     * @return String
     */
    public String getFamilia3() {
        return this.familia3;
    }

    
    /** 
     * @param familia3
     */
    public void setFamilia3(String familia3) {
        this.familia3 = familia3;
    }
	
    /** 
     * @return int
     */
    public int getHijos() {
		return this.hijos;
	} 

	
    /** 
     * @param hijos
     */
    public void setHijos(int hijos) {
		this.hijos = hijos;
	}

}


