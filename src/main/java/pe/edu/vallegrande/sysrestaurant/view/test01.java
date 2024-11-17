package pe.edu.vallegrande.sysrestaurant.view;

import pe.edu.vallegrande.sysrestaurant.dto.order.OrderDto;
import pe.edu.vallegrande.sysrestaurant.service.sale.OrderService;

import java.util.List;

public class test01 {
    public static void main(String[] args) {
        try {
            // Crear una instancia del servicio de órdenes
            OrderService orderService = new OrderService();

            // Listar todas las órdenes con estado 1 (puedes cambiar el estado según tus necesidades)
            List<OrderDto> listOrderDto = orderService.listOrderAllByStatus(1);

            // Verificar si la lista de órdenes no está vacía
            if (listOrderDto != null && !listOrderDto.isEmpty()) {
                // Iterar y mostrar cada orden
                for (OrderDto orderDto : listOrderDto) {
                    System.out.println(orderDto);
                }
            } else {
                System.out.println("No se encontraron órdenes con el estado especificado.");
            }
        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Se produjo un error al listar las órdenes: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
