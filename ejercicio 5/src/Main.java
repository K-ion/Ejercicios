//Por último, para el Switch, deberás crear la variable estacion,
// y distintos case para las cuatro estaciones del año.
// Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
// informando de la estación en la que está. También habrá que poner un default para cuando el valor
// de la variable no sea una estación.



public class Main {
    public static void main(String[] args) {
        var estacion = "OTOÑO";

        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
            default:
                System.out.println(estacion);
        }
    }
}