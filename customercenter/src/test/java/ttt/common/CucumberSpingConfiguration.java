package ttt.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import ttt.CustomercenterApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomercenterApplication.class })
public class CucumberSpingConfiguration {}
