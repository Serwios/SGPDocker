# SGPDocker
Project template to run Spring Boot app, Prometheus server, Grafana server in separate Docker containers via docker compose.

1. docker compose up
2. Configure datasource in grafana to prometheus using prometheus service host name http://prometheus:9090/
3. Add dashboard

- http://localhost:9090/ - prometheus
- http://localhost:3000/ - grafana
- http://localhost:8080/ - app



