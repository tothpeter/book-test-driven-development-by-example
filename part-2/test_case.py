from test_result import *

class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def run(self, result):
        result.testStarted()

        self.setUp()

        try:
            method = getattr(self, self.name)
            method()
        except Exception as e:
            result.testFailed()

        self.tearDown()
