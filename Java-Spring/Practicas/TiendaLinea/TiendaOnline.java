    public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";
        
        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalones = 29.99;
        double precioZapatos = 49.99;
    
        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";
    
        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;

        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        if (pedidoConfirmadoCliente1) {
            System.out.println(cliente1 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + precioPantalones);
        }
        if (pedidoConfirmadoCliente3) {
            System.out.println(cliente3 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + (precioZapatos + precioLibro));
        }

        if (pedidoConfirmadoCliente2) {
            System.out.println(cliente2 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + ((precioZapatos*2) + precioCamiseta + precioPantalones));
            }
        System.out.println();
        System.out.println(mensajeMostrarTotal + precioCamiseta);

    }
}