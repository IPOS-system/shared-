package api;

import java.util.List;
import model.ProductDTO;

public interface ICatalogAPI {

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(int productId);

    List<ProductDTO> searchProductsByKeyword(String keyword);

    boolean updateProductStock(int productId, int newStockLevel);
}
