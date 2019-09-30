class TestResult(object):
    def __init__(self):
        self.runCount = 0

    def summary(self):
        return "%d run, 0 failed" % self.runCount

    def testStarted(self):
        self.runCount += 1
