from test_case import *

class WasRun(TestCase):
    def setUp(self):
        self.log = 'setUp '

    def testMethod(self):
        self.log = self.log + 'testMethod '

class TestCaseTest(TestCase):
    def testTemplateMethod(self):
        test = WasRun('testMethod')
        test.run()
        assert(test.log == 'setUp testMethod ')

TestCaseTest('testTemplateMethod').run()
