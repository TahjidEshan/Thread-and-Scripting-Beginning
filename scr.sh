#!/bin/bash
echo "Please give a number"
read num
if [ $((num%2)) -eq 0 ];
then
    echo "$num is Even";
else
    echo "$num is Odd";
fi

i=2
while [ $i -lt $num ]
do
  if [ `expr $num % $i` -eq 0 ]
  then
      echo "$num is not a prime number"
      exit
  fi
  i=`expr $i + 1`
done

echo "$num is a prime number "
