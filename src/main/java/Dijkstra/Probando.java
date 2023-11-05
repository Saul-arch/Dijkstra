package Dijkstra;

import java.util.Scanner;

public class Probando {
    public static void main(String[] args) {

        String nombre;
        int id;
        String nombreBuscar;
        String origen;
        String destino;
        int origenNombre = 0;
        int destinoId = 0;


        Scanner entrada = new Scanner(System.in);
        listaNodo lista = new listaNodo();
        Grafos ponderadoNodir;
        Nodo guachar;
        //System.out.print("digite el número de vertices: ");
        //int numero = sc.nextInt();
        ponderadoNodir = new Grafos(1);
        ponderadoNodir.ponderadoNODir();
        System.out.println(ponderadoNodir);
        //-------------------------------------------------------------------
        /*for (int i = 0; i < 4; i++){
            System.out.print("Introduce el nombre de la calle: ");
            nombre = entrada.next();
            System.out.print("Introduce su id: ");
            id = entrada.nextInt();

            lista.agregar(nombre, id);

        }*/ //Optimizar este pedazo agregando los nodos directos

        lista.agregar("San Juan", 0);
        lista.agregar("Lazaro Cardenas", 1);
        lista.agregar("niños heroes", 2);
        lista.agregar("la joya", 3);
        lista.agregar("salto dual agua", 4);
        lista.agregar("Allende", 5);
        lista.agregar("Hidalgo", 6);
        lista.agregar("Antonibad", 7);
        lista.agregar("centro", 8);
        lista.agregar("bellas artes", 9);
        lista.agregar("correa", 10);
        lista.agregar("Londres", 11);
        lista.agregar("Isabel", 12);
        lista.agregar("cadenas", 13);
        lista.agregar("obreros", 14);
        lista.agregar("doctores", 15);
        lista.agregar("hospital general", 16);
        lista.agregar("bacan", 17);


        lista.mostrar();

        /*System.out.print("Escribe el nombre a buscar: ");
        nombreBuscar = entrada.next();

        if (lista.buscar(nombreBuscar) != null){
            System.out.println("Encontrado dentro de la lista");
            guachar = lista.buscar(nombreBuscar);
            System.out.println("datos en nodo encontrado: " + guachar.identificador);
        }else{
            System.out.println("Nombre no encontrado");
        }*/



        //---------------------------------------------------
        //hasta aqui yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

        System.out.println();

        boolean salida = true;
        do {
            System.out.print("\nIntroduzca su origen: ");
            origen = entrada.nextLine();



            if (lista.buscar(origen) != null){
                guachar = lista.buscar(origen);
                origenNombre = guachar.identificador;
                System.out.println("aver el id: " + origenNombre);
            }else{
                System.out.println("calle no encontrada");
            }
            //poner un bucle while por si no encuentra el origen

            System.out.print("Introduzca su destino: ");
            destino = entrada.nextLine();

            //HACER UN BUBLE POR SI NO ENCUENTRA EL DESTINO, SI NO DA 0 Y OTRA DIRECCION
            if (lista.buscar(destino) != null){
                guachar = lista.buscar(destino);
                destinoId = guachar.identificador;
                System.out.println("aver el ide del destino: " + destinoId);
            }else{
                System.out.println("calle no encontrada");
            }
            //igual poner un while poor si no lo encuentra



            //aqui compara si el destino y el origen son iguales, si son iguales pide otro destino
            if(origenNombre == destinoId){
                System.out.println("No puedes viajar por ya te encuentras en el mismo lugar :(");
                System.out.println("Elige otro destino valido: ");

                destino = entrada.nextLine();

                if (lista.buscar(destino) != null){
                    System.out.println("\nEncontrado dentro de la lista");
                    guachar = lista.buscar(destino);
                    System.out.println("Datos en nodo encontrado: " + guachar.identificador);
                    destinoId = guachar.identificador;
                }else{
                    System.out.println("calle no encontrada");
                }

                while(origenNombre == destinoId && origen.equals(destino)){
                    System.out.println("No puedes viajar por que ya te encuentras en el mismo lugar :(");
                    System.out.println("Elige otro destino valido: ");
                    destino = entrada.nextLine();
                }

                guachar = lista.buscar(destino);
                destinoId = guachar.identificador;
                System.out.println(destinoId);

                salida = false;
                Drijkstra dij = new Drijkstra(999, "",origenNombre,destinoId);
                System.out.println(ponderadoNodir.dijkstra(origenNombre, destinoId, 0,"", dij));

                System.out.println("--------------------------");
                String prueba = dij.getRecorrido();

                int sum = 0;
                lista.buscarId(dij.getIni());

                for (int i = 0; i < prueba.length(); i++){
                    String numero1 = "";
                    int prueba1 = 0;

                    if (prueba.charAt(i) != ' ' && prueba.charAt(i + 1) == ' '){
                        numero1 = numero1 + prueba.charAt(i);
                        prueba1 = Character.getNumericValue(numero1.charAt(0));

                        lista.buscarId(prueba1);

                    }else if (prueba.charAt(i) != ' ' && prueba.charAt(i + 1) != ' '){

                        int num1 = 0;
                        int num2 = 0;

                        numero1 = numero1 + prueba.charAt(i);
                        numero1 = numero1+ prueba.charAt(i + 1);
                        //System.out.println("pruebaaaa: "+numero1);

                        num1 = Character.getNumericValue(numero1.charAt(0) + numero1.charAt(1));

                        //System.out.println("Prueba del entero: " + num1);

                        sum = num1;
                        lista.buscarId(sum);
                        i++;
                    }
                }
                System.out.print("Finalmente: "); lista.buscarId(dij.getFin());

            }else{
                salida = false;
                Drijkstra dij = new Drijkstra(999, "",origenNombre,destinoId);
                System.out.println(ponderadoNodir.dijkstra(origenNombre, destinoId, 0,"", dij));

                System.out.println("--------------------------");
                String prueba = dij.getRecorrido();

                int sum = 0;
                lista.buscarId(dij.getIni());

                for (int i = 0; i < prueba.length(); i++){
                    String numero1 = "";
                    int prueba1 = 0;

                    if (prueba.charAt(i) != ' ' && prueba.charAt(i + 1) == ' '){
                        numero1 = numero1 + prueba.charAt(i);
                        prueba1 = Character.getNumericValue(numero1.charAt(0));

                        lista.buscarId(prueba1);

                    }else if (prueba.charAt(i) != ' ' && prueba.charAt(i + 1) != ' '){

                        int num1 = 0;
                        int num2 = 0;

                        numero1 = numero1 + prueba.charAt(i);
                        numero1 = numero1+ prueba.charAt(i + 1);
                        //System.out.println("pruebaaaa: "+numero1);

                        num1 = Character.getNumericValue(numero1.charAt(0) + numero1.charAt(1));

                        //System.out.println("Prueba del entero: " + num1);

                        sum = num1;
                        lista.buscarId(sum);
                        i++;
                    }
                }
                System.out.print("Finalmente: "); lista.buscarId(dij.getFin());
                /*System.out.println("Aver como queda: " + numero1);

                for (int j = 0; j < numero1.length(); j++){
                    int pruebaaa = 0;

                    System.out.println(Character.getNumericValue(numero1.charAt(0)));
                    pruebaaa = Character.getNumericValue(numero1.charAt(j));

                    pruebaaa = pruebaaa + 50;
                    System.out.println("La suma es: " + pruebaaa);
                }
                System.out.println("__________________________-");*/


            }


        }while (salida);


    }
}
