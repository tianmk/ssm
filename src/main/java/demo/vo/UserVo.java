package demo.vo;

import java.text.SimpleDateFormat;

import demo.entity.User;

public class UserVo extends User {
	public String getRegdateAsString() {
		String r=null;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			r=sdf.format(getRegdate());
		}catch(Exception e) {}
		return r;
	}
	
	private UserVo() {}
	public static UserVo bean2vo(User bean) {
		UserVo vo=new UserVo();
		vo.setId(bean.getId());
		vo.setUsername(bean.getUsername());
		vo.setName(bean.getName());
		vo.setPassword(bean.getPassword());
		vo.setRegdate(bean.getRegdate());
		vo.setState(bean.isState());
		return vo;
	}
}
