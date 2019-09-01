package com.zh.hrm.service;

import com.zh.hrm.App9001Sysmanage;
import com.zh.hrm.domain.Systemdictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App9001Sysmanage.class)
public class ISystemdictionaryServiceTest {
    @Autowired
    private ISystemdictionaryService systemdictionaryService;
    @Test
    public void testFindAll() throws Exception{
        List<Systemdictionary> list = systemdictionaryService.selectList(null);
        for (Systemdictionary systemdictionary : list) {
            System.out.println(systemdictionary);
        }

    }
}