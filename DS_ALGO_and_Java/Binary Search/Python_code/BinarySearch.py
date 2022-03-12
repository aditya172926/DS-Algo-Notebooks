class BinarySearch:
    def __init__(self, target):
        self.arr = [1,2,3,4,5,6,7,8,9,12,14,15,17,65,78,99,102,103]
        self.target = target
    def binarySearch(self):
        start = 0
        end = len(self.arr)-1
        while (start <= end):
            mid = start + (end - start)//2
            if self.target == self.arr[mid]:
                return mid
            elif self.target > self.arr[mid]:
                start = mid + 1
            else:
                end = mid - 1
        return -1

target = int(input("Enter the target variable"))
bs = BinarySearch(target)
print(bs.binarySearch())