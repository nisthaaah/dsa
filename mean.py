import math

# Original prime numbers
prime_numbers = [61, 67, 71, 73, 79]

# Median of the prime numbers
median = 71

# Multiply each observation by the median
new_observations = [num * median for num in prime_numbers]

# Calculate the mean of the new observations
mean_new = sum(new_observations) / len(new_observations)

# Calculate the squared differences between each observation and the mean
squared_diffs = [(obs - mean_new)**2 for obs in new_observations]

# Calculate the mean of the squared differences
mean_squared_diffs = sum(squared_diffs) / len(squared_diffs)

# Calculate the standard deviation of the new observations
std_dev_new = math.sqrt(mean_squared_diffs)

# Calculate the difference between the standard deviations of the new observations and the median
difference = std_dev_new - median

print("Difference:", difference)
