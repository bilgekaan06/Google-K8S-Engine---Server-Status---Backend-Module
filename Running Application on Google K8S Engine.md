# Upload the Project Google Cloud
* To run all application and its replicas on Google Kubernetes Engine follow the instructions.
## Prerequisites
1. Create a Google Cloud project: [Creating by Google Console](https://cloud.google.com/resource-manager/docs/creating-managing-projects)
2. Create Kubernetes Cluster: [Creating by Google Console](https://cloud.google.com/kubernetes-engine/docs/deploy-app-cluster)
3. If you want to use your own machine cli, you should install gcloud cli and should bind your google account. [Installation steps for some distribution](https://cloud.google.com/sdk/docs/install#linux)
```
gcloud init
```
4. Install the kubectl your machine:
```
sudo apt-get update
sudo apt-get install -y apt-transport-https ca-certificates curl
sudo curl -fsSLo /usr/share/keyrings/kubernetes-archive-keyring.gpg https://packages.cloud.google.com/apt/doc/apt-key.gpg
echo "deb [signed-by=/usr/share/keyrings/kubernetes-archive-keyring.gpg] https://apt.kubernetes.io/ kubernetes-xenial main" | sudo tee /etc/apt/sources.list.d/kubernetes.list
sudo apt-get update
sudo apt-get install -y kubectl
```
5. Create a new folder in your machine and create .yaml files for building cluster.
```
mkdir task-1-k8s-cluster-configuration
cd task-1-k8s-cluster-configuration
touch frontend-service.yaml
touch frontend-deployment.yaml
touch backend-service.yaml
touch backend-deployment.yaml
touch appingress.yaml
```
