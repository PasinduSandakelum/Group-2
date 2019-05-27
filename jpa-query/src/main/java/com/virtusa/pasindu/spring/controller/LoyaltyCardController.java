package com.virtusa.pasindu.spring.controller;

import com.virtusa.pasindu.spring.model.LoyaltyCard;
import com.virtusa.pasindu.spring.service.LoyaltyCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/loyalty")
public class LoyaltyCardController {
    @Autowired
    private LoyaltyCardService loyaltyCardService;

    @RequestMapping(value = "/card", method = RequestMethod.POST)
    public ResponseEntity<LoyaltyCard> create(@Valid  @RequestBody LoyaltyCard loyaltyCard) {
        return ResponseEntity.ok(loyaltyCardService.save(loyaltyCard));
    }

    @RequestMapping(value = "/card", method = RequestMethod.GET)
    public ResponseEntity<LoyaltyCard> getByNumber(@PathParam(value = "number") String number) {
        return ResponseEntity.ok(loyaltyCardService.findByNumber(number));
    }

    @RequestMapping(value = "/card/customer", method = RequestMethod.GET)
    public ResponseEntity<List<LoyaltyCard>> getByCustomerName(@PathParam(value = "customerName") String customerName) {
        return ResponseEntity.ok(loyaltyCardService.findByUserName(customerName));
    }

    @RequestMapping(value = "/card/customer/email", method = RequestMethod.GET)
    public ResponseEntity<List<LoyaltyCard>> getByCustomerEmail(@PathParam(value = "customerEmail") String customerEmail) {
        return ResponseEntity.ok(loyaltyCardService.findByCustomerEmail(customerEmail));
    }

    @RequestMapping(value = "/cards", method = RequestMethod.GET)
    public ResponseEntity<List<LoyaltyCard>> getAll() {
        return ResponseEntity.ok(loyaltyCardService.fetchAll());
    }
}
