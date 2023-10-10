CREATE SCHEMA estacionamento_universitario;

USE estacionamento_universitario;

CREATE TABLE IF NOT EXISTS Estacionamento (
	id_estacionamento INT NOT NULL AUTO_INCREMENT, 
	nome_estacionamento VARCHAR(50) NOT NULL, 
    vagas_max SMALLINT UNSIGNED DEFAULT 0,
    telefone VARCHAR(20) NULL DEFAULT NULL,
    PRIMARY KEY (id_estacionamento)
);

CREATE TABLE IF NOT EXISTS Cor (
	id_cor INT NOT NULL AUTO_INCREMENT,
    nome_cor VARCHAR(75) NOT NULL,
    PRIMARY KEY (id_cor)
);

CREATE TABLE IF NOT EXISTS Marca (
	id_marca INT NOT NULL AUTO_INCREMENT,
    nome_marca VARCHAR(45) NOT NULL,
    website VARCHAR(255) NULL,
    PRIMARY KEY (id_marca)
);

CREATE TABLE IF NOT EXISTS Tipo_Veiculo (
	id_tipo_veiculo CHAR(1) NOT NULL,
    tipo_veiculo VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_tipo_veiculo)
);

CREATE TABLE IF NOT EXISTS Tipo_Usuario (
	id_tipo_usuario CHAR(1) NOT NULL,
    tipo_usuario VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_tipo_usuario)
);

CREATE TABLE IF NOT EXISTS Sexo (
	id_sexo CHAR(1) NOT NULL,
    sexo VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_sexo)
);

CREATE TABLE IF NOT EXISTS Categoria_Modelo (
	id_categoria_modelo INT NOT NULL AUTO_INCREMENT,
    tipo_modelo VARCHAR(45),
    PRIMARY KEY (id_categoria_modelo)
);

CREATE TABLE IF NOT EXISTS Combustivel (
	id_combustivel TINYINT NOT NULL AUTO_INCREMENT,
    tipo_combustivel VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_combustivel)
);

CREATE TABLE IF NOT EXISTS Tracao (
	id_tracao CHAR(1) NOT NULL,
    tipo_tracao VARCHAR(30) NOT NULL,
    PRIMARY KEY (id_tracao)
);

CREATE TABLE IF NOT EXISTS Transmissao (
	id_transmissao CHAR(1) NOT NULL,
    tipo_transmissao VARCHAR(10) NOT NULL,
    PRIMARY KEY (id_transmissao)
);

CREATE TABLE IF NOT EXISTS Usuario (
    id_usuario INT NOT NULL AUTO_INCREMENT,
    id_tipo_usuario CHAR(1) NOT NULL,
    id_sexo CHAR(1) NOT NULL,
    nome VARCHAR(45) NOT NULL,
    sobrenome VARCHAR(45) NOT NULL,
    cpf CHAR(11) NOT NULL,
    cnh CHAR(11) NULL DEFAULT NULL,
    telefone VARCHAR(20) NOT NULL,
    celular VARCHAR(20) NULL DEFAULT NULL,
    email VARCHAR(254) NULL DEFAULT NULL,
    nascimento DATE NULL DEFAULT NULL,
    PRIMARY KEY (id_usuario),
    CONSTRAINT cpf_unique UNIQUE (cpf),
    CONSTRAINT fk_Usuario_Tipo_Usuario FOREIGN KEY (id_tipo_usuario)
        REFERENCES Tipo_Usuario (id_tipo_usuario),
    CONSTRAINT fk_Usuario_Sexo FOREIGN KEY (id_sexo)
        REFERENCES Sexo (id_sexo)
);

CREATE INDEX fk_Usuario_Tipo_Usuario_idx ON Usuario(id_tipo_usuario);

CREATE INDEX fk_Usuario_Sexo_idx ON Usuario(id_sexo);

CREATE TABLE IF NOT EXISTS Modelo (
	id_modelo INT NOT NULL AUTO_INCREMENT,
    id_marca INT NOT NULL,
    id_transmissao CHAR(1) NOT NULL,
    id_tracao CHAR(1) NOT NULL,
    id_categoria_modelo INT NOT NULL,
    nome_modelo VARCHAR(75) NOT NULL,
    lugares VARCHAR(2) NOT NULL,
    portas CHAR(1) NOT NULL,
    ano_modelo YEAR NULL DEFAULT NULL,
    PRIMARY KEY (id_modelo),
    CONSTRAINT fk_Modelo_Transmissao FOREIGN KEY (id_transmissao)
		REFERENCES Transmissao (id_transmissao),
	CONSTRAINT fk_Modelo_Marca FOREIGN KEY (id_marca)
		REFERENCES Marca (id_marca),
	CONSTRAINT fk_Modelo_Tracao FOREIGN KEY (id_tracao)
		REFERENCES Tracao (id_tracao),
	CONSTRAINT fk_Modelo_Categoria_Modelo FOREIGN KEY (id_categoria_modelo)
		REFERENCES Categoria_Modelo (id_categoria_modelo)
);

