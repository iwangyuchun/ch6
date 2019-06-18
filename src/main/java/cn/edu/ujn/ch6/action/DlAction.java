package cn.edu.ujn.ch6.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.ujn.ch6.model.Dlb;
import cn.edu.ujn.ch6.service.IDlService;

public class DlAction {
	
	private Dlb dl;
	private IDlService dlService;
	

	public void setDlService(IDlService dlService) {
		this.dlService = dlService;
	}

	public Dlb getDl() {
		return dl;
	}

	public void setDl(Dlb dl) {
		this.dl = dl;
	}
	
	public String login() {
		Dlb dlb = dlService.find(dl);
		if(dlb!=null) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", dlb);
			return "ok";
		}else {
			return "error";
		}
		
		
	}
	

}
