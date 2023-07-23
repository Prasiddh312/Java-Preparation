//Filtering Collection by using Stream.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class StreamAPI {
    public static void main(String[] args) {

        List<Product>productList=new ArrayList<Product>();
        //Adding Elements.

        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenovo Laptop",28000f));
        productList.add(new Product(4,"Sony Laptop",28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));


        List<Float>productPriceList=productList.stream()
                .filter(p->p.price>30000)   //Filtering Data
                .map(p->p.price)  //Fetching Price
                .collect(Collectors.toList()); //Collecting as List

        System.out.println(productPriceList);

    }
}
