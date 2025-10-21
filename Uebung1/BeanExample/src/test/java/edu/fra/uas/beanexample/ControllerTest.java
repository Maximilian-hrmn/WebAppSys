package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest
public class ControllerTest {
    
    @Autowired
    private BeanController beanController;

    @Autowired
    private MessageService messageService;

    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo(" put messgae: Das ist ein Test");
    }
    void testCounter() {
        int before = messageService.getCounter();
        beanController.putMessage("Test");
        int after = messageService.getCounter();
        assertThat(after).isEqualTo(before + 1);
    }

}