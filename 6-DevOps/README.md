# Haydi Kodlayalım - DevOps

docker-compose.yml dosyasının olduğu klasörün içinde bulunan kodların çalışmasını sağlayan kodlar.

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