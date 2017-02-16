#!/bin/bash
echo "Give a number"
read count
factorial=1
while [ $count -gt 0 ] 
do
   factorial=`expr $count * $factorial`
   count=`expr $count - 1`
 done
echo $factorial

