from test_case import *
from test_suite import *

class WasRun(TestCase):
    def setUp(self):
        self.log = 'setUp '

    def tearDown(self):
        self.log = self.log + 'tearDown '

    def testMethod(self):
        self.log = self.log + 'testMethod '

    def testBrokenMethod(arg):
        raise Exception

class TestCaseTest(TestCase):
    def setUp(self):
        self.result = TestResult()

    def testTemplateMethod(self):
        test = WasRun('testMethod')
        test.run(self.result)
        assert(test.log == 'setUp testMethod tearDown ')

    def testResult(self):
        test = WasRun('testMethod')
        test.run(self.result)
        assert(self.result.summary() == '1 run, 0 failed')

    def testFailedResultFormatting(self):
        self.result.testStarted()
        self.result.testFailed()
        assert(self.result.summary() == '1 run, 1 failed')

    def testFailedResult(self):
        test = WasRun('testBrokenMethod')
        test.run(self.result)
        assert(self.result.summary() == '1 run, 1 failed')

    def testSuite(self):
        suite = TestSuite()
        suite.add(WasRun('testMethod'))
        suite.add(WasRun('testBrokenMethod'))
        suite.run(self.result)
        assert(self.result.summary() == '2 run, 1 failed')

suite = TestSuite()

suite.add(TestCaseTest('testTemplateMethod'))
suite.add(TestCaseTest('testResult'))
suite.add(TestCaseTest('testFailedResultFormatting'))
suite.add(TestCaseTest('testFailedResult'))
suite.add(TestCaseTest('testSuite'))

result = TestResult()

suite.run(result)

print result.summary()
