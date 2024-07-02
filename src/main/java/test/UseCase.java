package test;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Documented
@Service
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
}
