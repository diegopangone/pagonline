# Find my ip

```
ip a s
```

# Setup MySQL Docker

```
docker container run --rm -d -p 3306:3306 -v /home/micro8696/mysql_datadir:/var/lib/mysql --name pagonline.mysql -e MYSQL_ROOT_PASSWORD=cip123 -e MYSQL_DATABASE=pagonline mysql:5.7
```

# Register POST example

```
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"idClienteOrigem":"1","idClienteDestino":"2","idCorrentistaOrigem":"111","idCorrentistaDestino":"222","valor":"100.00"}' \
  http://localhost:8080/solicitacao/registra

curl --header "Content-Type: application/json" --request POST --data '{"idClienteOrigem":"1","idClienteDestino":"2","idCorrentistaOrigem":"111","idCorrentistaDestino":"222","valor":"100.00"}' http://localhost:8080/solicitacao/registra
```

curl --header "Content-Type: application/json" --request POST --data '{"idSolicitacao":"1|2|111|222|100.00","idCorrentistaCredito":"2","valor":"100.00"}'  http://192.168.0.108:8082/itau/credito
