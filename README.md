# whats-up

My attempt at building a whatsapp web clone.


Redis Docker Command:

```docker run --name Whatsup-Redis -d -p 6379:6379 redis redis-server --save 60 1 --loglevel warning``` 


## TODO
### Short term goals
- Setup Docker container with all dependencies
    - Create docker file for all components
    - Create persistant volumes for redis

- Login Server-Client
    - Client reaches out to server, gets jwt token in response.

Front end part ->
- Web sockets

### Long term goals
- Load Balancing
- Reverse Proxy (So that backend services can run on private ports)