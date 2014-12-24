package com.shinowit.test;

import com.shinowit.dao.mapper.StudentMapper;
import com.shinowit.dao.mapper.Teacher1Mapper;
import com.shinowit.dao.mapper.UserMapper;
import com.shinowit.entity.Student;
import com.shinowit.entity.StudentExample;
import com.shinowit.entity.Teacher1;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daihui on 2014-12-23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestMybatis extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserMapper userDAO;

    @Resource
    private StudentMapper studentDAO;

    @Resource
    private Teacher1Mapper teacher1DAO;

    protected final Logger logger = Logger.getLogger(getClass());

    @Test
    public void test1() {



//        StudentExample ex=new StudentExample();//比较复杂的用StudentExample作参数的方法解决N+1问题
//        ex.createCriteria().andTeacherIdEqualTo(1);
//        List<Student> studentList=studentDAO.selectStudentWithTeacherNameByPrimaryKey(ex);
//        for(Student student:studentList){
//            logger.debug(student.getTeacherName());
//        }

//        List<Student> studentList=studentDAO.selectStudentWithTeacherNameByPrimaryKey(1);//用自己写sql语句的方法解决N+1查询问题
//         logger.debug(studentList.get(0).getTeacherName());


//        Teacher1 teacher11=teacher1DAO.selectByPrimaryKey(1);//oneTomany老师附带出学生
//        for(Student stu:teacher11.getStudentList()){
//            logger.debug(stu.getName());
//        }

//        Student stu=studentDAO.selectByPrimaryKey(2);//ManyToOne查学生附带老师
//        logger.debug(stu.getTea().getName());

//        UserExample paging = new UserExample();
//        paging.setPageSize(2);
//        paging.setPageIndex(3);
//        List<User> userList = userDAO.selectPage(paging);//分页查询
//        for (User user : userList) {
//            logger.debug("用户名：" + user.getUserName());
//        }

//        List<User> userList = userDAO.selectPage1(2,3);//手动分页查询
//        for (User user : userList) {
//            logger.debug("用户名：" + user.getUserName());
//        }

//        UserExample userExample=new UserExample();
//        UserExample.Criteria tiaojian=userExample.createCriteria();//创建查询条件
//        tiaojian.andUserIdLessThanOrEqualTo(20);
//        List<User> userList=userDAO.selectByExample(userExample);//查询
//        for(User user:userList){
//            logger.debug("用户名："+user.getUserName());
//        }

//        int i=userDAO.deleteByPrimaryKey(65);//删除
//         logger.debug(i);

//        User user = userDAO.selectByPrimaryKey(18);//修改
//        user.setUserName("一个艾斯比");
//        int i = userDAO.updateByPrimaryKey(user);
//        logger.debug(i);

//        User user=new User();//插入
//        user.setUserId(621022);
//        user.setUserName("测2122试");
//        user.setUserPass("3132");
//        userDAO.insert(user);
//        String name=user.getUserName();
//        logger.debug(name);
    }


}
