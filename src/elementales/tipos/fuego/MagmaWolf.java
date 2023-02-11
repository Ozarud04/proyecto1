package elementales.tipos.fuego;
import elementales.*;
import elementales.tipos.ElementalFuego;

public class MagmaWolf extends ElementalFuego{
    
    //Este constructor se llama cuando se instancia la clase con "new"
    public MagmaWolf(String nombre){//Recibimos el nombre de el usuario que va a crear al magmawolf
        super.hp = 100;
        super.energia = 50;
        super.nombre = "Perrito";
        System.out.println("MagmaWolf salvaje ha aparecido!");
    }

    //Es un ataque del elemental (recibe como argumento al elemental que va a atacar)
    public void morder(Elemental objetivo){
        System.out.println(super.nombre + " Utiliza " + "Mordida en " + objetivo.nombre );
        int danoDeAtaque = 10; //Defino el daño de ataque que tiene la habilidad
        objetivo.hp = objetivo.hp - danoDeAtaque; //Le resto el daño de ataque al objetivo 
        System.out.println(objetivo.nombre + " " + "Ahora tiene " + objetivo.hp + " " + "de HP");
    }
}
