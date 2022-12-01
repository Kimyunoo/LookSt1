package kr.co.lookst.seller.service;

import java.util.List;

import kr.co.lookst.main.domain.SearchItem;
import kr.co.lookst.seller.domain.MySalesDto;
import kr.co.lookst.seller.domain.OrderListDto;
import kr.co.lookst.seller.domain.PrdtListDto;


public interface SellerService {

	int getSearchResultCnt(SearchItem sc) throws Exception;

	List<OrderListDto> getsearchResultPage(SearchItem sc) throws Exception;

	int getSearchResultCntP(SearchItem sc) throws Exception;

	List<PrdtListDto> getsearchResultPageP(SearchItem sc) throws Exception;

	int productDelete(Integer product_no) throws Exception;

	int getSearchResultCntR(SearchItem sc) throws Exception;

	List<OrderListDto> getsearchResultPageR(SearchItem sc) throws Exception;

	int productStock(Integer product_no, int stock) throws Exception;

	int OrderStatusMod(Integer prdt_order_no, String orderStatus) throws Exception;

	int ReqOrderStatusMod(Integer prdt_order_no, String ReqOrderStatus) throws Exception;

	List<MySalesDto> newSale() throws Exception;
	
	List<MySalesDto> newCancel() throws Exception;
	
//	MySalesDto todaySale() throws Exception;
	

}
