package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BankTest.class, MoneyTest.class, SumTest.class, IntegrationTest.class })
public class AllTests {

}
