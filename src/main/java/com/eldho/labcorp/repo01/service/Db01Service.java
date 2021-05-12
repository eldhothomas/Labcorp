package com.eldho.labcorp.repo01.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.eldho.labcorp.repo01.entity.TransactionsEntity;
import com.eldho.labcorp.repo01.repo.TransactionsRepository;

@Service
public class Db01Service {

    @Autowired
    private TransactionsRepository txnRepository;

    private static final Logger logger = LogManager.getLogger(Db01Service.class);

    /**
     * This method retrieves all the transactions for a customer
     * 
     * @param customerId
     * @return
     */
    @Transactional(value = "db01TransactionManager")
    public List<TransactionsEntity> getTransactionsForCustomer(String customerId) {
    	logger.info("Reading transactions from database for customer {}", customerId);
    	List<TransactionsEntity> txns = txnRepository.findTransactionsForCustomer(customerId);
    	return txns;
    }
}
