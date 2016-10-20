package dragon.dubbox.demo.api.restService;

import dragon.dubbox.demo.api.domain.User;

import javax.validation.constraints.Min;

/**
 * @author Dragon
 * @version V1.0
 * @Title: UserRestService
 * @Description:
 * @date 2016/10/13 18:10
 */
public interface UserRestService {
	User getUser(@Min(value = 1L, message = "User ID must be greater than 1") Long id);
}
