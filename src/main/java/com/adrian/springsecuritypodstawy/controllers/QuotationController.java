package com.adrian.springsecuritypodstawy.controllers;

import com.adrian.springsecuritypodstawy.models.Quotation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationController {

    private List<Quotation> quotations;

    public QuotationController() {
        quotations = new ArrayList<>();
        quotations.add(new Quotation("Czytanie książek to najpiękniejsza zabawa, jaką sobie ludzkość wymyśliła", "Wisława Szymborska"));
        quotations.add(new Quotation("Książki są lustrem: widzisz w nich tylko to co, już masz w sobie.", "Carlos Ruiz Zafón"));
    }

    @GetMapping("/all")
    public List<Quotation> getAll() {
        return quotations;
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Quotation quotation) {
        return quotations.add(quotation);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int index) {
        quotations.remove(index);
    }
}
