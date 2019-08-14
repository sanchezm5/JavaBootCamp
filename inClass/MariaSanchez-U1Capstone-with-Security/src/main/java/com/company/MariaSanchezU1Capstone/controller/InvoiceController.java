package com.company.MariaSanchezU1Capstone.controller;

import com.company.MariaSanchezU1Capstone.service.GameStoreInventoryService;
import com.company.MariaSanchezU1Capstone.viewmodel.InvoiceViewModel;
import com.company.MariaSanchezU1Capstone.viewmodel.OrderViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/purchase")
public class InvoiceController {

    @Autowired
    GameStoreInventoryService gameStoreInventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceViewModel createInvoices(@RequestBody @Valid OrderViewModel invoice) {
        return gameStoreInventoryService.saveInvoice(invoice);
    }
}
