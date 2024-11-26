package org.example;


import org.example.model.Pedido;
import org.example.service.ListaDoblementeEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada listaHistorial = new ListaDoblementeEnlazada();

        // Crear pedidos
        Pedido pedido1 = new Pedido(1, "Pepe", "Hamburguesa, Papas", "Finalizado");
        Pedido pedido2 = new Pedido(2, "Daniel", "Pizza", "Finalizado");
        Pedido pedido3 = new Pedido(3, "Paola", "Ensalada, Refresco", "En espera");

        // Agregar pedidos al historial
        listaHistorial.agregarPedido(pedido1);
        listaHistorial.agregarPedido(pedido2);
        listaHistorial.agregarPedido(pedido3);

        // Mostrar todos los pedidos desde el inicio (FIFO)
        listaHistorial.mostrarPedidosDesdeInicio();

        // Mostrar todos los pedidos desde el final (LIFO)
        listaHistorial.mostrarPedidosDesdeFin();

        // Eliminar un pedido (del principio de la lista)
        listaHistorial.eliminarPedido();

        // Mostrar pedidos después de eliminar uno
        listaHistorial.mostrarPedidosDesdeInicio();

        // Consultar el número de pedidos restantes
        System.out.println("Pedidos restantes en el historial: " + listaHistorial.contarPedidos());
    }
}