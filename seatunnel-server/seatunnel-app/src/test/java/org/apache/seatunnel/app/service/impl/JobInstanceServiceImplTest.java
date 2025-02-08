package org.apache.seatunnel.app.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JobInstanceServiceImplTest {

    @Autowired private JobInstanceServiceImpl jobInstanceServiceImpl;

    @Test
    void testCreateJobConfig() {
        String s = jobInstanceServiceImpl.generateJobConfigByJobId(2, 15697364989408L, null);
//        String s = jobInstanceServiceImpl.generateJobConfigByJobId(2, 15565861321824L, null);

        System.out.println(s);
    }
}
