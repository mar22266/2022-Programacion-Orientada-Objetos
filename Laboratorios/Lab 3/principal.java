/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.ArrayList;


public class principal {

private static vistaP v = new vistaP();


public static void main(String[] args){
    int opcion;
    v.m("\n" +"------------BIENVENIDO------------");
    opcion = v.menuprin(); 
    ArrayList<post> posts = new ArrayList<post>();

    while(opcion != 5){
        switch(opcion)
        {
            case 1:  
            //nuevo post
            
            int opcionpost = v.mPost();
            String name= v.Na();
            ArrayList<String>hashtag= v.HAS();
            String fecha = v.obtfec();
            switch (opcionpost) {
                case 1:
                //post tipo texto
                String texto = v.textPo();
                posts.add(new texto(name,hashtag, texto,fecha));
                break;

                case 2:
                //post tipo multimedia
                String Url = v.obtUr();
                int Kb= v.tamk();
                int opcionmultimedia= v.menuM();
                switch (opcionmultimedia) {
                    case 1:
                    //imagen
                    String formato= v.form();
                    int resolucion= v.obtRe();
                    posts.add(new imagen(name,hashtag,Url,Kb,formato,resolucion,fecha));
                    break;

                    case 2:
                    //audio
                    int Samplerate = v.rt();
                    int Bitdepth = v.bidept();
                    posts.add(new audio(name, hashtag, Url, Kb, Samplerate, Bitdepth,fecha));
                    break;

                    case 3:
                    //video
                    int framerate= v.framerat();
                    posts.add(new video(name, hashtag, Url, Kb, framerate,fecha));
                    break;
                }

                break;

                case 3:
                //post TIPO emoticon
                String emoticon = v.EMOT();
                
                posts.add(new emoticono(name,hashtag, emoticon,fecha));
                break;
            }
            for (int i = 0; i < posts.size(); i++) {
                System.out.println("\n"+posts.get(i)); }

            break;

            case 2:
            //buscar post por fecha
            ArrayList<post> busPosts = new ArrayList<post>();
            String resp = "";
            String FBU= v.buscFe();
            v.m("Los posts encontrados en "+ FBU+ " son los siguientes:");
            for (int i = 0; i < posts.size(); i++) {
                if (posts.get(i).getFecha().equals(FBU)) {
                    busPosts.add(posts.get(i));
                    
                }
            }
            for (int i = 0; i < busPosts.size(); i++) {
               resp = "\n"+resp + (i+1) + ". " + busPosts.get(i);   
            }
            v.m(resp); 

            int es = v.elegP(busPosts);
            busPosts.get(es).mostrar();

            int LikeoComment= v.munoLYC();
            switch (LikeoComment) {
                case 1:
                //like 
                busPosts.get(es).likear();
                v.m("Se dio like");
                break;
                case 2:
                //comment
                String nuevocomentario= v.comenta();
                busPosts.get(es).Comentar(new comment(nuevocomentario));
                v.m("Se ha comentado el post");
                break;
                case 3:
                //salir
                v.m("Saliendo...");
                System.exit(0);
                break;
            }

            break;

            case 3:
            //buscar post por hashtag
            ArrayList<post> postbusquedah = new ArrayList<post>();
            String res = "";
            String hbus= v.bushash();
            v.m("Los posts encontrados "+ hbus+ " son los siguientes:");
            for (int i = 0; i < posts.size(); i++) {
                for (int j = 0; j < posts.get(i).getHashtags().size(); j++){
                    if (posts.get(i).getHashtags().get(j).equals(hbus)) {
                    postbusquedah.add(posts.get(i));
                    }
                }
            }
            
            
            for (int i = 0; i < postbusquedah.size(); i++) {
               res = "\n"+res + (i+1) + ". " + postbusquedah.get(i);   
            }
            v.m(res);  
                
            int espacioSelec = v.elegP(postbusquedah);
            postbusquedah.get(espacioSelec).mostrar();
            
            int LikeComment= v.munoLYC();
            switch (LikeComment) {
                case 1:
                //like 
                postbusquedah.get(espacioSelec).likear();
                v.m("Se ha dado correctamente el like");
                break;
                case 2:
                //comment
                String nuevocomentario= v.comenta();
                postbusquedah.get(espacioSelec).Comentar(new comment(nuevocomentario));
                v.m("Se ha comentado el post");
                break;
                case 3:
                //salir
                v.m("Saliendo...");
                System.exit(0);
                break;
            }
            break;

            case 4:
            //mostrar posts 
            System.out.println("Posts: ");
            if(posts!=null){
                for (int i = 0; i < posts.size(); i++) {
                    System.out.println(posts.get(i));
                   }
            }
            else    
            v.m("No hay posts");  
            break;

            case 5:
             //salida del programa
             v.m("Saliendo...");
             System.exit(0);
             break;
             //se avisa de opcion mala
            default: v.m("---ERROR INGRESE UN NUMERO DEL 1 AL 5---");   break;

        } 
        opcion = v.menuprin();
    }



    }
}
