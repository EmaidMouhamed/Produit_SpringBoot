Voici l'ensemble des commandes utilises
-->  docker network create tp-app-network

-->docker run -d --name postgres_db_tp --network tp-app-network -e POSTGRES_DB=springdb -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=admin123 -p 5432:5432 -v postgres_data:/var/lib/postgresql/data postgres:15

-->docker run -d --name pgadmin_tp --network tp-app-network -e PGADMIN_DEFAULT_EMAIL=admin@admin.com -e PGADMIN_DEFAULT_PASSWORD=admin123 -p 8080:80 dpage/pgadmin4:latest

-->docker build -t myapp .

-->docker run -d --name java_tp --network tp-app-network -e SPRING_DATASOURCE_URL=jdbc:postgresql://postgres_db_tp:5432/springdb -e SPRING_DATASOURCE_USERNAME=postgres -e SPRING_DATASOURCE_PASSWORD=admin123 -p 8000:8080 mytp

-->docker login

-->docker tag 4ba779c63c8e mldiameisidk/mytp

-->docker push mldiameisidk/mytp
