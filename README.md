# sumlibrary

<B>How to use :</B>
<br>
How to
To get a Git project into your build:
<br>
Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  <br>
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.jayeshpatil665:sumlibrary:Tag'
	}
<br><br>
<h2>Methods you can call</h2>
#Summation Library :
public class SumMethods {
public static int addthis(int x,int y){
int out = x+y;
return out;
}
}
<br>

#Toast method 👍
public class Toasting {
public static void doToast(Context c,String msg){
Toast.makeText(c, ""+msg, Toast.LENGTH_SHORT).show();
}
}
