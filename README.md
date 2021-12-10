# MeanFinder
Probabilistic mean approximator

## Background
Wanted to observe how quickly randomly selected values from a collection can approximate a true mean.
By calculating incremental means (every 5 random picks), we can observe the effect on the approximation and its difference from the true mean.

### RichMean
An iteratively-enriched mean is computed from a growing pool of randomly-selected elements in the collection generated.

Sample Output for a run:
```
TRUE MEAN: 50.64 // For a collection of 50 random integers on the range [1,100]

Approximations:
==============================
Iter#0: 43 58 58 40 32 
Rich Mean: 46.2
Deviation from true mean: -4.439999999999998

Iter#1: 43 90 94 75 35 
Rich Mean: 56.8
Deviation from true mean: 6.159999999999997

Iter#2: 79 35 58 47 79 
Rich Mean: 57.733333333333334
Deviation from true mean: 7.093333333333334

Iter#3: 83 23 75 74 86 
Rich Mean: 60.35
Deviation from true mean: 9.71

Iter#4: 35 43 23 74 35 
Rich Mean: 56.68
Deviation from true mean: 6.039999999999999

Iter#9: 75 86 16 20 79 
Rich Mean: 54.62
Deviation from true mean: 3.979999999999997

Iter#19: 32 7 65 35 77 
Rich Mean: 53.34
Deviation from true mean: 2.700000000000003

Iter#29: 56 79 74 34 27 
Rich Mean: 51.3
Deviation from true mean: 0.6599999999999966

Iter#39: 58 10 34 16 43 
Rich Mean: 50.405
Deviation from true mean: -0.23499999999999943

Iter#49: 40 20 66 72 83 
Rich Mean: 49.88
Deviation from true mean: -0.759999999999998

Iter#59: 40 74 56 74 79 
Rich Mean: 50.06
Deviation from true mean: -0.5799999999999983

Iter#69: 26 26 55 56 34 
Rich Mean: 49.92285714285714
Deviation from true mean: -0.7171428571428606

Iter#79: 58 74 10 47 37 
Rich Mean: 49.6675
Deviation from true mean: -0.9725000000000037

Iter#89: 40 55 35 86 63 
Rich Mean: 50.23111111111111
Deviation from true mean: -0.40888888888888886

Iter#99: 43 75 32 36 83 
Rich Mean: 49.808
Deviation from true mean: -0.8320000000000007
```

Note the minimization of the computed deviation from true mean. As more randomly-selected elements are used to balance out the rich mean,
our calculation of the difference between rich mean and true mean decreases.
