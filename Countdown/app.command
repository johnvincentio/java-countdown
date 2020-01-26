#!/bin/sh
#
# script to run java app Countdown
#
echo "begin"
#
DEV_HOME=/Users/jv/Desktop/MyDevelopment/github/java/Games/java-countdown/Countdown/classes
#
MYCP=$DEV_HOME
#
java -cp $MYCP io.johnvincent.countdown.Appgui
#
echo "end"
