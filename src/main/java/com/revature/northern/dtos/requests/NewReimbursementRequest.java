package com.revature.northern.dtos.requests;

import java.util.Arrays;

public class NewReimbursementRequest {
    private String reim_id;
    private double amount;
    private String description;
    private byte[] receipt;

    private String payment_id;
    private String author_id;
    private String resolver_id;
    private String status_id;
    private String type_id;

    public NewReimbursementRequest() {
    }

    public NewReimbursementRequest(String reim_id, double amount, String description, byte[] receipt, String payment_id, String author_id, String resolver_id, String status_id, String type_id) {
        this.reim_id = reim_id;
        this.amount = amount;
        this.description = description;
        this.receipt = receipt;
        this.payment_id = payment_id;
        this.author_id = author_id;
        this.resolver_id = resolver_id;
        this.status_id = status_id;
        this.type_id = type_id;
    }

    public String getReim_id() {
        return reim_id;
    }

    public void setReim_id(String reim_id) {
        this.reim_id = reim_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getReceipt() {
        return receipt;
    }

    public void setReceipt(byte[] receipt) {
        this.receipt = receipt;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getResolver_id() {
        return resolver_id;
    }

    public void setResolver_id(String resolver_id) {
        this.resolver_id = resolver_id;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        return "NewReimbursementRequest{" +
                "reim_id='" + reim_id + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", receipt=" + Arrays.toString(receipt) +
                ", payment_id='" + payment_id + '\'' +
                ", author_id='" + author_id + '\'' +
                ", resolver_id='" + resolver_id + '\'' +
                ", status_id='" + status_id + '\'' +
                ", type_id='" + type_id + '\'' +
                '}';
    }
}
