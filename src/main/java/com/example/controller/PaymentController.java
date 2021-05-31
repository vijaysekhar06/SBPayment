package com.example.controller;
import com.example.entity.Payment;
import com.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) throws Exception {
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId){
              return service.findPaymentHistoryByOrderId(orderId);
    }


}