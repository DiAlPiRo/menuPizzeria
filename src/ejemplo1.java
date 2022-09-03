import javax.swing.*;

public class ejemplo1 {
    public class menuPizzeria {
        public class molepizza {

            int cant_pizzas, cant_ingredientes;
            int Valor_pizza = 5000, valor_jamon = 0,
                    valor_peperoni = 0, valor_pollo = 0,
                    valor_tomate = 0, valor_atun = 0,
                    valor_albaca = 0, valor_champiñones = 0,
                    valor_pedido = 0;
            int valor1 = 0, valor2 = 0, valor3 = 0, valor4 = 0, valor5 = 0, valor6 = 0, valor7 = 0, total_pizzas = 0;
            int Contenedor[][] = new int[6][8];
            int column=0;
            public molepizza() {
                menu();
            }

            public void menu() {


                String menu = "Pizzeria la 21 \n\n" +
                        "1. pizzas\n" +
                        "2. Ingredientes \n" +
                        "3. total \n" +
                        "4. salir";

                String entrada = JOptionPane.showInputDialog(menu);

                switch (entrada) {

                    case "1":
                        cant_pizzas = Integer.parseInt(JOptionPane.showInputDialog("Diguite la cantidad de pizzas que desea ordenar"));

                        if (cant_pizzas > 4) {
                            JOptionPane.showMessageDialog(null, "No se puede pedir mas de 5 pizzas");
                            menu();
                        } else if (cant_pizzas > 0) {
                            Contenedor[column][0] = cant_pizzas;
                            Contenedor[column][1] = total_pizzas;

                        }
                        total_pizzas = cant_pizzas *= Valor_pizza;
                        menu();

                        break;
                    case "2":

                        String sms = "Ingredientes \n\n";

                        sms += "1. jamon 500\n";
                        sms += "2. peperoni 900\n";
                        sms += "3. pollo 700\n";
                        sms += "4. tomate 300\n";
                        sms += "5. atun 1200\n";
                        sms += "6. albaca 400\n";
                        sms += "7. champiñones 800\n";
                        sms += "8. salir \n";

                        String opcion = JOptionPane.showInputDialog(sms);

                        switch (opcion) {
                            case "1":
                                cant_ingredientes += 1;
                                if (cant_ingredientes > 4) {
                                    JOptionPane.showMessageDialog(null, "no puede agregar mas de 4 ingredientes ");
                                } else {
                                    valor1 = valor_jamon += 500;
                                    Contenedor[column][2] = valor1;
                                }
                                menu();
                                break;
                            case "2":
                                cant_ingredientes += 1;
                                if (cant_ingredientes > 5) {
                                    JOptionPane.showMessageDialog(null, "no se puede agregar mas de 4 ingredientes ");
                                } else {
                                    valor2 = valor_peperoni += 900;
                                    Contenedor[column][3] = valor2;

                                }
                                menu();

                        }
                }
            }
        }
    }
}
