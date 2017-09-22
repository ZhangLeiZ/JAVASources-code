package Intercetor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Interceptoruser extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String methodname = invocation.getProxy().getMethod();
		String classname= invocation.getAction().getClass().getName();
		System.out.println(methodname);
		System.out.println(classname);
		if(methodname!=null && classname.equals("Action.MethodAction")){
			if(methodname.equals("add") || methodname.equals("del") ||methodname.equals("select") ){
				String result = invocation.invoke();
				return result;
			}else{
				return "error";
			}
		}
		return null;
	}

}
