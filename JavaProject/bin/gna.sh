#!/bin/bash

for (( i = 0 ; i < 20 ; i += 1 )); do
java -Djava.security.policy=rmi.policy ClientCongresso localhost &
done



