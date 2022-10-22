package com.ihrm.company.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class CompanyDaoTest {

    @Autowired
    CompanyDao companyDao;

    @Test
    void testAdd() {
        System.out.println("test----------------------");
//        Company s = new Company();
//        s.setName("weike");
//        s.setCompanyPhone("122");
//        companyDao.save(s);
    }
}