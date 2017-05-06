A very simple "Hello World" web application using Play (https://www.playframework.com/) in Scala.

This web application includes a `manifest.yml`to deploy it in IBM Bluemix Cloud. The manifest looks as follows:

```json
applications:
- memory: 256M
  instances: 1
  name: scala-helloworld
  disk_quota: 1024M
  buildpack: https://github.com/heroku/heroku-buildpack-scala.git
```

## Deploy on Bluemix

1. Push the application on Bluemix: `bx cf push`

## Usage Locally

1. Start the application using "run"
2. Two endpoints:

GET: "curl -X GET localhost:9000/hello-world"
PUT: "curl -X PUT localhost:9000/hello-world?value=Hello"

## Resources
+ [Play Framework](https://www.playframework.com/)
+ [Cloud Foundry Manifest buildpack](https://docs.cloudfoundry.org/devguide/deploy-apps/manifest.html#buildpack)
