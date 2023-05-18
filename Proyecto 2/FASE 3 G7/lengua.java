public class lengua{

    private String [][] lecciones;
    private String [][] ejercicios;
    private String [][] lecciones_2;
    private String [][] ejercicios_2;

    public lenguaje(){
        lecciones = new String[6][2]; 
        ejercicios = new String[6][2];
        lecciones_2 = new String[6][2];
        ejercicios_2 = new String[6][2];

    }


    public void asignarValores(){
        lecciones [0][0] = "\nUso de la S" + " ";
        lecciones [0][1] = "\tTodos los plurales terminan con la letra S" + "\n\n";
        lecciones [1][0] = "Cuando la primera sílaba es subs- llevará S las dos veces" + " ";
        lecciones [1][1] = "\t-Los superlativos de los adjetivos se escriben con s"+ "\n";
        lecciones [2][0] = "-Los adjetivos terminados en -oso llevan S"+ " ";
        lecciones [2][1] = "\t\t-Delante de las letras b, d, g, l, y m se utiliza la letra S"+ "\n";

    }

    public void repasar_ejercicios(){
        repasa [0][0] = "Uso de la S";
        repasa [0][1] = "Todos los plurales terminan con la letra S";
        repasa [1][0] = "Cuando la primera sílaba es subs- llevará S las dos veces";
        repasa [1][1] = "Los superlativos de los adjetivos se escriben con s";
        repasa [2][0] = "Los adjetivos terminados en -oso llevan S";
        repasa [2][1] = "Delante de las letras b, d, g, l, y m se utiliza la letra S";

    }
    
    public void asignar_Valores2(){
        lecciones_2 [0][0] = "Uso de la C" + " ";
        lecciones_2 [0][1] = "\tLas terminaciones -cito, -cita, -cillo, -cilla, -cecillo, -cecilla se escriben con c." + "\n\n";
        lecciones_2 [1][0] = "En el caso de las palabras en singular que terminan en z al formar el plural con la terminación es se escriben con c."+ " ";
        lecciones_2 [1][1] ="t-Se escribe con c la terminación -ción, siempre que el sustantivo concreto al que se relacione la palabra termine en -tor y NO en -sor."+ "\n";
        lecciones_2 [2][0] = "-Se escriben con c los verbos cuyos infinitivos terminen en alguna de las voces -cer, -ceder, -cir, -cendir, -cibir, -cidir."+ " ";
        lecciones_2 [2][1] = "\t\t-Se escriben con c todos los compuestos y derivados de las palabras que se escriban con esta letra."+ "\n";
    }
    
    public void repasar_ejercicios_2(){
        repasa_2 [0][0] = "Uso de la C";
        repasa_2 [0][1] = "Las terminaciones -cito, -cita, -cillo, -cilla, -cecillo, -cecilla se escriben con c.";
        repasa_2 [1][0] = "En el caso de las palabras en singular que terminan en z al formar el plural con la terminación es se escriben con c.";
        repasa_2 [1][1] = "Se escribe con c la terminación -ción, siempre que el sustantivo concreto al que se relacione la palabra termine en -tor y NO en -sor";
        repasa_2 [2][0] = "Se escriben con c los verbos cuyos infinitivos terminen en alguna de las voces -cer, -ceder, -cir, -cendir, -cibir, -cidir.";
        repasa_2 [2][1] = "Se escriben con c todos los compuestos y derivados de las palabras que se escriban con esta letra.";
        
    }


        public String[][] getEjercicios() {
            return this.ejercicios;
        }
    
         public String[][] getEjercicios_2() {
            return this.ejercicios_2;
        }


        public String[][] getlecciones() {
            return this.lecciones;
        }
        public String[][] getlecciones_2() {
            return this.lecciones_2;
        }

        public void setlecciones(String[][] lecciones) {
            this.lecciones = lecciones;

        }
        public void setlecciones_2(String[][] lecciones_2) {
            this.lecciones_2 = lecciones_2;

        }

        public String toString() {

            return "{" +
                " lecciones='" + getlecciones() + "'" +
                "}";
            
        }

}
