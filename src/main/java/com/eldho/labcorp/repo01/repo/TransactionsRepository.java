package com.eldho.labcorp.repo01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.eldho.labcorp.repo01.entity.TransactionsEntity;

@Repository
public interface TransactionsRepository extends JpaRepository<TransactionsEntity, String> {

	@Query("select txns from TransactionsEntity txns where txns.customerId = ?1")
	List<TransactionsEntity> findTransactionsForCustomer(String customerId);

}
