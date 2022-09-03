import javax.swing.*;

public class pizzeria {
    public static void main(String[] args) {
        String pizza[][] = new String[3][2];
        String ingredientes[][] = new String[3][3];
        int cant_pizzas, cant_ingredientes;
        int valorBase = 5000, jamon = 500, peperoni = 900, pollo = 700, tomate = 300, atun = 1200, albaca = 400, champiñones = 800;
        String menu = JOptionPane.showInputDialog("bienvenido a pizzaPepe \n" +
                "por favor seleccione su ingrediente \n" +
                "1. jamon 500 \n" +
                "2. peperoni 900 \n" +
                "3. pollo 700 \n" +
                "4. tomate 300 \n" +
                "5. atun 1200 \n" +
                "6. albaca 400 \n" +
                "7. champiñones 800 \n" +
                "8. atras");
        switch (menu) {
            case  "1":

                cant_pizzas = Integer.parseInt(JOptionPane.showInputDialog("Diguite la cantidad de pizzas que desea ordenar"));

                if (cant_pizzas > 4) {
                    JOptionPane.showMessageDialog(null, "No se puede pedir mas de 5 pizzas");
                    menu();
                } else if (cant_pizzas > 0) {

        }

    }
}

    private static void menu() {
    }

}
