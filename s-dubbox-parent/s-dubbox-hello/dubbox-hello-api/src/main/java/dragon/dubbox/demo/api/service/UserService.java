package dragon.dubbox.demo.api.service;

import dragon.dubbox.demo.api.domain.User;

/**
 * @author Dragon
 * @version V1.0
 * @Title: UserService
 * @Description:
 * @date 2016/10/13 18:08
 */
public interface UserService {
	User getUser(Long id);
}