CREATE INDEX fk_Modelo_Transmissao_idx ON Modelo(id_transmissao);
CREATE INDEX fk_Modelo_Marca_idx ON Modelo(id_marca);
CREATE INDEX fk_Modelo_Tracao_idx ON Modelo(id_tracao);
CREATE INDEX fk_Modelo_Categoria_Modelo ON Modelo(id_categoria_modelo);

CREATE TABLE IF NOT EXISTS Veiculo (
	renavam CHAR(11) NOT NULL,
    id_marca INT NOT NULL,
    id_modelo INT NOT NULL,
    id_tipo_veiculo CHAR(1) NOT NULL,
    id_cor INT NOT NULL,
    placa VARCHAR(8) NOT NULL,
    chassi VARCHAR(20) NULL DEFAULT NULL,
    ano_fabricacao YEAR NOT NULL,
    PRIMARY KEY(renavam),
    CONSTRAINT placa_unique UNIQUE (placa),
    CONSTRAINT chassi_unique UNIQUE (chassi),
    CONSTRAINT fk_Veiculo_Marca FOREIGN KEY (id_marca)
		REFERENCES Marca (id_marca),
	CONSTRAINT fk_Veiculo_Modelo FOREIGN KEY (id_modelo)
		REFERENCES Modelo (id_modelo),
	CONSTRAINT fk_Veiculo_Tipo_Veiculo FOREIGN KEY (id_tipo_veiculo)
		REFERENCES Tipo_Veiculo (id_tipo_veiculo),
	CONSTRAINT fk_Veiculo_Cor FOREIGN KEY (id_cor)
		REFERENCES Cor (id_cor)
);

CREATE INDEX fk_Veiculo_Marca_idx ON Veiculo(id_marca);
CREATE INDEX fk_Veiculo_Modelo_idx ON Veiculo(id_modelo);
CREATE INDEX fk_Veiculo_Tipo_Veiculo_idx ON Veiculo(id_tipo_veiculo);
CREATE INDEX fk_Veiculo_Cor_idx ON Veiculo(id_cor);

CREATE TABLE IF NOT EXISTS Cartao (
    via SMALLINT NOT NULL,
    id_usuario INT NOT NULL,
    emissao DATE NOT NULL,
    codigo_barras CHAR(13) NOT NULL,
    esta_ativo TINYINT NOT NULL DEFAULT 0,
    PRIMARY KEY (via, id_usuario),
    CONSTRAINT fk_Cartao_Usuario FOREIGN KEY (id_usuario)
        REFERENCES Usuario(id_usuario)
);

CREATE INDEX fk_Cartao_Usuario_idx ON Cartao(id_usuario);

CREATE TABLE IF NOT EXISTS Historico_Estacionamento (
    
    id_estacionamento INT NOT NULL,
    renavam CHAR(11) NOT NULL,
    data_hora_entrada TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    data_hora_saida DATETIME NULL DEFAULT NULL,
    permanencia TIME GENERATED ALWAYS AS (TIMEDIFF(data_hora_saida, data_hora_entrada)) STORED,
    PRIMARY KEY (id_estacionamento, renavam, data_hora_entrada),
    CONSTRAINT fk_Historico_Estacionamento_Estacionamento FOREIGN KEY (id_estacionamento)
        REFERENCES Estacionamento(id_estacionamento),
    CONSTRAINT fk_Historico_Estacionamento_Veiculo FOREIGN KEY (renavam)
        REFERENCES Veiculo(renavam)

);

CREATE INDEX fk_Historico_Estacionamento_Veiculo_idx ON Historico_Estacionamento(renavam);
CREATE INDEX fk_Historico_Estacionamento_Estacionamento_idx ON Historico_Estacionamento (id_estacionamento);

CREATE TABLE IF NOT EXISTS Propriedade (
	renavam CHAR(11) NOT NULL,
    id_usuario INT NOT NULL,
    data_inicio TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    data_fim DATETIME NULL DEFAULT NULL,
    PRIMARY KEY (renavam, id_usuario, data_inicio),
    CONSTRAINT fk_Propriedade_Proprietario FOREIGN KEY (id_usuario)
		REFERENCES Usuario (id_usuario),
	CONSTRAINT fk_Propriedade_Veiculo FOREIGN KEY (renavam)
        REFERENCES Veiculo (renavam)
);

CREATE INDEX fk_Propriedade_Proprietario_idx ON Propriedade (id_usuario);
CREATE INDEX fk_Propriedade_Veiculo_idx ON Propriedade (renavam);

CREATE TABLE IF NOT EXISTS Tipo_Combustivel (
	id_modelo INT NOT NULL,
    id_combustivel TINYINT,
    PRIMARY KEY (id_modelo, id_combustivel),
    CONSTRAINT fk_Tipo_Combustivel_Combustivel FOREIGN KEY (id_combustivel)
		REFERENCES Combustivel (id_combustivel),
	CONSTRAINT fk_Tipo_Combustivel_Modelo FOREIGN KEY (id_modelo)
		REFERENCES Modelo (id_modelo)
);

CREATE INDEX fk_Tipo_Combustivel_Combustivel_idx ON Tipo_Combustivel (id_combustivel);
CREATE INDEX fk_Tipo_Combustivel_Modelo_idx ON Tipo_Combustivel (id_modelo);