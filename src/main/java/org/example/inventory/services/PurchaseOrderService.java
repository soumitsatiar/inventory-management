package org.example.inventory.services;

import org.example.inventory.entities.OrderStatus;
import org.example.inventory.entities.PurchaseOrder;
import org.example.inventory.repos.PurchaseOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;

    public PurchaseOrder createPurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepo.save(purchaseOrder);
    }

    public List<PurchaseOrder> getAllPurchaseOrders() {
        return purchaseOrderRepo.findAll();
    }

    public PurchaseOrder getPurchaseOrderById(Long id) {
        return purchaseOrderRepo.findById(id).orElse(null);
    }

    public void cancelPurchaseOrder(Long id) {
        PurchaseOrder purchaseOrder = purchaseOrderRepo.findById(id).orElse(null);
        if (purchaseOrder != null) {
            purchaseOrder.setStatus(OrderStatus.CANCELLED);
            purchaseOrderRepo.save(purchaseOrder);
        }
    }

    public PurchaseOrder completePurchaseOrder(Long id) {
        PurchaseOrder purchaseOrder = purchaseOrderRepo.findById(id).orElse(null);
        if (purchaseOrder != null) {
            purchaseOrder.setStatus(OrderStatus.COMPLETED);
            return purchaseOrderRepo.save(purchaseOrder);
        }
        return null;
    }

}
