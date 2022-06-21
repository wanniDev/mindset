package me.application.mindset.domain.hello;

import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelloServiceTest {

	@Mock
	HelloRepository helloRepository;

	@InjectMocks
	HelloService helloService;

	Hello fuck = Hello.builder().name("hello1").build();
	Hello result = new Hello(1L, "hello1");

	@Test
	void hello() {
		given(helloRepository.save(fuck)).will(invocation -> result);

		helloService.save(fuck);

		then(helloRepository).should(times(1)).save(fuck);
	}
}