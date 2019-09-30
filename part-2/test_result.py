class TestResult(object):
    def __init__(self):
        self.runCount = 0
        self.errorCount = 0

    def summary(self):
        return "%d run, %d failed" % (self.runCount, self.errorCount)

    def testStarted(self):
        self.runCount += 1

    def testFailed(self):
        self.errorCount += 1
