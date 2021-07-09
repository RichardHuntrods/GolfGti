package com.qa.springgolfGtiDemo.repo;

import org.springframework.stereotype.Repository;

import com.qa.springgolfGtiDemo.domain.GolfGti;
import com.qa.springgolfGtiDemo.service.List;
import com.qa.springgolfGtiDemo.service.golf;
import com.qa.springgolfGtiDemo.service.publicList;
import com.qa.springgolfGti.domain.GolfGti;
@Repository
public interface GolfGtiRepo extends JPARepository<GolfGti, Long> {

	void deleteCar(Long id);

}





	

}
