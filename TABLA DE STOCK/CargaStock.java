import PEDIDOS.PedirStock;
/**
 * Definimos la cantidad de filas y columnas que tendra la tabla que muestra el stock
 * @param x la cantidad de filas refleja la cantidad de productos vendidos
 * @param y la cantidad de columnas refleja el stock inicial, la cantidad vendida
 * y el stock final
 * @return el array bidimensional que conforma la tabla de stock
 */
public class CargaStock{
    public static void main(String[] args) {
        int fila = 13;
        int columna = 3;
        int [][] stock = new int [fila][columna];//Se crea la tabla de stock
        
        /**Se ingresa por teclado los valores de stock 
        */ 


        System.out.println("\nRealice la carga de los datos del stock");
        System.out.println("------------------------------\n");
        System.out.println("La 1er posicion corresponde al stock inicial de cada articulo que se comercializa y la 2da, corresponde a la cantidad vendida. Se repite la secuencia con cada articulo.\n");
        System.out.println("El stock inicial de cada producto es limitado a 10 unidades.\n");
        System.out.println("Almacenados en la bodega de Deposito: Art.1 (Gabinete), Art.2 (Memoria Ram), Art.3 (Fuente de Alimentacion), Art.4 (Microprocesadores), Art.5 (Discos Rigidos), Art.6 (Motherboards), Art.7 (Mouses), Art8. (Teclados), Art.9 (Parlantes), Art.10 (Microfonos)y alacenados. Almacenados en la bodega de Produccion: Art.11 (PC1), Art.12 (PC2), Art.13 (PC3)\n\n");
        System.out.println("**Ingrese los datos**\n");


        for(int i=0; i<fila; i ++){
            for(int j=0; j<2;j ++){
            System.out.println("stock[" + i + "][" + j + "]" );
            stock[i][j]=Integer.parseInt(System.console().readLine());
            }
        }

        //Se visualiza en la pantalla la tabla de Stock
        System.out.println("                         TABLA DE STOCK" + "\n                        ---------------\n\n");
        System.out.println("             Stock Inicial      |    Cantidad Vendida      |       Stock Disponible");
        System.out.println("------------------------------------------------------------------------------------");
        for(int i=0; i<fila; i ++){
            System.out.print("Art."+( i+1));
            for(int j=0; j<columna ; j ++){
            System.out.print( "             " + stock[i][j] + "            ");
            stock[0][2]= stock[0][0]-stock[0][1];
            stock[1][2]= stock[1][0]-stock[1][1];
            stock[2][2]= stock[2][0]-stock[2][1];
            stock[3][2]= stock[3][0]-stock[3][1];
            stock[4][2]= stock[4][0]-stock[4][1];
            stock[5][2]= stock[5][0]-stock[5][1];
            stock[6][2]= stock[6][0]-stock[6][1];
            stock[7][2]= stock[7][0]-stock[7][1];
            stock[8][2]= stock[8][0]-stock[8][1];
            stock[9][2]= stock[9][0]-stock[9][1];
            stock[10][2]= stock[10][0]-stock[10][1];
            stock[11][2]= stock[11][0]-stock[11][1];
            stock[12][2]= stock[12][0]-stock[12][1];
            

            }
            if((stock[i][2]==0)&&(i>=0 && i<=9)){
                System.out.print("\n*******Solicitar stock al area de DEPOSITO*********");
                PEDIDOS.PedirStock.pedirCargaStockDepo(i);
            }else if ((stock[i][2]==0)&&(i>=10 && i<=12)) {
                System.out.print("\n*******Solicitar stock al area de PRODUCCION*******");
                PEDIDOS.PedirStock.pedirCargaStockProd();
            }
            System.out.println();
           
        }
        
    }
    
}