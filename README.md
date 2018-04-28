Solving Travel Mans Sales Problems Using Simulated Annealing Algorithm 
Implemented in Java, Neatbeans Platform 

This algorithm works by comparing new random solution to current
solution. The algorithm can accept worse solution to allow for more exhaustive search,
however the probability of that happening will start decreasing as the temperature cools
down by a given rate.

A SimulatedAnnealing program has 6 classes

Main.java

Reads data set file and creates new simulation

City.java

Contains city names, x-coordinate, y-coordinate, euclidean distance between two cities

SingleTravel.java

adds distance between each pair of cities, represents distance of the whole tour

SingleTravelManager.java

keeps track of the destination cities and number of cities
stores everything in the array list

Simulation.java

chooses the tours and the travels randomly as temperature is cooling down by given
cooling rate. There has been different experimentations of trying different temperatures
and cooling rates by looking at different examples. A temp of 10000 and cooling rate of
0.00003 seems to give better results.

MersenneTwister.java

In the simulated annealing as a pseudo random number generator (PRNG) a Mersenne
Twister was used. It provides for fast generation of very high quality pseudorandom
integers, which is specifically used for Monte Carlo simulations. Its execution speed and
high quality randomness make it very suitable generator for TSP.
The code of implementing the Mersenne Twister was taken from Link ,since Mersenne
Twister relies on bit shifts it is tricky for implementation in Java, which does not support
unsigned number.

FileReader.java

Reads data file and splits data by city, coordinate X, coordinate Y and saves data to
arraylist
