public class perros {

    // atributos de los perros
	private String nombre;
    private String raza;
    private String color;
    private float estado;
    private int edad;
	private String tamaño;



	//valores iniciales de los perros
    public perros(){

        edad = 0;
        nombre = "";
        raza = "";
        color = "";
        estado = 0;
		tamaño = "";
    }
	//establecer perros atributos
    public perros(int edad, float estado, String nombre, String raza,String color, String tamaño){
        this.edad = edad;
        this.estado = estado;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
		this.tamaño = tamaño;


    }
    
    
	
	/** 
	 * @return int sets y getters de los atributos del perro
	 */
	public int getEdad() {
		return this.edad;
	}

	
	/** 
	 * @param edad
	 * @return perros
	 */
	public perros setEdad(int edad) {
		this.edad = edad;
		return null;
	}


    
	/** 
	 * @return String
	 */
	public String getNombre() {  
		return this.nombre;
	}

	
	/** 
	 * @param nombre
	 * @return perros
	 */
	public perros setNombre(String nombre) {
		this.nombre = nombre;
		return null;
    }
    
    
	/** 
	 * @return String
	 */
	public String getRaza(){

    return this.raza;
	}

	
	/** 
	 * @param raza
	 * @return perros
	 */
	public perros setRaza(String raza) {
		this.raza = raza;
		return null;
	}

	
	/** 
	 * @return String
	 */
	public String getColor() {
		return this.color;
	}

	
	/** 
	 * @param color
	 * @return perros
	 */
	public perros setColor(String color) {
		this.color = color;
		return null;
	}

	
	/** 
	 * @return float
	 */
	public float getEstado() {
		return this.estado;
	}
	

	
	/** 
	 * @param estado
	 * @return perros
	 */
	public perros setEstado(float estado) {
		this.estado = estado;
		return null;
	}

	
	/** 
	 * @return String
	 */
	public String getTamaño() {
		return this.tamaño;
	}

	
	/** 
	 * @param tamaño
	 */
	public perros setTamaño(String tamaño) {
		this.tamaño = tamaño;
		return null;
	}

	
	/** 
	 * @return String tostring de los atributos del perro
	 */
	public String toString(){
		return  " El nombre es: "+ nombre + ", " + "la edad es: " + edad + " ," + "la raza es: " + raza + " ," + "el estado es: " + estado + " ," + "el color es: " + color;
	}
    }



