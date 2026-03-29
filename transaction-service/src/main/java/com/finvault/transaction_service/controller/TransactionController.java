package com.finvault.transaction_service.controller;
import com.finvault.transaction_service.entity.Transaction;
import com.finvault.transaction_service.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction created = transactionService.createTransaction(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id) {
        Transaction transaction = transactionService.getTransactionById(id);
        return ResponseEntity.ok(transaction);
    }

    @GetMapping("/from/{fromAccountId}")
    public ResponseEntity<List<Transaction>> getTransactionsByFromAccount(
            @PathVariable Long fromAccountId) {
        List<Transaction> transactions = transactionService
                .getTransactionsByFromAccountId(fromAccountId);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/to/{toAccountId}")
    public ResponseEntity<List<Transaction>> getTransactionsByToAccount(
            @PathVariable Long toAccountId) {
        List<Transaction> transactions = transactionService
                .getTransactionsByToAccountId(toAccountId);
        return ResponseEntity.ok(transactions);
    }
}
