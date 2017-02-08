package com.project.dao;

import com.project.bean.Bill;

public interface BillDao {
Bill generateBill(int customerId);
List<BillDetails> getBillDetails(int customerId);
List<BillDetails> getAllBillDetails();


}
