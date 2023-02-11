import elementales.Elemental;
import elementales.tipos.ElementalFuego;
import elementales.tipos.fuego.*;
import elementales.tipos.hielo.IceBear;

public class App {
    public static void main(String[] args) throws Exception { 
        System.out.println("Que comienze el du du du dueloooo!");
        
        MagmaWolf elementalFuego = new MagmaWolf("Perrito1");
        IceBear elementalHielo = new IceBear("Tibbers de hielo");

        //Comienza la batalla
        //IceBear usa zarpaso en MagmaWolf
        elementalHielo.zarpaso(elementalFuego);
        //Ahora es turno de MagmaWolf que usa morder en Icebear
        elementalFuego.morder(elementalHielo);
    }
}
