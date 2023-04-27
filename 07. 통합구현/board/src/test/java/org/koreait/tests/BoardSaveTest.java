package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("게시글 저장 단위 및 통합 테스트")
@TestPropertySource(locations="classpath:application-test.properties")
public class BoardSaveTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("게시글이 정상적으로 등록, 수정되면 예외가 발생하지 않음")
    void saveSuccessTest() throws Exception {
        mockMvc.perform(post("/board/write")
                        .param("subject", "제목")
                        .param("content", "내용"))
                .andDo(print())
                .andExpect(redirectedUrl("/board/list"));
    }

    @Test
    @DisplayName("필수항목 - 제목,내용")
    public void validationTest1() throws Exception {
        String body = mockMvc.perform(post("/board/write"))
                .andReturn().getResponse().getContentAsString();

        assertTrue(body.contains("제목을 입력하세요."));
        assertTrue(body.contains("내용을 입력하세요"));
    }
}
