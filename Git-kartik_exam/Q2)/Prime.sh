#!/bin/bash

is_prime() {
    local num=$1
    if (( num <= 1 )); then
        return 1 # Not prime
    fi
    for (( i=2; i*i<=num; i++ )); do
        if (( num % i == 0 )); then
            return 1 # Not prime
        fi
    done
    return 0 # Prime
}


read -p "Enter the number of prime numbers to print (n): " n

count=0
number=2

echo "The first $n prime numbers are:"
while (( count < n )); do
    if is_prime $number; then
        echo -n "$number "
        (( count++ ))
    fi
    (( number++ ))
done

echo