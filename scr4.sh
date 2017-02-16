#!/bin/bash
echo "Please give 10 numbers"
i=0
max=0
while [ $i -lt 10 ]
do
read num
i=`expr $i + 1`
if [ $((num)) -gt $((max)) ];
then
max=$num
fi
done
echo $max
