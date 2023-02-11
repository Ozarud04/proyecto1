package elementales.tipos.hielo;
import elementales.*;
import elementales.tipos.ElementalHielo;

public class IceBear extends ElementalHielo {
    //Este constructor se llama cuando se instancia la clase con "new"
    public IceBear(String nombre){//Recibimos el nombre de el usuario que va a crear al magmawolf
        super.nombre = nombre;
        super.hp = 120;
        super.energia = 40;

        System.out.println("IceBear salvaje ha aparecido!");
    }

    //Es un ataque del elemental (recibe como argumento al elemental que va a atacar)
    public void zarpaso(Elemental objetivo){
        System.out.println(super.nombre + " Utiliza " + "Zarpaso en " + objetivo.nombre );
        int danoDeAtaque = 8; //Defino el daño de ataque que tiene la habilidad
        objetivo.hp = objetivo.hp - danoDeAtaque; //Le resto el daño de ataque al objetivo 
        System.out.println(objetivo.nombre + " " + "Ahora tiene " + objetivo.hp + " " + "de HP");
    }
}
