# gc-example-a

# PREREQUISITOS
- Gradle: Para compilar el java -> https://gradle.org/install/
- Docker: Para generar la imagen
- Cluster de Kubernetes. Se sugiere GKE
- ISTIO:  
  - Pilot
  - Ingressgateway
  - Mixer
  - AutoInjector
  - Un namespace con autoinjector habilitado
# INSTRUCCIONES
## Generar la imagen
- Tal vez tengan que dar permiso de ejecucion al gradlew que esta en este directorio $ chmod +x gradlew
- Cambiar los directorios del DockerfileAllInOne ya que apuntan al directorio de mi maquina personal

- Contruir la imagen
  - $ docker build -f DockerfileAllInOne .
- Tagearla
  - $ docker tag 7cb9550650b3 gcr.io/${GKE_PROJECT_ID}/gc-example-a:2.0.0 
- Subirla al registry
  - $ docker push gcr.io/${GKE_PROJECT_ID}/gc-example-a:2.0.0 

## GENERAR LOS OBJETOS DE KUBERNETES
Hay dos aproximaciones a manita con kubectl apply o con Helm
### KUBECTL APPLY
Entrar al folder kubernetes-objects y editar los yaml para que coincidan con los namespaces $ kubectl apply -f xxxxxxxx.yml
- Los objetos que hay que crear son los siguientes:
  * Deploy (k8s)
  * Service (k8s)
  * VirtualService (ISTIO)
  * DestinationRule (ISTIO)
  * Gateway (ISTIO) -> Solo si queremos exponer el servicio fuera del cluster
### HELM
Entrar al folder example-b-chart, modificar el archivo values.yml para personalizarlo segun la configuracion de vuestro cluster. Tambien dar una revisada a cada uno de los archivos yml que hay en el folder templates. Todos los objetos definidos en el folder templates se va a crear.
- Dentro del folder example-b-chart ejecutar $ helm install .
