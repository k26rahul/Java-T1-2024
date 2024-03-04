def elementSum(n):
  if (n == 0):
    return 0
  else:
    return n % 10 + elementSum(n//10)


elementSum(123)
