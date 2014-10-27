
/**
 * Permite crear personas con diferentes edades
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
//Objeto persona con un atributo edad, se introduce al crearla.
{
private int edad;

/**
 * Introduce la edad para la persona que se esta creando.
 */
public Persona(int suEdad) 
//Crea una persona, introduce su edad.
{
edad = suEdad;
}
/**
 * Devuelve la edad de la persona creada.
 */
public int getEdad()
//Devuelve la edad de la persona.
{
return edad;
}
}
