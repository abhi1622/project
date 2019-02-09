package com.cg.miniproject.repository;
import com.cg.miniproject.bean.*;
import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class MobileRepo {

	void mobileShow()
	{
		
	
	
	Map<Integer,Mobile> hm=new HashMap();
	hm.put(1001, new Mobile(1001,"Nokia Lumia",8000d,20));
	hm.put(1002,new Mobile(1002,"Samsung",38000d,40));
    hm.put(1003,new Mobile(1003,"Sony Experia",15000d,30));
	
}
}