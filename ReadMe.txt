Step 1: Tools We Will Need
	>Raspberry Pi Model 2
	>Relay Channel Module Board
	>Raspberry Pi Jumper Cables
	>SD card with Raspbian OS
Step 2: Software you need
	>Raspbian 
Step 3: Designing the GUI/website to control Lamp	
	>create simple website with "ON" and "OFF" buttons. Make sure that your extensions are "index.php"
Step 4: Wiring Up the Lamp, Relay Connectors and Raspberry Pi.
	>Plese check "WiringDig.png"
Step 6: Create raspberry pi as web server
	>First install the apache2 package by typing the following command in to the Terminal:
		>>sudo apt-get install apache2 -y
	>Changing the default web page
	>This default web page is just a HTML file on the filesystem. 
	>It is located at /var/www/html/index.html
	>Replace it with index.php
Step 7: Create Python scripts to turn ON and OFF LED
Step 8: Access those two file on php action event(make sure that you have given proper privilage to server so that it can sun those scripts)
	