# gwt-gradle-seed

This project is an application skeleton for a [GWT](http://www.gwtproject.org/) web app.
You can use it to quickly bootstrap your GWT webapp and Gradle based dev environment.

The seed app doesn't do much, just contains a skeleton and one GWT module.

## Getting Started

To get you started you can simply clone the gwt-gradle-seed repository and install the dependencies:

### Prerequisites

You need git to clone gwt-gradle-seed repository. You can get git from
[git-scm.com](http://git-scm.com/).

### Clone gwt-gradle-seed

Clone the angular-seed repository using [git][git]:

```
git clone https://github.com/hartex/gwt-gradle-seed.git
cd gwt-gradle-seed
```

If you want to start a new project without the gwt-gradle-seed commit history then you can do:

```
git clone --depth=1 https://github.com/hartex/gwt-gradle-seed.git <your-project-name>
```

The `depth=1` tells git to only pull down one commit worth of historical data.

### Install Dependencies

To install all dependencies run:

```
grandle build
```


### Run the Application

That project are preconfigured with Jetty instance as a simple development web server, to start it just run:

```
gradle JettyRunWar
```

Now browse your app at `http://localhost:8089/gwt-gradle-seed/im.hartex.HelloWorld/HelloWorld.html`.

_Inspired by [angular-seed](https://github.com/angular/angular-seed)_

_Big thanks to [Andres Cespedes](https://twitter.com/acespedes12) and his [example](http://examples.javacodegeeks.com/core-java/gradle/gradle-gwt-integration-example/)_
