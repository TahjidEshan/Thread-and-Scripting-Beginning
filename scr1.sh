#!/bin/bash
echo "Please give a number"
read num
i=0
while [ $i -lt $num ]
do
 echo -n "*"
i=`expr $i + 1`
done
echo ""
k=2
while [ $k -lt $num ]
do
echo -n "*"
m=2
while [ $m -lt $num ]
do
echo -n " "
m=`expr $m + 1`
done
echo -n "*"
echo ""
k=`expr $k + 1`
done
j=0
while [ $j -lt $num ]
do
 echo -n "*"
j=`expr $j + 1`
done
echo ""

