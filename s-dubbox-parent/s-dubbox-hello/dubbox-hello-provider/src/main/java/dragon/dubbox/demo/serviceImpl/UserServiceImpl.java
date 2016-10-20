package dragon.dubbox.demo.serviceImpl;

import dragon.dubbox.demo.api.domain.User;
import dragon.dubbox.demo.api.service.UserService;

/**
 * @author Dragon
 * @version V1.0
 * @Title: dragon.dubbox.demo.serviceImpl.UserServiceImpl
 * @Description:
 * @date 2016/10/13 19:24
 */
public class UserServiceImpl implements UserService{

	@Override
	public User getUser(Long id) {
		return new User(id,"username"+id);
	}
}
