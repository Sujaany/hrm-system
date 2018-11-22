package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.RequestPromotion;

public interface RequestPromotionService {
	boolean addRequestPromotion(RequestPromotion requestPromotion);

	List<RequestPromotion> getAllRequestPromotion();

	boolean updateRequestPromotion(RequestPromotion equestPromotion, Integer id);

	RequestPromotion getRequestPromotionByUserId(int userId);

	boolean deleteRequstPromotion(Integer id);
}
