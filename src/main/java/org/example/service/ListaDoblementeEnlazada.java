package org.example.service;

import org.example.model.Pedido;

public class ListaDoblementeEnlazada {
    // Nodo de la lista
    private class Nodo {
        Pedido pedido;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(Pedido pedido) {
            this.pedido = pedido;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    private Nodo cabeza;
    private Nodo cola;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    // Agregar pedido al final de la lista
    public void agregarPedido(Pedido pedido) {
        Nodo nuevoNodo = new Nodo(pedido);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        System.out.println("Pedido agregado: " + pedido);
    }

    // Eliminar pedido del principio de la lista
    public Pedido eliminarPedido() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return null;
        }
        Pedido pedidoEliminado = cabeza.pedido;
        cabeza = cabeza.siguiente;
        if (cabeza != null) {
            cabeza.anterior = null;
        } else {
            cola = null;
        }
        System.out.println("Pedido eliminado: " + pedidoEliminado);
        return pedidoEliminado;
    }

    // Mostrar todos los pedidos desde el principio de la lista
    public void mostrarPedidosDesdeInicio() {
        if (cabeza == null) {
            System.out.println("No hay pedidos en la lista.");
        } else {
            Nodo actual = cabeza;
            System.out.println("Pedidos (Inicio -> Fin):");
            while (actual != null) {
                System.out.println(actual.pedido);
                actual = actual.siguiente;
            }
        }
    }

    // Mostrar todos los pedidos desde el final de la lista
    public void mostrarPedidosDesdeFin() {
        if (cola == null) {
            System.out.println("No hay pedidos en la lista.");
        } else {
            Nodo actual = cola;
            System.out.println("Pedidos (Fin -> Inicio):");
            while (actual != null) {
                System.out.println(actual.pedido);
                actual = actual.anterior;
            }
        }
    }

    // Consultar número de pedidos en la lista
    public int contarPedidos() {
        int count = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }
}
