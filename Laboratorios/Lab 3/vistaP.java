/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException; 

public class vistaP {
   private Scanner teclado = new Scanner(System.in);
   private  int o;
   
   /** 
    * @param m
    */


    public void m(String m){
        System.out.println(m);
    }
    
    
    /** 
     * @return int
     * menu principal
     */
    public int menuprin(){
		int o;
        System.out.println("\nAVISO: Para darle Play hay un post debe primero buscarlo ya sea por fecha o por # luego elegir el numero de Post y de esa forma se podra Reproducir su tipo de Post y tambien podra comentarlo o likearlo");
        m("\n" +"Elija una opcion: \n");
        System.out.println("1. Crear post");
        System.out.println("2. Buscar por fecha y likearlo o comentarlo ");
        System.out.println("3. Buscar post por hashtag y comentarlo o likearlo");
        System.out.println("4. Mostrar Todos los Posts");
        System.out.println("5. Salir");
        try {
            o = teclado.nextInt();
        } catch (InputMismatchException e) {
            m("Error Ingrese uno de los numeros anteriores");
            Scanner teclado = new Scanner(System.in);
            o = teclado.nextInt();
        }
		teclado.nextLine();
		return o;
    }

    
    /** 
     * @return int
     * menu de tipo de post
     */
    public int mPost(){
		int o;
                m("\n" +" Que post quiere subir? ");
                System.out.println("1. Texto");
                System.out.println("2. Multimedia ");
                System.out.println("3. Emoticon");
            try {
                o = teclado.nextInt();
            } catch (InputMismatchException exception
        ) {
                m("Pruebe otraz vez");
                Scanner teclado = new Scanner(System.in);
                o = teclado.nextInt();
            }
        
		teclado.nextLine();
		return o;
    }

    
    /** 
     * @return int
     * menu de multimedia
     */
    public int menuM(){
		int o;
                m("\n" +"Que tipo de post multimedia desea subir?");
                System.out.println("1. Imagen");
                System.out.println("2. Audio ");
                System.out.println("3. Video");
            try {
                o = teclado.nextInt();
            } catch (InputMismatchException e) {
                m("Pruebe otra vez");
                Scanner teclado = new Scanner(System.in);
                o = teclado.nextInt();
            }
		teclado.nextLine();
		return o;
    }

    
    /** 
     * @return String
     * ingresar nombre
     */
    public String Na(){
        System.out.println("\nIngrese su nombre: ");
        String na = teclado.nextLine();
        return na;
    }  


    
    /** 
     * @return String
     * emoticones ingresar
     */
    public String EMOT(){
        System.out.println("\nIngrese el emoticon que desea: ");
        String sx= teclado.nextLine();
        while(sx.length()>7){
           m("Pruebe otro el que ingreso no es valido");
           sx= teclado.nextLine();
        }
        return sx;
    }  

    
    /** 
     * @return String
     *publicacion texto
     */
    public String textPo(){
        System.out.println("\nEscriba el Texto que desea publicar (max:20 caracteres) ");
        String sx= teclado.nextLine();
        while(sx.length()>20){
           m("Pruebe otra vez tiene mas de 20 caracteres ");
           sx= teclado.nextLine();
        }
        return sx;
    }  

    
    /** 
     * aarray list de hastags
     * @return ArrayList<String>
     */
    public ArrayList<String> HAS(){
        ArrayList<String> hashtagss= new ArrayList<String>();
        int spi ;
        String hs;
        do {
        System.out.println("\nEscriba el hashtag (una sola palabra aceptada, unicamente la palabra sin #): ");
        hs = teclado.nextLine();
        hashtagss.add("#"+ hs);
        System.out.printf("\nQuiere agregar otro #? escriba 1 para si y 2 para no: ");
        spi = teclado.nextInt();
        teclado.nextLine();
        if (spi == 2)
                System.out.println( "No se va a agregar" );
        }
        while (spi == 1);
        return hashtagss;
    }  

    
    /** 
     * @return String
     * obtener el url del post
     */
    public String obtUr(){
        System.out.println("\nIngrese el url de su post:  ");
        String url = teclado.nextLine();
        return url;
    }  

    
    /** 
     * @return String
     * obtener el formato de la imagen
     */
    public String form(){
        System.out.println("\nIngrese el formato de su imagen de su imagen estas son las algunas opciones (gif,jpeg,png):  ");
        String fr = teclado.nextLine();
        return fr;
    }

    
    /** 
     * obtener tamnio de la imagen
     * @return int
     */
    public int tamk(){
        int kb;
        System.out.printf("\nIngrese el tamaño en Kb de su post: ");
        try {
            kb = teclado.nextInt();
        } catch (InputMismatchException e) {
            m("Ingrese un número");
                Scanner teclado = new Scanner(System.in);
                kb = teclado.nextInt();
            }
		teclado.nextLine();
        return kb;
    }

    
    /** 
     * @return int
     * obtener el sample rate del audio
     */
    public int rt(){
        int smp;
        System.out.println("\nIngrese el sample rate del audio");
        try {
            smp = teclado.nextInt();
        } catch (InputMismatchException e) {
            m("Porfavor, ingrese un número");
                Scanner teclado = new Scanner(System.in);
                smp = teclado.nextInt();
            }
		teclado.nextLine();
        return smp;
    } 

    
    /** 
     * @return int
     * obtener el bitdepth del audio
     */
    public int bidept(){
        int bid;
        System.out.println("\nIngrese el bitdepth del audio: ");
        try {
            bid = teclado.nextInt();
        } catch (InputMismatchException e) {
            m("Ingrese un numero");
                Scanner teclado = new Scanner(System.in);
                bid = teclado.nextInt();
            }
		teclado.nextLine();
        return bid;
    } 

    
    /** 
     * obtenr los megapixeles de la imagenm
     * @return int
     */
    public int obtRe(){
        int resolu;
        System.out.printf("\nIngrese la resolución de su imagen en Megapixeles: ");
        try {
            resolu = teclado.nextInt();
        } catch (InputMismatchException e) {
            m("Ingrese un número");
                Scanner teclado = new Scanner(System.in);
                resolu = teclado.nextInt();
            }
		teclado.nextLine();
        return resolu;
    } 

    
    /** 
     * @return String
     * buscar por el # un post
     */
    public String bushash(){
        System.out.println("\nEscriba la palabra del hashtag que quiere (sin el #) ");
        String hashtag = teclado.nextLine();
        return "#"+ hashtag;
    }  

    
    /** 
     * @return int
     * obtener el framerate del video
     */
    public int framerat(){
        int fram ;
        System.out.println("\nIngrese el framerate del video: ");
        try {
            fram  = teclado.nextInt();
        } catch (InputMismatchException e) {
            m("Ingrese un numero");
                Scanner teclado = new Scanner(System.in);
                fram  = teclado.nextInt();
            }
		teclado.nextLine();
        return fram ;
    } 

    
    /** 
     * @return String
     * obtener la fecha manualmente del post
     */
    public String buscFe(){

        System.out.println("\nIngrese la fecha del post que desea buscar de esta forma (dd/mm/aa) ");
        String buscarfe = teclado.nextLine();
        return buscarfe;
    }
    
