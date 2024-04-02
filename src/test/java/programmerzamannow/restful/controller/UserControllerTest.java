package programmerzamannow.restful.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import programmerzamannow.restful.repository.UserRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
  
  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private UserRepository userRepository;

  @BeforeEach
  void setUp(){
    userRepository.deleteAll();
  }

  @Test
  void testRegisterSuccess() {
    mockMvc.perform(
      post("/api/users")
      .content("")
    )
  }
}
