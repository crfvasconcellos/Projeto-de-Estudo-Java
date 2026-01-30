package Enumeracao;

import java.util.Date;

public class Programa {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080,new Date(),StatusDoPedido.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        StatusDoPedido os1 = StatusDoPedido.ENTREGUE;

        StatusDoPedido os2 = StatusDoPedido.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);



    }
}
