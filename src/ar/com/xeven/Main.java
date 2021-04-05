package ar.com.xeven;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Crear un sistema de turnos para una farmacia utilizando un mapa para asignar turnos a los clientes que llegan.
Cargar 8 clientes y mostrar en la pantalla el turno que tiene cada uno.
 */

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,Cliente> turnos = new HashMap<>();

        for (int i=0;i<8;i++)
            cargarTurno(i,new Cliente(),turnos);
        //Array de nombres
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Pablo","Jualiana","John","Mike","Ann","Liz","Jules","Carmen"));

        turnos.forEach((k,v) ->v.setNombre(nombres.get(k)));
        //mostrar los turnos con sus nombres
        turnos.entrySet().stream().forEach(System.out::println);

    }

    private static void cargarTurno(int turno,Cliente cliente, HashMap<Integer, Cliente> turnos) {
        turnos.put(turno,cliente); //clave:turno;valor:cliente
    }
}
