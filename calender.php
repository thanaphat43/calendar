<?php
include "Date.php";
    $month = $_POST["Month"];
    $day = $_POST["Day"];

   $calendar =new Date();
   $result = $calendar->one($month,$day);
   echo $result;
?>