limpiar:
	rm -rf bin
compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin	
ejecutar:compilar
	java -cp bin aplicacion.Principal