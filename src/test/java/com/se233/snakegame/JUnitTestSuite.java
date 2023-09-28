package com.se233.snakegame;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@SelectClasses({GameLoopTest.class, SnakeTest.class})
@Suite
public class JUnitTestSuite {
}
