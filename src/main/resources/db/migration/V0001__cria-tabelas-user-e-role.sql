CREATE TABLE solicitacao (
  id_solicitacao bigint(20) NOT NULL AUTO_INCREMENT,
  id_cliente_origem varchar(30) NOT NULL ,
  id_cliente_destino varchar(30) NOT NULL,
  id_correntista_origem varchar(14) NOT NULL,
  id_correntista_destino varchar(14) NOT NULL,
  valor decimal(7,2) not null,
  PRIMARY KEY (id_solicitacao)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
