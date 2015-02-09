At this point in the class, We've looked a little at how android development looks in Java, with Android Studio.  This is I think, a more streamlined approach that can allow for a wider range of experience and expectations. 

This App will happen in several stages.  First, we will compare the way that we add element to the app with the way that we added them to the [superpowers app](https://github.com/Android-at-The-Library/Intents-SuperPowers) that we made last week.  Next, we will look at webview mechanisms.  Last, we will look at different ways to quickly spin up a custom web-view application.  


### clj-apk-skellington
#####this is inspired by the lein-droid tutorial.

to start this project from scratch:
  1. enter a directory from which to start your new project:
    - `mkdir -p ~/projects/android/ && cd ~/projects/android`
  2. use lein to build a project template:
    -  `lein droid new lesson_1 org.stuff.class_demo :activity MainActivity :target-sdk 19 :app-name class_demo`
      * in this case, our app  will be in a folder named "lesson_1", it will be targeted for android version 4.4.2-kitkat, and once installed on the device, the app will be named "class_demo".   
  3. open projects.clj, and check the android sdk path and profile settings --  don't forget the Dex options!
