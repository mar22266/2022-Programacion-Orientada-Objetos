/*
 * Andy Fuentes

 */


public class lengua{

    private String [][] lecciones;
    private String [][] ejercicios;

    public lenguaje(){
        lecciones = new String[6][2]; 
        ejercicios = new String[6][2];

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



        public String[][] getEjercicios() {
            return this.ejercicios;
        }

        public void setEjerciciosString[][] ejercicios() {
            this.ejercicios = ejercicios;
        }


        public String[][] getlecciones() {
            return this.lecciones;
        }

        public void setlecciones(String[][] lecciones) {
            this.lecciones = lecciones;

        }


        public String toString() {

            return "{" +
                " lecciones='" + getlecciones() + "'" +
                "}";
            
        }
    

}
