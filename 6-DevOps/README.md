# Haydi Kodlayalım - DevOps

## Ders 2

**docker-compose.yml dosyasının olduğu klasörün içinde bulunan kodların çalışmasını sağlayan kodlar.**

```shell
docker-compose -f docker-compose.yml up -d
```

[Stackoverflow](`https://stackoverflow:com/questions/52523610/cant-load-prometheus-yml-config-file-with-docker-prom-prometheus:)
```yml
prometheus:
image: prom/prometheus:v2.26.0
user: root
ports:
- 9090:9090
volumes:
- /apps/prometheus/configs/prometheus.yaml:/etc/prometheus/prometheus.yaml
- /data/prometheus:/prometheus
command: --web.enable-lifecycle --config.file=/etc/prometheus/prometheus.yml
```

**Data source url**
```
http://prometheus:9090/
```

**Data query**

```sql
node_load1{instance="node-exporter:9100", job="node-exporter"}
```


## Ders 3

**Veriyi kaybetmemek için bir alan açıyor**

```shell
docker volume create portainer_data
```

```shell
docker run -d -p 8000:8000 -p 9000:9000 --name portainer \
    --restart=always \
    -v /var/run/docker.sock:/var/run/docker.sock \
    -v portainer_data:/data \
    portainer/portainer
    
    docker run -d -p 8000:8000 -p 9000:9000 --name portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer 
# togg2023
```