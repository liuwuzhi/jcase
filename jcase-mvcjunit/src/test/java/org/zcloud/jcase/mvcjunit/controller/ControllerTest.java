package org.zcloud.jcase.mvcjunit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;
import org.zcloud.jcase.mvcjunit.model.pojo.User;
import org.zcloud.jcase.mvcjunit.service.UserService;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author wuzhi liu
 * @create 2022-07-21 09:13
 */
@WebMvcTest(Controller.class)
public class ControllerTest {
    @MockBean
    UserService userService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void index() throws Exception {
        String responseString = mockMvc.perform(get("/")).andExpect(status().isOk()).andDo(print()).andReturn().getResponse().getContentAsString();
        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, String.class);
        List<String> response = mapper.readValue(responseString, javaType);
        Assert.isTrue(response.size() == 2, "返回结果正确");
    }

    @Test
    public void users() throws Exception {
        when(userService.userList()).thenReturn(Arrays.asList(new User()));

        String responseString = mockMvc.perform(get("/users")).andExpect(status().isOk()).andDo(print()).andReturn().getResponse().getContentAsString();

        ObjectMapper mapper = new ObjectMapper();
        JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, User.class);
        List<User> response = mapper.readValue(responseString, javaType);

        Assert.isTrue(response.size() == 1, "返回结果正确");
    }
}
