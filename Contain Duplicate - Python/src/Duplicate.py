def containsDuplicate(self, nums):
        if len(set(nums)) < len(nums):
            return True
        return False