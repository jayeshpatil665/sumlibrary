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
	        implementation 'com.github.jayeshpatil665:sumlibrary:1.0'
	}
<br><br>
<h2>Methods you can call</h2>

#Summation Library :

public class SumMethods { <br>
public static int addthis(int x,int y){ <br>
int out = x+y; <br>
return out; <br>
} <br>
} <br>
<br>

#Toast method 👍
public class Toasting { <br>
public static void doToast(Context c,String msg){<br>
Toast.makeText(c, ""+msg, Toast.LENGTH_SHORT).show();<br>
}<br>
}
<br>
<h2>= Sample Implementation :</h2>
<br>
public void toSum(View view) {

        int no1,no2;
        no1 = Integer.parseInt(etNo1.getText().toString().trim());
        no2 = Integer.parseInt(etNo2.getText().toString().trim());
        if (no1>0 && no2>0)
        {
            Toasting.doToast(this.getApplicationContext(),""+SumMethods.addthis(no1,no2));
        }
        else
        {
            Toasting.doToast(this.getApplicationContext(),"enter values greater than 0 ZERO");
        }
    }
