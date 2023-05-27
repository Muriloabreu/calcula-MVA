# Calcula Imposto 

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Muriloabreu/calcula-imposto/blob/main/LICENSE) 

# Sobre o projeto


Calcula Imposto é uma API REST.

API - Java utilizando Spring boot com o proposito de calcular os impostos que o protudo tem sobre uma note fiscal.
Nessa API podemos cadastrar um produto e calcular os impostos cobrado a ele. Realizamos o cadastro do estado onde a nota Fiscal foi emitida(State) e informamos o ICMS(Imposto sobre Circulação de Mercadorias e Serviços) é um tributo estadual que incide sobre produtos, também cadastramos uma Produto(Product), e por último o Imposto(Taxation) onde informamos o Produto(Product), em qual estado(State) foi emitido a NFE, e vamos obter os seguintes resultados;

Os calulos serão:

- ICMS somado ao valor do produto
- MVA ao valor do produto
- MVA mais valor do produto   
- ICMS em cima do (MVA mais valor do produto)


# Tecnologias utilizadas
## Back end
- Java
- Maven
- Spring Boot


## Implantação em produção

- Banco de dados: Postgres 9.5

## Back end
- Pré-requisitos: Java 17

# Como executar o projeto

Necessário ter um servidor Tomcat para poder rodar o projeto Java

##  Utilize uma plataforma de consultas de API's e faça a requisição de acordo os modelos disponíveis na sessão abaixo.
</code></pre>
 - Modelos de requisição JSON
</p>

</P>
<h5>State</h5>

```json
{
        {
        "id": 1,
        "name": "Pernambuco",
        "abbreviation": "PE",
        "icms": 18.0
    },
    {
        "id": 2,
        "name": "Alagoas",
        "abbreviation": "AL",
        "icms": 12.0
    }
```
</p>
<h5>Product</h5>

```json
{
        "id": 1,
        "name": "IPhone 11",
        "description": "128Gb, Branco",
        "registrationDate": "2023-05-21T23:36:03.505728",
        "unitaryValue": 2600.0
    },
    {
        "id": 2,
        "name": "IPhone 11, 64P",
        "description": "64Gb, Preto",
        "registrationDate": "2023-05-21T23:37:55.309548",
        "unitaryValue": 2000.0
    }
```
</p>
<h5>Taxation</h5>


```json
{
    	
    "product": {
                "id": 1,
                "name": "IPhone 11",
                "description": "128Gb, Branco",
                "registrationDate": "2023-05-21T23:36:03.505728",
                "unitaryValue": 2600.0
    },
    "state":{
         "id": 1,
        "name": "Pernambuco",
        "abbreviation": "PE",
        "icms": 18.0
    } ,
    "amount": 10,
    "MVA": 71.7
    
}

```
</p>
<h5>Taxation Result</h5>

```json
{       
      
    "id": 2,
    "product": {
        "id": 1,
        "name": "IPhone 11",
        "description": "128Gb, Branco",
        "registrationDate": "2023-05-21T23:36:03.505728",
        "unitaryValue": 2600.0
    },
    "state": {
        "id": 1,
        "name": "Pernambuco",
        "abbreviation": "PE",
        "icms": 18.0
    },
    "amount": 10.0,
    "calculoMva": 1864.4599999999998,
    "valueMva": 4464.46,
    "icmsXvalueMva": 803.6028,
    "icmsXicms": 335.6028,
    "valueXicms": 2935.6028,
    "totalNFE": 29356.028000000002,
    "und": 2264.3972,
    "mva": 71.71,
    "icmsXProduct": 468.0
          
        
 }
 
```
</p>
</p>

- Baixar o projeto

```bash
# clonar repositório
git clone git@github.com:Muriloabreu/calcula-imposto.git

```

# Autor

Murilo Abreu do Nascimento

https://www.linkedin.com/in/murilo-abreu/
