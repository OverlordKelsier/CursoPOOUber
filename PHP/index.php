<?php

require_once('Car.php');
require_once('Account.php');
require_once('UberX.php');
require_once('UberPool.php');

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();
$uberVan = new $uberVan("CFF123", new Account("Andy H", "ANg556"), "Chevrolet", "Spark");
$uberVan->setPassenger(4);
$uberVan->printDataCar();
?>