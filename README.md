# MeanFinder
Probabilistic mean approximator

## Background
Wanted to observe how quickly randomly selected values from a collection can approximate a true mean.
By calculating incremental means (every 5 random picks), we can observe the effect on the approximation and its difference from the true mean.

Sample Output for a run:
```
Actual Mean: 52.28
Approximations:
#0: 24 80 41 79 18 
Rich Mean: 48.4
Deviation from true mean: -3.8800000000000026

#1: 80 72 6 95 40 
Rich Mean: 53.5
Deviation from true mean: 1.2199999999999989

#2: 87 61 39 49 92 
Rich Mean: 57.53333333333333
Deviation from true mean: 5.25333333333333

#3: 22 15 45 5 62 
Rich Mean: 50.6
Deviation from true mean: -1.6799999999999997

#4: 88 26 61 49 56 
Rich Mean: 51.68
Deviation from true mean: -0.6000000000000014

#5: 61 40 87 88 26 
Rich Mean: 53.13333333333333
Deviation from true mean: 0.8533333333333317
```
