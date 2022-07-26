package pl.coderslab.Warsztaty_zaliczeniowe;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/zaliczenie/Zadanie_warsztatowe_1.feature", plugin = {"pretty","html:out"})
public class Zaliczenie_Zadanie_1_CucumberRunner {
}
