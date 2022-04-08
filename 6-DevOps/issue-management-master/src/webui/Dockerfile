# STAGE 1 - BUILD
FROM node as node

WORKDIR /issuemanagement

COPY . .

RUN npm install
RUN npm install -s node-sass
RUN npm run build

# STAGE 2 - DEPLOYMENT
FROM nginx
COPY --from=node /issuemanagement/dist /usr/share/nginx/html
