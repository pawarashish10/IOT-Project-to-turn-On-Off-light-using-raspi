<html>
<head>
 <meta name="viewport" content="width=device-width" />
 <title>LED Control</title>
</head>
<body>
    LED Control:
    <form method="get" action="switch.php">
         <input type="submit" value="ON" name="on">
         <input type="submit" value="OFF" name="off">
    </form>
    <?php
         // $setmode17 = shell_exec("/usr/local/bin/gpio -g mode 17 out");
          if(isset($_GET['on'])){
               //$gpio_on = shell_exec("/usr/local/bin/gpio -g write 17 1");
                $onput = shell_exec('sudo python on.py');
		echo "LED is on";
		echo "<pre> $onput</pre>";
          }
          else if(isset($_GET['off'])){
               //$gpio_off = shell_exec("/usr/local/bin/gpio -g write 17 0");
                $offput = shell_exec('sudo python off.py'); 
		echo "LED is off";
		echo "<pre> $offput</pre>";

          }
          ?>
</body>
</html>
