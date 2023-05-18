public class estudiante {
    
    private String nombre;
    private int edad;
    private String añoAcademico;
    private float cursos;
    private String centroEducativo;
    private int DPI;
    private String correo;
    private String contraseña;
/*se agregaron 2 clases extras cuales son correo y contraseña para el ingreso del usuario*/
    public estudiante(){
        nombre = " ";
        edad = 0;
        añoAcademico = " ";
        cursos = 0;
        centroEducativo = " ";
        DPI = 0;
        correo = "";
        contraseña = "";

    }
    public estudiante(String nombre, int edad, String añoAcademico, float cursos, String centroEducativo, int DPI, String correo, String contraseña){
        this.nombre = nombre;
        this.edad = edad;
        this.añoAcademico = añoAcademico;
        this.cursos = cursos;
        this.centroEducativo = centroEducativo;
        this.DPI = DPI;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    public String getAñoAcademico() {
        return añoAcademico;
    }
    public void setAñoAcademico(String añoAcademico) {
        this.añoAcademico = añoAcademico;
    }
    public String getCentroEducativo() {
        return centroEducativo;
    }
    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }
    public float getCursos() {
        return cursos;
    }
    public void setCursos(float cursos) {
        this.cursos = cursos;
    }
    public int getDPI() {
        return DPI;
    }
    public void setDPI(int dPI) {
        DPI = dPI;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    @Override
    public String toString(){
        String  cadena = "";
        cadena = "Nombre: "+nombre+"\nEdad:"+edad+"\nAñoAcademico:"+añoAcademico+"\nCentroEducativo:"+centroEducativo+
        "\nCursos:"+cursos+"\nDPI:"+DPI+"\nEdad:"+edad+"\nNombre:"+nombre+"\nCorreo:"+correo+"\nCntraseña:"+contraseña;
        return cadena;
    }
    /*
    *esta parte es para evitar que el mismo estudiante haga 2 usuarios con los mismos datos
    */
    public boolean equals(estudiante otraMateria){
        float diffNotas = Math.abs(this.cursos - otraMateria.getCursos());
        if (nombre.equals(otraMateria.getNombre()) && diffNotas < 0.001){
            return true;
        }
        return false;
    
}
}