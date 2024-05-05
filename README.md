# springbootrestapi-docker-kubernetes-demo
Sample demo project to understand how to run docker and kubernetes services.

Springboot REST API - Docker - Kubernetes 

Springboot REST API:
--------------------
1.clone the repo
2.import to STS or Eclipse or any IDE.
3.run maven clean install
4.make sure .jar file is generated in target folder
5.run application as SpringbootApplication and Application started on port number 8081
6.from any browser, hit http://localhost:8081 , you will get hello ... message in browser.

Docker:
-------
1.Make sure you have docker /docker compose /docker desktop installed in your machine.
2.Run docker --version , you should get output like below..
		Docker version 20.10.14, build a224086
3.create file name Dockerfile (f should be small in Dockerfile) in project/app root folder.(already created in repo)
4.open cmd in project path (ex: c/users/docs/project/springbootdemotest/) in my case.
5.run docker build -t springboottestdemo .    [make sure (.) is mandatory, it means all the files to build present in project]
6.run docker images , your images should be created with name springbootdemotest
7.Stop your application in local IDE , if already running..
8.Start you docker container using command in terminal in project path ->  docker run --name my-app -p8081:8081 springbootdemotest
9.Post successful completion of container up , run localhost:8081/test in browser.You ll get results from container.

if you want to remove container,images , run below commands,

10. all process running in docker - docker ps
11. stop container - docker stop containerId
12. to check container that are not running - docker ps --filter status="exited"
13. remove container - docker rm containerId
14. docker remove image - docker rmi imageId



Kubernetes: (K8S)
-----------------
1.Make sure K8S installed in your local machine (or) go with docker desktop which has kubernetes already installed with it.
2.kubectl version (or) kubectl version --short ., you ll get version number after successful installation.
2.create deployment.yaml file in project root director (already created in our repo)
3.open terminal in project repo path (ex: c/users/docs/project/springbootdemotest/) in my case.
4.make sure docker images is present , if image not available , run - docker build -t springboottestdemo . 
5.run - docker images , check docker images is created successfully, since we use docker images in kubernetes pods.
6.create K8S deployment - kubectl create -f deployment.yaml   (or) kubectl apply -f deployment.yaml
7.run docker ps, you can see containers are running. 
8.containers running in backend - 1. K8s Service Pods  2.K8s Deployment should be running.
9.Post successful completion of container up , run localhost:8081/test in browser.You ll get results from container.

if you want to remove container,pods, service, deployments , run below commands,

10. all process running in docker - docker ps
11. get all pods - kubectl get pods
12. get all services - kubectl get services
13. get all deployments - kubectl get deployments
14. delete pod - kubectl delete pod podName
15. delete service - kubectl delete service serviceName
16. delete deployment - kubectl delete deployments deploymentName








