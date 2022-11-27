package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("12D34AAA");

        Product p1 = new Product("Box");
        Product p2 = new Product("Paper");
        Product p3 = new Product("Scissors");

        Item item1 = new Item(p1, new BigDecimal("2.12"), 34);
        Item item2 = new Item(p2, new BigDecimal("14.5"), 10);
        Item item3 = new Item(p3, new BigDecimal("23.99"), 5);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        invoice.setItems(itemList);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteAll();
    }
}
