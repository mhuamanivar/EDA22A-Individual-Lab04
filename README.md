<div align="center">
<table width="1000px">
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
    <span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>
<div align="center">
    <table width="1000px">
        <theader>
            <tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
        </theader>
        <tbody>
            <tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
            <tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Sort y Listas Enlazadas</td></tr>
            <tr><td>NÚMERO DE PRÁCTICA:</td><td>04</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td width="60px">III</td></tr>
            <tr><td>FECHA DE PRESENTACION:</td><td>12-Jun-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">22:00</td></tr>
            <tr>
            <td colspan="4">NOMBRE:
                <ul>
            	    <li>Melsy Melany Huamaní Vargas 100% - mhuamanivar@unsa.edu.pe</li>
                </ul>
            </td>
            <td>NOTA:</td>
            <td></td>
            </tr>
            <tr><td colspan="6" width="1000px">DOCENTE:
                <ul>
        	    <li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
                </ul>
            </td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
        </theader>
        <tbody>
	    <tr><td>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br/>
            En primer lugar se instalo el programa debido de gnuplot, luego se descargó el archivo de Javaplot para poder realizar los ejercicios con las gráficas correspondientes, se subió correctamente en el github junto con el informe, esto se puede visualizar en la siguiente página: <a href="https://github.com/mhuamanivar/EDA22A-Individual-Lab04">https://github.com/mhuamanivar/EDA22A-Individual-Lab04</a><br/><br/>
            Gráfico del ejercicio resuelto de ordenamiento por inserción de arreglo.<br/>
            <center>
                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab04/main/imagenes/Grafico_inicial.PNG" alt="Grafico" style="width:50%; height:auto"/>
            </center>
	    	Explicación o guía de los ejercicios.
        		<ol>
            	    <li>Ejercicio 01
                    	<ul>
            	            <li>En primer lugar se creó una clase Nodo con el cual se trabajará todo el primer ejercicio.</li>
                            <li>En segundo lugar una lista enlazada en donde se guardarán todos los datos, se crean los métodos necesarios para añadir un nuevo dato, un get y un set para recibir o colocar un dato en un determinado índice, el size que retorna el tamaño de la lista, y por último el toString que ayudará a imprimir los objetos de la lista.</li>
                            <li>Por último se crea la clase Principal que pide la cantidad máxima de la última lista, para crear todas las listas con los peores casos, por lo que también se crea el método que ayuda a conseguir ello. Luego de obtener el ArrayList con los peores casos de listas enlazadas, se procede a enviarlos al método de ordenamiento por inserción, la cual obtiene el tiempo que se demora en compilar cada proceso, luego de ello con los tiempos de cada ordenamiento por lista se realiza un gráfico con gnuplot al crear un nuevo objeto Javaplot.</li><br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab04/main/imagenes/Grafico1.PNG" alt="Grafico" style="width:50%; height:auto"/>
            				</center>
    	        		</ul>
                    </li> 
                    <br/>
      		    	<li>Ejercicio 02
                    	<ul>
            	            <li>En primer lugar se creó una clase Nodo con el cual se trabajará todo el primer ejercicio.</li>
                            <li>En segundo lugar se creó la lista enlazada doble donde se guardarán todos los datos, por lo que se crean los métodos necesarios, para crear, recibir o colocar un dato en un determinado índice, el size que retorna el tamaño de la lista, y por último el toString que ayudará a imprimir los objetos de la lista doble.</li>
                            <li>Por último se crea la clase Principal que pide la cantidad máxima de la última lista, para crear todas las listas con los peores casos, por lo que también se crea el método que ayuda a conseguir ello. Luego de obtener el ArrayList con los peores casos de listas dobles enlazadas, se procede a enviarlos al método de ordenamiento por inserción, la cual obtiene el tiempo que se demora en compilar cada proceso, luego de ello con los tiempos de cada ordenamiento por lista se realiza un gráfico con gnuplot al crear un nuevo objeto Javaplot.</li><br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab04/main/imagenes/Grafico2.PNG" alt="Grafico" style="width:50%; height:auto"/>
            				</center>
    	        		</ul>
                    </li>
    	        </ol>
            </td>
            </tr>
            <tr><td>II. SOLUCIÓN DEL CUESTIONARIO<br />
                <ul>
            	    <li>¿Cómo se ejecutaría sus implementaciones desde terminal(consola)?<br/><br/>
                    	Se ejecutaría desde la carpeta en donde se tiene el programa que se desea ejecutar, por lo que en la consola se debería ingresar a la carpeta correspondiente, entonces se debe ingresar el comando: javac -cp DIRECCION_HACIA_EL_JAVAPLOT/dist/JavaPlot.jar nombre_del_archivo.java, ello para lo que es compilar el programa, ahora para ejecutarlo y aparezca el gráfico que se requirió se utiliza el siguiente código: java -cp DIRECCION_HACIA_EL_JAVAPLOT/dist/JavaPlot.jar:. nombre_del_archivo.
                    </li>
    	        </ul>
            </td>
            </tr>
	    <tr><td>III. CONCLUSIONES<br />
		En conclusión, el gnuplot permite realizar gráficos a través de comandos, en los que se puede escribir manualmente desde su propia consola o mismo programa, y también a través de programas escritos en código como con el lenguaje Java. Asimismo, nos sirve para identificar que tipo de complejidad tiene el algoritmo más facilmente por el gráfico que conforma el tiempo en el que se ejecuta. Además nos sirve para que los programadores puedan detectar si su código es eficiente o no y como se ha podido ver puede ejecutarse a través de la consola por si existiera algún conflicto a la hora de ejecutarlo por un IDE.</td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>RETROALIMENTACIÓN GENERAL</th></tr>
        </theader>
        <tbody>
            <tr height="150px"><td width="1000px"></td></tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>REFERENCIAS Y BIBLIOGRAFÍA</th></tr>
        </theader>
        <tbody>
            <tr><td width="1000px">
			<ul>
            	<li><a href="https://javaplot.panayotis.com/example.html">https://javaplot.panayotis.com/example.html</a></li>
                <li><a href="https://stackoverflow.com/questions/9331548/javaplot-and-gnuplot">https://stackoverflow.com/questions/9331548/javaplot-and-gnuplot</a></li>
    		</ul>
	    	</td></tr>
        </tbody>
    </table>
</div>
