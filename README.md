# clj-apk-skellington
a barebones skeleton app for getting started on lein-droid ... makes a really shiny apk with buttons and nice styling

this is built from the lein-droid tutorial.

to start this project from scratch:
  1. enter a directory from which to start your new project:
    - `mkdir -p ~/projects/android/ && cd ~/projects/android`
  2. use lein to build a project template:
    -  `lein droid new lesson_1 org.stuff.class_demo :activity MainActivity :target-sdk 19 :app-name class_demo`
      * in this case, our app  will be in a folder named "lesson_1", it will be targeted for android version 4.4.2-kitkat, and once installed on the device, the app will be named "class_demo".   
  3. open projects.clj, and check the android sdk path and profile settings.
