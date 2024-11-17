package pe.edu.vallegrande.sysrestaurant.view;

import pe.edu.vallegrande.sysrestaurant.service.dashboard.DashboardService;

public class test02 {
    public static void main(String[] args) {
        try {
            // Crear una instancia del servicio del dashboard
            DashboardService dashboardService = new DashboardService();

            // Contar las órdenes pendientes
            int pendingOrdersCount = dashboardService.countOrdersPending();

            // Mostrar el número de órdenes pendientes
            System.out.println("Número de órdenes pendientes: " + pendingOrdersCount);
        } catch (Exception e) {
            // Manejo de excepciones
            System.err.println("Se produjo un error al contar las órdenes pendientes: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
