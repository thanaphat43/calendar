<?php

class Date
{
    public function Showdate($mount, $day)
    {
        $date = "2021-" . $mount . "-" . $day;
        $dayofWeek = date("1", strtotime($date));
        return $dayofWeek;
    }
}
?>