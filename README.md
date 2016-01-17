# gwt-gradle-seed
gwt-gradle-seed — the seed for GWT apps backed with Gradle

This project is an application skeleton for a [GWT](http://www.gwtproject.org/) web app.
You can use it to quickly bootstrap your GWT webapp and Gradle based dev environment.

The seed app doesn't do much, just contains a skeleton and one GWT module.

## Getting Started

To get you started you can simply clone the gwt-gradle-seed repository and install the dependencies:

### Prerequisites

You need git to clone gwt-gradle-seed repository. You can get git from
[http://git-scm.com/](http://git-scm.com/).

### Clone gwt-gradle-seed

Clone the angular-seed repository using [git][git]:

```
git clone https://github.com/hartex/gwt-gradle-seed.git
cd gwt-gradle-seed
```

If you want to start a new project without the gwt-gradle-seed commit history then you can do:

```bash
git clone --depth=1 https://github.com/hartex/gwt-gradle-seed.git <your-project-name>
```

The `depth=1` tells git to only pull down one commit worth of historical data.

### Install Dependencies


### Run the Application

That project are preconfigured with Jetty instance as a simple development web server, to start it just run: :

```
gradle JettyRunWar
```

Now browse to the app at `http://localhost:8089/index.html`.

####
#### Big thanks to Andres Cespedes and his example [http://git-scm.com/](http://git-scm.com/) http://examples.javacodegeeks.com/core-java/gradle/gradle-gwt-integration-example/
