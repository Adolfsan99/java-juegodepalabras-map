import java.util.*;
//java util con * para asegurarme que funcione lo que vaya a programar
public class Main {
    public static void main(String[] args) {

        //hashmap con las palabras de ingles a español
        HashMap<String, String> palabras = new HashMap<>();
        palabras.put("perro", "dog");
        palabras.put("gato", "cat");
        palabras.put("moneda", "coin");
        palabras.put("taza", "cup");
        palabras.put("pared", "wall");
        palabras.put("libro", "book");
        palabras.put("lápiz", "pencil");
        palabras.put("árbol", "tree");
        palabras.put("mesa", "table");
        palabras.put("silla", "chair");
        palabras.put("casa", "house");
        palabras.put("pelota", "ball");
        palabras.put("carro", "car");
        palabras.put("bicicleta", "bike");
        palabras.put("teléfono", "phone");
        palabras.put("computadora", "computer");
        palabras.put("televisión", "television");
        palabras.put("zapato", "shoe");
        palabras.put("ropa", "clothes");
        palabras.put("sombrero", "hat");

        // el arreglo de las palabras de español sera igual a establecer la key 0
        // esta key se refiere al hashmap, por lo tal en este hay que convertir la key
        // a un arreglo para tomar el string 0, que son las letras en español
        String[] palabrasEsp = palabras.keySet().toArray(new String[0]);

        // Se escojen palabras de forma aleatoria de la lista usando la variable "ran"
        Random ran = new Random();
        String palabra = palabrasEsp[ran.nextInt(palabrasEsp.length)];

        // Se imprime el mensaje de bienvenida al juego explicando como jugar
        System.out.println(" ");
        System.out.println("BIENVENIDO AL GAME-WORDS DE ADOLFO SÁNCHEZ LOPÉZ");
        System.out.println("* Tendras que traducir 5 palabras de ingles a español para ganar el juego");
        System.out.println("* Las palabras te apareceran en la consola, haz clic en consola y escribelas");
        System.out.println("* Perderas si no aciertas las 5 palabras");
        System.out.println("Empecemos!");
        System.out.println(" ");

        // se crea un escaner para escanear las respuestas
        Scanner scanner = new Scanner(System.in);

        // este for verifica si las palabras son correctas, tambien imprime
        // la palabra a traducir
        int aciertos = 0;
        for (int i = 0; i < 5; i++) {

            //Este sout sirve para escribir algo como "Palabra #1 es zapato:
            System.out.print("Palabra #" + (i+1) + " es " + palabra + ": ");
            String respuesta = scanner.nextLine();

            // compara la respuesta, en caso de ser correcta hara la respectiva impresion
            // en caso de ser incorrecta dira que es incorrecta
            if (respuesta.equals(palabras.get(palabra))) {
                System.out.println("Escribiste: " + respuesta + ". Correcto.");
                aciertos++; //aumenta el numero de aciertos solo cuando sea correcta la respuesta
            } else {
                System.out.println("Escribiste: " + respuesta + ". Incorrecto!.");
            }
            // esto sirve para que las palabras siempre sean aleatorias al hacer un nuevo juego
            palabra = palabrasEsp[ran.nextInt(palabrasEsp.length)];
        }

        // if que manda un sout en caso de ganar o perder pero el juego en general
        // no solo las respuestas, si aciertos es 5/5 mostrara el mensaje de ganar
        // si son 4, o es otro, dira que perdio
        if (aciertos == 5) {
            System.out.println(" ");
            System.out.println("¡Ganaste! Gracias por jugar.");
        } else {
            System.out.println(" ");
            System.out.println("Perdiste. Vuelve a intentarlo.");
        }

        //NOTAS DEL DESARROLLADOR
        // " Claramente este juego se puede mejorar muchisimo, en vez de jugarse por consola
        // podria jugarse usando los paneles de java los JPANE para que sea mas amigable, otra
        // cosa en la que podria mejorar es que no he dado aun con el tema de hacer que al mandar
        // las palabras, no se repitan, ademas me gustaria que fuese de 7 palabras para añadir
        // mas dificultad, podria hacer un menu de opciones para el tema de la dificultad tambien
        // asi como tambien podria hacer que cuando se pierda el juego se vuelva a comenzar, y
        // que al escribir "exit" se salga del juego, pero para lo que requiere el ejercicio
        // esto funciona

    }
}