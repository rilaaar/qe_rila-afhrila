Resume Testing in CI/CD Pipeline

- continuous integration is the paractice of integrating code into a early as possible - usually several times a day. 
- continuous delevery add that software can be released to production at any time. 
- continuous delevery : Built -> test -> acceptance test -> deploy to sataging -> deploy to production (manual). 
- continuous deployment : Built -> test -> acceptance test -> deploy to sataging -> deploy to production (automatic). 
- Good CI : decoupled stages, repeatable, fail fast. 
- Good CD : design with system in mind, pipelines, globally unique versions. 
- CI / CD progress : commit, build, test, deploy. 
- Jenkins is an open-source automation tool written in java with plugins built for continuous integration. 
- Gitlab CI service is a part of gilab which manages the project and user interface and allows unit tests on every commit and indicates with warming messange when ther is an unsuccessful of build. 