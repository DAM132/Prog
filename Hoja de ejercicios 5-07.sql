-- ejercicio 1
select  user,usuarios.nombre,apellidos,fechanac,cancion,titulo,duracion,total_votos,codgrupo,grupos.nombre,localidad,fecha as fechavotos
 from usuarios inner join
votos on  user=usuario inner join canciones on cancion=numCancion
inner join grupos on canciones.grupo=codgrupo order by fecha desc;
-- ejercicio 2 
create view datosvotos as select  user,usuarios.nombre as nombreusuarios,apellidos,fechanac,cancion,titulo,duracion,total_votos,codgrupo,grupos.nombre as gruponombre,localidad,fecha as fechavotos
 from usuarios inner join
votos on  user=usuario inner join canciones on cancion=numCancion
inner join grupos on canciones.grupo=codgrupo order by fecha desc;

-- ejercicio 3 

select * from datosvotos order by nombregrupo, total_votos desc;

-- ejercicio 4 
select     nombregrupo,count(*) from datosvotos group by nombregrupo;

-- ejercicio 5 
select nombreusuario,apellidos from datosvotos where localidad="Madrid";

-- ejercicio 6 
select titulo, nombreusuarios, apellidos from datosvotos where fechavotos="2022-10-03";

-- ejercicio 7 

update  datosvotos set fechavotos=curdate() order by fechavotos desc limit 1;

-- ejercicio 8 

update datosvotos set localidad="Madrid" order by fechavotos desc limit 1;

-- ejercicio 9 
delete from datosvotos order by fechavotos desc limit 1; 

-- ejercicio 10 

create view datoscanciones as select titulo,duracion,grupo from canciones where duracion>"00:03:30" order by duracion; 

-- ejercicio 11a 

update datoscanciones set duracion="03:10:00"  order by duracion limit 1;

-- b
insert into datoscanciones(titulo,duracion,grupo) values ("ShakiraVOl53","03:03:03",1);
-- c
delete from datoscanciones where titulo="ShakiraVOl53";
-- ejercicio 12 
drop view datoscanciones;