    /** 
     * @return int
     * menu de likear o comentar
     */
    public int munoLYC(){
		int o;
        m("\n" +" Que opcion elije ?");
        System.out.println("1. Darle like ");
        System.out.println("2. Comentar");
        System.out.println("3. Salir ");
        try {
            o = teclado.nextInt();
        } catch (InputMismatchException e) {
                m("ingrese en el formato que se solicita");
                Scanner teclado = new Scanner(System.in);
                o = teclado.nextInt();
            }
		teclado.nextLine();
		return o;
    }
    
    /** 
     * @return String
     * escribir comentario
     */
    public String comenta(){
        System.out.println("\nEscriba el comentario  (max:20 caracteres) ");
        String x= teclado.nextLine();
        while(x.length()>20){
           m("Debe de ser menor que 20 caractees");
           x= teclado.nextLine();
        }
        return x;
    }  

    
    /** 
     * @param numero
     * @return int
     * revisar numero
     */
    public static int revNu(String numero){
        int resu = 0; 
        try{
            if(numero != null){
                resu =  Integer.parseInt(numero);
                if(resu < 0){
                    resu = Math.abs(resu);
                }
            }
        }catch(NumberFormatException exception){
            System.out.println("Error de numero" );
        }
        return resu;
    }
    
    /** 
     * buscae post por numero 
     * @param busPosts
     * @return int
     */
    public int elegP(ArrayList<post> busPosts){
        int s = 0;
        String e;
        int i =0;
        while(s == 0){
              System.out.println("\nIngrese el numero del post que desea: ");
              e = teclado.nextLine();
              int r = revNu(e);
              if(r == 0){
                 System.out.printf("Ingresa un numero");
              }
              else{
                  i = r - 1;
                  if(busPosts.get(i).isExiste() == true){
                      System.out.printf("Post seleccionado: " + (r)+"\n");
                      s=1;
                  }
                  else{
                      System.out.printf("Post seleccionado: " + (r));
                         s= s +1;
                  }
              }
        }
        return i;
       
    }


    
    /** 
     * @return String
     * obtener post por fecha
     */
    public String obtfec(){
        System.out.printf("\nIngrese la fecha del post en este modo (dd/mm/aa) ");
        String date = teclado.nextLine();
        return date;
    } 
}