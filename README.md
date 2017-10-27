# Skobbler Crash Example

Some files have been removed because they are sensitive
* AndroidManifest needs to have its meta-data filled out
* Skobbler files must be added
** jniLibs
*** armeabi
*** armeabi-v7a
*** x86
** SKMaps.jar
** SKMaps.zip

To create the leak
* 1 Launch app
* 2 Go to the map page
* 3 Press the "GO TO OTHER ACTIVITY" button
* 4 Press the back button
* 5 Repeat steps 3 and 4 until the app crashes (it will take about 2-4 times)