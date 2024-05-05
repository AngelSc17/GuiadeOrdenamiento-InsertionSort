public class Electronicos {
    public static void main(String[] args) {
        String[][] productos = {
            {"Smartphone", "Samsung", "Galaxy S20", "659.99"},
            {"Laptop", "Apple", "MacBook Air", "780.99"},
            {"Smartwatch", "Apple", "Apple Watch Series 6", "599.99"},
            {"Tablet", "Samsung", "Galaxy Tab S7", "649.99"},
            {"Auriculares", "Sony", "WH-1000XM4", "268.99"}
        };

        insertionSort(productos);

        System.out.println("Lista de productos ordenada por nombre:");
        for (String[] producto : productos) {
            System.out.println("Tipo: " + producto[0] + " - Marca: " + producto[1] + " - Modelo: " + producto[2] + " - Precio: $" + producto[3]);
        }
    }

    public static void insertionSort(String[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            String[] currentProduct = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j][2].compareTo(currentProduct[2]) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentProduct;
        }
    }
}
