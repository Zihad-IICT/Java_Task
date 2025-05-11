package PrcaticePrbOOP;
public class MethodOverloading {
    //String category;
   // String brand;
    //int priceRange;
    void filterProduct(String brand)
    {
        System.out.println("Brand="+brand);
    }
    void filterProducts(String category){
        System.out.println("Category="+category);
    }
    void filterProducts(int minPrice,int maxPrice ){
        System.out.println("Price Range="+minPrice +maxPrice);
    }
    void filterProducts(String category,int minPrice,int maxPrice){
        System.out.println("Category and Price Range="+category +minPrice +maxPrice);
    }
    void filterProducts(String category,String brand, int minPrice,int maxPrice) {
        System.out.println("Category,Brand and Price Range=" + category +brand +minPrice +maxPrice);
    }

    public static void main(String[] args) {
        MethodOverloading u1=new MethodOverloading();
       u1.filterProduct("Apple");
       u1.filterProducts("Electronics");
       u1.filterProducts(100,500);
       u1.filterProducts("Electronics",100,500);
       u1.filterProducts("Electronics","Apple",100,500);

    }


}
