package com.kodluyoruz;

/**
 * Subclass representing a product to be purchased
 * (using the formula "buy 2 take 3")
 * It extends the Product class with one instance variable
 */

public class Buy2Take3Product extends Product {
    //original product
    private final Product original;

    /**
     * Construct a Buy2Take3 product
     * If the price of this product can not be reduced
     * you should print a message to the user and terminate the
     * program
     *
     * @param original
     */
    public Buy2Take3Product(Product original) {
        super(original);

        this.original = original;

        // if the price can not be reduced you should print a message and
        // terminate the program. Use IllegalArgumentException to terminate.
        // code here
    }

    /**
     * Return false if the product price can not be
     * reduced
     *
     * @return
     */
    public boolean canBeReduced() {
        return false;
    }

    /**
     * Return the unit price of a product using the
     * formula "Buy2Take3"
     *
     * @param cart shopping cart
     * @return unit price
     */
    public double getPrice(Cart cart) {

        long productCount = cart
                .getProducts()
                .stream()
                // sepette bu urunle ayni isimdeki urunleri filtrele
                .filter(product -> product.getName() == this.getName())
                .count();

        // Kac adet 3'erli urun grubu var
        long groupCount = productCount / 3;
        // Fiyati odenecek urun sayisi
        long productCountToBeCalculated = productCount - groupCount;
        // toplam odenecek urun fiyati
        double totalPrice = productCountToBeCalculated * this.original.getPrice(cart);
        //her bir urunun fiyati
        double eachProductPrice = totalPrice / productCount;

        return eachProductPrice;
    }

}

