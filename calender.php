<?php
include "Date.php";
    $month = $_POST["Month"];
    $day = $_POST["Day"];

   $calendar =new Date();
   $result = $calendar->showday($month,$day);
//    echo $result;
echo "<h1 id='result'>$result</h1> ";
?>