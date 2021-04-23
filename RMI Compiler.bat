
set classpath=.;

javac JSplashScreen.java
javac RMISImpl.java
javac Server.java
rmic RMISImpl
pause
