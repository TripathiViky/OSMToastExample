# OSMToastExample
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![](https://jitpack.io/v/TripathiViky/OSMToastExample.svg)](https://jitpack.io/#TripathiViky/OSMToastExample)
[![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=15)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		mavenCentral()
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.TripathiViky:OSMToastExample:0.0.1'
}
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an default Toast:

``` java
OSMToast.makeText(this, "Default Toast", OSMToast.LENGTH_LONG, OSMToast.DEFAULT).show();
```
To display a success Toast:

``` java
OSMToast.makeText(this, "Success Toast !", OSMToast.LENGTH_LONG, OSMToast.SUCCESS).show();
```

To display a warning Toast:

``` java
OSMToast.makeText(this, "Warning Toast", OSMToast.LENGTH_LONG, OSMToast.WARNING).show();
```
To display the error Toast:

``` java
OSMToast.makeText(this, "Error Toast", OSMToast.LENGTH_LONG, OSMToast.ERROR).show();
```
To display an info Toast:

``` java
OSMToast.makeText(this, "Info Toast", OSMToast.LENGTH_LONG, OSMToast.INFO).show();
```
To display the confusing Toast:

``` java
OSMToast.makeText(this, "Confuse Toast", OSMToast.LENGTH_LONG, OSMToast.CONFUSING).show();
```
You can also add custom logo on top-right corner by passing last parameter as drawable file.
``` java
OSMToast.makeText(this, "Success Toast with logo", OSMToast.LENGTH_LONG, OSMToast.SUCCESS, R.drawable.logo).show();
```


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/TripathiViky/OSMToastExample/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Github](https://github.com/TripathiViky)
- [Linkedin](https://www.linkedin.com/in/vikas--tripathi/)

<p>
Don't forget to star ⭐ the repo it motivates me to share more open source
</p>


## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2022 Vikas Tripathi
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
