package com.newer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newer.bean.Slogan;
import com.newer.dao.SloganDao;
import com.newer.service.HomeService;
import com.newer.service.SloganService;

@SpringBootTest
class GoodsStystemApplicationTests {
	
	
	@Autowired 
	SloganDao sloganDao;
    @Test
    void contextLoads() {
    	System.out.println("进");
    	List<Slogan> list=sloganDao.allSlogan();
    	for(Slogan s:list) {
    		System.out.println(s.toString());
    	}
    	System.out.println("出");
    	
//    	System.out.println("用户数量:"+homeService.allusers());
//    	System.out.println("订单数量:"+homeService.orderNum());
//    	System.out.println("交易金额:"+homeService.totalPrice());
//    	System.out.println("未处理订单数:"+homeService.unOrders());
//    	System.out.println("待发货订单数:"+homeService.droOrders());
//    	System.out.println("待结算订单数:"+homeService.forOrders());
//    	System.out.println("已成交订单数:"+homeService.makeOrders());
//    	System.out.println("交易失败订单数:"+homeService.failOrders());
//    	
//    	System.out.println("商品总数:"+homeService.goodsNum());
//    	System.out.println("回收站商品:"+homeService.recGoodsNum());
//    	System.out.println("上架站商品:"+homeService.putGoodsNum());
//    	System.out.println("下架站商品:"+homeService.outGoodsNum());
    }

}
