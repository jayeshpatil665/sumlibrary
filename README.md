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
