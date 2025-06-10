package Ejercicio4;

class Nodo {
    String pedido;
    Nodo siguiente;

    public Nodo(String pedido) {
        this.pedido = pedido;
        this.siguiente = null;
    }
}

public class Pedidos {
    private Nodo inicio;
    private Nodo fin;
    private int tamañoMaximo = 5;
    private int tamañoActual = 0;

    public Pedidos() {
        inicio = null;
        fin = null;
    }

    public boolean Llena() {
        return tamañoActual >= tamañoMaximo;
    }

    public boolean Vacio() {
        return inicio == null;
    }

    public void InsertarFinal(String pedido) {
        if (Llena()) {
            System.out.println("\nCola llena, no se puede añadir su pedido: " + pedido);
            return;
        }

        Nodo nuevo = new Nodo(pedido);
        if (Vacio()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        tamañoActual++;
        System.out.println("\nPedido agregado: " + pedido);
    }

    public void EliminarInicio() {
        if (Vacio()) {
            System.out.println("\nCola vacía, no hay pedidos por atender.");
        } else {
            System.out.println("\nPedido atendido: " + inicio.pedido);
            inicio = inicio.siguiente;
            tamañoActual--;
            if (inicio == null) {
                fin = null;
            }
        }
    }

    public void EliminarFinal() {
        if (Vacio()) {
            System.out.println("No hay pedidos para cancelar");
        } else if (inicio == fin) {
            System.out.println("\nPedido cancelado: " + fin.pedido);
            inicio = null;
            fin = null;
            tamañoActual = 0;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != fin) {
                actual = actual.siguiente;
            }
            System.out.println("\nPedido cancelado: " + fin.pedido);
            actual.siguiente = null;
            fin = actual;
            tamañoActual--;
        }
    }

    public void MostrarCola() {
        if (Vacio()) {
            System.out.println("No hay pedidos que mostrar");
        } else {
            System.out.println("\nPedidos en espera:");
            Nodo actual = inicio;
            while (actual != null) {
                System.out.println("- " + actual.pedido);
                actual = actual.siguiente;
            }
        }
    }
}