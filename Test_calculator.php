<?php
include "Calculator.php";
use PHPUnit\Framework\TestCase;
class Test_calculator extends TestCase{
    private $calculate;
    public function setUp():void{
        $this->calculate =new Calculator();
    }
    public function testAdd1(){
        $this->assertEquals(4,$this->calculate->multiply(4,1));
    }
    public function testAdd2(){
        $this->assertEquals(5,$this->calculate->add(4,1));
    }
    public function testAdd3(){
        $this->assertEquals(3,$this->calculate->subtract(4,1));
    }
}