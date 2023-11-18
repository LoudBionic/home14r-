import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void RemoveTest() {

        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "куртка", 10_000);
        Product product2 = new Product(33, "телевизор", 30_000);
        Product product3 = new Product(123, "электросамокат", 90_000);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(123);
        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Remove2Test() {

        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "куртка", 10_000);
        Product product2 = new Product(33, "телевизор", 30_000);
        Product product3 = new Product(123, "электросамокат", 90_000);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(500)


        );

    }


}
