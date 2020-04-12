package io.qmeta.benchmarks.db.jpa;

import io.qmeta.benchmarks.db.core.DaoBenchmarkService;
import io.qmeta.benchmarks.db.entity.User;
import io.qmeta.benchmarks.db.jpa.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * QMETA
 * created at: 2020/4/11
 * created by: patrick
 **/
@Service
public class JpaDaoBenchmarkService implements DaoBenchmarkService {

    final UserService userService ;

    public JpaDaoBenchmarkService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void testAdd() {
        User user = next();
        userService.add(user);
    }

    @Override
    public void testUnique() {
        userService.findById(1);
    }

    @Override
    public void testUpdateById() {
        User user = new User();
        user.setId(1);
        user.setCode("abc");
        userService.update(user);
    }

    @Override
    public void testPageQuery() {
        userService.customQuery(new HashMap());
    }

    @Override
    public void testQuery() {
        testPageQuery();
    }
}
