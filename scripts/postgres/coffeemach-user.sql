create user cofmachkalls with password 'pwd';
create database coffeemachine owner cofmachkalls;
grant connect on database coffeemachine to cofmachkalls;

-- Connection
-- psql -d coffeemachine -U p09713_1_2
