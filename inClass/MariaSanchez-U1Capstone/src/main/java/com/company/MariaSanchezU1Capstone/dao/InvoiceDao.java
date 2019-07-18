package com.company.MariaSanchezU1Capstone.dao;

import com.company.MariaSanchezU1Capstone.models.Invoice;

import java.util.List;

public interface InvoiceDao {

    Invoice addInvoice(Invoice invoice);

    Invoice getInvoice(int id);

    List<Invoice> getAllInvoices();

    void deleteInvoice(int id);
}
