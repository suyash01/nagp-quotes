
# Kubernetes and DevOps Advanced

#### Github Repository

https://github.com/suyash01/nagp-quotes

#### Deployment yaml(s)

https://github.com/suyash01/nagp-quotes/tree/main/deployment

#### Video

https://1drv.ms/v/s!AoM5NI-88jMbcDmtuo_kpGN_KGw

#### Docker Hub 

https://hub.docker.com/repository/docker/suyash01/quotes/general


## API Reference

Base URL: http://34.136.208.98

#### Get all quotes

```http
  GET /quotes/
```

#### Get quote

```http
  GET /quotes/${id}
```

| Parameter | Type     | Description                        |
| :-------- | :------- | :--------------------------------- |
| `id`      | `number` | **Required**. Id of quote to fetch |
