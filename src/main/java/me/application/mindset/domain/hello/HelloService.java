package me.application.mindset.domain.hello;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloService {
	private final HelloRepository helloRepository;

	@Transactional
	public Hello save(Hello hello) {
		return helloRepository.save(hello);
	}
}
