/etc/init.d/postgresql start;

psql -a -f setupDatabase.sql;
psql -d pokemon -U pokemon -a -f setupTables.sql; 
bash fillTables.sh; 


