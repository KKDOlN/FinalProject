package com.house.jachui.trade.model.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.house.jachui.trade.controller.dto.TradeAddRequest;
import com.house.jachui.trade.controller.dto.TradeUpdateRequest;
import com.house.jachui.trade.model.vo.Trade;

@Mapper
public interface TradeMapper {

	List<Trade> selectListAll(RowBounds rowBounds);

	List<Trade> selectSearchList(String searchKeyword, int currentPage);

	Trade selectOneByNo(int tradeNo);
	
	int getTotalCount();

	int getTotalCount(String searchKeyword);

	int insertTrade(TradeAddRequest trade);

	int updateTrade(TradeUpdateRequest trade);

	int deleteTrade(int tradeNo);


	




}